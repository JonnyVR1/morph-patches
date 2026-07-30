package p149l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class jnt0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final zmt0 f118887a;

    /* JADX INFO: renamed from: b */
    public final ips0 f118888b;

    /* JADX INFO: renamed from: c */
    public final psv0 f118889c;

    /* JADX INFO: renamed from: d */
    public boolean f118890d = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131917G0)).booleanValue();

    /* JADX INFO: renamed from: e */
    public final rnu0 f118891e;

    public jnt0(zmt0 zmt0Var, ips0 ips0Var, psv0 psv0Var, rnu0 rnu0Var) {
        this.f118887a = zmt0Var;
        this.f118888b = ips0Var;
        this.f118889c = psv0Var;
        this.f118891e = rnu0Var;
    }

    @Override // p149l.n1s0
    /* JADX INFO: renamed from: k5 */
    public final void mo142390k5(s3u0 s3u0Var) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f118889c != null) {
            try {
                if (!s3u0Var.zzf()) {
                    this.f118891e.m180209e();
                }
            } catch (RemoteException e) {
                x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
            }
            this.f118889c.m171250B(s3u0Var);
        }
    }

    @Override // p149l.n1s0
    /* JADX INFO: renamed from: m2 */
    public final void mo142391m2(boolean z) {
        this.f118890d = z;
    }

    @Override // p149l.n1s0
    /* JADX INFO: renamed from: n5 */
    public final void mo142392n5(uyl uylVar, u1s0 u1s0Var) {
        try {
            this.f118889c.m171252K(u1s0Var);
            this.f118887a.m219376k((Activity) s050.m181847P2(uylVar), u1s0Var, this.f118890d);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.n1s0
    public final ips0 zze() {
        return this.f118888b;
    }

    @Override // p149l.n1s0
    @Nullable
    public final ncu0 zzf() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue()) {
            return this.f118887a.m117798d();
        }
        return null;
    }
}
