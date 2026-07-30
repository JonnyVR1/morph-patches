package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m8t0 extends x8d0 {

    /* JADX INFO: renamed from: a */
    public final String f135289a;

    /* JADX INFO: renamed from: b */
    public final l7t0 f135290b;

    /* JADX INFO: renamed from: c */
    public final Context f135291c;

    /* JADX INFO: renamed from: d */
    public final k8t0 f135292d = new k8t0();

    public m8t0(Context context, String str) {
        this.f135289a = str;
        this.f135291c = context.getApplicationContext();
        this.f135290b = k6s0.m148568a().m184304n(context, str, new qws0());
    }

    @Override // p153l.x8d0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final n5d0 mo157514a() {
        tlu0 tlu0VarZzc = null;
        try {
            l7t0 l7t0Var = this.f135290b;
            if (l7t0Var != null) {
                tlu0VarZzc = l7t0Var.zzc();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        return n5d0.m161699e(tlu0VarZzc);
    }

    @Override // p153l.x8d0
    /* JADX INFO: renamed from: c */
    public final void mo157515c(@NonNull Activity activity, @NonNull bp50 bp50Var) {
        this.f135292d.m148750p8(bp50Var);
        try {
            l7t0 l7t0Var = this.f135290b;
            if (l7t0Var != null) {
                l7t0Var.mo133744R0(this.f135292d);
                this.f135290b.mo133746g0(h950.m134038Y2(activity));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m157516d(xxu0 xxu0Var, y8d0 y8d0Var) {
        try {
            l7t0 l7t0Var = this.f135290b;
            if (l7t0Var != null) {
                l7t0Var.mo133742M5(ioy0.f116230a.m141359a(this.f135291c, xxu0Var), new l8t0(y8d0Var, this));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }
}
