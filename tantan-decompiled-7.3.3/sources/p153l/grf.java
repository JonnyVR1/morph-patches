package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class grf implements frf {
    @Override // p153l.frf
    /* JADX INFO: renamed from: P3 */
    public C22421c<Boolean> mo126903P3() {
        return mbs.m157882y();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: Q2 */
    public boolean mo126904Q2() {
        return mbs.m157842a0();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: W2 */
    public C22421c<Boolean> mo126905W2() {
        return mbs.m157883z();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: Z3 */
    public boolean mo126906Z3(Activity activity) {
        return mbs.m157817C(activity);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: a */
    public boolean mo126907a() {
        return mqr.m159588h();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: c */
    public boolean mo126908c() {
        return mqr.m159587g();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: d */
    public boolean mo126909d() {
        return mqr.m159586f();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: d2 */
    public lb2 mo126910d2(Act act, y20<String> y20Var, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var) {
        return mbs.m157853g().mo31756d2(act, y20Var, editText, arrayList, list, x20Var);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: e */
    public C22421c<List<BLiveMerchandise>> mo126911e(Act act, List<BLiveMerchandise> list) {
        return mbs.m157822H(act, list);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: f */
    public void mo126912f(Act act, BLiveMerchandise bLiveMerchandise, x20 x20Var, x20 x20Var2) {
        mbs.m157863l(act, bLiveMerchandise, x20Var, x20Var2);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: g */
    public void mo126913g(Act act, User user, boolean z, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2) {
        mbs.m157853g().mo31781jc(act, user, z, str, y20Var, y20Var2, str2);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: g4 */
    public boolean mo126914g4() {
        return uqb0.f180396b0.f170325b.mo31767g4();
    }

    @Override // p153l.frf
    public String getCurrencyProductCategory() {
        return mbs.m157867n();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: h */
    public void mo126915h(x3m x3mVar) {
        mbs.m157868n0(x3mVar);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: i */
    public void mo126916i(Context context, User user, String str, String str2, boolean z) {
        mo126919l(context, user, str, str2, z, null);
    }

    @Override // p153l.frf
    public boolean isHttpDnsOpen() {
        return uqb0.f180396b0.f170325b.isHttpDnsOpen();
    }

    @Override // p153l.frf
    public boolean isPurchaseDialogShowing() {
        return mbs.m157820F();
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: j */
    public C22421c<List<BLiveMerchandise>> mo126917j(String str, boolean z) {
        return mbs.m157831Q(str, z);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: k */
    public void mo126918k(Act act, String str) {
        mbs.m157850e0(act, str, null);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: l */
    public void mo126919l(Context context, User user, String str, String str2, boolean z, String str3) {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125953d(user);
        mbs.m157864l0(context, str, str2, z, str3);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: m */
    public User mo126920m(String str) {
        return mbs.m157874q0(str);
    }

    @Override // p153l.frf
    public User me_() {
        return mbs.m157824J();
    }

    @Override // p153l.frf
    public void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod) {
        mbs.m157827M(act, purchasePaymentParam, x20Var, x20Var2, payMethod);
    }

    @Override // p153l.frf
    public C22421c<uxj0> patchSettings(SettingGroups settingGroups) {
        return mbs.m157829O(settingGroups);
    }

    @Override // p153l.frf
    public void pollConversation() {
        mbs.m157830P();
    }

    @Override // p153l.frf
    public void refreshUser(String str) {
        mbs.m157832R(str);
    }

    @Override // p153l.frf
    public void registerPurchaseDialogListener(x3m x3mVar) {
        mbs.m157833S(x3mVar);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: s0 */
    public void mo126921s0(Act act, String str) {
        mbs.m157853g().mo31819s0(act, str);
    }

    @Override // p153l.frf
    /* JADX INFO: renamed from: s2 */
    public void mo126922s2(Context context, String str) {
        mbs.m157853g().mo31820s2(context, str);
    }

    @Override // p153l.frf
    public boolean shouldShowAutoPay() {
        return mbs.m157840Z();
    }

    @Override // p153l.frf
    public void showAutoPayHelp(Act act) {
        mbs.m157844b0(act);
    }

    @Override // p153l.frf
    public void showBindPhoneDialog(Act act, x20 x20Var) {
        mbs.m157846c0(act, x20Var);
    }

    @Override // p153l.frf
    public void showUserVerificationLogo(Context context, User user, VImage vImage) {
        mbs.m157852f0(context, user, vImage);
    }

    @Override // p153l.frf
    public void showVipPurchaseDialog(Act act, String str) {
        mbs.m157854g0(act, str);
    }

    @Override // p153l.frf
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2) {
        return mbs.m157860j0(context, str, z, z2);
    }
}
