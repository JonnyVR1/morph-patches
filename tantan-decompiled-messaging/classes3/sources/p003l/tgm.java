package p003l;

import android.view.View;
import l.j760;
import l.nvc0;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tgm {

    /* JADX INFO: renamed from: a */
    public static float f7465a = 1.05f;

    /* JADX INFO: renamed from: a */
    public static j760<Boolean, Integer> m7743a(View view, nvc0 nvc0Var) {
        return new j760<>(Boolean.FALSE, Integer.valueOf(m7745c(nvc0Var == null ? view.getMeasuredWidth() : nvc0Var.a)));
    }

    /* JADX INFO: renamed from: b */
    public static String m7744b(String str, View view, nvc0 nvc0Var) {
        j760<Boolean, Integer> j760VarM7743a = m7743a(view, nvc0Var);
        if (((Integer) j760VarM7743a.b).intValue() == 0) {
            return str;
        }
        if (!((Boolean) j760VarM7743a.a).booleanValue()) {
            return str + "?format=max_" + j760VarM7743a.b + "xX";
        }
        return str + "?format=" + j760VarM7743a.b + "x" + j760VarM7743a.b;
    }

    /* JADX INFO: renamed from: c */
    public static int m7745c(int i) {
        if (i == 0) {
            return 0;
        }
        float f = i;
        float f2 = f7465a;
        if (f < 64.0f * f2) {
            return 64;
        }
        if (f <= 96.0f * f2) {
            return 96;
        }
        if (f <= 128.0f * f2) {
            return 128;
        }
        if (f <= 180.0f * f2) {
            return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        if (f <= 300.0f * f2) {
            return HttpStatus.MULTIPLE_CHOICES_300;
        }
        if (f <= 480.0f * f2) {
            return 480;
        }
        if (f <= 640.0f * f2) {
            return 640;
        }
        return f <= f2 * 720.0f ? 720 : 960;
    }
}
