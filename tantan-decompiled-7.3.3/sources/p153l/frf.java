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

/* JADX INFO: loaded from: classes13.dex */
public interface frf {
    /* JADX INFO: renamed from: P3 */
    C22421c<Boolean> mo126903P3();

    /* JADX INFO: renamed from: Q2 */
    boolean mo126904Q2();

    /* JADX INFO: renamed from: W2 */
    C22421c<Boolean> mo126905W2();

    /* JADX INFO: renamed from: Z3 */
    boolean mo126906Z3(Activity activity);

    /* JADX INFO: renamed from: a */
    boolean mo126907a();

    /* JADX INFO: renamed from: c */
    boolean mo126908c();

    /* JADX INFO: renamed from: d */
    boolean mo126909d();

    /* JADX INFO: renamed from: d2 */
    lb2 mo126910d2(Act act, y20<String> y20Var, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var);

    /* JADX INFO: renamed from: e */
    C22421c<List<BLiveMerchandise>> mo126911e(Act act, List<BLiveMerchandise> list);

    /* JADX INFO: renamed from: f */
    void mo126912f(Act act, BLiveMerchandise bLiveMerchandise, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: g */
    void mo126913g(Act act, User user, boolean z, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2);

    /* JADX INFO: renamed from: g4 */
    boolean mo126914g4();

    String getCurrencyProductCategory();

    /* JADX INFO: renamed from: h */
    void mo126915h(x3m x3mVar);

    /* JADX INFO: renamed from: i */
    void mo126916i(Context context, User user, String str, String str2, boolean z);

    boolean isHttpDnsOpen();

    boolean isPurchaseDialogShowing();

    /* JADX INFO: renamed from: j */
    C22421c<List<BLiveMerchandise>> mo126917j(String str, boolean z);

    /* JADX INFO: renamed from: k */
    void mo126918k(Act act, String str);

    /* JADX INFO: renamed from: l */
    void mo126919l(Context context, User user, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: m */
    User mo126920m(String str);

    User me_();

    void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod);

    C22421c<uxj0> patchSettings(SettingGroups settingGroups);

    void pollConversation();

    void refreshUser(String str);

    void registerPurchaseDialogListener(x3m x3mVar);

    /* JADX INFO: renamed from: s0 */
    void mo126921s0(Act act, String str);

    /* JADX INFO: renamed from: s2 */
    void mo126922s2(Context context, String str);

    boolean shouldShowAutoPay();

    void showAutoPayHelp(Act act);

    void showBindPhoneDialog(Act act, x20 x20Var);

    void showUserVerificationLogo(Context context, User user, VImage vImage);

    void showVipPurchaseDialog(Act act, String str);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2);
}
