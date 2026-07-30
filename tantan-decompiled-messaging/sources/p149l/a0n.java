package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a0n {
    /* JADX INFO: renamed from: b */
    public static void m94453b(@NonNull final Context context, @NonNull final String str, @NonNull final w70 w70Var, @NonNull final b0n b0nVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(w70Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(b0nVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        m7s0.m153417a(context);
        if (((Boolean) q9s0.f153478i.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.e1r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        w70 w70Var2 = w70Var;
                        try {
                            new sjs0(context2, str2).m184558f(w70Var2.m201998a(), b0nVar);
                        } catch (IllegalStateException e) {
                            qts0.m176477c(context2).mo176483b(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new sjs0(context, str).m184558f(w70Var.m201998a(), b0nVar);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract kxc0 mo94454a();

    /* JADX INFO: renamed from: c */
    public abstract void mo94455c(@Nullable m9j m9jVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo94456d(boolean z);

    /* JADX INFO: renamed from: e */
    public abstract void mo94457e(@NonNull Activity activity);
}
