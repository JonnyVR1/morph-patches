package p006l;

import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.qq3;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010$J1\u0010'\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ll/j5b0;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "", "f0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "e0", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "V", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "W", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "b0", "()V", "", "quantity", "X", "(I)Z", "Y", "Z", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "a0", "sectionExtra", "c0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "d0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public class j5b0 extends AbstractC0212a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, purchaseType, str);
        act.getClass();
        purchaseType.getClass();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m17269T(int i, d dVar) {
        return Boolean.valueOf(dVar.m() && dVar.b().s().quantity == i && dVar.b().s().monthType());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m17270U(int i, d dVar) {
        return Boolean.valueOf(!dVar.m() && dVar.d().s().quantity == i && dVar.d().s().monthType());
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m17271g0(j5b0 j5b0Var, d dVar, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: sendPurchaseSection");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        j5b0Var.m17282f0(dVar, z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m17272V(@NotNull d section, @NotNull PurchaseAgreementState agreementState) {
        section.getClass();
        agreementState.getClass();
        l3b0 purchaseExtra = getPurchaseExtra();
        d dVarM18554i = null;
        if (purchaseExtra != null && purchaseExtra.getIsExtraSelected()) {
            l3b0 purchaseExtra2 = getPurchaseExtra();
            dVarM18554i = purchaseExtra2 != null ? purchaseExtra2.m18554i(section) : null;
            if (dVarM18554i != null) {
                mo7358f(dVarM18554i, agreementState);
            }
        }
        d dVar = dVarM18554i;
        mo7358f(section, agreementState);
        m7378z(m7360h(dVar == null ? section : dVar, m7365m()));
        m7341D(agreementState);
        AbstractC0212a.m7334C(this, section, dVar, false, false, 8, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m17273W(@NotNull PurchaseAgreementState agreementState) {
        l3b0 purchaseExtra;
        agreementState.getClass();
        if (m7377y()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(m7350M());
            m7359g(arrayList, agreementState);
            d dVarM7362j = m7362j(arrayList);
            if (dVarM7362j != null) {
                l3b0 purchaseExtra2 = getPurchaseExtra();
                d dVarM18554i = null;
                if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                    dVarM18554i = purchaseExtra.m18554i(dVarM7362j);
                }
                d dVar = dVarM18554i;
                m7378z(m7360h(dVar == null ? dVarM7362j : dVar, m7365m()));
                m7341D(agreementState);
                m7342E(arrayList);
                AbstractC0212a.m7334C(this, dVarM7362j, dVar, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m17274X(int quantity) {
        d dVarM17276Z = m17276Z(quantity);
        if (dVarM17276Z != null) {
            m17271g0(this, dVarM17276Z, true, false, 4, null);
        }
        return NullChecker.a(dVarM17276Z);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m17275Y(int quantity) {
        d dVarM17277a0 = m17277a0(quantity);
        if (dVarM17277a0 != null) {
            m17271g0(this, dVarM17277a0, true, false, 4, null);
        }
        return NullChecker.a(dVarM17277a0);
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final d m17276Z(final int quantity) {
        return (d) vwb.r(m7350M(), new w9j() { // from class: l.i5b0
            public final Object call(Object obj) {
                return j5b0.m17269T(quantity, (d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public final d m17277a0(final int quantity) {
        return (d) vwb.r(m7350M(), new w9j() { // from class: l.h5b0
            public final Object call(Object obj) {
                return j5b0.m17270U(quantity, (d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final void m17278b0() {
        l3b0 purchaseExtra;
        if (m7377y()) {
            PayMethod payMethodM7365m = m7365m();
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<d> listM7361i = m7361i();
            mo7357e(listM7361i, payMethodM7365m, currentAgreementState);
            d dVarM7362j = m7362j(listM7361i);
            l3b0 purchaseExtra2 = getPurchaseExtra();
            d dVarM18554i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && dVarM7362j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                dVarM18554i = purchaseExtra.m18554i(dVarM7362j);
            }
            if (dVarM7362j != null) {
                PayMethod payMethodM7360h = m7360h(dVarM18554i == null ? dVarM7362j : dVarM18554i, payMethodM7365m);
                if (payMethodM7360h != null) {
                    payMethodM7365m = payMethodM7360h;
                }
            }
            m7378z(payMethodM7365m);
            m7341D(currentAgreementState);
            m7342E(listM7361i);
            if (dVarM7362j != null) {
                AbstractC0212a.m7334C(this, dVarM7362j, dVarM18554i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17279c0(d section, d sectionExtra, boolean scroll, boolean isClick) {
        PayMethod payMethodM7365m = m7365m();
        PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
        m7378z(m7360h(sectionExtra == null ? section : sectionExtra, payMethodM7365m));
        m7341D(currentAgreementState);
        m7340B(section, sectionExtra, scroll, isClick);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m17280d0(d section, d sectionExtra, boolean scroll) {
        PayMethod payMethodM7365m = m7365m();
        PurchaseAgreementState purchaseAgreementStateMo7372t = mo7372t();
        List<d> listM7350M = m7350M();
        mo7357e(listM7350M, payMethodM7365m, purchaseAgreementStateMo7372t);
        Iterator<d> it = listM7350M.iterator();
        while (it.hasNext()) {
            section.v(Intrinsics.d(section, it.next()));
        }
        m7378z(m7360h(sectionExtra == null ? section : sectionExtra, payMethodM7365m));
        m7341D(purchaseAgreementStateMo7372t);
        AbstractC0212a.m7334C(this, section, sectionExtra, scroll, false, 8, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m17281e0(@NotNull PayMethod payMethod) {
        l3b0 purchaseExtra;
        payMethod.getClass();
        if (m7377y()) {
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<d> listM7361i = m7361i();
            mo7357e(listM7361i, payMethod, currentAgreementState);
            d dVarM7362j = m7362j(listM7361i);
            l3b0 purchaseExtra2 = getPurchaseExtra();
            d dVarM18554i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && dVarM7362j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                dVarM18554i = purchaseExtra.m18554i(dVarM7362j);
            }
            if (dVarM7362j != null) {
                PayMethod payMethodM7360h = m7360h(dVarM18554i == null ? dVarM7362j : dVarM18554i, payMethod);
                if (payMethodM7360h != null) {
                    payMethod = payMethodM7360h;
                }
            }
            m7378z(payMethod);
            m7341D(currentAgreementState);
            m7342E(listM7361i);
            if (dVarM7362j != null) {
                AbstractC0212a.m7334C(this, dVarM7362j, dVarM18554i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m17282f0(@NotNull d section, boolean scroll, boolean isClick) {
        l3b0 purchaseExtra;
        section.getClass();
        if (m7377y()) {
            l3b0 purchaseExtra2 = getPurchaseExtra();
            d dVarM18554i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                dVarM18554i = purchaseExtra.m18554i(section);
            }
            if (m7371s(dVarM18554i == null ? section : dVarM18554i)) {
                return;
            }
            if (m7376x()) {
                m17279c0(section, dVarM18554i, scroll, isClick);
            } else {
                m17280d0(section, dVarM18554i, scroll);
            }
        }
    }
}
