package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\nJ%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, m87232d2 = {"Ll/r9b0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "Ll/o5;", "filterChains", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "k", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "c", "getFilterChains", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r9b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8765d> purchaseSections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC18843o5> filterChains;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r9b0(PurchaseType purchaseType, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            list2 = vwb.m200324f0(new xh50(purchaseType, list), new fi0(purchaseType, list), new obq0(purchaseType, list), new ji0(purchaseType, list), new lee0(purchaseType, list), new xi0(purchaseType, list), new sx40(purchaseType, list), new j580(purchaseType, list), new uw40(purchaseType, list));
            list2.getClass();
        }
        this(purchaseType, list, list2);
    }

    /* JADX INFO: renamed from: a */
    public static void m178300a(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX INFO: renamed from: b */
    public static Boolean m178301b(String str, C8765d c8765d) {
        boolean z = false;
        if (!C15386d.m93483J(str, "-", false, 2, null)) {
            if (c8765d.m53531m()) {
                if (c8765d.m53520b().m53601s().weekly()) {
                    if (TextUtils.equals(c8765d.m53520b().m53601s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(c8765d.m53520b().m53601s().quantity), str) && c8765d.m53520b().m53601s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(c8765d.m53520b().m53601s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (c8765d.m53522d() != null) {
            if (TextUtils.equals(str, "-1w")) {
                if (TextUtils.equals("-" + c8765d.m53522d().m53601s().quantity + "w", str) && c8765d.m53522d().m53601s().weekly()) {
                    z = true;
                }
            } else {
                if (TextUtils.equals("-" + c8765d.m53522d().m53601s().quantity, str) && c8765d.m53522d().m53601s().monthType()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m178303d(int i, Ref.BooleanRef booleanRef, C8765d c8765d) {
        if (i > 0 && c8765d.m53531m() && c8765d.m53520b().m53601s().quantity == i && c8765d.m53520b().m53601s().monthType()) {
            c8765d.m53540v(true);
            booleanRef.element = true;
        } else if (i >= 0 || !NullChecker.m81303a(c8765d.m53522d()) || c8765d.m53522d().m53601s().quantity != i * (-1) || !c8765d.m53522d().m53601s().monthType()) {
            c8765d.m53540v(false);
        } else {
            c8765d.m53540v(true);
            booleanRef.element = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m178304e(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m178306g(C8765d c8765d) {
        return Boolean.valueOf(NullChecker.m81303a(c8765d.m53520b()) && c8765d.m53531m() && c8765d.m53520b().m53601s().quarterly() && (rxa0.m181502w(c8765d.m53520b().m53601s()) || rxa0.m181501v("svip", c8765d.m53520b().m53601s())));
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m178307h(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53530l());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: i */
    public static Boolean m178308i(String str, C8765d c8765d) {
        str.getClass();
        boolean z = false;
        if (!C15386d.m93483J(str, "-", false, 2, null)) {
            if (c8765d.m53531m()) {
                if (c8765d.m53520b().m53601s().weekly()) {
                    if (TextUtils.equals(c8765d.m53520b().m53601s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(c8765d.m53520b().m53601s().quantity), str) && c8765d.m53520b().m53601s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(c8765d.m53520b().m53601s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (c8765d.m53522d() != null) {
            if (TextUtils.equals("-" + c8765d.m53522d().m53601s().quantity + "w", str) && c8765d.m53522d().m53601s().weekly()) {
                z = true;
            } else {
                if (TextUtils.equals("-" + c8765d.m53522d().m53601s().quantity, str) && c8765d.m53522d().m53601s().monthType()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: l */
    public static final void m178309l(C8765d c8765d, C8765d c8765d2) {
        c8765d2.m53540v(Intrinsics.m87488d(c8765d2, c8765d));
    }

    /* JADX INFO: renamed from: m */
    public static final void m178310m(C8765d c8765d, C8765d c8765d2) {
        c8765d2.m53540v(Intrinsics.m87488d(c8765d2, c8765d));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<C8765d> m178311j(@Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(this.purchaseSections)) {
            return arrayList;
        }
        for (C8765d c8765d : this.purchaseSections) {
            Iterator<AbstractC18843o5> it = this.filterChains.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(c8765d);
                    break;
                }
            } while (!it.next().mo116616a(c8765d, agreementState, currentPayMethod));
        }
        m178312k(this.purchaseType, this.purchaseSections, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: k */
    public final void m178312k(PurchaseType type, List<? extends C8765d> previousSections, List<? extends C8765d> filteredSections) {
        final String strValueOf;
        final C8765d c8765d;
        List<? extends C8765d> list = filteredSections;
        if (vwb.m200296J(list)) {
            return;
        }
        List<? extends C8765d> list2 = previousSections;
        C8765d c8765d2 = (C8765d) vwb.m200346r(list2, new w9j() { // from class: l.i9b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r9b0.m178307h((C8765d) obj);
            }
        });
        vwb.m200354z(list2, new e30() { // from class: l.j9b0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9b0.m178304e((C8765d) obj);
            }
        });
        if (c8765d2 == null) {
            strValueOf = "";
        } else {
            if (c8765d2.m53531m()) {
                if (c8765d2.m53520b().m53601s().weekly()) {
                    strValueOf = c8765d2.m53520b().m53601s().quantity + "w";
                } else {
                    strValueOf = String.valueOf(c8765d2.m53520b().m53601s().quantity);
                }
            } else if (c8765d2.m53522d().m53601s().weekly()) {
                strValueOf = "-1w";
            } else {
                strValueOf = "-" + c8765d2.m53522d().m53601s().quantity;
            }
            if (strValueOf == null) {
                strValueOf = "";
            }
        }
        if (!TextUtils.isEmpty(strValueOf) && (c8765d = (C8765d) vwb.m200346r(list, new w9j() { // from class: l.k9b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r9b0.m178301b(strValueOf, (C8765d) obj);
            }
        })) != null) {
            vwb.m200354z(list, new e30() { // from class: l.l9b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    r9b0.m178309l(c8765d, (C8765d) obj);
                }
            });
            return;
        }
        final String strM167144m = p2b0.m167133h().m167144m(type.productCategory());
        final C8765d c8765d3 = (C8765d) vwb.m200346r(list, new w9j() { // from class: l.m9b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r9b0.m178308i(strM167144m, (C8765d) obj);
            }
        });
        if (c8765d3 != null) {
            vwb.m200354z(list, new e30() { // from class: l.n9b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    r9b0.m178310m(c8765d3, (C8765d) obj);
                }
            });
            return;
        }
        if (m178313n(filteredSections, 6) || m178313n(filteredSections, 3)) {
            return;
        }
        if ((vwb.m200337m(this.purchaseSections, new w9j() { // from class: l.o9b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r9b0.m178306g((C8765d) obj);
            }
        }) && m178313n(filteredSections, -3)) || m178313n(filteredSections, -6) || m178313n(filteredSections, -3)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.p9b0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9b0.m178300a((C8765d) obj);
            }
        });
        filteredSections.get(0).m53540v(true);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m178313n(List<? extends C8765d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        vwb.m200354z(filteredSections, new e30() { // from class: l.q9b0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9b0.m178303d(expectQuantity, booleanRef, (C8765d) obj);
            }
        });
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public r9b0(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8765d> list, @NotNull List<? extends AbstractC18843o5> list2) {
        purchaseType.getClass();
        list.getClass();
        list2.getClass();
        this.purchaseType = purchaseType;
        this.purchaseSections = list;
        this.filterChains = list2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public r9b0(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8765d> list) {
        this(purchaseType, list, null, 4, null);
        purchaseType.getClass();
        list.getClass();
    }
}
