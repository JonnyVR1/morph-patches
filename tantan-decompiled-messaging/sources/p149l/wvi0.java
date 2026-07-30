package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wvi0 implements s7m<vvi0> {

    /* JADX INFO: renamed from: a */
    public VLinear f188254a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f188255b;

    /* JADX INFO: renamed from: c */
    public VText f188256c;

    /* JADX INFO: renamed from: d */
    public MKWebView f188257d;

    /* JADX INFO: renamed from: e */
    public vvi0 f188258e;

    /* JADX INFO: renamed from: f */
    public final TopItemWebFrag f188259f;

    /* JADX INFO: renamed from: g */
    public MKWebViewFrag f188260g;

    /* JADX INFO: renamed from: l.wvi0$a */
    public class ViewOnClickListenerC20974a implements View.OnClickListener {
        public ViewOnClickListenerC20974a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wvi0.this.f188260g.m43908S4("newOneOutOfFourSkipButton");
            rvi0.m181298i(true);
        }
    }

    public wvi0(TopItemWebFrag topItemWebFrag) {
        this.f188259f = topItemWebFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188259f.act();
    }

    /* JADX INFO: renamed from: a */
    public View m205742a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xvi0.m211294b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vvi0 vvi0Var) {
        this.f188258e = vvi0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m205745d() {
        if (NullChecker.m81303a(this.f188260g) && NullChecker.m81303a(this.f188260g.f27990A)) {
            this.f188260g.f27990A.reload();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m205742a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m205746r() {
        xdl0.m208376g0(this.f188254a);
        AbstractC0427k abstractC0427kM2567m = this.f188259f.getChildFragmentManager().m2567m();
        this.f188260g = new MKWebViewFrag();
        Bundle bundle = new Bundle();
        String str = upa.m194758h0().url;
        if (TextUtils.isEmpty(str)) {
            str = "http://";
        }
        bundle.putString("url", str);
        this.f188260g.setArguments(bundle);
        abstractC0427kM2567m.m2812t(u4c0.f174523vf, this.f188260g, "TopItemWebFrag");
        abstractC0427kM2567m.mo2708j();
        if (!vwb.m200296J(upa.m194758h0().rightItems) && !rvi0.m181293d()) {
            this.f188256c.setTypeface(eqh0.m117752c(3), 1);
            this.f188256c.setText(upa.m194758h0().rightItems.get(0));
        }
        xdl0.m208329E0(this.f188256c, new ViewOnClickListenerC20974a());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
