package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u0015\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001f¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u000f2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020'\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0005¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010]\"\u0004\bc\u0010_R\"\u0010h\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010[\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R\"\u0010l\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010x\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010|\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010[\u001a\u0004\bz\u0010]\"\u0004\b{\u0010_R%\u0010\u0082\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\u0011R&\u0010\u0086\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010[\u001a\u0005\b\u0084\u0001\u0010]\"\u0005\b\u0085\u0001\u0010_R\u0019\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b4\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u00107\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u008e\u0001R\u0019\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010DR/\u0010\u0095\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010FR\u0018\u0010\u0099\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010FR\u0018\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010#\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010\u001b\"\u0005\b¢\u0001\u0010%R\u0019\u0010¥\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010-¨\u0006¦\u0001"}, m88121d2 = {"Ll/yfb0;", "Ll/l5;", "Ll/y3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c0", "(Landroid/view/View;)V", "r0", "()V", "t0", "s0", "w0", "q0", "v0", "", "e0", "()Z", "d0", "C0", "B0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "hasPrivilege", "u0", "(Z)V", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "e", Constants.INAPP_DATA_TAG, "_root", "x0", "(Landroid/view/ViewGroup;)V", "E", "()Ljava/lang/String;", "Ll/y20;", "onPayTypeSelectAction", "A0", "(Ll/y20;)V", "Ll/x20;", "onNoPrivilegeClick", "z0", "(Ll/x20;)V", "currentPagePurchaseType", "y0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/ndb0;", "Landroid/widget/LinearLayout;", Constants.KEY_T, "Landroid/widget/LinearLayout;", "j0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "l0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", ResourceDirection.f39656v, "Lv/VText;", "o0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "m0", "set_pay_method_promotion", "_pay_method_promotion", BaseSei.f14624X, "n0", "set_pay_method_promotion_right", "_pay_method_promotion_right", BaseSei.f14625Y, "k0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", BaseSei.f14626Z, "Lv/VLinear;", "g0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "i0", "set_get_privilege_text", "_get_privilege_text", "B", "h0", "set_get_privilege_subtitle", "_get_privilege_subtitle", c4s.C_ZONE, "Landroid/view/View;", "f0", "()Landroid/view/View;", "set_anchor", "_anchor", "D", "p0", "set_stickers", "_stickers", "Ll/kq60;", "Ll/kq60;", "paymentTipsPromotionHelper", "Ll/eq60;", "F", "Ll/eq60;", "paymentTextProcessorsHelper", "Ll/y20;", "Ll/x20;", "vipFragCurrentPagePurchaseType", "Lkotlin/Triple;", "", "J", "Lkotlin/Triple;", "bubble", "K", "bubbleKeyPrefix", "L", "previousBubbleKey", "M", "Landroid/view/ViewGroup;", "N", "Lcom/p1/mobile/putong/data/PayMethod;", "previousPayMethod", BloodType.f39576O, "Z", "getHasPrivilege", "setHasPrivilege", "", "P", "pageState", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yfb0 extends AbstractC18347l5 implements y3m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _get_privilege_subtitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public View _anchor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public kq60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final eq60 paymentTextProcessorsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public y20<PayMethod> onPayTypeSelectAction;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public x20 onNoPrivilegeClick;

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
    public final ndb0 mediator;

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
    public yfb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        this.paymentTextProcessorsHelper = new eq60(act, purchaseType, str);
        this.bubbleKeyPrefix = "VIP_FRAG_BUBBLE_" + purchaseType + "_";
        this.previousBubbleKey = "";
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: W */
    public static void m215526W(Pair pair, yfb0 yfb0Var) {
        CharSequence charSequence = (CharSequence) pair.getFirst();
        if (TextUtils.isEmpty(charSequence)) {
            bnl0.m105524M(yfb0Var.m215548m0(), false);
            bnl0.m105524M(yfb0Var.m215549n0(), false);
        } else if (((Boolean) pair.getSecond()).booleanValue()) {
            bnl0.m105524M(yfb0Var.m215548m0(), true);
            bnl0.m105524M(yfb0Var.m215549n0(), false);
            yfb0Var.m215548m0().setText(charSequence);
        } else {
            bnl0.m105524M(yfb0Var.m215548m0(), false);
            bnl0.m105524M(yfb0Var.m215549n0(), true);
            yfb0Var.m215549n0().setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m215527X(yfb0 yfb0Var) {
        boolean zM215540e0 = yfb0Var.m215540e0();
        C8928d currentPurchaseSection = yfb0Var.getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        fq60 fq60Var = new fq60(currentPurchaseSection, yfb0Var.getCurrentPayMethod(), yfb0Var.getRefundAmount(), zM215540e0);
        yfb0Var.paymentTextProcessorsHelper.m121897d();
        gq60 gq60VarM121894a = yfb0Var.paymentTextProcessorsHelper.m121894a(fq60Var);
        yfb0Var.m152864S(gq60VarM121894a);
        yfb0Var.m215544i0().setText(gq60VarM121894a.getTitle());
        if (TextUtils.isEmpty(gq60VarM121894a.getSticker())) {
            bnl0.m105524M(yfb0Var.m215551p0(), false);
        } else {
            bnl0.m105524M(yfb0Var.m215551p0(), true);
            yfb0Var.m215551p0().setText(gq60VarM121894a.getSticker());
            if (s7a.m184991t()) {
                yfb0Var.m152866V();
            }
        }
        if (TextUtils.isEmpty(gq60VarM121894a.getSubtitle())) {
            bnl0.m105524M(yfb0Var.m215543h0(), false);
        } else {
            bnl0.m105524M(yfb0Var.m215543h0(), true);
            yfb0Var.m215543h0().setText(gq60VarM121894a.getSubtitle());
        }
        yfb0Var.bubble = gq60VarM121894a.m131343b();
        yfb0Var.m215539d0();
    }

    /* JADX INFO: renamed from: Y */
    public static void m215528Y(yfb0 yfb0Var, View view) {
        yfb0Var.m215552q0();
    }

    /* JADX INFO: renamed from: Z */
    public static void m215529Z(yfb0 yfb0Var, View view) {
        if (TEnum.equals(yfb0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        yfb0Var.m152865T();
    }

    /* JADX INFO: renamed from: a0 */
    public static void m215530a0(yfb0 yfb0Var, View view) {
        AbstractC18347l5.m152851y(yfb0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static Boolean m215531b0(yfb0 yfb0Var, C8928d c8928d) {
        c8928d.getClass();
        C8928d.a aVarM152856K = yfb0Var.m152856K(c8928d);
        return (v5b0.m199796v(ProductCategory.tttVip, aVarM152856K.m54784s()) || v5b0.m199796v("svip", aVarM152856K.m54784s())) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m215532r0() {
        PayMethod payMethodM55221u;
        if (wib0.m206565i(this.purchaseType) && s7a.m184986o()) {
            m215550o0().setTextColor(this.act.color(h9c0.f108345O));
            m215546k0().setImageResource(jbc0.f119190D5);
        }
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var == null || (payMethodM55221u = ndb0Var.m55221u()) == null) {
            payMethodM55221u = PayMethod.get("alipay");
        }
        payMethodM55221u.getClass();
        mo120654G(payMethodM55221u);
        this.previousPayMethod = null;
        bnl0.m105509E0(m215545j0(), new View.OnClickListener() { // from class: l.wfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfb0.m215529Z(this.f188782a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    private final void m215533s0() {
        int color;
        int color2;
        int i;
        m215544i0().setTypeface(lyh0.m156283c(3));
        if (wib0.m206565i(this.purchaseType) && s7a.m184986o()) {
            color = this.act.color(h9c0.f108340J);
        } else if (wib0.m206565i(this.purchaseType)) {
            color = Color.parseColor("#ffdea2");
        } else {
            color = wib0.m206571o(this.purchaseType) ? Color.parseColor("#ffffff") : this.act.color(h9c0.f108381m);
        }
        m215544i0().setTextColor(color);
        m215544i0().setText(this.act.string(R$string.f28236b));
        if (wib0.m206565i(this.purchaseType) && s7a.m184986o()) {
            color2 = this.act.color(h9c0.f108340J);
        } else if (wib0.m206565i(this.purchaseType)) {
            color2 = Color.parseColor("#33ffdea2");
        } else {
            color2 = wib0.m206571o(this.purchaseType) ? Color.parseColor("#ffffff") : this.act.color(h9c0.f108395t);
        }
        m215543h0().setTextColor(color2);
        if (wib0.m206565i(this.purchaseType) && s7a.m184986o()) {
            i = jbc0.f119204E5;
        } else if (wib0.m206565i(this.purchaseType)) {
            i = jbc0.f119292K9;
        } else if (wib0.m206571o(this.purchaseType)) {
            i = jbc0.f119306L9;
        } else if (wib0.m206557a(this.purchaseType) || wib0.m206561e(this.purchaseType) || wib0.m206559c(this.purchaseType)) {
            i = jbc0.f119320M9;
        } else if (wib0.m206563g(this.purchaseType)) {
            i = jbc0.f119296L;
        } else {
            i = wib0.m206580x(this.purchaseType) ? jbc0.f119830xb : jbc0.f119334N9;
        }
        m215542g0().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m215534t0() {
        int i;
        m215551p0().setTypeface(lyh0.m156283c(3));
        if (wib0.m206565i(this.purchaseType) && s7a.m184986o()) {
            i = jbc0.f119176C5;
        } else {
            i = wib0.m206563g(this.purchaseType) ? jbc0.f119483Z : jbc0.f119503a6;
        }
        m215551p0().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m215535A0(@Nullable y20<PayMethod> onPayTypeSelectAction) {
        this.onPayTypeSelectAction = onPayTypeSelectAction;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m215536B0() {
        if (this.vipFragCurrentPagePurchaseType != this.purchaseType) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && s7a.m184991t()) {
            m152866V();
        }
        this.pageState = 1;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m215537C0() {
        C4499d.m21895l().m21899k(this.previousBubbleKey);
    }

    @Override // p153l.AbstractC18347l5
    @NotNull
    /* JADX INFO: renamed from: E */
    public String mo120653E() {
        return OMSDialogPositon.p_privileges_view;
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: G */
    public void mo120654G(@NotNull PayMethod currentPayMethod) {
        y20<PayMethod> y20Var;
        currentPayMethod.getClass();
        if (TEnum.equals(currentPayMethod, "unknown_")) {
            return;
        }
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m215550o0().setText(R$string.f28201X9);
            m215547l0().setImageResource((wib0.m206565i(this.purchaseType) && s7a.m184986o()) ? jbc0.f119684n5 : jbc0.f119577fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m215550o0().setText("京东支付");
            m215547l0().setImageResource((wib0.m206565i(this.purchaseType) && s7a.m184986o()) ? jbc0.f119670m5 : jbc0.f119563ea);
        } else {
            m215550o0().setText((wib0.m206565i(this.purchaseType) || wib0.m206571o(this.purchaseType) || !CoreModule.m30933P().m143405a().mo34527j3()) ? this.act.string(R$string.f28135R9) : this.act.string(R$string.f28308h));
            m215547l0().setImageResource((wib0.m206565i(this.purchaseType) && s7a.m184986o()) ? jbc0.f119656l5 : jbc0.f119549da);
        }
        PayMethod payMethod = this.previousPayMethod;
        if (payMethod != null && !TEnum.equals(payMethod, currentPayMethod) && (y20Var = this.onPayTypeSelectAction) != null) {
            y20Var.call(currentPayMethod);
        }
        this.previousPayMethod = currentPayMethod;
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: H */
    public void mo120655H() {
        if (getCurrentPurchaseSection() == null || this.hasPrivilege) {
            return;
        }
        m215544i0().post(new Runnable() { // from class: l.ufb0
            @Override // java.lang.Runnable
            public final void run() {
                yfb0.m215527X(this.f178748a);
            }
        });
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: I */
    public void mo120656I(@NotNull PayMethod currentPayMethod, @NotNull C8928d section) {
        currentPayMethod.getClass();
        section.getClass();
        if (this.paymentTipsPromotionHelper == null) {
            this.paymentTipsPromotionHelper = new kq60(this.purchaseType, this.from);
        }
        kq60 kq60Var = this.paymentTipsPromotionHelper;
        kq60 kq60Var2 = null;
        if (kq60Var == null) {
            Intrinsics.m88391r("paymentTipsPromotionHelper");
            kq60Var = null;
        }
        if (kq60Var.getPurchaseType() != m152875t()) {
            this.paymentTipsPromotionHelper = new kq60(m152875t(), this.from);
        }
        kq60 kq60Var3 = this.paymentTipsPromotionHelper;
        if (kq60Var3 == null) {
            Intrinsics.m88391r("paymentTipsPromotionHelper");
        } else {
            kq60Var2 = kq60Var3;
        }
        final Pair<CharSequence, Boolean> pairM150822b = kq60Var2.m150822b(currentPayMethod, section, mo152852B());
        m215548m0().post(new Runnable() { // from class: l.vfb0
            @Override // java.lang.Runnable
            public final void run() {
                yfb0.m215526W(pairM150822b, this);
            }
        });
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162495T1, root, false);
        viewInflate.getClass();
        m215538c0(viewInflate);
        m215532r0();
        m215534t0();
        m215533s0();
        return viewInflate;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m215538c0(View view) {
        zfb0.m219534a(this, view);
    }

    @Override // p153l.AbstractC18347l5, p153l.y3m
    /* JADX INFO: renamed from: d */
    public boolean mo37060d() {
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m215539d0() {
        String first;
        String third;
        if (this.vipFragCurrentPagePurchaseType != this.purchaseType) {
            m215537C0();
            return;
        }
        Triple<String, Long, String> triple = this.bubble;
        String str = "";
        if (triple == null || (first = triple.getFirst()) == null) {
            first = "";
        }
        Triple<String, Long, String> triple2 = this.bubble;
        long jLongValue = triple2 != null ? triple2.getSecond().longValue() : 0L;
        Triple<String, Long, String> triple3 = this.bubble;
        if (triple3 != null && (third = triple3.getThird()) != null) {
            str = third;
        }
        if (TextUtils.isEmpty(first) || jLongValue <= 0) {
            m215537C0();
            return;
        }
        String str2 = this.bubbleKeyPrefix + str;
        if (TextUtils.equals(this.previousBubbleKey, str2) && C4499d.m21895l().m21911x(str2)) {
            return;
        }
        m215537C0();
        C4496a c4496a = new C4496a(this.act);
        ViewGroup viewGroup = this._root;
        if (viewGroup == null) {
            Intrinsics.m88391r("_root");
            viewGroup = null;
        }
        C4496a c4496aM21881x = c4496a.m21845A(viewGroup).m21846B(0).m21848D(first).m21860b(jLongValue).m21874q(C4496a.f16402Q | C4496a.f16401P).m21854J(12.0f).m21849E(true).m21869k(this.act.color(h9c0.f108379l)).m21851G(h9c0.f108398u0).m21878u(0).m21852H(txq.m193530c(12), txq.m193530c(10), txq.m193530c(12), txq.m193530c(10)).m21870l(txq.m193530c(7)).m21873p(75).m21881x(txq.m193530c(2) * (-1));
        this.previousBubbleKey = str2;
        C4499d.m21895l().m21908u(c4496aM21881x, m215541f0(), str2);
    }

    @Override // p153l.AbstractC18347l5, p153l.y3m
    /* JADX INFO: renamed from: e */
    public boolean mo37061e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m215540e0() {
        if (!wib0.m206579w(m152875t()) && !wib0.m206573q(m152875t())) {
            return true;
        }
        ndb0 ndb0Var = this.mediator;
        return ((C8928d) jyb.m147529r(ndb0Var != null ? ndb0Var.m55198M() : null, new qcj() { // from class: l.xfb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yfb0.m215531b0(this.f194020a, (C8928d) obj);
            }
        })) == null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final View m215541f0() {
        View view = this._anchor;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_anchor");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m215542g0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m215543h0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m215544i0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final LinearLayout m215545j0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VImage m215546k0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VImage m215547l0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m215548m0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText m215549n0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText m215550o0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VText m215551p0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m215552q0() {
        x20 x20Var = this.onNoPrivilegeClick;
        if (x20Var != null) {
            x20Var.call();
        }
        i4g0.m138523u("e_buy_privilege_button", this.act.pageId(), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.from)), jyb.m147494Y("productType", mib0.m158482k(this.purchaseType)), jyb.m147494Y("is_privileged", gul0.m132339d(this.purchaseType)));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m215553u0(boolean hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
        if (!hasPrivilege) {
            m215554v0();
        } else {
            m215555w0();
            m152855J();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m215554v0() {
        bnl0.m105524M(m215545j0(), true);
        mo120654G(getCurrentPayMethod());
        C8928d currentPurchaseSection = getCurrentPurchaseSection();
        if (currentPurchaseSection != null) {
            mo120656I(getCurrentPayMethod(), currentPurchaseSection);
        }
        ViewGroup.LayoutParams layoutParams = m215542g0().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = txq.m193530c(6);
        m215542g0().setLayoutParams(c0221a);
        mo120655H();
        bnl0.m105509E0(m215542g0(), new View.OnClickListener() { // from class: l.tfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfb0.m215530a0(this.f173941a, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m215555w0() {
        bnl0.m105524M(m215545j0(), false);
        bnl0.m105524M(m215551p0(), false);
        m215544i0().setText(R$string.f28198X6);
        bnl0.m105524M(m215543h0(), false);
        ViewGroup.LayoutParams layoutParams = m215542g0().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = txq.m193530c(12);
        m215542g0().setLayoutParams(c0221a);
        bnl0.m105509E0(m215542g0(), new View.OnClickListener() { // from class: l.sfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfb0.m215528Y(this.f167682a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final void m215556x0(@NotNull ViewGroup _root) {
        _root.getClass();
        this._root = _root;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m215557y0(@NotNull PurchaseType currentPagePurchaseType) {
        currentPagePurchaseType.getClass();
        this.vipFragCurrentPagePurchaseType = currentPagePurchaseType;
        m215536B0();
        m215539d0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m215558z0(@Nullable x20 onNoPrivilegeClick) {
        this.onNoPrivilegeClick = onNoPrivilegeClick;
    }
}
