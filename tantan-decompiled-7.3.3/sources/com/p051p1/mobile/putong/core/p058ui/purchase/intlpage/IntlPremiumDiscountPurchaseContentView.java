package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.AffiliateProducts;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.Ref;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15274a;
import kotlin.text.C15492c;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.AutoVDraweeView;
import p153l.a30;
import p153l.bnl0;
import p153l.cjj;
import p153l.d3n;
import p153l.din;
import p153l.fdc0;
import p153l.fmk0;
import p153l.fo0;
import p153l.h9c0;
import p153l.i3n;
import p153l.jxo;
import p153l.jyb;
import p153l.jzl;
import p153l.kcg0;
import p153l.l4g0;
import p153l.l51;
import p153l.lib0;
import p153l.m6p;
import p153l.p7f;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.rec0;
import p153l.u3n;
import p153l.uqb0;
import p153l.v5b0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;
import p153l.zry;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 í\u00012\u00020\u0001:\u0002\u0094\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010&0\u001dH\u0002¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\"H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b?\u0010%J\u000f\u0010@\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u000eJ\u000f\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010\u000eJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\fJ!\u0010G\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020<H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010\fJ!\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u0001022\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ!\u0010P\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010O\u001a\u00020<H\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020<2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bW\u0010\u000eJ\u0019\u0010Y\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u000eJ\u001f\u0010^\u001a\u00020\n2\u0006\u0010B\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J+\u0010a\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0`2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\ba\u0010bJ'\u0010e\u001a\u00020\n2\u0006\u0010N\u001a\u00020M2\u0006\u0010c\u001a\u00020<2\u0006\u0010d\u001a\u00020\u001eH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\nH\u0002¢\u0006\u0004\bg\u0010\u000eJ\u001f\u0010h\u001a\u0004\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020j2\b\u0010;\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020,H\u0002¢\u0006\u0004\bn\u00101J\u000f\u0010o\u001a\u00020jH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\nH\u0014¢\u0006\u0004\bq\u0010\u000eJ9\u0010t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010r\u001a\u0004\u0018\u00010<2\u0006\u0010s\u001a\u00020j¢\u0006\u0004\bt\u0010uJ\u001d\u0010x\u001a\u00020\n2\u000e\u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v¢\u0006\u0004\bx\u0010yJ+\u0010|\u001a\u00020\n2\u001c\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z¢\u0006\u0004\b|\u0010}J)\u0010\u007f\u001a\u00020\n2\u001a\u0010~\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z¢\u0006\u0004\b\u007f\u0010}J\u001c\u0010\u0082\u0001\u001a\u00020\n2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020j¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020\n¢\u0006\u0005\b\u008b\u0001\u0010\u000eJ\u000f\u0010\u008c\u0001\u001a\u00020\n¢\u0006\u0005\b\u008c\u0001\u0010\u000eJ\u000f\u0010\u008d\u0001\u001a\u00020\n¢\u0006\u0005\b\u008d\u0001\u0010\u000eJ\u0011\u0010\u008e\u0001\u001a\u00020\nH\u0014¢\u0006\u0005\b\u008e\u0001\u0010\u000eJ\u000f\u0010\u008f\u0001\u001a\u00020\n¢\u0006\u0005\b\u008f\u0001\u0010\u000eJ\u0010\u0010\u0090\u0001\u001a\u00020\u0012¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020\n¢\u0006\u0005\b\u0092\u0001\u0010\u000eR*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010¡\u0001\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010r\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R \u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R.\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R-\u0010º\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\"\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020,0!8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010IR\u0018\u0010Æ\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u0010IR\u0017\u0010Ç\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010IR\u0018\u0010É\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010IR\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ò\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010IR\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Õ\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Õ\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001d\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020,0v8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010¶\u0001¨\u0006î\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "U", "(Landroid/view/View;)V", "o0", "()V", "A0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "G0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "D0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "E0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "H0", "Lrx/c;", "", "d0", "()Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "f0", "(Ljava/util/List;)V", "", "j0", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "w0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m0", MatchFrom.selected, "s0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", SchemeKey.promotion, "r0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", Ref.TYPE, "W", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/Merchandise;)V", Merchandise.TYPE, "", "i0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "Q0", "O0", "n0", "hero", "b0", "Lcom/facebook/drawee/view/SimpleDraweeView;", "art", "imgUrl", "X", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V", "Z", NotificationCompat.CATEGORY_PROMO, "a0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "text", "c0", "(Landroid/widget/TextView;Ljava/lang/String;)V", "raw", "l0", "(Ljava/lang/String;)I", "t0", "(Ljava/lang/String;)Ljava/lang/String;", "N0", "p", "M0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "e0", "", "endMs", "F0", "(Landroid/view/View;J)V", "Lkotlin/Triple;", "x0", "(Ljava/lang/String;)Lkotlin/Triple;", "segment", "digitColor", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Landroid/widget/TextView;Ljava/lang/String;I)V", "P0", "h0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", "q0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "section", "Y", "p0", "()Z", "onFinishInflate", "from", "multiPages", "z0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/y20;", "dialogStateAction", "setDialogStateAction", "(Ll/y20;)V", "Ll/a30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/a30;)V", "failed", "setOnPaymentFailed", "Ll/x20;", "fallback", "setFallbackToStandardPremiumFullscreen", "(Ll/x20;)V", "autoPay", "setAutoPay", "(Z)V", "Ll/lib0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/lib0;)V", "C0", "v0", "u0", "onDetachedFromWindow", "B0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "y0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_introduce", "()Landroid/widget/FrameLayout;", "set_introduce", "(Landroid/widget/FrameLayout;)V", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/android/app/Act;", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "Ljava/lang/String;", "g", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "h", "Ll/lib0;", RXScreenCaptureService.KEY_INDEX, "Ll/y20;", "j", "Ll/a30;", "k", "onPaymentFailedAction", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/x20;", "fallbackToStandardPremiumFullscreen", "m", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "n", "isDialogPageShow", "o", "shouldAutoPay", "autoPayTriggered", "q", "isPromotion", "r", "Landroid/view/View;", "discountHeroRoot", "Ll/d3n;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/d3n;", "affiliateDiscountCountdownManager", Constants.KEY_T, "fullscreenDiscountVibrationExposureHeld", "Ll/kcg0;", "u", "Ll/kcg0;", "affiliateCountdownReconcileSub", "Landroid/os/Handler;", ResourceDirection.f39656v, "Landroid/os/Handler;", "serverEndWatchdogHandler", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "serverEndWatchdogRunnable", BaseSei.f14624X, "subscription", BaseSei.f14625Y, "affiliateOriginalPriceSubscription", "Ll/l4g0;", BaseSei.f14626Z, "Ll/l4g0;", "statisticsPageHelper", "Ll/din;", "A", "Ll/din;", "paymentComponent", "B", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlPremiumDiscountPurchaseContentView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public din paymentComponent;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final y20<C8928d> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _privilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _introduce;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlPurchasePagePaymentView _payment_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Privilege primaryPrivilege;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public lib0 purchasePageTrack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public x20 fallbackToStandardPremiumFullscreen;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> purchaseSections;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isDialogPageShow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean shouldAutoPay;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean autoPayTriggered;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isPromotion;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public View discountHeroRoot;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final d3n affiliateDiscountCountdownManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean fullscreenDiscountVibrationExposureHeld;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliateCountdownReconcileSub;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Handler serverEndWatchdogHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Runnable serverEndWatchdogRunnable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscription;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliateOriginalPriceSubscription;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPremiumDiscountPurchaseContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseSections = new ArrayList();
        this.affiliateDiscountCountdownManager = new d3n();
        this.serverEndWatchdogHandler = new Handler(Looper.getMainLooper());
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_promo_full_view", IntlPremiumDiscountPurchaseContentView.class.getName());
        l4g0VarM204399c.getClass();
        this.statisticsPageHelper = l4g0VarM204399c;
        this.currentSelectPurchaseSectionAction = new y20() { // from class: l.pvo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54959o(this.f154311a, (C8928d) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m54919A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m54920B(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m54921C(Merchandise merchandise) {
        return Boolean.valueOf(v5b0.m199788n(merchandise));
    }

    /* JADX INFO: renamed from: E */
    public static void m54923E(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, long j) {
        intlPremiumDiscountPurchaseContentView.serverEndWatchdogRunnable = null;
        CoreModule.f18264c.f20438x0.m31209q3(j);
    }

    /* JADX INFO: renamed from: F */
    public static C22421c m54924F(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m54925G(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: H */
    public static void m54926H(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C8928d c8928d, C8928d.a aVar, List list) {
        list.getClass();
        if (jyb.m147479J(list)) {
            intlPremiumDiscountPurchaseContentView.m55005r0(iapAffiliatePromotion, c8928d);
            return;
        }
        intlPremiumDiscountPurchaseContentView.m54986W(aVar, (Merchandise) list.get(0));
        if (c8928d.m54713l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c8928d);
        }
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m54927I(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8928d c8928d) {
        c8928d.getClass();
        return Boolean.valueOf(intlPremiumDiscountPurchaseContentView.m55004q0(c8928d.m54704c()));
    }

    /* JADX INFO: renamed from: I0 */
    public static final List m54928I0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m54929J(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final List m54930J0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX INFO: renamed from: K */
    public static void m54931K(NumberFormat numberFormat, C8928d c8928d) {
        Merchandise merchandiseM54784s;
        StockKeepUnit stockKeepUnit;
        Prices prices;
        C8928d.a aVarM54705d = c8928d.m54705d();
        if ((aVarM54705d == null && (aVarM54705d = c8928d.m54703b()) == null) || (merchandiseM54784s = aVarM54705d.m54784s()) == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        String strM54766h = aVarM54705d.m54766h();
        if (strM54766h == null) {
            strM54766h = prices.currencySymbol;
            if (strM54766h == null) {
                strM54766h = "";
            }
        } else {
            if (strM54766h.length() <= 0) {
                strM54766h = null;
            }
            if (strM54766h == null) {
                strM54766h = prices.currencySymbol;
                if (strM54766h == null) {
                    strM54766h = "";
                }
            }
        }
        double d = prices.originalPrice;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            aVarM54705d.m54748U(strM54766h + numberFormat.format(d));
            return;
        }
        if (prices.originalUnitPrice <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || aVarM54705d.m54788w() <= 0) {
            return;
        }
        aVarM54705d.m54748U(strM54766h + numberFormat.format(prices.originalUnitPrice * ((double) aVarM54705d.m54788w())));
    }

    /* JADX INFO: renamed from: K0 */
    public static final List m54932K0(List list, List list2) {
        list.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (!jyb.m147479J(list2)) {
            list2.getClass();
            Merchandise merchandise = (Merchandise) list2.get(0);
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                if (((Merchandise) mutableList.get(i)).quantity == merchandise.quantity) {
                    mutableList.set(i, merchandise);
                    return mutableList;
                }
            }
        }
        return mutableList;
    }

    /* JADX INFO: renamed from: L0 */
    public static final List m54934L0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m54935M(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, ProductCategory productCategory, List list) {
        intlPremiumDiscountPurchaseContentView.m55010w0(productCategory, list);
    }

    /* JADX INFO: renamed from: N */
    public static C22421c m54936N(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        list.getClass();
        intlPremiumDiscountPurchaseContentView.m54995f0(list);
        Act act = intlPremiumDiscountPurchaseContentView.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return cjj.m110205M(act, list);
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m54937O(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: P */
    public static C22421c m54938P(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static C22421c m54939Q(Throwable th) {
        return C22421c.just(null);
    }

    /* JADX INFO: renamed from: R */
    public static void m54940R(Throwable th) {
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m54941S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Unit m54942T(C4470c c4470c) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m54943a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m54944b(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m54945c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m54946d(C8928d c8928d) {
        c8928d.m54723v(false);
    }

    /* JADX INFO: renamed from: e */
    public static void m54947e(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8928d.a aVar, C8928d c8928d, List list) {
        list.getClass();
        if (jyb.m147479J(list)) {
            return;
        }
        intlPremiumDiscountPurchaseContentView.m54986W(aVar, (Merchandise) list.get(0));
        if (c8928d.m54713l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c8928d);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m54948f(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view, long j) {
        intlPremiumDiscountPurchaseContentView.m54976F0(view, pzi0.m174454o() + C15274a.m88487c(j, 0L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m54950g0(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView) {
        din dinVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m82486a(intlPremiumDiscountPurchaseContentView.paymentComponent) || (dinVar = intlPremiumDiscountPurchaseContentView.paymentComponent) == null || (onClickListener = dinVar.f88686k0) == null) {
            return;
        }
        onClickListener.onClick(intlPremiumDiscountPurchaseContentView);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m54952i(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static C22421c m54953j(Throwable th) {
        return C22421c.just(0);
    }

    /* JADX INFO: renamed from: k */
    public static C22421c m54954k(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m54955k0(boolean z, boolean z2, List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null) {
            return;
        }
        String str = affiliateProducts.googleplay;
        str.getClass();
        boolean z3 = false;
        boolean z4 = z && CoreModule.f18264c.f20396j0.m31579C4() != null && Intrinsics.m88377d(CoreModule.f18264c.f20396j0.m31579C4().skuId, str);
        if (z2 && CoreModule.f18264c.f20438x0.m31201l4(merchandise)) {
            z3 = true;
        }
        if (z4 || z3) {
            list.add(merchandise);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C22421c m54956l(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, final List list) {
        C22421c<List<Merchandise>> c22421cM54998j0 = intlPremiumDiscountPurchaseContentView.m54998j0();
        final Function1 function1 = new Function1() { // from class: l.dwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54932K0(list, (List) obj);
            }
        };
        return c22421cM54998j0.map(new qcj() { // from class: l.ewo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54934L0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static Unit m54957m(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static C22421c m54958n(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m54959o(final IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8928d c8928d) {
        din dinVar;
        if (c8928d != null) {
            c8928d.f35377k = true;
        }
        if (NullChecker.m82486a(intlPremiumDiscountPurchaseContentView.paymentComponent) && (dinVar = intlPremiumDiscountPurchaseContentView.paymentComponent) != null) {
            dinVar.mo115926b(c8928d);
        }
        if (intlPremiumDiscountPurchaseContentView.get_payment_view() != null) {
            intlPremiumDiscountPurchaseContentView.get_payment_view().m55113j(c8928d);
        }
        if (intlPremiumDiscountPurchaseContentView.shouldAutoPay && !intlPremiumDiscountPurchaseContentView.autoPayTriggered && NullChecker.m82486a(c8928d)) {
            intlPremiumDiscountPurchaseContentView.autoPayTriggered = true;
            Act act = intlPremiumDiscountPurchaseContentView.act;
            if (act == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act = null;
            }
            l51.m152888H(act, new Runnable() { // from class: l.awo
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m54950g0(this.f73775a);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22421c m54961q(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        Act act = intlPremiumDiscountPurchaseContentView.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return cjj.m110205M(act, CollectionsKt.listOf(list.get(0)));
    }

    /* JADX INFO: renamed from: r */
    public static List m54962r(final boolean z, final boolean z2, List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.vwo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54955k0(z, z2, arrayList, (Merchandise) obj);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static void m54963s(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C8928d c8928d, Throwable th) {
        intlPremiumDiscountPurchaseContentView.m55005r0(iapAffiliatePromotion, c8928d);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m54964t(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: v */
    public static List m54966v(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static Integer m54967w(List list) {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static C22421c m54968x(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Integer num) {
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(intlPremiumDiscountPurchaseContentView.getPurchaseType().productCategory());
        final Function1 function1 = new Function1() { // from class: l.bwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54928I0((List) obj);
            }
        };
        return c22421cM31647y5.map(new qcj() { // from class: l.cwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54930J0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m54969y(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Unit unit) {
        intlPremiumDiscountPurchaseContentView.m54971A0();
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m54970z(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54713l());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m54971A0() {
        if (CoreModule.f18264c.f20438x0.m31184N3()) {
            m54982P0();
            m54980N0();
        } else {
            x20 x20Var = this.fallbackToStandardPremiumFullscreen;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m54972B0() {
        din dinVar;
        kcg0 kcg0Var = this.affiliateCountdownReconcileSub;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.affiliateCountdownReconcileSub = null;
        m54982P0();
        if (NullChecker.m82486a(this.paymentComponent) && (dinVar = this.paymentComponent) != null) {
            dinVar.release();
        }
        if (NullChecker.m82486a(this.subscription)) {
            kcg0 kcg0Var2 = this.subscription;
            kcg0Var2.getClass();
            kcg0Var2.unsubscribe();
            this.subscription = null;
        }
        kcg0 kcg0Var3 = this.affiliateOriginalPriceSubscription;
        if (kcg0Var3 != null) {
            kcg0Var3.unsubscribe();
        }
        this.affiliateOriginalPriceSubscription = null;
        get_payment_view().m55114k();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m54973C0() {
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
        m54977G0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        m54975E0(purchaseType3);
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
        m54974D0(act2, purchaseType);
        m54978H0();
        m55002o0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m54974D0(Act act, PurchaseType purchaseType) {
        View viewInflate = act.inflater().inflate(rec0.f162421B, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPremiumDiscountExclusivePrivilegeView intlPremiumDiscountExclusivePrivilegeView = (IntlPremiumDiscountExclusivePrivilegeView) viewInflate;
        intlPremiumDiscountExclusivePrivilegeView.m54908f(purchaseType);
        get_introduce().addView(intlPremiumDiscountExclusivePrivilegeView);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m54975E0(PurchaseType purchaseType) {
        get_payment_view().m55112h(purchaseType, this.from, true);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(this.onPaymentSuccess);
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m55116m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m54976F0(View hero, long endMs) {
        TextView textView;
        TextView textView2;
        TextView textView3 = (TextView) hero.findViewById(fdc0.f98340D);
        if (textView3 == null || (textView = (TextView) hero.findViewById(fdc0.f98342E)) == null || (textView2 = (TextView) hero.findViewById(fdc0.f98344F)) == null) {
            return;
        }
        ImageView imageView = (ImageView) hero.findViewById(fdc0.f98336B);
        ImageView imageView2 = (ImageView) hero.findViewById(fdc0.f98338C);
        long jM88487c = C15274a.m88487c(endMs - pzi0.m174454o(), 0L);
        if (jM88487c <= 0) {
            int color = App.f16088e.getColor(h9c0.f108381m);
            textView3.setTextColor(color);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setText("00");
            textView.setText("00");
            textView2.setText("00");
            if (imageView != null) {
                imageView.clearColorFilter();
            }
            if (imageView2 != null) {
                imageView2.clearColorFilter();
                return;
            }
            return;
        }
        Triple<String, String, String> tripleM55011x0 = m55011x0(fmk0.m126240a(endMs, true, true, true, true));
        String strComponent1 = tripleM55011x0.component1();
        String strComponent2 = tripleM55011x0.component2();
        String strComponent3 = tripleM55011x0.component3();
        if (jM88487c < Constants.ONE_MIN_IN_MILLIS) {
            int color2 = App.f16088e.getColor(h9c0.f108335E);
            int color3 = App.f16088e.getColor(h9c0.f108336F);
            m54985V(textView3, strComponent1, color2);
            m54985V(textView, strComponent2, color2);
            m54985V(textView2, strComponent3, color2);
            if (imageView != null) {
                imageView.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
            }
            if (imageView2 != null) {
                imageView2.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        int color4 = App.f16088e.getColor(h9c0.f108381m);
        textView3.setTextColor(color4);
        textView.setTextColor(color4);
        textView2.setTextColor(color4);
        textView3.setText(strComponent1);
        textView.setText(strComponent2);
        textView2.setText(strComponent3);
        if (imageView != null) {
            imageView.clearColorFilter();
        }
        if (imageView2 != null) {
            imageView2.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m54977G0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
            bnl0.m105540X(get_privilege(), 0);
            bnl0.m105540X(get_introduce(), 0);
        } else {
            bnl0.m105540X(get_privilege(), qa00.f156326m);
            bnl0.m105540X(get_introduce(), 0);
        }
        m55001n0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m54978H0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        C22421c<Integer> c22421cM54993d0 = m54993d0();
        final Function1 function1 = new Function1() { // from class: l.wwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54968x(this.f191312a, (Integer) obj);
            }
        };
        C22421c c22421cTake = c22421cM54993d0.flatMap(new qcj() { // from class: l.dxo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54954k(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.exo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54925G((List) obj);
            }
        };
        C22421c c22421cFilter = c22421cTake.filter(new qcj() { // from class: l.fxo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54943a(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.gxo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54956l(this.f106965a, (List) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cFilter.flatMap(new qcj() { // from class: l.hxo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54938P(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.ixo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54936N(this.f117446a, (List) obj);
            }
        };
        this.subscription = c22421cFlatMap.flatMap(new qcj() { // from class: l.qvo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54924F(function4, obj);
            }
        }).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.rvo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54935M(this.f165037a, productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m54979M0(IapAffiliatePromotion p) {
        m54994e0();
        if (p != null) {
            long j = p.endTime;
            if (j <= 0) {
                return;
            }
            final long j2 = p.promotionHitId;
            long jM88487c = C15274a.m88487c(((j + 1) * 1000) - pzi0.m174454o(), 0L);
            Runnable runnable = new Runnable() { // from class: l.zvo
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m54923E(this.f206270a, j2);
                }
            };
            this.serverEndWatchdogRunnable = runnable;
            this.serverEndWatchdogHandler.postDelayed(runnable, jM88487c);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m54980N0() {
        long jM31171F3;
        m54982P0();
        final View view = this.discountHeroRoot;
        if (view == null || view.findViewById(fdc0.f98340D) == null) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        m54979M0(iapAffiliatePromotionM31169E3);
        if (iapAffiliatePromotionM31169E3 != null) {
            jM31171F3 = CoreModule.f18264c.f20438x0.m31171F3(iapAffiliatePromotionM31169E3);
        } else {
            FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
            if (freeTrialDataM31579C4 == null) {
                return;
            } else {
                jM31171F3 = freeTrialDataM31579C4.endTime * 1000;
            }
        }
        if (jM31171F3 <= 0) {
            m54976F0(view, pzi0.m174454o());
            return;
        }
        m54976F0(view, jM31171F3);
        boolean z = iapAffiliatePromotionM31169E3 != null && CoreModule.f18264c.f20438x0.m31174G4(iapAffiliatePromotionM31169E3);
        IapAffiliatePromotion iapAffiliatePromotion = null;
        if (iapAffiliatePromotionM31169E3 != null && z) {
            iapAffiliatePromotion = iapAffiliatePromotionM31169E3;
        }
        if (z && iapAffiliatePromotionM31169E3 != null) {
            long jM31224x4 = CoreModule.f18264c.f20438x0.m31224x4();
            Long l2 = CoreModule.f18264c.f20438x0.f19942c0.get();
            boolean zM31195f4 = CoreModule.f18264c.f20438x0.m31195f4(iapAffiliatePromotionM31169E3);
            if (jM31224x4 == 0) {
                long j = iapAffiliatePromotionM31169E3.promotionHitId;
                if (l2 != null && l2.longValue() == j && zM31195f4) {
                    if (!this.fullscreenDiscountVibrationExposureHeld) {
                        this.fullscreenDiscountVibrationExposureHeld = true;
                        i3n.INSTANCE.m138324b();
                    }
                    m54976F0(view, pzi0.m174454o());
                    return;
                }
            }
        }
        if (!this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = true;
            i3n.INSTANCE.m138324b();
        }
        this.affiliateDiscountCountdownManager.m113879j(jM31171F3, new Function1() { // from class: l.lwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54948f(this.f133831a, view, ((Long) obj).longValue());
            }
        }, iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m54981O0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("promo_pop_source", m6p.m157247g(this.from));
            jSONObject.put("promo_type", m6p.m157248h(CoreModule.f18264c.f20438x0.m31169E3()));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m54982P0() {
        m54994e0();
        this.affiliateDiscountCountdownManager.m113880k();
        if (this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = false;
            i3n.INSTANCE.m138329g();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m54983Q0(List<? extends C8928d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        uqb0.m197269e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: U */
    public final void m54984U(View view) {
        jxo.m147388a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m54985V(TextView textView, String segment, int digitColor) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(segment);
        int length = segment.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(segment.charAt(i))) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(digitColor), i, i + 1, 33);
            }
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: W */
    public final void m54986W(C8928d.a detail, Merchandise ref) {
        Prices prices;
        StockKeepUnit stockKeepUnit = ref.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        detail.m54749V(numberInstance.format(prices.unitPrice));
        detail.m54748U(m54997i0(ref));
    }

    /* JADX INFO: renamed from: X */
    public final void m54987X(SimpleDraweeView art, String imgUrl) {
        if (art == null) {
            return;
        }
        if (imgUrl.length() <= 0) {
            if (art instanceof AutoVDraweeView) {
                ((AutoVDraweeView) art).m224130u();
            } else {
                art.setController(null);
            }
            art.setVisibility(8);
            return;
        }
        if (art instanceof AutoVDraweeView) {
            ((AutoVDraweeView) art).setImageUrl(imgUrl);
        } else {
            uqb0.f180374G.m127109I0(art, imgUrl, qa00.m175859d(300.0f), qa00.m175859d(136.0f));
        }
        art.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final void m54988Y(C8928d section) {
        View view = this.discountHeroRoot;
        if (view == null) {
            return;
        }
        m54991b0(view);
        m54980N0();
    }

    /* JADX INFO: renamed from: Z */
    public final void m54989Z(View hero) {
        m54990a0(null, hero);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m54990a0(IapAffiliatePromotion promo, View hero) {
        TextView textView = (TextView) hero.findViewById(fdc0.f98346G);
        if (textView == null) {
            return;
        }
        textView.setText(App.f16088e.getString(m55003p0() ? R$string.f28507y2 : R$string.f28496x2, Integer.valueOf(m54999l0(promo != null ? promo.discount : null))));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m54991b0(View hero) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31182L3 = iapAffiliatePromotionM31169E3 != null ? CoreModule.f18264c.f20438x0.m31182L3(iapAffiliatePromotionM31169E3) : null;
        TextView textView = (TextView) hero.findViewById(fdc0.f98348H);
        TextView textView2 = (TextView) hero.findViewById(fdc0.f98354K);
        TextView textView3 = (TextView) hero.findViewById(fdc0.f98356L);
        TextView textView4 = (TextView) hero.findViewById(fdc0.f98346G);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) hero.findViewById(fdc0.f98352J);
        String string = (iapAffiliatePromotionDisplaySlotM31182L3 == null || (str5 = iapAffiliatePromotionDisplaySlotM31182L3.mainTitle) == null) ? null : StringsKt.m94324Z0(str5).toString();
        if (string == null) {
            string = "";
        }
        String string2 = (iapAffiliatePromotionDisplaySlotM31182L3 == null || (str4 = iapAffiliatePromotionDisplaySlotM31182L3.subtitle) == null) ? null : StringsKt.m94324Z0(str4).toString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = (iapAffiliatePromotionDisplaySlotM31182L3 == null || (str3 = iapAffiliatePromotionDisplaySlotM31182L3.titleLine1) == null) ? null : StringsKt.m94324Z0(str3).toString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = (iapAffiliatePromotionDisplaySlotM31182L3 == null || (str2 = iapAffiliatePromotionDisplaySlotM31182L3.titleLine2) == null) ? null : StringsKt.m94324Z0(str2).toString();
        if (string4 == null) {
            string4 = "";
        }
        String string5 = (iapAffiliatePromotionDisplaySlotM31182L3 == null || (str = iapAffiliatePromotionDisplaySlotM31182L3.countdownTopText) == null) ? null : StringsKt.m94324Z0(str).toString();
        if (string5 == null) {
            string5 = "";
        }
        boolean z = string.length() > 0 || string2.length() > 0 || string3.length() > 0 || string4.length() > 0;
        if (iapAffiliatePromotionDisplaySlotM31182L3 == null || !z) {
            if (textView != null) {
                textView.setText(App.f16088e.getString(R$string.f28288f3));
            }
            if (textView2 != null) {
                textView2.setText(App.f16088e.getString(R$string.f28518z2));
            }
            if (textView3 != null) {
                textView3.setText(App.f16088e.getString(R$string.f28485w2));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            m54989Z(hero);
            m54987X(simpleDraweeView, "");
            return;
        }
        if (string.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string);
            }
            m54992c0(textView2, string3);
            if (string2.length() == 0) {
                string2 = string4;
            }
            m54992c0(textView3, string2);
        } else if (string3.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string3);
            }
            m54992c0(textView2, string4);
            m54992c0(textView3, string2);
        } else {
            m54990a0(iapAffiliatePromotionM31169E3, hero);
            m54992c0(textView2, string4);
            m54992c0(textView3, string2);
        }
        if (string5.length() == 0) {
            if (textView != null) {
                textView.setText(App.f16088e.getString(R$string.f28288f3));
            }
        } else if (textView != null) {
            textView.setText(string5);
        }
        String str6 = iapAffiliatePromotionDisplaySlotM31182L3.imgUrl;
        String string6 = str6 != null ? StringsKt.m94324Z0(str6).toString() : null;
        m54987X(simpleDraweeView, string6 != null ? string6 : "");
    }

    /* JADX INFO: renamed from: c0 */
    public final void m54992c0(TextView textView, String text) {
        if (text.length() > 0) {
            if (textView != null) {
                textView.setText(text);
            }
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText("");
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final C22421c<Integer> m54993d0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            C22421c<Integer> c22421cJust = C22421c.just(0);
            c22421cJust.getClass();
            return c22421cJust;
        }
        if (CoreModule.f18264c.f20438x0.m31185O3() || CoreModule.f18264c.f20438x0.m31189W3()) {
            C22421c<Integer> c22421cJust2 = C22421c.just(0);
            c22421cJust2.getClass();
            return c22421cJust2;
        }
        C22421c<List<IapAffiliatePromotion>> c22421cTake = CoreModule.f18264c.f20438x0.m31222w4().take(1);
        final Function1 function1 = new Function1() { // from class: l.fwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54967w((List) obj);
            }
        };
        C22421c<Integer> c22421cOnErrorResumeNext = c22421cTake.map(new qcj() { // from class: l.gwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54952i(function1, obj);
            }
        }).onErrorResumeNext((qcj<Throwable, ? extends C22421c<? extends R>>) new qcj() { // from class: l.hwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54953j((Throwable) obj);
            }
        });
        c22421cOnErrorResumeNext.getClass();
        return c22421cOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m54994e0() {
        Runnable runnable = this.serverEndWatchdogRunnable;
        if (runnable != null) {
            this.serverEndWatchdogHandler.removeCallbacks(runnable);
        }
        this.serverEndWatchdogRunnable = null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m54995f0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.f18264c.f20438x0.m31184N3() || (iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3()) == null || CoreModule.f18264c.f20438x0.m31193c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.f18264c.f20438x0.m31201l4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
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

    /* JADX INFO: renamed from: h0 */
    public final C8928d m54996h0(List<? extends C8928d> sections) {
        return (C8928d) jyb.m147529r(sections, new qcj() { // from class: l.nwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54927I(this.f143986a, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final String m54997i0(Merchandise merchandise) {
        Prices prices;
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        String str = numberInstance.format(prices.price);
        String str2 = prices.currencySymbol;
        String str3 = str2 != null ? str2 : "";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%1$s%2$s", Arrays.copyOf(new Object[]{str3, str}, 2));
    }

    /* JADX INFO: renamed from: j0 */
    public final C22421c<List<Merchandise>> m54998j0() {
        final boolean z = CoreModule.f18264c.f20396j0.m31611T4() || CoreModule.f18264c.f20396j0.m31648z4();
        final boolean zM31184N3 = CoreModule.f18264c.f20438x0.m31184N3();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || (!z && !zM31184N3)) {
            C22421c<List<Merchandise>> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
        final Function1 function1 = new Function1() { // from class: l.owo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54919A((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cFilter = c22421cM31647y5.filter(new qcj() { // from class: l.pwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54920B(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.qwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54962r(z, zM31184N3, (List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cOnErrorResumeNext = c22421cFilter.map(new qcj() { // from class: l.rwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54966v(function2, obj);
            }
        }).onErrorResumeNext((qcj<Throwable, ? extends C22421c<? extends R>>) new qcj() { // from class: l.swo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54939Q((Throwable) obj);
            }
        });
        c22421cOnErrorResumeNext.getClass();
        return c22421cOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m54999l0(String raw) {
        String strM55007t0 = m55007t0(raw);
        Integer intOrNull = StringsKt.toIntOrNull(strM55007t0);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        Double dM94363m = C15492c.m94363m(strM55007t0);
        Integer numValueOf = dM94363m != null ? Integer.valueOf((int) dM94363m.doubleValue()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 51;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m55000m0(List<? extends C8928d> sections) {
        final NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        jyb.m147537z(sections, new y20() { // from class: l.mwo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54931K(numberInstance, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m55001n0() {
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        View viewInflate = act.inflater().inflate(rec0.f162425C, (ViewGroup) get_privilege(), false);
        get_privilege().addView(viewInflate);
        this.discountHeroRoot = viewInflate;
        viewInflate.getClass();
        m54991b0(viewInflate);
        m54980N0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m55002o0() {
        if (this.affiliateCountdownReconcileSub != null) {
            return;
        }
        Act act = this.act;
        Act act2 = null;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        Act act3 = this.act;
        if (act3 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        } else {
            act2 = act3;
        }
        C22421c<C4470c> c22421cLifecycle = act2.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.svo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54937O((C4470c) obj);
            }
        };
        C22421c<C4470c> c22421cFilter = c22421cLifecycle.filter(new qcj() { // from class: l.tvo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54941S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.uvo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54942T((C4470c) obj);
            }
        };
        C22421c<R> map = c22421cFilter.map(new qcj() { // from class: l.vvo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54944b(function2, obj);
            }
        });
        C22421c<Boolean> c22421cM31208p4 = CoreModule.f18264c.f20438x0.m31208p4();
        final Function1 function3 = new Function1() { // from class: l.wvo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54929J((Boolean) obj);
            }
        };
        this.affiliateCountdownReconcileSub = act.duringCreated(C22421c.merge(map, c22421cM31208p4.map(new qcj() { // from class: l.xvo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54957m(function3, obj);
            }
        }))).subscribe(psd0.m173596G(new y20() { // from class: l.yvo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54969y(this.f201749a, (Unit) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54972B0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54984U(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m55003p0() {
        Locale locale = Locale.getDefault();
        return C15493d.m94381x(locale.getLanguage(), "zh", true) && C15493d.m94381x(locale.getCountry(), "TW", true);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m55004q0(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        FreeTrialData freeTrialDataM31579C4;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            str.getClass();
            if (CoreModule.f18264c.f20438x0.m31201l4(merchandise)) {
                return true;
            }
            if (!CoreModule.f18264c.f20396j0.m31611T4() || (freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4()) == null) {
                return false;
            }
            String str2 = freeTrialDataM31579C4.skuId;
            str2.getClass();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.m88377d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m55005r0(IapAffiliatePromotion promotion, final C8928d selected) {
        final C8928d.a aVarM54705d = selected.m54705d();
        if (aVarM54705d == null && (aVarM54705d = selected.m54703b()) == null) {
            return;
        }
        C22421c<List<Merchandise>> c22421cM194375b = u3n.m194375b(promotion);
        final Function1 function1 = new Function1() { // from class: l.xwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54964t((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cTake = c22421cM194375b.filter(new qcj() { // from class: l.ywo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54945c(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.zwo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54961q(this.f206363a, (List) obj);
            }
        };
        C22421c c22421cCompose = c22421cTake.flatMap(new qcj() { // from class: l.axo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54958n(function2, obj);
            }
        }).compose(psd0.m173592C());
        c22421cCompose.getClass();
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        this.affiliateOriginalPriceSubscription = act.duringCreated(c22421cCompose).subscribe(psd0.m173597H(new y20() { // from class: l.bxo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54947e(this.f78894a, aVarM54705d, selected, (List) obj);
            }
        }, new y20() { // from class: l.cxo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m54940R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m55006s0(final C8928d selected) {
        final IapAffiliatePromotion iapAffiliatePromotionM31169E3;
        Merchandise merchandiseM54784s;
        AffiliateProducts affiliateProducts;
        String str;
        kcg0 kcg0Var = this.affiliateOriginalPriceSubscription;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        Act act = null;
        this.affiliateOriginalPriceSubscription = null;
        if (CoreModule.f18264c.f20438x0.m31184N3() && (iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3()) != null) {
            final C8928d.a aVarM54705d = selected.m54705d();
            if ((aVarM54705d == null && (aVarM54705d = selected.m54703b()) == null) || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
                return;
            }
            String str2 = iapAffiliatePromotionM31169E3.offerId;
            String string = str2 != null ? StringsKt.m94324Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                StockKeepUnit stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit;
                String string2 = (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) ? null : StringsKt.m94324Z0(str).toString();
                String str3 = string2 != null ? string2 : "";
                String strM31159l3 = CoreIntlAffiliatePromotions.m31159l3(str3, iapAffiliatePromotionM31169E3.offerId);
                strM31159l3.getClass();
                if (strM31159l3.length() > 0 && !Intrinsics.m88377d(strM31159l3, str3)) {
                    Merchandise merchandiseMo225055clone = merchandiseM54784s.mo225055clone();
                    merchandiseMo225055clone.getClass();
                    StockKeepUnit stockKeepUnit2 = merchandiseMo225055clone.defaultStockKeepUnit;
                    stockKeepUnit2.getClass();
                    stockKeepUnit2.affiliateProducts.googleplay = strM31159l3;
                    Act act2 = this.act;
                    if (act2 == null) {
                        Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                        act2 = null;
                    }
                    Act act3 = this.act;
                    if (act3 == null) {
                        Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                    } else {
                        act = act3;
                    }
                    this.affiliateOriginalPriceSubscription = act2.duringCreated(cjj.m110205M(act, CollectionsKt.listOf(merchandiseMo225055clone))).subscribe(psd0.m173597H(new y20() { // from class: l.two
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m54926H(this.f176410a, iapAffiliatePromotionM31169E3, selected, aVarM54705d, (List) obj);
                        }
                    }, new y20() { // from class: l.uwo
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m54963s(this.f181310a, iapAffiliatePromotionM31169E3, selected, (Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            m55005r0(iapAffiliatePromotionM31169E3, selected);
        }
    }

    public final void setAutoPay(boolean autoPay) {
        this.shouldAutoPay = autoPay;
    }

    public final void setDialogStateAction(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setFallbackToStandardPremiumFullscreen(@Nullable x20 fallback) {
        this.fallbackToStandardPremiumFullscreen = fallback;
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

    /* JADX INFO: renamed from: t0 */
    public final String m55007t0(String raw) {
        if (raw == null || StringsKt.m94329e0(raw)) {
            return "51";
        }
        String string = StringsKt.m94324Z0(StringsKt.m94349y0(StringsKt.m94324Z0(raw).toString(), "%")).toString();
        return string.length() == 0 ? "51" : string;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m55008u0() {
        if (this.isDialogPageShow) {
            w1e.m204401e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m55009v0() {
        if (this.isDialogPageShow) {
            return;
        }
        this.isDialogPageShow = true;
        m54981O0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m55010w0(ProductCategory category, List<? extends Merchandise> merchandises) {
        x20 x20Var;
        x20 x20Var2;
        boolean zM82486a = NullChecker.m82486a(jyb.m147529r(merchandises, new qcj() { // from class: l.iwo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m54921C((Merchandise) obj);
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
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType3 == purchaseType4 && jyb.m147479J(listMo147671a) && (x20Var2 = this.fallbackToStandardPremiumFullscreen) != null) {
            if (x20Var2 != null) {
                x20Var2.call();
                return;
            }
            return;
        }
        m55000m0(listMo147671a);
        C8928d c8928dM54996h0 = m54996h0(listMo147671a);
        if (c8928dM54996h0 == null) {
            c8928dM54996h0 = (C8928d) jyb.m147529r(listMo147671a, new qcj() { // from class: l.jwo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPremiumDiscountPurchaseContentView.m54970z((C8928d) obj);
                }
            });
        }
        if (c8928dM54996h0 != null) {
            get_payment_view().setVisibility(0);
            jyb.m147537z(listMo147671a, new y20() { // from class: l.kwo
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlPremiumDiscountPurchaseContentView.m54946d((C8928d) obj);
                }
            });
            c8928dM54996h0.m54723v(true);
            m54988Y(c8928dM54996h0);
            this.currentSelectPurchaseSectionAction.call(c8928dM54996h0);
            m55006s0(c8928dM54996h0);
        } else {
            get_payment_view().setVisibility(8);
            din dinVar2 = this.paymentComponent;
            if (dinVar2 != null) {
                dinVar2.mo115926b(null);
            }
            get_payment_view().m55113j(null);
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType = purchaseType5;
            }
            if (purchaseType == purchaseType4 && (x20Var = this.fallbackToStandardPremiumFullscreen) != null && x20Var != null) {
                x20Var.call();
            }
        }
        m54983Q0(listMo147671a);
    }

    /* JADX INFO: renamed from: x0 */
    public final Triple<String, String, String> m55011x0(String raw) {
        if (raw == null || raw.length() == 0) {
            return new Triple<>("00", "00", "00");
        }
        List listSplit$default = StringsKt.split$default(raw, new String[]{":"}, false, 0, 6, null);
        return listSplit$default.size() >= 3 ? new Triple<>(listSplit$default.get(0), listSplit$default.get(1), listSplit$default.get(2)) : new Triple<>("00", "00", "00");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m55012y0() {
        din dinVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m82486a(this.paymentComponent) || (dinVar = this.paymentComponent) == null || (onClickListener = dinVar.f88686k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m55013z0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPremiumDiscountPurchaseContentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ IntlPremiumDiscountPurchaseContentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
