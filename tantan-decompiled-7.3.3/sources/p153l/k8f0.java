package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/k8f0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m", "(Ljava/util/List;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "j", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "", "Ll/u5m;", "b", "Ljava/util/List;", "newFilters", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class k8f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<u5m> newFilters;

    public k8f0(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        ArrayList arrayList = new ArrayList();
        this.newFilters = arrayList;
        arrayList.add(new m8f0(purchaseType, str));
        arrayList.add(new l8f0(purchaseType, str));
    }

    /* JADX INFO: renamed from: a */
    public static void m148694a(int i, Ref.BooleanRef booleanRef, C8928d c8928d) {
        if (i > 0 && c8928d.m54714m() && c8928d.m54703b().m54784s().quantity == i && c8928d.m54703b().m54784s().monthType()) {
            c8928d.m54723v(true);
            booleanRef.element = true;
        } else if (i >= 0 || !NullChecker.m82486a(c8928d.m54705d()) || c8928d.m54705d().m54784s().quantity != i * (-1) || !c8928d.m54705d().m54784s().monthType()) {
            c8928d.m54723v(false);
        } else {
            c8928d.m54723v(true);
            booleanRef.element = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m148695b(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: c */
    public static Boolean m148696c(String str, C8928d c8928d) {
        str.getClass();
        boolean z = false;
        if (!C15493d.m94374J(str, "-", false, 2, null)) {
            if (c8928d.m54714m()) {
                if (c8928d.m54703b().m54784s().weekly()) {
                    if (TextUtils.equals(c8928d.m54703b().m54784s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(c8928d.m54703b().m54784s().quantity), str) && c8928d.m54703b().m54784s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(c8928d.m54703b().m54784s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (c8928d.m54705d() != null) {
            if (TextUtils.equals("-" + c8928d.m54705d().m54784s().quantity + "w", str) && c8928d.m54705d().m54784s().weekly()) {
                z = true;
            } else {
                if (TextUtils.equals("-" + c8928d.m54705d().m54784s().quantity, str) && c8928d.m54705d().m54784s().monthType()) {
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
    public static Boolean m148697d(String str, C8928d c8928d) {
        boolean z = false;
        if (!C15493d.m94374J(str, "-", false, 2, null)) {
            if (c8928d.m54714m()) {
                if (c8928d.m54703b().m54784s().weekly()) {
                    if (TextUtils.equals(c8928d.m54703b().m54784s().quantity + "w", str)) {
                        z = true;
                    } else if (TextUtils.equals(String.valueOf(c8928d.m54703b().m54784s().quantity), str) && c8928d.m54703b().m54784s().monthType()) {
                        z = true;
                    }
                } else if (TextUtils.equals(String.valueOf(c8928d.m54703b().m54784s().quantity), str)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (c8928d.m54705d() != null) {
            if (TextUtils.equals(str, "-1w")) {
                if (TextUtils.equals("-" + c8928d.m54705d().m54784s().quantity + "w", str) && c8928d.m54705d().m54784s().weekly()) {
                    z = true;
                }
            } else {
                if (TextUtils.equals("-" + c8928d.m54705d().m54784s().quantity, str) && c8928d.m54705d().m54784s().monthType()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m148700g(C8928d c8928d) {
        return Boolean.valueOf(NullChecker.m82486a(c8928d.m54703b()) && c8928d.m54714m() && c8928d.m54703b().m54784s().quarterly() && (v5b0.m199797w(c8928d.m54703b().m54784s()) || v5b0.m199796v("svip", c8928d.m54703b().m54784s())));
    }

    /* JADX INFO: renamed from: h */
    public static void m148701h(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m148702i(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54713l());
    }

    /* JADX INFO: renamed from: k */
    public static final void m148703k(C8928d c8928d, C8928d c8928d2) {
        c8928d2.m54723v(Intrinsics.m88377d(c8928d2, c8928d));
    }

    /* JADX INFO: renamed from: l */
    public static final void m148704l(C8928d c8928d, C8928d c8928d2) {
        c8928d2.m54723v(Intrinsics.m88377d(c8928d2, c8928d));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: j */
    public final void m148705j(PurchaseType type, List<? extends C8928d> previousSections, List<? extends C8928d> filteredSections) {
        final String strValueOf;
        final C8928d c8928d;
        List<? extends C8928d> list = filteredSections;
        if (jyb.m147479J(list)) {
            return;
        }
        List<? extends C8928d> list2 = previousSections;
        C8928d c8928d2 = (C8928d) jyb.m147529r(list2, new qcj() { // from class: l.b8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k8f0.m148702i((C8928d) obj);
            }
        });
        jyb.m147537z(list2, new y20() { // from class: l.c8f0
            @Override // p153l.y20
            public final void call(Object obj) {
                k8f0.m148695b((C8928d) obj);
            }
        });
        if (c8928d2 == null) {
            strValueOf = "";
        } else {
            if (c8928d2.m54714m()) {
                if (c8928d2.m54703b().m54784s().weekly()) {
                    strValueOf = c8928d2.m54703b().m54784s().quantity + "w";
                } else {
                    strValueOf = String.valueOf(c8928d2.m54703b().m54784s().quantity);
                }
            } else if (c8928d2.m54705d().m54784s().weekly()) {
                strValueOf = "-1w";
            } else {
                strValueOf = "-" + c8928d2.m54705d().m54784s().quantity;
            }
            if (strValueOf == null) {
                strValueOf = "";
            }
        }
        if (!TextUtils.isEmpty(strValueOf) && (c8928d = (C8928d) jyb.m147529r(list, new qcj() { // from class: l.d8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k8f0.m148697d(strValueOf, (C8928d) obj);
            }
        })) != null) {
            jyb.m147537z(list, new y20() { // from class: l.e8f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k8f0.m148703k(c8928d, (C8928d) obj);
                }
            });
            return;
        }
        final String strM189822m = tab0.m189811h().m189822m(type.productCategory());
        final C8928d c8928d3 = (C8928d) jyb.m147529r(list, new qcj() { // from class: l.f8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k8f0.m148696c(strM189822m, (C8928d) obj);
            }
        });
        if (c8928d3 != null) {
            jyb.m147537z(list, new y20() { // from class: l.g8f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k8f0.m148704l(c8928d3, (C8928d) obj);
                }
            });
            return;
        }
        if (m148707n(filteredSections, 6) || m148707n(filteredSections, 3)) {
            return;
        }
        if ((jyb.m147520m(list, new qcj() { // from class: l.h8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k8f0.m148700g((C8928d) obj);
            }
        }) && m148707n(filteredSections, -3)) || m148707n(filteredSections, -6) || m148707n(filteredSections, -3)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.i8f0
            @Override // p153l.y20
            public final void call(Object obj) {
                k8f0.m148701h((C8928d) obj);
            }
        });
        filteredSections.get(0).m54723v(true);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<C8928d> m148706m(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(sections)) {
            return arrayList;
        }
        for (u5m u5mVar : this.newFilters) {
            if (u5mVar.handle()) {
                arrayList.addAll(u5mVar.mo153222a(sections));
                break;
            }
        }
        m148705j(this.purchaseType, sections, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m148707n(List<? extends C8928d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        jyb.m147537z(filteredSections, new y20() { // from class: l.j8f0
            @Override // p153l.y20
            public final void call(Object obj) {
                k8f0.m148694a(expectQuantity, booleanRef, (C8928d) obj);
            }
        });
        return booleanRef.element;
    }
}
