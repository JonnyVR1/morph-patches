package com.p051p1.mobile.putong.core.newui.messages.itemview;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.LoveScript;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a9g0;
import p153l.adc0;
import p153l.bnl0;
import p153l.d79;
import p153l.dbc0;
import p153l.fsb0;
import p153l.gra;
import p153l.i4g0;
import p153l.ja6;
import p153l.joa;
import p153l.jyb;
import p153l.k66;
import p153l.nae0;
import p153l.orl;
import p153l.pf60;
import p153l.pm6;
import p153l.pzi0;
import p153l.q3d0;
import p153l.qa00;
import p153l.r8n;
import p153l.rbb0;
import p153l.sj6;
import p153l.spl0;
import p153l.u1t;
import p153l.u46;
import p153l.ue6;
import p153l.uqb0;
import p153l.vx6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemHeadView extends FrameLayout implements orl, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationItemHeadView f26563a;

    /* JADX INFO: renamed from: b */
    public LiveHaloAvatar f26564b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f26565c;

    /* JADX INFO: renamed from: d */
    public View f26566d;

    /* JADX INFO: renamed from: e */
    public View f26567e;

    /* JADX INFO: renamed from: f */
    public View f26568f;

    /* JADX INFO: renamed from: g */
    public NewTalkProgressView f26569g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f26570h;

    /* JADX INFO: renamed from: i */
    public VImage f26571i;

    /* JADX INFO: renamed from: j */
    public VImage f26572j;

    /* JADX INFO: renamed from: k */
    public VImage f26573k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f26574l;

    /* JADX INFO: renamed from: m */
    public VImage f26575m;

    /* JADX INFO: renamed from: n */
    public VImage f26576n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f26577o;

    /* JADX INFO: renamed from: p */
    public VText f26578p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f26579q;

    /* JADX INFO: renamed from: r */
    public sj6 f26580r;

    /* JADX INFO: renamed from: s */
    public final int f26581s;

    public ConversationItemHeadView(@NonNull Context context) {
        super(context);
        this.f26579q = null;
        this.f26581s = gra.m131778z() ? sj6.f168905Q : qa00.m175859d(55.0f);
    }

    private void setLivingHead(boolean z) {
        UserLiveLabel userLiveLabelM195711a0;
        if (!m195685H(this.f26580r, z) || ue6.m195672o(this.f26580r.f168926a)) {
            return;
        }
        String anonymousUrl = (jyb.m147479J(this.f26580r.f168927b.pictures) || !NullChecker.m82486a(this.f26580r.f168927b.m61308fp())) ? "" : this.f26580r.f168927b.m61308fp().profileSmall().formatted();
        if (NullChecker.m82486a(this.f26580r.f168926a) && this.f26580r.f168926a.isAnonymous()) {
            anonymousUrl = this.f26580r.f168927b.getAnonymousUrl();
        }
        if (gra.m131657a2()) {
            sj6 sj6Var = this.f26580r;
            userLiveLabelM195711a0 = m195711a0(sj6Var, m195705V0(sj6Var.f168930e));
            String strM195730r0 = m195730r0(this.f26580r);
            if (!TextUtils.isEmpty(strM195730r0)) {
                anonymousUrl = strM195730r0;
            }
        } else {
            userLiveLabelM195711a0 = (UserLiveLabel) getUserLiveLabelHashMap().get(this.f26580r.f168927b.f56859id);
        }
        m43444k1(userLiveLabelM195711a0, anonymousUrl);
        bnl0.m105524M(this.f26569g, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: A */
    public void mo41998A(sj6 sj6Var) {
        this.f26580r = sj6Var;
        this.f26579q.setOnClickListener(this);
        bnl0.m105524M(this.f26569g, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: G0 */
    public void mo43430G0(sj6 sj6Var) {
        this.f26580r = sj6Var;
        uqb0.f180374G.m127119N0(this.f26579q, gra.m131651Z(sj6Var.f168928c), false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: J */
    public void mo43412J(sj6 sj6Var) {
        this.f26580r = sj6Var;
        boolean zEquals = TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_anonymous_greeting");
        this.f26579q.setOnClickListener(null);
        this.f26579q.setClickable(false);
        this.f26573k.setVisibility(8);
        int i = gra.m131778z() ? dbc0.f87578xg : dbc0.f86143F6;
        if (zEquals) {
            i = dbc0.f87367r0;
        }
        if (d79.m114662U()) {
            bnl0.m105524M(this.f26571i, false);
            i = dbc0.f87635z9;
        }
        uqb0.f180374G.m127138Y0(this.f26579q, i);
        this.f26579q.setBackgroundResource(i);
        this.f26565c.m80878G0(false);
        if (sj6Var.f168926a.additional.kankan.greetingSummaryDetail.unseen <= 0 || m195681D(sj6Var)) {
            return;
        }
        bnl0.m105524M(this.f26572j, true);
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: K0 */
    public boolean mo43431K0() {
        Conversation conversation = this.f26580r.f168926a;
        return false;
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: P */
    public void mo43432P(sj6 sj6Var) {
        Message message;
        this.f26580r = sj6Var;
        sj6Var.f168915F.set(sj6Var.f168917H);
        if (sj6Var.f168946u && TextUtils.equals(sj6Var.f168943r, CoreModule.m30929H().userId())) {
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(CoreModule.f18264c.f20381e0.m116600p9()));
        } else if (sj6Var.f168917H == 0 || (message = sj6Var.f168918I) == null) {
            this.f26579q.setBackgroundResource(0);
            this.f26579q.setPadding(0, 0, 0, 0);
            uqb0.f180374G.m127138Y0(this.f26579q, dbc0.f86098Dp);
        } else {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
            VDraweeView vDraweeView = this.f26579q;
            int i = qa00.f156318e;
            vDraweeView.setPadding(i, i, i, i);
            this.f26579q.setBackgroundResource(dbc0.f87560wu);
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(userM116503Pa));
        }
        m43458w1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: Q0 */
    public void mo43420Q0(sj6 sj6Var) {
        this.f26580r = sj6Var;
        bnl0.m105525M0(this.f26577o, false);
        bnl0.m105524M(this.f26568f, false);
        m43457v1();
        m43450p1();
        m43446l1();
        if (TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            m43443j1(sj6Var.f168927b);
            return;
        }
        bnl0.m105524M(this.f26575m, false);
        m43447m1();
        m43449o1(sj6Var.f168926a, sj6Var.f168928c, sj6Var.f168910A);
        m43448n1();
        m43451q1();
        if (ue6.m195672o(sj6Var.f168926a)) {
            uqb0.f180374G.m127120O(this.f26579q, m195693N0(sj6Var.f168927b).formatted(), 4, 5);
            this.f26565c.m80878G0(false);
        } else if (sj6Var.f168926a.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
        }
        mo43425y0();
        m43458w1();
        m43453r1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: U */
    public void mo43433U(@NonNull sj6 sj6Var) {
        this.f26580r = sj6Var;
        bnl0.m105524M(this.f26564b, false);
        bnl0.m105524M(this.f26566d, false);
        bnl0.m105525M0(this.f26567e, false);
        bnl0.m105524M(this.f26569g, false);
        bnl0.m105524M(this.f26570h, false);
        bnl0.m105524M(this.f26575m, false);
        bnl0.m105524M(this.f26576n, false);
        bnl0.m105524M(this.f26577o, false);
        bnl0.m105524M(this.f26565c.get_frame(), false);
        ViewGroup.LayoutParams layoutParams = this.f26579q.getLayoutParams();
        int i = this.f26581s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f26579q.setLayoutParams(layoutParams);
        uqb0.f180374G.m127138Y0(this.f26579q, dbc0.f86622U5);
        bnl0.m105524M(this.f26565c, true);
        bnl0.m105524M(this.f26579q, true);
        this.f26579q.setOnClickListener(null);
        this.f26579q.setClickable(false);
        m43440g1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: X0 */
    public void mo43434X0(final sj6 sj6Var) {
        this.f26580r = sj6Var;
        bnl0.m105509E0(this.f26579q, new View.OnClickListener() { // from class: l.ia6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sj6Var.f168913D.performClick();
            }
        });
        bnl0.m105524M(this.f26566d, true);
        this.f26566d.setBackgroundResource(dbc0.f87438t5);
        boolean zIsMe = sj6Var.f168927b.isMe();
        HeaderFrameWrapper headerFrameWrapper = this.f26565c;
        if (zIsMe) {
            headerFrameWrapper.m80896z0(dbc0.f87471u5);
        } else {
            headerFrameWrapper.m80875B0(sj6Var.f168927b.m61308fp().url);
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: d */
    public void mo43435d(sj6 sj6Var) {
        this.f26580r = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168927b)) {
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    @Override // p153l.orl
    /* JADX INFO: renamed from: d0 */
    public void mo43436d0(sj6 sj6Var) {
        this.f26580r = sj6Var;
        bnl0.m105524M(this.f26569g, false);
        Conversation conversation = sj6Var.f168926a;
        if (sj6Var.f168946u && TextUtils.equals(sj6Var.f168943r, CoreModule.m30929H().userId())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (conversation.isAnonymous()) {
                uqb0.f180374G.m127115L0(this.f26579q, userM116600p9.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(userM116600p9));
            }
        } else if (gra.m131750t1()) {
            if (NullChecker.m82486a(sj6Var.f168927b)) {
                User user = sj6Var.f168927b;
                if (!user.inactivated && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    if (NullChecker.m82486a(conversation.additional)) {
                        if (conversation.isAnonymous()) {
                            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
                        } else {
                            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
                        }
                    } else if (conversation.isAnonymous()) {
                        uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
                    } else {
                        uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
                    }
                }
            }
            uqb0.f180374G.m127138Y0(this.f26579q, dbc0.f86855bd);
        } else if (NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(conversation.additional.quickChat)) {
            if (conversation.isAnonymous() || !NullChecker.m82486a(sj6Var.f168927b)) {
                uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
            } else {
                uqb0.f180374G.m127115L0(this.f26579q, sj6Var.f168927b.getAnonymousUrl());
            }
        } else if (conversation.additional.quickChat.avatarBlurred) {
            pf60<Integer, Integer> pf60VarM51467z = C8772a.m51467z(0);
            uqb0.f180374G.m127120O(this.f26579q, m195693N0(sj6Var.f168927b).formatted(), pf60VarM51467z.f152156a.intValue(), pf60VarM51467z.f152157b.intValue());
        } else if (conversation.isAnonymous()) {
            uqb0.f180374G.m127115L0(this.f26579q, sj6Var.f168927b.getAnonymousUrl());
        } else {
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
        }
        m43458w1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m43437d1(View view) {
        ja6.m144003a(this, view);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: e */
    public void mo43424e(sj6 sj6Var) {
        boolean z;
        this.f26580r = sj6Var;
        if (sj6Var.f168946u && NullChecker.m82486a(sj6Var.f168948w)) {
            uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168948w));
        } else if (jyb.m147479J(sj6Var.f168911B.avatars)) {
            uqb0.f180374G.m127138Y0(this.f26579q, dbc0.f87210m8);
        } else {
            uqb0.f180374G.m127140Z0(this.f26579q, sj6Var.f168911B.avatars.get(0).cover().profileSmall().formatted());
        }
        Conversation conversation = sj6Var.f168926a;
        if (conversation.muted) {
            bnl0.m105524M(this.f26572j, conversation.unreadMessages > 0 && !m195681D(sj6Var));
            z = true;
        } else {
            z = false;
        }
        bnl0.m105524M(this.f26577o, false);
        if (!z && sj6Var.f168926a.unreadMessages > 0 && !m195681D(sj6Var)) {
            bnl0.m105524M(this.f26577o, true);
            String strM96571f = a9g0.m96571f(sj6Var.f168926a.unreadMessages);
            if (!TextUtils.isEmpty(strM96571f)) {
                this.f26578p.setText(strM96571f);
            }
        }
        if (!sj6Var.f168911B.ownerUserId.equals(CoreModule.m30930K().me_().f56859id)) {
            User userNew_ = User.new_();
            userNew_.f56859id = sj6Var.f168911B.ownerUserId;
            sj6Var.f168927b = userNew_;
            setLivingHead(false);
        }
        mo43425y0();
        m43458w1();
        m43453r1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m43438e1() {
        if (gra.m131657a2()) {
            return;
        }
        boolean zIsClickable = this.f26579q.isClickable();
        VDraweeView vDraweeView = this.f26579q;
        if (!zIsClickable) {
            vDraweeView.isClickable();
        } else {
            bnl0.m105509E0(vDraweeView, null);
            this.f26579q.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m43439f1() {
        int iLongValue = (int) ((CoreModule.f18264c.f20384f0.f20607I0.get().longValue() / 1000) - (pzi0.m174454o() / 1000));
        final long jLongValue = (CoreModule.f18264c.f20384f0.f20607I0.get().longValue() / 1000) - (CoreModule.f18264c.f20384f0.f20604H0.get().longValue() / 1000);
        if (iLongValue <= 0 || jLongValue <= 0) {
            m195719h();
            return;
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f26569g.setBitmapRes(dbc0.f86310Kd);
        m195713b(this.f26580r.f168914E, new y20() { // from class: l.ha6
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo43452r(simpleDateFormat, pzi0.m174454o(), CoreModule.f18264c.f20384f0.f20607I0.get().longValue(), jLongValue);
            }
        });
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g("countdown_conv_list_key").m32520a(true).m32525f(CoreModule.f18264c.f20384f0.f20607I0.get().longValue()).m32524e(true);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m43440g1() {
        if (this.f26563a == null) {
            return;
        }
        for (int i = 0; i < this.f26563a.getChildCount(); i++) {
            View childAt = this.f26563a.getChildAt(i);
            int id = childAt.getId();
            if (id == adc0.f70386i7 || id == adc0.f70233Z6 || id == adc0.f70312e1 || id == adc0.f70461mf || id == adc0.f70444lf || id == adc0.f70033N7 || id == adc0.f69965J7) {
                bnl0.m105524M(childAt, false);
            }
        }
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: h0 */
    public void mo42018h0(sj6 sj6Var) {
        this.f26580r = sj6Var;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m43441h1(UserLiveLabel userLiveLabel, View view) {
        if (userLiveLabel != null) {
            if (!TextUtils.isEmpty(userLiveLabel.schema)) {
                nae0.m162083m(this.f26580r.f168949x, Uri.parse(userLiveLabel.schema));
                return;
            }
            if (!"onLive".equals(userLiveLabel.liveState) && !"onMultiCall".equals(userLiveLabel.liveState) && !UserLiveLabel.LIVE_ON_CALL_STATE.equals(userLiveLabel.liveState)) {
                if ("onVoice".equals(userLiveLabel.liveState)) {
                    CoreModule.m30934Q().mo68412M6().mo127345p(this.f26580r.f168949x, userLiveLabel.liveId, "conversation", userLiveLabel.userId, null);
                    m195696Q(this.f26580r, userLiveLabel);
                    return;
                }
                return;
            }
            CoreModule.m30934Q().startAudienceLive(this.f26580r.f168949x, userLiveLabel.liveId, "conversation", null);
            if (NullChecker.m82486a(this.f26580r.f168926a) && NullChecker.m82486a(CoreModule.f18264c.f20387g0.m32889h7(this.f26580r.f168926a.otherUser))) {
                m195696Q(this.f26580r, userLiveLabel);
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m43442i1() {
        UserLiveLabel userLiveLabelM195712a1 = m195712a1(this.f26580r);
        if (NullChecker.m82486a(userLiveLabelM195712a1) && !m195708Y(this.f26580r.f168926a) && bnl0.m105529O0(this.f26564b)) {
            m195696Q(this.f26580r, userLiveLabelM195712a1);
            u1t.m194113a(this.f26580r.f168949x, userLiveLabelM195712a1);
        } else if (NullChecker.m82486a(this.f26580r.f168913D)) {
            this.f26580r.f168913D.performClick();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m43443j1(User user) {
        this.f26579q.setBackgroundResource(dbc0.f86590T5);
        this.f26579q.setPadding(qa00.m175859d(4.0f), qa00.m175859d(4.0f), qa00.m175859d(4.0f), qa00.m175859d(4.0f));
        if (rbb0.m180744q()) {
            uqb0.f180374G.m127120O(this.f26579q, m195693N0(user).formatted(), 4, 5);
            this.f26565c.m80878G0(false);
        } else {
            this.f26565c.m80893v0(user, m195693N0(user));
        }
        bnl0.m105524M(this.f26575m, true);
        List<String> list = r8n.m180219f().f161740n;
        boolean z = this.f26580r.f168930e;
        String str = LocalPlaceBan.chatList;
        if (list.contains(TextUtils.concat(z ? LocalPlaceBan.matchList : LocalPlaceBan.chatList, user.f56859id).toString())) {
            return;
        }
        i4g0.m138492A("e_chat_request", OMSDialogPositon.p_messages_view, jyb.m147494Y("show_where", this.f26580r.f168930e ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), jyb.m147494Y("request_show_type", this.f26580r.f168934i), jyb.m147494Y("show_position", (this.f26580r.f168932g + 1) + "/" + ((u46) this.f26580r.f168929d).mo42530h()));
        List<String> list2 = r8n.m180219f().f161740n;
        if (this.f26580r.f168930e) {
            str = LocalPlaceBan.matchList;
        }
        list2.add(TextUtils.concat(str, user.f56859id).toString());
    }

    /* JADX INFO: renamed from: k1 */
    public final void m43444k1(@Nullable final UserLiveLabel userLiveLabel, String str) {
        int i = 0;
        while (true) {
            if (i >= this.f26563a.getChildCount()) {
                break;
            }
            View childAt = this.f26563a.getChildAt(i);
            int id = childAt.getId();
            if (id != adc0.f70040Ne) {
                bnl0.m105524M(childAt, id == adc0.f70386i7);
            }
            i++;
        }
        bnl0.m105524M(this.f26564b, true);
        if (NullChecker.m82486a(userLiveLabel) && userLiveLabel.isVoiceChat()) {
            this.f26564b.m42680e(-13450309, -13450309);
        } else {
            boolean zM131778z = gra.m131778z();
            LiveHaloAvatar liveHaloAvatar = this.f26564b;
            if (zM131778z) {
                liveHaloAvatar.m42680e(-38484, -40983);
            } else {
                liveHaloAvatar.m42680e(-38485, -41238);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(str).m8661O(new q3d0(this.f26564b.getAvatarSize(), this.f26564b.getAvatarSize())).m8668a();
            fsb0 fsb0Var = uqb0.f180374G;
            LiveHaloAvatar liveHaloAvatar2 = this.f26564b;
            Objects.requireNonNull(liveHaloAvatar2);
            fsb0Var.m127102F(imageRequestM8668a, new k66(liveHaloAvatar2));
        }
        bnl0.m105509E0(this.f26564b, new View.OnClickListener() { // from class: l.fa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97945a.m43441h1(userLiveLabel, view);
            }
        });
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: l0 */
    public void mo43445l0(Conversation conversation, User user, sj6 sj6Var) {
        bnl0.m105524M(this.f26574l, true);
        m43456u1(qa00.f156323j, qa00.f156316c);
        uqb0.f180374G.m127115L0(this.f26574l, user.m61308fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: l1 */
    public final void m43446l1() {
        if (m195680A0(this.f26580r.f168926a)) {
            m43455t1();
            m43454s1();
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m */
    public void mo42024m(sj6 sj6Var) {
        this.f26580r = sj6Var;
        boolean zM131657a2 = gra.m131657a2();
        VDraweeView vDraweeView = this.f26579q;
        if (zM131657a2) {
            bnl0.m105509E0(vDraweeView, this);
            this.f26579q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f26579q.setClickable(false);
        }
        this.f26565c.m80878G0(false);
        m43440g1();
        bnl0.m105524M(this.f26569g, false);
        bnl0.m105524M(this.f26572j, false);
        bnl0.m105524M(this.f26564b, false);
        bnl0.m105524M(this.f26565c, true);
        bnl0.m105524M(this.f26577o, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m0 */
    public void mo42025m0(sj6 sj6Var) {
        bnl0.m105524M(this.f26574l, true);
        m43456u1(qa00.f156323j, 0);
        uqb0.f180374G.m127115L0(this.f26574l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
        ViewGroup.LayoutParams layoutParams = this.f26579q.getLayoutParams();
        layoutParams.width = qa00.m175859d(55.0f);
        layoutParams.height = qa00.m175859d(55.0f);
        this.f26579q.setLayoutParams(layoutParams);
        uqb0.f180374G.m127138Y0(this.f26579q, dbc0.f86118Ed);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m43447m1() {
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(qa00.f156322i);
        roundingParamsM8303c.m8322v(true);
        this.f26574l.getHierarchy().m207045H(roundingParamsM8303c);
        if (spl0.m187372X() && this.f26580r.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) && !joa.m146361M3() && !CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            bnl0.m105524M(this.f26574l, true);
            uqb0.f180374G.m127115L0(this.f26574l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
            return;
        }
        if (CoreModule.m30933P().m143410g().mo36088xn() && NullChecker.m82486a(this.f26580r.f168926a) && this.f26580r.f168926a.isConfessionFirstConv()) {
            bnl0.m105524M(this.f26574l, true);
            if (gra.m131778z()) {
                uqb0.f180374G.m127138Y0(this.f26574l, dbc0.f86186Gh);
                return;
            } else {
                uqb0.f180374G.m127138Y0(this.f26574l, dbc0.f87651zp);
                return;
            }
        }
        if (pm6.m172916d(this.f26580r.f168926a)) {
            bnl0.m105524M(this.f26574l, false);
            bnl0.m105524M(this.f26568f, true);
            bnl0.m105501A0(getContext(), this.f26568f, dbc0.f87577xf);
        } else {
            if (!pm6.m172918f(this.f26580r.f168926a) && !TextUtils.equals(this.f26580r.f168926a.convType, ConversationType.fakeIntlReceiveLikeGuideSVip)) {
                bnl0.m105524M(this.f26574l, false);
                return;
            }
            bnl0.m105524M(this.f26574l, false);
            bnl0.m105524M(this.f26568f, true);
            bnl0.m105501A0(getContext(), this.f26568f, dbc0.f87481uf);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m43448n1() {
        if (NullChecker.m82486a(this.f26580r.f168926a.property.intl_chat_source) && SummarizedPrivilegesId.spotLight.equals(this.f26580r.f168926a.property.intl_chat_source.source)) {
            this.f26566d.setVisibility(0);
        } else {
            this.f26566d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m43449o1(Conversation conversation, User user, int i) {
        if (m195715c0(this.f26580r)) {
            if (NullChecker.m82486a(this.f26580r.f168926a) && this.f26580r.f168926a.isAnonymous()) {
                this.f26565c.m80875B0(user.getAnonymousUrl());
                return;
            } else {
                uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(user));
                return;
            }
        }
        bnl0.m105524M(this.f26569g, false);
        if (NullChecker.m82486a(this.f26580r.f168926a) && this.f26580r.f168926a.isAnonymous()) {
            uqb0.f180374G.m127115L0(this.f26579q, this.f26580r.f168927b.getAnonymousUrl());
            this.f26565c.m80878G0(false);
        } else {
            HeaderFrameWrapper headerFrameWrapper = this.f26565c;
            User user2 = this.f26580r.f168927b;
            headerFrameWrapper.m80893v0(user2, m195693N0(user2));
        }
        if (!m195724n(conversation) || m195721j(conversation)) {
            m43438e1();
            setLivingHead(m195703U0(this.f26580r));
        }
        if (TextUtils.equals(conversation.convType, "lovescript")) {
            this.f26565c.m80880i0(m195693N0(this.f26580r.f168927b).formatted(), 2, 8);
            this.f26565c.m80878G0(false);
            bnl0.m105524M(this.f26569g, true);
            this.f26569g.setBitmapRes(dbc0.f86278Jd);
            ViewGroup.LayoutParams layoutParams = this.f26569g.getLayoutParams();
            int i2 = this.f26581s;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f26569g.setLayoutParams(layoutParams);
            this.f26569g.m44873b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (mo43431K0()) {
            return;
        }
        sj6 sj6Var = this.f26580r;
        Conversation conversation = sj6Var.f168926a;
        m195733w(sj6Var);
        if (NullChecker.m82486a(conversation)) {
            if (gra.m131657a2()) {
                m43442i1();
            } else {
                getContext().startActivity(ProfileAct.m51920o2(getContext(), conversation.otherUser, "conversation_view", false));
            }
        }
        m195735x0(this.f26580r);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43437d1(this);
        this.f26579q = this.f26565c.get_pic();
        if (gra.m131778z()) {
            int i = sj6.f168905Q;
            bnl0.m105507D0((qa00.f156323j * 2) + i, this);
            bnl0.m105505C0(this, qa00.m175859d(15.0f) + i);
            ue6.m195676v(qa00.m175859d(7.0f) + i, this.f26564b);
            this.f26564b.m42679d(i - qa00.f156321h, qa00.f156320g + i);
            ue6.m195676v(qa00.m175859d(15.0f) + i, this.f26565c);
            ue6.m195676v(qa00.m175859d(6.0f) + i, this.f26566d);
            ue6.m195676v(qa00.m175859d(6.0f) + i, this.f26569g);
            ue6.m195676v(i, this.f26570h);
            this.f26573k.setImageResource(dbc0.f87482ug);
            bnl0.m105539W(this.f26574l, -qa00.f156318e);
            bnl0.m105540X(this.f26574l, -qa00.m175859d(7.0f));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m43450p1() {
        boolean zLowPayOneSideConv = this.f26580r.f168926a.lowPayOneSideConv();
        VImage vImage = this.f26571i;
        if (zLowPayOneSideConv) {
            bnl0.m105524M(vImage, !this.f26580r.f168926a.read.booleanValue() && this.f26580r.f168926a.additional.lowPayOneside.reddot);
        } else {
            bnl0.m105524M(vImage, !this.f26580r.f168926a.read.booleanValue());
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m43451q1() {
        if (!d79.m114675e0() || !NullChecker.m82486a(this.f26580r.f168926a) || !"lovebuzz".equals(this.f26580r.f168926a.convType)) {
            bnl0.m105524M(this.f26576n, false);
            bnl0.m105524M(this.f26567e, false);
            return;
        }
        bnl0.m105524M(this.f26576n, true);
        bnl0.m105524M(this.f26567e, true);
        CoreModule.f18273l.m143406b().mo36135xp(this.f26579q, vx6.m203837a(this.f26580r.f168927b).profileSmall(), CoreModule.m30933P().m143406b().mo36108Wr(this.f26580r.f168926a) ? 100 : !CoreModule.m30933P().m143406b().mo36136zo(this.f26580r.f168926a) ? this.f26580r.f168910A : 100);
        this.f26565c.m80878G0(false);
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: r */
    public void mo43452r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            bnl0.m105524M(this.f26569g, true);
            this.f26565c.m80878G0(false);
            LiveHaloAvatar liveHaloAvatar = this.f26564b;
            if (liveHaloAvatar != null) {
                bnl0.m105524M(liveHaloAvatar, false);
            }
            int i = (int) ((j2 - j) / 1000);
            if (j3 > 0) {
                this.f26569g.setProgress(100 - ((int) (((long) (i * 100)) / j3)));
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m43453r1() {
        this.f26580r.f168920K = bnl0.m105529O0(this.f26564b) ? "1" : "0";
        sj6 sj6Var = this.f26580r;
        sj6Var.f168921L = (NullChecker.m82486a(sj6Var.f168927b) && this.f26565c.m80884m0(this.f26580r.f168927b)) ? "audio_avatar_frame" : "";
    }

    /* JADX INFO: renamed from: s1 */
    public final void m43454s1() {
        if (this.f26580r.f168926a.property.loveScript.expireTime <= pzi0.m174454o()) {
            CoreModule.f18264c.f20427t1.m32519u("love_script_tag_" + this.f26580r.f168926a.f56859id);
            CoreModule.f18264c.f20384f0.m33812Tf(this.f26580r.f168926a.f56859id);
        }
        if (this.f26580r.f168926a.property.loveScript.expireTime > pzi0.m174454o()) {
            LoveScript loveScript = this.f26580r.f168926a.property.loveScript;
            long j = loveScript.createdTime;
            if (j != 0) {
                long j2 = loveScript.expireTime;
                this.f26569g.setProgress((int) ((((double) Math.round(((j2 - pzi0.m174454o()) * 100) / (j2 - j))) / 100.0d) * 100.0d));
            }
        }
    }

    @Override // p153l.nrl
    public void setPicPercent(float f) {
        this.f26565c.setPicPercent(f);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: t0 */
    public void mo42033t0(final sj6 sj6Var) {
        this.f26580r = sj6Var;
        bnl0.m105524M(this.f26572j, false);
        bnl0.m105525M0(this.f26577o, false);
        bnl0.m105524M(this.f26569g, false);
        ViewGroup.LayoutParams layoutParams = this.f26579q.getLayoutParams();
        int i = this.f26581s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f26579q.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f26565c, true);
        bnl0.m105524M(this.f26564b, false);
        if (sj6Var.f168947v && NullChecker.m82486a(sj6Var.f168927b)) {
            if (!sj6Var.f168927b.isBanedOrInactivated()) {
                bnl0.m105524M(this.f26565c.get_frame(), false);
                uqb0.f180374G.m127125Q0(this.f26579q, m195693N0(sj6Var.f168927b));
            }
            bnl0.m105509E0(this.f26565c, new View.OnClickListener() { // from class: l.ga6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sj6Var.f168913D.performClick();
                }
            });
            return;
        }
        boolean zM131657a2 = gra.m131657a2();
        VDraweeView vDraweeView = this.f26579q;
        if (zM131657a2) {
            bnl0.m105509E0(vDraweeView, this);
            this.f26579q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f26579q.setClickable(false);
        }
        m43440g1();
        this.f26579q.setBackgroundResource(0);
        m43456u1(qa00.f156322i, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m43455t1() {
        if (m195681D(this.f26580r)) {
            return;
        }
        bnl0.m105525M0(this.f26572j, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m43456u1(int i, int i2) {
        RoundingParams roundingParamsM207055p = this.f26574l.getHierarchy().m207055p();
        if (NullChecker.m82486a(roundingParamsM207055p)) {
            float[] fArrM8306f = roundingParamsM207055p.m8306f();
            if (NullChecker.m82486a(fArrM8306f) && fArrM8306f.length > 0 && fArrM8306f[0] == i && roundingParamsM207055p.m8305e() == i2) {
                return;
            }
        }
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(i);
        roundingParamsM8303c.m8315o(-1, i2);
        roundingParamsM8303c.m8322v(true);
        this.f26574l.getHierarchy().m207045H(roundingParamsM8303c);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m43457v1() {
        Message messageM195727p = m195727p(this.f26580r);
        if (m195681D(this.f26580r)) {
            return;
        }
        sj6 sj6Var = this.f26580r;
        if (m195716f(messageM195727p, sj6Var.f168927b, sj6Var.f168926a)) {
            Conversation conversation = this.f26580r.f168926a;
            String strM96571f = a9g0.m96571f(conversation.unreadMessages + m195692M(conversation));
            bnl0.m105525M0(this.f26577o, true);
            this.f26578p.setText(strM96571f);
            this.f26578p.setBackgroundResource(dbc0.f87170l1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m43458w1() {
        if (this.f26580r.f168940o) {
            bnl0.m105524M(this.f26573k, false);
            bnl0.m105524M(this.f26577o, false);
        }
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: y0 */
    public void mo43425y0() {
        if (!m195708Y(this.f26580r.f168926a)) {
            bnl0.m105524M(this.f26570h, true);
            return;
        }
        for (int i = 0; i < this.f26563a.getChildCount(); i++) {
            View childAt = this.f26563a.getChildAt(i);
            int id = childAt.getId();
            if (id == adc0.f70386i7 || id == adc0.f70312e1 || id == adc0.f70444lf) {
                bnl0.m105524M(childAt, false);
            }
        }
        bnl0.m105524M(this.f26570h, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: z0 */
    public void mo42039z0(Conversation conversation, User user, sj6 sj6Var) {
        this.f26580r = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.localEverHasMessage) {
            return;
        }
        User user2 = sj6Var.f168927b;
        if (user2 == null || !user2.f56859id.equals(user.f56859id)) {
            m43439f1();
        }
        sj6Var.f168927b = user;
        if (user.isBannedNew() || sj6Var.f168927b.isAccountCancellation()) {
            this.f26565c.m80896z0(dbc0.f87072i0);
            return;
        }
        HeaderFrameWrapper headerFrameWrapper = this.f26565c;
        User user3 = sj6Var.f168927b;
        headerFrameWrapper.m80893v0(user3, m195693N0(user3));
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26579q = null;
        this.f26581s = gra.m131778z() ? sj6.f168905Q : qa00.m175859d(55.0f);
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26579q = null;
        this.f26581s = gra.m131778z() ? sj6.f168905Q : qa00.m175859d(55.0f);
    }
}
