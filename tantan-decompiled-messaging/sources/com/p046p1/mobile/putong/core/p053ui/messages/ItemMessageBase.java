package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageSentFrom;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.RecallConfig;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase;
import com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.view.AiTranslateView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.ItemLoveLetterMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MenuCustomView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLinearMaxWidth;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VCheckBox;
import p147v.VListCell;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.c40;
import p149l.cwf0;
import p149l.dg7;
import p149l.dml;
import p149l.dqy;
import p149l.e30;
import p149l.eqh0;
import p149l.fcz;
import p149l.ffx;
import p149l.guy;
import p149l.i0e;
import p149l.i0g0;
import p149l.jf50;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nlm0;
import p149l.o6j0;
import p149l.o7r;
import p149l.oa8;
import p149l.roj0;
import p149l.t100;
import p149l.tbk;
import p149l.tpd0;
import p149l.uly;
import p149l.ura;
import p149l.vwb;
import p149l.w3z;
import p149l.w9j;
import p149l.x4q;
import p149l.xdl0;
import p149l.xp5;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageBase extends ItemBase implements View.OnLongClickListener, x4q, InterfaceC8519a.a {

    /* JADX INFO: renamed from: K */
    public static int f31125K;

    /* JADX INFO: renamed from: A */
    public String f31126A;

    /* JADX INFO: renamed from: B */
    public TextView f31127B;

    /* JADX INFO: renamed from: C */
    public AudioTranslationView f31128C;

    /* JADX INFO: renamed from: D */
    public AiTranslateView f31129D;

    /* JADX INFO: renamed from: E */
    public Drawable f31130E;

    /* JADX INFO: renamed from: F */
    public ViewStub f31131F;

    /* JADX INFO: renamed from: G */
    public PopupWindow f31132G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f31133H;

    /* JADX INFO: renamed from: I */
    public VRelative f31134I;

    /* JADX INFO: renamed from: J */
    public Message f31135J;

    /* JADX INFO: renamed from: v */
    public InterfaceC8519a f31136v;

    /* JADX INFO: renamed from: w */
    public MessageLinearMaxWidth f31137w;

    /* JADX INFO: renamed from: x */
    public VText f31138x;

    /* JADX INFO: renamed from: y */
    public VText f31139y;

    /* JADX INFO: renamed from: z */
    public String f31140z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$a */
    public class RunnableC8496a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f31141a;

        public RunnableC8496a(fcz fczVar) {
            this.f31141a = fczVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31141a.m120636C3(ItemMessageBase.this.f30819a.f56011id);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$b */
    public class C8497b extends jf50 {
        public C8497b() {
        }

        @Override // p149l.jf50
        /* JADX INFO: renamed from: b */
        public void mo48377b(int i, int i2) {
            super.mo48377b(i, i2);
            ItemMessageBase.this.f31132G.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$c */
    public class C8498c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jf50 f31144a;

        public C8498c(jf50 jf50Var) {
            this.f31144a = jf50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ((MessagesAct) ItemMessageBase.this.m48334H()).f31640f.m120842t7().f171745n1.mo49610B(this.f31144a);
        }
    }

    public ItemMessageBase(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: R */
    public static ItemMessageBase m48311R(View view) {
        return view.getParent() instanceof ItemMessageBase ? (ItemMessageBase) view.getParent() : m48311R((View) view.getParent());
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m48312Y(Context context) {
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        return CoreModule.f17545c.f19642f0.m33001jg(((MessagesAct) context).f31640f.mo120828r3(), false);
    }

    @Nullable
    private RecallConfig getRecallConfig() {
        try {
            return (RecallConfig) RemoteConfig.m79298x().m79333v("recall_config", RecallConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    private void setWindowBackground(float f) {
        WindowManager.LayoutParams attributes = m48334H().getWindow().getAttributes();
        attributes.alpha = f;
        m48334H().getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m48324t(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m48328x(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private long m48330y0(String str) {
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
    public final void m48332A0(View view, List<knb0<String, Runnable, Integer, Void>> list, boolean z) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow(menuCustomView, -2, -2);
        this.f31132G = popupWindow;
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m48371t0(this.f31132G.getWidth()), m48371t0(this.f31132G.getHeight()));
        this.f31132G.setOutsideTouchable(true);
        this.f31132G.setBackgroundDrawable(new BitmapDrawable());
        int height = 10;
        if (z) {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
            height = ((-menuCustomView.getMeasuredHeight()) - view.getHeight()) - 10;
        } else {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
        }
        this.f31132G.showAsDropDown(view, width, height, 8388611);
        C8497b c8497b = new C8497b();
        this.f31132G.setOnDismissListener(new C8498c(c8497b));
        ((MessagesAct) m48334H()).f31640f.m120842t7().f171745n1.mo49617n(c8497b);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m48333B0() {
        RecallConfig recallConfig = getRecallConfig();
        if (recallConfig == null || !recallConfig.enable) {
            return;
        }
        if (!CoreModule.f17545c.f19639e0.f149265S3.get().booleanValue()) {
            CoreModule.f17545c.f19639e0.f149265S3.put(Boolean.TRUE);
        }
        if (CoreModule.f17545c.f19639e0.f149273T3.get().intValue() < 5) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149273T3;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            lsi0.m151595y("仅支持撤回2分钟内发出的消息");
        }
    }

    /* JADX INFO: renamed from: H */
    public Act m48334H() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m48335I(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f17554l.m94658i().mo158380g1() && m48349X() && this.f30819a.audio() != null) {
            final fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) m48334H()).mo48974l();
            if (fczVarMo48974l.m120819p4(this.f30819a.f56011id) || this.f30819a.isLocal()) {
                return;
            }
            if (!fczVarMo48974l.m120739Z3(this.f30819a) || !fczVarMo48974l.m120809n4(this.f30819a.f56011id)) {
                o6j0.m162864h("e_chat_message_convert_to_text_hold_press_button", fczVarMo48974l.pageId(), new o6j0.C18854a[0]);
                list.add(vwb.m200312Z(m48334H().string(R$string.f20928b2), new Runnable() { // from class: l.c7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79640a.m48350Z(fczVarMo48974l);
                    }
                }, Integer.valueOf(c3c0.f78824o5), null));
            }
            if (fczVarMo48974l.m120809n4(this.f30819a.f56011id)) {
                list.add(vwb.m200312Z(m48334H().string(R$string.f20919a2), new RunnableC8496a(fczVarMo48974l), Integer.valueOf(c3c0.f78815n5), null));
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m48336J(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f17554l.m94658i().mo158222E() && m48349X() && NullChecker.m81303a(this.f30819a) && TEnum.equals(this.f30819a.channel, "group") && !this.f30819a.isMe() && TEnum.equals(this.f30819a.status(), "normal")) {
            final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            final ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(fczVar.mo120828r3());
            String str = this.f30819a.owner;
            final ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(fczVar.mo120828r3(), str);
            if (TEnum.equals(chatGroupMemberM31855W8.status, "default") && m48344S(str, chatGroupM31920s6, chatGroupMemberM31855W8)) {
                final String strM187868o = !TextUtils.isEmpty(chatGroupMemberM31855W8.groupMemberName()) ? tbk.m187868o(chatGroupMemberM31855W8.groupMemberName()) : "";
                final boolean z = !chatGroupMemberM31855W8.silence.enable || ((double) mqi0.m155944o()) >= chatGroupMemberM31855W8.silence.until;
                list.add(vwb.m200312Z(z ? CoreModule.f17544b.getString(R$string.f20804M) : CoreModule.f17544b.getString(R$string.f20780J), new Runnable() { // from class: l.d7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84758a.m48354c0(fczVar, z, chatGroupMemberM31855W8, strM187868o, chatGroupM31920s6);
                    }
                }, Integer.valueOf(c3c0.f78838q1), null));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m48337K(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.m29935P().m94658i().mo158222E() && NullChecker.m81303a(this.f30819a) && m48349X() && TEnum.equals(this.f30819a.channel, "group") && TEnum.equals(this.f30819a.status(), "normal")) {
            final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            list.add(vwb.m200312Z(getResources().getString(R$string.f20823O2), new Runnable() { // from class: l.m6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131716a.m48356e0(fczVar);
                }
            }, Integer.valueOf(c3c0.f78865t1), null));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m48338L(List<knb0<String, Runnable, Integer, Void>> list) {
        if (!m48345T(this.f30819a, true) && this.f30819a.isMe() && TEnum.equals(this.f30819a.status(), "normal")) {
            Message message = this.f30819a;
            if (message.likeOfMoment != null || message.messageType().isUnknownType()) {
                return;
            }
            if ((!this.f30819a.isGroupMessage() && CoreModule.f17545c.f19639e0.m169430Pa(this.f30819a.cid).unilateralBlock()) || TEnum.equals(this.f30819a.messageType, "reminder") || TEnum.equals(this.f30819a.messageType, MessageType.group_invitation) || TEnum.equals(this.f30819a.messageType(), MessageType.picture_text_deeplink)) {
                return;
            }
            if ((CoreModule.m29935P().m94652b().mo35107Yg() && !NullChecker.m81303a(this.f31135J) && CoreModule.m29935P().m94652b().mo35124sc(CoreModule.f17545c.f19642f0.m32856Xe(this.f30819a.cid))) || TEnum.equals(this.f30819a.messageType, MessageType.moment_user_state) || xp5.m210466f(CoreModule.f17545c.f19642f0.m32856Xe(this.f30819a.cid))) {
                return;
            }
            list.add(vwb.m200312Z(getResources().getString(R$string.f20793K4), new Runnable() { // from class: l.x6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191260a.m48360i0();
                }
            }, Integer.valueOf(c3c0.f78874u1), null));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m48339M(List<knb0<String, Runnable, Integer, Void>> list) {
        Act actM48334H = m48334H();
        if (m48349X()) {
            guy guyVarM156457g0 = ((MessagesAct) actM48334H).mo48954A0().m156457g0();
            dqy dqyVarM128212u0 = guyVarM156457g0.m128212u0();
            if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                return;
            }
            MessageBar messageBarM128210t0 = guyVarM156457g0.m128210t0();
            if (NullChecker.m81303a(messageBarM128210t0) && messageBarM128210t0.getVisibility() == 8) {
                return;
            }
            int i = c3c0.f78883v1;
            if (NullChecker.m81303a(this.f30819a) && m48349X() && TEnum.equals(this.f30819a.channel, "group") && !this.f30819a.isLocal()) {
                if (TEnum.equals(this.f30819a.messageType, "text") || TEnum.equals(this.f30819a.messageType, "sticker")) {
                    final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
                    list.add(vwb.m200312Z(getResources().getString(R$string.f20863T2), new Runnable() { // from class: l.b7q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f74007a.m48361j0(fczVar);
                        }
                    }, Integer.valueOf(i), null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m48340N(List<knb0<String, Runnable, Integer, Void>> list) {
        AiTranslateView aiTranslateView;
        Message message = this.f30819a;
        if (message != null && (this.f31136v instanceof ItemText) && (aiTranslateView = this.f31129D) != null && aiTranslateView.m49774Y(message)) {
            if ((m48334H() instanceof MessagesAct) && User.isTeamAccount(((MessagesAct) m48334H()).f31640f.mo120828r3())) {
                return;
            }
            list.add(0, vwb.m200312Z(getResources().getString(R$string.f20872U3), new Runnable() { // from class: l.f7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96276a.m48364m0();
                }
            }, Integer.valueOf(c3c0.f78910y1), null));
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m48341O() {
        if (m48334H() instanceof MessagesAct) {
            return ((MessagesAct) m48334H()).mo48974l().mo120719V2();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final void m48342P(Message message) {
        CoreModule.f17545c.f19642f0.m32786Rf(message.cid, vwb.m200324f0(message)).subscribe(mkd0.m154956H(new e30() { // from class: l.u6q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemMessageBase.m48324t((roj0) obj);
            }
        }, new e30() { // from class: l.v6q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemMessageBase.m48328x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m48343Q(View view, int i) {
        if (!m48349X()) {
            return false;
        }
        MessageBar messageBarM128210t0 = ((MessagesAct) m48334H()).f31640f.m156455e0().mo48954A0().m156457g0().m128210t0();
        int iM186890d = t100.m186890d(30.0f) + (t100.m186890d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarM128210t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iM186890d2 = iArr2[1] - t100.m186890d(40.0f);
        boolean z = iM186890d2 > height;
        if (!z || iM186890d2 >= iM186890d) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m48344S(String str, ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        if (chatGroup == null || chatGroupMember == null) {
            return false;
        }
        return (!vwb.m200296J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.m29931H().userId()) && !chatGroup.adminUserIds.contains(str) && !TextUtils.equals(str, chatGroup.ownerUserId)) || TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: T */
    public final boolean m48345T(Message message, boolean z) {
        if (z && !CoreModule.f17545c.f19639e0.f149265S3.get().booleanValue()) {
            return false;
        }
        RecallConfig recallConfig = getRecallConfig();
        if (NullChecker.m81303a(recallConfig)) {
            int i = recallConfig.minutes;
            if (recallConfig.enable && i > 0 && message.createdTime + (((long) (i * 1000)) * 60) < mqi0.m155944o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void mo48346U(int i, View view, int i2, boolean z) {
        View viewInflate = o7r.m163037a(getContext()).inflate(i, (ViewGroup) this.f31137w, false);
        this.f30825g = viewInflate;
        this.f31137w.addView(viewInflate, 0);
        InterfaceC8519a interfaceC8519a = (InterfaceC8519a) this.f30825g.findViewById(y4c0.f196081Z);
        this.f31136v = interfaceC8519a;
        if (!z && (interfaceC8519a instanceof ItemAudio)) {
            this.f30825g = (View) interfaceC8519a;
        }
        interfaceC8519a.mo42393m(i2, z, this);
        this.f31130E = this.f30825g.getBackground();
    }

    /* JADX INFO: renamed from: V */
    public boolean m48347V() {
        if (CoreModule.m29935P().m94658i().mo158449t4(m48334H())) {
            return CoreModule.m29935P().m94658i().mo158207B2(m48334H());
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean m48348W(BubbleInfo bubbleInfo) {
        return NullChecker.m81303a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f38730id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis()) && !TextUtils.isEmpty(bubbleInfo.value);
    }

    /* JADX INFO: renamed from: X */
    public boolean m48349X() {
        return m48334H() instanceof MessagesAct;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m48350Z(fcz fczVar) {
        o6j0.m162859c("e_chat_message_convert_to_text_hold_press_button", fczVar.pageId(), new o6j0.C18854a[0]);
        fczVar.m120822p7(this.f30819a, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a.a
    /* JADX INFO: renamed from: a */
    public void mo48351a() {
        performLongClick();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m48352a0(ChatGroup chatGroup) {
        zvf0.m220399u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("user_id", this.f30819a.owner), vwb.m200311Y("is_confirm", 2));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m48353b0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z) {
        zvf0.m220399u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("user_id", this.f30819a.owner), vwb.m200311Y("is_confirm", 1));
        CoreModule.f17545c.f19645g0.m31905n6(chatGroupMember.groupId, chatGroupMember.userId, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m48354c0(fcz fczVar, final boolean z, final ChatGroupMember chatGroupMember, String str, final ChatGroup chatGroup) {
        zvf0.m220399u("e_group_chat_message_click", fczVar.pageId(), vwb.m200311Y("function", z ? "prohibit" : "unmute"));
        if (z) {
            w3z.m201405K(m48334H(), z, str, new Runnable() { // from class: l.g7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101425a.m48352a0(chatGroup);
                }
            }, new Runnable() { // from class: l.h7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106327a.m48353b0(chatGroup, chatGroupMember, z);
                }
            });
        } else {
            CoreModule.f17545c.f19645g0.m31905n6(chatGroupMember.groupId, chatGroupMember.userId, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m48355d0() {
        m48342P(this.f30819a);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m48356e0(fcz fczVar) {
        zvf0.m220399u("e_group_chat_message_click", fczVar.pageId(), vwb.m200311Y("function", RequestParameters.SUBRESOURCE_DELETE));
        w3z.m201434z(m48334H(), new Runnable() { // from class: l.o6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f142417a.m48355d0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m48357f0(roj0 roj0Var) {
        m48333B0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        final Message message4;
        boolean z;
        super.mo48034g(dmlVar, message, message2, message3);
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8519a).setLetterUser(this.f30826h);
        }
        if (CoreModule.f17554l.m94658i().mo158380g1()) {
            InterfaceC8519a interfaceC8519a2 = this.f31136v;
            if (interfaceC8519a2 instanceof ItemAudio) {
                ((ItemAudio) interfaceC8519a2).setAudioTranslationView(this.f31128C);
            } else {
                xdl0.m208344M(this.f31128C, false);
            }
        } else {
            xdl0.m208344M(this.f31128C, false);
        }
        if (this.f31129D != null) {
            message4 = message;
            this.f31129D.m49773X(message4, m48334H() instanceof MessagesAct ? ((MessagesAct) m48334H()).f31640f.mo120828r3() : "", this.f30825g, this.f31137w, this.f31130E);
        } else {
            message4 = message;
        }
        boolean z2 = this instanceof ItemMessageLeft;
        if ((z2 && (this.f31136v instanceof ItemText)) || (((z = this instanceof ItemMessageRight)) && (this.f31136v instanceof ItemText))) {
            if (ura.m195053e().m195057d().mo33699I4()) {
                ((ItemText) this.f31136v).setLinkTextColor(getResources().getColor(a1c0.f67156j));
            }
            this.f31136v.mo48130y(message4, this);
        } else if ((z2 && (this.f31136v instanceof ItemFeedStates)) || ((z && (this.f31136v instanceof ItemFeedStates)) || ((z2 && (this.f31136v instanceof ItemProfileLike)) || ((z && (this.f31136v instanceof ItemLoveLetterMessage)) || ((z && (this.f31136v instanceof ItemProfileLike)) || ((z2 && (this.f31136v instanceof ItemRecentlySee)) || ((z2 && (this.f31136v instanceof ItemLoveLetterMessage)) || (z && (this.f31136v instanceof ItemRecentlySee))))))))) {
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setOnLongClickListener(null);
            }
            this.f31136v.mo47990U(dmlVar, message4, this);
        } else {
            InterfaceC8519a interfaceC8519a3 = this.f31136v;
            if ((interfaceC8519a3 instanceof ItemExclusiveInviteLayout) || (interfaceC8519a3 instanceof ItemSticker) || (interfaceC8519a3 instanceof ItemMessageFakeLockItem) || (interfaceC8519a3 instanceof ItemMessageDynamicComments) || (interfaceC8519a3 instanceof ItemPrologueRight) || (interfaceC8519a3 instanceof ItemPrologueLeft) || (interfaceC8519a3 instanceof ItemAiPermissionLayout) || (interfaceC8519a3 instanceof ItemAiPictureLeft)) {
                interfaceC8519a3.mo47990U(dmlVar, message4, this);
            } else {
                interfaceC8519a3.mo42388A(message4);
            }
        }
        xdl0.m208344M(this.f31127B, TEnum.equals(message4.sentFrom, MessageSentFrom.apple_watch));
        if (this.f31127B.getVisibility() != 8 && this.f31127B.getText().length() == 0) {
            this.f31127B.setText(i0g0.m133860a0(m48334H().string(R$string.f20898X5), '@', m48334H().drawable(c3c0.f78547I7)));
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f31140z);
        VText vText = this.f31138x;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f31138x.setText(this.f31140z);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f31126A);
        VText vText2 = this.f31139y;
        if (zIsEmpty2) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f31139y.setText(this.f31126A);
        }
        if ((m48334H() instanceof MessagesAct) && ((MessagesAct) m48334H()).m48958D2()) {
            xdl0.m208344M(this.f31134I, true);
            if (((MessagesAct) m48334H()).mo48959E() != null) {
                final uly ulyVarMo48959E = ((MessagesAct) m48334H()).mo48959E();
                this.f31133H.setChecked(ulyVarMo48959E.m194276m0().contains(message4.f56011id));
                this.f31134I.setOnClickListener(new View.OnClickListener() { // from class: l.p6q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f147426a.m48370s0(ulyVarMo48959E, message4, view);
                    }
                });
            }
        } else {
            xdl0.m208344M(this.f31134I, false);
        }
        this.f31135J = message2;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m48358g0(Throwable th) {
        if (CoreModule.m29935P().m94658i().mo158222E() && TEnum.equals(this.f30819a.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        lsi0.m151578h(R$string.f21097u4);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    public String getContentLayoutInfo() {
        return NullChecker.m81303a(this.f31136v) ? this.f31136v.getClass().getName() : super.getContentLayoutInfo();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m48359h0(c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (m48345T(this.f30819a, false)) {
            m48333B0();
            c40VarArr[0].m105113b();
        } else {
            CoreModule.f17545c.f19642f0.m32686In(this.f30819a).subscribe(mkd0.m154956H(new e30() { // from class: l.z6q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201956a.m48357f0((roj0) obj);
                }
            }, new e30() { // from class: l.a7q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67945a.m48358g0((Throwable) obj);
                }
            }));
            c40VarArr[0].m105113b();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m48360i0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R$string.f20793K4));
        c40 c40VarM105153F = new c40.C16057b(m48334H()).m105159L(getResources().getString(R$string.f21089t4)).m105156I(getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.s6q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.t6q
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f168636a.m48359h0(c40VarArr, vListCell, c22545a, i);
            }
        }).m105153F();
        c40VarM105153F.m105117f();
        final c40[] c40VarArr = {c40VarM105153F};
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m48361j0(final fcz fczVar) {
        zvf0.m220399u("e_group_chat_message_click", fczVar.pageId(), vwb.m200311Y("function", SysnotifListener.ACTION_REPLY));
        CoreModule.f17545c.f19642f0.m32737Ne(this.f30819a.cid).filter(new oa8()).flatMap(new w9j() { // from class: l.i7q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111933a.m48362k0((Conversation) obj);
            }
        }).filter(new dg7()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.n6q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137437a.m48363l0(fczVar, (ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22306c m48362k0(Conversation conversation) {
        return CoreModule.f17545c.f19645g0.m31844T6(conversation.otherUser, this.f30819a.owner);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m48363l0(fcz fczVar, ChatGroupMember chatGroupMember) {
        fczVar.m120757c7(this.f30819a);
        fczVar.m156455e0().mo48954A0().m156457g0().m128177b2(chatGroupMember.groupMemberName(), this.f30819a.value);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m48364m0() {
        zvf0.m220396r("e_intl_ai_translate", OMSDialogPositon.p_chat_view);
        AiTranslateView aiTranslateView = this.f31129D;
        if (aiTranslateView != null) {
            aiTranslateView.m49781i0(((ItemText) this.f31136v).getWidth(), m48334H());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m48365n0(fcz fczVar, View view) {
        zvf0.m220402x("e_quickchat_prevent_harassment", m48334H().pageId());
        zvf0.m220399u("e_quickchat_prevent_harassment", m48334H().pageId(), vwb.m200311Y("harassment_choose", "unmatch"));
        if (m48349X()) {
            CoreModule.m29935P().m94658i().mo158337Y5(m48334H(), fczVar.mo120828r3(), "");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m48366o0(fcz fczVar, View view) {
        zvf0.m220402x("e_quickchat_prevent_harassment", m48334H().pageId());
        zvf0.m220399u("e_quickchat_prevent_harassment", m48334H().pageId(), vwb.m200311Y("harassment_choose", "staymatch"));
        CoreModule.m29935P().m94658i().mo158260L(fczVar.mo120828r3());
        m48372u0(false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31137w = (MessageLinearMaxWidth) findViewById(y4c0.f196052U0);
        this.f31127B = (TextView) findViewById(y4c0.f196120e4);
        this.f31138x = (VText) findViewById(y4c0.f196131g1);
        this.f31139y = (VText) findViewById(y4c0.f196046T0);
        this.f31128C = (AudioTranslationView) findViewById(y4c0.f196178n);
        this.f31129D = (AiTranslateView) findViewById(y4c0.f196108d);
        this.f31131F = (ViewStub) findViewById(y4c0.f195939B3);
        this.f31133H = (VCheckBox) findViewById(y4c0.f196147i3);
        this.f31134I = (VRelative) findViewById(y4c0.f195985J);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int i;
        if ((NullChecker.m81303a(this.f30819a) && TEnum.equals(this.f30819a.messageType, MessageType.icebreak_qa)) || (i = this.f30819a.localFailType) == 3 || i == 4 || CoreModule.f17554l.m94658i().mo158449t4(m48334H()) || m48312Y(getContext())) {
            return false;
        }
        if (nlm0.m160070c() && NullChecker.m81303a(this.f30819a) && TEnum.equals(this.f30819a.messageType, "voice_call_invitation")) {
            return false;
        }
        if (!nlm0.m160070c() && NullChecker.m81303a(this.f30819a) && (TEnum.equals(this.f30819a.messageType, "voice_call_invitation") || TEnum.equals(this.f30819a.messageType, "voice_call"))) {
            return false;
        }
        if (NullChecker.m81303a(this.f30819a) && (TEnum.equals(this.f30819a.messageType, MessageType.chat_gift) || TEnum.equals(this.f30819a.messageType, MessageType.moment_gift) || TEnum.equals(this.f30819a.messageType, MessageType.marriage_prologue))) {
            return false;
        }
        List<knb0<String, Runnable, Integer, Void>> listMo42389J = this.f31136v.mo42389J();
        if (listMo42389J == null) {
            listMo42389J = new ArrayList<>();
        }
        m48340N(listMo42389J);
        m48335I(listMo42389J);
        m48338L(listMo42389J);
        m48339M(listMo42389J);
        m48337K(listMo42389J);
        m48336J(listMo42389J);
        m48374w0(listMo42389J);
        m48376z0(view, listMo42389J);
        if (!CoreModule.f17554l.m94658i().mo158222E() || !(m48334H() instanceof MessagesAct) || !((MessagesAct) m48334H()).f31640f.mo120764e4() || !NullChecker.m81303a(this.f30819a)) {
            return true;
        }
        zvf0.m220368A("e_group_chat_message", ((MessagesAct) m48334H()).f31640f.pageId(), vwb.m200311Y(Constants.MessagePayloadKeys.MSGID_SERVER, this.f30819a.f56011id), vwb.m200311Y("user_id", this.f30819a.owner));
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        f31125K = ffx.m121201d(i) - t100.m186890d(104.0f);
        View childAt = this.f31137w.getChildAt(0);
        if ((childAt instanceof ItemRealShot) || (childAt instanceof NewItemGiftMessageBase) || (childAt instanceof ItemGiftMessageBase)) {
            f31125K = ffx.m121201d(i);
        }
        this.f31137w.setMaxWidth(f31125K);
        if (CoreModule.f17554l.m94658i().mo158380g1()) {
            this.f31128C.setMaxWidth(f31125K);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m48367p0(ChatGroup chatGroup) {
        zvf0.m220399u("e_group_chat_remove", "p_group_chat_remove", vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("is_confirm", 2), vwb.m200311Y("user_id", this.f30819a.owner));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m48368q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        zvf0.m220399u("e_group_chat_remove", "p_group_chat_remove", vwb.m200311Y("groupchat_id", chatGroup.f56011id), vwb.m200311Y("is_confirm", 1), vwb.m200311Y("user_id", this.f30819a.owner));
        CoreModule.f17545c.f19645g0.m31870b9(chatGroupMember.groupId, chatGroupMember.userId);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m48369r0(fcz fczVar, final ChatGroup chatGroup, String str, final ChatGroupMember chatGroupMember) {
        zvf0.m220399u("e_group_chat_message_click", fczVar.pageId(), vwb.m200311Y("function", Action.remove));
        cwf0 cwf0Var = new cwf0("p_group_chat_remove", Dialog.class.getName());
        cwf0Var.m109040p(vwb.m200311Y("is_anonymou_group", TEnum.equals(chatGroup.groupType, "anonymous") ? "1" : "0"));
        i0e.m133797f(cwf0Var);
        w3z.m201397C(m48334H(), str, new Runnable() { // from class: l.q6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f152933a.m48367p0(chatGroup);
            }
        }, new Runnable() { // from class: l.r6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f157974a.m48368q0(chatGroup, chatGroupMember);
            }
        }, cwf0Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m48370s0(uly ulyVar, Message message, View view) {
        if (this.f31133H.isChecked()) {
            if (ulyVar.m194281t0(message.f56011id, message.createdTime, false)) {
                this.f31133H.setChecked(false);
            }
        } else if (ulyVar.m194281t0(message.f56011id, message.createdTime, true)) {
            this.f31133H.setChecked(true);
        }
    }

    public void setFooterTip(String str) {
        this.f31126A = str;
    }

    public void setHeaderTip(String str) {
        this.f31140z = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m48371t0(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m48372u0(boolean z) {
        xdl0.m208344M(findViewById(y4c0.f195997L), z);
        xdl0.m208344M(findViewById(y4c0.f195965F3), !z);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m48373v0(Message message) {
        if (CoreModule.m29935P().m94658i().mo158454v() && TEnum.equals(message.messageType, "voice_call") && NullChecker.m81303a(message.additionalData) && VoiceCallStatus.get(message.additionalData.status).equals("finished") && m48349X()) {
            final fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) m48334H()).mo48974l();
            if (CoreModule.m29935P().m94658i().mo158398j5(fczVarMo48974l.f96919k) && CoreModule.m29935P().m94658i().mo158310T5(fczVarMo48974l.mo120828r3()) && m48330y0(message.additionalData.duration) <= 30) {
                ViewStub viewStub = this.f31131F;
                if (viewStub != null) {
                    xdl0.m208344M(viewStub, true);
                    TextView textView = (TextView) findViewById(y4c0.f196032Q4);
                    textView.setTypeface(eqh0.m117752c(3), 1);
                    ImageView imageView = (ImageView) findViewById(y4c0.f196024P2);
                    TextView textView2 = (TextView) findViewById(y4c0.f195984I4);
                    TextView textView3 = (TextView) findViewById(y4c0.f195965F3);
                    TextView textView4 = (TextView) findViewById(y4c0.f196191o5);
                    TextView textView5 = (TextView) findViewById(y4c0.f196111d2);
                    if (ura.m195053e().m195057d().mo33699I4()) {
                        textView.setTextColor(getResources().getColor(a1c0.f67153g));
                        textView2.setTextColor(getResources().getColor(a1c0.f67155i));
                        textView3.setTextColor(getResources().getColor(a1c0.f67155i));
                        textView4.setTextColor(getResources().getColor(a1c0.f67153g));
                        textView5.setTextColor(getResources().getColor(a1c0.f67153g));
                        imageView.setBackground(null);
                        xdl0.m208346N(imageView, c3c0.f78674X5);
                    }
                    if (CoreModule.m29935P().m94658i().mo158428p3(fczVarMo48974l.mo120828r3())) {
                        m48372u0(false);
                    } else {
                        m48372u0(true);
                        xdl0.m208329E0(findViewById(y4c0.f196191o5), new View.OnClickListener() { // from class: l.w6q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f184987a.m48365n0(fczVarMo48974l, view);
                            }
                        });
                        xdl0.m208329E0(findViewById(y4c0.f196111d2), new View.OnClickListener() { // from class: l.y6q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f196602a.m48366o0(fczVarMo48974l, view);
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
    public final void m48374w0(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.f17554l.m94658i().mo158222E() && m48349X() && NullChecker.m81303a(this.f30819a) && TEnum.equals(this.f30819a.channel, "group") && !this.f30819a.isMe() && TEnum.equals(this.f30819a.status(), "normal")) {
            final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            final ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(fczVar.mo120828r3());
            String str = this.f30819a.owner;
            final ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(fczVar.mo120828r3(), str);
            if (NullChecker.m81303a(chatGroupMemberM31855W8) && NullChecker.m81303a(chatGroupM31920s6) && TEnum.equals(chatGroupMemberM31855W8.status, "default") && m48344S(str, chatGroupM31920s6, chatGroupMemberM31855W8)) {
                final String strM187868o = !TextUtils.isEmpty(chatGroupMemberM31855W8.groupMemberName()) ? tbk.m187868o(chatGroupMemberM31855W8.groupMemberName()) : "";
                list.add(vwb.m200312Z(CoreModule.f17544b.getString(R$string.f20773I0), new Runnable() { // from class: l.e7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f89740a.m48369r0(fczVar, chatGroupM31920s6, strM187868o, chatGroupMemberM31855W8);
                    }
                }, Integer.valueOf(c3c0.f78892w1), null));
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m48375x0(Message message) {
        if (m48373v0(message)) {
            return;
        }
        xdl0.m208344M(this.f31131F, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX INFO: renamed from: z0 */
    public final void m48376z0(View view, List<knb0<String, Runnable, Integer, Void>> list) {
        if (view == null) {
            return;
        }
        if (!(CoreModule.f17554l.m94658i().mo158233G1() && vwb.m200296J(list)) && m48349X()) {
            view.getLocationOnScreen(new int[2]);
            if (view instanceof ItemMessageBase) {
                if (NullChecker.m81303a(this.f30819a) && (TEnum.equals(this.f30819a.messageType, MessageType.state_like) || TEnum.equals(this.f30819a.messageType, MessageType.state_comment))) {
                    InterfaceC8519a interfaceC8519a = ((ItemMessageBase) view).f31136v;
                    if (interfaceC8519a instanceof ItemFeedStates) {
                        view = ((ItemFeedStates) interfaceC8519a).f30952i;
                    } else if (!NullChecker.m81303a(this.f30819a)) {
                        if (NullChecker.m81303a(this.f30819a)) {
                            view = ((ItemMessageBase) view).f31137w;
                        } else {
                            view = ((ItemMessageBase) view).f31137w;
                        }
                    } else if (NullChecker.m81303a(this.f30819a)) {
                        view = ((ItemMessageBase) view).f31137w;
                    } else {
                        view = ((ItemMessageBase) view).f31137w;
                    }
                } else if (!NullChecker.m81303a(this.f30819a) && TEnum.equals(this.f30819a.messageType, "literature")) {
                    InterfaceC8519a interfaceC8519a2 = ((ItemMessageBase) view).f31136v;
                    if (interfaceC8519a2 instanceof ItemRecentlySee) {
                        view = ((ItemRecentlySee) interfaceC8519a2).f31454f;
                    } else if (NullChecker.m81303a(this.f30819a)) {
                        view = ((ItemMessageBase) view).f31137w;
                    } else {
                        view = ((ItemMessageBase) view).f31137w;
                    }
                } else if (NullChecker.m81303a(this.f30819a) || !TEnum.equals(this.f30819a.messageType, MessageType.profile_like)) {
                    view = ((ItemMessageBase) view).f31137w;
                } else {
                    InterfaceC8519a interfaceC8519a3 = ((ItemMessageBase) view).f31136v;
                    if (interfaceC8519a3 instanceof ItemProfileLike) {
                        view = ((ItemProfileLike) interfaceC8519a3).f31405g;
                    } else {
                        view = ((ItemMessageBase) view).f31137w;
                    }
                }
            }
            m48332A0(view, list, m48343Q(view, list.size()));
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
