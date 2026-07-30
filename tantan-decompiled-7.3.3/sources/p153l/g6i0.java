package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes12.dex */
public class g6i0 implements iam<e6i0> {

    /* JADX INFO: renamed from: a */
    public CardView f102441a;

    /* JADX INFO: renamed from: b */
    public VText f102442b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f102443c;

    /* JADX INFO: renamed from: d */
    public WebViewX f102444d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f102445e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f102446f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f102447g;

    /* JADX INFO: renamed from: h */
    public ImageView f102448h;

    /* JADX INFO: renamed from: i */
    public e6i0 f102449i;

    /* JADX INFO: renamed from: j */
    public Act f102450j;

    /* JADX INFO: renamed from: k */
    public zpq f102451k;

    public g6i0(Act act) {
        this.f102450j = act;
    }

    /* JADX INFO: renamed from: j */
    private void m129254j() {
        rx3 rx3Var = new rx3(act(), m129259f(), false);
        rx3Var.setListener(m129260i());
        this.f102444d.setWebViewClientX(rx3Var);
        this.f102444d.setWebChromeClientX(new wqp0());
        this.f102449i.m119596s0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f102450j;
    }

    /* JADX INFO: renamed from: b */
    public View m129255b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h6i0.m133709b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(e6i0 e6i0Var) {
        this.f102449i = e6i0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m129257d(String str) {
        this.f102443c.setText(str);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f102451k)) {
            this.f102451k.m220926k();
        }
        if (NullChecker.m82486a(this.f102444d)) {
            this.f102444d.removeAllViews();
            ((ViewGroup) this.f102444d.getParent()).removeView(this.f102444d);
            this.f102444d.setTag(null);
            this.f102444d.clearHistory();
            this.f102444d.destroy();
            this.f102444d = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m129258e(int i) {
        this.f102443c.setTextSize(i);
    }

    /* JADX INFO: renamed from: f */
    public qcj<String, Boolean> m129259f() {
        return new qcj() { // from class: l.f6i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97403a.m129261k((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public rx3.InterfaceC19928a m129260i() {
        return new C17171a();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m129255b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m129261k(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f102444d.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: l */
    public void m129262l() {
        this.f102446f.setVisibility(0);
        this.f102445e.setVisibility(8);
        o1j0.m165640n(R$string.f28105P1);
    }

    /* JADX INFO: renamed from: m */
    public void m129263m(AuthData authData) {
        zpq zpqVar = new zpq((PutongAct) act(), authData.accessToken, this.f102444d);
        this.f102451k = zpqVar;
        this.f102444d.addJavascriptInterface(zpqVar, "tantan");
        HashMap map = new HashMap();
        if (ntp0.m164746d(this.f102449i.m119593m0())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f102444d.setOverScrollMode(2);
        this.f102444d.loadUrl(this.f102449i.m119593m0(), map);
    }

    /* JADX INFO: renamed from: r */
    public void m129264r() {
        this.f102450j.setTitle(R$string.f28307ga);
        this.f102442b.setText(String.format("%s (%s)", act().getString(R$string.f28182W1), act().getString(l9n.m153440e())));
        m129254j();
    }

    /* JADX INFO: renamed from: l.g6i0$a */
    public class C17171a implements rx3.InterfaceC19928a {
        public C17171a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            g6i0.this.f102446f.setVisibility(8);
            g6i0.this.f102445e.setVisibility(8);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            g6i0.this.f102446f.setVisibility(0);
            g6i0.this.f102445e.setVisibility(8);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }
    }
}
