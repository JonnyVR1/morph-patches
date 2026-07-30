package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.UserWithRelationShip;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.ba6;
import l.c40;
import l.dka;
import l.e30;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.mqi0;
import p009l.qer;
import v.VDraweeView;
import v.VLinear;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemPlatinumPinLike extends LinearLayout implements c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3626a;

    /* JADX INFO: renamed from: b */
    public VLinear f3627b;

    /* JADX INFO: renamed from: c */
    public VText f3628c;

    /* JADX INFO: renamed from: d */
    public VText f3629d;

    /* JADX INFO: renamed from: e */
    public VText f3630e;

    /* JADX INFO: renamed from: f */
    public TextView f3631f;

    /* JADX INFO: renamed from: g */
    public UserWithRelationShip f3632g;

    /* JADX INFO: renamed from: h */
    public c0.a f3633h;

    /* JADX INFO: renamed from: i */
    public String f3634i;

    /* JADX INFO: renamed from: j */
    public c40 f3635j;

    public ConversationItemPlatinumPinLike(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4966d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private Act m4970i() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m4971m(View view) {
        getContext().startActivity(ProfileAct.n2(getContext(), this.f3632g.userId, "from_pin_like", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m4972n(View view) {
        this.f3635j.b();
    }

    /* JADX INFO: renamed from: r */
    private void m4973r() {
        Relationship relationship;
        UserWithRelationShip userWithRelationShip = this.f3632g;
        if (userWithRelationShip == null || (relationship = userWithRelationShip.relationship) == null) {
            return;
        }
        double d = relationship.updateTime;
        if (d < 0.0d) {
            return;
        }
        long j = (long) (d + 8.64E7d);
        this.f3634i = "ConversationPinLike_" + this.f3632g.userId;
        this.f3630e.setText(String.format("%s 后到期", CoreModule.c.t1.k(j - mqi0.m18550o())));
        CoreModule.c.t1.t(this);
        c0.a aVar = new c0.a();
        this.f3633h = aVar;
        aVar.a(true).g(this.f3634i).d(this).f(j);
        CoreModule.c.t1.r(this.f3633h);
    }

    /* JADX INFO: renamed from: h */
    public final void m4974h(View view) {
        ba6.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m4975j() {
        UserWithRelationShip userWithRelationShip = this.f3632g;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        CoreModule.c.e2.l3(this.f3632g.userId);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4976k(Relationship relationship) {
        CoreModule.c.m0.E8(this.f3632g.userId);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4977l(User user, View view) {
        zvf0.r("e_platinum_receive_top_like_match", "p_messages_view");
        qer.m20922n(m4970i(), user, true, false, false, "", null, new e30() { // from class: l.x96
            public final void call(Object obj) {
                this.f22478a.m4976k((Relationship) obj);
            }
        }, new e30() { // from class: l.y96
            public final void call(Object obj) {
                ConversationItemPlatinumPinLike.m4966d((Throwable) obj);
            }
        }, m4970i().pageId(), null, null, null);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m4978o(VListCell vListCell, VListCell.a aVar, int i) {
        if (aVar.a.toString().equals(m4970i().getString(R.string.G7))) {
            zvf0.r("e_platinum_receive_top_like_hide", "p_messages_view");
            m4975j();
        }
        this.f3635j.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4974h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m4979p(View view) {
        zvf0.x("e_platinum_receive_top_like_hide", "p_messages_view");
        ArrayList arrayListF0 = vwb.f0(new CharSequence[]{m4970i().getString(R.string.G7)});
        c40.b bVar = new c40.b(m4970i());
        bVar.I(m4970i().getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.z96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23524a.m4972n(view2);
            }
        }).Q(arrayListF0).V(new c40.d() { // from class: l.aa6
            /* JADX INFO: renamed from: a */
            public final void m11291a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f9347a.m4978o(vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f3635j = c40VarF;
        c40VarF.f();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m4980q(ConversationsList.C0294e c0294e, int i) {
        int i2;
        final User userPa;
        dka dkaVar = CoreModule.c.e2;
        int i3 = dkaVar.W;
        if (i3 < 0 || i3 > i || (i2 = dkaVar.X) < 0 || i2 < i) {
            return;
        }
        int i4 = i - i3;
        List list = dkaVar.V;
        if (vwb.J(list) || list.size() < i4) {
            return;
        }
        UserWithRelationShip userWithRelationShip = (UserWithRelationShip) list.get(i4);
        this.f3632g = userWithRelationShip;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        UserWithRelationShip userWithRelationShip2 = this.f3632g;
        if (userWithRelationShip2.relationship == null || (userPa = CoreModule.c.e0.Pa(userWithRelationShip2.userId)) == null) {
            return;
        }
        zvf0.x("e_platinum_receive_top_like_match", "p_messages_view");
        qib0.G.Q0(this.f3626a, userPa.fp().profileSmall());
        this.f3628c.setText(userPa.name);
        this.f3629d.setText(String.format("%s喜欢了你，配对马上开聊", userPa.isFemale() ? "她" : "他"));
        m4973r();
        xdl0.E0(this.f3631f, new View.OnClickListener() { // from class: l.u96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21021a.m4977l(userPa, view);
            }
        });
        xdl0.E0(this, new View.OnClickListener() { // from class: l.v96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21485a.m4971m(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.w96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f21954a.m4979p(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m4981u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f3634i, str) && (vText = this.f3630e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("%s 后到期", CoreModule.c.t1.k(j3 - j)));
            } else {
                CoreModule.c.t1.t(this);
                m4975j();
            }
        }
    }

    public ConversationItemPlatinumPinLike(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemPlatinumPinLike(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
