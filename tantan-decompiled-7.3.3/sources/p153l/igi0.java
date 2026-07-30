package p153l;

import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class igi0 extends wc00 {
    public igi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m139920K(l4g0 l4g0Var, xc00 xc00Var) {
        sfj0.m185596c("e_anti_harass_customiza_popup_set", "p_anti_harass_customiza_popup", new sfj0.C20032a[0]);
        w1e.m204401e(l4g0Var);
        xc00Var.mo99543c().startActivity(WebViewAct.m81347a2(xc00Var.mo99543c(), "设置屏蔽词", lve0.m155993a("customiza_popup")));
    }

    /* JADX INFO: renamed from: N */
    public final void m139923N(final xc00 xc00Var) {
        if (xc00Var == null || xc00Var.mo99543c() == null || !gra.m131642W2()) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.fgi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98942a.m139925P(xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m139924O(l4g0 l4g0Var, xc00 xc00Var) {
        sfj0.m185596c("e_anti_harass_customiza_popup_nothanks", "p_anti_harass_customiza_popup", new sfj0.C20032a[0]);
        w1e.m204401e(l4g0Var);
        if (CoreModule.f18264c.f20405m0.f20173m1.get().booleanValue()) {
            m139926Q(xc00Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m139925P(final xc00 xc00Var) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_anti_harass_customiza_popup", Dialog.class.getName());
        new jl80.C17971a(xc00Var.mo99543c()).m146024S(dbc0.f87078i6).m146056y0("自定义防骚扰关键词").m146051t0("平台给予您自定义屏蔽关键词的权力，开启后您将不再收到相关消息").m146021P(false).m146034c0("去设置", new Runnable() { // from class: l.ggi0
            @Override // java.lang.Runnable
            public final void run() {
                igi0.m139920K(l4g0VarM204399c, xc00Var);
            }
        }).m146029X("不用了", new Runnable() { // from class: l.hgi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109411a.m139924O(l4g0VarM204399c, xc00Var);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: Q */
    public final void m139926Q(xc00 xc00Var) {
        CoreModule.f18264c.f20405m0.f20173m1.put(Boolean.FALSE);
        new jl80.C17971a(xc00Var.mo99543c()).m146056y0("温馨提示").m146051t0("好的，如您需要，可在【设置】页面添加哦").m146021P(true).m146033b0("我知道了").m146049r0();
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull @NotNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("antiHarassmentPopup")) {
            return false;
        }
        m139923N(xc00Var);
        return true;
    }
}
