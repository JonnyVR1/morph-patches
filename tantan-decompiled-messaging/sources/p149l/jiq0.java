package p149l;

import android.content.Context;
import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
class jiq0 extends vmq0 {
    public jiq0(Context context, ykq0 ykq0Var, voq0 voq0Var) {
        super(CrashType.ANR, context, ykq0Var, voq0Var);
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: b */
    public bjq0 mo141663b(bjq0 bjq0Var) {
        bjq0 bjq0VarMo141663b = super.mo141663b(bjq0Var);
        bnq0 bnq0VarM102832a = bnq0.m102832a(this.f182140b);
        bnq0.m102834c(bnq0VarM102832a);
        bnq0.m102838h(bnq0VarM102832a);
        bnq0VarM102832a.m102854m();
        bnq0VarM102832a.m102855o();
        bnq0VarM102832a.m102856q();
        bjq0VarMo141663b.m102215h(bnq0VarM102832a);
        bjq0VarMo141663b.m102217j("process_name", giq0.m126397l(this.f182140b));
        rwq0.m181442a(bjq0VarMo141663b, bnq0VarM102832a, this.f182139a);
        return bjq0VarMo141663b;
    }

    @Override // p149l.vmq0
    /* JADX INFO: renamed from: d */
    public boolean mo108891d() {
        return true;
    }
}
