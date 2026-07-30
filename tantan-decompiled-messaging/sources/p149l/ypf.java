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
public interface ypf {
    /* JADX INFO: renamed from: P3 */
    C22306c<Boolean> mo215606P3();

    /* JADX INFO: renamed from: Q2 */
    boolean mo215607Q2();

    /* JADX INFO: renamed from: W2 */
    C22306c<Boolean> mo215608W2();

    /* JADX INFO: renamed from: Z3 */
    boolean mo215609Z3(Activity activity);

    /* JADX INFO: renamed from: a */
    boolean mo215610a();

    /* JADX INFO: renamed from: c */
    boolean mo215611c();

    /* JADX INFO: renamed from: d */
    boolean mo215612d();

    /* JADX INFO: renamed from: d2 */
    eb2 mo215613d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var);

    /* JADX INFO: renamed from: e */
    C22306c<List<BLiveMerchandise>> mo215614e(Act act, List<BLiveMerchandise> list);

    /* JADX INFO: renamed from: f */
    void mo215615f(Act act, BLiveMerchandise bLiveMerchandise, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: g */
    void mo215616g(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2);

    /* JADX INFO: renamed from: g4 */
    boolean mo215617g4();

    String getCurrencyProductCategory();

    /* JADX INFO: renamed from: h */
    void mo215618h(e1m e1mVar);

    /* JADX INFO: renamed from: i */
    void mo215619i(Context context, User user, String str, String str2, boolean z);

    boolean isHttpDnsOpen();

    boolean isPurchaseDialogShowing();

    /* JADX INFO: renamed from: j */
    C22306c<List<BLiveMerchandise>> mo215620j(String str, boolean z);

    /* JADX INFO: renamed from: k */
    void mo215621k(Act act, String str);

    /* JADX INFO: renamed from: l */
    void mo215622l(Context context, User user, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: m */
    User mo215623m(String str);

    User me_();

    void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod);

    C22306c<roj0> patchSettings(SettingGroups settingGroups);

    void pollConversation();

    void refreshUser(String str);

    void registerPurchaseDialogListener(e1m e1mVar);

    /* JADX INFO: renamed from: s0 */
    void mo215624s0(Act act, String str);

    /* JADX INFO: renamed from: s2 */
    void mo215625s2(Context context, String str);

    boolean shouldShowAutoPay();

    void showAutoPayHelp(Act act);

    void showBindPhoneDialog(Act act, d30 d30Var);

    void showUserVerificationLogo(Context context, User user, VImage vImage);

    void showVipPurchaseDialog(Act act, String str);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2);
}
