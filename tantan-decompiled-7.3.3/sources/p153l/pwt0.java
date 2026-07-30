package p153l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class pwt0 extends sas0 {

    /* JADX INFO: renamed from: a */
    public final fwt0 f154439a;

    /* JADX INFO: renamed from: b */
    public final oys0 f154440b;

    /* JADX INFO: renamed from: c */
    public final v1w0 f154441c;

    /* JADX INFO: renamed from: d */
    public boolean f154442d = ((Boolean) jas0.m144075c().m176505a(sgs0.f167988G0)).booleanValue();

    /* JADX INFO: renamed from: e */
    public final xwu0 f154443e;

    public pwt0(fwt0 fwt0Var, oys0 oys0Var, v1w0 v1w0Var, xwu0 xwu0Var) {
        this.f154439a = fwt0Var;
        this.f154440b = oys0Var;
        this.f154441c = v1w0Var;
        this.f154443e = xwu0Var;
    }

    @Override // p153l.tas0
    /* JADX INFO: renamed from: k5 */
    public final void mo174091k5(ycu0 ycu0Var) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f154441c != null) {
            try {
                if (!ycu0Var.zzf()) {
                    this.f154443e.m213444e();
                }
            } catch (RemoteException e) {
                dct0.m115294c("Error in making CSI ping for reporting paid event callback", e);
            }
            this.f154441c.m199085B(ycu0Var);
        }
    }

    @Override // p153l.tas0
    /* JADX INFO: renamed from: m2 */
    public final void mo174092m2(boolean z) {
        this.f154442d = z;
    }

    @Override // p153l.tas0
    /* JADX INFO: renamed from: n5 */
    public final void mo174093n5(p1m p1mVar, abs0 abs0Var) {
        try {
            this.f154441c.m199087K(abs0Var);
            this.f154439a.m127851k((Activity) h950.m134037P2(p1mVar), abs0Var, this.f154442d);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.tas0
    public final oys0 zze() {
        return this.f154440b;
    }

    @Override // p153l.tas0
    @Nullable
    public final tlu0 zzf() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168078N6)).booleanValue()) {
            return this.f154439a.m152228d();
        }
        return null;
    }
}
