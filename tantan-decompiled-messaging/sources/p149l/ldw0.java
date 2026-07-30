package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class ldw0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fdw0 f127616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tdw0 f127617c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sei0 f127618d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ odw0 f127619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldw0(odw0 odw0Var, sei0 sei0Var, fdw0 fdw0Var, tdw0 tdw0Var, sei0 sei0Var2) {
        super(sei0Var);
        this.f127616b = fdw0Var;
        this.f127617c = tdw0Var;
        this.f127618d = sei0Var2;
        this.f127619e = odw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.mcw0] */
    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        try {
            ?? M154333e = this.f127619e.f143251a.m154333e();
            if (M154333e == 0) {
                return;
            }
            fdw0 fdw0Var = this.f127616b;
            String str = this.f127619e.f143252b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", fdw0Var.mo121012b());
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, fdw0Var.mo121011a());
            M154333e.mo145610z4(bundle, new ndw0(this.f127619e, this.f127617c));
        } catch (RemoteException e) {
            odw0.f143249c.m202812b(e, "dismiss overlay display from: %s", this.f127619e.f143252b);
            this.f127618d.m183660d(new RuntimeException(e));
        }
    }
}
