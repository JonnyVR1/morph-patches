package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class qmw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wmw0 f158436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zmw0 f158437c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sni0 f158438d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ umw0 f158439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmw0(umw0 umw0Var, sni0 sni0Var, wmw0 wmw0Var, zmw0 zmw0Var, sni0 sni0Var2) {
        super(sni0Var);
        this.f158436b = wmw0Var;
        this.f158437c = zmw0Var;
        this.f158438d = sni0Var2;
        this.f158439e = umw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.slw0] */
    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        try {
            ?? M187022e = this.f158439e.f179684a.m187022e();
            if (M187022e == 0) {
                return;
            }
            umw0 umw0Var = this.f158439e;
            String str = umw0Var.f179685b;
            wmw0 wmw0Var = this.f158436b;
            String str2 = umw0Var.f179685b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", wmw0Var.mo98869e());
            bundle.putString("adFieldEnifd", wmw0Var.mo98870f());
            bundle.putInt("layoutGravity", wmw0Var.mo98867c());
            bundle.putFloat("layoutVerticalMargin", wmw0Var.mo98865a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", wmw0Var.mo98868d());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (wmw0Var.mo98871g() != null) {
                bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, wmw0Var.mo98871g());
            }
            M187022e.mo177015d3(str, bundle, new tmw0(this.f158439e, this.f158437c));
        } catch (RemoteException e) {
            umw0.f179682c.m111555b(e, "show overlay display from: %s", this.f158439e.f179685b);
            this.f158438d.m186942d(new RuntimeException(e));
        }
    }
}
