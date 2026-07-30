package com.p051p1.mobile.putong.core.p058ui.purchase.mediator;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.brq0;
import p153l.jn60;
import p153l.jyb;
import p153l.k8f0;
import p153l.kcg0;
import p153l.lib0;
import p153l.ory;
import p153l.p7f;
import p153l.pbb0;
import p153l.pr3;
import p153l.psd0;
import p153l.qcj;
import p153l.s7a;
import p153l.tab0;
import p153l.v5b0;
import p153l.wib0;
import p153l.xl60;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001:\u0005hu!plB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000bH\u0004¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020\u0010¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u0004\u0018\u00010?¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010\u0017J\u001d\u0010F\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\bF\u0010\u000fJ3\u0010J\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0006\u0010H\u001a\u00020*2\b\b\u0002\u0010I\u001a\u00020*H\u0004¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bR\u0010SJ\u0015\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\r2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020x0\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010yR(\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b(\u0010y\u001a\u0004\b{\u0010\u001f\"\u0004\b|\u0010\u000fR\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010\u007fR\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010yR!\u0010\u0085\u0001\u001a\u000b \u0083\u0001*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0088\u0001R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010qR\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001R\u0019\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u008e\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020T0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010yR\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010yR\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010yR\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010yR\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020d0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010yR\u0013\u0010\u0095\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010>¨\u0006\u0096\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", p7f.LATITUDE_SOUTH, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "u", "()Lcom/p1/mobile/putong/data/PayMethod;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", ResourceDirection.f39656v, "()V", "w", "L", Careers.f39580it, "payMethod", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Lcom/p1/mobile/putong/data/PayMethod;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "agreementState", "e", "(Ljava/util/List;Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "j", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "g", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "section", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "R", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Z", "M", BLiveStormDanmakuGiftResourceType.f45292l, "m", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "selectCouponId", "Q", "(Ljava/lang/String;)V", "Ll/lib0;", "q", "()Ll/lib0;", "purchaseTrack", "P", "(Ll/lib0;)V", BaseSei.f14624X, "()Z", "Ll/pbb0;", "extra", "N", "(Ll/pbb0;)V", "o", "()Ll/pbb0;", "K", "E", "sectionWithExtra", "scroll", "isClick", "B", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)Z", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "D", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)Z", "Ll/jn60;", "paymentHandlerData", "A", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "iPayMethod", "F", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "iPurchaseSectionListener", "I", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "iPurchaseSectionsListListener", "J", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "iPurchaseSectionCheckStateListener", "H", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "iPurchasePaymentClickListener", "G", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;)V", "a", "Lcom/p1/mobile/android/app/Act;", "k", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/kcg0;", Constants.INAPP_DATA_TAG, "Ll/kcg0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ljava/util/List;", "merchandises", "p", BloodType.f39576O, "purchaseSectionsSource", "Ll/k8f0;", "Ll/k8f0;", "showcaseNewFilterChain", "", "renderSections", "kotlin.jvm.PlatformType", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "currentAgreementState", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "currentPurchaseSectionWithExtra", "currentUsedPurchaseSection", "Ll/pbb0;", "purchaseExtra", "Ll/lib0;", "payMethodListeners", "purchaseSectionsListeners", "purchaseSectionsListListeners", "purchaseSectionCheckSateListeners", "purchasePaymentClickListeners", BaseSei.f14625Y, "isSectionsInitialized", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class AbstractC8939a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public kcg0 merchandiseSubs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List<? extends Merchandise> merchandises;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public List<? extends C8928d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public k8f0 showcaseNewFilterChain;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<C8928d> renderSections;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public PurchaseAgreementState currentAgreementState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSectionWithExtra;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public C8928d currentUsedPurchaseSection;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public String selectCouponId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public pbb0 purchaseExtra;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public lib0 purchaseTrack;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public List<a> payMethodListeners;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public List<d> purchaseSectionsListeners;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public List<e> purchaseSectionsListListeners;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public List<c> purchaseSectionCheckSateListeners;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public List<b> purchasePaymentClickListeners;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo55227a(@NotNull PayMethod payMethod);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$b */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo55181a(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$c */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo55228a(@NotNull PurchaseAgreementState agreementState);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$d */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo55180a(@NotNull C8928d section, boolean scroll, boolean isClick, @Nullable C8928d sectionSource);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$e */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo55179a(@NotNull List<? extends C8928d> sections);
    }

    public AbstractC8939a(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.renderSections = new ArrayList();
        this.currentPayMethod = PayMethod.get("unknown_");
        this.currentAgreementState = PurchaseAgreementState.UNKNOWN_;
        this.payMethodListeners = new ArrayList();
        this.purchaseSectionsListeners = new ArrayList();
        this.purchaseSectionsListListeners = new ArrayList();
        this.purchaseSectionCheckSateListeners = new ArrayList();
        this.purchasePaymentClickListeners = new ArrayList();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m55182C(AbstractC8939a abstractC8939a, C8928d c8928d, C8928d c8928d2, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: notifyPurchaseSection");
            return false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return abstractC8939a.m55188B(c8928d, c8928d2, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m55183a(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m55184b(AbstractC8939a abstractC8939a, C8928d c8928d) {
        c8928d.getClass();
        return Boolean.valueOf(v5b0.m199784j(c8928d.m54714m() ? c8928d.m54703b().m54784s() : c8928d.m54705d().m54784s(), abstractC8939a.selectCouponId));
    }

    /* JADX INFO: renamed from: c */
    public static void m55185c(AbstractC8939a abstractC8939a, List list) throws Exception {
        list.getClass();
        abstractC8939a.merchandises = list;
        abstractC8939a.m55200O(new ory(abstractC8939a.act, abstractC8939a.purchaseType).m168946c(list));
        abstractC8939a.m55222v();
        abstractC8939a.m55197L();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m55186d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m55187A(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        Iterator<b> it = this.purchasePaymentClickListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55181a(paymentHandlerData, purchaseType);
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m55188B(@NotNull C8928d section, @Nullable C8928d sectionWithExtra, boolean scroll, boolean isClick) {
        section.getClass();
        if (m55219s(sectionWithExtra == null ? section : sectionWithExtra)) {
            return false;
        }
        this.currentPurchaseSection = section;
        this.currentPurchaseSectionWithExtra = sectionWithExtra;
        this.currentUsedPurchaseSection = sectionWithExtra == null ? section : sectionWithExtra;
        Iterator<d> it = this.purchaseSectionsListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55180a(sectionWithExtra == null ? section : sectionWithExtra, scroll, isClick, sectionWithExtra == null ? null : section);
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m55189D(@NotNull PurchaseAgreementState agreementState) {
        agreementState.getClass();
        if (this.currentAgreementState == agreementState) {
            return false;
        }
        this.currentAgreementState = agreementState;
        Iterator<c> it = this.purchaseSectionCheckSateListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55228a(agreementState);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m55190E(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        this.renderSections.clear();
        this.renderSections.addAll(sections);
        Iterator<e> it = this.purchaseSectionsListListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55179a(sections);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m55191F(@NotNull a iPayMethod) {
        iPayMethod.getClass();
        if (this.payMethodListeners.contains(iPayMethod)) {
            return;
        }
        this.payMethodListeners.add(iPayMethod);
    }

    /* JADX INFO: renamed from: G */
    public final void m55192G(@NotNull b iPurchasePaymentClickListener) {
        iPurchasePaymentClickListener.getClass();
        if (this.purchasePaymentClickListeners.contains(iPurchasePaymentClickListener)) {
            return;
        }
        this.purchasePaymentClickListeners.add(iPurchasePaymentClickListener);
    }

    /* JADX INFO: renamed from: H */
    public final void m55193H(@NotNull c iPurchaseSectionCheckStateListener) {
        iPurchaseSectionCheckStateListener.getClass();
        if (this.purchaseSectionCheckSateListeners.contains(iPurchaseSectionCheckStateListener)) {
            return;
        }
        this.purchaseSectionCheckSateListeners.add(iPurchaseSectionCheckStateListener);
    }

    /* JADX INFO: renamed from: I */
    public final void m55194I(@NotNull d iPurchaseSectionListener) {
        iPurchaseSectionListener.getClass();
        if (this.purchaseSectionsListeners.contains(iPurchaseSectionListener)) {
            return;
        }
        this.purchaseSectionsListeners.add(iPurchaseSectionListener);
    }

    /* JADX INFO: renamed from: J */
    public final void m55195J(@NotNull e iPurchaseSectionsListListener) {
        iPurchaseSectionsListListener.getClass();
        if (this.purchaseSectionsListListeners.contains(iPurchaseSectionsListListener)) {
            return;
        }
        this.purchaseSectionsListListeners.add(iPurchaseSectionsListListener);
    }

    /* JADX INFO: renamed from: K */
    public void m55196K() {
        psd0.m173633z(this.merchandiseSubs);
        this.merchandiseSubs = null;
        pbb0 pbb0Var = this.purchaseExtra;
        if (pbb0Var != null) {
            pbb0Var.m171506n();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m55197L() throws Exception {
        pbb0 pbb0Var;
        PayMethod payMethodM55221u = m55221u();
        PurchaseAgreementState purchaseAgreementStateMo55220t = mo55220t();
        List<C8928d> listM55209i = m55209i();
        m55204S(listM55209i);
        mo55205e(listM55209i, payMethodM55221u, purchaseAgreementStateMo55220t);
        C8928d c8928dM55210j = m55210j(listM55209i);
        pbb0 pbb0Var2 = this.purchaseExtra;
        C8928d c8928dM171501i = null;
        if (pbb0Var2 != null && pbb0Var2.getIsExtraSelected() && c8928dM55210j != null && (pbb0Var = this.purchaseExtra) != null) {
            c8928dM171501i = pbb0Var.m171501i(c8928dM55210j);
        }
        if (c8928dM55210j != null) {
            m55226z(m55208h(c8928dM171501i == null ? c8928dM55210j : c8928dM171501i, payMethodM55221u));
            m55189D(purchaseAgreementStateMo55220t);
            m55190E(listM55209i);
            m55182C(this, c8928dM55210j, c8928dM171501i, false, false, 8, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<C8928d> m55198M() {
        return this.renderSections;
    }

    /* JADX INFO: renamed from: N */
    public final void m55199N(@NotNull pbb0 extra) {
        extra.getClass();
        this.purchaseExtra = extra;
    }

    /* JADX INFO: renamed from: O */
    public final void m55200O(@NotNull List<? extends C8928d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }

    /* JADX INFO: renamed from: P */
    public final void m55201P(@Nullable lib0 purchaseTrack) {
        this.purchaseTrack = purchaseTrack;
    }

    /* JADX INFO: renamed from: Q */
    public final void m55202Q(@Nullable String selectCouponId) {
        this.selectCouponId = selectCouponId;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m55203R(@NotNull C8928d section, @Nullable PayMethod payMethod) {
        section.getClass();
        if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            return false;
        }
        if (TEnum.equals(payMethod, "alipay") && CoreModule.m30933P().m143405a().mo34527j3() && CoreModule.f18264c.f20333O0.m31084u3(this.purchaseType)) {
            return false;
        }
        if (wib0.m206565i(this.purchaseType) && NullChecker.m82486a(section.m54703b()) && section.m54703b().m54784s().yearly()) {
            return false;
        }
        if (wib0.m206565i(this.purchaseType) && !m55224x() && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        if (wib0.m206571o(this.purchaseType) && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        return (wib0.m206569m(this.purchaseType) && TEnum.equals(payMethod, "wechat")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x001b A[SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public final void m55204S(List<? extends C8928d> sections) {
        int iM147476G;
        List<Coupon> list;
        if (s7a.m184981j() && TextUtils.isEmpty(this.selectCouponId)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : sections) {
                C8928d c8928d = (C8928d) obj;
                if (!c8928d.m54714m()) {
                    List<Coupon> list2 = c8928d.m54705d().m54784s().localCoupons;
                    list2.getClass();
                    if (list2.isEmpty()) {
                        if (c8928d.m54714m()) {
                            list = c8928d.m54703b().m54784s().localCoupons;
                            list.getClass();
                            if (!list.isEmpty()) {
                            }
                        }
                    }
                    arrayList.add(obj);
                } else if (c8928d.m54714m()) {
                    list = c8928d.m54703b().m54784s().localCoupons;
                    list.getClass();
                    if (!list.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (NullChecker.m82486a(arrayList) && !arrayList.isEmpty()) {
                Merchandise merchandiseM54784s = ((C8928d) arrayList.get(0)).m54714m() ? ((C8928d) arrayList.get(0)).m54703b().m54784s() : ((C8928d) arrayList.get(0)).m54705d().m54784s();
                if (NullChecker.m82486a(merchandiseM54784s)) {
                    List<Coupon> list3 = merchandiseM54784s.localCoupons;
                    list3.getClass();
                    if (!list3.isEmpty()) {
                        this.selectCouponId = merchandiseM54784s.localCoupons.get(0).couponID;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.selectCouponId) || (iM147476G = jyb.m147476G(sections, new qcj() { // from class: l.d5
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return AbstractC8939a.m55184b(this.f85089a, (C8928d) obj2);
            }
        })) < 0) {
            return;
        }
        Iterator<T> it = sections.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ((C8928d) it.next()).m54723v(i == iM147476G);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo55205e(@NotNull List<? extends C8928d> sections, @NotNull PayMethod payMethod, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        payMethod.getClass();
        agreementState.getClass();
        if (m55224x()) {
            return;
        }
        for (C8928d c8928d : sections) {
            if (m55203R(c8928d, payMethod)) {
                c8928d.m54724w(agreementState == PurchaseAgreementState.CHECKED);
            } else {
                c8928d.m54724w(false);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo55206f(@NotNull C8928d section, @NotNull PurchaseAgreementState agreementState) {
        section.getClass();
        agreementState.getClass();
        if (m55224x()) {
            section.m54724w(true);
        } else {
            section.m54724w(agreementState == PurchaseAgreementState.CHECKED);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m55207g(@NotNull List<? extends C8928d> sections, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        agreementState.getClass();
        Iterator<? extends C8928d> it = sections.iterator();
        while (it.hasNext()) {
            mo55206f(it.next(), agreementState);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final PayMethod m55208h(@NotNull C8928d it, @NotNull PayMethod payMethod) {
        it.getClass();
        payMethod.getClass();
        if (wib0.m206560d(this.purchaseType)) {
            List<PayMethod> listM189833x = tab0.m189811h().m189833x(it.m54715n() ? it.m54703b().m54784s() : it.m54705d().m54784s());
            listM189833x.getClass();
            if (!listM189833x.contains(payMethod)) {
                PayMethod payMethod2 = listM189833x.get(0);
                payMethod2.getClass();
                PayMethod payMethod3 = payMethod2;
                for (PayMethod payMethod4 : listM189833x) {
                    if ((TEnum.equals(payMethod4, "alipay") && xl60.m211507l()) || ((TEnum.equals(payMethod4, "wechat") && xl60.m211512q()) || (TEnum.equals(payMethod4, PayMethod.jingdong) && xl60.m211509n()))) {
                        payMethod4.getClass();
                        return payMethod4;
                    }
                }
                return payMethod3;
            }
        }
        return payMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<C8928d> m55209i() {
        k8f0 k8f0Var = this.showcaseNewFilterChain;
        if (k8f0Var == null) {
            Intrinsics.m88391r("showcaseNewFilterChain");
            k8f0Var = null;
        }
        return k8f0Var.m148706m(m55216p());
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final C8928d m55210j(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        for (C8928d c8928d : sections) {
            if (c8928d.m54713l()) {
                return c8928d;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final PurchaseAgreementState getCurrentAgreementState() {
        return this.currentAgreementState;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final PayMethod m55213m() {
        PayMethod payMethod = this.currentPayMethod;
        payMethod.getClass();
        return payMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C8928d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final pbb0 getPurchaseExtra() {
        return this.purchaseExtra;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<C8928d> m55216p() {
        List list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.m88391r("purchaseSectionsSource");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final lib0 getPurchaseTrack() {
        return this.purchaseTrack;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m55219s(@NotNull C8928d section) {
        C8928d c8928d;
        section.getClass();
        return Intrinsics.m88377d(this.currentUsedPurchaseSection, section) && (c8928d = this.currentUsedPurchaseSection) != null && section.m54714m() == c8928d.m54714m();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public PurchaseAgreementState mo55220t() {
        return m55224x() ? PurchaseAgreementState.UNCHECKED : PurchaseAgreementState.CHECKED;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final PayMethod m55221u() {
        if (xl60.m211507l()) {
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            return payMethod;
        }
        PayMethod payMethod2 = PayMethod.get("wechat");
        payMethod2.getClass();
        return payMethod2;
    }

    /* JADX INFO: renamed from: v */
    public final void m55222v() {
        if (this.showcaseNewFilterChain == null) {
            this.showcaseNewFilterChain = new k8f0(this.purchaseType, this.from);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo55223w() {
        m55196K();
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8939a.m55183a((List) obj);
            }
        };
        this.merchandiseSubs = c22421cDuringCreated.filter(new qcj() { // from class: l.b5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AbstractC8939a.m55186d(function1, obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.c5
            @Override // p153l.y20
            public final void call(Object obj) throws Exception {
                AbstractC8939a.m55185c(this.f79748a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m55224x() {
        return tab0.m189811h().m189835z() && !C8929e.m54833x(this.from);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m55225y() {
        return this.purchaseSectionsSource != null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m55226z(@NotNull PayMethod payMethod) throws Exception {
        payMethod.getClass();
        if (TEnum.equals(payMethod, this.currentPayMethod)) {
            return false;
        }
        this.currentPayMethod = payMethod;
        if (TEnum.equals(payMethod, "unknown_")) {
            brq0.m106161a("current pay method is unknown!!!");
            return false;
        }
        Iterator<a> it = this.payMethodListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55227a(payMethod);
        }
        return true;
    }
}
