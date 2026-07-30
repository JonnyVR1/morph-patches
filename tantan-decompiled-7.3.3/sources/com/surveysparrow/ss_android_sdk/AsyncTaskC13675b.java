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
/* JADX INFO: loaded from: classes11.dex */
public class AsyncTaskC13675b extends AsyncTask<String, Void, String> {

    /* JADX INFO: renamed from: a */
    private String f56574a;

    /* JADX INFO: renamed from: b */
    private String f56575b;

    /* JADX INFO: renamed from: c */
    private int f56576c;

    /* JADX INFO: renamed from: d */
    private a f56577d;

    /* JADX INFO: renamed from: e */
    private Semaphore f56578e = new Semaphore(0);

    /* JADX INFO: renamed from: f */
    private Boolean f56579f;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.b$a */
    public interface a {
        void onResponse(String str);
    }

    public AsyncTaskC13675b(String str, String str2, int i, Boolean bool, a aVar) {
        this.f56574a = str;
        this.f56575b = str2;
        this.f56577d = aVar;
        this.f56576c = i;
        this.f56579f = bool;
    }

    /* JADX INFO: renamed from: c */
    private static String m82194c(HttpURLConnection httpURLConnection) throws IOException {
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
    public void m82195a() throws InterruptedException {
        this.f56578e.acquire();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = strArr[0];
        try {
            if (!this.f56575b.split("-")[0].equals("ntt") || this.f56576c == 0 || this.f56579f.booleanValue()) {
                this.f56577d.onResponse("{surveyClosed:true}");
                this.f56578e.release();
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
                    this.f56577d.onResponse("{surveyClosed:true}");
                    this.f56578e.release();
                    return "{surveyClosed:true}";
                }
                Log.e("SS_API_ERROR", "connection error in close survey" + m82194c(httpURLConnection));
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
