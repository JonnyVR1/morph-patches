package com.p051p1.mobile.putong.core.biz.service;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.a30;
import p153l.a690;
import p153l.l4g0;
import p153l.pf60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public interface CorePayInnerService extends IProvider {
    /* JADX INFO: renamed from: A6 */
    int mo35996A6(String str);

    /* JADX INFO: renamed from: Ag */
    long mo35997Ag();

    /* JADX INFO: renamed from: Am */
    void mo35998Am(Act act, String str, y20<String> y20Var);

    /* JADX INFO: renamed from: Bk */
    void mo35999Bk(Act act, String str, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: Bl */
    void mo36000Bl(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: Cd */
    List<Merchandise> mo36001Cd(ProductCategory productCategory);

    /* JADX INFO: renamed from: Cg */
    void mo36002Cg(Act act, y20<Boolean> y20Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: Ci */
    void mo36003Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, y20<Integer> y20Var);

    /* JADX INFO: renamed from: Cl */
    boolean mo36004Cl();

    /* JADX INFO: renamed from: Cp */
    void mo36005Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, y20<PayMethod> y20Var);

    /* JADX INFO: renamed from: D7 */
    boolean mo36006D7(String str);

    /* JADX INFO: renamed from: D9 */
    boolean mo36007D9();

    /* JADX INFO: renamed from: Dq */
    ArrayList<Privilege> mo36008Dq();

    /* JADX INFO: renamed from: Ds */
    void mo36009Ds(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var);

    /* JADX INFO: renamed from: Ed */
    boolean mo36010Ed();

    /* JADX INFO: renamed from: Fd */
    boolean mo36011Fd();

    /* JADX INFO: renamed from: Fh */
    int mo36012Fh();

    /* JADX INFO: renamed from: Fn */
    void mo36013Fn(Act act);

    /* JADX INFO: renamed from: Fs */
    boolean mo36014Fs();

    /* JADX INFO: renamed from: Gs */
    void mo36015Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, y20<PayMethod> y20Var);

    /* JADX INFO: renamed from: Hm */
    a690 mo36016Hm(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: I8 */
    void mo36017I8(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Jf */
    String mo36018Jf(ProductCategory productCategory);

    /* JADX INFO: renamed from: Kd */
    void mo36019Kd(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var);

    /* JADX INFO: renamed from: Ki */
    boolean mo36020Ki();

    /* JADX INFO: renamed from: Ko */
    void mo36021Ko();

    /* JADX INFO: renamed from: Le */
    boolean mo36022Le(Merchandise merchandise);

    /* JADX INFO: renamed from: Of */
    boolean mo36023Of(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: Og */
    void mo36024Og(Act act, String str, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, Privilege privilege);

    /* JADX INFO: renamed from: On */
    C22421c<PaymentResultWrapper> mo36025On();

    /* JADX INFO: renamed from: Pc */
    boolean mo36026Pc();

    /* JADX INFO: renamed from: Pk */
    void mo36027Pk(Act act, String str, y20<String> y20Var);

    /* JADX INFO: renamed from: Pr */
    void mo36028Pr(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Qk */
    int mo36029Qk();

    /* JADX INFO: renamed from: Qs */
    void mo36030Qs(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3);

    /* JADX INFO: renamed from: S7 */
    List<Merchandise> mo36031S7(boolean z);

    /* JADX INFO: renamed from: S9 */
    boolean mo36032S9();

    /* JADX INFO: renamed from: Sb */
    String mo36033Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2);

    /* JADX INFO: renamed from: Sj */
    boolean mo36034Sj();

    /* JADX INFO: renamed from: To */
    void mo36035To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable y20<Integer> y20Var);

    /* JADX INFO: renamed from: Uk */
    String mo36036Uk(String str);

    /* JADX INFO: renamed from: Va */
    void mo36037Va();

    /* JADX INFO: renamed from: Wa */
    boolean mo36038Wa();

    /* JADX INFO: renamed from: Wi */
    boolean mo36039Wi();

    /* JADX INFO: renamed from: Xa */
    int mo36040Xa();

    /* JADX INFO: renamed from: Xe */
    void mo36041Xe();

    /* JADX INFO: renamed from: Y4 */
    int mo36042Y4();

    /* JADX INFO: renamed from: Ya */
    boolean mo36043Ya();

    /* JADX INFO: renamed from: Yi */
    List<String> mo36044Yi();

    /* JADX INFO: renamed from: Yl */
    boolean mo36045Yl();

    /* JADX INFO: renamed from: Z7 */
    String mo36046Z7(Coupon coupon);

    /* JADX INFO: renamed from: Zn */
    boolean mo36047Zn(Act act);

    /* JADX INFO: renamed from: Zs */
    boolean mo36048Zs(Merchandise merchandise);

    /* JADX INFO: renamed from: ae */
    boolean mo36049ae(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: at */
    boolean mo36050at();

    /* JADX INFO: renamed from: b8 */
    boolean mo36051b8();

    /* JADX INFO: renamed from: bf */
    a690 mo36052bf(Privilege privilege);

    /* JADX INFO: renamed from: bg */
    boolean mo36053bg();

    /* JADX INFO: renamed from: cf */
    boolean mo36054cf();

    /* JADX INFO: renamed from: d4 */
    boolean mo36055d4();

    /* JADX INFO: renamed from: d6 */
    String mo36056d6(PurchaseType purchaseType);

    /* JADX INFO: renamed from: d9 */
    boolean mo36057d9();

    /* JADX INFO: renamed from: dh */
    boolean mo36058dh();

    /* JADX INFO: renamed from: e */
    boolean mo36059e();

    /* JADX INFO: renamed from: e2 */
    boolean mo36060e2();

    /* JADX INFO: renamed from: e8 */
    void mo36061e8(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3);

    /* JADX INFO: renamed from: ej */
    a690 mo36062ej(Privilege privilege);

    /* JADX INFO: renamed from: fj */
    String mo36063fj(String str);

    /* JADX INFO: renamed from: fk */
    Merchandise mo36064fk(ProductCategory productCategory, String str);

    /* JADX INFO: renamed from: gr */
    void mo36065gr();

    /* JADX INFO: renamed from: je */
    CharSequence mo36066je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z);

    /* JADX INFO: renamed from: kr */
    boolean mo36067kr();

    /* JADX INFO: renamed from: lf */
    void mo36068lf(long j);

    /* JADX INFO: renamed from: na */
    void mo36069na(Act act, String str);

    /* JADX INFO: renamed from: nb */
    boolean mo36070nb();

    /* JADX INFO: renamed from: ng */
    boolean mo36071ng(String str, PayMethod payMethod, PurchaseType purchaseType);

    /* JADX INFO: renamed from: ok */
    l4g0 mo36072ok(PurchaseType purchaseType);

    /* JADX INFO: renamed from: om */
    List<PayMethod> mo36073om(String str, Merchandise merchandise, String str2);

    /* JADX INFO: renamed from: ot */
    void mo36074ot(Act act, String str);

    /* JADX INFO: renamed from: pj */
    boolean mo36075pj(String str, Merchandise merchandise);

    /* JADX INFO: renamed from: pk */
    pf60<Boolean, String> mo36076pk(Coupon coupon);

    /* JADX INFO: renamed from: sb */
    void mo36077sb(boolean z);

    /* JADX INFO: renamed from: sm */
    void mo36078sm(Act act, String str, int i, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: td */
    void mo36079td(Act act, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, String str, String str2, String str3, x20 x20Var);

    /* JADX INFO: renamed from: to */
    void mo36080to();

    /* JADX INFO: renamed from: v9 */
    boolean mo36081v9();

    /* JADX INFO: renamed from: vt */
    pf60<Boolean, String> mo36082vt(long j);

    /* JADX INFO: renamed from: wg */
    pf60<Merchandise, Coupon> mo36083wg();

    /* JADX INFO: renamed from: wm */
    void mo36084wm(Act act, y20<Boolean> y20Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: wn */
    void mo36085wn(PurchaseType purchaseType);

    /* JADX INFO: renamed from: x7 */
    void mo36086x7(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3);

    /* JADX INFO: renamed from: xj */
    boolean mo36087xj();

    /* JADX INFO: renamed from: xn */
    boolean mo36088xn();

    /* JADX INFO: renamed from: ya */
    void mo36089ya(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3);

    /* JADX INFO: renamed from: yc */
    boolean mo36090yc();

    /* JADX INFO: renamed from: zl */
    boolean mo36091zl();

    /* JADX INFO: renamed from: zr */
    void mo36092zr(Act act, String str);
}
