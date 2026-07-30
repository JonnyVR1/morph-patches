package com.p046p1.mobile.putong.feed.newui.status.aquare;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p147v.navigationbar.VNavigationBar;
import p149l.AbstractC17708j7;
import p149l.a1i;
import p149l.d1i;
import p149l.d3i;
import p149l.e30;
import p149l.e3i;
import p149l.f3c0;
import p149l.i1i;
import p149l.jed0;
import p149l.jxh;
import p149l.mkd0;
import p149l.nkg;
import p149l.o1i;
import p149l.p2i;
import p149l.qxh;
import p149l.t100;
import p149l.uvg;
import p149l.vwb;
import p149l.w1i;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStatusListTabFrag extends PutongFrag implements ViewPager.InterfaceC0716j, a1i.InterfaceC15512a<List<BubbleInfo>> {

    /* JADX INFO: renamed from: A */
    public FeedVDraweeView f42714A;

    /* JADX INFO: renamed from: B */
    public FeedLinearWithExtraIconsView f42715B;

    /* JADX INFO: renamed from: C */
    public TextView f42716C;

    /* JADX INFO: renamed from: D */
    public VPagerWithDefaultSize f42717D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f42718E;

    /* JADX INFO: renamed from: F */
    public RelativeLayout f42719F;

    /* JADX INFO: renamed from: G */
    public ImageView f42720G;

    /* JADX INFO: renamed from: H */
    public TextView f42721H;

    /* JADX INFO: renamed from: I */
    public AbstractC17708j7 f42722I;

    /* JADX INFO: renamed from: J */
    public int f42723J;

    /* JADX INFO: renamed from: K */
    public a1i<List<BubbleInfo>> f42724K;

    /* JADX INFO: renamed from: L */
    public int f42725L = -1;

    /* JADX INFO: renamed from: M */
    public boolean f42726M;

    /* JADX INFO: renamed from: N */
    public d3i f42727N;

    /* JADX INFO: renamed from: O */
    public e3i f42728O;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f42729z;

    /* JADX INFO: renamed from: S4 */
    public static FeedStatusListTabFrag m65472S4(int i, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
    private void m65473T4(int i) {
        int iM114593c = this.f42728O.m114593c() - i;
        if (iM114593c <= 0 || iM114593c >= 4) {
            return;
        }
        this.f42724K.next();
    }

    /* JADX INFO: renamed from: X4 */
    private void m65474X4() {
        this.f42723J = getArguments().getInt("initialShowIndex", 0);
        String string = getArguments().getString("stateId");
        String string2 = getArguments().getString("next");
        this.f42726M = getArguments().getBoolean("needAppendFeed", false);
        String string3 = getArguments().getString("userId");
        this.pageHelper.m109040p(vwb.m200311Y("where_show_from", "moment"), vwb.m200311Y("source_page", getArguments().getString("from")));
        if (this.f42726M && !FeedModule.m60222H().me_().f56011id.equals(string3)) {
            this.f42724K = new o1i(string, string3);
        } else if (getArguments().getBoolean("stateSquare", false)) {
            this.f42724K = new i1i();
        } else if (TextUtils.isEmpty(string)) {
            this.f42724K = new d1i(FeedStatusPageAct.f42748A, string2);
        } else {
            this.f42724K = new w1i(string, string3);
        }
        this.f42724K.mo94564a(this);
        this.f42724K.previous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m65475a5(C4319c c4319c) {
        if (c4319c == C4319c.f15551l) {
            FeedStateCardView.f42730p = true;
            FeedModule.m60222H().mo30760ec();
        } else if (c4319c == C4319c.f15549j) {
            m65483W4();
            m65488c5(true);
        } else if (c4319c == C4319c.f15548i) {
            m65494j5();
            m65488c5(FeedStateCardView.f42730p);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g5 */
    public static List<BubbleInfo> m65476g5(List<BubbleInfo> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.m2i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    private void m65477k5() {
        if (FeedModule.m60222H().me_().f56011id.equals(this.f42728O.m114594d(0).owner.f38803id)) {
            act().duringCreated(FeedModule.f38855d.m209307K7()).subscribe(mkd0.m154955G(new e30() { // from class: l.o2i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141534a.m65487b5((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m65478Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p2i.m167180b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public final AbstractC17708j7 m65479R4() {
        return null;
    }

    @Override // p149l.a1i.InterfaceC15512a
    /* JADX INFO: renamed from: S0 */
    public void mo65480S0(Throwable th) {
        e3i e3iVar = this.f42728O;
        if (e3iVar == null || e3iVar.m114595e().size() <= 0) {
            this.f42719F.setVisibility(0);
            this.f42720G.setImageResource(f3c0.f94494c5);
            this.f42721H.setText("当前网络不可用");
            m65492h5();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final AbstractC17708j7 m65481U4(e3i e3iVar) {
        return new uvg(e3iVar);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m65482V4() {
        m65484Y4();
        onPageSelected(this.f42723J);
        this.f42722I.mo141120c(this.f42729z);
        this.f42722I.mo141121d(this.f42718E);
    }

    /* JADX INFO: renamed from: W4 */
    public void m65483W4() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109035k();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m65484Y4() {
        d3i d3iVar = new d3i();
        this.f42727N = d3iVar;
        d3iVar.m109924v(new e30() { // from class: l.n2i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136835a.m65493i5((FeedStateCardView) obj);
            }
        });
        this.f42727N.m109921s(this.f42728O);
        this.f42717D.setAdapter(this.f42727N);
        this.f42717D.m4185d(this);
        this.f42717D.setCurrentItem(this.f42723J);
        this.f42717D.setPageMargin(t100.m186890d(20.0f));
        this.f42717D.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m65485Z4(e3i e3iVar) {
        jed0 jed0Var = new jed0(e3iVar);
        this.f42722I = jed0Var;
        jed0Var.m140063e(m65481U4(e3iVar)).m140063e(m65495l5(e3iVar)).m140063e(m65479R4());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m65487b5(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m60222H().me_().f56011id);
        if (bubbleInfo == null) {
            return;
        }
        this.f42728O.m114595e().clear();
        this.f42728O.m114595e().add(bubbleInfo);
        this.f42727N.m109922t(this.f42728O, true);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m65488c5(boolean z) {
        FeedStateCardView feedStateCardViewM109919q;
        d3i d3iVar = this.f42727N;
        if (d3iVar == null || (feedStateCardViewM109919q = d3iVar.m109919q()) == null) {
            return;
        }
        feedStateCardViewM109919q.m65511N(z, false);
    }

    @Override // p149l.a1i.InterfaceC15512a
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo65486a3(List<BubbleInfo> list) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (this.f42728O == null) {
            this.f42728O = new e3i(act(), new ArrayList(), this.f42723J);
        }
        this.f42728O.m114595e().clear();
        this.f42728O.m114595e().addAll(m65476g5(list));
        d3i d3iVar = this.f42727N;
        if (d3iVar != null) {
            d3iVar.m109921s(this.f42728O);
        } else {
            m65491f5();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m65490e5(int i) {
        if (i == this.f42725L) {
            return;
        }
        BubbleInfo bubbleInfoM114594d = this.f42728O.m114594d(i);
        zvf0.m220368A("e_other_state", "p_other_state", vwb.m200311Y("state_id", bubbleInfoM114594d.f38730id), vwb.m200311Y("owner_id", bubbleInfoM114594d.owner.f38803id));
        this.f42725L = i;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.l2i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125787a.m65475a5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m65491f5() {
        int iM114593c = this.f42728O.m114593c();
        RelativeLayout relativeLayout = this.f42719F;
        if (iM114593c == 0) {
            relativeLayout.setVisibility(0);
            this.f42720G.setImageResource(f3c0.f94486b5);
            this.f42721H.setText("你的好友暂时没有状态");
            m65492h5();
            return;
        }
        relativeLayout.setVisibility(8);
        m65485Z4(this.f42728O);
        m65482V4();
        m65477k5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m65492h5() {
        e3i e3iVar = new e3i(act(), new ArrayList(), 0);
        new uvg(e3iVar).mo141120c(this.f42729z);
        new qxh(e3iVar).mo141120c(this.f42729z);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m65493i5(FeedStateCardView feedStateCardView) {
        this.f42722I.mo141119b(feedStateCardView);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM65478Q4 = m65478Q4(layoutInflater, viewGroup);
        if (!nkg.m159848E() || ((FeedStatusPageAct) act()).m65577w2()) {
            xdl0.m208374f0(viewM65478Q4, xdl0.m208331F0());
        } else {
            xdl0.m208344M(this.f42729z, false);
            int i = t100.f167230E;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.topMargin = t100.m186890d(6.0f);
            layoutParams.gravity = 1;
            this.f42714A.setLayoutParams(layoutParams);
        }
        m65474X4();
        return viewM65478Q4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m65494j5() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109036l();
    }

    @NotNull
    /* JADX INFO: renamed from: l5 */
    public final AbstractC17708j7 m65495l5(e3i e3iVar) {
        return FeedModule.m60222H().me_().f56011id.equals(e3iVar.m114594d(0).owner.f38803id) ? new jxh(e3iVar) : new qxh(e3iVar);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        this.f42722I.mo141118a(i, this.f42716C, this.f42715B, this.f42714A);
        this.f42728O.m114597g(i);
        m65490e5(i);
        m65473T4(i);
        this.f42727N.m109923u(i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return (FeedStatusPageAct.f42748A.m221515e().size() <= 0 || FeedStatusPageAct.f42748A.m221515e().get(0) == null || !FeedModule.m60222H().me_().f56011id.equals(FeedStatusPageAct.f42748A.m221515e().get(0).owner.f38803id)) ? "p_other_state" : "p_my_state";
    }
}
