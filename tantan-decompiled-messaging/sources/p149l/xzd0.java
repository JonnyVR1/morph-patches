package p149l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoinRechargeType;
import com.p046p1.mobile.putong.core.data.MonetizationMsg;
import com.p046p1.mobile.putong.core.data.OpenH5Type;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class xzd0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m211987f(Act act, MonetizationMsg monetizationMsg) {
        act.progressDismiss();
        if (NullChecker.m81303a(monetizationMsg)) {
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            String str = monetizationMsg.msgVal;
            if (coinRechargeType != CoinRechargeType.get("url")) {
                swh0.m186177A1(act, "", null);
            } else {
                if (monetizationMsg.openType == OpenH5Type.get("browser")) {
                    act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                }
                Intent intentM151840A = lva.m151840A(act, null, str, true, true, true);
                intentM151840A.putExtra("hideNotch", true);
                act.startActivity(intentM151840A);
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        final Act act = (Act) w2e0Var.m201094b();
        act.progress(R$string.f20775I2);
        act.duringCreated(CoreModule.f17545c.f19570H0.m210384w4()).subscribe(mkd0.m154956H(new e30() { // from class: l.vzd0
            @Override // p149l.e30
            public final void call(Object obj) {
                xzd0.m211987f(act, (MonetizationMsg) obj);
            }
        }, new e30() { // from class: l.wzd0
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        return null;
    }
}
