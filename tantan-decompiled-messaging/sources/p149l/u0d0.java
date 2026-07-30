package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u0d0 {
    /* JADX INFO: renamed from: b */
    public static void m191339b(@NonNull final Context context, @NonNull final String str, @NonNull final w70 w70Var, @NonNull final v0d0 v0d0Var) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(w70Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(v0d0Var, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        m7s0.m153417a(context);
        if (((Boolean) q9s0.f153481l.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.mzr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        w70 w70Var2 = w70Var;
                        try {
                            new gzs0(context2, str2).m128912d(w70Var2.m201998a(), v0d0Var);
                        } catch (IllegalStateException e) {
                            qts0.m176477c(context2).mo176483b(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new gzs0(context, str).m128912d(w70Var.m201998a(), v0d0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract kxc0 mo128910a();

    /* JADX INFO: renamed from: c */
    public abstract void mo128911c(@NonNull Activity activity, @NonNull vg50 vg50Var);
}
