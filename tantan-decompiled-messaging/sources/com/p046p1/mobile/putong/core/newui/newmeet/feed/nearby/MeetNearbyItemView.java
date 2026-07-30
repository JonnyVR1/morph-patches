package com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p149l.abk;
import p149l.b3c0;
import p149l.d30;
import p149l.f30;
import p149l.l5y;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetNearbyItemView extends RelativeLayout implements C8208b.b {

    /* JADX INFO: renamed from: a */
    public VImage f26241a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26242b;

    /* JADX INFO: renamed from: c */
    public MeetItemEntryHeadView f26243c;

    /* JADX INFO: renamed from: d */
    public MeetItemEntryHeadViewMyTabStyle f26244d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f26245e;

    /* JADX INFO: renamed from: f */
    public VText f26246f;

    /* JADX INFO: renamed from: g */
    public boolean f26247g;

    /* JADX INFO: renamed from: h */
    public C8208b f26248h;

    /* JADX INFO: renamed from: i */
    public Frag f26249i;

    /* JADX INFO: renamed from: j */
    public boolean f26250j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$a */
    public class C8205a extends GridLayoutManager {
        public C8205a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$b */
    public class C8206b implements C8207a.a {
        public C8206b() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8207a.a
        /* JADX INFO: renamed from: b */
        public void mo42916b(User user, boolean z) {
            zvf0.m220401w("e_meet_nearby_card", MeetNearbyItemView.this.f26249i.pageId(), vwb.m200311Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left), vwb.m200311Y("other_user_id", user.f56011id));
            if (MeetNearbyItemView.this.m42905p(z, false, false, 0, user.pictures.get(0).url, user)) {
                return;
            }
            MeetNearbyItemView.this.f26248h.notifyDataSetChanged();
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8207a.a
        /* JADX INFO: renamed from: c */
        public void mo42917c(User user, boolean z) {
            if (!xma.m210047L3()) {
                zvf0.m220401w("e_meet_nearby_card", MeetNearbyItemView.this.f26249i.pageId(), vwb.m200311Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left), vwb.m200311Y("other_user_id", user.f56011id));
                CoreModule.m29935P().m94651a().mo33565pr(MeetNearbyItemView.this.m42904o(), MeetNearbyItemView.this.f26250j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
            }
            MeetNearbyItemView.this.f26248h.notifyDataSetChanged();
        }

        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8207a.a
        /* JADX INFO: renamed from: n */
        public boolean mo42918n() {
            return !MeetNearbyItemView.this.f26247g;
        }
    }

    public MeetNearbyItemView(Context context) {
        super(context);
        this.f26247g = !xma.m210071e4();
    }

    @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8208b.b
    /* JADX INFO: renamed from: a */
    public void mo42901a(@NonNull User user, int i) {
        zvf0.m220396r("e_meet_nearby_card", this.f26249i.pageId());
        if (xma.m210047L3()) {
            CoreModule.m29935P().m94651a().mo33338I9(this.f26249i, user);
        } else {
            CoreModule.m29935P().m94651a().mo33565pr(m42904o(), this.f26250j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8208b.b
    /* JADX INFO: renamed from: b */
    public void mo42902b(@NonNull final User user, int i) {
        zvf0.m220396r("e_odiamond_sayhi", this.f26249i.pageId());
        CoreModule.f17554l.m94651a().mo33305Dl(m42904o(), user, this.f26250j ? "p_navigation_nearby,odiamond_sayhi" : "p_meet,e_odiamond_sayhi,click", new d30() { // from class: l.i5y
            @Override // p149l.d30
            public final void call() {
                this.f111658a.m42910u(user);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m42903n(View view) {
        l5y.m148681a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m42904o() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42903n(this);
        m42906q();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m42905p(boolean z, boolean z2, boolean z3, int i, String str, final User user) {
        return CoreMemberModule.m36001F().m132651b().mo35975Pb(z, z2, z3, i, str, user, m42904o(), m42904o().pageId(), new f30() { // from class: l.j5y
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f116361a.m42907r((Relationship) obj, (Integer) obj2);
            }
        }, new d30() { // from class: l.k5y
            @Override // p149l.d30
            public final void call() {
                this.f121249a.m42908s(user);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m42906q() {
        bringChildToFront(this.f26245e);
        setBackground(m42904o().getDrawable(b3c0.f72996Z0));
        this.f26241a.setImageResource(b3c0.f73052g1);
        this.f26245e.setLayoutManager(new C8205a(m42904o(), 2));
        C8208b c8208b = new C8208b(getContext());
        this.f26248h = c8208b;
        c8208b.m42936M(this);
        this.f26245e.setAdapter(this.f26248h);
        this.f26245e.addItemDecoration(new abk(t100.f167259h, 2));
        new C0605k(new C8207a(new C8206b())).m3750g(this.f26245e);
        this.f26246f.setText("查看更多");
        xdl0.m208329E0(this.f26246f, new View.OnClickListener() { // from class: l.g5y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101211a.m42909t(view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m42907r(Relationship relationship, Integer num) {
        m42904o().startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(m42904o(), vwb.m200324f0(relationship.f38806id), num.intValue(), new ArrayList<>(), m42904o().pageId()), CoreModule.m29935P().m94651a().mo33512hg(m42904o()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m42908s(User user) {
        CoreModule.f17545c.f19665m2.m191476s3(user);
        this.f26248h.m42934K(user);
    }

    public void setMyTabStyle(boolean z) {
        this.f26250j = z;
        if (z) {
            setBackground(null);
            this.f26241a.setImageDrawable(null);
            xdl0.m208344M(this.f26246f, false);
            xdl0.m208344M(this.f26243c, false);
            xdl0.m208344M(this.f26244d, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m42909t(View view) {
        zvf0.m220396r("e_meet_nearby_total", this.f26249i.pageId());
        m42915z();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m42910u(User user) {
        CoreModule.f17545c.f19665m2.m191476s3(user);
        this.f26248h.m42934K(user);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m42911v(View view) {
        zvf0.m220396r("e_meet_nearby_total", this.f26249i.pageId());
        m42915z();
    }

    /* JADX INFO: renamed from: w */
    public void m42912w(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag) {
        m42913x(meetFeedNearbyItemData, frag, false);
    }

    /* JADX INFO: renamed from: x */
    public void m42913x(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag, boolean z) {
        boolean z2 = !xma.m210071e4();
        this.f26247g = z2;
        this.f26249i = frag;
        this.f26248h.m42935L(meetFeedNearbyItemData.users, z2, z);
        m42914y();
    }

    /* JADX INFO: renamed from: y */
    public final void m42914y() {
        boolean z = this.f26250j;
        MeetItemEntryHeadView meetItemEntryHeadView = this.f26243c;
        if (!z) {
            xdl0.m208344M(meetItemEntryHeadView, true);
            xdl0.m208344M(this.f26244d, false);
            this.f26243c.m42951b(Integer.valueOf(b3c0.f73060h1), "附近的人", "精确搜索附近3公里内的用户");
        } else {
            xdl0.m208344M(meetItemEntryHeadView, false);
            xdl0.m208344M(this.f26244d, true);
            this.f26244d.m42953b("附近的人");
            xdl0.m208329E0(this.f26244d._more, new View.OnClickListener() { // from class: l.h5y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f106000a.m42911v(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m42915z() {
        m42904o().startActivity(NearbyAct.m42692V1(m42904o(), this.f26250j ? "from_my_tab" : "from_meet"));
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26247g = !xma.m210071e4();
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26247g = !xma.m210071e4();
    }
}
