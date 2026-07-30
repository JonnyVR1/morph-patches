package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class i7i0 extends e400 {
    public i7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m134904C(cwf0 cwf0Var, f400 f400Var) {
        o6j0.m162859c("e_anti_harass_customiza_popup_set", "p_anti_harass_customiza_popup", new o6j0.C18854a[0]);
        i0e.m133796e(cwf0Var);
        f400Var.mo102961c().startActivity(WebViewAct.m80164Z1(f400Var.mo102961c(), "设置屏蔽词", ene0.m117266a("customiza_popup")));
    }

    /* JADX INFO: renamed from: F */
    public final void m134907F(final f400 f400Var) {
        if (f400Var == null || f400Var.mo102961c() == null || !upa.m194711W2()) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.f7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96263a.m134909H(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m134908G(cwf0 cwf0Var, f400 f400Var) {
        o6j0.m162859c("e_anti_harass_customiza_popup_nothanks", "p_anti_harass_customiza_popup", new o6j0.C18854a[0]);
        i0e.m133796e(cwf0Var);
        if (CoreModule.f17545c.f19663m0.f19431m1.get().booleanValue()) {
            m134910I(f400Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m134909H(final f400 f400Var) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_anti_harass_customiza_popup", Dialog.class.getName());
        new dd80.C16336a(f400Var.mo102961c()).m110964S(x2c0.f190195h6).m110996y0("自定义防骚扰关键词").m110991t0("平台给予您自定义屏蔽关键词的权力，开启后您将不再收到相关消息").m110961P(false).m110974c0("去设置", new Runnable() { // from class: l.g7i0
            @Override // java.lang.Runnable
            public final void run() {
                i7i0.m134904C(cwf0VarM133794c, f400Var);
            }
        }).m110969X("不用了", new Runnable() { // from class: l.h7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106280a.m134908G(cwf0VarM133794c, f400Var);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: I */
    public final void m134910I(f400 f400Var) {
        CoreModule.f17545c.f19663m0.f19431m1.put(Boolean.FALSE);
        new dd80.C16336a(f400Var.mo102961c()).m110996y0("温馨提示").m110991t0("好的，如您需要，可在【设置】页面添加哦").m110961P(true).m110973b0("我知道了").m110989r0();
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("antiHarassmentPopup")) {
            return false;
        }
        m134907F(f400Var);
        return true;
    }
}
