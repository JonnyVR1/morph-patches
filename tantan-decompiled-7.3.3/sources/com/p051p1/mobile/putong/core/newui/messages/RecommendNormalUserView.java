package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.bqc0;
import p153l.dbc0;
import p153l.fo0;
import p153l.fsb0;
import p153l.gra;
import p153l.k66;
import p153l.mie0;
import p153l.pf60;
import p153l.psd0;
import p153l.q3d0;
import p153l.qa00;
import p153l.qcj;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;
import p153l.vj30;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class RecommendNormalUserView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public RecommendNormalUserView f26022d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f26023e;

    /* JADX INFO: renamed from: f */
    public VFrame f26024f;

    /* JADX INFO: renamed from: g */
    public VRelative f26025g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f26026h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f26027i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f26028j;

    /* JADX INFO: renamed from: k */
    public VFrame f26029k;

    /* JADX INFO: renamed from: l */
    public VImage f26030l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f26031m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f26032n;

    public RecommendNormalUserView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: X */
    private void m42806X(ConversationHeadRecommendLayout.C8266c c8266c) {
        bnl0.m105524M(this.f26028j, true);
        bnl0.m105524M(this.f25358c, false);
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(this.f25356a.m61308fp().profileSmall().base).m8661O(new q3d0(this.f26028j.getAvatarSize(), this.f26028j.getAvatarSize())).m8668a();
        boolean zEquals = "onVoice".equals(c8266c.f25525j);
        this.f26028j.m42680e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        fsb0 fsb0Var = uqb0.f180374G;
        LiveHaloAvatar liveHaloAvatar = this.f26028j;
        Objects.requireNonNull(liveHaloAvatar);
        fsb0Var.m127102F(imageRequestM8668a, new k66(liveHaloAvatar));
        m41586G(c8266c, zEquals);
        bnl0.m105524M(this.f26029k, true);
        this.f26031m.setText("直播中");
        this.f26030l.setImageResource(dbc0.f87064hp);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo41585F() {
        this.f26032n.setText("暂无推荐");
        if (gra.m131778z()) {
            this.f26023e.m80896z0(dbc0.f86154Fh);
            this.f26032n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        } else {
            this.f26032n.setTextColor(Color.parseColor("#66000000"));
            this.f26023e.m80896z0(dbc0.f87031gp);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m42807Q(View view) {
        bqc0.m105887a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m42808R() {
        bnl0.m105524M(this.f25358c, true);
        bnl0.m105524M(this.f26029k, false);
        bnl0.m105524M(this.f26028j, false);
        bnl0.m105524M(this.f26025g, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m42809S(User user) {
        this.f25356a = user;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m42810T(Conversation conversation) {
        this.f25357b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m42811V(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c, pf60 pf60Var) {
        ConversationHeadRecommendLayout.C8265b c8265b2;
        if (m41583C()) {
            c8265b.m41798O(c8266c.f25519d, false);
            return;
        }
        if (c8266c.f25521f) {
            m42806X(c8266c);
        } else if (NullChecker.m82486a(this.f25357b) && this.f25357b.isAnonymous()) {
            uqb0.f180374G.m127115L0(this.f25358c, this.f25356a.getAnonymousUrl());
        } else {
            uqb0.f180374G.m127125Q0(this.f25358c, BaseConversationRecommendItemView.m41582B(this.f25356a));
        }
        if (this.f25356a.isBannedNew() || this.f25356a.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(this.f25358c, dbc0.f87072i0);
        }
        if (CoreModule.f18264c.f20330N0.m32970k3(this.f25356a, 5) && !c8266c.f25521f) {
            bnl0.m105524M(this.f26029k, true);
            this.f26030l.setImageResource(dbc0.f87128jp);
            this.f26031m.setText("在线");
        }
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
        if (!c8266c.f25521f && NullChecker.m82486a(chatRoundsDisplayedExternallyConfigM131611P) && chatRoundsDisplayedExternallyConfigM131611P.enabled && NullChecker.m82486a(this.f25357b) && this.f25357b.doubleDefault() && NullChecker.m82486a(this.f25357b.additional) && NullChecker.m82486a(this.f25357b.additional.chatMM) && this.f25357b.additional.chatMM.partnerSwitch) {
            c8266c.f25537v = 1;
            bnl0.m105524M(this.f26029k, true);
            if (!CoreModule.f18264c.f20330N0.m32970k3(this.f25356a, 5) || c8266c.f25521f) {
                this.f26031m.setText("密友");
                this.f26030l.setImageResource(dbc0.f86998fp);
            } else {
                this.f26031m.setText("在线·密友");
                this.f26030l.setImageResource(dbc0.f87096ip);
            }
        }
        if (c8266c.f25516a == 21) {
            setOnLongClickListener(null);
            c8265b2 = c8265b;
        } else {
            c8265b2 = c8265b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC8255a(c8265b2, getContext(), (pf60) pf60Var.f152157b, this.f25357b, this.f25356a));
        }
        this.f26032n.setText(this.f25356a.name);
        this.f26023e.m80885n0(this.f25356a);
        m41587K(c8265b2, c8266c, this.f26023e.m80884m0(this.f25356a));
        int i = c8266c.f25516a;
        if (i == 16 || i == 17) {
            m41586G(c8266c, i == 17);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m42812W(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC8256b(this.f25357b, c8265b, c8266c).onClick(view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m42813Y(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c) {
        if (NullChecker.m82486a(c8266c.f25541z)) {
            vj30.m201486x(m41588p(), c8266c, this.f25358c, this.f26031m, this.f26030l, this.f26032n, this.f26022d);
            boolean zM131778z = gra.m131778z();
            VText_Bold vText_Bold = this.f26032n;
            if (zM131778z) {
                vText_Bold.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold.setTextColor(Color.parseColor("#E9B442"));
            }
            this.f26030l.setImageResource(dbc0.f87194lp);
        } else if (NullChecker.m82486a(c8266c.f25540y)) {
            vj30.m201484v(m41588p(), c8265b, c8266c, this.f25358c, this.f26031m, this.f26030l, this.f26032n, this.f26022d);
            boolean zM131778z2 = gra.m131778z();
            VText_Bold vText_Bold2 = this.f26032n;
            if (zM131778z2) {
                vText_Bold2.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f26030l.setImageResource(dbc0.f87161kp);
        } else {
            vj30.m201483u(m41588p(), c8266c, this.f25358c, this.f26031m, this.f26030l, this.f26032n, this.f26022d);
            boolean zM131778z3 = gra.m131778z();
            VText_Bold vText_Bold3 = this.f26032n;
            if (zM131778z3) {
                vText_Bold3.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold3.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f26030l.setImageResource(dbc0.f87161kp);
        }
        bnl0.m105524M(this.f26029k, true);
    }

    /* JADX INFO: renamed from: Z */
    public final void m42814Z(final ConversationHeadRecommendLayout.C8265b c8265b, final ConversationHeadRecommendLayout.C8266c c8266c) {
        c8265b.mo68557c(m41588p(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25519d).doOnNext(new y20() { // from class: l.wpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190279a.m42809S((User) obj);
            }
        }), CoreModule.f18272k.f115545m.uiGet(c8266c.f25519d).doOnNext(new y20() { // from class: l.xpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195702a.m42810T((Conversation) obj);
            }
        }).switchMap(new qcj() { // from class: l.ypc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(new pf60(-1, Boolean.FALSE));
            }
        }), new mie0())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205447a.m42811V(c8265b, c8266c, (pf60) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.aqc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72800a.m42812W(c8265b, c8266c, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m42815a0(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C8266c c8266c) {
        m42808R();
        if (c8266c.f25516a == 15) {
            m42813Y(c8265b, c8266c);
        } else {
            m42814Z(c8265b, c8266c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42807Q(this);
        this.f25358c = this.f26023e.get_pic();
        this.f26023e.setShowSVipFrame(false);
        this.f26023e.setPicPercent(1.0f);
        if (gra.m131672d3()) {
            bnl0.m105505C0(this.f26022d, qa00.m175859d(96.0f));
            bnl0.m105540X(this.f26023e, qa00.m175859d(16.0f));
            bnl0.m105540X(this.f26024f, qa00.m175859d(16.0f));
        }
        if (gra.m131778z()) {
            int i = sj6.f168905Q;
            int i2 = qa00.f156320g;
            bnl0.m105507D0(i + i2, this.f26022d);
            bnl0.m105505C0(this.f26022d, qa00.f156305R);
            HeaderFrameWrapper headerFrameWrapper = this.f26023e;
            int i3 = qa00.f156326m;
            bnl0.m105540X(headerFrameWrapper, i3);
            bnl0.m105540X(this.f26024f, i3);
            ue6.m195676v(i, this.f26023e);
            ue6.m195676v(i2 + i, this.f26024f);
            ue6.m195676v(i, this.f26025g);
            ue6.m195676v(i - qa00.m175859d(11.0f), this.f26027i);
            ue6.m195676v(i, this.f26028j);
            this.f26028j.m42679d(i - qa00.m175859d(11.0f), i);
            bnl0.m105540X(this.f26029k, qa00.m175859d(49.0f));
            this.f26032n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
