package com.p046p1.mobile.putong.core.biz.service;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.g30;
import p149l.j760;
import p149l.wx80;

/* JADX INFO: loaded from: classes9.dex */
public interface CorePayInnerService extends IProvider {
    /* JADX INFO: renamed from: A6 */
    int mo34993A6(String str);

    /* JADX INFO: renamed from: Ag */
    long mo34994Ag();

    /* JADX INFO: renamed from: Am */
    void mo34995Am(Act act, String str, e30<String> e30Var);

    /* JADX INFO: renamed from: Bk */
    void mo34996Bk(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: Bl */
    void mo34997Bl(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: Cd */
    List<Merchandise> mo34998Cd(ProductCategory productCategory);

    /* JADX INFO: renamed from: Cg */
    void mo34999Cg(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: Ci */
    void mo35000Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var);

    /* JADX INFO: renamed from: Cl */
    boolean mo35001Cl();

    /* JADX INFO: renamed from: Cp */
    void mo35002Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, e30<PayMethod> e30Var);

    /* JADX INFO: renamed from: D7 */
    boolean mo35003D7(String str);

    /* JADX INFO: renamed from: D9 */
    boolean mo35004D9();

    /* JADX INFO: renamed from: Dq */
    ArrayList<Privilege> mo35005Dq();

    /* JADX INFO: renamed from: Ds */
    void mo35006Ds(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var);

    /* JADX INFO: renamed from: Ed */
    boolean mo35007Ed();

    /* JADX INFO: renamed from: Fd */
    boolean mo35008Fd();

    /* JADX INFO: renamed from: Fh */
    int mo35009Fh();

    /* JADX INFO: renamed from: Fn */
    void mo35010Fn(Act act);

    /* JADX INFO: renamed from: Fs */
    boolean mo35011Fs();

    /* JADX INFO: renamed from: Gs */
    void mo35012Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, e30<PayMethod> e30Var);

