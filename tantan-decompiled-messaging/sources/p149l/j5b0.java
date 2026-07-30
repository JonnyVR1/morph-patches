package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.data.PayMethod;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010$J1\u0010'\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, m87232d2 = {"Ll/j5b0;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "", "f0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "e0", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "W", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "b0", "()V", "", FirebaseAnalytics.Param.QUANTITY, "X", "(I)Z", "Y", "Z", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "a0", "sectionExtra", "c0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)V", "d0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class j5b0 extends AbstractC8776a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, purchaseType, str);
        act.getClass();
        purchaseType.getClass();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m139823T(int i, C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53531m() && c8765d.m53520b().m53601s().quantity == i && c8765d.m53520b().m53601s().monthType());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m139824U(int i, C8765d c8765d) {
        return Boolean.valueOf(!c8765d.m53531m() && c8765d.m53522d().m53601s().quantity == i && c8765d.m53522d().m53601s().monthType());
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m139825g0(j5b0 j5b0Var, C8765d c8765d, boolean z, boolean z2, int i, Object obj) throws Exception {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: sendPurchaseSection");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        j5b0Var.m139836f0(c8765d, z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m139826V(@NotNull C8765d section, @NotNull PurchaseAgreementState agreementState) throws Exception {
        section.getClass();
        agreementState.getClass();
        l3b0 purchaseExtra = getPurchaseExtra();
        C8765d c8765dM148380i = null;
        if (purchaseExtra != null && purchaseExtra.getIsExtraSelected()) {
            l3b0 purchaseExtra2 = getPurchaseExtra();
            c8765dM148380i = purchaseExtra2 != null ? purchaseExtra2.m148380i(section) : null;
            if (c8765dM148380i != null) {
                mo54023f(c8765dM148380i, agreementState);
            }
        }
        C8765d c8765d = c8765dM148380i;
        mo54023f(section, agreementState);
        m54043z(m54025h(c8765d == null ? section : c8765d, m54030m()));
        m54006D(agreementState);
        AbstractC8776a.m53999C(this, section, c8765d, false, false, 8, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m139827W(@NotNull PurchaseAgreementState agreementState) throws Exception {
        l3b0 purchaseExtra;
        agreementState.getClass();
        if (m54042y()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(m54015M());
            m54024g(arrayList, agreementState);
            C8765d c8765dM54027j = m54027j(arrayList);
            if (c8765dM54027j != null) {
                l3b0 purchaseExtra2 = getPurchaseExtra();
                C8765d c8765dM148380i = null;
                if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                    c8765dM148380i = purchaseExtra.m148380i(c8765dM54027j);
                }
                C8765d c8765d = c8765dM148380i;
                m54043z(m54025h(c8765d == null ? c8765dM54027j : c8765d, m54030m()));
                m54006D(agreementState);
                m54007E(arrayList);
                AbstractC8776a.m53999C(this, c8765dM54027j, c8765d, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m139828X(int quantity) throws Exception {
        C8765d c8765dM139830Z = m139830Z(quantity);
        if (c8765dM139830Z != null) {
            m139825g0(this, c8765dM139830Z, true, false, 4, null);
        }
        return NullChecker.m81303a(c8765dM139830Z);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m139829Y(int quantity) throws Exception {
        C8765d c8765dM139831a0 = m139831a0(quantity);
        if (c8765dM139831a0 != null) {
            m139825g0(this, c8765dM139831a0, true, false, 4, null);
        }
        return NullChecker.m81303a(c8765dM139831a0);
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final C8765d m139830Z(final int quantity) {
        return (C8765d) vwb.m200346r(m54015M(), new w9j() { // from class: l.i5b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j5b0.m139823T(quantity, (C8765d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public final C8765d m139831a0(final int quantity) {
        return (C8765d) vwb.m200346r(m54015M(), new w9j() { // from class: l.h5b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j5b0.m139824U(quantity, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final void m139832b0() throws Exception {
        l3b0 purchaseExtra;
        if (m54042y()) {
            PayMethod payMethodM54030m = m54030m();
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<C8765d> listM54026i = m54026i();
            mo54022e(listM54026i, payMethodM54030m, currentAgreementState);
            C8765d c8765dM54027j = m54027j(listM54026i);
            l3b0 purchaseExtra2 = getPurchaseExtra();
            C8765d c8765dM148380i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && c8765dM54027j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                c8765dM148380i = purchaseExtra.m148380i(c8765dM54027j);
            }
            if (c8765dM54027j != null) {
                PayMethod payMethodM54025h = m54025h(c8765dM148380i == null ? c8765dM54027j : c8765dM148380i, payMethodM54030m);
                if (payMethodM54025h != null) {
                    payMethodM54030m = payMethodM54025h;
                }
            }
            m54043z(payMethodM54030m);
            m54006D(currentAgreementState);
            m54007E(listM54026i);
            if (c8765dM54027j != null) {
                AbstractC8776a.m53999C(this, c8765dM54027j, c8765dM148380i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m139833c0(C8765d section, C8765d sectionExtra, boolean scroll, boolean isClick) throws Exception {
        PayMethod payMethodM54030m = m54030m();
        PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
        m54043z(m54025h(sectionExtra == null ? section : sectionExtra, payMethodM54030m));
        m54006D(currentAgreementState);
        m54005B(section, sectionExtra, scroll, isClick);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m139834d0(C8765d section, C8765d sectionExtra, boolean scroll) throws Exception {
        PayMethod payMethodM54030m = m54030m();
        PurchaseAgreementState purchaseAgreementStateMo54037t = mo54037t();
        List<C8765d> listM54015M = m54015M();
        mo54022e(listM54015M, payMethodM54030m, purchaseAgreementStateMo54037t);
        Iterator<C8765d> it = listM54015M.iterator();
        while (it.hasNext()) {
            section.m53540v(Intrinsics.m87488d(section, it.next()));
        }
        m54043z(m54025h(sectionExtra == null ? section : sectionExtra, payMethodM54030m));
        m54006D(purchaseAgreementStateMo54037t);
        AbstractC8776a.m53999C(this, section, sectionExtra, scroll, false, 8, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m139835e0(@NotNull PayMethod payMethod) throws Exception {
        l3b0 purchaseExtra;
        payMethod.getClass();
        if (m54042y()) {
            PurchaseAgreementState currentAgreementState = getCurrentAgreementState();
            List<C8765d> listM54026i = m54026i();
            mo54022e(listM54026i, payMethod, currentAgreementState);
            C8765d c8765dM54027j = m54027j(listM54026i);
            l3b0 purchaseExtra2 = getPurchaseExtra();
            C8765d c8765dM148380i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && c8765dM54027j != null && (purchaseExtra = getPurchaseExtra()) != null) {
                c8765dM148380i = purchaseExtra.m148380i(c8765dM54027j);
            }
            if (c8765dM54027j != null) {
                PayMethod payMethodM54025h = m54025h(c8765dM148380i == null ? c8765dM54027j : c8765dM148380i, payMethod);
                if (payMethodM54025h != null) {
                    payMethod = payMethodM54025h;
                }
            }
            m54043z(payMethod);
            m54006D(currentAgreementState);
            m54007E(listM54026i);
            if (c8765dM54027j != null) {
                AbstractC8776a.m53999C(this, c8765dM54027j, c8765dM148380i, false, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m139836f0(@NotNull C8765d section, boolean scroll, boolean isClick) throws Exception {
        l3b0 purchaseExtra;
        section.getClass();
        if (m54042y()) {
            l3b0 purchaseExtra2 = getPurchaseExtra();
            C8765d c8765dM148380i = null;
            if (purchaseExtra2 != null && purchaseExtra2.getIsExtraSelected() && (purchaseExtra = getPurchaseExtra()) != null) {
                c8765dM148380i = purchaseExtra.m148380i(section);
            }
            if (m54036s(c8765dM148380i == null ? section : c8765dM148380i)) {
                return;
            }
            if (m54041x()) {
                m139833c0(section, c8765dM148380i, scroll, isClick);
            } else {
                m139834d0(section, c8765dM148380i, scroll);
            }
        }
    }
}
