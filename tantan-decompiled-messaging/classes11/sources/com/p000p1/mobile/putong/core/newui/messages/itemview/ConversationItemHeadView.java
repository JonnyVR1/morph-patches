package com.p000p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p000p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p000p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveScript;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Objects;
import java.util.TimeZone;
import l.bkb0;
import l.e30;
import l.e96;
import l.j2e0;
import l.j760;
import l.ml6;
import l.n3b0;
import l.nvc0;
import l.ogl0;
import l.qib0;
import l.sw6;
import l.t0g0;
import l.t100;
import l.u4c0;
import l.u59;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.cpl;
import p009l.f56;
import p009l.mqi0;
import p009l.p36;
import p009l.pi6;
import p009l.r6n;
import p009l.rd6;
import p009l.tzs;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemHeadView extends FrameLayout implements cpl, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationItemHeadView f4599a;

    /* JADX INFO: renamed from: b */
    public LiveHaloAvatar f4600b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f4601c;

    /* JADX INFO: renamed from: d */
    public View f4602d;

    /* JADX INFO: renamed from: e */
    public View f4603e;

    /* JADX INFO: renamed from: f */
    public View f4604f;

    /* JADX INFO: renamed from: g */
    public NewTalkProgressView f4605g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f4606h;

    /* JADX INFO: renamed from: i */
    public VImage f4607i;

    /* JADX INFO: renamed from: j */
    public VImage f4608j;

    /* JADX INFO: renamed from: k */
    public VImage f4609k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f4610l;

    /* JADX INFO: renamed from: m */
    public VImage f4611m;

    /* JADX INFO: renamed from: n */
    public VImage f4612n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f4613o;

    /* JADX INFO: renamed from: p */
    public VText f4614p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f4615q;

    /* JADX INFO: renamed from: r */
    public pi6 f4616r;

    /* JADX INFO: renamed from: s */
    public final int f4617s;

    public ConversationItemHeadView(@NonNull Context context) {
        super(context);
        this.f4615q = null;
        this.f4617s = upa.z() ? pi6.f18601Q : t100.d(55.0f);
    }

    private void setLivingHead(boolean z) {
        UserLiveLabel userLiveLabelM21558a0;
        if (!m21532H(this.f4616r, z) || rd6.m21519o(this.f4616r.f18622a)) {
            return;
        }
        String anonymousUrl = (vwb.J(this.f4616r.f18623b.pictures) || !NullChecker.a(this.f4616r.f18623b.fp())) ? "" : this.f4616r.f18623b.fp().profileSmall().formatted();
        if (NullChecker.a(this.f4616r.f18622a) && this.f4616r.f18622a.isAnonymous()) {
            anonymousUrl = this.f4616r.f18623b.getAnonymousUrl();
        }
        if (upa.a2()) {
            pi6 pi6Var = this.f4616r;
            userLiveLabelM21558a0 = m21558a0(pi6Var, m21552V0(pi6Var.f18626e));
            String strM21577r0 = m21577r0(this.f4616r);
            if (!TextUtils.isEmpty(strM21577r0)) {
                anonymousUrl = strM21577r0;
            }
        } else {
            userLiveLabelM21558a0 = (UserLiveLabel) getUserLiveLabelHashMap().get(((DbObject) this.f4616r.f18623b).id);
        }
        m6588k1(userLiveLabelM21558a0, anonymousUrl);
        xdl0.M(this.f4605g, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: A */
    public void mo5088A(pi6 pi6Var) {
        this.f4616r = pi6Var;
        this.f4615q.setOnClickListener(this);
        xdl0.M(this.f4605g, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo6574G0(pi6 pi6Var) {
        this.f4616r = pi6Var;
        qib0.G.N0(this.f4615q, upa.Z(pi6Var.f18624c), false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: J */
    public void mo6556J(pi6 pi6Var) {
        this.f4616r = pi6Var;
        boolean zEquals = TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_anonymous_greeting");
        this.f4615q.setOnClickListener(null);
        this.f4615q.setClickable(false);
        this.f4609k.setVisibility(8);
        int i = upa.z() ? x2c0.Jf : x2c0.E6;
        if (zEquals) {
            i = x2c0.q0;
        }
        if (u59.T()) {
            xdl0.M(this.f4607i, false);
            i = x2c0.y9;
        }
        qib0.G.Y0(this.f4615q, i);
        this.f4615q.setBackgroundResource(i);
        this.f4601c.m10016G0(false);
        if (pi6Var.f18622a.additional.kankan.greetingSummaryDetail.unseen <= 0 || m21528D(pi6Var)) {
            return;
        }
        xdl0.M(this.f4608j, true);
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: K0 */
    public boolean mo6575K0() {
        Conversation conversation = this.f4616r.f18622a;
        return false;
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: P */
    public void mo6576P(pi6 pi6Var) {
        Message message;
        this.f4616r = pi6Var;
        pi6Var.f18611F.set(pi6Var.f18613H);
        if (pi6Var.f18642u && TextUtils.equals(pi6Var.f18639r, CoreModule.H().userId())) {
            qib0.G.Q0(this.f4615q, m21540N0(CoreModule.c.e0.p9()));
        } else if (pi6Var.f18613H == 0 || (message = pi6Var.f18614I) == null) {
            this.f4615q.setBackgroundResource(0);
            this.f4615q.setPadding(0, 0, 0, 0);
            qib0.G.Y0(this.f4615q, x2c0.Po);
        } else {
            User userPa = CoreModule.c.e0.Pa(message.cid);
            VDraweeView vDraweeView = this.f4615q;
            int i = t100.e;
            vDraweeView.setPadding(i, i, i, i);
            this.f4615q.setBackgroundResource(x2c0.It);
            qib0.G.Q0(this.f4615q, m21540N0(userPa));
        }
        m6602w1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo6564Q0(pi6 pi6Var) {
        this.f4616r = pi6Var;
        xdl0.M0(this.f4613o, false);
        xdl0.M(this.f4604f, false);
        m6601v1();
        m6594p1();
        m6590l1();
        if (TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            m6587j1(pi6Var.f18623b);
            return;
        }
        xdl0.M(this.f4611m, false);
        m6591m1();
        m6593o1(pi6Var.f18622a, pi6Var.f18624c, pi6Var.f18606A);
        m6592n1();
        m6595q1();
        if (rd6.m21519o(pi6Var.f18622a)) {
            qib0.G.O(this.f4615q, m21540N0(pi6Var.f18623b).formatted(), 4, 5);
            this.f4601c.m10016G0(false);
        } else if (pi6Var.f18622a.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
        }
        mo6569y0();
        m6602w1();
        m6597r1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: U */
    public void mo6577U(@NonNull pi6 pi6Var) {
        this.f4616r = pi6Var;
        xdl0.M(this.f4600b, false);
        xdl0.M(this.f4602d, false);
        xdl0.M0(this.f4603e, false);
        xdl0.M(this.f4605g, false);
        xdl0.M(this.f4606h, false);
        xdl0.M(this.f4611m, false);
        xdl0.M(this.f4612n, false);
        xdl0.M(this.f4613o, false);
        xdl0.M(this.f4601c.get_frame(), false);
        ViewGroup.LayoutParams layoutParams = this.f4615q.getLayoutParams();
        int i = this.f4617s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f4615q.setLayoutParams(layoutParams);
        qib0.G.Y0(this.f4615q, x2c0.T5);
        xdl0.M(this.f4601c, true);
        xdl0.M(this.f4615q, true);
        this.f4615q.setOnClickListener(null);
        this.f4615q.setClickable(false);
        m6584g1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo6578X0(final pi6 pi6Var) {
        this.f4616r = pi6Var;
        xdl0.E0(this.f4615q, new View.OnClickListener() { // from class: l.d96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pi6Var.f18609D.performClick();
            }
        });
        xdl0.M(this.f4602d, true);
        this.f4602d.setBackgroundResource(x2c0.s5);
        boolean zIsMe = pi6Var.f18623b.isMe();
        HeaderFrameWrapper headerFrameWrapper = this.f4601c;
        if (zIsMe) {
            headerFrameWrapper.m10034z0(x2c0.t5);
        } else {
            headerFrameWrapper.m10013B0(((Media) pi6Var.f18623b.fp()).url);
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: d */
    public void mo6579d(pi6 pi6Var) {
        this.f4616r = pi6Var;
        if (NullChecker.a(pi6Var.f18623b)) {
            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    @Override // p009l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo6580d0(pi6 pi6Var) {
        this.f4616r = pi6Var;
        xdl0.M(this.f4605g, false);
        Conversation conversation = pi6Var.f18622a;
        if (pi6Var.f18642u && TextUtils.equals(pi6Var.f18639r, CoreModule.H().userId())) {
            User userP9 = CoreModule.c.e0.p9();
            if (conversation.isAnonymous()) {
                qib0.G.L0(this.f4615q, userP9.getAnonymousUrl());
            } else {
                qib0.G.Q0(this.f4615q, m21540N0(userP9));
            }
        } else if (upa.t1()) {
            if (NullChecker.a(pi6Var.f18623b)) {
                User user = pi6Var.f18623b;
                if (!user.inactivated && !user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                    if (NullChecker.a(conversation.additional)) {
                        if (conversation.isAnonymous()) {
                            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
                        } else {
                            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
                        }
                    } else if (conversation.isAnonymous()) {
                        qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
                    } else {
                        qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
                    }
                }
            }
            qib0.G.Y0(this.f4615q, x2c0.ad);
        } else if (NullChecker.a(conversation.additional) || !NullChecker.a(conversation.additional.quickChat)) {
            if (conversation.isAnonymous() || !NullChecker.a(pi6Var.f18623b)) {
                qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
            } else {
                qib0.G.L0(this.f4615q, pi6Var.f18623b.getAnonymousUrl());
            }
        } else if (conversation.additional.quickChat.avatarBlurred) {
            j760 j760VarZ = a.z(0);
            qib0.G.O(this.f4615q, m21540N0(pi6Var.f18623b).formatted(), ((Integer) j760VarZ.a).intValue(), ((Integer) j760VarZ.b).intValue());
        } else if (conversation.isAnonymous()) {
            qib0.G.L0(this.f4615q, pi6Var.f18623b.getAnonymousUrl());
        } else {
            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
        }
        m6602w1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m6581d1(View view) {
        e96.a(this, view);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: e */
    public void mo6568e(pi6 pi6Var) {
        boolean z;
        this.f4616r = pi6Var;
        if (pi6Var.f18642u && NullChecker.a(pi6Var.f18644w)) {
            qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18644w));
        } else if (vwb.J(pi6Var.f18607B.avatars)) {
            qib0.G.Y0(this.f4615q, x2c0.l8);
        } else {
            qib0.G.Z0(this.f4615q, ((Picture) pi6Var.f18607B.avatars.get(0)).cover().profileSmall().formatted());
        }
        Conversation conversation = pi6Var.f18622a;
        if (conversation.muted) {
            xdl0.M(this.f4608j, conversation.unreadMessages > 0 && !m21528D(pi6Var));
            z = true;
        } else {
            z = false;
        }
        xdl0.M(this.f4613o, false);
        if (!z && pi6Var.f18622a.unreadMessages > 0 && !m21528D(pi6Var)) {
            xdl0.M(this.f4613o, true);
            String strF = t0g0.f(pi6Var.f18622a.unreadMessages);
            if (!TextUtils.isEmpty(strF)) {
                this.f4614p.setText(strF);
            }
        }
        if (!pi6Var.f18607B.ownerUserId.equals(((DbObject) CoreModule.K().me_()).id)) {
            User userNew_ = User.new_();
            ((DbObject) userNew_).id = pi6Var.f18607B.ownerUserId;
            pi6Var.f18623b = userNew_;
            setLivingHead(false);
        }
        mo6569y0();
        m6602w1();
        m6597r1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m6582e1() {
        if (upa.a2()) {
            return;
        }
        boolean zIsClickable = this.f4615q.isClickable();
        VDraweeView vDraweeView = this.f4615q;
        if (!zIsClickable) {
            vDraweeView.isClickable();
        } else {
            xdl0.E0(vDraweeView, (View.OnClickListener) null);
            this.f4615q.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m6583f1() {
        int iLongValue = (int) ((((Long) CoreModule.c.f0.I0.get()).longValue() / 1000) - (mqi0.m18550o() / 1000));
        final long jLongValue = (((Long) CoreModule.c.f0.I0.get()).longValue() / 1000) - (((Long) CoreModule.c.f0.H0.get()).longValue() / 1000);
        if (iLongValue <= 0 || jLongValue <= 0) {
            m21566h();
            return;
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f4605g.setBitmapRes(x2c0.Jd);
        m21560b(this.f4616r.f18610E, new e30() { // from class: l.c96
            public final void call(Object obj) {
                ((cpl) obj).mo6596r(simpleDateFormat, mqi0.m18550o(), ((Long) CoreModule.c.f0.I0.get()).longValue(), jLongValue);
            }
        });
        c0.a aVar = new c0.a();
        aVar.g("countdown_conv_list_key").a(true).f(((Long) CoreModule.c.f0.I0.get()).longValue()).e(true);
        CoreModule.c.t1.r(aVar);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m6584g1() {
        if (this.f4599a == null) {
            return;
        }
        for (int i = 0; i < this.f4599a.getChildCount(); i++) {
            View childAt = this.f4599a.getChildAt(i);
            int id = childAt.getId();
            if (id == u4c0.g7 || id == u4c0.X6 || id == u4c0.e1 || id == u4c0.jf || id == u4c0.hf || id == u4c0.L7 || id == u4c0.H7) {
                xdl0.M(childAt, false);
            }
        }
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo5108h0(pi6 pi6Var) {
        this.f4616r = pi6Var;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m6585h1(UserLiveLabel userLiveLabel, View view) {
        if (userLiveLabel != null) {
            if (!TextUtils.isEmpty(userLiveLabel.schema)) {
                j2e0.m(this.f4616r.f18645x, Uri.parse(userLiveLabel.schema));
                return;
            }
            if (!"onLive".equals(userLiveLabel.liveState) && !"onMultiCall".equals(userLiveLabel.liveState) && !"onCall".equals(userLiveLabel.liveState)) {
                if ("onVoice".equals(userLiveLabel.liveState)) {
                    CoreModule.Q().m9019M6().m12097p(this.f4616r.f18645x, userLiveLabel.liveId, "conversation", userLiveLabel.userId, null);
                    m21543Q(this.f4616r, userLiveLabel);
                    return;
                }
                return;
            }
            CoreModule.Q().startAudienceLive(this.f4616r.f18645x, userLiveLabel.liveId, "conversation", null);
            if (NullChecker.a(this.f4616r.f18622a) && NullChecker.a(CoreModule.c.g0.h7(this.f4616r.f18622a.otherUser))) {
                m21543Q(this.f4616r, userLiveLabel);
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m6586i1() {
        UserLiveLabel userLiveLabelM21559a1 = m21559a1(this.f4616r);
        if (NullChecker.a(userLiveLabelM21559a1) && !m21555Y(this.f4616r.f18622a) && xdl0.O0(this.f4600b)) {
            m21543Q(this.f4616r, userLiveLabelM21559a1);
            tzs.m22714a(this.f4616r.f18645x, userLiveLabelM21559a1);
        } else if (NullChecker.a(this.f4616r.f18609D)) {
            this.f4616r.f18609D.performClick();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m6587j1(User user) {
        this.f4615q.setBackgroundResource(x2c0.S5);
        this.f4615q.setPadding(t100.d(4.0f), t100.d(4.0f), t100.d(4.0f), t100.d(4.0f));
        if (n3b0.q()) {
            qib0.G.O(this.f4615q, m21540N0(user).formatted(), 4, 5);
            this.f4601c.m10016G0(false);
        } else {
            this.f4601c.m10031v0(user, m21540N0(user));
        }
        xdl0.M(this.f4611m, true);
        if (r6n.m21419f().f19668n.contains(TextUtils.concat(this.f4616r.f18626e ? "matchList" : "chatList", ((DbObject) user).id).toString())) {
            return;
        }
        zvf0.A("e_chat_request", "p_messages_view", new j760[]{vwb.Y("show_where", this.f4616r.f18626e ? "matchList" : "chatList"), vwb.Y("request_show_type", this.f4616r.f18630i), vwb.Y("show_position", (this.f4616r.f18628g + 1) + "/" + ((p36) this.f4616r.f18625d).mo5626h())});
        r6n.m21419f().f19668n.add(TextUtils.concat(this.f4616r.f18626e ? "matchList" : "chatList", ((DbObject) user).id).toString());
    }

    /* JADX INFO: renamed from: k1 */
    public final void m6588k1(@Nullable final UserLiveLabel userLiveLabel, String str) {
        int i = 0;
        while (true) {
            if (i >= this.f4599a.getChildCount()) {
                break;
            }
            View childAt = this.f4599a.getChildAt(i);
            int id = childAt.getId();
            if (id != u4c0.Ke) {
                xdl0.M(childAt, id == u4c0.g7);
            }
            i++;
        }
        xdl0.M(this.f4600b, true);
        if (NullChecker.a(userLiveLabel) && userLiveLabel.isVoiceChat()) {
            this.f4600b.m5793e(-13450309, -13450309);
        } else {
            boolean z = upa.z();
            LiveHaloAvatar liveHaloAvatar = this.f4600b;
            if (z) {
                liveHaloAvatar.m5793e(-38484, -40983);
            } else {
                liveHaloAvatar.m5793e(-38485, -41238);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            ImageRequest imageRequestA = qib0.G.n(str).O(new nvc0(this.f4600b.getAvatarSize(), this.f4600b.getAvatarSize())).a();
            bkb0 bkb0Var = qib0.G;
            LiveHaloAvatar liveHaloAvatar2 = this.f4600b;
            Objects.requireNonNull(liveHaloAvatar2);
            bkb0Var.F(imageRequestA, new f56(liveHaloAvatar2));
        }
        xdl0.E0(this.f4600b, new View.OnClickListener() { // from class: l.a96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9338a.m6585h1(userLiveLabel, view);
            }
        });
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: l0 */
    public void mo6589l0(Conversation conversation, User user, pi6 pi6Var) {
        xdl0.M(this.f4610l, true);
        m6600u1(t100.j, t100.c);
        qib0.G.L0(this.f4610l, user.fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: l1 */
    public final void m6590l1() {
        if (m21527A0(this.f4616r.f18622a)) {
            m6599t1();
            m6598s1();
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m */
    public void mo5114m(pi6 pi6Var) {
        this.f4616r = pi6Var;
        boolean zA2 = upa.a2();
        VDraweeView vDraweeView = this.f4615q;
        if (zA2) {
            xdl0.E0(vDraweeView, this);
            this.f4615q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f4615q.setClickable(false);
        }
        this.f4601c.m10016G0(false);
        m6584g1();
        xdl0.M(this.f4605g, false);
        xdl0.M(this.f4608j, false);
        xdl0.M(this.f4600b, false);
        xdl0.M(this.f4601c, true);
        xdl0.M(this.f4613o, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo5115m0(pi6 pi6Var) {
        xdl0.M(this.f4610l, true);
        m6600u1(t100.j, 0);
        qib0.G.L0(this.f4610l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
        ViewGroup.LayoutParams layoutParams = this.f4615q.getLayoutParams();
        layoutParams.width = t100.d(55.0f);
        layoutParams.height = t100.d(55.0f);
        this.f4615q.setLayoutParams(layoutParams);
        qib0.G.Y0(this.f4615q, x2c0.Dd);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m6591m1() {
        RoundingParams roundingParamsC = RoundingParams.c(t100.i);
        roundingParamsC.v(true);
        this.f4610l.getHierarchy().H(roundingParamsC);
        if (ogl0.X() && this.f4616r.f18622a.isLimitedTrialSee(CoreModule.H().userId()) && !xma.L3() && !CoreModule.c.e0.p9().isFemale()) {
            xdl0.M(this.f4610l, true);
            qib0.G.L0(this.f4610l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
            return;
        }
        if (CoreModule.P().g().xn() && NullChecker.a(this.f4616r.f18622a) && this.f4616r.f18622a.isConfessionFirstConv()) {
            xdl0.M(this.f4610l, true);
            if (upa.z()) {
                qib0.G.Y0(this.f4610l, x2c0.Sg);
                return;
            } else {
                qib0.G.Y0(this.f4610l, x2c0.Lo);
                return;
            }
        }
        if (ml6.d(this.f4616r.f18622a)) {
            xdl0.M(this.f4610l, false);
            xdl0.M(this.f4604f, true);
            xdl0.A0(getContext(), this.f4604f, x2c0.Ie);
        } else {
            if (!ml6.f(this.f4616r.f18622a) && !TextUtils.equals(this.f4616r.f18622a.convType, "fakeIntlReceiveLikeGuideSVip")) {
                xdl0.M(this.f4610l, false);
                return;
            }
            xdl0.M(this.f4610l, false);
            xdl0.M(this.f4604f, true);
            xdl0.A0(getContext(), this.f4604f, x2c0.Fe);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m6592n1() {
        if (NullChecker.a(this.f4616r.f18622a.property.intl_chat_source) && "spotLight".equals(this.f4616r.f18622a.property.intl_chat_source.source)) {
            this.f4602d.setVisibility(0);
        } else {
            this.f4602d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m6593o1(Conversation conversation, User user, int i) {
        if (m21562c0(this.f4616r)) {
            if (NullChecker.a(this.f4616r.f18622a) && this.f4616r.f18622a.isAnonymous()) {
                this.f4601c.m10013B0(user.getAnonymousUrl());
                return;
            } else {
                qib0.G.Q0(this.f4615q, m21540N0(user));
                return;
            }
        }
        xdl0.M(this.f4605g, false);
        if (NullChecker.a(this.f4616r.f18622a) && this.f4616r.f18622a.isAnonymous()) {
            qib0.G.L0(this.f4615q, this.f4616r.f18623b.getAnonymousUrl());
            this.f4601c.m10016G0(false);
        } else {
            HeaderFrameWrapper headerFrameWrapper = this.f4601c;
            User user2 = this.f4616r.f18623b;
            headerFrameWrapper.m10031v0(user2, m21540N0(user2));
        }
        if (!m21571n(conversation) || m21568j(conversation)) {
            m6582e1();
            setLivingHead(m21550U0(this.f4616r));
        }
        if (TextUtils.equals(conversation.convType, "lovescript")) {
            this.f4601c.m10018i0(m21540N0(this.f4616r.f18623b).formatted(), 2, 8);
            this.f4601c.m10016G0(false);
            xdl0.M(this.f4605g, true);
            this.f4605g.setBitmapRes(x2c0.Id);
            ViewGroup.LayoutParams layoutParams = this.f4605g.getLayoutParams();
            int i2 = this.f4617s;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f4605g.setLayoutParams(layoutParams);
            this.f4605g.m7951b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (mo6575K0()) {
            return;
        }
        pi6 pi6Var = this.f4616r;
        Conversation conversation = pi6Var.f18622a;
        m21580w(pi6Var);
        if (NullChecker.a(conversation)) {
            if (upa.a2()) {
                m6586i1();
            } else {
                getContext().startActivity(ProfileAct.n2(getContext(), conversation.otherUser, "conversation_view", false));
            }
        }
        m21582x0(this.f4616r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6581d1(this);
        this.f4615q = this.f4601c.get_pic();
        if (upa.z()) {
            int i = pi6.f18601Q;
            xdl0.D0((t100.j * 2) + i, new View[]{this});
            xdl0.C0(this, t100.d(15.0f) + i);
            rd6.m21523v(t100.d(7.0f) + i, this.f4600b);
            this.f4600b.m5792d(i - t100.h, t100.g + i);
            rd6.m21523v(t100.d(15.0f) + i, this.f4601c);
            rd6.m21523v(t100.d(6.0f) + i, this.f4602d);
            rd6.m21523v(t100.d(6.0f) + i, this.f4605g);
            rd6.m21523v(i, this.f4606h);
            this.f4609k.setImageResource(x2c0.Gf);
            xdl0.W(this.f4610l, -t100.e);
            xdl0.X(this.f4610l, -t100.d(7.0f));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m6594p1() {
        boolean zLowPayOneSideConv = this.f4616r.f18622a.lowPayOneSideConv();
        VImage vImage = this.f4607i;
        if (zLowPayOneSideConv) {
            xdl0.M(vImage, !this.f4616r.f18622a.read.booleanValue() && this.f4616r.f18622a.additional.lowPayOneside.reddot);
        } else {
            xdl0.M(vImage, !this.f4616r.f18622a.read.booleanValue());
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m6595q1() {
        if (!u59.d0() || !NullChecker.a(this.f4616r.f18622a) || !"lovebuzz".equals(this.f4616r.f18622a.convType)) {
            xdl0.M(this.f4612n, false);
            xdl0.M(this.f4603e, false);
            return;
        }
        xdl0.M(this.f4612n, true);
        xdl0.M(this.f4603e, true);
        CoreModule.l.b().xp(this.f4615q, sw6.a(this.f4616r.f18623b).profileSmall(), CoreModule.P().b().Wr(this.f4616r.f18622a) ? 100 : !CoreModule.P().b().zo(this.f4616r.f18622a) ? this.f4616r.f18606A : 100);
        this.f4601c.m10016G0(false);
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: r */
    public void mo6596r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            xdl0.M(this.f4605g, true);
            this.f4601c.m10016G0(false);
            LiveHaloAvatar liveHaloAvatar = this.f4600b;
            if (liveHaloAvatar != null) {
                xdl0.M(liveHaloAvatar, false);
            }
            int i = (int) ((j2 - j) / 1000);
            if (j3 > 0) {
                this.f4605g.setProgress(100 - ((int) (((long) (i * 100)) / j3)));
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m6597r1() {
        this.f4616r.f18616K = xdl0.O0(this.f4600b) ? "1" : "0";
        pi6 pi6Var = this.f4616r;
        pi6Var.f18617L = (NullChecker.a(pi6Var.f18623b) && this.f4601c.m10022m0(this.f4616r.f18623b)) ? "audio_avatar_frame" : "";
    }

    /* JADX INFO: renamed from: s1 */
    public final void m6598s1() {
        if (this.f4616r.f18622a.property.loveScript.expireTime <= mqi0.m18550o()) {
            CoreModule.c.t1.u("love_script_tag_" + ((DbObject) this.f4616r.f18622a).id);
            CoreModule.c.f0.Tf(((DbObject) this.f4616r.f18622a).id);
        }
        if (this.f4616r.f18622a.property.loveScript.expireTime > mqi0.m18550o()) {
            LoveScript loveScript = this.f4616r.f18622a.property.loveScript;
            long j = loveScript.createdTime;
            if (j != 0) {
                long j2 = loveScript.expireTime;
                this.f4605g.setProgress((int) ((((double) Math.round(((j2 - mqi0.m18550o()) * 100) / (j2 - j))) / 100.0d) * 100.0d));
            }
        }
    }

    @Override // p009l.bpl
    public void setPicPercent(float f) {
        this.f4601c.setPicPercent(f);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo5123t0(final pi6 pi6Var) {
        this.f4616r = pi6Var;
        xdl0.M(this.f4608j, false);
        xdl0.M0(this.f4613o, false);
        xdl0.M(this.f4605g, false);
        ViewGroup.LayoutParams layoutParams = this.f4615q.getLayoutParams();
        int i = this.f4617s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f4615q.setLayoutParams(layoutParams);
        xdl0.M(this.f4601c, true);
        xdl0.M(this.f4600b, false);
        if (pi6Var.f18643v && NullChecker.a(pi6Var.f18623b)) {
            if (!pi6Var.f18623b.isBanedOrInactivated()) {
                xdl0.M(this.f4601c.get_frame(), false);
                qib0.G.Q0(this.f4615q, m21540N0(pi6Var.f18623b));
            }
            xdl0.E0(this.f4601c, new View.OnClickListener() { // from class: l.b96
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pi6Var.f18609D.performClick();
                }
            });
            return;
        }
        boolean zA2 = upa.a2();
        VDraweeView vDraweeView = this.f4615q;
        if (zA2) {
            xdl0.E0(vDraweeView, this);
            this.f4615q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f4615q.setClickable(false);
        }
        m6584g1();
        this.f4615q.setBackgroundResource(0);
        m6600u1(t100.i, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m6599t1() {
        if (m21528D(this.f4616r)) {
            return;
        }
        xdl0.M0(this.f4608j, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m6600u1(int i, int i2) {
        RoundingParams roundingParamsP = this.f4610l.getHierarchy().p();
        if (NullChecker.a(roundingParamsP)) {
            float[] fArrF = roundingParamsP.f();
            if (NullChecker.a(fArrF) && fArrF.length > 0 && fArrF[0] == i && roundingParamsP.e() == i2) {
                return;
            }
        }
        RoundingParams roundingParamsC = RoundingParams.c(i);
        roundingParamsC.o(-1, i2);
        roundingParamsC.v(true);
        this.f4610l.getHierarchy().H(roundingParamsC);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m6601v1() {
        Message messageM21574p = m21574p(this.f4616r);
        if (m21528D(this.f4616r)) {
            return;
        }
        pi6 pi6Var = this.f4616r;
        if (m21563f(messageM21574p, pi6Var.f18623b, pi6Var.f18622a)) {
            Conversation conversation = this.f4616r.f18622a;
            String strF = t0g0.f(conversation.unreadMessages + m21539M(conversation));
            xdl0.M0(this.f4613o, true);
            this.f4614p.setText(strF);
            this.f4614p.setBackgroundResource(x2c0.k1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m6602w1() {
        if (this.f4616r.f18636o) {
            xdl0.M(this.f4609k, false);
            xdl0.M(this.f4613o, false);
        }
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo6569y0() {
        if (!m21555Y(this.f4616r.f18622a)) {
            xdl0.M(this.f4606h, true);
            return;
        }
        for (int i = 0; i < this.f4599a.getChildCount(); i++) {
            View childAt = this.f4599a.getChildAt(i);
            int id = childAt.getId();
            if (id == u4c0.g7 || id == u4c0.e1 || id == u4c0.hf) {
                xdl0.M(childAt, false);
            }
        }
        xdl0.M(this.f4606h, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo5130z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f4616r = pi6Var;
        if (NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.localEverHasMessage) {
            return;
        }
        User user2 = pi6Var.f18623b;
        if (user2 == null || !((DbObject) user2).id.equals(((DbObject) user).id)) {
            m6583f1();
        }
        pi6Var.f18623b = user;
        if (user.isBannedNew() || pi6Var.f18623b.isAccountCancellation()) {
            this.f4601c.m10034z0(x2c0.h0);
            return;
        }
        HeaderFrameWrapper headerFrameWrapper = this.f4601c;
        User user3 = pi6Var.f18623b;
        headerFrameWrapper.m10031v0(user3, m21540N0(user3));
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4615q = null;
        this.f4617s = upa.z() ? pi6.f18601Q : t100.d(55.0f);
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4615q = null;
        this.f4617s = upa.z() ? pi6.f18601Q : t100.d(55.0f);
    }
}
