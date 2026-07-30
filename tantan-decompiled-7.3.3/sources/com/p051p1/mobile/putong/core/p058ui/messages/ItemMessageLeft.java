package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageLeft;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.clz;
import p153l.eac0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.hcp;
import p153l.ibc0;
import p153l.jek;
import p153l.mgk;
import p153l.o1j0;
import p153l.o3z;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r9q;
import p153l.rcj;
import p153l.scj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.ux6;
import p153l.w600;
import p153l.wlj;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageLeft extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: E0 */
    public VLinear f32017E0;

    /* JADX INFO: renamed from: F0 */
    public VText f32018F0;

    /* JADX INFO: renamed from: G0 */
    public GradientBgButton f32019G0;

    /* JADX INFO: renamed from: H0 */
    public User f32020H0;

    /* JADX INFO: renamed from: I0 */
    public pol f32021I0;

    /* JADX INFO: renamed from: J0 */
    public Message f32022J0;

    /* JADX INFO: renamed from: K0 */
    public View.OnLongClickListener f32023K0;

    /* JADX INFO: renamed from: L */
    public FrameLayout f32024L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f32025M;

    /* JADX INFO: renamed from: N */
    public VImage f32026N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f32027O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f32028P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f32029Q;

    /* JADX INFO: renamed from: R */
    public VText f32030R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f32031S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f32032T;

    /* JADX INFO: renamed from: U */
    public VText f32033U;

    /* JADX INFO: renamed from: V */
    public VText f32034V;

    /* JADX INFO: renamed from: W */
    public VText f32035W;

    /* JADX INFO: renamed from: k0 */
    public VText f32036k0;

    /* JADX INFO: renamed from: p0 */
    public HeaderFrameWrapper f32037p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$a */
    public class ViewOnLongClickListenerC8662a implements View.OnLongClickListener {
        public ViewOnLongClickListenerC8662a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m49604a(clz clzVar, User user, ChatGroupMember chatGroupMember) {
            if (!NullChecker.m82486a(chatGroupMember) || clzVar.m143372e0().mo50155d0().m143374g0().mo125467m()) {
                return;
            }
            clzVar.m143372e0().mo50155d0().m201104O0(true);
            clzVar.m143372e0().mo50155d0().m143374g0().mo125462f();
            clzVar.m143372e0().mo50138B0().m143374g0().m113988U1();
            clzVar.m143372e0().mo50138B0().m194169C1(user, chatGroupMember);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (NullChecker.m82486a(ItemMessageLeft.this.f32022J0) && ItemMessageLeft.this.m49532X() && TEnum.equals(ItemMessageLeft.this.f32022J0.channel, "group")) {
                final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(ItemMessageLeft.this.f32022J0.owner);
                final clz clzVar = ((MessagesAct) ItemMessageLeft.this.m49517H()).f32488f;
                if (NullChecker.m82486a(userM116503Pa)) {
                    ItemMessageLeft itemMessageLeft = ItemMessageLeft.this;
                    itemMessageLeft.f32021I0.mo68557c(itemMessageLeft.m49517H(), CoreModule.f18264c.f20387g0.m32847T6(clzVar.mo111034r3(), userM116503Pa.f56859id).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.daq
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ItemMessageLeft.ViewOnLongClickListenerC8662a.m49604a(clzVar, userM116503Pa, (ChatGroupMember) obj);
                        }
                    }));
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageLeft$b */
    public class C8663b implements C8687b.c {
        public C8663b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return ItemMessageLeft.this.f32022J0.owner;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return ItemMessageLeft.this.f32022J0.cid;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(ItemMessageLeft.this.f32022J0.cid);
        }
    }

    public ItemMessageLeft(Context context) {
        super(context);
        this.f32023K0 = new ViewOnLongClickListenerC8662a();
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m49588H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m49594N0(String str, clz clzVar, ChatGroupMember chatGroupMember) {
        if (NullChecker.m82486a(chatGroupMember) && TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            o1j0.m165649w(R$string.f21650Z);
        } else {
            if (mgk.m158353d(CoreModule.m30930K().getUserById(this.f32022J0.owner))) {
                return;
            }
            Intent intentM144573e = jek.m144573e(m49517H(), this.f32022J0.owner, str);
            intentM144573e.putExtra("from_group_id", clzVar.mo111034r3());
            m49517H().startActivity(intentM144573e);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m49595O0(ChatGroup chatGroup, Pair pair) {
        User user = (User) pair.first;
        ChatGroupMember chatGroupMember = (ChatGroupMember) pair.second;
        if (NullChecker.m82486a(chatGroupMember) && !TextUtils.isEmpty(chatGroupMember.groupMemberName())) {
            bnl0.m105524M(this.f32034V, true);
            this.f32034V.setText(jek.m144583o(chatGroupMember.groupMemberName()));
        }
        if (NullChecker.m82486a(user) && user.isBanedOrInactivated()) {
            this.f32034V.setText(user.publicId);
        }
        if (jek.m144587s(chatGroup)) {
            if (NullChecker.m82486a(user)) {
                uqb0.f180374G.m127140Z0(this.f32025M, jek.m144579k(user));
            } else {
                uqb0.f180374G.m127138Y0(this.f32025M, ibc0.f113815I0);
            }
        } else if (!NullChecker.m82486a(user)) {
            uqb0.f180374G.m127138Y0(this.f32025M, ibc0.f113815I0);
        } else if (user.isBanedOrInactivated()) {
            uqb0.f180374G.m127138Y0(this.f32025M, CoreModule.f18273l.m143412i().mo180398T0());
        } else {
            this.f32037p0.setShowSVipFrame(false);
            this.f32037p0.m80877E0(false, OMSDialogPositon.p_chat_view);
            this.f32037p0.m80891t0(user);
        }
        bnl0.m105524M(this.f32034V, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m49596P0(User user) {
        if (((MessagesAct) m49517H()).m50142E2()) {
            bnl0.m105524M(this.f32026N, false);
            bnl0.m105524M(this.f32019G0, false);
            bnl0.m105524M(this.f32019G0, false);
        }
        if (user.inactivated) {
            this.f32037p0.m80896z0(ibc0.f114030h);
            return;
        }
        boolean zM49530V = m49530V();
        HeaderFrameWrapper headerFrameWrapper = this.f32037p0;
        if (zM49530V) {
            headerFrameWrapper.m80875B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m80893v0(user, ux6.m198403a(user).profileSmall());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m49597Q0(Conversation conversation, bkj0 bkj0Var) {
        bnl0.m105524M(this.f32019G0, false);
        if (TEnum.equals((ConversationType) bkj0Var.f77083c, ConversationType.soulmate)) {
            if (this.f32020H0.inactivated) {
                uqb0.f180374G.m127138Y0(this.f32025M, CoreModule.m30933P().m143412i().mo180398T0());
                return;
            } else {
                this.f32025M.setImageURI(((User) bkj0Var.f77081a).soulSettings.picture.url);
                return;
            }
        }
        User user = (User) bkj0Var.f77081a;
        int iIntValue = ((Integer) ((pf60) bkj0Var.f77082b).f152156a).intValue();
        if (user.inactivated) {
            uqb0.f180374G.m127138Y0(this.f32025M, CoreModule.m30933P().m143412i().mo180398T0());
        } else if (m49530V()) {
            uqb0.f180374G.m127115L0(this.f32025M, user.getAnonymousUrl());
        } else {
            if (!user.onlineMatchLocked() || iIntValue == 100) {
                if (!CoreModule.m30933P().m143406b().mo36110Yg() || !user.isLoveBuzz() || CoreModule.m30933P().m143406b().mo36108Wr(conversation) || iIntValue == 100) {
                    this.f32037p0.m80893v0(user, ux6.m198403a(user).profileSmall());
                } else {
                    CoreModule.m30933P().m143406b().mo36135xp(this.f32025M, ux6.m198403a(user).profileSmall(), iIntValue);
                }
            } else if (conversation.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
                this.f32037p0.m80893v0(user, ux6.m198403a(user).profileSmall());
            } else {
                CoreModule.m30933P().m143412i().mo180566y2(this.f32025M, ux6.m198403a(user).profileSmall(), iIntValue);
            }
            this.f32037p0.m80878G0(false);
        }
        bnl0.m105524M(this.f32026N, false);
        bnl0.m105524M(this.f32019G0, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m49598R0(User user) {
        if (!user.inactivated) {
            if (m49530V()) {
                uqb0.f180374G.m127115L0(this.f32025M, user.getAnonymousUrl());
            } else {
                this.f32037p0.m80893v0(user, ux6.m198403a(user).profileSmall());
            }
            bnl0.m105524M(this.f32026N, false);
            bnl0.m105524M(this.f32019G0, false);
        }
        uqb0.f180374G.m127138Y0(this.f32025M, CoreModule.m30933P().m143412i().mo180398T0());
        this.f32037p0.m80878G0(false);
        bnl0.m105524M(this.f32026N, false);
        bnl0.m105524M(this.f32019G0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m49599S0(pf60 pf60Var) {
        uqb0.f180374G.m127125Q0(this.f32028P, ((User) pf60Var.f152156a).m61308fp().profileSmall());
        S s = pf60Var.f152157b;
        if (s == 0 || ((User) s).inactivated) {
            uqb0.f180374G.m127138Y0(this.f32029Q, CoreModule.m30933P().m143412i().mo180398T0());
        } else {
            uqb0.f180374G.m127125Q0(this.f32029Q, ((User) s).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m49600T0(Message message, View view) {
        if (NullChecker.m82486a(m49517H()) && m49532X()) {
            ((MessagesAct) m49517H()).m50151R2(message);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m49601U0(BubbleInfo bubbleInfo) {
        if (NullChecker.m82486a(bubbleInfo) && m49531W(bubbleInfo)) {
            bnl0.m105540X(this.f32024L, (int) getResources().getDimension(eac0.f92756d));
        } else {
            bnl0.m105540X(this.f32024L, (int) getResources().getDimension(eac0.f92757e));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m49602V0(pol polVar, Message message, User user) {
        bnl0.m105524M(this.f32017E0, false);
    }

    /* JADX INFO: renamed from: W0 */
    public void m49603W0() {
        if (CoreModule.m30933P().m143412i().mo180308D()) {
            this.f32031S.removeAllViews();
            this.f32025M.setRotation(0.0f);
            if (NullChecker.m82486a(this.f32022J0)) {
                w600 w600VarM205009h = w600.m205009h();
                Message message = this.f32022J0;
                w600VarM205009h.m205018p(message.owner, message.f56859id, this.f32031S, this.f32025M);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo49216f(User user, String str, LocalStatus localStatus) {
        super.mo49216f(user, str, localStatus);
        this.f32020H0 = user;
        this.f32037p0.m80877E0(false, OMSDialogPositon.p_chat_view);
        boolean zM49530V = m49530V();
        HeaderFrameWrapper headerFrameWrapper = this.f32037p0;
        if (zM49530V) {
            headerFrameWrapper.m80875B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m80893v0(user, ux6.m198403a(user).profileSmall());
        }
        bnl0.m105524M(this.f32026N, false);
        bnl0.m105524M(this.f32019G0, false);
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8682a).m49378b(str);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, final Message message, Message message2, Message message3) {
        super.mo49217g(polVar, message, message2, message3);
        setPivotX(qa00.m175859d(6.0f));
        this.f32022J0 = message;
        this.f32021I0 = polVar;
        this.f32037p0.m80877E0(false, OMSDialogPositon.p_chat_view);
        if (CoreModule.m30933P().m143412i().mo180314E() && m49532X() && TEnum.equals(message.channel, "group")) {
            this.f32037p0.m80878G0(false);
            if (!CoreModule.m30933P().m143412i().mo180379Q()) {
                this.f32034V.setVisibility(4);
            }
            wlj hierarchy = this.f32025M.getHierarchy();
            if (NullChecker.m82486a(hierarchy)) {
                hierarchy.m207041D(ibc0.f113815I0);
                hierarchy.m207065z(ibc0.f113815I0);
            }
            clz clzVar = ((MessagesAct) m49517H()).f32488f;
            final ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(clzVar.mo111034r3());
            if (NullChecker.m82486a(chatGroupM32923s6)) {
                polVar.mo68557c(m49517H(), C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116491Ma(message.owner), CoreModule.f18264c.f20387g0.m32847T6(clzVar.mo111034r3(), message.owner), new rcj() { // from class: l.u9q
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((User) obj, (ChatGroupMember) obj2);
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.x9q
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f192954a.m49595O0(chatGroupM32923s6, (Pair) obj);
                    }
                }));
                return;
            }
            return;
        }
        m49603W0();
        m49602V0(this.f32021I0, message, CoreModule.f18264c.f20381e0.m116503Pa(message.owner));
        if (m49532X() && (CoreModule.m30933P().m143412i().mo180446c() || CoreModule.m30933P().m143406b().mo36110Yg())) {
            final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(message.owner);
            if (conversationM33859Xe == null) {
                polVar.mo68557c(m49517H(), CoreModule.f18264c.f20381e0.m116483Ka(message.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.y9q
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f198116a.m49596P0((User) obj);
                    }
                }));
            } else {
                polVar.mo68557c(m49517H(), psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(message.owner), CoreModule.m30933P().m143406b().mo36110Yg() ? CoreModule.m30933P().m143406b().mo36130vg(conversationM33859Xe, message.owner) : CoreModule.f18264c.f20384f0.m34051mo(message.owner), CoreModule.f18264c.f20384f0.m33740Ne(message.cid).map(new qcj() { // from class: l.z9q
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Conversation) obj).subtype;
                    }
                }).distinctUntilChanged(), new scj() { // from class: l.aaq
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return new bkj0((User) obj, (pf60) obj2, (ConversationType) obj3);
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.baq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f75726a.m49597Q0(conversationM33859Xe, (bkj0) obj);
                    }
                }));
            }
        } else {
            polVar.mo68557c(m49517H(), CoreModule.f18264c.f20381e0.m116483Ka(message.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.caq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80611a.m49598R0((User) obj);
                }
            }));
        }
        if (CoreModule.m30933P().m143412i().mo180296B() && CoreModule.m30933P().m143412i().mo180383Q4(message.cid) && (this.f31984v instanceof ItemHeartConfession) && !hcp.m134490c(message.cid)) {
            bnl0.m105524M(this.f32027O, true);
            polVar.mo68557c(m49517H(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20381e0.m116483Ka(message.cid), new r9q())).subscribe(psd0.m173596G(new y20() { // from class: l.s9q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166964a.m49599S0((pf60) obj);
                }
            }));
        } else {
            bnl0.m105524M(this.f32027O, false);
        }
        boolean zM165908n = o3z.m165898g().m165908n(message, message3);
        FrameLayout frameLayout = this.f32032T;
        if (zM165908n) {
            bnl0.m105524M(frameLayout, true);
            o3z.m165899l(m49517H(), this.f32033U, message.cid);
        } else {
            bnl0.m105524M(frameLayout, false);
        }
        if (TEnum.equals(message.messageType, MessageType.chat_gift) && NullChecker.m82487b(message.additionalData) && NullChecker.m82487b(message.additionalData.chatGiftInfo)) {
            CoreModule.f18264c.f20385f1.m155892R3(message.additionalData.chatGiftInfo.f21103id);
        }
        bnl0.m105509E0(this.f32032T, new View.OnClickListener() { // from class: l.t9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172655a.m49600T0(message, view);
            }
        });
        m49558x0(message);
        if (TEnum.equals(message.messageType, MessageType.state_comment) || TEnum.equals(message.messageType, MessageType.state_like)) {
            polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20418q1.m34277v3(message.isMe() ? message.cid : CoreModule.f18264c.f20381e0.m116600p9().f56859id, message.referenceMsgId).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.v9q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183015a.m49601U0((BubbleInfo) obj);
                }
            }, new y20() { // from class: l.w9q
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemMessageLeft.m49588H0((Throwable) obj);
                }
            }));
            return;
        }
        boolean zEquals = TEnum.equals(message.messageType, "literature");
        FrameLayout frameLayout2 = this.f32024L;
        if (zEquals) {
            bnl0.m105540X(frameLayout2, (int) getResources().getDimension(eac0.f92758f));
        } else {
            bnl0.m105540X(frameLayout2, (int) getResources().getDimension(eac0.f92755c));
        }
    }

    public String getMessageId() {
        return NullChecker.m82486a(this.f32022J0) ? this.f32022J0.f56859id : "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final String str;
        if (!m49532X()) {
            if (CoreModule.f18273l.m143412i().mo180541t4(m49517H())) {
                sfj0.m185596c("e_kankan_chat_head", "p_kankan_chat_popup", sfj0.C20032a.m185615h("user_id", this.f32022J0.owner));
                CoreModule.m30933P().m143412i().mo180438a4(m49517H(), "from_greet_act", this.f32022J0.owner);
                return;
            }
            return;
        }
        final clz clzVar = ((MessagesAct) m49517H()).f32488f;
        sfj0.m185596c("e_chat_avatar", m49517H().pageId(), sfj0.C20032a.m185615h("click_user_id", this.f32022J0.owner), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), this.f32022J0.owner)))));
        if (NullChecker.m82486a(this.f32022J0) && TEnum.equals(this.f32022J0.channel, "group")) {
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(clzVar.mo111034r3());
            str = (NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6)) ? "chat_group_anonymity" : "chat_group";
        } else {
            str = "messages_thumbnail_left";
        }
        if (!CoreModule.m30933P().m143412i().mo180314E() || !clzVar.mo110970e4()) {
            clzVar.m111060w6(str, this.f32022J0.owner);
            return;
        }
        ChatGroup chatGroupM32923s7 = CoreModule.f18264c.f20387g0.m32923s6(clzVar.mo111034r3());
        if (NullChecker.m82486a(chatGroupM32923s7) && TEnum.equals(chatGroupM32923s7.status, ChatGroupStatus.disbanded)) {
            o1j0.m165649w(R$string.f21731i0);
            return;
        }
        Conversation conversationM110994j3 = clzVar.m110994j3();
        if (NullChecker.m82486a(conversationM110994j3) && TEnum.equals(conversationM110994j3.status, "blocked")) {
            o1j0.m165649w(R$string.f21650Z);
        } else {
            m49517H().duringCreated(CoreModule.f18264c.f20387g0.m32847T6(clzVar.mo111034r3(), CoreModule.m30929H().userId())).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.q9q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156253a.m49594N0(str, clzVar, (ChatGroupMember) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32024L = (FrameLayout) findViewById(edc0.f93466u3);
        HeaderFrameWrapper headerFrameWrapper = (HeaderFrameWrapper) findViewById(edc0.f93459t3);
        this.f32037p0 = headerFrameWrapper;
        this.f32025M = headerFrameWrapper.get_pic();
        this.f32026N = (VImage) findViewById(edc0.f93447r5);
        this.f32031S = (FrameLayout) findViewById(edc0.f93175B4);
        this.f32019G0 = (GradientBgButton) findViewById(edc0.f93339c2);
        this.f32034V = (VText) findViewById(edc0.f93433p5);
        this.f32035W = (VText) findViewById(edc0.f93275S0);
        this.f32036k0 = (VText) findViewById(edc0.f93305X0);
        this.f32017E0 = (VLinear) findViewById(edc0.f93325a2);
        this.f32018F0 = (VText) findViewById(edc0.f93332b2);
        if (CoreModule.m30933P().m143412i().mo180308D() && m49524O()) {
            C8687b.m50250s(this.f32025M, new C8663b(), this, this.f32023K0, null);
        } else {
            this.f32025M.setOnLongClickListener(this.f32023K0);
        }
        bnl0.m105509E0(this.f32025M, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(edc0.f93216I1);
        this.f32027O = frameLayout;
        this.f32028P = (VDraweeView) frameLayout.findViewById(edc0.f93379i0);
        this.f32029Q = (VDraweeView) this.f32027O.findViewById(edc0.f93386j0);
        this.f32030R = (VText) this.f32027O.findViewById(edc0.f93393k0);
        this.f32032T = (FrameLayout) findViewById(edc0.f93210H1);
        this.f32033U = (VText) findViewById(edc0.f93490y);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32035W.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32033U.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32036k0.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32030R.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32023K0 = new ViewOnLongClickListenerC8662a();
    }

    public ItemMessageLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32023K0 = new ViewOnLongClickListenerC8662a();
    }
}