    /* JADX INFO: renamed from: Hm */
    wx80 mo35013Hm(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: I8 */
    void mo35014I8(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Jf */
    String mo35015Jf(ProductCategory productCategory);

    /* JADX INFO: renamed from: Kd */
    void mo35016Kd(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var);

    /* JADX INFO: renamed from: Ki */
    boolean mo35017Ki();

    /* JADX INFO: renamed from: Ko */
    void mo35018Ko();

    /* JADX INFO: renamed from: Le */
    boolean mo35019Le(Merchandise merchandise);

    /* JADX INFO: renamed from: Of */
    boolean mo35020Of(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: Og */
    void mo35021Og(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege);

    /* JADX INFO: renamed from: On */
    C22306c<PaymentResultWrapper> mo35022On();

    /* JADX INFO: renamed from: Pc */
    boolean mo35023Pc();

    /* JADX INFO: renamed from: Pk */
    void mo35024Pk(Act act, String str, e30<String> e30Var);

    /* JADX INFO: renamed from: Pr */
    void mo35025Pr(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Qk */
    int mo35026Qk();

    /* JADX INFO: renamed from: Qs */
    void mo35027Qs(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: S7 */
    List<Merchandise> mo35028S7(boolean z);

    /* JADX INFO: renamed from: S9 */
    boolean mo35029S9();

    /* JADX INFO: renamed from: Sb */
    String mo35030Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2);

    /* JADX INFO: renamed from: Sj */
    boolean mo35031Sj();

    /* JADX INFO: renamed from: To */
    void mo35032To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable e30<Integer> e30Var);

    /* JADX INFO: renamed from: Uk */
    String mo35033Uk(String str);

    /* JADX INFO: renamed from: Va */
    void mo35034Va();

    /* JADX INFO: renamed from: Wa */
    boolean mo35035Wa();

    /* JADX INFO: renamed from: Wi */
    boolean mo35036Wi();

    /* JADX INFO: renamed from: Xa */
    int mo35037Xa();

    /* JADX INFO: renamed from: Xe */
    void mo35038Xe();

    /* JADX INFO: renamed from: Y4 */
    int mo35039Y4();

    /* JADX INFO: renamed from: Ya */
    boolean mo35040Ya();

    /* JADX INFO: renamed from: Yi */
    List<String> mo35041Yi();

    /* JADX INFO: renamed from: Yl */
    boolean mo35042Yl();

    /* JADX INFO: renamed from: Z7 */
    String mo35043Z7(Coupon coupon);

    /* JADX INFO: renamed from: Zn */
    boolean mo35044Zn(Act act);

    /* JADX INFO: renamed from: Zs */
    boolean mo35045Zs(Merchandise merchandise);

    /* JADX INFO: renamed from: ae */
    boolean mo35046ae(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: at */
    boolean mo35047at();

    /* JADX INFO: renamed from: b8 */
    boolean mo35048b8();

    /* JADX INFO: renamed from: bf */
    wx80 mo35049bf(Privilege privilege);

    /* JADX INFO: renamed from: bg */
    boolean mo35050bg();

    /* JADX INFO: renamed from: cf */
    boolean mo35051cf();

    /* JADX INFO: renamed from: d4 */
    boolean mo35052d4();

    /* JADX INFO: renamed from: d6 */
    String mo35053d6(PurchaseType purchaseType);

    /* JADX INFO: renamed from: d9 */
    boolean mo35054d9();

    /* JADX INFO: renamed from: dh */
    boolean mo35055dh();

    /* JADX INFO: renamed from: e */
    boolean mo35056e();

    /* JADX INFO: renamed from: e2 */
    boolean mo35057e2();

    /* JADX INFO: renamed from: e8 */
    void mo35058e8(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: ej */
    wx80 mo35059ej(Privilege privilege);

    /* JADX INFO: renamed from: fj */
    String mo35060fj(String str);

    /* JADX INFO: renamed from: fk */
    Merchandise mo35061fk(ProductCategory productCategory, String str);

    /* JADX INFO: renamed from: gr */
    void mo35062gr();

    /* JADX INFO: renamed from: je */
    CharSequence mo35063je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z);

    /* JADX INFO: renamed from: kr */
    boolean mo35064kr();

    /* JADX INFO: renamed from: lf */
    void mo35065lf(long j);

    /* JADX INFO: renamed from: na */
    void mo35066na(Act act, String str);

    /* JADX INFO: renamed from: nb */
    boolean mo35067nb();

    /* JADX INFO: renamed from: ng */
    boolean mo35068ng(String str, PayMethod payMethod, PurchaseType purchaseType);

    /* JADX INFO: renamed from: ok */
    cwf0 mo35069ok(PurchaseType purchaseType);

    /* JADX INFO: renamed from: om */
    List<PayMethod> mo35070om(String str, Merchandise merchandise, String str2);

    /* JADX INFO: renamed from: ot */
    void mo35071ot(Act act, String str);

    /* JADX INFO: renamed from: pj */
    boolean mo35072pj(String str, Merchandise merchandise);

    /* JADX INFO: renamed from: pk */
    j760<Boolean, String> mo35073pk(Coupon coupon);

    /* JADX INFO: renamed from: sb */
    void mo35074sb(boolean z);

    /* JADX INFO: renamed from: sm */
    void mo35075sm(Act act, String str, int i, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: td */
    void mo35076td(Act act, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, String str, String str2, String str3, d30 d30Var);

    /* JADX INFO: renamed from: to */
    void mo35077to();

    /* JADX INFO: renamed from: v9 */
    boolean mo35078v9();

    /* JADX INFO: renamed from: vt */
    j760<Boolean, String> mo35079vt(long j);

    /* JADX INFO: renamed from: wg */
    j760<Merchandise, Coupon> mo35080wg();

    /* JADX INFO: renamed from: wm */
    void mo35081wm(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: wn */
    void mo35082wn(PurchaseType purchaseType);

    /* JADX INFO: renamed from: x7 */
    void mo35083x7(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: xj */
    boolean mo35084xj();

    /* JADX INFO: renamed from: xn */
    boolean mo35085xn();

    /* JADX INFO: renamed from: ya */
    void mo35086ya(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: yc */
    boolean mo35087yc();

    /* JADX INFO: renamed from: zl */
    boolean mo35088zl();

    /* JADX INFO: renamed from: zr */
    void mo35089zr(Act act, String str);
}
