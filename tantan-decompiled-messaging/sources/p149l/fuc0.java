package p149l;

import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class fuc0 {
    /* JADX INFO: renamed from: a */
    public static String m123184a(stc0 stc0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(stc0Var.m185877g());
        sb.append(' ');
        if (m123185b(stc0Var, type)) {
            sb.append(stc0Var.m185881k());
        } else {
            sb.append(m123186c(stc0Var.m185881k()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m123185b(stc0 stc0Var, Proxy.Type type) {
        return !stc0Var.m185876f() && type == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: c */
    public static String m123186c(cll cllVar) {
        String strM107518h = cllVar.m107518h();
        String strM107520j = cllVar.m107520j();
        if (strM107520j == null) {
            return strM107518h;
        }
        return strM107518h + '?' + strM107520j;
    }
}
