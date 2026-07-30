package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAndMedia;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.ReportFrom;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p046p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p046p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.TantanCoreBridge;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapPreviewBaseAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStatusSquareTabFrag;
import com.p046p1.mobile.putong.core.p053ui.verification.age.AgeVerificationAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes10.dex */
public interface v87 extends n87 {
    /* JADX INFO: renamed from: Fp */
    static /* synthetic */ void m197394Fp(Act act, d30 d30Var) {
        tvf.m190730h(act, OMSTemplateType.dialog);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Tk */
    static /* synthetic */ Unit m197396Tk(Runnable runnable, String str, String str2) {
        if (runnable != null) {
            runnable.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e7 */
    static /* synthetic */ void m197397e7() {
    }

    /* JADX INFO: renamed from: rp */
    static /* synthetic */ void m197399rp() {
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: A */
    default void mo158199A(Act act) {
        ark.m98449T0(act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: A0 */
    default void mo158200A0(boolean z) {
        CoreStatusSquareTabFrag.f36355X.m132487l(Boolean.valueOf(z));
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: A1 */
    default boolean mo158201A1() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: A3 */
    default int mo158202A3(int i) {
        return swh0.m186273w0(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: A5 */
    default Intent mo158203A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return ProfileAct.m50746z2(context, str, str2, z, z2, z3);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B */
    default boolean mo158204B() {
        return u59.m191827f0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B0 */
    default List<NewTags> mo158205B0(List<String> list) {
        sa40.C19884h c19884hM182818P = sa40.m182802o().m182818P(list);
        return (NullChecker.m81303a(c19884hM182818P) && c19884hM182818P.f163299a) ? c19884hM182818P.m182847b() : new ArrayList();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B1 */
    default void mo158206B1(Act act, User user) {
        C8456b.m47638r(act, user);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B2 */
    default boolean mo158207B2(Act act) {
        C8357a c8357aM45584d2 = ((GreetAct) act).m45584d2();
        return NullChecker.m81303a(c8357aM45584d2) && c8357aM45584d2.m45855N1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B3 */
    default void mo158208B3(String str) {
        j900.m140495i(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: B4 */
    default int mo158209B4() {
        return upa.m194773k0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C */
    default boolean mo158210C(int i) {
        return hm7.m131699a(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C0 */
    default void mo158211C0() {
        ConversationsList.m41328A2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C1 */
    default void mo158212C1(Act act, String str) {
        hbw.m130340g(act, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C2 */
    default boolean mo158213C2() {
        return upa.m194735c2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C4 */
    default boolean mo158214C4() {
        return zyc0.m220918j0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: C5 */
    default void mo158215C5(boolean z) {
        rs4.f160804e.put(Boolean.valueOf(z));
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D */
    default boolean mo158216D() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D0 */
    default void mo158217D0(String str, String str2) {
        C8609a.m50256g0(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D1 */
    default void mo158218D1(final Act act) {
        FakeHoldFragment.m36395z4(21862, myf.m157025E(act), new FakeHoldFragment.InterfaceC7844a() { // from class: l.q87
            @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
            /* JADX INFO: renamed from: a */
            public final void mo36397a(ArrayList arrayList, String str) {
                ark.m98433L0(act, arrayList);
            }
        }).m36396A4(act.getSupportFragmentManager());
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D2 */
    default String mo158219D2() {
        return upa.m194713X0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D3 */
    default void mo158220D3(String str, String str2) {
        C8609a.m50258h0(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: D4 */
    default void mo158221D4(Act act, User user, int i) {
        abi.m95623K(act, user, i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E */
    default boolean mo158222E() {
        return upa.m194706V1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E0 */
    default void mo158223E0() {
        ran.m178515q().m178518C();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E1 */
    default void mo158224E1(Context context) {
        new ukf0(context).m194154a();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E2 */
    default xaj0<String, String, String> mo158225E2(String str) {
        return h7j.m129708T(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E3 */
    default boolean mo158226E3() {
        return hu40.m133026a().m133027b();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: E4 */
    default void mo158227E4(Act act, User user, d30 d30Var) {
        haw hawVar = new haw(act, user);
        hawVar.m130240R(d30Var);
        hawVar.show();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: F */
    default boolean mo158228F() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: F1 */
    default void mo158229F1(String str) {
        ygh0.m214689k0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: F3 */
    default void mo158230F3(Act act) {
        p420.m167354t(act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: F5 */
    default boolean mo158231F5() {
        return swh0.m186186E0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: G0 */
    default boolean mo158232G0() {
        return upa.m194806q3();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: G1 */
    default boolean mo158233G1() {
        return upa.m194623D1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: G3 */
    default String mo158234G3(int i) {
        return r65.m178034l().m178040k(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: G4 */
    default void mo158235G4() {
        ygh0.m214653L();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: G5 */
    default void mo158236G5(Act act) {
        ((GreetAct) act).m45584d2().m45886x1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H */
    default int mo158237H() {
        return upa.m194701U0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H1 */
    default void mo158238H1() {
        ygh0.m214652K();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H2 */
    default void mo158239H2() {
        ran.m178515q().m178517B();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H3 */
    default C22306c<Integer> mo158240H3(String str) {
        return sqb0.m185498O().m185562j0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H4 */
    default boolean mo158241H4() {
        return zb0.m217805b();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: H5 */
    default void mo158242H5(Context context, String str, String str2, String str3) {
        sa40.m182802o().m182807E(context, str, str2, str3);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: I0 */
    default boolean mo158243I0() {
        return u59.m191831h0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: I1 */
    default boolean mo158244I1(User user) {
        return u59.m191843n0(user);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: I2 */
    default boolean mo158245I2(int i) {
        return nkp.m159985d(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: I3 */
    default void mo158246I3(String str) {
        rwu.m181460i(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J */
    default boolean mo158247J() {
        return zb0.m217808e();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J0 */
    default void mo158248J0(Act act) {
        tvf.m190736n();
        tvf.m190731i(act, OMSTemplateType.dialog, false, false);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J1 */
    default boolean mo158249J1() {
        return r65.m178035m();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J2 */
    default boolean mo158250J2() {
        return upa.m194740d2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J3 */
    default void mo158251J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2) {
        CoreDlg.m45091p1(z, z2, user, act, menu, str, d30Var, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J4 */
    default void mo158252J4(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.m47832q2(act, message.cid, new MessageAndMedia(media, message)), media instanceof Video ? null : new q000());
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: J5 */
    default void mo158253J5(final Act act, final d30 d30Var) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
            return;
        }
        CoreDlg.m44987G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", x2c0.f190611u8, "去认证", new d30() { // from class: l.s87
            @Override // p149l.d30
            public final void call() {
                v87.m197394Fp(act, d30Var);
            }
        }, true, "以后再说", new d30() { // from class: l.t87
            @Override // p149l.d30
            public final void call() {
                v87.m197399rp();
            }
        }, new d30() { // from class: l.u87
            @Override // p149l.d30
            public final void call() {
                v87.m197397e7();
            }
        }, null, true, false, null, null, false);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K */
    default String mo158254K() {
        return zyc0.m220915g0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K0 */
    default void mo158255K0() {
        uyc0.m196272l0().m196274j0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K1 */
    default String mo158256K1(String str) {
        return C8609a.m50234R(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K2 */
    default ChatGiftInfoExtra mo158257K2(Message message) {
        return zyc0.m220916h0(message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K3 */
    default void mo158258K3(Intent intent) {
        ProfileCreateData profileCreateData = new ProfileCreateData();
        profileCreateData.checkConv = false;
        intent.putExtra("profile_create_data", profileCreateData);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: K5 */
    default int mo158259K5() {
        return upa.m194828v0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L */
    default void mo158260L(String str) {
        sqb0.m185498O().m185571z0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L1 */
    default boolean mo158261L1(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104292k(tantanForbidden);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L2 */
    default void mo158262L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3) {
        CoreDlg.m44999K1(menu, str, act, z, z2, str2, d30Var, d30Var2, z3, z4, str3);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L3 */
    default void mo158263L3() {
        uq40.m194954D();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L4 */
    default void mo158264L4(Act act, int i) {
        act.startActivityForResult(IntlMapAct.m35947g2(act, 0, false), i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: L5 */
    default boolean mo158265L5() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M */
    default boolean mo158266M() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M0 */
    default CharSequence mo158267M0(Message message, Conversation conversation) {
        return rza.m181729I0(message, conversation);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M1 */
    default Intent mo158268M1(Context context, String str, String str2, boolean z) {
        return ProfileAct.m50736n2(context, str, str2, z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M3 */
    default Intent mo158269M3(Context context, String str) {
        return AgeVerificationAct.m56065Y1(context, "from_message");
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M4 */
    default boolean mo158270M4() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: M5 */
    default List<knb0<String, Runnable, Integer, Void>> mo158271M5(Act act, Media media, Message message) {
        return CoreDlg.m45011O1(act, media, message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N */
    default boolean mo158272N() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N0 */
    default int mo158273N0() {
        return x2c0.f189476K6;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N1 */
    default void mo158274N1(Act act, d30 d30Var, boolean z) {
        CoreDlg.m45060e2(act, d30Var, z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N2 */
    default int mo158275N2() {
        return x2c0.f190585te;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N3 */
    default boolean mo158276N3() {
        return l9b.m149013V();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N4 */
    default List<NewTags> mo158277N4() {
        return sa40.m182802o().m182834r();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: N5 */
    default void mo158278N5(String str) {
        fap.m120255i().m120268A(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: O2 */
    default boolean mo158279O2() {
        return upa.m194757h();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: O3 */
    default void mo158280O3(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        swh0.m186268u1(act, str, g30Var, d30Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: O4 */
    default void mo158281O4() {
        mqm0.m155965h().m155976o("voice_entry_media_item");
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: O5 */
    default Privilege mo158282O5(String str) {
        return zb90.m217825b(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: P */
    default void mo158283P() {
        swh0.m186255p0().m186303W0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: P0 */
    default boolean mo158284P0() {
        return swh0.m186255p0().m186313g1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: P2 */
    default Intent mo158285P2(Context context, String str) {
        return ConversationSearchAct.m42552c2(context, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: P5 */
    default String mo158286P5(Message message) {
        return rza.m181738R0(message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q */
    default boolean mo158287Q() {
        return CoreBusinessModule.f17533c.m177363F();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q0 */
    default int mo158288Q0() {
        return upa.m194626E();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q1 */
    default String mo158289Q1(String str) {
        return C8609a.m50232P(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q3 */
    default void mo158290Q3(Act act, User user, d30 d30Var, String str) {
        C8455a.m47588w().m47599K(act, user, d30Var, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q4 */
    default boolean mo158291Q4(String str) {
        return fap.m120260n(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Q5 */
    default void mo158292Q5(String str) {
        ygh0.m214673c0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R */
    default boolean mo158293R() {
        return q850.m173340c();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R1 */
    default void mo158294R1() {
        uq40.m194953C();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R2 */
    default boolean mo158295R2(String str) {
        return hu40.m133026a().m133029d(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R4 */
    default boolean mo158296R4() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R5 */
    default int mo158297R5() {
        return x2c0.f190525ri;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S */
    default void mo158298S() {
        OnlineMatchManager.m50143z().f32612p = true;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S0 */
    default boolean mo158299S0() {
        return CoreModule.f17545c.f19639e0.m169479d8();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S1 */
    default int mo158300S1() {
        return upa.m194768j0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S2 */
    default void mo158301S2(Act act, final Runnable runnable) {
        new DialogC19382q0(act, new Function2() { // from class: l.r87
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return v87.m197396Tk(runnable, (String) obj, (String) obj2);
            }
        }).show();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S3 */
    default void mo158302S3(Act act) {
        mx0.m156802o().m156811K(act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S4 */
    default void mo158303S4(boolean z) {
        uyc0.m196272l0().f178850c = false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: S5 */
    default void mo158304S5(boolean z) {
        uyc0.m196272l0().m196278o0(z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T */
    default void mo158305T() {
        uq40.m194951A();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T0 */
    default int mo158306T0() {
        return x2c0.f190189h0;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T1 */
    default boolean mo158307T1(String str) {
        return OnlineMatchManager.m50143z().m50149F(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T2 */
    default void mo158308T2(Act act) {
        act.startActivityForResult(MediaPickerAct.m47787i2(act, 1, false, false, true, null, MediaPickerAct.f30623D, false, false, CoreModule.f17545c.f19639e0.m169527p9().gender, "", false), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T4 */
    default int mo158309T4() {
        return upa.m194693S0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: T5 */
    default boolean mo158310T5(String str) {
        return sqb0.m185500S(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: U0 */
    default int mo158311U0() {
        return upa.m194705V0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: U1 */
    default boolean mo158312U1(d30 d30Var, Activity activity) {
        return sqb0.INSTANCE.m185582k(d30Var, activity);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: U2 */
    default C22306c<PurchaseType> mo158313U2() {
        return ah60.m96370E().map(new w9j() { // from class: l.p87
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((PaymentResultWrapper) obj).purchaseType;
            }
        });
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: U3 */
    default boolean mo158314U3() {
        return upa.m194645H3();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: U5 */
    default boolean mo158315U5(Act act, d30 d30Var) {
        return swh0.m186193G1(act, d30Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V */
    default void mo158316V(Act act, User user, d30 d30Var) {
        mo158290Q3(act, user, d30Var, null);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V0 */
    default boolean mo158317V0() {
        return upa.m194624D2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V1 */
    default void mo158318V1(Context context, String str, String str2) {
        y0e0.m212111e(context, str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V2 */
    default void mo158319V2(Act act, Message message) {
        ((GreetAct) act).m45591m2(message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V3 */
    default NewTags mo158320V3(String str) {
        return sa40.m182802o().m182817O(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V4 */
    default int mo158321V4() {
        return upa.m194833w0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: V5 */
    default void mo158322V5(String str) {
        ygh0.m214671b0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W */
    default long mo158323W(User user) {
        return uld0.m194219d(user);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W0 */
    default void mo158324W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str, boolean z3, e30<Boolean> e30Var) {
        C8609a.m50221E(act, onlineMatchPushUser, z, d30Var, z2, str, z3, e30Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W1 */
    default WarmingUpResConfig mo158325W1() {
        return upa.m194779l1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W3 */
    default String mo158326W3(String str) {
        return C8609a.m50229M(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W4 */
    default void mo158327W4(Act act, String str) {
        CoreDlg.m45035W1(act, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: W5 */
    default void mo158328W5(boolean z, Menu menu, String str, Act act) {
        CoreDlg.m45070i1(z, menu, str, act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: X */
    default boolean mo158329X() {
        return upa.m194745e2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: X0 */
    default void mo158330X0(TextView textView, Gender gender, int i, boolean z, User user) {
        l7k0.m148809d(textView, gender, i, z, user);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: X1 */
    default void mo158331X1(String str) {
        OnlineMatchManager.m50143z().m50175g0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: X2 */
    default void mo158332X2(String str) {
        ygh0.m214662U(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: X3 */
    default WechatNotifyConfig mo158333X3() {
        return upa.m194784m1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Y */
    default void mo158334Y(Activity activity, Uri uri) {
        lva.m151843D(activity, uri);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Y0 */
    default boolean mo158335Y0(String str) {
        return C8609a.m50228L(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Y2 */
    default void mo158336Y2() {
        vyc0.m200628c();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Y5 */
    default void mo158337Y5(Act act, String str, String str2) {
        CoreDlg.m45106u1(act, str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Z */
    default void mo158338Z(Act act, String str, long j) {
        swh0.m186253o1(act, str, j);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Z0 */
    default boolean mo158339Z0() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Z1 */
    default C22306c<Boolean> mo158340Z1() {
        return rs4.f160804e.obs();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Z2 */
    default void mo158341Z2(Act act, boolean z) {
        qwp.m176882i().m176888n(act, z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Z4 */
    default boolean mo158342Z4(Act act, String str) {
        return OnlineMatchManager.m50143z().m50187s0(act, OnlineMatchManager.QuickChatStartClickFrom.Home, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: a0 */
    default void mo158343a0(Act act, String str, boolean z) {
        act.startActivity(MediaPreviewAct.m47835u2(act, str, z));
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: a1 */
    default boolean mo158344a1() {
        return u59.m191825e0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: a2 */
    default boolean mo158345a2() {
        return ew40.m118398j();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: a4 */
    default void mo158346a4(Act act, String str, String str2) {
        ((GreetAct) act).m45584d2().m45887z1(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: a5 */
    default boolean mo158347a5() {
        return hbw.m130339e().f106977j;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b */
    default boolean mo158348b() {
        return qp8.m175817b();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b0 */
    default boolean mo158349b0(User user) {
        return sa40.m182802o().m182812J(user);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b1 */
    default String mo158350b1(ProductCategory productCategory) {
        return zb90.m217828e(productCategory);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b2 */
    default void mo158351b2(CoreInnerPush.C4716a c4716a) {
        TantanCoreBridge.f29944h.m132487l(c4716a);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b4 */
    default boolean mo158352b4() {
        return ke50.m145717d();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: b5 */
    default boolean mo158353b5() {
        return ogl0.m164234M();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c */
    default boolean mo158354c() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c0 */
    default boolean mo158355c0(String str, String str2) {
        return C8609a.m50240X(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c1 */
    default void mo158356c1(Act act, Menu menu, String str) {
        CoreDlg.m45088o1(act, menu, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c3 */
    default void mo158357c3(int i) {
        CoreBusinessModule.f17534d.m127649b(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c4 */
    default boolean mo158358c4(Conversation conversation) {
        return OnlineMatchManager.m50143z().m50154K(conversation);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: c5 */
    default String mo158359c5(String str) {
        return C8609a.m50231O(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: d */
    default void mo158360d(Throwable th) {
        bx6.m104283b(th);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: d0 */
    default void mo158361d0(String str) {
        WebSocketManager.m29423Q().m29475i0(new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING, WebSocketManager.m29422N(), LongLinkChatTypingMessage.ChatTyping.newBuilder().setUserId(CoreModule.m29931H().userId()).setOtherUserId(str).build()).m146053a());
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: d1 */
    default void mo158362d1(Act act) {
        C8609a.m50264k0(act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: d3 */
    default boolean mo158363d3() {
        return swh0.m186201K();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: d5 */
    default void mo158364d5(Act act, String str, String str2, String str3) {
        zq4.m219846c(act, str, str2, str3);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e */
    default boolean mo158365e() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e0 */
    default void mo158366e0(Act act, Message message) {
        ((GreetAct) act).m45584d2().m45853J1(message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e1 */
    default boolean mo158367e1(String str, String str2) {
        return C8609a.m50241Y(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e3 */
    default void mo158368e3(String str) {
        ygh0.m214685i0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e4 */
    default boolean mo158369e4() {
        return j900.m140497k();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: e5 */
    default void mo158370e5(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        swh0.m186180B1(act, purchaseType, d30Var, d30Var2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f */
    default boolean mo158371f() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f0 */
    default String mo158372f0(double d) {
        return C8609a.m50226J(d);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f1 */
    default Intent mo158373f1(Context context, MessageLocation messageLocation) {
        return IntlMapPreviewBaseAct.m47398Y1(context, messageLocation);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f2 */
    default void mo158374f2(Act act) {
        uyc0.m196272l0().m196281r0(act);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f3 */
    default int mo158375f3() {
        return x2c0.f190592tl;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f4 */
    default boolean mo158376f4() {
        return upa.m194718Y1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: f5 */
    default Intent mo158377f5(Context context) {
        return MarryEditProfileSeriesAct.m47452Y1(context, CoreModule.m29932K().me_(), vwb.m200324f0(MarrySeriesType.PROLOGUE), false, true, false);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: g */
    default boolean mo158378g() {
        return nlm0.m160070c();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: g0 */
    default int mo158379g0() {
        return t7c0.f168687a;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: g1 */
    default boolean mo158380g1() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: g2 */
    default C22393b<roj0> mo158381g2() {
        return sa40.m182802o().f163275j;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: g3 */
    default String mo158382g3(String str) {
        return C8609a.m50230N(str);
    }

    @Override // p149l.n87
    default Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return lva.m151855k(context, navigationIntent);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h */
    default String mo158383h() {
        return rwu.m181459h();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h0 */
    default boolean mo158384h0() {
        return uq40.m194952B();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h1 */
    default boolean mo158385h1() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h2 */
    default boolean mo158386h2(RecyclerView recyclerView) {
        return zyc0.m220914f0(recyclerView);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h3 */
    default boolean mo158387h3() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: h4 */
    default void mo158388h4(Act act, String str, String str2, String str3, String str4) {
        wak.m202444c(act, str, str2, str3, str4);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: i */
    default boolean mo158389i() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: i1 */
    default int mo158390i1(String str) {
        return snm.m185088S(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: i2 */
    default boolean mo158391i2(Throwable th) {
        return bx6.m104287f((TantanException.Client.TantanForbidden) th);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: i3 */
    default String mo158392i3(ProfileZodiac profileZodiac) {
        return i0g0.m133869j0(profileZodiac);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: i4 */
    default void mo158393i4(String str) {
        ygh0.m214664W(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: j */
    default boolean mo158394j() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: j1 */
    default Intent mo158395j1(Act act, String str, ResultReceiver resultReceiver) {
        return ReportAct.m54630c2(act, str, "", false, resultReceiver, ReportFrom.CHAT.getFrom());
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: j2 */
    default int mo158396j2() {
        return x2c0.f189836Vp;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: j4 */
    default void mo158397j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str) {
        ((GreetAct) act).m45592n2(message, coreGiftInfo, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: j5 */
    default boolean mo158398j5(Conversation conversation) {
        return sqb0.m185501X(conversation);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: k0 */
    default boolean mo158399k0() {
        return ogl0.m164261n();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: k1 */
    default boolean mo158400k1() {
        return OnlineMatchManager.m50143z().f32612p;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: k3 */
    default boolean mo158401k3() {
        return hbw.m130339e().m130344f() > 0;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: k5 */
    default boolean mo158402k5() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: l */
    default boolean mo158403l() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: l0 */
    default boolean mo158404l0() {
        return zb0.m217807d();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: l2 */
    default int mo158405l2() {
        return sqb0.m185513i0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: l4 */
    default boolean mo158406l4(String str, String str2) {
        return C8609a.m50244a0(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: m */
    default String mo158407m(List<String> list, List<String> list2) {
        return h7j.m129701M(list, list2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: m0 */
    default WarmingUpEmoResConfig mo158408m0() {
        return upa.m194774k1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: m1 */
    default String mo158409m1() {
        return CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: m4 */
    default void mo158410m4(Menu menu, String str, Act act, d30 d30Var) {
        CoreDlg.m44969A1(menu, str, act, d30Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: m5 */
    default int mo158411m5() {
        return x2c0.f189818V7;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n0 */
    default String mo158412n0(boolean z) {
        return z ? "group_notification_anonymity" : "group_notification";
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n1 */
    default void mo158413n1(Act act, Message message, Media media) {
        act.startActivityWithCustomTransition(MediaPreviewAct.m47833r2(act, message.cid, new MessageAndMedia(media, message), true), media instanceof Video ? null : new q000());
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n2 */
    default BottomSheetDialog mo158414n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, f30<String, String> f30Var) {
        return CoreDlg.m45014P1(act, str, str2, str3, i, str4, str5, str6, list, str7, f30Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n3 */
    default String mo158415n3(boolean z) {
        return zyc0.m220917i0(z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n4 */
    default void mo158416n4(Act act, String str) {
        swh0.m186256p1(act, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: n5 */
    default boolean mo158417n5() {
        return ogl0.m164238Q();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o */
    default boolean mo158418o() {
        return upa.m194608A1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o0 */
    default boolean mo158419o0() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o1 */
    default boolean mo158420o1(String str) {
        return C8456b.m47642v(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o2 */
    default void mo158421o2() {
        JailedDialogLikeAct.m44185n2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o3 */
    default void mo158422o3(Act act, String str, d30 d30Var, String str2) {
        uyc0.m196272l0();
        uyc0.m196273u0(act, str, d30Var, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o4 */
    default boolean mo158423o4(Conversation conversation) {
        return fap.m120259m(conversation);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: o5 */
    default boolean mo158424o5() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p */
    default boolean mo158425p() {
        return upa.m194726a2();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p1 */
    default boolean mo158426p1() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p2 */
    default void mo158427p2() {
        ConversationsList.f25082v1.m132487l(roj0.f160388a);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p3 */
    default boolean mo158428p3(String str) {
        return sqb0.m185498O().m185555Z(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p4 */
    default boolean mo158429p4() {
        return upa.m194660K3();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: p5 */
    default boolean mo158430p5() {
        return uyc0.m196272l0().m196275k0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: q */
    default boolean mo158431q() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: q1 */
    default boolean mo158432q1() {
        return upa.m194640G3();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: q2 */
    default tpd0 mo158433q2() {
        return sa40.m182802o().f163273h;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: q3 */
    default void mo158434q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, e30<Boolean> e30Var, w9j<Throwable, Boolean> w9jVar) {
        zyc0.m220919k0(putongAct, coreSendGiftBody, e30Var, w9jVar);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: q5 */
    default String mo158435q5(Literatures literatures) {
        return xgc0.m208623a(literatures);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r0 */
    default void mo158436r0(String str) {
        C8609a.m50250d0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r1 */
    default void mo158437r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3) {
        CoreDlg.m44996J1(menu, str, act, z, z2, str2, d30Var, d30Var2, str3);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r2 */
    default void mo158438r2(String str, String str2) {
        C8609a.m50260i0(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r3 */
    default boolean mo158439r3(String str, String str2) {
        return C8609a.m50242Z(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r4 */
    default void mo158440r4(String str) {
        ygh0.m214669a0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: r5 */
    default j760<Integer, Integer> mo158441r5(int i) {
        return C8609a.m50284z(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: s1 */
    default void mo158442s1(String str) {
        xij0.m209663f0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: s4 */
    default boolean mo158443s4() {
        return ogl0.m164231J();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: s5 */
    default boolean mo158444s5() {
        return upa.m194760h2();
    }

    @Override // p149l.n87
    default void showProofAgeDlg(Act act, String str) {
        zb0.m217812i(act, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: t */
    default boolean mo158445t() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: t0 */
    default boolean mo158446t0() {
        return uq40.m194984z();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: t1 */
    default boolean mo158447t1() {
        return rs4.f160804e.get().booleanValue();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: t3 */
    default Collection<Integer> mo158448t3() {
        return CoreBusinessModule.f17534d.m127660o();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: t4 */
    default boolean mo158449t4(Act act) {
        return act instanceof GreetAct;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: u */
    default boolean mo158450u() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: u1 */
    default void mo158451u1(String str) {
        C8609a.m50248c0(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: u2 */
    default void mo158452u2(String str, boolean z) {
        ygh0.m214687j0(str, z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: u3 */
    default void mo158453u3(int i) {
        CoreBusinessModule.f17534d.m127649b(i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: v */
    default boolean mo158454v() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: v1 */
    default boolean mo158455v1() {
        return NewMainAct.f24434r.get().booleanValue();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: v2 */
    default String mo158456v2() {
        return upa.m194744e1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: v3 */
    default Intent mo158457v3(Context context, String str) {
        return NationalIdAuthAct.m56072V1(context, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: v5 */
    default boolean mo158458v5() {
        return ft4.m123008b().m123014g();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w1 */
    default void mo158460w1(knb0<String, Integer, Integer, Integer> knb0Var) {
        TantanCoreBridge.f29945i.m132487l(knb0Var);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w2 */
    default boolean mo158461w2() {
        return uyc0.m196272l0().m196276m0();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w3 */
    default Drawable mo158462w3(Context context, String str) {
        str.getClass();
        switch (str) {
            case "teleplay":
                return context.getResources().getDrawable(x2c0.f189492Km);
            case "book":
                return context.getResources().getDrawable(x2c0.f189430Im);
            case "movie":
                return context.getResources().getDrawable(x2c0.f189461Jm);
            default:
                return null;
        }
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w4 */
    default boolean mo158463w4() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w5 */
    default Intent mo158464w5(Context context, String str, String str2, boolean z, boolean z2) {
        return ProfileAct.m50738p2(context, str, str2, z, z2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x */
    default boolean mo158465x() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x0 */
    default void mo158466x0(String str, String str2) {
        C8609a.m50254f0(str, str2);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x1 */
    default void mo158467x1(Act act, User user, String str, d30 d30Var, boolean z) {
        ark.m98419E0(act, user, str, d30Var, z);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x2 */
    default boolean mo158468x2() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x4 */
    default String mo158469x4(final String str) {
        TagCategories tagCategories = (TagCategories) vwb.m200346r(sa40.m182802o().m182840x().m182848a(), new w9j() { // from class: l.o87
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((TagCategories) obj).f20514id, str));
            }
        });
        return NullChecker.m81303a(tagCategories) ? tagCategories.name : "";
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: x5 */
    default void mo158470x5(boolean z) {
        OnlineMatchManager.m50143z().f32612p = false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y */
    default boolean mo158471y() {
        return upa.m194682P1();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y0 */
    default int mo158472y0() {
        return upa.m194801p3();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y1 */
    default boolean mo158473y1() {
        return false;
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y2 */
    default void mo158474y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        C8609a.m50282x(simpleDraweeView, imageUri, i);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y3 */
    default void mo158475y3(Act act, String str) {
        ak50.m97109O().m97138J(act, str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y4 */
    default void mo158476y4(Act act, String str, Privilege privilege) {
        C8764c.m53476n1(act, str, privilege);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: y5 */
    default ChallengeMsg mo158477y5(ChallengeMsgList challengeMsgList, Message message) {
        return zq4.m219844a(challengeMsgList, message);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: z */
    default boolean mo158478z(String str) {
        return zb0.m217811h(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: z0 */
    default boolean mo158479z0() {
        return OnlineMatchManager.m50143z().f32611o.get().booleanValue();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: z2 */
    default void mo158480z2() {
        fap.m120255i().m120275u();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: z3 */
    default int mo158481z3(Throwable th) {
        return j900.m140493g(th);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: z4 */
    default void mo158482z4(String str) {
        ygh0.m214663V(str);
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: w0 */
    default void mo158459w0(String str, String str2, boolean z) {
    }
}
