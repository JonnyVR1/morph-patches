package com.p000p1.mobile.putong.core.p001ui.messages;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageRight;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.MomentAction;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.IntlMessageReadReceiptsView;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.LocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.a1c0;
import l.c40;
import l.hap;
import l.j760;
import l.jdm;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.roj0;
import l.rw6;
import l.t100;
import l.ura;
import l.vwb;
import l.wmz;
import l.x1c0;
import l.xdl0;
import l.xp5;
import l.y19;
import l.y4c0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p003l.d30;
import p003l.dml;
import p003l.e30;
import p003l.fcz;
import p003l.j000;
import p003l.m250;
import p003l.r7q;
import p003l.ruy;
import p003l.tbk;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VListCell;
import p028v.VProgressBar;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageRight extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: R0 */
    public static c40 f1122R0;

    /* JADX INFO: renamed from: E0 */
    public VText f1123E0;

    /* JADX INFO: renamed from: F0 */
    public FrameLayout f1124F0;

    /* JADX INFO: renamed from: G0 */
    public VText f1125G0;

    /* JADX INFO: renamed from: H0 */
    public VText f1126H0;

    /* JADX INFO: renamed from: I0 */
    public HeaderFrameWrapper f1127I0;

    /* JADX INFO: renamed from: J0 */
    public long f1128J0;

    /* JADX INFO: renamed from: K0 */
    public double f1129K0;

    /* JADX INFO: renamed from: L */
    public ImageView f1130L;

    /* JADX INFO: renamed from: L0 */
    public boolean f1131L0;

    /* JADX INFO: renamed from: M */
    public View f1132M;

    /* JADX INFO: renamed from: M0 */
    public boolean f1133M0;

    /* JADX INFO: renamed from: N */
    public Message f1134N;

    /* JADX INFO: renamed from: N0 */
    public AnimatorSet f1135N0;

    /* JADX INFO: renamed from: O */
    public FrameLayout f1136O;

    /* JADX INFO: renamed from: O0 */
    public boolean f1137O0;

    /* JADX INFO: renamed from: P */
    public VDraweeView f1138P;

    /* JADX INFO: renamed from: P0 */
    public int f1139P0;

    /* JADX INFO: renamed from: Q */
    public VImage f1140Q;

    /* JADX INFO: renamed from: Q0 */
    public d30 f1141Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f1142R;

    /* JADX INFO: renamed from: S */
    public VText f1143S;

    /* JADX INFO: renamed from: T */
    public VText f1144T;

    /* JADX INFO: renamed from: U */
    public VImage f1145U;

    /* JADX INFO: renamed from: V */
    public IntlMessageReadReceiptsView f1146V;

    /* JADX INFO: renamed from: W */
    public FrameLayout f1147W;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f1148k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f1149p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageRight$a */
    public class C0089a implements C0107b.c {
        public C0089a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: a */
        public String mo1506a() {
            return ItemMessageRight.this.f1134N.owner;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: b */
        public String mo1507b() {
            return ItemMessageRight.this.f1134N.cid;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: c */
        public boolean mo1508c() {
            return CoreModule.P().i().D() && !User.isTeamAccount(ItemMessageRight.this.f1134N.cid);
        }
    }

    public ItemMessageRight(Context context) {
        super(context);
        this.f1128J0 = -10L;
        this.f1133M0 = true;
        this.f1137O0 = false;
        this.f1139P0 = -1;
        this.f1141Q0 = new d30() { // from class: l.a9q
            @Override // p003l.d30
            public final void call() {
                this.f2094a.m1554c1();
            }
        };
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m1531G0(Act act, final Message message, VListCell vListCell, VListCell.C1338a c1338a, int i) {
        String string = c1338a.f12784a.toString();
        if (act.getResources().getString(R.string.g).equals(string)) {
            MessageType messageType = message.messageType;
            if (messageType == null || TEnum.equals(messageType, ServletHandler.__DEFAULT_SERVLET) || TEnum.equals(message.messageType, "unknown_")) {
                message.messageType = message.messageType();
            }
            boolean z = act instanceof MessagesAct;
            if (z && TEnum.equals(message.messageType(), "chat_gift")) {
                ((MessagesAct) act).mo2066l().m4140L2(message, true, null);
            }
            if (z && message.localFailType == 9) {
                message.secondSend = true;
            }
            if (z && TEnum.equals(message.messageType(), "moment_comment")) {
                MessageReference messageReferenceNew_ = MessageReference.new_();
                messageReferenceNew_.action = MomentAction.get("comment");
                messageReferenceNew_.id = message.moment;
                messageReferenceNew_.type = "moment";
                message.api_only_reference = messageReferenceNew_;
                CoreModule.c.f0.Dn(message.cid, message, (Sticker) null).subscribe((m250) mkd0.H(new e30() { // from class: l.h9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        CoreModule.c.f0.b0.onNext(message);
                    }
                }, new e30() { // from class: l.i9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        ItemMessageRight.m1537M0((Throwable) obj);
                    }
                }));
            } else if (z) {
                CoreModule.c.f0.Dn(message.cid, message, (Sticker) null).subscribe((m250) mkd0.H(new e30() { // from class: l.j9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        CoreModule.c.f0.b0.onNext(message);
                    }
                }, new e30() { // from class: l.k9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        ItemMessageRight.m1535K0((Throwable) obj);
                    }
                }));
            } else if (CoreModule.P().i().t4(act)) {
                CoreModule.P().i().e0(act, message);
            }
            c40 c40Var = f1122R0;
            if (c40Var != null) {
                c40Var.b();
            }
        } else if (act.getResources().getString(R.string.d).equals(string)) {
            if (CoreModule.P().i().t4(act)) {
                CoreModule.c.r0.t6(((DbObject) message)._id);
            } else {
                CoreModule.c.f0.yn(((DbObject) message)._id);
            }
        }
        c40 c40Var2 = f1122R0;
        if (c40Var2 != null) {
            c40Var2.b();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m1533I0(Throwable th) {
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m1535K0(Throwable th) {
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m1537M0(Throwable th) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m1546V0(View view) {
        c40 c40Var = f1122R0;
        if (c40Var != null) {
            c40Var.b();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public static void m1547p1(final Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R.string.g));
        arrayList.add(act.getResources().getString(R.string.d));
        c40.b bVar = new c40.b(act);
        bVar.I(act.getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.l9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMessageRight.m1546V0(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.m9q
            /* JADX INFO: renamed from: a */
            public final void m6326a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                ItemMessageRight.m1531G0(act, message, vListCell, c1338a, i);
            }
        });
        c40 c40VarF = bVar.F();
        f1122R0 = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadStateLayoutParams(boolean z) {
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
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase
    /* JADX INFO: renamed from: U */
    public void mo1430U(int i, View view, int i2, boolean z) {
        super.mo1430U(i, view, i2, z);
        setPivotX(view.getMeasuredWidth() - t100.d(6.0f));
        this.f1132M = findViewById(y4c0.d4);
        this.f1130L = (ImageView) findViewById(y4c0.P0);
        this.f1136O = (FrameLayout) findViewById(y4c0.u3);
        HeaderFrameWrapper headerFrameWrapperFindViewById = findViewById(y4c0.s3);
        this.f1127I0 = headerFrameWrapperFindViewById;
        this.f1138P = headerFrameWrapperFindViewById.get_pic();
        if (CoreModule.P().i().D() && m1425O()) {
            C0107b.m2164r(this.f1138P, new C0089a(), new View.OnClickListener() { // from class: l.n9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5851a.m1551Z0(view2);
                }
            });
        }
        xdl0.E0(this.f1138P, new View.OnClickListener() { // from class: l.o9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6072a.m1552a1(view2);
            }
        });
        this.f1140Q = (VImage) findViewById(y4c0.r5);
        this.f1142R = (LinearLayout) findViewById(y4c0.C3);
        this.f1143S = (VText) findViewById(y4c0.J1);
        this.f1144T = (VText) findViewById(y4c0.E3);
        this.f1145U = (VImage) findViewById(y4c0.D3);
        this.f1146V = findViewById(y4c0.A1);
        FrameLayout frameLayout = (FrameLayout) findViewById(y4c0.I1);
        this.f1147W = frameLayout;
        this.f1148k0 = (VDraweeView) frameLayout.findViewById(y4c0.i0);
        this.f1149p0 = (VDraweeView) this.f1147W.findViewById(y4c0.j0);
        this.f1123E0 = (VText) this.f1147W.findViewById(y4c0.k0);
        this.f1124F0 = (FrameLayout) findViewById(y4c0.H1);
        this.f1126H0 = (VText) findViewById(y4c0.y);
        this.f1125G0 = (VText) findViewById(y4c0.S0);
        this.f1132M.setOnClickListener(null);
        if (ura.e().d().I4()) {
            this.f1125G0.setTextColor(getResources().getColor(a1c0.i));
            this.f1143S.setTextColor(getResources().getColor(a1c0.i));
            this.f1126H0.setTextColor(getResources().getColor(a1c0.i));
            this.f1123E0.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m1548W0(long j, long j2, long j3, long j4) {
        return j2 <= j || j4 < j3;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m1549X0() {
        if (m1433X()) {
            fcz fczVar = m1418H().f1531f;
            o6j0.c("e_chat_avatar", m1418H().pageId(), new o6j0.a[]{o6j0.a.h("click_user_id", this.f1134N.owner), o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), this.f1134N.owner)))});
            fczVar.m4313u6();
        } else if (CoreModule.P().i().t4(m1418H())) {
            o6j0.c("e_kankan_chat_head", "p_kankan_chat_popup", new o6j0.a[]{o6j0.a.h("user_id", ((DbObject) CoreModule.c.e0.p9()).id)});
            CoreModule.P().i().G5(m1418H());
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m1550Y0() {
        xdl0.M0(this.f1130L, false);
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemImages) {
            ((ItemImages) interfaceC0102a).m1295c();
            return;
        }
        if (interfaceC0102a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC0102a).m1091d();
        } else if (interfaceC0102a instanceof ItemAiPictureLeft) {
            ((ItemAiPictureLeft) interfaceC0102a).m1079k();
        } else {
            xdl0.M0(this.f1132M, false);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m1551Z0(View view) {
        m1549X0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m1552a1(View view) {
        m1549X0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m1553b1() {
        if (m1433X()) {
            m1418H().f1531f.f3527L.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m1554c1() {
        CoreModule.P().i().Y2();
        CoreModule.P().i().o3(m1418H(), "haveRead", new d30() { // from class: l.p9q
            @Override // p003l.d30
            public final void call() {
                this.f6335a.m1553b1();
            }
        }, m1418H().pageId());
        CoreModule.P().i().S4(false);
        if (m1433X()) {
            m1418H().f1531f.f3527L.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m1555d1(View view) {
        this.f1141Q0.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m1556e1() {
        if (this.f1128J0 == ((DbObject) this.f1134N)._id) {
            m1569s1();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo1113f(User user, String str, LocalStatus localStatus) {
        super.mo1113f(user, str, localStatus);
        this.f1127I0.E0(false, "p_chat_view");
        if (m1431V()) {
            qib0.G.L0(this.f1138P, user.getAnonymousUrl());
            this.f1127I0.G0(false);
        } else {
            this.f1127I0.v0(user, rw6.b(user).profileSmall());
        }
        xdl0.M(this.f1140Q, false);
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC0102a).m1275b(str);
            m1550Y0();
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m1557f1(User user) {
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(m1418H().f1531f.m4295r3());
        if (NullChecker.a(chatGroupS6) && tbk.m7725s(chatGroupS6)) {
            this.f1127I0.B0(tbk.m7717k(user));
            return;
        }
        this.f1127I0.setShowSVipFrame(false);
        this.f1127I0.t0(user);
        xdl0.M(this.f1140Q, false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase, com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, final Message message, Message message2, Message message3) {
        super.mo1114g(dmlVar, message, message2, message3);
        this.f1127I0.E0(false, "p_chat_view");
        if (CoreModule.P().i().G1()) {
            setPivotX(xdl0.y0() - t100.h);
        }
        m1550Y0();
        if (TEnum.equals(message.status(), "sending")) {
            long j = message.localCreatedTime;
            long jNanoTime = System.nanoTime() - 1000000000;
            long j2 = ((DbObject) message)._id;
            if (j > jNanoTime) {
                this.f1128J0 = j2;
                postDelayed(new Runnable() { // from class: l.q9q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6612a.m1556e1();
                    }
                }, 1000L);
            } else {
                this.f1128J0 = j2;
                m1569s1();
            }
        } else if (TEnum.equals(message.status(), "failed")) {
            this.f1128J0 = -10L;
            m1572v1();
        } else {
            this.f1128J0 = -10L;
            m1573w1();
        }
        this.f1134N = message;
        if (!TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(message.localExtraInfo)) {
            setOnClickListener(null);
        } else {
            setOnClickListener(this);
        }
        if (CoreModule.P().i().E() && m1433X() && TEnum.equals(message.channel, "group")) {
            dmlVar.mo3522c(m1418H(), CoreModule.c.e0.Ka(message.owner)).subscribe((m250) mkd0.G(new e30() { // from class: l.r9q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6820a.m1557f1((User) obj);
                }
            }));
            return;
        }
        dmlVar.mo3522c(m1418H(), CoreModule.c.e0.Ka(message.owner)).subscribe((m250) mkd0.G(new e30() { // from class: l.s9q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7163a.m1558g1((User) obj);
            }
        }));
        if (CoreModule.P().i().B() && CoreModule.P().i().Q4(message.cid) && (this.f1027v instanceof ItemHeartConfession)) {
            boolean zC = hap.c(message.cid);
            AppCompatTextView appCompatTextView = this.f1125G0;
            if (zC) {
                xdl0.M(appCompatTextView, true);
                xdl0.M(this.f1147W, false);
            } else {
                xdl0.M(appCompatTextView, false);
                xdl0.M(this.f1147W, true);
                dmlVar.mo3522c(m1418H(), mkd0.r(CoreModule.c.e0.o9(), CoreModule.c.e0.Ka(message.cid), new r7q())).subscribe((m250) mkd0.G(new e30() { // from class: l.t9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f7424a.m1559h1((j760) obj);
                    }
                }));
            }
        } else {
            xdl0.M(this.f1125G0, false);
            xdl0.M(this.f1147W, false);
        }
        boolean zM7391n = ruy.m7381g().m7391n(message, message3);
        FrameLayout frameLayout = this.f1124F0;
        if (zM7391n) {
            xdl0.M(frameLayout, true);
            ruy.m7382l(m1418H(), this.f1126H0, message.cid);
        } else {
            xdl0.M(frameLayout, false);
        }
        xdl0.E0(this.f1124F0, new View.OnClickListener() { // from class: l.b9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2356a.m1560i1(message, view);
            }
        });
        m1459x0(message);
        if (CoreModule.P().i().g1() && NullChecker.a(this.f1027v)) {
            InterfaceC0102a interfaceC0102a = this.f1027v;
            if (interfaceC0102a instanceof ItemAudio) {
                ((ItemAudio) interfaceC0102a).setAudioViewVisibleCallback(new e30() { // from class: l.c9q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f2593a.setReadStateLayoutParams(((Boolean) obj).booleanValue());
                    }
                });
            }
        }
        if ((m1418H() instanceof MessagesAct) && (m1418H().f1531f instanceof wmz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM4265l3 = m1418H().f1531f.m4265l3();
            if (warmingUpLevelM4265l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value && NullChecker.a(this.f1027v)) {
                Object obj = this.f1027v;
                if ((obj instanceof ItemText) || (obj instanceof ItemReference) || (obj instanceof ItemAudio) || (obj instanceof ItemVoiceCall)) {
                    jdm.b((View) obj, MessageWarmingUpHelper.m2298i(warmingUpLevelM4265l3), t100.i, -1, 0, 0, 0);
                    InterfaceC0102a interfaceC0102a2 = this.f1027v;
                    if (interfaceC0102a2 instanceof ItemAudio) {
                        ((ItemAudio) interfaceC0102a2).f690h.m946i(MessageWarmingUpHelper.m2292c(warmingUpLevelM4265l3), MessageWarmingUpHelper.m2298i(warmingUpLevelM4265l3));
                    }
                    InterfaceC0102a interfaceC0102a3 = this.f1027v;
                    if (interfaceC0102a3 instanceof ItemVoiceCall) {
                        ((ItemVoiceCall) interfaceC0102a3).findViewById(y4c0.M4).setBackgroundResource(0);
                    }
                }
            }
        }
        if (TEnum.equals(message.messageType, "state_comment") || TEnum.equals(message.messageType, "state_like")) {
            dmlVar.mo3522c(getContext(), CoreModule.c.q1.v3(message.isMe() ? message.cid : ((DbObject) CoreModule.c.e0.p9()).id, message.referenceMsgId).take(1)).subscribe((m250) mkd0.H(new e30() { // from class: l.d9q
                @Override // p003l.e30
                public final void call(Object obj2) {
                    this.f2917a.m1561j1((BubbleInfo) obj2);
                }
            }, new e30() { // from class: l.e9q
                @Override // p003l.e30
                public final void call(Object obj2) {
                    ItemMessageRight.m1533I0((Throwable) obj2);
                }
            }));
        } else {
            boolean zEquals = TEnum.equals(message.messageType, "literature");
            FrameLayout frameLayout2 = this.f1136O;
            if (zEquals) {
                xdl0.X(frameLayout2, (int) getResources().getDimension(x1c0.f));
            } else {
                xdl0.X(frameLayout2, (int) getResources().getDimension(x1c0.c));
            }
        }
        if (CoreModule.P().i().p5()) {
            xdl0.E0(this.f1144T, new View.OnClickListener() { // from class: l.f9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3471a.m1555d1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m1558g1(User user) {
        Picture.ImageUri imageUriProfileSmall = rw6.b(user).profileSmall();
        if (m1431V()) {
            qib0.G.L0(this.f1138P, user.getAnonymousUrl());
            this.f1127I0.G0(false);
        } else {
            this.f1127I0.v0(user, imageUriProfileSmall);
        }
        xdl0.M(this.f1140Q, false);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m1559h1(j760 j760Var) {
        qib0.G.Q0(this.f1148k0, ((User) j760Var.a).fp().profileSmall());
        qib0.G.Q0(this.f1149p0, ((User) j760Var.b).fp().profileSmall());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m1560i1(Message message, View view) {
        if (NullChecker.a(m1418H()) && m1433X()) {
            m1418H().m2059Q2(message);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m1561j1(BubbleInfo bubbleInfo) {
        if (NullChecker.a(bubbleInfo) && m1432W(bubbleInfo)) {
            xdl0.X(this.f1136O, (int) getResources().getDimension(x1c0.d));
        } else {
            xdl0.X(this.f1136O, (int) getResources().getDimension(x1c0.e));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m1562k1() {
        if (NullChecker.a(this.f1135N0)) {
            this.f1135N0.cancel();
            this.f1135N0 = null;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m1563l1() {
        xdl0.M(this.f1144T, false);
        xdl0.M(this.f1143S, true);
        if (xdl0.O0(this.f1145U)) {
            this.f1143S.setText("限时快拍 · ");
            return;
        }
        int i = this.f1139P0;
        if (i == 0) {
            this.f1143S.setText("限时快拍 · 未读");
            return;
        }
        AppCompatTextView appCompatTextView = this.f1143S;
        if (i == 1) {
            appCompatTextView.setText("限时快拍 · 已读");
        } else {
            appCompatTextView.setText("限时快拍");
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m1564m1(Act act, Message message, Conversation conversation, j000 j000Var, boolean z, long j, long j2) {
        m1567q1();
        if (!z || conversation == null || !TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET) || (!(TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) || TextUtils.equals(conversation.convType, "heartbeatMatch") || xp5.t(conversation)) || ((DbObject) conversation).id.startsWith("-") || message == null || ((DbObject) message).id.startsWith("fake_id_") || xdl0.O0(this.f1130L))) {
            xdl0.M(this.f1146V, false);
        } else {
            this.f1146V.W(act, message, conversation, j000Var, CoreModule.c.e0.Pa(conversation.otherUser), j, j2);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m1565n1(Message message, boolean z, long j, long j2) {
        long j3;
        this.f1139P0 = -1;
        setReadStateLayoutParams(false);
        if (!z || message.cid.equals("-1") || ((DbObject) message).id.startsWith("fake_id_") || "-10040".equals(message.cid) || xdl0.O0(this.f1130L) || User.isTeamAccount(message.cid) || User.isBusinessAI1V1(message.cid)) {
            m1567q1();
            return;
        }
        if (!TEnum.equals(message.status(), "normal")) {
            m1567q1();
            return;
        }
        if (CoreModule.P().i().E() && message.isGroupMessage()) {
            m1567q1();
            return;
        }
        if (CoreModule.P().i().o1(message.cid)) {
            m1567q1();
            return;
        }
        double d = message.createdTime;
        if (d != this.f1129K0) {
            this.f1131L0 = true;
            this.f1129K0 = d;
        }
        try {
            j3 = Long.parseLong(((DbObject) message).id);
        } catch (NumberFormatException unused) {
            j3 = Long.MAX_VALUE;
        }
        boolean zEquals = TextUtils.equals(message.cid, CoreModule.P().i().h());
        boolean zEquals2 = TEnum.equals(message.messageType, "love_letter");
        if (CoreModule.P().i().s4() || zEquals || zEquals2) {
            if (CoreModule.c.C0.J3() || zEquals || zEquals2 || CoreModule.P().i().w2()) {
                this.f1133M0 = false;
                m1568r1(m1548W0(j, j3, j2, (long) message.createdTime));
            } else {
                m1570t1();
                m1571u1();
                xdl0.M(this.f1145U, false);
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m1566o1() {
        xdl0.M(this.f1144T, false);
        xdl0.M(this.f1143S, true);
        if (xdl0.O0(this.f1145U)) {
            this.f1143S.setText("以图换图 · ");
            return;
        }
        int i = this.f1139P0;
        if (i == 0) {
            this.f1143S.setText("以图换图 · 未读");
            return;
        }
        AppCompatTextView appCompatTextView = this.f1143S;
        if (i == 1) {
            appCompatTextView.setText("以图换图 · 已读");
        } else {
            appCompatTextView.setText("以图换图");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (CoreModule.P().i().E() && !TEnum.equals(this.f1134N.channel, ServletHandler.__DEFAULT_SERVLET)) {
            m1547p1(m1418H(), this.f1134N);
            return;
        }
        User userPa = CoreModule.c.e0.Pa(this.f1134N.cid);
        Conversation conversationXe = CoreModule.c.f0.Xe(this.f1134N.cid);
        if ((!vwb.L(this.f1134N.cid) && userPa.unilateralBlock()) || (i = this.f1134N.localFailType) == 3 || i == 4 || qib0.b0.d.Kk(userPa)) {
            return;
        }
        if (NullChecker.a(conversationXe) && conversationXe.mutedByFriend()) {
            return;
        }
        m1547p1(m1418H(), this.f1134N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (y19.S()) {
            return;
        }
        m1567q1();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Message message = this.f1134N;
        return (message == null || !TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(this.f1134N.localExtraInfo)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m1567q1() {
        m1562k1();
        xdl0.M(this.f1143S, false);
        xdl0.M(this.f1145U, false);
        xdl0.M(this.f1144T, false);
        this.f1137O0 = false;
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
    /* JADX INFO: renamed from: r1 */
    public final void m1568r1(boolean z) {
        xdl0.M(this.f1144T, true);
        if (z) {
            this.f1139P0 = 1;
            this.f1144T.setText(R.string.q2);
            this.f1144T.setTextColor(m1418H().color(ura.e().d().I4() ? a1c0.i : a1c0.I));
            return;
        }
        this.f1139P0 = 0;
        this.f1144T.setText(R.string.r2);
        this.f1144T.setTextColor(m1418H().color(a1c0.J));
        if (ura.e().d().I4()) {
            this.f1144T.setTextColor(getResources().getColor(a1c0.j));
        } else if (ura.e().d().t9()) {
            this.f1144T.setTextColor(Color.parseColor("#FE7E1D"));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m1569s1() {
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemImages) {
            ((ItemImages) interfaceC0102a).m1300j();
            ((VProgressBar) this.f1132M).m11639d();
            xdl0.M(this.f1132M, false);
        } else if (interfaceC0102a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC0102a).m1093g();
            ((VProgressBar) this.f1132M).m11639d();
            xdl0.M(this.f1132M, false);
        } else if (!(interfaceC0102a instanceof ItemAiPictureLeft)) {
            ((VProgressBar) this.f1132M).m11638c();
            xdl0.M(this.f1130L, false);
        } else {
            ((ItemAiPictureLeft) interfaceC0102a).m1086s();
            ((VProgressBar) this.f1132M).m11639d();
            xdl0.M(this.f1132M, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m1570t1() {
        if (this.f1131L0) {
            this.f1131L0 = false;
            zvf0.A("e_read_remark", "p_chat_view", new j760[]{vwb.Y("remark_type", "message")});
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m1571u1() {
        if (this.f1133M0) {
            return;
        }
        this.f1133M0 = true;
        if (m1433X()) {
            final fcz fczVar = m1418H().f1531f;
            post(new Runnable() { // from class: l.g9q
                @Override // java.lang.Runnable
                public final void run() {
                    fczVar.m4309t7().m7872B1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m1572v1() {
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemImages) {
            ((ItemImages) interfaceC0102a).m1299i();
            ((VProgressBar) this.f1132M).m11639d();
            xdl0.M(this.f1132M, false);
        }
        ((VProgressBar) this.f1132M).m11639d();
        xdl0.M(this.f1132M, false);
        xdl0.M(this.f1130L, true);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m1573w1() {
        m1550Y0();
        InterfaceC0102a interfaceC0102a = this.f1027v;
        if (interfaceC0102a instanceof ItemImages) {
            ((ItemImages) interfaceC0102a).m1299i();
        }
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1128J0 = -10L;
        this.f1133M0 = true;
        this.f1137O0 = false;
        this.f1139P0 = -1;
        this.f1141Q0 = new d30() { // from class: l.a9q
            @Override // p003l.d30
            public final void call() {
                this.f2094a.m1554c1();
            }
        };
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1128J0 = -10L;
        this.f1133M0 = true;
        this.f1137O0 = false;
        this.f1139P0 = -1;
        this.f1141Q0 = new d30() { // from class: l.a9q
            @Override // p003l.d30
            public final void call() {
                this.f2094a.m1554c1();
            }
        };
    }
}
