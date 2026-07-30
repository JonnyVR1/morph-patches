package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes9.dex */
public class yxh0 implements s7m<wxh0> {

    /* JADX INFO: renamed from: a */
    public CardView f200601a;

    /* JADX INFO: renamed from: b */
    public VText f200602b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f200603c;

    /* JADX INFO: renamed from: d */
    public WebViewX f200604d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f200605e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f200606f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f200607g;

    /* JADX INFO: renamed from: h */
    public ImageView f200608h;

    /* JADX INFO: renamed from: i */
    public wxh0 f200609i;

    /* JADX INFO: renamed from: j */
    public Act f200610j;

    /* JADX INFO: renamed from: k */
    public aoq f200611k;

    public yxh0(Act act) {
        this.f200610j = act;
    }

    /* JADX INFO: renamed from: j */
    private void m216439j() {
        sw3 sw3Var = new sw3(act(), m216444f(), false);
        sw3Var.setListener(m216445i());
        this.f200604d.setWebViewClientX(sw3Var);
        this.f200604d.setWebChromeClientX(new thp0());
        this.f200609i.m206000s0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f200610j;
    }

    /* JADX INFO: renamed from: b */
    public View m216440b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zxh0.m220825b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wxh0 wxh0Var) {
        this.f200609i = wxh0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m216442d(String str) {
        this.f200603c.setText(str);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f200611k)) {
            this.f200611k.m97931k();
        }
        if (NullChecker.m81303a(this.f200604d)) {
            this.f200604d.removeAllViews();
            ((ViewGroup) this.f200604d.getParent()).removeView(this.f200604d);
            this.f200604d.setTag(null);
            this.f200604d.clearHistory();
            this.f200604d.destroy();
            this.f200604d = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m216443e(int i) {
        this.f200603c.setTextSize(i);
    }

    /* JADX INFO: renamed from: f */
    public w9j<String, Boolean> m216444f() {
        return new w9j() { // from class: l.xxh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194865a.m216446k((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public sw3.InterfaceC20043a m216445i() {
        return new C21568a();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m216440b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m216446k(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f200604d.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: l */
    public void m216447l() {
        this.f200606f.setVisibility(0);
        this.f200605e.setVisibility(8);
        lsi0.m151584n(R$string.f27257P1);
    }

    /* JADX INFO: renamed from: m */
    public void m216448m(AuthData authData) {
        aoq aoqVar = new aoq((PutongAct) act(), authData.accessToken, this.f200604d);
        this.f200611k = aoqVar;
        this.f200604d.addJavascriptInterface(aoqVar, "tantan");
        HashMap map = new HashMap();
        if (jkp0.m141904d(this.f200609i.m205997m0())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f200604d.setOverScrollMode(2);
        this.f200604d.loadUrl(this.f200609i.m205997m0(), map);
    }

    /* JADX INFO: renamed from: r */
    public void m216449r() {
        this.f200610j.setTitle(R$string.f27459ga);
        this.f200602b.setText(String.format("%s (%s)", act().getString(R$string.f27334W1), act().getString(l7n.m148817e())));
        m216439j();
    }

    /* JADX INFO: renamed from: l.yxh0$a */
    public class C21568a implements sw3.InterfaceC20043a {
        public C21568a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            yxh0.this.f200606f.setVisibility(8);
            yxh0.this.f200605e.setVisibility(8);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            yxh0.this.f200606f.setVisibility(0);
            yxh0.this.f200605e.setVisibility(8);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }
    }
}
