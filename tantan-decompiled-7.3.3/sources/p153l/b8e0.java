package p153l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoinRechargeType;
import com.p051p1.mobile.putong.core.data.MonetizationMsg;
import com.p051p1.mobile.putong.core.data.OpenH5Type;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class b8e0 extends o5e0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m102977f(Act act, MonetizationMsg monetizationMsg) {
        act.progressDismiss();
        if (NullChecker.m82486a(monetizationMsg)) {
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            String str = monetizationMsg.msgVal;
            if (coinRechargeType != CoinRechargeType.get("url")) {
                a5i0.m96082A1(act, "", null);
            } else {
                if (monetizationMsg.openType == OpenH5Type.get("browser")) {
                    act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                }
                Intent intentM213301A = xwa.m213301A(act, null, str, true, true, true);
                intentM213301A.putExtra("hideNotch", true);
                act.startActivity(intentM213301A);
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        final Act act = (Act) abe0Var.m96739b();
        act.progress(R$string.f21517I2);
        act.duringCreated(CoreModule.f18264c.f20312H0.m155472w4()).subscribe(psd0.m173597H(new y20() { // from class: l.z7e0
            @Override // p153l.y20
            public final void call(Object obj) {
                b8e0.m102977f(act, (MonetizationMsg) obj);
            }
        }, new y20() { // from class: l.a8e0
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        return null;
    }
}
