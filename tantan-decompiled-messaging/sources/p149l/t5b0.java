package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8777b;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePageContentNewView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u001e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b-\u0010.J+\u00101\u001a\u00020\u001e2\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010/¢\u0006\u0004\b1\u00102J)\u00104\u001a\u00020\u001e2\u001a\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010/¢\u0006\u0004\b4\u00102J\u0015\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b8\u00107J\u0015\u0010:\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u001e¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010,\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010IR,\u00100\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010[\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010ZR\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\\R\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\\¨\u0006_"}, m87232d2 = {"Ll/t5b0;", "Ll/eb2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "", "from", "Ll/x5b0;", "purchasePageTrack", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ll/x5b0;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "setPrimaryItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "o", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;)V", "Ll/e30;", "dialogStateAction", Constants.KEY_T, "(Ll/e30;)V", "onlineMatchPushUser", BaseSei.f13931Y, "(Ljava/lang/String;)V", "Ll/g30;", "onPaymentSuccess", BaseSei.f13930X, "(Ll/g30;)V", "failed", "w", "initSelectTabIndex", "u", "(I)V", "r", "purchaseType", "q", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", BLiveStormDanmakuGiftResourceType.f44446s, "()V", "e", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "f", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "g", "getPrivileges", "h", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Ll/x5b0;", "getPurchasePageTrack", "()Ll/x5b0;", "j", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView;", "k", "[Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView;", "pageContentViews", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/e30;", "n", "Ll/g30;", "onPaymentFailedAction", "I", "initSelectTebIndex", "latestPosition", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class t5b0 extends eb2 {

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
    public C8777b mediatorsManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final PurchasePageContentNewView[] pageContentViews;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int initSelectTebIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int latestPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public t5b0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str, @NotNull x5b0 x5b0Var) {
        act.getClass();
        list.getClass();
        x5b0Var.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.privileges = list2;
        this.from = str;
        this.purchasePageTrack = x5b0Var;
        this.pageContentViews = new PurchasePageContentNewView[list.size()];
        this.latestPosition = -1;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.purchaseTypes.size();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        view.getClass();
        object.getClass();
        return view == object;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: m */
    public void mo43284m(@Nullable Object object) {
        PurchasePageContentNewView purchasePageContentNewView = object instanceof PurchasePageContentNewView ? (PurchasePageContentNewView) object : null;
        if (purchasePageContentNewView != null) {
            purchasePageContentNewView.m54156n();
        }
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        container.removeView((View) object);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    @Override // p149l.eb2
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object mo39043p(@NotNull ViewGroup container, int position) {
        Privilege privilege;
        Privilege privilege2;
        C8777b c8777b;
        j5b0 j5b0VarM54048c;
        boolean z;
        container.getClass();
        View viewInflate = this.act.getLayoutInflater().inflate(m6c0.f131603i1, container, false);
        viewInflate.getClass();
        PurchasePageContentNewView purchasePageContentNewView = (PurchasePageContentNewView) viewInflate;
        this.pageContentViews[position] = purchasePageContentNewView;
        PurchaseType purchaseType = this.purchaseTypes.get(position);
        List<Privilege> list = this.privileges;
        C8777b c8777b2 = null;
        if (list == null || position >= list.size()) {
            ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
            if (vwb.m200296J(privilegeData)) {
                privilege = null;
            } else {
                privilege2 = privilegeData.get(0);
            }
            c8777b = this.mediatorsManager;
            if (c8777b == null) {
                Intrinsics.m87502r("mediatorsManager");
            } else {
                c8777b2 = c8777b;
            }
            j5b0VarM54048c = c8777b2.m54048c(this.purchaseTypes.get(position));
            if (j5b0VarM54048c != null) {
                j5b0VarM54048c.m54018P(this.purchasePageTrack);
            }
            purchasePageContentNewView.m54150h(j5b0VarM54048c);
            Act act = this.act;
            PurchaseType purchaseType2 = this.purchaseTypes.get(position);
            String str = this.from;
            if (this.purchaseTypes.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            purchasePageContentNewView.m54153k(act, purchaseType2, privilege, str, z);
            purchasePageContentNewView.setDialogStateAction(this.dialogStateAction);
            purchasePageContentNewView.setOnlineMatchPushUser(this.onlineMatchPushUser);
            purchasePageContentNewView.setOnPaymentSuccess(this.onPaymentSuccess);
            purchasePageContentNewView.setOnPaymentFailed(this.onPaymentFailedAction);
            purchasePageContentNewView.setInitSelectTab(this.initSelectTebIndex == position);
            purchasePageContentNewView.setPurchasePageTrack(this.purchasePageTrack);
            container.addView(purchasePageContentNewView);
            return purchasePageContentNewView;
        }
        privilege2 = this.privileges.get(position);
        privilege = privilege2;
        c8777b = this.mediatorsManager;
        if (c8777b == null) {
            Intrinsics.m87502r("mediatorsManager");
        } else {
            c8777b2 = c8777b;
        }
        j5b0VarM54048c = c8777b2.m54048c(this.purchaseTypes.get(position));
        if (j5b0VarM54048c != null) {
            j5b0VarM54048c.m54018P(this.purchasePageTrack);
        }
        purchasePageContentNewView.m54150h(j5b0VarM54048c);
        Act act2 = this.act;
        PurchaseType purchaseType3 = this.purchaseTypes.get(position);
        String str2 = this.from;
        if (this.purchaseTypes.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        purchasePageContentNewView.m54153k(act2, purchaseType3, privilege, str2, z);
        purchasePageContentNewView.setDialogStateAction(this.dialogStateAction);
        purchasePageContentNewView.setOnlineMatchPushUser(this.onlineMatchPushUser);
        purchasePageContentNewView.setOnPaymentSuccess(this.onPaymentSuccess);
        purchasePageContentNewView.setOnPaymentFailed(this.onPaymentFailedAction);
        purchasePageContentNewView.setInitSelectTab(this.initSelectTebIndex == position);
        purchasePageContentNewView.setPurchasePageTrack(this.purchasePageTrack);
        container.addView(purchasePageContentNewView);
        return purchasePageContentNewView;
    }

    /* JADX INFO: renamed from: q */
    public final void m187278q(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        x5b0 x5b0Var = this.purchasePageTrack;
        ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        x5b0Var.m130122v(productCategory);
        PurchasePageContentNewView[] purchasePageContentNewViewArr = this.pageContentViews;
        int length = purchasePageContentNewViewArr.length;
        for (int i = 0; i < length; i++) {
            PurchasePageContentNewView purchasePageContentNewView = purchasePageContentNewViewArr[i];
            if ((purchasePageContentNewView != null ? purchasePageContentNewView.getPurchaseType() : null) == purchaseType) {
                j5b0 mediator = purchasePageContentNewView.getMediator();
                if (mediator != null && mediator.m54042y()) {
                    purchasePageContentNewView.m54161s();
                }
                purchasePageContentNewView.m54152j();
            } else if (purchasePageContentNewView != null) {
                purchasePageContentNewView.m54151i();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m187279r(int position) {
        PurchasePageContentNewView purchasePageContentNewView = this.pageContentViews[position];
        if (purchasePageContentNewView != null) {
            purchasePageContentNewView.m54151i();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m187280s() {
        for (PurchasePageContentNewView purchasePageContentNewView : this.pageContentViews) {
            if (purchasePageContentNewView != null) {
                purchasePageContentNewView.m54155m();
            }
        }
    }

    @Override // p149l.w660
    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        if (this.latestPosition != position) {
            this.latestPosition = position;
            PurchasePageContentNewView purchasePageContentNewView = object instanceof PurchasePageContentNewView ? (PurchasePageContentNewView) object : null;
            if (purchasePageContentNewView == null || purchasePageContentNewView.getPurchaseType() != this.purchaseTypes.get(this.initSelectTebIndex)) {
                return;
            }
            purchasePageContentNewView.m54152j();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m187281t(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: u */
    public final void m187282u(int initSelectTabIndex) {
        this.initSelectTebIndex = initSelectTabIndex;
    }

    /* JADX INFO: renamed from: v */
    public final void m187283v(@NotNull C8777b mediatorsManager) {
        mediatorsManager.getClass();
        this.mediatorsManager = mediatorsManager;
    }

    /* JADX INFO: renamed from: w */
    public final void m187284w(@Nullable g30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    /* JADX INFO: renamed from: x */
    public final void m187285x(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: y */
    public final void m187286y(@Nullable String onlineMatchPushUser) {
        this.onlineMatchPushUser = onlineMatchPushUser;
    }
}
