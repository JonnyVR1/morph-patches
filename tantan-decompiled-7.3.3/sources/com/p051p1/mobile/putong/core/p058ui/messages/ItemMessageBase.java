package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageSentFrom;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.RecallConfig;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase;
import com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.view.AiTranslateView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.ItemLoveLetterMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MenuCustomView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLinearMaxWidth;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VCheckBox;
import p151v.VListCell;
import p151v.VRelative;
import p151v.VText;
import p153l.azy;
import p153l.bnl0;
import p153l.br5;
import p153l.clz;
import p153l.d3z;
import p153l.dox;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.hh7;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jek;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.p9r;
import p153l.pn50;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.rum0;
import p153l.ruy;
import p153l.sb8;
import p153l.sfj0;
import p153l.tcz;
import p153l.uxj0;
import p153l.vxd0;
import p153l.w1e;
import p153l.w30;
import p153l.x6q;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageBase extends ItemBase implements View.OnLongClickListener, x6q, InterfaceC8682a.a {

    /* JADX INFO: renamed from: K */
    public static int f31973K;

    /* JADX INFO: renamed from: A */
    public String f31974A;

    /* JADX INFO: renamed from: B */
    public TextView f31975B;

    /* JADX INFO: renamed from: C */
    public AudioTranslationView f31976C;

    /* JADX INFO: renamed from: D */
    public AiTranslateView f31977D;

    /* JADX INFO: renamed from: E */
    public Drawable f31978E;

    /* JADX INFO: renamed from: F */
    public ViewStub f31979F;

    /* JADX INFO: renamed from: G */
    public PopupWindow f31980G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f31981H;

    /* JADX INFO: renamed from: I */
    public VRelative f31982I;

    /* JADX INFO: renamed from: J */
    public Message f31983J;

    /* JADX INFO: renamed from: v */
    public InterfaceC8682a f31984v;

    /* JADX INFO: renamed from: w */
    public MessageLinearMaxWidth f31985w;

    /* JADX INFO: renamed from: x */
    public VText f31986x;

    /* JADX INFO: renamed from: y */
    public VText f31987y;

    /* JADX INFO: renamed from: z */
    public String f31988z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$a */
    public class RunnableC8659a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f31989a;

        public RunnableC8659a(clz clzVar) {
            this.f31989a = clzVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31989a.m110842C3(ItemMessageBase.this.f31667a.f56859id);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$b */
    public class C8660b extends pn50 {
        public C8660b() {
        }

        @Override // p153l.pn50
        /* JADX INFO: renamed from: b */
        public void mo49560b(int i, int i2) {
            super.mo49560b(i, i2);
            ItemMessageBase.this.f31980G.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$c */
    public class C8661c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pn50 f31992a;

        public C8661c(pn50 pn50Var) {
            this.f31992a = pn50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ((MessagesAct) ItemMessageBase.this.m49517H()).f32488f.m111048t7().f160408n1.mo50793B(this.f31992a);
        }
    }

    public ItemMessageBase(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: R */
    public static ItemMessageBase m49494R(View view) {
        return view.getParent() instanceof ItemMessageBase ? (ItemMessageBase) view.getParent() : m49494R((View) view.getParent());
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m49495Y(Context context) {
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        return CoreModule.f18264c.f20384f0.m34004jg(((MessagesAct) context).f32488f.mo111034r3(), false);
    }

    @Nullable
    private RecallConfig getRecallConfig() {
        try {
            return (RecallConfig) RemoteConfig.m80481x().m80516v("recall_config", RecallConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    private void setWindowBackground(float f) {
        WindowManager.LayoutParams attributes = m49517H().getWindow().getAttributes();
        attributes.alpha = f;
        m49517H().getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m49507t(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m49511x(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private long m49513y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m49515A0(View view, List<ovb0<String, Runnable, Integer, Void>> list, boolean z) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow(menuCustomView, -2, -2);
        this.f31980G = popupWindow;
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m49554t0(this.f31980G.getWidth()), m49554t0(this.f31980G.getHeight()));
        this.f31980G.setOutsideTouchable(true);
        this.f31980G.setBackgroundDrawable(new BitmapDrawable());
        int height = 10;
        if (z) {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
            height = ((-menuCustomView.getMeasuredHeight()) - view.getHeight()) - 10;
        } else {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
        }
        this.f31980G.showAsDropDown(view, width, height, 8388611);
        C8660b c8660b = new C8660b();
        this.f31980G.setOnDismissListener(new C8661c(c8660b));
        ((MessagesAct) m49517H()).f32488f.m111048t7().f160408n1.mo50800n(c8660b);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m49516B0() {
        RecallConfig recallConfig = getRecallConfig();
        if (recallConfig == null || !recallConfig.enable) {
            return;
        }
        if (!CoreModule.f18264c.f20381e0.f89122S3.get().booleanValue()) {
            CoreModule.f18264c.f20381e0.f89122S3.put(Boolean.TRUE);
        }
        if (CoreModule.f18264c.f20381e0.f89130T3.get().intValue() < 5) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89130T3;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            o1j0.m165651y("仅支持撤回2分钟内发出的消息");
        }
    }

    /* JADX INFO: renamed from: H */
    public Act m49517H() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m49518I(List<ovb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f18273l.m143412i().mo180472g1() && m49532X() && this.f31667a.audio() != null) {
            final clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) m49517H()).mo50158l();
            if (clzVarMo50158l.m111025p4(this.f31667a.f56859id) || this.f31667a.isLocal()) {
                return;
            }
            if (!clzVarMo50158l.m110945Z3(this.f31667a) || !clzVarMo50158l.m111015n4(this.f31667a.f56859id)) {
                sfj0.m185601h("e_chat_message_convert_to_text_hold_press_button", clzVarMo50158l.pageId(), new sfj0.C20032a[0]);
                list.add(jyb.m147495Z(m49517H().string(R$string.f21670b2), new Runnable() { // from class: l.c9q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80513a.m49533Z(clzVarMo50158l);
                    }
                }, Integer.valueOf(ibc0.f114099o5), null));
            }
            if (clzVarMo50158l.m111015n4(this.f31667a.f56859id)) {
                list.add(jyb.m147495Z(m49517H().string(R$string.f21661a2), new RunnableC8659a(clzVarMo50158l), Integer.valueOf(ibc0.f114090n5), null));
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m49519J(List<ovb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f18273l.m143412i().mo180314E() && m49532X() && NullChecker.m82486a(this.f31667a) && TEnum.equals(this.f31667a.channel, "group") && !this.f31667a.isMe() && TEnum.equals(this.f31667a.status(), "normal")) {
            final clz clzVar = ((MessagesAct) m49517H()).f32488f;
            final ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(clzVar.mo111034r3());
            String str = this.f31667a.owner;
            final ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(clzVar.mo111034r3(), str);
            if (TEnum.equals(chatGroupMemberM32858W8.status, "default") && m49527S(str, chatGroupM32923s6, chatGroupMemberM32858W8)) {
                final String strM144583o = !TextUtils.isEmpty(chatGroupMemberM32858W8.groupMemberName()) ? jek.m144583o(chatGroupMemberM32858W8.groupMemberName()) : "";
                final boolean z = !chatGroupMemberM32858W8.silence.enable || ((double) pzi0.m174454o()) >= chatGroupMemberM32858W8.silence.until;
                list.add(jyb.m147495Z(z ? CoreModule.f18263b.getString(R$string.f21546M) : CoreModule.f18263b.getString(R$string.f21522J), new Runnable() { // from class: l.d9q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85803a.m49537c0(clzVar, z, chatGroupMemberM32858W8, strM144583o, chatGroupM32923s6);
                    }
                }, Integer.valueOf(ibc0.f114113q1), null));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m49520K(List<ovb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.m30933P().m143412i().mo180314E() && NullChecker.m82486a(this.f31667a) && m49532X() && TEnum.equals(this.f31667a.channel, "group") && TEnum.equals(this.f31667a.status(), "normal")) {
            final clz clzVar = ((MessagesAct) m49517H()).f32488f;
            list.add(jyb.m147495Z(getResources().getString(R$string.f21565O2), new Runnable() { // from class: l.m8q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135273a.m49539e0(clzVar);
                }
            }, Integer.valueOf(ibc0.f114140t1), null));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m49521L(List<ovb0<String, Runnable, Integer, Void>> list) {
        if (!m49528T(this.f31667a, true) && this.f31667a.isMe() && TEnum.equals(this.f31667a.status(), "normal")) {
            Message message = this.f31667a;
            if (message.likeOfMoment != null || message.messageType().isUnknownType()) {
                return;
            }
            if ((!this.f31667a.isGroupMessage() && CoreModule.f18264c.f20381e0.m116503Pa(this.f31667a.cid).unilateralBlock()) || TEnum.equals(this.f31667a.messageType, "reminder") || TEnum.equals(this.f31667a.messageType, MessageType.group_invitation) || TEnum.equals(this.f31667a.messageType(), MessageType.picture_text_deeplink)) {
                return;
            }
            if ((CoreModule.m30933P().m143406b().mo36110Yg() && !NullChecker.m82486a(this.f31983J) && CoreModule.m30933P().m143406b().mo36127sc(CoreModule.f18264c.f20384f0.m33859Xe(this.f31667a.cid))) || TEnum.equals(this.f31667a.messageType, MessageType.moment_user_state) || br5.m106035f(CoreModule.f18264c.f20384f0.m33859Xe(this.f31667a.cid))) {
                return;
            }
            list.add(jyb.m147495Z(getResources().getString(R$string.f21535K4), new Runnable() { // from class: l.x8q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192865a.m49543i0();
                }
            }, Integer.valueOf(ibc0.f114149u1), null));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m49522M(List<ovb0<String, Runnable, Integer, Void>> list) {
        Act actM49517H = m49517H();
        if (m49532X()) {
            d3z d3zVarM143374g0 = ((MessagesAct) actM49517H).mo50138B0().m143374g0();
            azy azyVarM114043u0 = d3zVarM143374g0.m114043u0();
            if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                return;
            }
            MessageBar messageBarM114041t0 = d3zVarM143374g0.m114041t0();
            if (NullChecker.m82486a(messageBarM114041t0) && messageBarM114041t0.getVisibility() == 8) {
                return;
            }
            int i = ibc0.f114158v1;
            if (NullChecker.m82486a(this.f31667a) && m49532X() && TEnum.equals(this.f31667a.channel, "group") && !this.f31667a.isLocal()) {
                if (TEnum.equals(this.f31667a.messageType, "text") || TEnum.equals(this.f31667a.messageType, "sticker")) {
                    final clz clzVar = ((MessagesAct) m49517H()).f32488f;
                    list.add(jyb.m147495Z(getResources().getString(R$string.f21605T2), new Runnable() { // from class: l.b9q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f75602a.m49544j0(clzVar);
                        }
                    }, Integer.valueOf(i), null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m49523N(List<ovb0<String, Runnable, Integer, Void>> list) {
        AiTranslateView aiTranslateView;
        Message message = this.f31667a;
        if (message != null && (this.f31984v instanceof ItemText) && (aiTranslateView = this.f31977D) != null && aiTranslateView.m50957Y(message)) {
            if ((m49517H() instanceof MessagesAct) && User.isTeamAccount(((MessagesAct) m49517H()).f32488f.mo111034r3())) {
                return;
            }
            list.add(0, jyb.m147495Z(getResources().getString(R$string.f21614U3), new Runnable() { // from class: l.f9q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97905a.m49547m0();
                }
            }, Integer.valueOf(ibc0.f114185y1), null));
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m49524O() {
        if (m49517H() instanceof MessagesAct) {
            return ((MessagesAct) m49517H()).mo50158l().mo110925V2();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final void m49525P(Message message) {
        CoreModule.f18264c.f20384f0.m33789Rf(message.cid, jyb.m147507f0(message)).subscribe(psd0.m173597H(new y20() { // from class: l.u8q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemMessageBase.m49507t((uxj0) obj);
            }
        }, new y20() { // from class: l.v8q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemMessageBase.m49511x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m49526Q(View view, int i) {
        if (!m49532X()) {
            return false;
        }
        MessageBar messageBarM114041t0 = ((MessagesAct) m49517H()).f32488f.m143372e0().mo50138B0().m143374g0().m114041t0();
        int iM175859d = qa00.m175859d(30.0f) + (qa00.m175859d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarM114041t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iM175859d2 = iArr2[1] - qa00.m175859d(40.0f);
        boolean z = iM175859d2 > height;
        if (!z || iM175859d2 >= iM175859d) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m49527S(String str, ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        if (chatGroup == null || chatGroupMember == null) {
            return false;
        }
        return (!jyb.m147479J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.m30929H().userId()) && !chatGroup.adminUserIds.contains(str) && !TextUtils.equals(str, chatGroup.ownerUserId)) || TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: T */
    public final boolean m49528T(Message message, boolean z) {
        if (z && !CoreModule.f18264c.f20381e0.f89122S3.get().booleanValue()) {
            return false;
        }
        RecallConfig recallConfig = getRecallConfig();
        if (NullChecker.m82486a(recallConfig)) {
            int i = recallConfig.minutes;
            if (recallConfig.enable && i > 0 && message.createdTime + (((long) (i * 1000)) * 60) < pzi0.m174454o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void mo49529U(int i, View view, int i2, boolean z) {
        View viewInflate = p9r.m171370a(getContext()).inflate(i, (ViewGroup) this.f31985w, false);
        this.f31673g = viewInflate;
        this.f31985w.addView(viewInflate, 0);
        InterfaceC8682a interfaceC8682a = (InterfaceC8682a) this.f31673g.findViewById(edc0.f93316Z);
        this.f31984v = interfaceC8682a;
        if (!z && (interfaceC8682a instanceof ItemAudio)) {
            this.f31673g = (View) interfaceC8682a;
        }
        interfaceC8682a.mo43404m(i2, z, this);
        this.f31978E = this.f31673g.getBackground();
    }

    /* JADX INFO: renamed from: V */
    public boolean m49530V() {
        if (CoreModule.m30933P().m143412i().mo180541t4(m49517H())) {
            return CoreModule.m30933P().m143412i().mo180299B2(m49517H());
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean m49531W(BubbleInfo bubbleInfo) {
        return NullChecker.m82486a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f39578id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis()) && !TextUtils.isEmpty(bubbleInfo.value);
    }

    /* JADX INFO: renamed from: X */
    public boolean m49532X() {
        return m49517H() instanceof MessagesAct;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m49533Z(clz clzVar) {
        sfj0.m185596c("e_chat_message_convert_to_text_hold_press_button", clzVar.pageId(), new sfj0.C20032a[0]);
        clzVar.m111028p7(this.f31667a, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a.a
    /* JADX INFO: renamed from: a */
    public void mo49534a() {
        performLongClick();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m49535a0(ChatGroup chatGroup) {
        i4g0.m138523u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("user_id", this.f31667a.owner), jyb.m147494Y("is_confirm", 2));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m49536b0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z) {
        i4g0.m138523u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("user_id", this.f31667a.owner), jyb.m147494Y("is_confirm", 1));
        CoreModule.f18264c.f20387g0.m32908n6(chatGroupMember.groupId, chatGroupMember.userId, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m49537c0(clz clzVar, final boolean z, final ChatGroupMember chatGroupMember, String str, final ChatGroup chatGroup) {
        i4g0.m138523u("e_group_chat_message_click", clzVar.pageId(), jyb.m147494Y("function", z ? "prohibit" : "unmute"));
        if (z) {
            tcz.m190533K(m49517H(), z, str, new Runnable() { // from class: l.g9q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102872a.m49535a0(chatGroup);
                }
            }, new Runnable() { // from class: l.h9q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108423a.m49536b0(chatGroup, chatGroupMember, z);
                }
            });
        } else {
            CoreModule.f18264c.f20387g0.m32908n6(chatGroupMember.groupId, chatGroupMember.userId, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m49538d0() {
        m49525P(this.f31667a);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m49539e0(clz clzVar) {
        i4g0.m138523u("e_group_chat_message_click", clzVar.pageId(), jyb.m147494Y("function", RequestParameters.SUBRESOURCE_DELETE));
        tcz.m190562z(m49517H(), new Runnable() { // from class: l.o8q
            @Override // java.lang.Runnable
            public final void run() {
                this.f145457a.m49538d0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m49540f0(uxj0 uxj0Var) {
        m49516B0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        final Message message4;
        boolean z;
        super.mo49217g(polVar, message, message2, message3);
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8682a).setLetterUser(this.f31674h);
        }
        if (CoreModule.f18273l.m143412i().mo180472g1()) {
            InterfaceC8682a interfaceC8682a2 = this.f31984v;
            if (interfaceC8682a2 instanceof ItemAudio) {
                ((ItemAudio) interfaceC8682a2).setAudioTranslationView(this.f31976C);
            } else {
                bnl0.m105524M(this.f31976C, false);
            }
        } else {
            bnl0.m105524M(this.f31976C, false);
        }
        if (this.f31977D != null) {
            message4 = message;
            this.f31977D.m50956X(message4, m49517H() instanceof MessagesAct ? ((MessagesAct) m49517H()).f32488f.mo111034r3() : "", this.f31673g, this.f31985w, this.f31978E);
        } else {
            message4 = message;
        }
        boolean z2 = this instanceof ItemMessageLeft;
        if ((z2 && (this.f31984v instanceof ItemText)) || (((z = this instanceof ItemMessageRight)) && (this.f31984v instanceof ItemText))) {
            if (gta.m132210e().m132214d().mo34702I4()) {
                ((ItemText) this.f31984v).setLinkTextColor(getResources().getColor(g9c0.f102820j));
            }
            this.f31984v.mo49313y(message4, this);
        } else if ((z2 && (this.f31984v instanceof ItemFeedStates)) || ((z && (this.f31984v instanceof ItemFeedStates)) || ((z2 && (this.f31984v instanceof ItemProfileLike)) || ((z && (this.f31984v instanceof ItemLoveLetterMessage)) || ((z && (this.f31984v instanceof ItemProfileLike)) || ((z2 && (this.f31984v instanceof ItemRecentlySee)) || ((z2 && (this.f31984v instanceof ItemLoveLetterMessage)) || (z && (this.f31984v instanceof ItemRecentlySee))))))))) {
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setOnLongClickListener(null);
            }
            this.f31984v.mo49173U(polVar, message4, this);
        } else {
            InterfaceC8682a interfaceC8682a3 = this.f31984v;
            if ((interfaceC8682a3 instanceof ItemExclusiveInviteLayout) || (interfaceC8682a3 instanceof ItemSticker) || (interfaceC8682a3 instanceof ItemMessageFakeLockItem) || (interfaceC8682a3 instanceof ItemMessageDynamicComments) || (interfaceC8682a3 instanceof ItemPrologueRight) || (interfaceC8682a3 instanceof ItemPrologueLeft) || (interfaceC8682a3 instanceof ItemAiPermissionLayout) || (interfaceC8682a3 instanceof ItemAiPictureLeft)) {
                interfaceC8682a3.mo49173U(polVar, message4, this);
            } else {
                interfaceC8682a3.mo43399A(message4);
            }
        }
        bnl0.m105524M(this.f31975B, TEnum.equals(message4.sentFrom, MessageSentFrom.apple_watch));
        if (this.f31975B.getVisibility() != 8 && this.f31975B.getText().length() == 0) {
            this.f31975B.setText(q8g0.m175795a0(m49517H().string(R$string.f21640X5), '@', m49517H().drawable(ibc0.f113822I7)));
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f31988z);
        VText vText = this.f31986x;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f31986x.setText(this.f31988z);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f31974A);
        VText vText2 = this.f31987y;
        if (zIsEmpty2) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f31987y.setText(this.f31974A);
        }
        if ((m49517H() instanceof MessagesAct) && ((MessagesAct) m49517H()).m50142E2()) {
            bnl0.m105524M(this.f31982I, true);
            if (((MessagesAct) m49517H()).mo50143F() != null) {
                final ruy ruyVarMo50143F = ((MessagesAct) m49517H()).mo50143F();
                this.f31981H.setChecked(ruyVarMo50143F.m183225m0().contains(message4.f56859id));
                this.f31982I.setOnClickListener(new View.OnClickListener() { // from class: l.p8q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f151055a.m49553s0(ruyVarMo50143F, message4, view);
                    }
                });
            }
        } else {
            bnl0.m105524M(this.f31982I, false);
        }
        this.f31983J = message2;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m49541g0(Throwable th) {
        if (CoreModule.m30933P().m143412i().mo180314E() && TEnum.equals(this.f31667a.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        o1j0.m165634h(R$string.f21839u4);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    public String getContentLayoutInfo() {
        return NullChecker.m82486a(this.f31984v) ? this.f31984v.getClass().getName() : super.getContentLayoutInfo();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m49542h0(w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (m49528T(this.f31667a, false)) {
            m49516B0();
            w30VarArr[0].m204614b();
        } else {
            CoreModule.f18264c.f20384f0.m33689In(this.f31667a).subscribe(psd0.m173597H(new y20() { // from class: l.z8q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203409a.m49540f0((uxj0) obj);
                }
            }, new y20() { // from class: l.a9q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69066a.m49541g0((Throwable) obj);
                }
            }));
            w30VarArr[0].m204614b();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m49543i0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R$string.f21535K4));
        w30 w30VarM204654F = new w30.C21001b(m49517H()).m204660L(getResources().getString(R$string.f21831t4)).m204657I(getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.s8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.t8q
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f172562a.m49542h0(w30VarArr, vListCell, c22660a, i);
            }
        }).m204654F();
        w30VarM204654F.m204618f();
        final w30[] w30VarArr = {w30VarM204654F};
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m49544j0(final clz clzVar) {
        i4g0.m138523u("e_group_chat_message_click", clzVar.pageId(), jyb.m147494Y("function", SysnotifListener.ACTION_REPLY));
        CoreModule.f18264c.f20384f0.m33740Ne(this.f31667a.cid).filter(new sb8()).flatMap(new qcj() { // from class: l.i9q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113496a.m49545k0((Conversation) obj);
            }
        }).filter(new hh7()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.n8q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140706a.m49546l0(clzVar, (ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22421c m49545k0(Conversation conversation) {
        return CoreModule.f18264c.f20387g0.m32847T6(conversation.otherUser, this.f31667a.owner);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m49546l0(clz clzVar, ChatGroupMember chatGroupMember) {
        clzVar.m110963c7(this.f31667a);
        clzVar.m143372e0().mo50138B0().m143374g0().m114007b2(chatGroupMember.groupMemberName(), this.f31667a.value);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m49547m0() {
        i4g0.m138520r("e_intl_ai_translate", OMSDialogPositon.p_chat_view);
        AiTranslateView aiTranslateView = this.f31977D;
        if (aiTranslateView != null) {
            aiTranslateView.m50964i0(((ItemText) this.f31984v).getWidth(), m49517H());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m49548n0(clz clzVar, View view) {
        i4g0.m138526x("e_quickchat_prevent_harassment", m49517H().pageId());
        i4g0.m138523u("e_quickchat_prevent_harassment", m49517H().pageId(), jyb.m147494Y("harassment_choose", "unmatch"));
        if (m49532X()) {
            CoreModule.m30933P().m143412i().mo180429Y5(m49517H(), clzVar.mo111034r3(), "");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m49549o0(clz clzVar, View view) {
        i4g0.m138526x("e_quickchat_prevent_harassment", m49517H().pageId());
        i4g0.m138523u("e_quickchat_prevent_harassment", m49517H().pageId(), jyb.m147494Y("harassment_choose", "staymatch"));
        CoreModule.m30933P().m143412i().mo180352L(clzVar.mo111034r3());
        m49555u0(false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31985w = (MessageLinearMaxWidth) findViewById(edc0.f93287U0);
        this.f31975B = (TextView) findViewById(edc0.f93355e4);
        this.f31986x = (VText) findViewById(edc0.f93366g1);
        this.f31987y = (VText) findViewById(edc0.f93281T0);
        this.f31976C = (AudioTranslationView) findViewById(edc0.f93413n);
        this.f31977D = (AiTranslateView) findViewById(edc0.f93343d);
        this.f31979F = (ViewStub) findViewById(edc0.f93174B3);
        this.f31981H = (VCheckBox) findViewById(edc0.f93382i3);
        this.f31982I = (VRelative) findViewById(edc0.f93220J);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int i;
        if ((NullChecker.m82486a(this.f31667a) && TEnum.equals(this.f31667a.messageType, MessageType.icebreak_qa)) || (i = this.f31667a.localFailType) == 3 || i == 4 || CoreModule.f18273l.m143412i().mo180541t4(m49517H()) || m49495Y(getContext())) {
            return false;
        }
        if (rum0.m183208c() && NullChecker.m82486a(this.f31667a) && TEnum.equals(this.f31667a.messageType, "voice_call_invitation")) {
            return false;
        }
        if (!rum0.m183208c() && NullChecker.m82486a(this.f31667a) && (TEnum.equals(this.f31667a.messageType, "voice_call_invitation") || TEnum.equals(this.f31667a.messageType, "voice_call"))) {
            return false;
        }
        if (NullChecker.m82486a(this.f31667a) && (TEnum.equals(this.f31667a.messageType, MessageType.chat_gift) || TEnum.equals(this.f31667a.messageType, MessageType.moment_gift) || TEnum.equals(this.f31667a.messageType, MessageType.marriage_prologue))) {
            return false;
        }
        List<ovb0<String, Runnable, Integer, Void>> listMo43400J = this.f31984v.mo43400J();
        if (listMo43400J == null) {
            listMo43400J = new ArrayList<>();
        }
        m49523N(listMo43400J);
        m49518I(listMo43400J);
        m49521L(listMo43400J);
        m49522M(listMo43400J);
        m49520K(listMo43400J);
        m49519J(listMo43400J);
        m49557w0(listMo43400J);
        m49559z0(view, listMo43400J);
        if (!CoreModule.f18273l.m143412i().mo180314E() || !(m49517H() instanceof MessagesAct) || !((MessagesAct) m49517H()).f32488f.mo110970e4() || !NullChecker.m82486a(this.f31667a)) {
            return true;
        }
        i4g0.m138492A("e_group_chat_message", ((MessagesAct) m49517H()).f32488f.pageId(), jyb.m147494Y(Constants.MessagePayloadKeys.MSGID_SERVER, this.f31667a.f56859id), jyb.m147494Y("user_id", this.f31667a.owner));
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        f31973K = dox.m117366d(i) - qa00.m175859d(104.0f);
        View childAt = this.f31985w.getChildAt(0);
        if ((childAt instanceof ItemRealShot) || (childAt instanceof NewItemGiftMessageBase) || (childAt instanceof ItemGiftMessageBase)) {
            f31973K = dox.m117366d(i);
        }
        this.f31985w.setMaxWidth(f31973K);
        if (CoreModule.f18273l.m143412i().mo180472g1()) {
            this.f31976C.setMaxWidth(f31973K);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m49550p0(ChatGroup chatGroup) {
        i4g0.m138523u("e_group_chat_remove", "p_group_chat_remove", jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("is_confirm", 2), jyb.m147494Y("user_id", this.f31667a.owner));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m49551q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        i4g0.m138523u("e_group_chat_remove", "p_group_chat_remove", jyb.m147494Y("groupchat_id", chatGroup.f56859id), jyb.m147494Y("is_confirm", 1), jyb.m147494Y("user_id", this.f31667a.owner));
        CoreModule.f18264c.f20387g0.m32873b9(chatGroupMember.groupId, chatGroupMember.userId);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m49552r0(clz clzVar, final ChatGroup chatGroup, String str, final ChatGroupMember chatGroupMember) {
        i4g0.m138523u("e_group_chat_message_click", clzVar.pageId(), jyb.m147494Y("function", Action.remove));
        l4g0 l4g0Var = new l4g0("p_group_chat_remove", Dialog.class.getName());
        l4g0Var.m152781p(jyb.m147494Y("is_anonymou_group", TEnum.equals(chatGroup.groupType, "anonymous") ? "1" : "0"));
        w1e.m204402f(l4g0Var);
        tcz.m190525C(m49517H(), str, new Runnable() { // from class: l.q8q
            @Override // java.lang.Runnable
            public final void run() {
                this.f156154a.m49550p0(chatGroup);
            }
        }, new Runnable() { // from class: l.r8q
            @Override // java.lang.Runnable
            public final void run() {
                this.f161746a.m49551q0(chatGroup, chatGroupMember);
            }
        }, l4g0Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m49553s0(ruy ruyVar, Message message, View view) {
        if (this.f31981H.isChecked()) {
            if (ruyVar.m183230t0(message.f56859id, message.createdTime, false)) {
                this.f31981H.setChecked(false);
            }
        } else if (ruyVar.m183230t0(message.f56859id, message.createdTime, true)) {
            this.f31981H.setChecked(true);
        }
    }

    public void setFooterTip(String str) {
        this.f31974A = str;
    }

    public void setHeaderTip(String str) {
        this.f31988z = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m49554t0(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m49555u0(boolean z) {
        bnl0.m105524M(findViewById(edc0.f93232L), z);
        bnl0.m105524M(findViewById(edc0.f93200F3), !z);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m49556v0(Message message) {
        if (CoreModule.m30933P().m143412i().mo180546v() && TEnum.equals(message.messageType, "voice_call") && NullChecker.m82486a(message.additionalData) && VoiceCallStatus.get(message.additionalData.status).equals("finished") && m49532X()) {
            final clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) m49517H()).mo50158l();
            if (CoreModule.m30933P().m143412i().mo180490j5(clzVarMo50158l.f82482k) && CoreModule.m30933P().m143412i().mo180402T5(clzVarMo50158l.mo111034r3()) && m49513y0(message.additionalData.duration) <= 30) {
                ViewStub viewStub = this.f31979F;
                if (viewStub != null) {
                    bnl0.m105524M(viewStub, true);
                    TextView textView = (TextView) findViewById(edc0.f93267Q4);
                    textView.setTypeface(lyh0.m156283c(3), 1);
                    ImageView imageView = (ImageView) findViewById(edc0.f93259P2);
                    TextView textView2 = (TextView) findViewById(edc0.f93219I4);
                    TextView textView3 = (TextView) findViewById(edc0.f93200F3);
                    TextView textView4 = (TextView) findViewById(edc0.f93426o5);
                    TextView textView5 = (TextView) findViewById(edc0.f93346d2);
                    if (gta.m132210e().m132214d().mo34702I4()) {
                        textView.setTextColor(getResources().getColor(g9c0.f102817g));
                        textView2.setTextColor(getResources().getColor(g9c0.f102819i));
                        textView3.setTextColor(getResources().getColor(g9c0.f102819i));
                        textView4.setTextColor(getResources().getColor(g9c0.f102817g));
                        textView5.setTextColor(getResources().getColor(g9c0.f102817g));
                        imageView.setBackground(null);
                        bnl0.m105526N(imageView, ibc0.f113949X5);
                    }
                    if (CoreModule.m30933P().m143412i().mo180520p3(clzVarMo50158l.mo111034r3())) {
                        m49555u0(false);
                    } else {
                        m49555u0(true);
                        bnl0.m105509E0(findViewById(edc0.f93426o5), new View.OnClickListener() { // from class: l.w8q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f187925a.m49548n0(clzVarMo50158l, view);
                            }
                        });
                        bnl0.m105509E0(findViewById(edc0.f93346d2), new View.OnClickListener() { // from class: l.y8q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f198034a.m49549o0(clzVarMo50158l, view);
                            }
                        });
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m49557w0(List<ovb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f18273l.m143412i().mo180314E() && m49532X() && NullChecker.m82486a(this.f31667a) && TEnum.equals(this.f31667a.channel, "group") && !this.f31667a.isMe() && TEnum.equals(this.f31667a.status(), "normal")) {
            final clz clzVar = ((MessagesAct) m49517H()).f32488f;
            final ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(clzVar.mo111034r3());
            String str = this.f31667a.owner;
            final ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(clzVar.mo111034r3(), str);
            if (NullChecker.m82486a(chatGroupMemberM32858W8) && NullChecker.m82486a(chatGroupM32923s6) && TEnum.equals(chatGroupMemberM32858W8.status, "default") && m49527S(str, chatGroupM32923s6, chatGroupMemberM32858W8)) {
                final String strM144583o = !TextUtils.isEmpty(chatGroupMemberM32858W8.groupMemberName()) ? jek.m144583o(chatGroupMemberM32858W8.groupMemberName()) : "";
                list.add(jyb.m147495Z(CoreModule.f18263b.getString(R$string.f21515I0), new Runnable() { // from class: l.e9q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f92666a.m49552r0(clzVar, chatGroupM32923s6, strM144583o, chatGroupMemberM32858W8);
                    }
                }, Integer.valueOf(ibc0.f114167w1), null));
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m49558x0(Message message) {
        if (m49556v0(message)) {
            return;
        }
        bnl0.m105524M(this.f31979F, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX INFO: renamed from: z0 */
    public final void m49559z0(View view, List<ovb0<String, Runnable, Integer, Void>> list) {
        if (view == null) {
            return;
        }
        if (!(CoreModule.f18273l.m143412i().mo180325G1() && jyb.m147479J(list)) && m49532X()) {
            view.getLocationOnScreen(new int[2]);
            if (view instanceof ItemMessageBase) {
                if (NullChecker.m82486a(this.f31667a) && (TEnum.equals(this.f31667a.messageType, MessageType.state_like) || TEnum.equals(this.f31667a.messageType, MessageType.state_comment))) {
                    InterfaceC8682a interfaceC8682a = ((ItemMessageBase) view).f31984v;
                    if (interfaceC8682a instanceof ItemFeedStates) {
                        view = ((ItemFeedStates) interfaceC8682a).f31800i;
                    } else if (!NullChecker.m82486a(this.f31667a)) {
                        if (NullChecker.m82486a(this.f31667a)) {
                            view = ((ItemMessageBase) view).f31985w;
                        } else {
                            view = ((ItemMessageBase) view).f31985w;
                        }
                    } else if (NullChecker.m82486a(this.f31667a)) {
                        view = ((ItemMessageBase) view).f31985w;
                    } else {
                        view = ((ItemMessageBase) view).f31985w;
                    }
                } else if (!NullChecker.m82486a(this.f31667a) && TEnum.equals(this.f31667a.messageType, "literature")) {
                    InterfaceC8682a interfaceC8682a2 = ((ItemMessageBase) view).f31984v;
                    if (interfaceC8682a2 instanceof ItemRecentlySee) {
                        view = ((ItemRecentlySee) interfaceC8682a2).f32302f;
                    } else if (NullChecker.m82486a(this.f31667a)) {
                        view = ((ItemMessageBase) view).f31985w;
                    } else {
                        view = ((ItemMessageBase) view).f31985w;
                    }
                } else if (NullChecker.m82486a(this.f31667a) || !TEnum.equals(this.f31667a.messageType, MessageType.profile_like)) {
                    view = ((ItemMessageBase) view).f31985w;
                } else {
                    InterfaceC8682a interfaceC8682a3 = ((ItemMessageBase) view).f31984v;
                    if (interfaceC8682a3 instanceof ItemProfileLike) {
                        view = ((ItemProfileLike) interfaceC8682a3).f32253g;
                    } else {
                        view = ((ItemMessageBase) view).f31985w;
                    }
                }
            }
            m49515A0(view, list, m49526Q(view, list.size()));
        }
    }

    public ItemMessageBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public ItemMessageBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }
}
