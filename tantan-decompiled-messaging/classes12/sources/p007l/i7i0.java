package p007l;

import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.cwf0;
import l.dd80;
import l.e400;
import l.e51;
import l.ene0;
import l.f400;
import l.i0e;
import l.o6j0;
import l.upa;
import l.x2c0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i7i0 extends e400 {
    public i7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m10825C(cwf0 cwf0Var, f400 f400Var) {
        o6j0.c("e_anti_harass_customiza_popup_set", "p_anti_harass_customiza_popup", new o6j0.a[0]);
        i0e.e(cwf0Var);
        f400Var.c().startActivity(WebViewAct.Z1(f400Var.c(), "设置屏蔽词", ene0.a("customiza_popup")));
    }

    /* JADX INFO: renamed from: F */
    public final void m10828F(final f400 f400Var) {
        if (f400Var == null || f400Var.c() == null || !upa.W2()) {
            return;
        }
        e51.M(new Runnable() { // from class: l.f7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8016a.m10830H(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10829G(cwf0 cwf0Var, f400 f400Var) {
        o6j0.c("e_anti_harass_customiza_popup_nothanks", "p_anti_harass_customiza_popup", new o6j0.a[0]);
        i0e.e(cwf0Var);
        if (((Boolean) CoreModule.c.m0.m1.get()).booleanValue()) {
            m10831I(f400Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10830H(final f400 f400Var) {
        final cwf0 cwf0VarC = i0e.c("p_anti_harass_customiza_popup", Dialog.class.getName());
        new dd80.a(f400Var.c()).S(x2c0.h6).y0("自定义防骚扰关键词").t0("平台给予您自定义屏蔽关键词的权力，开启后您将不再收到相关消息").P(false).c0("去设置", new Runnable() { // from class: l.g7i0
            @Override // java.lang.Runnable
            public final void run() {
                i7i0.m10825C(cwf0VarC, f400Var);
            }
        }).X("不用了", new Runnable() { // from class: l.h7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8617a.m10829G(cwf0VarC, f400Var);
            }
        }).r0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: I */
    public final void m10831I(f400 f400Var) {
        CoreModule.c.m0.m1.put(Boolean.FALSE);
        new dd80.a(f400Var.c()).y0("温馨提示").t0("好的，如您需要，可在【设置】页面添加哦").P(true).b0("我知道了").r0();
    }

    /* JADX INFO: renamed from: n */
    public boolean m10832n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("antiHarassmentPopup")) {
            return false;
        }
        m10828F(f400Var);
        return true;
    }
}
