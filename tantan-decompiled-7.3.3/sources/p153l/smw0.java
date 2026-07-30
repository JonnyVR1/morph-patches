package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class smw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bnw0 f169625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f169626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zmw0 f169627d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sni0 f169628e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ umw0 f169629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smw0(umw0 umw0Var, sni0 sni0Var, bnw0 bnw0Var, int i, zmw0 zmw0Var, sni0 sni0Var2) {
        super(sni0Var);
        this.f169625b = bnw0Var;
        this.f169626c = i;
        this.f169627d = zmw0Var;
        this.f169628e = sni0Var2;
        this.f169629f = umw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, l.slw0] */
    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        try {
            ?? M187022e = this.f169629f.f179684a.m187022e();
            if (M187022e == 0) {
                return;
            }
            bnw0 bnw0Var = this.f169625b;
            String str = this.f169629f.f179685b;
            int i = this.f169626c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", bnw0Var.mo105631b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, bnw0Var.mo105630a());
            M187022e.mo177014Y5(bundle, new tmw0(this.f169629f, this.f169627d));
        } catch (RemoteException e) {
            umw0.f179682c.m111555b(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f169626c), this.f169629f.f179685b);
            this.f169628e.m186942d(new RuntimeException(e));
        }
    }
}
