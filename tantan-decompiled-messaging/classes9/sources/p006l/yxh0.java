package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.web.WebViewClientX;
import com.p000p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.jkp0;
import l.l7n;
import l.lsi0;
import l.s7m;
import l.sw3;
import l.w9j;
import l.zxh0;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yxh0 implements s7m<wxh0> {

    /* JADX INFO: renamed from: a */
    public CardView f28478a;

    /* JADX INFO: renamed from: b */
    public VText f28479b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f28480c;

    /* JADX INFO: renamed from: d */
    public WebViewX f28481d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f28482e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f28483f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f28484g;

    /* JADX INFO: renamed from: h */
    public ImageView f28485h;

    /* JADX INFO: renamed from: i */
    public wxh0 f28486i;

    /* JADX INFO: renamed from: j */
    public Act f28487j;

    /* JADX INFO: renamed from: k */
    public aoq f28488k;

    public yxh0(Act act) {
        this.f28487j = act;
    }

    /* JADX INFO: renamed from: j */
    private void m28458j() {
        WebViewClientX sw3Var = new sw3(act(), m28464f(), false);
        sw3Var.setListener(m28465i());
        this.f28481d.setWebViewClientX(sw3Var);
        this.f28481d.setWebChromeClientX(new thp0());
        this.f28486i.m26876s0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28459C0() {
        return act();
    }

    @Nullable
    public Act act() {
        return this.f28487j;
    }

    /* JADX INFO: renamed from: b */
    public View m28460b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zxh0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m28466i1(wxh0 wxh0Var) {
        this.f28486i = wxh0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m28462d(String str) {
        this.f28480c.setText(str);
    }

    public void destroy() {
        if (NullChecker.a(this.f28488k)) {
            this.f28488k.k();
        }
        if (NullChecker.a(this.f28481d)) {
            this.f28481d.removeAllViews();
            ((ViewGroup) this.f28481d.getParent()).removeView(this.f28481d);
            this.f28481d.setTag(null);
            this.f28481d.clearHistory();
            this.f28481d.destroy();
            this.f28481d = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m28463e(int i) {
        this.f28480c.setTextSize(i);
    }

    /* JADX INFO: renamed from: f */
    public w9j<String, Boolean> m28464f() {
        return new w9j() { // from class: l.xxh0
            public final Object call(Object obj) {
                return this.f27777a.m28467k((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public sw3.a m28465i() {
        return new C1501a();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m28460b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m28467k(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f28481d.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: l */
    public void m28468l() {
        this.f28483f.setVisibility(0);
        this.f28482e.setVisibility(8);
        lsi0.n(R.string.P1);
    }

    /* JADX INFO: renamed from: m */
    public void m28469m(AuthData authData) {
        aoq aoqVar = new aoq((PutongAct) act(), authData.accessToken, this.f28481d);
        this.f28488k = aoqVar;
        this.f28481d.addJavascriptInterface(aoqVar, "tantan");
        Map<String, String> map = new HashMap<>();
        if (jkp0.d(this.f28486i.m26873m0())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f28481d.setOverScrollMode(2);
        this.f28481d.loadUrl(this.f28486i.m26873m0(), map);
    }

    /* JADX INFO: renamed from: r */
    public void m28470r() {
        this.f28487j.setTitle(R.string.ga);
        this.f28479b.setText(String.format("%s (%s)", act().getString(R.string.W1), act().getString(l7n.e())));
        m28458j();
    }

    /* JADX INFO: renamed from: l.yxh0$a */
    public class C1501a implements sw3.a {
        public C1501a() {
        }

        /* JADX INFO: renamed from: a */
        public void m28471a(String str) {
            yxh0.this.f28483f.setVisibility(8);
            yxh0.this.f28482e.setVisibility(8);
        }

        /* JADX INFO: renamed from: c */
        public void m28473c(int i, String str, String str2) {
            yxh0.this.f28483f.setVisibility(0);
            yxh0.this.f28482e.setVisibility(8);
        }

        /* JADX INFO: renamed from: b */
        public void m28472b(String str) {
        }
    }
}
