package com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.i4g0;
import p153l.iey;
import p153l.joa;
import p153l.jyb;
import p153l.qa00;
import p153l.qdk;
import p153l.x20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class MeetNearbyItemView extends RelativeLayout implements C8359b.b {

    /* JADX INFO: renamed from: a */
    public VImage f26983a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26984b;

    /* JADX INFO: renamed from: c */
    public MeetItemEntryHeadView f26985c;

    /* JADX INFO: renamed from: d */
    public MeetItemEntryHeadViewMyTabStyle f26986d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f26987e;

    /* JADX INFO: renamed from: f */
    public VText f26988f;

    /* JADX INFO: renamed from: g */
    public boolean f26989g;

    /* JADX INFO: renamed from: h */
    public C8359b f26990h;

    /* JADX INFO: renamed from: i */
    public Frag f26991i;

    /* JADX INFO: renamed from: j */
    public boolean f26992j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$a */
    public class C8356a extends GridLayoutManager {
        public C8356a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$b */
    public class C8357b implements C8358a.a {
        public C8357b() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.C8358a.a
        /* JADX INFO: renamed from: b */
        public void mo43927b(User user, boolean z) {
            i4g0.m138525w("e_meet_nearby_card", MeetNearbyItemView.this.f26991i.pageId(), jyb.m147494Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left), jyb.m147494Y("other_user_id", user.f56859id));
            if (MeetNearbyItemView.this.m43916p(z, false, false, 0, user.pictures.get(0).url, user)) {
                return;
            }
            MeetNearbyItemView.this.f26990h.notifyDataSetChanged();
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.C8358a.a
        /* JADX INFO: renamed from: c */
        public void mo43928c(User user, boolean z) {
            if (!joa.m146361M3()) {
                i4g0.m138525w("e_meet_nearby_card", MeetNearbyItemView.this.f26991i.pageId(), jyb.m147494Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left), jyb.m147494Y("other_user_id", user.f56859id));
                CoreModule.m30933P().m143405a().mo34568pr(MeetNearbyItemView.this.m43915o(), MeetNearbyItemView.this.f26992j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
            }
            MeetNearbyItemView.this.f26990h.notifyDataSetChanged();
        }

        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.C8358a.a
        /* JADX INFO: renamed from: n */
        public boolean mo43929n() {
            return !MeetNearbyItemView.this.f26989g;
        }
    }

    public MeetNearbyItemView(Context context) {
        super(context);
        this.f26989g = !joa.m146386f4();
    }

    @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.C8359b.b
    /* JADX INFO: renamed from: a */
    public void mo43912a(@NonNull User user, int i) {
        i4g0.m138520r("e_meet_nearby_card", this.f26991i.pageId());
        if (joa.m146361M3()) {
            CoreModule.m30933P().m143405a().mo34341I9(this.f26991i, user);
        } else {
            CoreModule.m30933P().m143405a().mo34568pr(m43915o(), this.f26992j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.C8359b.b
    /* JADX INFO: renamed from: b */
    public void mo43913b(@NonNull final User user, int i) {
        i4g0.m138520r("e_odiamond_sayhi", this.f26991i.pageId());
        CoreModule.f18273l.m143405a().mo34308Dl(m43915o(), user, this.f26992j ? "p_navigation_nearby,odiamond_sayhi" : "p_meet,e_odiamond_sayhi,click", new x20() { // from class: l.fey
            @Override // p153l.x20
            public final void call() {
                this.f98723a.m43921u(user);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m43914n(View view) {
        iey.m139675a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m43915o() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43914n(this);
        m43917q();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m43916p(boolean z, boolean z2, boolean z3, int i, String str, final User user) {
        return CoreMemberModule.m37004F().m187693b().mo36978Pb(z, z2, z3, i, str, user, m43915o(), m43915o().pageId(), new z20() { // from class: l.gey
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f103865a.m43918r((Relationship) obj, (Integer) obj2);
            }
        }, new x20() { // from class: l.hey
            @Override // p153l.x20
            public final void call() {
                this.f109206a.m43919s(user);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m43917q() {
        bringChildToFront(this.f26987e);
        setBackground(m43915o().getDrawable(gbc0.f103247Z0));
        this.f26983a.setImageResource(gbc0.f103303g1);
        this.f26987e.setLayoutManager(new C8356a(m43915o(), 2));
        C8359b c8359b = new C8359b(getContext());
        this.f26990h = c8359b;
        c8359b.m43947M(this);
        this.f26987e.setAdapter(this.f26990h);
        this.f26987e.addItemDecoration(new qdk(qa00.f156321h, 2));
        new C0607k(new C8358a(new C8357b())).m3751g(this.f26987e);
        this.f26988f.setText("查看更多");
        bnl0.m105509E0(this.f26988f, new View.OnClickListener() { // from class: l.dey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88107a.m43920t(view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m43918r(Relationship relationship, Integer num) {
        m43915o().startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(m43915o(), jyb.m147507f0(relationship.f39654id), num.intValue(), new ArrayList<>(), m43915o().pageId()), CoreModule.m30933P().m143405a().mo34515hg(m43915o()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m43919s(User user) {
        CoreModule.f18264c.f20407m2.m123967s3(user);
        this.f26990h.m43945K(user);
    }

    public void setMyTabStyle(boolean z) {
        this.f26992j = z;
        if (z) {
            setBackground(null);
            this.f26983a.setImageDrawable(null);
            bnl0.m105524M(this.f26988f, false);
            bnl0.m105524M(this.f26985c, false);
            bnl0.m105524M(this.f26986d, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m43920t(View view) {
        i4g0.m138520r("e_meet_nearby_total", this.f26991i.pageId());
        m43926z();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m43921u(User user) {
        CoreModule.f18264c.f20407m2.m123967s3(user);
        this.f26990h.m43945K(user);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m43922v(View view) {
        i4g0.m138520r("e_meet_nearby_total", this.f26991i.pageId());
        m43926z();
    }

    /* JADX INFO: renamed from: w */
    public void m43923w(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag) {
        m43924x(meetFeedNearbyItemData, frag, false);
    }

    /* JADX INFO: renamed from: x */
    public void m43924x(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag, boolean z) {
        boolean z2 = !joa.m146386f4();
        this.f26989g = z2;
        this.f26991i = frag;
        this.f26990h.m43946L(meetFeedNearbyItemData.users, z2, z);
        m43925y();
    }

    /* JADX INFO: renamed from: y */
    public final void m43925y() {
        boolean z = this.f26992j;
        MeetItemEntryHeadView meetItemEntryHeadView = this.f26985c;
        if (!z) {
            bnl0.m105524M(meetItemEntryHeadView, true);
            bnl0.m105524M(this.f26986d, false);
            this.f26985c.m43962b(Integer.valueOf(gbc0.f103311h1), "附近的人", "精确搜索附近3公里内的用户");
        } else {
            bnl0.m105524M(meetItemEntryHeadView, false);
            bnl0.m105524M(this.f26986d, true);
            this.f26986d.m43964b("附近的人");
            bnl0.m105509E0(this.f26986d._more, new View.OnClickListener() { // from class: l.eey
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93686a.m43922v(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m43926z() {
        m43915o().startActivity(NearbyAct.m43703X1(m43915o(), this.f26992j ? "from_my_tab" : "from_meet"));
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26989g = !joa.m146386f4();
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26989g = !joa.m146386f4();
    }
}
