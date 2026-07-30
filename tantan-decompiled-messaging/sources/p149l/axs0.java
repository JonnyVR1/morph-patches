package p149l;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class axs0 {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public static final void m99520a(String str) {
        try {
            try {
                okx0.m164909b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    httpURLConnection.disconnect();
                    okx0.m164908a();
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                okx0.m164908a();
            } catch (IndexOutOfBoundsException e2) {
                new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e2.getMessage()).length());
                okx0.m164908a();
            } catch (RuntimeException e3) {
                e = e3;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                okx0.m164908a();
            }
        } catch (Throwable th2) {
            okx0.m164908a();
            throw th2;
        }
    }
}
