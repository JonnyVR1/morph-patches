package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p000p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.bkb0;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.nvc0;
import l.qib0;
import l.t100;
import l.uhc0;
import l.upa;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p009l.f56;
import p009l.hae0;
import p009l.hb30;
import p009l.pi6;
import p009l.rd6;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RecommendNormalUserView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public RecommendNormalUserView f4058d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f4059e;

    /* JADX INFO: renamed from: f */
    public VFrame f4060f;

    /* JADX INFO: renamed from: g */
    public VRelative f4061g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f4062h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4063i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f4064j;

    /* JADX INFO: renamed from: k */
    public VFrame f4065k;

    /* JADX INFO: renamed from: l */
    public VImage f4066l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f4067m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f4068n;

    public RecommendNormalUserView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: X */
    private void m5919X(ConversationHeadRecommendLayout.C0279c c0279c) {
        xdl0.M(this.f4064j, true);
        xdl0.M(this.f3394c, false);
        ImageRequest imageRequestA = qib0.G.n(this.f3392a.fp().profileSmall().base).O(new nvc0(this.f4064j.getAvatarSize(), this.f4064j.getAvatarSize())).a();
        boolean zEquals = "onVoice".equals(c0279c.f3561j);
        this.f4064j.m5793e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.G;
        LiveHaloAvatar liveHaloAvatar = this.f4064j;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.F(imageRequestA, new f56(liveHaloAvatar));
        m4668G(c0279c, zEquals);
        xdl0.M(this.f4065k, true);
        this.f4067m.setText("直播中");
        this.f4066l.setImageResource(x2c0.to);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo4667F() {
        this.f4068n.setText("暂无推荐");
        if (upa.z()) {
            this.f4059e.m10034z0(x2c0.Rg);
            this.f4068n.setTextColor(-16777216);
        } else {
            this.f4068n.setTextColor(Color.parseColor("#66000000"));
            this.f4059e.m10034z0(x2c0.so);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m5920Q(View view) {
        uhc0.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m5921R() {
        xdl0.M(this.f3394c, true);
        xdl0.M(this.f4065k, false);
        xdl0.M(this.f4064j, false);
        xdl0.M(this.f4061g, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m5922S(User user) {
        this.f3392a = user;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m5923T(Conversation conversation) {
        this.f3393b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m5924V(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c, j760 j760Var) {
        ConversationHeadRecommendLayout.C0278b c0278b2;
        if (m4665C()) {
            c0278b.m4885O(c0279c.f3555d, false);
            return;
        }
        if (c0279c.f3557f) {
            m5919X(c0279c);
        } else if (NullChecker.a(this.f3393b) && this.f3393b.isAnonymous()) {
            qib0.G.L0(this.f3394c, this.f3392a.getAnonymousUrl());
        } else {
            qib0.G.Q0(this.f3394c, BaseConversationRecommendItemView.m4664B(this.f3392a));
        }
        if (this.f3392a.isBannedNew() || this.f3392a.isAccountCancellation()) {
            qib0.G.Y0(this.f3394c, x2c0.h0);
        }
        if (CoreModule.c.N0.k3(this.f3392a, 5) && !c0279c.f3557f) {
            xdl0.M(this.f4065k, true);
            this.f4066l.setImageResource(x2c0.vo);
            this.f4067m.setText("在线");
        }
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
        if (!c0279c.f3557f && NullChecker.a(chatRoundsDisplayedExternallyConfigP) && chatRoundsDisplayedExternallyConfigP.enabled && NullChecker.a(this.f3393b) && this.f3393b.doubleDefault() && NullChecker.a(this.f3393b.additional) && NullChecker.a(this.f3393b.additional.chatMM) && this.f3393b.additional.chatMM.partnerSwitch) {
            c0279c.f3573v = 1;
            xdl0.M(this.f4065k, true);
            if (!CoreModule.c.N0.k3(this.f3392a, 5) || c0279c.f3557f) {
                this.f4067m.setText("密友");
                this.f4066l.setImageResource(x2c0.ro);
            } else {
                this.f4067m.setText("在线·密友");
                this.f4066l.setImageResource(x2c0.uo);
            }
        }
        if (c0279c.f3552a == 21) {
            setOnLongClickListener(null);
            c0278b2 = c0278b;
        } else {
            c0278b2 = c0278b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC0268a(c0278b2, getContext(), (j760) j760Var.b, this.f3393b, this.f3392a));
        }
        this.f4068n.setText(this.f3392a.name);
        this.f4059e.m10023n0(this.f3392a);
        m4669K(c0278b2, c0279c, this.f4059e.m10022m0(this.f3392a));
        int i = c0279c.f3552a;
        if (i == 16 || i == 17) {
            m4668G(c0279c, i == 17);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m5925W(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC0269b(this.f3393b, c0278b, c0279c).onClick(view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m5926Y(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c) {
        if (NullChecker.a(c0279c.f3577z)) {
            hb30.m15498x(m4670p(), c0279c, this.f3394c, this.f4067m, this.f4066l, this.f4068n, this.f4058d);
            boolean z = upa.z();
            VText_Bold vText_Bold = this.f4068n;
            if (z) {
                vText_Bold.setTextColor(-16777216);
            } else {
                vText_Bold.setTextColor(Color.parseColor("#E9B442"));
            }
            this.f4066l.setImageResource(x2c0.xo);
        } else if (NullChecker.a(c0279c.f3576y)) {
            hb30.m15496v(m4670p(), c0278b, c0279c, this.f3394c, this.f4067m, this.f4066l, this.f4068n, this.f4058d);
            boolean z2 = upa.z();
            VText_Bold vText_Bold2 = this.f4068n;
            if (z2) {
                vText_Bold2.setTextColor(-16777216);
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f4066l.setImageResource(x2c0.wo);
        } else {
            hb30.m15495u(m4670p(), c0279c, this.f3394c, this.f4067m, this.f4066l, this.f4068n, this.f4058d);
            boolean z3 = upa.z();
            VText_Bold vText_Bold3 = this.f4068n;
            if (z3) {
                vText_Bold3.setTextColor(-16777216);
            } else {
                vText_Bold3.setTextColor(Color.parseColor("#FF9669"));
            }
            this.f4066l.setImageResource(x2c0.wo);
        }
        xdl0.M(this.f4065k, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public final void m5927Z(final ConversationHeadRecommendLayout.C0278b c0278b, final ConversationHeadRecommendLayout.C0279c c0279c) {
        c0278b.c(m4670p(), mkd0.r(CoreModule.c.e0.Ka(c0279c.f3555d).doOnNext(new e30() { // from class: l.phc0
            public final void call(Object obj) {
                this.f18593a.m5922S((User) obj);
            }
        }), CoreModule.k.m.uiGet(c0279c.f3555d).doOnNext(new e30() { // from class: l.qhc0
            public final void call(Object obj) {
                this.f19257a.m5923T((Conversation) obj);
            }
        }).switchMap(new w9j() { // from class: l.rhc0
            public final Object call(Object obj) {
                return c.just(new j760(-1, Boolean.FALSE));
            }
        }), new hae0())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.shc0
            public final void call(Object obj) {
                this.f20265a.m5924V(c0278b, c0279c, (j760) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.thc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20695a.m5925W(c0278b, c0279c, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m5928a0(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C0279c c0279c) {
        m5921R();
        if (c0279c.f3552a == 15) {
            m5926Y(c0278b, c0279c);
        } else {
            m5927Z(c0278b, c0279c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5920Q(this);
        this.f3394c = this.f4059e.get_pic();
        this.f4059e.setShowSVipFrame(false);
        this.f4059e.setPicPercent(1.0f);
        if (upa.d3()) {
            xdl0.C0(this.f4058d, t100.d(96.0f));
            xdl0.X(this.f4059e, t100.d(16.0f));
            xdl0.X(this.f4060f, t100.d(16.0f));
        }
        if (upa.z()) {
            int i = pi6.f18601Q;
            int i2 = t100.g;
            xdl0.D0(i + i2, new View[]{this.f4058d});
            xdl0.C0(this.f4058d, t100.R);
            ConstraintLayout constraintLayout = this.f4059e;
            int i3 = t100.m;
            xdl0.X(constraintLayout, i3);
            xdl0.X(this.f4060f, i3);
            rd6.m21523v(i, this.f4059e);
            rd6.m21523v(i2 + i, this.f4060f);
            rd6.m21523v(i, this.f4061g);
            rd6.m21523v(i - t100.d(11.0f), this.f4063i);
            rd6.m21523v(i, this.f4064j);
            this.f4064j.m5792d(i - t100.d(11.0f), i);
            xdl0.X(this.f4065k, t100.d(49.0f));
            this.f4068n.setTextColor(-16777216);
        }
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendNormalUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
