package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVipCreditScoreIntroView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;

/* JADX INFO: loaded from: classes9.dex */
public class i4e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m138488e(boolean z, abe0 abe0Var) {
        if (z) {
            C8927c.m54614V((Act) abe0Var.m96739b(), "p_home,femalevip_score", Privilege.pick_tantan_credits_users);
        }
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("title");
        String str2 = abe0Var.m96743f().get("buttonText");
        boolean z = Boolean.parseBoolean(abe0Var.m96743f().get("showCreditScore"));
        String str3 = abe0Var.m96743f().get("creditScore");
        final boolean z2 = TextUtils.equals(str, "探探信用分") && s7a.m184982k() && !joa.m146353C3() && !z;
        if (z2) {
            str2 = "点击解锁";
            str3 = null;
        }
        jl80 jl80VarM146020O = new jl80.C17971a(abe0Var.m96739b()).m146022Q(kec0.f126011q3).m146034c0(str2, new Runnable() { // from class: l.h4e0
            @Override // java.lang.Runnable
            public final void run() {
                i4e0.m138488e(z2, abe0Var);
            }
        }).m146035d0(dbc0.f86208H7).m146021P(true).m146018M(true).m146020O();
        ((FemaleVipCreditScoreIntroView) jl80VarM146020O.m145966L()).m37453b(str, "探探分综合评估该用户在探探的文明行为，满分100，每日更新", str3);
        jl80VarM146020O.show();
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
