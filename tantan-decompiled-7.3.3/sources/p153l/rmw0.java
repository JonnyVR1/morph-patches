package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class rmw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmw0 f163940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zmw0 f163941c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sni0 f163942d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ umw0 f163943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmw0(umw0 umw0Var, sni0 sni0Var, lmw0 lmw0Var, zmw0 zmw0Var, sni0 sni0Var2) {
        super(sni0Var);
        this.f163940b = lmw0Var;
        this.f163941c = zmw0Var;
        this.f163942d = sni0Var2;
        this.f163943e = umw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.slw0] */
    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        try {
            ?? M187022e = this.f163943e.f179684a.m187022e();
            if (M187022e == 0) {
                return;
            }
            lmw0 lmw0Var = this.f163940b;
            String str = this.f163943e.f179685b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", lmw0Var.mo154894b());
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, lmw0Var.mo154893a());
            M187022e.mo177016z4(bundle, new tmw0(this.f163943e, this.f163941c));
        } catch (RemoteException e) {
            umw0.f179682c.m111555b(e, "dismiss overlay display from: %s", this.f163943e.f179685b);
            this.f163942d.m186942d(new RuntimeException(e));
        }
    }
}
