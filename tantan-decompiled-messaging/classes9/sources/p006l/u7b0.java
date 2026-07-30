package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.f1m;
import l.j760;
import l.m6c0;
import l.rxa0;
import l.sab0;
import l.svq;
import l.v7b0;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u0015\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001f¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u000f2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020'\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0005¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010]\"\u0004\bc\u0010_R\"\u0010h\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010[\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R\"\u0010l\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010x\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010|\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010[\u001a\u0004\bz\u0010]\"\u0004\b{\u0010_R%\u0010\u0082\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\u0011R&\u0010\u0086\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010[\u001a\u0005\b\u0084\u0001\u0010]\"\u0005\b\u0085\u0001\u0010_R\u0019\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b4\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u00107\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u008e\u0001R\u0019\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010DR/\u0010\u0095\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010FR\u0018\u0010\u0099\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010FR\u0018\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010#\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010\u001b\"\u0005\b¢\u0001\u0010%R\u0019\u0010¥\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010-¨\u0006¦\u0001"}, d2 = {"Ll/u7b0;", "Ll/n5;", "Ll/f1m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", "view", "", "c0", "(Landroid/view/View;)V", "r0", "()V", "t0", "s0", "w0", "q0", "v0", "", "e0", "()Z", "d0", "C0", "B0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "hasPrivilege", "u0", "(Z)V", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "e", "d", "_root", "x0", "(Landroid/view/ViewGroup;)V", "E", "()Ljava/lang/String;", "Ll/e30;", "onPayTypeSelectAction", "A0", "(Ll/e30;)V", "Ll/d30;", "onNoPrivilegeClick", "z0", "(Ll/d30;)V", "currentPagePurchaseType", "y0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", "s", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "t", "Landroid/widget/LinearLayout;", "j0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "l0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", "v", "Lv/VText;", "o0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "m0", "set_pay_method_promotion", "_pay_method_promotion", "x", "n0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "y", "k0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", "z", "Lv/VLinear;", "g0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "i0", "set_get_privilege_text", "_get_privilege_text", "B", "h0", "set_get_privilege_subtitle", "_get_privilege_subtitle", "C", "Landroid/view/View;", "f0", "()Landroid/view/View;", "set_anchor", "_anchor", "D", "p0", "set_stickers", "_stickers", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "F", "Ll/zh60;", "paymentTextProcessorsHelper", "Ll/e30;", "Ll/d30;", "vipFragCurrentPagePurchaseType", "Lkotlin/Triple;", "", "J", "Lkotlin/Triple;", "bubble", "K", "bubbleKeyPrefix", "L", "previousBubbleKey", "M", "Landroid/view/ViewGroup;", "N", "Lcom/p1/mobile/putong/data/PayMethod;", "previousPayMethod", "O", "Z", "getHasPrivilege", "setHasPrivilege", "", "P", "pageState", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class u7b0 extends AbstractC1040n5 implements f1m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _get_privilege_subtitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public View _anchor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public fi60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final zh60 paymentTextProcessorsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public e30<PayMethod> onPayTypeSelectAction;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public d30 onNoPrivilegeClick;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public PurchaseType vipFragCurrentPagePurchaseType;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public Triple<String, Long, String> bubble;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final String bubbleKeyPrefix;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public String previousBubbleKey;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ViewGroup _root;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public PayMethod previousPayMethod;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int pageState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final j5b0 mediator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public LinearLayout _pay_method;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VImage _pay_method_icon;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _pay_method_text;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _pay_method_promotion;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VLinear _get_privilege;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        this.paymentTextProcessorsHelper = new zh60(act, purchaseType, str);
        this.bubbleKeyPrefix = "VIP_FRAG_BUBBLE_" + purchaseType + "_";
        this.previousBubbleKey = "";
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: W */
    public static void m25074W(Pair pair, u7b0 u7b0Var) {
        CharSequence charSequence = (CharSequence) pair.getFirst();
        if (TextUtils.isEmpty(charSequence)) {
            xdl0.M(u7b0Var.m25096m0(), false);
            xdl0.M(u7b0Var.m25097n0(), false);
        } else if (((Boolean) pair.getSecond()).booleanValue()) {
            xdl0.M(u7b0Var.m25096m0(), true);
            xdl0.M(u7b0Var.m25097n0(), false);
            u7b0Var.m25096m0().setText(charSequence);
        } else {
            xdl0.M(u7b0Var.m25096m0(), false);
            xdl0.M(u7b0Var.m25097n0(), true);
            u7b0Var.m25097n0().setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m25075X(u7b0 u7b0Var) {
        boolean zM25088e0 = u7b0Var.m25088e0();
        d currentPurchaseSection = u7b0Var.getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        ai60 ai60Var = new ai60(currentPurchaseSection, u7b0Var.getCurrentPayMethod(), u7b0Var.getRefundAmount(), zM25088e0);
        u7b0Var.paymentTextProcessorsHelper.m28716d();
        bi60 bi60VarM28713a = u7b0Var.paymentTextProcessorsHelper.m28713a(ai60Var);
        u7b0Var.m19670S(bi60VarM28713a);
        u7b0Var.m25092i0().setText(bi60VarM28713a.getTitle());
        if (TextUtils.isEmpty(bi60VarM28713a.getSticker())) {
            xdl0.M(u7b0Var.m25099p0(), false);
        } else {
            xdl0.M(u7b0Var.m25099p0(), true);
            u7b0Var.m25099p0().setText(bi60VarM28713a.getSticker());
            if (g6a.m15597t()) {
                u7b0Var.m19672V();
            }
        }
        if (TextUtils.isEmpty(bi60VarM28713a.getSubtitle())) {
            xdl0.M(u7b0Var.m25091h0(), false);
        } else {
            xdl0.M(u7b0Var.m25091h0(), true);
            u7b0Var.m25091h0().setText(bi60VarM28713a.getSubtitle());
        }
        u7b0Var.bubble = bi60VarM28713a.m12688b();
        u7b0Var.m25087d0();
    }

    /* JADX INFO: renamed from: Y */
    public static void m25076Y(u7b0 u7b0Var, View view) {
        u7b0Var.m25100q0();
    }

    /* JADX INFO: renamed from: Z */
    public static void m25077Z(u7b0 u7b0Var, View view) {
        if (TEnum.equals(u7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        u7b0Var.m19671T();
    }

    /* JADX INFO: renamed from: a0 */
    public static void m25078a0(u7b0 u7b0Var, View view) {
        AbstractC1040n5.m19658y(u7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static Boolean m25079b0(u7b0 u7b0Var, d dVar) {
        dVar.getClass();
        d.a aVarM19662K = u7b0Var.m19662K(dVar);
        return (rxa0.v("tttVip", aVarM19662K.s()) || rxa0.v("svip", aVarM19662K.s())) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m25080r0() {
        PayMethod payMethodM7373u;
        if (sab0.i(this.purchaseType) && g6a.m15592o()) {
            m25098o0().setTextColor(this.act.color(b1c0.O));
            m25094k0().setImageResource(d3c0.D5);
        }
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var == null || (payMethodM7373u = j5b0Var.m7373u()) == null) {
            payMethodM7373u = PayMethod.get("alipay");
        }
        payMethodM7373u.getClass();
        mo11778G(payMethodM7373u);
        this.previousPayMethod = null;
        xdl0.E0(m25093j0(), new View.OnClickListener() { // from class: l.s7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u7b0.m25077Z(this.f21129a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    private final void m25081s0() {
        int color;
        int color2;
        int i;
        m25092i0().setTypeface(eqh0.c(3));
        if (sab0.i(this.purchaseType) && g6a.m15592o()) {
            color = this.act.color(b1c0.J);
        } else if (sab0.i(this.purchaseType)) {
            color = Color.parseColor("#ffdea2");
        } else {
            color = sab0.o(this.purchaseType) ? Color.parseColor("#ffffff") : this.act.color(b1c0.m);
        }
        m25092i0().setTextColor(color);
        m25092i0().setText(this.act.string(R.string.b));
        if (sab0.i(this.purchaseType) && g6a.m15592o()) {
            color2 = this.act.color(b1c0.J);
        } else if (sab0.i(this.purchaseType)) {
            color2 = Color.parseColor("#33ffdea2");
        } else {
            color2 = sab0.o(this.purchaseType) ? Color.parseColor("#ffffff") : this.act.color(b1c0.t);
        }
        m25091h0().setTextColor(color2);
        if (sab0.i(this.purchaseType) && g6a.m15592o()) {
            i = d3c0.E5;
        } else if (sab0.i(this.purchaseType)) {
            i = d3c0.K9;
        } else if (sab0.o(this.purchaseType)) {
            i = d3c0.L9;
        } else if (sab0.a(this.purchaseType) || sab0.e(this.purchaseType) || sab0.c(this.purchaseType)) {
            i = d3c0.M9;
        } else if (sab0.g(this.purchaseType)) {
            i = d3c0.L;
        } else {
            i = sab0.x(this.purchaseType) ? d3c0.xb : d3c0.N9;
        }
        m25090g0().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m25082t0() {
        int i;
        m25099p0().setTypeface(eqh0.c(3));
        if (sab0.i(this.purchaseType) && g6a.m15592o()) {
            i = d3c0.C5;
        } else {
            i = sab0.g(this.purchaseType) ? d3c0.Z : d3c0.a6;
        }
        m25099p0().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m25083A0(@Nullable e30<PayMethod> onPayTypeSelectAction) {
        this.onPayTypeSelectAction = onPayTypeSelectAction;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m25084B0() {
        if (this.vipFragCurrentPagePurchaseType != this.purchaseType) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && g6a.m15597t()) {
            m19672V();
        }
        this.pageState = 1;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m25085C0() {
        com.p1.mobile.android.ui.bubble.d.l().k(this.previousBubbleKey);
    }

    @Override // p006l.AbstractC1040n5
    @NotNull
    /* JADX INFO: renamed from: E */
    public String mo11777E() {
        return "p_privileges_view";
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: G */
    public void mo11778G(@NotNull PayMethod currentPayMethod) {
        e30<PayMethod> e30Var;
        currentPayMethod.getClass();
        if (TEnum.equals(currentPayMethod, "unknown_")) {
            return;
        }
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m25098o0().setText(R.string.X9);
            m25095l0().setImageResource((sab0.i(this.purchaseType) && g6a.m15592o()) ? d3c0.n5 : d3c0.fa);
        } else if (TEnum.equals(currentPayMethod, "jingdong")) {
            m25098o0().setText("京东支付");
            m25095l0().setImageResource((sab0.i(this.purchaseType) && g6a.m15592o()) ? d3c0.m5 : d3c0.ea);
        } else {
            m25098o0().setText((sab0.i(this.purchaseType) || sab0.o(this.purchaseType) || !CoreModule.m1854P().m11706a().m5461j3()) ? this.act.string(R.string.R9) : this.act.string(R.string.h));
            m25095l0().setImageResource((sab0.i(this.purchaseType) && g6a.m15592o()) ? d3c0.l5 : d3c0.da);
        }
        PayMethod payMethod = this.previousPayMethod;
        if (payMethod != null && !TEnum.equals(payMethod, currentPayMethod) && (e30Var = this.onPayTypeSelectAction) != null) {
            e30Var.call(currentPayMethod);
        }
        this.previousPayMethod = currentPayMethod;
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: H */
    public void mo11779H() {
        if (getCurrentPurchaseSection() == null || this.hasPrivilege) {
            return;
        }
        m25092i0().post(new Runnable() { // from class: l.q7b0
            @Override // java.lang.Runnable
            public final void run() {
                u7b0.m25075X(this.f19657a);
            }
        });
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: I */
    public void mo11780I(@NotNull PayMethod currentPayMethod, @NotNull d section) {
        currentPayMethod.getClass();
        section.getClass();
        if (this.paymentTipsPromotionHelper == null) {
            this.paymentTipsPromotionHelper = new fi60(this.purchaseType, this.from);
        }
        fi60 fi60Var = this.paymentTipsPromotionHelper;
        fi60 fi60Var2 = null;
        if (fi60Var == null) {
            Intrinsics.r("paymentTipsPromotionHelper");
            fi60Var = null;
        }
        if (fi60Var.getPurchaseType() != m19680t()) {
            this.paymentTipsPromotionHelper = new fi60(m19680t(), this.from);
        }
        fi60 fi60Var3 = this.paymentTipsPromotionHelper;
        if (fi60Var3 == null) {
            Intrinsics.r("paymentTipsPromotionHelper");
        } else {
            fi60Var2 = fi60Var3;
        }
        final Pair<CharSequence, Boolean> pairM15350b = fi60Var2.m15350b(currentPayMethod, section, mo19131B());
        m25096m0().post(new Runnable() { // from class: l.r7b0
            @Override // java.lang.Runnable
            public final void run() {
                u7b0.m25074W(pairM15350b, this);
            }
        });
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.T1, root, false);
        viewInflate.getClass();
        m25086c0(viewInflate);
        m25080r0();
        m25082t0();
        m25081s0();
        return viewInflate;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m25086c0(View view) {
        v7b0.a(this, view);
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: d */
    public boolean mo19137d() {
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m25087d0() {
        String str;
        String str2;
        if (this.vipFragCurrentPagePurchaseType != this.purchaseType) {
            m25085C0();
            return;
        }
        Triple<String, Long, String> triple = this.bubble;
        String str3 = "";
        if (triple == null || (str = (String) triple.getFirst()) == null) {
            str = "";
        }
        Triple<String, Long, String> triple2 = this.bubble;
        long jLongValue = triple2 != null ? ((Number) triple2.getSecond()).longValue() : 0L;
        Triple<String, Long, String> triple3 = this.bubble;
        if (triple3 != null && (str2 = (String) triple3.getThird()) != null) {
            str3 = str2;
        }
        if (TextUtils.isEmpty(str) || jLongValue <= 0) {
            m25085C0();
            return;
        }
        String str4 = this.bubbleKeyPrefix + str3;
        if (TextUtils.equals(this.previousBubbleKey, str4) && com.p1.mobile.android.ui.bubble.d.l().x(str4)) {
            return;
        }
        m25085C0();
        a aVar = new a(this.act);
        ViewGroup viewGroup = this._root;
        if (viewGroup == null) {
            Intrinsics.r("_root");
            viewGroup = null;
        }
        a aVarX = aVar.A(viewGroup).B(0).D(str).b(jLongValue).q(a.Q | a.P).J(12.0f).E(true).k(new int[]{this.act.color(b1c0.l)}).G(b1c0.u0).u(0).H(svq.c(12), svq.c(10), svq.c(12), svq.c(10)).l(svq.c(7)).p(75).x(svq.c(2) * (-1));
        this.previousBubbleKey = str4;
        com.p1.mobile.android.ui.bubble.d.l().u(aVarX, m25089f0(), str4);
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: e */
    public boolean mo19139e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m25088e0() {
        if (!sab0.w(m19680t()) && !sab0.q(m19680t())) {
            return true;
        }
        j5b0 j5b0Var = this.mediator;
        return ((d) vwb.r(j5b0Var != null ? j5b0Var.m7350M() : null, new w9j() { // from class: l.t7b0
            public final Object call(Object obj) {
                return u7b0.m25079b0(this.f21928a, (d) obj);
            }
        })) == null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final View m25089f0() {
        View view = this._anchor;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_anchor");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m25090g0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m25091h0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m25092i0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final LinearLayout m25093j0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VImage m25094k0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VImage m25095l0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m25096m0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText m25097n0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText m25098o0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VText m25099p0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m25100q0() {
        d30 d30Var = this.onNoPrivilegeClick;
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.u("e_buy_privilege_button", this.act.pageId(), new j760[]{vwb.Y("purchaseShowFrom", w2b0.b(this.from)), vwb.Y("productType", iab0.m16584k(this.purchaseType)), vwb.Y("is_privileged", cll0.m13522d(this.purchaseType))});
    }

    /* JADX INFO: renamed from: u0 */
    public final void m25101u0(boolean hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
        if (!hasPrivilege) {
            m25102v0();
        } else {
            m25103w0();
            m19661J();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m25102v0() {
        xdl0.M(m25093j0(), true);
        mo11778G(getCurrentPayMethod());
        d currentPurchaseSection = getCurrentPurchaseSection();
        if (currentPurchaseSection != null) {
            mo11780I(getCurrentPayMethod(), currentPurchaseSection);
        }
        ConstraintLayout.a layoutParams = m25090g0().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.a aVar = layoutParams;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = svq.c(6);
        m25090g0().setLayoutParams(aVar);
        mo11779H();
        xdl0.E0(m25090g0(), new View.OnClickListener() { // from class: l.p7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u7b0.m25078a0(this.f18619a, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m25103w0() {
        xdl0.M(m25093j0(), false);
        xdl0.M(m25099p0(), false);
        m25092i0().setText(R.string.X6);
        xdl0.M(m25091h0(), false);
        ConstraintLayout.a layoutParams = m25090g0().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.a aVar = layoutParams;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = svq.c(12);
        m25090g0().setLayoutParams(aVar);
        xdl0.E0(m25090g0(), new View.OnClickListener() { // from class: l.o7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u7b0.m25076Y(this.f18048a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final void m25104x0(@NotNull ViewGroup _root) {
        _root.getClass();
        this._root = _root;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m25105y0(@NotNull PurchaseType currentPagePurchaseType) {
        currentPagePurchaseType.getClass();
        this.vipFragCurrentPagePurchaseType = currentPagePurchaseType;
        m25084B0();
        m25087d0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m25106z0(@Nullable d30 onNoPrivilegeClick) {
        this.onNoPrivilegeClick = onNoPrivilegeClick;
    }
}
