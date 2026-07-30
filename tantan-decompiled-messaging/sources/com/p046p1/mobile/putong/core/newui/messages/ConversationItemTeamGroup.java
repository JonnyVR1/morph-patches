package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p046p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p046p1.mobile.putong.core.newui.messages.teamgroup.TeamGroupAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.schedulers.Schedulers;
import p147v.VDraweeView;
import p147v.VText;
import p149l.C21368yd;
import p149l.c4g0;
import p149l.e30;
import p149l.g4h0;
import p149l.hi6;
import p149l.jb6;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.oa8;
import p149l.p36;
import p149l.pi6;
import p149l.q860;
import p149l.qib0;
import p149l.rd6;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemTeamGroup extends LinearLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24895a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f24896b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f24897c;

    /* JADX INFO: renamed from: d */
    public View f24898d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f24899e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f24900f;

    /* JADX INFO: renamed from: g */
    public VText f24901g;

    /* JADX INFO: renamed from: h */
    public TextView f24902h;

    /* JADX INFO: renamed from: i */
    public VText f24903i;

    /* JADX INFO: renamed from: j */
    public RunnableC4733c0.a f24904j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f24905k;

    /* JADX INFO: renamed from: l */
    public c4g0 f24906l;

    public ConversationItemTeamGroup(Context context) {
        super(context);
        this.f24905k = new AtomicLong();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Conversation m40918a(q860 q860Var) {
        if (!NullChecker.m81303a(q860Var) || vwb.m200296J(q860Var.f153135a)) {
            return null;
        }
        return (Conversation) q860Var.f153135a.get(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m40920c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ xaj0 m40922e(Conversation conversation) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(conversation.otherUser);
        return xaj0.m207578a(conversation, userM169524oa, rd6.m178881t(CoreModule.f17553k.f91940c.m206068Z(conversation.f56011id, conversation.clearedTime, CoreModule.f17545c.f19642f0.m33001jg(conversation.f56011id, true)).m165617j(), userM169524oa));
    }

    /* JADX INFO: renamed from: i */
    private Act m40925i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final void m40926h(View view) {
        jb6.m140741a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m40927j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m40928k(Conversation conversation, p36 p36Var, View view) {
        m40925i().startActivity(TeamGroupAct.m42559Z1(m40925i()));
        zvf0.m220399u("e_subscription_content", OMSDialogPositon.p_messages_view, vwb.m200311Y("red_dot_state", CoreModule.f17545c.f19639e0.f149153C5.get().longValue() < ((long) conversation.latestTime) ? "1" : "0"));
        m40932o(p36Var, conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40929l(p36 p36Var, xaj0 xaj0Var) {
        m40933p(p36Var, (Conversation) xaj0Var.f191751a, (User) xaj0Var.f191752b, (Message) xaj0Var.f191753c);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m40930m(User user) {
        this.f24897c.m41922c(user, null);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m40931n(Conversation conversation, User user) {
        this.f24901g.setText(String.format("收到的称赞：%s%s", m40927j(user.name), conversation.profileLikeInfo.profileLikeComment.comment));
    }

    /* JADX INFO: renamed from: o */
    public void m40932o(@NonNull final p36 p36Var, @NonNull final Conversation conversation) {
        CoreModule.f17545c.f19685t1.m31516u("fake_conversation_surprise_gift_box");
        this.f24900f.setText("订阅内容");
        this.f24902h.setText(mqi0.m155932G(conversation.latestTime));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.cb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80104a.m40928k(conversation, p36Var, view);
            }
        });
        mkd0.m154992z(this.f24906l);
        this.f24906l = p36Var.mo67374c(m40925i(), CoreModule.f17545c.f19642f0.m32928df().map(new w9j() { // from class: l.db6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m40918a((q860) obj);
            }
        }).filter(new oa8()).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.eb6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m40922e((Conversation) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.fb6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96696a.m40929l(p36Var, (xaj0) obj);
            }
        }, new e30() { // from class: l.gb6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemTeamGroup.m40920c((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40926h(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(pi6.f149080Q, this.f24895a);
            rd6.m178877k0(this.f24900f, this.f24902h);
            rd6.m178873e0(this.f24901g);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m40933p(p36 p36Var, @NonNull Conversation conversation, User user, Message message) {
        if (CoreModule.f17545c.f19639e0.f149153C5.get().longValue() < ((long) conversation.latestTime)) {
            xdl0.m208344M(this.f24903i, true);
            m40934q(p36Var, conversation, user);
        } else {
            boolean zM194847z = upa.m194847z();
            VDraweeView vDraweeView = this.f24895a;
            if (zM194847z) {
                vDraweeView.setImageResource(x2c0.f190068d6);
            } else {
                vDraweeView.setImageResource(x2c0.f190036c6);
            }
            xdl0.m208344M(this.f24903i, false);
            xdl0.m208344M(this.f24897c, false);
            xdl0.m208344M(this.f24898d, false);
        }
        m40935r(p36Var, conversation, user, message);
        m40936s(conversation);
    }

    /* JADX INFO: renamed from: q */
    public void m40934q(@NonNull p36 p36Var, @NonNull Conversation conversation, User user) {
        if (conversation.f56011id.startsWith("-")) {
            qib0.f154691G.m102331L0(this.f24895a, user.m60124fp().profileSmall().formatted());
        }
        String str = conversation.f56011id;
        str.getClass();
        switch (str) {
            case "fake_conversation_oof_enter":
            case "fake_conversation_oof_pick":
                boolean zM194847z = upa.m194847z();
                VDraweeView vDraweeView = this.f24895a;
                if (zM194847z) {
                    vDraweeView.setImageResource(x2c0.f189847W5);
                } else {
                    vDraweeView.setImageResource(x2c0.f189816V5);
                }
                if (user != null) {
                    this.f24897c.m41922c(user, null);
                    xdl0.m208344M(this.f24897c, true);
                    xdl0.m208344M(this.f24898d, true);
                    return;
                }
                break;
            case "fake_conversation_blindbox_enter":
                GrowthBlindBoxInfo growthBlindBoxInfoM200713D3 = CoreModule.f17545c.f19605S1.m200713D3();
                if (upa.m194847z()) {
                    this.f24895a.setImageResource(x2c0.f189444J5);
                    break;
                } else {
                    if (!TextUtils.isEmpty(growthBlindBoxInfoM200713D3.icon)) {
                        qib0.f154691G.m102331L0(this.f24895a, growthBlindBoxInfoM200713D3.icon);
                    } else {
                        this.f24895a.setImageResource(x2c0.f189413I5);
                    }
                    break;
                }
                break;
            case "fake_conversation_surprise_gift_box":
                boolean zM194847z2 = upa.m194847z();
                VDraweeView vDraweeView2 = this.f24895a;
                if (zM194847z2) {
                    vDraweeView2.setImageResource(x2c0.f190004b6);
                } else {
                    vDraweeView2.setImageResource(x2c0.f189972a6);
                }
                String str2 = CoreModule.f17545c.f19659k2.f184666b0.get();
                if (!TextUtils.isEmpty(str2)) {
                    this.f24897c.m41923d(str2);
                    xdl0.m208344M(this.f24897c, true);
                    xdl0.m208344M(this.f24898d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_featured":
                boolean zM194847z3 = upa.m194847z();
                VDraweeView vDraweeView3 = this.f24895a;
                if (zM194847z3) {
                    vDraweeView3.setImageResource(x2c0.f189832Vl);
                } else {
                    vDraweeView3.setImageResource(x2c0.f189801Ul);
                }
                if (user != null) {
                    this.f24897c.m41922c(user, null);
                    xdl0.m208344M(this.f24897c, true);
                    xdl0.m208344M(this.f24898d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_like_enter":
                boolean zM194847z4 = upa.m194847z();
                VDraweeView vDraweeView4 = this.f24895a;
                if (zM194847z4) {
                    vDraweeView4.setImageResource(x2c0.f190561sm);
                } else {
                    vDraweeView4.setImageResource(x2c0.f190529rm);
                }
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter != null && expandedProfileLikeCounter.profileLikeComment != null) {
                    p36Var.mo67374c(m40925i(), CoreModule.f17545c.f19639e0.m169410Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new C21368yd()).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.hb6
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f106905a.m40930m((User) obj);
                        }
                    }));
                    xdl0.m208344M(this.f24897c, true);
                    xdl0.m208344M(this.f24898d, true);
                    return;
                }
                break;
        }
        xdl0.m208344M(this.f24897c, false);
        xdl0.m208344M(this.f24898d, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    public void m40935r(@NonNull p36 p36Var, @NonNull final Conversation conversation, User user, Message message) {
        if (conversation.f56011id.startsWith("-")) {
            pi6 pi6Var = new pi6(new NewConversationItemView(getContext()), p36Var, conversation);
            pi6Var.f149103c = CoreModule.f17545c.f19639e0.m169527p9();
            pi6Var.f149102b = user;
            this.f24901g.setText(String.format("%s：%s", user.name, hi6.m131202g().m131208h(pi6Var, message)));
        }
        String str = conversation.f56011id;
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
                VText vText = this.f24901g;
                if (user != null) {
                    vText.setText(String.format("极限四选一%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                } else {
                    vText.setText("极限四选一：下一轮请明天再来");
                }
                break;
            case 1:
                this.f24901g.setText(String.format("%s：%s", CoreModule.f17545c.f19605S1.m200713D3().title, CoreModule.f17545c.f19605S1.m200713D3().subTitle));
                break;
            case 2:
                Long l2 = CoreModule.f17545c.f19659k2.f184663Y.get();
                this.f24901g.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.f17545c.f19685t1.m31507k(l2.longValue() - mqi0.m155944o())));
                CoreModule.f17545c.f19685t1.m31515t(this);
                RunnableC4733c0.a aVar = new RunnableC4733c0.a();
                this.f24904j = aVar;
                aVar.m31517a(true).m31523g("fake_conversation_surprise_gift_box").m31520d(this).m31522f(l2.longValue());
                CoreModule.f17545c.f19685t1.m31513r(this.f24904j);
                break;
            case 3:
                this.f24901g.setText(String.format("精选专区：来看看今日为你推荐的优质%s!", ConversationItemFriendMoments.getTA()));
                break;
            case 4:
                this.f24901g.setText(String.format("收到的Pick%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                break;
            case 5:
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null) {
                    this.f24901g.setText("资料点赞：还未收到称赞");
                } else {
                    p36Var.mo67374c(m40925i(), CoreModule.f17545c.f19639e0.m169410Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new C21368yd()).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.ib6
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f112350a.m40931n(conversation, (User) obj);
                        }
                    }));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40936s(Conversation conversation) {
        if (mqi0.m155944o() - this.f24905k.get() <= 500) {
            return;
        }
        this.f24905k.set(mqi0.m155944o());
        zvf0.m220368A("e_subscription_content", OMSDialogPositon.p_messages_view, vwb.m200311Y("red_dot_state", CoreModule.f17545c.f19639e0.f149153C5.get().longValue() < ((long) conversation.latestTime) ? "1" : "0"));
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals("fake_conversation_surprise_gift_box", str) && (vText = this.f24901g) != null) {
            if (j3 >= j) {
                vText.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.f17545c.f19685t1.m31507k(j3 - j)));
            } else {
                CoreModule.f17545c.f19685t1.m31515t(this);
                g4h0.m124369a();
            }
        }
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24905k = new AtomicLong();
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24905k = new AtomicLong();
    }
}
