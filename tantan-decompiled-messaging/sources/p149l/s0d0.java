package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s0d0 {
    /* JADX INFO: renamed from: b */
    public static void m181858b(@NonNull final Context context, @NonNull final String str, @NonNull final w70 w70Var, @NonNull final t0d0 t0d0Var) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(w70Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(t0d0Var, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        m7s0.m153417a(context);
        if (((Boolean) q9s0.f153481l.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.ixs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        w70 w70Var2 = w70Var;
                        try {
                            new oys0(context2, str2).m166698e(w70Var2.m201998a(), t0d0Var);
                        } catch (IllegalStateException e) {
                            qts0.m176477c(context2).mo176483b(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        x2t0.m206864b("Loading on UI thread");
        new oys0(context, str).m166698e(w70Var.m201998a(), t0d0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract kxc0 mo166695a();

    /* JADX INFO: renamed from: c */
    public abstract void mo166696c(@Nullable m9j m9jVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo166697d(@NonNull Activity activity, @NonNull vg50 vg50Var);
}
