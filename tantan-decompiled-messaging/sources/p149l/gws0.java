package p149l;

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
public final class gws0 implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final Logger f104773c = new Logger("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    public final String f104774a;

    /* JADX INFO: renamed from: b */
    public final StatusPendingResult f104775b = new StatusPendingResult((GoogleApiClient) null);

    public gws0(String str) {
        this.f104774a = Preconditions.checkNotEmpty(str);
    }

    /* JADX INFO: renamed from: a */
    public static PendingResult<Status> m128511a(@Nullable String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        gws0 gws0Var = new gws0(str);
        new Thread(gws0Var).start();
        return gws0Var.f104775b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String strValueOf = String.valueOf(this.f104774a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f104773c.m12469e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f104773c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.m12467d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = f104773c;
            String strValueOf2 = String.valueOf(e.toString());
            logger2.m12469e(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = f104773c;
            String strValueOf3 = String.valueOf(e2.toString());
            logger3.m12469e(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f104775b.setResult(status);
    }
}
