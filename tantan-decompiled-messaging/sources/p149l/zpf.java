package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class zpf implements ypf {
    @Override // p149l.ypf
    /* JADX INFO: renamed from: P3 */
    public C22306c<Boolean> mo215606P3() {
        return l9s.m149105y();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: Q2 */
    public boolean mo215607Q2() {
        return l9s.m149065a0();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: W2 */
    public C22306c<Boolean> mo215608W2() {
        return l9s.m149106z();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: Z3 */
    public boolean mo215609Z3(Activity activity) {
        return l9s.m149040C(activity);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: a */
    public boolean mo215610a() {
        return lor.m150803h();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: c */
    public boolean mo215611c() {
        return lor.m150802g();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: d */
    public boolean mo215612d() {
        return lor.m150801f();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: d2 */
    public eb2 mo215613d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var) {
        return l9s.m149076g().mo30753d2(act, e30Var, editText, arrayList, list, d30Var);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: e */
    public C22306c<List<BLiveMerchandise>> mo215614e(Act act, List<BLiveMerchandise> list) {
        return l9s.m149045H(act, list);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: f */
    public void mo215615f(Act act, BLiveMerchandise bLiveMerchandise, d30 d30Var, d30 d30Var2) {
        l9s.m149086l(act, bLiveMerchandise, d30Var, d30Var2);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: g */
    public void mo215616g(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2) {
        l9s.m149076g().mo30778jc(act, user, z, str, e30Var, e30Var2, str2);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: g4 */
    public boolean mo215617g4() {
        return qib0.f154713b0.f139231b.mo30764g4();
    }

    @Override // p149l.ypf
    public String getCurrencyProductCategory() {
        return l9s.m149090n();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: h */
    public void mo215618h(e1m e1mVar) {
        l9s.m149091n0(e1mVar);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: i */
    public void mo215619i(Context context, User user, String str, String str2, boolean z) {
        mo215622l(context, user, str, str2, z, null);
    }

    @Override // p149l.ypf
    public boolean isHttpDnsOpen() {
        return qib0.f154713b0.f139231b.isHttpDnsOpen();
    }

    @Override // p149l.ypf
    public boolean isPurchaseDialogShowing() {
        return l9s.m149043F();
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: j */
    public C22306c<List<BLiveMerchandise>> mo215620j(String str, boolean z) {
        return l9s.m149054Q(str, z);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: k */
    public void mo215621k(Act act, String str) {
        l9s.m149073e0(act, str, null);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: l */
    public void mo215622l(Context context, User user, String str, String str2, boolean z, String str3) {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159622d(user);
        l9s.m149087l0(context, str, str2, z, str3);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: m */
    public User mo215623m(String str) {
        return l9s.m149097q0(str);
    }

    @Override // p149l.ypf
    public User me_() {
        return l9s.m149047J();
    }

    @Override // p149l.ypf
    public void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        l9s.m149050M(act, purchasePaymentParam, d30Var, d30Var2, payMethod);
    }

    @Override // p149l.ypf
    public C22306c<roj0> patchSettings(SettingGroups settingGroups) {
        return l9s.m149052O(settingGroups);
    }

    @Override // p149l.ypf
    public void pollConversation() {
        l9s.m149053P();
    }

    @Override // p149l.ypf
    public void refreshUser(String str) {
        l9s.m149055R(str);
    }

    @Override // p149l.ypf
    public void registerPurchaseDialogListener(e1m e1mVar) {
        l9s.m149056S(e1mVar);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: s0 */
    public void mo215624s0(Act act, String str) {
        l9s.m149076g().mo30816s0(act, str);
    }

    @Override // p149l.ypf
    /* JADX INFO: renamed from: s2 */
    public void mo215625s2(Context context, String str) {
        l9s.m149076g().mo30817s2(context, str);
    }

    @Override // p149l.ypf
    public boolean shouldShowAutoPay() {
        return l9s.m149063Z();
    }

    @Override // p149l.ypf
    public void showAutoPayHelp(Act act) {
        l9s.m149067b0(act);
    }

    @Override // p149l.ypf
    public void showBindPhoneDialog(Act act, d30 d30Var) {
        l9s.m149069c0(act, d30Var);
    }

    @Override // p149l.ypf
    public void showUserVerificationLogo(Context context, User user, VImage vImage) {
        l9s.m149075f0(context, user, vImage);
    }

    @Override // p149l.ypf
    public void showVipPurchaseDialog(Act act, String str) {
        l9s.m149077g0(act, str);
    }

    @Override // p149l.ypf
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2) {
        return l9s.m149083j0(context, str, z, z2);
    }
}
