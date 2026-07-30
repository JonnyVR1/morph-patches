package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.svip.guide.SvipIntlHeaderView;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.NavigationIntent;
import l.amd0;
import l.jxk;
import l.k6c0;
import l.s7m;
import l.vtd;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zld0 implements s7m<wld0> {

    /* JADX INFO: renamed from: a */
    public VImage f28807a;

    /* JADX INFO: renamed from: b */
    public VText f28808b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f28809c;

    /* JADX INFO: renamed from: d */
    public TextView f28810d;

    /* JADX INFO: renamed from: e */
    public VText f28811e;

    /* JADX INFO: renamed from: f */
    public final PutongAct f28812f;

    /* JADX INFO: renamed from: g */
    public wld0 f28813g;

    /* JADX INFO: renamed from: h */
    public jxk f28814h;

    public zld0(PutongAct putongAct) {
        this.f28812f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m28721e(View view) {
        zvf0.r("e_intl_svip_introduction_skip", this.f28812f.pageId());
        uld0.m25255e().m25268q();
        act().startActivity(qib0.f19804b0.f17707b.toNewMainAct(act(), (NavigationIntent) null));
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m28722f(View view) {
        zvf0.r("e_intl_svip_introduction_learn_more", this.f28812f.pageId());
        uld0.m25255e().m25268q();
        CoreModule.m1854P().m11706a().m5256Fe(act());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28723C0() {
        return this.f28812f;
    }

    /* JADX INFO: renamed from: c */
    public View m28724c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return amd0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m28726i1(wld0 wld0Var) {
        this.f28813g = wld0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m28724c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m28727r() {
        this.f28812f.setTransparentStatusBar();
        this.f28812f.setSwipeBackEnable(false);
        this.f28809c.setLayoutManager(new LinearLayoutManager(this.f28812f));
        c6h0 c6h0Var = new c6h0(this.f28812f);
        this.f28814h = new jxk(c6h0Var);
        this.f28814h.H((SvipIntlHeaderView) act().inflater().inflate(k6c0.K1, (ViewGroup) this.f28809c, false));
        LinearLayout linearLayout = new LinearLayout(this.f28812f);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, vtd.a(this.f28812f, 40.0f)));
        this.f28814h.F(linearLayout);
        this.f28809c.setAdapter(this.f28814h);
        xdl0.E0(this.f28810d, new View.OnClickListener() { // from class: l.xld0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27585a.m28721e(view);
            }
        });
        xdl0.E0(this.f28811e, new View.OnClickListener() { // from class: l.yld0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28290a.m28722f(view);
            }
        });
        c6h0Var.m13245G(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null));
    }

    public void destroy() {
    }
}
