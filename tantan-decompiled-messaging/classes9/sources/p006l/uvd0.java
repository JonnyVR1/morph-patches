package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreBusinessModule;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.ChatAppealCheckData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.SliderData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.vjf0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uvd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act actM26156b = w2e0Var.m26156b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "jailed";
        vjf0.e().r(str);
        actM26156b.duringCreated(qib0.f19790N.userAppealCheck(chatAppealCheckDataNew_)).filter(new w9j() { // from class: l.rvd0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Envelope) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.svd0
            public final void call(Object obj) {
                this.f21684a.m25567i(actM26156b, (Envelope) obj);
            }
        }, new e30() { // from class: l.tvd0
            public final void call(Object obj) {
                lsi0.h(R$string.f2802p4);
            }
        }));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m25566h(String str) {
        if (TextUtils.equals(str, "captcha")) {
            return 1;
        }
        if (TextUtils.equals(str, "process")) {
            return 2;
        }
        if (TextUtils.equals(str, "finished")) {
            return 3;
        }
        if (TextUtils.equals(str, "normal")) {
            return 4;
        }
        if (TextUtils.equals(str, "failed")) {
            return 5;
        }
        return TextUtils.equals(str, "invalid") ? 6 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25567i(Act act, Envelope envelope) {
        if (NullChecker.a(envelope.data.getModuleData(CommonData.class))) {
            String str = envelope.data.getModuleData(CommonData.class).stage;
            if (1 == m25566h(str)) {
                SliderData sliderData = envelope.data.getModuleData(CommonData.class).captcha;
                if (NullChecker.a(sliderData) && !TextUtils.isEmpty(sliderData.uuid) && ConnectivityReceiver.g()) {
                    m25568j(act, sliderData);
                    return;
                }
                return;
            }
            if (2 == m25566h(str)) {
                lsi0.w(R$string.f2772o5);
                return;
            }
            if (5 == m25566h(str)) {
                lsi0.w(R$string.f2803p5);
            } else if (4 == m25566h(str)) {
                lsi0.w(R$string.f2741n5);
            } else if (6 == m25566h(str)) {
                lsi0.w(R$string.f2803p5);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m25568j(Act act, SliderData sliderData) {
        String strZ = NullChecker.a(CoreBusinessModule.f1522c) ? CoreBusinessModule.f1522c.z() : "";
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        String strM = vjf0.e().m(strZ, NullChecker.a(userM21490p9) ? userM21490p9.publicId : "", sliderData, "forbid_chat_appeal", false);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        Intent intentM2 = WebViewDialogAct.m2(CoreModule.f1533b, "", strM, true, true);
        intentM2.putExtra("hideNavigationBar", true);
        intentM2.putExtra("skipLoading", true);
        act.startActivity(intentM2);
    }
}
