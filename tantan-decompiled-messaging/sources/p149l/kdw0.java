package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class kdw0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qdw0 f122638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tdw0 f122639c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sei0 f122640d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ odw0 f122641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdw0(odw0 odw0Var, sei0 sei0Var, qdw0 qdw0Var, tdw0 tdw0Var, sei0 sei0Var2) {
        super(sei0Var);
        this.f122638b = qdw0Var;
        this.f122639c = tdw0Var;
        this.f122640d = sei0Var2;
        this.f122641e = odw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.mcw0] */
    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        try {
            ?? M154333e = this.f122641e.f143251a.m154333e();
            if (M154333e == 0) {
                return;
            }
            odw0 odw0Var = this.f122641e;
            String str = odw0Var.f143252b;
            qdw0 qdw0Var = this.f122638b;
            String str2 = odw0Var.f143252b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", qdw0Var.mo174127e());
            bundle.putString("adFieldEnifd", qdw0Var.mo174128f());
            bundle.putInt("layoutGravity", qdw0Var.mo174125c());
            bundle.putFloat("layoutVerticalMargin", qdw0Var.mo174123a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", qdw0Var.mo174126d());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (qdw0Var.mo174129g() != null) {
                bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, qdw0Var.mo174129g());
            }
            M154333e.mo145609d3(str, bundle, new ndw0(this.f122641e, this.f122639c));
        } catch (RemoteException e) {
            odw0.f143249c.m202812b(e, "show overlay display from: %s", this.f122641e.f143252b);
            this.f122640d.m183660d(new RuntimeException(e));
        }
    }
}
