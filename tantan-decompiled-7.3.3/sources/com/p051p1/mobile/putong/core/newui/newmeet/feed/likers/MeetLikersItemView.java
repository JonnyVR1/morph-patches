package com.p051p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.dzl;
import p153l.ecy;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qdk;
import p153l.udy;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;
import p153l.yie0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f26941a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26942b;

    /* JADX INFO: renamed from: c */
    public MeetItemLikerHeadView f26943c;

    /* JADX INFO: renamed from: d */
    public MeetPromotionItemView f26944d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f26945e;

    /* JADX INFO: renamed from: f */
    public VText f26946f;

    /* JADX INFO: renamed from: g */
    public boolean f26947g;

    /* JADX INFO: renamed from: h */
    public udy f26948h;

    /* JADX INFO: renamed from: i */
    public dzl f26949i;

    /* JADX INFO: renamed from: j */
    public boolean f26950j;

    /* JADX INFO: renamed from: k */
    public int f26951k;

    /* JADX INFO: renamed from: l */
    public int f26952l;

    /* JADX INFO: renamed from: m */
    public x20 f26953m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$a */
    public class C8353a extends GridLayoutManager {
        public C8353a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView$b */
    public class C8354b implements C8355a.a {
        public C8354b() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.C8355a.a
        /* JADX INFO: renamed from: n */
        public boolean mo43869n() {
            return !MeetLikersItemView.this.f26947g;
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.C8355a.a
        /* JADX INFO: renamed from: o */
        public void mo43870o(boolean z) {
            MeetLikersItemView.this.f26948h.notifyDataSetChanged();
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.C8355a.a
        /* JADX INFO: renamed from: p */
        public void mo43871p(@NotNull User user, boolean z, boolean z2, boolean z3) {
            MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
            myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
            if (MeetLikersItemView.this.f26949i.mo118749d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), z, z2, z3, null)) {
                return;
            }
            MeetLikersItemView.this.f26948h.notifyDataSetChanged();
        }
    }

    public MeetLikersItemView(Context context) {
        super(context);
        this.f26947g = !joa.m146386f4();
    }

    /* JADX INFO: renamed from: i */
    public final void m43853i(View view) {
        ecy.m120411a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Act m43854j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m43861q() {
        this.f26944d.m43899q();
        bnl0.m105524M(this.f26944d, false);
        bnl0.m105524M(this.f26943c, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m43856l() {
        this.f26948h.mo68557c(m43854j(), CoreModule.f18264c.f20406m1.m35728r4()).subscribe(psd0.m173596G(new y20() { // from class: l.acy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69768a.m43858n((String) obj);
            }
        }));
        this.f26948h.mo68557c(m43854j(), CoreModule.f18264c.f20406m1.m35701M4()).subscribe(psd0.m173596G(new y20() { // from class: l.bcy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76206a.m43859o((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m43857m() {
        bringChildToFront(this.f26945e);
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            setBackground(m43854j().getDrawable(gbc0.f103240Y0));
            this.f26941a.setImageResource(gbc0.f103255a1);
            if (this.f26946f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26946f.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, qa00.f156321h, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f26946f.setLayoutParams(marginLayoutParams);
                this.f26946f.setBackgroundResource(gbc0.f103420v0);
                this.f26946f.setTextColor(Color.parseColor("#F2B35F"));
            }
        } else {
            setBackground(m43854j().getDrawable(gbc0.f103233X0));
            this.f26941a.setImageResource(gbc0.f103271c1);
        }
        this.f26945e.setLayoutManager(new C8353a(m43854j(), 2));
        udy udyVar = new udy(m43854j());
        this.f26948h = udyVar;
        this.f26945e.setAdapter(udyVar);
        this.f26945e.addItemDecoration(new qdk(qa00.f156321h, 2));
        new C0607k(new C8355a(new C8354b())).m3751g(this.f26945e);
        this.f26946f.setText("查看更多");
        bnl0.m105509E0(this.f26946f, new View.OnClickListener() { // from class: l.zby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203712a.m43860p(view);
            }
        });
        m43856l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m43858n(String str) {
        this.f26948h.m195583I(str);
        int i = this.f26951k - 1;
        this.f26951k = i;
        if (i > 0) {
            m43866v();
        } else {
            m43864t();
            if (NullChecker.m82486a(this.f26953m)) {
                this.f26953m.call();
            }
        }
        this.f26948h.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m43859o(uxj0 uxj0Var) {
        if (this.f26950j) {
            CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
            coreLikers.m31429Z6(null, coreLikers.f19996l0.get().longValue(), 0, "");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43853i(this);
        m43857m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m43860p(View view) {
        i4g0.m138520r("e_meet_see_total", m43854j().pageId());
        m43867w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m43862r() {
        CoreModule.f18264c.f20406m1.m35701M4().onNext(uxj0.f181467a);
        i4g0.m138520r("e_meet_see_total", m43854j().pageId());
        m43867w();
    }

    /* JADX INFO: renamed from: s */
    public void m43863s(MeetFeedLikersItemData meetFeedLikersItemData, dzl dzlVar, x20 x20Var) {
        this.f26947g = !joa.m146386f4();
        this.f26951k = meetFeedLikersItemData.likersTotalCount;
        this.f26952l = meetFeedLikersItemData.newLikersCount;
        this.f26949i = dzlVar;
        this.f26953m = x20Var;
        if (!jyb.m147479J(meetFeedLikersItemData.users)) {
            this.f26948h.m195584J(dzlVar, meetFeedLikersItemData.users);
            m43866v();
            m43868x(Boolean.valueOf(this.f26950j));
        } else {
            m43864t();
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }
    }

    public void setMyTabStyle(boolean z) {
        this.f26950j = z;
        if (z) {
            setBackground(null);
            this.f26941a.setImageDrawable(null);
            bnl0.m105524M(this.f26946f, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m43864t() {
        this.f26943c.m43843e(this.f26947g);
        m43865u();
    }

    /* JADX INFO: renamed from: u */
    public final void m43865u() {
        if (CoreModule.m30933P().m143410g().mo36067kr() && !this.f26947g) {
            pf60<Merchandise, Coupon> pf60VarMo36083wg = CoreModule.m30933P().m143410g().mo36083wg();
            if (NullChecker.m82486a(pf60VarMo36083wg)) {
                bnl0.m105524M(this.f26944d, true);
                bnl0.m105524M(this.f26943c, false);
                this.f26944d.m43895m(pf60VarMo36083wg, new x20() { // from class: l.dcy
                    @Override // p153l.x20
                    public final void call() {
                        this.f87840a.m43861q();
                    }
                });
                this.f26944d.m43897o(this.f26951k);
                return;
            }
        }
        if (bnl0.m105529O0(this.f26943c)) {
            return;
        }
        m43861q();
    }

    /* JADX INFO: renamed from: v */
    public final void m43866v() {
        this.f26943c.m43844f(this.f26950j, new x20() { // from class: l.ccy
            @Override // p153l.x20
            public final void call() {
                this.f81041a.m43862r();
            }
        });
        this.f26943c.m43842d(this.f26947g, this.f26952l, this.f26951k, this.f26948h.m195581G());
        m43865u();
    }

    /* JADX INFO: renamed from: w */
    public final void m43867w() {
        if (this.f26947g) {
            m43854j().startActivity(LikersAct.m57727Y1(m43854j(), this.f26950j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click"));
            return;
        }
        if (yie0.m216080l(m43854j(), this.f26950j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click")) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34537l1(m43854j(), this.f26950j ? "p_navigation_see,default" : "p_meet_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: x */
    public final void m43868x(Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20429u0.m31435c7();
            return;
        }
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        CoreModule.f18264c.f20429u0.m31435c7();
        CoreModule.f18264c.f20429u0.m31464o5();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26947g = !joa.m146386f4();
    }

    public MeetLikersItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26947g = !joa.m146386f4();
    }
}
