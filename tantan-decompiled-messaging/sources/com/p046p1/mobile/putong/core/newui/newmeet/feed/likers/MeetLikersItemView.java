package com.p046p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p149l.abk;
import p149l.b3c0;
import p149l.d30;
import p149l.e30;
import p149l.h3y;
import p149l.j760;
import p149l.lwl;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.tae0;
import p149l.vwb;
import p149l.x4y;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f26199a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26200b;

    /* JADX INFO: renamed from: c */
    public MeetItemLikerHeadView f26201c;

    /* JADX INFO: renamed from: d */
    public MeetPromotionItemView f26202d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f26203e;

    /* JADX INFO: renamed from: f */
    public VText f26204f;

    /* JADX INFO: renamed from: g */
    public boolean f26205g;

    /* JADX INFO: renamed from: h */
    public x4y f26206h;

    /* JADX INFO: renamed from: i */
    public lwl f26207i;

    /* JADX INFO: renamed from: j */
    public boolean f26208j;

    /* JADX INFO: renamed from: k */
    public int f26209k;

    /* JADX INFO: renamed from: l */
    public int f26210l;

    /* JADX INFO: renamed from: m */
    public d30 f26211m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$a */
    public class C8202a extends GridLayoutManager {
        public C8202a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$b */
    public class C8203b implements C8204a.a {
        public C8203b() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.C8204a.a
        /* JADX INFO: renamed from: n */
        public boolean mo42858n() {
            return !MeetLikersItemView.this.f26205g;
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.C8204a.a
        /* JADX INFO: renamed from: o */
        public void mo42859o(boolean z) {
            MeetLikersItemView.this.f26206h.notifyDataSetChanged();
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.C8204a.a
        /* JADX INFO: renamed from: p */
        public void mo42860p(@NotNull User user, boolean z, boolean z2, boolean z3) {
            MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
            myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
            if (MeetLikersItemView.this.f26207i.mo151978d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), z, z2, z3, null)) {
                return;
            }
            MeetLikersItemView.this.f26206h.notifyDataSetChanged();
        }
    }

    public MeetLikersItemView(Context context) {
        super(context);
        this.f26205g = !xma.m210071e4();
    }

    /* JADX INFO: renamed from: i */
    public final void m42842i(View view) {
        h3y.m129194a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Act m42843j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m42850q() {
        this.f26202d.m42888q();
        xdl0.m208344M(this.f26202d, false);
        xdl0.m208344M(this.f26201c, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m42845l() {
        this.f26206h.mo67374c(m42843j(), CoreModule.f17545c.f19664m1.m34725r4()).subscribe(mkd0.m154955G(new e30() { // from class: l.d3y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84265a.m42847n((String) obj);
            }
        }));
        this.f26206h.mo67374c(m42843j(), CoreModule.f17545c.f19664m1.m34698M4()).subscribe(mkd0.m154955G(new e30() { // from class: l.e3y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89229a.m42848o((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m42846m() {
        bringChildToFront(this.f26203e);
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            setBackground(m42843j().getDrawable(b3c0.f72989Y0));
            this.f26199a.setImageResource(b3c0.f73004a1);
            if (this.f26204f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26204f.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, t100.f167259h, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f26204f.setLayoutParams(marginLayoutParams);
                this.f26204f.setBackgroundResource(b3c0.f73169v0);
                this.f26204f.setTextColor(Color.parseColor("#F2B35F"));
            }
        } else {
            setBackground(m42843j().getDrawable(b3c0.f72982X0));
            this.f26199a.setImageResource(b3c0.f73020c1);
        }
        this.f26203e.setLayoutManager(new C8202a(m42843j(), 2));
        x4y x4yVar = new x4y(m42843j());
        this.f26206h = x4yVar;
        this.f26203e.setAdapter(x4yVar);
        this.f26203e.addItemDecoration(new abk(t100.f167259h, 2));
        new C0605k(new C8204a(new C8203b())).m3750g(this.f26203e);
        this.f26204f.setText("查看更多");
        xdl0.m208329E0(this.f26204f, new View.OnClickListener() { // from class: l.c3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79043a.m42849p(view);
            }
        });
        m42845l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m42847n(String str) {
        this.f26206h.m207046I(str);
        int i = this.f26209k - 1;
        this.f26209k = i;
        if (i > 0) {
            m42855v();
        } else {
            m42853t();
            if (NullChecker.m81303a(this.f26211m)) {
                this.f26211m.call();
            }
        }
        this.f26206h.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m42848o(roj0 roj0Var) {
        if (this.f26208j) {
            CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
            CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
            coreLikers.m30419V6(null, coreLikers.f19254k0.get().longValue(), 0, "");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42842i(this);
        m42846m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m42849p(View view) {
        zvf0.m220396r("e_meet_see_total", m42843j().pageId());
        m42856w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m42851r() {
        CoreModule.f17545c.f19664m1.m34698M4().onNext(roj0.f160388a);
        zvf0.m220396r("e_meet_see_total", m42843j().pageId());
        m42856w();
    }

    /* JADX INFO: renamed from: s */
    public void m42852s(MeetFeedLikersItemData meetFeedLikersItemData, lwl lwlVar, d30 d30Var) {
        this.f26205g = !xma.m210071e4();
        this.f26209k = meetFeedLikersItemData.likersTotalCount;
        this.f26210l = meetFeedLikersItemData.newLikersCount;
        this.f26207i = lwlVar;
        this.f26211m = d30Var;
        if (!vwb.m200296J(meetFeedLikersItemData.users)) {
            this.f26206h.m207047J(lwlVar, meetFeedLikersItemData.users);
            m42855v();
            m42857x(Boolean.valueOf(this.f26208j));
        } else {
            m42853t();
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }
    }

    public void setMyTabStyle(boolean z) {
        this.f26208j = z;
        if (z) {
            setBackground(null);
            this.f26199a.setImageDrawable(null);
            xdl0.m208344M(this.f26204f, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m42853t() {
        this.f26201c.m42832e(this.f26205g);
        m42854u();
    }

    /* JADX INFO: renamed from: u */
    public final void m42854u() {
        if (CoreModule.m29935P().m94656g().mo35064kr() && !this.f26205g) {
            j760<Merchandise, Coupon> j760VarMo35080wg = CoreModule.m29935P().m94656g().mo35080wg();
            if (NullChecker.m81303a(j760VarMo35080wg)) {
                xdl0.m208344M(this.f26202d, true);
                xdl0.m208344M(this.f26201c, false);
                this.f26202d.m42884m(j760VarMo35080wg, new d30() { // from class: l.g3y
                    @Override // p149l.d30
                    public final void call() {
                        this.f100517a.m42850q();
                    }
                });
                this.f26202d.m42886o(this.f26209k);
                return;
            }
        }
        if (xdl0.m208349O0(this.f26201c)) {
            return;
        }
        m42850q();
    }

    /* JADX INFO: renamed from: v */
    public final void m42855v() {
        this.f26201c.m42833f(this.f26208j, new d30() { // from class: l.f3y
            @Override // p149l.d30
            public final void call() {
                this.f94724a.m42851r();
            }
        });
        this.f26201c.m42831d(this.f26205g, this.f26210l, this.f26209k, this.f26206h.m207044G());
        m42854u();
    }

    /* JADX INFO: renamed from: w */
    public final void m42856w() {
        if (this.f26205g) {
            m42843j().startActivity(LikersAct.m56544X1(m42843j(), this.f26208j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click"));
            return;
        }
        if (tae0.m187709l(m42843j(), this.f26208j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click")) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33534l1(m42843j(), this.f26208j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: x */
    public final void m42857x(Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19687u0.m30425Y6();
            return;
        }
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        CoreModule.f17545c.f19687u0.m30425Y6();
        CoreModule.f17545c.f19687u0.m30462o5();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26205g = !xma.m210071e4();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26205g = !xma.m210071e4();
    }
}
