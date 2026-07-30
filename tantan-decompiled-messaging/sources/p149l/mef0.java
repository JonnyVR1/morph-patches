package p149l;

import android.content.Context;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mef0 {

    /* JADX INFO: renamed from: a */
    private static final X500Principal f133404a = new X500Principal(sgw.m184137a(new byte[]{115, 40, 12, 118, 15, 2, 66, 9, 88, 83, 65, 34, 85, 4, 68, 80, 77, 41, HttpTokens.CARRIAGE_RETURN, 39, 95, 83, 19, 9, 89, 2, 29, 116, 92, 51, 99}));

    /* JADX INFO: renamed from: a */
    public static JSONObject m154181a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m154182b(context)) {
                jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 3, 82, 19, 86}), 1);
            } else {
                jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 3, 82, 19, 86}), 0);
            }
            JSONObject jSONObjectM154183c = m154183c(context);
            jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3}), jSONObjectM154183c.get(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3})));
            jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69}), jSONObjectM154183c.get(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69})));
            jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 40}), jSONObjectM154183c.get(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 40})));
            return jSONObject;
        } catch (JSONException e) {
            ljw.m150044a(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m154182b(Context context) {
        boolean z = false;
        try {
            boolean zEquals = false;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                try {
                    zEquals = ((X509Certificate) CertificateFactory.getInstance(sgw.m184137a(new byte[]{104, 72, 4, 7, 88})).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(f133404a);
                    if (zEquals) {
                        return zEquals;
                    }
                } catch (Exception e) {
                    e = e;
                    z = zEquals;
                    ljw.m150044a(e);
                    return z;
                }
            }
            return zEquals;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m154183c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(sgw.m184137a(new byte[]{104, 72, 4, 7, 88})).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                x509Certificate.getPublicKey().toString();
                String string = x509Certificate.getSerialNumber().toString();
                jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3}), x509Certificate.getSigAlgName());
                jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69}), string);
                jSONObject.put(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 40}), x509Certificate.getSubjectDN().toString());
            }
            return jSONObject;
        } catch (Exception e) {
            ljw.m150044a(e);
            return jSONObject;
        }
    }
}
