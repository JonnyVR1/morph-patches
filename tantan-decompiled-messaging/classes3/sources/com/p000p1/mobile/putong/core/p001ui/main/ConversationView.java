package com.p000p1.mobile.putong.core.p001ui.main;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.Reminder;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.ddj0;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qib0;
import l.ql6;
import l.t100;
import l.u4e;
import l.vwb;
import l.vz00;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p003l.aaj;
import p003l.bs5;
import p003l.d30;
import p003l.dac0;
import p003l.e30;
import p003l.eoj0;
import p003l.eqh0;
import p003l.m250;
import p003l.ml6;
import p014rx.C1099c;
import p028v.TickerView;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ConversationView extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationView f183a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f184b;

    /* JADX INFO: renamed from: c */
    public ImageView f185c;

    /* JADX INFO: renamed from: d */
    public TickerView f186d;

    /* JADX INFO: renamed from: e */
    public ImageView f187e;

    /* JADX INFO: renamed from: f */
    public ImageView f188f;

    /* JADX INFO: renamed from: g */
    public ImageView f189g;

    /* JADX INFO: renamed from: h */
    public ImageView f190h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f191i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f192j;

    /* JADX INFO: renamed from: k */
    public VText f193k;

    /* JADX INFO: renamed from: l */
    public VText f194l;

    /* JADX INFO: renamed from: m */
    public ImageView f195m;

    /* JADX INFO: renamed from: n */
    public ImageView f196n;

    /* JADX INFO: renamed from: o */
    public VText f197o;

    /* JADX INFO: renamed from: p */
    public VText f198p;

    /* JADX INFO: renamed from: q */
    public Conversation f199q;

    /* JADX INFO: renamed from: r */
    public User f200r;

    /* JADX INFO: renamed from: s */
    public e30<String> f201s;

    /* JADX INFO: renamed from: t */
    public int f202t;

    /* JADX INFO: renamed from: u */
    public int f203u;

    /* JADX INFO: renamed from: v */
    public int f204v;

    /* JADX INFO: renamed from: w */
    public boolean f205w;

    /* JADX INFO: renamed from: x */
    public boolean f206x;

    /* JADX INFO: renamed from: y */
    public boolean f207y;

    /* JADX INFO: renamed from: z */
    public bs5 f208z;

    public ConversationView(Context context) {
        super(context);
        this.f204v = -2;
        this.f208z = new bs5();
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m310g(User user) {
        return user.fp().profileSmall();
    }

    /* JADX INFO: renamed from: k */
    public static void m311k(Conversation conversation) {
        User userPa = CoreModule.c.e0.Pa(conversation.otherUser);
        if (NullChecker.b(userPa)) {
            qib0.G.z0(m310g(userPa));
        }
    }

    private void setMessageText(@StringRes int i) {
        setMessageText(m313e().string(i));
    }

    /* JADX INFO: renamed from: d */
    public final void m312d(View view) {
        ql6.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m313e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m314f(User user) {
        return !((DbObject) user).id.equals(CoreModule.H().userId()) && !user.isTeamAccount() && NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("boostBadge"));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m315h(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m313e().string(R.string.v6))) {
            zvf0.r("e_match_list_set_nickname", "p_messages_view");
            if (CoreModule.c.e0.p9().isVIP()) {
                m313e().startActivity(SetNicknameAct.Y1(m313e(), ((DbObject) CoreModule.c.e0.Pa(this.f199q.otherUser)).id));
                return;
            } else {
                CoreModule.P().a().i6(m313e(), "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
                return;
            }
        }
        if (charSequence.equals(m313e().getString(R.string.w5))) {
            CoreModule.P().i().Y5(m313e(), this.f199q.otherUser, this.f202t == 0 ? "message_allmatch" : "chat_list");
        } else if (charSequence.equals(m313e().getString(R.string.v5))) {
            CoreModule.P().a().eo(m313e(), this.f199q.otherUser, (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m316i(j760 j760Var) {
        int iIntValue;
        Object obj = j760Var.a;
        User user = (User) ((j760) obj).a;
        this.f200r = user;
        List<Message> list = ((q860) ((j760) obj).b).a;
        Object obj2 = j760Var.b;
        m318l(list, user, (User) ((xaj0) obj2).a, ((Conversation) ((xaj0) obj2).b).reminder);
        xdl0.M(this.f195m, false);
        xdl0.e0(this.f194l, 0);
        this.f194l.setText(user.name);
        CharSequence charSequenceY7 = CoreModule.c.e0.y7(((DbObject) user).id);
        if (!TextUtils.isEmpty(charSequenceY7)) {
            this.f194l.setText(charSequenceY7);
        }
        this.f194l.requestLayout();
        this.f192j.setVisibility(8);
        if (CoreModule.P().i().c() && user.onlineMatchLocked() && (iIntValue = ((Integer) ((j760) ((xaj0) j760Var.b).c).a).intValue()) != 100) {
            j760 j760VarR5 = CoreModule.P().i().r5(iIntValue);
            qib0.G.O(this.f184b, m310g(user).formatted(), ((Integer) j760VarR5.a).intValue(), ((Integer) j760VarR5.b).intValue());
            xdl0.M(this.f193k, true);
            this.f193k.setText(iIntValue + "%");
        } else {
            xdl0.M(this.f193k, false);
            qib0.G.Q0(this.f184b, m310g(user));
        }
        if (CoreModule.P().i().c() && user.onlineMatch()) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(0.0f);
            this.f191i.setEmpty(true);
            this.f191i.setButtonColorAngle(0);
            this.f191i.setBackgroundResource(c3c0.e7);
            return;
        }
        if (user.unilateralBlock()) {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            GradientBgButton gradientBgButton = this.f191i;
            if (!zIsPicVerificationVerified) {
                gradientBgButton.setVisibility(8);
                return;
            }
            gradientBgButton.setVisibility(0);
            this.f191i.setBordersize(t100.d(1.5f));
            this.f191i.setEmpty(false);
            this.f191i.setButtonColorAngle(0);
            this.f191i.setIcon(getResources().getDrawable(c3c0.d7));
            this.f191i.setButtonColorStart(m313e().color(a1c0.Q));
            this.f191i.setButtonColorEnd(m313e().color(a1c0.P));
            this.f191i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("picks"))) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(t100.d(1.5f));
            this.f191i.setEmpty(false);
            this.f191i.setButtonColorAngle(0);
            int i = c3c0.M7;
            int iColor = m313e().color(a1c0.O);
            int iColor2 = m313e().color(a1c0.O);
            this.f191i.setIcon(getResources().getDrawable(i));
            this.f191i.setButtonColorStart(iColor);
            this.f191i.setButtonColorEnd(iColor2);
            this.f191i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("superLiked"))) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(t100.d(1.5f));
            this.f191i.setEmpty(false);
            this.f191i.setButtonColorAngle(0);
            this.f191i.setIcon(getResources().getDrawable(c3c0.F6));
            this.f191i.setButtonColorStart(m313e().color(a1c0.Q));
            this.f191i.setButtonColorEnd(m313e().color(a1c0.P));
            this.f191i.setBackgroundResource(0);
            return;
        }
        if (NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("xmasActivity")) && qib0.H.isChristmasEventEnabled()) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(0.0f);
            this.f191i.setEmpty(true);
            this.f191i.setBackgroundResource(c3c0.c);
            return;
        }
        if (NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("boosted"))) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(0.0f);
            this.f191i.setEmpty(true);
            this.f191i.setButtonColorAngle(0);
            this.f191i.setBackgroundResource(c3c0.a);
            return;
        }
        if (m314f(user)) {
            this.f191i.setVisibility(0);
            this.f191i.setBordersize(0.0f);
            this.f191i.setEmpty(true);
            this.f191i.setButtonColorAngle(0);
            this.f191i.setBackgroundResource(c3c0.f7);
            return;
        }
        boolean zIsPicVerificationVerified2 = user.isPicVerificationVerified();
        GradientBgButton gradientBgButton2 = this.f191i;
        if (!zIsPicVerificationVerified2) {
            gradientBgButton2.setBackgroundResource(0);
            this.f191i.setEmpty(true);
            this.f191i.setVisibility(4);
            return;
        }
        gradientBgButton2.setVisibility(0);
        this.f191i.setBordersize(t100.d(1.5f));
        this.f191i.setEmpty(false);
        this.f191i.setButtonColorAngle(0);
        this.f191i.setIcon(getResources().getDrawable(c3c0.d7));
        this.f191i.setButtonColorStart(m313e().color(a1c0.Q));
        this.f191i.setButtonColorEnd(m313e().color(a1c0.P));
        this.f191i.setBackgroundResource(0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public void m317j(dac0<Conversation> dac0Var, Conversation conversation, boolean z, e30<String> e30Var, int i, int i2) {
        this.f203u = i2;
        this.f199q = conversation;
        this.f201s = e30Var;
        this.f202t = i;
        this.f195m.setVisibility(8);
        this.f191i.setVisibility(8);
        this.f192j.setVisibility(8);
        this.f196n.setVisibility(8);
        if (z) {
            this.f184b.setOnClickListener(this);
        } else {
            this.f194l.setTextColor(m313e().color(a1c0.V));
        }
        this.f204v = -1;
        this.f206x = true;
        dac0Var.mo3522c(m313e(), mkd0.u(CoreModule.c.e0.Ka(conversation.otherUser), CoreModule.c.f0.Tn(((DbObject) this.f199q).id), CoreModule.c.e0.o9(), CoreModule.c.f0.Ne(conversation.otherUser), CoreModule.P().i().c() ? CoreModule.c.f0.mo(((DbObject) this.f199q).id) : C1099c.just(new j760(-1, Boolean.FALSE)), new aaj() { // from class: l.ol6
            @Override // p003l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo2767a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.Y(vwb.Y((User) obj, (q860) obj2), new xaj0((User) obj3, (Conversation) obj4, (j760) obj5));
            }
        })).subscribe((m250<? super V>) mkd0.G(new e30() { // from class: l.pl6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6455a.m316i((j760) obj);
            }
        }));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public void m318l(List<Message> list, User user, User user2, Reminder reminder) {
        int i;
        CharSequence string;
        Message message = (Message) vwb.F(list);
        CharSequence string2 = null;
        CoreMomentInfo coreMomentInfo = NullChecker.a(reminder) ? (CoreMomentInfo) CoreModule.N().Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER) : null;
        if (NullChecker.a(message) && TEnum.equals(message.status(), "failed")) {
            boolean zUnilateralBlock = user.unilateralBlock();
            ImageView imageView = this.f196n;
            if (zUnilateralBlock) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f196n.setImageResource(c3c0.b0);
            }
        } else {
            boolean zBooleanValue = this.f199q.read.booleanValue();
            ImageView imageView2 = this.f196n;
            if (zBooleanValue) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                this.f196n.setImageResource(c3c0.i7);
            }
        }
        if (!NullChecker.a(coreMomentInfo) || (message != null && message.createdTime >= reminder.createdTime)) {
            if (NullChecker.a(message)) {
                if (message.isOtherUser() && message.createdTime == Math.abs(this.f199q.localBotheringTime) && TEnum.equals(user.gender, "male") && TEnum.equals(user2.gender, "female")) {
                    StringBuilder sb = new StringBuilder("← ");
                    sb.append(m313e().getString(this.f199q.localBotheringTime < 0.0d ? R.string.x4 : R.string.y4));
                    setMessageText(ddj0.c(sb.toString()));
                } else {
                    string2 = CoreModule.P().i().M0(message, (Conversation) null);
                }
            } else if (ml6.m6412d(this.f199q)) {
                string2 = zz6.v0(m313e().getString(R.string.S3), " " + m313e().getString(R.string.p4, mqi0.G(this.f199q.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
            } else if (ml6.m6414f(this.f199q)) {
                string2 = m313e().getString(R.string.N3, mqi0.G(this.f199q.createdTime));
            } else if (NullChecker.a(user.localRelationship) && user.localRelationship.status.contains(MatchFrom.get("superLiked"))) {
                string2 = m313e().getString(R.string.p4, mqi0.G(this.f199q.createdTime));
            }
            this.f197o.setTextColor(m313e().color(a1c0.X));
            if (NullChecker.a(message) && NullChecker.a(message.sticker)) {
                this.f197o.setTextWithoutEmoticonify(string2);
                return;
            }
            if (NullChecker.a(message) && (CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) || CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment))) {
                setMessageText(R.string.s4);
                return;
            } else {
                if (NullChecker.a(string2)) {
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
            sb2.append(m313e().getString(R.string.l5));
            sb2.append(" ");
            sb2.append(zEquals ? m313e().getString(R.string.f5) : m313e().getString(R.string.g5));
            string = sb2.toString();
        } else if (!TextUtils.isEmpty(coreMomentInfo.value)) {
            string = m313e().getString(R.string.e5) + " " + coreMomentInfo.value;
        } else if (NullChecker.a(coreMomentInfo.media) && coreMomentInfo.media.size() > 0 && (coreMomentInfo.media.get(0) instanceof Video)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m313e().getString(R.string.e5));
            sb3.append(" ");
            sb3.append(zEquals ? m313e().getString(R.string.m5, 1) : m313e().getString(R.string.n5, 1));
            string = sb3.toString();
        } else {
            List list2 = coreMomentInfo.media;
            int size = list2 != null ? list2.size() : 0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m313e().getString(R.string.e5));
            sb4.append(" ");
            PutongAct putongActM313e = m313e();
            if (size > 1) {
                i = zEquals ? R.string.h5 : R.string.i5;
            } else {
                i = zEquals ? R.string.j5 : R.string.k5;
            }
            sb4.append(putongActM313e.getString(i, Integer.valueOf(size)));
            string = sb4.toString();
        }
        if (!reminder.read) {
            string = i0g0.b0(string.toString(), vwb.f0(new String[]{m313e().string(zEquals2 ? R.string.l5 : R.string.e5)}), m313e().color(a1c0.N), eqh0.m3924c(3));
        }
        setMessageText(string);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Conversation conversation = this.f199q;
        if (conversation != null) {
            if (view == this.f184b) {
                m313e().startActivity(CoreModule.K().Ar(m313e(), this.f199q.otherUser, "conversation_view", false));
                return;
            }
            if (view == this) {
                this.f201s.call(conversation.otherUser);
                if (NullChecker.b(this.f196n) && xdl0.O0(this.f196n) && !this.f199q.read.booleanValue()) {
                    zvf0.s("e_red_dot_message_chat", "p_messages_view", u4e.c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
                    return;
                } else {
                    zvf0.s("e_red_dot_message_chat", "p_messages_view", u4e.d());
                    return;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("CV onClick  localId=");
        sb.append(this.f204v);
        sb.append(" page=");
        sb.append(this.f202t);
        sb.append(" position=");
        sb.append(this.f203u);
        sb.append(" renderLocal=");
        sb.append(this.f205w);
        sb.append(" rendCons=");
        sb.append(this.f206x);
        sb.append(" myid=");
        sb.append(CoreModule.H().userId());
        sb.append(" title=");
        VText vText = this.f194l;
        sb.append(vText != null ? vText.getText() : "null");
        sb.append(" view=");
        sb.append(view == this);
        sb.append(" adapterIsNull = ");
        sb.append(this.f207y);
        CrashHelper.c(new Throwable(sb.toString()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f208z.m3166c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m312d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f194l.setTextSize(2, 16.0f);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.b(this.f199q) || !NullChecker.b(CoreModule.c.e0.Pa(this.f199q.otherUser))) {
            return false;
        }
        ArrayList arrayListF0 = vwb.f0(new CharSequence[]{vz00.a(m313e(), m313e().string(R.string.v6)), m313e().getString(R.string.w5), m313e().string(R.string.v5)});
        zvf0.x("e_match_list_set_nickname", "p_messages_view");
        if (CoreModule.c.e0.Pa(this.f199q.otherUser).isTeamAccount()) {
            arrayListF0.remove(0);
            arrayListF0.remove(0);
        }
        if (CoreModule.P().i().c() && CoreModule.c.e0.Pa(this.f199q.otherUser).onlineMatchLocked()) {
            arrayListF0.remove(2);
        }
        m313e().dialog().f0((CharSequence[]) arrayListF0.toArray(new CharSequence[arrayListF0.size()])).g0(new Dialog.g() { // from class: l.nl6
            /* JADX INFO: renamed from: a */
            public final void m6550a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f5922a.m315h(dialog, view2, i, charSequence);
            }
        }).z0();
        return true;
    }

    private void setMessageText(CharSequence charSequence) {
        this.f197o.setText(eoj0.m3914c(charSequence));
    }

    public ConversationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f204v = -2;
        this.f208z = new bs5();
    }

    public ConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f204v = -2;
        this.f208z = new bs5();
    }
}
