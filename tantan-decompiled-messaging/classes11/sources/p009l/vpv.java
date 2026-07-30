package p009l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p1.mobile.putong.live.base.bean.UserRightType;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.aqf;
import l.c2e0;
import l.d30;
import l.dqf;
import l.e1m;
import l.e30;
import l.eb2;
import l.kye;
import l.roj0;
import l.spf;
import l.uut;
import l.ypf;
import l.z8k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vpv {

    /* JADX INFO: renamed from: a */
    public final dqf f21741a;

    /* JADX INFO: renamed from: b */
    public final ypf f21742b;

    /* JADX INFO: renamed from: c */
    public final aqf f21743c;

    /* JADX INFO: renamed from: d */
    public final spf f21744d;

    public vpv(dqf dqfVar, ypf ypfVar, spf spfVar, aqf aqfVar) {
        this.f21741a = dqfVar;
        this.f21742b = ypfVar;
        this.f21744d = spfVar;
        this.f21743c = aqfVar;
    }

    /* JADX INFO: renamed from: A */
    public String m23612A(int i, boolean z) {
        return m23670n().g(i, z);
    }

    /* JADX INFO: renamed from: A0 */
    public void m23613A0(Context context, User user, String str, String str2, boolean z) {
        m23666l().i(context, user, str, str2, z);
    }

    /* JADX INFO: renamed from: B */
    public c<Boolean> m23614B() {
        return m23666l().P3();
    }

    /* JADX INFO: renamed from: B0 */
    public void m23615B0(Context context, User user, String str, String str2, boolean z, String str3) {
        m23666l().l(context, user, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: C */
    public boolean m23616C() {
        return m23670n().k();
    }

    /* JADX INFO: renamed from: C0 */
    public void m23617C0(e1m e1mVar) {
        m23666l().h(e1mVar);
    }

    /* JADX INFO: renamed from: D */
    public c<Boolean> m23618D() {
        return m23666l().W2();
    }

    /* JADX INFO: renamed from: D0 */
    public String m23619D0() {
        return m23654f().userId();
    }

    /* JADX INFO: renamed from: E */
    public boolean m23620E() {
        return m23670n().z();
    }

    /* JADX INFO: renamed from: E0 */
    public User m23621E0(String str) {
        return m23666l().m(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m23622F() {
        return m23666l().isHttpDnsOpen();
    }

    /* JADX INFO: renamed from: F0 */
    public c<Boolean> m23623F0(Act act) {
        return m23670n().j(act);
    }

    /* JADX INFO: renamed from: G */
    public boolean m23624G() {
        return m23666l().c() || m23666l().d();
    }

    /* JADX INFO: renamed from: H */
    public boolean m23625H() {
        return m23666l().a();
    }

    /* JADX INFO: renamed from: I */
    public boolean m23626I() {
        return m23670n().C();
    }

    /* JADX INFO: renamed from: J */
    public boolean m23627J() {
        return m23666l().g4();
    }

    /* JADX INFO: renamed from: K */
    public boolean m23628K() {
        return m23670n().b();
    }

    /* JADX INFO: renamed from: L */
    public boolean m23629L() {
        return m23670n().i();
    }

    /* JADX INFO: renamed from: M */
    public boolean m23630M(Activity activity) {
        return m23666l().Z3(activity);
    }

    /* JADX INFO: renamed from: N */
    public boolean m23631N(Activity activity) {
        return m23672o().isMomentDetailAct(activity);
    }

    /* JADX INFO: renamed from: O */
    public boolean m23632O(Activity activity) {
        return m23672o().u0(activity);
    }

    /* JADX INFO: renamed from: P */
    public boolean m23633P(Context context) {
        return m23670n().x(context);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m23634Q() {
        return m23666l().isPurchaseDialogShowing();
    }

    /* JADX INFO: renamed from: R */
    public boolean m23635R() {
        return m23670n().w();
    }

    /* JADX INFO: renamed from: S */
    public void m23636S(Act act, String str) {
        m23670n().d(act, str);
    }

    /* JADX INFO: renamed from: T */
    public void m23637T(Context context) {
        m23670n().u(context);
    }

    /* JADX INFO: renamed from: U */
    public c<List<BLiveMerchandise>> m23638U(Act act, List<BLiveMerchandise> list) {
        return m23666l().e(act, list);
    }

    /* JADX INFO: renamed from: V */
    public User m23639V() {
        return m23666l().me_();
    }

    /* JADX INFO: renamed from: W */
    public boolean m23640W(Activity activity) {
        return m23670n().r(activity);
    }

    /* JADX INFO: renamed from: X */
    public boolean m23641X() {
        return m23670n().s();
    }

    /* JADX INFO: renamed from: Y */
    public void m23642Y(boolean z) {
        m23670n().q(z);
    }

    /* JADX INFO: renamed from: Z */
    public void m23643Z(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        m23666l().onCoinPay(act, purchasePaymentParam, d30Var, d30Var2, payMethod);
    }

    /* JADX INFO: renamed from: a */
    public c<AuthData> m23644a() {
        return m23654f().accessOutterToken();
    }

    /* JADX INFO: renamed from: a0 */
    public void m23645a0(Act act, String str) {
        m23666l().s0(act, str);
    }

    /* JADX INFO: renamed from: b */
    public void m23646b(Activity activity, e30<Boolean> e30Var) {
        m23672o().d(activity, e30Var);
    }

    /* JADX INFO: renamed from: b0 */
    public c<roj0> m23647b0(SettingGroups settingGroups) {
        return m23666l().patchSettings(settingGroups);
    }

    /* JADX INFO: renamed from: c */
    public c<Followship> m23648c(String str, User user, boolean z, String str2, String str3) {
        return m23672o().following(str, user, z, str2, str3);
    }

    /* JADX INFO: renamed from: c0 */
    public void m23649c0() {
        m23666l().pollConversation();
    }

    /* JADX INFO: renamed from: d */
    public c<Followship> m23650d(String str, User user, boolean z, String str2, String str3, String str4, String str5, String str6) {
        return m23672o().a(str, user, z, str2, str3, str5, str6);
    }

    /* JADX INFO: renamed from: d0 */
    public void m23651d0(Act act, String str, @NotNull String str2) {
        m23672o().b(act, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m23652e(Act act, BLiveMerchandise bLiveMerchandise, d30 d30Var, d30 d30Var2) {
        m23666l().f(act, bLiveMerchandise, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: e0 */
    public c<List<BLiveMerchandise>> m23653e0(String str, boolean z) {
        return m23666l().j(str, z);
    }

    /* JADX INFO: renamed from: f */
    public final spf m23654f() {
        return this.f21744d;
    }

    /* JADX INFO: renamed from: f0 */
    public void m23655f0(String str) {
        m23666l().refreshUser(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m23656g() {
        return m23670n().a();
    }

    /* JADX INFO: renamed from: g0 */
    public void m23657g0(e1m e1mVar) {
        m23666l().registerPurchaseDialogListener(e1mVar);
    }

    /* JADX INFO: renamed from: h */
    public PayMethod m23658h() {
        return PayMethod.get("huabei");
    }

    /* JADX INFO: renamed from: h0 */
    public void m23659h0(@Nullable e30<Boolean> e30Var) {
        m23670n().B(e30Var);
    }

    /* JADX INFO: renamed from: i */
    public PayMethod m23660i() {
        return PayMethod.get("alipay");
    }

    /* JADX INFO: renamed from: i0 */
    public void m23661i0(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2) {
        m23666l().g(act, user, z, str, e30Var, e30Var2, str2);
    }

    /* JADX INFO: renamed from: j */
    public String m23662j() {
        return m23666l().getCurrencyProductCategory();
    }

    /* JADX INFO: renamed from: j0 */
    public void m23663j0(Context context) {
        m23670n().v(context);
    }

    /* JADX INFO: renamed from: k */
    public PayMethod m23664k() {
        return PayMethod.get("wechat");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m23665k0() {
        return m23666l().shouldShowAutoPay();
    }

    /* JADX INFO: renamed from: l */
    public final ypf m23666l() {
        return this.f21742b;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m23667l0() {
        return m23666l().Q2();
    }

    /* JADX INFO: renamed from: m */
    public eb2 m23668m(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.a> arrayList, List<List<String>> list, d30 d30Var) {
        return m23666l().d2(act, e30Var, editText, arrayList, list, d30Var);
    }

    /* JADX INFO: renamed from: m0 */
    public void m23669m0(Act act) {
        m23666l().showAutoPayHelp(act);
    }

    /* JADX INFO: renamed from: n */
    public final dqf m23670n() {
        return this.f21741a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m23671n0(Act act, d30 d30Var) {
        m23666l().showBindPhoneDialog(act, d30Var);
    }

    /* JADX INFO: renamed from: o */
    public final aqf m23672o() {
        return this.f21743c;
    }

    /* JADX INFO: renamed from: o0 */
    public void m23673o0(int i) {
        m23670n().o(i);
    }

    /* JADX INFO: renamed from: p */
    public uut m23674p() {
        return m23670n().m();
    }

    /* JADX INFO: renamed from: p0 */
    public c<Boolean> m23675p0(Act act, @androidx.annotation.Nullable String str) {
        return m23670n().i5(act, str);
    }

    /* JADX INFO: renamed from: q */
    public Intent m23676q(Context context) {
        return m23670n().p(context);
    }

    /* JADX INFO: renamed from: q0 */
    public void m23677q0(Act act, User user, String str) {
        m23670n().M2(act, user, str);
    }

    /* JADX INFO: renamed from: r */
    public String m23678r(String str) {
        return m23670n().A(str);
    }

    /* JADX INFO: renamed from: r0 */
    public void m23679r0(Act act, String str) {
        m23666l().k(act, str);
    }

    /* JADX INFO: renamed from: s */
    public String m23680s() {
        return m23672o().c();
    }

    /* JADX INFO: renamed from: s0 */
    public void m23681s0(Context context, User user, VImage vImage) {
        m23666l().showUserVerificationLogo(context, user, vImage);
    }

    /* JADX INFO: renamed from: t */
    public c<BLiveVerificationCenter> m23682t() {
        return m23670n().k2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m23683t0(Act act, String str) {
        m23666l().showVipPurchaseDialog(act, str);
    }

    /* JADX INFO: renamed from: u */
    public SettingGroups m23684u() {
        return m23670n().e();
    }

    /* JADX INFO: renamed from: u0 */
    public c<Boolean> m23685u0() {
        return m23654f().signedIn();
    }

    /* JADX INFO: renamed from: v */
    public x7m m23686v() {
        return m23670n().c();
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m23687v0() {
        return m23654f().signedIn_();
    }

    /* JADX INFO: renamed from: w */
    public void m23688w(@Nullable Act act, @Nullable LiveGoAction liveGoAction) {
        m23670n().n(act, liveGoAction);
    }

    /* JADX INFO: renamed from: w0 */
    public void m23689w0(Context context, String str) {
        m23666l().s2(context, str);
    }

    /* JADX INFO: renamed from: x */
    public void m23690x(Act act, z8k0.a aVar) {
        m23670n().t(act, aVar.c(), aVar.f(), aVar.b(), aVar.a(), aVar.e(), aVar.d());
    }

    /* JADX INFO: renamed from: x0 */
    public void m23691x0(Act act) {
        m23670n().f(act);
    }

    /* JADX INFO: renamed from: y */
    public void m23692y(c2e0 c2e0Var, UserRightType userRightType) {
        Bundle bundle = new Bundle();
        bundle.putString("right_type", userRightType.toString());
        bundle.putString("liveId", c2e0Var.E2().k());
        bundle.putString("roomId", c2e0Var.E2().o());
        bundle.putString("anchor_name", c2e0Var.E2().l0().name);
        bundle.putString("anchor_id", ((DbObject) c2e0Var.E2().l0()).id);
        bundle.putString("live_type", c2e0Var.E2().A0());
        m23670n().y(c2e0Var.act(), bundle);
    }

    /* JADX INFO: renamed from: y0 */
    public void m23693y0(Context context) {
        m23670n().h(context);
    }

    /* JADX INFO: renamed from: z */
    public String m23694z(int i, String str, boolean z) {
        return m23670n().l(i, str, z);
    }

    /* JADX INFO: renamed from: z0 */
    public Intent m23695z0(Context context, String str, boolean z, boolean z2) {
        return m23666l().startMessagesAct(context, str, z, z2);
    }
}
