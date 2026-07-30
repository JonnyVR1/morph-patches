package p003l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.core.data.ChallengeMsg;
import com.p000p1.mobile.putong.core.data.ChallengeMsgList;
import com.p000p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.Literatures;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageAndMedia;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.ReportFrom;
import com.p000p1.mobile.putong.core.data.TagCategories;
import com.p000p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p000p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p000p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p000p1.mobile.putong.core.map.IntlMapAct;
import com.p000p1.mobile.putong.core.p001ui.dlg.CoreDlg;
import com.p000p1.mobile.putong.core.p001ui.greet.C3132a;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.api.WebSocketManager;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge;
import com.p1.mobile.putong.core.ui.map.intl.IntlMapPreviewBaseAct;
import com.p1.mobile.putong.core.ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p1.mobile.putong.core.ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.helpers.ProfileCreateData;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag;
import com.p1.mobile.putong.core.ui.verification.age.AgeVerificationAct;
import com.p1.mobile.putong.core.ui.verification.national.NationalIdAuthAct;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.ah60;
import l.bx6;
import l.d30;
import l.e30;
import l.f30;
import l.fap;
import l.ft4;
import l.g30;
import l.h7j;
import l.haw;
import l.hbw;
import l.hm7;
import l.hu40;
import l.i0g0;
import l.j760;
import l.j900;
import l.ke50;
import l.ki60;
import l.knb0;
import l.l7k0;
import l.l9b;
import l.lva;
import l.mqm0;
import l.mx0;
import l.myf;
import l.n87;
import l.nkp;
import l.nlm0;
import l.ogl0;
import l.p420;
import l.q0;
import l.q000;
import l.q850;
import l.qp8;
import l.r65;
import l.roj0;
import l.rs4;
import l.rwu;
import l.rza;
import l.sa40;
import l.sqb0;
import l.swh0;
import l.t7c0;
import l.tpd0;
import l.tvf;
import l.u59;
import l.uld0;
import l.upa;
import l.uq40;
import l.uyc0;
import l.vwb;
import l.w9j;
import l.wak;
import l.x2c0;
import l.xaj0;
import l.xij0;
import l.y0e0;
import l.zb0;
import l.zb90;
import l.zq4;
import l.zyc0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface v87 extends n87 {
    /* JADX INFO: renamed from: Fp */
    static /* synthetic */ void m9894Fp(Act act, d30 d30Var) {
        tvf.h(act, "dialog");
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Tk */
    static /* synthetic */ Unit m9896Tk(Runnable runnable, String str, String str2) {
        if (runnable != null) {
            runnable.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e7 */
    static /* synthetic */ void m9897e7() {
    }

    /* JADX INFO: renamed from: rp */
    static /* synthetic */ void m9899rp() {
    }

    /* JADX INFO: renamed from: A */
    default void m9901A(Act act) {
        ark.m5556T0(act);
    }

    /* JADX INFO: renamed from: A0 */
    default void m9902A0(boolean z) {
        CoreStatusSquareTabFrag.X.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: A1 */
    default boolean m9903A1() {
        return false;
    }

    /* JADX INFO: renamed from: A3 */
    default int m9904A3(int i) {
        return swh0.w0(i);
    }

    /* JADX INFO: renamed from: A5 */
    default Intent m9905A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return ProfileAct.z2(context, str, str2, z, z2, z3);
    }

    /* JADX INFO: renamed from: B */
    default boolean m9906B() {
        return u59.f0();
    }

    /* JADX INFO: renamed from: B0 */
    default List<NewTags> m9907B0(List<String> list) {
        sa40.h hVarP = sa40.o().P(list);
        return (NullChecker.a(hVarP) && hVarP.a) ? hVarP.b() : new ArrayList();
    }

    /* JADX INFO: renamed from: B1 */
    default void m9908B1(Act act, User user) {
        b.r(act, user);
    }

    /* JADX INFO: renamed from: B2 */
    default boolean m9909B2(Act act) {
        C3132a c3132aM2920d2 = ((GreetAct) act).m2920d2();
        return NullChecker.a(c3132aM2920d2) && c3132aM2920d2.m3199N1();
    }

    /* JADX INFO: renamed from: B3 */
    default void m9910B3(String str) {
        j900.i(str);
    }

    /* JADX INFO: renamed from: B4 */
    default int m9911B4() {
        return upa.k0();
    }

    /* JADX INFO: renamed from: C */
    default boolean m9912C(int i) {
        return hm7.a(i);
    }

    /* JADX INFO: renamed from: C0 */
    default void m9913C0() {
        ConversationsList.A2();
    }

    /* JADX INFO: renamed from: C1 */
    default void m9914C1(Act act, String str) {
        hbw.g(act, str);
    }

    /* JADX INFO: renamed from: C2 */
    default boolean m9915C2() {
        return upa.c2();
    }

    /* JADX INFO: renamed from: C4 */
    default boolean m9916C4() {
        return zyc0.j0();
    }

    /* JADX INFO: renamed from: C5 */
    default void m9917C5(boolean z) {
        rs4.e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: D */
    default boolean m9918D() {
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    default void m9919D0(String str, String str2) {
        a.g0(str, str2);
    }

    /* JADX INFO: renamed from: D1 */
    default void m9920D1(final Act act) {
        FakeHoldFragment.z4(21862, myf.E(act), new FakeHoldFragment.a() { // from class: l.q87
            /* JADX INFO: renamed from: a */
            public final void m8921a(ArrayList arrayList, String str) {
                ark.m5540L0(act, arrayList);
            }
        }).A4(act.getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: D2 */
    default String m9921D2() {
        return upa.X0();
    }

    /* JADX INFO: renamed from: D3 */
    default void m9922D3(String str, String str2) {
        a.h0(str, str2);
    }

    /* JADX INFO: renamed from: D4 */
    default void m9923D4(Act act, User user, int i) {
        abi.m5324K(act, user, i);
    }

    /* JADX INFO: renamed from: E */
    default boolean m9924E() {
        return upa.V1();
    }

    /* JADX INFO: renamed from: E0 */
    default void m9925E0() {
        ran.m9111q().m9114C();
    }

    /* JADX INFO: renamed from: E1 */
    default void m9926E1(Context context) {
        new ukf0(context).m9745a();
    }

    /* JADX INFO: renamed from: E2 */
    default xaj0<String, String, String> m9927E2(String str) {
        return h7j.T(str);
    }

    /* JADX INFO: renamed from: E3 */
    default boolean m9928E3() {
        return hu40.a().b();
    }

    /* JADX INFO: renamed from: E4 */
    default void m9929E4(Act act, User user, d30 d30Var) {
        haw hawVar = new haw(act, user);
        hawVar.R(d30Var);
        hawVar.show();
    }

    /* JADX INFO: renamed from: F */
    default boolean m9930F() {
        return false;
    }

    /* JADX INFO: renamed from: F1 */
    default void m9931F1(String str) {
        ygh0.m11224k0(str);
    }

    /* JADX INFO: renamed from: F3 */
    default void m9932F3(Act act) {
        p420.t(act);
    }

    /* JADX INFO: renamed from: F5 */
    default boolean m9933F5() {
        return swh0.E0();
    }

    /* JADX INFO: renamed from: G0 */
    default boolean m9934G0() {
        return upa.q3();
    }

    /* JADX INFO: renamed from: G1 */
    default boolean m9935G1() {
        return upa.D1();
    }

    /* JADX INFO: renamed from: G3 */
    default String m9936G3(int i) {
        return r65.l().k(i);
    }

    /* JADX INFO: renamed from: G4 */
    default void m9937G4() {
        ygh0.m11188L();
    }

    /* JADX INFO: renamed from: G5 */
    default void m9938G5(Act act) {
        ((GreetAct) act).m2920d2().m3232x1();
    }

    /* JADX INFO: renamed from: H */
    default int m9939H() {
        return upa.U0();
    }

    /* JADX INFO: renamed from: H1 */
    default void m9940H1() {
        ygh0.m11187K();
    }

    /* JADX INFO: renamed from: H2 */
    default void m9941H2() {
        ran.m9111q().m9113B();
    }

    /* JADX INFO: renamed from: H3 */
    default c<Integer> m9942H3(String str) {
        return sqb0.O().j0(str);
    }

    /* JADX INFO: renamed from: H4 */
    default boolean m9943H4() {
        return zb0.b();
    }

    /* JADX INFO: renamed from: H5 */
    default void m9944H5(Context context, String str, String str2, String str3) {
        sa40.o().E(context, str, str2, str3);
    }

    /* JADX INFO: renamed from: I0 */
    default boolean m9945I0() {
        return u59.h0();
    }

    /* JADX INFO: renamed from: I1 */
    default boolean m9946I1(User user) {
        return u59.n0(user);
    }

    /* JADX INFO: renamed from: I2 */
    default boolean m9947I2(int i) {
        return nkp.d(i);
    }

    /* JADX INFO: renamed from: I3 */
    default void m9948I3(String str) {
        rwu.i(str);
    }

    /* JADX INFO: renamed from: J */
    default boolean m9949J() {
        return zb0.e();
    }

    /* JADX INFO: renamed from: J0 */
    default void m9950J0(Act act) {
        tvf.n();
        tvf.i(act, "dialog", false, false);
    }

    /* JADX INFO: renamed from: J1 */
    default boolean m9951J1() {
        return r65.m();
    }

    /* JADX INFO: renamed from: J2 */
    default boolean m9952J2() {
        return upa.d2();
    }

    /* JADX INFO: renamed from: J3 */
    default void m9953J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2) {
        CoreDlg.m2407p1(z, z2, user, act, menu, str, d30Var, str2);
    }

    /* JADX INFO: renamed from: J4 */
    default void m9954J4(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.q2(act, message.cid, new MessageAndMedia(media, message)), media instanceof Video ? null : new q000());
    }

    /* JADX INFO: renamed from: J5 */
    default void m9955J5(final Act act, final d30 d30Var) {
        if (CoreModule.c.e0.p9().isPicVerificationVerified()) {
            return;
        }
        CoreDlg.m2303G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", x2c0.u8, "去认证", new d30() { // from class: l.s87
            public final void call() {
                v87.m9894Fp(act, d30Var);
            }
        }, true, "以后再说", new d30() { // from class: l.t87
            public final void call() {
                v87.m9899rp();
            }
        }, new d30() { // from class: l.u87
            public final void call() {
                v87.m9897e7();
            }
        }, null, true, false, null, null, false);
    }

    /* JADX INFO: renamed from: K */
    default String m9956K() {
        return zyc0.g0();
    }

    /* JADX INFO: renamed from: K0 */
    default void m9957K0() {
        uyc0.l0().j0();
    }

    /* JADX INFO: renamed from: K1 */
    default String m9958K1(String str) {
        return a.R(str);
    }

    /* JADX INFO: renamed from: K2 */
    default ChatGiftInfoExtra m9959K2(Message message) {
        return zyc0.h0(message);
    }

    /* JADX INFO: renamed from: K3 */
    default void m9960K3(Intent intent) {
        ProfileCreateData profileCreateData = new ProfileCreateData();
        profileCreateData.checkConv = false;
        intent.putExtra("profile_create_data", (Serializable) profileCreateData);
    }

    /* JADX INFO: renamed from: K5 */
    default int m9961K5() {
        return upa.v0();
    }

    /* JADX INFO: renamed from: L */
    default void m9962L(String str) {
        sqb0.O().z0(str);
    }

    /* JADX INFO: renamed from: L1 */
    default boolean m9963L1(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.k(tantanForbidden);
    }

    /* JADX INFO: renamed from: L2 */
    default void m9964L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3) {
        CoreDlg.m2315K1(menu, str, act, z, z2, str2, d30Var, d30Var2, z3, z4, str3);
    }

    /* JADX INFO: renamed from: L3 */
    default void m9965L3() {
        uq40.D();
    }

    /* JADX INFO: renamed from: L4 */
    default void m9966L4(Act act, int i) {
        act.startActivityForResult(IntlMapAct.m757g2(act, 0, false), i);
    }

    /* JADX INFO: renamed from: L5 */
    default boolean m9967L5() {
        return false;
    }

    /* JADX INFO: renamed from: M */
    default boolean m9968M() {
        return false;
    }

    /* JADX INFO: renamed from: M0 */
    default CharSequence m9969M0(Message message, Conversation conversation) {
        return rza.I0(message, conversation);
    }

    /* JADX INFO: renamed from: M1 */
    default Intent m9970M1(Context context, String str, String str2, boolean z) {
        return ProfileAct.n2(context, str, str2, z);
    }

    /* JADX INFO: renamed from: M3 */
    default Intent m9971M3(Context context, String str) {
        return AgeVerificationAct.Y1(context, "from_message");
    }

    /* JADX INFO: renamed from: M4 */
    default boolean m9972M4() {
        return false;
    }

    /* JADX INFO: renamed from: M5 */
    default List<knb0<String, Runnable, Integer, Void>> m9973M5(Act act, Media media, Message message) {
        return CoreDlg.m2327O1(act, media, message);
    }

    /* JADX INFO: renamed from: N */
    default boolean m9974N() {
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    default int m9975N0() {
        return x2c0.K6;
    }

    /* JADX INFO: renamed from: N1 */
    default void m9976N1(Act act, d30 d30Var, boolean z) {
        CoreDlg.m2376e2(act, d30Var, z);
    }

    /* JADX INFO: renamed from: N2 */
    default int m9977N2() {
        return x2c0.te;
    }

    /* JADX INFO: renamed from: N3 */
    default boolean m9978N3() {
        return l9b.V();
    }

    /* JADX INFO: renamed from: N4 */
    default List<NewTags> m9979N4() {
        return sa40.o().r();
    }

    /* JADX INFO: renamed from: N5 */
    default void m9980N5(String str) {
        fap.i().A(str);
    }

    /* JADX INFO: renamed from: O2 */
    default boolean m9981O2() {
        return upa.h();
    }

    /* JADX INFO: renamed from: O3 */
    default void m9982O3(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        swh0.u1(act, str, g30Var, d30Var);
    }

    /* JADX INFO: renamed from: O4 */
    default void m9983O4() {
        mqm0.h().o("voice_entry_media_item");
    }

    /* JADX INFO: renamed from: O5 */
    default Privilege m9984O5(String str) {
        return zb90.b(str);
    }

    /* JADX INFO: renamed from: P */
    default void m9985P() {
        swh0.p0().W0();
    }

    /* JADX INFO: renamed from: P0 */
    default boolean m9986P0() {
        return swh0.p0().g1();
    }

    /* JADX INFO: renamed from: P2 */
    default Intent m9987P2(Context context, String str) {
        return ConversationSearchAct.c2(context, str);
    }

    /* JADX INFO: renamed from: P5 */
    default String m9988P5(Message message) {
        return rza.R0(message);
    }

    /* JADX INFO: renamed from: Q */
    default boolean m9989Q() {
        return CoreBusinessModule.c.F();
    }

    /* JADX INFO: renamed from: Q0 */
    default int m9990Q0() {
        return upa.E();
    }

    /* JADX INFO: renamed from: Q1 */
    default String m9991Q1(String str) {
        return a.P(str);
    }

    /* JADX INFO: renamed from: Q3 */
    default void m9992Q3(Act act, User user, d30 d30Var, String str) {
        com.p1.mobile.putong.core.ui.match.a.w().K(act, user, d30Var, str);
    }

    /* JADX INFO: renamed from: Q4 */
    default boolean m9993Q4(String str) {
        return fap.n(str);
    }

    /* JADX INFO: renamed from: Q5 */
    default void m9994Q5(String str) {
        ygh0.m11208c0(str);
    }

    /* JADX INFO: renamed from: R */
    default boolean m9995R() {
        return q850.c();
    }

    /* JADX INFO: renamed from: R1 */
    default void m9996R1() {
        uq40.C();
    }

    /* JADX INFO: renamed from: R2 */
    default boolean m9997R2(String str) {
        return hu40.a().d(str);
    }

    /* JADX INFO: renamed from: R4 */
    default boolean m9998R4() {
        return false;
    }

    /* JADX INFO: renamed from: R5 */
    default int m9999R5() {
        return x2c0.ri;
    }

    /* JADX INFO: renamed from: S */
    default void m10000S() {
        OnlineMatchManager.z().p = true;
    }

    /* JADX INFO: renamed from: S0 */
    default boolean m10001S0() {
        return CoreModule.c.e0.d8();
    }

    /* JADX INFO: renamed from: S1 */
    default int m10002S1() {
        return upa.j0();
    }

    /* JADX INFO: renamed from: S2 */
    default void m10003S2(Act act, final Runnable runnable) {
        new q0(act, new Function2() { // from class: l.r87
            public final Object invoke(Object obj, Object obj2) {
                return v87.m9896Tk(runnable, (String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: S3 */
    default void m10004S3(Act act) {
        mx0.o().K(act);
    }

    /* JADX INFO: renamed from: S4 */
    default void m10005S4(boolean z) {
        uyc0.l0().c = false;
    }

    /* JADX INFO: renamed from: S5 */
    default void m10006S5(boolean z) {
        uyc0.l0().o0(z);
    }

    /* JADX INFO: renamed from: T */
    default void m10007T() {
        uq40.A();
    }

    /* JADX INFO: renamed from: T0 */
    default int m10008T0() {
        return x2c0.h0;
    }

    /* JADX INFO: renamed from: T1 */
    default boolean m10009T1(String str) {
        return OnlineMatchManager.z().F(str);
    }

    /* JADX INFO: renamed from: T2 */
    default void m10010T2(Act act) {
        act.startActivityForResult(MediaPickerAct.i2(act, 1, false, false, true, (String) null, MediaPickerAct.D, false, false, CoreModule.c.e0.p9().gender, "", false), 786);
    }

    /* JADX INFO: renamed from: T4 */
    default int m10011T4() {
        return upa.S0();
    }

    /* JADX INFO: renamed from: T5 */
    default boolean m10012T5(String str) {
        return sqb0.S(str);
    }

    /* JADX INFO: renamed from: U0 */
    default int m10013U0() {
        return upa.V0();
    }

    /* JADX INFO: renamed from: U1 */
    default boolean m10014U1(d30 d30Var, Activity activity) {
        return sqb0.Companion.k(d30Var, activity);
    }

    /* JADX INFO: renamed from: U2 */
    default c<PurchaseType> m10015U2() {
        return ah60.E().map(new w9j() { // from class: l.p87
            public final Object call(Object obj) {
                return ((PaymentResultWrapper) obj).purchaseType;
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    default boolean m10016U3() {
        return upa.H3();
    }

    /* JADX INFO: renamed from: U5 */
    default boolean m10017U5(Act act, d30 d30Var) {
        return swh0.G1(act, d30Var);
    }

    /* JADX INFO: renamed from: V */
    default void m10018V(Act act, User user, d30 d30Var) {
        m9992Q3(act, user, d30Var, null);
    }

    /* JADX INFO: renamed from: V0 */
    default boolean m10019V0() {
        return upa.D2();
    }

    /* JADX INFO: renamed from: V1 */
    default void m10020V1(Context context, String str, String str2) {
        y0e0.e(context, str, str2);
    }

    /* JADX INFO: renamed from: V2 */
    default void m10021V2(Act act, Message message) {
        ((GreetAct) act).m2927m2(message);
    }

    /* JADX INFO: renamed from: V3 */
    default NewTags m10022V3(String str) {
        return sa40.o().O(str);
    }

    /* JADX INFO: renamed from: V4 */
    default int m10023V4() {
        return upa.w0();
    }

    /* JADX INFO: renamed from: V5 */
    default void m10024V5(String str) {
        ygh0.m11206b0(str);
    }

    /* JADX INFO: renamed from: W */
    default long m10025W(User user) {
        return uld0.d(user);
    }

    /* JADX INFO: renamed from: W0 */
    default void m10026W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str, boolean z3, e30<Boolean> e30Var) {
        a.E(act, onlineMatchPushUser, z, d30Var, z2, str, z3, e30Var);
    }

    /* JADX INFO: renamed from: W1 */
    default WarmingUpResConfig m10027W1() {
        return upa.l1();
    }

    /* JADX INFO: renamed from: W3 */
    default String m10028W3(String str) {
        return a.M(str);
    }

    /* JADX INFO: renamed from: W4 */
    default void m10029W4(Act act, String str) {
        CoreDlg.m2351W1(act, str);
    }

    /* JADX INFO: renamed from: W5 */
    default void m10030W5(boolean z, Menu menu, String str, Act act) {
        CoreDlg.m2386i1(z, menu, str, act);
    }

    /* JADX INFO: renamed from: X */
    default boolean m10031X() {
        return upa.e2();
    }

    /* JADX INFO: renamed from: X0 */
    default void m10032X0(TextView textView, Gender gender, int i, boolean z, User user) {
        l7k0.d(textView, gender, i, z, user);
    }

    /* JADX INFO: renamed from: X1 */
    default void m10033X1(String str) {
        OnlineMatchManager.z().g0(str);
    }

    /* JADX INFO: renamed from: X2 */
    default void m10034X2(String str) {
        ygh0.m11197U(str);
    }

    /* JADX INFO: renamed from: X3 */
    default WechatNotifyConfig m10035X3() {
        return upa.m1();
    }

    /* JADX INFO: renamed from: Y */
    default void m10036Y(Activity activity, Uri uri) {
        lva.D(activity, uri);
    }

    /* JADX INFO: renamed from: Y0 */
    default boolean m10037Y0(String str) {
        return a.L(str);
    }

    /* JADX INFO: renamed from: Y2 */
    default void m10038Y2() {
        vyc0.m10396c();
    }

    /* JADX INFO: renamed from: Y5 */
    default void m10039Y5(Act act, String str, String str2) {
        CoreDlg.m2422u1(act, str, str2);
    }

    /* JADX INFO: renamed from: Z */
    default void m10040Z(Act act, String str, long j) {
        swh0.o1(act, str, j);
    }

    /* JADX INFO: renamed from: Z0 */
    default boolean m10041Z0() {
        return false;
    }

    /* JADX INFO: renamed from: Z1 */
    default c<Boolean> m10042Z1() {
        return rs4.e.obs();
    }

    /* JADX INFO: renamed from: Z2 */
    default void m10043Z2(Act act, boolean z) {
        qwp.m9049i().m9055n(act, z);
    }

    /* JADX INFO: renamed from: Z4 */
    default boolean m10044Z4(Act act, String str) {
        return OnlineMatchManager.z().s0(act, OnlineMatchManager.QuickChatStartClickFrom.Home, str);
    }

    /* JADX INFO: renamed from: a0 */
    default void m10045a0(Act act, String str, boolean z) {
        act.startActivity(MediaPreviewAct.u2(act, str, z));
    }

    /* JADX INFO: renamed from: a1 */
    default boolean m10046a1() {
        return u59.e0();
    }

    /* JADX INFO: renamed from: a2 */
    default boolean m10047a2() {
        return ew40.m6340j();
    }

    /* JADX INFO: renamed from: a4 */
    default void m10048a4(Act act, String str, String str2) {
        ((GreetAct) act).m2920d2().m3233z1(str, str2);
    }

    /* JADX INFO: renamed from: a5 */
    default boolean m10049a5() {
        return hbw.e().j;
    }

    /* JADX INFO: renamed from: b */
    default boolean m10050b() {
        return qp8.b();
    }

    /* JADX INFO: renamed from: b0 */
    default boolean m10051b0(User user) {
        return sa40.o().J(user);
    }

    /* JADX INFO: renamed from: b1 */
    default String m10052b1(ProductCategory productCategory) {
        return zb90.e(productCategory);
    }

    /* JADX INFO: renamed from: b2 */
    default void m10053b2(CoreInnerPush.a aVar) {
        TantanCoreBridge.h.onNext(aVar);
    }

    /* JADX INFO: renamed from: b4 */
    default boolean m10054b4() {
        return ke50.d();
    }

    /* JADX INFO: renamed from: b5 */
    default boolean m10055b5() {
        return ogl0.M();
    }

    /* JADX INFO: renamed from: c */
    default boolean m10056c() {
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    default boolean m10057c0(String str, String str2) {
        return a.X(str, str2);
    }

    /* JADX INFO: renamed from: c1 */
    default void m10058c1(Act act, Menu menu, String str) {
        CoreDlg.m2404o1(act, menu, str);
    }

    /* JADX INFO: renamed from: c3 */
    default void m10059c3(int i) {
        CoreBusinessModule.d.b(i);
    }

    /* JADX INFO: renamed from: c4 */
    default boolean m10060c4(Conversation conversation) {
        return OnlineMatchManager.z().K(conversation);
    }

    /* JADX INFO: renamed from: c5 */
    default String m10061c5(String str) {
        return a.O(str);
    }

    /* JADX INFO: renamed from: d */
    default void m10062d(Throwable th) {
        bx6.b(th);
    }

    /* JADX INFO: renamed from: d0 */
    default void m10063d0(String str) {
        WebSocketManager.Q().i0(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING, WebSocketManager.N(), LongLinkChatTypingMessage.ChatTyping.newBuilder().setUserId(CoreModule.H().userId()).setOtherUserId(str).build()).a());
    }

    /* JADX INFO: renamed from: d1 */
    default void m10064d1(Act act) {
        a.k0(act);
    }

    /* JADX INFO: renamed from: d3 */
    default boolean m10065d3() {
        return swh0.K();
    }

    /* JADX INFO: renamed from: d5 */
    default void m10066d5(Act act, String str, String str2, String str3) {
        zq4.c(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    default boolean m10067e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    default void m10068e0(Act act, Message message) {
        ((GreetAct) act).m2920d2().m3197J1(message);
    }

    /* JADX INFO: renamed from: e1 */
    default boolean m10069e1(String str, String str2) {
        return a.Y(str, str2);
    }

    /* JADX INFO: renamed from: e3 */
    default void m10070e3(String str) {
        ygh0.m11220i0(str);
    }

    /* JADX INFO: renamed from: e4 */
    default boolean m10071e4() {
        return j900.k();
    }

    /* JADX INFO: renamed from: e5 */
    default void m10072e5(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        swh0.B1(act, purchaseType, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: f */
    default boolean m10073f() {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    default String m10074f0(double d) {
        return a.J(d);
    }

    /* JADX INFO: renamed from: f1 */
    default Intent m10075f1(Context context, MessageLocation messageLocation) {
        return IntlMapPreviewBaseAct.Y1(context, messageLocation);
    }

    /* JADX INFO: renamed from: f2 */
    default void m10076f2(Act act) {
        uyc0.l0().r0(act);
    }

    /* JADX INFO: renamed from: f3 */
    default int m10077f3() {
        return x2c0.tl;
    }

    /* JADX INFO: renamed from: f4 */
    default boolean m10078f4() {
        return upa.Y1();
    }

    /* JADX INFO: renamed from: f5 */
    default Intent m10079f5(Context context) {
        return MarryEditProfileSeriesAct.Y1(context, CoreModule.K().me_(), vwb.f0(new MarrySeriesType[]{MarrySeriesType.PROLOGUE}), false, true, false);
    }

    /* JADX INFO: renamed from: g */
    default boolean m10080g() {
        return nlm0.c();
    }

    /* JADX INFO: renamed from: g0 */
    default int m10081g0() {
        return t7c0.a;
    }

    /* JADX INFO: renamed from: g1 */
    default boolean m10082g1() {
        return false;
    }

    /* JADX INFO: renamed from: g2 */
    default rx.subjects.b<roj0> m10083g2() {
        return sa40.o().j;
    }

    /* JADX INFO: renamed from: g3 */
    default String m10084g3(String str) {
        return a.N(str);
    }

    default Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return lva.k(context, navigationIntent);
    }

    /* JADX INFO: renamed from: h */
    default String m10085h() {
        return rwu.h();
    }

    /* JADX INFO: renamed from: h0 */
    default boolean m10086h0() {
        return uq40.B();
    }

    /* JADX INFO: renamed from: h1 */
    default boolean m10087h1() {
        return false;
    }

    /* JADX INFO: renamed from: h2 */
    default boolean m10088h2(RecyclerView recyclerView) {
        return zyc0.f0(recyclerView);
    }

    /* JADX INFO: renamed from: h3 */
    default boolean m10089h3() {
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    default void m10090h4(Act act, String str, String str2, String str3, String str4) {
        wak.c(act, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: i */
    default boolean m10091i() {
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    default int m10092i1(String str) {
        return snm.m9390S(str);
    }

    /* JADX INFO: renamed from: i2 */
    default boolean m10093i2(Throwable th) {
        return bx6.f((TantanException.Client.TantanForbidden) th);
    }

    /* JADX INFO: renamed from: i3 */
    default String m10094i3(ProfileZodiac profileZodiac) {
        return i0g0.j0(profileZodiac);
    }

    /* JADX INFO: renamed from: i4 */
    default void m10095i4(String str) {
        ygh0.m11199W(str);
    }

    /* JADX INFO: renamed from: j */
    default boolean m10096j() {
        return false;
    }

    /* JADX INFO: renamed from: j1 */
    default Intent m10097j1(Act act, String str, ResultReceiver resultReceiver) {
        return ReportAct.c2(act, str, "", false, resultReceiver, ReportFrom.CHAT.getFrom());
    }

    /* JADX INFO: renamed from: j2 */
    default int m10098j2() {
        return x2c0.Vp;
    }

    /* JADX INFO: renamed from: j4 */
    default void m10099j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str) {
        ((GreetAct) act).m2928n2(message, coreGiftInfo, str);
    }

    /* JADX INFO: renamed from: j5 */
    default boolean m10100j5(Conversation conversation) {
        return sqb0.X(conversation);
    }

    /* JADX INFO: renamed from: k0 */
    default boolean m10101k0() {
        return ogl0.n();
    }

    /* JADX INFO: renamed from: k1 */
    default boolean m10102k1() {
        return OnlineMatchManager.z().p;
    }

    /* JADX INFO: renamed from: k3 */
    default boolean m10103k3() {
        return hbw.e().f() > 0;
    }

    /* JADX INFO: renamed from: k5 */
    default boolean m10104k5() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    default boolean m10105l() {
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    default boolean m10106l0() {
        return zb0.d();
    }

    /* JADX INFO: renamed from: l2 */
    default int m10107l2() {
        return sqb0.i0();
    }

    /* JADX INFO: renamed from: l4 */
    default boolean m10108l4(String str, String str2) {
        return a.a0(str, str2);
    }

    /* JADX INFO: renamed from: m */
    default String m10109m(List<String> list, List<String> list2) {
        return h7j.M(list, list2);
    }

    /* JADX INFO: renamed from: m0 */
    default WarmingUpEmoResConfig m10110m0() {
        return upa.k1();
    }

    /* JADX INFO: renamed from: m1 */
    default String m10111m1() {
        return CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
    }

    /* JADX INFO: renamed from: m4 */
    default void m10112m4(Menu menu, String str, Act act, d30 d30Var) {
        CoreDlg.m2285A1(menu, str, act, d30Var);
    }

    /* JADX INFO: renamed from: m5 */
    default int m10113m5() {
        return x2c0.V7;
    }

    /* JADX INFO: renamed from: n0 */
    default String m10114n0(boolean z) {
        return z ? "group_notification_anonymity" : "group_notification";
    }

    /* JADX INFO: renamed from: n1 */
    default void m10115n1(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.r2(act, message.cid, new MessageAndMedia(media, message), true), media instanceof Video ? null : new q000());
    }

    /* JADX INFO: renamed from: n2 */
    default BottomSheetDialog m10116n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, f30<String, String> f30Var) {
        return CoreDlg.m2330P1(act, str, str2, str3, i, str4, str5, str6, list, str7, f30Var);
    }

    /* JADX INFO: renamed from: n3 */
    default String m10117n3(boolean z) {
        return zyc0.i0(z);
    }

    /* JADX INFO: renamed from: n4 */
    default void m10118n4(Act act, String str) {
        swh0.p1(act, str);
    }

    /* JADX INFO: renamed from: n5 */
    default boolean m10119n5() {
        return ogl0.Q();
    }

    /* JADX INFO: renamed from: o */
    default boolean m10120o() {
        return upa.A1();
    }

    /* JADX INFO: renamed from: o0 */
    default boolean m10121o0() {
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    default boolean m10122o1(String str) {
        return b.v(str);
    }

    /* JADX INFO: renamed from: o2 */
    default void m10123o2() {
        JailedDialogLikeAct.n2();
    }

    /* JADX INFO: renamed from: o3 */
    default void m10124o3(Act act, String str, d30 d30Var, String str2) {
        uyc0.l0();
        uyc0.u0(act, str, d30Var, str2);
    }

    /* JADX INFO: renamed from: o4 */
    default boolean m10125o4(Conversation conversation) {
        return fap.m(conversation);
    }

    /* JADX INFO: renamed from: o5 */
    default boolean m10126o5() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    default boolean m10127p() {
        return upa.a2();
    }

    /* JADX INFO: renamed from: p1 */
    default boolean m10128p1() {
        return false;
    }

    /* JADX INFO: renamed from: p2 */
    default void m10129p2() {
        ConversationsList.v1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: p3 */
    default boolean m10130p3(String str) {
        return sqb0.O().Z(str);
    }

    /* JADX INFO: renamed from: p4 */
    default boolean m10131p4() {
        return upa.K3();
    }

    /* JADX INFO: renamed from: p5 */
    default boolean m10132p5() {
        return uyc0.l0().k0();
    }

    /* JADX INFO: renamed from: q */
    default boolean m10133q() {
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    default boolean m10134q1() {
        return upa.G3();
    }

    /* JADX INFO: renamed from: q2 */
    default tpd0 m10135q2() {
        return sa40.o().h;
    }

    /* JADX INFO: renamed from: q3 */
    default void m10136q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, e30<Boolean> e30Var, w9j<Throwable, Boolean> w9jVar) {
        zyc0.k0(putongAct, coreSendGiftBody, e30Var, w9jVar);
    }

    /* JADX INFO: renamed from: q5 */
    default String m10137q5(Literatures literatures) {
        return xgc0.m10795a(literatures);
    }

    /* JADX INFO: renamed from: r0 */
    default void m10138r0(String str) {
        a.d0(str);
    }

    /* JADX INFO: renamed from: r1 */
    default void m10139r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3) {
        CoreDlg.m2312J1(menu, str, act, z, z2, str2, d30Var, d30Var2, str3);
    }

    /* JADX INFO: renamed from: r2 */
    default void m10140r2(String str, String str2) {
        a.i0(str, str2);
    }

    /* JADX INFO: renamed from: r3 */
    default boolean m10141r3(String str, String str2) {
        return a.Z(str, str2);
    }

    /* JADX INFO: renamed from: r4 */
    default void m10142r4(String str) {
        ygh0.m11204a0(str);
    }

    /* JADX INFO: renamed from: r5 */
    default j760<Integer, Integer> m10143r5(int i) {
        return a.z(i);
    }

    /* JADX INFO: renamed from: s1 */
    default void m10144s1(String str) {
        xij0.f0(str);
    }

    /* JADX INFO: renamed from: s4 */
    default boolean m10145s4() {
        return ogl0.J();
    }

    /* JADX INFO: renamed from: s5 */
    default boolean m10146s5() {
        return upa.h2();
    }

    default void showProofAgeDlg(Act act, String str) {
        zb0.i(act, str);
    }

    /* JADX INFO: renamed from: t */
    default boolean m10147t() {
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    default boolean m10148t0() {
        return uq40.z();
    }

    /* JADX INFO: renamed from: t1 */
    default boolean m10149t1() {
        return ((Boolean) rs4.e.get()).booleanValue();
    }

    /* JADX INFO: renamed from: t3 */
    default Collection<Integer> m10150t3() {
        return CoreBusinessModule.d.o();
    }

    /* JADX INFO: renamed from: t4 */
    default boolean m10151t4(Act act) {
        return act instanceof GreetAct;
    }

    /* JADX INFO: renamed from: u */
    default boolean m10152u() {
        return false;
    }

    /* JADX INFO: renamed from: u1 */
    default void m10153u1(String str) {
        a.c0(str);
    }

    /* JADX INFO: renamed from: u2 */
    default void m10154u2(String str, boolean z) {
        ygh0.m11222j0(str, z);
    }

    /* JADX INFO: renamed from: u3 */
    default void m10155u3(int i) {
        CoreBusinessModule.d.b(i);
    }

    /* JADX INFO: renamed from: v */
    default boolean m10156v() {
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    default boolean m10157v1() {
        return ((Boolean) NewMainAct.r.get()).booleanValue();
    }

    /* JADX INFO: renamed from: v2 */
    default String m10158v2() {
        return upa.e1();
    }

    /* JADX INFO: renamed from: v3 */
    default Intent m10159v3(Context context, String str) {
        return NationalIdAuthAct.V1(context, str);
    }

    /* JADX INFO: renamed from: v5 */
    default boolean m10160v5() {
        return ft4.b().g();
    }

    /* JADX INFO: renamed from: w1 */
    default void m10162w1(knb0<String, Integer, Integer, Integer> knb0Var) {
        TantanCoreBridge.i.onNext(knb0Var);
    }

    /* JADX INFO: renamed from: w2 */
    default boolean m10163w2() {
        return uyc0.l0().m0();
    }

    /* JADX INFO: renamed from: w3 */
    default Drawable m10164w3(Context context, String str) {
        str.getClass();
        switch (str) {
            case "teleplay":
                return context.getResources().getDrawable(x2c0.Km);
            case "book":
                return context.getResources().getDrawable(x2c0.Im);
            case "movie":
                return context.getResources().getDrawable(x2c0.Jm);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: w4 */
    default boolean m10165w4() {
        return false;
    }

    /* JADX INFO: renamed from: w5 */
    default Intent m10166w5(Context context, String str, String str2, boolean z, boolean z2) {
        return ProfileAct.p2(context, str, str2, z, z2);
    }

    /* JADX INFO: renamed from: x */
    default boolean m10167x() {
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    default void m10168x0(String str, String str2) {
        a.f0(str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    default void m10169x1(Act act, User user, String str, d30 d30Var, boolean z) {
        ark.m5526E0(act, user, str, d30Var, z);
    }

    /* JADX INFO: renamed from: x2 */
    default boolean m10170x2() {
        return false;
    }

    /* JADX INFO: renamed from: x4 */
    default String m10171x4(final String str) {
        TagCategories tagCategories = (TagCategories) vwb.r(sa40.o().x().a(), new w9j() { // from class: l.o87
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((TagCategories) obj).f176id, str));
            }
        });
        return NullChecker.a(tagCategories) ? tagCategories.name : "";
    }

    /* JADX INFO: renamed from: x5 */
    default void m10172x5(boolean z) {
        OnlineMatchManager.z().p = false;
    }

    /* JADX INFO: renamed from: y */
    default boolean m10173y() {
        return upa.P1();
    }

    /* JADX INFO: renamed from: y0 */
    default int m10174y0() {
        return upa.p3();
    }

    /* JADX INFO: renamed from: y1 */
    default boolean m10175y1() {
        return false;
    }

    /* JADX INFO: renamed from: y2 */
    default void m10176y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        a.x(simpleDraweeView, imageUri, i);
    }

    /* JADX INFO: renamed from: y3 */
    default void m10177y3(Act act, String str) {
        ak50.m5396O().m5425J(act, str);
    }

    /* JADX INFO: renamed from: y4 */
    default void m10178y4(Act act, String str, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.n1(act, str, privilege);
    }

    /* JADX INFO: renamed from: y5 */
    default ChallengeMsg m10179y5(ChallengeMsgList challengeMsgList, Message message) {
        return zq4.a(challengeMsgList, message);
    }

    /* JADX INFO: renamed from: z */
    default boolean m10180z(String str) {
        return zb0.h(str);
    }

    /* JADX INFO: renamed from: z0 */
    default boolean m10181z0() {
        return ((Boolean) OnlineMatchManager.z().o.get()).booleanValue();
    }

    /* JADX INFO: renamed from: z2 */
    default void m10182z2() {
        fap.i().u();
    }

    /* JADX INFO: renamed from: z3 */
    default int m10183z3(Throwable th) {
        return j900.g(th);
    }

    /* JADX INFO: renamed from: z4 */
    default void m10184z4(String str) {
        ygh0.m11198V(str);
    }

    /* JADX INFO: renamed from: w0 */
    default void m10161w0(String str, String str2, boolean z) {
    }
}
