package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPurchasePageContentNewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.AffiliateProducts;
import com.p1.mobile.putong.core.data.FreeTrialData;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.c3m;
import l.c4g0;
import l.cb9;
import l.cjy;
import l.cwf0;
import l.d3c0;
import l.e30;
import l.e51;
import l.g30;
import l.g6e0;
import l.h6a;
import l.hab0;
import l.hmb;
import l.i0e;
import l.i6p;
import l.iab0;
import l.id40;
import l.igj;
import l.j760;
import l.jo0;
import l.lsi0;
import l.m6c0;
import l.mkd0;
import l.mp0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.rwl;
import l.rxa0;
import l.sab0;
import l.t0g0;
import l.t100;
import l.u9p;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.xma;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.aap;
import p002l.dgn;
import p002l.f7p;
import p002l.p2b0;
import rx.c;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u001d\u0010)\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\u000eJ\u001d\u00104\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b4\u0010*J\u001d\u00105\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b5\u0010*J\u001d\u00106\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020\nH\u0014¢\u0006\u0004\b7\u0010\u000eJ9\u0010;\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u00108\u001a\u0004\u0018\u00010!2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=¢\u0006\u0004\b@\u0010AJ+\u0010C\u001a\u00020\n2\u001c\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 ¢\u0006\u0004\bC\u0010DJ)\u0010F\u001a\u00020\n2\u001a\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\bF\u0010DJ\u0015\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u000209¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010!¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u000209¢\u0006\u0004\bN\u0010IJ\u0015\u0010Q\u001a\u00020\n2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\n¢\u0006\u0004\bS\u0010\u000eJ\r\u0010T\u001a\u00020\n¢\u0006\u0004\bT\u0010\u000eJ\r\u0010U\u001a\u00020\n¢\u0006\u0004\bU\u0010\u000eJ\u000f\u0010V\u001a\u00020\nH\u0014¢\u0006\u0004\bV\u0010\u000eJ\r\u0010W\u001a\u00020\n¢\u0006\u0004\bW\u0010\u000eJ\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\n¢\u0006\u0004\bZ\u0010\u000eR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u00108\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010TR\u001a\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R.\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u008b\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\"\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190&8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010TR\u0017\u0010G\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010TR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u007fR\u0018\u0010\u0097\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010TR\u0018\u0010\u0099\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010TR\u0018\u0010\u009b\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010TR\u0018\u0010\u009d\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010TR\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010 \u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010½\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010TR\u0018\u0010¿\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010TR\u0018\u0010Á\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010TR\u0018\u0010Ã\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u007fR\u0018\u0010Å\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010TR\u0018\u0010Ç\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010TR\u001d\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0087\u0001R\u001d\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0087\u0001R\u001e\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0087\u0001R+\u0010Õ\u0001\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001¨\u0006Ö\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageContentNewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "T", "(Landroid/view/View;)V", "x0", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "i0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "g0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "z0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "U", "h0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/g30;", "", "original", "A0", "(Ll/g30;)Ll/g30;", "j0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "b0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "upgradeMerchandises", "a0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;Ljava/util/List;)V", "v0", "V", "sections", "y0", "w0", "X", "onFinishInflate", "from", "", "multiPages", "d0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "isInitSelectTab", "setInitSelectTab", "(Z)V", "duration", "setDefaultSkuDuration", "(Ljava/lang/String;)V", "autoPay", "setAutoPay", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "f0", "Z", "Y", "onDetachedFromWindow", "e0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_showcase_root", "()Landroid/widget/FrameLayout;", "set_showcase_root", "(Landroid/widget/FrameLayout;)V", "_showcase_root", "c", "get_weekly_promo_banner_container", "set_weekly_promo_banner_container", "_weekly_promo_banner_container", "d", "get_introduce", "set_introduce", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "h", "Ljava/lang/String;", "i", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "j", "k", "Ll/hab0;", "l", "Ll/e30;", "m", "Ll/g30;", "n", "onPaymentFailedAction", "o", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "p", "isDialogPageShow", "q", "r", "defaultSkuDuration", "s", "shouldAutoPay", "t", "autoPayTriggered", "u", "screenSize", "v", "isPromotion", "Ll/c4g0;", "w", "Ll/c4g0;", "subscription", "Landroid/os/Handler;", "x", "Landroid/os/Handler;", "promotionRefreshHandler", "Ljava/lang/Runnable;", "y", "Ljava/lang/Runnable;", "promotionRefreshRunnable", "z", "countdownDismissedSub", "Ll/cwf0;", "A", "Ll/cwf0;", "statisticsPageHelper", "Ll/c3m;", "B", "Ll/c3m;", "showcaseComponent", "Ll/dgn;", "C", "Ll/dgn;", "paymentComponent", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "D", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "exclusivePrivilegeView", "E", "premiumWeeklyGuideNeedGuide", "F", "premiumWeeklyGuideSubscribed", "G", "isWeeklyMerchandiseSelected", "H", "boostPriceStr", "I", "boostPriceFetching", "J", "boostBannerTracked", "K", "currentSelectPurchaseSectionAction", "L", "currentSelectPurchaseSectionPayAction", "Lcom/p1/mobile/putong/data/PayMethod;", "M", "currentSelectPayTypeAction", "N", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "getUpgradeCategory", "()Lcom/p1/mobile/putong/core/data/ProductCategory;", "setUpgradeCategory", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)V", "upgradeCategory", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPurchasePageContentNewView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public c3m showcaseComponent;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public dgn paymentComponent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public IntlPurchaseExclusivePrivilegeView exclusivePrivilegeView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean premiumWeeklyGuideNeedGuide;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean premiumWeeklyGuideSubscribed;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean isWeeklyMerchandiseSelected;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public String boostPriceStr;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean boostPriceFetching;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean boostBannerTracked;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final e30<C0190d> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final e30<C0190d> currentSelectPurchaseSectionPayAction;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final e30<PayMethod> currentSelectPayTypeAction;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public ProductCategory upgradeCategory;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _privilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _showcase_root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _weekly_promo_banner_container;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _introduce;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public IntlPurchasePagePaymentView _payment_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Privilege primaryPrivilege;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean multiPages;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final List<C0190d> purchaseSections;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isDialogPageShow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isInitSelectTab;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean shouldAutoPay;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean autoPayTriggered;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean screenSize;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isPromotion;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscription;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Handler promotionRefreshHandler;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Runnable promotionRefreshRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public c4g0 countdownDismissedSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePageContentNewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseSections = new ArrayList();
        this.promotionRefreshHandler = new Handler(Looper.getMainLooper());
        cwf0 cwf0VarC = i0e.c("p_purchase_page", IntlPurchasePageContentNewView.class.getName());
        cwf0VarC.getClass();
        this.statisticsPageHelper = cwf0VarC;
        this.boostPriceStr = "";
        this.currentSelectPurchaseSectionAction = new e30() { // from class: l.p4p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4436i(this.f17004a, (C0190d) obj);
            }
        };
        this.currentSelectPurchaseSectionPayAction = new e30() { // from class: l.a5p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4461w(this.f7411a, (C0190d) obj);
            }
        };
        this.currentSelectPayTypeAction = new e30() { // from class: l.l5p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4425R(this.f14678a, (PayMethod) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m4408A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static c m4409B(IntlPurchasePageContentNewView intlPurchasePageContentNewView, j760 j760Var) {
        Object obj = j760Var.a;
        obj.getClass();
        List<Merchandise> mutableList = CollectionsKt.toMutableList((Collection) obj);
        intlPurchasePageContentNewView.m4473b0(mutableList);
        boolean zJ = vwb.J((Collection) j760Var.b);
        Context context = intlPurchasePageContentNewView.act;
        Context context2 = null;
        if (zJ) {
            if (context == null) {
                Intrinsics.r("act");
                context = null;
            }
            c cVarM = igj.M(context, mutableList);
            final Function1 function1 = new Function1() { // from class: l.m5p
                public final Object invoke(Object obj2) {
                    return IntlPurchasePageContentNewView.m4439k0((List) obj2);
                }
            };
            return cVarM.map(new w9j() { // from class: l.n5p
                public final Object call(Object obj2) {
                    return IntlPurchasePageContentNewView.m4441l0(function1, obj2);
                }
            });
        }
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        c cVarM2 = igj.M(context, mutableList);
        Context context3 = intlPurchasePageContentNewView.act;
        if (context3 == null) {
            Intrinsics.r("act");
        } else {
            context2 = context3;
        }
        Object obj2 = j760Var.b;
        obj2.getClass();
        c cVarM3 = igj.M(context2, (List) obj2);
        final Function2 function2 = new Function2() { // from class: l.o5p
            public final Object invoke(Object obj3, Object obj4) {
                return IntlPurchasePageContentNewView.m4443m0((List) obj3, (List) obj4);
            }
        };
        return mkd0.r(cVarM2, cVarM3, new x9j() { // from class: l.p5p
            public final Object call(Object obj3, Object obj4) {
                return IntlPurchasePageContentNewView.m4445n0(function2, obj3, obj4);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static c m4411D(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m4413F(IntlPurchasePageContentNewView intlPurchasePageContentNewView, ProductCategory productCategory, j760 j760Var) {
        intlPurchasePageContentNewView.m4472a0(productCategory, (List) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: G */
    public static c m4414G(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static c m4415H(Throwable th) {
        return c.just((Object) null);
    }

    /* JADX INFO: renamed from: I */
    public static void m4416I(IntlPurchasePageContentNewView intlPurchasePageContentNewView, g6e0 g6e0Var, List list) {
        Object next;
        StockKeepUnit stockKeepUnit;
        intlPurchasePageContentNewView.boostPriceFetching = false;
        list.getClass();
        Iterator it = list.iterator();
        Prices prices = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((Merchandise) next).quantity;
                do {
                    Object next2 = it.next();
                    int i2 = ((Merchandise) next2).quantity;
                    if (i > i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Merchandise merchandise = (Merchandise) next;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null) {
            prices = stockKeepUnit.prices;
        }
        if (prices != null) {
            intlPurchasePageContentNewView.boostPriceStr = prices.currencySymbol + t0g0.e(prices.price);
        }
        g6e0Var.p(true, intlPurchasePageContentNewView.boostPriceStr);
    }

    /* JADX INFO: renamed from: J */
    public static c m4417J(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static void m4418K(IntlPurchasePageContentNewView intlPurchasePageContentNewView, g30 g30Var, PurchaseType purchaseType, Act act, String str) {
        if (intlPurchasePageContentNewView.isWeeklyMerchandiseSelected) {
            CoreModule.c.j0.x4();
        }
        if (sab0.v(purchaseType)) {
            intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
            c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
            if (c4g0Var != null) {
                c4g0Var.unsubscribe();
            }
            intlPurchasePageContentNewView.subscription = null;
            intlPurchasePageContentNewView.m4481j0();
        }
        if (g30Var != null) {
            g30Var.a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m4420M(IntlPurchasePageContentNewView intlPurchasePageContentNewView, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            lsi0.h(R.string.R3);
        }
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m4421N(boolean z, C0190d c0190d) {
        AffiliateProducts affiliateProducts;
        String str;
        Merchandise merchandiseM4087c = c0190d.m4087c();
        if (merchandiseM4087c == null) {
            return Boolean.FALSE;
        }
        StockKeepUnit stockKeepUnit = merchandiseM4087c.defaultStockKeepUnit;
        if (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) {
            return Boolean.FALSE;
        }
        if (z) {
            return Boolean.valueOf(CoreModule.c.x0.l4(merchandiseM4087c));
        }
        FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
        return freeTrialDataC4 == null ? Boolean.FALSE : Boolean.valueOf(Intrinsics.d(str, freeTrialDataC4.skuId));
    }

    /* JADX INFO: renamed from: Q */
    public static void m4424Q(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Boolean bool) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = Intrinsics.d(bool, Boolean.TRUE);
        intlPurchasePageContentNewView.m4467U();
    }

    /* JADX INFO: renamed from: R */
    public static void m4425R(IntlPurchasePageContentNewView intlPurchasePageContentNewView, PayMethod payMethod) {
        c3m c3mVar;
        payMethod.getClass();
        if (!NullChecker.a(intlPurchasePageContentNewView.showcaseComponent) || (c3mVar = intlPurchasePageContentNewView.showcaseComponent) == null) {
            return;
        }
        c3mVar.e(payMethod);
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m4426S(Merchandise merchandise) {
        return Boolean.valueOf(rxa0.n(merchandise));
    }

    /* JADX INFO: renamed from: W */
    public static final void m4427W(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.a(intlPurchasePageContentNewView.paymentComponent) || (dgnVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dgnVar.f9241k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: a */
    public static void m4428a(View view, roj0 roj0Var) {
        aap.m9465c(view);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m4429b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static c m4432e(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m4433f(j760 j760Var) {
        return Boolean.valueOf(!vwb.J((Collection) j760Var.a));
    }

    /* JADX INFO: renamed from: g */
    public static void m4434g(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.boostPriceFetching = false;
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: h */
    public static c m4435h(c cVar, final j760 j760Var) {
        final Function1 function1 = new Function1() { // from class: l.x5p
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m4457t0(j760Var, (List) obj);
            }
        };
        return cVar.map(new w9j() { // from class: l.y5p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4459u0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m4436i(final IntlPurchasePageContentNewView intlPurchasePageContentNewView, C0190d c0190d) {
        C0190d.a aVarM4086b;
        dgn dgnVar;
        intlPurchasePageContentNewView.m4486z0(c0190d);
        if (NullChecker.a(intlPurchasePageContentNewView.paymentComponent) && (dgnVar = intlPurchasePageContentNewView.paymentComponent) != null) {
            dgnVar.m11852b(c0190d);
        }
        if (intlPurchasePageContentNewView.get_payment_view() != null) {
            intlPurchasePageContentNewView.get_payment_view().m4496j(c0190d);
        }
        PurchaseType purchaseType = null;
        if (intlPurchasePageContentNewView.shouldAutoPay && !intlPurchasePageContentNewView.autoPayTriggered && NullChecker.a(c0190d)) {
            intlPurchasePageContentNewView.autoPayTriggered = true;
            Context context = intlPurchasePageContentNewView.act;
            if (context == null) {
                Intrinsics.r("act");
                context = null;
            }
            e51.H(context, new Runnable() { // from class: l.w5p
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPurchasePageContentNewView.m4427W(this.f21467a);
                }
            }, 300L);
        }
        if (NullChecker.a(intlPurchasePageContentNewView.showcaseComponent) && (intlPurchasePageContentNewView.showcaseComponent instanceof g6e0)) {
            if (c0190d == null || (aVarM4086b = c0190d.m4088d()) == null) {
                aVarM4086b = c0190d != null ? c0190d.m4086b() : null;
            }
            boolean zK3 = CoreModule.c.G2.k3(aVarM4086b != null ? aVarM4086b.m4145f() : null);
            CoreModule.c.G2.S.onNext(Boolean.valueOf(zK3));
            g6e0 g6e0Var = intlPurchasePageContentNewView.showcaseComponent;
            g6e0Var.getClass();
            g6e0Var.r(zK3);
            PurchaseType purchaseType2 = intlPurchasePageContentNewView.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.r("purchaseType");
                purchaseType2 = null;
            }
            if (purchaseType2 != PurchaseType.TYPE_ULTRA_PREMIUM) {
                PurchaseType purchaseType3 = intlPurchasePageContentNewView.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.r("purchaseType");
                } else {
                    purchaseType = purchaseType3;
                }
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return;
                }
            }
            u9p.INSTANCE.z(aVarM4086b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4437j(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = false;
    }

    /* JADX INFO: renamed from: k */
    public static List m4438k(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.g5p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4447o0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final j760 m4439k0(List list) {
        list.getClass();
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: l */
    public static void m4440l(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m4481j0();
    }

    /* JADX INFO: renamed from: l0 */
    public static final j760 m4441l0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m4442m(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Long l2) {
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            intlPurchasePageContentNewView.m4468V();
            e30<Integer> e30Var = intlPurchasePageContentNewView.dialogStateAction;
            if (e30Var != null) {
                e30Var.call(0);
                return;
            }
            return;
        }
        intlPurchasePageContentNewView.m4468V();
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m4481j0();
    }

    /* JADX INFO: renamed from: m0 */
    public static final j760 m4443m0(List list, List list2) {
        list.getClass();
        list2.getClass();
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final j760 m4445n0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o */
    public static void m4446o(C0190d c0190d) {
        c0190d.m4106v(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m4447o0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.c.j0.C4() == null || !Intrinsics.d(CoreModule.c.j0.C4().skuId, merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m4448p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static final j760 m4449p0(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final j760 m4451q0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static c m4452r(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Envelope envelope) {
        cb9 cb9Var = CoreModule.c.G2;
        if (cb9Var.R == null || !cb9Var.l3(intlPurchasePageContentNewView.getPurchaseType())) {
            c cVarY5 = CoreModule.c.j0.y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
            final Function1 function1 = new Function1() { // from class: l.s5p
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m4449p0((List) obj);
                }
            };
            return cVarY5.map(new w9j() { // from class: l.t5p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4451q0(function1, obj);
                }
            });
        }
        com.p1.mobile.putong.core.api.c cVar = CoreModule.c;
        intlPurchasePageContentNewView.upgradeCategory = cVar.G2.R.category;
        c cVarY6 = cVar.j0.y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
        c cVarY7 = CoreModule.c.j0.y5(intlPurchasePageContentNewView.upgradeCategory);
        final Function2 function2 = new Function2() { // from class: l.u5p
            public final Object invoke(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m4453r0((List) obj, (List) obj2);
            }
        };
        return mkd0.r(cVarY6, cVarY7, new x9j() { // from class: l.v5p
            public final Object call(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m4455s0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public static final j760 m4453r0(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final j760 m4455s0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t0 */
    public static final j760 m4457t0(j760 j760Var, List list) {
        Object obj = j760Var.a;
        obj.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) obj);
        if (!vwb.J(list)) {
            list.getClass();
            Merchandise merchandise = (Merchandise) list.get(0);
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                if (((Merchandise) mutableList.get(i)).quantity == merchandise.quantity) {
                    mutableList.set(i, merchandise);
                    break;
                }
            }
        }
        return new j760(mutableList, j760Var.b);
    }

    /* JADX INFO: renamed from: u */
    public static c m4458u(IntlPurchasePageContentNewView intlPurchasePageContentNewView, List list) {
        if (list.isEmpty()) {
            return c.just(list);
        }
        CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
        Context context = intlPurchasePageContentNewView.act;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        return coreBusinessServiceA.g5(context, list);
    }

    /* JADX INFO: renamed from: u0 */
    public static final j760 m4459u0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m4461w(IntlPurchasePageContentNewView intlPurchasePageContentNewView, C0190d c0190d) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.a(intlPurchasePageContentNewView.paymentComponent) || (dgnVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dgnVar.f9241k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: x */
    public static void m4462x(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m4463y(C0190d c0190d) {
        return Boolean.valueOf(c0190d.m4094j());
    }

    /* JADX INFO: renamed from: z */
    public static List m4464z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A0 */
    public final g30<PurchaseType, Act, String> m4465A0(final g30<PurchaseType, Act, String> original) {
        return new g30() { // from class: l.e6p
            /* JADX INFO: renamed from: a */
            public final void m12248a(Object obj, Object obj2, Object obj3) {
                IntlPurchasePageContentNewView.m4418K(this.f9597a, original, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: T */
    public final void m4466T(View view) {
        i6p.a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public final void m4467U() {
        boolean z = this.isWeeklyMerchandiseSelected && this.premiumWeeklyGuideNeedGuide;
        if (z && !this.boostBannerTracked) {
            this.boostBannerTracked = true;
            zvf0.x("e_intl_premium_weekly_get_boost_banner", "p_purchase_page");
        }
        g6e0 g6e0Var = this.showcaseComponent;
        if (g6e0Var instanceof g6e0) {
            g6e0Var.getClass();
            final g6e0 g6e0Var2 = g6e0Var;
            if (z && this.boostPriceStr.length() == 0 && !this.boostPriceFetching) {
                this.boostPriceFetching = true;
                Act act = this.act;
                if (act == null) {
                    Intrinsics.r("act");
                    act = null;
                }
                c cVarZ5 = CoreModule.c.j0.z5(ProductCategory.get("tttBoost"), false);
                final Function1 function1 = new Function1() { // from class: l.h5p
                    public final Object invoke(Object obj) {
                        return IntlPurchasePageContentNewView.m4458u(this.f11885a, (List) obj);
                    }
                };
                act.duringCreated(cVarZ5.switchMap(new w9j() { // from class: l.i5p
                    public final Object call(Object obj) {
                        return IntlPurchasePageContentNewView.m4417J(function1, obj);
                    }
                }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.j5p
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m4416I(this.f13587a, g6e0Var2, (List) obj);
                    }
                }, new e30() { // from class: l.k5p
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m4434g(this.f14205a, (Throwable) obj);
                    }
                }));
            } else {
                g6e0Var2.p(z, this.boostPriceStr);
            }
        }
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
        if (intlPurchaseExclusivePrivilegeView != null) {
            intlPurchaseExclusivePrivilegeView.m4406e(this.isWeeklyMerchandiseSelected, this.premiumWeeklyGuideNeedGuide);
        }
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.m11864i1(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m4468V() {
        Runnable runnable = this.promotionRefreshRunnable;
        if (runnable != null) {
            this.promotionRefreshHandler.removeCallbacks(runnable);
        }
        this.promotionRefreshRunnable = null;
    }

    /* JADX INFO: renamed from: X */
    public final void m4469X(List<? extends C0190d> sections) {
        boolean z = CoreModule.c.j0.T4() || CoreModule.c.j0.z4();
        final boolean zC4 = CoreModule.c.x0.c4();
        if (z || zC4) {
            List<? extends C0190d> list = sections;
            C0190d c0190d = (C0190d) vwb.r(list, new w9j() { // from class: l.z5p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4421N(zC4, (C0190d) obj);
                }
            });
            if (c0190d != null) {
                vwb.z(list, new e30() { // from class: l.a6p
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m4446o((C0190d) obj);
                    }
                });
                c0190d.m4106v(true);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m4470Y() {
        if (this.isDialogPageShow) {
            i0e.e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: Z */
    public final void m4471Z() {
        if (!vwb.J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m4483w0(this.purchaseSections);
        }
        if (h6a.i()) {
            g6e0 g6e0Var = this.showcaseComponent;
            if (g6e0Var instanceof g6e0) {
                g6e0Var.getClass();
                g6e0Var.o();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4472a0(ProductCategory category, List<? extends Merchandise> merchandises, List<? extends Merchandise> upgradeMerchandises) {
        C0190d.a aVarM4086b;
        C0190d.a aVarM4086b2;
        boolean zA = NullChecker.a(vwb.r(merchandises, new w9j() { // from class: l.q5p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4426S((Merchandise) obj);
            }
        }));
        this.isPromotion = zA;
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.g(zA);
        }
        rwl rwlVarZ = cjy.z(category);
        Context context = this.act;
        PurchaseType purchaseType = null;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
            purchaseType2 = null;
        }
        List<? extends C0190d> listA = rwlVarZ.a(context, purchaseType2, category, merchandises);
        listA.getClass();
        ArrayList arrayList = new ArrayList();
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.c.G2.R;
        if (h6a.c() && NullChecker.a(membershipUpgradeInfo) && !vwb.J(upgradeMerchandises) && TEnum.equals(membershipUpgradeInfo.category, this.upgradeCategory)) {
            rwl rwlVarZ2 = cjy.z(this.upgradeCategory);
            Context context2 = this.act;
            if (context2 == null) {
                Intrinsics.r("act");
                context2 = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
                purchaseType3 = null;
            }
            List<C0190d> listA2 = rwlVarZ2.a(context2, purchaseType3, this.upgradeCategory, upgradeMerchandises);
            for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
                for (C0190d c0190d : listA2) {
                    if (c0190d.m4088d() != null) {
                        aVarM4086b2 = c0190d.m4088d();
                        aVarM4086b2.getClass();
                    } else {
                        aVarM4086b2 = c0190d.m4086b();
                        aVarM4086b2.getClass();
                    }
                    if (aVarM4086b2.m4171w() == membershipUpgradeDurationInfo.count) {
                        arrayList.add(c0190d);
                    }
                }
            }
            if (listA.get(0).m4088d() != null) {
                aVarM4086b = listA.get(0).m4088d();
                aVarM4086b.getClass();
            } else {
                aVarM4086b = listA.get(0).m4086b();
                aVarM4086b.getClass();
            }
            String strM4155k = aVarM4086b.m4155k();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                C0190d c0190d2 = (C0190d) next;
                c0190d2.m4106v(false);
                if (c0190d2.m4088d() == null) {
                    c0190d2.m4086b().m4132V(strM4155k);
                } else {
                    c0190d2.m4088d().m4132V(strM4155k);
                }
            }
            if (!vwb.J(arrayList)) {
                ((C0190d) arrayList.get(0)).m4106v(true);
                Iterator<? extends C0190d> it2 = listA.iterator();
                while (it2.hasNext()) {
                    it2.next().m4106v(false);
                }
            }
        }
        if (vwb.J(arrayList)) {
            f7p.m12992d(listA, category, this.defaultSkuDuration);
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.r("purchaseType");
                purchaseType4 = null;
            }
            if (purchaseType4 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                m4469X(listA);
            }
        }
        if (h6a.i()) {
            Act act = this.act;
            if (act == null) {
                Intrinsics.r("act");
                act = null;
            }
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.r("purchaseType");
                purchaseType5 = null;
            }
            g6e0 g6e0Var = new g6e0(act, purchaseType5);
            this.showcaseComponent = g6e0Var;
            View viewA = g6e0Var.a(get_showcase_root(), this.screenSize);
            g6e0 g6e0Var2 = this.showcaseComponent;
            g6e0Var2.getClass();
            g6e0Var2.k(listA, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction, arrayList);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Privilege privilege = this.primaryPrivilege;
            if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
                xdl0.X(get_showcase_root(), 0);
            }
            get_showcase_root().addView(viewA, layoutParams);
        } else {
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.r("act");
                act2 = null;
            }
            PurchaseType purchaseType6 = this.purchaseType;
            if (purchaseType6 == null) {
                Intrinsics.r("purchaseType");
                purchaseType6 = null;
            }
            id40 id40Var = new id40(act2, purchaseType6);
            this.showcaseComponent = id40Var;
            View viewA2 = id40Var.a(get_showcase_root(), this.screenSize);
            if (NullChecker.a(viewA2)) {
                if (this.showcaseComponent instanceof id40) {
                    if (listA.size() == 2) {
                        id40 id40Var2 = this.showcaseComponent;
                        id40Var2.getClass();
                        id40Var2.d0(t100.d(47.0f));
                        id40 id40Var3 = this.showcaseComponent;
                        id40Var3.getClass();
                        id40Var3.f0(t100.d(47.0f));
                    } else {
                        PurchaseType purchaseType7 = this.purchaseType;
                        if (purchaseType7 == null) {
                            Intrinsics.r("purchaseType");
                            purchaseType7 = null;
                        }
                        PurchaseType purchaseType8 = PurchaseType.TYPE_GET_LIKERS;
                        id40 id40Var4 = this.showcaseComponent;
                        if (purchaseType7 == purchaseType8) {
                            id40Var4.getClass();
                            int i = t100.n;
                            id40Var4.d0(i);
                            id40 id40Var5 = this.showcaseComponent;
                            id40Var5.getClass();
                            id40Var5.f0(i);
                        } else {
                            id40Var4.getClass();
                            int i2 = t100.j;
                            id40Var4.d0(i2);
                            id40 id40Var6 = this.showcaseComponent;
                            id40Var6.getClass();
                            id40Var6.f0(i2);
                        }
                    }
                    id40 id40Var7 = this.showcaseComponent;
                    id40Var7.getClass();
                    id40Var7.c0(0);
                    id40 id40Var8 = this.showcaseComponent;
                    id40Var8.getClass();
                    id40Var8.H(new mp0.a() { // from class: l.r5p
                        /* JADX INFO: renamed from: a */
                        public final void m21779a(boolean z, boolean z2) {
                            IntlPurchasePageContentNewView.m4420M(this.f18373a, z, z2);
                        }
                    });
                }
                c3m c3mVar = this.showcaseComponent;
                if (c3mVar != null) {
                    c3mVar.f(listA, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction);
                }
            }
            get_showcase_root().addView(viewA2, new LinearLayout.LayoutParams(-1, -2));
        }
        PurchaseType purchaseType9 = this.purchaseType;
        if (purchaseType9 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType9;
        }
        if (purchaseType != PurchaseType.TYPE_GET_LIKERS && this.exclusivePrivilegeView != null) {
            xdl0.M(get_introduce(), true);
        }
        m4485y0(listA);
        m4482v0();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4473b0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionE3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.c.x0.P3() || (iapAffiliatePromotionE3 = CoreModule.c.x0.E3()) == null || CoreModule.c.x0.c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.c.x0.m4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
                String str = affiliateProducts.googleplay;
                String string = str != null ? StringsKt.Z0(str).toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    String strM3 = CoreIntlAffiliatePromotions.m3(string, iapAffiliatePromotionE3.iapId, iapAffiliatePromotionE3.offerId);
                    strM3.getClass();
                    if (strM3.length() != 0 && !Intrinsics.d(strM3, string)) {
                        Merchandise merchandiseClone = merchandise.clone();
                        merchandiseClone.getClass();
                        StockKeepUnit stockKeepUnit2 = merchandiseClone.defaultStockKeepUnit;
                        if (stockKeepUnit2 != null) {
                            stockKeepUnit2.affiliateProducts.googleplay = strM3;
                            merchandises.set(i, merchandiseClone);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4474c0() {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.a(this.paymentComponent) || (dgnVar = this.paymentComponent) == null || (onClickListener = dgnVar.f9241k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4475d0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
        this.multiPages = multiPages;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4476e0() {
        dgn dgnVar;
        c3m c3mVar;
        m4468V();
        c4g0 c4g0Var = this.countdownDismissedSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.countdownDismissedSub = null;
        if (NullChecker.a(this.showcaseComponent) && (c3mVar = this.showcaseComponent) != null) {
            c3mVar.release();
        }
        if (NullChecker.a(this.paymentComponent) && (dgnVar = this.paymentComponent) != null) {
            dgnVar.release();
        }
        if (NullChecker.a(this.subscription)) {
            c4g0 c4g0Var2 = this.subscription;
            c4g0Var2.getClass();
            c4g0Var2.unsubscribe();
            this.subscription = null;
        }
        get_payment_view().m4497k();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4477f0() {
        this.screenSize = hmb.q1();
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
        m4480i0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        m4479h0(purchaseType3);
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
        m4478g0(act2, purchaseType);
        m4481j0();
        m4484x0();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4478g0(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            xdl0.M(get_introduce(), false);
            return;
        }
        xdl0.M(get_introduce(), true);
        View viewInflate = act.inflater().inflate(m6c0.P, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = (IntlPurchaseExclusivePrivilegeView) viewInflate;
        intlPurchaseExclusivePrivilegeView.m4405d(purchaseType);
        this.exclusivePrivilegeView = intlPurchaseExclusivePrivilegeView;
        get_introduce().addView(intlPurchaseExclusivePrivilegeView);
    }

    @NotNull
    public final List<C0190d> getPurchaseSections() {
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

    @Nullable
    public final ProductCategory getUpgradeCategory() {
        return this.upgradeCategory;
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
    public final IntlPurchasePagePaymentView get_payment_view() {
        IntlPurchasePagePaymentView intlPurchasePagePaymentView = this._payment_view;
        if (intlPurchasePagePaymentView != null) {
            return intlPurchasePagePaymentView;
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
    public final FrameLayout get_showcase_root() {
        FrameLayout frameLayout = this._showcase_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_showcase_root");
        return null;
    }

    @NotNull
    public final FrameLayout get_weekly_promo_banner_container() {
        FrameLayout frameLayout = this._weekly_promo_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_weekly_promo_banner_container");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4479h0(PurchaseType purchaseType) {
        IntlPurchasePagePaymentView.m4487i(get_payment_view(), purchaseType, this.from, false, 4, null);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(m4465A0(this.onPaymentSuccess));
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m4499m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4480i0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            xdl0.X(get_privilege(), t100.z);
            final View viewM9466a = new aap(act, null).m9466a(get_privilege());
            get_privilege().addView(viewM9466a);
            aap.m9465c(viewM9466a);
            act.duringCreated(CoreModule.c.u0.e7()).subscribe(mkd0.H(new e30() { // from class: l.c6p
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m4428a(viewM9466a, (roj0) obj);
                }
            }, new e30() { // from class: l.d6p
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m4462x((Throwable) obj);
                }
            }));
            Object tag = viewM9466a.getTag(z4c0.J0);
            if (tag instanceof ExplodeLayout) {
                ((ExplodeLayout) tag).k();
                return;
            }
            return;
        }
        if (privilege != null && privilege != Privilege.vip_badge && privilege != Privilege.svip_badge && privilege != Privilege.ultra_premium_badge) {
            xdl0.X(get_privilege(), t100.t);
            View viewInflate = act.inflater().inflate(m6c0.S, (ViewGroup) get_privilege(), false);
            viewInflate.getClass();
            IntlPurchasePrivilegeView intlPurchasePrivilegeView = (IntlPurchasePrivilegeView) viewInflate;
            intlPurchasePrivilegeView.m4511b(purchaseType, privilege);
            get_privilege().addView(intlPurchasePrivilegeView);
            return;
        }
        xdl0.X(get_privilege(), 0);
        xdl0.X(get_introduce(), 0);
        View viewInflate2 = act.inflater().inflate(m6c0.R, (ViewGroup) get_privilege(), false);
        VImage vImageFindViewById = viewInflate2.findViewById(z4c0.d0);
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            vImageFindViewById.setImageResource(d3c0.e1);
        } else if (sab0.v(purchaseType)) {
            vImageFindViewById.setImageResource(d3c0.f1);
        } else {
            vImageFindViewById.setImageResource(d3c0.g1);
        }
        get_privilege().addView(viewInflate2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4481j0() {
        c cVarJust;
        final c cVarJust2;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        if (!h6a.c() || (xma.m4() && xma.m4())) {
            cVarJust = c.just((Object) null);
            cVarJust.getClass();
        } else {
            cVarJust = CoreModule.c.G2.s3();
            cVarJust.getClass();
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
            purchaseType2 = null;
        }
        if (purchaseType2 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && ((CoreModule.c.j0.T4() || CoreModule.c.j0.z4()) && CoreModule.c.x0.P3())) {
            c cVarY5 = CoreModule.c.j0.y5(ProductCategory.get("tttSvipGoogleplayFreeTrial"));
            final Function1 function1 = new Function1() { // from class: l.r4p
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m4408A((List) obj);
                }
            };
            c cVarFilter = cVarY5.filter(new w9j() { // from class: l.w4p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4429b(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.x4p
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m4438k((List) obj);
                }
            };
            cVarJust2 = cVarFilter.map(new w9j() { // from class: l.y4p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4464z(function2, obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.z4p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4415H((Throwable) obj);
                }
            });
        } else {
            cVarJust2 = c.just((Object) null);
        }
        final Function1 function3 = new Function1() { // from class: l.b5p
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m4452r(this.f7997a, (Envelope) obj);
            }
        };
        c cVarTake = cVarJust.flatMap(new w9j() { // from class: l.c5p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4411D(function3, obj);
            }
        }).take(1);
        final Function1 function4 = new Function1() { // from class: l.d5p
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m4433f((j760) obj);
            }
        };
        c cVarFilter2 = cVarTake.filter(new w9j() { // from class: l.e5p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4448p(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.f5p
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m4435h(cVarJust2, (j760) obj);
            }
        };
        c cVarFlatMap = cVarFilter2.flatMap(new w9j() { // from class: l.s4p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4414G(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.t4p
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m4409B(this.f19418a, (j760) obj);
            }
        };
        this.subscription = cVarFlatMap.flatMap(new w9j() { // from class: l.u4p
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m4432e(function6, obj);
            }
        }).take(1).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.v4p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4413F(this.f20971a, productCategory, (j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4476e0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4466T(this);
    }

    public final void setAutoPay(boolean autoPay) {
        this.shouldAutoPay = autoPay;
    }

    public final void setDefaultSkuDuration(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    public final void setDialogStateAction(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setInitSelectTab(boolean isInitSelectTab) {
        this.isInitSelectTab = isInitSelectTab;
    }

    public final void setOnPaymentFailed(@Nullable g30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    public final void setPurchasePageTrack(@NotNull hab0 purchasePageTrack) {
        purchasePageTrack.getClass();
        this.purchasePageTrack = purchasePageTrack;
    }

    public final void setUpgradeCategory(@Nullable ProductCategory productCategory) {
        this.upgradeCategory = productCategory;
    }

    public final void set_introduce(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._introduce = frameLayout;
    }

    public final void set_payment_view(@NotNull IntlPurchasePagePaymentView intlPurchasePagePaymentView) {
        intlPurchasePagePaymentView.getClass();
        this._payment_view = intlPurchasePagePaymentView;
    }

    public final void set_privilege(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._privilege = linearLayout;
    }

    public final void set_showcase_root(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._showcase_root = frameLayout;
    }

    public final void set_weekly_promo_banner_container(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._weekly_promo_banner_container = frameLayout;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m4482v0() {
        m4468V();
        long jJ3 = CoreModule.c.x0.J3();
        if (jJ3 <= 0) {
            return;
        }
        long jO = (jJ3 * 1000) - mqi0.o();
        if (jO <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.b6p
            @Override // java.lang.Runnable
            public final void run() {
                IntlPurchasePageContentNewView.m4440l(this.f8008a);
            }
        };
        this.promotionRefreshRunnable = runnable;
        this.promotionRefreshHandler.postDelayed(runnable, jO);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m4483w0(List<? extends C0190d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.r("purchaseType");
                purchaseType = null;
            }
            ProductCategory productCategory = purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.U(iab0.j(sections), ","));
            if (this.multiPages) {
                jSONObject.put("default_product", p2b0.m19990h().m19996g("vip").toString());
            } else {
                jSONObject.put("default_product", productCategory.toString());
            }
            jSONObject.put("default_duration", p2b0.m19990h().m20004p(productCategory));
            boolean zA = NullChecker.a(vwb.r(sections, new w9j() { // from class: l.g6p
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m4463y((C0190d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zA ? "yes" : "no");
            jSONObject.put("if_discount", zA);
            jSONObject.put("if_double_tab", this.multiPages);
            jSONObject.put("function_type", iab0.f(this.primaryPrivilege, this.from));
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
            jSONObject.put("ttc_page_type", "fullscreen");
            if (CoreModule.P().i().N()) {
                jSONObject.put("is_fakeunreal", (!CoreModule.c.e0.Z7() || CoreModule.c.e0.W7() || CoreModule.c.e0.k8()) ? false : true);
            }
            if ("online".equals(this.from) || "certified".equals(this.from) || "new".equals(this.from)) {
                jSONObject.put("tribe_subtype", this.from);
                jSONObject.put("purchaseShowFrom", "p_intl_tribe_view,e_intl_tribe_tribes_any_click,click");
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m4484x0() {
        c4g0 c4g0Var = this.countdownDismissedSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.countdownDismissedSub = CoreModule.c.x0.r4().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.f6p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4442m(this.f10152a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m4485y0(List<? extends C0190d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        if (this.isInitSelectTab && !this.isDialogPageShow && !vwb.J(this.purchaseSections)) {
            this.isDialogPageShow = true;
            m4483w0(this.purchaseSections);
        }
        qib0.e1("purchase_page_shown", new Object[]{"platform", "android"});
    }

    /* JADX INFO: renamed from: z0 */
    public final void m4486z0(C0190d section) {
        PurchaseType purchaseType = this.purchaseType;
        Act act = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        boolean z = false;
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            g6e0 g6e0Var = this.showcaseComponent;
            if (g6e0Var instanceof g6e0) {
                g6e0Var.getClass();
                g6e0.q(g6e0Var, false, (String) null, 2, (Object) null);
            }
            IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
            if (intlPurchaseExclusivePrivilegeView != null) {
                intlPurchaseExclusivePrivilegeView.m4406e(false, false);
            }
            this.isWeeklyMerchandiseSelected = false;
            dgn dgnVar = this.paymentComponent;
            if (dgnVar != null) {
                dgnVar.m11865j1(false);
                return;
            }
            return;
        }
        Merchandise merchandiseM4087c = section != null ? section.m4087c() : null;
        if (merchandiseM4087c != null && merchandiseM4087c.weekly() && merchandiseM4087c.autoRenewable()) {
            z = true;
        }
        this.isWeeklyMerchandiseSelected = z;
        dgn dgnVar2 = this.paymentComponent;
        if (dgnVar2 != null) {
            dgnVar2.m11865j1(z);
        }
        if (this.premiumWeeklyGuideSubscribed) {
            m4467U();
            return;
        }
        this.premiumWeeklyGuideSubscribed = true;
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.r("act");
        } else {
            act = act2;
        }
        act.duringCreated(CoreModule.c.j0.E5()).subscribe(mkd0.H(new e30() { // from class: l.h6p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4424Q(this.f11901a, (Boolean) obj);
            }
        }, new e30() { // from class: l.q4p
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m4437j(this.f17810a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchasePageContentNewView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPurchasePageContentNewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
