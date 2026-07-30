package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.AffiliateProducts;
import com.p046p1.mobile.putong.core.data.FreeTrialData;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.Ref;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15167a;
import kotlin.text.C15385c;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.AutoVDraweeView;
import p149l.b1c0;
import p149l.c4g0;
import p149l.cjy;
import p149l.cwf0;
import p149l.d1n;
import p149l.d30;
import p149l.dgn;
import p149l.e30;
import p149l.e51;
import p149l.g30;
import p149l.hab0;
import p149l.i0e;
import p149l.i1n;
import p149l.igj;
import p149l.j6f;
import p149l.jo0;
import p149l.jvo;
import p149l.m4p;
import p149l.m6c0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.rwl;
import p149l.rxa0;
import p149l.t100;
import p149l.u1n;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.z4c0;
import p149l.zck0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 í\u00012\u00020\u0001:\u0002\u0094\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010&0\u001dH\u0002¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\"H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b?\u0010%J\u000f\u0010@\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u000eJ\u000f\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010\u000eJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\fJ!\u0010G\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020<H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010\fJ!\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u0001022\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ!\u0010P\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010O\u001a\u00020<H\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020<2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bW\u0010\u000eJ\u0019\u0010Y\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u000eJ\u001f\u0010^\u001a\u00020\n2\u0006\u0010B\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J+\u0010a\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0`2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\ba\u0010bJ'\u0010e\u001a\u00020\n2\u0006\u0010N\u001a\u00020M2\u0006\u0010c\u001a\u00020<2\u0006\u0010d\u001a\u00020\u001eH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\nH\u0002¢\u0006\u0004\bg\u0010\u000eJ\u001f\u0010h\u001a\u0004\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020j2\b\u0010;\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020,H\u0002¢\u0006\u0004\bn\u00101J\u000f\u0010o\u001a\u00020jH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\nH\u0014¢\u0006\u0004\bq\u0010\u000eJ9\u0010t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010r\u001a\u0004\u0018\u00010<2\u0006\u0010s\u001a\u00020j¢\u0006\u0004\bt\u0010uJ\u001d\u0010x\u001a\u00020\n2\u000e\u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v¢\u0006\u0004\bx\u0010yJ+\u0010|\u001a\u00020\n2\u001c\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z¢\u0006\u0004\b|\u0010}J)\u0010\u007f\u001a\u00020\n2\u001a\u0010~\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z¢\u0006\u0004\b\u007f\u0010}J\u001c\u0010\u0082\u0001\u001a\u00020\n2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020j¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020\n¢\u0006\u0005\b\u008b\u0001\u0010\u000eJ\u000f\u0010\u008c\u0001\u001a\u00020\n¢\u0006\u0005\b\u008c\u0001\u0010\u000eJ\u000f\u0010\u008d\u0001\u001a\u00020\n¢\u0006\u0005\b\u008d\u0001\u0010\u000eJ\u0011\u0010\u008e\u0001\u001a\u00020\nH\u0014¢\u0006\u0005\b\u008e\u0001\u0010\u000eJ\u000f\u0010\u008f\u0001\u001a\u00020\n¢\u0006\u0005\b\u008f\u0001\u0010\u000eJ\u0010\u0010\u0090\u0001\u001a\u00020\u0012¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020\n¢\u0006\u0005\b\u0092\u0001\u0010\u000eR*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010¡\u0001\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010r\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R \u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R.\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R-\u0010º\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\"\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020,0!8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010IR\u0018\u0010Æ\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u0010IR\u0017\u0010Ç\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010IR\u0018\u0010É\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010IR\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ò\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010IR\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Õ\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Õ\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001d\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020,0v8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010¶\u0001¨\u0006î\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "U", "(Landroid/view/View;)V", "o0", "()V", "A0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "G0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "D0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "E0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "H0", "Lrx/c;", "", "d0", "()Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "f0", "(Ljava/util/List;)V", "", "j0", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "w0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m0", MatchFrom.selected, "s0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", SchemeKey.promotion, "r0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", Ref.TYPE, "W", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/Merchandise;)V", Merchandise.TYPE, "", "i0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "Q0", "O0", "n0", "hero", "b0", "Lcom/facebook/drawee/view/SimpleDraweeView;", "art", "imgUrl", "X", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V", "Z", NotificationCompat.CATEGORY_PROMO, "a0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "text", "c0", "(Landroid/widget/TextView;Ljava/lang/String;)V", "raw", "l0", "(Ljava/lang/String;)I", "t0", "(Ljava/lang/String;)Ljava/lang/String;", "N0", "p", "M0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "e0", "", "endMs", "F0", "(Landroid/view/View;J)V", "Lkotlin/Triple;", "x0", "(Ljava/lang/String;)Lkotlin/Triple;", "segment", "digitColor", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Landroid/widget/TextView;Ljava/lang/String;I)V", "P0", "h0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", "q0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "section", "Y", "p0", "()Z", "onFinishInflate", "from", "multiPages", "z0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/e30;", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "Ll/g30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "Ll/d30;", "fallback", "setFallbackToStandardPremiumFullscreen", "(Ll/d30;)V", "autoPay", "setAutoPay", "(Z)V", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "C0", "v0", "u0", "onDetachedFromWindow", "B0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "y0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_introduce", "()Landroid/widget/FrameLayout;", "set_introduce", "(Landroid/widget/FrameLayout;)V", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/android/app/Act;", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "Ljava/lang/String;", "g", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "h", "Ll/hab0;", RXScreenCaptureService.KEY_INDEX, "Ll/e30;", "j", "Ll/g30;", "k", "onPaymentFailedAction", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/d30;", "fallbackToStandardPremiumFullscreen", "m", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "n", "isDialogPageShow", "o", "shouldAutoPay", "autoPayTriggered", "q", "isPromotion", "r", "Landroid/view/View;", "discountHeroRoot", "Ll/d1n;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/d1n;", "affiliateDiscountCountdownManager", Constants.KEY_T, "fullscreenDiscountVibrationExposureHeld", "Ll/c4g0;", "u", "Ll/c4g0;", "affiliateCountdownReconcileSub", "Landroid/os/Handler;", ResourceDirection.f38808v, "Landroid/os/Handler;", "serverEndWatchdogHandler", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "serverEndWatchdogRunnable", BaseSei.f13930X, "subscription", BaseSei.f13931Y, "affiliateOriginalPriceSubscription", "Ll/cwf0;", BaseSei.f13932Z, "Ll/cwf0;", "statisticsPageHelper", "Ll/dgn;", "A", "Ll/dgn;", "paymentComponent", "B", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlPremiumDiscountPurchaseContentView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public dgn paymentComponent;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final e30<C8765d> currentSelectPurchaseSectionAction;

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
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public d30 fallbackToStandardPremiumFullscreen;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<C8765d> purchaseSections;

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
    public final d1n affiliateDiscountCountdownManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean fullscreenDiscountVibrationExposureHeld;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliateCountdownReconcileSub;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Handler serverEndWatchdogHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Runnable serverEndWatchdogRunnable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscription;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliateOriginalPriceSubscription;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPremiumDiscountPurchaseContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseSections = new ArrayList();
        this.affiliateDiscountCountdownManager = new d1n();
        this.serverEndWatchdogHandler = new Handler(Looper.getMainLooper());
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_promo_full_view", IntlPremiumDiscountPurchaseContentView.class.getName());
        cwf0VarM133794c.getClass();
        this.statisticsPageHelper = cwf0VarM133794c;
        this.currentSelectPurchaseSectionAction = new e30() { // from class: l.pto
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53776o(this.f151188a, (C8765d) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m53736A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m53737B(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m53738C(Merchandise merchandise) {
        return Boolean.valueOf(rxa0.m181493n(merchandise));
    }

    /* JADX INFO: renamed from: E */
    public static void m53740E(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, long j) {
        intlPremiumDiscountPurchaseContentView.serverEndWatchdogRunnable = null;
        CoreModule.f17545c.f19696x0.m30211q3(j);
    }

    /* JADX INFO: renamed from: F */
    public static C22306c m53741F(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m53742G(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: H */
    public static void m53743H(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C8765d c8765d, C8765d.a aVar, List list) {
        list.getClass();
        if (vwb.m200296J(list)) {
            intlPremiumDiscountPurchaseContentView.m53822r0(iapAffiliatePromotion, c8765d);
            return;
        }
        intlPremiumDiscountPurchaseContentView.m53803W(aVar, (Merchandise) list.get(0));
        if (c8765d.m53530l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c8765d);
        }
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m53744I(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8765d c8765d) {
        c8765d.getClass();
        return Boolean.valueOf(intlPremiumDiscountPurchaseContentView.m53821q0(c8765d.m53521c()));
    }

    /* JADX INFO: renamed from: I0 */
    public static final List m53745I0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m53746J(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final List m53747J0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX INFO: renamed from: K */
    public static void m53748K(NumberFormat numberFormat, C8765d c8765d) {
        Merchandise merchandiseM53601s;
        StockKeepUnit stockKeepUnit;
        Prices prices;
        C8765d.a aVarM53522d = c8765d.m53522d();
        if ((aVarM53522d == null && (aVarM53522d = c8765d.m53520b()) == null) || (merchandiseM53601s = aVarM53522d.m53601s()) == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        String strM53583h = aVarM53522d.m53583h();
        if (strM53583h == null) {
            strM53583h = prices.currencySymbol;
            if (strM53583h == null) {
                strM53583h = "";
            }
        } else {
            if (strM53583h.length() <= 0) {
                strM53583h = null;
            }
            if (strM53583h == null) {
                strM53583h = prices.currencySymbol;
                if (strM53583h == null) {
                    strM53583h = "";
                }
            }
        }
        double d = prices.originalPrice;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            aVarM53522d.m53565U(strM53583h + numberFormat.format(d));
            return;
        }
        if (prices.originalUnitPrice <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || aVarM53522d.m53605w() <= 0) {
            return;
        }
        aVarM53522d.m53565U(strM53583h + numberFormat.format(prices.originalUnitPrice * ((double) aVarM53522d.m53605w())));
    }

    /* JADX INFO: renamed from: K0 */
    public static final List m53749K0(List list, List list2) {
        list.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (!vwb.m200296J(list2)) {
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
    public static final List m53751L0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m53752M(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, ProductCategory productCategory, List list) {
        intlPremiumDiscountPurchaseContentView.m53827w0(productCategory, list);
    }

    /* JADX INFO: renamed from: N */
    public static C22306c m53753N(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        list.getClass();
        intlPremiumDiscountPurchaseContentView.m53812f0(list);
        Act act = intlPremiumDiscountPurchaseContentView.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return igj.m136009M(act, list);
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m53754O(C4319c c4319c) {
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: P */
    public static C22306c m53755P(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static C22306c m53756Q(Throwable th) {
        return C22306c.just(null);
    }

    /* JADX INFO: renamed from: R */
    public static void m53757R(Throwable th) {
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m53758S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Unit m53759T(C4319c c4319c) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m53760a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m53761b(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m53762c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m53763d(C8765d c8765d) {
        c8765d.m53540v(false);
    }

    /* JADX INFO: renamed from: e */
    public static void m53764e(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8765d.a aVar, C8765d c8765d, List list) {
        list.getClass();
        if (vwb.m200296J(list)) {
            return;
        }
        intlPremiumDiscountPurchaseContentView.m53803W(aVar, (Merchandise) list.get(0));
        if (c8765d.m53530l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c8765d);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m53765f(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view, long j) {
        intlPremiumDiscountPurchaseContentView.m53793F0(view, mqi0.m155944o() + C15167a.m87597c(j, 0L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m53767g0(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m81303a(intlPremiumDiscountPurchaseContentView.paymentComponent) || (dgnVar = intlPremiumDiscountPurchaseContentView.paymentComponent) == null || (onClickListener = dgnVar.f86137k0) == null) {
            return;
        }
        onClickListener.onClick(intlPremiumDiscountPurchaseContentView);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m53769i(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static C22306c m53770j(Throwable th) {
        return C22306c.just(0);
    }

    /* JADX INFO: renamed from: k */
    public static C22306c m53771k(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m53772k0(boolean z, boolean z2, List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null) {
            return;
        }
        String str = affiliateProducts.googleplay;
        str.getClass();
        boolean z3 = false;
        boolean z4 = z && CoreModule.f17545c.f19654j0.m30576C4() != null && Intrinsics.m87488d(CoreModule.f17545c.f19654j0.m30576C4().skuId, str);
        if (z2 && CoreModule.f17545c.f19696x0.m30203l4(merchandise)) {
            z3 = true;
        }
        if (z4 || z3) {
            list.add(merchandise);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C22306c m53773l(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, final List list) {
        C22306c<List<Merchandise>> c22306cM53815j0 = intlPremiumDiscountPurchaseContentView.m53815j0();
        final Function1 function1 = new Function1() { // from class: l.duo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53749K0(list, (List) obj);
            }
        };
        return c22306cM53815j0.map(new w9j() { // from class: l.euo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53751L0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static Unit m53774m(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static C22306c m53775n(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m53776o(final IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C8765d c8765d) {
        dgn dgnVar;
        if (c8765d != null) {
            c8765d.f34529k = true;
        }
        if (NullChecker.m81303a(intlPremiumDiscountPurchaseContentView.paymentComponent) && (dgnVar = intlPremiumDiscountPurchaseContentView.paymentComponent) != null) {
            dgnVar.mo111147b(c8765d);
        }
        if (intlPremiumDiscountPurchaseContentView.get_payment_view() != null) {
            intlPremiumDiscountPurchaseContentView.get_payment_view().m53930j(c8765d);
        }
        if (intlPremiumDiscountPurchaseContentView.shouldAutoPay && !intlPremiumDiscountPurchaseContentView.autoPayTriggered && NullChecker.m81303a(c8765d)) {
            intlPremiumDiscountPurchaseContentView.autoPayTriggered = true;
            Act act = intlPremiumDiscountPurchaseContentView.act;
            if (act == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act = null;
            }
            e51.m114743H(act, new Runnable() { // from class: l.auo
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m53767g0(this.f71846a);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22306c m53778q(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        Act act = intlPremiumDiscountPurchaseContentView.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        return igj.m136009M(act, CollectionsKt.listOf(list.get(0)));
    }

    /* JADX INFO: renamed from: r */
    public static List m53779r(final boolean z, final boolean z2, List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.vuo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53772k0(z, z2, arrayList, (Merchandise) obj);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static void m53780s(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C8765d c8765d, Throwable th) {
        intlPremiumDiscountPurchaseContentView.m53822r0(iapAffiliatePromotion, c8765d);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m53781t(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: v */
    public static List m53783v(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static Integer m53784w(List list) {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static C22306c m53785x(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Integer num) {
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(intlPremiumDiscountPurchaseContentView.getPurchaseType().productCategory());
        final Function1 function1 = new Function1() { // from class: l.buo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53745I0((List) obj);
            }
        };
        return c22306cM30644y5.map(new w9j() { // from class: l.cuo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53747J0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m53786y(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Unit unit) {
        intlPremiumDiscountPurchaseContentView.m53788A0();
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m53787z(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53530l());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m53788A0() {
        if (CoreModule.f17545c.f19696x0.m30186N3()) {
            m53799P0();
            m53797N0();
        } else {
            d30 d30Var = this.fallbackToStandardPremiumFullscreen;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m53789B0() {
        dgn dgnVar;
        c4g0 c4g0Var = this.affiliateCountdownReconcileSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.affiliateCountdownReconcileSub = null;
        m53799P0();
        if (NullChecker.m81303a(this.paymentComponent) && (dgnVar = this.paymentComponent) != null) {
            dgnVar.release();
        }
        if (NullChecker.m81303a(this.subscription)) {
            c4g0 c4g0Var2 = this.subscription;
            c4g0Var2.getClass();
            c4g0Var2.unsubscribe();
            this.subscription = null;
        }
        c4g0 c4g0Var3 = this.affiliateOriginalPriceSubscription;
        if (c4g0Var3 != null) {
            c4g0Var3.unsubscribe();
        }
        this.affiliateOriginalPriceSubscription = null;
        get_payment_view().m53931k();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m53790C0() {
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
        m53794G0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        m53792E0(purchaseType3);
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
        m53791D0(act2, purchaseType);
        m53795H0();
        m53819o0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m53791D0(Act act, PurchaseType purchaseType) {
        View viewInflate = act.inflater().inflate(m6c0.f131461B, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPremiumDiscountExclusivePrivilegeView intlPremiumDiscountExclusivePrivilegeView = (IntlPremiumDiscountExclusivePrivilegeView) viewInflate;
        intlPremiumDiscountExclusivePrivilegeView.m53725f(purchaseType);
        get_introduce().addView(intlPremiumDiscountExclusivePrivilegeView);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m53792E0(PurchaseType purchaseType) {
        get_payment_view().m53929h(purchaseType, this.from, true);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(this.onPaymentSuccess);
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m53933m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m53793F0(View hero, long endMs) {
        TextView textView;
        TextView textView2;
        TextView textView3 = (TextView) hero.findViewById(z4c0.f201464D);
        if (textView3 == null || (textView = (TextView) hero.findViewById(z4c0.f201466E)) == null || (textView2 = (TextView) hero.findViewById(z4c0.f201468F)) == null) {
            return;
        }
        ImageView imageView = (ImageView) hero.findViewById(z4c0.f201460B);
        ImageView imageView2 = (ImageView) hero.findViewById(z4c0.f201462C);
        long jM87597c = C15167a.m87597c(endMs - mqi0.m155944o(), 0L);
        if (jM87597c <= 0) {
            int color = App.f15369e.getColor(b1c0.f72561m);
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
        Triple<String, String, String> tripleM53828x0 = m53828x0(zck0.m218065a(endMs, true, true, true, true));
        String strComponent1 = tripleM53828x0.component1();
        String strComponent2 = tripleM53828x0.component2();
        String strComponent3 = tripleM53828x0.component3();
        if (jM87597c < Constants.ONE_MIN_IN_MILLIS) {
            int color2 = App.f15369e.getColor(b1c0.f72515E);
            int color3 = App.f15369e.getColor(b1c0.f72516F);
            m53802V(textView3, strComponent1, color2);
            m53802V(textView, strComponent2, color2);
            m53802V(textView2, strComponent3, color2);
            if (imageView != null) {
                imageView.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
            }
            if (imageView2 != null) {
                imageView2.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        int color4 = App.f15369e.getColor(b1c0.f72561m);
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
    public final void m53794G0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
            xdl0.m208360X(get_privilege(), 0);
            xdl0.m208360X(get_introduce(), 0);
        } else {
            xdl0.m208360X(get_privilege(), t100.f167264m);
            xdl0.m208360X(get_introduce(), 0);
        }
        m53818n0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m53795H0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        C22306c<Integer> c22306cM53810d0 = m53810d0();
        final Function1 function1 = new Function1() { // from class: l.wuo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53785x(this.f188146a, (Integer) obj);
            }
        };
        C22306c c22306cTake = c22306cM53810d0.flatMap(new w9j() { // from class: l.dvo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53771k(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.evo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53742G((List) obj);
            }
        };
        C22306c c22306cFilter = c22306cTake.filter(new w9j() { // from class: l.fvo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53760a(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.gvo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53773l(this.f104584a, (List) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cFilter.flatMap(new w9j() { // from class: l.hvo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53755P(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.ivo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53753N(this.f115186a, (List) obj);
            }
        };
        this.subscription = c22306cFlatMap.flatMap(new w9j() { // from class: l.qto
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53741F(function4, obj);
            }
        }).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.rto
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53752M(this.f160979a, productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m53796M0(IapAffiliatePromotion p) {
        m53811e0();
        if (p != null) {
            long j = p.endTime;
            if (j <= 0) {
                return;
            }
            final long j2 = p.promotionHitId;
            long jM87597c = C15167a.m87597c(((j + 1) * 1000) - mqi0.m155944o(), 0L);
            Runnable runnable = new Runnable() { // from class: l.zto
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m53740E(this.f204744a, j2);
                }
            };
            this.serverEndWatchdogRunnable = runnable;
            this.serverEndWatchdogHandler.postDelayed(runnable, jM87597c);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m53797N0() {
        long jM30173F3;
        m53799P0();
        final View view = this.discountHeroRoot;
        if (view == null || view.findViewById(z4c0.f201464D) == null) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        m53796M0(iapAffiliatePromotionM30171E3);
        if (iapAffiliatePromotionM30171E3 != null) {
            jM30173F3 = CoreModule.f17545c.f19696x0.m30173F3(iapAffiliatePromotionM30171E3);
        } else {
            FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
            if (freeTrialDataM30576C4 == null) {
                return;
            } else {
                jM30173F3 = freeTrialDataM30576C4.endTime * 1000;
            }
        }
        if (jM30173F3 <= 0) {
            m53793F0(view, mqi0.m155944o());
            return;
        }
        m53793F0(view, jM30173F3);
        boolean z = iapAffiliatePromotionM30171E3 != null && CoreModule.f17545c.f19696x0.m30176G4(iapAffiliatePromotionM30171E3);
        IapAffiliatePromotion iapAffiliatePromotion = null;
        if (iapAffiliatePromotionM30171E3 != null && z) {
            iapAffiliatePromotion = iapAffiliatePromotionM30171E3;
        }
        if (z && iapAffiliatePromotionM30171E3 != null) {
            long jM30226x4 = CoreModule.f17545c.f19696x0.m30226x4();
            Long l2 = CoreModule.f17545c.f19696x0.f19201c0.get();
            boolean zM30197f4 = CoreModule.f17545c.f19696x0.m30197f4(iapAffiliatePromotionM30171E3);
            if (jM30226x4 == 0) {
                long j = iapAffiliatePromotionM30171E3.promotionHitId;
                if (l2 != null && l2.longValue() == j && zM30197f4) {
                    if (!this.fullscreenDiscountVibrationExposureHeld) {
                        this.fullscreenDiscountVibrationExposureHeld = true;
                        i1n.INSTANCE.m133998b();
                    }
                    m53793F0(view, mqi0.m155944o());
                    return;
                }
            }
        }
        if (!this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = true;
            i1n.INSTANCE.m133998b();
        }
        this.affiliateDiscountCountdownManager.m109643j(jM30173F3, new Function1() { // from class: l.luo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53765f(this.f130077a, view, ((Long) obj).longValue());
            }
        }, iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m53798O0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("promo_pop_source", m4p.m153081g(this.from));
            jSONObject.put("promo_type", m4p.m153082h(CoreModule.f17545c.f19696x0.m30171E3()));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m53799P0() {
        m53811e0();
        this.affiliateDiscountCountdownManager.m109644k();
        if (this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = false;
            i1n.INSTANCE.m134003g();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m53800Q0(List<? extends C8765d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        qib0.m174815e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: U */
    public final void m53801U(View view) {
        jvo.m143532a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m53802V(TextView textView, String segment, int digitColor) {
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
    public final void m53803W(C8765d.a detail, Merchandise ref) {
        Prices prices;
        StockKeepUnit stockKeepUnit = ref.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        detail.m53566V(numberInstance.format(prices.unitPrice));
        detail.m53565U(m53814i0(ref));
    }

    /* JADX INFO: renamed from: X */
    public final void m53804X(SimpleDraweeView art, String imgUrl) {
        if (art == null) {
            return;
        }
        if (imgUrl.length() <= 0) {
            if (art instanceof AutoVDraweeView) {
                ((AutoVDraweeView) art).m222884u();
            } else {
                art.setController(null);
            }
            art.setVisibility(8);
            return;
        }
        if (art instanceof AutoVDraweeView) {
            ((AutoVDraweeView) art).setImageUrl(imgUrl);
        } else {
            qib0.f154691G.m102325I0(art, imgUrl, t100.m186890d(300.0f), t100.m186890d(136.0f));
        }
        art.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final void m53805Y(C8765d section) {
        View view = this.discountHeroRoot;
        if (view == null) {
            return;
        }
        m53808b0(view);
        m53797N0();
    }

    /* JADX INFO: renamed from: Z */
    public final void m53806Z(View hero) {
        m53807a0(null, hero);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m53807a0(IapAffiliatePromotion promo, View hero) {
        TextView textView = (TextView) hero.findViewById(z4c0.f201470G);
        if (textView == null) {
            return;
        }
        textView.setText(App.f15369e.getString(m53820p0() ? R$string.f27659y2 : R$string.f27648x2, Integer.valueOf(m53816l0(promo != null ? promo.discount : null))));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m53808b0(View hero) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30184L3 = iapAffiliatePromotionM30171E3 != null ? CoreModule.f17545c.f19696x0.m30184L3(iapAffiliatePromotionM30171E3) : null;
        TextView textView = (TextView) hero.findViewById(z4c0.f201472H);
        TextView textView2 = (TextView) hero.findViewById(z4c0.f201478K);
        TextView textView3 = (TextView) hero.findViewById(z4c0.f201480L);
        TextView textView4 = (TextView) hero.findViewById(z4c0.f201470G);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) hero.findViewById(z4c0.f201476J);
        String string = (iapAffiliatePromotionDisplaySlotM30184L3 == null || (str5 = iapAffiliatePromotionDisplaySlotM30184L3.mainTitle) == null) ? null : StringsKt.m93433Z0(str5).toString();
        if (string == null) {
            string = "";
        }
        String string2 = (iapAffiliatePromotionDisplaySlotM30184L3 == null || (str4 = iapAffiliatePromotionDisplaySlotM30184L3.subtitle) == null) ? null : StringsKt.m93433Z0(str4).toString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = (iapAffiliatePromotionDisplaySlotM30184L3 == null || (str3 = iapAffiliatePromotionDisplaySlotM30184L3.titleLine1) == null) ? null : StringsKt.m93433Z0(str3).toString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = (iapAffiliatePromotionDisplaySlotM30184L3 == null || (str2 = iapAffiliatePromotionDisplaySlotM30184L3.titleLine2) == null) ? null : StringsKt.m93433Z0(str2).toString();
        if (string4 == null) {
            string4 = "";
        }
        String string5 = (iapAffiliatePromotionDisplaySlotM30184L3 == null || (str = iapAffiliatePromotionDisplaySlotM30184L3.countdownTopText) == null) ? null : StringsKt.m93433Z0(str).toString();
        if (string5 == null) {
            string5 = "";
        }
        boolean z = string.length() > 0 || string2.length() > 0 || string3.length() > 0 || string4.length() > 0;
        if (iapAffiliatePromotionDisplaySlotM30184L3 == null || !z) {
            if (textView != null) {
                textView.setText(App.f15369e.getString(R$string.f27440f3));
            }
            if (textView2 != null) {
                textView2.setText(App.f15369e.getString(R$string.f27670z2));
            }
            if (textView3 != null) {
                textView3.setText(App.f15369e.getString(R$string.f27637w2));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            m53806Z(hero);
            m53804X(simpleDraweeView, "");
            return;
        }
        if (string.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string);
            }
            m53809c0(textView2, string3);
            if (string2.length() == 0) {
                string2 = string4;
            }
            m53809c0(textView3, string2);
        } else if (string3.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string3);
            }
            m53809c0(textView2, string4);
            m53809c0(textView3, string2);
        } else {
            m53807a0(iapAffiliatePromotionM30171E3, hero);
            m53809c0(textView2, string4);
            m53809c0(textView3, string2);
        }
        if (string5.length() == 0) {
            if (textView != null) {
                textView.setText(App.f15369e.getString(R$string.f27440f3));
            }
        } else if (textView != null) {
            textView.setText(string5);
        }
        String str6 = iapAffiliatePromotionDisplaySlotM30184L3.imgUrl;
        String string6 = str6 != null ? StringsKt.m93433Z0(str6).toString() : null;
        m53804X(simpleDraweeView, string6 != null ? string6 : "");
    }

    /* JADX INFO: renamed from: c0 */
    public final void m53809c0(TextView textView, String text) {
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
    public final C22306c<Integer> m53810d0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            C22306c<Integer> c22306cJust = C22306c.just(0);
            c22306cJust.getClass();
            return c22306cJust;
        }
        if (CoreModule.f17545c.f19696x0.m30187O3() || CoreModule.f17545c.f19696x0.m30191W3()) {
            C22306c<Integer> c22306cJust2 = C22306c.just(0);
            c22306cJust2.getClass();
            return c22306cJust2;
        }
        C22306c<List<IapAffiliatePromotion>> c22306cTake = CoreModule.f17545c.f19696x0.m30224w4().take(1);
        final Function1 function1 = new Function1() { // from class: l.fuo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53784w((List) obj);
            }
        };
        C22306c<Integer> c22306cOnErrorResumeNext = c22306cTake.map(new w9j() { // from class: l.guo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53769i(function1, obj);
            }
        }).onErrorResumeNext((w9j<Throwable, ? extends C22306c<? extends R>>) new w9j() { // from class: l.huo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53770j((Throwable) obj);
            }
        });
        c22306cOnErrorResumeNext.getClass();
        return c22306cOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m53811e0() {
        Runnable runnable = this.serverEndWatchdogRunnable;
        if (runnable != null) {
            this.serverEndWatchdogHandler.removeCallbacks(runnable);
        }
        this.serverEndWatchdogRunnable = null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m53812f0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.f17545c.f19696x0.m30186N3() || (iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3()) == null || CoreModule.f17545c.f19696x0.m30195c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.f17545c.f19696x0.m30203l4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
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

    /* JADX INFO: renamed from: h0 */
    public final C8765d m53813h0(List<? extends C8765d> sections) {
        return (C8765d) vwb.m200346r(sections, new w9j() { // from class: l.nuo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53744I(this.f140643a, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final String m53814i0(Merchandise merchandise) {
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
    public final C22306c<List<Merchandise>> m53815j0() {
        final boolean z = CoreModule.f17545c.f19654j0.m30608T4() || CoreModule.f17545c.f19654j0.m30645z4();
        final boolean zM30186N3 = CoreModule.f17545c.f19696x0.m30186N3();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || (!z && !zM30186N3)) {
            C22306c<List<Merchandise>> c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
            return c22306cJust;
        }
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
        final Function1 function1 = new Function1() { // from class: l.ouo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53736A((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cFilter = c22306cM30644y5.filter(new w9j() { // from class: l.puo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53737B(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.quo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53779r(z, zM30186N3, (List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cOnErrorResumeNext = c22306cFilter.map(new w9j() { // from class: l.ruo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53783v(function2, obj);
            }
        }).onErrorResumeNext((w9j<Throwable, ? extends C22306c<? extends R>>) new w9j() { // from class: l.suo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53756Q((Throwable) obj);
            }
        });
        c22306cOnErrorResumeNext.getClass();
        return c22306cOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m53816l0(String raw) {
        String strM53824t0 = m53824t0(raw);
        Integer intOrNull = StringsKt.toIntOrNull(strM53824t0);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        Double dM93472m = C15385c.m93472m(strM53824t0);
        Integer numValueOf = dM93472m != null ? Integer.valueOf((int) dM93472m.doubleValue()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 51;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m53817m0(List<? extends C8765d> sections) {
        final NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        vwb.m200354z(sections, new e30() { // from class: l.muo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53748K(numberInstance, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m53818n0() {
        Act act = this.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        View viewInflate = act.inflater().inflate(m6c0.f131465C, (ViewGroup) get_privilege(), false);
        get_privilege().addView(viewInflate);
        this.discountHeroRoot = viewInflate;
        viewInflate.getClass();
        m53808b0(viewInflate);
        m53797N0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m53819o0() {
        if (this.affiliateCountdownReconcileSub != null) {
            return;
        }
        Act act = this.act;
        Act act2 = null;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        Act act3 = this.act;
        if (act3 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
        } else {
            act2 = act3;
        }
        C22306c<C4319c> c22306cLifecycle = act2.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.sto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53754O((C4319c) obj);
            }
        };
        C22306c<C4319c> c22306cFilter = c22306cLifecycle.filter(new w9j() { // from class: l.tto
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53758S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.uto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53759T((C4319c) obj);
            }
        };
        C22306c<R> map = c22306cFilter.map(new w9j() { // from class: l.vto
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53761b(function2, obj);
            }
        });
        C22306c<Boolean> c22306cM30210p4 = CoreModule.f17545c.f19696x0.m30210p4();
        final Function1 function3 = new Function1() { // from class: l.wto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53746J((Boolean) obj);
            }
        };
        this.affiliateCountdownReconcileSub = act.duringCreated(C22306c.merge(map, c22306cM30210p4.map(new w9j() { // from class: l.xto
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53774m(function3, obj);
            }
        }))).subscribe(mkd0.m154955G(new e30() { // from class: l.yto
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53786y(this.f200000a, (Unit) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53789B0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53801U(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m53820p0() {
        Locale locale = Locale.getDefault();
        return C15386d.m93490x(locale.getLanguage(), "zh", true) && C15386d.m93490x(locale.getCountry(), "TW", true);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m53821q0(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        FreeTrialData freeTrialDataM30576C4;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            str.getClass();
            if (CoreModule.f17545c.f19696x0.m30203l4(merchandise)) {
                return true;
            }
            if (!CoreModule.f17545c.f19654j0.m30608T4() || (freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4()) == null) {
                return false;
            }
            String str2 = freeTrialDataM30576C4.skuId;
            str2.getClass();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.m87488d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m53822r0(IapAffiliatePromotion promotion, final C8765d selected) {
        final C8765d.a aVarM53522d = selected.m53522d();
        if (aVarM53522d == null && (aVarM53522d = selected.m53520b()) == null) {
            return;
        }
        C22306c<List<Merchandise>> c22306cM191425b = u1n.m191425b(promotion);
        final Function1 function1 = new Function1() { // from class: l.xuo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53781t((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cTake = c22306cM191425b.filter(new w9j() { // from class: l.yuo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53762c(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.zuo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53778q(this.f204869a, (List) obj);
            }
        };
        C22306c c22306cCompose = c22306cTake.flatMap(new w9j() { // from class: l.avo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53775n(function2, obj);
            }
        }).compose(mkd0.m154951C());
        c22306cCompose.getClass();
        Act act = this.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        this.affiliateOriginalPriceSubscription = act.duringCreated(c22306cCompose).subscribe(mkd0.m154956H(new e30() { // from class: l.bvo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53764e(this.f77482a, aVarM53522d, selected, (List) obj);
            }
        }, new e30() { // from class: l.cvo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m53757R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m53823s0(final C8765d selected) {
        final IapAffiliatePromotion iapAffiliatePromotionM30171E3;
        Merchandise merchandiseM53601s;
        AffiliateProducts affiliateProducts;
        String str;
        c4g0 c4g0Var = this.affiliateOriginalPriceSubscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        Act act = null;
        this.affiliateOriginalPriceSubscription = null;
        if (CoreModule.f17545c.f19696x0.m30186N3() && (iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3()) != null) {
            final C8765d.a aVarM53522d = selected.m53522d();
            if ((aVarM53522d == null && (aVarM53522d = selected.m53520b()) == null) || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
                return;
            }
            String str2 = iapAffiliatePromotionM30171E3.offerId;
            String string = str2 != null ? StringsKt.m93433Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                StockKeepUnit stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit;
                String string2 = (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) ? null : StringsKt.m93433Z0(str).toString();
                String str3 = string2 != null ? string2 : "";
                String strM30161l3 = CoreIntlAffiliatePromotions.m30161l3(str3, iapAffiliatePromotionM30171E3.offerId);
                strM30161l3.getClass();
                if (strM30161l3.length() > 0 && !Intrinsics.m87488d(strM30161l3, str3)) {
                    Merchandise merchandiseMo223809clone = merchandiseM53601s.mo223809clone();
                    merchandiseMo223809clone.getClass();
                    StockKeepUnit stockKeepUnit2 = merchandiseMo223809clone.defaultStockKeepUnit;
                    stockKeepUnit2.getClass();
                    stockKeepUnit2.affiliateProducts.googleplay = strM30161l3;
                    Act act2 = this.act;
                    if (act2 == null) {
                        Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                        act2 = null;
                    }
                    Act act3 = this.act;
                    if (act3 == null) {
                        Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                    } else {
                        act = act3;
                    }
                    this.affiliateOriginalPriceSubscription = act2.duringCreated(igj.m136009M(act, CollectionsKt.listOf(merchandiseMo223809clone))).subscribe(mkd0.m154956H(new e30() { // from class: l.tuo
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m53743H(this.f172203a, iapAffiliatePromotionM30171E3, selected, aVarM53522d, (List) obj);
                        }
                    }, new e30() { // from class: l.uuo
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m53780s(this.f178407a, iapAffiliatePromotionM30171E3, selected, (Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            m53822r0(iapAffiliatePromotionM30171E3, selected);
        }
    }

    public final void setAutoPay(boolean autoPay) {
        this.shouldAutoPay = autoPay;
    }

    public final void setDialogStateAction(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setFallbackToStandardPremiumFullscreen(@Nullable d30 fallback) {
        this.fallbackToStandardPremiumFullscreen = fallback;
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
    public final String m53824t0(String raw) {
        if (raw == null || StringsKt.m93438e0(raw)) {
            return "51";
        }
        String string = StringsKt.m93433Z0(StringsKt.m93458y0(StringsKt.m93433Z0(raw).toString(), "%")).toString();
        return string.length() == 0 ? "51" : string;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m53825u0() {
        if (this.isDialogPageShow) {
            i0e.m133796e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m53826v0() {
        if (this.isDialogPageShow) {
            return;
        }
        this.isDialogPageShow = true;
        m53798O0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m53827w0(ProductCategory category, List<? extends Merchandise> merchandises) {
        d30 d30Var;
        d30 d30Var2;
        boolean zM81303a = NullChecker.m81303a(vwb.m200346r(merchandises, new w9j() { // from class: l.iuo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m53738C((Merchandise) obj);
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
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType3 == purchaseType4 && vwb.m200296J(listMo107333a) && (d30Var2 = this.fallbackToStandardPremiumFullscreen) != null) {
            if (d30Var2 != null) {
                d30Var2.call();
                return;
            }
            return;
        }
        m53817m0(listMo107333a);
        C8765d c8765dM53813h0 = m53813h0(listMo107333a);
        if (c8765dM53813h0 == null) {
            c8765dM53813h0 = (C8765d) vwb.m200346r(listMo107333a, new w9j() { // from class: l.juo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPremiumDiscountPurchaseContentView.m53787z((C8765d) obj);
                }
            });
        }
        if (c8765dM53813h0 != null) {
            get_payment_view().setVisibility(0);
            vwb.m200354z(listMo107333a, new e30() { // from class: l.kuo
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlPremiumDiscountPurchaseContentView.m53763d((C8765d) obj);
                }
            });
            c8765dM53813h0.m53540v(true);
            m53805Y(c8765dM53813h0);
            this.currentSelectPurchaseSectionAction.call(c8765dM53813h0);
            m53823s0(c8765dM53813h0);
        } else {
            get_payment_view().setVisibility(8);
            dgn dgnVar2 = this.paymentComponent;
            if (dgnVar2 != null) {
                dgnVar2.mo111147b(null);
            }
            get_payment_view().m53930j(null);
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.m87502r("purchaseType");
            } else {
                purchaseType = purchaseType5;
            }
            if (purchaseType == purchaseType4 && (d30Var = this.fallbackToStandardPremiumFullscreen) != null && d30Var != null) {
                d30Var.call();
            }
        }
        m53800Q0(listMo107333a);
    }

    /* JADX INFO: renamed from: x0 */
    public final Triple<String, String, String> m53828x0(String raw) {
        if (raw == null || raw.length() == 0) {
            return new Triple<>("00", "00", "00");
        }
        List listSplit$default = StringsKt.split$default(raw, new String[]{":"}, false, 0, 6, null);
        return listSplit$default.size() >= 3 ? new Triple<>(listSplit$default.get(0), listSplit$default.get(1), listSplit$default.get(2)) : new Triple<>("00", "00", "00");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m53829y0() {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.m81303a(this.paymentComponent) || (dgnVar = this.paymentComponent) == null || (onClickListener = dgnVar.f86137k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m53830z0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
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
