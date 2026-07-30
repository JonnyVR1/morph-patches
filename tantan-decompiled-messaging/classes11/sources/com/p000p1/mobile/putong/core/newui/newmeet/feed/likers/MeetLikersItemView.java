package com.p000p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.d30;
import l.e30;
import l.h3y;
import l.j760;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.t100;
import l.tae0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p009l.abk;
import p009l.lwl;
import p009l.x4y;
import v.VImage;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetLikersItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4977a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f4978b;

    /* JADX INFO: renamed from: c */
    public MeetItemLikerHeadView f4979c;

    /* JADX INFO: renamed from: d */
    public MeetPromotionItemView f4980d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f4981e;

    /* JADX INFO: renamed from: f */
    public VText f4982f;

    /* JADX INFO: renamed from: g */
    public boolean f4983g;

    /* JADX INFO: renamed from: h */
    public x4y f4984h;

    /* JADX INFO: renamed from: i */
    public lwl f4985i;

    /* JADX INFO: renamed from: j */
    public boolean f4986j;

    /* JADX INFO: renamed from: k */
    public int f4987k;

    /* JADX INFO: renamed from: l */
    public int f4988l;

    /* JADX INFO: renamed from: m */
    public d30 f4989m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$a */
    public class C0366a extends GridLayoutManager {
        public C0366a(Context context, int i) {
            super(context, i);
        }

        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$b */
    public class C0367b implements C0368a.a {
        public C0367b() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.C0368a.a
        /* JADX INFO: renamed from: n */
        public boolean mo7032n() {
            return !MeetLikersItemView.this.f4983g;
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.C0368a.a
        /* JADX INFO: renamed from: o */
        public void mo7033o(boolean z) {
            MeetLikersItemView.this.f4984h.notifyDataSetChanged();
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.C0368a.a
        /* JADX INFO: renamed from: p */
        public void mo7034p(@NotNull User user, boolean z, boolean z2, boolean z3) {
            MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
            myMeetFeedItemNew_.type = FeedType.get("localLikersUser");
            if (MeetLikersItemView.this.f4985i.mo18067d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), z, z2, z3, null)) {
                return;
            }
            MeetLikersItemView.this.f4984h.notifyDataSetChanged();
        }
    }

    public MeetLikersItemView(Context context) {
        super(context);
        this.f4983g = !xma.e4();
    }

    /* JADX INFO: renamed from: i */
    public final void m7016i(View view) {
        h3y.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Act m7017j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m7024q() {
        this.f4980d.m7062q();
        xdl0.M(this.f4980d, false);
        xdl0.M(this.f4979c, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m7019l() {
        this.f4984h.c(m7017j(), CoreModule.c.m1.r4()).subscribe(mkd0.G(new e30() { // from class: l.d3y
            public final void call(Object obj) {
                this.f11630a.m7021n((String) obj);
            }
        }));
        this.f4984h.c(m7017j(), CoreModule.c.m1.M4()).subscribe(mkd0.G(new e30() { // from class: l.e3y
            public final void call(Object obj) {
                this.f12356a.m7022o((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m7020m() {
        bringChildToFront(this.f4981e);
        if (CoreModule.P().g().D9()) {
            setBackground(m7017j().getDrawable(b3c0.Y0));
            this.f4977a.setImageResource(b3c0.a1);
            if (this.f4982f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4982f.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, t100.h, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f4982f.setLayoutParams(marginLayoutParams);
                this.f4982f.setBackgroundResource(b3c0.v0);
                this.f4982f.setTextColor(Color.parseColor("#F2B35F"));
            }
        } else {
            setBackground(m7017j().getDrawable(b3c0.X0));
            this.f4977a.setImageResource(b3c0.c1);
        }
        this.f4981e.setLayoutManager(new C0366a(m7017j(), 2));
        x4y x4yVar = new x4y(m7017j());
        this.f4984h = x4yVar;
        this.f4981e.setAdapter(x4yVar);
        this.f4981e.addItemDecoration(new abk(t100.h, 2));
        new k(new C0368a(new C0367b())).g(this.f4981e);
        this.f4982f.setText("查看更多");
        xdl0.E0(this.f4982f, new View.OnClickListener() { // from class: l.c3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10430a.m7023p(view);
            }
        });
        m7019l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7021n(String str) {
        this.f4984h.m24718I(str);
        int i = this.f4987k - 1;
        this.f4987k = i;
        if (i > 0) {
            m7029v();
        } else {
            m7027t();
            if (NullChecker.a(this.f4989m)) {
                this.f4989m.call();
            }
        }
        this.f4984h.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7022o(roj0 roj0Var) {
        if (this.f4986j) {
            CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
            CoreLikers coreLikers = CoreModule.c.u0;
            coreLikers.V6((Links) null, ((Long) coreLikers.k0.get()).longValue(), 0, "");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7016i(this);
        m7020m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7023p(View view) {
        zvf0.r("e_meet_see_total", m7017j().pageId());
        m7030w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7025r() {
        CoreModule.c.m1.M4().onNext(roj0.a);
        zvf0.r("e_meet_see_total", m7017j().pageId());
        m7030w();
    }

    /* JADX INFO: renamed from: s */
    public void m7026s(MeetFeedLikersItemData meetFeedLikersItemData, lwl lwlVar, d30 d30Var) {
        this.f4983g = !xma.e4();
        this.f4987k = meetFeedLikersItemData.likersTotalCount;
        this.f4988l = meetFeedLikersItemData.newLikersCount;
        this.f4985i = lwlVar;
        this.f4989m = d30Var;
        if (!vwb.J(meetFeedLikersItemData.users)) {
            this.f4984h.m24719J(lwlVar, meetFeedLikersItemData.users);
            m7029v();
            m7031x(Boolean.valueOf(this.f4986j));
        } else {
            m7027t();
            if (NullChecker.a(d30Var)) {
                d30Var.call();
            }
        }
    }

    public void setMyTabStyle(boolean z) {
        this.f4986j = z;
        if (z) {
            setBackground(null);
            this.f4977a.setImageDrawable((Drawable) null);
            xdl0.M(this.f4982f, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7027t() {
        this.f4979c.m7006e(this.f4983g);
        m7028u();
    }

    /* JADX INFO: renamed from: u */
    public final void m7028u() {
        if (CoreModule.P().g().kr() && !this.f4983g) {
            j760<Merchandise, Coupon> j760VarWg = CoreModule.P().g().wg();
            if (NullChecker.a(j760VarWg)) {
                xdl0.M(this.f4980d, true);
                xdl0.M(this.f4979c, false);
                this.f4980d.m7058m(j760VarWg, new d30() { // from class: l.g3y
                    public final void call() {
                        this.f13303a.m7024q();
                    }
                });
                this.f4980d.m7060o(this.f4987k);
                return;
            }
        }
        if (xdl0.O0(this.f4979c)) {
            return;
        }
        m7024q();
    }

    /* JADX INFO: renamed from: v */
    public final void m7029v() {
        this.f4979c.m7007f(this.f4986j, new d30() { // from class: l.f3y
            public final void call() {
                this.f12765a.m7025r();
            }
        });
        this.f4979c.m7005d(this.f4983g, this.f4988l, this.f4987k, this.f4984h.m24716G());
        m7028u();
    }

    /* JADX INFO: renamed from: w */
    public final void m7030w() {
        if (this.f4983g) {
            m7017j().startActivity(LikersAct.X1(m7017j(), this.f4986j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click"));
            return;
        }
        if (tae0.l(m7017j(), this.f4986j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click")) {
            return;
        }
        CoreModule.P().a().l1(m7017j(), this.f4986j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: x */
    public final void m7031x(Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.c.u0.Y6();
            return;
        }
        CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
        CoreModule.c.u0.Y6();
        CoreModule.c.u0.o5();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4983g = !xma.e4();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4983g = !xma.e4();
    }
}
