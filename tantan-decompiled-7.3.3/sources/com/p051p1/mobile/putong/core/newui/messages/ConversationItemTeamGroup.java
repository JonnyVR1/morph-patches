package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p051p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p051p1.mobile.putong.core.newui.messages.teamgroup.TeamGroupAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.schedulers.Schedulers;
import p151v.VDraweeView;
import p151v.VText;
import p153l.C20291td;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kj6;
import p153l.mc6;
import p153l.och0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sb8;
import p153l.sj6;
import p153l.u46;
import p153l.ue6;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemTeamGroup extends LinearLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25637a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f25638b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f25639c;

    /* JADX INFO: renamed from: d */
    public View f25640d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f25641e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f25642f;

    /* JADX INFO: renamed from: g */
    public VText f25643g;

    /* JADX INFO: renamed from: h */
    public TextView f25644h;

    /* JADX INFO: renamed from: i */
    public VText f25645i;

    /* JADX INFO: renamed from: j */
    public RunnableC4884c0.a f25646j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f25647k;

    /* JADX INFO: renamed from: l */
    public kcg0 f25648l;

    public ConversationItemTeamGroup(Context context) {
        super(context);
        this.f25647k = new AtomicLong();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Conversation m41929a(vg60 vg60Var) {
        if (!NullChecker.m82486a(vg60Var) || jyb.m147479J(vg60Var.f184001a)) {
            return null;
        }
        return (Conversation) vg60Var.f184001a.get(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m41931c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ bkj0 m41933e(Conversation conversation) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(conversation.otherUser);
        return bkj0.m104818a(conversation, userM116597oa, ue6.m195675t(CoreModule.f18272k.f115535c.m189464Z(conversation.f56859id, conversation.clearedTime, CoreModule.f18264c.f20384f0.m34004jg(conversation.f56859id, true)).m208674j(), userM116597oa));
    }

    /* JADX INFO: renamed from: i */
    private Act m41936i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final void m41937h(View view) {
        mc6.m157915a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m41938j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m41939k(Conversation conversation, u46 u46Var, View view) {
        m41936i().startActivity(TeamGroupAct.m43570a2(m41936i()));
        i4g0.m138523u("e_subscription_content", OMSDialogPositon.p_messages_view, jyb.m147494Y("red_dot_state", CoreModule.f18264c.f20381e0.f89010C5.get().longValue() < ((long) conversation.latestTime) ? "1" : "0"));
        m41943o(u46Var, conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m41940l(u46 u46Var, bkj0 bkj0Var) throws IOException {
        m41944p(u46Var, (Conversation) bkj0Var.f77081a, (User) bkj0Var.f77082b, (Message) bkj0Var.f77083c);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m41941m(User user) {
        this.f25639c.m42933c(user, null);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m41942n(Conversation conversation, User user) {
        this.f25643g.setText(String.format("收到的称赞：%s%s", m41938j(user.name), conversation.profileLikeInfo.profileLikeComment.comment));
    }

    /* JADX INFO: renamed from: o */
    public void m41943o(@NonNull final u46 u46Var, @NonNull final Conversation conversation) {
        CoreModule.f18264c.f20427t1.m32519u("fake_conversation_surprise_gift_box");
        this.f25642f.setText("订阅内容");
        this.f25644h.setText(pzi0.m174442G(conversation.latestTime));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.fc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98179a.m41939k(conversation, u46Var, view);
            }
        });
        psd0.m173633z(this.f25648l);
        this.f25648l = u46Var.mo68557c(m41936i(), CoreModule.f18264c.f20384f0.m33931df().map(new qcj() { // from class: l.gc6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m41929a((vg60) obj);
            }
        }).filter(new sb8()).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hc6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m41933e((Conversation) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ic6
            @Override // p153l.y20
            public final void call(Object obj) throws IOException {
                this.f114284a.m41940l(u46Var, (bkj0) obj);
            }
        }, new y20() { // from class: l.jc6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemTeamGroup.m41931c((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41937h(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(sj6.f168905Q, this.f25637a);
            ue6.m195671k0(this.f25642f, this.f25644h);
            ue6.m195667e0(this.f25643g);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m41944p(u46 u46Var, @NonNull Conversation conversation, User user, Message message) throws IOException {
        if (CoreModule.f18264c.f20381e0.f89010C5.get().longValue() < ((long) conversation.latestTime)) {
            bnl0.m105524M(this.f25645i, true);
            m41945q(u46Var, conversation, user);
        } else {
            boolean zM131778z = gra.m131778z();
            VDraweeView vDraweeView = this.f25637a;
            if (zM131778z) {
                vDraweeView.setImageResource(dbc0.f86946e6);
            } else {
                vDraweeView.setImageResource(dbc0.f86914d6);
            }
            bnl0.m105524M(this.f25645i, false);
            bnl0.m105524M(this.f25639c, false);
            bnl0.m105524M(this.f25640d, false);
        }
        m41946r(u46Var, conversation, user, message);
        m41947s(conversation);
    }

    /* JADX INFO: renamed from: q */
    public void m41945q(@NonNull u46 u46Var, @NonNull Conversation conversation, User user) {
        if (conversation.f56859id.startsWith("-")) {
            uqb0.f180374G.m127115L0(this.f25637a, user.m61308fp().profileSmall().formatted());
        }
        String str = conversation.f56859id;
        str.getClass();
        switch (str) {
            case "fake_conversation_oof_enter":
            case "fake_conversation_oof_pick":
                boolean zM131778z = gra.m131778z();
                VDraweeView vDraweeView = this.f25637a;
                if (zM131778z) {
                    vDraweeView.setImageResource(dbc0.f86718X5);
                } else {
                    vDraweeView.setImageResource(dbc0.f86686W5);
                }
                if (user != null) {
                    this.f25639c.m42933c(user, null);
                    bnl0.m105524M(this.f25639c, true);
                    bnl0.m105524M(this.f25640d, true);
                    return;
                }
                break;
            case "fake_conversation_blindbox_enter":
                GrowthBlindBoxInfo growthBlindBoxInfoM113537D3 = CoreModule.f18264c.f20347S1.m113537D3();
                if (gra.m131778z()) {
                    this.f25637a.setImageResource(dbc0.f86302K5);
                    break;
                } else {
                    if (!TextUtils.isEmpty(growthBlindBoxInfoM113537D3.icon)) {
                        uqb0.f180374G.m127115L0(this.f25637a, growthBlindBoxInfoM113537D3.icon);
                    } else {
                        this.f25637a.setImageResource(dbc0.f86270J5);
                    }
                    break;
                }
                break;
            case "fake_conversation_surprise_gift_box":
                boolean zM131778z2 = gra.m131778z();
                VDraweeView vDraweeView2 = this.f25637a;
                if (zM131778z2) {
                    vDraweeView2.setImageResource(dbc0.f86881c6);
                } else {
                    vDraweeView2.setImageResource(dbc0.f86848b6);
                }
                String str2 = CoreModule.f18264c.f20401k2.f118669b0.get();
                if (!TextUtils.isEmpty(str2)) {
                    this.f25639c.m42934d(str2);
                    bnl0.m105524M(this.f25639c, true);
                    bnl0.m105524M(this.f25640d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_featured":
                boolean zM131778z3 = gra.m131778z();
                VDraweeView vDraweeView3 = this.f25637a;
                if (zM131778z3) {
                    vDraweeView3.setImageResource(dbc0.f86287Jm);
                } else {
                    vDraweeView3.setImageResource(dbc0.f86255Im);
                }
                if (user != null) {
                    this.f25639c.m42933c(user, null);
                    bnl0.m105524M(this.f25639c, true);
                    bnl0.m105524M(this.f25640d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_like_enter":
                boolean zM131778z4 = gra.m131778z();
                VDraweeView vDraweeView4 = this.f25637a;
                if (zM131778z4) {
                    vDraweeView4.setImageResource(dbc0.f87029gn);
                } else {
                    vDraweeView4.setImageResource(dbc0.f86996fn);
                }
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter != null && expandedProfileLikeCounter.profileLikeComment != null) {
                    u46Var.mo68557c(m41936i(), CoreModule.f18264c.f20381e0.m116483Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new C20291td()).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.kc6
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f125026a.m41941m((User) obj);
                        }
                    }));
                    bnl0.m105524M(this.f25639c, true);
                    bnl0.m105524M(this.f25640d, true);
                    return;
                }
                break;
        }
        bnl0.m105524M(this.f25639c, false);
        bnl0.m105524M(this.f25640d, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    public void m41946r(@NonNull u46 u46Var, @NonNull final Conversation conversation, User user, Message message) throws IOException {
        if (conversation.f56859id.startsWith("-")) {
            sj6 sj6Var = new sj6(new NewConversationItemView(getContext()), u46Var, conversation);
            sj6Var.f168928c = CoreModule.f18264c.f20381e0.m116600p9();
            sj6Var.f168927b = user;
            this.f25643g.setText(String.format("%s：%s", user.name, kj6.m150011g().m150017h(sj6Var, message)));
        }
        String str = conversation.f56859id;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1668840627:
                if (str.equals("fake_conversation_oof_enter")) {
                    b = 0;
                }
                break;
            case -1638960895:
                if (str.equals("fake_conversation_blindbox_enter")) {
                    b = 1;
                }
                break;
            case 400234560:
                if (str.equals("fake_conversation_surprise_gift_box")) {
                    b = 2;
                }
                break;
            case 1128979158:
                if (str.equals("fake_conversation_profile_featured")) {
                    b = 3;
                }
                break;
            case 1331962124:
                if (str.equals("fake_conversation_oof_pick")) {
                    b = 4;
                }
                break;
            case 1977268440:
                if (str.equals("fake_conversation_profile_like_enter")) {
                    b = 5;
                }
                break;
        }
        switch (b) {
            case 0:
                VText vText = this.f25643g;
                if (user != null) {
                    vText.setText(String.format("极限四选一%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                } else {
                    vText.setText("极限四选一：下一轮请明天再来");
                }
                break;
            case 1:
                this.f25643g.setText(String.format("%s：%s", CoreModule.f18264c.f20347S1.m113537D3().title, CoreModule.f18264c.f20347S1.m113537D3().subTitle));
                break;
            case 2:
                Long l2 = CoreModule.f18264c.f20401k2.f118666Y.get();
                this.f25643g.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.f18264c.f20427t1.m32510k(l2.longValue() - pzi0.m174454o())));
                CoreModule.f18264c.f20427t1.m32518t(this);
                RunnableC4884c0.a aVar = new RunnableC4884c0.a();
                this.f25646j = aVar;
                aVar.m32520a(true).m32526g("fake_conversation_surprise_gift_box").m32523d(this).m32525f(l2.longValue());
                CoreModule.f18264c.f20427t1.m32516r(this.f25646j);
                break;
            case 3:
                this.f25643g.setText(String.format("精选专区：来看看今日为你推荐的优质%s!", ConversationItemFriendMoments.getTA()));
                break;
            case 4:
                this.f25643g.setText(String.format("收到的Pick%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                break;
            case 5:
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null) {
                    this.f25643g.setText("资料点赞：还未收到称赞");
                } else {
                    u46Var.mo68557c(m41936i(), CoreModule.f18264c.f20381e0.m116483Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new C20291td()).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.lc6
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f131276a.m41942n(conversation, (User) obj);
                        }
                    }));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m41947s(Conversation conversation) {
        if (pzi0.m174454o() - this.f25647k.get() <= 500) {
            return;
        }
        this.f25647k.set(pzi0.m174454o());
        i4g0.m138492A("e_subscription_content", OMSDialogPositon.p_messages_view, jyb.m147494Y("red_dot_state", CoreModule.f18264c.f20381e0.f89010C5.get().longValue() < ((long) conversation.latestTime) ? "1" : "0"));
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals("fake_conversation_surprise_gift_box", str) && (vText = this.f25643g) != null) {
            if (j3 >= j) {
                vText.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.f18264c.f20427t1.m32510k(j3 - j)));
            } else {
                CoreModule.f18264c.f20427t1.m32518t(this);
                och0.m167215a();
            }
        }
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25647k = new AtomicLong();
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25647k = new AtomicLong();
    }
}
