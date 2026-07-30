package com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.b3c0;
import l.d30;
import l.f30;
import l.j760;
import l.l5y;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.abk;
import v.VImage;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetNearbyItemView extends RelativeLayout implements C0372b.b {

    /* JADX INFO: renamed from: a */
    public VImage f5019a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f5020b;

    /* JADX INFO: renamed from: c */
    public MeetItemEntryHeadView f5021c;

    /* JADX INFO: renamed from: d */
    public MeetItemEntryHeadViewMyTabStyle f5022d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f5023e;

    /* JADX INFO: renamed from: f */
    public VText f5024f;

    /* JADX INFO: renamed from: g */
    public boolean f5025g;

    /* JADX INFO: renamed from: h */
    public C0372b f5026h;

    /* JADX INFO: renamed from: i */
    public Frag f5027i;

    /* JADX INFO: renamed from: j */
    public boolean f5028j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$a */
    public class C0369a extends GridLayoutManager {
        public C0369a(Context context, int i) {
            super(context, i);
        }

        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView$b */
    public class C0370b implements C0371a.a {
        public C0370b() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0371a.a
        /* JADX INFO: renamed from: b */
        public void mo7098b(User user, boolean z) {
            zvf0.w("e_meet_nearby_card", MeetNearbyItemView.this.f5027i.pageId(), new j760[]{vwb.Y("direction", z ? "right" : "left"), vwb.Y("other_user_id", ((DbObject) user).id)});
            if (MeetNearbyItemView.this.m7087p(z, false, false, 0, ((Media) user.pictures.get(0)).url, user)) {
                return;
            }
            MeetNearbyItemView.this.f5026h.notifyDataSetChanged();
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0371a.a
        /* JADX INFO: renamed from: c */
        public void mo7099c(User user, boolean z) {
            if (!xma.L3()) {
                zvf0.w("e_meet_nearby_card", MeetNearbyItemView.this.f5027i.pageId(), new j760[]{vwb.Y("direction", z ? "right" : "left"), vwb.Y("other_user_id", ((DbObject) user).id)});
                CoreModule.P().a().pr(MeetNearbyItemView.this.m7086o(), MeetNearbyItemView.this.f5028j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
            }
            MeetNearbyItemView.this.f5026h.notifyDataSetChanged();
        }

        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0371a.a
        /* JADX INFO: renamed from: n */
        public boolean mo7100n() {
            return !MeetNearbyItemView.this.f5025g;
        }
    }

    public MeetNearbyItemView(Context context) {
        super(context);
        this.f5025g = !xma.e4();
    }

    @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0372b.b
    /* JADX INFO: renamed from: a */
    public void mo7083a(@NonNull User user, int i) {
        zvf0.r("e_meet_nearby_card", this.f5027i.pageId());
        if (xma.L3()) {
            CoreModule.P().a().I9(this.f5027i, user);
        } else {
            CoreModule.P().a().pr(m7086o(), this.f5028j ? "p_navigation,nearby_module" : "p_meet,e_meet_nearby_card,click", Privilege.nearby_people);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0372b.b
    /* JADX INFO: renamed from: b */
    public void mo7084b(@NonNull final User user, int i) {
        zvf0.r("e_odiamond_sayhi", this.f5027i.pageId());
        CoreModule.l.a().Dl(m7086o(), user, this.f5028j ? "p_navigation_nearby,odiamond_sayhi" : "p_meet,e_odiamond_sayhi,click", new d30() { // from class: l.i5y
            public final void call() {
                this.f14404a.m7092u(user);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m7085n(View view) {
        l5y.a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m7086o() {
        return getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7085n(this);
        m7088q();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7087p(boolean z, boolean z2, boolean z3, int i, String str, final User user) {
        return CoreMemberModule.F().b().Pb(z, z2, z3, i, str, user, m7086o(), m7086o().pageId(), new f30() { // from class: l.j5y
            public final void call(Object obj, Object obj2) {
                this.f14944a.m7089r((Relationship) obj, (Integer) obj2);
            }
        }, new d30() { // from class: l.k5y
            public final void call() {
                this.f15419a.m7090s(user);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m7088q() {
        bringChildToFront(this.f5023e);
        setBackground(m7086o().getDrawable(b3c0.Z0));
        this.f5019a.setImageResource(b3c0.g1);
        this.f5023e.setLayoutManager(new C0369a(m7086o(), 2));
        C0372b c0372b = new C0372b(getContext());
        this.f5026h = c0372b;
        c0372b.m7131M(this);
        this.f5023e.setAdapter(this.f5026h);
        this.f5023e.addItemDecoration(new abk(t100.h, 2));
        new k(new C0371a(new C0370b())).g(this.f5023e);
        this.f5024f.setText("查看更多");
        xdl0.E0(this.f5024f, new View.OnClickListener() { // from class: l.g5y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13317a.m7091t(view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7089r(Relationship relationship, Integer num) {
        m7086o().startActivityWithCustomTransition(CoreModule.P().a().n8(m7086o(), vwb.f0(new String[]{relationship.id}), num.intValue(), new ArrayList(), m7086o().pageId()), CoreModule.P().a().hg(m7086o()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7090s(User user) {
        CoreModule.c.m2.s3(user);
        this.f5026h.m7129K(user);
    }

    public void setMyTabStyle(boolean z) {
        this.f5028j = z;
        if (z) {
            setBackground(null);
            this.f5019a.setImageDrawable((Drawable) null);
            xdl0.M(this.f5024f, false);
            xdl0.M(this.f5021c, false);
            xdl0.M(this.f5022d, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7091t(View view) {
        zvf0.r("e_meet_nearby_total", this.f5027i.pageId());
        m7097z();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7092u(User user) {
        CoreModule.c.m2.s3(user);
        this.f5026h.m7129K(user);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7093v(View view) {
        zvf0.r("e_meet_nearby_total", this.f5027i.pageId());
        m7097z();
    }

    /* JADX INFO: renamed from: w */
    public void m7094w(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag) {
        m7095x(meetFeedNearbyItemData, frag, false);
    }

    /* JADX INFO: renamed from: x */
    public void m7095x(MeetFeedNearbyItemData meetFeedNearbyItemData, Frag frag, boolean z) {
        boolean z2 = !xma.e4();
        this.f5025g = z2;
        this.f5027i = frag;
        this.f5026h.m7130L(meetFeedNearbyItemData.users, z2, z);
        m7096y();
    }

    /* JADX INFO: renamed from: y */
    public final void m7096y() {
        boolean z = this.f5028j;
        MeetItemEntryHeadView meetItemEntryHeadView = this.f5021c;
        if (!z) {
            xdl0.M(meetItemEntryHeadView, true);
            xdl0.M(this.f5022d, false);
            this.f5021c.m7146b(Integer.valueOf(b3c0.h1), "附近的人", "精确搜索附近3公里内的用户");
        } else {
            xdl0.M(meetItemEntryHeadView, false);
            xdl0.M(this.f5022d, true);
            this.f5022d.m7148b("附近的人");
            xdl0.E0(this.f5022d._more, new View.OnClickListener() { // from class: l.h5y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13882a.m7093v(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7097z() {
        m7086o().startActivity(NearbyAct.m6858V1(m7086o(), this.f5028j ? "from_my_tab" : "from_meet"));
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5025g = !xma.e4();
    }

    public MeetNearbyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5025g = !xma.e4();
    }
}
