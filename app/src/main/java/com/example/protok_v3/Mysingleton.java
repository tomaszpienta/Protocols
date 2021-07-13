package com.example.protok_v3;

import android.app.Application;
import android.os.AsyncTask;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;


public class Mysingleton  extends Application {
    void sendPostRequest(String date, String pd_number,
                         String field, String sr_num_dm9225,
                         String comments_dm9225, String sr_num_switch,
                         String comments_switch, String sr_num_p0g,
                         String comments_p0g, String sr_num_p1g,
                         String comments_p1g, String sr_num_p2g,
                         String comments_p2g, String sr_num_p3g,
                         String comments_p3g, String ups, String battery_pack,
                         String rout_switch_media, String foreign_devic, String comments_others,
                         String switch1, String switch2, String switch3, String switch4, String switch5,
                         String cleaning_filters, String replacement_filter,
                         String study_ups,String cleaning_cabinet,String efficiency_of_the_cabinet) {
        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {
                String adate = params[0];
                String apd_number = params[1];
                String afield = params[2];
                String asr_num_dm9225 = params[3];
                String acomments_dm9225 = params[4];
                String asr_num_switch = params[5];
                String acomments_switch = params[6];
                String asr_num_p0g = params[7];
                String acomments_p0g = params[8];
                String asr_num_p1g = params[9];
                String acomments_p1g = params[10];
                String asr_num_p2g = params[11];
                String acomments_p2g = params[12];
                String asr_num_p3g = params[13];
                String acomments_p3g = params[14];
                String aups = params[15];
                String abattery_pack = params[16];
                String arout_switch_media = params[17];
                String aforeign_devic = params[18];
                String acomments_others = params[19];
                String aswitch1 = params[20];
                String aswitch2 = params[21];
                String aswitch3 = params[22];
                String aswitch4 = params[23];
                String aswitch5 = params[24];
                String acleaning_filters = params[25];
                String areplacement_filter = params[26];
                String astudy_ups = params[27];
                String acleaning_cabinet = params[28];
                String aefficiency_of_the_cabinet = params[29];

                HttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("MySql php location"); // <---- POST_DATA.php

                BasicNameValuePair date = new BasicNameValuePair("date", adate);
                BasicNameValuePair pd_number = new BasicNameValuePair("pd_number", apd_number);
                BasicNameValuePair field = new BasicNameValuePair("field", afield);
                BasicNameValuePair sr_num_dm9225 = new BasicNameValuePair("sr_num_dm9225", asr_num_dm9225);
                BasicNameValuePair comments_dm9225 = new BasicNameValuePair("comments_dm9225", acomments_dm9225);
                BasicNameValuePair sr_num_switch = new BasicNameValuePair("sr_num_switch", asr_num_switch);
                BasicNameValuePair comments_switch = new BasicNameValuePair("comments_switch", acomments_switch);
                BasicNameValuePair sr_num_p0g = new BasicNameValuePair("sr_num_p0g", asr_num_p0g);
                BasicNameValuePair comments_p0g = new BasicNameValuePair("comments_p0g", acomments_p0g);
                BasicNameValuePair sr_num_p1g = new BasicNameValuePair("sr_num_p1g", asr_num_p1g);
                BasicNameValuePair comments_p1g = new BasicNameValuePair("comments_p1g", acomments_p1g);
                BasicNameValuePair sr_num_p2g = new BasicNameValuePair("sr_num_p2g", asr_num_p2g);
                BasicNameValuePair comments_p2g = new BasicNameValuePair("comments_p2g", acomments_p2g);
                BasicNameValuePair sr_num_p3g = new BasicNameValuePair("sr_num_p3g", asr_num_p3g);
                BasicNameValuePair comments_p3g = new BasicNameValuePair("comments_p3g", acomments_p3g);
                BasicNameValuePair ups = new BasicNameValuePair("ups", aups);
                BasicNameValuePair battery_pack = new BasicNameValuePair("battery_pack", abattery_pack);
                BasicNameValuePair rout_switch_media = new BasicNameValuePair("rout_switch_media", arout_switch_media);
                BasicNameValuePair foreign_devic = new BasicNameValuePair("foreign_devic", aforeign_devic);
                BasicNameValuePair comments_others = new BasicNameValuePair("comments_others", acomments_others);
                BasicNameValuePair switch1 = new BasicNameValuePair("switch1", aswitch1);
                BasicNameValuePair switch2 = new BasicNameValuePair("switch2", aswitch2);
                BasicNameValuePair switch3 = new BasicNameValuePair("switch3", aswitch3);
                BasicNameValuePair switch4 = new BasicNameValuePair("switch4", aswitch4);
                BasicNameValuePair switch5 = new BasicNameValuePair("switch5", aswitch5);
                BasicNameValuePair cleaning_filters = new BasicNameValuePair("cleaning_filters", acleaning_filters);
                BasicNameValuePair replacement_filter = new BasicNameValuePair("replacement_filter", areplacement_filter);
                BasicNameValuePair study_ups = new BasicNameValuePair("study_ups", astudy_ups);
                BasicNameValuePair cleaning_cabinet = new BasicNameValuePair("cleaning_cabinet", acleaning_cabinet);
                BasicNameValuePair efficiency_of_the_cabinet = new BasicNameValuePair("efficiency_of_the_cabinet", aefficiency_of_the_cabinet);


                List<NameValuePair> nameValuePairList = new ArrayList<>();
                nameValuePairList.add(date);
                nameValuePairList.add(pd_number);
                nameValuePairList.add(field);
                nameValuePairList.add(sr_num_dm9225);
                nameValuePairList.add(comments_dm9225);
                nameValuePairList.add(sr_num_switch);
                nameValuePairList.add(comments_switch);
                nameValuePairList.add(sr_num_p0g);
                nameValuePairList.add(comments_p0g);
                nameValuePairList.add(sr_num_p1g);
                nameValuePairList.add(comments_p1g);
                nameValuePairList.add(sr_num_p2g);
                nameValuePairList.add(comments_p2g);
                nameValuePairList.add(sr_num_p3g);
                nameValuePairList.add(comments_p3g);
                nameValuePairList.add(ups);
                nameValuePairList.add(battery_pack);
                nameValuePairList.add(rout_switch_media);
                nameValuePairList.add(foreign_devic);
                nameValuePairList.add(comments_others);
                nameValuePairList.add(switch1);
                nameValuePairList.add(switch2);
                nameValuePairList.add(switch3);
                nameValuePairList.add(switch4);
                nameValuePairList.add(switch5);
                nameValuePairList.add(cleaning_filters);
                nameValuePairList.add(replacement_filter);
                nameValuePairList.add(study_ups);
                nameValuePairList.add(cleaning_cabinet);
                nameValuePairList.add(efficiency_of_the_cabinet);

                try {
                    UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(nameValuePairList);
                    httpPost.setEntity(urlEncodedFormEntity);

                    try {
                        trustEveryone();
                        HttpResponse httpResponse = httpClient.execute(httpPost);

                        InputStream inputStream = httpResponse.getEntity().getContent();

                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                        StringBuilder stringBuilder = new StringBuilder();

                        String bufferedStrChunk;

                        while((bufferedStrChunk = bufferedReader.readLine()) != null){
                            stringBuilder.append(bufferedStrChunk);
                        }

                        return stringBuilder.toString();

                    } catch (ClientProtocolException cpe) {
                        System.out.println("HttpResponese :" + cpe);
                        cpe.printStackTrace();
                    } catch (IOException ioe) {
                        System.out.println("HttpResponse Exception :" + ioe);
                        ioe.printStackTrace();
                    }

                } catch (UnsupportedEncodingException uee) {
                    System.out.println("UrlEncodedFormEntity Exception :" + uee);
                    uee.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
            }
        }

        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();
        sendPostReqAsyncTask.execute(date, pd_number, field,sr_num_dm9225,
                comments_dm9225 , sr_num_switch , comments_switch  ,
                sr_num_p0g , comments_p0g , sr_num_p1g ,
                comments_p1g , sr_num_p2g ,comments_p2g ,
                sr_num_p3g , comments_p3g ,ups, battery_pack ,
                rout_switch_media , foreign_devic ,
                comments_others,switch1 ,switch2  ,
                switch3,switch4 ,switch5 ,cleaning_filters ,
                replacement_filter, study_ups , cleaning_cabinet , efficiency_of_the_cabinet);
    }
    public void trustEveryone() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier(){
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }});
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new X509TrustManager[]{new X509TrustManager(){
                public void checkClientTrusted(X509Certificate[] chain,
                                               String authType) {}
                public void checkServerTrusted(X509Certificate[] chain,
                                               String authType) {}
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }}}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(
                    context.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}