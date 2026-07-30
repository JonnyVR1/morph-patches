package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageLeft;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.djj;
import p149l.dml;
import p149l.e30;
import p149l.fcz;
import p149l.hap;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.r7q;
import p149l.ruy;
import p149l.rw6;
import p149l.t100;
import p149l.tbk;
import p149l.ura;
import p149l.w9j;
import p149l.wdk;
import p149l.x1c0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y4c0;
import p149l.y9j;
import p149l.zxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageLeft extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: E0 */
    public VLinear f31169E0;

    /* JADX INFO: renamed from: F0 */
    public VText f31170F0;

    /* JADX INFO: renamed from: G0 */
    public GradientBgButton f31171G0;

    /* JADX INFO: renamed from: H0 */
    public User f31172H0;

    /* JADX INFO: renamed from: I0 */
    public dml f31173I0;

    /* JADX INFO: renamed from: J0 */
    public Message f31174J0;

    /* JADX INFO: renamed from: K0 */
    public View.OnLongClickListener f31175K0;

    /* JADX INFO: renamed from: L */
    public FrameLayout f31176L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f31177M;

    /* JADX INFO: renamed from: N */
    public VImage f31178N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f31179O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f31180P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f31181Q;

    /* JADX INFO: renamed from: R */
    public VText f31182R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f31183S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f31184T;

    /* JADX INFO: renamed from: U */
    public VText f31185U;

    /* JADX INFO: renamed from: V */
    public VText f31186V;

    /* JADX INFO: renamed from: W */
    public VText f31187W;

    /* JADX INFO: renamed from: k0 */
    public VText f31188k0;

    /* JADX INFO: renamed from: p0 */
    public HeaderFrameWrapper f31189p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$a */
    public class ViewOnLongClickListenerC8499a implements View.OnLongClickListener {
        public ViewOnLongClickListenerC8499a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m48421a(fcz fczVar, User user, ChatGroupMember chatGroupMember) {
            if (!NullChecker.m81303a(chatGroupMember) || fczVar.m156455e0().mo48971c0().m156457g0().mo134712m()) {
                return;
            }
            fczVar.m156455e0().mo48971c0().m213059O0(true);
            fczVar.m156455e0().mo48971c0().m156457g0().mo134707f();
            fczVar.m156455e0().mo48954A0().m156457g0().m128160U1();
            fczVar.m156455e0().mo48954A0().m210891C1(user, chatGroupMember);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (NullChecker.m81303a(ItemMessageLeft.this.f31174J0) && ItemMessageLeft.this.m48349X() && TEnum.equals(ItemMessageLeft.this.f31174J0.channel, "group")) {
                final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(ItemMessageLeft.this.f31174J0.owner);
                final fcz fczVar = ((MessagesAct) ItemMessageLeft.this.m48334H()).f31640f;
                if (NullChecker.m81303a(userM169430Pa)) {
                    ItemMessageLeft itemMessageLeft = ItemMessageLeft.this;
                    itemMessageLeft.f31173I0.mo67374c(itemMessageLeft.m48334H(), CoreModule.f17545c.f19645g0.m31844T6(fczVar.mo120828r3(), userM169430Pa.f56011id).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.d8q
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            ItemMessageLeft.ViewOnLongClickListenerC8499a.m48421a(fczVar, userM169430Pa, (ChatGroupMember) obj);
                        }
                    }));
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$b */
    public class C8500b implements C8524b.c {
        public C8500b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return ItemMessageLeft.this.f31174J0.owner;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return ItemMessageLeft.this.f31174J0.cid;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(ItemMessageLeft.this.f31174J0.cid);
        }
    }

    public ItemMessageLeft(Context context) {
        super(context);
        this.f31175K0 = new ViewOnLongClickListenerC8499a();
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m48405H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m48411N0(String str, fcz fczVar, ChatGroupMember chatGroupMember) {
        if (NullChecker.m81303a(chatGroupMember) && TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            lsi0.m151593w(R$string.f20908Z);
        } else {
            if (wdk.m202744d(CoreModule.m29932K().getUserById(this.f31174J0.owner))) {
                return;
            }
            Intent intentM187858e = tbk.m187858e(m48334H(), this.f31174J0.owner, str);
            intentM187858e.putExtra("from_group_id", fczVar.mo120828r3());
            m48334H().startActivity(intentM187858e);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m48412O0(ChatGroup chatGroup, Pair pair) {
        User user = (User) pair.first;
        ChatGroupMember chatGroupMember = (ChatGroupMember) pair.second;
        if (NullChecker.m81303a(chatGroupMember) && !TextUtils.isEmpty(chatGroupMember.groupMemberName())) {
            xdl0.m208344M(this.f31186V, true);
            this.f31186V.setText(tbk.m187868o(chatGroupMember.groupMemberName()));
        }
        if (NullChecker.m81303a(user) && user.isBanedOrInactivated()) {
            this.f31186V.setText(user.publicId);
        }
        if (tbk.m187872s(chatGroup)) {
            if (NullChecker.m81303a(user)) {
                qib0.f154691G.m102356Z0(this.f31177M, tbk.m187864k(user));
            } else {
                qib0.f154691G.m102354Y0(this.f31177M, c3c0.f78540I0);
            }
        } else if (!NullChecker.m81303a(user)) {
            qib0.f154691G.m102354Y0(this.f31177M, c3c0.f78540I0);
        } else if (user.isBanedOrInactivated()) {
            qib0.f154691G.m102354Y0(this.f31177M, CoreModule.f17554l.m94658i().mo158306T0());
        } else {
            this.f31189p0.setShowSVipFrame(false);
            this.f31189p0.m79694E0(false, OMSDialogPositon.p_chat_view);
            this.f31189p0.m79708t0(user);
        }
        xdl0.m208344M(this.f31186V, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m48413P0(User user) {
        if (((MessagesAct) m48334H()).m48958D2()) {
            xdl0.m208344M(this.f31178N, false);
            xdl0.m208344M(this.f31171G0, false);
            xdl0.m208344M(this.f31171G0, false);
        }
        if (user.inactivated) {
            this.f31189p0.m79713z0(c3c0.f78755h);
            return;
        }
        boolean zM48347V = m48347V();
        HeaderFrameWrapper headerFrameWrapper = this.f31189p0;
        if (zM48347V) {
            headerFrameWrapper.m79692B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m79710v0(user, rw6.m181385a(user).profileSmall());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m48414Q0(Conversation conversation, xaj0 xaj0Var) {
        xdl0.m208344M(this.f31171G0, false);
        if (TEnum.equals((ConversationType) xaj0Var.f191753c, ConversationType.soulmate)) {
            if (this.f31172H0.inactivated) {
                qib0.f154691G.m102354Y0(this.f31177M, CoreModule.m29935P().m94658i().mo158306T0());
                return;
            } else {
                this.f31177M.setImageURI(((User) xaj0Var.f191751a).soulSettings.picture.url);
                return;
            }
        }
        User user = (User) xaj0Var.f191751a;
        int iIntValue = ((Integer) ((j760) xaj0Var.f191752b).f116564a).intValue();
        if (user.inactivated) {
            qib0.f154691G.m102354Y0(this.f31177M, CoreModule.m29935P().m94658i().mo158306T0());
        } else if (m48347V()) {
            qib0.f154691G.m102331L0(this.f31177M, user.getAnonymousUrl());
        } else {
            if (!user.onlineMatchLocked() || iIntValue == 100) {
                if (!CoreModule.m29935P().m94652b().mo35107Yg() || !user.isLoveBuzz() || CoreModule.m29935P().m94652b().mo35105Wr(conversation) || iIntValue == 100) {
                    this.f31189p0.m79710v0(user, rw6.m181385a(user).profileSmall());
                } else {
                    CoreModule.m29935P().m94652b().mo35132xp(this.f31177M, rw6.m181385a(user).profileSmall(), iIntValue);
                }
            } else if (conversation.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
                this.f31189p0.m79710v0(user, rw6.m181385a(user).profileSmall());
            } else {
                CoreModule.m29935P().m94658i().mo158474y2(this.f31177M, rw6.m181385a(user).profileSmall(), iIntValue);
            }
            this.f31189p0.m79695G0(false);
        }
        xdl0.m208344M(this.f31178N, false);
        xdl0.m208344M(this.f31171G0, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m48415R0(User user) {
        if (!user.inactivated) {
            if (m48347V()) {
                qib0.f154691G.m102331L0(this.f31177M, user.getAnonymousUrl());
            } else {
                this.f31189p0.m79710v0(user, rw6.m181385a(user).profileSmall());
            }
            xdl0.m208344M(this.f31178N, false);
            xdl0.m208344M(this.f31171G0, false);
        }
        qib0.f154691G.m102354Y0(this.f31177M, CoreModule.m29935P().m94658i().mo158306T0());
        this.f31189p0.m79695G0(false);
        xdl0.m208344M(this.f31178N, false);
        xdl0.m208344M(this.f31171G0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m48416S0(j760 j760Var) {
        qib0.f154691G.m102341Q0(this.f31180P, ((User) j760Var.f116564a).m60124fp().profileSmall());
        S s = j760Var.f116565b;
        if (s == 0 || ((User) s).inactivated) {
            qib0.f154691G.m102354Y0(this.f31181Q, CoreModule.m29935P().m94658i().mo158306T0());
        } else {
            qib0.f154691G.m102341Q0(this.f31181Q, ((User) s).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m48417T0(Message message, View view) {
        if (NullChecker.m81303a(m48334H()) && m48349X()) {
            ((MessagesAct) m48334H()).m48967Q2(message);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m48418U0(BubbleInfo bubbleInfo) {
        if (NullChecker.m81303a(bubbleInfo) && m48348W(bubbleInfo)) {
            xdl0.m208360X(this.f31176L, (int) getResources().getDimension(x1c0.f189049d));
        } else {
            xdl0.m208360X(this.f31176L, (int) getResources().getDimension(x1c0.f189050e));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m48419V0(dml dmlVar, Message message, User user) {
        xdl0.m208344M(this.f31169E0, false);
    }

    /* JADX INFO: renamed from: W0 */
    public void m48420W0() {
        if (CoreModule.m29935P().m94658i().mo158216D()) {
            this.f31183S.removeAllViews();
            this.f31177M.setRotation(0.0f);
            if (NullChecker.m81303a(this.f31174J0)) {
                zxz zxzVarM220864h = zxz.m220864h();
                Message message = this.f31174J0;
                zxzVarM220864h.m220873p(message.owner, message.f56011id, this.f31183S, this.f31177M);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo48033f(User user, String str, LocalStatus localStatus) {
        super.mo48033f(user, str, localStatus);
        this.f31172H0 = user;
        this.f31189p0.m79694E0(false, OMSDialogPositon.p_chat_view);
        boolean zM48347V = m48347V();
        HeaderFrameWrapper headerFrameWrapper = this.f31189p0;
        if (zM48347V) {
            headerFrameWrapper.m79692B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m79710v0(user, rw6.m181385a(user).profileSmall());
        }
        xdl0.m208344M(this.f31178N, false);
        xdl0.m208344M(this.f31171G0, false);
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8519a).m48195b(str);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, final Message message, Message message2, Message message3) {
        super.mo48034g(dmlVar, message, message2, message3);
        setPivotX(t100.m186890d(6.0f));
        this.f31174J0 = message;
        this.f31173I0 = dmlVar;
        this.f31189p0.m79694E0(false, OMSDialogPositon.p_chat_view);
        if (CoreModule.m29935P().m94658i().mo158222E() && m48349X() && TEnum.equals(message.channel, "group")) {
            this.f31189p0.m79695G0(false);
            if (!CoreModule.m29935P().m94658i().mo158287Q()) {
                this.f31186V.setVisibility(4);
            }
            djj hierarchy = this.f31177M.getHierarchy();
            if (NullChecker.m81303a(hierarchy)) {
                hierarchy.m112049D(c3c0.f78540I0);
                hierarchy.m112079z(c3c0.f78540I0);
            }
            fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            final ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(fczVar.mo120828r3());
            if (NullChecker.m81303a(chatGroupM31920s6)) {
                dmlVar.mo67374c(m48334H(), C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169418Ma(message.owner), CoreModule.f17545c.f19645g0.m31844T6(fczVar.mo120828r3(), message.owner), new x9j() { // from class: l.u7q
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((User) obj, (ChatGroupMember) obj2);
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.x7q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f191372a.m48412O0(chatGroupM31920s6, (Pair) obj);
                    }
                }));
                return;
            }
            return;
        }
        m48420W0();
        m48419V0(this.f31173I0, message, CoreModule.f17545c.f19639e0.m169430Pa(message.owner));
        if (m48349X() && (CoreModule.m29935P().m94658i().mo158354c() || CoreModule.m29935P().m94652b().mo35107Yg())) {
            final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(message.owner);
            if (conversationM32856Xe == null) {
                dmlVar.mo67374c(m48334H(), CoreModule.f17545c.f19639e0.m169410Ka(message.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.y7q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f196723a.m48413P0((User) obj);
                    }
                }));
            } else {
                dmlVar.mo67374c(m48334H(), mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(message.owner), CoreModule.m29935P().m94652b().mo35107Yg() ? CoreModule.m29935P().m94652b().mo35127vg(conversationM32856Xe, message.owner) : CoreModule.f17545c.f19642f0.m33048mo(message.owner), CoreModule.f17545c.f19642f0.m32737Ne(message.cid).map(new w9j() { // from class: l.z7q
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Conversation) obj).subtype;
                    }
                }).distinctUntilChanged(), new y9j() { // from class: l.a8q
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((User) obj, (j760) obj2, (ConversationType) obj3);
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.b8q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f74142a.m48414Q0(conversationM32856Xe, (xaj0) obj);
                    }
                }));
            }
        } else {
            dmlVar.mo67374c(m48334H(), CoreModule.f17545c.f19639e0.m169410Ka(message.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.c8q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79780a.m48415R0((User) obj);
                }
            }));
        }
        if (CoreModule.m29935P().m94658i().mo158204B() && CoreModule.m29935P().m94658i().mo158291Q4(message.cid) && (this.f31136v instanceof ItemHeartConfession) && !hap.m130154c(message.cid)) {
            xdl0.m208344M(this.f31179O, true);
            dmlVar.mo67374c(m48334H(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19639e0.m169410Ka(message.cid), new r7q())).subscribe(mkd0.m154955G(new e30() { // from class: l.s7q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162929a.m48416S0((j760) obj);
                }
            }));
        } else {
            xdl0.m208344M(this.f31179O, false);
        }
        boolean zM181225n = ruy.m181215g().m181225n(message, message3);
        FrameLayout frameLayout = this.f31184T;
        if (zM181225n) {
            xdl0.m208344M(frameLayout, true);
            ruy.m181216l(m48334H(), this.f31185U, message.cid);
        } else {
            xdl0.m208344M(frameLayout, false);
        }
        if (TEnum.equals(message.messageType, MessageType.chat_gift) && NullChecker.m81304b(message.additionalData) && NullChecker.m81304b(message.additionalData.chatGiftInfo)) {
            CoreModule.f17545c.f19643f1.m118054R3(message.additionalData.chatGiftInfo.f20361id);
        }
        xdl0.m208329E0(this.f31184T, new View.OnClickListener() { // from class: l.t7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168761a.m48417T0(message, view);
            }
        });
        m48375x0(message);
        if (TEnum.equals(message.messageType, MessageType.state_comment) || TEnum.equals(message.messageType, MessageType.state_like)) {
            dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19676q1.m33274v3(message.isMe() ? message.cid : CoreModule.f17545c.f19639e0.m169527p9().f56011id, message.referenceMsgId).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.v7q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180413a.m48418U0((BubbleInfo) obj);
                }
            }, new e30() { // from class: l.w7q
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemMessageLeft.m48405H0((Throwable) obj);
                }
            }));
            return;
        }
        boolean zEquals = TEnum.equals(message.messageType, "literature");
        FrameLayout frameLayout2 = this.f31176L;
        if (zEquals) {
            xdl0.m208360X(frameLayout2, (int) getResources().getDimension(x1c0.f189051f));
        } else {
            xdl0.m208360X(frameLayout2, (int) getResources().getDimension(x1c0.f189048c));
        }
    }

    public String getMessageId() {
        return NullChecker.m81303a(this.f31174J0) ? this.f31174J0.f56011id : "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final String str;
        if (!m48349X()) {
            if (CoreModule.f17554l.m94658i().mo158449t4(m48334H())) {
                o6j0.m162859c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C18854a.m162878h("user_id", this.f31174J0.owner));
                CoreModule.m29935P().m94658i().mo158346a4(m48334H(), "from_greet_act", this.f31174J0.owner);
                return;
            }
            return;
        }
        final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
        o6j0.m162859c("e_chat_avatar", m48334H().pageId(), o6j0.C18854a.m162878h("click_user_id", this.f31174J0.owner), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), this.f31174J0.owner)))));
        if (NullChecker.m81303a(this.f31174J0) && TEnum.equals(this.f31174J0.channel, "group")) {
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(fczVar.mo120828r3());
            str = (NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6)) ? "chat_group_anonymity" : "chat_group";
        } else {
            str = "messages_thumbnail_left";
        }
        if (!CoreModule.m29935P().m94658i().mo158222E() || !fczVar.mo120764e4()) {
            fczVar.m120854w6(str, this.f31174J0.owner);
            return;
        }
        ChatGroup chatGroupM31920s7 = CoreModule.f17545c.f19645g0.m31920s6(fczVar.mo120828r3());
        if (NullChecker.m81303a(chatGroupM31920s7) && TEnum.equals(chatGroupM31920s7.status, ChatGroupStatus.disbanded)) {
            lsi0.m151593w(R$string.f20989i0);
            return;
        }
        Conversation conversationM120788j3 = fczVar.m120788j3();
        if (NullChecker.m81303a(conversationM120788j3) && TEnum.equals(conversationM120788j3.status, "blocked")) {
            lsi0.m151593w(R$string.f20908Z);
        } else {
            m48334H().duringCreated(CoreModule.f17545c.f19645g0.m31844T6(fczVar.mo120828r3(), CoreModule.m29931H().userId())).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.q7q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153064a.m48411N0(str, fczVar, (ChatGroupMember) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31176L = (FrameLayout) findViewById(y4c0.f196231u3);
        HeaderFrameWrapper headerFrameWrapper = (HeaderFrameWrapper) findViewById(y4c0.f196224t3);
        this.f31189p0 = headerFrameWrapper;
        this.f31177M = headerFrameWrapper.get_pic();
        this.f31178N = (VImage) findViewById(y4c0.f196212r5);
        this.f31183S = (FrameLayout) findViewById(y4c0.f195940B4);
        this.f31171G0 = (GradientBgButton) findViewById(y4c0.f196104c2);
        this.f31186V = (VText) findViewById(y4c0.f196198p5);
        this.f31187W = (VText) findViewById(y4c0.f196040S0);
        this.f31188k0 = (VText) findViewById(y4c0.f196070X0);
        this.f31169E0 = (VLinear) findViewById(y4c0.f196090a2);
        this.f31170F0 = (VText) findViewById(y4c0.f196097b2);
        if (CoreModule.m29935P().m94658i().mo158216D() && m48341O()) {
            C8524b.m49067s(this.f31177M, new C8500b(), this, this.f31175K0, null);
        } else {
            this.f31177M.setOnLongClickListener(this.f31175K0);
        }
        xdl0.m208329E0(this.f31177M, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(y4c0.f195981I1);
        this.f31179O = frameLayout;
        this.f31180P = (VDraweeView) frameLayout.findViewById(y4c0.f196144i0);
        this.f31181Q = (VDraweeView) this.f31179O.findViewById(y4c0.f196151j0);
        this.f31182R = (VText) this.f31179O.findViewById(y4c0.f196158k0);
        this.f31184T = (FrameLayout) findViewById(y4c0.f195975H1);
        this.f31185U = (VText) findViewById(y4c0.f196255y);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31187W.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31185U.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31188k0.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31182R.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31175K0 = new ViewOnLongClickListenerC8499a();
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31175K0 = new ViewOnLongClickListenerC8499a();
    }
}
