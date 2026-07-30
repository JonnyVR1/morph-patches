package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p000p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.bkb0;
import l.cj6;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.nvc0;
import l.o6j0;
import l.qib0;
import l.t100;
import l.upa;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p009l.f56;
import p009l.hae0;
import p009l.hb30;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationRecommendItemView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public ConversationRecommendItemView f3814d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f3815e;

    /* JADX INFO: renamed from: f */
    public VFrame f3816f;

    /* JADX INFO: renamed from: g */
    public VRelative f3817g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f3818h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f3819i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f3820j;

    /* JADX INFO: renamed from: k */
    public LiveHaloAvatar f3821k;

    /* JADX INFO: renamed from: l */
    public VImage f3822l;

    /* JADX INFO: renamed from: m */
    public VImage f3823m;

    /* JADX INFO: renamed from: n */
    public VFrame f3824n;

    /* JADX INFO: renamed from: o */
    public VImage f3825o;

    /* JADX INFO: renamed from: p */
    public VText f3826p;

    /* JADX INFO: renamed from: q */
    public VText f3827q;

    /* JADX INFO: renamed from: r */
    public ConversationHeadRecommendLayout f3828r;

    public ConversationRecommendItemView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: E */
    public void mo4666E(ConversationHeadRecommendLayout.C0279c c0279c) {
        super.mo4666E(c0279c);
        if (upa.j() && NullChecker.a(this.f3828r)) {
            this.f3828r.m4857T(c0279c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo4667F() {
        this.f3827q.setBackgroundResource(0);
        this.f3827q.setText(getResources().getString(R.string.Ml));
    }

    /* JADX INFO: renamed from: Q */
    public final void m5366Q(View view) {
        cj6.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m5367R(User user) {
        this.f3392a = user;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m5368S(Conversation conversation) {
        this.f3393b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m5369T(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c, j760 j760Var) {
        ConversationHeadRecommendLayout.C0278b c0278b2;
        if (m4665C()) {
            c0278b.m4885O(c0279c.f3555d, false);
            return;
        }
        xdl0.M(this.f3817g, false);
        if (c0279c.f3557f) {
            m5371W(c0279c);
        } else {
            xdl0.M(this.f3820j, false);
            xdl0.M(this.f3394c, true);
            if (NullChecker.a(this.f3393b) && this.f3393b.isAnonymous()) {
                qib0.G.L0(this.f3394c, this.f3392a.getAnonymousUrl());
            } else {
                qib0.G.Q0(this.f3394c, BaseConversationRecommendItemView.m4664B(this.f3392a));
            }
        }
        if (this.f3392a.isBannedNew() || this.f3392a.isAccountCancellation()) {
            qib0.G.Y0(this.f3394c, x2c0.h0);
        }
        xdl0.M(this.f3823m, CoreModule.c.N0.j3(this.f3392a) && !c0279c.f3557f);
        xdl0.M(this.f3821k, false);
        if ((NullChecker.a(this.f3393b) && (this.f3393b.read.booleanValue() || this.f3393b.localHasMessage)) || ((upa.t1() && this.f3392a.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) || this.f3823m.getVisibility() == 0 || c0279c.f3557f || c0279c.f3552a == 21)) {
            this.f3822l.setVisibility(8);
        } else {
            this.f3822l.setVisibility(0);
            o6j0.h("e_new_match_red_dot", "p_messages_view", new o6j0.a[0]);
        }
        if (c0279c.f3552a == 21) {
            setOnLongClickListener(null);
            c0278b2 = c0278b;
        } else {
            c0278b2 = c0278b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC0268a(c0278b2, getContext(), (j760) j760Var.b, this.f3393b, this.f3392a));
        }
        this.f3827q.setBackgroundResource(0);
        this.f3827q.setText(m4675z(c0279c, this.f3393b));
        ConstraintLayout.a layoutParams = this.f3394c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = t100.d(60.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).height = t100.d(60.0f);
        this.f3394c.setLayoutParams(layoutParams);
        this.f3815e.setPicPercent(0.75f);
        this.f3815e.m10023n0(this.f3392a);
        m4669K(c0278b2, c0279c, this.f3815e.m10022m0(this.f3392a));
        int i = c0279c.f3552a;
        if (i == 16 || i == 17) {
            m4668G(c0279c, i == 17);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m5370V(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC0269b(this.f3393b, c0278b, c0279c).onClick(view);
    }

    /* JADX INFO: renamed from: W */
    public final void m5371W(ConversationHeadRecommendLayout.C0279c c0279c) {
        xdl0.M(this.f3820j, true);
        xdl0.M(this.f3394c, false);
        ImageRequest imageRequestA = qib0.G.n(this.f3392a.fp().profileSmall().base).O(new nvc0(this.f3820j.getAvatarSize(), this.f3820j.getAvatarSize())).a();
        boolean zEquals = "onVoice".equals(c0279c.f3561j);
        this.f3820j.m5793e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.G;
        LiveHaloAvatar liveHaloAvatar = this.f3820j;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.F(imageRequestA, new f56(liveHaloAvatar));
        m4668G(c0279c, zEquals);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public void m5372X(final ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C0279c c0279c) {
        this.f3828r = conversationHeadRecommendLayout;
        int i = c0279c.f3552a;
        VFrame vFrame = this.f3824n;
        if (i == 15) {
            xdl0.M(vFrame, true);
            if (NullChecker.a(c0279c.f3577z)) {
                xdl0.M(this.f3817g, false);
                xdl0.M(this.f3394c, true);
                hb30.m15498x(m4670p(), c0279c, this.f3394c, this.f3826p, this.f3825o, this.f3827q, this.f3814d);
            } else if (NullChecker.a(c0279c.f3575x)) {
                xdl0.M(this.f3817g, false);
                xdl0.M(this.f3394c, true);
                hb30.m15497w(m4670p(), c0278b, c0279c, this.f3394c, this.f3826p, this.f3825o, this.f3827q, this.f3814d);
            } else {
                boolean zA = NullChecker.a(c0279c.f3576y);
                VRelative vRelative = this.f3817g;
                if (zA) {
                    xdl0.M(vRelative, false);
                    xdl0.M(this.f3394c, true);
                    hb30.m15496v(m4670p(), c0278b, c0279c, this.f3394c, this.f3826p, this.f3825o, this.f3827q, this.f3814d);
                } else {
                    xdl0.M(vRelative, false);
                    xdl0.M(this.f3394c, true);
                    hb30.m15495u(m4670p(), c0279c, this.f3394c, this.f3826p, this.f3825o, this.f3827q, this.f3814d);
                }
            }
        } else {
            xdl0.M(vFrame, false);
            c0278b.c(m4670p(), mkd0.r(CoreModule.c.e0.Ka(c0279c.f3555d).doOnNext(new e30() { // from class: l.xi6
                public final void call(Object obj) {
                    this.f22618a.m5367R((User) obj);
                }
            }), CoreModule.k.m.uiGet(c0279c.f3555d).doOnNext(new e30() { // from class: l.yi6
                public final void call(Object obj) {
                    this.f23081a.m5368S((Conversation) obj);
                }
            }).switchMap(new w9j() { // from class: l.zi6
                public final Object call(Object obj) {
                    return c.just(new j760(-1, Boolean.FALSE));
                }
            }), new hae0())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.aj6
                public final void call(Object obj) {
                    this.f9538a.m5369T(c0278b, c0279c, (j760) obj);
                }
            }));
            xdl0.E0(this, new View.OnClickListener() { // from class: l.bj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10125a.m5370V(c0278b, c0279c, view);
                }
            });
        }
        setBackgroundResource(x2c0.v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5366Q(this);
        this.f3394c = this.f3815e.get_pic();
        this.f3815e.setShowSVipFrame(true);
        this.f3394c.setBackgroundResource(x2c0.g6);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: u */
    public String mo4672u(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (!TextUtils.isEmpty(c0279c.f3553b)) {
            return c0279c.f3553b;
        }
        if (!NullChecker.a(c0279c)) {
            return "";
        }
        int i = c0279c.f3552a;
        if (i == 3) {
            return "active";
        }
        if (i == 4) {
            return "recent_contact";
        }
        if (i != 5) {
            return i != 6 ? "" : "new_match";
        }
        return "nearby";
    }

    public ConversationRecommendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRecommendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
