package p149l;

import android.content.Context;
import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
class cvq0 extends vmq0 {
    public cvq0(Context context, ykq0 ykq0Var, voq0 voq0Var) {
        super(CrashType.NATIVE, context, ykq0Var, voq0Var);
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
        if (i != 1) {
            if (i != 2) {
                return bjq0VarMo108890a;
            }
            bnq0.m102834c(bjq0VarMo108890a.m102207H());
            return bjq0VarMo108890a;
        }
        bnq0 bnq0VarM102207H = bjq0VarMo108890a.m102207H();
        bnq0VarM102207H.m102855o();
        bnq0VarM102207H.m102856q();
        return bjq0VarMo108890a;
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: d */
    public boolean mo108891d() {
        return false;
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: e */
    public int mo108892e() {
        return dlq0.m112411a();
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: j */
    public boolean mo108893j() {
        return false;
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: n */
    public void mo108894n(bjq0 bjq0Var) {
    }
}
