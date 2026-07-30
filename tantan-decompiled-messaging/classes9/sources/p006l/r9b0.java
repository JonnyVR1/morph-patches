package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import l.e30;
import l.p2b0;
import l.rxa0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\nJ%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Ll/r9b0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "Ll/o5;", "filterChains", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "k", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "c", "getFilterChains", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r9b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> purchaseSections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC1073o5> filterChains;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r9b0(PurchaseType purchaseType, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            list2 = vwb.f0(new AbstractC1073o5[]{new xh50(purchaseType, list), new fi0(purchaseType, list), new obq0(purchaseType, list), new ji0(purchaseType, list), new lee0(purchaseType, list), new xi0(purchaseType, list), new sx40(purchaseType, list), new j580(purchaseType, list), new uw40(purchaseType, list)});
            list2.getClass();
        }
        this(purchaseType, list, list2);
    }

    /* JADX INFO: renamed from: a */
    public static void m22719a(d dVar) {
        dVar.v(false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX INFO: renamed from: b */
    public static Boolean m22720b(String str, d dVar) {
        boolean z = false;
        if (!kotlin.text.d.J(str, "-", false, 2, (Object) null)) {
            if (dVar.m()) {
                if (dVar.b().s().weekly()) {
                    if (TextUtils.equals(dVar.b().s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(dVar.b().s().quantity), str) && dVar.b().s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(dVar.b().s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (dVar.d() != null) {
            if (TextUtils.equals(str, "-1w")) {
                if (TextUtils.equals("-" + dVar.d().s().quantity + "w", str) && dVar.d().s().weekly()) {
                    z = true;
                }
            } else {
                if (TextUtils.equals("-" + dVar.d().s().quantity, str) && dVar.d().s().monthType()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m22722d(int i, Ref.BooleanRef booleanRef, d dVar) {
        if (i > 0 && dVar.m() && dVar.b().s().quantity == i && dVar.b().s().monthType()) {
            dVar.v(true);
            booleanRef.element = true;
        } else if (i >= 0 || !NullChecker.a(dVar.d()) || dVar.d().s().quantity != i * (-1) || !dVar.d().s().monthType()) {
            dVar.v(false);
        } else {
            dVar.v(true);
            booleanRef.element = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m22723e(d dVar) {
        dVar.v(false);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m22725g(d dVar) {
        return Boolean.valueOf(NullChecker.a(dVar.b()) && dVar.m() && dVar.b().s().quarterly() && (rxa0.w(dVar.b().s()) || rxa0.v("svip", dVar.b().s())));
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m22726h(d dVar) {
        return Boolean.valueOf(dVar.l());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: i */
    public static Boolean m22727i(String str, d dVar) {
        str.getClass();
        boolean z = false;
        if (!kotlin.text.d.J(str, "-", false, 2, (Object) null)) {
            if (dVar.m()) {
                if (dVar.b().s().weekly()) {
                    if (TextUtils.equals(dVar.b().s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(dVar.b().s().quantity), str) && dVar.b().s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(dVar.b().s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (dVar.d() != null) {
            if (TextUtils.equals("-" + dVar.d().s().quantity + "w", str) && dVar.d().s().weekly()) {
                z = true;
            } else {
                if (TextUtils.equals("-" + dVar.d().s().quantity, str) && dVar.d().s().monthType()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: l */
    public static final void m22728l(d dVar, d dVar2) {
        dVar2.v(Intrinsics.d(dVar2, dVar));
    }

    /* JADX INFO: renamed from: m */
    public static final void m22729m(d dVar, d dVar2) {
        dVar2.v(Intrinsics.d(dVar2, dVar));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<d> m22730j(@Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        ArrayList arrayList = new ArrayList();
        if (vwb.J(this.purchaseSections)) {
            return arrayList;
        }
        for (d dVar : this.purchaseSections) {
            Iterator<AbstractC1073o5> it = this.filterChains.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(dVar);
                    break;
                }
            } while (!it.next().mo14551a(dVar, agreementState, currentPayMethod));
        }
        m22731k(this.purchaseType, this.purchaseSections, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: k */
    public final void m22731k(PurchaseType type, List<? extends d> previousSections, List<? extends d> filteredSections) {
        final String strValueOf;
        final d dVar;
        List<? extends d> list = filteredSections;
        if (vwb.J(list)) {
            return;
        }
        List<? extends d> list2 = previousSections;
        d dVar2 = (d) vwb.r(list2, new w9j() { // from class: l.i9b0
            public final Object call(Object obj) {
                return r9b0.m22726h((d) obj);
            }
        });
        vwb.z(list2, new e30() { // from class: l.j9b0
            public final void call(Object obj) {
                r9b0.m22723e((d) obj);
            }
        });
        if (dVar2 == null) {
            strValueOf = "";
        } else {
            if (dVar2.m()) {
                if (dVar2.b().s().weekly()) {
                    strValueOf = dVar2.b().s().quantity + "w";
                } else {
                    strValueOf = String.valueOf(dVar2.b().s().quantity);
                }
            } else if (dVar2.d().s().weekly()) {
                strValueOf = "-1w";
            } else {
                strValueOf = "-" + dVar2.d().s().quantity;
            }
            if (strValueOf == null) {
                strValueOf = "";
            }
        }
        if (!TextUtils.isEmpty(strValueOf) && (dVar = (d) vwb.r(list, new w9j() { // from class: l.k9b0
            public final Object call(Object obj) {
                return r9b0.m22720b(strValueOf, (d) obj);
            }
        })) != null) {
            vwb.z(list, new e30() { // from class: l.l9b0
                public final void call(Object obj) {
                    r9b0.m22728l(dVar, (d) obj);
                }
            });
            return;
        }
        final String strM = p2b0.h().m(type.productCategory());
        final d dVar3 = (d) vwb.r(list, new w9j() { // from class: l.m9b0
            public final Object call(Object obj) {
                return r9b0.m22727i(strM, (d) obj);
            }
        });
        if (dVar3 != null) {
            vwb.z(list, new e30() { // from class: l.n9b0
                public final void call(Object obj) {
                    r9b0.m22729m(dVar3, (d) obj);
                }
            });
            return;
        }
        if (m22732n(filteredSections, 6) || m22732n(filteredSections, 3)) {
            return;
        }
        if ((vwb.m(this.purchaseSections, new w9j() { // from class: l.o9b0
            public final Object call(Object obj) {
                return r9b0.m22725g((d) obj);
            }
        }) && m22732n(filteredSections, -3)) || m22732n(filteredSections, -6) || m22732n(filteredSections, -3)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.p9b0
            public final void call(Object obj) {
                r9b0.m22719a((d) obj);
            }
        });
        filteredSections.get(0).v(true);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m22732n(List<? extends d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        vwb.z(filteredSections, new e30() { // from class: l.q9b0
            public final void call(Object obj) {
                r9b0.m22722d(expectQuantity, booleanRef, (d) obj);
            }
        });
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public r9b0(@NotNull PurchaseType purchaseType, @NotNull List<? extends d> list, @NotNull List<? extends AbstractC1073o5> list2) {
        purchaseType.getClass();
        list.getClass();
        list2.getClass();
        this.purchaseType = purchaseType;
        this.purchaseSections = list;
        this.filterChains = list2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public r9b0(@NotNull PurchaseType purchaseType, @NotNull List<? extends d> list) {
        this(purchaseType, list, null, 4, null);
        purchaseType.getClass();
        list.getClass();
    }
}
