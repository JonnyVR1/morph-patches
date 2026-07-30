package com.surveysparrow.ss_android_sdk;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.Semaphore;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.b */
/* JADX INFO: loaded from: classes13.dex */
public class AsyncTaskC13512b extends AsyncTask<String, Void, String> {

    /* JADX INFO: renamed from: a */
    private String f55726a;

    /* JADX INFO: renamed from: b */
    private String f55727b;

    /* JADX INFO: renamed from: c */
    private int f55728c;

    /* JADX INFO: renamed from: d */
    private a f55729d;

    /* JADX INFO: renamed from: e */
    private Semaphore f55730e = new Semaphore(0);

    /* JADX INFO: renamed from: f */
    private Boolean f55731f;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.b$a */
    public interface a {
        void onResponse(String str);
    }

    public AsyncTaskC13512b(String str, String str2, int i, Boolean bool, a aVar) {
        this.f55726a = str;
        this.f55727b = str2;
        this.f55729d = aVar;
        this.f55728c = i;
        this.f55731f = bool;
    }

    /* JADX INFO: renamed from: c */
    private static String m81011c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81012a() throws InterruptedException {
        this.f55730e.acquire();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = strArr[0];
        try {
            if (!this.f55727b.split("-")[0].equals("ntt") || this.f55728c == 0 || this.f55731f.booleanValue()) {
                this.f55729d.onResponse("{surveyClosed:true}");
                this.f55730e.release();
                return "{surveyClosed:true}";
            }
            URL url = new URL(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
            String str2 = simpleDateFormat.format(new Date());
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(HttpMethods.PUT);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", MimeTypes.TEXT_PLAIN);
            String str3 = "{\"throttledOn\":\"" + str2 + "\"}";
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = str3.getBytes(StandardCharsets.UTF_8);
                outputStream.write(bytes, 0, bytes.length);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    this.f55729d.onResponse("{surveyClosed:true}");
                    this.f55730e.release();
                    return "{surveyClosed:true}";
                }
                Log.e("SS_API_ERROR", "connection error in close survey" + m81011c(httpURLConnection));
                return "Error: " + responseCode;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("SS_API_ERROR", "response error in close survey" + e.getMessage());
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
