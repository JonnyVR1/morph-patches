package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.ChatAppealCheckData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SliderData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class y3e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act act = (Act) abe0Var.m96739b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "jailed";
        esf0.m122324e().m122340r(str);
        act.duringCreated(uqb0.f180382N.userAppealCheck(chatAppealCheckDataNew_)).filter(new qcj() { // from class: l.v3e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Envelope) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.w3e0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187129a.m214145i(act, (Envelope) obj);
            }
        }, new y20() { // from class: l.x3e0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f19605r4);
            }
        }));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m214144h(String str) {
        if (TextUtils.equals(str, Captcha.TYPE)) {
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
    public final /* synthetic */ void m214145i(Act act, Envelope envelope) {
        if (NullChecker.m82486a(envelope.data.getModuleData(CommonData.class))) {
            String str = ((CommonData) envelope.data.getModuleData(CommonData.class)).stage;
            if (1 == m214144h(str)) {
                SliderData sliderData = ((CommonData) envelope.data.getModuleData(CommonData.class)).captcha;
                if (NullChecker.m82486a(sliderData) && !TextUtils.isEmpty(sliderData.uuid) && ConnectivityReceiver.m82467g()) {
                    m214146j(act, sliderData);
                    return;
                }
                return;
            }
            if (2 == m214144h(str)) {
                o1j0.m165649w(R$string.f19575q5);
                return;
            }
            if (5 == m214144h(str)) {
                o1j0.m165649w(R$string.f19606r5);
            } else if (4 == m214144h(str)) {
                o1j0.m165649w(R$string.f19544p5);
            } else if (6 == m214144h(str)) {
                o1j0.m165649w(R$string.f19606r5);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m214146j(Act act, SliderData sliderData) {
        String strM193947z = NullChecker.m82486a(CoreBusinessModule.f18252c) ? CoreBusinessModule.f18252c.m193947z() : "";
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strM122335m = esf0.m122324e().m122335m(strM193947z, NullChecker.m82486a(userM116600p9) ? userM116600p9.publicId : "", sliderData, "forbid_chat_appeal", false);
        if (TextUtils.isEmpty(strM122335m)) {
            return;
        }
        Intent intentM81356n2 = WebViewDialogAct.m81356n2(CoreModule.f18263b, "", strM122335m, true, true);
        intentM81356n2.putExtra("hideNavigationBar", true);
        intentM81356n2.putExtra("skipLoading", true);
        act.startActivity(intentM81356n2);
    }
}
