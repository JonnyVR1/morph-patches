package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.AffiliateProducts;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePageContentNewView;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VImage;
import p153l.a30;
import p153l.a9g0;
import p153l.acp;
import p153l.bnl0;
import p153l.c4s;
import p153l.cjj;
import p153l.din;
import p153l.f9p;
import p153l.fdc0;
import p153l.fo0;
import p153l.i4g0;
import p153l.i8p;
import p153l.ip0;
import p153l.jbc0;
import p153l.joa;
import p153l.jyb;
import p153l.jzl;
import p153l.kcg0;
import p153l.l4g0;
import p153l.l51;
import p153l.lc9;
import p153l.lee0;
import p153l.lib0;
import p153l.mib0;
import p153l.o1j0;
import p153l.p7f;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.rec0;
import p153l.t5m;
import p153l.t7a;
import p153l.tab0;
import p153l.ubp;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v5b0;
import p153l.vnb;
import p153l.w1e;
import p153l.wib0;
import p153l.wl40;
import p153l.y20;
import p153l.zry;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u001d\u0010)\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\u000eJ\u001d\u00104\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b4\u0010*J\u001d\u00105\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b5\u0010*J\u001d\u00106\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0002¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020\nH\u0014¢\u0006\u0004\b7\u0010\u000eJ9\u0010;\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u00108\u001a\u0004\u0018\u00010!2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=¢\u0006\u0004\b@\u0010AJ+\u0010C\u001a\u00020\n2\u001c\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 ¢\u0006\u0004\bC\u0010DJ)\u0010F\u001a\u00020\n2\u001a\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\bF\u0010DJ\u0015\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u000209¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010!¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u000209¢\u0006\u0004\bN\u0010IJ\u0015\u0010Q\u001a\u00020\n2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\n¢\u0006\u0004\bS\u0010\u000eJ\r\u0010T\u001a\u00020\n¢\u0006\u0004\bT\u0010\u000eJ\r\u0010U\u001a\u00020\n¢\u0006\u0004\bU\u0010\u000eJ\u000f\u0010V\u001a\u00020\nH\u0014¢\u0006\u0004\bV\u0010\u000eJ\r\u0010W\u001a\u00020\n¢\u0006\u0004\bW\u0010\u000eJ\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\n¢\u0006\u0004\bZ\u0010\u000eR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u00108\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010TR\u001a\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R.\u0010B\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u008b\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\"\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190&8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010TR\u0017\u0010G\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010TR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u007fR\u0018\u0010\u0097\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010TR\u0018\u0010\u0099\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010TR\u0018\u0010\u009b\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010TR\u0018\u0010\u009d\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010TR\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010 \u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010½\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010TR\u0018\u0010¿\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010TR\u0018\u0010Á\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010TR\u0018\u0010Ã\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u007fR\u0018\u0010Å\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010TR\u0018\u0010Ç\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010TR\u001d\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0087\u0001R\u001d\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0087\u0001R\u001e\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0087\u0001R+\u0010Õ\u0001\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001¨\u0006Ö\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageContentNewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", p7f.GPS_DIRECTION_TRUE, "(Landroid/view/View;)V", "x0", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "i0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "g0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "z0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "U", "h0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/a30;", "", "original", "A0", "(Ll/a30;)Ll/a30;", "j0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "b0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "upgradeMerchandises", "a0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;Ljava/util/List;)V", "v0", p7f.GPS_MEASUREMENT_INTERRUPTED, "sections", "y0", "w0", "X", "onFinishInflate", "from", "", "multiPages", "d0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/y20;", "", "dialogStateAction", "setDialogStateAction", "(Ll/y20;)V", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/a30;)V", "failed", "setOnPaymentFailed", "isInitSelectTab", "setInitSelectTab", "(Z)V", BLiveOperationTitleShowType.duration, "setDefaultSkuDuration", "(Ljava/lang/String;)V", "autoPay", "setAutoPay", "Ll/lib0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/lib0;)V", "f0", "Z", "Y", "onDetachedFromWindow", "e0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_showcase_root", "()Landroid/widget/FrameLayout;", "set_showcase_root", "(Landroid/widget/FrameLayout;)V", "_showcase_root", "c", "get_weekly_promo_banner_container", "set_weekly_promo_banner_container", "_weekly_promo_banner_container", Constants.INAPP_DATA_TAG, "get_introduce", "set_introduce", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "h", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "j", "k", "Ll/lib0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/y20;", "m", "Ll/a30;", "n", "onPaymentFailedAction", "o", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "p", "isDialogPageShow", "q", "r", "defaultSkuDuration", BLiveStormDanmakuGiftResourceType.f45294s, "shouldAutoPay", Constants.KEY_T, "autoPayTriggered", "u", "screenSize", ResourceDirection.f39656v, "isPromotion", "Ll/kcg0;", "w", "Ll/kcg0;", "subscription", "Landroid/os/Handler;", BaseSei.f14624X, "Landroid/os/Handler;", "promotionRefreshHandler", "Ljava/lang/Runnable;", BaseSei.f14625Y, "Ljava/lang/Runnable;", "promotionRefreshRunnable", BaseSei.f14626Z, "countdownDismissedSub", "Ll/l4g0;", "A", "Ll/l4g0;", "statisticsPageHelper", "Ll/t5m;", "B", "Ll/t5m;", "showcaseComponent", "Ll/din;", c4s.C_ZONE, "Ll/din;", "paymentComponent", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "D", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "exclusivePrivilegeView", "E", "premiumWeeklyGuideNeedGuide", "F", "premiumWeeklyGuideSubscribed", "G", "isWeeklyMerchandiseSelected", "H", "boostPriceStr", "I", "boostPriceFetching", "J", "boostBannerTracked", "K", "currentSelectPurchaseSectionAction", "L", "currentSelectPurchaseSectionPayAction", "Lcom/p1/mobile/putong/data/PayMethod;", "M", "currentSelectPayTypeAction", "N", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "getUpgradeCategory", "()Lcom/p1/mobile/putong/core/data/ProductCategory;", "setUpgradeCategory", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)V", "upgradeCategory", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlPurchasePageContentNewView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public t5m showcaseComponent;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public din paymentComponent;

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
    public final y20<C8928d> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final y20<C8928d> currentSelectPurchaseSectionPayAction;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final y20<PayMethod> currentSelectPayTypeAction;

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
    public lib0 purchasePageTrack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> purchaseSections;

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
    public kcg0 subscription;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Handler promotionRefreshHandler;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Runnable promotionRefreshRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public kcg0 countdownDismissedSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePageContentNewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseSections = new ArrayList();
        this.promotionRefreshHandler = new Handler(Looper.getMainLooper());
        l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_page", IntlPurchasePageContentNewView.class.getName());
        l4g0VarM204399c.getClass();
        this.statisticsPageHelper = l4g0VarM204399c;
        this.boostPriceStr = "";
        this.currentSelectPurchaseSectionAction = new y20() { // from class: l.p6p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55053i(this.f150869a, (C8928d) obj);
            }
        };
        this.currentSelectPurchaseSectionPayAction = new y20() { // from class: l.a7p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55078w(this.f68833a, (C8928d) obj);
            }
        };
        this.currentSelectPayTypeAction = new y20() { // from class: l.l7p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55042R(this.f130368a, (PayMethod) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m55025A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static C22421c m55026B(IntlPurchasePageContentNewView intlPurchasePageContentNewView, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        f.getClass();
        List<Merchandise> mutableList = CollectionsKt.toMutableList((Collection) f);
        intlPurchasePageContentNewView.m55090b0(mutableList);
        boolean zM147479J = jyb.m147479J((Collection) pf60Var.f152157b);
        Act act = intlPurchasePageContentNewView.act;
        Act act2 = null;
        if (zM147479J) {
            if (act == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act = null;
            }
            C22421c<List<Merchandise>> c22421cM110205M = cjj.m110205M(act, mutableList);
            final Function1 function1 = new Function1() { // from class: l.m7p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m55056k0((List) obj);
                }
            };
            return c22421cM110205M.map(new qcj() { // from class: l.n7p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55058l0(function1, obj);
                }
            });
        }
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        C22421c<List<Merchandise>> c22421cM110205M2 = cjj.m110205M(act, mutableList);
        Act act3 = intlPurchasePageContentNewView.act;
        if (act3 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        } else {
            act2 = act3;
        }
        S s = pf60Var.f152157b;
        s.getClass();
        C22421c<List<Merchandise>> c22421cM110205M3 = cjj.m110205M(act2, (List) s);
        final Function2 function2 = new Function2() { // from class: l.o7p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m55060m0((List) obj, (List) obj2);
            }
        };
        return psd0.m173625r(c22421cM110205M2, c22421cM110205M3, new rcj() { // from class: l.p7p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m55062n0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static C22421c m55028D(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m55030F(IntlPurchasePageContentNewView intlPurchasePageContentNewView, ProductCategory productCategory, pf60 pf60Var) {
        intlPurchasePageContentNewView.m55089a0(productCategory, (List) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: G */
    public static C22421c m55031G(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static C22421c m55032H(Throwable th) {
        return C22421c.just(null);
    }

    /* JADX INFO: renamed from: I */
    public static void m55033I(IntlPurchasePageContentNewView intlPurchasePageContentNewView, lee0 lee0Var, List list) {
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
            intlPurchasePageContentNewView.boostPriceStr = prices.currencySymbol + a9g0.m96570e(prices.price);
        }
        lee0Var.m153891p(true, intlPurchasePageContentNewView.boostPriceStr);
    }

    /* JADX INFO: renamed from: J */
    public static C22421c m55034J(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static void m55035K(IntlPurchasePageContentNewView intlPurchasePageContentNewView, a30 a30Var, PurchaseType purchaseType, Act act, String str) {
        if (intlPurchasePageContentNewView.isWeeklyMerchandiseSelected) {
            CoreModule.f18264c.f20396j0.m31644x4();
        }
        if (wib0.m206578v(purchaseType)) {
            intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
            kcg0 kcg0Var = intlPurchasePageContentNewView.subscription;
            if (kcg0Var != null) {
                kcg0Var.unsubscribe();
            }
            intlPurchasePageContentNewView.subscription = null;
            intlPurchasePageContentNewView.m55098j0();
        }
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m55037M(IntlPurchasePageContentNewView intlPurchasePageContentNewView, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            o1j0.m165634h(R$string.f28129R3);
        }
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m55038N(boolean z, C8928d c8928d) {
        AffiliateProducts affiliateProducts;
        String str;
        Merchandise merchandiseM54704c = c8928d.m54704c();
        if (merchandiseM54704c == null) {
            return Boolean.FALSE;
        }
        StockKeepUnit stockKeepUnit = merchandiseM54704c.defaultStockKeepUnit;
        if (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) {
            return Boolean.FALSE;
        }
        if (z) {
            return Boolean.valueOf(CoreModule.f18264c.f20438x0.m31201l4(merchandiseM54704c));
        }
        FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
        return freeTrialDataM31579C4 == null ? Boolean.FALSE : Boolean.valueOf(Intrinsics.m88377d(str, freeTrialDataM31579C4.skuId));
    }

    /* JADX INFO: renamed from: Q */
    public static void m55041Q(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Boolean bool) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = Intrinsics.m88377d(bool, Boolean.TRUE);
        intlPurchasePageContentNewView.m55084U();
    }

    /* JADX INFO: renamed from: R */
    public static void m55042R(IntlPurchasePageContentNewView intlPurchasePageContentNewView, PayMethod payMethod) {
        t5m t5mVar;
        payMethod.getClass();
        if (!NullChecker.m82486a(intlPurchasePageContentNewView.showcaseComponent) || (t5mVar = intlPurchasePageContentNewView.showcaseComponent) == null) {
            return;
        }
        t5mVar.mo126115e(payMethod);
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m55043S(Merchandise merchandise) {
        return Boolean.valueOf(v5b0.m199788n(merchandise));
    }

    /* JADX INFO: renamed from: W */
    public static final void m55044W(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        din dinVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m82486a(intlPurchasePageContentNewView.paymentComponent) || (dinVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dinVar.f88686k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: a */
    public static void m55045a(View view, uxj0 uxj0Var) {
        acp.m96874c(view);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m55046b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static C22421c m55049e(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m55050f(pf60 pf60Var) {
        return Boolean.valueOf(!jyb.m147479J((Collection) pf60Var.f152156a));
    }

    /* JADX INFO: renamed from: g */
    public static void m55051g(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.boostPriceFetching = false;
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: h */
    public static C22421c m55052h(C22421c c22421c, final pf60 pf60Var) {
        final Function1 function1 = new Function1() { // from class: l.x7p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m55074t0(pf60Var, (List) obj);
            }
        };
        return c22421c.map(new qcj() { // from class: l.y7p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55076u0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m55053i(final IntlPurchasePageContentNewView intlPurchasePageContentNewView, C8928d c8928d) {
        C8928d.a aVarM54703b;
        din dinVar;
        intlPurchasePageContentNewView.m55103z0(c8928d);
        if (NullChecker.m82486a(intlPurchasePageContentNewView.paymentComponent) && (dinVar = intlPurchasePageContentNewView.paymentComponent) != null) {
            dinVar.mo115926b(c8928d);
        }
        if (intlPurchasePageContentNewView.get_payment_view() != null) {
            intlPurchasePageContentNewView.get_payment_view().m55113j(c8928d);
        }
        PurchaseType purchaseType = null;
        if (intlPurchasePageContentNewView.shouldAutoPay && !intlPurchasePageContentNewView.autoPayTriggered && NullChecker.m82486a(c8928d)) {
            intlPurchasePageContentNewView.autoPayTriggered = true;
            Act act = intlPurchasePageContentNewView.act;
            if (act == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act = null;
            }
            l51.m152888H(act, new Runnable() { // from class: l.w7p
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPurchasePageContentNewView.m55044W(this.f187774a);
                }
            }, 300L);
        }
        if (NullChecker.m82486a(intlPurchasePageContentNewView.showcaseComponent) && (intlPurchasePageContentNewView.showcaseComponent instanceof lee0)) {
            if (c8928d == null || (aVarM54703b = c8928d.m54705d()) == null) {
                aVarM54703b = c8928d != null ? c8928d.m54703b() : null;
            }
            boolean zM153653k3 = CoreModule.f18264c.f20311G2.m153653k3(aVarM54703b != null ? aVarM54703b.m54762f() : null);
            CoreModule.f18264c.f20311G2.f131284S.onNext(Boolean.valueOf(zM153653k3));
            t5m t5mVar = intlPurchasePageContentNewView.showcaseComponent;
            t5mVar.getClass();
            ((lee0) t5mVar).m153892r(zM153653k3);
            PurchaseType purchaseType2 = intlPurchasePageContentNewView.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType2 = null;
            }
            if (purchaseType2 != PurchaseType.TYPE_ULTRA_PREMIUM) {
                PurchaseType purchaseType3 = intlPurchasePageContentNewView.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.m88391r("purchaseType");
                } else {
                    purchaseType = purchaseType3;
                }
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return;
                }
            }
            ubp.INSTANCE.m195291z(aVarM54703b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m55054j(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Throwable th) {
        intlPurchasePageContentNewView.premiumWeeklyGuideNeedGuide = false;
    }

    /* JADX INFO: renamed from: k */
    public static List m55055k(List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.g7p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55064o0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final pf60 m55056k0(List list) {
        list.getClass();
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m55057l(IntlPurchasePageContentNewView intlPurchasePageContentNewView) {
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        kcg0 kcg0Var = intlPurchasePageContentNewView.subscription;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m55098j0();
    }

    /* JADX INFO: renamed from: l0 */
    public static final pf60 m55058l0(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m55059m(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Long l2) {
        PurchaseType purchaseType = intlPurchasePageContentNewView.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            intlPurchasePageContentNewView.m55085V();
            y20<Integer> y20Var = intlPurchasePageContentNewView.dialogStateAction;
            if (y20Var != null) {
                y20Var.call(0);
                return;
            }
            return;
        }
        intlPurchasePageContentNewView.m55085V();
        intlPurchasePageContentNewView.get_showcase_root().removeAllViews();
        kcg0 kcg0Var = intlPurchasePageContentNewView.subscription;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        intlPurchasePageContentNewView.subscription = null;
        intlPurchasePageContentNewView.m55098j0();
    }

    /* JADX INFO: renamed from: m0 */
    public static final pf60 m55060m0(List list, List list2) {
        list.getClass();
        list2.getClass();
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final pf60 m55062n0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o */
    public static void m55063o(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m55064o0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f18264c.f20396j0.m31579C4() == null || !Intrinsics.m88377d(CoreModule.f18264c.f20396j0.m31579C4().skuId, merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m55065p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static final pf60 m55066p0(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final pf60 m55068q0(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static C22421c m55069r(IntlPurchasePageContentNewView intlPurchasePageContentNewView, Envelope envelope) {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        if (lc9Var.f131283R == null || !lc9Var.m153654l3(intlPurchasePageContentNewView.getPurchaseType())) {
            C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
            final Function1 function1 = new Function1() { // from class: l.s7p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m55066p0((List) obj);
                }
            };
            return c22421cM31647y5.map(new qcj() { // from class: l.t7p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55068q0(function1, obj);
                }
            });
        }
        C4883c c4883c = CoreModule.f18264c;
        intlPurchasePageContentNewView.upgradeCategory = c4883c.f20311G2.f131283R.category;
        C22421c<List<Merchandise>> c22421cM31647y6 = c4883c.f20396j0.m31647y5(intlPurchasePageContentNewView.getPurchaseType().productCategory());
        C22421c<List<Merchandise>> c22421cM31647y7 = CoreModule.f18264c.f20396j0.m31647y5(intlPurchasePageContentNewView.upgradeCategory);
        final Function2 function2 = new Function2() { // from class: l.u7p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m55070r0((List) obj, (List) obj2);
            }
        };
        return psd0.m173625r(c22421cM31647y6, c22421cM31647y7, new rcj() { // from class: l.v7p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPurchasePageContentNewView.m55072s0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public static final pf60 m55070r0(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final pf60 m55072s0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t0 */
    public static final pf60 m55074t0(pf60 pf60Var, List list) {
        F f = pf60Var.f152156a;
        f.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) f);
        if (!jyb.m147479J(list)) {
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
        return new pf60(mutableList, pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: u */
    public static C22421c m55075u(IntlPurchasePageContentNewView intlPurchasePageContentNewView, List list) {
        if (list.isEmpty()) {
            return C22421c.just(list);
        }
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        Act act = intlPurchasePageContentNewView.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return coreBusinessServiceM143405a.mo34507g5(act, list);
    }

    /* JADX INFO: renamed from: u0 */
    public static final pf60 m55076u0(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m55078w(IntlPurchasePageContentNewView intlPurchasePageContentNewView, C8928d c8928d) {
        din dinVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m82486a(intlPurchasePageContentNewView.paymentComponent) || (dinVar = intlPurchasePageContentNewView.paymentComponent) == null || (onClickListener = dinVar.f88686k0) == null) {
            return;
        }
        onClickListener.onClick(intlPurchasePageContentNewView);
    }

    /* JADX INFO: renamed from: x */
    public static void m55079x(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m55080y(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54711j());
    }

    /* JADX INFO: renamed from: z */
    public static List m55081z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A0 */
    public final a30<PurchaseType, Act, String> m55082A0(final a30<PurchaseType, Act, String> original) {
        return new a30() { // from class: l.e8p
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                IntlPurchasePageContentNewView.m55035K(this.f92552a, original, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: T */
    public final void m55083T(View view) {
        i8p.m139020a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public final void m55084U() {
        boolean z = this.isWeeklyMerchandiseSelected && this.premiumWeeklyGuideNeedGuide;
        if (z && !this.boostBannerTracked) {
            this.boostBannerTracked = true;
            i4g0.m138526x("e_intl_premium_weekly_get_boost_banner", "p_purchase_page");
        }
        t5m t5mVar = this.showcaseComponent;
        if (t5mVar instanceof lee0) {
            t5mVar.getClass();
            final lee0 lee0Var = (lee0) t5mVar;
            if (z && this.boostPriceStr.length() == 0 && !this.boostPriceFetching) {
                this.boostPriceFetching = true;
                Act act = this.act;
                if (act == null) {
                    Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                    act = null;
                }
                C22421c<List<Merchandise>> c22421cM31649z5 = CoreModule.f18264c.f20396j0.m31649z5(ProductCategory.get(ProductCategory.tttBoost), false);
                final Function1 function1 = new Function1() { // from class: l.h7p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntlPurchasePageContentNewView.m55075u(this.f108144a, (List) obj);
                    }
                };
                act.duringCreated(c22421cM31649z5.switchMap(new qcj() { // from class: l.i7p
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return IntlPurchasePageContentNewView.m55034J(function1, obj);
                    }
                }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.j7p
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m55033I(this.f118700a, lee0Var, (List) obj);
                    }
                }, new y20() { // from class: l.k7p
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m55051g(this.f124280a, (Throwable) obj);
                    }
                }));
            } else {
                lee0Var.m153891p(z, this.boostPriceStr);
            }
        }
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
        if (intlPurchaseExclusivePrivilegeView != null) {
            intlPurchaseExclusivePrivilegeView.m55023e(this.isWeeklyMerchandiseSelected, this.premiumWeeklyGuideNeedGuide);
        }
        din dinVar = this.paymentComponent;
        if (dinVar != null) {
            dinVar.m115938i1(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m55085V() {
        Runnable runnable = this.promotionRefreshRunnable;
        if (runnable != null) {
            this.promotionRefreshHandler.removeCallbacks(runnable);
        }
        this.promotionRefreshRunnable = null;
    }

    /* JADX INFO: renamed from: X */
    public final void m55086X(List<? extends C8928d> sections) {
        boolean z = CoreModule.f18264c.f20396j0.m31611T4() || CoreModule.f18264c.f20396j0.m31648z4();
        final boolean zM31193c4 = CoreModule.f18264c.f20438x0.m31193c4();
        if (z || zM31193c4) {
            List<? extends C8928d> list = sections;
            C8928d c8928d = (C8928d) jyb.m147529r(list, new qcj() { // from class: l.z7p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55038N(zM31193c4, (C8928d) obj);
                }
            });
            if (c8928d != null) {
                jyb.m147537z(list, new y20() { // from class: l.a8p
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPurchasePageContentNewView.m55063o((C8928d) obj);
                    }
                });
                c8928d.m54723v(true);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m55087Y() {
        if (this.isDialogPageShow) {
            w1e.m204401e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: Z */
    public final void m55088Z() {
        if (!jyb.m147479J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m55100w0(this.purchaseSections);
        }
        if (t7a.m189553i()) {
            t5m t5mVar = this.showcaseComponent;
            if (t5mVar instanceof lee0) {
                t5mVar.getClass();
                ((lee0) t5mVar).m153890o();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m55089a0(ProductCategory category, List<? extends Merchandise> merchandises, List<? extends Merchandise> upgradeMerchandises) {
        C8928d.a aVarM54703b;
        C8928d.a aVarM54703b2;
        boolean zM82486a = NullChecker.m82486a(jyb.m147529r(merchandises, new qcj() { // from class: l.q7p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55043S((Merchandise) obj);
            }
        }));
        this.isPromotion = zM82486a;
        din dinVar = this.paymentComponent;
        if (dinVar != null) {
            dinVar.mo138229g(zM82486a);
        }
        jzl jzlVarM221275z = zry.m221275z(category);
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        List<C8928d> listMo147671a = jzlVarM221275z.mo147671a(act, purchaseType2, category, merchandises);
        listMo147671a.getClass();
        ArrayList arrayList = new ArrayList();
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f18264c.f20311G2.f131283R;
        if (t7a.m189547c() && NullChecker.m82486a(membershipUpgradeInfo) && !jyb.m147479J(upgradeMerchandises) && TEnum.equals(membershipUpgradeInfo.category, this.upgradeCategory)) {
            jzl jzlVarM221275z2 = zry.m221275z(this.upgradeCategory);
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act2 = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType3 = null;
            }
            List<C8928d> listMo147671a2 = jzlVarM221275z2.mo147671a(act2, purchaseType3, this.upgradeCategory, upgradeMerchandises);
            for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
                for (C8928d c8928d : listMo147671a2) {
                    if (c8928d.m54705d() != null) {
                        aVarM54703b2 = c8928d.m54705d();
                        aVarM54703b2.getClass();
                    } else {
                        aVarM54703b2 = c8928d.m54703b();
                        aVarM54703b2.getClass();
                    }
                    if (aVarM54703b2.m54788w() == membershipUpgradeDurationInfo.count) {
                        arrayList.add(c8928d);
                    }
                }
            }
            if (listMo147671a.get(0).m54705d() != null) {
                aVarM54703b = listMo147671a.get(0).m54705d();
                aVarM54703b.getClass();
            } else {
                aVarM54703b = listMo147671a.get(0).m54703b();
                aVarM54703b.getClass();
            }
            String strM54772k = aVarM54703b.m54772k();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                C8928d c8928d2 = (C8928d) next;
                c8928d2.m54723v(false);
                if (c8928d2.m54705d() == null) {
                    c8928d2.m54703b().m54749V(strM54772k);
                } else {
                    c8928d2.m54705d().m54749V(strM54772k);
                }
            }
            if (!jyb.m147479J(arrayList)) {
                ((C8928d) arrayList.get(0)).m54723v(true);
                Iterator<C8928d> it2 = listMo147671a.iterator();
                while (it2.hasNext()) {
                    it2.next().m54723v(false);
                }
            }
        }
        if (jyb.m147479J(arrayList)) {
            f9p.m124677d(listMo147671a, category, this.defaultSkuDuration);
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType4 = null;
            }
            if (purchaseType4 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                m55086X(listMo147671a);
            }
        }
        if (t7a.m189553i()) {
            Act act3 = this.act;
            if (act3 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act3 = null;
            }
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType5 = null;
            }
            lee0 lee0Var = new lee0(act3, purchaseType5);
            this.showcaseComponent = lee0Var;
            View viewMo126108a = lee0Var.mo126108a(get_showcase_root(), this.screenSize);
            t5m t5mVar = this.showcaseComponent;
            t5mVar.getClass();
            ((lee0) t5mVar).m153886k(listMo147671a, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction, arrayList);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Privilege privilege = this.primaryPrivilege;
            if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
                bnl0.m105540X(get_showcase_root(), 0);
            }
            get_showcase_root().addView(viewMo126108a, layoutParams);
        } else {
            Act act4 = this.act;
            if (act4 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act4 = null;
            }
            PurchaseType purchaseType6 = this.purchaseType;
            if (purchaseType6 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType6 = null;
            }
            wl40 wl40Var = new wl40(act4, purchaseType6);
            this.showcaseComponent = wl40Var;
            View viewMo126108a2 = wl40Var.mo126108a(get_showcase_root(), this.screenSize);
            if (NullChecker.m82486a(viewMo126108a2)) {
                if (this.showcaseComponent instanceof wl40) {
                    if (listMo147671a.size() == 2) {
                        t5m t5mVar2 = this.showcaseComponent;
                        t5mVar2.getClass();
                        ((wl40) t5mVar2).m206928d0(qa00.m175859d(47.0f));
                        t5m t5mVar3 = this.showcaseComponent;
                        t5mVar3.getClass();
                        ((wl40) t5mVar3).m206930f0(qa00.m175859d(47.0f));
                    } else {
                        PurchaseType purchaseType7 = this.purchaseType;
                        if (purchaseType7 == null) {
                            Intrinsics.m88391r("purchaseType");
                            purchaseType7 = null;
                        }
                        PurchaseType purchaseType8 = PurchaseType.TYPE_GET_LIKERS;
                        t5m t5mVar4 = this.showcaseComponent;
                        if (purchaseType7 == purchaseType8) {
                            t5mVar4.getClass();
                            int i = qa00.f156327n;
                            ((wl40) t5mVar4).m206928d0(i);
                            t5m t5mVar5 = this.showcaseComponent;
                            t5mVar5.getClass();
                            ((wl40) t5mVar5).m206930f0(i);
                        } else {
                            t5mVar4.getClass();
                            int i2 = qa00.f156323j;
                            ((wl40) t5mVar4).m206928d0(i2);
                            t5m t5mVar6 = this.showcaseComponent;
                            t5mVar6.getClass();
                            ((wl40) t5mVar6).m206930f0(i2);
                        }
                    }
                    t5m t5mVar7 = this.showcaseComponent;
                    t5mVar7.getClass();
                    ((wl40) t5mVar7).m206927c0(0);
                    t5m t5mVar8 = this.showcaseComponent;
                    t5mVar8.getClass();
                    ((wl40) t5mVar8).m141372H(new ip0.InterfaceC17765a() { // from class: l.r7p
                        @Override // p153l.ip0.InterfaceC17765a
                        /* JADX INFO: renamed from: a */
                        public final void mo108479a(boolean z, boolean z2) {
                            IntlPurchasePageContentNewView.m55037M(this.f161628a, z, z2);
                        }
                    });
                }
                t5m t5mVar9 = this.showcaseComponent;
                if (t5mVar9 != null) {
                    t5mVar9.mo141377f(listMo147671a, this.currentSelectPurchaseSectionAction, this.dialogStateAction, this.currentSelectPurchaseSectionPayAction);
                }
            }
            get_showcase_root().addView(viewMo126108a2, new LinearLayout.LayoutParams(-1, -2));
        }
        PurchaseType purchaseType9 = this.purchaseType;
        if (purchaseType9 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType9;
        }
        if (purchaseType != PurchaseType.TYPE_GET_LIKERS && this.exclusivePrivilegeView != null) {
            bnl0.m105524M(get_introduce(), true);
        }
        m55102y0(listMo147671a);
        m55099v0();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m55090b0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.f18264c.f20438x0.m31186P3() || (iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3()) == null || CoreModule.f18264c.f20438x0.m31193c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.f18264c.f20438x0.m31202m4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
                String str = affiliateProducts.googleplay;
                String string = str != null ? StringsKt.m94324Z0(str).toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    String strM31160m3 = CoreIntlAffiliatePromotions.m31160m3(string, iapAffiliatePromotionM31169E3.iapId, iapAffiliatePromotionM31169E3.offerId);
                    strM31160m3.getClass();
                    if (strM31160m3.length() != 0 && !Intrinsics.m88377d(strM31160m3, string)) {
                        Merchandise merchandiseMo225055clone = merchandise.mo225055clone();
                        merchandiseMo225055clone.getClass();
                        StockKeepUnit stockKeepUnit2 = merchandiseMo225055clone.defaultStockKeepUnit;
                        if (stockKeepUnit2 != null) {
                            stockKeepUnit2.affiliateProducts.googleplay = strM31160m3;
                            merchandises.set(i, merchandiseMo225055clone);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m55091c0() {
        din dinVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m82486a(this.paymentComponent) || (dinVar = this.paymentComponent) == null || (onClickListener = dinVar.f88686k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m55092d0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
        this.multiPages = multiPages;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m55093e0() {
        din dinVar;
        t5m t5mVar;
        m55085V();
        kcg0 kcg0Var = this.countdownDismissedSub;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.countdownDismissedSub = null;
        if (NullChecker.m82486a(this.showcaseComponent) && (t5mVar = this.showcaseComponent) != null) {
            t5mVar.release();
        }
        if (NullChecker.m82486a(this.paymentComponent) && (dinVar = this.paymentComponent) != null) {
            dinVar.release();
        }
        if (NullChecker.m82486a(this.subscription)) {
            kcg0 kcg0Var2 = this.subscription;
            kcg0Var2.getClass();
            kcg0Var2.unsubscribe();
            this.subscription = null;
        }
        get_payment_view().m55114k();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m55094f0() {
        this.screenSize = vnb.m201957q1();
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        m55097i0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        m55096h0(purchaseType3);
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act2 = null;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType4;
        }
        m55095g0(act2, purchaseType);
        m55098j0();
        m55101x0();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m55095g0(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            bnl0.m105524M(get_introduce(), false);
            return;
        }
        bnl0.m105524M(get_introduce(), true);
        View viewInflate = act.inflater().inflate(rec0.f162477P, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = (IntlPurchaseExclusivePrivilegeView) viewInflate;
        intlPurchaseExclusivePrivilegeView.m55022d(purchaseType);
        this.exclusivePrivilegeView = intlPurchaseExclusivePrivilegeView;
        get_introduce().addView(intlPurchaseExclusivePrivilegeView);
    }

    @NotNull
    public final List<C8928d> getPurchaseSections() {
        return this.purchaseSections;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType != null) {
            return purchaseType;
        }
        Intrinsics.m88391r("purchaseType");
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
        Intrinsics.m88391r("_introduce");
        return null;
    }

    @NotNull
    public final IntlPurchasePagePaymentView get_payment_view() {
        IntlPurchasePagePaymentView intlPurchasePagePaymentView = this._payment_view;
        if (intlPurchasePagePaymentView != null) {
            return intlPurchasePagePaymentView;
        }
        Intrinsics.m88391r("_payment_view");
        return null;
    }

    @NotNull
    public final LinearLayout get_privilege() {
        LinearLayout linearLayout = this._privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_privilege");
        return null;
    }

    @NotNull
    public final FrameLayout get_showcase_root() {
        FrameLayout frameLayout = this._showcase_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_showcase_root");
        return null;
    }

    @NotNull
    public final FrameLayout get_weekly_promo_banner_container() {
        FrameLayout frameLayout = this._weekly_promo_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_weekly_promo_banner_container");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55096h0(PurchaseType purchaseType) {
        IntlPurchasePagePaymentView.m55104i(get_payment_view(), purchaseType, this.from, false, 4, null);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(m55082A0(this.onPaymentSuccess));
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m55116m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55097i0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            bnl0.m105540X(get_privilege(), qa00.f156339z);
            final View viewM96875a = new acp(act, null).m96875a(get_privilege());
            get_privilege().addView(viewM96875a);
            acp.m96874c(viewM96875a);
            act.duringCreated(CoreModule.f18264c.f20429u0.m31448i7()).subscribe(psd0.m173597H(new y20() { // from class: l.c8p
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m55045a(viewM96875a, (uxj0) obj);
                }
            }, new y20() { // from class: l.d8p
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlPurchasePageContentNewView.m55079x((Throwable) obj);
                }
            }));
            Object tag = viewM96875a.getTag(fdc0.f98353J0);
            if (tag instanceof ExplodeLayout) {
                ((ExplodeLayout) tag).m55410k();
                return;
            }
            return;
        }
        if (privilege != null && privilege != Privilege.vip_badge && privilege != Privilege.svip_badge && privilege != Privilege.ultra_premium_badge) {
            bnl0.m105540X(get_privilege(), qa00.f156333t);
            View viewInflate = act.inflater().inflate(rec0.f162489S, (ViewGroup) get_privilege(), false);
            viewInflate.getClass();
            IntlPurchasePrivilegeView intlPurchasePrivilegeView = (IntlPurchasePrivilegeView) viewInflate;
            intlPurchasePrivilegeView.m55128b(purchaseType, privilege);
            get_privilege().addView(intlPurchasePrivilegeView);
            return;
        }
        bnl0.m105540X(get_privilege(), 0);
        bnl0.m105540X(get_introduce(), 0);
        View viewInflate2 = act.inflater().inflate(rec0.f162485R, (ViewGroup) get_privilege(), false);
        VImage vImage = (VImage) viewInflate2.findViewById(fdc0.f98396d0);
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            vImage.setImageResource(jbc0.f119554e1);
        } else if (wib0.m206578v(purchaseType)) {
            vImage.setImageResource(jbc0.f119568f1);
        } else {
            vImage.setImageResource(jbc0.f119582g1);
        }
        get_privilege().addView(viewInflate2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55098j0() {
        C22421c<Envelope> c22421cJust;
        final C22421c c22421cJust2;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        if (!t7a.m189547c() || (joa.m146401n4() && joa.m146392i4())) {
            c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
        } else {
            c22421cJust = CoreModule.f18264c.f20311G2.m153661s3();
            c22421cJust.getClass();
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        if (purchaseType2 == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && ((CoreModule.f18264c.f20396j0.m31611T4() || CoreModule.f18264c.f20396j0.m31648z4()) && CoreModule.f18264c.f20438x0.m31186P3())) {
            C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
            final Function1 function1 = new Function1() { // from class: l.r6p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m55025A((List) obj);
                }
            };
            C22421c<List<Merchandise>> c22421cFilter = c22421cM31647y5.filter(new qcj() { // from class: l.w6p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55046b(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.x6p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlPurchasePageContentNewView.m55055k((List) obj);
                }
            };
            c22421cJust2 = c22421cFilter.map(new qcj() { // from class: l.y6p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55081z(function2, obj);
                }
            }).onErrorResumeNext((qcj<Throwable, ? extends C22421c<? extends R>>) new qcj() { // from class: l.z6p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55032H((Throwable) obj);
                }
            });
        } else {
            c22421cJust2 = C22421c.just(null);
        }
        final Function1 function3 = new Function1() { // from class: l.b7p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m55069r(this.f75327a, (Envelope) obj);
            }
        };
        C22421c c22421cTake = c22421cJust.flatMap(new qcj() { // from class: l.c7p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55028D(function3, obj);
            }
        }).take(1);
        final Function1 function4 = new Function1() { // from class: l.d7p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m55050f((pf60) obj);
            }
        };
        C22421c c22421cFilter2 = c22421cTake.filter(new qcj() { // from class: l.e7p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55065p(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.f7p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m55052h(c22421cJust2, (pf60) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cFilter2.flatMap(new qcj() { // from class: l.s6p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55031G(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.t6p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPurchasePageContentNewView.m55026B(this.f172355a, (pf60) obj);
            }
        };
        this.subscription = c22421cFlatMap.flatMap(new qcj() { // from class: l.u6p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPurchasePageContentNewView.m55049e(function6, obj);
            }
        }).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.v6p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55030F(this.f182674a, productCategory, (pf60) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55093e0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55083T(this);
    }

    public final void setAutoPay(boolean autoPay) {
        this.shouldAutoPay = autoPay;
    }

    public final void setDefaultSkuDuration(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    public final void setDialogStateAction(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setInitSelectTab(boolean isInitSelectTab) {
        this.isInitSelectTab = isInitSelectTab;
    }

    public final void setOnPaymentFailed(@Nullable a30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    public final void setPurchasePageTrack(@NotNull lib0 purchasePageTrack) {
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
    public final void m55099v0() {
        m55085V();
        long jM31179J3 = CoreModule.f18264c.f20438x0.m31179J3();
        if (jM31179J3 <= 0) {
            return;
        }
        long jM174454o = (jM31179J3 * 1000) - pzi0.m174454o();
        if (jM174454o <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.b8p
            @Override // java.lang.Runnable
            public final void run() {
                IntlPurchasePageContentNewView.m55057l(this.f75458a);
            }
        };
        this.promotionRefreshRunnable = runnable;
        this.promotionRefreshHandler.postDelayed(runnable, jM174454o);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m55100w0(List<? extends C8928d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            ProductCategory productCategory = purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA));
            if (this.multiPages) {
                jSONObject.put("default_product", tab0.m189811h().m189817g("vip").toString());
            } else {
                jSONObject.put("default_product", productCategory.toString());
            }
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            boolean zM82486a = NullChecker.m82486a(jyb.m147529r(sections, new qcj() { // from class: l.g8p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPurchasePageContentNewView.m55080y((C8928d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM82486a ? "yes" : "no");
            jSONObject.put("if_discount", zM82486a);
            jSONObject.put("if_double_tab", this.multiPages);
            jSONObject.put("function_type", mib0.m158477f(this.primaryPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            jSONObject.put("ttc_page_type", "fullscreen");
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                jSONObject.put("is_fakeunreal", (!CoreModule.f18264c.f20381e0.m116537Z7() || CoreModule.f18264c.f20381e0.m116525W7() || CoreModule.f18264c.f20381e0.m116579k8()) ? false : true);
            }
            if ("online".equals(this.from) || "certified".equals(this.from) || ShareConstants.NEW_VERSION.equals(this.from)) {
                jSONObject.put("tribe_subtype", this.from);
                jSONObject.put("purchaseShowFrom", "p_intl_tribe_view,e_intl_tribe_tribes_any_click,click");
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m55101x0() {
        kcg0 kcg0Var = this.countdownDismissedSub;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.countdownDismissedSub = CoreModule.f18264c.f20438x0.m31212r4().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.f8p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55059m(this.f97753a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m55102y0(List<? extends C8928d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        if (this.isInitSelectTab && !this.isDialogPageShow && !jyb.m147479J(this.purchaseSections)) {
            this.isDialogPageShow = true;
            m55100w0(this.purchaseSections);
        }
        uqb0.m197269e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: z0 */
    public final void m55103z0(C8928d section) {
        PurchaseType purchaseType = this.purchaseType;
        Act act = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        boolean z = false;
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            t5m t5mVar = this.showcaseComponent;
            if (t5mVar instanceof lee0) {
                t5mVar.getClass();
                lee0.m153885q((lee0) t5mVar, false, null, 2, null);
            }
            IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView = this.exclusivePrivilegeView;
            if (intlPurchaseExclusivePrivilegeView != null) {
                intlPurchaseExclusivePrivilegeView.m55023e(false, false);
            }
            this.isWeeklyMerchandiseSelected = false;
            din dinVar = this.paymentComponent;
            if (dinVar != null) {
                dinVar.m115939j1(false);
                return;
            }
            return;
        }
        Merchandise merchandiseM54704c = section != null ? section.m54704c() : null;
        if (merchandiseM54704c != null && merchandiseM54704c.weekly() && merchandiseM54704c.autoRenewable()) {
            z = true;
        }
        this.isWeeklyMerchandiseSelected = z;
        din dinVar2 = this.paymentComponent;
        if (dinVar2 != null) {
            dinVar2.m115939j1(z);
        }
        if (this.premiumWeeklyGuideSubscribed) {
            m55084U();
            return;
        }
        this.premiumWeeklyGuideSubscribed = true;
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        } else {
            act = act2;
        }
        act.duringCreated(CoreModule.f18264c.f20396j0.m31584E5()).subscribe(psd0.m173597H(new y20() { // from class: l.h8p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55041Q(this.f108259a, (Boolean) obj);
            }
        }, new y20() { // from class: l.q6p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPurchasePageContentNewView.m55054j(this.f155827a, (Throwable) obj);
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
