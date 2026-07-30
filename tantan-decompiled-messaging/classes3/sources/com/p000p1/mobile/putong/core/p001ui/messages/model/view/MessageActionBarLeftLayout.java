package com.p000p1.mobile.putong.core.p001ui.messages.model.view;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageActionBarLeftLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.a1c0;
import l.bkb0;
import l.c3c0;
import l.hmb;
import l.j760;
import l.jjb0;
import l.knb0;
import l.lsi0;
import l.mqi0;
import l.o6j0;
import l.odm;
import l.qib0;
import l.qly;
import l.rw6;
import l.t100;
import l.ura;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p003l.bpz;
import p003l.fcz;
import p003l.ikf0;
import p003l.iny;
import p003l.tmf0;
import p003l.tqz;
import p003l.u4z;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageActionBarLeftLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageActionBarLeftLayout f1989a;

    /* JADX INFO: renamed from: b */
    public VFrame f1990b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f1991c;

    /* JADX INFO: renamed from: d */
    public VLinear f1992d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1993e;

    /* JADX INFO: renamed from: f */
    public VLinear f1994f;

    /* JADX INFO: renamed from: g */
    public VFrame f1995g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f1996h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f1997i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f1998j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f1999k;

    /* JADX INFO: renamed from: l */
    public VText f2000l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f2001m;

    /* JADX INFO: renamed from: n */
    public VImage f2002n;

    /* JADX INFO: renamed from: o */
    public VLinear f2003o;

    /* JADX INFO: renamed from: p */
    public ODiamondTagLabel f2004p;

    /* JADX INFO: renamed from: q */
    public VImage f2005q;

    /* JADX INFO: renamed from: r */
    public VLinear f2006r;

    /* JADX INFO: renamed from: s */
    public VText f2007s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f2008t;

    /* JADX INFO: renamed from: u */
    public VImage f2009u;

    /* JADX INFO: renamed from: v */
    public VText f2010v;

    /* JADX INFO: renamed from: w */
    public VText f2011w;

    /* JADX INFO: renamed from: x */
    public VImage f2012x;

    /* JADX INFO: renamed from: y */
    public VText f2013y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.MessageActionBarLeftLayout$a */
    public class ViewOnClickListenerC0155a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f2014a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f2015b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessagesAct f2016c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ iny f2017d;

        public ViewOnClickListenerC0155a(User user, Map map, MessagesAct messagesAct, iny inyVar) {
            this.f2014a = user;
            this.f2015b = map;
            this.f2016c = messagesAct;
            this.f2017d = inyVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) this.f2014a).id);
            if (!NullChecker.a(conversationZp) || !conversationZp.doubleDefault() || !NullChecker.a(conversationZp.additional.chatMM) || !conversationZp.additional.chatMM.sparkSwitch) {
                MessageActionBarLeftLayout.this.m2647u(this.f2014a, this.f2017d.m6497e0().mo2066l());
            } else {
                zvf0.s("e_spark", "p_chat_view", this.f2015b);
                MessagesAct messagesAct = this.f2016c;
                tmf0.m7819a(messagesAct, messagesAct.f1531f.f3543c);
            }
        }
    }

    public MessageActionBarLeftLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2625a(MessagesAct messagesAct, User user, View view) {
        zvf0.u("e_character_guide", "p_chat_view", new j760[]{vwb.Y("guide_type", "tag")});
        o.r3(messagesAct, user, o.s3(o.T, ((DbObject) user).id, false, "chat_tag"));
    }

    /* JADX INFO: renamed from: A */
    public void m2630A(User user) {
        xdl0.M(this.f2008t, !TextUtils.isEmpty(this.f2010v.getText()));
        xdl0.M(this.f2011w, false);
    }

    /* JADX INFO: renamed from: B */
    public void m2631B(String str) {
        AppCompatTextView appCompatTextView = this.f2000l;
        if (TextUtils.isEmpty(str)) {
            str = "已注销";
        }
        appCompatTextView.setText(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m2632f(View view) {
        qly.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m2633g(User user) {
        if (!user.unilateralBlock() && (user.isHideActiveFromSVip() || CoreModule.c.E0.x3(user))) {
            return user.isHideActiveFromSVip() ? mqi0.I(CoreModule.P().i().W(user), true) : "";
        }
        if (user.location.isHideUpdateTime() || user.unilateralBlock()) {
            return "";
        }
        return CoreModule.P().i().I1(user) ? mqi0.I(System.currentTimeMillis(), true) : mqi0.J(user.location.updatedTime, true);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m2634h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase());
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(a1c0.o)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public void m2635i() {
        if (NullChecker.a(this.f1992d)) {
            xdl0.M(this.f1992d, false);
        }
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
    public void m2636j(Act act) {
        this.f2000l.setTextColor(ura.e().d().I4() ? getResources().getColor(a1c0.g) : act.getAppTheme().f());
        this.f2010v.setTextColor(ura.e().d().I4() ? getResources().getColor(a1c0.i) : Color.parseColor("#99212121"));
        this.f2000l.setTextSize(2, 16.0f);
        this.f2000l.getPaint().setFakeBoldText(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m2637k(final User user, iny inyVar) {
        this.f1991c.E0(false, "p_chat_view");
        final fcz<? extends DbObject, ?> fczVarMo2066l = inyVar.m6497e0().mo2066l();
        this.f1989a.setOnClickListener(new View.OnClickListener() { // from class: l.ply
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6456a.m2644r(user, fczVarMo2066l, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x0330  */
    /* JADX WARN: Code duplicated, block: B:124:0x033e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0373  */
    /* JADX WARN: Code duplicated, block: B:131:0x037f  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03de  */
    /* JADX WARN: Code duplicated, block: B:151:0x0433  */
    /* JADX WARN: Code duplicated, block: B:153:0x0441  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, com.p1.mobile.putong.app.PutongAct, com.p1.mobile.putong.core.ui.messages.MessagesAct] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.p1.mobile.putong.core.ui.messages.MessagesAct] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.p1.mobile.putong.core.ui.messages.MessagesAct] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: l */
    public void m2638l(final MessagesAct messagesAct, iny inyVar, knb0<User, Boolean, j760<Integer, Boolean>, Conversation> knb0Var) {
        String str;
        MessageActionBarLeftLayout messageActionBarLeftLayout;
        ?? r6;
        iny inyVar2;
        ?? r7;
        ?? r8;
        if (messagesAct.isTaskRoot()) {
            messagesAct.setTaskDescription(new ActivityManager.TaskDescription(((User) knb0Var.a).name, (Bitmap) null, messagesAct.getResources().getColor(a1c0.U)));
        }
        this.f1991c.setPadding(0, 0, 0, 0);
        this.f1991c.setBackgroundResource(0);
        final User user = (User) knb0Var.a;
        StringBuilder sb = new StringBuilder();
        String strM2633g = m2633g(user);
        if (!TextUtils.isEmpty(strM2633g)) {
            sb.append(strM2633g);
        }
        if (!user.unilateralBlock() && messagesAct.f1531f.m4269l7() && !user.isHideLocationFromSVip()) {
            String strL = MessageUserHeaderLayout.L(user);
            if (TextUtils.isEmpty(sb)) {
                sb.append(strL);
            } else {
                sb.append(" · ");
                sb.append(strL);
            }
        }
        this.f2010v.setText(sb);
        boolean z = !TextUtils.isEmpty(sb);
        m2631B(user.name);
        String strY7 = CoreModule.c.e0.y7(((DbObject) user).id);
        if (!TextUtils.isEmpty(strY7)) {
            m2631B(strY7);
        } else if (TextUtils.isEmpty(strY7) && CoreModule.P().i().De()) {
            if (!NullChecker.a(user) || user.inactivated) {
                m2631B("已注销");
            } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                m2631B("昵称已重置");
            }
        }
        xdl0.M(this.f2004p, false);
        if (CoreModule.P().g().e() && NullChecker.a(user) && !user.isHideIconFromSVipWithMe() && user.isSupremePartner()) {
            xdl0.M(this.f2004p, true);
            this.f2004p.n0();
        } else if (CoreModule.P().g().b8() && NullChecker.a(user) && !user.isHideIconFromSVipWithMe() && user.isPlatinum()) {
            xdl0.M(this.f2004p, true);
            this.f2004p.m0();
        } else if (CoreModule.P().i().A1() && NullChecker.a(user) && o.n3(user) && !jjb0.b()) {
            CharSequence charSequence = user.settings.getUserCharacter().classification;
            this.f2007s.setText(charSequence);
            if (TextUtils.equals(charSequence, "冰山威士忌")) {
                str = "#309cec";
            } else if (TextUtils.equals(charSequence, "陈年拉菲酒")) {
                str = "#e498b1";
            } else if (TextUtils.equals(charSequence, "清醒冰美式")) {
                str = "#6f4106";
            } else if (TextUtils.equals(charSequence, "手打柠檬茶")) {
                str = "#d5d700";
            } else if (TextUtils.equals(charSequence, "奥利奥奶茶")) {
                str = "#dfb74d";
            } else if (TextUtils.equals(charSequence, "橘子盐汽水")) {
                str = "#ff913b";
            } else {
                str = TextUtils.equals(charSequence, "纯纯凉白开") ? "#1fd2de" : "#65cb72";
            }
            this.f2007s.setBackground(odm.a(Color.parseColor(str), t100.e));
            zvf0.A("e_character_guide", "p_chat_view", new j760[]{vwb.Y("guide_type", "tag")});
            xdl0.M0(this.f2006r, true);
            xdl0.E0(this.f2006r, new View.OnClickListener() { // from class: l.oly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageActionBarLeftLayout.m2625a(messagesAct, user, view);
                }
            });
        }
        String string = this.f2010v.getText().toString();
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        String str2 = string;
        xdl0.M(this.f2009u, false);
        xdl0.X(this.f2008t, 0);
        if (ura.e().d().W8() && NullChecker.a(knb0Var.d) && NullChecker.a(((Conversation) knb0Var.d).additional) && NullChecker.a(((Conversation) knb0Var.d).additional.chatMM)) {
            Object obj = knb0Var.d;
            if (((Conversation) obj).additional.chatMM.sparkSwitch && ((Conversation) obj).doubleDefault()) {
                Object obj2 = knb0Var.d;
                if (((Conversation) obj2).additional.chatMM.level <= 0 || ((Conversation) obj2).additional.chatMM.mmCnt < 3) {
                    messageActionBarLeftLayout = this;
                    r6 = messagesAct;
                    inyVar2 = inyVar;
                    if (!CoreModule.P().a().jj()) {
                        if (!CoreModule.P().g().xn()) {
                            if (!CoreModule.o.d().I5()) {
                                if (CoreModule.P().i().u()) {
                                    r7 = r6;
                                    if (CoreModule.P().e().wq()) {
                                        r7 = r6;
                                        r7 = r6;
                                        r7 = r6;
                                        r7 = r6;
                                        messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                        r8 = r6;
                                    }
                                } else {
                                    r7 = r6;
                                    if (CoreModule.P().e().wq()) {
                                        r7 = r6;
                                        r7 = r6;
                                        r7 = r6;
                                        r7 = r6;
                                        messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                        r8 = r6;
                                    }
                                }
                            } else if (CoreModule.P().i().u()) {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            } else {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            }
                        } else if (!CoreModule.o.d().I5()) {
                            if (CoreModule.P().i().u()) {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            } else {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            }
                        } else if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        }
                    } else if (!CoreModule.P().g().xn()) {
                        if (!CoreModule.o.d().I5()) {
                            if (CoreModule.P().i().u()) {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            } else {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                }
                            }
                        } else if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        }
                    } else if (!CoreModule.o.d().I5()) {
                        if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                            }
                        }
                    } else if (CoreModule.P().i().u()) {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                        }
                    } else {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                        }
                    }
                } else {
                    xdl0.M(this.f2009u, true);
                    Object obj3 = knb0Var.d;
                    int i = ((Conversation) obj3).additional.chatMM.level;
                    int i2 = ((Conversation) obj3).additional.chatMM.mmCnt;
                    xdl0.M(this.f2009u, true);
                    HashMap map = new HashMap();
                    if (i == 1) {
                        this.f2009u.setBackgroundResource(c3c0.N);
                    } else {
                        VImage vImage = this.f2009u;
                        if (i == 2) {
                            vImage.setBackgroundResource(c3c0.O);
                        } else {
                            vImage.setBackgroundResource(c3c0.P);
                        }
                    }
                    xdl0.X(this.f2008t, -t100.c);
                    map.put("spark_level", Integer.valueOf(i));
                    map.put("message_pairs", Integer.valueOf(i2));
                    zvf0.y("e_spark", "p_chat_view", map);
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    AppCompatTextView appCompatTextView = this.f2010v;
                    if (zIsEmpty) {
                        appCompatTextView.setText(String.valueOf(i2));
                    } else {
                        appCompatTextView.setText(zz6.p0(String.valueOf(i2), str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                    }
                    messageActionBarLeftLayout = this;
                    ?? r9 = messagesAct;
                    inyVar2 = inyVar;
                    xdl0.E0(this.f2008t, messageActionBarLeftLayout.new ViewOnClickListenerC0155a(user, map, r9, inyVar2));
                    r8 = r9;
                }
                r8 = r6;
                r8 = r6;
                r8 = r6;
                z = true;
                r7 = r8;
            } else {
                messageActionBarLeftLayout = this;
                r6 = messagesAct;
                inyVar2 = inyVar;
                if (!CoreModule.P().a().jj()) {
                    if (!CoreModule.P().g().xn()) {
                        if (!CoreModule.o.d().I5()) {
                            if (CoreModule.P().i().u()) {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                    r8 = r6;
                                    r8 = r6;
                                    r8 = r6;
                                    z = true;
                                    r7 = r8;
                                }
                            } else {
                                r7 = r6;
                                if (CoreModule.P().e().wq()) {
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    r7 = r6;
                                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                    r8 = r6;
                                    r8 = r6;
                                    r8 = r6;
                                    r8 = r6;
                                    z = true;
                                    r7 = r8;
                                }
                            }
                        } else if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        }
                    } else if (!CoreModule.o.d().I5()) {
                        if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        }
                    } else if (CoreModule.P().i().u()) {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    } else {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    }
                } else if (!CoreModule.P().g().xn()) {
                    if (!CoreModule.o.d().I5()) {
                        if (CoreModule.P().i().u()) {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        } else {
                            r7 = r6;
                            if (CoreModule.P().e().wq()) {
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                r7 = r6;
                                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                r8 = r6;
                                z = true;
                                r7 = r8;
                            }
                        }
                    } else if (CoreModule.P().i().u()) {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    } else {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    }
                } else if (!CoreModule.o.d().I5()) {
                    if (CoreModule.P().i().u()) {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    } else {
                        r7 = r6;
                        if (CoreModule.P().e().wq()) {
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            r7 = r6;
                            messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            r8 = r6;
                            z = true;
                            r7 = r8;
                        }
                    }
                } else if (CoreModule.P().i().u()) {
                    r7 = r6;
                    if (CoreModule.P().e().wq()) {
                        r7 = r6;
                        r7 = r6;
                        r7 = r6;
                        r7 = r6;
                        messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                        r8 = r6;
                        r8 = r6;
                        r8 = r6;
                        r8 = r6;
                        z = true;
                        r7 = r8;
                    }
                } else {
                    r7 = r6;
                    if (CoreModule.P().e().wq()) {
                        r7 = r6;
                        r7 = r6;
                        r7 = r6;
                        r7 = r6;
                        messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                        r8 = r6;
                        r8 = r6;
                        r8 = r6;
                        r8 = r6;
                        z = true;
                        r7 = r8;
                    }
                }
            }
        } else {
            messageActionBarLeftLayout = this;
            r6 = messagesAct;
            inyVar2 = inyVar;
            if (!CoreModule.P().a().jj() && NullChecker.a(knb0Var.d) && ((Conversation) knb0Var.d).isConfessionFirstConv()) {
                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自抢先告白", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                r8 = r6;
            } else if (!CoreModule.P().g().xn() && NullChecker.a(knb0Var.d) && ((Conversation) knb0Var.d).isConfessionFirstConv()) {
                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自抢先告白", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                r8 = r6;
            } else if (!CoreModule.o.d().I5() && NullChecker.a(knb0Var.d) && NullChecker.a(((Conversation) knb0Var.d).additional) && NullChecker.a(((Conversation) knb0Var.d).additional.greetingInfo) && ((Conversation) knb0Var.d).additional.greetingInfo.fromGreeting) {
                messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自抢先告白", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                r8 = r6;
            } else if (CoreModule.P().i().u() || !NullChecker.a(knb0Var.d) || !((Conversation) knb0Var.d).isHeartbeatConv()) {
                r7 = r6;
                if (CoreModule.P().e().wq() && NullChecker.a(knb0Var.a) && NullChecker.a(((User) knb0Var.a).localRelationship) && NullChecker.a(((User) knb0Var.a).localRelationship.status) && ((User) knb0Var.a).localRelationship.status.contains(MatchFrom.get("boosted"))) {
                    r7 = r6;
                    r7 = r6;
                    r7 = r6;
                    r7 = r6;
                    messageActionBarLeftLayout.f2010v.setText(zz6.p0("来自加速配对", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k), false));
                    r8 = r6;
                }
            } else if (CoreModule.P().i().uh() && !((Conversation) knb0Var.d).isLimitMatch()) {
                r8 = r6;
                r8 = r6;
                messageActionBarLeftLayout.f2010v.setText(zz6.o0(CoreModule.b.getString(R.string.a3), str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k)));
                r8 = r6;
            }
            r8 = r6;
            r8 = r6;
            r8 = r6;
            z = true;
            r7 = r8;
        }
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        r7 = r6;
        if (CoreModule.P().i().uh() && CoreModule.P().i().c() && NullChecker.a(knb0Var.d) && TextUtils.equals(((Conversation) knb0Var.d).convType, "quickchat")) {
            messageActionBarLeftLayout.f2010v.setText(zz6.o0(CoreModule.P().i().j5((Conversation) knb0Var.d) ? "来自语音闪聊" : "来自闪聊匹配", str2, CoreModule.b.getResources().getColor(a1c0.k), CoreModule.b.getResources().getColor(a1c0.k)));
            z = true;
        }
        if (r7.m2050D2()) {
            z = false;
        }
        messageActionBarLeftLayout.f2000l.requestLayout();
        if (xdl0.O0(messageActionBarLeftLayout.f2008t)) {
            inyVar2.m5196Q1();
            xdl0.M(messageActionBarLeftLayout.f2011w, false);
        }
        xdl0.M(r7.mo2066l().m4309t7().m7942m0().getRightIconContainer(), true);
        xdl0.M(messageActionBarLeftLayout.f2008t, z);
        messageActionBarLeftLayout.f2000l.requestLayout();
    }

    /* JADX INFO: renamed from: m */
    public void m2639m(j760<User, j760<Integer, Boolean>> j760Var, int i) {
        User user = (User) j760Var.a;
        if (CoreModule.P().i().De() && (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
            this.f1991c.z0(c3c0.k1);
            xdl0.M(this.f1995g, false);
            xdl0.M(this.f1990b, true);
            xdl0.M(this.f2008t, false);
            return;
        }
        if (NullChecker.a(user)) {
            CoreModule.P().b().xp(this.f1991c.get_pic(), rw6.a(user).profileSmall(), i);
            this.f1991c.G0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2640n(Act act, User user) {
        if (jjb0.b()) {
            if (this.f2003o.getChildCount() > 0) {
                return;
            }
            xdl0.M(this.f2002n, false);
            View viewF = CertificationUtil.f(act, user, CertificationUtil.CertificationIconStyle.IM);
            xdl0.M(this.f2003o, NullChecker.a(viewF));
            if (viewF == null) {
                return;
            }
            this.f2003o.addView(viewF);
            return;
        }
        if (!ura.e().d().I4()) {
            qib0.b0.b.showUserVerificationLogo(act, user, this.f2002n);
            return;
        }
        if (this.f2003o.getChildCount() > 0) {
            return;
        }
        xdl0.M(this.f2002n, false);
        View viewF2 = CertificationUtil.f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
        if (viewF2 == null) {
            return;
        }
        this.f2003o.addView(viewF2);
        xdl0.M(this.f2003o, true);
    }

    /* JADX INFO: renamed from: o */
    public void m2641o(Act act, User user) {
        if (CoreModule.P().i().G1()) {
            if (!jjb0.b()) {
                if (!ura.e().d().I4()) {
                    qib0.b0.b.showUserVerificationLogo(act, user, this.f2002n);
                    return;
                }
                if (this.f2003o.getChildCount() > 0) {
                    return;
                }
                xdl0.M(this.f2002n, false);
                View viewF = CertificationUtil.f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
                if (viewF == null) {
                    return;
                }
                this.f2003o.addView(viewF);
                xdl0.M(this.f2003o, true);
                return;
            }
            if (this.f2003o.getChildCount() > 0) {
                return;
            }
            xdl0.M(this.f2002n, false);
            if (!ura.e().d().t9() || ikf0.m5152i(xdl0.y0()) >= 400.0f) {
                View viewF2 = CertificationUtil.f(act, user, CertificationUtil.CertificationIconStyle.IM);
                if (viewF2 == null) {
                    return;
                }
                this.f2003o.addView(viewF2);
                xdl0.M(this.f2003o, true);
                return;
            }
            int i = CertificationUtil.i(user, false);
            if (i == -1) {
                return;
            }
            ImageView imageView = new ImageView(act);
            imageView.setImageResource(i);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(t100.d(16.0f), t100.d(16.0f)));
            this.f2003o.addView(imageView);
            xdl0.M(this.f2003o, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2632f(this);
        this.f2012x.setImageResource(ura.e().d().I4() ? c3c0.b4 : c3c0.a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m2642p(MessagesAct messagesAct, xaj0<User, j760<Integer, Boolean>, Conversation> xaj0Var, iny inyVar) {
        tqz tqzVarM4309t7 = inyVar.m6497e0().mo2066l().m4309t7();
        if (tqzVarM4309t7 instanceof bpz) {
            bpz bpzVar = (bpz) tqzVarM4309t7;
            User user = (User) xaj0Var.a;
            if (CoreModule.P().i().De() && (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
                this.f1991c.z0(c3c0.k1);
                xdl0.M(this.f1995g, false);
                xdl0.M(this.f1990b, true);
                xdl0.M(this.f2008t, false);
                return;
            }
            int iM5207l0 = inyVar.m5207l0();
            if (iM5207l0 != 100) {
                if (NullChecker.a(bpzVar.f7690t1.mo8073c())) {
                    bpzVar.f7690t1.mo8073c().F0(user, iM5207l0);
                }
                CoreModule.P().i().y2(this.f1991c.get_pic(), rw6.a(user).profileSmall(), iM5207l0);
                CoreModule.P().i().y2(this.f1997i, rw6.a(user).profileSmall(), iM5207l0);
                xdl0.M(this.f1995g, true);
                xdl0.M(this.f1990b, false);
                if (CoreModule.P().i().uh()) {
                    this.f1996h.setBitmapRes(c3c0.Y5);
                }
                this.f1996h.setThreeDp(t100.d(2.5f));
                this.f1996h.setProgress(iM5207l0);
                this.f1991c.G0(false);
            } else {
                boolean zM5199e1 = inyVar.m5199e1();
                u4z u4zVar = bpzVar.f7690t1;
                if (zM5199e1) {
                    if (NullChecker.a(u4zVar.mo8073c())) {
                        bpzVar.f7690t1.mo8073c().G0(user, 0);
                    }
                } else if (NullChecker.a(u4zVar.mo8073c())) {
                    bpzVar.f7690t1.mo8073c().setOtherSmallImage(user);
                }
                if (inyVar.m5199e1()) {
                    CoreModule.P().i().y2(this.f1991c.get_pic(), rw6.a(user).profileSmall(), 0);
                    this.f1991c.G0(false);
                } else {
                    this.f1991c.v0(user, rw6.a(user).profileSmall());
                    if (messagesAct.m2050D2()) {
                        this.f1991c.G0(false);
                    }
                }
                xdl0.M(this.f1995g, false);
                xdl0.M(this.f1990b, true);
            }
            if (((Conversation) xaj0Var.c).isQuickChatClearAvatar(CoreModule.c.e0.na()) && NullChecker.a(bpzVar.f7690t1.mo8073c())) {
                bpzVar.f7690t1.mo8073c().setOtherSmallImage(user);
                qib0.G.L0(this.f1997i, rw6.a(user).profileSmall().formatted());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m2643q(iny inyVar) {
        final fcz<? extends DbObject, ?> fczVarMo2066l = inyVar.m6497e0().mo2066l();
        final View view = (View) this.f2012x.getParent();
        view.post(new Runnable() { // from class: l.mly
            @Override // java.lang.Runnable
            public final void run() {
                this.f5685a.m2645s(view);
            }
        });
        xdl0.W(this.f1998j, t100.d(32.0f));
        xdl0.e0(this.f1999k, t100.d(6.0f));
        hmb.M(this.f2012x, true);
        xdl0.E0(this.f2012x, new View.OnClickListener() { // from class: l.nly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5923a.m2646t(fczVarMo2066l, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2644r(User user, fcz fczVar, View view) {
        m2647u(user, fczVar);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m2645s(View view) {
        Rect rect = new Rect();
        this.f2012x.getHitRect(rect);
        rect.top -= 10;
        rect.bottom += 10;
        rect.left -= 10;
        rect.right += 10;
        TouchDelegate touchDelegate = new TouchDelegate(rect, this.f2012x);
        if (View.class.isInstance(this.f2012x.getParent())) {
            view.setTouchDelegate(touchDelegate);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m2646t(fcz fczVar, View view) {
        if (fczVar.m4309t7().m7944n0()) {
            fczVar.m4309t7().m7922e0();
            this.f2012x.setImageResource(ura.e().d().I4() ? c3c0.Z3 : c3c0.Y3);
        } else {
            fczVar.m4309t7().m7930h0();
            this.f2012x.setImageResource(ura.e().d().I4() ? c3c0.b4 : c3c0.a4);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2647u(User user, fcz fczVar) {
        if (CoreModule.P().i().De()) {
            if (!NullChecker.a(user) || user.inactivated) {
                lsi0.j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                lsi0.j("对方账号异常");
                return;
            }
        }
        o6j0.c("e_chat_avatar", fczVar.pageId(), new o6j0.a[]{o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), fczVar.m4295r3())))});
        fczVar.m4317v6("messages_title");
    }

    /* JADX INFO: renamed from: v */
    public void m2648v(String str) {
        xdl0.M(this.f1992d, true);
        qib0.G.L0(this.f1993e, str);
    }

    /* JADX INFO: renamed from: w */
    public void m2649w(BubbleInfo bubbleInfo) {
        xdl0.M(this.f1992d, true);
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f1993e;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.p;
        bkb0Var.I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: x */
    public void m2650x(ChatGroup chatGroup, boolean z) {
        if (vwb.J(chatGroup.avatars)) {
            qib0.G.Y0(this.f1991c.get_pic(), c3c0.I0);
        } else {
            qib0.G.Z0(this.f1991c.get_pic(), ((Picture) chatGroup.avatars.get(0)).cover().profileSmall().formatted());
        }
        if (chatGroup.onlineCount <= 1 || !z) {
            xdl0.M(this.f2013y, true);
            xdl0.M(this.f1994f, false);
            this.f2013y.setText(chatGroup.name);
            return;
        }
        xdl0.M(this.f2013y, false);
        xdl0.M(this.f1994f, true);
        String str = chatGroup.onlineCount + getContext().getResources().getString(R.string.q3);
        this.f2010v.setText(m2634h(str + getContext().getResources().getString(R.string.r6), str));
        this.f2000l.setText(chatGroup.name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m2651y(MessagesAct messagesAct, iny inyVar, User user) {
        Conversation conversation = inyVar.m6497e0().mo2066l().f3551k;
        if (CoreModule.P().i().De() && (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
            this.f1991c.z0(c3c0.k1);
            xdl0.M(this.f1995g, false);
            xdl0.M(this.f1990b, true);
            xdl0.M(this.f2008t, false);
        } else if ((CoreModule.P().i().c() && user.onlineMatchLocked()) || inyVar.m5199e1()) {
            CoreModule.P().i().y2(this.f1991c.get_pic(), rw6.a(user).profileSmall(), inyVar.m5207l0());
        } else if (CoreModule.P().b().Yg() && NullChecker.a(user) && user.isLoveBuzz()) {
            CoreModule.P().b().xp(this.f1991c.get_pic(), rw6.a(user).profileSmall(), inyVar.m5205k0());
        } else {
            if ((NullChecker.a(conversation) && conversation.isAnonymous()) || inyVar.m6497e0().mo2066l().m4199Y3()) {
                qib0.G.L0(this.f1991c.get_pic(), user.getAnonymousUrl());
            } else {
                this.f1991c.v0(user, rw6.a(user).profileSmall());
                if (messagesAct.m2050D2()) {
                }
            }
            this.f1991c.G0(false);
        }
        if (NullChecker.a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
            qib0.G.L0(this.f1991c.get_pic(), user.fp().profileSmall().formatted());
            qib0.G.L0(this.f1997i, rw6.a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2652z(User user) {
        boolean z = false;
        xdl0.M(this.f2008t, false);
        AppCompatTextView appCompatTextView = this.f2011w;
        if (NullChecker.a(user) && !user.unilateralBlock()) {
            z = true;
        }
        xdl0.M(appCompatTextView, z);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
