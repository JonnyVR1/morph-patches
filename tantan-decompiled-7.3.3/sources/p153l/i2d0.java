package p153l;

import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class i2d0 {
    /* JADX INFO: renamed from: a */
    public static String m138185a(x1d0 x1d0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(x1d0Var.m209022g());
        sb.append(' ');
        if (m138186b(x1d0Var, type)) {
            sb.append(x1d0Var.m209026k());
        } else {
            sb.append(m138187c(x1d0Var.m209026k()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m138186b(x1d0 x1d0Var, Proxy.Type type) {
        return !x1d0Var.m209021f() && type == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: c */
    public static String m138187c(rnl rnlVar) {
        String strM182282h = rnlVar.m182282h();
        String strM182284j = rnlVar.m182284j();
        if (strM182284j == null) {
            return strM182282h;
        }
        return strM182282h + '?' + strM182284j;
    }
}
