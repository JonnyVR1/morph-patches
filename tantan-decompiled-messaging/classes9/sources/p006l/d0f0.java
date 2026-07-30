package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ll/d0f0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m", "(Ljava/util/List;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "j", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "", "Ll/d3m;", "b", "Ljava/util/List;", "newFilters", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d3m> newFilters;

    public d0f0(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        ArrayList arrayList = new ArrayList();
        this.newFilters = arrayList;
        arrayList.add(new f0f0(purchaseType, str));
        arrayList.add(new e0f0(purchaseType, str));
    }

    /* JADX INFO: renamed from: a */
    public static void m13724a(int i, Ref.BooleanRef booleanRef, d dVar) {
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

    /* JADX INFO: renamed from: b */
    public static void m13725b(d dVar) {
        dVar.v(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: c */
    public static Boolean m13726c(String str, d dVar) {
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

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX INFO: renamed from: d */
    public static Boolean m13727d(String str, d dVar) {
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

    /* JADX INFO: renamed from: g */
    public static Boolean m13730g(d dVar) {
        return Boolean.valueOf(NullChecker.a(dVar.b()) && dVar.m() && dVar.b().s().quarterly() && (rxa0.w(dVar.b().s()) || rxa0.v("svip", dVar.b().s())));
    }

    /* JADX INFO: renamed from: h */
    public static void m13731h(d dVar) {
        dVar.v(false);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m13732i(d dVar) {
        return Boolean.valueOf(dVar.l());
    }

    /* JADX INFO: renamed from: k */
    public static final void m13733k(d dVar, d dVar2) {
        dVar2.v(Intrinsics.d(dVar2, dVar));
    }

    /* JADX INFO: renamed from: l */
    public static final void m13734l(d dVar, d dVar2) {
        dVar2.v(Intrinsics.d(dVar2, dVar));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: j */
    public final void m13735j(PurchaseType type, List<? extends d> previousSections, List<? extends d> filteredSections) {
        final String strValueOf;
        final d dVar;
        List<? extends d> list = filteredSections;
        if (vwb.J(list)) {
            return;
        }
        List<? extends d> list2 = previousSections;
        d dVar2 = (d) vwb.r(list2, new w9j() { // from class: l.uze0
            public final Object call(Object obj) {
                return d0f0.m13732i((d) obj);
            }
        });
        vwb.z(list2, new e30() { // from class: l.vze0
            public final void call(Object obj) {
                d0f0.m13725b((d) obj);
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
        if (!TextUtils.isEmpty(strValueOf) && (dVar = (d) vwb.r(list, new w9j() { // from class: l.wze0
            public final Object call(Object obj) {
                return d0f0.m13727d(strValueOf, (d) obj);
            }
        })) != null) {
            vwb.z(list, new e30() { // from class: l.xze0
                public final void call(Object obj) {
                    d0f0.m13733k(dVar, (d) obj);
                }
            });
            return;
        }
        final String strM = p2b0.h().m(type.productCategory());
        final d dVar3 = (d) vwb.r(list, new w9j() { // from class: l.yze0
            public final Object call(Object obj) {
                return d0f0.m13726c(strM, (d) obj);
            }
        });
        if (dVar3 != null) {
            vwb.z(list, new e30() { // from class: l.zze0
                public final void call(Object obj) {
                    d0f0.m13734l(dVar3, (d) obj);
                }
            });
            return;
        }
        if (m13737n(filteredSections, 6) || m13737n(filteredSections, 3)) {
            return;
        }
        if ((vwb.m(list, new w9j() { // from class: l.a0f0
            public final Object call(Object obj) {
                return d0f0.m13730g((d) obj);
            }
        }) && m13737n(filteredSections, -3)) || m13737n(filteredSections, -6) || m13737n(filteredSections, -3)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.b0f0
            public final void call(Object obj) {
                d0f0.m13731h((d) obj);
            }
        });
        filteredSections.get(0).v(true);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<d> m13736m(@NotNull List<? extends d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (vwb.J(sections)) {
            return arrayList;
        }
        for (d3m d3mVar : this.newFilters) {
            if (d3mVar.handle()) {
                arrayList.addAll(d3mVar.mo13771a(sections));
                break;
            }
        }
        m13735j(this.purchaseType, sections, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13737n(List<? extends d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        vwb.z(filteredSections, new e30() { // from class: l.c0f0
            public final void call(Object obj) {
                d0f0.m13724a(expectQuantity, booleanRef, (d) obj);
            }
        });
        return booleanRef.element;
    }
}
