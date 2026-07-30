package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MomentAction;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageRight;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.view.IntlMessageReadReceiptsView;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VText;
import p149l.a1c0;
import p149l.c40;
import p149l.d30;
import p149l.dml;
import p149l.e30;
import p149l.fcz;
import p149l.hap;
import p149l.j000;
import p149l.j760;
import p149l.jdm;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.r7q;
import p149l.roj0;
import p149l.ruy;
import p149l.rw6;
import p149l.t100;
import p149l.tbk;
import p149l.ura;
import p149l.vwb;
import p149l.wmz;
import p149l.x1c0;
import p149l.xdl0;
import p149l.xp5;
import p149l.y19;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageRight extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: R0 */
    public static c40 f31231R0;

    /* JADX INFO: renamed from: E0 */
    public VText f31232E0;

    /* JADX INFO: renamed from: F0 */
    public FrameLayout f31233F0;

    /* JADX INFO: renamed from: G0 */
    public VText f31234G0;

    /* JADX INFO: renamed from: H0 */
    public VText f31235H0;

    /* JADX INFO: renamed from: I0 */
    public HeaderFrameWrapper f31236I0;

    /* JADX INFO: renamed from: J0 */
    public long f31237J0;

    /* JADX INFO: renamed from: K0 */
    public double f31238K0;

    /* JADX INFO: renamed from: L */
    public ImageView f31239L;

    /* JADX INFO: renamed from: L0 */
    public boolean f31240L0;

    /* JADX INFO: renamed from: M */
    public View f31241M;

    /* JADX INFO: renamed from: M0 */
    public boolean f31242M0;

    /* JADX INFO: renamed from: N */
    public Message f31243N;

    /* JADX INFO: renamed from: N0 */
    public AnimatorSet f31244N0;

    /* JADX INFO: renamed from: O */
    public FrameLayout f31245O;

    /* JADX INFO: renamed from: O0 */
    public boolean f31246O0;

    /* JADX INFO: renamed from: P */
    public VDraweeView f31247P;

    /* JADX INFO: renamed from: P0 */
    public int f31248P0;

    /* JADX INFO: renamed from: Q */
    public VImage f31249Q;

    /* JADX INFO: renamed from: Q0 */
    public d30 f31250Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f31251R;

    /* JADX INFO: renamed from: S */
    public VText f31252S;

    /* JADX INFO: renamed from: T */
    public VText f31253T;

    /* JADX INFO: renamed from: U */
    public VImage f31254U;

    /* JADX INFO: renamed from: V */
    public IntlMessageReadReceiptsView f31255V;

    /* JADX INFO: renamed from: W */
    public FrameLayout f31256W;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f31257k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f31258p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageRight$a */
    public class C8506a implements C8524b.c {
        public C8506a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return ItemMessageRight.this.f31243N.owner;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return ItemMessageRight.this.f31243N.cid;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(ItemMessageRight.this.f31243N.cid);
        }
    }

    public ItemMessageRight(Context context) {
        super(context);
        this.f31237J0 = -10L;
        this.f31242M0 = true;
        this.f31246O0 = false;
        this.f31248P0 = -1;
        this.f31250Q0 = new d30() { // from class: l.a9q
            @Override // p149l.d30
            public final void call() {
                this.f68196a.m48470c1();
            }
        };
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m48447G0(Act act, final Message message, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        String string = c22545a.f209159a.toString();
        if (act.getResources().getString(R$string.f20970g).equals(string)) {
            MessageType messageType = message.messageType;
            if (messageType == null || TEnum.equals(messageType, "default") || TEnum.equals(message.messageType, "unknown_")) {
                message.messageType = message.messageType();
            }
            boolean z = act instanceof MessagesAct;
            if (z && TEnum.equals(message.messageType(), MessageType.chat_gift)) {
                ((MessagesAct) act).mo48974l().m120675L2(message, true, null);
            }
            if (z && message.localFailType == 9) {
                message.secondSend = true;
            }
            if (z && TEnum.equals(message.messageType(), "moment_comment")) {
                MessageReference messageReferenceNew_ = MessageReference.new_();
                messageReferenceNew_.action = MomentAction.get("comment");
                messageReferenceNew_.f20447id = message.moment;
                messageReferenceNew_.type = "moment";
                message.api_only_reference = messageReferenceNew_;
                CoreModule.f17545c.f19642f0.m32623Dn(message.cid, message, null).subscribe(mkd0.m154956H(new e30() { // from class: l.h9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19642f0.f19922b0.m132487l(message);
                    }
                }, new e30() { // from class: l.i9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ItemMessageRight.m48453M0((Throwable) obj);
                    }
                }));
            } else if (z) {
                CoreModule.f17545c.f19642f0.m32623Dn(message.cid, message, null).subscribe(mkd0.m154956H(new e30() { // from class: l.j9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19642f0.f19922b0.m132487l(message);
                    }
                }, new e30() { // from class: l.k9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ItemMessageRight.m48451K0((Throwable) obj);
                    }
                }));
            } else if (CoreModule.m29935P().m94658i().mo158449t4(act)) {
                CoreModule.m29935P().m94658i().mo158366e0(act, message);
            }
            c40 c40Var = f31231R0;
            if (c40Var != null) {
                c40Var.m105113b();
            }
        } else if (act.getResources().getString(R$string.f20943d).equals(string)) {
            if (CoreModule.m29935P().m94658i().mo158449t4(act)) {
                CoreModule.f17545c.f19678r0.m34147t6(message._id);
            } else {
                CoreModule.f17545c.f19642f0.m33201yn(message._id);
            }
        }
        c40 c40Var2 = f31231R0;
        if (c40Var2 != null) {
            c40Var2.m105113b();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m48449I0(Throwable th) {
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m48451K0(Throwable th) {
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m48453M0(Throwable th) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m48462V0(View view) {
        c40 c40Var = f31231R0;
        if (c40Var != null) {
            c40Var.m105113b();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public static void m48463p1(final Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R$string.f20970g));
        arrayList.add(act.getResources().getString(R$string.f20943d));
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105156I(act.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.l9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMessageRight.m48462V0(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.m9q
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                ItemMessageRight.m48447G0(act, message, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        f31231R0 = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadStateLayoutParams(boolean z) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase
    /* JADX INFO: renamed from: U */
    public void mo48346U(int i, View view, int i2, boolean z) {
        super.mo48346U(i, view, i2, z);
        setPivotX(view.getMeasuredWidth() - t100.m186890d(6.0f));
        this.f31241M = findViewById(y4c0.f196113d4);
        this.f31239L = (ImageView) findViewById(y4c0.f196022P0);
        this.f31245O = (FrameLayout) findViewById(y4c0.f196231u3);
        HeaderFrameWrapper headerFrameWrapper = (HeaderFrameWrapper) findViewById(y4c0.f196217s3);
        this.f31236I0 = headerFrameWrapper;
        this.f31247P = headerFrameWrapper.get_pic();
        if (CoreModule.m29935P().m94658i().mo158216D() && m48341O()) {
            C8524b.m49066r(this.f31247P, new C8506a(), new View.OnClickListener() { // from class: l.n9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f137821a.m48467Z0(view2);
                }
            });
        }
        xdl0.m208329E0(this.f31247P, new View.OnClickListener() { // from class: l.o9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142735a.m48468a1(view2);
            }
        });
        this.f31249Q = (VImage) findViewById(y4c0.f196212r5);
        this.f31251R = (LinearLayout) findViewById(y4c0.f195946C3);
        this.f31252S = (VText) findViewById(y4c0.f195987J1);
        this.f31253T = (VText) findViewById(y4c0.f195959E3);
        this.f31254U = (VImage) findViewById(y4c0.f195953D3);
        this.f31255V = (IntlMessageReadReceiptsView) findViewById(y4c0.f195930A1);
        FrameLayout frameLayout = (FrameLayout) findViewById(y4c0.f195981I1);
        this.f31256W = frameLayout;
        this.f31257k0 = (VDraweeView) frameLayout.findViewById(y4c0.f196144i0);
        this.f31258p0 = (VDraweeView) this.f31256W.findViewById(y4c0.f196151j0);
        this.f31232E0 = (VText) this.f31256W.findViewById(y4c0.f196158k0);
        this.f31233F0 = (FrameLayout) findViewById(y4c0.f195975H1);
        this.f31235H0 = (VText) findViewById(y4c0.f196255y);
        this.f31234G0 = (VText) findViewById(y4c0.f196040S0);
        this.f31241M.setOnClickListener(null);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31234G0.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31252S.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31235H0.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31232E0.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m48464W0(long j, long j2, long j3, long j4) {
        return j2 <= j || j4 < j3;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m48465X0() {
        if (m48349X()) {
            fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            o6j0.m162859c("e_chat_avatar", m48334H().pageId(), o6j0.C18854a.m162878h("click_user_id", this.f31243N.owner), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), this.f31243N.owner))));
            fczVar.m120846u6();
        } else if (CoreModule.m29935P().m94658i().mo158449t4(m48334H())) {
            o6j0.m162859c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C18854a.m162878h("user_id", CoreModule.f17545c.f19639e0.m169527p9().f56011id));
            CoreModule.m29935P().m94658i().mo158236G5(m48334H());
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m48466Y0() {
        xdl0.m208345M0(this.f31239L, false);
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemImages) {
            ((ItemImages) interfaceC8519a).m48213c();
            return;
        }
        if (interfaceC8519a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC8519a).m48013d();
        } else if (interfaceC8519a instanceof ItemAiPictureLeft) {
            ((ItemAiPictureLeft) interfaceC8519a).m48001k();
        } else {
            xdl0.m208345M0(this.f31241M, false);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m48467Z0(View view) {
        m48465X0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m48468a1(View view) {
        m48465X0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m48469b1() {
        if (m48349X()) {
            ((MessagesAct) m48334H()).f31640f.f96895L.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m48470c1() {
        CoreModule.m29935P().m94658i().mo158336Y2();
        CoreModule.m29935P().m94658i().mo158422o3(m48334H(), "haveRead", new d30() { // from class: l.p9q
            @Override // p149l.d30
            public final void call() {
                this.f147784a.m48469b1();
            }
        }, m48334H().pageId());
        CoreModule.m29935P().m94658i().mo158303S4(false);
        if (m48349X()) {
            ((MessagesAct) m48334H()).f31640f.f96895L.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m48471d1(View view) {
        this.f31250Q0.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m48472e1() {
        if (this.f31237J0 == this.f31243N._id) {
            m48485s1();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo48033f(User user, String str, LocalStatus localStatus) {
        super.mo48033f(user, str, localStatus);
        this.f31236I0.m79694E0(false, OMSDialogPositon.p_chat_view);
        if (m48347V()) {
            qib0.f154691G.m102331L0(this.f31247P, user.getAnonymousUrl());
            this.f31236I0.m79695G0(false);
        } else {
            this.f31236I0.m79710v0(user, rw6.m181386b(user).profileSmall());
        }
        xdl0.m208344M(this.f31249Q, false);
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8519a).m48195b(str);
            m48466Y0();
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m48473f1(User user) {
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(((MessagesAct) m48334H()).f31640f.mo120828r3());
        if (NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6)) {
            this.f31236I0.m79692B0(tbk.m187864k(user));
            return;
        }
        this.f31236I0.setShowSVipFrame(false);
        this.f31236I0.m79708t0(user);
        xdl0.m208344M(this.f31249Q, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, final Message message, Message message2, Message message3) {
        super.mo48034g(dmlVar, message, message2, message3);
        this.f31236I0.m79694E0(false, OMSDialogPositon.p_chat_view);
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            setPivotX(xdl0.m208412y0() - t100.f167259h);
        }
        m48466Y0();
        if (TEnum.equals(message.status(), LocalStatus.sending)) {
            long j = message.localCreatedTime;
            long jNanoTime = System.nanoTime() - 1000000000;
            long j2 = message._id;
            if (j > jNanoTime) {
                this.f31237J0 = j2;
                postDelayed(new Runnable() { // from class: l.q9q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f153456a.m48472e1();
                    }
                }, 1000L);
            } else {
                this.f31237J0 = j2;
                m48485s1();
            }
        } else if (TEnum.equals(message.status(), "failed")) {
            this.f31237J0 = -10L;
            m48488v1();
        } else {
            this.f31237J0 = -10L;
            m48489w1();
        }
        this.f31243N = message;
        if (!TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(message.localExtraInfo)) {
            setOnClickListener(null);
        } else {
            setOnClickListener(this);
        }
        if (CoreModule.m29935P().m94658i().mo158222E() && m48349X() && TEnum.equals(message.channel, "group")) {
            dmlVar.mo67374c(m48334H(), CoreModule.f17545c.f19639e0.m169410Ka(message.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.r9q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158426a.m48473f1((User) obj);
                }
            }));
            return;
        }
        dmlVar.mo67374c(m48334H(), CoreModule.f17545c.f19639e0.m169410Ka(message.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.s9q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163210a.m48474g1((User) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo158204B() && CoreModule.m29935P().m94658i().mo158291Q4(message.cid) && (this.f31136v instanceof ItemHeartConfession)) {
            boolean zM130154c = hap.m130154c(message.cid);
            VText vText = this.f31234G0;
            if (zM130154c) {
                xdl0.m208344M(vText, true);
                xdl0.m208344M(this.f31256W, false);
            } else {
                xdl0.m208344M(vText, false);
                xdl0.m208344M(this.f31256W, true);
                dmlVar.mo67374c(m48334H(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19639e0.m169410Ka(message.cid), new r7q())).subscribe(mkd0.m154955G(new e30() { // from class: l.t9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f169047a.m48475h1((j760) obj);
                    }
                }));
            }
        } else {
            xdl0.m208344M(this.f31234G0, false);
            xdl0.m208344M(this.f31256W, false);
        }
        boolean zM181225n = ruy.m181215g().m181225n(message, message3);
        FrameLayout frameLayout = this.f31233F0;
        if (zM181225n) {
            xdl0.m208344M(frameLayout, true);
            ruy.m181216l(m48334H(), this.f31235H0, message.cid);
        } else {
            xdl0.m208344M(frameLayout, false);
        }
        xdl0.m208329E0(this.f31233F0, new View.OnClickListener() { // from class: l.b9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74598a.m48476i1(message, view);
            }
        });
        m48375x0(message);
        if (CoreModule.m29935P().m94658i().mo158380g1() && NullChecker.m81303a(this.f31136v)) {
            InterfaceC8519a interfaceC8519a = this.f31136v;
            if (interfaceC8519a instanceof ItemAudio) {
                ((ItemAudio) interfaceC8519a).setAudioViewVisibleCallback(new e30() { // from class: l.c9q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f79959a.setReadStateLayoutParams(((Boolean) obj).booleanValue());
                    }
                });
            }
        }
        if ((m48334H() instanceof MessagesAct) && (((MessagesAct) m48334H()).f31640f instanceof wmz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = ((wmz) ((MessagesAct) m48334H()).f31640f).m120798l3();
            if (warmingUpLevelM120798l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value && NullChecker.m81303a(this.f31136v)) {
                Object obj = this.f31136v;
                if ((obj instanceof ItemText) || (obj instanceof ItemReference) || (obj instanceof ItemAudio) || (obj instanceof ItemVoiceCall)) {
                    jdm.m141040b((View) obj, MessageWarmingUpHelper.m49179i(warmingUpLevelM120798l3), t100.f167260i, -1, 0, 0, 0);
                    InterfaceC8519a interfaceC8519a2 = this.f31136v;
                    if (interfaceC8519a2 instanceof ItemAudio) {
                        ((ItemAudio) interfaceC8519a2).f30799h.m47873i(MessageWarmingUpHelper.m49173c(warmingUpLevelM120798l3), MessageWarmingUpHelper.m49179i(warmingUpLevelM120798l3));
                    }
                    InterfaceC8519a interfaceC8519a3 = this.f31136v;
                    if (interfaceC8519a3 instanceof ItemVoiceCall) {
                        ((ItemVoiceCall) interfaceC8519a3).findViewById(y4c0.f196008M4).setBackgroundResource(0);
                    }
                }
            }
        }
        if (TEnum.equals(message.messageType, MessageType.state_comment) || TEnum.equals(message.messageType, MessageType.state_like)) {
            dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19676q1.m33274v3(message.isMe() ? message.cid : CoreModule.f17545c.f19639e0.m169527p9().f56011id, message.referenceMsgId).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.d9q
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f85140a.m48477j1((BubbleInfo) obj2);
                }
            }, new e30() { // from class: l.e9q
                @Override // p149l.e30
                public final void call(Object obj2) {
                    ItemMessageRight.m48449I0((Throwable) obj2);
                }
            }));
        } else {
            boolean zEquals = TEnum.equals(message.messageType, "literature");
            FrameLayout frameLayout2 = this.f31245O;
            if (zEquals) {
                xdl0.m208360X(frameLayout2, (int) getResources().getDimension(x1c0.f189051f));
            } else {
                xdl0.m208360X(frameLayout2, (int) getResources().getDimension(x1c0.f189048c));
            }
        }
        if (CoreModule.m29935P().m94658i().mo158430p5()) {
            xdl0.m208329E0(this.f31253T, new View.OnClickListener() { // from class: l.f9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96517a.m48471d1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m48474g1(User user) {
        Picture.ImageUri imageUriProfileSmall = rw6.m181386b(user).profileSmall();
        if (m48347V()) {
            qib0.f154691G.m102331L0(this.f31247P, user.getAnonymousUrl());
            this.f31236I0.m79695G0(false);
        } else {
            this.f31236I0.m79710v0(user, imageUriProfileSmall);
        }
        xdl0.m208344M(this.f31249Q, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m48475h1(j760 j760Var) {
        qib0.f154691G.m102341Q0(this.f31257k0, ((User) j760Var.f116564a).m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f31258p0, ((User) j760Var.f116565b).m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m48476i1(Message message, View view) {
        if (NullChecker.m81303a(m48334H()) && m48349X()) {
            ((MessagesAct) m48334H()).m48967Q2(message);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m48477j1(BubbleInfo bubbleInfo) {
        if (NullChecker.m81303a(bubbleInfo) && m48348W(bubbleInfo)) {
            xdl0.m208360X(this.f31245O, (int) getResources().getDimension(x1c0.f189049d));
        } else {
            xdl0.m208360X(this.f31245O, (int) getResources().getDimension(x1c0.f189050e));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m48478k1() {
        if (NullChecker.m81303a(this.f31244N0)) {
            this.f31244N0.cancel();
            this.f31244N0 = null;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m48479l1() {
        xdl0.m208344M(this.f31253T, false);
        xdl0.m208344M(this.f31252S, true);
        if (xdl0.m208349O0(this.f31254U)) {
            this.f31252S.setText("限时快拍 · ");
            return;
        }
        int i = this.f31248P0;
        if (i == 0) {
            this.f31252S.setText("限时快拍 · 未读");
            return;
        }
        VText vText = this.f31252S;
        if (i == 1) {
            vText.setText("限时快拍 · 已读");
        } else {
            vText.setText("限时快拍");
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m48480m1(Act act, Message message, Conversation conversation, j000 j000Var, boolean z, long j, long j2) {
        m48483q1();
        if (!z || conversation == null || !TEnum.equals(conversation.status, "default") || (!(TextUtils.equals(conversation.convType, "default") || TextUtils.equals(conversation.convType, "heartbeatMatch") || xp5.m210480t(conversation)) || conversation.f56011id.startsWith("-") || message == null || message.f56011id.startsWith("fake_id_") || xdl0.m208349O0(this.f31239L))) {
            xdl0.m208344M(this.f31255V, false);
        } else {
            this.f31255V.m49808W(act, message, conversation, j000Var, CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser), j, j2);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m48481n1(Message message, boolean z, long j, long j2) {
        long j3;
        this.f31248P0 = -1;
        setReadStateLayoutParams(false);
        if (!z || message.cid.equals(User.ID_TEAM_ACCOUNT) || message.f56011id.startsWith("fake_id_") || User.ID_TEAM_ACCOUNT_SERVICE.equals(message.cid) || xdl0.m208349O0(this.f31239L) || User.isTeamAccount(message.cid) || User.isBusinessAI1V1(message.cid)) {
            m48483q1();
            return;
        }
        if (!TEnum.equals(message.status(), "normal")) {
            m48483q1();
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158222E() && message.isGroupMessage()) {
            m48483q1();
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158420o1(message.cid)) {
            m48483q1();
            return;
        }
        double d = message.createdTime;
        if (d != this.f31238K0) {
            this.f31240L0 = true;
            this.f31238K0 = d;
        }
        try {
            j3 = Long.parseLong(message.f56011id);
        } catch (NumberFormatException unused) {
            j3 = Long.MAX_VALUE;
        }
        boolean zEquals = TextUtils.equals(message.cid, CoreModule.m29935P().m94658i().mo158383h());
        boolean zEquals2 = TEnum.equals(message.messageType, MessageType.love_letter);
        if (CoreModule.m29935P().m94658i().mo158443s4() || zEquals || zEquals2) {
            if (CoreModule.f17545c.f19555C0.m210101J3() || zEquals || zEquals2 || CoreModule.m29935P().m94658i().mo158461w2()) {
                this.f31242M0 = false;
                m48484r1(m48464W0(j, j3, j2, (long) message.createdTime));
            } else {
                m48486t1();
                m48487u1();
                xdl0.m208344M(this.f31254U, false);
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m48482o1() {
        xdl0.m208344M(this.f31253T, false);
        xdl0.m208344M(this.f31252S, true);
        if (xdl0.m208349O0(this.f31254U)) {
            this.f31252S.setText("以图换图 · ");
            return;
        }
        int i = this.f31248P0;
        if (i == 0) {
            this.f31252S.setText("以图换图 · 未读");
            return;
        }
        VText vText = this.f31252S;
        if (i == 1) {
            vText.setText("以图换图 · 已读");
        } else {
            vText.setText("以图换图");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (CoreModule.m29935P().m94658i().mo158222E() && !TEnum.equals(this.f31243N.channel, "default")) {
            m48463p1(m48334H(), this.f31243N);
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f31243N.cid);
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f31243N.cid);
        if ((!vwb.m200298L(this.f31243N.cid) && userM169430Pa.unilateralBlock()) || (i = this.f31243N.localFailType) == 3 || i == 4 || qib0.f154713b0.f139233d.mo60288Kk(userM169430Pa)) {
            return;
        }
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.mutedByFriend()) {
            return;
        }
        m48463p1(m48334H(), this.f31243N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (y19.m212159S()) {
            return;
        }
        m48483q1();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Message message = this.f31243N;
        return (message == null || !TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(this.f31243N.localExtraInfo)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m48483q1() {
        m48478k1();
        xdl0.m208344M(this.f31252S, false);
        xdl0.m208344M(this.f31254U, false);
        xdl0.m208344M(this.f31253T, false);
        this.f31246O0 = false;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m48484r1(boolean z) {
        xdl0.m208344M(this.f31253T, true);
        if (z) {
            this.f31248P0 = 1;
            this.f31253T.setText(R$string.f21063q2);
            this.f31253T.setTextColor(m48334H().color(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67127I));
            return;
        }
        this.f31248P0 = 0;
        this.f31253T.setText(R$string.f21071r2);
        this.f31253T.setTextColor(m48334H().color(a1c0.f67128J));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31253T.setTextColor(getResources().getColor(a1c0.f67156j));
        } else if (ura.m195053e().m195057d().mo33924t9()) {
            this.f31253T.setTextColor(Color.parseColor("#FE7E1D"));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m48485s1() {
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemImages) {
            ((ItemImages) interfaceC8519a).m48218j();
            ((VProgressBar) this.f31241M).m223157d();
            xdl0.m208344M(this.f31241M, false);
        } else if (interfaceC8519a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC8519a).m48015g();
            ((VProgressBar) this.f31241M).m223157d();
            xdl0.m208344M(this.f31241M, false);
        } else if (!(interfaceC8519a instanceof ItemAiPictureLeft)) {
            ((VProgressBar) this.f31241M).m223156c();
            xdl0.m208344M(this.f31239L, false);
        } else {
            ((ItemAiPictureLeft) interfaceC8519a).m48008s();
            ((VProgressBar) this.f31241M).m223157d();
            xdl0.m208344M(this.f31241M, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m48486t1() {
        if (this.f31240L0) {
            this.f31240L0 = false;
            zvf0.m220368A("e_read_remark", OMSDialogPositon.p_chat_view, vwb.m200311Y("remark_type", "message"));
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m48487u1() {
        if (this.f31242M0) {
            return;
        }
        this.f31242M0 = true;
        if (m48349X()) {
            final fcz fczVar = ((MessagesAct) m48334H()).f31640f;
            post(new Runnable() { // from class: l.g9q
                @Override // java.lang.Runnable
                public final void run() {
                    fczVar.m120842t7().m190248B1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m48488v1() {
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemImages) {
            ((ItemImages) interfaceC8519a).m48217i();
            ((VProgressBar) this.f31241M).m223157d();
            xdl0.m208344M(this.f31241M, false);
        }
        ((VProgressBar) this.f31241M).m223157d();
        xdl0.m208344M(this.f31241M, false);
        xdl0.m208344M(this.f31239L, true);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m48489w1() {
        m48466Y0();
        InterfaceC8519a interfaceC8519a = this.f31136v;
        if (interfaceC8519a instanceof ItemImages) {
            ((ItemImages) interfaceC8519a).m48217i();
        }
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31237J0 = -10L;
        this.f31242M0 = true;
        this.f31246O0 = false;
        this.f31248P0 = -1;
        this.f31250Q0 = new d30() { // from class: l.a9q
            @Override // p149l.d30
            public final void call() {
                this.f68196a.m48470c1();
            }
        };
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31237J0 = -10L;
        this.f31242M0 = true;
        this.f31246O0 = false;
        this.f31248P0 = -1;
        this.f31250Q0 = new d30() { // from class: l.a9q
            @Override // p149l.d30
            public final void call() {
                this.f68196a.m48470c1();
            }
        };
    }
}
