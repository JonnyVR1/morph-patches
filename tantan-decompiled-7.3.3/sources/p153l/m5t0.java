package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class m5t0 implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final Logger f134930c = new Logger("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    public final String f134931a;

    /* JADX INFO: renamed from: b */
    public final StatusPendingResult f134932b = new StatusPendingResult((GoogleApiClient) null);

    public m5t0(String str) {
        this.f134931a = Preconditions.checkNotEmpty(str);
    }

    /* JADX INFO: renamed from: a */
    public static PendingResult<Status> m157123a(@Nullable String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        m5t0 m5t0Var = new m5t0(str);
        new Thread(m5t0Var).start();
        return m5t0Var.f134932b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String strValueOf = String.valueOf(this.f134931a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f134930c.m12523e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f134930c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.m12521d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = f134930c;
            String strValueOf2 = String.valueOf(e.toString());
            logger2.m12523e(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = f134930c;
            String strValueOf3 = String.valueOf(e2.toString());
            logger3.m12523e(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f134932b.setResult(status);
    }
}
