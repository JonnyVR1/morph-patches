package com.p000p1.mobile.putong.core.biz.service;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.d30;
import l.e30;
import l.g30;
import l.j760;
import org.jetbrains.annotations.Nullable;
import p006l.wx80;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface CorePayInnerService extends IProvider {
    /* JADX INFO: renamed from: A6 */
    int m6930A6(String str);

    /* JADX INFO: renamed from: Ag */
    long m6931Ag();

    /* JADX INFO: renamed from: Am */
    void m6932Am(Act act, String str, e30<String> e30Var);

    /* JADX INFO: renamed from: Bk */
    void m6933Bk(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: Bl */
    void m6934Bl(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: Cd */
    List<Merchandise> m6935Cd(ProductCategory productCategory);

    /* JADX INFO: renamed from: Cg */
    void m6936Cg(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: Ci */
    void m6937Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var);

    /* JADX INFO: renamed from: Cl */
    boolean m6938Cl();

    /* JADX INFO: renamed from: Cp */
    void m6939Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, e30<PayMethod> e30Var);

    /* JADX INFO: renamed from: D7 */
    boolean m6940D7(String str);

    /* JADX INFO: renamed from: D9 */
    boolean m6941D9();

    /* JADX INFO: renamed from: Dq */
    ArrayList<Privilege> m6942Dq();

    /* JADX INFO: renamed from: Ds */
    void m6943Ds(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var);

    /* JADX INFO: renamed from: Ed */
    boolean m6944Ed();

    /* JADX INFO: renamed from: Fd */
    boolean m6945Fd();

    /* JADX INFO: renamed from: Fh */
    int m6946Fh();

    /* JADX INFO: renamed from: Fn */
    void m6947Fn(Act act);

    /* JADX INFO: renamed from: Fs */
    boolean m6948Fs();

    /* JADX INFO: renamed from: Gs */
    void m6949Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, e30<PayMethod> e30Var);

    /* JADX INFO: renamed from: Hm */
    wx80 m6950Hm(PurchaseType purchaseType, Privilege privilege);

    /* JADX INFO: renamed from: I8 */
    void m6951I8(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Jf */
    String m6952Jf(ProductCategory productCategory);

    /* JADX INFO: renamed from: Kd */
    void m6953Kd(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var);

    /* JADX INFO: renamed from: Ki */
    boolean m6954Ki();

    /* JADX INFO: renamed from: Ko */
    void m6955Ko();

    /* JADX INFO: renamed from: Le */
    boolean m6956Le(Merchandise merchandise);

    /* JADX INFO: renamed from: Of */
    boolean m6957Of(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: Og */
    void m6958Og(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege);

    /* JADX INFO: renamed from: On */
    c<PaymentResultWrapper> m6959On();

    /* JADX INFO: renamed from: Pc */
    boolean m6960Pc();

    /* JADX INFO: renamed from: Pk */
    void m6961Pk(Act act, String str, e30<String> e30Var);

    /* JADX INFO: renamed from: Pr */
    void m6962Pr(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Qk */
    int m6963Qk();

    /* JADX INFO: renamed from: Qs */
    void m6964Qs(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: S7 */
    List<Merchandise> m6965S7(boolean z);

    /* JADX INFO: renamed from: S9 */
    boolean m6966S9();

    /* JADX INFO: renamed from: Sb */
    String m6967Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2);

    /* JADX INFO: renamed from: Sj */
    boolean m6968Sj();

    /* JADX INFO: renamed from: To */
    void m6969To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable e30<Integer> e30Var);

    /* JADX INFO: renamed from: Uk */
    String m6970Uk(String str);

    /* JADX INFO: renamed from: Va */
    void m6971Va();

    /* JADX INFO: renamed from: Wa */
    boolean m6972Wa();

    /* JADX INFO: renamed from: Wi */
    boolean m6973Wi();

    /* JADX INFO: renamed from: Xa */
    int m6974Xa();

    /* JADX INFO: renamed from: Xe */
    void m6975Xe();

    /* JADX INFO: renamed from: Y4 */
    int m6976Y4();

    /* JADX INFO: renamed from: Ya */
    boolean m6977Ya();

    /* JADX INFO: renamed from: Yi */
    List<String> m6978Yi();

    /* JADX INFO: renamed from: Yl */
    boolean m6979Yl();

    /* JADX INFO: renamed from: Z7 */
    String m6980Z7(Coupon coupon);

    /* JADX INFO: renamed from: Zn */
    boolean m6981Zn(Act act);

    /* JADX INFO: renamed from: Zs */
    boolean m6982Zs(Merchandise merchandise);

    /* JADX INFO: renamed from: ae */
    boolean m6983ae(Merchandise merchandise, String str);

    /* JADX INFO: renamed from: at */
    boolean m6984at();

    /* JADX INFO: renamed from: b8 */
    boolean m6985b8();

    /* JADX INFO: renamed from: bf */
    wx80 m6986bf(Privilege privilege);

    /* JADX INFO: renamed from: bg */
    boolean m6987bg();

    /* JADX INFO: renamed from: cf */
    boolean m6988cf();

    /* JADX INFO: renamed from: d4 */
    boolean m6989d4();

    /* JADX INFO: renamed from: d6 */
    String m6990d6(PurchaseType purchaseType);

    /* JADX INFO: renamed from: d9 */
    boolean m6991d9();

    /* JADX INFO: renamed from: dh */
    boolean m6992dh();

    /* JADX INFO: renamed from: e */
    boolean m6993e();

    /* JADX INFO: renamed from: e2 */
    boolean m6994e2();

    /* JADX INFO: renamed from: e8 */
    void m6995e8(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: ej */
    wx80 m6996ej(Privilege privilege);

    /* JADX INFO: renamed from: fj */
    String m6997fj(String str);

    /* JADX INFO: renamed from: fk */
    Merchandise m6998fk(ProductCategory productCategory, String str);

    /* JADX INFO: renamed from: gr */
    void m6999gr();

    /* JADX INFO: renamed from: je */
    CharSequence m7000je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z);

    /* JADX INFO: renamed from: kr */
    boolean m7001kr();

    /* JADX INFO: renamed from: lf */
    void m7002lf(long j);

    /* JADX INFO: renamed from: na */
    void m7003na(Act act, String str);

    /* JADX INFO: renamed from: nb */
    boolean m7004nb();

    /* JADX INFO: renamed from: ng */
    boolean m7005ng(String str, PayMethod payMethod, PurchaseType purchaseType);

    /* JADX INFO: renamed from: ok */
    cwf0 m7006ok(PurchaseType purchaseType);

    /* JADX INFO: renamed from: om */
    List<PayMethod> m7007om(String str, Merchandise merchandise, String str2);

    /* JADX INFO: renamed from: ot */
    void m7008ot(Act act, String str);

    /* JADX INFO: renamed from: pj */
    boolean m7009pj(String str, Merchandise merchandise);

    /* JADX INFO: renamed from: pk */
    j760<Boolean, String> m7010pk(Coupon coupon);

    /* JADX INFO: renamed from: sb */
    void m7011sb(boolean z);

    /* JADX INFO: renamed from: sm */
    void m7012sm(Act act, String str, int i, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: td */
    void m7013td(Act act, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, String str, String str2, String str3, d30 d30Var);

    /* JADX INFO: renamed from: to */
    void m7014to();

    /* JADX INFO: renamed from: v9 */
    boolean m7015v9();

    /* JADX INFO: renamed from: vt */
    j760<Boolean, String> m7016vt(long j);

    /* JADX INFO: renamed from: wg */
    j760<Merchandise, Coupon> m7017wg();

    /* JADX INFO: renamed from: wm */
    void m7018wm(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj);

    /* JADX INFO: renamed from: wn */
    void m7019wn(PurchaseType purchaseType);

    /* JADX INFO: renamed from: x7 */
    void m7020x7(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: xj */
    boolean m7021xj();

    /* JADX INFO: renamed from: xn */
    boolean m7022xn();

    /* JADX INFO: renamed from: ya */
    void m7023ya(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3);

    /* JADX INFO: renamed from: yc */
    boolean m7024yc();

    /* JADX INFO: renamed from: zl */
    boolean m7025zl();

    /* JADX INFO: renamed from: zr */
    void m7026zr(Act act, String str);
}
