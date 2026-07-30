package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.bkb0;
import p149l.cj6;
import p149l.e30;
import p149l.f56;
import p149l.hae0;
import p149l.hb30;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.nvc0;
import p149l.o6j0;
import p149l.qib0;
import p149l.t100;
import p149l.upa;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRecommendItemView extends BaseConversationRecommendItemView {

    /* JADX INFO: renamed from: d */
    public ConversationRecommendItemView f25036d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f25037e;

    /* JADX INFO: renamed from: f */
    public VFrame f25038f;

    /* JADX INFO: renamed from: g */
    public VRelative f25039g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f25040h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f25041i;

    /* JADX INFO: renamed from: j */
    public LiveHaloAvatar f25042j;

    /* JADX INFO: renamed from: k */
    public LiveHaloAvatar f25043k;

    /* JADX INFO: renamed from: l */
    public VImage f25044l;

    /* JADX INFO: renamed from: m */
    public VImage f25045m;

    /* JADX INFO: renamed from: n */
    public VFrame f25046n;

    /* JADX INFO: renamed from: o */
    public VImage f25047o;

    /* JADX INFO: renamed from: p */
    public VText f25048p;

    /* JADX INFO: renamed from: q */
    public VText f25049q;

    /* JADX INFO: renamed from: r */
    public ConversationHeadRecommendLayout f25050r;

    public ConversationRecommendItemView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: E */
    public void mo40573E(ConversationHeadRecommendLayout.C8115c c8115c) {
        super.mo40573E(c8115c);
        if (upa.m194767j() && NullChecker.m81303a(this.f25050r)) {
            this.f25050r.m40762T(c8115c);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: F */
    public void mo40574F() {
        this.f25049q.setBackgroundResource(0);
        this.f25049q.setText(getResources().getString(R$string.f17948Ml));
    }

    /* JADX INFO: renamed from: Q */
    public final void m41260Q(View view) {
        cj6.m107109a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m41261R(User user) {
        this.f24614a = user;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m41262S(Conversation conversation) {
        this.f24615b = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m41263T(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c, j760 j760Var) {
        ConversationHeadRecommendLayout.C8114b c8114b2;
        if (m40572C()) {
            c8114b.m40787O(c8115c.f24777d, false);
            return;
        }
        xdl0.m208344M(this.f25039g, false);
        if (c8115c.f24779f) {
            m41265W(c8115c);
        } else {
            xdl0.m208344M(this.f25042j, false);
            xdl0.m208344M(this.f24616c, true);
            if (NullChecker.m81303a(this.f24615b) && this.f24615b.isAnonymous()) {
                qib0.f154691G.m102331L0(this.f24616c, this.f24614a.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(this.f24616c, BaseConversationRecommendItemView.m40571B(this.f24614a));
            }
        }
        if (this.f24614a.isBannedNew() || this.f24614a.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(this.f24616c, x2c0.f190189h0);
        }
        xdl0.m208344M(this.f25045m, CoreModule.f17545c.f19588N0.m31966j3(this.f24614a) && !c8115c.f24779f);
        xdl0.m208344M(this.f25043k, false);
        if ((NullChecker.m81303a(this.f24615b) && (this.f24615b.read.booleanValue() || this.f24615b.localHasMessage)) || ((upa.m194819t1() && this.f24614a.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) || this.f25045m.getVisibility() == 0 || c8115c.f24779f || c8115c.f24774a == 21)) {
            this.f25044l.setVisibility(8);
        } else {
            this.f25044l.setVisibility(0);
            o6j0.m162864h("e_new_match_red_dot", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
        if (c8115c.f24774a == 21) {
            setOnLongClickListener(null);
            c8114b2 = c8114b;
        } else {
            c8114b2 = c8114b;
            setOnLongClickListener(new BaseConversationRecommendItemView.ViewOnLongClickListenerC8104a(c8114b2, getContext(), (j760) j760Var.f116565b, this.f24615b, this.f24614a));
        }
        this.f25049q.setBackgroundResource(0);
        this.f25049q.setText(m40582z(c8115c, this.f24615b));
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f24616c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).width = t100.m186890d(60.0f);
        ((ViewGroup.MarginLayoutParams) c0220a).height = t100.m186890d(60.0f);
        this.f24616c.setLayoutParams(c0220a);
        this.f25037e.setPicPercent(0.75f);
        this.f25037e.m79702n0(this.f24614a);
        m40576K(c8114b2, c8115c, this.f25037e.m79701m0(this.f24614a));
        int i = c8115c.f24774a;
        if (i == 16 || i == 17) {
            m40575G(c8115c, i == 17);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m41264V(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        new BaseConversationRecommendItemView.ViewOnClickListenerC8105b(this.f24615b, c8114b, c8115c).onClick(view);
    }

    /* JADX INFO: renamed from: W */
    public final void m41265W(ConversationHeadRecommendLayout.C8115c c8115c) {
        xdl0.m208344M(this.f25042j, true);
        xdl0.m208344M(this.f24616c, false);
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(this.f24614a.m60124fp().profileSmall().base).m8607O(new nvc0(this.f25042j.getAvatarSize(), this.f25042j.getAvatarSize())).m8614a();
        boolean zEquals = "onVoice".equals(c8115c.f24783j);
        this.f25042j.m41669e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.f154691G;
        LiveHaloAvatar liveHaloAvatar = this.f25042j;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.m102318F(imageRequestM8614a, new f56(liveHaloAvatar));
        m40575G(c8115c, zEquals);
    }

    /* JADX INFO: renamed from: X */
    public void m41266X(final ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C8115c c8115c) {
        this.f25050r = conversationHeadRecommendLayout;
        int i = c8115c.f24774a;
        VFrame vFrame = this.f25046n;
        if (i == 15) {
            xdl0.m208344M(vFrame, true);
            if (NullChecker.m81303a(c8115c.f24799z)) {
                xdl0.m208344M(this.f25039g, false);
                xdl0.m208344M(this.f24616c, true);
                hb30.m130318x(m40577p(), c8115c, this.f24616c, this.f25048p, this.f25047o, this.f25049q, this.f25036d);
            } else if (NullChecker.m81303a(c8115c.f24797x)) {
                xdl0.m208344M(this.f25039g, false);
                xdl0.m208344M(this.f24616c, true);
                hb30.m130317w(m40577p(), c8114b, c8115c, this.f24616c, this.f25048p, this.f25047o, this.f25049q, this.f25036d);
            } else {
                boolean zM81303a = NullChecker.m81303a(c8115c.f24798y);
                VRelative vRelative = this.f25039g;
                if (zM81303a) {
                    xdl0.m208344M(vRelative, false);
                    xdl0.m208344M(this.f24616c, true);
                    hb30.m130316v(m40577p(), c8114b, c8115c, this.f24616c, this.f25048p, this.f25047o, this.f25049q, this.f25036d);
                } else {
                    xdl0.m208344M(vRelative, false);
                    xdl0.m208344M(this.f24616c, true);
                    hb30.m130315u(m40577p(), c8115c, this.f24616c, this.f25048p, this.f25047o, this.f25049q, this.f25036d);
                }
            }
        } else {
            xdl0.m208344M(vFrame, false);
            c8114b.mo67374c(m40577p(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24777d).doOnNext(new e30() { // from class: l.xi6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192961a.m41261R((User) obj);
                }
            }), CoreModule.f17553k.f91950m.uiGet(c8115c.f24777d).doOnNext(new e30() { // from class: l.yi6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198445a.m41262S((Conversation) obj);
                }
            }).switchMap(new w9j() { // from class: l.zi6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.just(new j760(-1, Boolean.FALSE));
                }
            }), new hae0())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.aj6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70089a.m41263T(c8114b, c8115c, (j760) obj);
                }
            }));
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.bj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f75882a.m41264V(c8114b, c8115c, view);
                }
            });
        }
        setBackgroundResource(x2c0.f190634v);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41260Q(this);
        this.f24616c = this.f25037e.get_pic();
        this.f25037e.setShowSVipFrame(true);
        this.f24616c.setBackgroundResource(x2c0.f190163g6);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView
    /* JADX INFO: renamed from: u */
    public String mo40579u(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (!TextUtils.isEmpty(c8115c.f24775b)) {
            return c8115c.f24775b;
        }
        if (!NullChecker.m81303a(c8115c)) {
            return "";
        }
        int i = c8115c.f24774a;
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
