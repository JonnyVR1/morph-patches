package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p000p1.mobile.putong.core.newui.messages.teamgroup.TeamGroupAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicLong;
import l.c4g0;
import l.e30;
import l.g4h0;
import l.j760;
import l.jb6;
import l.jo0;
import l.mkd0;
import l.oa8;
import l.qib0;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.yd;
import l.zvf0;
import p009l.hi6;
import p009l.mqi0;
import p009l.p36;
import p009l.pi6;
import p009l.q860;
import p009l.rd6;
import rx.schedulers.Schedulers;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemTeamGroup extends LinearLayout implements c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3673a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3674b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f3675c;

    /* JADX INFO: renamed from: d */
    public View f3676d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f3677e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f3678f;

    /* JADX INFO: renamed from: g */
    public VText f3679g;

    /* JADX INFO: renamed from: h */
    public TextView f3680h;

    /* JADX INFO: renamed from: i */
    public VText f3681i;

    /* JADX INFO: renamed from: j */
    public c0.a f3682j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f3683k;

    /* JADX INFO: renamed from: l */
    public c4g0 f3684l;

    public ConversationItemTeamGroup(Context context) {
        super(context);
        this.f3683k = new AtomicLong();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Conversation m5018a(q860 q860Var) {
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.f19068a)) {
            return null;
        }
        return (Conversation) q860Var.f19068a.get(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5020c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ xaj0 m5022e(Conversation conversation) {
        User userOa = CoreModule.c.e0.oa(conversation.otherUser);
        return xaj0.a(conversation, userOa, rd6.m21522t(CoreModule.k.c.Z(((DbObject) conversation).id, conversation.clearedTime, CoreModule.c.f0.jg(((DbObject) conversation).id, true)).j(), userOa));
    }

    /* JADX INFO: renamed from: i */
    private Act m5025i() {
        return getContext();
    }

    /* JADX INFO: renamed from: h */
    public final void m5026h(View view) {
        jb6.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m5027j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5028k(Conversation conversation, p36 p36Var, View view) {
        m5025i().startActivity(TeamGroupAct.m6720Z1(m5025i()));
        zvf0.u("e_subscription_content", "p_messages_view", new j760[]{vwb.Y("red_dot_state", ((Long) CoreModule.c.e0.C5.get()).longValue() < ((long) conversation.latestTime) ? "1" : "0")});
        m5032o(p36Var, conversation);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5029l(p36 p36Var, xaj0 xaj0Var) {
        m5033p(p36Var, (Conversation) xaj0Var.a, (User) xaj0Var.b, (Message) xaj0Var.c);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m5030m(User user) {
        this.f3675c.m6064c(user, null);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m5031n(Conversation conversation, User user) {
        this.f3679g.setText(String.format("收到的称赞：%s%s", m5027j(user.name), conversation.profileLikeInfo.profileLikeComment.comment));
    }

    /* JADX INFO: renamed from: o */
    public void m5032o(@NonNull final p36 p36Var, @NonNull final Conversation conversation) {
        CoreModule.c.t1.u("fake_conversation_surprise_gift_box");
        this.f3678f.setText("订阅内容");
        this.f3680h.setText(mqi0.m18538G(conversation.latestTime));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.cb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10490a.m5028k(conversation, p36Var, view);
            }
        });
        mkd0.z(this.f3684l);
        this.f3684l = p36Var.c(m5025i(), CoreModule.c.f0.df().map(new w9j() { // from class: l.db6
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m5018a((q860) obj);
            }
        }).filter(new oa8()).observeOn(Schedulers.io()).map(new w9j() { // from class: l.eb6
            public final Object call(Object obj) {
                return ConversationItemTeamGroup.m5022e((Conversation) obj);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.fb6
            public final void call(Object obj) {
                this.f12900a.m5029l(p36Var, (xaj0) obj);
            }
        }, new e30() { // from class: l.gb6
            public final void call(Object obj) {
                ConversationItemTeamGroup.m5020c((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5026h(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(pi6.f18601Q, this.f3673a);
            rd6.m21518k0(this.f3678f, this.f3680h);
            rd6.m21514e0(this.f3679g);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5033p(p36 p36Var, @NonNull Conversation conversation, User user, Message message) {
        if (((Long) CoreModule.c.e0.C5.get()).longValue() < ((long) conversation.latestTime)) {
            xdl0.M(this.f3681i, true);
            m5034q(p36Var, conversation, user);
        } else {
            boolean z = upa.z();
            VDraweeView vDraweeView = this.f3673a;
            if (z) {
                vDraweeView.setImageResource(x2c0.d6);
            } else {
                vDraweeView.setImageResource(x2c0.c6);
            }
            xdl0.M(this.f3681i, false);
            xdl0.M(this.f3675c, false);
            xdl0.M(this.f3676d, false);
        }
        m5035r(p36Var, conversation, user, message);
        m5036s(conversation);
    }

    /* JADX INFO: renamed from: q */
    public void m5034q(@NonNull p36 p36Var, @NonNull Conversation conversation, User user) {
        if (((DbObject) conversation).id.startsWith("-")) {
            qib0.G.L0(this.f3673a, user.fp().profileSmall().formatted());
        }
        String str = ((DbObject) conversation).id;
        str.getClass();
        switch (str) {
            case "fake_conversation_oof_enter":
            case "fake_conversation_oof_pick":
                boolean z = upa.z();
                VDraweeView vDraweeView = this.f3673a;
                if (z) {
                    vDraweeView.setImageResource(x2c0.W5);
                } else {
                    vDraweeView.setImageResource(x2c0.V5);
                }
                if (user != null) {
                    this.f3675c.m6064c(user, null);
                    xdl0.M(this.f3675c, true);
                    xdl0.M(this.f3676d, true);
                    return;
                }
                break;
            case "fake_conversation_blindbox_enter":
                GrowthBlindBoxInfo growthBlindBoxInfoD3 = CoreModule.c.S1.D3();
                if (upa.z()) {
                    this.f3673a.setImageResource(x2c0.J5);
                    break;
                } else {
                    if (!TextUtils.isEmpty(growthBlindBoxInfoD3.icon)) {
                        qib0.G.L0(this.f3673a, growthBlindBoxInfoD3.icon);
                    } else {
                        this.f3673a.setImageResource(x2c0.I5);
                    }
                    break;
                }
                break;
            case "fake_conversation_surprise_gift_box":
                boolean z2 = upa.z();
                VDraweeView vDraweeView2 = this.f3673a;
                if (z2) {
                    vDraweeView2.setImageResource(x2c0.b6);
                } else {
                    vDraweeView2.setImageResource(x2c0.a6);
                }
                String str2 = (String) CoreModule.c.k2.b0.get();
                if (!TextUtils.isEmpty(str2)) {
                    this.f3675c.m6065d(str2);
                    xdl0.M(this.f3675c, true);
                    xdl0.M(this.f3676d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_featured":
                boolean z3 = upa.z();
                VDraweeView vDraweeView3 = this.f3673a;
                if (z3) {
                    vDraweeView3.setImageResource(x2c0.Vl);
                } else {
                    vDraweeView3.setImageResource(x2c0.Ul);
                }
                if (user != null) {
                    this.f3675c.m6064c(user, null);
                    xdl0.M(this.f3675c, true);
                    xdl0.M(this.f3676d, true);
                    return;
                }
                break;
            case "fake_conversation_profile_like_enter":
                boolean z4 = upa.z();
                VDraweeView vDraweeView4 = this.f3673a;
                if (z4) {
                    vDraweeView4.setImageResource(x2c0.sm);
                } else {
                    vDraweeView4.setImageResource(x2c0.rm);
                }
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter != null && expandedProfileLikeCounter.profileLikeComment != null) {
                    p36Var.c(m5025i(), CoreModule.c.e0.Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new yd()).take(1)).subscribe(mkd0.G(new e30() { // from class: l.hb6
                        public final void call(Object obj) {
                            this.f13939a.m5030m((User) obj);
                        }
                    }));
                    xdl0.M(this.f3675c, true);
                    xdl0.M(this.f3676d, true);
                    return;
                }
                break;
        }
        xdl0.M(this.f3675c, false);
        xdl0.M(this.f3676d, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    public void m5035r(@NonNull p36 p36Var, @NonNull final Conversation conversation, User user, Message message) {
        if (((DbObject) conversation).id.startsWith("-")) {
            pi6 pi6Var = new pi6(new NewConversationItemView(getContext()), p36Var, conversation);
            pi6Var.f18624c = CoreModule.c.e0.p9();
            pi6Var.f18623b = user;
            this.f3679g.setText(String.format("%s：%s", user.name, hi6.m15844g().m15850h(pi6Var, message)));
        }
        String str = ((DbObject) conversation).id;
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
                VText vText = this.f3679g;
                if (user != null) {
                    vText.setText(String.format("极限四选一%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                } else {
                    vText.setText("极限四选一：下一轮请明天再来");
                }
                break;
            case 1:
                this.f3679g.setText(String.format("%s：%s", CoreModule.c.S1.D3().title, CoreModule.c.S1.D3().subTitle));
                break;
            case 2:
                Long l2 = (Long) CoreModule.c.k2.Y.get();
                this.f3679g.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.c.t1.k(l2.longValue() - mqi0.m18550o())));
                CoreModule.c.t1.t(this);
                c0.a aVar = new c0.a();
                this.f3682j = aVar;
                aVar.a(true).g("fake_conversation_surprise_gift_box").d(this).f(l2.longValue());
                CoreModule.c.t1.r(this.f3682j);
                break;
            case 3:
                this.f3679g.setText(String.format("精选专区：来看看今日为你推荐的优质%s!", ConversationItemFriendMoments.getTA()));
                break;
            case 4:
                this.f3679g.setText(String.format("收到的Pick%s", TextUtils.isEmpty(conversation.localExtraInfo) ? "" : "：" + conversation.localExtraInfo));
                break;
            case 5:
                ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
                if (expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null) {
                    this.f3679g.setText("资料点赞：还未收到称赞");
                } else {
                    p36Var.c(m5025i(), CoreModule.c.e0.Ka(conversation.profileLikeInfo.profileLikeComment.userId).filter(new yd()).take(1)).subscribe(mkd0.G(new e30() { // from class: l.ib6
                        public final void call(Object obj) {
                            this.f14466a.m5031n(conversation, (User) obj);
                        }
                    }));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5036s(Conversation conversation) {
        if (mqi0.m18550o() - this.f3683k.get() <= 500) {
            return;
        }
        this.f3683k.set(mqi0.m18550o());
        zvf0.A("e_subscription_content", "p_messages_view", new j760[]{vwb.Y("red_dot_state", ((Long) CoreModule.c.e0.C5.get()).longValue() < ((long) conversation.latestTime) ? "1" : "0")});
    }

    /* JADX INFO: renamed from: u */
    public void m5037u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals("fake_conversation_surprise_gift_box", str) && (vText = this.f3679g) != null) {
            if (j3 >= j) {
                vText.setText(String.format("惊喜礼盒：剩余有效期 %s", CoreModule.c.t1.k(j3 - j)));
            } else {
                CoreModule.c.t1.t(this);
                g4h0.a();
            }
        }
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3683k = new AtomicLong();
    }

    public ConversationItemTeamGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3683k = new AtomicLong();
    }
}
