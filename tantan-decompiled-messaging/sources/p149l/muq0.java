package p149l;

import android.content.Context;
import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
class muq0 extends vmq0 {
    public muq0(Context context, ykq0 ykq0Var, voq0 voq0Var) {
        super(CrashType.LAUNCH, context, ykq0Var, voq0Var);
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: a */
    public bjq0 mo108890a(int i, bjq0 bjq0Var) {
        bjq0 bjq0VarMo108890a = super.mo108890a(i, bjq0Var);
        if (i == 0) {
            bnq0 bnq0VarM102832a = bnq0.m102832a(this.f182140b);
            bnq0VarM102832a.m102854m();
            bjq0VarMo108890a.m102215h(bnq0VarM102832a);
            rwq0.m181442a(bjq0VarMo108890a, bnq0VarM102832a, this.f182139a);
            return bjq0VarMo108890a;
        }
        if (i == 1) {
            bnq0 bnq0VarM102207H = bjq0VarMo108890a.m102207H();
            bnq0VarM102207H.m102855o();
            bnq0VarM102207H.m102856q();
            return bjq0VarMo108890a;
        }
        if (i == 2) {
            bnq0.m102834c(bjq0VarMo108890a.m102207H());
            try {
                bjq0VarMo108890a.m102207H().m102857s().put("launch_did", ciq0.m107095a(this.f182140b));
            } catch (Throwable unused) {
            }
        } else if (i == 5) {
            bnq0.m102838h(bjq0VarMo108890a.m102207H());
            return bjq0VarMo108890a;
        }
        return bjq0VarMo108890a;
    }
}
