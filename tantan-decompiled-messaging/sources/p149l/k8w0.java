package p149l;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.C2094a;
import com.google.android.gms.internal.ads.zzapd;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class k8w0 {

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public static final byte[] f121871c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public static final byte[] f121872d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, Tnaf.POW_2_WIDTH, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, HttpTokens.COLON, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: a */
    public final byte[] f121873a = f121872d;

    /* JADX INFO: renamed from: b */
    public final byte[] f121874b = f121871c;

    /* JADX INFO: renamed from: a */
    public final boolean m144979a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrM12489a = C2094a.m12489a(file.getAbsolutePath());
            if (x509CertificateArrM12489a.length != 1) {
                j8w0.m140474a("APK has more than one signature.");
                return false;
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrM12489a[0][0].getEncoded());
            if (Arrays.equals(this.f121874b, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f121873a, bArrDigest);
        } catch (zzapd e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
