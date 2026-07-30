package p153l;

import android.content.Context;
import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
class e3r0 extends bwq0 {
    public e3r0(Context context, euq0 euq0Var, byq0 byq0Var) {
        super(CrashType.JAVA, context, euq0Var, byq0Var);
    }

    @Override // p153l.bwq0
    /* JADX INFO: renamed from: a */
    public gsq0 mo106741a(int i, gsq0 gsq0Var) {
        gsq0 gsq0VarMo106741a = super.mo106741a(i, gsq0Var);
        if (i == 0) {
            gsq0VarMo106741a.m132136j("app_count", 1);
            gsq0VarMo106741a.m132136j("magic_tag", "ss_app_log");
            m106753m(gsq0VarMo106741a);
            hwq0 hwq0VarM137476a = hwq0.m137476a(this.f78771b);
            hwq0VarM137476a.m137498m();
            gsq0VarMo106741a.m132134h(hwq0VarM137476a);
            x5r0.m209428a(gsq0VarMo106741a, hwq0VarM137476a, this.f78770a);
            return gsq0VarMo106741a;
        }
        if (i == 1) {
            hwq0 hwq0VarM132126H = gsq0VarMo106741a.m132126H();
            hwq0VarM132126H.m137499o();
            hwq0VarM132126H.m137500q();
            return gsq0VarMo106741a;
        }
        if (i == 2) {
            hwq0.m137478c(gsq0VarMo106741a.m132126H());
            return gsq0VarMo106741a;
        }
        if (i != 5) {
            return gsq0VarMo106741a;
        }
        hwq0.m137482h(gsq0VarMo106741a.m132126H());
        return gsq0VarMo106741a;
    }
}
