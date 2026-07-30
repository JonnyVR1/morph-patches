package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8940b;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.PurchaseParallelContentView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u00020\u001e2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\u001e2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u001e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b8\u00104J\u0015\u00109\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b9\u00104J\r\u0010:\u001a\u00020\u001e¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR,\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010NR\u0016\u0010R\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010QR\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010Q¨\u0006T"}, m88121d2 = {"Ll/ceb0;", "Ll/lb2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "Ll/lib0;", "purchasePageTrack", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ll/lib0;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "setPrimaryItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "o", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "w", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;)V", "Ll/a30;", "onPaymentSuccess", BaseSei.f14625Y, "(Ll/a30;)V", "Ll/y20;", "onNegativeClick", BaseSei.f14624X, "(Ll/y20;)V", "dialogStateAction", "u", "initSelectTabIndex", ResourceDirection.f39656v, "(I)V", "_agreement_roots", Constants.KEY_T, "(Ljava/util/List;)V", "r", "q", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Ljava/util/List;", "g", "h", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Ll/lib0;", "", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "j", "[Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "pageContentViews", "", "k", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "Ll/y20;", "n", "Ll/a30;", "I", "initSelectTebIndex", "latestPosition", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ceb0 extends lb2 {

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
    public final lib0 purchasePageTrack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final PurchaseParallelContentView[] pageContentViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<ViewGroup> _agreement_roots;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public C8940b mediatorsManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int initSelectTebIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int latestPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public ceb0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str, @NotNull lib0 lib0Var) {
        act.getClass();
        list.getClass();
        lib0Var.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.firstPrivileges = list2;
        this.from = str;
        this.purchasePageTrack = lib0Var;
        this.pageContentViews = new PurchaseParallelContentView[list.size()];
        this._agreement_roots = new ArrayList();
        this.latestPosition = -1;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.purchaseTypes.size();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        view.getClass();
        object.getClass();
        return view == object;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: m */
    public void mo44299m(@Nullable Object object) {
        PurchaseParallelContentView purchaseParallelContentView = object instanceof PurchaseParallelContentView ? (PurchaseParallelContentView) object : null;
        if (purchaseParallelContentView != null) {
            purchaseParallelContentView.m55177y();
        }
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        container.removeView((View) object);
    }

    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object mo40046p(@NotNull ViewGroup container, int position) {
        Privilege privilege;
        container.getClass();
        View viewInflate = this.act.getLayoutInflater().inflate(rec0.f162423B1, container, false);
        viewInflate.getClass();
        PurchaseParallelContentView purchaseParallelContentView = (PurchaseParallelContentView) viewInflate;
        this.pageContentViews[position] = purchaseParallelContentView;
        PurchaseType purchaseType = this.purchaseTypes.get(position);
        List<Privilege> list = this.firstPrivileges;
        C8940b c8940b = null;
        if (list == null || position >= list.size()) {
            ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
            privilege = !jyb.m147479J(privilegeData) ? privilegeData.get(0) : null;
        } else {
            privilege = this.firstPrivileges.get(position);
        }
        C8940b c8940b2 = this.mediatorsManager;
        if (c8940b2 == null) {
            Intrinsics.m88391r("mediatorsManager");
        } else {
            c8940b = c8940b2;
        }
        ndb0 ndb0VarM55231c = c8940b.m55231c(this.purchaseTypes.get(position));
        if (ndb0VarM55231c != null) {
            ndb0VarM55231c.m55201P(this.purchasePageTrack);
        }
        purchaseParallelContentView.m55171s(ndb0VarM55231c);
        purchaseParallelContentView.m55174v(this.act, this.purchaseTypes.get(position), privilege, this.from);
        purchaseParallelContentView.setOnPaymentSuccess(this.onPaymentSuccess);
        purchaseParallelContentView.setOnNegativeClick(this.onNegativeClick);
        purchaseParallelContentView.setDialogStateAction(this.dialogStateAction);
        purchaseParallelContentView.setAgreementRoot(this._agreement_roots.get(position));
        purchaseParallelContentView.setInitSelectTab(this.initSelectTebIndex == position);
        purchaseParallelContentView.setPurchasePageTrack(this.purchasePageTrack);
        container.addView(purchaseParallelContentView);
        return purchaseParallelContentView;
    }

    /* JADX INFO: renamed from: q */
    public final void m109344q(int position) {
        PurchaseParallelContentView purchaseParallelContentView = this.pageContentViews[position];
        if (purchaseParallelContentView != null) {
            purchaseParallelContentView.m55172t();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m109345r(int position) {
        lib0 lib0Var = this.purchasePageTrack;
        ProductCategory productCategory = this.purchaseTypes.get(position).productCategory();
        productCategory.getClass();
        lib0Var.m154344v(productCategory);
        PurchaseParallelContentView purchaseParallelContentView = this.pageContentViews[position];
        if (purchaseParallelContentView != null) {
            ndb0 mediator = purchaseParallelContentView.getMediator();
            if (mediator != null && mediator.m55225y()) {
                purchaseParallelContentView.m55167E();
            }
            String strM158482k = mib0.m158482k(this.purchaseTypes.get(position));
            if (!TextUtils.isEmpty(strM158482k)) {
                i4g0.m138523u("e_purchase_tab", "p_purchase_page", jyb.m147494Y("tab_type", strM158482k));
            }
            purchaseParallelContentView.m55173u();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m109346s() {
        for (PurchaseParallelContentView purchaseParallelContentView : this.pageContentViews) {
            if (purchaseParallelContentView != null) {
                purchaseParallelContentView.m55176x();
            }
        }
    }

    @Override // p153l.cf60
    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        if (this.latestPosition != position) {
            this.latestPosition = position;
            PurchaseParallelContentView purchaseParallelContentView = object instanceof PurchaseParallelContentView ? (PurchaseParallelContentView) object : null;
            if (purchaseParallelContentView == null || purchaseParallelContentView.getPurchaseType() != this.purchaseTypes.get(this.initSelectTebIndex)) {
                return;
            }
            purchaseParallelContentView.m55173u();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m109347t(@NotNull List<? extends ViewGroup> _agreement_roots) {
        _agreement_roots.getClass();
        this._agreement_roots.addAll(_agreement_roots);
    }

    /* JADX INFO: renamed from: u */
    public final void m109348u(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: v */
    public final void m109349v(int initSelectTabIndex) {
        this.initSelectTebIndex = initSelectTabIndex;
    }

    /* JADX INFO: renamed from: w */
    public final void m109350w(@NotNull C8940b mediatorsManager) {
        mediatorsManager.getClass();
        this.mediatorsManager = mediatorsManager;
    }

    /* JADX INFO: renamed from: x */
    public final void m109351x(@Nullable y20<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: y */
    public final void m109352y(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }
}
