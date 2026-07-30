package p153l;

import android.app.Application;
import android.content.Context;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public final class t350 {

    /* JADX INFO: renamed from: a */
    private static d1m f171894a;

    /* JADX INFO: renamed from: a */
    public static d1m m189073a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        d1m d1mVar = f171894a;
        if (d1mVar != null) {
            return d1mVar;
        }
        d1m d1mVarM189074b = m189074b(context);
        f171894a = d1mVarM189074b;
        if (d1mVarM189074b == null || !d1mVarM189074b.mo106874a()) {
            d1m d1mVarM189075c = m189075c(context);
            f171894a = d1mVarM189075c;
            return d1mVarM189075c;
        }
        jmw.m146176a(qmw.m177151a(new byte[]{125, 7, 95, 66, 7, 7, 83, 18, 68, 69, 4, 20, Tnaf.POW_2_WIDTH, 15, 95, 67, 4, 20, 86, 7, 82, 82, 65, 14, 81, 21, 17, 85, 4, 3, 94, 70, 87, 88, 20, 8, 84, 92, 17}) + f171894a.getClass().getName());
        return f171894a;
    }

    /* JADX INFO: renamed from: b */
    private static d1m m189074b(Context context) {
        if (v350.m199194h() || v350.m199197k()) {
            return new scr(context);
        }
        if (v350.m199195i()) {
            return new ngy(context);
        }
        if (v350.m199198l()) {
            return new e350(context);
        }
        if (v350.m199203q() || v350.m199196j() || v350.m199188b()) {
            return new fmq0(context);
        }
        if (v350.m199201o()) {
            return new bxd0(context);
        }
        if (v350.m199202p()) {
            return new yjm0(context);
        }
        if (v350.m199187a()) {
            return new m21(context);
        }
        if (v350.m199193g() || v350.m199191e()) {
            return new gol(context);
        }
        if (v350.m199200n() || v350.m199199m()) {
            return new n560(context);
        }
        if (v350.m199189c(context)) {
            return new fu6(context);
        }
        if (v350.m199190d()) {
            return new ku6(context);
        }
        if (v350.m199192f()) {
            return new d9j(context);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static d1m m189075c(Context context) {
        k710 k710Var = new k710(context);
        if (k710Var.mo106874a()) {
            jmw.m146176a(qmw.m177151a(new byte[]{125, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, Tnaf.POW_2_WIDTH, 53, 84, 84, 20, 20, 89, 18, 72, 23, HttpTokens.SPACE, 10, 92, 15, 80, 89, 2, 3, Tnaf.POW_2_WIDTH, 14, 80, 68, 65, 4, 85, 3, 95, 23, 7, 9, 69, 8, 85, HttpTokens.CARRIAGE_RETURN, 65}) + k710.class.getName());
            return k710Var;
        }
        m4k m4kVar = new m4k(context);
        if (m4kVar.mo106874a()) {
            jmw.m146176a(qmw.m177151a(new byte[]{119, 9, 94, 80, HttpTokens.CARRIAGE_RETURN, 3, Tnaf.POW_2_WIDTH, 54, 93, 86, 24, 70, 99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 0, 95, 19, 95, 83, 91, 70}) + m4k.class.getName());
            return m4kVar;
        }
        rpd rpdVar = new rpd();
        jmw.m146176a(qmw.m177151a(new byte[]{127, 39, 120, 115, 78, 39, 113, 47, 117, 23, 22, 7, 67, 70, 95, 88, 21, 70, 67, 19, 65, 71, 14, 20, 68, 3, 85, HttpTokens.CARRIAGE_RETURN, 65}) + rpd.class.getName());
        return rpdVar;
    }
}
