package com.p051p1.mobile.putong.core.p058ui.main;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.Reminder;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.TickerView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.c17;
import p153l.f810;
import p153l.ft5;
import p153l.g9c0;
import p153l.hmj0;
import p153l.hxj0;
import p153l.i4g0;
import p153l.i6e;
import p153l.ibc0;
import p153l.jic0;
import p153l.jyb;
import p153l.lyh0;
import p153l.pf60;
import p153l.pm6;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tm6;
import p153l.ucj;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationView extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationView f31140a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31141b;

    /* JADX INFO: renamed from: c */
    public ImageView f31142c;

    /* JADX INFO: renamed from: d */
    public TickerView f31143d;

    /* JADX INFO: renamed from: e */
    public ImageView f31144e;

    /* JADX INFO: renamed from: f */
    public ImageView f31145f;

    /* JADX INFO: renamed from: g */
    public ImageView f31146g;

    /* JADX INFO: renamed from: h */
    public ImageView f31147h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f31148i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f31149j;

    /* JADX INFO: renamed from: k */
    public VText f31150k;

    /* JADX INFO: renamed from: l */
    public VText f31151l;

    /* JADX INFO: renamed from: m */
    public ImageView f31152m;

    /* JADX INFO: renamed from: n */
    public ImageView f31153n;

    /* JADX INFO: renamed from: o */
    public VText f31154o;

    /* JADX INFO: renamed from: p */
    public VText f31155p;

    /* JADX INFO: renamed from: q */
    public Conversation f31156q;

    /* JADX INFO: renamed from: r */
    public User f31157r;

    /* JADX INFO: renamed from: s */
    public y20<String> f31158s;

    /* JADX INFO: renamed from: t */
    public int f31159t;

    /* JADX INFO: renamed from: u */
    public int f31160u;

    /* JADX INFO: renamed from: v */
    public int f31161v;

    /* JADX INFO: renamed from: w */
    public boolean f31162w;

    /* JADX INFO: renamed from: x */
    public boolean f31163x;

    /* JADX INFO: renamed from: y */
    public boolean f31164y;

    /* JADX INFO: renamed from: z */
    public ft5 f31165z;

    public ConversationView(Context context) {
        super(context);
        this.f31161v = -2;
        this.f31165z = new ft5();
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m48463g(User user) {
        return user.m61308fp().profileSmall();
    }

    /* JADX INFO: renamed from: k */
    public static void m48464k(Conversation conversation) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser);
        if (NullChecker.m82487b(userM116503Pa)) {
            uqb0.f180374G.m127162z0(m48463g(userM116503Pa));
        }
    }

    private void setMessageText(@StringRes int i) {
        setMessageText(m48466e().string(i));
    }

    /* JADX INFO: renamed from: d */
    public final void m48465d(View view) {
        tm6.m191722a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m48466e() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48467f(User user) {
        return !user.f56859id.equals(CoreModule.m30929H().userId()) && !user.isTeamAccount() && NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.boostBadge));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48468h(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m48466e().string(R$string.f21849v6))) {
            i4g0.m138520r("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                m48466e().startActivity(SetNicknameAct.m42817Z1(m48466e(), CoreModule.f18264c.f20381e0.m116503Pa(this.f31156q.otherUser).f56859id));
                return;
            } else {
                CoreModule.m30933P().m143405a().mo34524i6(m48466e(), "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
                return;
            }
        }
        if (charSequence.equals(m48466e().getString(R$string.f21856w5))) {
            CoreModule.m30933P().m143412i().mo180429Y5(m48466e(), this.f31156q.otherUser, this.f31159t == 0 ? "message_allmatch" : "chat_list");
        } else if (charSequence.equals(m48466e().getString(R$string.f21848v5))) {
            CoreModule.m30933P().m143405a().mo34498eo(m48466e(), this.f31156q.otherUser, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48469i(pf60 pf60Var) {
        int iIntValue;
        F f = pf60Var.f152156a;
        User user = (User) ((pf60) f).f152156a;
        this.f31157r = user;
        List<T> list = ((vg60) ((pf60) f).f152157b).f184001a;
        S s = pf60Var.f152157b;
        m48471l(list, user, (User) ((bkj0) s).f77081a, ((Conversation) ((bkj0) s).f77082b).reminder);
        bnl0.m105524M(this.f31152m, false);
        bnl0.m105552e0(this.f31151l, 0);
        this.f31151l.setText(user.name);
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            this.f31151l.setText(strM116634y7);
        }
        this.f31151l.requestLayout();
        this.f31149j.setVisibility(8);
        if (CoreModule.m30933P().m143412i().mo180446c() && user.onlineMatchLocked() && (iIntValue = ((Integer) ((pf60) ((bkj0) pf60Var.f152157b).f77083c).f152156a).intValue()) != 100) {
            pf60<Integer, Integer> pf60VarMo180533r5 = CoreModule.m30933P().m143412i().mo180533r5(iIntValue);
            uqb0.f180374G.m127120O(this.f31141b, m48463g(user).formatted(), pf60VarMo180533r5.f152156a.intValue(), pf60VarMo180533r5.f152157b.intValue());
            bnl0.m105524M(this.f31150k, true);
            this.f31150k.setText(iIntValue + "%");
        } else {
            bnl0.m105524M(this.f31150k, false);
            uqb0.f180374G.m127125Q0(this.f31141b, m48463g(user));
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && user.onlineMatch()) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(0.0f);
            this.f31148i.setEmpty(true);
            this.f31148i.setButtonColorAngle(0);
            this.f31148i.setBackgroundResource(ibc0.f114011e7);
            return;
        }
        if (user.unilateralBlock()) {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            GradientBgButton gradientBgButton = this.f31148i;
            if (!zIsPicVerificationVerified) {
                gradientBgButton.setVisibility(8);
                return;
            }
            gradientBgButton.setVisibility(0);
            this.f31148i.setBordersize(qa00.m175859d(1.5f));
            this.f31148i.setEmpty(false);
            this.f31148i.setButtonColorAngle(0);
            this.f31148i.setIcon(getResources().getDrawable(ibc0.f114002d7));
            this.f31148i.setButtonColorStart(m48466e().color(g9c0.f102799Q));
            this.f31148i.setButtonColorEnd(m48466e().color(g9c0.f102798P));
            this.f31148i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("picks"))) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(qa00.m175859d(1.5f));
            this.f31148i.setEmpty(false);
            this.f31148i.setButtonColorAngle(0);
            int i = ibc0.f113858M7;
            int iColor = m48466e().color(g9c0.f102797O);
            int iColor2 = m48466e().color(g9c0.f102797O);
            this.f31148i.setIcon(getResources().getDrawable(i));
            this.f31148i.setButtonColorStart(iColor);
            this.f31148i.setButtonColorEnd(iColor2);
            this.f31148i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(qa00.m175859d(1.5f));
            this.f31148i.setEmpty(false);
            this.f31148i.setButtonColorAngle(0);
            this.f31148i.setIcon(getResources().getDrawable(ibc0.f113794F6));
            this.f31148i.setButtonColorStart(m48466e().color(g9c0.f102799Q));
            this.f31148i.setButtonColorEnd(m48466e().color(g9c0.f102798P));
            this.f31148i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity)) && uqb0.f180376H.isChristmasEventEnabled()) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(0.0f);
            this.f31148i.setEmpty(true);
            this.f31148i.setBackgroundResource(ibc0.f113985c);
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("boosted"))) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(0.0f);
            this.f31148i.setEmpty(true);
            this.f31148i.setButtonColorAngle(0);
            this.f31148i.setBackgroundResource(ibc0.f113967a);
            return;
        }
        if (m48467f(user)) {
            this.f31148i.setVisibility(0);
            this.f31148i.setBordersize(0.0f);
            this.f31148i.setEmpty(true);
            this.f31148i.setButtonColorAngle(0);
            this.f31148i.setBackgroundResource(ibc0.f114020f7);
            return;
        }
        boolean zIsPicVerificationVerified2 = user.isPicVerificationVerified();
        GradientBgButton gradientBgButton2 = this.f31148i;
        if (!zIsPicVerificationVerified2) {
            gradientBgButton2.setBackgroundResource(0);
            this.f31148i.setEmpty(true);
            this.f31148i.setVisibility(4);
            return;
        }
        gradientBgButton2.setVisibility(0);
        this.f31148i.setBordersize(qa00.m175859d(1.5f));
        this.f31148i.setEmpty(false);
        this.f31148i.setButtonColorAngle(0);
        this.f31148i.setIcon(getResources().getDrawable(ibc0.f114002d7));
        this.f31148i.setButtonColorStart(m48466e().color(g9c0.f102799Q));
        this.f31148i.setButtonColorEnd(m48466e().color(g9c0.f102798P));
        this.f31148i.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: j */
    public void m48470j(jic0<Conversation> jic0Var, Conversation conversation, boolean z, y20<String> y20Var, int i, int i2) {
        this.f31160u = i2;
        this.f31156q = conversation;
        this.f31158s = y20Var;
        this.f31159t = i;
        this.f31152m.setVisibility(8);
        this.f31148i.setVisibility(8);
        this.f31149j.setVisibility(8);
        this.f31153n.setVisibility(8);
        if (z) {
            this.f31141b.setOnClickListener(this);
        } else {
            this.f31151l.setTextColor(m48466e().color(g9c0.f102804V));
        }
        this.f31161v = -1;
        this.f31163x = true;
        jic0Var.mo68557c(m48466e(), psd0.m173628u(CoreModule.f18264c.f20381e0.m116483Ka(conversation.otherUser), CoreModule.f18264c.f20384f0.m33820Tn(this.f31156q.f56859id), CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20384f0.m33740Ne(conversation.otherUser), CoreModule.m30933P().m143412i().mo180446c() ? CoreModule.f18264c.f20384f0.m34051mo(this.f31156q.f56859id) : C22421c.just(new pf60(-1, Boolean.FALSE)), new ucj() { // from class: l.rm6
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return jyb.m147494Y(jyb.m147494Y((User) obj, (vg60) obj2), new bkj0((User) obj3, (Conversation) obj4, (pf60) obj5));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.sm6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169522a.m48469i((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m48471l(List<Message> list, User user, User user2, Reminder reminder) {
        int i;
        CharSequence string;
        Message message = (Message) jyb.m147475F(list);
        CharSequence string2 = null;
        CoreMomentInfo coreMomentInfo = NullChecker.m82486a(reminder) ? (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER) : null;
        if (NullChecker.m82486a(message) && TEnum.equals(message.status(), "failed")) {
            boolean zUnilateralBlock = user.unilateralBlock();
            ImageView imageView = this.f31153n;
            if (zUnilateralBlock) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f31153n.setImageResource(ibc0.f113977b0);
            }
        } else {
            boolean zBooleanValue = this.f31156q.read.booleanValue();
            ImageView imageView2 = this.f31153n;
            if (zBooleanValue) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                this.f31153n.setImageResource(ibc0.f114047i7);
            }
        }
        if (!NullChecker.m82486a(coreMomentInfo) || (message != null && message.createdTime >= reminder.createdTime)) {
            if (NullChecker.m82486a(message)) {
                if (message.isOtherUser() && message.createdTime == Math.abs(this.f31156q.localBotheringTime) && TEnum.equals(user.gender, "male") && TEnum.equals(user2.gender, "female")) {
                    StringBuilder sb = new StringBuilder("← ");
                    sb.append(m48466e().getString(this.f31156q.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? R$string.f21863x4 : R$string.f21871y4));
                    setMessageText(hmj0.m135867c(sb.toString()));
                } else {
                    string2 = CoreModule.m30933P().m143412i().mo180359M0(message, null);
                }
            } else if (pm6.m172916d(this.f31156q)) {
                string2 = c17.m107529v0(m48466e().getString(R$string.f21598S3), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m48466e().getString(R$string.f21798p4, pzi0.m174442G(this.f31156q.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
            } else if (pm6.m172918f(this.f31156q)) {
                string2 = m48466e().getString(R$string.f21558N3, pzi0.m174442G(this.f31156q.createdTime));
            } else if (NullChecker.m82486a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
                string2 = m48466e().getString(R$string.f21798p4, pzi0.m174442G(this.f31156q.createdTime));
            }
            this.f31154o.setTextColor(m48466e().color(g9c0.f102806X));
            if (NullChecker.m82486a(message) && NullChecker.m82486a(message.sticker)) {
                this.f31154o.setTextWithoutEmoticonify(string2);
                return;
            }
            if (NullChecker.m82486a(message) && (CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) || CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment))) {
                setMessageText(R$string.f21823s4);
                return;
            } else {
                if (NullChecker.m82486a(string2)) {
                    setMessageText(string2);
                    return;
                }
                return;
            }
        }
        boolean zEquals = TEnum.equals(user.gender, "female");
        boolean zEquals2 = TEnum.equals(reminder.reference.action, "avatar");
        if (zEquals2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m48466e().getString(R$string.f21763l5));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb2.append(zEquals ? m48466e().getString(R$string.f21709f5) : m48466e().getString(R$string.f21718g5));
            string = sb2.toString();
        } else if (!TextUtils.isEmpty(coreMomentInfo.value)) {
            string = m48466e().getString(R$string.f21700e5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + coreMomentInfo.value;
        } else if (NullChecker.m82486a(coreMomentInfo.media) && coreMomentInfo.media.size() > 0 && (coreMomentInfo.media.get(0) instanceof Video)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m48466e().getString(R$string.f21700e5));
            sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb3.append(zEquals ? m48466e().getString(R$string.f21772m5, 1) : m48466e().getString(R$string.f21781n5, 1));
            string = sb3.toString();
        } else {
            List<Media> list2 = coreMomentInfo.media;
            int size = list2 != null ? list2.size() : 0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m48466e().getString(R$string.f21700e5));
            sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            PutongAct putongActM48466e = m48466e();
            if (size > 1) {
                i = zEquals ? R$string.f21727h5 : R$string.f21736i5;
            } else {
                i = zEquals ? R$string.f21745j5 : R$string.f21754k5;
            }
            sb4.append(putongActM48466e.getString(i, Integer.valueOf(size)));
            string = sb4.toString();
        }
        if (!reminder.read) {
            string = q8g0.m175796b0(string.toString(), jyb.m147507f0(m48466e().string(zEquals2 ? R$string.f21763l5 : R$string.f21700e5)), m48466e().color(g9c0.f102796N), lyh0.m156283c(3));
        }
        setMessageText(string);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Conversation conversation = this.f31156q;
        if (conversation != null) {
            if (view == this.f31141b) {
                m48466e().startActivity(CoreModule.m30930K().mo31676Ar(m48466e(), this.f31156q.otherUser, "conversation_view", false));
                return;
            }
            if (view == this) {
                this.f31158s.call(conversation.otherUser);
                if (NullChecker.m82487b(this.f31153n) && bnl0.m105529O0(this.f31153n) && !this.f31156q.read.booleanValue()) {
                    i4g0.m138521s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, i6e.m138811c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
                    return;
                } else {
                    i4g0.m138521s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, i6e.m138812d());
                    return;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("CV onClick  localId=");
        sb.append(this.f31161v);
        sb.append(" page=");
        sb.append(this.f31159t);
        sb.append(" position=");
        sb.append(this.f31160u);
        sb.append(" renderLocal=");
        sb.append(this.f31162w);
        sb.append(" rendCons=");
        sb.append(this.f31163x);
        sb.append(" myid=");
        sb.append(CoreModule.m30929H().userId());
        sb.append(" title=");
        VText vText = this.f31151l;
        sb.append((Object) (vText != null ? vText.getText() : "null"));
        sb.append(" view=");
        sb.append(view == this);
        sb.append(" adapterIsNull = ");
        sb.append(this.f31164y);
        CrashHelper.m82479c(new Throwable(sb.toString()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31165z.m127299c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48465d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f31151l.setTextSize(2, 16.0f);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.m82487b(this.f31156q) || !NullChecker.m82487b(CoreModule.f18264c.f20381e0.m116503Pa(this.f31156q.otherUser))) {
            return false;
        }
        ArrayList arrayListM147507f0 = jyb.m147507f0(f810.m124512a(m48466e(), m48466e().string(R$string.f21849v6)), m48466e().getString(R$string.f21856w5), m48466e().string(R$string.f21848v5));
        i4g0.m138526x("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
        if (CoreModule.f18264c.f20381e0.m116503Pa(this.f31156q.otherUser).isTeamAccount()) {
            arrayListM147507f0.remove(0);
            arrayListM147507f0.remove(0);
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && CoreModule.f18264c.f20381e0.m116503Pa(this.f31156q.otherUser).onlineMatchLocked()) {
            arrayListM147507f0.remove(2);
        }
        m48466e().dialog().m21535f0((CharSequence[]) arrayListM147507f0.toArray(new CharSequence[arrayListM147507f0.size()])).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.qm6
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f158301a.m48468h(dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return true;
    }

    private void setMessageText(CharSequence charSequence) {
        this.f31154o.setText(hxj0.m137614c(charSequence));
    }

    public ConversationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31161v = -2;
        this.f31165z = new ft5();
    }

    public ConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31161v = -2;
        this.f31165z = new ft5();
    }
}
