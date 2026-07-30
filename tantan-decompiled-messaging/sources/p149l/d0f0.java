package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/d0f0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m", "(Ljava/util/List;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "j", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "", "Ll/d3m;", "b", "Ljava/util/List;", "newFilters", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m109482a(int i, Ref.BooleanRef booleanRef, C8765d c8765d) {
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

    /* JADX INFO: renamed from: b */
    public static void m109483b(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: c */
    public static Boolean m109484c(String str, C8765d c8765d) {
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

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX INFO: renamed from: d */
    public static Boolean m109485d(String str, C8765d c8765d) {
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

    /* JADX INFO: renamed from: g */
    public static Boolean m109488g(C8765d c8765d) {
        return Boolean.valueOf(NullChecker.m81303a(c8765d.m53520b()) && c8765d.m53531m() && c8765d.m53520b().m53601s().quarterly() && (rxa0.m181502w(c8765d.m53520b().m53601s()) || rxa0.m181501v("svip", c8765d.m53520b().m53601s())));
    }

    /* JADX INFO: renamed from: h */
    public static void m109489h(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m109490i(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53530l());
    }

    /* JADX INFO: renamed from: k */
    public static final void m109491k(C8765d c8765d, C8765d c8765d2) {
        c8765d2.m53540v(Intrinsics.m87488d(c8765d2, c8765d));
    }

    /* JADX INFO: renamed from: l */
    public static final void m109492l(C8765d c8765d, C8765d c8765d2) {
        c8765d2.m53540v(Intrinsics.m87488d(c8765d2, c8765d));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: j */
    public final void m109493j(PurchaseType type, List<? extends C8765d> previousSections, List<? extends C8765d> filteredSections) {
        final String strValueOf;
        final C8765d c8765d;
        List<? extends C8765d> list = filteredSections;
        if (vwb.m200296J(list)) {
            return;
        }
        List<? extends C8765d> list2 = previousSections;
        C8765d c8765d2 = (C8765d) vwb.m200346r(list2, new w9j() { // from class: l.uze0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d0f0.m109490i((C8765d) obj);
            }
        });
        vwb.m200354z(list2, new e30() { // from class: l.vze0
            @Override // p149l.e30
            public final void call(Object obj) {
                d0f0.m109483b((C8765d) obj);
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
        if (!TextUtils.isEmpty(strValueOf) && (c8765d = (C8765d) vwb.m200346r(list, new w9j() { // from class: l.wze0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d0f0.m109485d(strValueOf, (C8765d) obj);
            }
        })) != null) {
            vwb.m200354z(list, new e30() { // from class: l.xze0
                @Override // p149l.e30
                public final void call(Object obj) {
                    d0f0.m109491k(c8765d, (C8765d) obj);
                }
            });
            return;
        }
        final String strM167144m = p2b0.m167133h().m167144m(type.productCategory());
        final C8765d c8765d3 = (C8765d) vwb.m200346r(list, new w9j() { // from class: l.yze0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d0f0.m109484c(strM167144m, (C8765d) obj);
            }
        });
        if (c8765d3 != null) {
            vwb.m200354z(list, new e30() { // from class: l.zze0
                @Override // p149l.e30
                public final void call(Object obj) {
                    d0f0.m109492l(c8765d3, (C8765d) obj);
                }
            });
            return;
        }
        if (m109495n(filteredSections, 6) || m109495n(filteredSections, 3)) {
            return;
        }
        if ((vwb.m200337m(list, new w9j() { // from class: l.a0f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d0f0.m109488g((C8765d) obj);
            }
        }) && m109495n(filteredSections, -3)) || m109495n(filteredSections, -6) || m109495n(filteredSections, -3)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.b0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                d0f0.m109489h((C8765d) obj);
            }
        });
        filteredSections.get(0).m53540v(true);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<C8765d> m109494m(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(sections)) {
            return arrayList;
        }
        for (d3m d3mVar : this.newFilters) {
            if (d3mVar.handle()) {
                arrayList.addAll(d3mVar.mo109941a(sections));
                break;
            }
        }
        m109493j(this.purchaseType, sections, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m109495n(List<? extends C8765d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        vwb.m200354z(filteredSections, new e30() { // from class: l.c0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                d0f0.m109482a(expectQuantity, booleanRef, (C8765d) obj);
            }
        });
        return booleanRef.element;
    }
}
