package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bx0 {

    /* JADX INFO: renamed from: l.bx0$a */
    public static abstract class AbstractC16125a extends e70<bx0> {
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m106821b(@NonNull final Context context, @NonNull final String str, @NonNull final s70 s70Var, final int i, @NonNull final AbstractC16125a abstractC16125a) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(s70Var, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sgs0.m185829a(context);
        if (((Boolean) wis0.f189387d.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.u9s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        s70 s70Var2 = s70Var;
                        try {
                            new bbs0(context2, str2, s70Var2.m184940a(), i2, abstractC16125a).m103310a();
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(context2).mo204598b(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new bbs0(context, str, s70Var.m184940a(), i, abstractC16125a).m103310a();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract n5d0 mo106822a();

    /* JADX INFO: renamed from: c */
    public abstract void mo106823c(@NonNull Activity activity);
}
