package p153l;

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
public class tmf0 {

    /* JADX INFO: renamed from: a */
    private static final X500Principal f174927a = new X500Principal(riw.m181611a(new byte[]{115, 40, 12, 118, 15, 2, 66, 9, 88, 83, 65, 34, 85, 4, 68, 80, 77, 41, HttpTokens.CARRIAGE_RETURN, 39, 95, 83, 19, 9, 89, 2, 29, 116, 92, 51, 99}));

    /* JADX INFO: renamed from: a */
    public static JSONObject m191730a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m191731b(context)) {
                jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 37, 3, 82, 19, 86}), 1);
            } else {
                jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 37, 3, 82, 19, 86}), 0);
            }
            JSONObject jSONObjectM191732c = m191732c(context);
            jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3}), jSONObjectM191732c.get(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3})));
            jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69}), jSONObjectM191732c.get(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69})));
            jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 37, 40}), jSONObjectM191732c.get(riw.m181611a(new byte[]{67, 15, 86, 89, 37, 40})));
            return jSONObject;
        } catch (JSONException e) {
            kmw.m150491a(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m191731b(Context context) {
        boolean z = false;
        try {
            boolean zEquals = false;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                try {
                    zEquals = ((X509Certificate) CertificateFactory.getInstance(riw.m181611a(new byte[]{104, 72, 4, 7, 88})).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(f174927a);
                    if (zEquals) {
                        return zEquals;
                    }
                } catch (Exception e) {
                    e = e;
                    z = zEquals;
                    kmw.m150491a(e);
                    return z;
                }
            }
            return zEquals;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m191732c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(riw.m181611a(new byte[]{104, 72, 4, 7, 88})).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                x509Certificate.getPublicKey().toString();
                String string = x509Certificate.getSerialNumber().toString();
                jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 7, 93, 3}), x509Certificate.getSigAlgName());
                jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 47, 19, 93, 4, 84, 69}), string);
                jSONObject.put(riw.m181611a(new byte[]{67, 15, 86, 89, 37, 40}), x509Certificate.getSubjectDN().toString());
            }
            return jSONObject;
        } catch (Exception e) {
            kmw.m150491a(e);
            return jSONObject;
        }
    }
}
