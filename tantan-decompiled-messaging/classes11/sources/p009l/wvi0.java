package p009l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.MKWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.eqh0;
import l.s7m;
import l.u4c0;
import l.upa;
import l.vwb;
import l.xdl0;
import l.xvi0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wvi0 implements s7m<vvi0> {

    /* JADX INFO: renamed from: a */
    public VLinear f22337a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f22338b;

    /* JADX INFO: renamed from: c */
    public VText f22339c;

    /* JADX INFO: renamed from: d */
    public MKWebView f22340d;

    /* JADX INFO: renamed from: e */
    public vvi0 f22341e;

    /* JADX INFO: renamed from: f */
    public final TopItemWebFrag f22342f;

    /* JADX INFO: renamed from: g */
    public MKWebViewFrag f22343g;

    /* JADX INFO: renamed from: l.wvi0$a */
    public class ViewOnClickListenerC1294a implements View.OnClickListener {
        public ViewOnClickListenerC1294a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wvi0.this.f22343g.S4("newOneOutOfFourSkipButton");
            rvi0.m21828i(true);
        }
    }

    public wvi0(TopItemWebFrag topItemWebFrag) {
        this.f22342f = topItemWebFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24574C0() {
        return this.f22342f.act();
    }

    /* JADX INFO: renamed from: a */
    public View m24575a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xvi0.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) m24574C0();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m24579i1(vvi0 vvi0Var) {
        this.f22341e = vvi0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m24578d() {
        if (NullChecker.a(this.f22343g) && NullChecker.a(this.f22343g.A)) {
            this.f22343g.A.reload();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24575a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m24580r() {
        xdl0.g0(new View[]{this.f22337a});
        k kVarM = this.f22342f.getChildFragmentManager().m();
        this.f22343g = new MKWebViewFrag();
        Bundle bundle = new Bundle();
        String str = upa.h0().url;
        if (TextUtils.isEmpty(str)) {
            str = "http://";
        }
        bundle.putString("url", str);
        this.f22343g.setArguments(bundle);
        kVarM.t(u4c0.vf, this.f22343g, "TopItemWebFrag");
        kVarM.j();
        if (!vwb.J(upa.h0().rightItems) && !rvi0.m21823d()) {
            this.f22339c.setTypeface(eqh0.c(3), 1);
            this.f22339c.setText((CharSequence) upa.h0().rightItems.get(0));
        }
        xdl0.E0(this.f22339c, new ViewOnClickListenerC1294a());
    }

    public void destroy() {
    }
}
