package com.p000p1.mobile.putong.core.p001ui.messages;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.RecallConfig;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.gift.message.ItemGiftMessageBase;
import com.p1.mobile.putong.core.ui.gift.message.NewItemGiftMessageBase;
import com.p1.mobile.putong.core.ui.messages.view.AiTranslateView;
import com.p1.mobile.putong.core.ui.messages.view.ItemLoveLetterMessage;
import com.p1.mobile.putong.core.ui.messages.view.MenuCustomView;
import com.p1.mobile.putong.core.ui.messages.view.MessageLinearMaxWidth;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.c40;
import l.cwf0;
import l.dg7;
import l.ffx;
import l.i0e;
import l.i0g0;
import l.j760;
import l.jf50;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.nlm0;
import l.o6j0;
import l.o7r;
import l.oa8;
import l.roj0;
import l.t100;
import l.tpd0;
import l.uly;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xp5;
import l.y4c0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import org.spongycastle.i18n.TextBundle;
import p003l.dml;
import p003l.dqy;
import p003l.e30;
import p003l.eqh0;
import p003l.fcz;
import p003l.guy;
import p003l.m250;
import p003l.tbk;
import p003l.w3z;
import p003l.w9j;
import p003l.x4q;
import p014rx.C1099c;
import p028v.VCheckBox;
import p028v.VListCell;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageBase extends ItemBase implements View.OnLongClickListener, x4q, InterfaceC0102a.a {

    /* JADX INFO: renamed from: K */
    public static int f1016K;

    /* JADX INFO: renamed from: A */
    public String f1017A;

    /* JADX INFO: renamed from: B */
    public TextView f1018B;

    /* JADX INFO: renamed from: C */
    public AudioTranslationView f1019C;

    /* JADX INFO: renamed from: D */
    public AiTranslateView f1020D;

    /* JADX INFO: renamed from: E */
    public Drawable f1021E;

    /* JADX INFO: renamed from: F */
    public ViewStub f1022F;

    /* JADX INFO: renamed from: G */
    public PopupWindow f1023G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f1024H;

    /* JADX INFO: renamed from: I */
    public VRelative f1025I;

    /* JADX INFO: renamed from: J */
    public Message f1026J;

    /* JADX INFO: renamed from: v */
    public InterfaceC0102a f1027v;

    /* JADX INFO: renamed from: w */
    public MessageLinearMaxWidth f1028w;

    /* JADX INFO: renamed from: x */
    public VText f1029x;

    /* JADX INFO: renamed from: y */
    public VText f1030y;

    /* JADX INFO: renamed from: z */
    public String f1031z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$a */
    public class RunnableC0079a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f1032a;

        public RunnableC0079a(fcz fczVar) {
            this.f1032a = fczVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1032a.m4101C3(((DbObject) ItemMessageBase.this.f710a).id);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$b */
    public class C0080b extends jf50 {
        public C0080b() {
        }

        /* JADX INFO: renamed from: b */
        public void m1461b(int i, int i2) {
            super.b(i, i2);
            ItemMessageBase.this.f1023G.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageBase$c */
    public class C0081c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jf50 f1035a;

        public C0081c(jf50 jf50Var) {
            this.f1035a = jf50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ItemMessageBase.this.m1418H().f1531f.m4309t7().f7677n1.B(this.f1035a);
        }
    }

    public ItemMessageBase(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: R */
    public static ItemMessageBase m1395R(View view) {
        return view.getParent() instanceof ItemMessageBase ? (ItemMessageBase) view.getParent() : m1395R((View) view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static boolean m1396Y(Context context) {
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        return CoreModule.c.f0.jg(((MessagesAct) context).f1531f.m4295r3(), false);
    }

    @Nullable
    private RecallConfig getRecallConfig() {
        try {
            return (RecallConfig) RemoteConfig.x().v("recall_config", RecallConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    private void setWindowBackground(float f) {
        WindowManager.LayoutParams attributes = m1418H().getWindow().getAttributes();
        attributes.alpha = f;
        m1418H().getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m1408t(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m1412x(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private long m1414y0(String str) {
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
    public final void m1416A0(View view, List<knb0<String, Runnable, Integer, Void>> list, boolean z) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow((View) menuCustomView, -2, -2);
        this.f1023G = popupWindow;
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m1455t0(this.f1023G.getWidth()), m1455t0(this.f1023G.getHeight()));
        this.f1023G.setOutsideTouchable(true);
        this.f1023G.setBackgroundDrawable(new BitmapDrawable());
        int height = 10;
        if (z) {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
            height = ((-menuCustomView.getMeasuredHeight()) - view.getHeight()) - 10;
        } else {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
        }
        this.f1023G.showAsDropDown(view, width, height, 8388611);
        C0080b c0080b = new C0080b();
        this.f1023G.setOnDismissListener(new C0081c(c0080b));
        m1418H().f1531f.m4309t7().f7677n1.n(c0080b);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1417B0() {
        RecallConfig recallConfig = getRecallConfig();
        if (recallConfig == null || !recallConfig.enable) {
            return;
        }
        if (!((Boolean) CoreModule.c.e0.S3.get()).booleanValue()) {
            CoreModule.c.e0.S3.put(Boolean.TRUE);
        }
        if (((Integer) CoreModule.c.e0.T3.get()).intValue() < 5) {
            tpd0 tpd0Var = CoreModule.c.e0.T3;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            lsi0.y("仅支持撤回2分钟内发出的消息");
        }
    }

    /* JADX INFO: renamed from: H */
    public Act m1418H() {
        return getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m1419I(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.l.i().g1() && m1433X() && this.f710a.audio() != null) {
            final fcz<? extends DbObject, ?> fczVarMo2066l = m1418H().mo2066l();
            if (fczVarMo2066l.m4286p4(((DbObject) this.f710a).id) || this.f710a.isLocal()) {
                return;
            }
            if (!fczVarMo2066l.m4205Z3(this.f710a) || !fczVarMo2066l.m4276n4(((DbObject) this.f710a).id)) {
                o6j0.h("e_chat_message_convert_to_text_hold_press_button", fczVarMo2066l.pageId(), new o6j0.a[0]);
                list.add(vwb.Z(m1418H().string(R.string.b2), new Runnable() { // from class: l.c7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2585a.m1434Z(fczVarMo2066l);
                    }
                }, Integer.valueOf(c3c0.o5), (Object) null));
            }
            if (fczVarMo2066l.m4276n4(((DbObject) this.f710a).id)) {
                list.add(vwb.Z(m1418H().string(R.string.a2), new RunnableC0079a(fczVarMo2066l), Integer.valueOf(c3c0.n5), (Object) null));
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1420J(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.l.i().E() && m1433X() && NullChecker.a(this.f710a) && TEnum.equals(this.f710a.channel, "group") && !this.f710a.isMe() && TEnum.equals(this.f710a.status(), "normal")) {
            final fcz fczVar = m1418H().f1531f;
            final ChatGroup chatGroupS6 = CoreModule.c.g0.s6(fczVar.m4295r3());
            String str = this.f710a.owner;
            final ChatGroupMember chatGroupMemberW8 = CoreModule.c.g0.W8(fczVar.m4295r3(), str);
            if (TEnum.equals(chatGroupMemberW8.status, ServletHandler.__DEFAULT_SERVLET) && m1428S(str, chatGroupS6, chatGroupMemberW8)) {
                final String strM7721o = !TextUtils.isEmpty(chatGroupMemberW8.groupMemberName()) ? tbk.m7721o(chatGroupMemberW8.groupMemberName()) : "";
                final boolean z = !chatGroupMemberW8.silence.enable || ((double) mqi0.o()) >= chatGroupMemberW8.silence.until;
                list.add(vwb.Z(z ? CoreModule.b.getString(R.string.M) : CoreModule.b.getString(R.string.J), new Runnable() { // from class: l.d7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2903a.m1438c0(fczVar, z, chatGroupMemberW8, strM7721o, chatGroupS6);
                    }
                }, Integer.valueOf(c3c0.q1), (Object) null));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m1421K(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.P().i().E() && NullChecker.a(this.f710a) && m1433X() && TEnum.equals(this.f710a.channel, "group") && TEnum.equals(this.f710a.status(), "normal")) {
            final fcz fczVar = m1418H().f1531f;
            list.add(vwb.Z(getResources().getString(R.string.O2), new Runnable() { // from class: l.m6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5558a.m1440e0(fczVar);
                }
            }, Integer.valueOf(c3c0.t1), (Object) null));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m1422L(List<knb0<String, Runnable, Integer, Void>> list) {
        if (!m1429T(this.f710a, true) && this.f710a.isMe() && TEnum.equals(this.f710a.status(), "normal")) {
            Message message = this.f710a;
            if (message.likeOfMoment != null || message.messageType().isUnknownType()) {
                return;
            }
            if ((!this.f710a.isGroupMessage() && CoreModule.c.e0.Pa(this.f710a.cid).unilateralBlock()) || TEnum.equals(this.f710a.messageType, "reminder") || TEnum.equals(this.f710a.messageType, "group_invitation") || TEnum.equals(this.f710a.messageType(), "picture_text_deeplink")) {
                return;
            }
            if ((CoreModule.P().b().Yg() && !NullChecker.a(this.f1026J) && CoreModule.P().b().sc(CoreModule.c.f0.Xe(this.f710a.cid))) || TEnum.equals(this.f710a.messageType, "moment_user_state") || xp5.f(CoreModule.c.f0.Xe(this.f710a.cid))) {
                return;
            }
            list.add(vwb.Z(getResources().getString(R.string.K4), new Runnable() { // from class: l.x6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8736a.m1444i0();
                }
            }, Integer.valueOf(c3c0.u1), (Object) null));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1423M(List<knb0<String, Runnable, Integer, Void>> list) {
        MessagesAct messagesActM1418H = m1418H();
        if (m1433X()) {
            guy guyVarM6499g0 = messagesActM1418H.mo2046A0().m6499g0();
            dqy dqyVarM4846u0 = guyVarM6499g0.m4846u0();
            if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0()) {
                return;
            }
            MessageBar messageBarM4844t0 = guyVarM6499g0.m4844t0();
            if (NullChecker.a(messageBarM4844t0) && messageBarM4844t0.getVisibility() == 8) {
                return;
            }
            int i = c3c0.v1;
            if (NullChecker.a(this.f710a) && m1433X() && TEnum.equals(this.f710a.channel, "group") && !this.f710a.isLocal()) {
                if (TEnum.equals(this.f710a.messageType, TextBundle.TEXT_ENTRY) || TEnum.equals(this.f710a.messageType, "sticker")) {
                    final fcz fczVar = m1418H().f1531f;
                    list.add(vwb.Z(getResources().getString(R.string.T2), new Runnable() { // from class: l.b7q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2348a.m1445j0(fczVar);
                        }
                    }, Integer.valueOf(i), (Object) null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1424N(List<knb0<String, Runnable, Integer, Void>> list) {
        AiTranslateView aiTranslateView;
        Message message = this.f710a;
        if (message != null && (this.f1027v instanceof ItemText) && (aiTranslateView = this.f1020D) != null && aiTranslateView.Y(message)) {
            if ((m1418H() instanceof MessagesAct) && User.isTeamAccount(m1418H().f1531f.m4295r3())) {
                return;
            }
            list.add(0, vwb.Z(getResources().getString(R.string.U3), new Runnable() { // from class: l.f7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3462a.m1448m0();
                }
            }, Integer.valueOf(c3c0.y1), (Object) null));
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m1425O() {
        if (m1418H() instanceof MessagesAct) {
            return m1418H().mo2066l().m4184V2();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final void m1426P(Message message) {
        CoreModule.c.f0.Rf(message.cid, vwb.f0(new Message[]{message})).subscribe((m250) mkd0.H(new e30() { // from class: l.u6q
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemMessageBase.m1408t((roj0) obj);
            }
        }, new e30() { // from class: l.v6q
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemMessageBase.m1412x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m1427Q(View view, int i) {
        if (!m1433X()) {
            return false;
        }
        MessageBar messageBarM4844t0 = m1418H().f1531f.m6497e0().mo2046A0().m6499g0().m4844t0();
        int iD = t100.d(30.0f) + (t100.d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarM4844t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iD2 = iArr2[1] - t100.d(40.0f);
        boolean z = iD2 > height;
        if (!z || iD2 >= iD) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m1428S(String str, ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        if (chatGroup == null || chatGroupMember == null) {
            return false;
        }
        return (!vwb.J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.H().userId()) && !chatGroup.adminUserIds.contains(str) && !TextUtils.equals(str, chatGroup.ownerUserId)) || TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: T */
    public final boolean m1429T(Message message, boolean z) {
        if (z && !((Boolean) CoreModule.c.e0.S3.get()).booleanValue()) {
            return false;
        }
        RecallConfig recallConfig = getRecallConfig();
        if (NullChecker.a(recallConfig)) {
            int i = recallConfig.minutes;
            if (recallConfig.enable && i > 0 && message.createdTime + (((long) (i * 1000)) * 60) < mqi0.o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void mo1430U(int i, View view, int i2, boolean z) {
        View viewInflate = o7r.a(getContext()).inflate(i, (ViewGroup) this.f1028w, false);
        this.f716g = viewInflate;
        this.f1028w.addView(viewInflate, 0);
        InterfaceC0102a interfaceC0102a = (InterfaceC0102a) this.f716g.findViewById(y4c0.Z);
        this.f1027v = interfaceC0102a;
        if (!z && (interfaceC0102a instanceof ItemAudio)) {
            this.f716g = (View) interfaceC0102a;
        }
        interfaceC0102a.mo1062m(i2, z, this);
        this.f1021E = this.f716g.getBackground();
    }

    /* JADX INFO: renamed from: V */
    public boolean m1431V() {
        if (CoreModule.P().i().t4(m1418H())) {
            return CoreModule.P().i().B2(m1418H());
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean m1432W(BubbleInfo bubbleInfo) {
        return NullChecker.a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis()) && !TextUtils.isEmpty(bubbleInfo.value);
    }

    /* JADX INFO: renamed from: X */
    public boolean m1433X() {
        return m1418H() instanceof MessagesAct;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m1434Z(fcz fczVar) {
        o6j0.c("e_chat_message_convert_to_text_hold_press_button", fczVar.pageId(), new o6j0.a[0]);
        fczVar.m4289p7(this.f710a, false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a.a
    /* JADX INFO: renamed from: a */
    public void mo1435a() {
        performLongClick();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m1436a0(ChatGroup chatGroup) {
        zvf0.u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", new j760[]{vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("user_id", this.f710a.owner), vwb.Y("is_confirm", 2)});
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m1437b0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z) {
        zvf0.u("e_group_chat_prohibit", "p_group_chat_confirm_prohibit", new j760[]{vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("user_id", this.f710a.owner), vwb.Y("is_confirm", 1)});
        CoreModule.c.g0.n6(chatGroupMember.groupId, chatGroupMember.userId, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m1438c0(fcz fczVar, final boolean z, final ChatGroupMember chatGroupMember, String str, final ChatGroup chatGroup) {
        zvf0.u("e_group_chat_message_click", fczVar.pageId(), new j760[]{vwb.Y("function", z ? "prohibit" : "unmute")});
        if (z) {
            w3z.m8439K(m1418H(), z, str, new Runnable() { // from class: l.g7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3810a.m1436a0(chatGroup);
                }
            }, new Runnable() { // from class: l.h7q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4150a.m1437b0(chatGroup, chatGroupMember, z);
                }
            });
        } else {
            CoreModule.c.g0.n6(chatGroupMember.groupId, chatGroupMember.userId, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m1439d0() {
        m1426P(this.f710a);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m1440e0(fcz fczVar) {
        zvf0.u("e_group_chat_message_click", fczVar.pageId(), new j760[]{vwb.Y("function", "delete")});
        w3z.m8468z(m1418H(), new Runnable() { // from class: l.o6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f6049a.m1439d0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m1441f0(roj0 roj0Var) {
        m1417B0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
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
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        final Message message4;
        boolean z;
        super.mo1114g(dmlVar, message, message2, message3);
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC0102a).setLetterUser(this.f717h);
        }
        if (CoreModule.l.i().g1()) {
            InterfaceC0102a interfaceC0102a2 = this.f1027v;
            if (interfaceC0102a2 instanceof ItemAudio) {
                ((ItemAudio) interfaceC0102a2).setAudioTranslationView(this.f1019C);
            } else {
                xdl0.M(this.f1019C, false);
            }
        } else {
            xdl0.M(this.f1019C, false);
        }
        if (this.f1020D != null) {
            message4 = message;
            this.f1020D.X(message4, m1418H() instanceof MessagesAct ? m1418H().f1531f.m4295r3() : "", this.f716g, this.f1028w, this.f1021E);
        } else {
            message4 = message;
        }
        boolean z2 = this instanceof ItemMessageLeft;
        if ((z2 && (this.f1027v instanceof ItemText)) || (((z = this instanceof ItemMessageRight)) && (this.f1027v instanceof ItemText))) {
            if (ura.e().d().I4()) {
                ((ItemText) this.f1027v).setLinkTextColor(getResources().getColor(a1c0.j));
            }
            this.f1027v.mo1210y(message4, this);
        } else if ((z2 && (this.f1027v instanceof ItemFeedStates)) || ((z && (this.f1027v instanceof ItemFeedStates)) || ((z2 && (this.f1027v instanceof ItemProfileLike)) || ((z && (this.f1027v instanceof ItemLoveLetterMessage)) || ((z && (this.f1027v instanceof ItemProfileLike)) || ((z2 && (this.f1027v instanceof ItemRecentlySee)) || ((z2 && (this.f1027v instanceof ItemLoveLetterMessage)) || (z && (this.f1027v instanceof ItemRecentlySee))))))))) {
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setOnLongClickListener(null);
            }
            this.f1027v.mo1068U(dmlVar, message4, this);
        } else {
            InterfaceC0102a interfaceC0102a3 = this.f1027v;
            if ((interfaceC0102a3 instanceof ItemExclusiveInviteLayout) || (interfaceC0102a3 instanceof ItemSticker) || (interfaceC0102a3 instanceof ItemMessageFakeLockItem) || (interfaceC0102a3 instanceof ItemMessageDynamicComments) || (interfaceC0102a3 instanceof ItemPrologueRight) || (interfaceC0102a3 instanceof ItemPrologueLeft) || (interfaceC0102a3 instanceof ItemAiPermissionLayout) || (interfaceC0102a3 instanceof ItemAiPictureLeft)) {
                interfaceC0102a3.mo1068U(dmlVar, message4, this);
            } else {
                interfaceC0102a3.mo1056A(message4);
            }
        }
        xdl0.M(this.f1018B, TEnum.equals(message4.sentFrom, "apple_watch"));
        if (this.f1018B.getVisibility() != 8 && this.f1018B.getText().length() == 0) {
            this.f1018B.setText(i0g0.a0(m1418H().string(R.string.X5), '@', m1418H().drawable(c3c0.I7)));
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f1031z);
        AppCompatTextView appCompatTextView = this.f1029x;
        if (zIsEmpty) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            this.f1029x.setText(this.f1031z);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1017A);
        AppCompatTextView appCompatTextView2 = this.f1030y;
        if (zIsEmpty2) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setVisibility(0);
            this.f1030y.setText(this.f1017A);
        }
        if ((m1418H() instanceof MessagesAct) && m1418H().m2050D2()) {
            xdl0.M(this.f1025I, true);
            if (m1418H().mo2051E() != null) {
                final uly ulyVarMo2051E = m1418H().mo2051E();
                this.f1024H.setChecked(ulyVarMo2051E.m0().contains(((DbObject) message4).id));
                this.f1025I.setOnClickListener(new View.OnClickListener() { // from class: l.p6q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f6324a.m1454s0(ulyVarMo2051E, message4, view);
                    }
                });
            }
        } else {
            xdl0.M(this.f1025I, false);
        }
        this.f1026J = message2;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m1442g0(Throwable th) {
        if (CoreModule.P().i().E() && TEnum.equals(this.f710a.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        lsi0.h(R.string.u4);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    public String getContentLayoutInfo() {
        return NullChecker.a(this.f1027v) ? this.f1027v.getClass().getName() : super.getContentLayoutInfo();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m1443h0(c40[] c40VarArr, VListCell vListCell, VListCell.C1338a c1338a, int i) {
        if (m1429T(this.f710a, false)) {
            m1417B0();
            c40VarArr[0].b();
        } else {
            CoreModule.c.f0.In(this.f710a).subscribe((m250) mkd0.H(new e30() { // from class: l.z6q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9266a.m1441f0((roj0) obj);
                }
            }, new e30() { // from class: l.a7q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2088a.m1442g0((Throwable) obj);
                }
            }));
            c40VarArr[0].b();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m1444i0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.K4));
        c40 c40VarF = new c40.b(m1418H()).L(getResources().getString(R.string.t4)).I(getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.s6q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.t6q
            /* JADX INFO: renamed from: a */
            public final void m7703a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                this.f7412a.m1443h0(c40VarArr, vListCell, c1338a, i);
            }
        }).F();
        c40VarF.f();
        final c40[] c40VarArr = {c40VarF};
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m1445j0(final fcz fczVar) {
        zvf0.u("e_group_chat_message_click", fczVar.pageId(), new j760[]{vwb.Y("function", "reply")});
        CoreModule.c.f0.Ne(this.f710a.cid).filter(new oa8()).flatMap(new w9j() { // from class: l.i7q
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4376a.m1446k0((Conversation) obj);
            }
        }).filter(new dg7()).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.n6q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5840a.m1447l0(fczVar, (ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C1099c m1446k0(Conversation conversation) {
        return CoreModule.c.g0.T6(conversation.otherUser, this.f710a.owner);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m1447l0(fcz fczVar, ChatGroupMember chatGroupMember) {
        fczVar.m4224c7(this.f710a);
        fczVar.m6497e0().mo2046A0().m6499g0().m4810b2(chatGroupMember.groupMemberName(), this.f710a.value);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m1448m0() {
        zvf0.r("e_intl_ai_translate", "p_chat_view");
        AiTranslateView aiTranslateView = this.f1020D;
        if (aiTranslateView != null) {
            aiTranslateView.i0(((ItemText) this.f1027v).getWidth(), m1418H());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m1449n0(fcz fczVar, View view) {
        zvf0.x("e_quickchat_prevent_harassment", m1418H().pageId());
        zvf0.u("e_quickchat_prevent_harassment", m1418H().pageId(), new j760[]{vwb.Y("harassment_choose", "unmatch")});
        if (m1433X()) {
            CoreModule.P().i().Y5(m1418H(), fczVar.m4295r3(), "");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m1450o0(fcz fczVar, View view) {
        zvf0.x("e_quickchat_prevent_harassment", m1418H().pageId());
        zvf0.u("e_quickchat_prevent_harassment", m1418H().pageId(), new j760[]{vwb.Y("harassment_choose", "staymatch")});
        CoreModule.P().i().L(fczVar.m4295r3());
        m1456u0(false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1028w = findViewById(y4c0.U0);
        this.f1018B = (TextView) findViewById(y4c0.e4);
        this.f1029x = (VText) findViewById(y4c0.g1);
        this.f1030y = (VText) findViewById(y4c0.T0);
        this.f1019C = (AudioTranslationView) findViewById(y4c0.n);
        this.f1020D = findViewById(y4c0.d);
        this.f1022F = (ViewStub) findViewById(y4c0.B3);
        this.f1024H = (VCheckBox) findViewById(y4c0.i3);
        this.f1025I = (VRelative) findViewById(y4c0.J);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int i;
        if ((NullChecker.a(this.f710a) && TEnum.equals(this.f710a.messageType, "icebreak_qa")) || (i = this.f710a.localFailType) == 3 || i == 4 || CoreModule.l.i().t4(m1418H()) || m1396Y(getContext())) {
            return false;
        }
        if (nlm0.c() && NullChecker.a(this.f710a) && TEnum.equals(this.f710a.messageType, "voice_call_invitation")) {
            return false;
        }
        if (!nlm0.c() && NullChecker.a(this.f710a) && (TEnum.equals(this.f710a.messageType, "voice_call_invitation") || TEnum.equals(this.f710a.messageType, "voice_call"))) {
            return false;
        }
        if (NullChecker.a(this.f710a) && (TEnum.equals(this.f710a.messageType, "chat_gift") || TEnum.equals(this.f710a.messageType, "moment_gift") || TEnum.equals(this.f710a.messageType, "marriage_prologue"))) {
            return false;
        }
        List<knb0<String, Runnable, Integer, Void>> listMo1057J = this.f1027v.mo1057J();
        if (listMo1057J == null) {
            listMo1057J = new ArrayList<>();
        }
        m1424N(listMo1057J);
        m1419I(listMo1057J);
        m1422L(listMo1057J);
        m1423M(listMo1057J);
        m1421K(listMo1057J);
        m1420J(listMo1057J);
        m1458w0(listMo1057J);
        m1460z0(view, listMo1057J);
        if (!CoreModule.l.i().E() || !(m1418H() instanceof MessagesAct) || !m1418H().f1531f.m4231e4() || !NullChecker.a(this.f710a)) {
            return true;
        }
        zvf0.A("e_group_chat_message", m1418H().f1531f.pageId(), new j760[]{vwb.Y("message_id", ((DbObject) this.f710a).id), vwb.Y("user_id", this.f710a.owner)});
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        f1016K = ffx.d(i) - t100.d(104.0f);
        View childAt = this.f1028w.getChildAt(0);
        if ((childAt instanceof ItemRealShot) || (childAt instanceof NewItemGiftMessageBase) || (childAt instanceof ItemGiftMessageBase)) {
            f1016K = ffx.d(i);
        }
        this.f1028w.setMaxWidth(f1016K);
        if (CoreModule.l.i().g1()) {
            this.f1019C.setMaxWidth(f1016K);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m1451p0(ChatGroup chatGroup) {
        zvf0.u("e_group_chat_remove", "p_group_chat_remove", new j760[]{vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("is_confirm", 2), vwb.Y("user_id", this.f710a.owner)});
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m1452q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        zvf0.u("e_group_chat_remove", "p_group_chat_remove", new j760[]{vwb.Y("groupchat_id", ((DbObject) chatGroup).id), vwb.Y("is_confirm", 1), vwb.Y("user_id", this.f710a.owner)});
        CoreModule.c.g0.b9(chatGroupMember.groupId, chatGroupMember.userId);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m1453r0(fcz fczVar, final ChatGroup chatGroup, String str, final ChatGroupMember chatGroupMember) {
        zvf0.u("e_group_chat_message_click", fczVar.pageId(), new j760[]{vwb.Y("function", "remove")});
        cwf0 cwf0Var = new cwf0("p_group_chat_remove", Dialog.class.getName());
        cwf0Var.p(new j760[]{vwb.Y("is_anonymou_group", TEnum.equals(chatGroup.groupType, "anonymous") ? "1" : "0")});
        i0e.f(cwf0Var);
        w3z.m8431C(m1418H(), str, new Runnable() { // from class: l.q6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f6595a.m1451p0(chatGroup);
            }
        }, new Runnable() { // from class: l.r6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f6796a.m1452q0(chatGroup, chatGroupMember);
            }
        }, cwf0Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m1454s0(uly ulyVar, Message message, View view) {
        if (this.f1024H.isChecked()) {
            if (ulyVar.t0(((DbObject) message).id, message.createdTime, false)) {
                this.f1024H.setChecked(false);
            }
        } else if (ulyVar.t0(((DbObject) message).id, message.createdTime, true)) {
            this.f1024H.setChecked(true);
        }
    }

    public void setFooterTip(String str) {
        this.f1017A = str;
    }

    public void setHeaderTip(String str) {
        this.f1031z = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m1455t0(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1456u0(boolean z) {
        xdl0.M(findViewById(y4c0.L), z);
        xdl0.M(findViewById(y4c0.F3), !z);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m1457v0(Message message) {
        if (CoreModule.P().i().v() && TEnum.equals(message.messageType, "voice_call") && NullChecker.a(message.additionalData) && VoiceCallStatus.get(message.additionalData.status).equals("finished") && m1433X()) {
            final fcz<? extends DbObject, ?> fczVarMo2066l = m1418H().mo2066l();
            if (CoreModule.P().i().j5(fczVarMo2066l.f3551k) && CoreModule.P().i().T5(fczVarMo2066l.m4295r3()) && m1414y0(message.additionalData.duration) <= 30) {
                ViewStub viewStub = this.f1022F;
                if (viewStub != null) {
                    xdl0.M(viewStub, true);
                    TextView textView = (TextView) findViewById(y4c0.Q4);
                    textView.setTypeface(eqh0.m3924c(3), 1);
                    ImageView imageView = (ImageView) findViewById(y4c0.P2);
                    TextView textView2 = (TextView) findViewById(y4c0.I4);
                    TextView textView3 = (TextView) findViewById(y4c0.F3);
                    TextView textView4 = (TextView) findViewById(y4c0.o5);
                    TextView textView5 = (TextView) findViewById(y4c0.d2);
                    if (ura.e().d().I4()) {
                        textView.setTextColor(getResources().getColor(a1c0.g));
                        textView2.setTextColor(getResources().getColor(a1c0.i));
                        textView3.setTextColor(getResources().getColor(a1c0.i));
                        textView4.setTextColor(getResources().getColor(a1c0.g));
                        textView5.setTextColor(getResources().getColor(a1c0.g));
                        imageView.setBackground(null);
                        xdl0.N(imageView, c3c0.X5);
                    }
                    if (CoreModule.P().i().p3(fczVarMo2066l.m4295r3())) {
                        m1456u0(false);
                    } else {
                        m1456u0(true);
                        xdl0.E0(findViewById(y4c0.o5), new View.OnClickListener() { // from class: l.w6q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f8502a.m1449n0(fczVarMo2066l, view);
                            }
                        });
                        xdl0.E0(findViewById(y4c0.d2), new View.OnClickListener() { // from class: l.y6q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f8926a.m1450o0(fczVarMo2066l, view);
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
    public final void m1458w0(List<knb0<String, Runnable, Integer, Void>> list) {
        if (CoreModule.l.i().E() && m1433X() && NullChecker.a(this.f710a) && TEnum.equals(this.f710a.channel, "group") && !this.f710a.isMe() && TEnum.equals(this.f710a.status(), "normal")) {
            final fcz fczVar = m1418H().f1531f;
            final ChatGroup chatGroupS6 = CoreModule.c.g0.s6(fczVar.m4295r3());
            String str = this.f710a.owner;
            final ChatGroupMember chatGroupMemberW8 = CoreModule.c.g0.W8(fczVar.m4295r3(), str);
            if (NullChecker.a(chatGroupMemberW8) && NullChecker.a(chatGroupS6) && TEnum.equals(chatGroupMemberW8.status, ServletHandler.__DEFAULT_SERVLET) && m1428S(str, chatGroupS6, chatGroupMemberW8)) {
                final String strM7721o = !TextUtils.isEmpty(chatGroupMemberW8.groupMemberName()) ? tbk.m7721o(chatGroupMemberW8.groupMemberName()) : "";
                list.add(vwb.Z(CoreModule.b.getString(R.string.I0), new Runnable() { // from class: l.e7q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3218a.m1453r0(fczVar, chatGroupS6, strM7721o, chatGroupMemberW8);
                    }
                }, Integer.valueOf(c3c0.w1), (Object) null));
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m1459x0(Message message) {
        if (m1457v0(message)) {
            return;
        }
        xdl0.M(this.f1022F, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.p1.mobile.putong.core.ui.messages.ItemBase, com.p1.mobile.putong.core.ui.messages.ItemMessageBase] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: z0 */
    public final void m1460z0(View view, List<knb0<String, Runnable, Integer, Void>> list) {
        ?? r3;
        if (view == null) {
            return;
        }
        if (!(CoreModule.l.i().G1() && vwb.J(list)) && m1433X()) {
            view.getLocationOnScreen(new int[2]);
            if (view instanceof ItemMessageBase) {
                if (NullChecker.a(this.f710a) && (TEnum.equals(this.f710a.messageType, "state_like") || TEnum.equals(this.f710a.messageType, "state_comment"))) {
                    r3 = view;
                    r3 = view;
                    InterfaceC0102a interfaceC0102a = ((ItemMessageBase) view).f1027v;
                    if (interfaceC0102a instanceof ItemFeedStates) {
                        r3 = ((ItemFeedStates) interfaceC0102a).f843i;
                    } else {
                        r3 = view;
                        r3 = view;
                        if (!NullChecker.a(this.f710a)) {
                            if (NullChecker.a(this.f710a)) {
                                r3 = ((ItemMessageBase) view).f1028w;
                            } else {
                                r3 = ((ItemMessageBase) view).f1028w;
                            }
                        } else if (NullChecker.a(this.f710a)) {
                            r3 = ((ItemMessageBase) view).f1028w;
                        } else {
                            r3 = ((ItemMessageBase) view).f1028w;
                        }
                    }
                } else {
                    r3 = view;
                    r3 = view;
                    if (!NullChecker.a(this.f710a) && TEnum.equals(this.f710a.messageType, "literature")) {
                        InterfaceC0102a interfaceC0102a2 = ((ItemMessageBase) view).f1027v;
                        if (interfaceC0102a2 instanceof ItemRecentlySee) {
                            r3 = ((ItemRecentlySee) interfaceC0102a2).f1345f;
                        } else if (NullChecker.a(this.f710a)) {
                            r3 = ((ItemMessageBase) view).f1028w;
                        } else {
                            r3 = ((ItemMessageBase) view).f1028w;
                        }
                    } else if (NullChecker.a(this.f710a) || !TEnum.equals(this.f710a.messageType, "profile_like")) {
                        r3 = ((ItemMessageBase) view).f1028w;
                    } else {
                        InterfaceC0102a interfaceC0102a3 = ((ItemMessageBase) view).f1027v;
                        if (interfaceC0102a3 instanceof ItemProfileLike) {
                            r3 = ((ItemProfileLike) interfaceC0102a3).f1296g;
                        } else {
                            r3 = ((ItemMessageBase) view).f1028w;
                        }
                    }
                }
            }
            r3 = view;
            m1416A0(r3, list, m1427Q(r3, list.size()));
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
