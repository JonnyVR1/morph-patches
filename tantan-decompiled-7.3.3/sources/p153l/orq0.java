package p153l;

import android.content.Context;
import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
class orq0 extends bwq0 {
    public orq0(Context context, euq0 euq0Var, byq0 byq0Var) {
        super(CrashType.ANR, context, euq0Var, byq0Var);
    }

    @Override // p153l.bwq0
    /* JADX INFO: renamed from: b */
    public gsq0 mo106742b(gsq0 gsq0Var) {
        gsq0 gsq0VarMo106742b = super.mo106742b(gsq0Var);
        hwq0 hwq0VarM137476a = hwq0.m137476a(this.f78771b);
        hwq0.m137478c(hwq0VarM137476a);
        hwq0.m137482h(hwq0VarM137476a);
        hwq0VarM137476a.m137498m();
        hwq0VarM137476a.m137499o();
        hwq0VarM137476a.m137500q();
        gsq0VarMo106742b.m132134h(hwq0VarM137476a);
        gsq0VarMo106742b.m132136j("process_name", lrq0.m155648l(this.f78771b));
        x5r0.m209428a(gsq0VarMo106742b, hwq0VarM137476a, this.f78770a);
        return gsq0VarMo106742b;
    }

    @Override // p153l.bwq0
    /* JADX INFO: renamed from: d */
    public boolean mo106744d() {
        return true;
    }
}
