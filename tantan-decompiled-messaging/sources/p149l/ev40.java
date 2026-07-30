package p149l;

import android.app.Application;
import android.content.Context;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public final class ev40 {

    /* JADX INFO: renamed from: a */
    private static kyl f93308a;

    /* JADX INFO: renamed from: a */
    public static kyl m118239a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        kyl kylVar = f93308a;
        if (kylVar != null) {
            return kylVar;
        }
        kyl kylVarM118240b = m118240b(context);
        f93308a = kylVarM118240b;
        if (kylVarM118240b == null || !kylVarM118240b.mo95912a()) {
            kyl kylVarM118241c = m118241c(context);
            f93308a = kylVarM118241c;
            return kylVarM118241c;
        }
        kjw.m146278a(rjw.m179664a(new byte[]{125, 7, 95, 66, 7, 7, 83, 18, 68, 69, 4, 20, Tnaf.POW_2_WIDTH, 15, 95, 67, 4, 20, 86, 7, 82, 82, 65, 14, 81, 21, 17, 85, 4, 3, 94, 70, 87, 88, 20, 8, 84, 92, 17}) + f93308a.getClass().getName());
        return f93308a;
    }

    /* JADX INFO: renamed from: b */
    private static kyl m118240b(Context context) {
        if (gv40.m128236h() || gv40.m128239k()) {
            return new qar(context);
        }
        if (gv40.m128237i()) {
            return new q7y(context);
        }
        if (gv40.m128240l()) {
            return new pu40(context);
        }
        if (gv40.m128245q() || gv40.m128238j() || gv40.m128230b()) {
            return new adq0(context);
        }
        if (gv40.m128243o()) {
            return new zod0(context);
        }
        if (gv40.m128244p()) {
            return new uam0(context);
        }
        if (gv40.m128229a()) {
            return new f21(context);
        }
        if (gv40.m128235g() || gv40.m128233e()) {
            return new ull(context);
        }
        if (gv40.m128242n() || gv40.m128241m()) {
            return new hx50(context);
        }
        if (gv40.m128231c(context)) {
            return new ct6(context);
        }
        if (gv40.m128232d()) {
            return new ht6(context);
        }
        if (gv40.m128234f()) {
            return new j6j(context);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static kyl m118241c(Context context) {
        az00 az00Var = new az00(context);
        if (az00Var.mo95912a()) {
            kjw.m146278a(rjw.m179664a(new byte[]{125, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, Tnaf.POW_2_WIDTH, 53, 84, 84, 20, 20, 89, 18, 72, 23, HttpTokens.SPACE, 10, 92, 15, 80, 89, 2, 3, Tnaf.POW_2_WIDTH, 14, 80, 68, 65, 4, 85, 3, 95, 23, 7, 9, 69, 8, 85, HttpTokens.CARRIAGE_RETURN, 65}) + az00.class.getName());
            return az00Var;
        }
        u1k u1kVar = new u1k(context);
        if (u1kVar.mo95912a()) {
            kjw.m146278a(rjw.m179664a(new byte[]{119, 9, 94, 80, HttpTokens.CARRIAGE_RETURN, 3, Tnaf.POW_2_WIDTH, 54, 93, 86, 24, 70, 99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 0, 95, 19, 95, 83, 91, 70}) + u1k.class.getName());
            return u1kVar;
        }
        mod modVar = new mod();
        kjw.m146278a(rjw.m179664a(new byte[]{127, 39, 120, 115, 78, 39, 113, 47, 117, 23, 22, 7, 67, 70, 95, 88, 21, 70, 67, 19, 65, 71, 14, 20, 68, 3, 85, HttpTokens.CARRIAGE_RETURN, 65}) + mod.class.getName());
        return modVar;
    }
}
