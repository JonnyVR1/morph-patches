package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MomentAction;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageRight;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.view.IntlMessageReadReceiptsView;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.br5;
import p153l.clz;
import p153l.eac0;
import p153l.edc0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.h39;
import p153l.hcp;
import p153l.i4g0;
import p153l.jek;
import p153l.jyb;
import p153l.o3z;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qa00;
import p153l.r9q;
import p153l.sfj0;
import p153l.tvz;
import p153l.uqb0;
import p153l.ux6;
import p153l.uxj0;
import p153l.w30;
import p153l.x20;
import p153l.y20;
import p153l.zfm;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageRight extends ItemMessageBase implements View.OnClickListener {

    /* JADX INFO: renamed from: R0 */
    public static w30 f32079R0;

    /* JADX INFO: renamed from: E0 */
    public VText f32080E0;

    /* JADX INFO: renamed from: F0 */
    public FrameLayout f32081F0;

    /* JADX INFO: renamed from: G0 */
    public VText f32082G0;

    /* JADX INFO: renamed from: H0 */
    public VText f32083H0;

    /* JADX INFO: renamed from: I0 */
    public HeaderFrameWrapper f32084I0;

    /* JADX INFO: renamed from: J0 */
    public long f32085J0;

    /* JADX INFO: renamed from: K0 */
    public double f32086K0;

    /* JADX INFO: renamed from: L */
    public ImageView f32087L;

    /* JADX INFO: renamed from: L0 */
    public boolean f32088L0;

    /* JADX INFO: renamed from: M */
    public View f32089M;

    /* JADX INFO: renamed from: M0 */
    public boolean f32090M0;

    /* JADX INFO: renamed from: N */
    public Message f32091N;

    /* JADX INFO: renamed from: N0 */
    public AnimatorSet f32092N0;

    /* JADX INFO: renamed from: O */
    public FrameLayout f32093O;

    /* JADX INFO: renamed from: O0 */
    public boolean f32094O0;

    /* JADX INFO: renamed from: P */
    public VDraweeView f32095P;

    /* JADX INFO: renamed from: P0 */
    public int f32096P0;

    /* JADX INFO: renamed from: Q */
    public VImage f32097Q;

    /* JADX INFO: renamed from: Q0 */
    public x20 f32098Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f32099R;

    /* JADX INFO: renamed from: S */
    public VText f32100S;

    /* JADX INFO: renamed from: T */
    public VText f32101T;

    /* JADX INFO: renamed from: U */
    public VImage f32102U;

    /* JADX INFO: renamed from: V */
    public IntlMessageReadReceiptsView f32103V;

    /* JADX INFO: renamed from: W */
    public FrameLayout f32104W;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f32105k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f32106p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageRight$a */
    public class C8669a implements C8687b.c {
        public C8669a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return ItemMessageRight.this.f32091N.owner;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return ItemMessageRight.this.f32091N.cid;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(ItemMessageRight.this.f32091N.cid);
        }
    }

    public ItemMessageRight(Context context) {
        super(context);
        this.f32085J0 = -10L;
        this.f32090M0 = true;
        this.f32094O0 = false;
        this.f32096P0 = -1;
        this.f32098Q0 = new x20() { // from class: l.abq
            @Override // p153l.x20
            public final void call() {
                this.f69644a.m49653c1();
            }
        };
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m49630G0(Act act, final Message message, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        String string = c22660a.f210081a.toString();
        if (act.getResources().getString(R$string.f21712g).equals(string)) {
            MessageType messageType = message.messageType;
            if (messageType == null || TEnum.equals(messageType, "default") || TEnum.equals(message.messageType, "unknown_")) {
                message.messageType = message.messageType();
            }
            boolean z = act instanceof MessagesAct;
            if (z && TEnum.equals(message.messageType(), MessageType.chat_gift)) {
                ((MessagesAct) act).mo50158l().m110881L2(message, true, null);
            }
            if (z && message.localFailType == 9) {
                message.secondSend = true;
            }
            if (z && TEnum.equals(message.messageType(), "moment_comment")) {
                MessageReference messageReferenceNew_ = MessageReference.new_();
                messageReferenceNew_.action = MomentAction.get("comment");
                messageReferenceNew_.f21189id = message.moment;
                messageReferenceNew_.type = "moment";
                message.api_only_reference = messageReferenceNew_;
                CoreModule.f18264c.f20384f0.m33626Dn(message.cid, message, null).subscribe(psd0.m173597H(new y20() { // from class: l.hbq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20384f0.f20664b0.m137019l(message);
                    }
                }, new y20() { // from class: l.ibq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ItemMessageRight.m49636M0((Throwable) obj);
                    }
                }));
            } else if (z) {
                CoreModule.f18264c.f20384f0.m33626Dn(message.cid, message, null).subscribe(psd0.m173597H(new y20() { // from class: l.jbq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20384f0.f20664b0.m137019l(message);
                    }
                }, new y20() { // from class: l.kbq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ItemMessageRight.m49634K0((Throwable) obj);
                    }
                }));
            } else if (CoreModule.m30933P().m143412i().mo180541t4(act)) {
                CoreModule.m30933P().m143412i().mo180458e0(act, message);
            }
            w30 w30Var = f32079R0;
            if (w30Var != null) {
                w30Var.m204614b();
            }
        } else if (act.getResources().getString(R$string.f21685d).equals(string)) {
            if (CoreModule.m30933P().m143412i().mo180541t4(act)) {
                CoreModule.f18264c.f20420r0.m35150t6(message._id);
            } else {
                CoreModule.f18264c.f20384f0.m34204yn(message._id);
            }
        }
        w30 w30Var2 = f32079R0;
        if (w30Var2 != null) {
            w30Var2.m204614b();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m49632I0(Throwable th) {
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m49634K0(Throwable th) {
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m49636M0(Throwable th) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m49645V0(View view) {
        w30 w30Var = f32079R0;
        if (w30Var != null) {
            w30Var.m204614b();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public static void m49646p1(final Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R$string.f21712g));
        arrayList.add(act.getResources().getString(R$string.f21685d));
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204657I(act.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.lbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMessageRight.m49645V0(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.mbq
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                ItemMessageRight.m49630G0(act, message, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        f32079R0 = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadStateLayoutParams(boolean z) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase
    /* JADX INFO: renamed from: U */
    public void mo49529U(int i, View view, int i2, boolean z) {
        super.mo49529U(i, view, i2, z);
        setPivotX(view.getMeasuredWidth() - qa00.m175859d(6.0f));
        this.f32089M = findViewById(edc0.f93348d4);
        this.f32087L = (ImageView) findViewById(edc0.f93257P0);
        this.f32093O = (FrameLayout) findViewById(edc0.f93466u3);
        HeaderFrameWrapper headerFrameWrapper = (HeaderFrameWrapper) findViewById(edc0.f93452s3);
        this.f32084I0 = headerFrameWrapper;
        this.f32095P = headerFrameWrapper.get_pic();
        if (CoreModule.m30933P().m143412i().mo180308D() && m49524O()) {
            C8687b.m50249r(this.f32095P, new C8669a(), new View.OnClickListener() { // from class: l.nbq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f141244a.m49650Z0(view2);
                }
            });
        }
        bnl0.m105509E0(this.f32095P, new View.OnClickListener() { // from class: l.obq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f146610a.m49651a1(view2);
            }
        });
        this.f32097Q = (VImage) findViewById(edc0.f93447r5);
        this.f32099R = (LinearLayout) findViewById(edc0.f93181C3);
        this.f32100S = (VText) findViewById(edc0.f93222J1);
        this.f32101T = (VText) findViewById(edc0.f93194E3);
        this.f32102U = (VImage) findViewById(edc0.f93188D3);
        this.f32103V = (IntlMessageReadReceiptsView) findViewById(edc0.f93165A1);
        FrameLayout frameLayout = (FrameLayout) findViewById(edc0.f93216I1);
        this.f32104W = frameLayout;
        this.f32105k0 = (VDraweeView) frameLayout.findViewById(edc0.f93379i0);
        this.f32106p0 = (VDraweeView) this.f32104W.findViewById(edc0.f93386j0);
        this.f32080E0 = (VText) this.f32104W.findViewById(edc0.f93393k0);
        this.f32081F0 = (FrameLayout) findViewById(edc0.f93210H1);
        this.f32083H0 = (VText) findViewById(edc0.f93490y);
        this.f32082G0 = (VText) findViewById(edc0.f93275S0);
        this.f32089M.setOnClickListener(null);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32082G0.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32100S.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32083H0.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32080E0.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m49647W0(long j, long j2, long j3, long j4) {
        return j2 <= j || j4 < j3;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m49648X0() {
        if (m49532X()) {
            clz clzVar = ((MessagesAct) m49517H()).f32488f;
            sfj0.m185596c("e_chat_avatar", m49517H().pageId(), sfj0.C20032a.m185615h("click_user_id", this.f32091N.owner), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), this.f32091N.owner))));
            clzVar.m111052u6();
        } else if (CoreModule.m30933P().m143412i().mo180541t4(m49517H())) {
            sfj0.m185596c("e_kankan_chat_head", "p_kankan_chat_popup", sfj0.C20032a.m185615h("user_id", CoreModule.f18264c.f20381e0.m116600p9().f56859id));
            CoreModule.m30933P().m143412i().mo180328G5(m49517H());
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m49649Y0() {
        bnl0.m105525M0(this.f32087L, false);
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemImages) {
            ((ItemImages) interfaceC8682a).m49396c();
            return;
        }
        if (interfaceC8682a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC8682a).m49196d();
        } else if (interfaceC8682a instanceof ItemAiPictureLeft) {
            ((ItemAiPictureLeft) interfaceC8682a).m49184k();
        } else {
            bnl0.m105525M0(this.f32089M, false);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m49650Z0(View view) {
        m49648X0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m49651a1(View view) {
        m49648X0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m49652b1() {
        if (m49532X()) {
            ((MessagesAct) m49517H()).f32488f.f82458L.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m49653c1() {
        CoreModule.m30933P().m143412i().mo180428Y2();
        CoreModule.m30933P().m143412i().mo180514o3(m49517H(), "haveRead", new x20() { // from class: l.pbq
            @Override // p153l.x20
            public final void call() {
                this.f151409a.m49652b1();
            }
        }, m49517H().pageId());
        CoreModule.m30933P().m143412i().mo180395S4(false);
        if (m49532X()) {
            ((MessagesAct) m49517H()).f32488f.f82458L.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m49654d1(View view) {
        this.f32098Q0.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m49655e1() {
        if (this.f32085J0 == this.f32091N._id) {
            m49668s1();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: f */
    public void mo49216f(User user, String str, LocalStatus localStatus) {
        super.mo49216f(user, str, localStatus);
        this.f32084I0.m80877E0(false, OMSDialogPositon.p_chat_view);
        if (m49530V()) {
            uqb0.f180374G.m127115L0(this.f32095P, user.getAnonymousUrl());
            this.f32084I0.m80878G0(false);
        } else {
            this.f32084I0.m80893v0(user, ux6.m198404b(user).profileSmall());
        }
        bnl0.m105524M(this.f32097Q, false);
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemHeartConfession) {
            ((ItemHeartConfession) interfaceC8682a).m49378b(str);
            m49649Y0();
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m49656f1(User user) {
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(((MessagesAct) m49517H()).f32488f.mo111034r3());
        if (NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6)) {
            this.f32084I0.m80875B0(jek.m144579k(user));
            return;
        }
        this.f32084I0.setShowSVipFrame(false);
        this.f32084I0.m80891t0(user);
        bnl0.m105524M(this.f32097Q, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, final Message message, Message message2, Message message3) {
        super.mo49217g(polVar, message, message2, message3);
        this.f32084I0.m80877E0(false, OMSDialogPositon.p_chat_view);
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            setPivotX(bnl0.m105592y0() - qa00.f156321h);
        }
        m49649Y0();
        if (TEnum.equals(message.status(), LocalStatus.sending)) {
            long j = message.localCreatedTime;
            long jNanoTime = System.nanoTime() - 1000000000;
            long j2 = message._id;
            if (j > jNanoTime) {
                this.f32085J0 = j2;
                postDelayed(new Runnable() { // from class: l.qbq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f156495a.m49655e1();
                    }
                }, 1000L);
            } else {
                this.f32085J0 = j2;
                m49668s1();
            }
        } else if (TEnum.equals(message.status(), "failed")) {
            this.f32085J0 = -10L;
            m49671v1();
        } else {
            this.f32085J0 = -10L;
            m49672w1();
        }
        this.f32091N = message;
        if (!TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(message.localExtraInfo)) {
            setOnClickListener(null);
        } else {
            setOnClickListener(this);
        }
        if (CoreModule.m30933P().m143412i().mo180314E() && m49532X() && TEnum.equals(message.channel, "group")) {
            polVar.mo68557c(m49517H(), CoreModule.f18264c.f20381e0.m116483Ka(message.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.rbq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162036a.m49656f1((User) obj);
                }
            }));
            return;
        }
        polVar.mo68557c(m49517H(), CoreModule.f18264c.f20381e0.m116483Ka(message.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.sbq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167173a.m49657g1((User) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo180296B() && CoreModule.m30933P().m143412i().mo180383Q4(message.cid) && (this.f31984v instanceof ItemHeartConfession)) {
            boolean zM134490c = hcp.m134490c(message.cid);
            VText vText = this.f32082G0;
            if (zM134490c) {
                bnl0.m105524M(vText, true);
                bnl0.m105524M(this.f32104W, false);
            } else {
                bnl0.m105524M(vText, false);
                bnl0.m105524M(this.f32104W, true);
                polVar.mo68557c(m49517H(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20381e0.m116483Ka(message.cid), new r9q())).subscribe(psd0.m173596G(new y20() { // from class: l.tbq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f172980a.m49658h1((pf60) obj);
                    }
                }));
            }
        } else {
            bnl0.m105524M(this.f32082G0, false);
            bnl0.m105524M(this.f32104W, false);
        }
        boolean zM165908n = o3z.m165898g().m165908n(message, message3);
        FrameLayout frameLayout = this.f32081F0;
        if (zM165908n) {
            bnl0.m105524M(frameLayout, true);
            o3z.m165899l(m49517H(), this.f32083H0, message.cid);
        } else {
            bnl0.m105524M(frameLayout, false);
        }
        bnl0.m105509E0(this.f32081F0, new View.OnClickListener() { // from class: l.bbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75977a.m49659i1(message, view);
            }
        });
        m49558x0(message);
        if (CoreModule.m30933P().m143412i().mo180472g1() && NullChecker.m82486a(this.f31984v)) {
            InterfaceC8682a interfaceC8682a = this.f31984v;
            if (interfaceC8682a instanceof ItemAudio) {
                ((ItemAudio) interfaceC8682a).setAudioViewVisibleCallback(new y20() { // from class: l.cbq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80837a.setReadStateLayoutParams(((Boolean) obj).booleanValue());
                    }
                });
            }
        }
        if ((m49517H() instanceof MessagesAct) && (((MessagesAct) m49517H()).f32488f instanceof tvz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = ((tvz) ((MessagesAct) m49517H()).f32488f).m111004l3();
            if (warmingUpLevelM111004l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value && NullChecker.m82486a(this.f31984v)) {
                Object obj = this.f31984v;
                if ((obj instanceof ItemText) || (obj instanceof ItemReference) || (obj instanceof ItemAudio) || (obj instanceof ItemVoiceCall)) {
                    zfm.m219546b((View) obj, MessageWarmingUpHelper.m50362i(warmingUpLevelM111004l3), qa00.f156322i, -1, 0, 0, 0);
                    InterfaceC8682a interfaceC8682a2 = this.f31984v;
                    if (interfaceC8682a2 instanceof ItemAudio) {
                        ((ItemAudio) interfaceC8682a2).f31647h.m49056i(MessageWarmingUpHelper.m50356c(warmingUpLevelM111004l3), MessageWarmingUpHelper.m50362i(warmingUpLevelM111004l3));
                    }
                    InterfaceC8682a interfaceC8682a3 = this.f31984v;
                    if (interfaceC8682a3 instanceof ItemVoiceCall) {
                        ((ItemVoiceCall) interfaceC8682a3).findViewById(edc0.f93243M4).setBackgroundResource(0);
                    }
                }
            }
        }
        if (TEnum.equals(message.messageType, MessageType.state_comment) || TEnum.equals(message.messageType, MessageType.state_like)) {
            polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20418q1.m34277v3(message.isMe() ? message.cid : CoreModule.f18264c.f20381e0.m116600p9().f56859id, message.referenceMsgId).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.dbq
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f87693a.m49660j1((BubbleInfo) obj2);
                }
            }, new y20() { // from class: l.ebq
                @Override // p153l.y20
                public final void call(Object obj2) {
                    ItemMessageRight.m49632I0((Throwable) obj2);
                }
            }));
        } else {
            boolean zEquals = TEnum.equals(message.messageType, "literature");
            FrameLayout frameLayout2 = this.f32093O;
            if (zEquals) {
                bnl0.m105540X(frameLayout2, (int) getResources().getDimension(eac0.f92758f));
            } else {
                bnl0.m105540X(frameLayout2, (int) getResources().getDimension(eac0.f92755c));
            }
        }
        if (CoreModule.m30933P().m143412i().mo180522p5()) {
            bnl0.m105509E0(this.f32101T, new View.OnClickListener() { // from class: l.fbq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98138a.m49654d1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m49657g1(User user) {
        Picture.ImageUri imageUriProfileSmall = ux6.m198404b(user).profileSmall();
        if (m49530V()) {
            uqb0.f180374G.m127115L0(this.f32095P, user.getAnonymousUrl());
            this.f32084I0.m80878G0(false);
        } else {
            this.f32084I0.m80893v0(user, imageUriProfileSmall);
        }
        bnl0.m105524M(this.f32097Q, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m49658h1(pf60 pf60Var) {
        uqb0.f180374G.m127125Q0(this.f32105k0, ((User) pf60Var.f152156a).m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f32106p0, ((User) pf60Var.f152157b).m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m49659i1(Message message, View view) {
        if (NullChecker.m82486a(m49517H()) && m49532X()) {
            ((MessagesAct) m49517H()).m50151R2(message);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m49660j1(BubbleInfo bubbleInfo) {
        if (NullChecker.m82486a(bubbleInfo) && m49531W(bubbleInfo)) {
            bnl0.m105540X(this.f32093O, (int) getResources().getDimension(eac0.f92756d));
        } else {
            bnl0.m105540X(this.f32093O, (int) getResources().getDimension(eac0.f92757e));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m49661k1() {
        if (NullChecker.m82486a(this.f32092N0)) {
            this.f32092N0.cancel();
            this.f32092N0 = null;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m49662l1() {
        bnl0.m105524M(this.f32101T, false);
        bnl0.m105524M(this.f32100S, true);
        if (bnl0.m105529O0(this.f32102U)) {
            this.f32100S.setText("限时快拍 · ");
            return;
        }
        int i = this.f32096P0;
        if (i == 0) {
            this.f32100S.setText("限时快拍 · 未读");
            return;
        }
        VText vText = this.f32100S;
        if (i == 1) {
            vText.setText("限时快拍 · 已读");
        } else {
            vText.setText("限时快拍");
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m49663m1(Act act, Message message, Conversation conversation, g900 g900Var, boolean z, long j, long j2) {
        m49666q1();
        if (!z || conversation == null || !TEnum.equals(conversation.status, "default") || (!(TextUtils.equals(conversation.convType, "default") || TextUtils.equals(conversation.convType, "heartbeatMatch") || br5.m106049t(conversation)) || conversation.f56859id.startsWith("-") || message == null || message.f56859id.startsWith("fake_id_") || bnl0.m105529O0(this.f32087L))) {
            bnl0.m105524M(this.f32103V, false);
        } else {
            this.f32103V.m50991W(act, message, conversation, g900Var, CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser), j, j2);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m49664n1(Message message, boolean z, long j, long j2) {
        long j3;
        this.f32096P0 = -1;
        setReadStateLayoutParams(false);
        if (!z || message.cid.equals(User.ID_TEAM_ACCOUNT) || message.f56859id.startsWith("fake_id_") || User.ID_TEAM_ACCOUNT_SERVICE.equals(message.cid) || bnl0.m105529O0(this.f32087L) || User.isTeamAccount(message.cid) || User.isBusinessAI1V1(message.cid)) {
            m49666q1();
            return;
        }
        if (!TEnum.equals(message.status(), "normal")) {
            m49666q1();
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180314E() && message.isGroupMessage()) {
            m49666q1();
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180512o1(message.cid)) {
            m49666q1();
            return;
        }
        double d = message.createdTime;
        if (d != this.f32086K0) {
            this.f32088L0 = true;
            this.f32086K0 = d;
        }
        try {
            j3 = Long.parseLong(message.f56859id);
        } catch (NumberFormatException unused) {
            j3 = Long.MAX_VALUE;
        }
        boolean zEquals = TextUtils.equals(message.cid, CoreModule.m30933P().m143412i().mo180475h());
        boolean zEquals2 = TEnum.equals(message.messageType, MessageType.love_letter);
        if (CoreModule.m30933P().m143412i().mo180535s4() || zEquals || zEquals2) {
            if (CoreModule.f18264c.f20297C0.m146414K3() || zEquals || zEquals2 || CoreModule.m30933P().m143412i().mo180553w2()) {
                this.f32090M0 = false;
                m49667r1(m49647W0(j, j3, j2, (long) message.createdTime));
            } else {
                m49669t1();
                m49670u1();
                bnl0.m105524M(this.f32102U, false);
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m49665o1() {
        bnl0.m105524M(this.f32101T, false);
        bnl0.m105524M(this.f32100S, true);
        if (bnl0.m105529O0(this.f32102U)) {
            this.f32100S.setText("以图换图 · ");
            return;
        }
        int i = this.f32096P0;
        if (i == 0) {
            this.f32100S.setText("以图换图 · 未读");
            return;
        }
        VText vText = this.f32100S;
        if (i == 1) {
            vText.setText("以图换图 · 已读");
        } else {
            vText.setText("以图换图");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (CoreModule.m30933P().m143412i().mo180314E() && !TEnum.equals(this.f32091N.channel, "default")) {
            m49646p1(m49517H(), this.f32091N);
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f32091N.cid);
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f32091N.cid);
        if ((!jyb.m147481L(this.f32091N.cid) && userM116503Pa.unilateralBlock()) || (i = this.f32091N.localFailType) == 3 || i == 4 || uqb0.f180396b0.f170327d.mo61472Kk(userM116503Pa)) {
            return;
        }
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.mutedByFriend()) {
            return;
        }
        m49646p1(m49517H(), this.f32091N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (h39.m133430S()) {
            return;
        }
        m49666q1();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Message message = this.f32091N;
        return (message == null || !TEnum.equals(message.status(), "failed") || "ms_vr_ct_tg".equals(this.f32091N.localExtraInfo)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m49666q1() {
        m49661k1();
        bnl0.m105524M(this.f32100S, false);
        bnl0.m105524M(this.f32102U, false);
        bnl0.m105524M(this.f32101T, false);
        this.f32094O0 = false;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m49667r1(boolean z) {
        bnl0.m105524M(this.f32101T, true);
        if (z) {
            this.f32096P0 = 1;
            this.f32101T.setText(R$string.f21805q2);
            this.f32101T.setTextColor(m49517H().color(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102791I));
            return;
        }
        this.f32096P0 = 0;
        this.f32101T.setText(R$string.f21813r2);
        this.f32101T.setTextColor(m49517H().color(g9c0.f102792J));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32101T.setTextColor(getResources().getColor(g9c0.f102820j));
        } else if (gta.m132210e().m132214d().mo34927t9()) {
            this.f32101T.setTextColor(Color.parseColor("#FE7E1D"));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m49668s1() {
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemImages) {
            ((ItemImages) interfaceC8682a).m49401j();
            ((VProgressBar) this.f32089M).m224403d();
            bnl0.m105524M(this.f32089M, false);
        } else if (interfaceC8682a instanceof ItemAiPictureRight) {
            ((ItemAiPictureRight) interfaceC8682a).m49198g();
            ((VProgressBar) this.f32089M).m224403d();
            bnl0.m105524M(this.f32089M, false);
        } else if (!(interfaceC8682a instanceof ItemAiPictureLeft)) {
            ((VProgressBar) this.f32089M).m224402c();
            bnl0.m105524M(this.f32087L, false);
        } else {
            ((ItemAiPictureLeft) interfaceC8682a).m49191s();
            ((VProgressBar) this.f32089M).m224403d();
            bnl0.m105524M(this.f32089M, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m49669t1() {
        if (this.f32088L0) {
            this.f32088L0 = false;
            i4g0.m138492A("e_read_remark", OMSDialogPositon.p_chat_view, jyb.m147494Y("remark_type", "message"));
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m49670u1() {
        if (this.f32090M0) {
            return;
        }
        this.f32090M0 = true;
        if (m49532X()) {
            final clz clzVar = ((MessagesAct) m49517H()).f32488f;
            post(new Runnable() { // from class: l.gbq
                @Override // java.lang.Runnable
                public final void run() {
                    clzVar.m111048t7().m178888B1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m49671v1() {
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemImages) {
            ((ItemImages) interfaceC8682a).m49400i();
            ((VProgressBar) this.f32089M).m224403d();
            bnl0.m105524M(this.f32089M, false);
        }
        ((VProgressBar) this.f32089M).m224403d();
        bnl0.m105524M(this.f32089M, false);
        bnl0.m105524M(this.f32087L, true);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m49672w1() {
        m49649Y0();
        InterfaceC8682a interfaceC8682a = this.f31984v;
        if (interfaceC8682a instanceof ItemImages) {
            ((ItemImages) interfaceC8682a).m49400i();
        }
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32085J0 = -10L;
        this.f32090M0 = true;
        this.f32094O0 = false;
        this.f32096P0 = -1;
        this.f32098Q0 = new x20() { // from class: l.abq
            @Override // p153l.x20
            public final void call() {
                this.f69644a.m49653c1();
            }
        };
    }

    public ItemMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32085J0 = -10L;
        this.f32090M0 = true;
        this.f32094O0 = false;
        this.f32096P0 = -1;
        this.f32098Q0 = new x20() { // from class: l.abq
            @Override // p153l.x20
            public final void call() {
                this.f69644a.m49653c1();
            }
        };
    }
}
