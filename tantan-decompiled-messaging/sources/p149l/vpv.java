package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class vpv {

    /* JADX INFO: renamed from: a */
    public final dqf f182524a;

    /* JADX INFO: renamed from: b */
    public final ypf f182525b;

    /* JADX INFO: renamed from: c */
    public final aqf f182526c;

    /* JADX INFO: renamed from: d */
    public final spf f182527d;

    public vpv(dqf dqfVar, ypf ypfVar, spf spfVar, aqf aqfVar) {
        this.f182524a = dqfVar;
        this.f182525b = ypfVar;
        this.f182527d = spfVar;
        this.f182526c = aqfVar;
    }

    /* JADX INFO: renamed from: A */
    public String m199302A(int i, boolean z) {
        return m199360n().mo113031g(i, z);
    }

    /* JADX INFO: renamed from: A0 */
    public void m199303A0(Context context, User user, String str, String str2, boolean z) {
        m199356l().mo215619i(context, user, str, str2, z);
    }

    /* JADX INFO: renamed from: B */
    public C22306c<Boolean> m199304B() {
        return m199356l().mo215606P3();
    }

    /* JADX INFO: renamed from: B0 */
    public void m199305B0(Context context, User user, String str, String str2, boolean z, String str3) {
        m199356l().mo215622l(context, user, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: C */
    public boolean m199306C() {
        return m199360n().mo113036k();
    }

    /* JADX INFO: renamed from: C0 */
    public void m199307C0(e1m e1mVar) {
        m199356l().mo215618h(e1mVar);
    }

    /* JADX INFO: renamed from: D */
    public C22306c<Boolean> m199308D() {
        return m199356l().mo215608W2();
    }

    /* JADX INFO: renamed from: D0 */
    public String m199309D0() {
        return m199344f().userId();
    }

    /* JADX INFO: renamed from: E */
    public boolean m199310E() {
        return m199360n().mo113052z();
    }

    /* JADX INFO: renamed from: E0 */
    public User m199311E0(String str) {
        return m199356l().mo215623m(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m199312F() {
        return m199356l().isHttpDnsOpen();
    }

    /* JADX INFO: renamed from: F0 */
    public C22306c<Boolean> m199313F0(Act act) {
        return m199360n().mo113035j(act);
    }

    /* JADX INFO: renamed from: G */
    public boolean m199314G() {
        return m199356l().mo215611c() || m199356l().mo215612d();
    }

    /* JADX INFO: renamed from: H */
    public boolean m199315H() {
        return m199356l().mo215610a();
    }

    /* JADX INFO: renamed from: I */
    public boolean m199316I() {
        return m199360n().mo113023C();
    }

    /* JADX INFO: renamed from: J */
    public boolean m199317J() {
        return m199356l().mo215617g4();
    }

    /* JADX INFO: renamed from: K */
    public boolean m199318K() {
        return m199360n().mo113026b();
    }

    /* JADX INFO: renamed from: L */
    public boolean m199319L() {
        return m199360n().mo113033i();
    }

    /* JADX INFO: renamed from: M */
    public boolean m199320M(Activity activity) {
        return m199356l().mo215609Z3(activity);
    }

    /* JADX INFO: renamed from: N */
    public boolean m199321N(Activity activity) {
        return m199362o().isMomentDetailAct(activity);
    }

    /* JADX INFO: renamed from: O */
    public boolean m199322O(Activity activity) {
        return m199362o().mo98288u0(activity);
    }

    /* JADX INFO: renamed from: P */
    public boolean m199323P(Context context) {
        return m199360n().mo113050x(context);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m199324Q() {
        return m199356l().isPurchaseDialogShowing();
    }

    /* JADX INFO: renamed from: R */
    public boolean m199325R() {
        return m199360n().mo113049w();
    }

    /* JADX INFO: renamed from: S */
    public void m199326S(Act act, String str) {
        m199360n().mo113028d(act, str);
    }

    /* JADX INFO: renamed from: T */
    public void m199327T(Context context) {
        m199360n().mo113047u(context);
    }

    /* JADX INFO: renamed from: U */
    public C22306c<List<BLiveMerchandise>> m199328U(Act act, List<BLiveMerchandise> list) {
        return m199356l().mo215614e(act, list);
    }

    /* JADX INFO: renamed from: V */
    public User m199329V() {
        return m199356l().me_();
    }

    /* JADX INFO: renamed from: W */
    public boolean m199330W(Activity activity) {
        return m199360n().mo113044r(activity);
    }

    /* JADX INFO: renamed from: X */
    public boolean m199331X() {
        return m199360n().mo113045s();
    }

    /* JADX INFO: renamed from: Y */
    public void m199332Y(boolean z) {
        m199360n().mo113043q(z);
    }

    /* JADX INFO: renamed from: Z */
    public void m199333Z(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        m199356l().onCoinPay(act, purchasePaymentParam, d30Var, d30Var2, payMethod);
    }

    /* JADX INFO: renamed from: a */
    public C22306c<AuthData> m199334a() {
        return m199344f().accessOutterToken();
    }

    /* JADX INFO: renamed from: a0 */
    public void m199335a0(Act act, String str) {
        m199356l().mo215624s0(act, str);
    }

    /* JADX INFO: renamed from: b */
    public void m199336b(Activity activity, e30<Boolean> e30Var) {
        m199362o().mo98287d(activity, e30Var);
    }

    /* JADX INFO: renamed from: b0 */
    public C22306c<roj0> m199337b0(SettingGroups settingGroups) {
        return m199356l().patchSettings(settingGroups);
    }

    /* JADX INFO: renamed from: c */
    public C22306c<Followship> m199338c(String str, User user, boolean z, String str2, String str3) {
        return m199362o().following(str, user, z, str2, str3);
    }

    /* JADX INFO: renamed from: c0 */
    public void m199339c0() {
        m199356l().pollConversation();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<Followship> m199340d(String str, User user, boolean z, String str2, String str3, String str4, String str5, String str6) {
        return m199362o().mo98284a(str, user, z, str2, str3, str5, str6);
    }

    /* JADX INFO: renamed from: d0 */
    public void m199341d0(Act act, String str, @NotNull String str2) {
        m199362o().mo98285b(act, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m199342e(Act act, BLiveMerchandise bLiveMerchandise, d30 d30Var, d30 d30Var2) {
        m199356l().mo215615f(act, bLiveMerchandise, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: e0 */
    public C22306c<List<BLiveMerchandise>> m199343e0(String str, boolean z) {
        return m199356l().mo215620j(str, z);
    }

    /* JADX INFO: renamed from: f */
    public final spf m199344f() {
        return this.f182527d;
    }

    /* JADX INFO: renamed from: f0 */
    public void m199345f0(String str) {
        m199356l().refreshUser(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m199346g() {
        return m199360n().mo113025a();
    }

    /* JADX INFO: renamed from: g0 */
    public void m199347g0(e1m e1mVar) {
        m199356l().registerPurchaseDialogListener(e1mVar);
    }

    /* JADX INFO: renamed from: h */
    public PayMethod m199348h() {
        return PayMethod.get(PayMethod.huabei);
    }

    /* JADX INFO: renamed from: h0 */
    public void m199349h0(@Nullable e30<Boolean> e30Var) {
        m199360n().mo113022B(e30Var);
    }

    /* JADX INFO: renamed from: i */
    public PayMethod m199350i() {
        return PayMethod.get("alipay");
    }

    /* JADX INFO: renamed from: i0 */
    public void m199351i0(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2) {
        m199356l().mo215616g(act, user, z, str, e30Var, e30Var2, str2);
    }

    /* JADX INFO: renamed from: j */
    public String m199352j() {
        return m199356l().getCurrencyProductCategory();
    }

    /* JADX INFO: renamed from: j0 */
    public void m199353j0(Context context) {
        m199360n().mo113048v(context);
    }

    /* JADX INFO: renamed from: k */
    public PayMethod m199354k() {
        return PayMethod.get("wechat");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m199355k0() {
        return m199356l().shouldShowAutoPay();
    }

    /* JADX INFO: renamed from: l */
    public final ypf m199356l() {
        return this.f182525b;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m199357l0() {
        return m199356l().mo215607Q2();
    }

    /* JADX INFO: renamed from: m */
    public eb2 m199358m(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var) {
        return m199356l().mo215613d2(act, e30Var, editText, arrayList, list, d30Var);
    }

    /* JADX INFO: renamed from: m0 */
    public void m199359m0(Act act) {
        m199356l().showAutoPayHelp(act);
    }

    /* JADX INFO: renamed from: n */
    public final dqf m199360n() {
        return this.f182524a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m199361n0(Act act, d30 d30Var) {
        m199356l().showBindPhoneDialog(act, d30Var);
    }

    /* JADX INFO: renamed from: o */
    public final aqf m199362o() {
        return this.f182526c;
    }

    /* JADX INFO: renamed from: o0 */
    public void m199363o0(int i) {
        m199360n().mo113041o(i);
    }

    /* JADX INFO: renamed from: p */
    public uut m199364p() {
        return m199360n().mo113039m();
    }

    /* JADX INFO: renamed from: p0 */
    public C22306c<Boolean> m199365p0(Act act, @androidx.annotation.Nullable String str) {
        return m199360n().mo113034i5(act, str);
    }

    /* JADX INFO: renamed from: q */
    public Intent m199366q(Context context) {
        return m199360n().mo113042p(context);
    }

    /* JADX INFO: renamed from: q0 */
    public void m199367q0(Act act, User user, String str) {
        m199360n().mo113024M2(act, user, str);
    }

    /* JADX INFO: renamed from: r */
    public String m199368r(String str) {
        return m199360n().mo113021A(str);
    }

    /* JADX INFO: renamed from: r0 */
    public void m199369r0(Act act, String str) {
        m199356l().mo215621k(act, str);
    }

    /* JADX INFO: renamed from: s */
    public String m199370s() {
        return m199362o().mo98286c();
    }

    /* JADX INFO: renamed from: s0 */
    public void m199371s0(Context context, User user, VImage vImage) {
        m199356l().showUserVerificationLogo(context, user, vImage);
    }

    /* JADX INFO: renamed from: t */
    public C22306c<BLiveVerificationCenter> m199372t() {
        return m199360n().mo113037k2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m199373t0(Act act, String str) {
        m199356l().showVipPurchaseDialog(act, str);
    }

    /* JADX INFO: renamed from: u */
    public SettingGroups m199374u() {
        return m199360n().mo113029e();
    }

    /* JADX INFO: renamed from: u0 */
    public C22306c<Boolean> m199375u0() {
        return m199344f().signedIn();
    }

    /* JADX INFO: renamed from: v */
    public x7m m199376v() {
        return m199360n().mo113027c();
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m199377v0() {
        return m199344f().signedIn_();
    }

    /* JADX INFO: renamed from: w */
    public void m199378w(@Nullable Act act, @Nullable LiveGoAction liveGoAction) {
        m199360n().mo113040n(act, liveGoAction);
    }

    /* JADX INFO: renamed from: w0 */
    public void m199379w0(Context context, String str) {
        m199356l().mo215625s2(context, str);
    }

    /* JADX INFO: renamed from: x */
    public void m199380x(Act act, z8k0.C21648a c21648a) {
        m199360n().mo113046t(act, c21648a.m217612c(), c21648a.m217615f(), c21648a.m217611b(), c21648a.m217610a(), c21648a.m217614e(), c21648a.m217613d());
    }

    /* JADX INFO: renamed from: x0 */
    public void m199381x0(Act act) {
        m199360n().mo113030f(act);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v9, types: [l.ho2] */
    /* JADX INFO: renamed from: y */
    public void m199382y(c2e0 c2e0Var, UserRightType userRightType) {
        Bundle bundle = new Bundle();
        bundle.putString("right_type", userRightType.toString());
        bundle.putString("liveId", c2e0Var.m206027E2().m149814k());
        bundle.putString("roomId", c2e0Var.m206027E2().m149818o());
        bundle.putString("anchor_name", c2e0Var.m206027E2().m132146l0().name);
        bundle.putString("anchor_id", c2e0Var.m206027E2().m132146l0().f56011id);
        bundle.putString("live_type", c2e0Var.m206027E2().mo132054A0());
        m199360n().mo113051y(c2e0Var.act(), bundle);
    }

    /* JADX INFO: renamed from: y0 */
    public void m199383y0(Context context) {
        m199360n().mo113032h(context);
    }

    /* JADX INFO: renamed from: z */
    public String m199384z(int i, String str, boolean z) {
        return m199360n().mo113038l(i, str, z);
    }

    /* JADX INFO: renamed from: z0 */
    public Intent m199385z0(Context context, String str, boolean z, boolean z2) {
        return m199356l().startMessagesAct(context, str, z, z2);
    }
}
