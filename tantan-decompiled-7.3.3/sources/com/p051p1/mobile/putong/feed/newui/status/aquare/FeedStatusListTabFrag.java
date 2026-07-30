package com.p051p1.mobile.putong.feed.newui.status.aquare;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p151v.navigationbar.VNavigationBar;
import p153l.AbstractC16723e7;
import p153l.bnl0;
import p153l.cmg;
import p153l.d3i;
import p153l.e4i;
import p153l.fzh;
import p153l.i4g0;
import p153l.jxg;
import p153l.jyb;
import p153l.l3i;
import p153l.lbc0;
import p153l.lmd0;
import p153l.p2i;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.s2i;
import p153l.s4i;
import p153l.t4i;
import p153l.x2i;
import p153l.y20;
import p153l.yyh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStatusListTabFrag extends PutongFrag implements ViewPager.InterfaceC0718j, p2i.InterfaceC19275a<List<BubbleInfo>> {

    /* JADX INFO: renamed from: A */
    public FeedVDraweeView f43562A;

    /* JADX INFO: renamed from: B */
    public FeedLinearWithExtraIconsView f43563B;

    /* JADX INFO: renamed from: C */
    public TextView f43564C;

    /* JADX INFO: renamed from: D */
    public VPagerWithDefaultSize f43565D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f43566E;

    /* JADX INFO: renamed from: F */
    public RelativeLayout f43567F;

    /* JADX INFO: renamed from: G */
    public ImageView f43568G;

    /* JADX INFO: renamed from: H */
    public TextView f43569H;

    /* JADX INFO: renamed from: I */
    public AbstractC16723e7 f43570I;

    /* JADX INFO: renamed from: J */
    public int f43571J;

    /* JADX INFO: renamed from: K */
    public p2i<List<BubbleInfo>> f43572K;

    /* JADX INFO: renamed from: L */
    public int f43573L = -1;

    /* JADX INFO: renamed from: M */
    public boolean f43574M;

    /* JADX INFO: renamed from: N */
    public s4i f43575N;

    /* JADX INFO: renamed from: O */
    public t4i f43576O;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f43577z;

    /* JADX INFO: renamed from: S4 */
    public static FeedStatusListTabFrag m66655S4(int i, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
    private void m66656T4(int i) {
        int iM189273c = this.f43576O.m189273c() - i;
        if (iM189273c <= 0 || iM189273c >= 4) {
            return;
        }
        this.f43572K.next();
    }

    /* JADX INFO: renamed from: X4 */
    private void m66657X4() {
        this.f43571J = getArguments().getInt("initialShowIndex", 0);
        String string = getArguments().getString("stateId");
        String string2 = getArguments().getString("next");
        this.f43574M = getArguments().getBoolean("needAppendFeed", false);
        String string3 = getArguments().getString("userId");
        this.pageHelper.m152781p(jyb.m147494Y("where_show_from", "moment"), jyb.m147494Y("source_page", getArguments().getString("from")));
        if (this.f43574M && !FeedModule.m61406H().me_().f56859id.equals(string3)) {
            this.f43572K = new d3i(string, string3);
        } else if (getArguments().getBoolean("stateSquare", false)) {
            this.f43572K = new x2i();
        } else if (TextUtils.isEmpty(string)) {
            this.f43572K = new s2i(FeedStatusPageAct.f43596A, string2);
        } else {
            this.f43572K = new l3i(string, string3);
        }
        this.f43572K.mo113825a(this);
        this.f43572K.previous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m66658a5(C4470c c4470c) {
        if (c4470c == C4470c.f16270l) {
            FeedStateCardView.f43578p = true;
            FeedModule.m61406H().mo31763ec();
        } else if (c4470c == C4470c.f16268j) {
            m66666W4();
            m66671c5(true);
        } else if (c4470c == C4470c.f16267i) {
            m66677j5();
            m66671c5(FeedStateCardView.f43578p);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g5 */
    public static List<BubbleInfo> m66659g5(List<BubbleInfo> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.b4i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    private void m66660k5() {
        if (FeedModule.m61406H().me_().f56859id.equals(this.f43576O.m189274d(0).owner.f39651id)) {
            act().duringCreated(FeedModule.f39703d.m145548K7()).subscribe(psd0.m173596G(new y20() { // from class: l.d4i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85050a.m66670b5((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m66661Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e4i.m119428b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public final AbstractC16723e7 m66662R4() {
        return null;
    }

    @Override // p153l.p2i.InterfaceC19275a
    /* JADX INFO: renamed from: S0 */
    public void mo66663S0(Throwable th) {
        t4i t4iVar = this.f43576O;
        if (t4iVar == null || t4iVar.m189275e().size() <= 0) {
            this.f43567F.setVisibility(0);
            this.f43568G.setImageResource(lbc0.f131012c5);
            this.f43569H.setText("当前网络不可用");
            m66675h5();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final AbstractC16723e7 m66664U4(t4i t4iVar) {
        return new jxg(t4iVar);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m66665V4() {
        m66667Y4();
        onPageSelected(this.f43571J);
        this.f43570I.mo128176c(this.f43577z);
        this.f43570I.mo128177d(this.f43566E);
    }

    /* JADX INFO: renamed from: W4 */
    public void m66666W4() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152776k();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m66667Y4() {
        s4i s4iVar = new s4i();
        this.f43575N = s4iVar;
        s4iVar.m184563v(new y20() { // from class: l.c4i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79705a.m66676i5((FeedStateCardView) obj);
            }
        });
        this.f43575N.m184560s(this.f43576O);
        this.f43565D.setAdapter(this.f43575N);
        this.f43565D.m4187d(this);
        this.f43565D.setCurrentItem(this.f43571J);
        this.f43565D.setPageMargin(qa00.m175859d(20.0f));
        this.f43565D.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m66668Z4(t4i t4iVar) {
        lmd0 lmd0Var = new lmd0(t4iVar);
        this.f43570I = lmd0Var;
        lmd0Var.m119683e(m66664U4(t4iVar)).m119683e(m66678l5(t4iVar)).m119683e(m66662R4());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m66670b5(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m61406H().me_().f56859id);
        if (bubbleInfo == null) {
            return;
        }
        this.f43576O.m189275e().clear();
        this.f43576O.m189275e().add(bubbleInfo);
        this.f43575N.m184561t(this.f43576O, true);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m66671c5(boolean z) {
        FeedStateCardView feedStateCardViewM184558q;
        s4i s4iVar = this.f43575N;
        if (s4iVar == null || (feedStateCardViewM184558q = s4iVar.m184558q()) == null) {
            return;
        }
        feedStateCardViewM184558q.m66694N(z, false);
    }

    @Override // p153l.p2i.InterfaceC19275a
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo66669a3(List<BubbleInfo> list) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (this.f43576O == null) {
            this.f43576O = new t4i(act(), new ArrayList(), this.f43571J);
        }
        this.f43576O.m189275e().clear();
        this.f43576O.m189275e().addAll(m66659g5(list));
        s4i s4iVar = this.f43575N;
        if (s4iVar != null) {
            s4iVar.m184560s(this.f43576O);
        } else {
            m66674f5();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m66673e5(int i) {
        if (i == this.f43573L) {
            return;
        }
        BubbleInfo bubbleInfoM189274d = this.f43576O.m189274d(i);
        i4g0.m138492A("e_other_state", "p_other_state", jyb.m147494Y("state_id", bubbleInfoM189274d.f39578id), jyb.m147494Y("owner_id", bubbleInfoM189274d.owner.f39651id));
        this.f43573L = i;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.a4i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68394a.m66658a5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m66674f5() {
        int iM189273c = this.f43576O.m189273c();
        RelativeLayout relativeLayout = this.f43567F;
        if (iM189273c == 0) {
            relativeLayout.setVisibility(0);
            this.f43568G.setImageResource(lbc0.f131004b5);
            this.f43569H.setText("你的好友暂时没有状态");
            m66675h5();
            return;
        }
        relativeLayout.setVisibility(8);
        m66668Z4(this.f43576O);
        m66665V4();
        m66660k5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m66675h5() {
        t4i t4iVar = new t4i(act(), new ArrayList(), 0);
        new jxg(t4iVar).mo128176c(this.f43577z);
        new fzh(t4iVar).mo128176c(this.f43577z);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m66676i5(FeedStateCardView feedStateCardView) {
        this.f43570I.mo128175b(feedStateCardView);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM66661Q4 = m66661Q4(layoutInflater, viewGroup);
        if (!cmg.m111177E() || ((FeedStatusPageAct) act()).m66760y2()) {
            bnl0.m105554f0(viewM66661Q4, bnl0.m105511F0());
        } else {
            bnl0.m105524M(this.f43577z, false);
            int i = qa00.f156292E;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.topMargin = qa00.m175859d(6.0f);
            layoutParams.gravity = 1;
            this.f43562A.setLayoutParams(layoutParams);
        }
        m66657X4();
        return viewM66661Q4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m66677j5() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152777l();
    }

    @NotNull
    /* JADX INFO: renamed from: l5 */
    public final AbstractC16723e7 m66678l5(t4i t4iVar) {
        return FeedModule.m61406H().me_().f56859id.equals(t4iVar.m189274d(0).owner.f39651id) ? new yyh(t4iVar) : new fzh(t4iVar);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        this.f43570I.mo128174a(i, this.f43564C, this.f43563B, this.f43562A);
        this.f43576O.m189277g(i);
        m66673e5(i);
        m66656T4(i);
        this.f43575N.m184562u(i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return (FeedStatusPageAct.f43596A.m222761e().size() <= 0 || FeedStatusPageAct.f43596A.m222761e().get(0) == null || !FeedModule.m61406H().me_().f56859id.equals(FeedStatusPageAct.f43596A.m222761e().get(0).owner.f39651id)) ? "p_other_state" : "p_my_state";
    }
}
