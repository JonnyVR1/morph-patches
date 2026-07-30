package com.p000p1.mobile.putong.core.p004ui.purchase.mediator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.PurchaseParallelContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.newui.view.PreviousTouchLinearLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.d6b0;
import l.e30;
import l.e51;
import l.fy80;
import l.g30;
import l.i0e;
import l.l2b0;
import l.p2b0;
import l.sab0;
import l.svq;
import l.vwb;
import l.w2b0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.aab0;
import p006l.bi60;
import p006l.d1m;
import p006l.dab0;
import p006l.ef60;
import p006l.g6a;
import p006l.hab0;
import p006l.iab0;
import p006l.j5b0;
import p006l.mmd0;
import p006l.q0b0;
import p006l.r0m;
import p006l.u0b0;
import p006l.w6b0;
import p006l.wx80;
import v.VScroll_Fill_BottomAligned;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u001d\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ1\u0010%\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010-¢\u0006\u0004\b3\u00101J+\u00106\u001a\u00020\n2\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u000104¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bD\u0010\u000eJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u0010\u000eJ\r\u0010F\u001a\u00020\n¢\u0006\u0004\bF\u0010\u000eJ\r\u0010G\u001a\u00020\n¢\u0006\u0004\bG\u0010\u000eJ\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010,R\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010kR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010hR\u0016\u0010u\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010tR\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010w¨\u0006y"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "Lv/VScroll_Fill_BottomAligned;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "k", "(Landroid/view/View;)V", "A", "()V", "C", "", "Ll/wx80;", "r", "()Ljava/util/List;", "D", "B", "z", "w", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "F", "(Ljava/util/List;)V", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "", "from", "v", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ll/j5b0;", "mediator", "s", "(Ll/j5b0;)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "onNegativeClick", "setOnNegativeClick", "Ll/g30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "Landroid/view/ViewGroup;", "_agreement_root", "setAgreementRoot", "(Landroid/view/ViewGroup;)V", "", "isInitSelectTab", "setInitSelectTab", "(Z)V", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "onDetachedFromWindow", "y", "x", "u", "t", "E", "Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "f", "Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "get_content", "()Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "set_content", "(Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;)V", "_content", "g", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "i", "Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "Ll/r0m;", "Ll/r0m;", "privilegeComponent", "l", "Ll/hab0;", "m", "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "setMediator", "", "Ll/d1m;", "n", "Ljava/util/List;", "purchaseComponentsList", "o", "Ll/e30;", "p", "Ll/g30;", "q", "Landroid/view/ViewGroup;", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "purchaseSections", "Z", "isDialogPageShow", "Ll/w6b0;", "Ll/w6b0;", "paymentNegativeComponent", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchaseParallelContentView extends VScroll_Fill_BottomAligned {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PreviousTouchLinearLayout _content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public r0m privilegeComponent;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ViewGroup _agreement_root;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final List<d> purchaseSections;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isDialogPageShow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isInitSelectTab;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public w6b0 paymentNegativeComponent;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0209a implements AbstractC0212a.e {
        public C0209a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            PurchaseParallelContentView.this.purchaseSections.clear();
            PurchaseParallelContentView.this.purchaseSections.addAll(sections);
            if (PurchaseParallelContentView.this.isInitSelectTab && !PurchaseParallelContentView.this.isDialogPageShow && !vwb.J(PurchaseParallelContentView.this.purchaseSections)) {
                PurchaseParallelContentView.this.isDialogPageShow = true;
                PurchaseParallelContentView purchaseParallelContentView = PurchaseParallelContentView.this;
                purchaseParallelContentView.m7320F(purchaseParallelContentView.purchaseSections);
            }
            if (PurchaseParallelContentView.this.isDialogPageShow) {
                PurchaseParallelContentView.this.m7319E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0210b implements AbstractC0212a.d {
        public C0210b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            hab0 hab0Var;
            section.getClass();
            if (!isClick || (hab0Var = PurchaseParallelContentView.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16106B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$c */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0211c implements AbstractC0212a.b {
        public C0211c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.b
        /* JADX INFO: renamed from: a */
        public void mo7333a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            bi60 paymentTextResponseData;
            hab0 hab0Var;
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                hab0 hab0Var2 = PurchaseParallelContentView.this.purchasePageTrack;
                if (hab0Var2 != null) {
                    hab0Var2.m16127s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                hab0 hab0Var3 = PurchaseParallelContentView.this.purchasePageTrack;
                if (hab0Var3 != null) {
                    hab0.m16104u(hab0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            hab0 hab0Var4 = PurchaseParallelContentView.this.purchasePageTrack;
            if (hab0Var4 != null) {
                hab0Var4.m16131x(paymentHandlerData, purchaseType);
            }
            if (!g6a.m15597t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (hab0Var = PurchaseParallelContentView.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16132y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseParallelContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseComponentsList = new ArrayList();
        cwf0 cwf0VarC = i0e.c("p_purchase_page", PurchaseParallelContentView.class.getName());
        cwf0VarC.getClass();
        this.statisticsPageHelper = cwf0VarC;
        this.purchaseSections = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    private final void m7305A() {
        m7317C();
        m7318D();
        m7316B();
        m7330z();
        m7327w();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.mo7375w();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo12554b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m7306g(d dVar) {
        return Boolean.valueOf(dVar.j());
    }

    /* JADX INFO: renamed from: h */
    public static void m7307h(PurchaseParallelContentView purchaseParallelContentView) {
        purchaseParallelContentView.m7305A();
    }

    /* JADX INFO: renamed from: i */
    public static void m7308i(PurchaseParallelContentView purchaseParallelContentView, List list, List list2, Privilege privilege) {
        privilege.getClass();
        Privilege privilege2 = purchaseParallelContentView.firstPrivilege;
        PurchaseType purchaseType = null;
        if (privilege2 != null && !CollectionsKt.contains(list, privilege2) && privilege == Privilege.oDiamondSvipExtra) {
            PurchaseType purchaseType2 = purchaseParallelContentView.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType = purchaseType2;
            }
            wx80 wx80VarM = fy80.m(purchaseType, privilege);
            wx80VarM.getClass();
            list2.add(0, wx80VarM);
            return;
        }
        Privilege privilege3 = purchaseParallelContentView.firstPrivilege;
        if (privilege3 != null && CollectionsKt.contains(list, privilege3) && privilege == purchaseParallelContentView.firstPrivilege) {
            PurchaseType purchaseType3 = purchaseParallelContentView.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType = purchaseType3;
            }
            wx80 wx80VarM2 = fy80.m(purchaseType, privilege);
            wx80VarM2.getClass();
            list2.add(0, wx80VarM2);
            return;
        }
        PurchaseType purchaseType4 = purchaseParallelContentView.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType4;
        }
        wx80 wx80VarM3 = fy80.m(purchaseType, privilege);
        wx80VarM3.getClass();
        list2.add(wx80VarM3);
    }

    /* JADX INFO: renamed from: j */
    public static void m7309j(PurchaseParallelContentView purchaseParallelContentView, List list, Privilege privilege) {
        privilege.getClass();
        Privilege privilege2 = purchaseParallelContentView.firstPrivilege;
        PurchaseType purchaseType = purchaseParallelContentView.purchaseType;
        if (privilege == privilege2) {
            if (purchaseType == null) {
                Intrinsics.r("purchaseType");
                purchaseType = null;
            }
            wx80 wx80VarM = fy80.m(purchaseType, privilege);
            wx80VarM.getClass();
            list.add(0, wx80VarM);
            return;
        }
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        wx80 wx80VarM2 = fy80.m(purchaseType, privilege);
        wx80VarM2.getClass();
        list.add(wx80VarM2);
    }

    /* JADX INFO: renamed from: B */
    public final void m7316B() {
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        w6b0 w6b0Var = new w6b0(act, purchaseType, this.from, this.mediator);
        get_content().addView(w6b0Var.mo11783a(get_content()));
        w6b0Var.m19668Q(this.onPaymentSuccess);
        w6b0Var.m19667P(this.firstPrivilege);
        w6b0Var.m19666O(this.dialogStateAction);
        w6b0Var.m26229r0(this.onNegativeClick);
        w6b0Var.register();
        this.paymentNegativeComponent = w6b0Var;
        this.purchaseComponentsList.add(w6b0Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m7317C() {
        Act act = this.act;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        r0m r0mVarB = l2b0.b(act, purchaseType, this.from, false, true);
        this.privilegeComponent = r0mVarB;
        View viewMo19384a = r0mVarB != null ? r0mVarB.mo19384a(get_content(), false) : null;
        r0m r0mVar = this.privilegeComponent;
        if (r0mVar != null) {
            r0mVar.mo19386c(m7322r());
        }
        get_content().addView(viewMo19384a, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: D */
    public final void m7318D() {
        d1m aab0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.i(purchaseType)) {
            int iC = svq.c(1);
            layoutParams.leftMargin = iC;
            layoutParams.rightMargin = iC;
        }
        if (p2b0.h().z()) {
            Act act = this.act;
            if (act == null) {
                Intrinsics.r("act");
                act = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            aab0Var = new dab0(act, purchaseType2, this.from, this.mediator);
        } else {
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.r("act");
                act2 = null;
            }
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType2 = purchaseType4;
            }
            aab0Var = new aab0(act2, purchaseType2, this.from, this.mediator);
        }
        get_content().addView(aab0Var.mo11783a(get_content()), layoutParams);
        aab0Var.register();
        this.purchaseComponentsList.add(aab0Var);
    }

    /* JADX INFO: renamed from: E */
    public final void m7319E() {
        hab0 hab0Var;
        if (vwb.J(this.purchaseSections) || (hab0Var = this.purchasePageTrack) == null) {
            return;
        }
        hab0Var.m16107C(this.purchaseSections);
    }

    /* JADX INFO: renamed from: F */
    public final void m7320F(List<? extends d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.from));
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.r("purchaseType");
                purchaseType = null;
            }
            ProductCategory productCategory = purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.U(iab0.m16583j(sections), ","));
            jSONObject.put("default_product", p2b0.h().g("vip").toString());
            jSONObject.put("default_duration", p2b0.h().p(productCategory));
            boolean zA = NullChecker.a(vwb.r(sections, new w9j() { // from class: l.z5b0
                public final Object call(Object obj) {
                    return PurchaseParallelContentView.m7306g((d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zA ? "yes" : "no");
            jSONObject.put("if_discount", zA);
            boolean z = true;
            jSONObject.put("if_double_tab", true);
            jSONObject.put("function_type", iab0.m16579f(this.firstPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (CoreModule.m1854P().m11706a().m5362U() && CoreModule.f1534c.f3580O0.m2016w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m1854P().m11713i().m19779N()) {
                if (!CoreModule.f1534c.f3628e0.m21427Z7() || CoreModule.f1534c.f3628e0.m21415W7() || CoreModule.f1534c.f3628e0.m21469k8()) {
                    z = false;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    @Nullable
    public final j5b0 getMediator() {
        return this.mediator;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType != null) {
            return purchaseType;
        }
        Intrinsics.r("purchaseType");
        return null;
    }

    @NotNull
    public final PreviousTouchLinearLayout get_content() {
        PreviousTouchLinearLayout previousTouchLinearLayout = this._content;
        if (previousTouchLinearLayout != null) {
            return previousTouchLinearLayout;
        }
        Intrinsics.r("_content");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m7321k(View view) {
        d6b0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m7328x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7321k(this);
    }

    /* JADX INFO: renamed from: r */
    public final List<wx80> m7322r() {
        final ArrayList arrayList = new ArrayList();
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.q(purchaseType)) {
            vwb.z(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null), new e30() { // from class: l.b6b0
                public final void call(Object obj) {
                    PurchaseParallelContentView.m7309j(this.f8747a, arrayList, (Privilege) obj);
                }
            });
            return arrayList;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        if (sab0.i(purchaseType3)) {
            final ArrayList privilegeData = PurchaseType.TYPE_O_DIAMOND.getPrivilegeData((Gender) null);
            privilegeData.getClass();
            vwb.z(privilegeData, new e30() { // from class: l.c6b0
                public final void call(Object obj) {
                    PurchaseParallelContentView.m7308i(this.f9388a, privilegeData, arrayList, (Privilege) obj);
                }
            });
            return arrayList;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType2 = purchaseType4;
        }
        List listN = fy80.n(purchaseType2, this.firstPrivilege, false);
        listN.getClass();
        arrayList.addAll(listN);
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final void m7323s(@Nullable j5b0 mediator) {
        this.mediator = mediator;
    }

    public final void setAgreementRoot(@NotNull ViewGroup _agreement_root) {
        _agreement_root.getClass();
        this._agreement_root = _agreement_root;
    }

    public final void setDialogStateAction(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setInitSelectTab(boolean isInitSelectTab) {
        this.isInitSelectTab = isInitSelectTab;
    }

    public final void setMediator(@Nullable j5b0 j5b0Var) {
        this.mediator = j5b0Var;
    }

    public final void setOnNegativeClick(@Nullable e30<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    public final void setOnPaymentSuccess(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    public final void setPurchasePageTrack(@NotNull hab0 purchasePageTrack) {
        purchasePageTrack.getClass();
        this.purchasePageTrack = purchasePageTrack;
    }

    public final void set_content(@NotNull PreviousTouchLinearLayout previousTouchLinearLayout) {
        previousTouchLinearLayout.getClass();
        this._content = previousTouchLinearLayout;
    }

    /* JADX INFO: renamed from: t */
    public final void m7324t() {
        r0m r0mVar = this.privilegeComponent;
        mmd0 mmd0Var = r0mVar instanceof mmd0 ? (mmd0) r0mVar : null;
        if (mmd0Var != null) {
            mmd0Var.m19392l();
        }
        if (this.isDialogPageShow) {
            i0e.e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
        w6b0 w6b0Var = this.paymentNegativeComponent;
        if (w6b0Var != null) {
            w6b0Var.m26230s0(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7325u() {
        r0m r0mVar = this.privilegeComponent;
        mmd0 mmd0Var = r0mVar instanceof mmd0 ? (mmd0) r0mVar : null;
        if (mmd0Var != null) {
            mmd0Var.m19388g();
        }
        if (!vwb.J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m7320F(this.purchaseSections);
        }
        w6b0 w6b0Var = this.paymentNegativeComponent;
        if (w6b0Var != null) {
            w6b0Var.m26230s0(true);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m7326v(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.firstPrivilege = privilege;
        this.from = from;
    }

    /* JADX INFO: renamed from: w */
    public final void m7327w() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7347J(new C0209a());
            j5b0Var.m7346I(new C0210b());
            j5b0Var.m7344G(new C0211c());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7328x() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7348K();
        }
        r0m r0mVar = this.privilegeComponent;
        if (r0mVar != null) {
            r0mVar.release();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7329y() {
        Runnable runnable = new Runnable() { // from class: l.a6b0
            @Override // java.lang.Runnable
            public final void run() {
                PurchaseParallelContentView.m7307h(this.f8121a);
            }
        };
        if (this.isInitSelectTab) {
            runnable.run();
            return;
        }
        Context context = this.act;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        e51.H(context, runnable, 500L);
    }

    /* JADX INFO: renamed from: z */
    public final void m7330z() {
        d1m q0b0Var;
        PurchaseType purchaseType = this.purchaseType;
        ViewGroup viewGroup = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.d(purchaseType)) {
            boolean z = p2b0.h().z();
            Act act = this.act;
            if (z) {
                if (act == null) {
                    Intrinsics.r("act");
                    act = null;
                }
                PurchaseType purchaseType2 = this.purchaseType;
                if (purchaseType2 == null) {
                    Intrinsics.r("purchaseType");
                    purchaseType2 = null;
                }
                q0b0Var = new u0b0(act, purchaseType2, this.from, this.mediator);
            } else {
                if (act == null) {
                    Intrinsics.r("act");
                    act = null;
                }
                PurchaseType purchaseType3 = this.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.r("purchaseType");
                    purchaseType3 = null;
                }
                q0b0Var = new q0b0(act, purchaseType3, this.from, this.mediator);
            }
            ViewGroup viewGroup2 = this._agreement_root;
            if (viewGroup2 == null) {
                Intrinsics.r("_agreement_root");
                viewGroup2 = null;
            }
            ViewGroup viewGroup3 = this._agreement_root;
            if (viewGroup3 == null) {
                Intrinsics.r("_agreement_root");
            } else {
                viewGroup = viewGroup3;
            }
            viewGroup2.addView(q0b0Var.mo11783a(viewGroup));
            q0b0Var.register();
            this.purchaseComponentsList.add(q0b0Var);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchaseParallelContentView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PurchaseParallelContentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
