package com.surveysparrow.ss_android_sdk;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.a */
/* JADX INFO: loaded from: classes11.dex */
public class AsyncTaskC13674a extends AsyncTask<String, Void, String> {

    /* JADX INFO: renamed from: a */
    private String f56571a;

    /* JADX INFO: renamed from: b */
    private SsSurvey.C13666a[] f56572b;

    /* JADX INFO: renamed from: c */
    private a f56573c;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.a$a */
    public interface a {
        void onResponse(String str);
    }

    public AsyncTaskC13674a(String str, SsSurvey.C13666a[] c13666aArr, a aVar) {
        this.f56571a = str;
        this.f56573c = aVar;
        this.f56572b = c13666aArr;
    }

    /* JADX INFO: renamed from: b */
    private static String m82191b(HttpURLConnection httpURLConnection) throws IOException {
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

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = strArr[0];
        try {
            SsSurvey.C13666a[] c13666aArr = this.f56572b;
            if (c13666aArr != null && c13666aArr.length > 0) {
                SsSurvey.C13666a c13666a = c13666aArr[0];
                throw null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", MimeTypes.TEXT_PLAIN);
            String str2 = "{\"email\":\"\"}";
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                outputStream.write(bytes, 0, bytes.length);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    Log.e("SS_API_ERROR", "connectiong error" + m82191b(httpURLConnection));
                    return "Error: " + responseCode;
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        inputStream.close();
                        this.f56573c.onResponse(sb.toString());
                        return sb.toString();
                    }
                    sb.append(line);
                }
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
            Log.e("SS_API_ERROR", "response error" + e.getMessage());
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(str);
        final a aVar = this.f56573c;
        Objects.requireNonNull(aVar);
        completableFutureCompletedFuture.thenAccept(new Consumer() { // from class: l.k1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aVar.onResponse((String) obj);
            }
        });
    }
}
