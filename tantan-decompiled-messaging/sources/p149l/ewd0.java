package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVipCreditScoreIntroView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;

/* JADX INFO: loaded from: classes9.dex */
public class ewd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m118467e(boolean z, w2e0 w2e0Var) {
        if (z) {
            C8764c.m53431V((Act) w2e0Var.m201094b(), "p_home,femalevip_score", Privilege.pick_tantan_credits_users);
        }
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("title");
        String str2 = w2e0Var.m201098f().get("buttonText");
        boolean z = Boolean.parseBoolean(w2e0Var.m201098f().get("showCreditScore"));
        String str3 = w2e0Var.m201098f().get("creditScore");
        final boolean z2 = TextUtils.equals(str, "探探信用分") && g6a.m124562k() && !xma.m210039B3() && !z;
        if (z2) {
            str2 = "点击解锁";
            str3 = null;
        }
        dd80 dd80VarM110960O = new dd80.C16336a(w2e0Var.m201094b()).m110962Q(f6c0.f95957q3).m110974c0(str2, new Runnable() { // from class: l.dwd0
            @Override // java.lang.Runnable
            public final void run() {
                ewd0.m118467e(z2, w2e0Var);
            }
        }).m110975d0(x2c0.f189353G7).m110961P(true).m110958M(true).m110960O();
        ((FemaleVipCreditScoreIntroView) dd80VarM110960O.m110906L()).m36450b(str, "探探分综合评估该用户在探探的文明行为，满分100，每日更新", str3);
        dd80VarM110960O.show();
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
