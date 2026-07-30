package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import l.emr;
import l.w0c0;
import l.xma;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fmr implements j4m {

    /* JADX INFO: renamed from: c */
    public static final j4m f13101c = new fmr();

    /* JADX INFO: renamed from: b */
    public String f13102b;

    /* JADX INFO: renamed from: d */
    public static j4m m14529d() {
        return f13101c;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (!CoreModule.P().a().Qb() || !pi6Var.f18622a.isLimitedTrialSee(CoreModule.H().userId()) || xma.L3() || CoreModule.c.e0.p9().isFemale()) {
            return false;
        }
        String strE = emr.INSTANCE.e();
        if (!"trialing".equals(strE) && !"trialEnd".equals(strE) && !"waiting".equals(strE) && !"recovered".equals(strE) && !"expired".equals(strE)) {
            return false;
        }
        this.f13102b = strE;
        return true;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return zz6.s0(TextUtils.equals(this.f13102b, "trialing") ? "谁喜欢我试用配对" : "试用到期", pi6Var.f18645x.getResources().getColor(w0c0.o));
    }
}
