package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAndMedia;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.ReportFrom;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p051p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p051p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.TantanCoreBridge;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapPreviewBaseAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStatusSquareTabFrag;
import com.p051p1.mobile.putong.core.p058ui.verification.age.AgeVerificationAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public interface z97 extends r97 {
    /* JADX INFO: renamed from: Fp */
    static /* synthetic */ void m219047Fp(Act act, x20 x20Var) {
        hxf.m137587h(act, OMSTemplateType.dialog);
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: Tk */
    static /* synthetic */ Unit m219049Tk(Runnable runnable, String str, String str2) {
        if (runnable != null) {
            runnable.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e7 */
    static /* synthetic */ void m219050e7() {
    }

    /* JADX INFO: renamed from: rp */
    static /* synthetic */ void m219052rp() {
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: A */
    default void mo180291A(Act act) {
        qtk.m177999T0(act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: A0 */
    default void mo180292A0(boolean z) {
        CoreStatusSquareTabFrag.f37203X.m137019l(Boolean.valueOf(z));
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: A1 */
    default boolean mo180293A1() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: A3 */
    default int mo180294A3(int i) {
        return a5i0.m96178w0(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: A5 */
    default Intent mo180295A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return ProfileAct.m51905A2(context, str, str2, z, z2, z3);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B */
    default boolean mo180296B() {
        return d79.m114685j0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B0 */
    default List<NewTags> mo180297B0(List<String> list) {
        gj40.C17227h c17227hM130431P = gj40.m130415o().m130431P(list);
        return (NullChecker.m82486a(c17227hM130431P) && c17227hM130431P.f104596a) ? c17227hM130431P.m130460b() : new ArrayList();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B1 */
    default void mo180298B1(Act act, User user) {
        C8619b.m48821r(act, user);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B2 */
    default boolean mo180299B2(Act act) {
        C8520a c8520aM46767e2 = ((GreetAct) act).m46767e2();
        return NullChecker.m82486a(c8520aM46767e2) && c8520aM46767e2.m47038N1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B3 */
    default void mo180300B3(String str) {
        sh00.m185839i(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: B4 */
    default int mo180301B4() {
        return gra.m131704k0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C */
    default boolean mo180302C(int i) {
        return ln7.m154966a(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C0 */
    default void mo180303C0() {
        ConversationsList.m42339A2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C1 */
    default void mo180304C1(Act act, String str) {
        fdw.m125140g(act, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C2 */
    default boolean mo180305C2() {
        return gra.m131666c2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C4 */
    default boolean mo180306C4() {
        return c7d0.m108301j0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: C5 */
    default void mo180307C5(boolean z) {
        qt4.f159383e.put(Boolean.valueOf(z));
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D */
    default boolean mo180308D() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D0 */
    default void mo180309D0(String str, String str2) {
        C8772a.m51439g0(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D1 */
    default void mo180310D1(final Act act) {
        FakeHoldFragment.m37398z4(21862, a0g.m95349E(act), new FakeHoldFragment.InterfaceC7995a() { // from class: l.u97
            @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
            /* JADX INFO: renamed from: a */
            public final void mo37400a(ArrayList arrayList, String str) {
                qtk.m177983L0(act, arrayList);
            }
        }).m37399A4(act.getSupportFragmentManager());
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D2 */
    default String mo180311D2() {
        return gra.m131644X0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D3 */
    default void mo180312D3(String str, String str2) {
        C8772a.m51441h0(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: D4 */
    default void mo180313D4(Act act, User user, int i) {
        pci.m171662K(act, user, i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E */
    default boolean mo180314E() {
        return gra.m131637V1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E0 */
    default void mo180315E0() {
        rcn.m180797q().m180800C();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E1 */
    default void mo180316E1(Context context) {
        new dtf0(context).m117853a();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E2 */
    default bkj0<String, String, String> mo180317E2(String str) {
        return baj.m103179T(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E3 */
    default boolean mo180318E3() {
        return w250.m204531a().m204532b();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: E4 */
    default void mo180319E4(Act act, User user, x20 x20Var) {
        fcw fcwVar = new fcw(act, user);
        fcwVar.m125065R(x20Var);
        fcwVar.show();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: F */
    default boolean mo180320F() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: F1 */
    default void mo180321F1(String str) {
        fph0.m126677k0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: F3 */
    default void mo180322F3(Act act) {
        xc20.m210108t(act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: F5 */
    default boolean mo180323F5() {
        return a5i0.m96091E0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: G0 */
    default boolean mo180324G0() {
        return gra.m131737q3();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: G1 */
    default boolean mo180325G1() {
        return gra.m131554D1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: G3 */
    default String mo180326G3(int i) {
        return s75.m184964l().m184970k(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: G4 */
    default void mo180327G4() {
        fph0.m126641L();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: G5 */
    default void mo180328G5(Act act) {
        ((GreetAct) act).m46767e2().m47069x1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H */
    default int mo180329H() {
        return gra.m131632U0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H1 */
    default void mo180330H1() {
        fph0.m126640K();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H2 */
    default void mo180331H2() {
        rcn.m180797q().m180799B();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H3 */
    default C22421c<Integer> mo180332H3(String str) {
        return wyb0.m208493O().m208557j0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H4 */
    default boolean mo180333H4() {
        return vb0.m200640b();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: H5 */
    default void mo180334H5(Context context, String str, String str2, String str3) {
        gj40.m130415o().m130420E(context, str, str2, str3);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: I0 */
    default boolean mo180335I0() {
        return d79.m114689l0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: I1 */
    default boolean mo180336I1(User user) {
        return d79.m114701r0(user);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: I2 */
    default boolean mo180337I2(int i) {
        return nmp.m163835d(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: I3 */
    default void mo180338I3(String str) {
        syu.m188588i(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J */
    default boolean mo180339J() {
        return vb0.m200643e();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J0 */
    default void mo180340J0(Act act) {
        hxf.m137593n();
        hxf.m137588i(act, OMSTemplateType.dialog, false, false);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J1 */
    default boolean mo180341J1() {
        return s75.m184965m();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J2 */
    default boolean mo180342J2() {
        return gra.m131671d2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J3 */
    default void mo180343J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, x20 x20Var, String str2) {
        CoreDlg.m46274p1(z, z2, user, act, menu, str, x20Var, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J4 */
    default void mo180344J4(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.m49016r2(act, message.cid, new MessageAndMedia(media, message)), media instanceof Video ? null : new n900());
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: J5 */
    default void mo180345J5(final Act act, final x20 x20Var) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
            return;
        }
        CoreDlg.m46170G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", dbc0.f87506v8, "去认证", new x20() { // from class: l.w97
            @Override // p153l.x20
            public final void call() {
                z97.m219047Fp(act, x20Var);
            }
        }, true, "以后再说", new x20() { // from class: l.x97
            @Override // p153l.x20
            public final void call() {
                z97.m219052rp();
            }
        }, new x20() { // from class: l.y97
            @Override // p153l.x20
            public final void call() {
                z97.m219050e7();
            }
        }, null, true, false, null, null, false);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K */
    default String mo180346K() {
        return c7d0.m108298g0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K0 */
    default void mo180347K0() {
        x6d0.m209475l0().m209477j0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K1 */
    default String mo180348K1(String str) {
        return C8772a.m51417R(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K2 */
    default ChatGiftInfoExtra mo180349K2(Message message) {
        return c7d0.m108299h0(message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K3 */
    default void mo180350K3(Intent intent) {
        ProfileCreateData profileCreateData = new ProfileCreateData();
        profileCreateData.checkConv = false;
        intent.putExtra("profile_create_data", profileCreateData);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: K5 */
    default int mo180351K5() {
        return gra.m131759v0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L */
    default void mo180352L(String str) {
        wyb0.m208493O().m208566z0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L1 */
    default boolean mo180353L1(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123183k(tantanForbidden);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L2 */
    default void mo180354L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, boolean z3, boolean z4, String str3) {
        CoreDlg.m46182K1(menu, str, act, z, z2, str2, x20Var, x20Var2, z3, z4, str3);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L3 */
    default void mo180355L3() {
        iz40.m142759D();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L4 */
    default void mo180356L4(Act act, int i) {
        act.startActivityForResult(IntlMapAct.m36950h2(act, 0, false), i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: L5 */
    default boolean mo180357L5() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M */
    default boolean mo180358M() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M0 */
    default CharSequence mo180359M0(Message message, Conversation conversation) {
        return e1b.m118951I0(message, conversation);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M1 */
    default Intent mo180360M1(Context context, String str, String str2, boolean z) {
        return ProfileAct.m51920o2(context, str, str2, z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M3 */
    default Intent mo180361M3(Context context, String str) {
        return AgeVerificationAct.m57248Z1(context, "from_message");
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M4 */
    default boolean mo180362M4() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: M5 */
    default List<ovb0<String, Runnable, Integer, Void>> mo180363M5(Act act, Media media, Message message) {
        return CoreDlg.m46194O1(act, media, message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N */
    default boolean mo180364N() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N0 */
    default int mo180365N0() {
        return dbc0.f86335L6;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N1 */
    default void mo180366N1(Act act, x20 x20Var, boolean z) {
        CoreDlg.m46243e2(act, x20Var, z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N2 */
    default int mo180367N2() {
        return dbc0.f87054hf;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N3 */
    default boolean mo180368N3() {
        return yab.m214865V();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N4 */
    default List<NewTags> mo180369N4() {
        return gj40.m130415o().m130447r();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: N5 */
    default void mo180370N5(String str) {
        fcp.m125022i().m125035A(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: O2 */
    default boolean mo180371O2() {
        return gra.m131688h();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: O3 */
    default void mo180372O3(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var) {
        a5i0.m96173u1(act, str, a30Var, x20Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: O4 */
    default void mo180373O4() {
        qzm0.m178812h().m178823o("voice_entry_media_item");
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: O5 */
    default Privilege mo180374O5(String str) {
        return dk90.m116223b(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: P */
    default void mo180375P() {
        a5i0.m96160p0().m96208W0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: P0 */
    default boolean mo180376P0() {
        return a5i0.m96160p0().m96218g1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: P2 */
    default Intent mo180377P2(Context context, String str) {
        return ConversationSearchAct.m43563d2(context, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: P5 */
    default String mo180378P5(Message message) {
        return e1b.m118960R0(message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q */
    default boolean mo180379Q() {
        return CoreBusinessModule.f18252c.m193932F();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q0 */
    default int mo180380Q0() {
        return gra.m131557E();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q1 */
    default String mo180381Q1(String str) {
        return C8772a.m51415P(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q3 */
    default void mo180382Q3(Act act, User user, x20 x20Var, String str) {
        C8618a.m48771w().m48782K(act, user, x20Var, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q4 */
    default boolean mo180383Q4(String str) {
        return fcp.m125027n(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Q5 */
    default void mo180384Q5(String str) {
        fph0.m126661c0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R */
    default boolean mo180385R() {
        return xg50.m210877c();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R1 */
    default void mo180386R1() {
        iz40.m142758C();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R2 */
    default boolean mo180387R2(String str) {
        return w250.m204531a().m204534d(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R4 */
    default boolean mo180388R4() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R5 */
    default int mo180389R5() {
        return dbc0.f86992fj;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S */
    default void mo180390S() {
        OnlineMatchManager.m51326z().f33460p = true;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S0 */
    default boolean mo180391S0() {
        return CoreModule.f18264c.f20381e0.m116552d8();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S1 */
    default int mo180392S1() {
        return gra.m131699j0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S2 */
    default void mo180393S2(Act act, final Runnable runnable) {
        new DialogC19481q0(act, new Function2() { // from class: l.v97
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z97.m219049Tk(runnable, (String) obj, (String) obj2);
            }
        }).show();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S3 */
    default void mo180394S3(Act act) {
        tx0.m193439o().m193448K(act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S4 */
    default void mo180395S4(boolean z) {
        x6d0.m209475l0().f192574c = false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: S5 */
    default void mo180396S5(boolean z) {
        x6d0.m209475l0().m209481o0(z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T */
    default void mo180397T() {
        iz40.m142756A();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T0 */
    default int mo180398T0() {
        return dbc0.f87072i0;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T1 */
    default boolean mo180399T1(String str) {
        return OnlineMatchManager.m51326z().m51332F(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T2 */
    default void mo180400T2(Act act) {
        act.startActivityForResult(MediaPickerAct.m48970k2(act, 1, false, false, true, null, MediaPickerAct.f31471D, false, false, CoreModule.f18264c.f20381e0.m116600p9().gender, "", false), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T4 */
    default int mo180401T4() {
        return gra.m131624S0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: T5 */
    default boolean mo180402T5(String str) {
        return wyb0.m208495S(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: U0 */
    default int mo180403U0() {
        return gra.m131636V0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: U1 */
    default boolean mo180404U1(x20 x20Var, Activity activity) {
        return wyb0.INSTANCE.m208577k(x20Var, activity);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: U2 */
    default C22421c<PurchaseType> mo180405U2() {
        return fp60.m126543E().map(new qcj() { // from class: l.t97
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((PaymentResultWrapper) obj).purchaseType;
            }
        });
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: U3 */
    default boolean mo180406U3() {
        return gra.m131576H3();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: U5 */
    default boolean mo180407U5(Act act, x20 x20Var) {
        return a5i0.m96098G1(act, x20Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V */
    default void mo180408V(Act act, User user, x20 x20Var) {
        mo180382Q3(act, user, x20Var, null);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V0 */
    default boolean mo180409V0() {
        return gra.m131555D2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V1 */
    default void mo180410V1(Context context, String str, String str2) {
        c9e0.m108440e(context, str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V2 */
    default void mo180411V2(Act act, Message message) {
        ((GreetAct) act).m46774n2(message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V3 */
    default NewTags mo180412V3(String str) {
        return gj40.m130415o().m130430O(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V4 */
    default int mo180413V4() {
        return gra.m131764w0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: V5 */
    default void mo180414V5(String str) {
        fph0.m126659b0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W */
    default long mo180415W(User user) {
        return wtd0.m207832d(user);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W0 */
    default void mo180416W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, x20 x20Var, boolean z2, String str, boolean z3, y20<Boolean> y20Var) {
        C8772a.m51404E(act, onlineMatchPushUser, z, x20Var, z2, str, z3, y20Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W1 */
    default WarmingUpResConfig mo180417W1() {
        return gra.m131710l1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W3 */
    default String mo180418W3(String str) {
        return C8772a.m51412M(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W4 */
    default void mo180419W4(Act act, String str) {
        CoreDlg.m46218W1(act, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: W5 */
    default void mo180420W5(boolean z, Menu menu, String str, Act act) {
        CoreDlg.m46253i1(z, menu, str, act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: X */
    default boolean mo180421X() {
        return gra.m131676e2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: X0 */
    default void mo180422X0(TextView textView, Gender gender, int i, boolean z, User user) {
        rgk0.m181451d(textView, gender, i, z, user);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: X1 */
    default void mo180423X1(String str) {
        OnlineMatchManager.m51326z().m51358g0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: X2 */
    default void mo180424X2(String str) {
        fph0.m126650U(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: X3 */
    default WechatNotifyConfig mo180425X3() {
        return gra.m131715m1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Y */
    default void mo180426Y(Activity activity, Uri uri) {
        xwa.m213304D(activity, uri);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Y0 */
    default boolean mo180427Y0(String str) {
        return C8772a.m51411L(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Y2 */
    default void mo180428Y2() {
        y6d0.m214464c();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Y5 */
    default void mo180429Y5(Act act, String str, String str2) {
        CoreDlg.m46289u1(act, str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Z */
    default void mo180430Z(Act act, String str, long j) {
        a5i0.m96158o1(act, str, j);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Z0 */
    default boolean mo180431Z0() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Z1 */
    default C22421c<Boolean> mo180432Z1() {
        return qt4.f159383e.obs();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Z2 */
    default void mo180433Z2(Act act, boolean z) {
        qyp.m178723i().m178729n(act, z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Z4 */
    default boolean mo180434Z4(Act act, String str) {
        return OnlineMatchManager.m51326z().m51370s0(act, OnlineMatchManager.QuickChatStartClickFrom.Home, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: a0 */
    default void mo180435a0(Act act, String str, boolean z) {
        act.startActivity(MediaPreviewAct.m49019v2(act, str, z));
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: a1 */
    default boolean mo180436a1() {
        return d79.m114683i0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: a2 */
    default boolean mo180437a2() {
        return t450.m189175j();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: a4 */
    default void mo180438a4(Act act, String str, String str2) {
        ((GreetAct) act).m46767e2().m47070z1(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: a5 */
    default boolean mo180439a5() {
        return fdw.m125139e().f98521j;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b */
    default boolean mo180440b() {
        return vq8.m202358b();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b0 */
    default boolean mo180441b0(User user) {
        return gj40.m130415o().m130425J(user);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b1 */
    default String mo180442b1(ProductCategory productCategory) {
        return dk90.m116226e(productCategory);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b2 */
    default void mo180443b2(CoreInnerPush.C4867a c4867a) {
        TantanCoreBridge.f30792h.m137019l(c4867a);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b4 */
    default boolean mo180444b4() {
        return rm50.m182043d();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: b5 */
    default boolean mo180445b5() {
        return spl0.m187361M();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c */
    default boolean mo180446c() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c0 */
    default boolean mo180447c0(String str, String str2) {
        return C8772a.m51423X(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c1 */
    default void mo180448c1(Act act, Menu menu, String str) {
        CoreDlg.m46271o1(act, menu, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c3 */
    default void mo180449c3(int i) {
        CoreBusinessModule.f18253d.m207530b(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c4 */
    default boolean mo180450c4(Conversation conversation) {
        return OnlineMatchManager.m51326z().m51337K(conversation);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: c5 */
    default String mo180451c5(String str) {
        return C8772a.m51414O(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: d */
    default void mo180452d(Throwable th) {
        ey6.m123174b(th);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: d0 */
    default void mo180453d0(String str) {
        WebSocketManager.m30421Q().m30473i0(new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING, WebSocketManager.m30420N(), LongLinkChatTypingMessage.ChatTyping.newBuilder().setUserId(CoreModule.m30929H().userId()).setOtherUserId(str).build()).m173324a());
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: d1 */
    default void mo180454d1(Act act) {
        C8772a.m51447k0(act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: d3 */
    default boolean mo180455d3() {
        return a5i0.m96106K();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: d5 */
    default void mo180456d5(Act act, String str, String str2, String str3) {
        yr4.m217157c(act, str, str2, str3);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e */
    default boolean mo180457e() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e0 */
    default void mo180458e0(Act act, Message message) {
        ((GreetAct) act).m46767e2().m47036J1(message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e1 */
    default boolean mo180459e1(String str, String str2) {
        return C8772a.m51424Y(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e3 */
    default void mo180460e3(String str) {
        fph0.m126673i0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e4 */
    default boolean mo180461e4() {
        return sh00.m185841k();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: e5 */
    default void mo180462e5(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2) {
        a5i0.m96085B1(act, purchaseType, x20Var, x20Var2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f */
    default boolean mo180463f() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f0 */
    default String mo180464f0(double d) {
        return C8772a.m51409J(d);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f1 */
    default Intent mo180465f1(Context context, MessageLocation messageLocation) {
        return IntlMapPreviewBaseAct.m48581Z1(context, messageLocation);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f2 */
    default void mo180466f2(Act act) {
        x6d0.m209475l0().m209484r0(act);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f3 */
    default int mo180467f3() {
        return dbc0.f87061hm;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f4 */
    default boolean mo180468f4() {
        return gra.m131649Y1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: f5 */
    default Intent mo180469f5(Context context) {
        return MarryEditProfileSeriesAct.m48635Z1(context, CoreModule.m30930K().me_(), jyb.m147507f0(MarrySeriesType.PROLOGUE), false, true, false);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: g */
    default boolean mo180470g() {
        return rum0.m183208c();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: g0 */
    default int mo180471g0() {
        return xfc0.f194022a;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: g1 */
    default boolean mo180472g1() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: g2 */
    default C22508b<uxj0> mo180473g2() {
        return gj40.m130415o().f104572j;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: g3 */
    default String mo180474g3(String str) {
        return C8772a.m51413N(str);
    }

    @Override // p153l.r97
    default Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return xwa.m213316k(context, navigationIntent);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h */
    default String mo180475h() {
        return syu.m188587h();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h0 */
    default boolean mo180476h0() {
        return iz40.m142757B();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h1 */
    default boolean mo180477h1() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h2 */
    default boolean mo180478h2(RecyclerView recyclerView) {
        return c7d0.m108297f0(recyclerView);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h3 */
    default boolean mo180479h3() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: h4 */
    default void mo180480h4(Act act, String str, String str2, String str3, String str4) {
        ndk.m162716c(act, str, str2, str3, str4);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: i */
    default boolean mo180481i() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: i1 */
    default int mo180482i1(String str) {
        return upm.m197122S(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: i2 */
    default boolean mo180483i2(Throwable th) {
        return ey6.m123178f((TantanException.Client.TantanForbidden) th);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: i3 */
    default String mo180484i3(ProfileZodiac profileZodiac) {
        return q8g0.m175804j0(profileZodiac);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: i4 */
    default void mo180485i4(String str) {
        fph0.m126652W(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: j */
    default boolean mo180486j() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: j1 */
    default Intent mo180487j1(Act act, String str, ResultReceiver resultReceiver) {
        return ReportAct.m55813d2(act, str, "", false, resultReceiver, ReportFrom.CHAT.getFrom());
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: j2 */
    default int mo180488j2() {
        return dbc0.f86291Jq;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: j4 */
    default void mo180489j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str) {
        ((GreetAct) act).m46775o2(message, coreGiftInfo, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: j5 */
    default boolean mo180490j5(Conversation conversation) {
        return wyb0.m208496X(conversation);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: k0 */
    default boolean mo180491k0() {
        return spl0.m187388n();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: k1 */
    default boolean mo180492k1() {
        return OnlineMatchManager.m51326z().f33460p;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: k3 */
    default boolean mo180493k3() {
        return fdw.m125139e().m125144f() > 0;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: k5 */
    default boolean mo180494k5() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: l */
    default boolean mo180495l() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: l0 */
    default boolean mo180496l0() {
        return vb0.m200642d();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: l2 */
    default int mo180497l2() {
        return wyb0.m208508i0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: l4 */
    default boolean mo180498l4(String str, String str2) {
        return C8772a.m51427a0(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: m */
    default String mo180499m(List<String> list, List<String> list2) {
        return baj.m103172M(list, list2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: m0 */
    default WarmingUpEmoResConfig mo180500m0() {
        return gra.m131705k1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: m1 */
    default String mo180501m1() {
        return CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: m4 */
    default void mo180502m4(Menu menu, String str, Act act, x20 x20Var) {
        CoreDlg.m46152A1(menu, str, act, x20Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: m5 */
    default int mo180503m5() {
        return dbc0.f86688W7;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n0 */
    default String mo180504n0(boolean z) {
        return z ? "group_notification_anonymity" : "group_notification";
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n1 */
    default void mo180505n1(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.m49017s2(act, message.cid, new MessageAndMedia(media, message), true), media instanceof Video ? null : new n900());
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n2 */
    default BottomSheetDialog mo180506n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, z20<String, String> z20Var) {
        return CoreDlg.m46197P1(act, str, str2, str3, i, str4, str5, str6, list, str7, z20Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n3 */
    default String mo180507n3(boolean z) {
        return c7d0.m108300i0(z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n4 */
    default void mo180508n4(Act act, String str) {
        a5i0.m96161p1(act, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: n5 */
    default boolean mo180509n5() {
        return spl0.m187365Q();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o */
    default boolean mo180510o() {
        return gra.m131539A1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o0 */
    default boolean mo180511o0() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o1 */
    default boolean mo180512o1(String str) {
        return C8619b.m48825v(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o2 */
    default void mo180513o2() {
        JailedDialogLikeAct.m45368o2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o3 */
    default void mo180514o3(Act act, String str, x20 x20Var, String str2) {
        x6d0.m209475l0();
        x6d0.m209476u0(act, str, x20Var, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o4 */
    default boolean mo180515o4(Conversation conversation) {
        return fcp.m125026m(conversation);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: o5 */
    default boolean mo180516o5() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p */
    default boolean mo180517p() {
        return gra.m131657a2();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p1 */
    default boolean mo180518p1() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p2 */
    default void mo180519p2() {
        ConversationsList.f25824v1.m137019l(uxj0.f181467a);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p3 */
    default boolean mo180520p3(String str) {
        return wyb0.m208493O().m208550Z(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p4 */
    default boolean mo180521p4() {
        return gra.m131591K3();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: p5 */
    default boolean mo180522p5() {
        return x6d0.m209475l0().m209478k0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: q */
    default boolean mo180523q() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: q1 */
    default boolean mo180524q1() {
        return gra.m131571G3();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: q2 */
    default vxd0 mo180525q2() {
        return gj40.m130415o().f104570h;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: q3 */
    default void mo180526q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, y20<Boolean> y20Var, qcj<Throwable, Boolean> qcjVar) {
        c7d0.m108302k0(putongAct, coreSendGiftBody, y20Var, qcjVar);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: q5 */
    default String mo180527q5(Literatures literatures) {
        return epc0.m121846a(literatures);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r0 */
    default void mo180528r0(String str) {
        C8772a.m51433d0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r1 */
    default void mo180529r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, String str3) {
        CoreDlg.m46179J1(menu, str, act, z, z2, str2, x20Var, x20Var2, str3);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r2 */
    default void mo180530r2(String str, String str2) {
        C8772a.m51443i0(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r3 */
    default boolean mo180531r3(String str, String str2) {
        return C8772a.m51425Z(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r4 */
    default void mo180532r4(String str) {
        fph0.m126657a0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: r5 */
    default pf60<Integer, Integer> mo180533r5(int i) {
        return C8772a.m51467z(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: s1 */
    default void mo180534s1(String str) {
        asj0.m99937f0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: s4 */
    default boolean mo180535s4() {
        return spl0.m187358J();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: s5 */
    default boolean mo180536s5() {
        return gra.m131691h2();
    }

    @Override // p153l.r97
    default void showProofAgeDlg(Act act, String str) {
        vb0.m200647i(act, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: t */
    default boolean mo180537t() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: t0 */
    default boolean mo180538t0() {
        return iz40.m142789z();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: t1 */
    default boolean mo180539t1() {
        return qt4.f159383e.get().booleanValue();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: t3 */
    default Collection<Integer> mo180540t3() {
        return CoreBusinessModule.f18253d.m207541o();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: t4 */
    default boolean mo180541t4(Act act) {
        return act instanceof GreetAct;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: u */
    default boolean mo180542u() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: u1 */
    default void mo180543u1(String str) {
        C8772a.m51431c0(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: u2 */
    default void mo180544u2(String str, boolean z) {
        fph0.m126675j0(str, z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: u3 */
    default void mo180545u3(int i) {
        CoreBusinessModule.f18253d.m207530b(i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: v */
    default boolean mo180546v() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: v1 */
    default boolean mo180547v1() {
        return NewMainAct.f25176r.get().booleanValue();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: v2 */
    default String mo180548v2() {
        return gra.m131675e1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: v3 */
    default Intent mo180549v3(Context context, String str) {
        return NationalIdAuthAct.m57255X1(context, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: v5 */
    default boolean mo180550v5() {
        return eu4.m122523b().m122529g();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w1 */
    default void mo180552w1(ovb0<String, Integer, Integer, Integer> ovb0Var) {
        TantanCoreBridge.f30793i.m137019l(ovb0Var);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w2 */
    default boolean mo180553w2() {
        return x6d0.m209475l0().m209479m0();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w3 */
    default Drawable mo180554w3(Context context, String str) {
        str.getClass();
        switch (str) {
            case "teleplay":
                return context.getResources().getDrawable(dbc0.f87617yn);
            case "book":
                return context.getResources().getDrawable(dbc0.f87553wn);
            case "movie":
                return context.getResources().getDrawable(dbc0.f87585xn);
            default:
                return null;
        }
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w4 */
    default boolean mo180555w4() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w5 */
    default Intent mo180556w5(Context context, String str, String str2, boolean z, boolean z2) {
        return ProfileAct.m51922q2(context, str, str2, z, z2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x */
    default boolean mo180557x() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x0 */
    default void mo180558x0(String str, String str2) {
        C8772a.m51437f0(str, str2);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x1 */
    default void mo180559x1(Act act, User user, String str, x20 x20Var, boolean z) {
        qtk.m177969E0(act, user, str, x20Var, z);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x2 */
    default boolean mo180560x2() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x4 */
    default String mo180561x4(final String str) {
        TagCategories tagCategories = (TagCategories) jyb.m147529r(gj40.m130415o().m130453x().m130461a(), new qcj() { // from class: l.s97
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((TagCategories) obj).f21256id, str));
            }
        });
        return NullChecker.m82486a(tagCategories) ? tagCategories.name : "";
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: x5 */
    default void mo180562x5(boolean z) {
        OnlineMatchManager.m51326z().f33460p = false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y */
    default boolean mo180563y() {
        return gra.m131613P1();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y0 */
    default int mo180564y0() {
        return gra.m131732p3();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y1 */
    default boolean mo180565y1() {
        return false;
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y2 */
    default void mo180566y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        C8772a.m51465x(simpleDraweeView, imageUri, i);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y3 */
    default void mo180567y3(Act act, String str) {
        gs50.m131966O().m131995J(act, str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y4 */
    default void mo180568y4(Act act, String str, Privilege privilege) {
        C8927c.m54659n1(act, str, privilege);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: y5 */
    default ChallengeMsg mo180569y5(ChallengeMsgList challengeMsgList, Message message) {
        return yr4.m217155a(challengeMsgList, message);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: z */
    default boolean mo180570z(String str) {
        return vb0.m200646h(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: z0 */
    default boolean mo180571z0() {
        return OnlineMatchManager.m51326z().f33459o.get().booleanValue();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: z2 */
    default void mo180572z2() {
        fcp.m125022i().m125042u();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: z3 */
    default int mo180573z3(Throwable th) {
        return sh00.m185837g(th);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: z4 */
    default void mo180574z4(String str) {
        fph0.m126651V(str);
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: w0 */
    default void mo180551w0(String str, String str2, boolean z) {
    }
}
