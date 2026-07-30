package p153l;

import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class hct0 implements nbt0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f108747a;

    public hct0() {
        this.f108747a = null;
    }

    @Override // p153l.nbt0
    @WorkerThread
    public final boolean zza(String str) {
        boolean z = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                dct0.m115293b("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    k6s0.m148569b();
                    String str2 = this.f108747a;
                    httpURLConnection.setConnectTimeout(HuiYanResultSender.TIMEOUT_MS);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(HuiYanResultSender.TIMEOUT_MS);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    cct0 cct0Var = new cct0(null);
                    cct0Var.m109071c(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    cct0Var.m109073e(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        dct0.m115298g("Received non-success response code " + responseCode + " from pinging URL: " + str);
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
            dct0.m115298g("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        } catch (IndexOutOfBoundsException e2) {
            dct0.m115298g("Error while parsing ping URL: " + str + ". " + e2.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        } catch (RuntimeException e3) {
            e = e3;
            dct0.m115298g("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return z;
        }
        TrafficStats.clearThreadStatsTag();
        return z;
    }

    public hct0(@Nullable String str) {
        this.f108747a = str;
    }
}
