package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fk6;
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
import p153l.sfj0;
import p153l.uqb0;
import p153l.vj30;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRecommendItemView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public ConversationRecommendItemView f25778d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f25779e;

    /* JADX INFO: renamed from: f */
    public VFrame f25780f;

    /* JADX INFO: renamed from: g */
    public VRelative f25781g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f25782h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f25783i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f25784j;

    /* JADX INFO: renamed from: k */
    public LiveHaloAvatar f25785k;

    /* JADX INFO: renamed from: l */
    public VImage f25786l;

    /* JADX INFO: renamed from: m */
    public VImage f25787m;

    /* JADX INFO: renamed from: n */
    public VFrame f25788n;

    /* JADX INFO: renamed from: o */
    public VImage f25789o;

    /* JADX INFO: renamed from: p */
    public VText f25790p;

    /* JADX INFO: renamed from: q */
    public VText f25791q;

    /* JADX INFO: renamed from: r */
    public ConversationHeadRecommendLayout f25792r;

    public ConversationRecommendItemView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: E */
    public void mo41584E(ConversationHeadRecommendLayout.C8266c c8266c) {
        super.mo41584E(c8266c);
        if (gra.m131698j() && NullChecker.m82486a(this.f25792r)) {
            this.f25792r.m41773T(c8266c);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo41585F() {
        this.f25791q.setBackgroundResource(0);
        this.f25791q.setText(getResources().getString(R$string.f19345im));
    }

    /* JADX INFO: renamed from: Q */
    public final void m42271Q(View view) {
        fk6.m125977a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m42272R(User user) {
        this.f25356a = user;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m42273S(Conversation conversation) {
        this.f25357b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m42274T(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c, pf60 pf60Var) {
        ConversationHeadRecommendLayout.C8265b c8265b2;
        if (m41583C()) {
            c8265b.m41798O(c8266c.f25519d, false);
            return;
        }
        bnl0.m105524M(this.f25781g, false);
        if (c8266c.f25521f) {
            m42276W(c8266c);
        } else {
            bnl0.m105524M(this.f25784j, false);
            bnl0.m105524M(this.f25358c, true);
            if (NullChecker.m82486a(this.f25357b) && this.f25357b.isAnonymous()) {
                uqb0.f180374G.m127115L0(this.f25358c, this.f25356a.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(this.f25358c, BaseConversationRecommendItemView.m41582B(this.f25356a));
            }
        }
        if (this.f25356a.isBannedNew() || this.f25356a.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(this.f25358c, dbc0.f87072i0);
        }
        bnl0.m105524M(this.f25787m, CoreModule.f18264c.f20330N0.m32969j3(this.f25356a) && !c8266c.f25521f);
        bnl0.m105524M(this.f25785k, false);
        if ((NullChecker.m82486a(this.f25357b) && (this.f25357b.read.booleanValue() || this.f25357b.localHasMessage)) || ((gra.m131750t1() && this.f25356a.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) || this.f25787m.getVisibility() == 0 || c8266c.f25521f || c8266c.f25516a == 21)) {
            this.f25786l.setVisibility(8);
        } else {
            this.f25786l.setVisibility(0);
            sfj0.m185601h("e_new_match_red_dot", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
        if (c8266c.f25516a == 21) {
            setOnLongClickListener(null);
            c8265b2 = c8265b;
        } else {
            c8265b2 = c8265b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC8255a(c8265b2, getContext(), (pf60) pf60Var.f152157b, this.f25357b, this.f25356a));
        }
        this.f25791q.setBackgroundResource(0);
        this.f25791q.setText(m41593z(c8266c, this.f25357b));
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f25358c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).width = qa00.m175859d(60.0f);
        ((ViewGroup.MarginLayoutParams) c0221a).height = qa00.m175859d(60.0f);
        this.f25358c.setLayoutParams(c0221a);
        this.f25779e.setPicPercent(0.75f);
        this.f25779e.m80885n0(this.f25356a);
        m41587K(c8265b2, c8266c, this.f25779e.m80884m0(this.f25356a));
        int i = c8266c.f25516a;
        if (i == 16 || i == 17) {
            m41586G(c8266c, i == 17);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m42275V(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC8256b(this.f25357b, c8265b, c8266c).onClick(view);
    }

    /* JADX INFO: renamed from: W */
    public final void m42276W(ConversationHeadRecommendLayout.C8266c c8266c) {
        bnl0.m105524M(this.f25784j, true);
        bnl0.m105524M(this.f25358c, false);
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(this.f25356a.m61308fp().profileSmall().base).m8661O(new q3d0(this.f25784j.getAvatarSize(), this.f25784j.getAvatarSize())).m8668a();
        boolean zEquals = "onVoice".equals(c8266c.f25525j);
        this.f25784j.m42680e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        fsb0 fsb0Var = uqb0.f180374G;
        LiveHaloAvatar liveHaloAvatar = this.f25784j;
        Objects.requireNonNull(liveHaloAvatar);
        fsb0Var.m127102F(imageRequestM8668a, new k66(liveHaloAvatar));
        m41586G(c8266c, zEquals);
    }

    /* JADX INFO: renamed from: X */
    public void m42277X(final ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C8266c c8266c) {
        this.f25792r = conversationHeadRecommendLayout;
        int i = c8266c.f25516a;
        VFrame vFrame = this.f25788n;
        if (i == 15) {
            bnl0.m105524M(vFrame, true);
            if (NullChecker.m82486a(c8266c.f25541z)) {
                bnl0.m105524M(this.f25781g, false);
                bnl0.m105524M(this.f25358c, true);
                vj30.m201486x(m41588p(), c8266c, this.f25358c, this.f25790p, this.f25789o, this.f25791q, this.f25778d);
            } else if (NullChecker.m82486a(c8266c.f25539x)) {
                bnl0.m105524M(this.f25781g, false);
                bnl0.m105524M(this.f25358c, true);
                vj30.m201485w(m41588p(), c8265b, c8266c, this.f25358c, this.f25790p, this.f25789o, this.f25791q, this.f25778d);
            } else {
                boolean zM82486a = NullChecker.m82486a(c8266c.f25540y);
                VRelative vRelative = this.f25781g;
                if (zM82486a) {
                    bnl0.m105524M(vRelative, false);
                    bnl0.m105524M(this.f25358c, true);
                    vj30.m201484v(m41588p(), c8265b, c8266c, this.f25358c, this.f25790p, this.f25789o, this.f25791q, this.f25778d);
                } else {
                    bnl0.m105524M(vRelative, false);
                    bnl0.m105524M(this.f25358c, true);
                    vj30.m201483u(m41588p(), c8266c, this.f25358c, this.f25790p, this.f25789o, this.f25791q, this.f25778d);
                }
            }
        } else {
            bnl0.m105524M(vFrame, false);
            c8265b.mo68557c(m41588p(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25519d).doOnNext(new y20() { // from class: l.ak6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71971a.m42272R((User) obj);
                }
            }), CoreModule.f18272k.f115545m.uiGet(c8266c.f25519d).doOnNext(new y20() { // from class: l.bk6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77047a.m42273S((Conversation) obj);
                }
            }).switchMap(new qcj() { // from class: l.ck6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.just(new pf60(-1, Boolean.FALSE));
                }
            }), new mie0())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.dk6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88977a.m42274T(c8265b, c8266c, (pf60) obj);
                }
            }));
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ek6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94344a.m42275V(c8265b, c8266c, view);
                }
            });
        }
        setBackgroundResource(dbc0.f87529w);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42271Q(this);
        this.f25358c = this.f25779e.get_pic();
        this.f25779e.setShowSVipFrame(true);
        this.f25358c.setBackgroundResource(dbc0.f87045h6);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: u */
    public String mo41590u(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (!TextUtils.isEmpty(c8266c.f25517b)) {
            return c8266c.f25517b;
        }
        if (!NullChecker.m82486a(c8266c)) {
            return "";
        }
        int i = c8266c.f25516a;
        if (i == 3) {
            return Active.TYPE;
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
