package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class mdw0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vdw0 f133321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f133322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tdw0 f133323d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sei0 f133324e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ odw0 f133325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdw0(odw0 odw0Var, sei0 sei0Var, vdw0 vdw0Var, int i, tdw0 tdw0Var, sei0 sei0Var2) {
        super(sei0Var);
        this.f133321b = vdw0Var;
        this.f133322c = i;
        this.f133323d = tdw0Var;
        this.f133324e = sei0Var2;
        this.f133325f = odw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.mcw0] */
    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        try {
            ?? M154333e = this.f133325f.f143251a.m154333e();
            if (M154333e == 0) {
                return;
            }
            vdw0 vdw0Var = this.f133321b;
            String str = this.f133325f.f143252b;
            int i = this.f133322c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", vdw0Var.mo111086b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, vdw0Var.mo111085a());
            M154333e.mo145608Y5(bundle, new ndw0(this.f133325f, this.f133323d));
        } catch (RemoteException e) {
            odw0.f143249c.m202812b(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f133322c), this.f133325f.f143252b);
            this.f133324e.m183660d(new RuntimeException(e));
        }
    }
}
