package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import l.qib0;
import l.s7m;
import l.tpd0;
import v.VDraweeView;
import v.VLinear;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b570 implements s7m<u470>, SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f5931a;

    /* JADX INFO: renamed from: b */
    public VText f5932b;

    /* JADX INFO: renamed from: c */
    public SwipeRefreshLayout f5933c;

    /* JADX INFO: renamed from: d */
    public VList f5934d;

    /* JADX INFO: renamed from: e */
    public VLinear f5935e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5936f;

    /* JADX INFO: renamed from: g */
    public VText f5937g;

    /* JADX INFO: renamed from: h */
    public u470 f5938h;

    /* JADX INFO: renamed from: i */
    public final PutongAct f5939i;

    /* JADX INFO: renamed from: j */
    public View f5940j;

    /* JADX INFO: renamed from: k */
    public View f5941k;

    /* JADX INFO: renamed from: l */
    public v370 f5942l;

    /* JADX INFO: renamed from: m */
    public int f5943m;

    public b570(PutongAct putongAct) {
        this.f5939i = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8632C0() {
        return this.f5939i;
    }

    /* JADX INFO: renamed from: a */
    public View m8633a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c570.m9102b(this, layoutInflater, viewGroup);
    }

    public Act act() {
        return this.f5939i;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m8637i1(u470 u470Var) {
        this.f5938h = u470Var;
    }

    /* JADX INFO: renamed from: c */
    public void m8635c(List<User> list) {
        if (list == null || list.size() <= 0) {
            this.f5933c.setVisibility(8);
            this.f5935e.setVisibility(0);
            if (this.f5943m == 0) {
                qib0.G.Y0(this.f5936f, f3c0.f7789e1);
                this.f5937g.setText(R$string.f389L0);
            }
            if (this.f5943m == 1) {
                qib0.G.Y0(this.f5936f, f3c0.f7707T0);
                this.f5937g.setText("你还没有粉丝");
            }
        }
        this.f5942l.m15286t(list);
        this.f5942l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m8636d(boolean z) {
        this.f5933c.setRefreshing(z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8633a = m8633a(layoutInflater, viewGroup);
        this.f5931a.setLeftIconAsBack(act());
        viewM8633a.setBackgroundColor(this.f5939i.getResources().getColor(e1c0.f7159p0));
        View viewInflate = act().inflater().inflate(o6c0.f11316u4, (ViewGroup) null, false);
        this.f5941k = viewInflate;
        viewInflate.setBackgroundColor(this.f5939i.getResources().getColor(e1c0.f7121T));
        View viewInflate2 = act().inflater().inflate(o6c0.f11347z0, (ViewGroup) null, false);
        this.f5940j = viewInflate2;
        viewInflate2.setBackgroundColor(this.f5939i.getResources().getColor(e1c0.f7121T));
        return viewM8633a;
    }

    /* JADX INFO: renamed from: q */
    public void m8638q() {
        this.f5938h.m14763W0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.ListAdapter, l.v370] */
    /* JADX INFO: renamed from: r */
    public void m8639r() {
        this.f5931a.setLeftIconAsBack(act());
        PutongAct putongAct = this.f5939i;
        u470 u470Var = this.f5938h;
        ?? v370Var = new v370(putongAct, u470Var.f13533c, u470Var);
        this.f5942l = v370Var;
        this.f5934d.setAdapter((ListAdapter) v370Var);
        this.f5933c.setRefreshing(true);
        this.f5933c.setOnRefreshListener(this);
        this.f5933c.setColorSchemeResources(new int[]{e1c0.f7149k0, e1c0.f7143h0, e1c0.f7145i0, e1c0.f7147j0});
        if ("fans".equals(this.f5938h.f13533c) || "activities_fans".equals(this.f5938h.f13533c)) {
            if ("activities_fans".equals(this.f5938h.f13533c)) {
                this.f5931a.setTitle("关注我的人");
                this.f5943m = 0;
            } else {
                this.f5943m = 1;
                this.f5931a.setTitle(R$string.f526g5);
            }
            this.f5932b.setText(R$string.f397M2);
            tpd0 tpd0Var = FeedModule.f316d.f14970c0;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            int iIntValue = ((Integer) FeedModule.f316d.f14970c0.get()).intValue();
            VText vText = this.f5932b;
            if (iIntValue <= 3) {
                vText.setVisibility(0);
            } else {
                vText.setVisibility(8);
            }
            this.f5938h.m14767a1();
        } else {
            this.f5943m = 0;
            this.f5931a.setTitle(R$string.f533h5);
            this.f5932b.setText(R$string.f379J2);
            tpd0 tpd0Var2 = FeedModule.f316d.f14972d0;
            tpd0Var2.put(Integer.valueOf(((Integer) tpd0Var2.get()).intValue() + 1));
            int iIntValue2 = ((Integer) FeedModule.f316d.f14972d0.get()).intValue();
            VText vText2 = this.f5932b;
            if (iIntValue2 <= 3) {
                vText2.setVisibility(0);
            } else {
                vText2.setVisibility(8);
            }
        }
        if (nkg.m12213K()) {
            this.f5932b.setVisibility(8);
        }
    }

    public void destroy() {
    }
}
