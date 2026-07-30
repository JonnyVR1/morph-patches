package p153l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.p058ui.citytop.C8462a;
import com.p051p1.mobile.putong.core.p058ui.citytop.CityTopLikersAct;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class e85 implements iam<C8462a> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f92509a;

    /* JADX INFO: renamed from: b */
    public VFrame f92510b;

    /* JADX INFO: renamed from: c */
    public VFrame f92511c;

    /* JADX INFO: renamed from: d */
    public VLinear f92512d;

    /* JADX INFO: renamed from: e */
    public VImage f92513e;

    /* JADX INFO: renamed from: f */
    public VText f92514f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f92515g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f92516h;

    /* JADX INFO: renamed from: i */
    public C8462a f92517i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f92518j;

    /* JADX INFO: renamed from: k */
    public CityTopLikersAct f92519k;

    /* JADX INFO: renamed from: l.e85$a */
    public class C16729a extends GridLayoutManager.AbstractC0554c {
        public C16729a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return 1;
        }
    }

    public e85(CityTopLikersAct cityTopLikersAct) {
        this.f92519k = cityTopLikersAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92519k;
    }

    /* JADX INFO: renamed from: a */
    public View m119799a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f85.m124514b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8462a c8462a) {
        this.f92517i = c8462a;
    }

    /* JADX INFO: renamed from: c */
    public void m119801c(boolean z, boolean z2) {
        if (z) {
            this.f92511c.setVisibility(0);
            this.f92512d.setVisibility(4);
            this.f92515g.setVisibility(0);
            this.f92516h.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f92511c;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f92512d.setVisibility(4);
            this.f92515g.setVisibility(4);
            this.f92516h.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f92512d.setVisibility(0);
        this.f92515g.setVisibility(4);
        this.f92516h.setVisibility(4);
        this.f92514f.setText("暂无新请求");
    }

    /* JADX INFO: renamed from: d */
    public void m119802d() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        this.f92518j = gridLayoutManager;
        gridLayoutManager.m3327v(new C16729a());
        this.f92516h.setLayoutManager(this.f92518j);
        this.f92516h.setAdapter(this.f92519k.m45768a2());
        new C0607k(this.f92517i.m45783m0()).m3751g(this.f92516h);
        this.f92509a.setLeftIconAsBack(act());
        this.f92509a.setLeftIconResource(gbc0.f103261b);
    }

    /* JADX INFO: renamed from: e */
    public void m119803e(vg60<Greeting> vg60Var) {
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        if (iM201222d > 0) {
            m119804f(String.format("城市封面好友申请（%s）", iM201222d > 99 ? "99+" : String.valueOf(iM201222d)));
        } else {
            m119804f("城市封面好友申请");
        }
        if (vg60Var == null) {
            m119801c(true, false);
        } else {
            this.f92519k.m45768a2().m157190V(vg60Var.f184001a, vg60Var.f184002b.links);
            m119801c(false, iM201222d == 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m119804f(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) "  ");
        this.f92509a.setTitle(spannableStringBuilder);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119799a(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
