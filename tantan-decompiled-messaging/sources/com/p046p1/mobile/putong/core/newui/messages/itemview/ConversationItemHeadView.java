package com.p046p1.mobile.putong.core.newui.messages.itemview;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.LoveScript;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bkb0;
import p149l.cpl;
import p149l.e30;
import p149l.e96;
import p149l.f56;
import p149l.j2e0;
import p149l.j760;
import p149l.ml6;
import p149l.mqi0;
import p149l.n3b0;
import p149l.nvc0;
import p149l.ogl0;
import p149l.p36;
import p149l.pi6;
import p149l.qib0;
import p149l.r6n;
import p149l.rd6;
import p149l.sw6;
import p149l.t0g0;
import p149l.t100;
import p149l.tzs;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemHeadView extends FrameLayout implements cpl, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationItemHeadView f25821a;

    /* JADX INFO: renamed from: b */
    public LiveHaloAvatar f25822b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f25823c;

    /* JADX INFO: renamed from: d */
    public View f25824d;

    /* JADX INFO: renamed from: e */
    public View f25825e;

    /* JADX INFO: renamed from: f */
    public View f25826f;

    /* JADX INFO: renamed from: g */
    public NewTalkProgressView f25827g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f25828h;

    /* JADX INFO: renamed from: i */
    public VImage f25829i;

    /* JADX INFO: renamed from: j */
    public VImage f25830j;

    /* JADX INFO: renamed from: k */
    public VImage f25831k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f25832l;

    /* JADX INFO: renamed from: m */
    public VImage f25833m;

    /* JADX INFO: renamed from: n */
    public VImage f25834n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f25835o;

    /* JADX INFO: renamed from: p */
    public VText f25836p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f25837q;

    /* JADX INFO: renamed from: r */
    public pi6 f25838r;

    /* JADX INFO: renamed from: s */
    public final int f25839s;

    public ConversationItemHeadView(@NonNull Context context) {
        super(context);
        this.f25837q = null;
        this.f25839s = upa.m194847z() ? pi6.f149080Q : t100.m186890d(55.0f);
    }

    private void setLivingHead(boolean z) {
        UserLiveLabel userLiveLabelM178917a0;
        if (!m178891H(this.f25838r, z) || rd6.m178878o(this.f25838r.f149101a)) {
            return;
        }
        String anonymousUrl = (vwb.m200296J(this.f25838r.f149102b.pictures) || !NullChecker.m81303a(this.f25838r.f149102b.m60124fp())) ? "" : this.f25838r.f149102b.m60124fp().profileSmall().formatted();
        if (NullChecker.m81303a(this.f25838r.f149101a) && this.f25838r.f149101a.isAnonymous()) {
            anonymousUrl = this.f25838r.f149102b.getAnonymousUrl();
        }
        if (upa.m194726a2()) {
            pi6 pi6Var = this.f25838r;
            userLiveLabelM178917a0 = m178917a0(pi6Var, m178911V0(pi6Var.f149105e));
            String strM178936r0 = m178936r0(this.f25838r);
            if (!TextUtils.isEmpty(strM178936r0)) {
                anonymousUrl = strM178936r0;
            }
        } else {
            userLiveLabelM178917a0 = (UserLiveLabel) getUserLiveLabelHashMap().get(this.f25838r.f149102b.f56011id);
        }
        m42433k1(userLiveLabelM178917a0, anonymousUrl);
        xdl0.m208344M(this.f25827g, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: A */
    public void mo40987A(pi6 pi6Var) {
        this.f25838r = pi6Var;
        this.f25837q.setOnClickListener(this);
        xdl0.m208344M(this.f25827g, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo42419G0(pi6 pi6Var) {
        this.f25838r = pi6Var;
        qib0.f154691G.m102335N0(this.f25837q, upa.m194720Z(pi6Var.f149103c), false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: J */
    public void mo42401J(pi6 pi6Var) {
        this.f25838r = pi6Var;
        boolean zEquals = TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_anonymous_greeting");
        this.f25837q.setOnClickListener(null);
        this.f25837q.setClickable(false);
        this.f25831k.setVisibility(8);
        int i = upa.m194847z() ? x2c0.f189454Jf : x2c0.f189288E6;
        if (zEquals) {
            i = x2c0.f190475q0;
        }
        if (u59.m191811T()) {
            xdl0.m208344M(this.f25829i, false);
            i = x2c0.f190740y9;
        }
        qib0.f154691G.m102354Y0(this.f25837q, i);
        this.f25837q.setBackgroundResource(i);
        this.f25823c.m79695G0(false);
        if (pi6Var.f149101a.additional.kankan.greetingSummaryDetail.unseen <= 0 || m178887D(pi6Var)) {
            return;
        }
        xdl0.m208344M(this.f25830j, true);
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: K0 */
    public boolean mo42420K0() {
        Conversation conversation = this.f25838r.f149101a;
        return false;
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: P */
    public void mo42421P(pi6 pi6Var) {
        Message message;
        this.f25838r = pi6Var;
        pi6Var.f149090F.set(pi6Var.f149092H);
        if (pi6Var.f149121u && TextUtils.equals(pi6Var.f149118r, CoreModule.m29931H().userId())) {
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(CoreModule.f17545c.f19639e0.m169527p9()));
        } else if (pi6Var.f149092H == 0 || (message = pi6Var.f149093I) == null) {
            this.f25837q.setBackgroundResource(0);
            this.f25837q.setPadding(0, 0, 0, 0);
            qib0.f154691G.m102354Y0(this.f25837q, x2c0.f189649Po);
        } else {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
            VDraweeView vDraweeView = this.f25837q;
            int i = t100.f167256e;
            vDraweeView.setPadding(i, i, i, i);
            this.f25837q.setBackgroundResource(x2c0.f189437It);
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(userM169430Pa));
        }
        m42447w1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo42409Q0(pi6 pi6Var) {
        this.f25838r = pi6Var;
        xdl0.m208345M0(this.f25835o, false);
        xdl0.m208344M(this.f25826f, false);
        m42446v1();
        m42439p1();
        m42435l1();
        if (TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            m42432j1(pi6Var.f149102b);
            return;
        }
        xdl0.m208344M(this.f25833m, false);
        m42436m1();
        m42438o1(pi6Var.f149101a, pi6Var.f149103c, pi6Var.f149085A);
        m42437n1();
        m42440q1();
        if (rd6.m178878o(pi6Var.f149101a)) {
            qib0.f154691G.m102336O(this.f25837q, m178899N0(pi6Var.f149102b).formatted(), 4, 5);
            this.f25823c.m79695G0(false);
        } else if (pi6Var.f149101a.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
        }
        mo42414y0();
        m42447w1();
        m42442r1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: U */
    public void mo42422U(@NonNull pi6 pi6Var) {
        this.f25838r = pi6Var;
        xdl0.m208344M(this.f25822b, false);
        xdl0.m208344M(this.f25824d, false);
        xdl0.m208345M0(this.f25825e, false);
        xdl0.m208344M(this.f25827g, false);
        xdl0.m208344M(this.f25828h, false);
        xdl0.m208344M(this.f25833m, false);
        xdl0.m208344M(this.f25834n, false);
        xdl0.m208344M(this.f25835o, false);
        xdl0.m208344M(this.f25823c.get_frame(), false);
        ViewGroup.LayoutParams layoutParams = this.f25837q.getLayoutParams();
        int i = this.f25839s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f25837q.setLayoutParams(layoutParams);
        qib0.f154691G.m102354Y0(this.f25837q, x2c0.f189754T5);
        xdl0.m208344M(this.f25823c, true);
        xdl0.m208344M(this.f25837q, true);
        this.f25837q.setOnClickListener(null);
        this.f25837q.setClickable(false);
        m42429g1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo42423X0(final pi6 pi6Var) {
        this.f25838r = pi6Var;
        xdl0.m208329E0(this.f25837q, new View.OnClickListener() { // from class: l.d96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pi6Var.f149088D.performClick();
            }
        });
        xdl0.m208344M(this.f25824d, true);
        this.f25824d.setBackgroundResource(x2c0.f190544s5);
        boolean zIsMe = pi6Var.f149102b.isMe();
        HeaderFrameWrapper headerFrameWrapper = this.f25823c;
        if (zIsMe) {
            headerFrameWrapper.m79713z0(x2c0.f190576t5);
        } else {
            headerFrameWrapper.m79692B0(pi6Var.f149102b.m60124fp().url);
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: d */
    public void mo42424d(pi6 pi6Var) {
        this.f25838r = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149102b)) {
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    @Override // p149l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo42425d0(pi6 pi6Var) {
        this.f25838r = pi6Var;
        xdl0.m208344M(this.f25827g, false);
        Conversation conversation = pi6Var.f149101a;
        if (pi6Var.f149121u && TextUtils.equals(pi6Var.f149118r, CoreModule.m29931H().userId())) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (conversation.isAnonymous()) {
                qib0.f154691G.m102331L0(this.f25837q, userM169527p9.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(this.f25837q, m178899N0(userM169527p9));
            }
        } else if (upa.m194819t1()) {
            if (NullChecker.m81303a(pi6Var.f149102b)) {
                User user = pi6Var.f149102b;
                if (!user.inactivated && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    if (NullChecker.m81303a(conversation.additional)) {
                        if (conversation.isAnonymous()) {
                            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
                        } else {
                            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
                        }
                    } else if (conversation.isAnonymous()) {
                        qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
                    } else {
                        qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
                    }
                }
            }
            qib0.f154691G.m102354Y0(this.f25837q, x2c0.f189979ad);
        } else if (NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(conversation.additional.quickChat)) {
            if (conversation.isAnonymous() || !NullChecker.m81303a(pi6Var.f149102b)) {
                qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
            } else {
                qib0.f154691G.m102331L0(this.f25837q, pi6Var.f149102b.getAnonymousUrl());
            }
        } else if (conversation.additional.quickChat.avatarBlurred) {
            j760<Integer, Integer> j760VarM50284z = C8609a.m50284z(0);
            qib0.f154691G.m102336O(this.f25837q, m178899N0(pi6Var.f149102b).formatted(), j760VarM50284z.f116564a.intValue(), j760VarM50284z.f116565b.intValue());
        } else if (conversation.isAnonymous()) {
            qib0.f154691G.m102331L0(this.f25837q, pi6Var.f149102b.getAnonymousUrl());
        } else {
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
        }
        m42447w1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m42426d1(View view) {
        e96.m115344a(this, view);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: e */
    public void mo42413e(pi6 pi6Var) {
        boolean z;
        this.f25838r = pi6Var;
        if (pi6Var.f149121u && NullChecker.m81303a(pi6Var.f149123w)) {
            qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149123w));
        } else if (vwb.m200296J(pi6Var.f149086B.avatars)) {
            qib0.f154691G.m102354Y0(this.f25837q, x2c0.f190323l8);
        } else {
            qib0.f154691G.m102356Z0(this.f25837q, pi6Var.f149086B.avatars.get(0).cover().profileSmall().formatted());
        }
        Conversation conversation = pi6Var.f149101a;
        if (conversation.muted) {
            xdl0.m208344M(this.f25830j, conversation.unreadMessages > 0 && !m178887D(pi6Var));
            z = true;
        } else {
            z = false;
        }
        xdl0.m208344M(this.f25835o, false);
        if (!z && pi6Var.f149101a.unreadMessages > 0 && !m178887D(pi6Var)) {
            xdl0.m208344M(this.f25835o, true);
            String strM186865f = t0g0.m186865f(pi6Var.f149101a.unreadMessages);
            if (!TextUtils.isEmpty(strM186865f)) {
                this.f25836p.setText(strM186865f);
            }
        }
        if (!pi6Var.f149086B.ownerUserId.equals(CoreModule.m29932K().me_().f56011id)) {
            User userNew_ = User.new_();
            userNew_.f56011id = pi6Var.f149086B.ownerUserId;
            pi6Var.f149102b = userNew_;
            setLivingHead(false);
        }
        mo42414y0();
        m42447w1();
        m42442r1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m42427e1() {
        if (upa.m194726a2()) {
            return;
        }
        boolean zIsClickable = this.f25837q.isClickable();
        VDraweeView vDraweeView = this.f25837q;
        if (!zIsClickable) {
            vDraweeView.isClickable();
        } else {
            xdl0.m208329E0(vDraweeView, null);
            this.f25837q.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m42428f1() {
        int iLongValue = (int) ((CoreModule.f17545c.f19642f0.f19865I0.get().longValue() / 1000) - (mqi0.m155944o() / 1000));
        final long jLongValue = (CoreModule.f17545c.f19642f0.f19865I0.get().longValue() / 1000) - (CoreModule.f17545c.f19642f0.f19862H0.get().longValue() / 1000);
        if (iLongValue <= 0 || jLongValue <= 0) {
            m178925h();
            return;
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f25827g.setBitmapRes(x2c0.f189452Jd);
        m178919b(this.f25838r.f149089E, new e30() { // from class: l.c96
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo42441r(simpleDateFormat, mqi0.m155944o(), CoreModule.f17545c.f19642f0.f19865I0.get().longValue(), jLongValue);
            }
        });
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g("countdown_conv_list_key").m31517a(true).m31522f(CoreModule.f17545c.f19642f0.f19865I0.get().longValue()).m31521e(true);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m42429g1() {
        if (this.f25821a == null) {
            return;
        }
        for (int i = 0; i < this.f25821a.getChildCount(); i++) {
            View childAt = this.f25821a.getChildAt(i);
            int id = childAt.getId();
            if (id == u4c0.f174261g7 || id == u4c0.f174110X6 || id == u4c0.f174221e1 || id == u4c0.f174319jf || id == u4c0.f174286hf || id == u4c0.f173911L7 || id == u4c0.f173843H7) {
                xdl0.m208344M(childAt, false);
            }
        }
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo41007h0(pi6 pi6Var) {
        this.f25838r = pi6Var;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m42430h1(UserLiveLabel userLiveLabel, View view) {
        if (userLiveLabel != null) {
            if (!TextUtils.isEmpty(userLiveLabel.schema)) {
                j2e0.m139446m(this.f25838r.f149124x, Uri.parse(userLiveLabel.schema));
                return;
            }
            if (!"onLive".equals(userLiveLabel.liveState) && !"onMultiCall".equals(userLiveLabel.liveState) && !UserLiveLabel.LIVE_ON_CALL_STATE.equals(userLiveLabel.liveState)) {
                if ("onVoice".equals(userLiveLabel.liveState)) {
                    CoreModule.m29936Q().mo67229M6().mo102431p(this.f25838r.f149124x, userLiveLabel.liveId, "conversation", userLiveLabel.userId, null);
                    m178902Q(this.f25838r, userLiveLabel);
                    return;
                }
                return;
            }
            CoreModule.m29936Q().startAudienceLive(this.f25838r.f149124x, userLiveLabel.liveId, "conversation", null);
            if (NullChecker.m81303a(this.f25838r.f149101a) && NullChecker.m81303a(CoreModule.f17545c.f19645g0.m31886h7(this.f25838r.f149101a.otherUser))) {
                m178902Q(this.f25838r, userLiveLabel);
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m42431i1() {
        UserLiveLabel userLiveLabelM178918a1 = m178918a1(this.f25838r);
        if (NullChecker.m81303a(userLiveLabelM178918a1) && !m178914Y(this.f25838r.f149101a) && xdl0.m208349O0(this.f25822b)) {
            m178902Q(this.f25838r, userLiveLabelM178918a1);
            tzs.m191214a(this.f25838r.f149124x, userLiveLabelM178918a1);
        } else if (NullChecker.m81303a(this.f25838r.f149088D)) {
            this.f25838r.f149088D.performClick();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m42432j1(User user) {
        this.f25837q.setBackgroundResource(x2c0.f189723S5);
        this.f25837q.setPadding(t100.m186890d(4.0f), t100.m186890d(4.0f), t100.m186890d(4.0f), t100.m186890d(4.0f));
        if (n3b0.m157742q()) {
            qib0.f154691G.m102336O(this.f25837q, m178899N0(user).formatted(), 4, 5);
            this.f25823c.m79695G0(false);
        } else {
            this.f25823c.m79710v0(user, m178899N0(user));
        }
        xdl0.m208344M(this.f25833m, true);
        List<String> list = r6n.m178067f().f157966n;
        boolean z = this.f25838r.f149105e;
        String str = LocalPlaceBan.chatList;
        if (list.contains(TextUtils.concat(z ? LocalPlaceBan.matchList : LocalPlaceBan.chatList, user.f56011id).toString())) {
            return;
        }
        zvf0.m220368A("e_chat_request", OMSDialogPositon.p_messages_view, vwb.m200311Y("show_where", this.f25838r.f149105e ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), vwb.m200311Y("request_show_type", this.f25838r.f149109i), vwb.m200311Y("show_position", (this.f25838r.f149107g + 1) + "/" + ((p36) this.f25838r.f149104d).mo41519h()));
        List<String> list2 = r6n.m178067f().f157966n;
        if (this.f25838r.f149105e) {
            str = LocalPlaceBan.matchList;
        }
        list2.add(TextUtils.concat(str, user.f56011id).toString());
    }

    /* JADX INFO: renamed from: k1 */
    public final void m42433k1(@Nullable final UserLiveLabel userLiveLabel, String str) {
        int i = 0;
        while (true) {
            if (i >= this.f25821a.getChildCount()) {
                break;
            }
            View childAt = this.f25821a.getChildAt(i);
            int id = childAt.getId();
            if (id != u4c0.f173901Ke) {
                xdl0.m208344M(childAt, id == u4c0.f174261g7);
            }
            i++;
        }
        xdl0.m208344M(this.f25822b, true);
        if (NullChecker.m81303a(userLiveLabel) && userLiveLabel.isVoiceChat()) {
            this.f25822b.m41669e(-13450309, -13450309);
        } else {
            boolean zM194847z = upa.m194847z();
            LiveHaloAvatar liveHaloAvatar = this.f25822b;
            if (zM194847z) {
                liveHaloAvatar.m41669e(-38484, -40983);
            } else {
                liveHaloAvatar.m41669e(-38485, -41238);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(str).m8607O(new nvc0(this.f25822b.getAvatarSize(), this.f25822b.getAvatarSize())).m8614a();
            bkb0 bkb0Var = qib0.f154691G;
            LiveHaloAvatar liveHaloAvatar2 = this.f25822b;
            Objects.requireNonNull(liveHaloAvatar2);
            bkb0Var.m102318F(imageRequestM8614a, new f56(liveHaloAvatar2));
        }
        xdl0.m208329E0(this.f25822b, new View.OnClickListener() { // from class: l.a96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68115a.m42430h1(userLiveLabel, view);
            }
        });
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: l0 */
    public void mo42434l0(Conversation conversation, User user, pi6 pi6Var) {
        xdl0.m208344M(this.f25832l, true);
        m42445u1(t100.f167261j, t100.f167254c);
        qib0.f154691G.m102331L0(this.f25832l, user.m60124fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: l1 */
    public final void m42435l1() {
        if (m178886A0(this.f25838r.f149101a)) {
            m42444t1();
            m42443s1();
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m */
    public void mo41013m(pi6 pi6Var) {
        this.f25838r = pi6Var;
        boolean zM194726a2 = upa.m194726a2();
        VDraweeView vDraweeView = this.f25837q;
        if (zM194726a2) {
            xdl0.m208329E0(vDraweeView, this);
            this.f25837q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f25837q.setClickable(false);
        }
        this.f25823c.m79695G0(false);
        m42429g1();
        xdl0.m208344M(this.f25827g, false);
        xdl0.m208344M(this.f25830j, false);
        xdl0.m208344M(this.f25822b, false);
        xdl0.m208344M(this.f25823c, true);
        xdl0.m208344M(this.f25835o, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo41014m0(pi6 pi6Var) {
        xdl0.m208344M(this.f25832l, true);
        m42445u1(t100.f167261j, 0);
        qib0.f154691G.m102331L0(this.f25832l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
        ViewGroup.LayoutParams layoutParams = this.f25837q.getLayoutParams();
        layoutParams.width = t100.m186890d(55.0f);
        layoutParams.height = t100.m186890d(55.0f);
        this.f25837q.setLayoutParams(layoutParams);
        qib0.f154691G.m102354Y0(this.f25837q, x2c0.f189263Dd);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m42436m1() {
        RoundingParams roundingParamsM8249c = RoundingParams.m8249c(t100.f167260i);
        roundingParamsM8249c.m8268v(true);
        this.f25832l.getHierarchy().m112053H(roundingParamsM8249c);
        if (ogl0.m164245X() && this.f25838r.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) && !xma.m210047L3() && !CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            xdl0.m208344M(this.f25832l, true);
            qib0.f154691G.m102331L0(this.f25832l, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9IM1VYMjRHV083V0dBTVQzQzNSVTdBWENMSEdNNDE0IiwidyI6OTYsImgiOjk3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyODA4MTUyMzgwNDQ4NDM5NX0.png");
            return;
        }
        if (CoreModule.m29935P().m94656g().mo35085xn() && NullChecker.m81303a(this.f25838r.f149101a) && this.f25838r.f149101a.isConfessionFirstConv()) {
            xdl0.m208344M(this.f25832l, true);
            if (upa.m194847z()) {
                qib0.f154691G.m102354Y0(this.f25832l, x2c0.f189734Sg);
                return;
            } else {
                qib0.f154691G.m102354Y0(this.f25832l, x2c0.f189525Lo);
                return;
            }
        }
        if (ml6.m155119d(this.f25838r.f149101a)) {
            xdl0.m208344M(this.f25832l, false);
            xdl0.m208344M(this.f25826f, true);
            xdl0.m208321A0(getContext(), this.f25826f, x2c0.f189422Ie);
        } else {
            if (!ml6.m155121f(this.f25838r.f149101a) && !TextUtils.equals(this.f25838r.f149101a.convType, ConversationType.fakeIntlReceiveLikeGuideSVip)) {
                xdl0.m208344M(this.f25832l, false);
                return;
            }
            xdl0.m208344M(this.f25832l, false);
            xdl0.m208344M(this.f25826f, true);
            xdl0.m208321A0(getContext(), this.f25826f, x2c0.f189328Fe);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m42437n1() {
        if (NullChecker.m81303a(this.f25838r.f149101a.property.intl_chat_source) && SummarizedPrivilegesId.spotLight.equals(this.f25838r.f149101a.property.intl_chat_source.source)) {
            this.f25824d.setVisibility(0);
        } else {
            this.f25824d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m42438o1(Conversation conversation, User user, int i) {
        if (m178921c0(this.f25838r)) {
            if (NullChecker.m81303a(this.f25838r.f149101a) && this.f25838r.f149101a.isAnonymous()) {
                this.f25823c.m79692B0(user.getAnonymousUrl());
                return;
            } else {
                qib0.f154691G.m102341Q0(this.f25837q, m178899N0(user));
                return;
            }
        }
        xdl0.m208344M(this.f25827g, false);
        if (NullChecker.m81303a(this.f25838r.f149101a) && this.f25838r.f149101a.isAnonymous()) {
            qib0.f154691G.m102331L0(this.f25837q, this.f25838r.f149102b.getAnonymousUrl());
            this.f25823c.m79695G0(false);
        } else {
            HeaderFrameWrapper headerFrameWrapper = this.f25823c;
            User user2 = this.f25838r.f149102b;
            headerFrameWrapper.m79710v0(user2, m178899N0(user2));
        }
        if (!m178930n(conversation) || m178927j(conversation)) {
            m42427e1();
            setLivingHead(m178909U0(this.f25838r));
        }
        if (TextUtils.equals(conversation.convType, "lovescript")) {
            this.f25823c.m79697i0(m178899N0(this.f25838r.f149102b).formatted(), 2, 8);
            this.f25823c.m79695G0(false);
            xdl0.m208344M(this.f25827g, true);
            this.f25827g.setBitmapRes(x2c0.f189421Id);
            ViewGroup.LayoutParams layoutParams = this.f25827g.getLayoutParams();
            int i2 = this.f25839s;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f25827g.setLayoutParams(layoutParams);
            this.f25827g.m43687b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (mo42420K0()) {
            return;
        }
        pi6 pi6Var = this.f25838r;
        Conversation conversation = pi6Var.f149101a;
        m178939w(pi6Var);
        if (NullChecker.m81303a(conversation)) {
            if (upa.m194726a2()) {
                m42431i1();
            } else {
                getContext().startActivity(ProfileAct.m50736n2(getContext(), conversation.otherUser, "conversation_view", false));
            }
        }
        m178941x0(this.f25838r);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42426d1(this);
        this.f25837q = this.f25823c.get_pic();
        if (upa.m194847z()) {
            int i = pi6.f149080Q;
            xdl0.m208327D0((t100.f167261j * 2) + i, this);
            xdl0.m208325C0(this, t100.m186890d(15.0f) + i);
            rd6.m178882v(t100.m186890d(7.0f) + i, this.f25822b);
            this.f25822b.m41668d(i - t100.f167259h, t100.f167258g + i);
            rd6.m178882v(t100.m186890d(15.0f) + i, this.f25823c);
            rd6.m178882v(t100.m186890d(6.0f) + i, this.f25824d);
            rd6.m178882v(t100.m186890d(6.0f) + i, this.f25827g);
            rd6.m178882v(i, this.f25828h);
            this.f25831k.setImageResource(x2c0.f189361Gf);
            xdl0.m208359W(this.f25832l, -t100.f167256e);
            xdl0.m208360X(this.f25832l, -t100.m186890d(7.0f));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m42439p1() {
        boolean zLowPayOneSideConv = this.f25838r.f149101a.lowPayOneSideConv();
        VImage vImage = this.f25829i;
        if (zLowPayOneSideConv) {
            xdl0.m208344M(vImage, !this.f25838r.f149101a.read.booleanValue() && this.f25838r.f149101a.additional.lowPayOneside.reddot);
        } else {
            xdl0.m208344M(vImage, !this.f25838r.f149101a.read.booleanValue());
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m42440q1() {
        if (!u59.m191823d0() || !NullChecker.m81303a(this.f25838r.f149101a) || !"lovebuzz".equals(this.f25838r.f149101a.convType)) {
            xdl0.m208344M(this.f25834n, false);
            xdl0.m208344M(this.f25825e, false);
            return;
        }
        xdl0.m208344M(this.f25834n, true);
        xdl0.m208344M(this.f25825e, true);
        CoreModule.f17554l.m94652b().mo35132xp(this.f25837q, sw6.m186126a(this.f25838r.f149102b).profileSmall(), CoreModule.m29935P().m94652b().mo35105Wr(this.f25838r.f149101a) ? 100 : !CoreModule.m29935P().m94652b().mo35133zo(this.f25838r.f149101a) ? this.f25838r.f149085A : 100);
        this.f25823c.m79695G0(false);
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: r */
    public void mo42441r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            xdl0.m208344M(this.f25827g, true);
            this.f25823c.m79695G0(false);
            LiveHaloAvatar liveHaloAvatar = this.f25822b;
            if (liveHaloAvatar != null) {
                xdl0.m208344M(liveHaloAvatar, false);
            }
            int i = (int) ((j2 - j) / 1000);
            if (j3 > 0) {
                this.f25827g.setProgress(100 - ((int) (((long) (i * 100)) / j3)));
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m42442r1() {
        this.f25838r.f149095K = xdl0.m208349O0(this.f25822b) ? "1" : "0";
        pi6 pi6Var = this.f25838r;
        pi6Var.f149096L = (NullChecker.m81303a(pi6Var.f149102b) && this.f25823c.m79701m0(this.f25838r.f149102b)) ? "audio_avatar_frame" : "";
    }

    /* JADX INFO: renamed from: s1 */
    public final void m42443s1() {
        if (this.f25838r.f149101a.property.loveScript.expireTime <= mqi0.m155944o()) {
            CoreModule.f17545c.f19685t1.m31516u("love_script_tag_" + this.f25838r.f149101a.f56011id);
            CoreModule.f17545c.f19642f0.m32809Tf(this.f25838r.f149101a.f56011id);
        }
        if (this.f25838r.f149101a.property.loveScript.expireTime > mqi0.m155944o()) {
            LoveScript loveScript = this.f25838r.f149101a.property.loveScript;
            long j = loveScript.createdTime;
            if (j != 0) {
                long j2 = loveScript.expireTime;
                this.f25827g.setProgress((int) ((((double) Math.round(((j2 - mqi0.m155944o()) * 100) / (j2 - j))) / 100.0d) * 100.0d));
            }
        }
    }

    @Override // p149l.bpl
    public void setPicPercent(float f) {
        this.f25823c.setPicPercent(f);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo41022t0(final pi6 pi6Var) {
        this.f25838r = pi6Var;
        xdl0.m208344M(this.f25830j, false);
        xdl0.m208345M0(this.f25835o, false);
        xdl0.m208344M(this.f25827g, false);
        ViewGroup.LayoutParams layoutParams = this.f25837q.getLayoutParams();
        int i = this.f25839s;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f25837q.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f25823c, true);
        xdl0.m208344M(this.f25822b, false);
        if (pi6Var.f149122v && NullChecker.m81303a(pi6Var.f149102b)) {
            if (!pi6Var.f149102b.isBanedOrInactivated()) {
                xdl0.m208344M(this.f25823c.get_frame(), false);
                qib0.f154691G.m102341Q0(this.f25837q, m178899N0(pi6Var.f149102b));
            }
            xdl0.m208329E0(this.f25823c, new View.OnClickListener() { // from class: l.b96
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pi6Var.f149088D.performClick();
                }
            });
            return;
        }
        boolean zM194726a2 = upa.m194726a2();
        VDraweeView vDraweeView = this.f25837q;
        if (zM194726a2) {
            xdl0.m208329E0(vDraweeView, this);
            this.f25837q.setClickable(true);
        } else {
            vDraweeView.setOnClickListener(null);
            this.f25837q.setClickable(false);
        }
        m42429g1();
        this.f25837q.setBackgroundResource(0);
        m42445u1(t100.f167260i, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m42444t1() {
        if (m178887D(this.f25838r)) {
            return;
        }
        xdl0.m208345M0(this.f25830j, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m42445u1(int i, int i2) {
        RoundingParams roundingParamsM112069p = this.f25832l.getHierarchy().m112069p();
        if (NullChecker.m81303a(roundingParamsM112069p)) {
            float[] fArrM8252f = roundingParamsM112069p.m8252f();
            if (NullChecker.m81303a(fArrM8252f) && fArrM8252f.length > 0 && fArrM8252f[0] == i && roundingParamsM112069p.m8251e() == i2) {
                return;
            }
        }
        RoundingParams roundingParamsM8249c = RoundingParams.m8249c(i);
        roundingParamsM8249c.m8261o(-1, i2);
        roundingParamsM8249c.m8268v(true);
        this.f25832l.getHierarchy().m112053H(roundingParamsM8249c);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m42446v1() {
        Message messageM178933p = m178933p(this.f25838r);
        if (m178887D(this.f25838r)) {
            return;
        }
        pi6 pi6Var = this.f25838r;
        if (m178922f(messageM178933p, pi6Var.f149102b, pi6Var.f149101a)) {
            Conversation conversation = this.f25838r.f149101a;
            String strM186865f = t0g0.m186865f(conversation.unreadMessages + m178898M(conversation));
            xdl0.m208345M0(this.f25835o, true);
            this.f25836p.setText(strM186865f);
            this.f25836p.setBackgroundResource(x2c0.f190284k1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m42447w1() {
        if (this.f25838r.f149115o) {
            xdl0.m208344M(this.f25831k, false);
            xdl0.m208344M(this.f25835o, false);
        }
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo42414y0() {
        if (!m178914Y(this.f25838r.f149101a)) {
            xdl0.m208344M(this.f25828h, true);
            return;
        }
        for (int i = 0; i < this.f25821a.getChildCount(); i++) {
            View childAt = this.f25821a.getChildAt(i);
            int id = childAt.getId();
            if (id == u4c0.f174261g7 || id == u4c0.f174221e1 || id == u4c0.f174286hf) {
                xdl0.m208344M(childAt, false);
            }
        }
        xdl0.m208344M(this.f25828h, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo41028z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f25838r = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.localEverHasMessage) {
            return;
        }
        User user2 = pi6Var.f149102b;
        if (user2 == null || !user2.f56011id.equals(user.f56011id)) {
            m42428f1();
        }
        pi6Var.f149102b = user;
        if (user.isBannedNew() || pi6Var.f149102b.isAccountCancellation()) {
            this.f25823c.m79713z0(x2c0.f190189h0);
            return;
        }
        HeaderFrameWrapper headerFrameWrapper = this.f25823c;
        User user3 = pi6Var.f149102b;
        headerFrameWrapper.m79710v0(user3, m178899N0(user3));
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25837q = null;
        this.f25839s = upa.m194847z() ? pi6.f149080Q : t100.m186890d(55.0f);
    }

    public ConversationItemHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25837q = null;
        this.f25839s = upa.m194847z() ? pi6.f149080Q : t100.m186890d(55.0f);
    }
}
