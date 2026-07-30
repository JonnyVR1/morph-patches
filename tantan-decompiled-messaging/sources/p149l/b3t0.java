package p149l;

import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class b3t0 implements h2t0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f73258a;

    public b3t0() {
        this.f73258a = null;
    }

    @Override // p149l.h2t0
    @WorkerThread
    public final boolean zza(String str) {
        boolean z = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                x2t0.m206864b("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    exr0.m118703b();
                    String str2 = this.f73258a;
                    httpURLConnection.setConnectTimeout(HuiYanResultSender.TIMEOUT_MS);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(HuiYanResultSender.TIMEOUT_MS);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    w2t0 w2t0Var = new w2t0(null);
                    w2t0Var.m201224c(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    w2t0Var.m201226e(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        x2t0.m206869g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    } else {
                        z = true;
                    }
                    httpURLConnection.disconnect();
                    if (!ClientLibraryUtils.isPackageSide()) {
                        return z;
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th2) {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
                throw th2;
            }
        } catch (IOException e) {
            e = e;
            x2t0.m206869g("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        } catch (IndexOutOfBoundsException e2) {
            x2t0.m206869g("Error while parsing ping URL: " + str + ". " + e2.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        } catch (RuntimeException e3) {
            e = e3;
            x2t0.m206869g("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        }
        TrafficStats.clearThreadStatsTag();
        return z;
    }

    public b3t0(@Nullable String str) {
        this.f73258a = str;
    }
}
