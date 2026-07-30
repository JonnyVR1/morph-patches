package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010$J1\u0010'\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, m88121d2 = {"Ll/ndb0;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "", "f0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "e0", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "W", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "b0", "()V", "", FirebaseAnalytics.Param.QUANTITY, "X", "(I)Z", "Y", "Z", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "a0", "sectionExtra", "c0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "d0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class ndb0 extends AbstractC8939a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, purchaseType, str);
        act.getClass();
        purchaseType.getClass();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m162667T(int i, C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54714m() && c8928d.m54703b().m54784s().quantity == i && c8928d.m54703b().m54784s().monthType());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m162668U(int i, C8928d c8928d) {
        return Boolean.valueOf(!c8928d.m54714m() && c8928d.m54705d().m54784s().quantity == i && c8928d.m54705d().m54784s().monthType());
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m162669g0(ndb0 ndb0Var, C8928d c8928d, boolean z, boolean z2, int i, Object obj) throws Exception {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: sendPurchaseSection");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        ndb0Var.m162680f0(c8928d, z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m162670V(@NotNull C8928d section, @NotNull PurchaseAgreementState agreementState) throws Exception {
        section.getClass();
        agreementState.getClass();
        pbb0 purchaseExtra = getPurchaseExtra();
        C8928d c8928dM171501i = null;
        if (purchaseExtra != null && purchaseExtra.getIsExtraSelected()) {
            pbb0 purchaseExtra2 = getPurchaseExtra();
            c8928dM171501i = purchaseExtra2 != null ? purchaseExtra2.m171501i(section) : null;
            if (c8928dM171501i != null) {
                mo55206f(c8928dM171501i, agreementState);
            }
        }
        C8928d c8928d = c8928dM171501i;
        mo55206f(section, agreementState);
        m55226z(m55208h(c8928d == null ? section : c8928d, m55213m()));
        m55189D(agreementState);
        AbstractC8939a.m55182C(this, section, c8928d, false, false, 8, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m162671W(@NotNull PurchaseAgreementState agreementState) throws Exception {
        pbb0 purchaseExtra;
        agreementState.getClass();
        if (m55225y()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(m55198M());
            m55207g(arrayList, agreementState);
            C8928d c8928dM55210j = m55210j(arrayList);
            if (c8928dM55210j != null) {
                pbb0 purchaseExtra2 = getPurchaseExtra();
                C8928d c8928dM171501i = null;
                if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                    c8928dM171501i = purchaseExtra.m171501i(c8928dM55210j);
                }
                C8928d c8928d = c8928dM171501i;
                m55226z(m55208h(c8928d == null ? c8928dM55210j : c8928d, m55213m()));
                m55189D(agreementState);
                m55190E(arrayList);
                AbstractC8939a.m55182C(this, c8928dM55210j, c8928d, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m162672X(int quantity) throws Exception {
        C8928d c8928dM162674Z = m162674Z(quantity);
        if (c8928dM162674Z != null) {
            m162669g0(this, c8928dM162674Z, true, false, 4, null);
        }
        return NullChecker.m82486a(c8928dM162674Z);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m162673Y(int quantity) throws Exception {
        C8928d c8928dM162675a0 = m162675a0(quantity);
        if (c8928dM162675a0 != null) {
            m162669g0(this, c8928dM162675a0, true, false, 4, null);
        }
        return NullChecker.m82486a(c8928dM162675a0);
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final C8928d m162674Z(final int quantity) {
        return (C8928d) jyb.m147529r(m55198M(), new qcj() { // from class: l.mdb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ndb0.m162667T(quantity, (C8928d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public final C8928d m162675a0(final int quantity) {
        return (C8928d) jyb.m147529r(m55198M(), new qcj() { // from class: l.ldb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ndb0.m162668U(quantity, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final void m162676b0() throws Exception {
        pbb0 purchaseExtra;
        if (m55225y()) {
            PayMethod payMethodM55213m = m55213m();
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<C8928d> listM55209i = m55209i();
            mo55205e(listM55209i, payMethodM55213m, currentAgreementState);
            C8928d c8928dM55210j = m55210j(listM55209i);
            pbb0 purchaseExtra2 = getPurchaseExtra();
            C8928d c8928dM171501i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && c8928dM55210j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                c8928dM171501i = purchaseExtra.m171501i(c8928dM55210j);
            }
            if (c8928dM55210j != null) {
                PayMethod payMethodM55208h = m55208h(c8928dM171501i == null ? c8928dM55210j : c8928dM171501i, payMethodM55213m);
                if (payMethodM55208h != null) {
                    payMethodM55213m = payMethodM55208h;
                }
            }
            m55226z(payMethodM55213m);
            m55189D(currentAgreementState);
            m55190E(listM55209i);
            if (c8928dM55210j != null) {
                AbstractC8939a.m55182C(this, c8928dM55210j, c8928dM171501i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m162677c0(C8928d section, C8928d sectionExtra, boolean scroll, boolean isClick) throws Exception {
        PayMethod payMethodM55213m = m55213m();
        PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
        m55226z(m55208h(sectionExtra == null ? section : sectionExtra, payMethodM55213m));
        m55189D(currentAgreementState);
        m55188B(section, sectionExtra, scroll, isClick);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m162678d0(C8928d section, C8928d sectionExtra, boolean scroll) throws Exception {
        PayMethod payMethodM55213m = m55213m();
        PurchaseAgreementState purchaseAgreementStateMo55220t = mo55220t();
        List<C8928d> listM55198M = m55198M();
        mo55205e(listM55198M, payMethodM55213m, purchaseAgreementStateMo55220t);
        Iterator<C8928d> it = listM55198M.iterator();
        while (it.hasNext()) {
            section.m54723v(Intrinsics.m88377d(section, it.next()));
        }
        m55226z(m55208h(sectionExtra == null ? section : sectionExtra, payMethodM55213m));
        m55189D(purchaseAgreementStateMo55220t);
        AbstractC8939a.m55182C(this, section, sectionExtra, scroll, false, 8, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m162679e0(@NotNull PayMethod payMethod) {
        pbb0 purchaseExtra;
        payMethod.getClass();
        if (m55225y()) {
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<C8928d> listM55209i = m55209i();
            mo55205e(listM55209i, payMethod, currentAgreementState);
            C8928d c8928dM55210j = m55210j(listM55209i);
            pbb0 purchaseExtra2 = getPurchaseExtra();
            C8928d c8928dM171501i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && c8928dM55210j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                c8928dM171501i = purchaseExtra.m171501i(c8928dM55210j);
            }
            if (c8928dM55210j != null) {
                PayMethod payMethodM55208h = m55208h(c8928dM171501i == null ? c8928dM55210j : c8928dM171501i, payMethod);
                if (payMethodM55208h != null) {
                    payMethod = payMethodM55208h;
                }
            }
            m55226z(payMethod);
            m55189D(currentAgreementState);
            m55190E(listM55209i);
            if (c8928dM55210j != null) {
                AbstractC8939a.m55182C(this, c8928dM55210j, c8928dM171501i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m162680f0(@NotNull C8928d section, boolean scroll, boolean isClick) throws Exception {
        pbb0 purchaseExtra;
        section.getClass();
        if (m55225y()) {
            pbb0 purchaseExtra2 = getPurchaseExtra();
            C8928d c8928dM171501i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                c8928dM171501i = purchaseExtra.m171501i(section);
            }
            if (m55219s(c8928dM171501i == null ? section : c8928dM171501i)) {
                return;
            }
            if (m55224x()) {
                m162677c0(section, c8928dM171501i, scroll, isClick);
            } else {
                m162678d0(section, c8928dM171501i, scroll);
            }
        }
    }
}
