package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.ChatAppealCheckData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SliderData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class uvd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act act = (Act) w2e0Var.m201094b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "jailed";
        vjf0.m198623e().m198639r(str);
        act.duringCreated(qib0.f154699N.userAppealCheck(chatAppealCheckDataNew_)).filter(new w9j() { // from class: l.rvd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Envelope) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.svd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166558a.m196061i(act, (Envelope) obj);
            }
        }, new e30() { // from class: l.tvd0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f18813p4);
            }
        }));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m196060h(String str) {
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
    public final /* synthetic */ void m196061i(Act act, Envelope envelope) {
        if (NullChecker.m81303a(envelope.data.getModuleData(CommonData.class))) {
            String str = ((CommonData) envelope.data.getModuleData(CommonData.class)).stage;
            if (1 == m196060h(str)) {
                SliderData sliderData = ((CommonData) envelope.data.getModuleData(CommonData.class)).captcha;
                if (NullChecker.m81303a(sliderData) && !TextUtils.isEmpty(sliderData.uuid) && ConnectivityReceiver.m81284g()) {
                    m196062j(act, sliderData);
                    return;
                }
                return;
            }
            if (2 == m196060h(str)) {
                lsi0.m151593w(R$string.f18783o5);
                return;
            }
            if (5 == m196060h(str)) {
                lsi0.m151593w(R$string.f18814p5);
            } else if (4 == m196060h(str)) {
                lsi0.m151593w(R$string.f18752n5);
            } else if (6 == m196060h(str)) {
                lsi0.m151593w(R$string.f18814p5);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m196062j(Act act, SliderData sliderData) {
        String strM177378z = NullChecker.m81303a(CoreBusinessModule.f17533c) ? CoreBusinessModule.f17533c.m177378z() : "";
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strM198634m = vjf0.m198623e().m198634m(strM177378z, NullChecker.m81303a(userM169527p9) ? userM169527p9.publicId : "", sliderData, "forbid_chat_appeal", false);
        if (TextUtils.isEmpty(strM198634m)) {
            return;
        }
        Intent intentM80173m2 = WebViewDialogAct.m80173m2(CoreModule.f17544b, "", strM198634m, true, true);
        intentM80173m2.putExtra("hideNavigationBar", true);
        intentM80173m2.putExtra("skipLoading", true);
        act.startActivity(intentM80173m2);
    }
}
