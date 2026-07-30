package p149l;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class y4v0 extends ops0 {

    /* JADX INFO: renamed from: a */
    public final m3v0 f196351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z4v0 f196352b;

    public /* synthetic */ y4v0(z4v0 z4v0Var, m3v0 m3v0Var, x4v0 x4v0Var) {
        this.f196352b = z4v0Var;
        this.f196351a = m3v0Var;
    }

    @Override // p149l.pps0
    /* JADX INFO: renamed from: T5 */
    public final void mo170864T5(gos0 gos0Var) throws RemoteException {
        this.f196352b.f201642d = gos0Var;
        ((p5v0) this.f196351a.f131188c).zzo();
    }

    @Override // p149l.pps0
    /* JADX INFO: renamed from: Y */
    public final void mo170865Y(uyl uylVar) throws RemoteException {
        this.f196352b.f201641c = (View) s050.m181847P2(uylVar);
        ((p5v0) this.f196351a.f131188c).zzo();
    }

    @Override // p149l.pps0
    /* JADX INFO: renamed from: c */
    public final void mo170866c(String str) throws RemoteException {
        ((p5v0) this.f196351a.f131188c).mo105938G0(0, str);
    }

    @Override // p149l.pps0
    /* JADX INFO: renamed from: f */
    public final void mo160539f(zze zzeVar) throws RemoteException {
        ((p5v0) this.f196351a.f131188c).mo105942N4(zzeVar);
    }
}
