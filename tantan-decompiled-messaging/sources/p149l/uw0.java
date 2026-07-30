package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uw0 {

    /* JADX INFO: renamed from: l.uw0$a */
    public static abstract class AbstractC20525a extends i70<uw0> {
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m196099b(@NonNull final Context context, @NonNull final String str, @NonNull final w70 w70Var, final int i, @NonNull final AbstractC20525a abstractC20525a) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(w70Var, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        m7s0.m153417a(context);
        if (((Boolean) q9s0.f153473d.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.o0s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        w70 w70Var2 = w70Var;
                        try {
                            new v1s0(context2, str2, w70Var2.m201998a(), i2, abstractC20525a).m196650a();
                        } catch (IllegalStateException e) {
                            qts0.m176477c(context2).mo176483b(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new v1s0(context, str, w70Var.m201998a(), i, abstractC20525a).m196650a();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract kxc0 mo139377a();

    /* JADX INFO: renamed from: c */
    public abstract void mo139378c(@NonNull Activity activity);
}
