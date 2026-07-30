package com.p046p1.mobile.putong.core.p053ui.purchase.mediator;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p149l.c4g0;
import p149l.d0f0;
import p149l.e30;
import p149l.ef60;
import p149l.g6a;
import p149l.hab0;
import p149l.j6f;
import p149l.l3b0;
import p149l.mkd0;
import p149l.p2b0;
import p149l.qq3;
import p149l.riy;
import p149l.rxa0;
import p149l.sab0;
import p149l.sd60;
import p149l.vwb;
import p149l.w9j;
import p149l.whq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001:\u0005hu!plB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000bH\u0004¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020\u0010¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u0004\u0018\u00010?¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010\u0017J\u001d\u0010F\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\bF\u0010\u000fJ3\u0010J\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0006\u0010H\u001a\u00020*2\b\b\u0002\u0010I\u001a\u00020*H\u0004¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bR\u0010SJ\u0015\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\r2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020x0\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010yR(\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b(\u0010y\u001a\u0004\b{\u0010\u001f\"\u0004\b|\u0010\u000fR\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010\u007fR\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010yR!\u0010\u0085\u0001\u001a\u000b \u0083\u0001*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0088\u0001R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010qR\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001R\u0019\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u008e\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020T0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010yR\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010yR\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010yR\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010yR\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020d0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010yR\u0013\u0010\u0095\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010>¨\u0006\u0096\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", j6f.LATITUDE_SOUTH, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "u", "()Lcom/p1/mobile/putong/data/PayMethod;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", ResourceDirection.f38808v, "()V", "w", "L", Careers.f38732it, "payMethod", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Lcom/p1/mobile/putong/data/PayMethod;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "agreementState", "e", "(Ljava/util/List;Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "j", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "g", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "section", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "R", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Z", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Z", "M", BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "selectCouponId", "Q", "(Ljava/lang/String;)V", "Ll/hab0;", "q", "()Ll/hab0;", "purchaseTrack", "P", "(Ll/hab0;)V", BaseSei.f13930X, "()Z", "Ll/l3b0;", "extra", "N", "(Ll/l3b0;)V", "o", "()Ll/l3b0;", "K", "E", "sectionWithExtra", "scroll", "isClick", "B", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)Z", BaseSei.f13932Z, "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "D", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)Z", "Ll/ef60;", "paymentHandlerData", "A", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "iPayMethod", "F", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "iPurchaseSectionListener", "I", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "iPurchaseSectionsListListener", "J", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "iPurchaseSectionCheckStateListener", "H", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "iPurchasePaymentClickListener", "G", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;)V", "a", "Lcom/p1/mobile/android/app/Act;", "k", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/c4g0;", Constants.INAPP_DATA_TAG, "Ll/c4g0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ljava/util/List;", "merchandises", "p", BloodType.f38728O, "purchaseSectionsSource", "Ll/d0f0;", "Ll/d0f0;", "showcaseNewFilterChain", "", "renderSections", "kotlin.jvm.PlatformType", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "currentAgreementState", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "currentPurchaseSectionWithExtra", "currentUsedPurchaseSection", "Ll/l3b0;", "purchaseExtra", "Ll/hab0;", "payMethodListeners", "purchaseSectionsListeners", "purchaseSectionsListListeners", "purchaseSectionCheckSateListeners", "purchasePaymentClickListeners", BaseSei.f13931Y, "isSectionsInitialized", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class AbstractC8776a {

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
    public c4g0 merchandiseSubs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List<? extends Merchandise> merchandises;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public List<? extends C8765d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public d0f0 showcaseNewFilterChain;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<C8765d> renderSections;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public PurchaseAgreementState currentAgreementState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSectionWithExtra;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public C8765d currentUsedPurchaseSection;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public String selectCouponId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public l3b0 purchaseExtra;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrack;

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
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo54044a(@NotNull PayMethod payMethod);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$b */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo53998a(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$c */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo54045a(@NotNull PurchaseAgreementState agreementState);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$d */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo53997a(@NotNull C8765d section, boolean scroll, boolean isClick, @Nullable C8765d sectionSource);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$e */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo53996a(@NotNull List<? extends C8765d> sections);
    }

    public AbstractC8776a(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
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
    public static /* synthetic */ boolean m53999C(AbstractC8776a abstractC8776a, C8765d c8765d, C8765d c8765d2, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: notifyPurchaseSection");
            return false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return abstractC8776a.m54005B(c8765d, c8765d2, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m54000a(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m54001b(AbstractC8776a abstractC8776a, C8765d c8765d) {
        c8765d.getClass();
        return Boolean.valueOf(rxa0.m181489j(c8765d.m53531m() ? c8765d.m53520b().m53601s() : c8765d.m53522d().m53601s(), abstractC8776a.selectCouponId));
    }

    /* JADX INFO: renamed from: c */
    public static void m54002c(AbstractC8776a abstractC8776a, List list) throws Exception {
        list.getClass();
        abstractC8776a.merchandises = list;
        abstractC8776a.m54017O(new riy(abstractC8776a.act, abstractC8776a.purchaseType).m179537c(list));
        abstractC8776a.m54039v();
        abstractC8776a.m54014L();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m54003d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m54004A(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        Iterator<b> it = this.purchasePaymentClickListeners.iterator();
        while (it.hasNext()) {
            it.next().mo53998a(paymentHandlerData, purchaseType);
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m54005B(@NotNull C8765d section, @Nullable C8765d sectionWithExtra, boolean scroll, boolean isClick) {
        section.getClass();
        if (m54036s(sectionWithExtra == null ? section : sectionWithExtra)) {
            return false;
        }
        this.currentPurchaseSection = section;
        this.currentPurchaseSectionWithExtra = sectionWithExtra;
        this.currentUsedPurchaseSection = sectionWithExtra == null ? section : sectionWithExtra;
        Iterator<d> it = this.purchaseSectionsListeners.iterator();
        while (it.hasNext()) {
            it.next().mo53997a(sectionWithExtra == null ? section : sectionWithExtra, scroll, isClick, sectionWithExtra == null ? null : section);
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m54006D(@NotNull PurchaseAgreementState agreementState) {
        agreementState.getClass();
        if (this.currentAgreementState == agreementState) {
            return false;
        }
        this.currentAgreementState = agreementState;
        Iterator<c> it = this.purchaseSectionCheckSateListeners.iterator();
        while (it.hasNext()) {
            it.next().mo54045a(agreementState);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m54007E(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        this.renderSections.clear();
        this.renderSections.addAll(sections);
        Iterator<e> it = this.purchaseSectionsListListeners.iterator();
        while (it.hasNext()) {
            it.next().mo53996a(sections);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m54008F(@NotNull a iPayMethod) {
        iPayMethod.getClass();
        if (this.payMethodListeners.contains(iPayMethod)) {
            return;
        }
        this.payMethodListeners.add(iPayMethod);
    }

    /* JADX INFO: renamed from: G */
    public final void m54009G(@NotNull b iPurchasePaymentClickListener) {
        iPurchasePaymentClickListener.getClass();
        if (this.purchasePaymentClickListeners.contains(iPurchasePaymentClickListener)) {
            return;
        }
        this.purchasePaymentClickListeners.add(iPurchasePaymentClickListener);
    }

    /* JADX INFO: renamed from: H */
    public final void m54010H(@NotNull c iPurchaseSectionCheckStateListener) {
        iPurchaseSectionCheckStateListener.getClass();
        if (this.purchaseSectionCheckSateListeners.contains(iPurchaseSectionCheckStateListener)) {
            return;
        }
        this.purchaseSectionCheckSateListeners.add(iPurchaseSectionCheckStateListener);
    }

    /* JADX INFO: renamed from: I */
    public final void m54011I(@NotNull d iPurchaseSectionListener) {
        iPurchaseSectionListener.getClass();
        if (this.purchaseSectionsListeners.contains(iPurchaseSectionListener)) {
            return;
        }
        this.purchaseSectionsListeners.add(iPurchaseSectionListener);
    }

    /* JADX INFO: renamed from: J */
    public final void m54012J(@NotNull e iPurchaseSectionsListListener) {
        iPurchaseSectionsListListener.getClass();
        if (this.purchaseSectionsListListeners.contains(iPurchaseSectionsListListener)) {
            return;
        }
        this.purchaseSectionsListListeners.add(iPurchaseSectionsListListener);
    }

    /* JADX INFO: renamed from: K */
    public void m54013K() {
        mkd0.m154992z(this.merchandiseSubs);
        this.merchandiseSubs = null;
        l3b0 l3b0Var = this.purchaseExtra;
        if (l3b0Var != null) {
            l3b0Var.m148385n();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m54014L() throws Exception {
        l3b0 l3b0Var;
        PayMethod payMethodM54038u = m54038u();
        PurchaseAgreementState purchaseAgreementStateMo54037t = mo54037t();
        List<C8765d> listM54026i = m54026i();
        m54021S(listM54026i);
        mo54022e(listM54026i, payMethodM54038u, purchaseAgreementStateMo54037t);
        C8765d c8765dM54027j = m54027j(listM54026i);
        l3b0 l3b0Var2 = this.purchaseExtra;
        C8765d c8765dM148380i = null;
        if (l3b0Var2 != null && l3b0Var2.getIsExtraSelected() && c8765dM54027j != null && (l3b0Var = this.purchaseExtra) != null) {
            c8765dM148380i = l3b0Var.m148380i(c8765dM54027j);
        }
        if (c8765dM54027j != null) {
            m54043z(m54025h(c8765dM148380i == null ? c8765dM54027j : c8765dM148380i, payMethodM54038u));
            m54006D(purchaseAgreementStateMo54037t);
            m54007E(listM54026i);
            m53999C(this, c8765dM54027j, c8765dM148380i, false, false, 8, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<C8765d> m54015M() {
        return this.renderSections;
    }

    /* JADX INFO: renamed from: N */
    public final void m54016N(@NotNull l3b0 extra) {
        extra.getClass();
        this.purchaseExtra = extra;
    }

    /* JADX INFO: renamed from: O */
    public final void m54017O(@NotNull List<? extends C8765d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }

    /* JADX INFO: renamed from: P */
    public final void m54018P(@Nullable hab0 purchaseTrack) {
        this.purchaseTrack = purchaseTrack;
    }

    /* JADX INFO: renamed from: Q */
    public final void m54019Q(@Nullable String selectCouponId) {
        this.selectCouponId = selectCouponId;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m54020R(@NotNull C8765d section, @Nullable PayMethod payMethod) {
        section.getClass();
        if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            return false;
        }
        if (TEnum.equals(payMethod, "alipay") && CoreModule.m29935P().m94651a().mo33524j3() && CoreModule.f17545c.f19591O0.m30086u3(this.purchaseType)) {
            return false;
        }
        if (sab0.m182891i(this.purchaseType) && NullChecker.m81303a(section.m53520b()) && section.m53520b().m53601s().yearly()) {
            return false;
        }
        if (sab0.m182891i(this.purchaseType) && !m54041x() && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        if (sab0.m182897o(this.purchaseType) && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        return (sab0.m182895m(this.purchaseType) && TEnum.equals(payMethod, "wechat")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x001b A[SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public final void m54021S(List<? extends C8765d> sections) {
        int iM200293G;
        List<Coupon> list;
        if (g6a.m124561j() && TextUtils.isEmpty(this.selectCouponId)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : sections) {
                C8765d c8765d = (C8765d) obj;
                if (!c8765d.m53531m()) {
                    List<Coupon> list2 = c8765d.m53522d().m53601s().localCoupons;
                    list2.getClass();
                    if (list2.isEmpty()) {
                        if (c8765d.m53531m()) {
                            list = c8765d.m53520b().m53601s().localCoupons;
                            list.getClass();
                            if (!list.isEmpty()) {
                            }
                        }
                    }
                    arrayList.add(obj);
                } else if (c8765d.m53531m()) {
                    list = c8765d.m53520b().m53601s().localCoupons;
                    list.getClass();
                    if (!list.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (NullChecker.m81303a(arrayList) && !arrayList.isEmpty()) {
                Merchandise merchandiseM53601s = ((C8765d) arrayList.get(0)).m53531m() ? ((C8765d) arrayList.get(0)).m53520b().m53601s() : ((C8765d) arrayList.get(0)).m53522d().m53601s();
                if (NullChecker.m81303a(merchandiseM53601s)) {
                    List<Coupon> list3 = merchandiseM53601s.localCoupons;
                    list3.getClass();
                    if (!list3.isEmpty()) {
                        this.selectCouponId = merchandiseM53601s.localCoupons.get(0).couponID;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.selectCouponId) || (iM200293G = vwb.m200293G(sections, new w9j() { // from class: l.f5
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return AbstractC8776a.m54001b(this.f94945a, (C8765d) obj2);
            }
        })) < 0) {
            return;
        }
        Iterator<T> it = sections.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ((C8765d) it.next()).m53540v(i == iM200293G);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo54022e(@NotNull List<? extends C8765d> sections, @NotNull PayMethod payMethod, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        payMethod.getClass();
        agreementState.getClass();
        if (m54041x()) {
            return;
        }
        for (C8765d c8765d : sections) {
            if (m54020R(c8765d, payMethod)) {
                c8765d.m53541w(agreementState == PurchaseAgreementState.CHECKED);
            } else {
                c8765d.m53541w(false);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo54023f(@NotNull C8765d section, @NotNull PurchaseAgreementState agreementState) {
        section.getClass();
        agreementState.getClass();
        if (m54041x()) {
            section.m53541w(true);
        } else {
            section.m53541w(agreementState == PurchaseAgreementState.CHECKED);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m54024g(@NotNull List<? extends C8765d> sections, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        agreementState.getClass();
        Iterator<? extends C8765d> it = sections.iterator();
        while (it.hasNext()) {
            mo54023f(it.next(), agreementState);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final PayMethod m54025h(@NotNull C8765d it, @NotNull PayMethod payMethod) {
        it.getClass();
        payMethod.getClass();
        if (sab0.m182886d(this.purchaseType)) {
            List<PayMethod> listM167155x = p2b0.m167133h().m167155x(it.m53532n() ? it.m53520b().m53601s() : it.m53522d().m53601s());
            listM167155x.getClass();
            if (!listM167155x.contains(payMethod)) {
                PayMethod payMethod2 = listM167155x.get(0);
                payMethod2.getClass();
                PayMethod payMethod3 = payMethod2;
                for (PayMethod payMethod4 : listM167155x) {
                    if ((TEnum.equals(payMethod4, "alipay") && sd60.m183461l()) || ((TEnum.equals(payMethod4, "wechat") && sd60.m183466q()) || (TEnum.equals(payMethod4, PayMethod.jingdong) && sd60.m183463n()))) {
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
    public final List<C8765d> m54026i() {
        d0f0 d0f0Var = this.showcaseNewFilterChain;
        if (d0f0Var == null) {
            Intrinsics.m87502r("showcaseNewFilterChain");
            d0f0Var = null;
        }
        return d0f0Var.m109494m(m54033p());
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final C8765d m54027j(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        for (C8765d c8765d : sections) {
            if (c8765d.m53530l()) {
                return c8765d;
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
    public final PayMethod m54030m() {
        PayMethod payMethod = this.currentPayMethod;
        payMethod.getClass();
        return payMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C8765d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final l3b0 getPurchaseExtra() {
        return this.purchaseExtra;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<C8765d> m54033p() {
        List list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("purchaseSectionsSource");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final hab0 getPurchaseTrack() {
        return this.purchaseTrack;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m54036s(@NotNull C8765d section) {
        C8765d c8765d;
        section.getClass();
        return Intrinsics.m87488d(this.currentUsedPurchaseSection, section) && (c8765d = this.currentUsedPurchaseSection) != null && section.m53531m() == c8765d.m53531m();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public PurchaseAgreementState mo54037t() {
        return m54041x() ? PurchaseAgreementState.UNCHECKED : PurchaseAgreementState.CHECKED;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final PayMethod m54038u() {
        if (sd60.m183461l()) {
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            return payMethod;
        }
        PayMethod payMethod2 = PayMethod.get("wechat");
        payMethod2.getClass();
        return payMethod2;
    }

    /* JADX INFO: renamed from: v */
    public final void m54039v() {
        if (this.showcaseNewFilterChain == null) {
            this.showcaseNewFilterChain = new d0f0(this.purchaseType, this.from);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo54040w() {
        m54013K();
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8776a.m54000a((List) obj);
            }
        };
        this.merchandiseSubs = c22306cDuringCreated.filter(new w9j() { // from class: l.d5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AbstractC8776a.m54003d(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.e5
            @Override // p149l.e30
            public final void call(Object obj) throws Exception {
                AbstractC8776a.m54002c(this.f89335a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m54041x() {
        return p2b0.m167133h().m167157z() && !C8766e.m53650x(this.from);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m54042y() {
        return this.purchaseSectionsSource != null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m54043z(@NotNull PayMethod payMethod) throws Exception {
        payMethod.getClass();
        if (TEnum.equals(payMethod, this.currentPayMethod)) {
            return false;
        }
        this.currentPayMethod = payMethod;
        if (TEnum.equals(payMethod, "unknown_")) {
            whq0.m203241a("current pay method is unknown!!!");
            return false;
        }
        Iterator<a> it = this.payMethodListeners.iterator();
        while (it.hasNext()) {
            it.next().mo54044a(payMethod);
        }
        return true;
    }
}
