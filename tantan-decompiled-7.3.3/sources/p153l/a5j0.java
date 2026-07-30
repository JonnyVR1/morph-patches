package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class a5j0 implements iam<z4j0> {

    /* JADX INFO: renamed from: a */
    public VLinear f68614a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f68615b;

    /* JADX INFO: renamed from: c */
    public VText f68616c;

    /* JADX INFO: renamed from: d */
    public MKWebView f68617d;

    /* JADX INFO: renamed from: e */
    public z4j0 f68618e;

    /* JADX INFO: renamed from: f */
    public final TopItemWebFrag f68619f;

    /* JADX INFO: renamed from: g */
    public MKWebViewFrag f68620g;

    /* JADX INFO: renamed from: l.a5j0$a */
    public class ViewOnClickListenerC15657a implements View.OnClickListener {
        public ViewOnClickListenerC15657a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a5j0.this.f68620g.m45094S4("newOneOutOfFourSkipButton");
            v4j0.m199711i(true);
        }
    }

    public a5j0(TopItemWebFrag topItemWebFrag) {
        this.f68619f = topItemWebFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f68619f.act();
    }

    /* JADX INFO: renamed from: a */
    public View m96229a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b5j0.m102617b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z4j0 z4j0Var) {
        this.f68618e = z4j0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m96232d() {
        if (NullChecker.m82486a(this.f68620g) && NullChecker.m82486a(this.f68620g.f28838A)) {
            this.f68620g.f28838A.reload();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m96229a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m96233r() {
        bnl0.m105556g0(this.f68614a);
        AbstractC0428k abstractC0428kM2568m = this.f68619f.getChildFragmentManager().m2568m();
        this.f68620g = new MKWebViewFrag();
        Bundle bundle = new Bundle();
        String str = gra.m131689h0().url;
        if (TextUtils.isEmpty(str)) {
            str = "http://";
        }
        bundle.putString("url", str);
        this.f68620g.setArguments(bundle);
        abstractC0428kM2568m.m2813t(adc0.f70665yf, this.f68620g, "TopItemWebFrag");
        abstractC0428kM2568m.mo2709j();
        if (!jyb.m147479J(gra.m131689h0().rightItems) && !v4j0.m199706d()) {
            this.f68616c.setTypeface(lyh0.m156283c(3), 1);
            this.f68616c.setText(gra.m131689h0().rightItems.get(0));
        }
        bnl0.m105509E0(this.f68616c, new ViewOnClickListenerC15657a());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
