package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p149l.bkb0;
import p149l.e30;
import p149l.f56;
import p149l.hae0;
import p149l.hb30;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.nvc0;
import p149l.pi6;
import p149l.qib0;
import p149l.rd6;
import p149l.t100;
import p149l.uhc0;
import p149l.upa;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class RecommendNormalUserView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public RecommendNormalUserView f25280d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f25281e;

    /* JADX INFO: renamed from: f */
    public VFrame f25282f;

    /* JADX INFO: renamed from: g */
    public VRelative f25283g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f25284h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f25285i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f25286j;

    /* JADX INFO: renamed from: k */
    public VFrame f25287k;

    /* JADX INFO: renamed from: l */
    public VImage f25288l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f25289m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f25290n;

    public RecommendNormalUserView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: X */
    private void m41795X(ConversationHeadRecommendLayout.C8115c c8115c) {
        xdl0.m208344M(this.f25286j, true);
        xdl0.m208344M(this.f24616c, false);
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(this.f24614a.m60124fp().profileSmall().base).m8607O(new nvc0(this.f25286j.getAvatarSize(), this.f25286j.getAvatarSize())).m8614a();
        boolean zEquals = "onVoice".equals(c8115c.f24783j);
        this.f25286j.m41669e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.f154691G;
        LiveHaloAvatar liveHaloAvatar = this.f25286j;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.m102318F(imageRequestM8614a, new f56(liveHaloAvatar));
        m40575G(c8115c, zEquals);
        xdl0.m208344M(this.f25287k, true);
        this.f25289m.setText("直播中");
        this.f25288l.setImageResource(x2c0.f190595to);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo40574F() {
        this.f25290n.setText("暂无推荐");
        if (upa.m194847z()) {
            this.f25281e.m79713z0(x2c0.f189703Rg);
            this.f25290n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        } else {
            this.f25290n.setTextColor(Color.parseColor("#66000000"));
            this.f25281e.m79713z0(x2c0.f190563so);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m41796Q(View view) {
        uhc0.m193704a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m41797R() {
        xdl0.m208344M(this.f24616c, true);
        xdl0.m208344M(this.f25287k, false);
        xdl0.m208344M(this.f25286j, false);
        xdl0.m208344M(this.f25283g, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m41798S(User user) {
        this.f24614a = user;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m41799T(Conversation conversation) {
        this.f24615b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m41800V(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c, j760 j760Var) {
        ConversationHeadRecommendLayout.C8114b c8114b2;
        if (m40572C()) {
            c8114b.m40787O(c8115c.f24777d, false);
            return;
        }
        if (c8115c.f24779f) {
            m41795X(c8115c);
        } else if (NullChecker.m81303a(this.f24615b) && this.f24615b.isAnonymous()) {
            qib0.f154691G.m102331L0(this.f24616c, this.f24614a.getAnonymousUrl());
        } else {
            qib0.f154691G.m102341Q0(this.f24616c, BaseConversationRecommendItemView.m40571B(this.f24614a));
        }
        if (this.f24614a.isBannedNew() || this.f24614a.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(this.f24616c, x2c0.f190189h0);
        }
        if (CoreModule.f17545c.f19588N0.m31967k3(this.f24614a, 5) && !c8115c.f24779f) {
            xdl0.m208344M(this.f25287k, true);
            this.f25288l.setImageResource(x2c0.f190659vo);
            this.f25289m.setText("在线");
        }
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
        if (!c8115c.f24779f && NullChecker.m81303a(chatRoundsDisplayedExternallyConfigM194680P) && chatRoundsDisplayedExternallyConfigM194680P.enabled && NullChecker.m81303a(this.f24615b) && this.f24615b.doubleDefault() && NullChecker.m81303a(this.f24615b.additional) && NullChecker.m81303a(this.f24615b.additional.chatMM) && this.f24615b.additional.chatMM.partnerSwitch) {
            c8115c.f24795v = 1;
            xdl0.m208344M(this.f25287k, true);
            if (!CoreModule.f17545c.f19588N0.m31967k3(this.f24614a, 5) || c8115c.f24779f) {
                this.f25289m.setText("密友");
                this.f25288l.setImageResource(x2c0.f190531ro);
            } else {
                this.f25289m.setText("在线·密友");
                this.f25288l.setImageResource(x2c0.f190627uo);
            }
        }
        if (c8115c.f24774a == 21) {
            setOnLongClickListener(null);
            c8114b2 = c8114b;
        } else {
            c8114b2 = c8114b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC8104a(c8114b2, getContext(), (j760) j760Var.f116565b, this.f24615b, this.f24614a));
        }
        this.f25290n.setText(this.f24614a.name);
        this.f25281e.m79702n0(this.f24614a);
        m40576K(c8114b2, c8115c, this.f25281e.m79701m0(this.f24614a));
        int i = c8115c.f24774a;
        if (i == 16 || i == 17) {
            m40575G(c8115c, i == 17);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m41801W(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC8105b(this.f24615b, c8114b, c8115c).onClick(view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m41802Y(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c) {
        if (NullChecker.m81303a(c8115c.f24799z)) {
            hb30.m130318x(m40577p(), c8115c, this.f24616c, this.f25289m, this.f25288l, this.f25290n, this.f25280d);
            boolean zM194847z = upa.m194847z();
            VText_Bold vText_Bold = this.f25290n;
            if (zM194847z) {
                vText_Bold.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold.setTextColor(Color.parseColor("#E9B442"));
            }
            this.f25288l.setImageResource(x2c0.f190723xo);
        } else if (NullChecker.m81303a(c8115c.f24798y)) {
            hb30.m130316v(m40577p(), c8114b, c8115c, this.f24616c, this.f25289m, this.f25288l, this.f25290n, this.f25280d);
            boolean zM194847z2 = upa.m194847z();
            VText_Bold vText_Bold2 = this.f25290n;
            if (zM194847z2) {
                vText_Bold2.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f25288l.setImageResource(x2c0.f190691wo);
        } else {
            hb30.m130315u(m40577p(), c8115c, this.f24616c, this.f25289m, this.f25288l, this.f25290n, this.f25280d);
            boolean zM194847z3 = upa.m194847z();
            VText_Bold vText_Bold3 = this.f25290n;
            if (zM194847z3) {
                vText_Bold3.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            } else {
                vText_Bold3.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f25288l.setImageResource(x2c0.f190691wo);
        }
        xdl0.m208344M(this.f25287k, true);
    }

    /* JADX INFO: renamed from: Z */
    public final void m41803Z(final ConversationHeadRecommendLayout.C8114b c8114b, final ConversationHeadRecommendLayout.C8115c c8115c) {
        c8114b.mo67374c(m40577p(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24777d).doOnNext(new e30() { // from class: l.phc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148888a.m41798S((User) obj);
            }
        }), CoreModule.f17553k.f91950m.uiGet(c8115c.f24777d).doOnNext(new e30() { // from class: l.qhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154452a.m41799T((Conversation) obj);
            }
        }).switchMap(new w9j() { // from class: l.rhc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(new j760(-1, Boolean.FALSE));
            }
        }), new hae0())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.shc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164541a.m41800V(c8114b, c8115c, (j760) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.thc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170217a.m41801W(c8114b, c8115c, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m41804a0(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C8115c c8115c) {
        m41797R();
        if (c8115c.f24774a == 15) {
            m41802Y(c8114b, c8115c);
        } else {
            m41803Z(c8114b, c8115c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41796Q(this);
        this.f24616c = this.f25281e.get_pic();
        this.f25281e.setShowSVipFrame(false);
        this.f25281e.setPicPercent(1.0f);
        if (upa.m194741d3()) {
            xdl0.m208325C0(this.f25280d, t100.m186890d(96.0f));
            xdl0.m208360X(this.f25281e, t100.m186890d(16.0f));
            xdl0.m208360X(this.f25282f, t100.m186890d(16.0f));
        }
        if (upa.m194847z()) {
            int i = pi6.f149080Q;
            int i2 = t100.f167258g;
            xdl0.m208327D0(i + i2, this.f25280d);
            xdl0.m208325C0(this.f25280d, t100.f167243R);
            HeaderFrameWrapper headerFrameWrapper = this.f25281e;
            int i3 = t100.f167264m;
            xdl0.m208360X(headerFrameWrapper, i3);
            xdl0.m208360X(this.f25282f, i3);
            rd6.m178882v(i, this.f25281e);
            rd6.m178882v(i2 + i, this.f25282f);
            rd6.m178882v(i, this.f25283g);
            rd6.m178882v(i - t100.m186890d(11.0f), this.f25285i);
            rd6.m178882v(i, this.f25286j);
            this.f25286j.m41668d(i - t100.m186890d(11.0f), i);
            xdl0.m208360X(this.f25287k, t100.m186890d(49.0f));
            this.f25290n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
