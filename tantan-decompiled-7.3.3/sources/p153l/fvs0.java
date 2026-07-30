package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class fvs0 {

    /* JADX INFO: renamed from: a */
    public final Object f101087a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f101088b = new Object();

    /* JADX INFO: renamed from: c */
    public ovs0 f101089c;

    /* JADX INFO: renamed from: d */
    public ovs0 f101090d;

    /* JADX INFO: renamed from: c */
    public static final Context m127698c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public final ovs0 m127699a(Context context, zzcei zzceiVar, @Nullable hew0 hew0Var) {
        ovs0 ovs0Var;
        synchronized (this.f101087a) {
            try {
                if (this.f101089c == null) {
                    this.f101089c = new ovs0(m127698c(context), zzceiVar, (String) jas0.m144075c().m176505a(sgs0.f168227a), hew0Var);
                }
                ovs0Var = this.f101089c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ovs0Var;
    }

    /* JADX INFO: renamed from: b */
    public final ovs0 m127700b(Context context, zzcei zzceiVar, hew0 hew0Var) {
        ovs0 ovs0Var;
        synchronized (this.f101088b) {
            try {
                if (this.f101090d == null) {
                    this.f101090d = new ovs0(m127698c(context), zzceiVar, (String) rjs0.f163513b.m149974e(), hew0Var);
                }
                ovs0Var = this.f101090d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ovs0Var;
    }
}
