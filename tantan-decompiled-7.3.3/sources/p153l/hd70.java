package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class hd70 implements iam<ad70>, SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f108791a;

    /* JADX INFO: renamed from: b */
    public VText f108792b;

    /* JADX INFO: renamed from: c */
    public SwipeRefreshLayout f108793c;

    /* JADX INFO: renamed from: d */
    public VList f108794d;

    /* JADX INFO: renamed from: e */
    public VLinear f108795e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f108796f;

    /* JADX INFO: renamed from: g */
    public VText f108797g;

    /* JADX INFO: renamed from: h */
    public ad70 f108798h;

    /* JADX INFO: renamed from: i */
    public final PutongAct f108799i;

    /* JADX INFO: renamed from: j */
    public View f108800j;

    /* JADX INFO: renamed from: k */
    public View f108801k;

    /* JADX INFO: renamed from: l */
    public bc70 f108802l;

    /* JADX INFO: renamed from: m */
    public int f108803m;

    public hd70(PutongAct putongAct) {
        this.f108799i = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f108799i;
    }

    /* JADX INFO: renamed from: a */
    public View m134570a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return id70.m139510b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f108799i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ad70 ad70Var) {
        this.f108798h = ad70Var;
    }

    /* JADX INFO: renamed from: c */
    public void m134572c(List<User> list) {
        if (list == null || list.size() <= 0) {
            this.f108793c.setVisibility(8);
            this.f108795e.setVisibility(0);
            if (this.f108803m == 0) {
                uqb0.f180374G.m127138Y0(this.f108796f, lbc0.f131024e1);
                this.f108797g.setText(R$string.f39776L0);
            }
            if (this.f108803m == 1) {
                uqb0.f180374G.m127138Y0(this.f108796f, lbc0.f130942T0);
                this.f108797g.setText("你还没有粉丝");
            }
        }
        this.f108802l.m103493t(list);
        this.f108802l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m134573d(boolean z) {
        this.f108793c.setRefreshing(z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM134570a = m134570a(layoutInflater, viewGroup);
        this.f108791a.setLeftIconAsBack(getAct());
        viewM134570a.setBackgroundColor(this.f108799i.getResources().getColor(k9c0.f124526p0));
        View viewInflate = getAct().inflater().inflate(tec0.f173766u4, (ViewGroup) null, false);
        this.f108801k = viewInflate;
        viewInflate.setBackgroundColor(this.f108799i.getResources().getColor(k9c0.f124488T));
        View viewInflate2 = getAct().inflater().inflate(tec0.f173797z0, (ViewGroup) null, false);
        this.f108800j = viewInflate2;
        viewInflate2.setBackgroundColor(this.f108799i.getResources().getColor(k9c0.f124488T));
        return viewM134570a;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        this.f108798h.m97058W0();
    }

    /* JADX INFO: renamed from: r */
    public void m134574r() {
        this.f108791a.setLeftIconAsBack(getAct());
        PutongAct putongAct = this.f108799i;
        ad70 ad70Var = this.f108798h;
        bc70 bc70Var = new bc70(putongAct, ad70Var.f69794c, ad70Var);
        this.f108802l = bc70Var;
        this.f108794d.setAdapter((ListAdapter) bc70Var);
        this.f108793c.setRefreshing(true);
        this.f108793c.setOnRefreshListener(this);
        this.f108793c.setColorSchemeResources(k9c0.f124516k0, k9c0.f124510h0, k9c0.f124512i0, k9c0.f124514j0);
        if ("fans".equals(this.f108798h.f69794c) || "activities_fans".equals(this.f108798h.f69794c)) {
            if ("activities_fans".equals(this.f108798h.f69794c)) {
                this.f108791a.setTitle("关注我的人");
                this.f108803m = 0;
            } else {
                this.f108803m = 1;
                this.f108791a.setTitle(R$string.f39913g5);
            }
            this.f108792b.setText(R$string.f39784M2);
            vxd0 vxd0Var = FeedModule.f39703d.f121345c0;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            int iIntValue = FeedModule.f39703d.f121345c0.get().intValue();
            VText vText = this.f108792b;
            if (iIntValue <= 3) {
                vText.setVisibility(0);
            } else {
                vText.setVisibility(8);
            }
            this.f108798h.m97061a1();
        } else {
            this.f108803m = 0;
            this.f108791a.setTitle(R$string.f39920h5);
            this.f108792b.setText(R$string.f39766J2);
            vxd0 vxd0Var2 = FeedModule.f39703d.f121347d0;
            vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
            int iIntValue2 = FeedModule.f39703d.f121347d0.get().intValue();
            VText vText2 = this.f108792b;
            if (iIntValue2 <= 3) {
                vText2.setVisibility(0);
            } else {
                vText2.setVisibility(8);
            }
        }
        if (cmg.m111183K()) {
            this.f108792b.setVisibility(8);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
