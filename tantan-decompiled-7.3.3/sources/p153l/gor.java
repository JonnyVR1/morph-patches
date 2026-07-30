package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;

/* JADX INFO: loaded from: classes11.dex */
public class gor implements z6m {

    /* JADX INFO: renamed from: c */
    public static final z6m f105336c = new gor();

    /* JADX INFO: renamed from: b */
    public String f105337b;

    /* JADX INFO: renamed from: d */
    public static z6m m131130d() {
        return f105336c;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (!CoreModule.m30933P().m143405a().mo34397Qb() || !sj6Var.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) || joa.m146361M3() || CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            return false;
        }
        String strM126494e = Cfor.INSTANCE.m126494e();
        if (!SeeTrialStatusType.trialing.equals(strM126494e) && !SeeTrialStatusType.trialEnd.equals(strM126494e) && !"waiting".equals(strM126494e) && !SeeTrialStatusType.recovered.equals(strM126494e) && !"expired".equals(strM126494e)) {
            return false;
        }
        this.f105337b = strM126494e;
        return true;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return c17.m107526s0(TextUtils.equals(this.f105337b, SeeTrialStatusType.trialing) ? "谁喜欢我试用配对" : "试用到期", sj6Var.f168949x.getResources().getColor(c9c0.f80442o));
    }
}
