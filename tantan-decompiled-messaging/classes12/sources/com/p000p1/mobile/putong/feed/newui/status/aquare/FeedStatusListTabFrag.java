package com.p000p1.mobile.putong.feed.newui.status.aquare;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.AbstractC2399j7;
import p007l.a1i;
import p007l.d1i;
import p007l.d3i;
import p007l.e3i;
import p007l.f3c0;
import p007l.i1i;
import p007l.jed0;
import p007l.jxh;
import p007l.nkg;
import p007l.o1i;
import p007l.p2i;
import p007l.qxh;
import p007l.uvg;
import p007l.w1i;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStatusListTabFrag extends PutongFrag implements ViewPager.j, a1i.InterfaceC2315a<List<BubbleInfo>> {

    /* JADX INFO: renamed from: A */
    public FeedVDraweeView f4175A;

    /* JADX INFO: renamed from: B */
    public FeedLinearWithExtraIconsView f4176B;

    /* JADX INFO: renamed from: C */
    public TextView f4177C;

    /* JADX INFO: renamed from: D */
    public VPagerWithDefaultSize f4178D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f4179E;

    /* JADX INFO: renamed from: F */
    public RelativeLayout f4180F;

    /* JADX INFO: renamed from: G */
    public ImageView f4181G;

    /* JADX INFO: renamed from: H */
    public TextView f4182H;

    /* JADX INFO: renamed from: I */
    public AbstractC2399j7 f4183I;

    /* JADX INFO: renamed from: J */
    public int f4184J;

    /* JADX INFO: renamed from: K */
    public a1i<List<BubbleInfo>> f4185K;

    /* JADX INFO: renamed from: L */
    public int f4186L = -1;

    /* JADX INFO: renamed from: M */
    public boolean f4187M;

    /* JADX INFO: renamed from: N */
    public d3i f4188N;

    /* JADX INFO: renamed from: O */
    public e3i f4189O;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f4190z;

    /* JADX INFO: renamed from: S4 */
    public static FeedStatusListTabFrag m6598S4(int i, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        FeedStatusListTabFrag feedStatusListTabFrag = new FeedStatusListTabFrag();
        Bundle bundle = new Bundle();
        bundle.putString("stateId", str);
        bundle.putString("userId", str3);
        bundle.putBoolean("needAppendFeed", z);
        bundle.putString("from", str4);
        bundle.putString("next", "");
        bundle.putInt("initialShowIndex", i);
        bundle.putBoolean("stateSquare", z2);
        feedStatusListTabFrag.setArguments(bundle);
        return feedStatusListTabFrag;
    }

    /* JADX INFO: renamed from: T4 */
    private void m6599T4(int i) {
        int iM9605c = this.f4189O.m9605c() - i;
        if (iM9605c <= 0 || iM9605c >= 4) {
            return;
        }
        this.f4185K.next();
    }

    /* JADX INFO: renamed from: X4 */
    private void m6600X4() {
        this.f4184J = getArguments().getInt("initialShowIndex", 0);
        String string = getArguments().getString("stateId");
        String string2 = getArguments().getString("next");
        this.f4187M = getArguments().getBoolean("needAppendFeed", false);
        String string3 = getArguments().getString("userId");
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("where_show_from", "moment"), vwb.Y("source_page", getArguments().getString("from"))});
        if (this.f4187M && !((DbObject) FeedModule.m1140H().me_()).id.equals(string3)) {
            this.f4185K = new o1i(string, string3);
        } else if (getArguments().getBoolean("stateSquare", false)) {
            this.f4185K = new i1i();
        } else if (TextUtils.isEmpty(string)) {
            this.f4185K = new d1i(FeedStatusPageAct.f4209A, string2);
        } else {
            this.f4185K = new w1i(string, string3);
        }
        this.f4185K.mo8397a(this);
        this.f4185K.previous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m6601a5(c cVar) {
        if (cVar == c.l) {
            FeedStateCardView.f4191p = true;
            FeedModule.m1140H().ec();
        } else if (cVar == c.j) {
            m6609W4();
            m6614c5(true);
        } else if (cVar == c.i) {
            m6621j5();
            m6614c5(FeedStateCardView.f4191p);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g5 */
    public static List<BubbleInfo> m6602g5(List<BubbleInfo> list) {
        return vwb.n(list, new w9j() { // from class: l.m2i
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    private void m6603k5() {
        if (((DbObject) FeedModule.m1140H().me_()).id.equals(this.f4189O.m9606d(0).owner.f264id)) {
            act().duringCreated(FeedModule.f316d.m16488K7()).subscribe(mkd0.G(new e30() { // from class: l.o2i
                public final void call(Object obj) {
                    this.f10987a.m6613b5((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m6604Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p2i.m12904b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public final AbstractC2399j7 m6605R4() {
        return null;
    }

    @Override // p007l.a1i.InterfaceC2315a
    /* JADX INFO: renamed from: S0 */
    public void mo6606S0(Throwable th) {
        e3i e3iVar = this.f4189O;
        if (e3iVar == null || e3iVar.m9607e().size() <= 0) {
            this.f4180F.setVisibility(0);
            this.f4181G.setImageResource(f3c0.f7777c5);
            this.f4182H.setText("当前网络不可用");
            m6619h5();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final AbstractC2399j7 m6607U4(e3i e3iVar) {
        return new uvg(e3iVar);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m6608V4() {
        m6610Y4();
        onPageSelected(this.f4184J);
        this.f4183I.mo11133c(this.f4190z);
        this.f4183I.mo11134d(this.f4179E);
    }

    /* JADX INFO: renamed from: W4 */
    public void m6609W4() {
        ((PutongFrag) this).pageHelper.q(pageId());
        ((PutongFrag) this).pageHelper.k();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m6610Y4() {
        d3i d3iVar = new d3i();
        this.f4188N = d3iVar;
        d3iVar.m9303v(new e30() { // from class: l.n2i
            public final void call(Object obj) {
                this.f10632a.m6620i5((FeedStateCardView) obj);
            }
        });
        this.f4188N.m9300s(this.f4189O);
        this.f4178D.setAdapter(this.f4188N);
        this.f4178D.d(this);
        this.f4178D.setCurrentItem(this.f4184J);
        this.f4178D.setPageMargin(t100.d(20.0f));
        this.f4178D.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m6611Z4(e3i e3iVar) {
        jed0 jed0Var = new jed0(e3iVar);
        this.f4183I = jed0Var;
        jed0Var.m11072e(m6607U4(e3iVar)).m11072e(m6622l5(e3iVar)).m11072e(m6605R4());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m6613b5(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(((DbObject) FeedModule.m1140H().me_()).id);
        if (bubbleInfo == null) {
            return;
        }
        this.f4189O.m9607e().clear();
        this.f4189O.m9607e().add(bubbleInfo);
        this.f4188N.m9301t(this.f4189O, true);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m6614c5(boolean z) {
        FeedStateCardView feedStateCardViewM9298q;
        d3i d3iVar = this.f4188N;
        if (d3iVar == null || (feedStateCardViewM9298q = d3iVar.m9298q()) == null) {
            return;
        }
        feedStateCardViewM9298q.m6638N(z, false);
    }

    @Override // p007l.a1i.InterfaceC2315a
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo6612a3(List<BubbleInfo> list) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (this.f4189O == null) {
            this.f4189O = new e3i(act(), new ArrayList(), this.f4184J);
        }
        this.f4189O.m9607e().clear();
        this.f4189O.m9607e().addAll(m6602g5(list));
        d3i d3iVar = this.f4188N;
        if (d3iVar != null) {
            d3iVar.m9300s(this.f4189O);
        } else {
            m6618f5();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m6616e5(int i) {
        if (i == this.f4186L) {
            return;
        }
        BubbleInfo bubbleInfoM9606d = this.f4189O.m9606d(i);
        zvf0.A("e_other_state", "p_other_state", new j760[]{vwb.Y("state_id", bubbleInfoM9606d.f191id), vwb.Y("owner_id", bubbleInfoM9606d.owner.f264id)});
        this.f4186L = i;
    }

    /* JADX INFO: renamed from: f4 */
    public void m6617f4() {
        super.f4();
        duringCreated(lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.l2i
            public final void call(Object obj) {
                this.f9856a.m6601a5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m6618f5() {
        int iM9605c = this.f4189O.m9605c();
        RelativeLayout relativeLayout = this.f4180F;
        if (iM9605c == 0) {
            relativeLayout.setVisibility(0);
            this.f4181G.setImageResource(f3c0.f7769b5);
            this.f4182H.setText("你的好友暂时没有状态");
            m6619h5();
            return;
        }
        relativeLayout.setVisibility(8);
        m6611Z4(this.f4189O);
        m6608V4();
        m6603k5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m6619h5() {
        e3i e3iVar = new e3i(act(), new ArrayList(), 0);
        new uvg(e3iVar).mo11133c(this.f4190z);
        new qxh(e3iVar).mo11133c(this.f4190z);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m6620i5(FeedStateCardView feedStateCardView) {
        this.f4183I.mo11132b(feedStateCardView);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM6604Q4 = m6604Q4(layoutInflater, viewGroup);
        if (!nkg.m12207E() || act().m6708w2()) {
            xdl0.f0(viewM6604Q4, xdl0.F0());
        } else {
            xdl0.M(this.f4190z, false);
            int i = t100.E;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.topMargin = t100.d(6.0f);
            layoutParams.gravity = 1;
            this.f4175A.setLayoutParams(layoutParams);
        }
        m6600X4();
        return viewM6604Q4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m6621j5() {
        ((PutongFrag) this).pageHelper.q(pageId());
        ((PutongFrag) this).pageHelper.l();
    }

    @NotNull
    /* JADX INFO: renamed from: l5 */
    public final AbstractC2399j7 m6622l5(e3i e3iVar) {
        return ((DbObject) FeedModule.m1140H().me_()).id.equals(e3iVar.m9606d(0).owner.f264id) ? new jxh(e3iVar) : new qxh(e3iVar);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f4183I.mo11131a(i, this.f4177C, this.f4176B, this.f4175A);
        this.f4189O.m9609g(i);
        m6616e5(i);
        m6599T4(i);
        this.f4188N.m9302u(i);
    }

    public String pageId() {
        return (((List) FeedStatusPageAct.f4209A.e()).size() <= 0 || ((List) FeedStatusPageAct.f4209A.e()).get(0) == null || !((DbObject) FeedModule.m1140H().me_()).id.equals(((BubbleInfo) ((List) FeedStatusPageAct.f4209A.e()).get(0)).owner.f264id)) ? "p_other_state" : "p_my_state";
    }
}
