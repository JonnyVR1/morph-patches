package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x8d0 {
    /* JADX INFO: renamed from: b */
    public static void m209691b(@NonNull final Context context, @NonNull final String str, @NonNull final s70 s70Var, @NonNull final y8d0 y8d0Var) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(s70Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(y8d0Var, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sgs0.m185829a(context);
        if (((Boolean) wis0.f189395l.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.s8s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        s70 s70Var2 = s70Var;
                        try {
                            new m8t0(context2, str2).m157516d(s70Var2.m184940a(), y8d0Var);
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(context2).mo204598b(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new m8t0(context, str).m157516d(s70Var.m184940a(), y8d0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract n5d0 mo157514a();

    /* JADX INFO: renamed from: c */
    public abstract void mo157515c(@NonNull Activity activity, @NonNull bp50 bp50Var);
}
