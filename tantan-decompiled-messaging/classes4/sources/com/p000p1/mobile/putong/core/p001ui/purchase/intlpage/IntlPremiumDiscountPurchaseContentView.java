package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.AffiliateProducts;
import com.p1.mobile.putong.core.data.FreeTrialData;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.b1c0;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.g30;
import l.hab0;
import l.hce;
import l.i0e;
import l.igj;
import l.jo0;
import l.jvo;
import l.m6c0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.rwl;
import l.rxa0;
import l.t100;
import l.u1n;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.z4c0;
import l.zck0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.d1n;
import p002l.dgn;
import p002l.i1n;
import p002l.m4p;
import rx.c;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 í\u00012\u00020\u0001:\u0002\u0094\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010&0\u001dH\u0002¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\"H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\b?\u0010%J\u000f\u0010@\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u000eJ\u000f\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010\u000eJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\fJ!\u0010G\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020<H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010\fJ!\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u0001022\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ!\u0010P\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010O\u001a\u00020<H\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020<2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bW\u0010\u000eJ\u0019\u0010Y\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u000eJ\u001f\u0010^\u001a\u00020\n2\u0006\u0010B\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J+\u0010a\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0`2\b\u0010R\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\ba\u0010bJ'\u0010e\u001a\u00020\n2\u0006\u0010N\u001a\u00020M2\u0006\u0010c\u001a\u00020<2\u0006\u0010d\u001a\u00020\u001eH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\nH\u0002¢\u0006\u0004\bg\u0010\u000eJ\u001f\u0010h\u001a\u0004\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0&H\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020j2\b\u0010;\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020,H\u0002¢\u0006\u0004\bn\u00101J\u000f\u0010o\u001a\u00020jH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\nH\u0014¢\u0006\u0004\bq\u0010\u000eJ9\u0010t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010r\u001a\u0004\u0018\u00010<2\u0006\u0010s\u001a\u00020j¢\u0006\u0004\bt\u0010uJ\u001d\u0010x\u001a\u00020\n2\u000e\u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v¢\u0006\u0004\bx\u0010yJ+\u0010|\u001a\u00020\n2\u001c\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z¢\u0006\u0004\b|\u0010}J)\u0010\u007f\u001a\u00020\n2\u001a\u0010~\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z¢\u0006\u0004\b\u007f\u0010}J\u001c\u0010\u0082\u0001\u001a\u00020\n2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020j¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020\n¢\u0006\u0005\b\u008b\u0001\u0010\u000eJ\u000f\u0010\u008c\u0001\u001a\u00020\n¢\u0006\u0005\b\u008c\u0001\u0010\u000eJ\u000f\u0010\u008d\u0001\u001a\u00020\n¢\u0006\u0005\b\u008d\u0001\u0010\u000eJ\u0011\u0010\u008e\u0001\u001a\u00020\nH\u0014¢\u0006\u0005\b\u008e\u0001\u0010\u000eJ\u000f\u0010\u008f\u0001\u001a\u00020\n¢\u0006\u0005\b\u008f\u0001\u0010\u000eJ\u0010\u0010\u0090\u0001\u001a\u00020\u0012¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020\n¢\u0006\u0005\b\u0092\u0001\u0010\u000eR*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010¡\u0001\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010r\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R \u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R.\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R-\u0010º\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\"\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020,0!8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010IR\u0018\u0010Æ\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u0010IR\u0017\u0010Ç\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010IR\u0018\u0010É\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010IR\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ò\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010IR\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Õ\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Õ\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001d\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020,0v8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010¶\u0001¨\u0006î\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "U", "(Landroid/view/View;)V", "o0", "()V", "A0", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "G0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "D0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "E0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "H0", "Lrx/c;", "", "d0", "()Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "f0", "(Ljava/util/List;)V", "", "j0", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "w0", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "m0", "selected", "s0", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "promotion", "r0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "ref", "W", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "merchandise", "", "i0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "Q0", "O0", "n0", "hero", "b0", "Lcom/facebook/drawee/view/SimpleDraweeView;", "art", "imgUrl", "X", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V", "Z", "promo", "a0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "text", "c0", "(Landroid/widget/TextView;Ljava/lang/String;)V", "raw", "l0", "(Ljava/lang/String;)I", "t0", "(Ljava/lang/String;)Ljava/lang/String;", "N0", "p", "M0", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "e0", "", "endMs", "F0", "(Landroid/view/View;J)V", "Lkotlin/Triple;", "x0", "(Ljava/lang/String;)Lkotlin/Triple;", "segment", "digitColor", "V", "(Landroid/widget/TextView;Ljava/lang/String;I)V", "P0", "h0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", "q0", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "section", "Y", "p0", "()Z", "onFinishInflate", "from", "multiPages", "z0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;Z)V", "Ll/e30;", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "Ll/g30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "Ll/d30;", "fallback", "setFallbackToStandardPremiumFullscreen", "(Ll/d30;)V", "autoPay", "setAutoPay", "(Z)V", "Ll/hab0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/hab0;)V", "C0", "v0", "u0", "onDetachedFromWindow", "B0", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "y0", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_privilege", "()Landroid/widget/LinearLayout;", "set_privilege", "(Landroid/widget/LinearLayout;)V", "_privilege", "b", "Landroid/widget/FrameLayout;", "get_introduce", "()Landroid/widget/FrameLayout;", "set_introduce", "(Landroid/widget/FrameLayout;)V", "_introduce", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "get_payment_view", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "set_payment_view", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;)V", "_payment_view", "d", "Lcom/p1/mobile/android/app/Act;", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "Ljava/lang/String;", "g", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivilege", "h", "Ll/hab0;", "i", "Ll/e30;", "j", "Ll/g30;", "k", "onPaymentFailedAction", "l", "Ll/d30;", "fallbackToStandardPremiumFullscreen", "m", "Ljava/util/List;", "getPurchaseSections", "()Ljava/util/List;", "purchaseSections", "n", "isDialogPageShow", "o", "shouldAutoPay", "autoPayTriggered", "q", "isPromotion", "r", "Landroid/view/View;", "discountHeroRoot", "Ll/d1n;", "s", "Ll/d1n;", "affiliateDiscountCountdownManager", "t", "fullscreenDiscountVibrationExposureHeld", "Ll/c4g0;", "u", "Ll/c4g0;", "affiliateCountdownReconcileSub", "Landroid/os/Handler;", "v", "Landroid/os/Handler;", "serverEndWatchdogHandler", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "serverEndWatchdogRunnable", "x", "subscription", "y", "affiliateOriginalPriceSubscription", "Ll/cwf0;", "z", "Ll/cwf0;", "statisticsPageHelper", "Ll/dgn;", "A", "Ll/dgn;", "paymentComponent", "B", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPremiumDiscountPurchaseContentView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public dgn paymentComponent;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final e30<C0190d> currentSelectPurchaseSectionAction;

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
    public final List<C0190d> purchaseSections;

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
        cwf0 cwf0VarC = i0e.c("p_intl_promo_full_view", IntlPremiumDiscountPurchaseContentView.class.getName());
        cwf0VarC.getClass();
        this.statisticsPageHelper = cwf0VarC;
        this.currentSelectPurchaseSectionAction = new e30() { // from class: l.pto
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4342o(this.f17645a, (C0190d) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m4302A(List list) {
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m4303B(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m4304C(Merchandise merchandise) {
        return Boolean.valueOf(rxa0.n(merchandise));
    }

    /* JADX INFO: renamed from: E */
    public static void m4306E(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, long j) {
        intlPremiumDiscountPurchaseContentView.serverEndWatchdogRunnable = null;
        CoreModule.c.x0.q3(j);
    }

    /* JADX INFO: renamed from: F */
    public static c m4307F(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m4308G(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: H */
    public static void m4309H(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C0190d c0190d, C0190d.a aVar, List list) {
        list.getClass();
        if (vwb.J(list)) {
            intlPremiumDiscountPurchaseContentView.m4388r0(iapAffiliatePromotion, c0190d);
            return;
        }
        intlPremiumDiscountPurchaseContentView.m4369W(aVar, (Merchandise) list.get(0));
        if (c0190d.m4096l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c0190d);
        }
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m4310I(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C0190d c0190d) {
        c0190d.getClass();
        return Boolean.valueOf(intlPremiumDiscountPurchaseContentView.m4387q0(c0190d.m4087c()));
    }

    /* JADX INFO: renamed from: I0 */
    public static final List m4311I0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m4312J(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final List m4313J0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX INFO: renamed from: K */
    public static void m4314K(NumberFormat numberFormat, C0190d c0190d) {
        Merchandise merchandiseM4167s;
        StockKeepUnit stockKeepUnit;
        Prices prices;
        C0190d.a aVarM4088d = c0190d.m4088d();
        if ((aVarM4088d == null && (aVarM4088d = c0190d.m4086b()) == null) || (merchandiseM4167s = aVarM4088d.m4167s()) == null || (stockKeepUnit = merchandiseM4167s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        String strM4149h = aVarM4088d.m4149h();
        if (strM4149h == null) {
            strM4149h = prices.currencySymbol;
            if (strM4149h == null) {
                strM4149h = "";
            }
        } else {
            if (strM4149h.length() <= 0) {
                strM4149h = null;
            }
            if (strM4149h == null) {
                strM4149h = prices.currencySymbol;
                if (strM4149h == null) {
                    strM4149h = "";
                }
            }
        }
        double d = prices.originalPrice;
        if (d > 0.0d) {
            aVarM4088d.m4131U(strM4149h + numberFormat.format(d));
            return;
        }
        if (prices.originalUnitPrice <= 0.0d || aVarM4088d.m4171w() <= 0) {
            return;
        }
        aVarM4088d.m4131U(strM4149h + numberFormat.format(prices.originalUnitPrice * ((double) aVarM4088d.m4171w())));
    }

    /* JADX INFO: renamed from: K0 */
    public static final List m4315K0(List list, List list2) {
        list.getClass();
        List mutableList = CollectionsKt.toMutableList(list);
        if (!vwb.J(list2)) {
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
    public static final List m4317L0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m4318M(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, ProductCategory productCategory, List list) {
        intlPremiumDiscountPurchaseContentView.m4393w0(productCategory, list);
    }

    /* JADX INFO: renamed from: N */
    public static c m4319N(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        list.getClass();
        intlPremiumDiscountPurchaseContentView.m4378f0(list);
        Context context = intlPremiumDiscountPurchaseContentView.act;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        return igj.M(context, list);
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m4320O(com.p1.mobile.android.app.c cVar) {
        return Boolean.valueOf(cVar == com.p1.mobile.android.app.c.i);
    }

    /* JADX INFO: renamed from: P */
    public static c m4321P(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static c m4322Q(Throwable th) {
        return c.just((Object) null);
    }

    /* JADX INFO: renamed from: R */
    public static void m4323R(Throwable th) {
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m4324S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Unit m4325T(com.p1.mobile.android.app.c cVar) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m4326a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m4327b(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m4328c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m4329d(C0190d c0190d) {
        c0190d.m4106v(false);
    }

    /* JADX INFO: renamed from: e */
    public static void m4330e(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C0190d.a aVar, C0190d c0190d, List list) {
        list.getClass();
        if (vwb.J(list)) {
            return;
        }
        intlPremiumDiscountPurchaseContentView.m4369W(aVar, (Merchandise) list.get(0));
        if (c0190d.m4096l()) {
            intlPremiumDiscountPurchaseContentView.currentSelectPurchaseSectionAction.call(c0190d);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m4331f(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view, long j) {
        intlPremiumDiscountPurchaseContentView.m4359F0(view, mqi0.o() + a.c(j, 0L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m4333g0(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView) {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.a(intlPremiumDiscountPurchaseContentView.paymentComponent) || (dgnVar = intlPremiumDiscountPurchaseContentView.paymentComponent) == null || (onClickListener = dgnVar.f9241k0) == null) {
            return;
        }
        onClickListener.onClick(intlPremiumDiscountPurchaseContentView);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m4335i(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static c m4336j(Throwable th) {
        return c.just(0);
    }

    /* JADX INFO: renamed from: k */
    public static c m4337k(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m4338k0(boolean z, boolean z2, List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null) {
            return;
        }
        String str = affiliateProducts.googleplay;
        str.getClass();
        boolean z3 = false;
        boolean z4 = z && CoreModule.c.j0.C4() != null && Intrinsics.d(CoreModule.c.j0.C4().skuId, str);
        if (z2 && CoreModule.c.x0.l4(merchandise)) {
            z3 = true;
        }
        if (z4 || z3) {
            list.add(merchandise);
        }
    }

    /* JADX INFO: renamed from: l */
    public static c m4339l(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, final List list) {
        c<List<Merchandise>> cVarM4381j0 = intlPremiumDiscountPurchaseContentView.m4381j0();
        final Function1 function1 = new Function1() { // from class: l.duo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4315K0(list, (List) obj);
            }
        };
        return cVarM4381j0.map(new w9j() { // from class: l.euo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4317L0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static Unit m4340m(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static c m4341n(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m4342o(final IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, C0190d c0190d) {
        dgn dgnVar;
        if (c0190d != null) {
            c0190d.f2351k = true;
        }
        if (NullChecker.a(intlPremiumDiscountPurchaseContentView.paymentComponent) && (dgnVar = intlPremiumDiscountPurchaseContentView.paymentComponent) != null) {
            dgnVar.m11852b(c0190d);
        }
        if (intlPremiumDiscountPurchaseContentView.get_payment_view() != null) {
            intlPremiumDiscountPurchaseContentView.get_payment_view().m4496j(c0190d);
        }
        if (intlPremiumDiscountPurchaseContentView.shouldAutoPay && !intlPremiumDiscountPurchaseContentView.autoPayTriggered && NullChecker.a(c0190d)) {
            intlPremiumDiscountPurchaseContentView.autoPayTriggered = true;
            Context context = intlPremiumDiscountPurchaseContentView.act;
            if (context == null) {
                Intrinsics.r("act");
                context = null;
            }
            e51.H(context, new Runnable() { // from class: l.auo
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m4333g0(this.f7891a);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: q */
    public static c m4344q(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, List list) {
        Context context = intlPremiumDiscountPurchaseContentView.act;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        return igj.M(context, CollectionsKt.listOf(list.get(0)));
    }

    /* JADX INFO: renamed from: r */
    public static List m4345r(final boolean z, final boolean z2, List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.vuo
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4338k0(z, z2, arrayList, (Merchandise) obj);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static void m4346s(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, IapAffiliatePromotion iapAffiliatePromotion, C0190d c0190d, Throwable th) {
        intlPremiumDiscountPurchaseContentView.m4388r0(iapAffiliatePromotion, c0190d);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m4347t(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: v */
    public static List m4349v(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static Integer m4350w(List list) {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static c m4351x(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Integer num) {
        c cVarY5 = CoreModule.c.j0.y5(intlPremiumDiscountPurchaseContentView.getPurchaseType().productCategory());
        final Function1 function1 = new Function1() { // from class: l.buo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4311I0((List) obj);
            }
        };
        return cVarY5.map(new w9j() { // from class: l.cuo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4313J0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m4352y(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, Unit unit) {
        intlPremiumDiscountPurchaseContentView.m4354A0();
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m4353z(C0190d c0190d) {
        return Boolean.valueOf(c0190d.m4096l());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m4354A0() {
        if (CoreModule.c.x0.N3()) {
            m4365P0();
            m4363N0();
        } else {
            d30 d30Var = this.fallbackToStandardPremiumFullscreen;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m4355B0() {
        dgn dgnVar;
        c4g0 c4g0Var = this.affiliateCountdownReconcileSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.affiliateCountdownReconcileSub = null;
        m4365P0();
        if (NullChecker.a(this.paymentComponent) && (dgnVar = this.paymentComponent) != null) {
            dgnVar.release();
        }
        if (NullChecker.a(this.subscription)) {
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
        get_payment_view().m4497k();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m4356C0() {
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
        m4360G0(act, purchaseType2, this.primaryPrivilege);
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        m4358E0(purchaseType3);
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
        m4357D0(act2, purchaseType);
        m4361H0();
        m4385o0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m4357D0(Act act, PurchaseType purchaseType) {
        View viewInflate = act.inflater().inflate(m6c0.B, (ViewGroup) get_introduce(), false);
        viewInflate.getClass();
        IntlPremiumDiscountExclusivePrivilegeView intlPremiumDiscountExclusivePrivilegeView = (IntlPremiumDiscountExclusivePrivilegeView) viewInflate;
        intlPremiumDiscountExclusivePrivilegeView.m4291f(purchaseType);
        get_introduce().addView(intlPremiumDiscountExclusivePrivilegeView);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m4358E0(PurchaseType purchaseType) {
        get_payment_view().m4495h(purchaseType, this.from, true);
        get_payment_view().setDialogStateAction(this.dialogStateAction);
        get_payment_view().setOnPaymentSuccess(this.onPaymentSuccess);
        get_payment_view().setOnPaymentFailed(this.onPaymentFailedAction);
        get_payment_view().m4499m();
        this.paymentComponent = get_payment_view().getPaymentComponent();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m4359F0(View hero, long endMs) {
        TextView textView;
        TextView textView2;
        TextView textView3 = (TextView) hero.findViewById(z4c0.D);
        if (textView3 == null || (textView = (TextView) hero.findViewById(z4c0.E)) == null || (textView2 = (TextView) hero.findViewById(z4c0.F)) == null) {
            return;
        }
        ImageView imageView = (ImageView) hero.findViewById(z4c0.B);
        ImageView imageView2 = (ImageView) hero.findViewById(z4c0.C);
        long jC = a.c(endMs - mqi0.o(), 0L);
        if (jC <= 0) {
            int color = App.e.getColor(b1c0.m);
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
        Triple<String, String, String> tripleM4394x0 = m4394x0(zck0.a(endMs, true, true, true, true));
        String str = (String) tripleM4394x0.component1();
        String str2 = (String) tripleM4394x0.component2();
        String str3 = (String) tripleM4394x0.component3();
        if (jC < 60000) {
            int color2 = App.e.getColor(b1c0.E);
            int color3 = App.e.getColor(b1c0.F);
            m4368V(textView3, str, color2);
            m4368V(textView, str2, color2);
            m4368V(textView2, str3, color2);
            if (imageView != null) {
                imageView.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
            }
            if (imageView2 != null) {
                imageView2.setColorFilter(color3, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        int color4 = App.e.getColor(b1c0.m);
        textView3.setTextColor(color4);
        textView.setTextColor(color4);
        textView2.setTextColor(color4);
        textView3.setText(str);
        textView.setText(str2);
        textView2.setText(str3);
        if (imageView != null) {
            imageView.clearColorFilter();
        }
        if (imageView2 != null) {
            imageView2.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m4360G0(Act act, PurchaseType purchaseType, Privilege privilege) {
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        if (privilege == null || privilege == Privilege.vip_badge || privilege == Privilege.svip_badge || privilege == Privilege.ultra_premium_badge) {
            xdl0.X(get_privilege(), 0);
            xdl0.X(get_introduce(), 0);
        } else {
            xdl0.X(get_privilege(), t100.m);
            xdl0.X(get_introduce(), 0);
        }
        m4384n0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m4361H0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        final ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        c<Integer> cVarM4376d0 = m4376d0();
        final Function1 function1 = new Function1() { // from class: l.wuo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4351x(this.f21995a, (Integer) obj);
            }
        };
        c cVarTake = cVarM4376d0.flatMap(new w9j() { // from class: l.dvo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4337k(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.evo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4308G((List) obj);
            }
        };
        c cVarFilter = cVarTake.filter(new w9j() { // from class: l.fvo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4326a(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.gvo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4339l(this.f11642a, (List) obj);
            }
        };
        c cVarFlatMap = cVarFilter.flatMap(new w9j() { // from class: l.hvo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4321P(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.ivo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4319N(this.f13439a, (List) obj);
            }
        };
        this.subscription = cVarFlatMap.flatMap(new w9j() { // from class: l.qto
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4307F(function4, obj);
            }
        }).take(1).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.rto
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4318M(this.f18678a, productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m4362M0(IapAffiliatePromotion p) {
        m4377e0();
        if (p != null) {
            long j = p.endTime;
            if (j <= 0) {
                return;
            }
            final long j2 = p.promotionHitId;
            long jC = a.c(((j + 1) * 1000) - mqi0.o(), 0L);
            Runnable runnable = new Runnable() { // from class: l.zto
                @Override // java.lang.Runnable
                public final void run() {
                    IntlPremiumDiscountPurchaseContentView.m4306E(this.f23586a, j2);
                }
            };
            this.serverEndWatchdogRunnable = runnable;
            this.serverEndWatchdogHandler.postDelayed(runnable, jC);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m4363N0() {
        long jF3;
        m4365P0();
        final View view = this.discountHeroRoot;
        if (view == null || view.findViewById(z4c0.D) == null) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        m4362M0(iapAffiliatePromotionE3);
        if (iapAffiliatePromotionE3 != null) {
            jF3 = CoreModule.c.x0.F3(iapAffiliatePromotionE3);
        } else {
            FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
            if (freeTrialDataC4 == null) {
                return;
            } else {
                jF3 = freeTrialDataC4.endTime * 1000;
            }
        }
        if (jF3 <= 0) {
            m4359F0(view, mqi0.o());
            return;
        }
        m4359F0(view, jF3);
        boolean z = iapAffiliatePromotionE3 != null && CoreModule.c.x0.G4(iapAffiliatePromotionE3);
        IapAffiliatePromotion iapAffiliatePromotion = null;
        if (iapAffiliatePromotionE3 != null && z) {
            iapAffiliatePromotion = iapAffiliatePromotionE3;
        }
        if (z && iapAffiliatePromotionE3 != null) {
            long jX4 = CoreModule.c.x0.x4();
            Long l2 = (Long) CoreModule.c.x0.c0.get();
            boolean zF4 = CoreModule.c.x0.f4(iapAffiliatePromotionE3);
            if (jX4 == 0) {
                long j = iapAffiliatePromotionE3.promotionHitId;
                if (l2 != null && l2.longValue() == j && zF4) {
                    if (!this.fullscreenDiscountVibrationExposureHeld) {
                        this.fullscreenDiscountVibrationExposureHeld = true;
                        i1n.INSTANCE.m14978b();
                    }
                    m4359F0(view, mqi0.o());
                    return;
                }
            }
        }
        if (!this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = true;
            i1n.INSTANCE.m14978b();
        }
        this.affiliateDiscountCountdownManager.m11595j(jF3, new Function1() { // from class: l.luo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4331f(this.f15075a, view, ((Long) obj).longValue());
            }
        }, iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m4364O0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("promo_pop_source", m4p.m17709g(this.from));
            jSONObject.put("promo_type", m4p.m17710h(CoreModule.c.x0.E3()));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m4365P0() {
        m4377e0();
        this.affiliateDiscountCountdownManager.m11596k();
        if (this.fullscreenDiscountVibrationExposureHeld) {
            this.fullscreenDiscountVibrationExposureHeld = false;
            i1n.INSTANCE.m14983g();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m4366Q0(List<? extends C0190d> sections) {
        this.purchaseSections.clear();
        this.purchaseSections.addAll(sections);
        qib0.e1("purchase_page_shown", new Object[]{"platform", "android"});
    }

    /* JADX INFO: renamed from: U */
    public final void m4367U(View view) {
        jvo.a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m4368V(TextView textView, String segment, int digitColor) {
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
    public final void m4369W(C0190d.a detail, Merchandise ref) {
        Prices prices;
        StockKeepUnit stockKeepUnit = ref.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        detail.m4132V(numberInstance.format(prices.unitPrice));
        detail.m4131U(m4380i0(ref));
    }

    /* JADX INFO: renamed from: X */
    public final void m4370X(SimpleDraweeView art, String imgUrl) {
        if (art == null) {
            return;
        }
        if (imgUrl.length() <= 0) {
            if (art instanceof AutoVDraweeView) {
                ((AutoVDraweeView) art).u();
            } else {
                art.setController((hce) null);
            }
            art.setVisibility(8);
            return;
        }
        if (art instanceof AutoVDraweeView) {
            ((AutoVDraweeView) art).setImageUrl(imgUrl);
        } else {
            qib0.G.I0(art, imgUrl, t100.d(300.0f), t100.d(136.0f));
        }
        art.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final void m4371Y(C0190d section) {
        View view = this.discountHeroRoot;
        if (view == null) {
            return;
        }
        m4374b0(view);
        m4363N0();
    }

    /* JADX INFO: renamed from: Z */
    public final void m4372Z(View hero) {
        m4373a0(null, hero);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4373a0(IapAffiliatePromotion promo, View hero) {
        TextView textView = (TextView) hero.findViewById(z4c0.G);
        if (textView == null) {
            return;
        }
        textView.setText(App.e.getString(m4386p0() ? R.string.y2 : R.string.x2, Integer.valueOf(m4382l0(promo != null ? promo.discount : null))));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4374b0(View hero) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotL3 = iapAffiliatePromotionE3 != null ? CoreModule.c.x0.L3(iapAffiliatePromotionE3) : null;
        TextView textView = (TextView) hero.findViewById(z4c0.H);
        TextView textView2 = (TextView) hero.findViewById(z4c0.K);
        TextView textView3 = (TextView) hero.findViewById(z4c0.L);
        TextView textView4 = (TextView) hero.findViewById(z4c0.G);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) hero.findViewById(z4c0.J);
        String string = (iapAffiliatePromotionDisplaySlotL3 == null || (str5 = iapAffiliatePromotionDisplaySlotL3.mainTitle) == null) ? null : StringsKt.Z0(str5).toString();
        if (string == null) {
            string = "";
        }
        String string2 = (iapAffiliatePromotionDisplaySlotL3 == null || (str4 = iapAffiliatePromotionDisplaySlotL3.subtitle) == null) ? null : StringsKt.Z0(str4).toString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = (iapAffiliatePromotionDisplaySlotL3 == null || (str3 = iapAffiliatePromotionDisplaySlotL3.titleLine1) == null) ? null : StringsKt.Z0(str3).toString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = (iapAffiliatePromotionDisplaySlotL3 == null || (str2 = iapAffiliatePromotionDisplaySlotL3.titleLine2) == null) ? null : StringsKt.Z0(str2).toString();
        if (string4 == null) {
            string4 = "";
        }
        String string5 = (iapAffiliatePromotionDisplaySlotL3 == null || (str = iapAffiliatePromotionDisplaySlotL3.countdownTopText) == null) ? null : StringsKt.Z0(str).toString();
        if (string5 == null) {
            string5 = "";
        }
        boolean z = string.length() > 0 || string2.length() > 0 || string3.length() > 0 || string4.length() > 0;
        if (iapAffiliatePromotionDisplaySlotL3 == null || !z) {
            if (textView != null) {
                textView.setText(App.e.getString(R.string.f3));
            }
            if (textView2 != null) {
                textView2.setText(App.e.getString(R.string.z2));
            }
            if (textView3 != null) {
                textView3.setText(App.e.getString(R.string.w2));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            m4372Z(hero);
            m4370X(simpleDraweeView, "");
            return;
        }
        if (string.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string);
            }
            m4375c0(textView2, string3);
            if (string2.length() == 0) {
                string2 = string4;
            }
            m4375c0(textView3, string2);
        } else if (string3.length() > 0) {
            if (textView4 != null) {
                textView4.setText(string3);
            }
            m4375c0(textView2, string4);
            m4375c0(textView3, string2);
        } else {
            m4373a0(iapAffiliatePromotionE3, hero);
            m4375c0(textView2, string4);
            m4375c0(textView3, string2);
        }
        if (string5.length() == 0) {
            if (textView != null) {
                textView.setText(App.e.getString(R.string.f3));
            }
        } else if (textView != null) {
            textView.setText(string5);
        }
        String str6 = iapAffiliatePromotionDisplaySlotL3.imgUrl;
        String string6 = str6 != null ? StringsKt.Z0(str6).toString() : null;
        m4370X(simpleDraweeView, string6 != null ? string6 : "");
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4375c0(TextView textView, String text) {
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
    public final c<Integer> m4376d0() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            c<Integer> cVarJust = c.just(0);
            cVarJust.getClass();
            return cVarJust;
        }
        if (CoreModule.c.x0.O3() || CoreModule.c.x0.W3()) {
            c<Integer> cVarJust2 = c.just(0);
            cVarJust2.getClass();
            return cVarJust2;
        }
        c cVarTake = CoreModule.c.x0.w4().take(1);
        final Function1 function1 = new Function1() { // from class: l.fuo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4350w((List) obj);
            }
        };
        c<Integer> cVarOnErrorResumeNext = cVarTake.map(new w9j() { // from class: l.guo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4335i(function1, obj);
            }
        }).onErrorResumeNext(new w9j() { // from class: l.huo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4336j((Throwable) obj);
            }
        });
        cVarOnErrorResumeNext.getClass();
        return cVarOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4377e0() {
        Runnable runnable = this.serverEndWatchdogRunnable;
        if (runnable != null) {
            this.serverEndWatchdogHandler.removeCallbacks(runnable);
        }
        this.serverEndWatchdogRunnable = null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4378f0(List<Merchandise> merchandises) {
        IapAffiliatePromotion iapAffiliatePromotionE3;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (!CoreModule.c.x0.N3() || (iapAffiliatePromotionE3 = CoreModule.c.x0.E3()) == null || CoreModule.c.x0.c4()) {
            return;
        }
        int size = merchandises.size();
        for (int i = 0; i < size; i++) {
            Merchandise merchandise = merchandises.get(i);
            if (CoreModule.c.x0.l4(merchandise) && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
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

    /* JADX INFO: renamed from: h0 */
    public final C0190d m4379h0(List<? extends C0190d> sections) {
        return (C0190d) vwb.r(sections, new w9j() { // from class: l.nuo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4310I(this.f16205a, (C0190d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final String m4380i0(Merchandise merchandise) {
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
    public final c<List<Merchandise>> m4381j0() {
        final boolean z = CoreModule.c.j0.T4() || CoreModule.c.j0.z4();
        final boolean zN3 = CoreModule.c.x0.N3();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || (!z && !zN3)) {
            c<List<Merchandise>> cVarJust = c.just((Object) null);
            cVarJust.getClass();
            return cVarJust;
        }
        c cVarY5 = CoreModule.c.j0.y5(ProductCategory.get("tttSvipGoogleplayFreeTrial"));
        final Function1 function1 = new Function1() { // from class: l.ouo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4302A((List) obj);
            }
        };
        c cVarFilter = cVarY5.filter(new w9j() { // from class: l.puo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4303B(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.quo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4345r(z, zN3, (List) obj);
            }
        };
        c<List<Merchandise>> cVarOnErrorResumeNext = cVarFilter.map(new w9j() { // from class: l.ruo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4349v(function2, obj);
            }
        }).onErrorResumeNext(new w9j() { // from class: l.suo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4322Q((Throwable) obj);
            }
        });
        cVarOnErrorResumeNext.getClass();
        return cVarOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m4382l0(String raw) {
        String strM4390t0 = m4390t0(raw);
        Integer intOrNull = StringsKt.toIntOrNull(strM4390t0);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        Double dM = kotlin.text.c.m(strM4390t0);
        Integer numValueOf = dM != null ? Integer.valueOf((int) dM.doubleValue()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 51;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4383m0(List<? extends C0190d> sections) {
        final NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        vwb.z(sections, new e30() { // from class: l.muo
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4314K(numberInstance, (C0190d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m4384n0() {
        Act act = this.act;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        View viewInflate = act.inflater().inflate(m6c0.C, (ViewGroup) get_privilege(), false);
        get_privilege().addView(viewInflate);
        this.discountHeroRoot = viewInflate;
        viewInflate.getClass();
        m4374b0(viewInflate);
        m4363N0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4385o0() {
        if (this.affiliateCountdownReconcileSub != null) {
            return;
        }
        Act act = this.act;
        Act act2 = null;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        Act act3 = this.act;
        if (act3 == null) {
            Intrinsics.r("act");
        } else {
            act2 = act3;
        }
        c cVarLifecycle = act2.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.sto
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4320O((com.p1.mobile.android.app.c) obj);
            }
        };
        c cVarFilter = cVarLifecycle.filter(new w9j() { // from class: l.tto
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4324S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.uto
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4325T((com.p1.mobile.android.app.c) obj);
            }
        };
        c map = cVarFilter.map(new w9j() { // from class: l.vto
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4327b(function2, obj);
            }
        });
        c cVarP4 = CoreModule.c.x0.p4();
        final Function1 function3 = new Function1() { // from class: l.wto
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4312J((Boolean) obj);
            }
        };
        this.affiliateCountdownReconcileSub = act.duringCreated(c.merge(map, cVarP4.map(new w9j() { // from class: l.xto
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4340m(function3, obj);
            }
        }))).subscribe(mkd0.G(new e30() { // from class: l.yto
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4352y(this.f23099a, (Unit) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4355B0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4367U(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m4386p0() {
        Locale locale = Locale.getDefault();
        return d.x(locale.getLanguage(), "zh", true) && d.x(locale.getCountry(), "TW", true);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m4387q0(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        FreeTrialData freeTrialDataC4;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            str.getClass();
            if (CoreModule.c.x0.l4(merchandise)) {
                return true;
            }
            if (!CoreModule.c.j0.T4() || (freeTrialDataC4 = CoreModule.c.j0.C4()) == null) {
                return false;
            }
            String str2 = freeTrialDataC4.skuId;
            str2.getClass();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m4388r0(IapAffiliatePromotion promotion, final C0190d selected) {
        final C0190d.a aVarM4088d = selected.m4088d();
        if (aVarM4088d == null && (aVarM4088d = selected.m4086b()) == null) {
            return;
        }
        c cVarB = u1n.b(promotion);
        final Function1 function1 = new Function1() { // from class: l.xuo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4347t((List) obj);
            }
        };
        c cVarTake = cVarB.filter(new w9j() { // from class: l.yuo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4328c(function1, obj);
            }
        }).take(1);
        final Function1 function2 = new Function1() { // from class: l.zuo
            public final Object invoke(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4344q(this.f23595a, (List) obj);
            }
        };
        c cVarCompose = cVarTake.flatMap(new w9j() { // from class: l.avo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4341n(function2, obj);
            }
        }).compose(mkd0.C());
        cVarCompose.getClass();
        Act act = this.act;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        this.affiliateOriginalPriceSubscription = act.duringCreated(cVarCompose).subscribe(mkd0.H(new e30() { // from class: l.bvo
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4330e(this.f8378a, aVarM4088d, selected, (List) obj);
            }
        }, new e30() { // from class: l.cvo
            public final void call(Object obj) {
                IntlPremiumDiscountPurchaseContentView.m4323R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m4389s0(final C0190d selected) {
        final IapAffiliatePromotion iapAffiliatePromotionE3;
        Merchandise merchandiseM4167s;
        AffiliateProducts affiliateProducts;
        String str;
        c4g0 c4g0Var = this.affiliateOriginalPriceSubscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        Context context = null;
        this.affiliateOriginalPriceSubscription = null;
        if (CoreModule.c.x0.N3() && (iapAffiliatePromotionE3 = CoreModule.c.x0.E3()) != null) {
            final C0190d.a aVarM4088d = selected.m4088d();
            if ((aVarM4088d == null && (aVarM4088d = selected.m4086b()) == null) || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
                return;
            }
            String str2 = iapAffiliatePromotionE3.offerId;
            String string = str2 != null ? StringsKt.Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                StockKeepUnit stockKeepUnit = merchandiseM4167s.defaultStockKeepUnit;
                String string2 = (stockKeepUnit == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null || (str = affiliateProducts.googleplay) == null) ? null : StringsKt.Z0(str).toString();
                String str3 = string2 != null ? string2 : "";
                String strL3 = CoreIntlAffiliatePromotions.l3(str3, iapAffiliatePromotionE3.offerId);
                strL3.getClass();
                if (strL3.length() > 0 && !Intrinsics.d(strL3, str3)) {
                    Merchandise merchandiseClone = merchandiseM4167s.clone();
                    merchandiseClone.getClass();
                    StockKeepUnit stockKeepUnit2 = merchandiseClone.defaultStockKeepUnit;
                    stockKeepUnit2.getClass();
                    stockKeepUnit2.affiliateProducts.googleplay = strL3;
                    Act act = this.act;
                    if (act == null) {
                        Intrinsics.r("act");
                        act = null;
                    }
                    Context context2 = this.act;
                    if (context2 == null) {
                        Intrinsics.r("act");
                    } else {
                        context = context2;
                    }
                    this.affiliateOriginalPriceSubscription = act.duringCreated(igj.M(context, CollectionsKt.listOf(merchandiseClone))).subscribe(mkd0.H(new e30() { // from class: l.tuo
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m4309H(this.f20389a, iapAffiliatePromotionE3, selected, aVarM4088d, (List) obj);
                        }
                    }, new e30() { // from class: l.uuo
                        public final void call(Object obj) {
                            IntlPremiumDiscountPurchaseContentView.m4346s(this.f20838a, iapAffiliatePromotionE3, selected, (Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            m4388r0(iapAffiliatePromotionE3, selected);
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
    public final String m4390t0(String raw) {
        if (raw == null || StringsKt.e0(raw)) {
            return "51";
        }
        String string = StringsKt.Z0(StringsKt.y0(StringsKt.Z0(raw).toString(), "%")).toString();
        return string.length() == 0 ? "51" : string;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m4391u0() {
        if (this.isDialogPageShow) {
            i0e.e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m4392v0() {
        if (this.isDialogPageShow) {
            return;
        }
        this.isDialogPageShow = true;
        m4364O0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m4393w0(ProductCategory category, List<? extends Merchandise> merchandises) {
        d30 d30Var;
        d30 d30Var2;
        boolean zA = NullChecker.a(vwb.r(merchandises, new w9j() { // from class: l.iuo
            public final Object call(Object obj) {
                return IntlPremiumDiscountPurchaseContentView.m4304C((Merchandise) obj);
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
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType3 == purchaseType4 && vwb.J(listA) && (d30Var2 = this.fallbackToStandardPremiumFullscreen) != null) {
            if (d30Var2 != null) {
                d30Var2.call();
                return;
            }
            return;
        }
        m4383m0(listA);
        C0190d c0190dM4379h0 = m4379h0(listA);
        if (c0190dM4379h0 == null) {
            c0190dM4379h0 = (C0190d) vwb.r(listA, new w9j() { // from class: l.juo
                public final Object call(Object obj) {
                    return IntlPremiumDiscountPurchaseContentView.m4353z((C0190d) obj);
                }
            });
        }
        if (c0190dM4379h0 != null) {
            get_payment_view().setVisibility(0);
            vwb.z(listA, new e30() { // from class: l.kuo
                public final void call(Object obj) {
                    IntlPremiumDiscountPurchaseContentView.m4329d((C0190d) obj);
                }
            });
            c0190dM4379h0.m4106v(true);
            m4371Y(c0190dM4379h0);
            this.currentSelectPurchaseSectionAction.call(c0190dM4379h0);
            m4389s0(c0190dM4379h0);
        } else {
            get_payment_view().setVisibility(8);
            dgn dgnVar2 = this.paymentComponent;
            if (dgnVar2 != null) {
                dgnVar2.m11852b(null);
            }
            get_payment_view().m4496j(null);
            PurchaseType purchaseType5 = this.purchaseType;
            if (purchaseType5 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType = purchaseType5;
            }
            if (purchaseType == purchaseType4 && (d30Var = this.fallbackToStandardPremiumFullscreen) != null && d30Var != null) {
                d30Var.call();
            }
        }
        m4366Q0(listA);
    }

    /* JADX INFO: renamed from: x0 */
    public final Triple<String, String, String> m4394x0(String raw) {
        if (raw == null || raw.length() == 0) {
            return new Triple<>("00", "00", "00");
        }
        List listSplit$default = StringsKt.split$default(raw, new String[]{":"}, false, 0, 6, (Object) null);
        return listSplit$default.size() >= 3 ? new Triple<>(listSplit$default.get(0), listSplit$default.get(1), listSplit$default.get(2)) : new Triple<>("00", "00", "00");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m4395y0() {
        dgn dgnVar;
        View.OnClickListener onClickListener;
        if (!NullChecker.a(this.paymentComponent) || (dgnVar = this.paymentComponent) == null || (onClickListener = dgnVar.f9241k0) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m4396z0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from, boolean multiPages) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.primaryPrivilege = privilege;
        this.from = from;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPremiumDiscountPurchaseContentView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPremiumDiscountPurchaseContentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
