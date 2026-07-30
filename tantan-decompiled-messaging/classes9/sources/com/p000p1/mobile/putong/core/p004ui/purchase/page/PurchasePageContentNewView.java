package com.p000p1.mobile.putong.core.p004ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.page.PurchasePageContentNewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.e30;
import l.g30;
import l.i0e;
import l.l5b0;
import l.m6c0;
import l.p2b0;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u0018J9\u0010&\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b2\u00103J+\u00106\u001a\u00020\n2\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u000104¢\u0006\u0004\b6\u00107J)\u00109\u001a\u00020\n2\u001a\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"\u0018\u000104¢\u0006\u0004\b9\u00107J\u0015\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u00020$¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\n¢\u0006\u0004\bA\u0010\u0018J\r\u0010B\u001a\u00020\n¢\u0006\u0004\bB\u0010\u0018J\r\u0010C\u001a\u00020\n¢\u0006\u0004\bC\u0010\u0018J\u000f\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bD\u0010\u0018J\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u0010\u0018J\r\u0010F\u001a\u00020\u000f¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\u0018R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010iR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010kR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010+R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010pR\u001c\u0010t\u001a\b\u0012\u0004\u0012\u00020r0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010sR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010uR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010vR*\u0010w\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010hR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020\u001d0q8\u0006¢\u0006\f\n\u0004\b\u0013\u0010s\u001a\u0004\by\u0010zR\u0016\u0010|\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010kR\u0016\u0010:\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010kR\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010~¨\u0006\u0080\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "q", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "o", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "r", "()V", "p", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "l", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "t", "(Ljava/util/List;)V", "onFinishInflate", "", "from", "", "multiPages", "k", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/j5b0;", "mediator", "h", "(Ll/j5b0;)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "other", "setOnlineMatchPushUser", "(Ljava/lang/String;)V", "Ll/g30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "isInitSelectTab", "setInitSelectTab", "(Z)V", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "n", "j", "i", "onDetachedFromWindow", "m", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "s", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "Landroid/widget/FrameLayout;", "get_showcase", "()Landroid/widget/FrameLayout;", "set_showcase", "(Landroid/widget/FrameLayout;)V", "_showcase", "c", "get_introduce", "set_introduce", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePagePaymentView;", "d", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePagePaymentView;)V", "_payment_view", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "Z", "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "setMediator", "Ll/hab0;", "", "Ll/d1m;", "Ljava/util/List;", "purchaseComponentsList", "Ll/e30;", "Ll/g30;", "onPaymentFailedAction", "onlineMatchPushUser", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "isDialogPageShow", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchasePageContentNewView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _privilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _showcase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _introduce;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PurchasePagePaymentView _payment_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Privilege primaryPrivilege;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean multiPages;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final List<d> purchaseSections;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isDialogPageShow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean isInitSelectTab;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePageContentNewView$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0217a implements AbstractC0212a.e {
        public C0217a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            PurchasePageContentNewView.this.getPurchaseSections().clear();
            PurchasePageContentNewView.this.getPurchaseSections().addAll(sections);
            if (PurchasePageContentNewView.this.isInitSelectTab && !PurchasePageContentNewView.this.isDialogPageShow && !vwb.J(PurchasePageContentNewView.this.getPurchaseSections())) {
                PurchasePageContentNewView.this.isDialogPageShow = true;
                PurchasePageContentNewView purchasePageContentNewView = PurchasePageContentNewView.this;
                purchasePageContentNewView.m7497t(purchasePageContentNewView.getPurchaseSections());
            }
            if (PurchasePageContentNewView.this.isDialogPageShow) {
                PurchasePageContentNewView.this.m7496s();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePageContentNewView$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0218b implements AbstractC0212a.d {
        public C0218b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            hab0 hab0Var;
            section.getClass();
            if (!isClick || (hab0Var = PurchasePageContentNewView.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16106B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePageContentNewView$c */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/page/PurchasePageContentNewView$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0219c implements AbstractC0212a.b {
        public C0219c() {
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
                hab0 hab0Var2 = PurchasePageContentNewView.this.purchasePageTrack;
                if (hab0Var2 != null) {
                    hab0Var2.m16127s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                hab0 hab0Var3 = PurchasePageContentNewView.this.purchasePageTrack;
                if (hab0Var3 != null) {
                    hab0.m16104u(hab0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            hab0 hab0Var4 = PurchasePageContentNewView.this.purchasePageTrack;
            if (hab0Var4 != null) {
                hab0Var4.m16131x(paymentHandlerData, purchaseType);
            }
            if (!g6a.m15597t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (hab0Var = PurchasePageContentNewView.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16132y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePageContentNewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseComponentsList = new ArrayList();
        this.purchaseSections = new ArrayList();
        cwf0 cwf0VarC = i0e.c("p_purchase_page", PurchasePageContentNewView.class.getName());
        cwf0VarC.getClass();
        this.statisticsPageHelper = cwf0VarC;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m7478a(d dVar) {
        return Boolean.valueOf(dVar.j());
    }

    /* JADX INFO: renamed from: b */
    public final void m7484b(View view) {
        l5b0.a(this, view);
    }

    @Nullable
    public final j5b0 getMediator() {
        return this.mediator;
    }

    @NotNull
    public final List<d> getPurchaseSections() {
        return this.purchaseSections;
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
    public final FrameLayout get_introduce() {
        FrameLayout frameLayout = this._introduce;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_introduce");
        return null;
    }

    @NotNull
    public final PurchasePagePaymentView get_payment_view() {
        PurchasePagePaymentView purchasePagePaymentView = this._payment_view;
        if (purchasePagePaymentView != null) {
            return purchasePagePaymentView;
        }
        Intrinsics.r("_payment_view");
        return null;
    }

    @NotNull
    public final LinearLayout get_privilege() {
        LinearLayout linearLayout = this._privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_privilege");
        return null;
    }

    @NotNull
    public final FrameLayout get_showcase() {
        FrameLayout frameLayout = this._showcase;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_showcase");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7485h(@Nullable j5b0 mediator) {
        this.mediator = mediator;
    }

    /* JADX INFO: renamed from: i */
    public final void m7486i() {
        if (this.isDialogPageShow) {
            i0e.e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
        get_payment_view().setPageState(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m7487j() {
        if (!vwb.J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m7497t(this.purchaseSections);
        }
        get_payment_view().setPageState(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m7488k(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
        this.multiPages = multiPages;
    }

    /* JADX INFO: renamed from: l */
    public final void m7489l() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7347J(new C0217a());
            j5b0Var.m7346I(new C0218b());
            j5b0Var.m7344G(new C0219c());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7490m() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7348K();
        }
        get_payment_view().m7501d();
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7491n() {
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
            purchaseType2 = null;
        }
        m7494q(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        m7493p(purchaseType3);
        m7495r();
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.r("act");
            act2 = null;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType4;
        }
        m7492o(act2, purchaseType);
        m7489l();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.mo7375w();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7492o(Act act, PurchaseType purchaseType) {
        View viewInflate = act.inflater().inflate(m6c0.l1, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        PurchaseExclusivePrivilegeView purchaseExclusivePrivilegeView = (PurchaseExclusivePrivilegeView) viewInflate;
        purchaseExclusivePrivilegeView.m7477d(purchaseType);
        get_introduce().addView(purchaseExclusivePrivilegeView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7490m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7484b(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m7493p(PurchaseType purchaseType) {
        get_payment_view().m7500c(purchaseType, this.from, this.mediator);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnlineMatchPushUser(this.onlineMatchPushUser);
        get_payment_view().setOnPaymentSuccess(this.onPaymentSuccess);
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m7503f();
    }

    /* JADX INFO: renamed from: q */
    public final void m7494q(Act act, PurchaseType purchaseType, Privilege privilege) {
        View viewInflate = act.inflater().inflate(m6c0.x1, (ViewGroup) get_privilege(), false);
        viewInflate.getClass();
        PurchasePrivilegeView purchasePrivilegeView = (PurchasePrivilegeView) viewInflate;
        purchasePrivilegeView.m7537b(purchaseType, privilege);
        get_privilege().addView(purchasePrivilegeView);
    }

    /* JADX INFO: renamed from: r */
    public final void m7495r() {
        d1m aab0Var;
        PurchaseType purchaseType = null;
        if (p2b0.h().z()) {
            Act act = this.act;
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
            aab0Var = new dab0(act, purchaseType, "purchasePage", this.mediator);
        } else {
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.r("act");
                act2 = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType = purchaseType3;
            }
            aab0Var = new aab0(act2, purchaseType, "purchasePage", this.mediator);
        }
        get_showcase().addView(aab0Var.mo11783a(get_showcase()));
        aab0Var.register();
        this.purchaseComponentsList.add(aab0Var);
    }

    /* JADX INFO: renamed from: s */
    public final void m7496s() {
        hab0 hab0Var;
        if (vwb.J(this.purchaseSections) || (hab0Var = this.purchasePageTrack) == null) {
            return;
        }
        hab0Var.m16107C(this.purchaseSections);
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

    public final void setOnPaymentFailed(@Nullable g30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    public final void setOnlineMatchPushUser(@Nullable String other) {
        this.onlineMatchPushUser = other;
    }

    public final void setPurchasePageTrack(@NotNull hab0 purchasePageTrack) {
        purchasePageTrack.getClass();
        this.purchasePageTrack = purchasePageTrack;
    }

    public final void set_introduce(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._introduce = frameLayout;
    }

    public final void set_payment_view(@NotNull PurchasePagePaymentView purchasePagePaymentView) {
        purchasePagePaymentView.getClass();
        this._payment_view = purchasePagePaymentView;
    }

    public final void set_privilege(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._privilege = linearLayout;
    }

    public final void set_showcase(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._showcase = frameLayout;
    }

    /* JADX INFO: renamed from: t */
    public final void m7497t(List<? extends d> sections) {
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
            if (this.multiPages) {
                jSONObject.put("default_product", p2b0.h().g("vip").toString());
            } else {
                jSONObject.put("default_product", productCategory.toString());
            }
            jSONObject.put("default_duration", p2b0.h().p(productCategory));
            boolean zA = NullChecker.a(vwb.r(sections, new w9j() { // from class: l.k5b0
                public final Object call(Object obj) {
                    return PurchasePageContentNewView.m7478a((d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zA ? "yes" : "no");
            jSONObject.put("if_discount", zA);
            jSONObject.put("if_double_tab", this.multiPages);
            jSONObject.put("function_type", iab0.m16579f(this.primaryPrivilege, this.from));
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
                jSONObject.put("is_fakeunreal", (!CoreModule.f1534c.f3628e0.m21427Z7() || CoreModule.f1534c.f3628e0.m21415W7() || CoreModule.f1534c.f3628e0.m21469k8()) ? false : true);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchasePageContentNewView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PurchasePageContentNewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
