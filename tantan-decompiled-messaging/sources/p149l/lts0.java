package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccx;

/* JADX INFO: loaded from: classes6.dex */
public final class lts0 {

    /* JADX INFO: renamed from: e */
    public static y0t0 f129991e;

    /* JADX INFO: renamed from: a */
    public final Context f129992a;

    /* JADX INFO: renamed from: b */
    public final AdFormat f129993b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final rou0 f129994c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f129995d;

    public lts0(Context context, AdFormat adFormat, @Nullable rou0 rou0Var, @Nullable String str) {
        this.f129992a = context;
        this.f129993b = adFormat;
        this.f129994c = rou0Var;
        this.f129995d = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static y0t0 m151717a(Context context) {
        y0t0 y0t0Var;
        synchronized (lts0.class) {
            try {
                if (f129991e == null) {
                    f129991e = exr0.m118702a().m156449o(context, new kns0());
                }
                y0t0Var = f129991e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y0t0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m151718b(unb0 unb0Var) {
        zzl zzlVarM106615a;
        y0t0 y0t0VarM151717a = m151717a(this.f129992a);
        if (y0t0VarM151717a == null) {
            unb0Var.mo117509a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f129992a;
        rou0 rou0Var = this.f129994c;
        uyl uylVarM181848Y2 = s050.m181848Y2(context);
        if (rou0Var == null) {
            zzlVarM106615a = new o4y0().m162735a();
        } else {
            zzlVarM106615a = cfy0.f80684a.m106615a(this.f129992a, rou0Var);
        }
        try {
            y0t0VarM151717a.mo157500W6(uylVarM181848Y2, new zzccx(this.f129995d, this.f129993b.name(), null, zzlVarM106615a), new kts0(this, unb0Var));
        } catch (RemoteException unused) {
            unb0Var.mo117509a("Internal Error.");
        }
    }
}
