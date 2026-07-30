package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.UserWithRelationShip;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VText;
import p153l.bnl0;
import p153l.eb6;
import p153l.i4g0;
import p153l.jyb;
import p153l.pla;
import p153l.pzi0;
import p153l.rgr;
import p153l.uqb0;
import p153l.w30;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemPlatinumPinLike extends LinearLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25590a;

    /* JADX INFO: renamed from: b */
    public VLinear f25591b;

    /* JADX INFO: renamed from: c */
    public VText f25592c;

    /* JADX INFO: renamed from: d */
    public VText f25593d;

    /* JADX INFO: renamed from: e */
    public VText f25594e;

    /* JADX INFO: renamed from: f */
    public TextView f25595f;

    /* JADX INFO: renamed from: g */
    public UserWithRelationShip f25596g;

    /* JADX INFO: renamed from: h */
    public RunnableC4884c0.a f25597h;

    /* JADX INFO: renamed from: i */
    public String f25598i;

    /* JADX INFO: renamed from: j */
    public w30 f25599j;

    public ConversationItemPlatinumPinLike(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m41879d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private Act m41883i() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m41884m(View view) {
        getContext().startActivity(ProfileAct.m51920o2(getContext(), this.f25596g.userId, "from_pin_like", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m41885n(View view) {
        this.f25599j.m204614b();
    }

    /* JADX INFO: renamed from: r */
    private void m41886r() {
        Relationship relationship;
        UserWithRelationShip userWithRelationShip = this.f25596g;
        if (userWithRelationShip == null || (relationship = userWithRelationShip.relationship) == null) {
            return;
        }
        double d = relationship.updateTime;
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        long j = (long) (d + 8.64E7d);
        this.f25598i = "ConversationPinLike_" + this.f25596g.userId;
        this.f25594e.setText(String.format("%s 后到期", CoreModule.f18264c.f20427t1.m32510k(j - pzi0.m174454o())));
        CoreModule.f18264c.f20427t1.m32518t(this);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        this.f25597h = aVar;
        aVar.m32520a(true).m32526g(this.f25598i).m32523d(this).m32525f(j);
        CoreModule.f18264c.f20427t1.m32516r(this.f25597h);
    }

    /* JADX INFO: renamed from: h */
    public final void m41887h(View view) {
        eb6.m120157a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m41888j() {
        UserWithRelationShip userWithRelationShip = this.f25596g;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        CoreModule.f18264c.f20383e2.m172812l3(this.f25596g.userId);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m41889k(Relationship relationship) {
        CoreModule.f18264c.f20405m0.m31997E8(this.f25596g.userId);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m41890l(User user, View view) {
        i4g0.m138520r("e_platinum_receive_top_like_match", OMSDialogPositon.p_messages_view);
        rgr.m181477n(m41883i(), user, true, false, false, "", null, new y20() { // from class: l.ab6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69200a.m41889k((Relationship) obj);
            }
        }, new y20() { // from class: l.bb6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemPlatinumPinLike.m41879d((Throwable) obj);
            }
        }, m41883i().pageId(), null, null, null);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m41891o(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (c22660a.f210081a.toString().equals(m41883i().getString(R$string.f18541I7))) {
            i4g0.m138520r("e_platinum_receive_top_like_hide", OMSDialogPositon.p_messages_view);
            m41888j();
        }
        this.f25599j.m204614b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41887h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m41892p(View view) {
        i4g0.m138526x("e_platinum_receive_top_like_hide", OMSDialogPositon.p_messages_view);
        ArrayList arrayListM147507f0 = jyb.m147507f0(m41883i().getString(R$string.f18541I7));
        w30.C21001b c21001b = new w30.C21001b(m41883i());
        c21001b.m204657I(m41883i().getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.cb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80705a.m41885n(view2);
            }
        }).m204665Q(arrayListM147507f0).m204670V(new w30.InterfaceC21003d() { // from class: l.db6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f85966a.m41891o(vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f25599j = w30VarM204654F;
        w30VarM204654F.m204618f();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m41893q(ConversationsList.C8281e c8281e, int i) {
        int i2;
        final User userM116503Pa;
        pla plaVar = CoreModule.f18264c.f20383e2;
        int i3 = plaVar.f153008W;
        if (i3 < 0 || i3 > i || (i2 = plaVar.f153009X) < 0 || i2 < i) {
            return;
        }
        int i4 = i - i3;
        List<UserWithRelationShip> list = plaVar.f153007V;
        if (jyb.m147479J(list) || list.size() < i4) {
            return;
        }
        UserWithRelationShip userWithRelationShip = list.get(i4);
        this.f25596g = userWithRelationShip;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        UserWithRelationShip userWithRelationShip2 = this.f25596g;
        if (userWithRelationShip2.relationship == null || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userWithRelationShip2.userId)) == null) {
            return;
        }
        i4g0.m138526x("e_platinum_receive_top_like_match", OMSDialogPositon.p_messages_view);
        uqb0.f180374G.m127125Q0(this.f25590a, userM116503Pa.m61308fp().profileSmall());
        this.f25592c.setText(userM116503Pa.name);
        this.f25593d.setText(String.format("%s喜欢了你，配对马上开聊", userM116503Pa.isFemale() ? "她" : "他"));
        m41886r();
        bnl0.m105509E0(this.f25595f, new View.OnClickListener() { // from class: l.xa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192990a.m41890l(userM116503Pa, view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ya6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198152a.m41884m(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.za6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f203540a.m41892p(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f25598i, str) && (vText = this.f25594e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("%s 后到期", CoreModule.f18264c.f20427t1.m32510k(j3 - j)));
            } else {
                CoreModule.f18264c.f20427t1.m32518t(this);
                m41888j();
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
