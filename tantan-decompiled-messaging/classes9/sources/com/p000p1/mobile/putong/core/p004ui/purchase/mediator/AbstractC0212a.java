package com.p000p1.mobile.putong.core.p004ui.purchase.mediator;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.p2b0;
import l.qq3;
import l.riy;
import l.rxa0;
import l.sab0;
import l.sd60;
import l.vwb;
import l.w9j;
import l.whq0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.d0f0;
import p006l.ef60;
import p006l.g6a;
import p006l.hab0;
import p006l.l3b0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001:\u0005hu!plB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000bH\u0004¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020\u0010¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u0004\u0018\u00010?¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010\u0017J\u001d\u0010F\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0004¢\u0006\u0004\bF\u0010\u000fJ3\u0010J\u001a\u00020*2\u0006\u0010'\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0006\u0010H\u001a\u00020*2\b\b\u0002\u0010I\u001a\u00020*H\u0004¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bR\u0010SJ\u0015\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\r2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020x0\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010yR(\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b(\u0010y\u001a\u0004\b{\u0010\u001f\"\u0004\b|\u0010\u000fR\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010\u007fR\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010yR!\u0010\u0085\u0001\u001a\u000b \u0083\u0001*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0088\u0001R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010qR\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001R\u0019\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u008e\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020T0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010yR\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010yR\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010yR\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010yR\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020d0\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010yR\u0013\u0010\u0095\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010>¨\u0006\u0096\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "S", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "u", "()Lcom/p1/mobile/putong/data/PayMethod;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "t", "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "v", "()V", "w", "L", "it", "payMethod", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Lcom/p1/mobile/putong/data/PayMethod;", "i", "()Ljava/util/List;", "agreementState", "e", "(Ljava/util/List;Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "j", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "g", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "section", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "R", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;)Z", "s", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Z", "M", "l", "m", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "selectCouponId", "Q", "(Ljava/lang/String;)V", "Ll/hab0;", "q", "()Ll/hab0;", "purchaseTrack", "P", "(Ll/hab0;)V", "x", "()Z", "Ll/l3b0;", "extra", "N", "(Ll/l3b0;)V", "o", "()Ll/l3b0;", "K", "E", "sectionWithExtra", "scroll", "isClick", "B", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;ZZ)Z", "z", "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "D", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)Z", "Ll/ef60;", "paymentHandlerData", "A", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "iPayMethod", "F", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "iPurchaseSectionListener", "I", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "iPurchaseSectionsListListener", "J", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "iPurchaseSectionCheckStateListener", "H", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;)V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "iPurchasePaymentClickListener", "G", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;)V", "a", "Lcom/p1/mobile/android/app/Act;", "k", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/c4g0;", "d", "Ll/c4g0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ljava/util/List;", "merchandises", "p", "O", "purchaseSectionsSource", "Ll/d0f0;", "Ll/d0f0;", "showcaseNewFilterChain", "", "renderSections", "kotlin.jvm.PlatformType", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "currentAgreementState", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "currentPurchaseSectionWithExtra", "currentUsedPurchaseSection", "Ll/l3b0;", "purchaseExtra", "Ll/hab0;", "payMethodListeners", "purchaseSectionsListeners", "purchaseSectionsListListeners", "purchaseSectionCheckSateListeners", "purchasePaymentClickListeners", "y", "isSectionsInitialized", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public abstract class AbstractC0212a {

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
    public List<? extends com.p1.mobile.putong.core.ui.purchase.d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public d0f0 showcaseNewFilterChain;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<com.p1.mobile.putong.core.ui.purchase.d> renderSections;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public PurchaseAgreementState currentAgreementState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public com.p1.mobile.putong.core.ui.purchase.d currentPurchaseSection;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public com.p1.mobile.putong.core.ui.purchase.d currentPurchaseSectionWithExtra;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public com.p1.mobile.putong.core.ui.purchase.d currentUsedPurchaseSection;

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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7379a(@NotNull PayMethod payMethod);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo7333a(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$c */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7380a(@NotNull PurchaseAgreementState agreementState);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$d */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo7332a(@NotNull com.p1.mobile.putong.core.ui.purchase.d section, boolean scroll, boolean isClick, @Nullable com.p1.mobile.putong.core.ui.purchase.d sectionSource);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.a$e */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo7331a(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections);
    }

    public AbstractC0212a(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
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
    public static /* synthetic */ boolean m7334C(AbstractC0212a abstractC0212a, com.p1.mobile.putong.core.ui.purchase.d dVar, com.p1.mobile.putong.core.ui.purchase.d dVar2, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: notifyPurchaseSection");
            return false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return abstractC0212a.m7340B(dVar, dVar2, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m7335a(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m7336b(AbstractC0212a abstractC0212a, com.p1.mobile.putong.core.ui.purchase.d dVar) {
        dVar.getClass();
        return Boolean.valueOf(rxa0.j(dVar.m() ? dVar.b().s() : dVar.d().s(), abstractC0212a.selectCouponId));
    }

    /* JADX INFO: renamed from: c */
    public static void m7337c(AbstractC0212a abstractC0212a, List list) {
        list.getClass();
        abstractC0212a.merchandises = list;
        abstractC0212a.m7352O(new riy(abstractC0212a.act, abstractC0212a.purchaseType).c(list));
        abstractC0212a.m7374v();
        abstractC0212a.m7349L();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m7338d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7339A(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        Iterator<b> it = this.purchasePaymentClickListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7333a(paymentHandlerData, purchaseType);
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7340B(@NotNull com.p1.mobile.putong.core.ui.purchase.d section, @Nullable com.p1.mobile.putong.core.ui.purchase.d sectionWithExtra, boolean scroll, boolean isClick) {
        section.getClass();
        if (m7371s(sectionWithExtra == null ? section : sectionWithExtra)) {
            return false;
        }
        this.currentPurchaseSection = section;
        this.currentPurchaseSectionWithExtra = sectionWithExtra;
        this.currentUsedPurchaseSection = sectionWithExtra == null ? section : sectionWithExtra;
        Iterator<d> it = this.purchaseSectionsListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7332a(sectionWithExtra == null ? section : sectionWithExtra, scroll, isClick, sectionWithExtra == null ? null : section);
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7341D(@NotNull PurchaseAgreementState agreementState) {
        agreementState.getClass();
        if (this.currentAgreementState == agreementState) {
            return false;
        }
        this.currentAgreementState = agreementState;
        Iterator<c> it = this.purchaseSectionCheckSateListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7380a(agreementState);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m7342E(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections) {
        sections.getClass();
        this.renderSections.clear();
        this.renderSections.addAll(sections);
        Iterator<e> it = this.purchaseSectionsListListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7331a(sections);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m7343F(@NotNull a iPayMethod) {
        iPayMethod.getClass();
        if (this.payMethodListeners.contains(iPayMethod)) {
            return;
        }
        this.payMethodListeners.add(iPayMethod);
    }

    /* JADX INFO: renamed from: G */
    public final void m7344G(@NotNull b iPurchasePaymentClickListener) {
        iPurchasePaymentClickListener.getClass();
        if (this.purchasePaymentClickListeners.contains(iPurchasePaymentClickListener)) {
            return;
        }
        this.purchasePaymentClickListeners.add(iPurchasePaymentClickListener);
    }

    /* JADX INFO: renamed from: H */
    public final void m7345H(@NotNull c iPurchaseSectionCheckStateListener) {
        iPurchaseSectionCheckStateListener.getClass();
        if (this.purchaseSectionCheckSateListeners.contains(iPurchaseSectionCheckStateListener)) {
            return;
        }
        this.purchaseSectionCheckSateListeners.add(iPurchaseSectionCheckStateListener);
    }

    /* JADX INFO: renamed from: I */
    public final void m7346I(@NotNull d iPurchaseSectionListener) {
        iPurchaseSectionListener.getClass();
        if (this.purchaseSectionsListeners.contains(iPurchaseSectionListener)) {
            return;
        }
        this.purchaseSectionsListeners.add(iPurchaseSectionListener);
    }

    /* JADX INFO: renamed from: J */
    public final void m7347J(@NotNull e iPurchaseSectionsListListener) {
        iPurchaseSectionsListListener.getClass();
        if (this.purchaseSectionsListListeners.contains(iPurchaseSectionsListListener)) {
            return;
        }
        this.purchaseSectionsListListeners.add(iPurchaseSectionsListListener);
    }

    /* JADX INFO: renamed from: K */
    public void m7348K() {
        mkd0.z(this.merchandiseSubs);
        this.merchandiseSubs = null;
        l3b0 l3b0Var = this.purchaseExtra;
        if (l3b0Var != null) {
            l3b0Var.m18559n();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m7349L() {
        l3b0 l3b0Var;
        PayMethod payMethodM7373u = m7373u();
        PurchaseAgreementState purchaseAgreementStateMo7372t = mo7372t();
        List<com.p1.mobile.putong.core.ui.purchase.d> listM7361i = m7361i();
        m7356S(listM7361i);
        mo7357e(listM7361i, payMethodM7373u, purchaseAgreementStateMo7372t);
        com.p1.mobile.putong.core.ui.purchase.d dVarM7362j = m7362j(listM7361i);
        l3b0 l3b0Var2 = this.purchaseExtra;
        com.p1.mobile.putong.core.ui.purchase.d dVarM18554i = null;
        if (l3b0Var2 != null && l3b0Var2.getIsExtraSelected() && dVarM7362j != null && (l3b0Var = this.purchaseExtra) != null) {
            dVarM18554i = l3b0Var.m18554i(dVarM7362j);
        }
        if (dVarM7362j != null) {
            m7378z(m7360h(dVarM18554i == null ? dVarM7362j : dVarM18554i, payMethodM7373u));
            m7341D(purchaseAgreementStateMo7372t);
            m7342E(listM7361i);
            m7334C(this, dVarM7362j, dVarM18554i, false, false, 8, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<com.p1.mobile.putong.core.ui.purchase.d> m7350M() {
        return this.renderSections;
    }

    /* JADX INFO: renamed from: N */
    public final void m7351N(@NotNull l3b0 extra) {
        extra.getClass();
        this.purchaseExtra = extra;
    }

    /* JADX INFO: renamed from: O */
    public final void m7352O(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }

    /* JADX INFO: renamed from: P */
    public final void m7353P(@Nullable hab0 purchaseTrack) {
        this.purchaseTrack = purchaseTrack;
    }

    /* JADX INFO: renamed from: Q */
    public final void m7354Q(@Nullable String selectCouponId) {
        this.selectCouponId = selectCouponId;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m7355R(@NotNull com.p1.mobile.putong.core.ui.purchase.d section, @Nullable PayMethod payMethod) {
        section.getClass();
        if (TEnum.equals(payMethod, "jingdong")) {
            return false;
        }
        if (TEnum.equals(payMethod, "alipay") && CoreModule.m1854P().m11706a().m5461j3() && CoreModule.f1534c.f3580O0.m2014u3(this.purchaseType)) {
            return false;
        }
        if (sab0.i(this.purchaseType) && NullChecker.a(section.b()) && section.b().s().yearly()) {
            return false;
        }
        if (sab0.i(this.purchaseType) && !m7376x() && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        if (sab0.o(this.purchaseType) && TEnum.equals(payMethod, "wechat")) {
            return false;
        }
        return (sab0.m(this.purchaseType) && TEnum.equals(payMethod, "wechat")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x001b A[SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public final void m7356S(List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections) {
        int iG;
        List list;
        if (g6a.m15587j() && TextUtils.isEmpty(this.selectCouponId)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : sections) {
                com.p1.mobile.putong.core.ui.purchase.d dVar = (com.p1.mobile.putong.core.ui.purchase.d) obj;
                if (!dVar.m()) {
                    List list2 = dVar.d().s().localCoupons;
                    list2.getClass();
                    if (list2.isEmpty()) {
                        if (dVar.m()) {
                            list = dVar.b().s().localCoupons;
                            list.getClass();
                            if (!list.isEmpty()) {
                            }
                        }
                    }
                    arrayList.add(obj);
                } else if (dVar.m()) {
                    list = dVar.b().s().localCoupons;
                    list.getClass();
                    if (!list.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (NullChecker.a(arrayList) && !arrayList.isEmpty()) {
                Merchandise merchandiseS = ((com.p1.mobile.putong.core.ui.purchase.d) arrayList.get(0)).m() ? ((com.p1.mobile.putong.core.ui.purchase.d) arrayList.get(0)).b().s() : ((com.p1.mobile.putong.core.ui.purchase.d) arrayList.get(0)).d().s();
                if (NullChecker.a(merchandiseS)) {
                    List list3 = merchandiseS.localCoupons;
                    list3.getClass();
                    if (!list3.isEmpty()) {
                        this.selectCouponId = ((Coupon) merchandiseS.localCoupons.get(0)).couponID;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.selectCouponId) || (iG = vwb.G(sections, new w9j() { // from class: l.f5
            public final Object call(Object obj2) {
                return AbstractC0212a.m7336b(this.f11670a, (d) obj2);
            }
        })) < 0) {
            return;
        }
        Iterator<T> it = sections.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ((com.p1.mobile.putong.core.ui.purchase.d) it.next()).v(i == iG);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo7357e(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections, @NotNull PayMethod payMethod, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        payMethod.getClass();
        agreementState.getClass();
        if (m7376x()) {
            return;
        }
        for (com.p1.mobile.putong.core.ui.purchase.d dVar : sections) {
            if (m7355R(dVar, payMethod)) {
                dVar.w(agreementState == PurchaseAgreementState.CHECKED);
            } else {
                dVar.w(false);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo7358f(@NotNull com.p1.mobile.putong.core.ui.purchase.d section, @NotNull PurchaseAgreementState agreementState) {
        section.getClass();
        agreementState.getClass();
        if (m7376x()) {
            section.w(true);
        } else {
            section.w(agreementState == PurchaseAgreementState.CHECKED);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7359g(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        agreementState.getClass();
        Iterator<? extends com.p1.mobile.putong.core.ui.purchase.d> it = sections.iterator();
        while (it.hasNext()) {
            mo7358f(it.next(), agreementState);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final PayMethod m7360h(@NotNull com.p1.mobile.putong.core.ui.purchase.d it, @NotNull PayMethod payMethod) {
        it.getClass();
        payMethod.getClass();
        if (sab0.d(this.purchaseType)) {
            List<PayMethod> listX = p2b0.h().x(it.n() ? it.b().s() : it.d().s());
            listX.getClass();
            if (!listX.contains(payMethod)) {
                Object obj = listX.get(0);
                obj.getClass();
                PayMethod payMethod2 = (PayMethod) obj;
                for (PayMethod payMethod3 : listX) {
                    if ((TEnum.equals(payMethod3, "alipay") && sd60.l()) || ((TEnum.equals(payMethod3, "wechat") && sd60.q()) || (TEnum.equals(payMethod3, "jingdong") && sd60.n()))) {
                        payMethod3.getClass();
                        return payMethod3;
                    }
                }
                return payMethod2;
            }
        }
        return payMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<com.p1.mobile.putong.core.ui.purchase.d> m7361i() {
        d0f0 d0f0Var = this.showcaseNewFilterChain;
        if (d0f0Var == null) {
            Intrinsics.r("showcaseNewFilterChain");
            d0f0Var = null;
        }
        return d0f0Var.m13736m(m7368p());
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final com.p1.mobile.putong.core.ui.purchase.d m7362j(@NotNull List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections) {
        sections.getClass();
        for (com.p1.mobile.putong.core.ui.purchase.d dVar : sections) {
            if (dVar.l()) {
                return dVar;
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
    public final PayMethod m7365m() {
        PayMethod payMethod = this.currentPayMethod;
        payMethod.getClass();
        return payMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final com.p1.mobile.putong.core.ui.purchase.d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final l3b0 getPurchaseExtra() {
        return this.purchaseExtra;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<com.p1.mobile.putong.core.ui.purchase.d> m7368p() {
        List<? extends com.p1.mobile.putong.core.ui.purchase.d> list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.r("purchaseSectionsSource");
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
    public final boolean m7371s(@NotNull com.p1.mobile.putong.core.ui.purchase.d section) {
        com.p1.mobile.putong.core.ui.purchase.d dVar;
        section.getClass();
        return Intrinsics.d(this.currentUsedPurchaseSection, section) && (dVar = this.currentUsedPurchaseSection) != null && section.m() == dVar.m();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public PurchaseAgreementState mo7372t() {
        return m7376x() ? PurchaseAgreementState.UNCHECKED : PurchaseAgreementState.CHECKED;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final PayMethod m7373u() {
        if (sd60.l()) {
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            return payMethod;
        }
        PayMethod payMethod2 = PayMethod.get("wechat");
        payMethod2.getClass();
        return payMethod2;
    }

    /* JADX INFO: renamed from: v */
    public final void m7374v() {
        if (this.showcaseNewFilterChain == null) {
            this.showcaseNewFilterChain = new d0f0(this.purchaseType, this.from);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo7375w() {
        m7348K();
        rx.c cVarDuringCreated = this.act.duringCreated(CoreModule.f1534c.f3643j0.m2572y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.c5
            public final Object invoke(Object obj) {
                return AbstractC0212a.m7335a((List) obj);
            }
        };
        this.merchandiseSubs = cVarDuringCreated.filter(new w9j() { // from class: l.d5
            public final Object call(Object obj) {
                return AbstractC0212a.m7338d(function1, obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.e5
            public final void call(Object obj) {
                AbstractC0212a.m7337c(this.f10765a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7376x() {
        return p2b0.h().z() && !com.p1.mobile.putong.core.ui.purchase.e.x(this.from);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7377y() {
        return this.purchaseSectionsSource != null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7378z(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        if (TEnum.equals(payMethod, this.currentPayMethod)) {
            return false;
        }
        this.currentPayMethod = payMethod;
        if (TEnum.equals(payMethod, "unknown_")) {
            whq0.a("current pay method is unknown!!!");
            return false;
        }
        Iterator<a> it = this.payMethodListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7379a(payMethod);
        }
        return true;
    }
}
