package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.C0213b;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.PurchaseParallelContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.eb2;
import l.g30;
import l.j760;
import l.m6c0;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u00020\u001e2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\u001e2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u001e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b8\u00104J\u0015\u00109\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b9\u00104J\r\u0010:\u001a\u00020\u001e¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR,\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010NR\u0016\u0010R\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010QR\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010Q¨\u0006T"}, d2 = {"Ll/y5b0;", "Ll/eb2;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "Ll/hab0;", "purchasePageTrack", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ll/hab0;)V", "", "getCount", "()I", "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "setPrimaryItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "o", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "w", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;)V", "Ll/g30;", "onPaymentSuccess", "y", "(Ll/g30;)V", "Ll/e30;", "onNegativeClick", "x", "(Ll/e30;)V", "dialogStateAction", "u", "initSelectTabIndex", "v", "(I)V", "_agreement_roots", "t", "(Ljava/util/List;)V", "r", "q", "s", "()V", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Ljava/util/List;", "g", "h", "Ljava/lang/String;", "i", "Ll/hab0;", "", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "j", "[Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "pageContentViews", "", "k", "l", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "Ll/e30;", "n", "Ll/g30;", "I", "initSelectTebIndex", "latestPosition", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y5b0 extends eb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final List<Privilege> firstPrivileges;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final hab0 purchasePageTrack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final PurchaseParallelContentView[] pageContentViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<ViewGroup> _agreement_roots;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public C0213b mediatorsManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int initSelectTebIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int latestPosition;

    public y5b0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str, @NotNull hab0 hab0Var) {
        act.getClass();
        list.getClass();
        hab0Var.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.firstPrivileges = list2;
        this.from = str;
        this.purchasePageTrack = hab0Var;
        this.pageContentViews = new PurchaseParallelContentView[list.size()];
        this._agreement_roots = new ArrayList();
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
    public void m28066m(@Nullable Object object) {
        PurchaseParallelContentView purchaseParallelContentView = object instanceof PurchaseParallelContentView ? (PurchaseParallelContentView) object : null;
        if (purchaseParallelContentView != null) {
            purchaseParallelContentView.m7329y();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m28067o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        container.removeView((View) object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView, java.lang.Object] */
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object m28068p(@NotNull ViewGroup container, int position) {
        Privilege privilege;
        container.getClass();
        Object objInflate = this.act.getLayoutInflater().inflate(m6c0.B1, container, false);
        objInflate.getClass();
        ?? r0 = (PurchaseParallelContentView) objInflate;
        this.pageContentViews[position] = r0;
        PurchaseType purchaseType = this.purchaseTypes.get(position);
        List<Privilege> list = this.firstPrivileges;
        C0213b c0213b = null;
        if (list == null || position >= list.size()) {
            ArrayList privilegeData = purchaseType.getPrivilegeData((Gender) null);
            privilege = !vwb.J(privilegeData) ? (Privilege) privilegeData.get(0) : null;
        } else {
            privilege = this.firstPrivileges.get(position);
        }
        C0213b c0213b2 = this.mediatorsManager;
        if (c0213b2 == null) {
            Intrinsics.r("mediatorsManager");
        } else {
            c0213b = c0213b2;
        }
        j5b0 j5b0VarM7383c = c0213b.m7383c(this.purchaseTypes.get(position));
        if (j5b0VarM7383c != null) {
            j5b0VarM7383c.m7353P(this.purchasePageTrack);
        }
        r0.m7323s(j5b0VarM7383c);
        r0.m7326v(this.act, this.purchaseTypes.get(position), privilege, this.from);
        r0.setOnPaymentSuccess(this.onPaymentSuccess);
        r0.setOnNegativeClick(this.onNegativeClick);
        r0.setDialogStateAction(this.dialogStateAction);
        r0.setAgreementRoot(this._agreement_roots.get(position));
        r0.setInitSelectTab(this.initSelectTebIndex == position);
        r0.setPurchasePageTrack(this.purchasePageTrack);
        container.addView(r0);
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public final void m28069q(int position) {
        PurchaseParallelContentView purchaseParallelContentView = this.pageContentViews[position];
        if (purchaseParallelContentView != null) {
            purchaseParallelContentView.m7324t();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m28070r(int position) {
        hab0 hab0Var = this.purchasePageTrack;
        ProductCategory productCategory = this.purchaseTypes.get(position).productCategory();
        productCategory.getClass();
        hab0Var.m16129v(productCategory);
        PurchaseParallelContentView purchaseParallelContentView = this.pageContentViews[position];
        if (purchaseParallelContentView != null) {
            j5b0 mediator = purchaseParallelContentView.getMediator();
            if (mediator != null && mediator.m7377y()) {
                purchaseParallelContentView.m7319E();
            }
            String strM16584k = iab0.m16584k(this.purchaseTypes.get(position));
            if (!TextUtils.isEmpty(strM16584k)) {
                zvf0.u("e_purchase_tab", "p_purchase_page", new j760[]{vwb.Y("tab_type", strM16584k)});
            }
            purchaseParallelContentView.m7325u();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m28071s() {
        for (PurchaseParallelContentView purchaseParallelContentView : this.pageContentViews) {
            if (purchaseParallelContentView != null) {
                purchaseParallelContentView.m7328x();
            }
        }
    }

    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        if (this.latestPosition != position) {
            this.latestPosition = position;
            PurchaseParallelContentView purchaseParallelContentView = object instanceof PurchaseParallelContentView ? (PurchaseParallelContentView) object : null;
            if (purchaseParallelContentView == null || purchaseParallelContentView.getPurchaseType() != this.purchaseTypes.get(this.initSelectTebIndex)) {
                return;
            }
            purchaseParallelContentView.m7325u();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m28072t(@NotNull List<? extends ViewGroup> _agreement_roots) {
        _agreement_roots.getClass();
        this._agreement_roots.addAll(_agreement_roots);
    }

    /* JADX INFO: renamed from: u */
    public final void m28073u(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: v */
    public final void m28074v(int initSelectTabIndex) {
        this.initSelectTebIndex = initSelectTabIndex;
    }

    /* JADX INFO: renamed from: w */
    public final void m28075w(@NotNull C0213b mediatorsManager) {
        mediatorsManager.getClass();
        this.mediatorsManager = mediatorsManager;
    }

    /* JADX INFO: renamed from: x */
    public final void m28076x(@Nullable e30<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: y */
    public final void m28077y(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }
}
