package p153l;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class g6t0 {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public static final void m129268a(String str) {
        try {
            try {
                utx0.m198115b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    httpURLConnection.disconnect();
                    utx0.m198114a();
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                utx0.m198114a();
            } catch (IndexOutOfBoundsException e2) {
                new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e2.getMessage()).length());
                utx0.m198114a();
            } catch (RuntimeException e3) {
                e = e3;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                utx0.m198114a();
            }
        } catch (Throwable th2) {
            utx0.m198114a();
            throw th2;
        }
    }
}
