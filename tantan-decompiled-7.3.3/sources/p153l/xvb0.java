package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: loaded from: classes6.dex */
public class xvb0 {

    /* JADX INFO: renamed from: a */
    public final wgv0 f196371a;

    public xvb0(wgv0 wgv0Var) {
        this.f196371a = wgv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m213213a(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable s70 s70Var, @NonNull yvb0 yvb0Var) {
        m213214c(context, adFormat, s70Var, null, yvb0Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m213214c(final Context context, final AdFormat adFormat, @Nullable final s70 s70Var, @Nullable final String str, final yvb0 yvb0Var) {
        sgs0.m185829a(context);
        if (((Boolean) wis0.f189394k.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.b9r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        s70 s70Var2 = s70Var;
                        xxu0 xxu0VarM184940a = s70Var2 == null ? null : s70Var2.m184940a();
                        new r2t0(context, adFormat, xxu0VarM184940a, str).m179567b(yvb0Var);
                    }
                });
                return;
            }
        }
        new r2t0(context, adFormat, s70Var == null ? null : s70Var.m184940a(), str).m179567b(yvb0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m213215b() {
        return this.f196371a.m206264a();
    }
}
