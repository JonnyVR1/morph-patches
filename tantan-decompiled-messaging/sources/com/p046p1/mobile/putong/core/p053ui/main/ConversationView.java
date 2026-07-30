package com.p046p1.mobile.putong.core.p053ui.main;

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.Reminder;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.TickerView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.aaj;
import p149l.bs5;
import p149l.c3c0;
import p149l.dac0;
import p149l.ddj0;
import p149l.e30;
import p149l.eoj0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.j760;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.q860;
import p149l.qib0;
import p149l.ql6;
import p149l.t100;
import p149l.u4e;
import p149l.vwb;
import p149l.vz00;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationView extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationView f30292a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30293b;

    /* JADX INFO: renamed from: c */
    public ImageView f30294c;

    /* JADX INFO: renamed from: d */
    public TickerView f30295d;

    /* JADX INFO: renamed from: e */
    public ImageView f30296e;

    /* JADX INFO: renamed from: f */
    public ImageView f30297f;

    /* JADX INFO: renamed from: g */
    public ImageView f30298g;

    /* JADX INFO: renamed from: h */
    public ImageView f30299h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f30300i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f30301j;

    /* JADX INFO: renamed from: k */
    public VText f30302k;

    /* JADX INFO: renamed from: l */
    public VText f30303l;

    /* JADX INFO: renamed from: m */
    public ImageView f30304m;

    /* JADX INFO: renamed from: n */
    public ImageView f30305n;

    /* JADX INFO: renamed from: o */
    public VText f30306o;

    /* JADX INFO: renamed from: p */
    public VText f30307p;

    /* JADX INFO: renamed from: q */
    public Conversation f30308q;

    /* JADX INFO: renamed from: r */
    public User f30309r;

    /* JADX INFO: renamed from: s */
    public e30<String> f30310s;

    /* JADX INFO: renamed from: t */
    public int f30311t;

    /* JADX INFO: renamed from: u */
    public int f30312u;

    /* JADX INFO: renamed from: v */
    public int f30313v;

    /* JADX INFO: renamed from: w */
    public boolean f30314w;

    /* JADX INFO: renamed from: x */
    public boolean f30315x;

    /* JADX INFO: renamed from: y */
    public boolean f30316y;

    /* JADX INFO: renamed from: z */
    public bs5 f30317z;

    public ConversationView(Context context) {
        super(context);
        this.f30313v = -2;
        this.f30317z = new bs5();
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m47280g(User user) {
        return user.m60124fp().profileSmall();
    }

    /* JADX INFO: renamed from: k */
    public static void m47281k(Conversation conversation) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser);
        if (NullChecker.m81304b(userM169430Pa)) {
            qib0.f154691G.m102379z0(m47280g(userM169430Pa));
        }
    }

    private void setMessageText(@StringRes int i) {
        setMessageText(m47283e().string(i));
    }

    /* JADX INFO: renamed from: d */
    public final void m47282d(View view) {
        ql6.m175397a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m47283e() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m47284f(User user) {
        return !user.f56011id.equals(CoreModule.m29931H().userId()) && !user.isTeamAccount() && NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.boostBadge));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m47285h(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m47283e().string(R$string.f21107v6))) {
            zvf0.m220396r("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                m47283e().startActivity(SetNicknameAct.m41806Y1(m47283e(), CoreModule.f17545c.f19639e0.m169430Pa(this.f30308q.otherUser).f56011id));
                return;
            } else {
                CoreModule.m29935P().m94651a().mo33521i6(m47283e(), "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
                return;
            }
        }
        if (charSequence.equals(m47283e().getString(R$string.f21114w5))) {
            CoreModule.m29935P().m94658i().mo158337Y5(m47283e(), this.f30308q.otherUser, this.f30311t == 0 ? "message_allmatch" : "chat_list");
        } else if (charSequence.equals(m47283e().getString(R$string.f21106v5))) {
            CoreModule.m29935P().m94651a().mo33495eo(m47283e(), this.f30308q.otherUser, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m47286i(j760 j760Var) {
        int iIntValue;
        F f = j760Var.f116564a;
        User user = (User) ((j760) f).f116564a;
        this.f30309r = user;
        List<T> list = ((q860) ((j760) f).f116565b).f153135a;
        S s = j760Var.f116565b;
        m47288l(list, user, (User) ((xaj0) s).f191751a, ((Conversation) ((xaj0) s).f191752b).reminder);
        xdl0.m208344M(this.f30304m, false);
        xdl0.m208372e0(this.f30303l, 0);
        this.f30303l.setText(user.name);
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            this.f30303l.setText(strM169561y7);
        }
        this.f30303l.requestLayout();
        this.f30301j.setVisibility(8);
        if (CoreModule.m29935P().m94658i().mo158354c() && user.onlineMatchLocked() && (iIntValue = ((Integer) ((j760) ((xaj0) j760Var.f116565b).f191753c).f116564a).intValue()) != 100) {
            j760<Integer, Integer> j760VarMo158441r5 = CoreModule.m29935P().m94658i().mo158441r5(iIntValue);
            qib0.f154691G.m102336O(this.f30293b, m47280g(user).formatted(), j760VarMo158441r5.f116564a.intValue(), j760VarMo158441r5.f116565b.intValue());
            xdl0.m208344M(this.f30302k, true);
            this.f30302k.setText(iIntValue + "%");
        } else {
            xdl0.m208344M(this.f30302k, false);
            qib0.f154691G.m102341Q0(this.f30293b, m47280g(user));
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && user.onlineMatch()) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(0.0f);
            this.f30300i.setEmpty(true);
            this.f30300i.setButtonColorAngle(0);
            this.f30300i.setBackgroundResource(c3c0.f78736e7);
            return;
        }
        if (user.unilateralBlock()) {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            GradientBgButton gradientBgButton = this.f30300i;
            if (!zIsPicVerificationVerified) {
                gradientBgButton.setVisibility(8);
                return;
            }
            gradientBgButton.setVisibility(0);
            this.f30300i.setBordersize(t100.m186890d(1.5f));
            this.f30300i.setEmpty(false);
            this.f30300i.setButtonColorAngle(0);
            this.f30300i.setIcon(getResources().getDrawable(c3c0.f78727d7));
            this.f30300i.setButtonColorStart(m47283e().color(a1c0.f67135Q));
            this.f30300i.setButtonColorEnd(m47283e().color(a1c0.f67134P));
            this.f30300i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("picks"))) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(t100.m186890d(1.5f));
            this.f30300i.setEmpty(false);
            this.f30300i.setButtonColorAngle(0);
            int i = c3c0.f78583M7;
            int iColor = m47283e().color(a1c0.f67133O);
            int iColor2 = m47283e().color(a1c0.f67133O);
            this.f30300i.setIcon(getResources().getDrawable(i));
            this.f30300i.setButtonColorStart(iColor);
            this.f30300i.setButtonColorEnd(iColor2);
            this.f30300i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(t100.m186890d(1.5f));
            this.f30300i.setEmpty(false);
            this.f30300i.setButtonColorAngle(0);
            this.f30300i.setIcon(getResources().getDrawable(c3c0.f78519F6));
            this.f30300i.setButtonColorStart(m47283e().color(a1c0.f67135Q));
            this.f30300i.setButtonColorEnd(m47283e().color(a1c0.f67134P));
            this.f30300i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity)) && qib0.f154693H.isChristmasEventEnabled()) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(0.0f);
            this.f30300i.setEmpty(true);
            this.f30300i.setBackgroundResource(c3c0.f78710c);
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("boosted"))) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(0.0f);
            this.f30300i.setEmpty(true);
            this.f30300i.setButtonColorAngle(0);
            this.f30300i.setBackgroundResource(c3c0.f78692a);
            return;
        }
        if (m47284f(user)) {
            this.f30300i.setVisibility(0);
            this.f30300i.setBordersize(0.0f);
            this.f30300i.setEmpty(true);
            this.f30300i.setButtonColorAngle(0);
            this.f30300i.setBackgroundResource(c3c0.f78745f7);
            return;
        }
        boolean zIsPicVerificationVerified2 = user.isPicVerificationVerified();
        GradientBgButton gradientBgButton2 = this.f30300i;
        if (!zIsPicVerificationVerified2) {
            gradientBgButton2.setBackgroundResource(0);
            this.f30300i.setEmpty(true);
            this.f30300i.setVisibility(4);
            return;
        }
        gradientBgButton2.setVisibility(0);
        this.f30300i.setBordersize(t100.m186890d(1.5f));
        this.f30300i.setEmpty(false);
        this.f30300i.setButtonColorAngle(0);
        this.f30300i.setIcon(getResources().getDrawable(c3c0.f78727d7));
        this.f30300i.setButtonColorStart(m47283e().color(a1c0.f67135Q));
        this.f30300i.setButtonColorEnd(m47283e().color(a1c0.f67134P));
        this.f30300i.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: j */
    public void m47287j(dac0<Conversation> dac0Var, Conversation conversation, boolean z, e30<String> e30Var, int i, int i2) {
        this.f30312u = i2;
        this.f30308q = conversation;
        this.f30310s = e30Var;
        this.f30311t = i;
        this.f30304m.setVisibility(8);
        this.f30300i.setVisibility(8);
        this.f30301j.setVisibility(8);
        this.f30305n.setVisibility(8);
        if (z) {
            this.f30293b.setOnClickListener(this);
        } else {
            this.f30303l.setTextColor(m47283e().color(a1c0.f67140V));
        }
        this.f30313v = -1;
        this.f30315x = true;
        dac0Var.mo67374c(m47283e(), mkd0.m154987u(CoreModule.f17545c.f19639e0.m169410Ka(conversation.otherUser), CoreModule.f17545c.f19642f0.m32817Tn(this.f30308q.f56011id), CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19642f0.m32737Ne(conversation.otherUser), CoreModule.m29935P().m94658i().mo158354c() ? CoreModule.f17545c.f19642f0.m33048mo(this.f30308q.f56011id) : C22306c.just(new j760(-1, Boolean.FALSE)), new aaj() { // from class: l.ol6
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.m200311Y(vwb.m200311Y((User) obj, (q860) obj2), new xaj0((User) obj3, (Conversation) obj4, (j760) obj5));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.pl6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150077a.m47286i((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m47288l(List<Message> list, User user, User user2, Reminder reminder) {
        int i;
        CharSequence string;
        Message message = (Message) vwb.m200292F(list);
        CharSequence string2 = null;
        CoreMomentInfo coreMomentInfo = NullChecker.m81303a(reminder) ? (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER) : null;
        if (NullChecker.m81303a(message) && TEnum.equals(message.status(), "failed")) {
            boolean zUnilateralBlock = user.unilateralBlock();
            ImageView imageView = this.f30305n;
            if (zUnilateralBlock) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f30305n.setImageResource(c3c0.f78702b0);
            }
        } else {
            boolean zBooleanValue = this.f30308q.read.booleanValue();
            ImageView imageView2 = this.f30305n;
            if (zBooleanValue) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                this.f30305n.setImageResource(c3c0.f78772i7);
            }
        }
        if (!NullChecker.m81303a(coreMomentInfo) || (message != null && message.createdTime >= reminder.createdTime)) {
            if (NullChecker.m81303a(message)) {
                if (message.isOtherUser() && message.createdTime == Math.abs(this.f30308q.localBotheringTime) && TEnum.equals(user.gender, "male") && TEnum.equals(user2.gender, "female")) {
                    StringBuilder sb = new StringBuilder("← ");
                    sb.append(m47283e().getString(this.f30308q.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? R$string.f21121x4 : R$string.f21129y4));
                    setMessageText(ddj0.m111022c(sb.toString()));
                } else {
                    string2 = CoreModule.m29935P().m94658i().mo158267M0(message, null);
                }
            } else if (ml6.m155119d(this.f30308q)) {
                string2 = zz6.m221005v0(m47283e().getString(R$string.f20856S3), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m47283e().getString(R$string.f21056p4, mqi0.m155932G(this.f30308q.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
            } else if (ml6.m155121f(this.f30308q)) {
                string2 = m47283e().getString(R$string.f20816N3, mqi0.m155932G(this.f30308q.createdTime));
            } else if (NullChecker.m81303a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
                string2 = m47283e().getString(R$string.f21056p4, mqi0.m155932G(this.f30308q.createdTime));
            }
            this.f30306o.setTextColor(m47283e().color(a1c0.f67142X));
            if (NullChecker.m81303a(message) && NullChecker.m81303a(message.sticker)) {
                this.f30306o.setTextWithoutEmoticonify(string2);
                return;
            }
            if (NullChecker.m81303a(message) && (CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) || CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment))) {
                setMessageText(R$string.f21081s4);
                return;
            } else {
                if (NullChecker.m81303a(string2)) {
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
            sb2.append(m47283e().getString(R$string.f21021l5));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb2.append(zEquals ? m47283e().getString(R$string.f20967f5) : m47283e().getString(R$string.f20976g5));
            string = sb2.toString();
        } else if (!TextUtils.isEmpty(coreMomentInfo.value)) {
            string = m47283e().getString(R$string.f20958e5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + coreMomentInfo.value;
        } else if (NullChecker.m81303a(coreMomentInfo.media) && coreMomentInfo.media.size() > 0 && (coreMomentInfo.media.get(0) instanceof Video)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m47283e().getString(R$string.f20958e5));
            sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb3.append(zEquals ? m47283e().getString(R$string.f21030m5, 1) : m47283e().getString(R$string.f21039n5, 1));
            string = sb3.toString();
        } else {
            List<Media> list2 = coreMomentInfo.media;
            int size = list2 != null ? list2.size() : 0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m47283e().getString(R$string.f20958e5));
            sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            PutongAct putongActM47283e = m47283e();
            if (size > 1) {
                i = zEquals ? R$string.f20985h5 : R$string.f20994i5;
            } else {
                i = zEquals ? R$string.f21003j5 : R$string.f21012k5;
            }
            sb4.append(putongActM47283e.getString(i, Integer.valueOf(size)));
            string = sb4.toString();
        }
        if (!reminder.read) {
            string = i0g0.m133861b0(string.toString(), vwb.m200324f0(m47283e().string(zEquals2 ? R$string.f21021l5 : R$string.f20958e5)), m47283e().color(a1c0.f67132N), eqh0.m117752c(3));
        }
        setMessageText(string);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Conversation conversation = this.f30308q;
        if (conversation != null) {
            if (view == this.f30293b) {
                m47283e().startActivity(CoreModule.m29932K().mo30673Ar(m47283e(), this.f30308q.otherUser, "conversation_view", false));
                return;
            }
            if (view == this) {
                this.f30310s.call(conversation.otherUser);
                if (NullChecker.m81304b(this.f30305n) && xdl0.m208349O0(this.f30305n) && !this.f30308q.read.booleanValue()) {
                    zvf0.m220397s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, u4e.m191728c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
                    return;
                } else {
                    zvf0.m220397s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, u4e.m191729d());
                    return;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("CV onClick  localId=");
        sb.append(this.f30313v);
        sb.append(" page=");
        sb.append(this.f30311t);
        sb.append(" position=");
        sb.append(this.f30312u);
        sb.append(" renderLocal=");
        sb.append(this.f30314w);
        sb.append(" rendCons=");
        sb.append(this.f30315x);
        sb.append(" myid=");
        sb.append(CoreModule.m29931H().userId());
        sb.append(" title=");
        VText vText = this.f30303l;
        sb.append((Object) (vText != null ? vText.getText() : "null"));
        sb.append(" view=");
        sb.append(view == this);
        sb.append(" adapterIsNull = ");
        sb.append(this.f30316y);
        CrashHelper.m81296c(new Throwable(sb.toString()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30317z.m103657c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47282d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f30303l.setTextSize(2, 16.0f);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.m81304b(this.f30308q) || !NullChecker.m81304b(CoreModule.f17545c.f19639e0.m169430Pa(this.f30308q.otherUser))) {
            return false;
        }
        ArrayList arrayListM200324f0 = vwb.m200324f0(vz00.m200681a(m47283e(), m47283e().string(R$string.f21107v6)), m47283e().getString(R$string.f21114w5), m47283e().string(R$string.f21106v5));
        zvf0.m220402x("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
        if (CoreModule.f17545c.f19639e0.m169430Pa(this.f30308q.otherUser).isTeamAccount()) {
            arrayListM200324f0.remove(0);
            arrayListM200324f0.remove(0);
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && CoreModule.f17545c.f19639e0.m169430Pa(this.f30308q.otherUser).onlineMatchLocked()) {
            arrayListM200324f0.remove(2);
        }
        m47283e().dialog().m20536f0((CharSequence[]) arrayListM200324f0.toArray(new CharSequence[arrayListM200324f0.size()])).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.nl6
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f139508a.m47285h(dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return true;
    }

    private void setMessageText(CharSequence charSequence) {
        this.f30306o.setText(eoj0.m117353c(charSequence));
    }

    public ConversationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30313v = -2;
        this.f30317z = new bs5();
    }

    public ConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30313v = -2;
        this.f30317z = new bs5();
    }
}
