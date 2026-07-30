package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;

/* JADX INFO: loaded from: classes11.dex */
public class fmr implements j4m {

    /* JADX INFO: renamed from: c */
    public static final j4m f98326c = new fmr();

    /* JADX INFO: renamed from: b */
    public String f98327b;

    /* JADX INFO: renamed from: d */
    public static j4m m122197d() {
        return f98326c;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (!CoreModule.m29935P().m94651a().mo33394Qb() || !pi6Var.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) || xma.m210047L3() || CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            return false;
        }
        String strM117223e = emr.INSTANCE.m117223e();
        if (!SeeTrialStatusType.trialing.equals(strM117223e) && !SeeTrialStatusType.trialEnd.equals(strM117223e) && !"waiting".equals(strM117223e) && !SeeTrialStatusType.recovered.equals(strM117223e) && !"expired".equals(strM117223e)) {
            return false;
        }
        this.f98327b = strM117223e;
        return true;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return zz6.m221002s0(TextUtils.equals(this.f98327b, SeeTrialStatusType.trialing) ? "谁喜欢我试用配对" : "试用到期", pi6Var.f149124x.getResources().getColor(w0c0.f183872o));
    }
}
