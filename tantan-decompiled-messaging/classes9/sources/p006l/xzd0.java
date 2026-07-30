package p006l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoinRechargeType;
import com.p1.mobile.putong.core.data.MonetizationMsg;
import com.p1.mobile.putong.core.data.OpenH5Type;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xzd0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m27732f(Act act, MonetizationMsg monetizationMsg) {
        act.progressDismiss();
        if (NullChecker.a(monetizationMsg)) {
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            String str = monetizationMsg.msgVal;
            if (coinRechargeType != CoinRechargeType.get("url")) {
                swh0.m24228A1(act, "", null);
            } else {
                if (monetizationMsg.openType == OpenH5Type.get("browser")) {
                    act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                }
                Intent intentM19017A = lva.m19017A(act, null, str, true, true, true);
                intentM19017A.putExtra("hideNotch", true);
                act.startActivity(intentM19017A);
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        final Act actM26156b = w2e0Var.m26156b();
        actM26156b.progress(R.string.I2);
        actM26156b.duringCreated(CoreModule.f1534c.f3559H0.m27559w4()).subscribe(mkd0.H(new e30() { // from class: l.vzd0
            public final void call(Object obj) {
                xzd0.m27732f(actM26156b, (MonetizationMsg) obj);
            }
        }, new e30() { // from class: l.wzd0
            public final void call(Object obj) {
                actM26156b.progressDismiss();
            }
        }));
        return null;
    }
}
