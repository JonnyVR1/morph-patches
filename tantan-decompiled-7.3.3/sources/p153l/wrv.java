package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class wrv {

    /* JADX INFO: renamed from: a */
    public final krf f190569a;

    /* JADX INFO: renamed from: b */
    public final frf f190570b;

    /* JADX INFO: renamed from: c */
    public final hrf f190571c;

    /* JADX INFO: renamed from: d */
    public final zqf f190572d;

    public wrv(krf krfVar, frf frfVar, zqf zqfVar, hrf hrfVar) {
        this.f190569a = krfVar;
        this.f190570b = frfVar;
        this.f190572d = zqfVar;
        this.f190571c = hrfVar;
    }

    /* JADX INFO: renamed from: A */
    public String m207624A(int i, boolean z) {
        return m207682n().mo151052g(i, z);
    }

    /* JADX INFO: renamed from: A0 */
    public void m207625A0(Context context, User user, String str, String str2, boolean z) {
        m207678l().mo126916i(context, user, str, str2, z);
    }

    /* JADX INFO: renamed from: B */
    public C22421c<Boolean> m207626B() {
        return m207678l().mo126903P3();
    }

    /* JADX INFO: renamed from: B0 */
    public void m207627B0(Context context, User user, String str, String str2, boolean z, String str3) {
        m207678l().mo126919l(context, user, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: C */
    public boolean m207628C() {
        return m207682n().mo151057k();
    }

    /* JADX INFO: renamed from: C0 */
    public void m207629C0(x3m x3mVar) {
        m207678l().mo126915h(x3mVar);
    }

    /* JADX INFO: renamed from: D */
    public C22421c<Boolean> m207630D() {
        return m207678l().mo126905W2();
    }

    /* JADX INFO: renamed from: D0 */
    public String m207631D0() {
        return m207666f().userId();
    }

    /* JADX INFO: renamed from: E */
    public boolean m207632E() {
        return m207682n().mo151073z();
    }

    /* JADX INFO: renamed from: E0 */
    public User m207633E0(String str) {
        return m207678l().mo126920m(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m207634F() {
        return m207678l().isHttpDnsOpen();
    }

    /* JADX INFO: renamed from: F0 */
    public C22421c<Boolean> m207635F0(Act act) {
        return m207682n().mo151056j(act);
    }

    /* JADX INFO: renamed from: G */
    public boolean m207636G() {
        return m207678l().mo126908c() || m207678l().mo126909d();
    }

    /* JADX INFO: renamed from: H */
    public boolean m207637H() {
        return m207678l().mo126907a();
    }

    /* JADX INFO: renamed from: I */
    public boolean m207638I() {
        return m207682n().mo151044C();
    }

    /* JADX INFO: renamed from: J */
    public boolean m207639J() {
        return m207678l().mo126914g4();
    }

    /* JADX INFO: renamed from: K */
    public boolean m207640K() {
        return m207682n().mo151047b();
    }

    /* JADX INFO: renamed from: L */
    public boolean m207641L() {
        return m207682n().mo151054i();
    }

    /* JADX INFO: renamed from: M */
    public boolean m207642M(Activity activity) {
        return m207678l().mo126906Z3(activity);
    }

    /* JADX INFO: renamed from: N */
    public boolean m207643N(Activity activity) {
        return m207684o().isMomentDetailAct(activity);
    }

    /* JADX INFO: renamed from: O */
    public boolean m207644O(Activity activity) {
        return m207684o().mo136848u0(activity);
    }

    /* JADX INFO: renamed from: P */
    public boolean m207645P(Context context) {
        return m207682n().mo151071x(context);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m207646Q() {
        return m207678l().isPurchaseDialogShowing();
    }

    /* JADX INFO: renamed from: R */
    public boolean m207647R() {
        return m207682n().mo151070w();
    }

    /* JADX INFO: renamed from: S */
    public void m207648S(Act act, String str) {
        m207682n().mo151049d(act, str);
    }

    /* JADX INFO: renamed from: T */
    public void m207649T(Context context) {
        m207682n().mo151068u(context);
    }

    /* JADX INFO: renamed from: U */
    public C22421c<List<BLiveMerchandise>> m207650U(Act act, List<BLiveMerchandise> list) {
        return m207678l().mo126911e(act, list);
    }

    /* JADX INFO: renamed from: V */
    public User m207651V() {
        return m207678l().me_();
    }

    /* JADX INFO: renamed from: W */
    public boolean m207652W(Activity activity) {
        return m207682n().mo151065r(activity);
    }

    /* JADX INFO: renamed from: X */
    public boolean m207653X() {
        return m207682n().mo151066s();
    }

    /* JADX INFO: renamed from: Y */
    public void m207654Y(boolean z) {
        m207682n().mo151064q(z);
    }

    /* JADX INFO: renamed from: Z */
    public void m207655Z(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod) {
        m207678l().onCoinPay(act, purchasePaymentParam, x20Var, x20Var2, payMethod);
    }

    /* JADX INFO: renamed from: a */
    public C22421c<AuthData> m207656a() {
        return m207666f().accessOutterToken();
    }

    /* JADX INFO: renamed from: a0 */
    public void m207657a0(Act act, String str) {
        m207678l().mo126921s0(act, str);
    }

    /* JADX INFO: renamed from: b */
    public void m207658b(Activity activity, y20<Boolean> y20Var) {
        m207684o().mo136847d(activity, y20Var);
    }

    /* JADX INFO: renamed from: b0 */
    public C22421c<uxj0> m207659b0(SettingGroups settingGroups) {
        return m207678l().patchSettings(settingGroups);
    }

    /* JADX INFO: renamed from: c */
    public C22421c<Followship> m207660c(String str, User user, boolean z, String str2, String str3) {
        return m207684o().following(str, user, z, str2, str3);
    }

    /* JADX INFO: renamed from: c0 */
    public void m207661c0() {
        m207678l().pollConversation();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<Followship> m207662d(String str, User user, boolean z, String str2, String str3, String str4, String str5, String str6) {
        return m207684o().mo136844a(str, user, z, str2, str3, str5, str6);
    }

    /* JADX INFO: renamed from: d0 */
    public void m207663d0(Act act, String str, @NotNull String str2) {
        m207684o().mo136845b(act, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m207664e(Act act, BLiveMerchandise bLiveMerchandise, x20 x20Var, x20 x20Var2) {
        m207678l().mo126912f(act, bLiveMerchandise, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: e0 */
    public C22421c<List<BLiveMerchandise>> m207665e0(String str, boolean z) {
        return m207678l().mo126917j(str, z);
    }

    /* JADX INFO: renamed from: f */
    public final zqf m207666f() {
        return this.f190572d;
    }

    /* JADX INFO: renamed from: f0 */
    public void m207667f0(String str) {
        m207678l().refreshUser(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m207668g() {
        return m207682n().mo151046a();
    }

    /* JADX INFO: renamed from: g0 */
    public void m207669g0(x3m x3mVar) {
        m207678l().registerPurchaseDialogListener(x3mVar);
    }

    /* JADX INFO: renamed from: h */
    public PayMethod m207670h() {
        return PayMethod.get(PayMethod.huabei);
    }

    /* JADX INFO: renamed from: h0 */
    public void m207671h0(@Nullable y20<Boolean> y20Var) {
        m207682n().mo151043B(y20Var);
    }

    /* JADX INFO: renamed from: i */
    public PayMethod m207672i() {
        return PayMethod.get("alipay");
    }

    /* JADX INFO: renamed from: i0 */
    public void m207673i0(Act act, User user, boolean z, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2) {
        m207678l().mo126913g(act, user, z, str, y20Var, y20Var2, str2);
    }

    /* JADX INFO: renamed from: j */
    public String m207674j() {
        return m207678l().getCurrencyProductCategory();
    }

    /* JADX INFO: renamed from: j0 */
    public void m207675j0(Context context) {
        m207682n().mo151069v(context);
    }

    /* JADX INFO: renamed from: k */
    public PayMethod m207676k() {
        return PayMethod.get("wechat");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m207677k0() {
        return m207678l().shouldShowAutoPay();
    }

    /* JADX INFO: renamed from: l */
    public final frf m207678l() {
        return this.f190570b;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m207679l0() {
        return m207678l().mo126904Q2();
    }

    /* JADX INFO: renamed from: m */
    public lb2 m207680m(Act act, y20<String> y20Var, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var) {
        return m207678l().mo126910d2(act, y20Var, editText, arrayList, list, x20Var);
    }

    /* JADX INFO: renamed from: m0 */
    public void m207681m0(Act act) {
        m207678l().showAutoPayHelp(act);
    }

    /* JADX INFO: renamed from: n */
    public final krf m207682n() {
        return this.f190569a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m207683n0(Act act, x20 x20Var) {
        m207678l().showBindPhoneDialog(act, x20Var);
    }

    /* JADX INFO: renamed from: o */
    public final hrf m207684o() {
        return this.f190571c;
    }

    /* JADX INFO: renamed from: o0 */
    public void m207685o0(int i) {
        m207682n().mo151062o(i);
    }

    /* JADX INFO: renamed from: p */
    public vwt m207686p() {
        return m207682n().mo151060m();
    }

    /* JADX INFO: renamed from: p0 */
    public C22421c<Boolean> m207687p0(Act act, @androidx.annotation.Nullable String str) {
        return m207682n().mo151055i5(act, str);
    }

    /* JADX INFO: renamed from: q */
    public Intent m207688q(Context context) {
        return m207682n().mo151063p(context);
    }

    /* JADX INFO: renamed from: q0 */
    public void m207689q0(Act act, User user, String str) {
        m207682n().mo151045M2(act, user, str);
    }

    /* JADX INFO: renamed from: r */
    public String m207690r(String str) {
        return m207682n().mo151042A(str);
    }

    /* JADX INFO: renamed from: r0 */
    public void m207691r0(Act act, String str) {
        m207678l().mo126918k(act, str);
    }

    /* JADX INFO: renamed from: s */
    public String m207692s() {
        return m207684o().mo136846c();
    }

    /* JADX INFO: renamed from: s0 */
    public void m207693s0(Context context, User user, VImage vImage) {
        m207678l().showUserVerificationLogo(context, user, vImage);
    }

    /* JADX INFO: renamed from: t */
    public C22421c<BLiveVerificationCenter> m207694t() {
        return m207682n().mo151058k2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m207695t0(Act act, String str) {
        m207678l().showVipPurchaseDialog(act, str);
    }

    /* JADX INFO: renamed from: u */
    public SettingGroups m207696u() {
        return m207682n().mo151050e();
    }

    /* JADX INFO: renamed from: u0 */
    public C22421c<Boolean> m207697u0() {
        return m207666f().signedIn();
    }

    /* JADX INFO: renamed from: v */
    public nam m207698v() {
        return m207682n().mo151048c();
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m207699v0() {
        return m207666f().signedIn_();
    }

    /* JADX INFO: renamed from: w */
    public void m207700w(@Nullable Act act, @Nullable LiveGoAction liveGoAction) {
        m207682n().mo151061n(act, liveGoAction);
    }

    /* JADX INFO: renamed from: w0 */
    public void m207701w0(Context context, String str) {
        m207678l().mo126922s2(context, str);
    }

    /* JADX INFO: renamed from: x */
    public void m207702x(Act act, fik0.C16979a c16979a) {
        m207682n().mo151067t(act, c16979a.m125689c(), c16979a.m125692f(), c16979a.m125688b(), c16979a.m125687a(), c16979a.m125691e(), c16979a.m125690d());
    }

    /* JADX INFO: renamed from: x0 */
    public void m207703x0(Act act) {
        m207682n().mo151051f(act);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v9, types: [l.oo2] */
    /* JADX INFO: renamed from: y */
    public void m207704y(gae0 gae0Var, UserRightType userRightType) {
        Bundle bundle = new Bundle();
        bundle.putString("right_type", userRightType.toString());
        bundle.putString("liveId", gae0Var.m213810E2().m202191k());
        bundle.putString("roomId", gae0Var.m213810E2().m202194o());
        bundle.putString("anchor_name", gae0Var.m213810E2().m168532l0().name);
        bundle.putString("anchor_id", gae0Var.m213810E2().m168532l0().f56859id);
        bundle.putString("live_type", gae0Var.m213810E2().mo118362A0());
        m207682n().mo151072y(gae0Var.act(), bundle);
    }

    /* JADX INFO: renamed from: y0 */
    public void m207705y0(Context context) {
        m207682n().mo151053h(context);
    }

    /* JADX INFO: renamed from: z */
    public String m207706z(int i, String str, boolean z) {
        return m207682n().mo151059l(i, str, z);
    }

    /* JADX INFO: renamed from: z0 */
    public Intent m207707z0(Context context, String str, boolean z, boolean z2) {
        return m207678l().startMessagesAct(context, str, z, z2);
    }
}
