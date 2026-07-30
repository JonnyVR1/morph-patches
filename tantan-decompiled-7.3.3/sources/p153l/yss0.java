package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class yss0 extends h70 {

    /* JADX INFO: renamed from: a */
    public final Context f201453a;

    /* JADX INFO: renamed from: b */
    public final ioy0 f201454b;

    /* JADX INFO: renamed from: c */
    public final oys0 f201455c;

    /* JADX INFO: renamed from: d */
    public final String f201456d;

    /* JADX INFO: renamed from: e */
    public final qws0 f201457e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public gcj f201458f;

    public yss0(Context context, String str) {
        qws0 qws0Var = new qws0();
        this.f201457e = qws0Var;
        this.f201453a = context;
        this.f201456d = str;
        this.f201454b = ioy0.f116230a;
        this.f201455c = k6s0.m148568a().m184299e(context, new zzq(), str, qws0Var);
    }

    @Override // p153l.a2n
    @NonNull
    /* JADX INFO: renamed from: a */
    public final n5d0 mo95717a() {
        tlu0 tlu0VarZzk = null;
        try {
            oys0 oys0Var = this.f201455c;
            if (oys0Var != null) {
                tlu0VarZzk = oys0Var.zzk();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        return n5d0.m161699e(tlu0VarZzk);
    }

    @Override // p153l.a2n
    /* JADX INFO: renamed from: c */
    public final void mo95718c(@Nullable gcj gcjVar) {
        try {
            this.f201458f = gcjVar;
            oys0 oys0Var = this.f201455c;
            if (oys0Var != null) {
                oys0Var.mo113750I3(new qbs0(gcjVar));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.a2n
    /* JADX INFO: renamed from: d */
    public final void mo95719d(boolean z) {
        try {
            oys0 oys0Var = this.f201455c;
            if (oys0Var != null) {
                oys0Var.mo113760Y3(z);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.a2n
    /* JADX INFO: renamed from: e */
    public final void mo95720e(@NonNull Activity activity) {
        if (activity == null) {
            dct0.m115298g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            oys0 oys0Var = this.f201455c;
            if (oys0Var != null) {
                oys0Var.mo113756P7(h950.m134038Y2(activity));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m217278f(xxu0 xxu0Var, e70 e70Var) {
        try {
            oys0 oys0Var = this.f201455c;
            if (oys0Var != null) {
                oys0Var.mo113777w7(this.f201454b.m141359a(this.f201453a, xxu0Var), new pix0(e70Var, this));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            e70Var.mo9344a(new jtv(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
