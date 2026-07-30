package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPurchasePageContentNewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l.e30;
import l.eb2;
import l.g30;
import l.m6c0;
import l.u9p;
import l.vwb;
import l.x5b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b#\u0010\"J\u001d\u0010&\u001a\u00020\u001e2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u00020\u001e2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\u001e2\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010(¢\u0006\u0004\b-\u0010+J\u0015\u0010/\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u0016¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b7\u00100J\u0015\u00109\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001e¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\b=\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR*\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010XR\u0016\u0010\\\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010IR\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010_¨\u0006`"}, d2 = {"Ll/y6p;", "Ll/eb2;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "", "from", "Ll/x5b0;", "purchasePageTrack", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ll/x5b0;)V", "", "getCount", "()I", "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "setPrimaryItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "o", "Ll/e30;", "dialogStateAction", "w", "(Ll/e30;)V", "Ll/g30;", "onPaymentSuccess", "z", "(Ll/g30;)V", "failed", "y", "initSelectTabIndex", "x", "(I)V", "duration", "v", "(Ljava/lang/String;)V", "autoPay", "u", "(Z)V", "r", "purchaseType", "q", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "t", "()V", "s", "e", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "f", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "g", "getPrivileges", "h", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "i", "Ll/x5b0;", "getPurchasePageTrack", "()Ll/x5b0;", "", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageContentNewView;", "j", "[Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageContentNewView;", "pageContentViews", "k", "Ll/e30;", "l", "Ll/g30;", "onPaymentFailedAction", "n", "I", "initSelectTebIndex", "latestPosition", "defaultSkuDuration", "Z", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y6p extends eb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final List<Privilege> privileges;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final x5b0 purchasePageTrack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final IntlPurchasePageContentNewView[] pageContentViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int initSelectTebIndex;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int latestPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean autoPay;

    public y6p(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str, @NotNull x5b0 x5b0Var) {
        act.getClass();
        list.getClass();
        x5b0Var.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.privileges = list2;
        this.from = str;
        this.purchasePageTrack = x5b0Var;
        this.pageContentViews = new IntlPurchasePageContentNewView[list.size()];
        this.latestPosition = -1;
    }

    public int getCount() {
        return this.purchaseTypes.size();
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        view.getClass();
        object.getClass();
        return view == object;
    }

    /* JADX INFO: renamed from: m */
    public void m26400m(@Nullable Object object) {
        IntlPurchasePageContentNewView intlPurchasePageContentNewView = object instanceof IntlPurchasePageContentNewView ? (IntlPurchasePageContentNewView) object : null;
        if (intlPurchasePageContentNewView != null) {
            intlPurchasePageContentNewView.m4477f0();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m26401o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        container.removeView((View) object);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object m26402p(@NotNull ViewGroup container, int position) {
        Privilege privilege;
        Privilege privilege2;
        boolean z;
        boolean z2;
        container.getClass();
        boolean z3 = false;
        View viewInflate = this.act.getLayoutInflater().inflate(m6c0.M, container, false);
        viewInflate.getClass();
        IntlPurchasePageContentNewView intlPurchasePageContentNewView = (IntlPurchasePageContentNewView) viewInflate;
        this.pageContentViews[position] = intlPurchasePageContentNewView;
        PurchaseType purchaseType = this.purchaseTypes.get(position);
        List<Privilege> list = this.privileges;
        if (list == null || position >= list.size()) {
            ArrayList privilegeData = purchaseType.getPrivilegeData((Gender) null);
            if (vwb.J(privilegeData)) {
                privilege = null;
            } else {
                privilege2 = (Privilege) privilegeData.get(0);
            }
            Act act = this.act;
            PurchaseType purchaseType2 = this.purchaseTypes.get(position);
            String str = this.from;
            if (this.purchaseTypes.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            intlPurchasePageContentNewView.m4475d0(act, purchaseType2, privilege, str, z);
            intlPurchasePageContentNewView.setDialogStateAction(this.dialogStateAction);
            intlPurchasePageContentNewView.setOnPaymentSuccess(this.onPaymentSuccess);
            intlPurchasePageContentNewView.setOnPaymentFailed(this.onPaymentFailedAction);
            if (this.initSelectTebIndex == position) {
                z2 = true;
            } else {
                z2 = false;
            }
            intlPurchasePageContentNewView.setInitSelectTab(z2);
            intlPurchasePageContentNewView.setPurchasePageTrack(this.purchasePageTrack);
            intlPurchasePageContentNewView.setDefaultSkuDuration(this.defaultSkuDuration);
            if (this.autoPay && this.initSelectTebIndex == position) {
                z3 = true;
            }
            intlPurchasePageContentNewView.setAutoPay(z3);
            container.addView(intlPurchasePageContentNewView);
            return intlPurchasePageContentNewView;
        }
        privilege2 = this.privileges.get(position);
        privilege = privilege2;
        Act act2 = this.act;
        PurchaseType purchaseType3 = this.purchaseTypes.get(position);
        String str2 = this.from;
        if (this.purchaseTypes.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        intlPurchasePageContentNewView.m4475d0(act2, purchaseType3, privilege, str2, z);
        intlPurchasePageContentNewView.setDialogStateAction(this.dialogStateAction);
        intlPurchasePageContentNewView.setOnPaymentSuccess(this.onPaymentSuccess);
        intlPurchasePageContentNewView.setOnPaymentFailed(this.onPaymentFailedAction);
        if (this.initSelectTebIndex == position) {
            z2 = true;
        } else {
            z2 = false;
        }
        intlPurchasePageContentNewView.setInitSelectTab(z2);
        intlPurchasePageContentNewView.setPurchasePageTrack(this.purchasePageTrack);
        intlPurchasePageContentNewView.setDefaultSkuDuration(this.defaultSkuDuration);
        if (this.autoPay) {
            z3 = true;
        }
        intlPurchasePageContentNewView.setAutoPay(z3);
        container.addView(intlPurchasePageContentNewView);
        return intlPurchasePageContentNewView;
    }

    /* JADX INFO: renamed from: q */
    public final void m26403q(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        x5b0 x5b0Var = this.purchasePageTrack;
        ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        x5b0Var.v(productCategory);
        IntlPurchasePageContentNewView[] intlPurchasePageContentNewViewArr = this.pageContentViews;
        int length = intlPurchasePageContentNewViewArr.length;
        for (int i = 0; i < length; i++) {
            IntlPurchasePageContentNewView intlPurchasePageContentNewView = intlPurchasePageContentNewViewArr[i];
            if ((intlPurchasePageContentNewView != null ? intlPurchasePageContentNewView.getPurchaseType() : null) == purchaseType) {
                if (intlPurchasePageContentNewView != null) {
                    intlPurchasePageContentNewView.m4471Z();
                }
            } else if (intlPurchasePageContentNewView != null) {
                intlPurchasePageContentNewView.m4470Y();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m26404r(int position) {
        IntlPurchasePageContentNewView intlPurchasePageContentNewView = this.pageContentViews[position];
        if (intlPurchasePageContentNewView != null) {
            intlPurchasePageContentNewView.m4470Y();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m26405s(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        x5b0 x5b0Var = this.purchasePageTrack;
        ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        x5b0Var.v(productCategory);
        IntlPurchasePageContentNewView[] intlPurchasePageContentNewViewArr = this.pageContentViews;
        int length = intlPurchasePageContentNewViewArr.length;
        for (int i = 0; i < length; i++) {
            IntlPurchasePageContentNewView intlPurchasePageContentNewView = intlPurchasePageContentNewViewArr[i];
            if ((intlPurchasePageContentNewView != null ? intlPurchasePageContentNewView.getPurchaseType() : null) == purchaseType) {
                u9p.INSTANCE.y(true);
                if (intlPurchasePageContentNewView != null) {
                    intlPurchasePageContentNewView.m4474c0();
                }
            }
        }
    }

    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        if (this.latestPosition != position) {
            this.latestPosition = position;
            IntlPurchasePageContentNewView intlPurchasePageContentNewView = object instanceof IntlPurchasePageContentNewView ? (IntlPurchasePageContentNewView) object : null;
            if (intlPurchasePageContentNewView == null || intlPurchasePageContentNewView.getPurchaseType() != this.purchaseTypes.get(this.initSelectTebIndex)) {
                return;
            }
            intlPurchasePageContentNewView.m4471Z();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m26406t() {
        for (IntlPurchasePageContentNewView intlPurchasePageContentNewView : this.pageContentViews) {
            if (intlPurchasePageContentNewView != null) {
                intlPurchasePageContentNewView.m4476e0();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m26407u(boolean autoPay) {
        this.autoPay = autoPay;
    }

    /* JADX INFO: renamed from: v */
    public final void m26408v(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    /* JADX INFO: renamed from: w */
    public final void m26409w(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: x */
    public final void m26410x(int initSelectTabIndex) {
        this.initSelectTebIndex = initSelectTabIndex;
    }

    /* JADX INFO: renamed from: y */
    public final void m26411y(@Nullable g30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    /* JADX INFO: renamed from: z */
    public final void m26412z(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }
}
