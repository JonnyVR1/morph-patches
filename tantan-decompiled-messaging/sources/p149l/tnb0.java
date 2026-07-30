package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: loaded from: classes6.dex */
public class tnb0 {

    /* JADX INFO: renamed from: a */
    public final q7v0 f171225a;

    public tnb0(q7v0 q7v0Var) {
        this.f171225a = q7v0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m189769a(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable w70 w70Var, @NonNull unb0 unb0Var) {
        m189770c(context, adFormat, w70Var, null, unb0Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m189770c(final Context context, final AdFormat adFormat, @Nullable final w70 w70Var, @Nullable final String str, final unb0 unb0Var) {
        m7s0.m153417a(context);
        if (((Boolean) q9s0.f153480k.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.vzq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w70 w70Var2 = w70Var;
                        rou0 rou0VarM201998a = w70Var2 == null ? null : w70Var2.m201998a();
                        new lts0(context, adFormat, rou0VarM201998a, str).m151718b(unb0Var);
                    }
                });
                return;
            }
        }
        new lts0(context, adFormat, w70Var == null ? null : w70Var.m201998a(), str).m151718b(unb0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m189771b() {
        return this.f171225a.m173300a();
    }
}
