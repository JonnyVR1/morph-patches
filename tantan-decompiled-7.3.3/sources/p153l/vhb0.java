package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\nJ%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, m88121d2 = {"Ll/vhb0;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "Ll/m5;", "filterChains", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Ljava/util/List;", "type", "previousSections", "filteredSections", "", "k", "", "expectQuantity", "", "n", "(Ljava/util/List;I)Z", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "c", "getFilterChains", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vhb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> purchaseSections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC18548m5> filterChains;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vhb0(PurchaseType purchaseType, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            list2 = jyb.m147507f0(new dq50(purchaseType, list), new bi0(purchaseType, list), new tkq0(purchaseType, list), new fi0(purchaseType, list), new qme0(purchaseType, list), new ti0(purchaseType, list), new h650(purchaseType, list), new pd80(purchaseType, list), new j550(purchaseType, list));
            list2.getClass();
        }
        this(purchaseType, list, list2);
    }

    /* JADX INFO: renamed from: a */
    public static void m201264a(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX INFO: renamed from: b */
    public static Boolean m201265b(String str, C8928d c8928d) {
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

    /* JADX INFO: renamed from: d */
    public static void m201267d(int i, Ref.BooleanRef booleanRef, C8928d c8928d) {
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

    /* JADX INFO: renamed from: e */
    public static void m201268e(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m201270g(C8928d c8928d) {
        return Boolean.valueOf(NullChecker.m82486a(c8928d.m54703b()) && c8928d.m54714m() && c8928d.m54703b().m54784s().quarterly() && (v5b0.m199797w(c8928d.m54703b().m54784s()) || v5b0.m199796v("svip", c8928d.m54703b().m54784s())));
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m201271h(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54713l());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX INFO: renamed from: i */
    public static Boolean m201272i(String str, C8928d c8928d) {
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

    /* JADX INFO: renamed from: l */
    public static final void m201273l(C8928d c8928d, C8928d c8928d2) {
        c8928d2.m54723v(Intrinsics.m88377d(c8928d2, c8928d));
    }

    /* JADX INFO: renamed from: m */
    public static final void m201274m(C8928d c8928d, C8928d c8928d2) {
        c8928d2.m54723v(Intrinsics.m88377d(c8928d2, c8928d));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<C8928d> m201275j(@Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(this.purchaseSections)) {
            return arrayList;
        }
        for (C8928d c8928d : this.purchaseSections) {
            Iterator<AbstractC18548m5> it = this.filterChains.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(c8928d);
                    break;
                }
            } while (!it.next().mo97946a(c8928d, agreementState, currentPayMethod));
        }
        m201276k(this.purchaseType, this.purchaseSections, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: k */
    public final void m201276k(PurchaseType type, List<? extends C8928d> previousSections, List<? extends C8928d> filteredSections) {
        final String strValueOf;
        final C8928d c8928d;
        List<? extends C8928d> list = filteredSections;
        if (jyb.m147479J(list)) {
            return;
        }
        List<? extends C8928d> list2 = previousSections;
        C8928d c8928d2 = (C8928d) jyb.m147529r(list2, new qcj() { // from class: l.mhb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vhb0.m201271h((C8928d) obj);
            }
        });
        jyb.m147537z(list2, new y20() { // from class: l.nhb0
            @Override // p153l.y20
            public final void call(Object obj) {
                vhb0.m201268e((C8928d) obj);
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
        if (!TextUtils.isEmpty(strValueOf) && (c8928d = (C8928d) jyb.m147529r(list, new qcj() { // from class: l.ohb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vhb0.m201265b(strValueOf, (C8928d) obj);
            }
        })) != null) {
            jyb.m147537z(list, new y20() { // from class: l.phb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vhb0.m201273l(c8928d, (C8928d) obj);
                }
            });
            return;
        }
        final String strM189822m = tab0.m189811h().m189822m(type.productCategory());
        final C8928d c8928d3 = (C8928d) jyb.m147529r(list, new qcj() { // from class: l.qhb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vhb0.m201272i(strM189822m, (C8928d) obj);
            }
        });
        if (c8928d3 != null) {
            jyb.m147537z(list, new y20() { // from class: l.rhb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vhb0.m201274m(c8928d3, (C8928d) obj);
                }
            });
            return;
        }
        if (m201277n(filteredSections, 6) || m201277n(filteredSections, 3)) {
            return;
        }
        if ((jyb.m147520m(this.purchaseSections, new qcj() { // from class: l.shb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vhb0.m201270g((C8928d) obj);
            }
        }) && m201277n(filteredSections, -3)) || m201277n(filteredSections, -6) || m201277n(filteredSections, -3)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.thb0
            @Override // p153l.y20
            public final void call(Object obj) {
                vhb0.m201264a((C8928d) obj);
            }
        });
        filteredSections.get(0).m54723v(true);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m201277n(List<? extends C8928d> filteredSections, final int expectQuantity) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        jyb.m147537z(filteredSections, new y20() { // from class: l.uhb0
            @Override // p153l.y20
            public final void call(Object obj) {
                vhb0.m201267d(expectQuantity, booleanRef, (C8928d) obj);
            }
        });
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public vhb0(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8928d> list, @NotNull List<? extends AbstractC18548m5> list2) {
        purchaseType.getClass();
        list.getClass();
        list2.getClass();
        this.purchaseType = purchaseType;
        this.purchaseSections = list;
        this.filterChains = list2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public vhb0(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8928d> list) {
        this(purchaseType, list, null, 4, null);
        purchaseType.getClass();
        list.getClass();
    }
}
