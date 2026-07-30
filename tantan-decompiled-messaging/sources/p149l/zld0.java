package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.svip.guide.SvipIntlHeaderView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zld0 implements s7m<wld0> {

    /* JADX INFO: renamed from: a */
    public VImage f203619a;

    /* JADX INFO: renamed from: b */
    public VText f203620b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f203621c;

    /* JADX INFO: renamed from: d */
    public TextView f203622d;

    /* JADX INFO: renamed from: e */
    public VText f203623e;

    /* JADX INFO: renamed from: f */
    public final PutongAct f203624f;

    /* JADX INFO: renamed from: g */
    public wld0 f203625g;

    /* JADX INFO: renamed from: h */
    public jxk f203626h;

    public zld0(PutongAct putongAct) {
        this.f203624f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m219277e(View view) {
        zvf0.m220396r("e_intl_svip_introduction_skip", this.f203624f.pageId());
        uld0.m194220e().m194233q();
        act().startActivity(qib0.f154713b0.f139231b.toNewMainAct(act(), null));
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m219278f(View view) {
        zvf0.m220396r("e_intl_svip_introduction_learn_more", this.f203624f.pageId());
        uld0.m194220e().m194233q();
        CoreModule.m29935P().m94651a().mo33319Fe(act());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203624f;
    }

    /* JADX INFO: renamed from: c */
    public View m219279c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return amd0.m97534b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wld0 wld0Var) {
        this.f203625g = wld0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219279c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m219281r() {
        this.f203624f.setTransparentStatusBar();
        this.f203624f.setSwipeBackEnable(false);
        this.f203621c.setLayoutManager(new LinearLayoutManager(this.f203624f));
        c6h0 c6h0Var = new c6h0(this.f203624f);
        this.f203626h = new jxk(c6h0Var);
        this.f203626h.m143815H((SvipIntlHeaderView) act().inflater().inflate(k6c0.f121311K1, (ViewGroup) this.f203621c, false));
        LinearLayout linearLayout = new LinearLayout(this.f203624f);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, vtd.m199996a(this.f203624f, 40.0f)));
        this.f203626h.m143813F(linearLayout);
        this.f203621c.setAdapter(this.f203626h);
        xdl0.m208329E0(this.f203622d, new View.OnClickListener() { // from class: l.xld0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193407a.m219277e(view);
            }
        });
        xdl0.m208329E0(this.f203623e, new View.OnClickListener() { // from class: l.yld0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198876a.m219278f(view);
            }
        });
        c6h0Var.m105430G(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
