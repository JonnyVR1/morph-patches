package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u7t0 extends v8d0 {

    /* JADX INFO: renamed from: a */
    public final String f177937a;

    /* JADX INFO: renamed from: b */
    public final l7t0 f177938b;

    /* JADX INFO: renamed from: c */
    public final Context f177939c;

    /* JADX INFO: renamed from: d */
    public final k8t0 f177940d = new k8t0();

    /* JADX INFO: renamed from: e */
    @Nullable
    public gcj f177941e;

    public u7t0(Context context, String str) {
        this.f177939c = context.getApplicationContext();
        this.f177937a = str;
        this.f177938b = k6s0.m148568a().m184304n(context, str, new qws0());
    }

    @Override // p153l.v8d0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final n5d0 mo194878a() {
        tlu0 tlu0VarZzc = null;
        try {
            l7t0 l7t0Var = this.f177938b;
            if (l7t0Var != null) {
                tlu0VarZzc = l7t0Var.zzc();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        return n5d0.m161699e(tlu0VarZzc);
    }

    @Override // p153l.v8d0
    /* JADX INFO: renamed from: c */
    public final void mo194879c(@Nullable gcj gcjVar) {
        this.f177941e = gcjVar;
        this.f177940d.m148749o8(gcjVar);
    }

    @Override // p153l.v8d0
    /* JADX INFO: renamed from: d */
    public final void mo194880d(@NonNull Activity activity, @NonNull bp50 bp50Var) {
        this.f177940d.m148750p8(bp50Var);
        if (activity == null) {
            dct0.m115298g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            l7t0 l7t0Var = this.f177938b;
            if (l7t0Var != null) {
                l7t0Var.mo133744R0(this.f177940d);
                this.f177938b.mo133746g0(h950.m134038Y2(activity));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m194881e(xxu0 xxu0Var, w8d0 w8d0Var) {
        try {
            l7t0 l7t0Var = this.f177938b;
            if (l7t0Var != null) {
                l7t0Var.mo133748s5(ioy0.f116230a.m141359a(this.f177939c, xxu0Var), new h8t0(w8d0Var, this));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }
}
