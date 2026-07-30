package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class b570 implements s7m<u470>, SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f73444a;

    /* JADX INFO: renamed from: b */
    public VText f73445b;

    /* JADX INFO: renamed from: c */
    public SwipeRefreshLayout f73446c;

    /* JADX INFO: renamed from: d */
    public VList f73447d;

    /* JADX INFO: renamed from: e */
    public VLinear f73448e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f73449f;

    /* JADX INFO: renamed from: g */
    public VText f73450g;

    /* JADX INFO: renamed from: h */
    public u470 f73451h;

    /* JADX INFO: renamed from: i */
    public final PutongAct f73452i;

    /* JADX INFO: renamed from: j */
    public View f73453j;

    /* JADX INFO: renamed from: k */
    public View f73454k;

    /* JADX INFO: renamed from: l */
    public v370 f73455l;

    /* JADX INFO: renamed from: m */
    public int f73456m;

    public b570(PutongAct putongAct) {
        this.f73452i = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f73452i;
    }

    /* JADX INFO: renamed from: a */
    public View m100306a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c570.m105279b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f73452i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u470 u470Var) {
        this.f73451h = u470Var;
    }

    /* JADX INFO: renamed from: c */
    public void m100308c(List<User> list) {
        if (list == null || list.size() <= 0) {
            this.f73446c.setVisibility(8);
            this.f73448e.setVisibility(0);
            if (this.f73456m == 0) {
                qib0.f154691G.m102354Y0(this.f73449f, f3c0.f94506e1);
                this.f73450g.setText(R$string.f38928L0);
            }
            if (this.f73456m == 1) {
                qib0.f154691G.m102354Y0(this.f73449f, f3c0.f94424T0);
                this.f73450g.setText("你还没有粉丝");
            }
        }
        this.f73455l.m196833t(list);
        this.f73455l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m100309d(boolean z) {
        this.f73446c.setRefreshing(z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM100306a = m100306a(layoutInflater, viewGroup);
        this.f73444a.setLeftIconAsBack(getAct());
        viewM100306a.setBackgroundColor(this.f73452i.getResources().getColor(e1c0.f88803p0));
        View viewInflate = getAct().inflater().inflate(o6c0.f142297u4, (ViewGroup) null, false);
        this.f73454k = viewInflate;
        viewInflate.setBackgroundColor(this.f73452i.getResources().getColor(e1c0.f88765T));
        View viewInflate2 = getAct().inflater().inflate(o6c0.f142328z0, (ViewGroup) null, false);
        this.f73453j = viewInflate2;
        viewInflate2.setBackgroundColor(this.f73452i.getResources().getColor(e1c0.f88765T));
        return viewM100306a;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        this.f73451h.m191715W0();
    }

    /* JADX INFO: renamed from: r */
    public void m100310r() {
        this.f73444a.setLeftIconAsBack(getAct());
        PutongAct putongAct = this.f73452i;
        u470 u470Var = this.f73451h;
        v370 v370Var = new v370(putongAct, u470Var.f173703c, u470Var);
        this.f73455l = v370Var;
        this.f73447d.setAdapter((ListAdapter) v370Var);
        this.f73446c.setRefreshing(true);
        this.f73446c.setOnRefreshListener(this);
        this.f73446c.setColorSchemeResources(e1c0.f88793k0, e1c0.f88787h0, e1c0.f88789i0, e1c0.f88791j0);
        if ("fans".equals(this.f73451h.f173703c) || "activities_fans".equals(this.f73451h.f173703c)) {
            if ("activities_fans".equals(this.f73451h.f173703c)) {
                this.f73444a.setTitle("关注我的人");
                this.f73456m = 0;
            } else {
                this.f73456m = 1;
                this.f73444a.setTitle(R$string.f39065g5);
            }
            this.f73445b.setText(R$string.f38936M2);
            tpd0 tpd0Var = FeedModule.f38855d.f193035c0;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            int iIntValue = FeedModule.f38855d.f193035c0.get().intValue();
            VText vText = this.f73445b;
            if (iIntValue <= 3) {
                vText.setVisibility(0);
            } else {
                vText.setVisibility(8);
            }
            this.f73451h.m191718a1();
        } else {
            this.f73456m = 0;
            this.f73444a.setTitle(R$string.f39072h5);
            this.f73445b.setText(R$string.f38918J2);
            tpd0 tpd0Var2 = FeedModule.f38855d.f193037d0;
            tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
            int iIntValue2 = FeedModule.f38855d.f193037d0.get().intValue();
            VText vText2 = this.f73445b;
            if (iIntValue2 <= 3) {
                vText2.setVisibility(0);
            } else {
                vText2.setVisibility(8);
            }
        }
        if (nkg.m159854K()) {
            this.f73445b.setVisibility(8);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
