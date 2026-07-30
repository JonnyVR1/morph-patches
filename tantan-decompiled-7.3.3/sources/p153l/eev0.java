package p153l;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class eev0 extends uys0 {

    /* JADX INFO: renamed from: a */
    public final scv0 f93673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fev0 f93674b;

    public /* synthetic */ eev0(fev0 fev0Var, scv0 scv0Var, dev0 dev0Var) {
        this.f93674b = fev0Var;
        this.f93673a = scv0Var;
    }

    @Override // p153l.vys0
    /* JADX INFO: renamed from: T5 */
    public final void mo120566T5(mxs0 mxs0Var) throws RemoteException {
        this.f93674b.f98720d = mxs0Var;
        ((vev0) this.f93673a.f167349c).zzo();
    }

    @Override // p153l.vys0
    /* JADX INFO: renamed from: Y */
    public final void mo120567Y(p1m p1mVar) throws RemoteException {
        this.f93674b.f98719c = (View) h950.m134037P2(p1mVar);
        ((vev0) this.f93673a.f167349c).zzo();
    }

    @Override // p153l.vys0
    /* JADX INFO: renamed from: c */
    public final void mo120568c(String str) throws RemoteException {
        ((vev0) this.f93673a.f167349c).mo118714G0(0, str);
    }

    @Override // p153l.vys0
    /* JADX INFO: renamed from: f */
    public final void mo120569f(zze zzeVar) throws RemoteException {
        ((vev0) this.f93673a.f167349c).mo118717N4(zzeVar);
    }
}
