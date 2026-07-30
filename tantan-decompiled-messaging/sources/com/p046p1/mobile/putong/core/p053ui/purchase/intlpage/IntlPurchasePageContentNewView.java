package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.AffiliateProducts;
import com.p046p1.mobile.putong.core.data.FreeTrialData;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePageContentNewView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VImage;
import p149l.aap;
import p149l.b2s;
import p149l.c3m;
import p149l.c4g0;
import p149l.cb9;
import p149l.cjy;
import p149l.cwf0;
import p149l.d3c0;
import p149l.dgn;
import p149l.e30;
import p149l.e51;
import p149l.f7p;
import p149l.g30;
import p149l.g6e0;
import p149l.h6a;
import p149l.hab0;
import p149l.hmb;
import p149l.i0e;
import p149l.i6p;
import p149l.iab0;
import p149l.id40;
import p149l.igj;
import p149l.j6f;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.m6c0;
import p149l.mkd0;
import p149l.mp0;
import p149l.mqi0;
import p149l.p2b0;
import p149l.qib0;
import p149l.roj0;
import p149l.rwl;
import p149l.rxa0;
import p149l.sab0;
import p149l.t0g0;
import p149l.t100;
import p149l.u9p;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xdl0;
import p149l.xma;
import p149l.z4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u001d\u0010)\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\u000eJ\u001d\u00104\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b4\u0010*J\u001d\u00105\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b5\u0010*J\u001d\u00106\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020\nH\u0014¢\u0006\u0004\b7\u0010\u000eJ9\u0010;\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u00108\u001a\u0004\u0018\u00010!2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=¢\u0006\u0004\b@\u0010AJ+\u0010C\u001a\u00020\n2\u001c\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 ¢\u0006\u0004\bC\u0010DJ)\u0010F\u001a\u00020\n2\u001a\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\bF\u0010DJ\u0015\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u000209¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010!¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u000209¢\u0006\u0004\bN\u0010IJ\u0015\u0010Q\u001a\u00020\n2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\n¢\u0006\u0004\bS\u0010\u000eJ\r\u0010T\u001a\u00020\n¢\u0006\u0004\bT\u0010\u000eJ\r\u0010U\u001a\u00020\n¢\u0006\u0004\bU\u0010\u000eJ\u000f\u0010V\u001a\u00020\nH\u0014¢\u0006\u0004\bV\u0010\u000eJ\r\u0010W\u001a\u00020\n¢\u0006\u0004\bW\u0010\u000eJ\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\n¢\u0006\u0004\bZ\u0010\u000eR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u00108\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010TR\u001a\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R.\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u008b\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\"\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190&8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010TR\u0017\u0010G\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010TR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u007fR\u0018\u0010\u0097\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010TR\u0018\u0010\u0099\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010TR\u0018\u0010\u009b\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010TR\u0018\u0010\u009d\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010TR\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010 \u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010½\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010TR\u0018\u0010¿\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010TR\u0018\u0010Á\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010TR\u0018\u0010Ã\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u007fR\u0018\u0010Å\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010TR\u0018\u0010Ç\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010TR\u001d\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0087\u0001R\u001d\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0087\u0001R\u001e\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0087\u0001R+\u0010Õ\u0001\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001¨\u0006Ö\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageContentNewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", j6f.GPS_DIRECTION_TRUE, "(Landroid/view/View;)V", "x0", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "i0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "g0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "z0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "U", "h0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/g30;", "", "original", "A0", "(Ll/g30;)Ll/g30;", "j0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "b0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "upgradeMerchandises", "a0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;Ljava/util/List;)V", "v0", j6f.GPS_MEASUREMENT_INTERRUPTED, "sections", "y0", "w0", "X", "onFinishInflate", "from", "", "multiPages", "d0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "isInitSelectTab", "setInitSelectTab", "(Z)V", BLiveOperationTitleShowType.duration, "setDefaultSkuDuration", "(Ljava/lang/String;)V", "autoPay", "setAutoPay", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "f0", "Z", "Y", "onDetachedFromWindow", "e0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_showcase_root", "()Landroid/widget/FrameLayout;", "set_showcase_root", "(Landroid/widget/FrameLayout;)V", "_showcase_root", "c", "get_weekly_promo_banner_container", "set_weekly_promo_banner_container", "_weekly_promo_banner_container", Constants.INAPP_DATA_TAG, "get_introduce", "set_introduce", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "h", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "j", "k", "Ll/hab0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/e30;", "m", "Ll/g30;", "n", "onPaymentFailedAction", "o", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "p", "isDialogPageShow", "q", "r", "defaultSkuDuration", BLiveStormDanmakuGiftResourceType.f44446s, "shouldAutoPay", Constants.KEY_T, "autoPayTriggered", "u", "screenSize", ResourceDirection.f38808v, "isPromotion", "Ll/c4g0;", "w", "Ll/c4g0;", "subscription", "Landroid/os/Handler;", BaseSei.f13930X, "Landroid/os/Handler;", "promotionRefreshHandler", "Ljava/lang/Runnable;", BaseSei.f13931Y, "Ljava/lang/Runnable;", "promotionRefreshRunnable", BaseSei.f13932Z, "countdownDismissedSub", "Ll/cwf0;", "A", "Ll/cwf0;", "statisticsPageHelper", "Ll/c3m;", "B", "Ll/c3m;", "showcaseComponent", "Ll/dgn;", b2s.C_ZONE, "Ll/dgn;", "paymentComponent", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "D", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "exclusivePrivilegeView", "E", "premiumWeeklyGuideNeedGuide", "F", "premiumWeeklyGuideSubscribed", "G", "isWeeklyMerchandiseSelected", "H", "boostPriceStr", "I", "boostPriceFetching", "J", "boostBannerTracked", "K", "currentSelectPurchaseSectionAction", "L", "currentSelectPurchaseSectionPayAction", "Lcom/p1/mobile/putong/data/PayMethod;", "M", "currentSelectPayTypeAction", "N", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "getUpgradeCategory", "()Lcom/p1/mobile/putong/core/data/ProductCategory;", "setUpgradeCategory", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)V", "upgradeCategory", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final e30<C8765d> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final e30<C8765d> currentSelectPurchaseSectionPayAction;

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
    public final List<C8765d> purchaseSections;

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
        cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_page", IntlPurchasePageContentNewView.class.getName());
        cwf0VarM133794c.getClass();
        this.statisticsPageHelper = cwf0VarM133794c;
        this.boostPriceStr = "";
        this.currentSelectPurchaseSectionAction = new e30() { // from class: l.p4p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53870i(this.f147199a, (C8765d) obj);
            }
        };
        this.currentSelectPurchaseSectionPayAction = new e30() { // from class: l.a5p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53895w(this.f67716a, (C8765d) obj);
            }
        };
        this.currentSelectPayTypeAction = new e30() { // from class: l.l5p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53859R(this.f126193a, (PayMethod) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m53842A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static C22306c m53843B(IntlPurchasePageContentNewView intlPurchasePageContentNewView, j760 j760Var) {
        F f = j760Var.f116564a;
        f.getClass();
        List<Merchandise> mutableList = CollectionsKt.toMutableList((Collection) f);
        intlPurchasePageContentNewView.m53907b0(mutableList);
        boolean zM200296J = vwb.m200296J((Collection) j760Var.f116565b);
        Act act = intlPurchasePageContentNewView.act;
        Act act2 = null;
        if (zM200296J) {
            if (act == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act = null;
            }
            C22306c<List<Merchandise>> c22306cM136009M = igj.m136009M(act, mutableList);
            final Function1 function1 = new Function1() { // from class: l.m5p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m53873k0((List) obj);
                }
            };
            return c22306cM136009M.map(new w9j() { // from class: l.n5p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53875l0(function1, obj);
                }
            });
        }
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        C22306c<List<Merchandise>> c22306cM136009M2 = igj.m136009M(act, mutableList);
        Act act3 = intlPurchasePageContentNewView.act;
        if (act3 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
        } else {
            act2 = act3;
        }
        S s = j760Var.f116565b;
        s.getClass();
        C22306c<List<Merchandise>> c22306cM136009M3 = igj.m136009M(act2, (List) s);
        final Function2 function2 = new Function2() { // from class: l.o5p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m53877m0((List) obj, (List) obj2);
            }
        };
        return mkd0.m154984r(c22306cM136009M2, c22306cM136009M3, new x9j() { // from class: l.p5p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m53879n0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static C22306c m53845D(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m53847F(IntlPurchasePageContentNewView intlPurchasePageContentNewView, ProductCategory productCategory, j760 j760Var) {
        intlPurchasePageContentNewView.m53906a0(productCategory, (List) j760Var.f116564a, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: G */
    public static C22306c m53848G(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static C22306c m53849H(Throwable th) {
        return C22306c.just(null);
    }

    /* JADX INFO: renamed from: I */
    public static void m53850I(IntlPurchasePageContentNewView intlPurchasePageContentNewView, g6e0 g6e0Var, List list) {
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
            intlPurchasePageContentNewView.boostPriceStr = prices.currencySymbol + t0g0.m186864e(prices.price);
        }
        g6e0Var.m124587p(true, intlPurchasePageContentNewView.boostPriceStr);
    }

    /* JADX INFO: renamed from: J */
    public static C22306c m53851J(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static void m53852K(IntlPurchasePageContentNewView intlPurchasePageContentNewView, g30 g30Var, PurchaseType purchaseType, Act act, String str) {
        if (intlPurchasePageContentNewView.isWeeklyMerchandiseSelected) {
            CoreModule.f17545c.f19654j0.m30641x4();
        }
        if (sab0.m182904v(purchaseType)) {
            intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
            c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
            if (c4g0Var != null) {
                c4g0Var.unsubscribe();
            }
            intlPurchasePageContentNewView.subscription = null;
            intlPurchasePageContentNewView.m53915j0();
        }
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m53854M(IntlPurchasePageContentNewView intlPurchasePageContentNewView, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            lsi0.m151578h(R$string.f27281R3);
        }
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m53855N(boolean z, C8765d c8765d) {
        AffiliateProducts affiliateProducts;
        String str;
        Merchandise merchandiseM53521c = c8765d.m53521c();
        if (merchandiseM53521c == null) {
            return Boolean.FALSE;
        }
        StockKeepUnit stockKeepUnit = merchandiseM53521c.defaultStockKeepUnit;
        if (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) {
            return Boolean.FALSE;
        }
        if (z) {
            return Boolean.valueOf(CoreModule.f17545c.f19696x0.m30203l4(merchandiseM53521c));
        }
        FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
        return freeTrialDataM30576C4 == null ? Boolean.FALSE : Boolean.valueOf(Intrinsics.m87488d(str, freeTrialDataM30576C4.skuId));
    }

    /* JADX INFO: renamed from: Q */
    public static void m53858Q(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Boolean bool) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = Intrinsics.m87488d(bool, Boolean.TRUE);
        intlPurchasePageContentNewView.m53901U();
    }

    /* JADX INFO: renamed from: R */
    public static void m53859R(IntlPurchasePageContentNewView intlPurchasePageContentNewView, PayMethod payMethod) {
        c3m c3mVar;
        payMethod.getClass();
        if (!NullChecker.m81303a(intlPurchasePageContentNewView.showcaseComponent) || (c3mVar = intlPurchasePageContentNewView.showcaseComponent) == null) {
            return;
        }
        c3mVar.mo105095e(payMethod);
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m53860S(Merchandise merchandise) {
        return Boolean.valueOf(rxa0.m181493n(merchandise));
    }

    /* JADX INFO: renamed from: W */
    public static final void m53861W(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m81303a(intlPurchasePageContentNewView.paymentComponent) || (dgnVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dgnVar.f86137k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: a */
    public static void m53862a(View view, roj0 roj0Var) {
        aap.m95564c(view);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m53863b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static C22306c m53866e(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m53867f(j760 j760Var) {
        return Boolean.valueOf(!vwb.m200296J((Collection) j760Var.f116564a));
    }

    /* JADX INFO: renamed from: g */
    public static void m53868g(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.boostPriceFetching = false;
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: h */
    public static C22306c m53869h(C22306c c22306c, final j760 j760Var) {
        final Function1 function1 = new Function1() { // from class: l.x5p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m53891t0(j760Var, (List) obj);
            }
        };
        return c22306c.map(new w9j() { // from class: l.y5p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53893u0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m53870i(final IntlPurchasePageContentNewView intlPurchasePageContentNewView, C8765d c8765d) {
        C8765d.a aVarM53520b;
        dgn dgnVar;
        intlPurchasePageContentNewView.m53920z0(c8765d);
        if (NullChecker.m81303a(intlPurchasePageContentNewView.paymentComponent) && (dgnVar = intlPurchasePageContentNewView.paymentComponent) != null) {
            dgnVar.mo111147b(c8765d);
        }
        if (intlPurchasePageContentNewView.get_payment_view() != null) {
            intlPurchasePageContentNewView.get_payment_view().m53930j(c8765d);
        }
        PurchaseType purchaseType = null;
        if (intlPurchasePageContentNewView.shouldAutoPay && !intlPurchasePageContentNewView.autoPayTriggered && NullChecker.m81303a(c8765d)) {
            intlPurchasePageContentNewView.autoPayTriggered = true;
            Act act = intlPurchasePageContentNewView.act;
            if (act == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act = null;
            }
            e51.m114743H(act, new Runnable() { // from class: l.w5p
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPurchasePageContentNewView.m53861W(this.f184733a);
                }
            }, 300L);
        }
        if (NullChecker.m81303a(intlPurchasePageContentNewView.showcaseComponent) && (intlPurchasePageContentNewView.showcaseComponent instanceof g6e0)) {
            if (c8765d == null || (aVarM53520b = c8765d.m53522d()) == null) {
                aVarM53520b = c8765d != null ? c8765d.m53520b() : null;
            }
            boolean zM105983k3 = CoreModule.f17545c.f19569G2.m105983k3(aVarM53520b != null ? aVarM53520b.m53579f() : null);
            CoreModule.f17545c.f19569G2.f80118S.onNext(Boolean.valueOf(zM105983k3));
            c3m c3mVar = intlPurchasePageContentNewView.showcaseComponent;
            c3mVar.getClass();
            ((g6e0) c3mVar).m124588r(zM105983k3);
            PurchaseType purchaseType2 = intlPurchasePageContentNewView.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType2 = null;
            }
            if (purchaseType2 != PurchaseType.TYPE_ULTRA_PREMIUM) {
                PurchaseType purchaseType3 = intlPurchasePageContentNewView.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.m87502r("purchaseType");
                } else {
                    purchaseType = purchaseType3;
                }
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return;
                }
            }
            u9p.INSTANCE.m192623z(aVarM53520b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m53871j(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = false;
    }

    /* JADX INFO: renamed from: k */
    public static List m53872k(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.g5p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53881o0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final j760 m53873k0(List list) {
        list.getClass();
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m53874l(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m53915j0();
    }

    /* JADX INFO: renamed from: l0 */
    public static final j760 m53875l0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m53876m(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Long l2) {
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            intlPurchasePageContentNewView.m53902V();
            e30<Integer> e30Var = intlPurchasePageContentNewView.dialogStateAction;
            if (e30Var != null) {
                e30Var.call(0);
                return;
            }
            return;
        }
        intlPurchasePageContentNewView.m53902V();
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        c4g0 c4g0Var = intlPurchasePageContentNewView.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m53915j0();
    }

    /* JADX INFO: renamed from: m0 */
    public static final j760 m53877m0(List list, List list2) {
        list.getClass();
        list2.getClass();
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final j760 m53879n0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o */
    public static void m53880o(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m53881o0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f17545c.f19654j0.m30576C4() == null || !Intrinsics.m87488d(CoreModule.f17545c.f19654j0.m30576C4().skuId, merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m53882p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static final j760 m53883p0(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final j760 m53885q0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static C22306c m53886r(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Envelope envelope) {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        if (cb9Var.f80117R == null || !cb9Var.m105984l3(intlPurchasePageContentNewView.getPurchaseType())) {
            C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
            final Function1 function1 = new Function1() { // from class: l.s5p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m53883p0((List) obj);
                }
            };
            return c22306cM30644y5.map(new w9j() { // from class: l.t5p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53885q0(function1, obj);
                }
            });
        }
        C4732c c4732c = CoreModule.f17545c;
        intlPurchasePageContentNewView.upgradeCategory = c4732c.f19569G2.f80117R.category;
        C22306c<List<Merchandise>> c22306cM30644y6 = c4732c.f19654j0.m30644y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
        C22306c<List<Merchandise>> c22306cM30644y7 = CoreModule.f17545c.f19654j0.m30644y5(intlPurchasePageContentNewView.upgradeCategory);
        final Function2 function2 = new Function2() { // from class: l.u5p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m53887r0((List) obj, (List) obj2);
            }
        };
        return mkd0.m154984r(c22306cM30644y6, c22306cM30644y7, new x9j() { // from class: l.v5p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m53889s0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public static final j760 m53887r0(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final j760 m53889s0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t0 */
    public static final j760 m53891t0(j760 j760Var, List list) {
        F f = j760Var.f116564a;
        f.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) f);
        if (!vwb.m200296J(list)) {
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
        return new j760(mutableList, j760Var.f116565b);
    }

    /* JADX INFO: renamed from: u */
    public static C22306c m53892u(IntlPurchasePageContentNewView intlPurchasePageContentNewView, List list) {
        if (list.isEmpty()) {
            return C22306c.just(list);
        }
        CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
        Act act = intlPurchasePageContentNewView.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return coreBusinessServiceM94651a.mo33504g5(act, list);
    }

    /* JADX INFO: renamed from: u0 */
    public static final j760 m53893u0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m53895w(IntlPurchasePageContentNewView intlPurchasePageContentNewView, C8765d c8765d) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m81303a(intlPurchasePageContentNewView.paymentComponent) || (dgnVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dgnVar.f86137k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: x */
    public static void m53896x(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m53897y(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53528j());
    }

    /* JADX INFO: renamed from: z */
    public static List m53898z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A0 */
    public final g30<PurchaseType, Act, String> m53899A0(final g30<PurchaseType, Act, String> original) {
        return new g30() { // from class: l.e6p
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                IntlPurchasePageContentNewView.m53852K(this.f89627a, original, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: T */
    public final void m53900T(View view) {
        i6p.m134628a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public final void m53901U() {
        boolean z = this.isWeeklyMerchandiseSelected && this.premiumWeeklyGuideNeedGuide;
        if (z && !this.boostBannerTracked) {
            this.boostBannerTracked = true;
            zvf0.m220402x("e_intl_premium_weekly_get_boost_banner", "p_purchase_page");
        }
        c3m c3mVar = this.showcaseComponent;
        if (c3mVar instanceof g6e0) {
            c3mVar.getClass();
            final g6e0 g6e0Var = (g6e0) c3mVar;
            if (z && this.boostPriceStr.length() == 0 && !this.boostPriceFetching) {
                this.boostPriceFetching = true;
                Act act = this.act;
                if (act == null) {
                    Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                    act = null;
                }
                C22306c<List<Merchandise>> c22306cM30646z5 = CoreModule.f17545c.f19654j0.m30646z5(ProductCategory.get(ProductCategory.tttBoost), false);
                final Function1 function1 = new Function1() { // from class: l.h5p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntlPurchasePageContentNewView.m53892u(this.f105962a, (List) obj);
                    }
                };
                act.duringCreated(c22306cM30646z5.switchMap(new w9j() { // from class: l.i5p
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return IntlPurchasePageContentNewView.m53851J(function1, obj);
                    }
                }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.j5p
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m53850I(this.f116337a, g6e0Var, (List) obj);
                    }
                }, new e30() { // from class: l.k5p
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m53868g(this.f121216a, (Throwable) obj);
                    }
                }));
            } else {
                g6e0Var.m124587p(z, this.boostPriceStr);
            }
        }
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
        if (intlPurchaseExclusivePrivilegeView != null) {
            intlPurchaseExclusivePrivilegeView.m53840e(this.isWeeklyMerchandiseSelected, this.premiumWeeklyGuideNeedGuide);
        }
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.m111711i1(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m53902V() {
        Runnable runnable = this.promotionRefreshRunnable;
        if (runnable != null) {
            this.promotionRefreshHandler.removeCallbacks(runnable);
        }
        this.promotionRefreshRunnable = null;
    }

    /* JADX INFO: renamed from: X */
    public final void m53903X(List<? extends C8765d> sections) {
        boolean z = CoreModule.f17545c.f19654j0.m30608T4() || CoreModule.f17545c.f19654j0.m30645z4();
        final boolean zM30195c4 = CoreModule.f17545c.f19696x0.m30195c4();
        if (z || zM30195c4) {
            List<? extends C8765d> list = sections;
            C8765d c8765d = (C8765d) vwb.m200346r(list, new w9j() { // from class: l.z5p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53855N(zM30195c4, (C8765d) obj);
                }
            });
            if (c8765d != null) {
                vwb.m200354z(list, new e30() { // from class: l.a6p
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m53880o((C8765d) obj);
                    }
                });
                c8765d.m53540v(true);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m53904Y() {
        if (this.isDialogPageShow) {
            i0e.m133796e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: Z */
    public final void m53905Z() {
        if (!vwb.m200296J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m53917w0(this.purchaseSections);
        }
        if (h6a.m129476i()) {
            c3m c3mVar = this.showcaseComponent;
            if (c3mVar instanceof g6e0) {
                c3mVar.getClass();
                ((g6e0) c3mVar).m124586o();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m53906a0(ProductCategory category, List<? extends Merchandise> merchandises, List<? extends Merchandise> upgradeMerchandises) {
        C8765d.a aVarM53520b;
        C8765d.a aVarM53520b2;
        boolean zM81303a = NullChecker.m81303a(vwb.m200346r(merchandises, new w9j() { // from class: l.q5p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53860S((Merchandise) obj);
            }
        }));
        this.isPromotion = zM81303a;
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.mo111155g(zM81303a);
        }
        rwl rwlVarM107330z = cjy.m107330z(category);
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        List<C8765d> listMo107333a = rwlVarM107330z.mo107333a(act, purchaseType2, category, merchandises);
        listMo107333a.getClass();
        ArrayList arrayList = new ArrayList();
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f17545c.f19569G2.f80117R;
        if (h6a.m129470c() && NullChecker.m81303a(membershipUpgradeInfo) && !vwb.m200296J(upgradeMerchandises) && TEnum.equals(membershipUpgradeInfo.category, this.upgradeCategory)) {
            rwl rwlVarM107330z2 = cjy.m107330z(this.upgradeCategory);
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act2 = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType3 = null;
            }
            List<C8765d> listMo107333a2 = rwlVarM107330z2.mo107333a(act2, purchaseType3, this.upgradeCategory, upgradeMerchandises);
            for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
                for (C8765d c8765d : listMo107333a2) {
                    if (c8765d.m53522d() != null) {
                        aVarM53520b2 = c8765d.m53522d();
                        aVarM53520b2.getClass();
                    } else {
                        aVarM53520b2 = c8765d.m53520b();
                        aVarM53520b2.getClass();
                    }
                    if (aVarM53520b2.m53605w() == membershipUpgradeDurationInfo.count) {
                        arrayList.add(c8765d);
                    }
                }
            }
            if (listMo107333a.get(0).m53522d() != null) {
                aVarM53520b = listMo107333a.get(0).m53522d();
                aVarM53520b.getClass();
            } else {
                aVarM53520b = listMo107333a.get(0).m53520b();
                aVarM53520b.getClass();
            }
            String strM53589k = aVarM53520b.m53589k();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                C8765d c8765d2 = (C8765d) next;
                c8765d2.m53540v(false);
                if (c8765d2.m53522d() == null) {
                    c8765d2.m53520b().m53566V(strM53589k);
                } else {
                    c8765d2.m53522d().m53566V(strM53589k);
                }
            }
            if (!vwb.m200296J(arrayList)) {
                ((C8765d) arrayList.get(0)).m53540v(true);
                Iterator<C8765d> it2 = listMo107333a.iterator();
                while (it2.hasNext()) {
                    it2.next().m53540v(false);
                }
            }
        }
        if (vwb.m200296J(arrayList)) {
            f7p.m119811d(listMo107333a, category, this.defaultSkuDuration);
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType4 = null;
            }
            if (purchaseType4 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                m53903X(listMo107333a);
            }
        }
        if (h6a.m129476i()) {
            Act act3 = this.act;
            if (act3 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act3 = null;
            }
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType5 = null;
            }
            g6e0 g6e0Var = new g6e0(act3, purchaseType5);
            this.showcaseComponent = g6e0Var;
            View viewMo105092a = g6e0Var.mo105092a(get_showcase_root(), this.screenSize);
            c3m c3mVar = this.showcaseComponent;
            c3mVar.getClass();
            ((g6e0) c3mVar).m124582k(listMo107333a, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction, arrayList);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Privilege privilege = this.primaryPrivilege;
            if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
                xdl0.m208360X(get_showcase_root(), 0);
            }
            get_showcase_root().addView(viewMo105092a, layoutParams);
        } else {
            Act act4 = this.act;
            if (act4 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act4 = null;
            }
            PurchaseType purchaseType6 = this.purchaseType;
            if (purchaseType6 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType6 = null;
            }
            id40 id40Var = new id40(act4, purchaseType6);
            this.showcaseComponent = id40Var;
            View viewMo105092a2 = id40Var.mo105092a(get_showcase_root(), this.screenSize);
            if (NullChecker.m81303a(viewMo105092a2)) {
                if (this.showcaseComponent instanceof id40) {
                    if (listMo107333a.size() == 2) {
                        c3m c3mVar2 = this.showcaseComponent;
                        c3mVar2.getClass();
                        ((id40) c3mVar2).m135414d0(t100.m186890d(47.0f));
                        c3m c3mVar3 = this.showcaseComponent;
                        c3mVar3.getClass();
                        ((id40) c3mVar3).m135416f0(t100.m186890d(47.0f));
                    } else {
                        PurchaseType purchaseType7 = this.purchaseType;
                        if (purchaseType7 == null) {
                            Intrinsics.m87502r("purchaseType");
                            purchaseType7 = null;
                        }
                        PurchaseType purchaseType8 = PurchaseType.TYPE_GET_LIKERS;
                        c3m c3mVar4 = this.showcaseComponent;
                        if (purchaseType7 == purchaseType8) {
                            c3mVar4.getClass();
                            int i = t100.f167265n;
                            ((id40) c3mVar4).m135414d0(i);
                            c3m c3mVar5 = this.showcaseComponent;
                            c3mVar5.getClass();
                            ((id40) c3mVar5).m135416f0(i);
                        } else {
                            c3mVar4.getClass();
                            int i2 = t100.f167261j;
                            ((id40) c3mVar4).m135414d0(i2);
                            c3m c3mVar6 = this.showcaseComponent;
                            c3mVar6.getClass();
                            ((id40) c3mVar6).m135416f0(i2);
                        }
                    }
                    c3m c3mVar7 = this.showcaseComponent;
                    c3mVar7.getClass();
                    ((id40) c3mVar7).m135412c0(0);
                    c3m c3mVar8 = this.showcaseComponent;
                    c3mVar8.getClass();
                    ((id40) c3mVar8).m155738H(new mp0.InterfaceC18522a() { // from class: l.r5p
                        @Override // p149l.mp0.InterfaceC18522a
                        /* JADX INFO: renamed from: a */
                        public final void mo106044a(boolean z, boolean z2) {
                            IntlPurchasePageContentNewView.m53854M(this.f157863a, z, z2);
                        }
                    });
                }
                c3m c3mVar9 = this.showcaseComponent;
                if (c3mVar9 != null) {
                    c3mVar9.mo105096f(listMo107333a, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction);
                }
            }
            get_showcase_root().addView(viewMo105092a2, new LinearLayout.LayoutParams(-1, -2));
        }
        PurchaseType purchaseType9 = this.purchaseType;
        if (purchaseType9 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType = purchaseType9;
        }
        if (purchaseType != PurchaseType.TYPE_GET_LIKERS && this.exclusivePrivilegeView != null) {
            xdl0.m208344M(get_introduce(), true);
        }
        m53919y0(listMo107333a);
        m53916v0();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m53907b0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.f17545c.f19696x0.m30188P3() || (iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3()) == null || CoreModule.f17545c.f19696x0.m30195c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.f17545c.f19696x0.m30204m4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
                String str = affiliateProducts.googleplay;
                String string = str != null ? StringsKt.m93433Z0(str).toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    String strM30162m3 = CoreIntlAffiliatePromotions.m30162m3(string, iapAffiliatePromotionM30171E3.iapId, iapAffiliatePromotionM30171E3.offerId);
                    strM30162m3.getClass();
                    if (strM30162m3.length() != 0 && !Intrinsics.m87488d(strM30162m3, string)) {
                        Merchandise merchandiseMo223809clone = merchandise.mo223809clone();
                        merchandiseMo223809clone.getClass();
                        StockKeepUnit stockKeepUnit2 = merchandiseMo223809clone.defaultStockKeepUnit;
                        if (stockKeepUnit2 != null) {
                            stockKeepUnit2.affiliateProducts.googleplay = strM30162m3;
                            merchandises.set(i, merchandiseMo223809clone);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m53908c0() {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m81303a(this.paymentComponent) || (dgnVar = this.paymentComponent) == null || (onClickListener = dgnVar.f86137k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m53909d0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
        this.multiPages = multiPages;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m53910e0() {
        dgn dgnVar;
        c3m c3mVar;
        m53902V();
        c4g0 c4g0Var = this.countdownDismissedSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.countdownDismissedSub = null;
        if (NullChecker.m81303a(this.showcaseComponent) && (c3mVar = this.showcaseComponent) != null) {
            c3mVar.release();
        }
        if (NullChecker.m81303a(this.paymentComponent) && (dgnVar = this.paymentComponent) != null) {
            dgnVar.release();
        }
        if (NullChecker.m81303a(this.subscription)) {
            c4g0 c4g0Var2 = this.subscription;
            c4g0Var2.getClass();
            c4g0Var2.unsubscribe();
            this.subscription = null;
        }
        get_payment_view().m53931k();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m53911f0() {
        this.screenSize = hmb.m131712q1();
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        m53914i0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        m53913h0(purchaseType3);
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act2 = null;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType = purchaseType4;
        }
        m53912g0(act2, purchaseType);
        m53915j0();
        m53918x0();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m53912g0(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            xdl0.m208344M(get_introduce(), false);
            return;
        }
        xdl0.m208344M(get_introduce(), true);
        View viewInflate = act.inflater().inflate(m6c0.f131517P, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = (IntlPurchaseExclusivePrivilegeView) viewInflate;
        intlPurchaseExclusivePrivilegeView.m53839d(purchaseType);
        this.exclusivePrivilegeView = intlPurchaseExclusivePrivilegeView;
        get_introduce().addView(intlPurchaseExclusivePrivilegeView);
    }

    @NotNull
    public final List<C8765d> getPurchaseSections() {
        return this.purchaseSections;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType != null) {
            return purchaseType;
        }
        Intrinsics.m87502r("purchaseType");
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
        Intrinsics.m87502r("_introduce");
        return null;
    }

    @NotNull
    public final IntlPurchasePagePaymentView get_payment_view() {
        IntlPurchasePagePaymentView intlPurchasePagePaymentView = this._payment_view;
        if (intlPurchasePagePaymentView != null) {
            return intlPurchasePagePaymentView;
        }
        Intrinsics.m87502r("_payment_view");
        return null;
    }

    @NotNull
    public final LinearLayout get_privilege() {
        LinearLayout linearLayout = this._privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @NotNull
    public final FrameLayout get_showcase_root() {
        FrameLayout frameLayout = this._showcase_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_showcase_root");
        return null;
    }

    @NotNull
    public final FrameLayout get_weekly_promo_banner_container() {
        FrameLayout frameLayout = this._weekly_promo_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_weekly_promo_banner_container");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m53913h0(PurchaseType purchaseType) {
        IntlPurchasePagePaymentView.m53921i(get_payment_view(), purchaseType, this.from, false, 4, null);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(m53899A0(this.onPaymentSuccess));
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m53933m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m53914i0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            xdl0.m208360X(get_privilege(), t100.f167277z);
            final View viewM95565a = new aap(act, null).m95565a(get_privilege());
            get_privilege().addView(viewM95565a);
            aap.m95564c(viewM95565a);
            act.duringCreated(CoreModule.f17545c.f19687u0.m30437e7()).subscribe(mkd0.m154956H(new e30() { // from class: l.c6p
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m53862a(viewM95565a, (roj0) obj);
                }
            }, new e30() { // from class: l.d6p
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m53896x((Throwable) obj);
                }
            }));
            Object tag = viewM95565a.getTag(z4c0.f201477J0);
            if (tag instanceof ExplodeLayout) {
                ((ExplodeLayout) tag).m54227k();
                return;
            }
            return;
        }
        if (privilege != null && privilege != Privilege.vip_badge && privilege != Privilege.svip_badge && privilege != Privilege.ultra_premium_badge) {
            xdl0.m208360X(get_privilege(), t100.f167271t);
            View viewInflate = act.inflater().inflate(m6c0.f131529S, (ViewGroup) get_privilege(), false);
            viewInflate.getClass();
            IntlPurchasePrivilegeView intlPurchasePrivilegeView = (IntlPurchasePrivilegeView) viewInflate;
            intlPurchasePrivilegeView.m53945b(purchaseType, privilege);
            get_privilege().addView(intlPurchasePrivilegeView);
            return;
        }
        xdl0.m208360X(get_privilege(), 0);
        xdl0.m208360X(get_introduce(), 0);
        View viewInflate2 = act.inflater().inflate(m6c0.f131525R, (ViewGroup) get_privilege(), false);
        VImage vImage = (VImage) viewInflate2.findViewById(z4c0.f201520d0);
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            vImage.setImageResource(d3c0.f83899e1);
        } else if (sab0.m182904v(purchaseType)) {
            vImage.setImageResource(d3c0.f83913f1);
        } else {
            vImage.setImageResource(d3c0.f83927g1);
        }
        get_privilege().addView(viewInflate2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m53915j0() {
        C22306c<Envelope> c22306cJust;
        final C22306c c22306cJust2;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        if (!h6a.m129470c() || (xma.m210087m4() && xma.m210087m4())) {
            c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
        } else {
            c22306cJust = CoreModule.f17545c.f19569G2.m105991s3();
            c22306cJust.getClass();
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        if (purchaseType2 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && ((CoreModule.f17545c.f19654j0.m30608T4() || CoreModule.f17545c.f19654j0.m30645z4()) && CoreModule.f17545c.f19696x0.m30188P3())) {
            C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
            final Function1 function1 = new Function1() { // from class: l.r4p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m53842A((List) obj);
                }
            };
            C22306c<List<Merchandise>> c22306cFilter = c22306cM30644y5.filter(new w9j() { // from class: l.w4p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53863b(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.x4p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m53872k((List) obj);
                }
            };
            c22306cJust2 = c22306cFilter.map(new w9j() { // from class: l.y4p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53898z(function2, obj);
                }
            }).onErrorResumeNext((w9j<Throwable, ? extends C22306c<? extends R>>) new w9j() { // from class: l.z4p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53849H((Throwable) obj);
                }
            });
        } else {
            c22306cJust2 = C22306c.just(null);
        }
        final Function1 function3 = new Function1() { // from class: l.b5p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m53886r(this.f73686a, (Envelope) obj);
            }
        };
        C22306c c22306cTake = c22306cJust.flatMap(new w9j() { // from class: l.c5p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53845D(function3, obj);
            }
        }).take(1);
        final Function1 function4 = new Function1() { // from class: l.d5p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m53867f((j760) obj);
            }
        };
        C22306c c22306cFilter2 = c22306cTake.filter(new w9j() { // from class: l.e5p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53882p(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.f5p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m53869h(c22306cJust2, (j760) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cFilter2.flatMap(new w9j() { // from class: l.s4p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53848G(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.t4p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m53843B(this.f167741a, (j760) obj);
            }
        };
        this.subscription = c22306cFlatMap.flatMap(new w9j() { // from class: l.u4p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m53866e(function6, obj);
            }
        }).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.v4p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53847F(this.f179965a, productCategory, (j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53910e0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53900T(this);
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
    public final void m53916v0() {
        m53902V();
        long jM30181J3 = CoreModule.f17545c.f19696x0.m30181J3();
        if (jM30181J3 <= 0) {
            return;
        }
        long jM155944o = (jM30181J3 * 1000) - mqi0.m155944o();
        if (jM155944o <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.b6p
            @Override // java.lang.Runnable
            public final void run() {
                IntlPurchasePageContentNewView.m53874l(this.f73866a);
            }
        };
        this.promotionRefreshRunnable = runnable;
        this.promotionRefreshHandler.postDelayed(runnable, jM155944o);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m53917w0(List<? extends C8765d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType = null;
            }
            ProductCategory productCategory = purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.m200307U(iab0.m135149j(sections), Constants.SEPARATOR_COMMA));
            if (this.multiPages) {
                jSONObject.put("default_product", p2b0.m167133h().m167139g("vip").toString());
            } else {
                jSONObject.put("default_product", productCategory.toString());
            }
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(productCategory));
            boolean zM81303a = NullChecker.m81303a(vwb.m200346r(sections, new w9j() { // from class: l.g6p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m53897y((C8765d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM81303a ? "yes" : "no");
            jSONObject.put("if_discount", zM81303a);
            jSONObject.put("if_double_tab", this.multiPages);
            jSONObject.put("function_type", iab0.m135145f(this.primaryPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            jSONObject.put("ttc_page_type", "fullscreen");
            if (CoreModule.m29935P().m94658i().mo158272N()) {
                jSONObject.put("is_fakeunreal", (!CoreModule.f17545c.f19639e0.m169464Z7() || CoreModule.f17545c.f19639e0.m169452W7() || CoreModule.f17545c.f19639e0.m169506k8()) ? false : true);
            }
            if ("online".equals(this.from) || "certified".equals(this.from) || ShareConstants.NEW_VERSION.equals(this.from)) {
                jSONObject.put("tribe_subtype", this.from);
                jSONObject.put("purchaseShowFrom", "p_intl_tribe_view,e_intl_tribe_tribes_any_click,click");
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m53918x0() {
        c4g0 c4g0Var = this.countdownDismissedSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.countdownDismissedSub = CoreModule.f17545c.f19696x0.m30214r4().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.f6p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53876m(this.f96157a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m53919y0(List<? extends C8765d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        if (this.isInitSelectTab && !this.isDialogPageShow && !vwb.m200296J(this.purchaseSections)) {
            this.isDialogPageShow = true;
            m53917w0(this.purchaseSections);
        }
        qib0.m174815e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: z0 */
    public final void m53920z0(C8765d section) {
        PurchaseType purchaseType = this.purchaseType;
        Act act = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        boolean z = false;
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            c3m c3mVar = this.showcaseComponent;
            if (c3mVar instanceof g6e0) {
                c3mVar.getClass();
                g6e0.m124581q((g6e0) c3mVar, false, null, 2, null);
            }
            IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
            if (intlPurchaseExclusivePrivilegeView != null) {
                intlPurchaseExclusivePrivilegeView.m53840e(false, false);
            }
            this.isWeeklyMerchandiseSelected = false;
            dgn dgnVar = this.paymentComponent;
            if (dgnVar != null) {
                dgnVar.m111712j1(false);
                return;
            }
            return;
        }
        Merchandise merchandiseM53521c = section != null ? section.m53521c() : null;
        if (merchandiseM53521c != null && merchandiseM53521c.weekly() && merchandiseM53521c.autoRenewable()) {
            z = true;
        }
        this.isWeeklyMerchandiseSelected = z;
        dgn dgnVar2 = this.paymentComponent;
        if (dgnVar2 != null) {
            dgnVar2.m111712j1(z);
        }
        if (this.premiumWeeklyGuideSubscribed) {
            m53901U();
            return;
        }
        this.premiumWeeklyGuideSubscribed = true;
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
        } else {
            act = act2;
        }
        act.duringCreated(CoreModule.f17545c.f19654j0.m30581E5()).subscribe(mkd0.m154956H(new e30() { // from class: l.h6p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53858Q(this.f106107a, (Boolean) obj);
            }
        }, new e30() { // from class: l.q4p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m53871j(this.f152667a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPurchasePageContentNewView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ IntlPurchasePageContentNewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
