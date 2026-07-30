package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a2n {
    /* JADX INFO: renamed from: b */
    public static void m95716b(@NonNull final Context context, @NonNull final String str, @NonNull final s70 s70Var, @NonNull final b2n b2nVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(s70Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(b2nVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sgs0.m185829a(context);
        if (((Boolean) wis0.f189392i.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.kar0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        s70 s70Var2 = s70Var;
                        try {
                            new yss0(context2, str2).m217278f(s70Var2.m184940a(), b2nVar);
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(context2).mo204598b(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new yss0(context, str).m217278f(s70Var.m184940a(), b2nVar);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract n5d0 mo95717a();

    /* JADX INFO: renamed from: c */
    public abstract void mo95718c(@Nullable gcj gcjVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo95719d(boolean z);

    /* JADX INFO: renamed from: e */
    public abstract void mo95720e(@NonNull Activity activity);
}
