package p149l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.p053ui.citytop.C8299a;
import com.p046p1.mobile.putong.core.p053ui.citytop.CityTopLikersAct;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class d75 implements s7m<C8299a> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f84692a;

    /* JADX INFO: renamed from: b */
    public VFrame f84693b;

    /* JADX INFO: renamed from: c */
    public VFrame f84694c;

    /* JADX INFO: renamed from: d */
    public VLinear f84695d;

    /* JADX INFO: renamed from: e */
    public VImage f84696e;

    /* JADX INFO: renamed from: f */
    public VText f84697f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f84698g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f84699h;

    /* JADX INFO: renamed from: i */
    public C8299a f84700i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f84701j;

    /* JADX INFO: renamed from: k */
    public CityTopLikersAct f84702k;

    /* JADX INFO: renamed from: l.d75$a */
    public class C16309a extends GridLayoutManager.AbstractC0553c {
        public C16309a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return 1;
        }
    }

    public d75(CityTopLikersAct cityTopLikersAct) {
        this.f84702k = cityTopLikersAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84702k;
    }

    /* JADX INFO: renamed from: a */
    public View m110218a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e75.m115180b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8299a c8299a) {
        this.f84700i = c8299a;
    }

    /* JADX INFO: renamed from: c */
    public void m110220c(boolean z, boolean z2) {
        if (z) {
            this.f84694c.setVisibility(0);
            this.f84695d.setVisibility(4);
            this.f84698g.setVisibility(0);
            this.f84699h.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f84694c;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f84695d.setVisibility(4);
            this.f84698g.setVisibility(4);
            this.f84699h.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f84695d.setVisibility(0);
        this.f84698g.setVisibility(4);
        this.f84699h.setVisibility(4);
        this.f84697f.setText("暂无新请求");
    }

    /* JADX INFO: renamed from: d */
    public void m110221d() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        this.f84701j = gridLayoutManager;
        gridLayoutManager.m3326v(new C16309a());
        this.f84699h.setLayoutManager(this.f84701j);
        this.f84699h.setAdapter(this.f84702k.m44585Z1());
        new C0605k(this.f84700i.m44600m0()).m3750g(this.f84699h);
        this.f84692a.setLeftIconAsBack(act());
        this.f84692a.setLeftIconResource(b3c0.f73010b);
    }

    /* JADX INFO: renamed from: e */
    public void m110222e(q860<Greeting> q860Var) {
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        if (iM173344d > 0) {
            m110223f(String.format("城市封面好友申请（%s）", iM173344d > 99 ? "99+" : String.valueOf(iM173344d)));
        } else {
            m110223f("城市封面好友申请");
        }
        if (q860Var == null) {
            m110220c(true, false);
        } else {
            this.f84702k.m44585Z1().m148518V(q860Var.f153135a, q860Var.f153136b.links);
            m110220c(false, iM173344d == 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m110223f(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) "  ");
        this.f84692a.setTitle(spannableStringBuilder);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m110218a(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
