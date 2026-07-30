package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageLeft;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationType;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.LocalStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.djj;
import l.hap;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.rw6;
import l.t100;
import l.ura;
import l.x1c0;
import l.xaj0;
import l.xdl0;
import l.y4c0;
import l.zxz;
import p003l.dml;
import p003l.e30;
import p003l.fcz;
import p003l.m250;
import p003l.r7q;
import p003l.ruy;
import p003l.tbk;
import p003l.w9j;
import p003l.wdk;
import p003l.x9j;
import p003l.y9j;
import p014rx.C1099c;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageLeft extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: E0 */
    public VLinear f1060E0;

    /* JADX INFO: renamed from: F0 */
    public VText f1061F0;

    /* JADX INFO: renamed from: G0 */
    public GradientBgButton f1062G0;

    /* JADX INFO: renamed from: H0 */
    public User f1063H0;

    /* JADX INFO: renamed from: I0 */
    public dml f1064I0;

    /* JADX INFO: renamed from: J0 */
    public Message f1065J0;

    /* JADX INFO: renamed from: K0 */
    public View.OnLongClickListener f1066K0;

    /* JADX INFO: renamed from: L */
    public FrameLayout f1067L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f1068M;

    /* JADX INFO: renamed from: N */
    public VImage f1069N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f1070O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f1071P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f1072Q;

    /* JADX INFO: renamed from: R */
    public VText f1073R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f1074S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f1075T;

    /* JADX INFO: renamed from: U */
    public VText f1076U;

    /* JADX INFO: renamed from: V */
    public VText f1077V;

    /* JADX INFO: renamed from: W */
    public VText f1078W;

    /* JADX INFO: renamed from: k0 */
    public VText f1079k0;

    /* JADX INFO: renamed from: p0 */
    public HeaderFrameWrapper f1080p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$a */
    public class ViewOnLongClickListenerC0082a implements View.OnLongClickListener {
        public ViewOnLongClickListenerC0082a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1505a(fcz fczVar, User user, ChatGroupMember chatGroupMember) {
            if (!NullChecker.a(chatGroupMember) || fczVar.m6497e0().mo2063c0().m6499g0().mo5110m()) {
                return;
            }
            fczVar.m6497e0().mo2063c0().m8913O0(true);
            fczVar.m6497e0().mo2063c0().m6499g0().mo5104f();
            fczVar.m6497e0().mo2046A0().m6499g0().m4793U1();
            fczVar.m6497e0().mo2046A0().m8789C1(user, chatGroupMember);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (NullChecker.a(ItemMessageLeft.this.f1065J0) && ItemMessageLeft.this.m1433X() && TEnum.equals(ItemMessageLeft.this.f1065J0.channel, "group")) {
                final User userPa = CoreModule.c.e0.Pa(ItemMessageLeft.this.f1065J0.owner);
                final fcz fczVar = ItemMessageLeft.this.m1418H().f1531f;
                if (NullChecker.a(userPa)) {
                    ItemMessageLeft itemMessageLeft = ItemMessageLeft.this;
                    itemMessageLeft.f1064I0.mo3522c(itemMessageLeft.m1418H(), CoreModule.c.g0.T6(fczVar.m4295r3(), ((DbObject) userPa).id).take(1)).subscribe((m250) mkd0.G(new e30() { // from class: l.d8q
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            ItemMessageLeft.ViewOnLongClickListenerC0082a.m1505a(fczVar, userPa, (ChatGroupMember) obj);
                        }
                    }));
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$b */
    public class C0083b implements C0107b.c {
        public C0083b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: a */
        public String mo1506a() {
            return ItemMessageLeft.this.f1065J0.owner;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: b */
        public String mo1507b() {
            return ItemMessageLeft.this.f1065J0.cid;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: c */
        public boolean mo1508c() {
            return CoreModule.P().i().D() && !User.isTeamAccount(ItemMessageLeft.this.f1065J0.cid);
        }
    }

    public ItemMessageLeft(Context context) {
        super(context);
        this.f1066K0 = new ViewOnLongClickListenerC0082a();
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m1489H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m1495N0(String str, fcz fczVar, ChatGroupMember chatGroupMember) {
        if (NullChecker.a(chatGroupMember) && TEnum.equals(chatGroupMember.status, "exited")) {
            lsi0.w(R.string.Z);
        } else {
            if (wdk.m8551d(CoreModule.K().getUserById(this.f1065J0.owner))) {
                return;
            }
            Intent intentM7711e = tbk.m7711e(m1418H(), this.f1065J0.owner, str);
            intentM7711e.putExtra("from_group_id", fczVar.m4295r3());
            m1418H().startActivity(intentM7711e);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m1496O0(ChatGroup chatGroup, Pair pair) {
        User user = (User) pair.first;
        ChatGroupMember chatGroupMember = (ChatGroupMember) pair.second;
        if (NullChecker.a(chatGroupMember) && !TextUtils.isEmpty(chatGroupMember.groupMemberName())) {
            xdl0.M(this.f1077V, true);
            this.f1077V.setText(tbk.m7721o(chatGroupMember.groupMemberName()));
        }
        if (NullChecker.a(user) && user.isBanedOrInactivated()) {
            this.f1077V.setText(user.publicId);
        }
        if (tbk.m7725s(chatGroup)) {
            if (NullChecker.a(user)) {
                qib0.G.Z0(this.f1068M, tbk.m7717k(user));
            } else {
                qib0.G.Y0(this.f1068M, c3c0.I0);
            }
        } else if (!NullChecker.a(user)) {
            qib0.G.Y0(this.f1068M, c3c0.I0);
        } else if (user.isBanedOrInactivated()) {
            qib0.G.Y0(this.f1068M, CoreModule.l.i().T0());
        } else {
            this.f1080p0.setShowSVipFrame(false);
            this.f1080p0.E0(false, "p_chat_view");
            this.f1080p0.t0(user);
        }
        xdl0.M(this.f1077V, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m1497P0(User user) {
        if (m1418H().m2050D2()) {
            xdl0.M(this.f1069N, false);
            xdl0.M(this.f1062G0, false);
            xdl0.M(this.f1062G0, false);
        }
        if (user.inactivated) {
            this.f1080p0.z0(c3c0.h);
            return;
        }
        boolean zM1431V = m1431V();
        HeaderFrameWrapper headerFrameWrapper = this.f1080p0;
        if (zM1431V) {
            headerFrameWrapper.B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.v0(user, rw6.a(user).profileSmall());
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m1498Q0(Conversation conversation, xaj0 xaj0Var) {
        xdl0.M(this.f1062G0, false);
        if (TEnum.equals((ConversationType) xaj0Var.c, "soulmate")) {
            if (this.f1063H0.inactivated) {
                qib0.G.Y0(this.f1068M, CoreModule.P().i().T0());
                return;
            } else {
                this.f1068M.setImageURI(((User) xaj0Var.a).soulSettings.picture.url);
                return;
            }
        }
        User user = (User) xaj0Var.a;
        int iIntValue = ((Integer) ((j760) xaj0Var.b).a).intValue();
        if (user.inactivated) {
            qib0.G.Y0(this.f1068M, CoreModule.P().i().T0());
        } else if (m1431V()) {
            qib0.G.L0(this.f1068M, user.getAnonymousUrl());
        } else {
            if (!user.onlineMatchLocked() || iIntValue == 100) {
                if (!CoreModule.P().b().Yg() || !user.isLoveBuzz() || CoreModule.P().b().Wr(conversation) || iIntValue == 100) {
                    this.f1080p0.v0(user, rw6.a(user).profileSmall());
                } else {
                    CoreModule.P().b().xp(this.f1068M, rw6.a(user).profileSmall(), iIntValue);
                }
            } else if (conversation.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
                this.f1080p0.v0(user, rw6.a(user).profileSmall());
            } else {
                CoreModule.P().i().y2(this.f1068M, rw6.a(user).profileSmall(), iIntValue);
            }
            this.f1080p0.G0(false);
        }
        xdl0.M(this.f1069N, false);
        xdl0.M(this.f1062G0, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m1499R0(User user) {
        if (!user.inactivated) {
            if (m1431V()) {
                qib0.G.L0(this.f1068M, user.getAnonymousUrl());
            } else {
                this.f1080p0.v0(user, rw6.a(user).profileSmall());
            }
            xdl0.M(this.f1069N, false);
            xdl0.M(this.f1062G0, false);
        }
        qib0.G.Y0(this.f1068M, CoreModule.P().i().T0());
        this.f1080p0.G0(false);
        xdl0.M(this.f1069N, false);
        xdl0.M(this.f1062G0, false);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m1500S0(j760 j760Var) {
        qib0.G.Q0(this.f1071P, ((User) j760Var.a).fp().profileSmall());
        Object obj = j760Var.b;
        if (obj == null || ((User) obj).inactivated) {
            qib0.G.Y0(this.f1072Q, CoreModule.P().i().T0());
        } else {
            qib0.G.Q0(this.f1072Q, ((User) obj).fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m1501T0(Message message, View view) {
        if (NullChecker.a(m1418H()) && m1433X()) {
            m1418H().m2059Q2(message);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m1502U0(BubbleInfo bubbleInfo) {
        if (NullChecker.a(bubbleInfo) && m1432W(bubbleInfo)) {
            xdl0.X(this.f1067L, (int) getResources().getDimension(x1c0.d));
        } else {
            xdl0.X(this.f1067L, (int) getResources().getDimension(x1c0.e));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m1503V0(dml dmlVar, Message message, User user) {
        xdl0.M(this.f1060E0, false);
    }

    /* JADX INFO: renamed from: W0 */
    public void m1504W0() {
        if (CoreModule.P().i().D()) {
            this.f1074S.removeAllViews();
            this.f1068M.setRotation(0.0f);
            if (NullChecker.a(this.f1065J0)) {
                zxz zxzVarH = zxz.h();
                Message message = this.f1065J0;
                zxzVarH.p(message.owner, ((DbObject) message).id, this.f1074S, this.f1068M);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo1113f(User user, String str, LocalStatus localStatus) {
        super.mo1113f(user, str, localStatus);
        this.f1063H0 = user;
        this.f1080p0.E0(false, "p_chat_view");
        boolean zM1431V = m1431V();
        HeaderFrameWrapper headerFrameWrapper = this.f1080p0;
        if (zM1431V) {
            headerFrameWrapper.B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.v0(user, rw6.a(user).profileSmall());
        }
        xdl0.M(this.f1069N, false);
        xdl0.M(this.f1062G0, false);
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC0102a).m1275b(str);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase, com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, final Message message, Message message2, Message message3) {
        super.mo1114g(dmlVar, message, message2, message3);
        setPivotX(t100.d(6.0f));
        this.f1065J0 = message;
        this.f1064I0 = dmlVar;
        this.f1080p0.E0(false, "p_chat_view");
        if (CoreModule.P().i().E() && m1433X() && TEnum.equals(message.channel, "group")) {
            this.f1080p0.G0(false);
            if (!CoreModule.P().i().Q()) {
                this.f1077V.setVisibility(4);
            }
            djj hierarchy = this.f1068M.getHierarchy();
            if (NullChecker.a(hierarchy)) {
                hierarchy.D(c3c0.I0);
                hierarchy.z(c3c0.I0);
            }
            fcz fczVar = m1418H().f1531f;
            final ChatGroup chatGroupS6 = CoreModule.c.g0.s6(fczVar.m4295r3());
            if (NullChecker.a(chatGroupS6)) {
                dmlVar.mo3522c(m1418H(), C1099c.combineLatest(CoreModule.c.e0.Ma(message.owner), CoreModule.c.g0.T6(fczVar.m4295r3(), message.owner), new x9j() { // from class: l.u7q
                    @Override // p003l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((User) obj, (ChatGroupMember) obj2);
                    }
                })).subscribe((m250) mkd0.G(new e30() { // from class: l.x7q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8739a.m1496O0(chatGroupS6, (Pair) obj);
                    }
                }));
                return;
            }
            return;
        }
        m1504W0();
        m1503V0(this.f1064I0, message, CoreModule.c.e0.Pa(message.owner));
        if (m1433X() && (CoreModule.P().i().c() || CoreModule.P().b().Yg())) {
            final Conversation conversationXe = CoreModule.c.f0.Xe(message.owner);
            if (conversationXe == null) {
                dmlVar.mo3522c(m1418H(), CoreModule.c.e0.Ka(message.owner)).subscribe((m250) mkd0.G(new e30() { // from class: l.y7q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8928a.m1497P0((User) obj);
                    }
                }));
            } else {
                dmlVar.mo3522c(m1418H(), mkd0.s(CoreModule.c.e0.Ka(message.owner), CoreModule.P().b().Yg() ? CoreModule.P().b().vg(conversationXe, message.owner) : CoreModule.c.f0.mo(message.owner), CoreModule.c.f0.Ne(message.cid).map(new w9j() { // from class: l.z7q
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return ((Conversation) obj).subtype;
                    }
                }).distinctUntilChanged(), new y9j() { // from class: l.a8q
                    @Override // p003l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo2764a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((User) obj, (j760) obj2, (ConversationType) obj3);
                    }
                })).subscribe((m250) mkd0.G(new e30() { // from class: l.b8q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f2352a.m1498Q0(conversationXe, (xaj0) obj);
                    }
                }));
            }
        } else {
            dmlVar.mo3522c(m1418H(), CoreModule.c.e0.Ka(message.owner)).subscribe((m250) mkd0.G(new e30() { // from class: l.c8q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2589a.m1499R0((User) obj);
                }
            }));
        }
        if (CoreModule.P().i().B() && CoreModule.P().i().Q4(message.cid) && (this.f1027v instanceof ItemHeartConfession) && !hap.c(message.cid)) {
            xdl0.M(this.f1070O, true);
            dmlVar.mo3522c(m1418H(), mkd0.r(CoreModule.c.e0.o9(), CoreModule.c.e0.Ka(message.cid), new r7q())).subscribe((m250) mkd0.G(new e30() { // from class: l.s7q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7152a.m1500S0((j760) obj);
                }
            }));
        } else {
            xdl0.M(this.f1070O, false);
        }
        boolean zM7391n = ruy.m7381g().m7391n(message, message3);
        FrameLayout frameLayout = this.f1075T;
        if (zM7391n) {
            xdl0.M(frameLayout, true);
            ruy.m7382l(m1418H(), this.f1076U, message.cid);
        } else {
            xdl0.M(frameLayout, false);
        }
        if (TEnum.equals(message.messageType, "chat_gift") && NullChecker.b(message.additionalData) && NullChecker.b(message.additionalData.chatGiftInfo)) {
            CoreModule.c.f1.R3(message.additionalData.chatGiftInfo.id);
        }
        xdl0.E0(this.f1075T, new View.OnClickListener() { // from class: l.t7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7414a.m1501T0(message, view);
            }
        });
        m1459x0(message);
        if (TEnum.equals(message.messageType, "state_comment") || TEnum.equals(message.messageType, "state_like")) {
            dmlVar.mo3522c(getContext(), CoreModule.c.q1.v3(message.isMe() ? message.cid : ((DbObject) CoreModule.c.e0.p9()).id, message.referenceMsgId).take(1)).subscribe((m250) mkd0.H(new e30() { // from class: l.v7q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8232a.m1502U0((BubbleInfo) obj);
                }
            }, new e30() { // from class: l.w7q
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemMessageLeft.m1489H0((Throwable) obj);
                }
            }));
            return;
        }
        boolean zEquals = TEnum.equals(message.messageType, "literature");
        FrameLayout frameLayout2 = this.f1067L;
        if (zEquals) {
            xdl0.X(frameLayout2, (int) getResources().getDimension(x1c0.f));
        } else {
            xdl0.X(frameLayout2, (int) getResources().getDimension(x1c0.c));
        }
    }

    public String getMessageId() {
        return NullChecker.a(this.f1065J0) ? ((DbObject) this.f1065J0).id : "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final String str;
        if (!m1433X()) {
            if (CoreModule.l.i().t4(m1418H())) {
                o6j0.c("e_kankan_chat_head", "p_kankan_chat_popup", new o6j0.a[]{o6j0.a.h("user_id", this.f1065J0.owner)});
                CoreModule.P().i().a4(m1418H(), "from_greet_act", this.f1065J0.owner);
                return;
            }
            return;
        }
        final fcz fczVar = m1418H().f1531f;
        o6j0.c("e_chat_avatar", m1418H().pageId(), new o6j0.a[]{o6j0.a.h("click_user_id", this.f1065J0.owner), o6j0.a.h("is_self_avatar", String.valueOf(String.valueOf(TextUtils.equals(CoreModule.H().userId(), this.f1065J0.owner))))});
        if (NullChecker.a(this.f1065J0) && TEnum.equals(this.f1065J0.channel, "group")) {
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(fczVar.m4295r3());
            str = (NullChecker.a(chatGroupS6) && tbk.m7725s(chatGroupS6)) ? "chat_group_anonymity" : "chat_group";
        } else {
            str = "messages_thumbnail_left";
        }
        if (!CoreModule.P().i().E() || !fczVar.m4231e4()) {
            fczVar.m4321w6(str, this.f1065J0.owner);
            return;
        }
        ChatGroup chatGroupS7 = CoreModule.c.g0.s6(fczVar.m4295r3());
        if (NullChecker.a(chatGroupS7) && TEnum.equals(chatGroupS7.status, "disbanded")) {
            lsi0.w(R.string.i0);
            return;
        }
        Conversation conversationM4255j3 = fczVar.m4255j3();
        if (NullChecker.a(conversationM4255j3) && TEnum.equals(conversationM4255j3.status, "blocked")) {
            lsi0.w(R.string.Z);
        } else {
            m1418H().duringCreated(CoreModule.c.g0.T6(fczVar.m4295r3(), CoreModule.H().userId())).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.q7q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6598a.m1495N0(str, fczVar, (ChatGroupMember) obj);
                }
            }));
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
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase, com.p000p1.mobile.putong.core.p001ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1067L = (FrameLayout) findViewById(y4c0.u3);
        HeaderFrameWrapper headerFrameWrapperFindViewById = findViewById(y4c0.t3);
        this.f1080p0 = headerFrameWrapperFindViewById;
        this.f1068M = headerFrameWrapperFindViewById.get_pic();
        this.f1069N = (VImage) findViewById(y4c0.r5);
        this.f1074S = (FrameLayout) findViewById(y4c0.B4);
        this.f1062G0 = findViewById(y4c0.c2);
        this.f1077V = (VText) findViewById(y4c0.p5);
        this.f1078W = (VText) findViewById(y4c0.S0);
        this.f1079k0 = (VText) findViewById(y4c0.X0);
        this.f1060E0 = (VLinear) findViewById(y4c0.a2);
        this.f1061F0 = (VText) findViewById(y4c0.b2);
        if (CoreModule.P().i().D() && m1425O()) {
            C0107b.m2165s(this.f1068M, new C0083b(), this, this.f1066K0, null);
        } else {
            this.f1068M.setOnLongClickListener(this.f1066K0);
        }
        xdl0.E0(this.f1068M, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(y4c0.I1);
        this.f1070O = frameLayout;
        this.f1071P = (VDraweeView) frameLayout.findViewById(y4c0.i0);
        this.f1072Q = (VDraweeView) this.f1070O.findViewById(y4c0.j0);
        this.f1073R = (VText) this.f1070O.findViewById(y4c0.k0);
        this.f1075T = (FrameLayout) findViewById(y4c0.H1);
        this.f1076U = (VText) findViewById(y4c0.y);
        if (ura.e().d().I4()) {
            this.f1078W.setTextColor(getResources().getColor(a1c0.i));
            this.f1076U.setTextColor(getResources().getColor(a1c0.i));
            this.f1079k0.setTextColor(getResources().getColor(a1c0.i));
            this.f1073R.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1066K0 = new ViewOnLongClickListenerC0082a();
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1066K0 = new ViewOnLongClickListenerC0082a();
    }
}
