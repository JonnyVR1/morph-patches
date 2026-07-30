package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.dd80;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ewd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14904e(boolean z, w2e0 w2e0Var) {
        if (z) {
            c.V(w2e0Var.m26156b(), "p_home,femalevip_score", Privilege.pick_tantan_credits_users);
        }
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("title");
        String str2 = w2e0Var.m26160f().get("buttonText");
        boolean z = Boolean.parseBoolean(w2e0Var.m26160f().get("showCreditScore"));
        String str3 = w2e0Var.m26160f().get("creditScore");
        final boolean z2 = TextUtils.equals(str, "探探信用分") && g6a.m15588k() && !xma.m27347B3() && !z;
        if (z2) {
            str2 = "点击解锁";
            str3 = null;
        }
        dd80 dd80VarO = new dd80.a(w2e0Var.m26156b()).Q(f6c0.f12371q3).c0(str2, new Runnable() { // from class: l.dwd0
            @Override // java.lang.Runnable
            public final void run() {
                ewd0.m14904e(z2, w2e0Var);
            }
        }).d0(x2c0.f25889G7).P(true).M(true).O();
        dd80VarO.L().b(str, "探探分综合评估该用户在探探的文明行为，满分100，每日更新", str3);
        dd80VarO.show();
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
