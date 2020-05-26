package com.example.finance;
import android.app.AlertDialog;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import android.content.Context;

public class background extends AsyncTask <String,Void,String> {
    AlertDialog dialog;
    Context context;

    public background(Context context){
        this.context=context;
    }
    @Override
    protected void onPreExecute(){
        dialog=new AlertDialog.Builder(context).create();
        dialog.setTitle("Login status");
        super.onPreExecute();
    }
     @Override
    protected void onPostExecute(String s){
        dialog.setMessage(s);
        dialog.show();
    }


    @Override
    protected String doInBackground(String... voids) {

        String result="";
        String user=voids[0];
        String password=voids[1];

        //String connstr="http://localhost:8080/connect.php";
        String connstr="http://192.168.64.2/connect.php";


        try {
            URL url=new URL(connstr);
            HttpURLConnection http =(HttpURLConnection)url.openConnection();
            http.setRequestMethod("POST");
            http.setDoInput(true);
            http.setDoOutput(true);
            OutputStream ops=http.getOutputStream();
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(ops,"UTF-8"));
            String data = URLEncoder.encode("user","UTF-8")+"="+URLEncoder.encode(user,"UTF-8")+"&&"
                    +URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
        writer.write(data);
        writer.flush();
        writer.close();
        ops.close();

            InputStream ips=http.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(ips,"ISO-8859-1"));
            String line="";
            while(    (line=reader.readLine()) !=null){
                result+=line;
            }
            reader.close();
            ips.close();
            http.disconnect();
            return result;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            result=e.getMessage();
        }

        return result;



    }
}
