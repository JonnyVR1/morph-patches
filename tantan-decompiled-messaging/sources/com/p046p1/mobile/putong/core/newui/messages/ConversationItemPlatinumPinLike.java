package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.UserWithRelationShip;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VText;
import p149l.ba6;
import p149l.c40;
import p149l.dka;
import p149l.e30;
import p149l.mqi0;
import p149l.qer;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemPlatinumPinLike extends LinearLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24848a;

    /* JADX INFO: renamed from: b */
    public VLinear f24849b;

    /* JADX INFO: renamed from: c */
    public VText f24850c;

    /* JADX INFO: renamed from: d */
    public VText f24851d;

    /* JADX INFO: renamed from: e */
    public VText f24852e;

    /* JADX INFO: renamed from: f */
    public TextView f24853f;

    /* JADX INFO: renamed from: g */
    public UserWithRelationShip f24854g;

    /* JADX INFO: renamed from: h */
    public RunnableC4733c0.a f24855h;

    /* JADX INFO: renamed from: i */
    public String f24856i;

    /* JADX INFO: renamed from: j */
    public c40 f24857j;

    public ConversationItemPlatinumPinLike(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m40868d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private Act m40872i() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m40873m(View view) {
        getContext().startActivity(ProfileAct.m50736n2(getContext(), this.f24854g.userId, "from_pin_like", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m40874n(View view) {
        this.f24857j.m105113b();
    }

    /* JADX INFO: renamed from: r */
    private void m40875r() {
        Relationship relationship;
        UserWithRelationShip userWithRelationShip = this.f24854g;
        if (userWithRelationShip == null || (relationship = userWithRelationShip.relationship) == null) {
            return;
        }
        double d = relationship.updateTime;
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        long j = (long) (d + 8.64E7d);
        this.f24856i = "ConversationPinLike_" + this.f24854g.userId;
        this.f24852e.setText(String.format("%s 后到期", CoreModule.f17545c.f19685t1.m31507k(j - mqi0.m155944o())));
        CoreModule.f17545c.f19685t1.m31515t(this);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        this.f24855h = aVar;
        aVar.m31517a(true).m31523g(this.f24856i).m31520d(this).m31522f(j);
        CoreModule.f17545c.f19685t1.m31513r(this.f24855h);
    }

    /* JADX INFO: renamed from: h */
    public final void m40876h(View view) {
        ba6.m100896a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m40877j() {
        UserWithRelationShip userWithRelationShip = this.f24854g;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        CoreModule.f17545c.f19641e2.m112203l3(this.f24854g.userId);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m40878k(Relationship relationship) {
        CoreModule.f17545c.f19663m0.m30994E8(this.f24854g.userId);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40879l(User user, View view) {
        zvf0.m220396r("e_platinum_receive_top_like_match", OMSDialogPositon.p_messages_view);
        qer.m174243n(m40872i(), user, true, false, false, "", null, new e30() { // from class: l.x96
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191578a.m40878k((Relationship) obj);
            }
        }, new e30() { // from class: l.y96
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemPlatinumPinLike.m40868d((Throwable) obj);
            }
        }, m40872i().pageId(), null, null, null);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m40880o(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (c22545a.f209159a.toString().equals(m40872i().getString(R$string.f17754G7))) {
            zvf0.m220396r("e_platinum_receive_top_like_hide", OMSDialogPositon.p_messages_view);
            m40877j();
        }
        this.f24857j.m105113b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40876h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m40881p(View view) {
        zvf0.m220402x("e_platinum_receive_top_like_hide", OMSDialogPositon.p_messages_view);
        ArrayList arrayListM200324f0 = vwb.m200324f0(m40872i().getString(R$string.f17754G7));
        c40.C16057b c16057b = new c40.C16057b(m40872i());
        c16057b.m105156I(m40872i().getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.z96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202274a.m40874n(view2);
            }
        }).m105164Q(arrayListM200324f0).m105169V(new c40.InterfaceC16059d() { // from class: l.aa6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f68276a.m40880o(vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f24857j = c40VarM105153F;
        c40VarM105153F.m105117f();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m40882q(ConversationsList.C8130e c8130e, int i) {
        int i2;
        final User userM169430Pa;
        dka dkaVar = CoreModule.f17545c.f19641e2;
        int i3 = dkaVar.f86634W;
        if (i3 < 0 || i3 > i || (i2 = dkaVar.f86635X) < 0 || i2 < i) {
            return;
        }
        int i4 = i - i3;
        List<UserWithRelationShip> list = dkaVar.f86633V;
        if (vwb.m200296J(list) || list.size() < i4) {
            return;
        }
        UserWithRelationShip userWithRelationShip = list.get(i4);
        this.f24854g = userWithRelationShip;
        if (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId)) {
            return;
        }
        UserWithRelationShip userWithRelationShip2 = this.f24854g;
        if (userWithRelationShip2.relationship == null || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userWithRelationShip2.userId)) == null) {
            return;
        }
        zvf0.m220402x("e_platinum_receive_top_like_match", OMSDialogPositon.p_messages_view);
        qib0.f154691G.m102341Q0(this.f24848a, userM169430Pa.m60124fp().profileSmall());
        this.f24850c.setText(userM169430Pa.name);
        this.f24851d.setText(String.format("%s喜欢了你，配对马上开聊", userM169430Pa.isFemale() ? "她" : "他"));
        m40875r();
        xdl0.m208329E0(this.f24853f, new View.OnClickListener() { // from class: l.u96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175193a.m40879l(userM169430Pa, view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.v96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180614a.m40873m(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.w96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f185303a.m40881p(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f24856i, str) && (vText = this.f24852e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("%s 后到期", CoreModule.f17545c.f19685t1.m31507k(j3 - j)));
            } else {
                CoreModule.f17545c.f19685t1.m31515t(this);
                m40877j();
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
