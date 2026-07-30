package p002l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseUpgradeIntroView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.purchase.mediator.a;
import com.p1.mobile.putong.core.ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.cbb0;
import l.cwf0;
import l.d1m;
import l.d30;
import l.d3c0;
import l.dd80;
import l.e30;
import l.ef60;
import l.er2;
import l.hab0;
import l.i0e;
import l.iab0;
import l.ic50;
import l.j5b0;
import l.m6c0;
import l.m7b0;
import l.o7r;
import l.sab0;
import l.vwb;
import l.w2b0;
import l.x5b0;
import l.z0b0;
import l.zab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010S0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010e¨\u0006g"}, d2 = {"Ll/yab0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "purchaseShowFrom", "Lcom/p1/mobile/putong/core/data/Merchandise;", "noneRenewableMerchandise", "autoRenewableMerchandise", "", "refund", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/Long;)V", "Landroid/view/View;", "view", "", "e", "(Landroid/view/View;)V", "p", "()V", "s", "u", "r", "q", "skus", "w", "(Ljava/lang/String;)V", "k", "()Ljava/lang/String;", "v", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getPurchaseShowFrom", "d", "Lcom/p1/mobile/putong/core/data/Merchandise;", "getNoneRenewableMerchandise", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "getAutoRenewableMerchandise", "f", "Ljava/lang/Long;", "getRefund", "()Ljava/lang/Long;", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_intro_root", "(Landroid/widget/FrameLayout;)V", "_intro_root", "i", "n", "set_payment_root", "_payment_root", "j", "l", "set_agreement_root", "_agreement_root", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "Ll/hab0;", "Ll/hab0;", "purchaseTrack", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/j5b0;", "Ll/j5b0;", "mediator", "Ll/dd80;", "Ll/dd80;", "dialog", "", "Ll/d1m;", "Ljava/util/List;", "purchaseComponentsList", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "_intro_view", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yab0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String purchaseShowFrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Merchandise noneRenewableMerchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Merchandise autoRenewableMerchandise;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Long refund;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _intro_root;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _payment_root;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public FrameLayout _agreement_root;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public dd80 dialog;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public C0190d currentPurchaseSection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public PurchaseUpgradeIntroView _intro_view;

    /* JADX INFO: renamed from: l.yab0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/yab0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0912a implements a.e {
        public C0912a() {
        }

        /* JADX INFO: renamed from: a */
        public void m26488a(List<? extends C0190d> sections) {
            sections.getClass();
            String strU = vwb.U(iab0.j(sections), ",");
            yab0 yab0Var = yab0.this;
            strU.getClass();
            yab0Var.m26487w(strU);
        }
    }

    /* JADX INFO: renamed from: l.yab0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/yab0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0913b implements a.d {
        public C0913b() {
        }

        /* JADX INFO: renamed from: a */
        public void m26489a(C0190d section, boolean scroll, boolean isClick, C0190d sectionSource) {
            section.getClass();
            yab0.this.currentPurchaseSection = section;
            PurchaseUpgradeIntroView purchaseUpgradeIntroView = yab0.this._intro_view;
            if (purchaseUpgradeIntroView != null) {
                purchaseUpgradeIntroView.m3703n0(section.m4098n());
            }
        }
    }

    /* JADX INFO: renamed from: l.yab0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/yab0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0914c implements a.a {
        public C0914c() {
        }

        /* JADX INFO: renamed from: a */
        public void m26490a(PayMethod payMethod) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            payMethod.getClass();
            C0190d c0190d = yab0.this.currentPurchaseSection;
            if (c0190d == null || (purchaseUpgradeIntroView = yab0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m3703n0(c0190d.m4098n());
        }
    }

    /* JADX INFO: renamed from: l.yab0$d */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/yab0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0915d implements a.b {
        public C0915d() {
        }

        /* JADX INFO: renamed from: a */
        public void m26491a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer numE = paymentHandlerData.e();
            if ((numE != null && numE.intValue() == 4) || (numE != null && numE.intValue() == 3)) {
                hab0 hab0Var = yab0.this.purchaseTrack;
                if (hab0Var != null) {
                    hab0Var.s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (numE != null && numE.intValue() == 2) {
                hab0 hab0Var2 = yab0.this.purchaseTrack;
                if (hab0Var2 != null) {
                    hab0.u(hab0Var2, paymentHandlerData, purchaseType, false, 4, (Object) null);
                    return;
                }
                return;
            }
            hab0 hab0Var3 = yab0.this.purchaseTrack;
            if (hab0Var3 != null) {
                hab0Var3.x(paymentHandlerData, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: l.yab0$e */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/yab0$e", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0916e implements a.c {
        public C0916e() {
        }

        /* JADX INFO: renamed from: a */
        public void m26492a(PurchaseAgreementState agreementState) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            agreementState.getClass();
            C0190d c0190d = yab0.this.currentPurchaseSection;
            if (c0190d == null || (purchaseUpgradeIntroView = yab0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m3703n0(c0190d.m4098n());
        }
    }

    /* JADX INFO: renamed from: l.yab0$f */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/yab0$f", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0917f extends er2 {
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public yab0(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull String str, @NotNull Merchandise merchandise, @NotNull Merchandise merchandise2, @Nullable Long l2) {
        act.getClass();
        purchaseType.getClass();
        str.getClass();
        merchandise.getClass();
        merchandise2.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.purchaseShowFrom = str;
        this.noneRenewableMerchandise = merchandise;
        this.autoRenewableMerchandise = merchandise2;
        this.refund = l2;
        this.statisticsPageHelper = new cwf0(new C0917f());
        this.dialogStateAction = new e30() { // from class: l.uab0
            public final void call(Object obj) {
                yab0.m26465a(this.f20562a, ((Integer) obj).intValue());
            }
        };
        this.purchaseComponentsList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m26465a(yab0 yab0Var, int i) {
        if (i == -1) {
            dd80 dd80Var = yab0Var.dialog;
            if (dd80Var != null) {
                dd80Var.hide();
                return;
            }
            return;
        }
        if (i != 0) {
            if (i == 1) {
                dd80 dd80Var2 = yab0Var.dialog;
                if (dd80Var2 != null) {
                    dd80Var2.show();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
        }
        dd80 dd80Var3 = yab0Var.dialog;
        if (dd80Var3 != null) {
            dd80Var3.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m26466b(yab0 yab0Var, DialogInterface dialogInterface) {
        yab0Var.m26482q();
    }

    /* JADX INFO: renamed from: c */
    public static void m26467c(yab0 yab0Var, DialogInterface dialogInterface) {
        CoreModule.P().a().E9();
        yab0Var.m26482q();
        i0e.e(yab0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: t */
    public static final void m26474t(yab0 yab0Var) {
        dd80 dd80Var = yab0Var.dialog;
        if (dd80Var != null) {
            dd80Var.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m26475e(View view) {
        zab0.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final String m26476k() {
        ArrayList arrayList = new ArrayList();
        if (CoreModule.c.e0.p9().isVIP()) {
            arrayList.add("VIP");
        }
        if (!CoreModule.P().a().e2()) {
            arrayList.add("see");
        }
        if (CoreModule.P().a().z9()) {
            arrayList.add("quickchat");
        }
        return vwb.U(arrayList, ",");
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final FrameLayout m26477l() {
        FrameLayout frameLayout = this._agreement_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m26478m() {
        FrameLayout frameLayout = this._intro_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_intro_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m26479n() {
        FrameLayout frameLayout = this._payment_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_payment_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m26480o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m26481p() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.J(new C0912a());
            j5b0Var.I(new C0913b());
            j5b0Var.F(new C0914c());
            j5b0Var.G(new C0915d());
            j5b0Var.H(new C0916e());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m26482q() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.K();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m26483r() {
        d1m z0b0Var = new z0b0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m26477l().addView(z0b0Var.a(m26477l()));
        z0b0Var.register();
        this.purchaseComponentsList.add(z0b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.PurchaseUpgradeIntroView] */
    /* JADX INFO: renamed from: s */
    public final void m26484s() {
        if (sab0.i(this.purchaseType)) {
            m26480o().setBackgroundResource(d3c0.m8);
        }
        ?? r1 = (PurchaseUpgradeIntroView) o7r.a(this.act).inflate(m6c0.X1, (ViewGroup) m26478m(), false);
        this._intro_view = r1;
        if (r1 != 0) {
            r1.m3700k0(this.act, this.purchaseType, this.noneRenewableMerchandise, this.autoRenewableMerchandise, this.refund);
            r1.m3699j0(new d30() { // from class: l.xab0
                public final void call() {
                    yab0.m26474t(this.f22193a);
                }
            });
            r1.m3701l0();
            m26478m().addView(r1);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m26485u() {
        d1m m7b0Var = new m7b0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m26479n().addView(m7b0Var.a(m26479n()));
        m7b0Var.O(this.dialogStateAction);
        m7b0Var.register();
        this.purchaseComponentsList.add(m7b0Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m26486v() {
        this.mediator = new cbb0(this.act, this.purchaseType, this.purchaseShowFrom);
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_svip_upgrade;
        if (sab0.i(this.purchaseType)) {
            purchaseTrackPageType = PurchaseTrackPageType.page_odiamond_upgrade;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, purchaseTrackPageType, this.purchaseShowFrom);
        this.purchaseTrack = x5b0Var;
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.P(x5b0Var);
        }
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            ProductCategory productCategory2 = this.purchaseType.productCategory();
            productCategory2.getClass();
            hab0Var.v(productCategory2);
        }
        cbb0 cbb0Var = this.mediator;
        cbb0 cbb0Var2 = cbb0Var instanceof cbb0 ? cbb0Var : null;
        if (cbb0Var2 != null) {
            cbb0Var2.h0(CollectionsKt.listOf(new Merchandise[]{this.noneRenewableMerchandise, this.autoRenewableMerchandise}));
        }
        dd80 dd80VarO = new dd80.a(this.act).Q(m6c0.W1).l0(new DialogInterface.OnCancelListener() { // from class: l.vab0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                yab0.m26466b(this.f21049a, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.wab0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yab0.m26467c(this.f21587a, dialogInterface);
            }
        }).O();
        this.dialog = dd80VarO;
        View viewL = dd80VarO != null ? dd80VarO.L() : null;
        if (viewL != null) {
            m26475e(viewL);
            m26484s();
            m26485u();
            m26483r();
            m26481p();
            j5b0 j5b0Var2 = this.mediator;
            if (j5b0Var2 != null) {
                j5b0Var2.w();
            }
            Iterator<d1m> it = this.purchaseComponentsList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        dd80 dd80Var = this.dialog;
        if (dd80Var != null) {
            dd80Var.show();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m26487w(String skus) {
        String strValueOf;
        String str = "no";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.purchaseShowFrom));
            jSONObject.put("productType", iab0.k(this.purchaseType));
            jSONObject.put("skuGroup", skus);
            jSONObject.put("if_sale", "no");
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (CoreModule.P().a().U() && CoreModule.c.O0.w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            jSONObject.put("function_type", "otherVas");
            jSONObject.put("is_window", "yes");
            jSONObject.put("product_type_window", m26476k());
            Long l2 = this.refund;
            if (l2 == null || (strValueOf = String.valueOf(l2.longValue())) == null) {
                strValueOf = "";
            }
            jSONObject.put("renewal_amount_window", strValueOf);
            jSONObject.put("trigger_firsttime_window", CoreModule.P().a().Tq());
            JSONObject jSONObjectU = ic50.j().f().U(OmsDialog.p_purchase_page.getIdentifier(), jSONObject);
            jSONObjectU.getClass();
            jSONObject = jSONObjectU;
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }
}
