package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1680e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p074ss.bytertc.engine.BuildConfig;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c1n;
import p153l.c4s;
import p153l.g0l0;
import p153l.kre0;
import p153l.q2d0;
import p153l.q4b0;
import p153l.rzv;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b8\u0018\u0000 r2\u00020\u0001:\b17=DHLsQBQ\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ+\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010\u0013\"\u0004\bF\u0010;R$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u0010;R\"\u0010P\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\\\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\b]\u0010\u0013\"\u0004\b^\u0010;R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010d\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010MR\u0018\u0010k\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0016\u0010m\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0013R\u0011\u0010o\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bn\u0010\u0013R\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010\u0013¨\u0006t"}, m88121d2 = {"Lcom/facebook/GraphRequest;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "graphPath", "Landroid/os/Bundle;", "parameters", "Lcom/facebook/HttpMethod;", "httpMethod", "Lcom/facebook/GraphRequest$b;", "callback", WBConstants.AUTH_PARAMS_VERSION, "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$b;Ljava/lang/String;)V", "", "h", "()V", "m", "()Ljava/lang/String;", "o", "baseUrl", "", "isBatch", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Z)Ljava/lang/String;", BaseSei.f14624X, "(Ljava/lang/String;)Ljava/lang/String;", "I", "()Z", BaseSei.f14626Z, BaseSei.f14625Y, "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "B", "(Lorg/json/JSONArray;Ljava/util/Map;)V", "forceOverride", "D", "(Z)V", "Lcom/facebook/GraphResponse;", "j", "()Lcom/facebook/GraphResponse;", "Lcom/facebook/d;", "k", "()Lcom/facebook/d;", "toString", "a", "Lcom/facebook/AccessToken;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "b", "Ljava/lang/String;", "q", "setGraphPath", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "c", "Lorg/json/JSONObject;", "p", "()Lorg/json/JSONObject;", "E", "(Lorg/json/JSONObject;)V", "graphObject", Constants.INAPP_DATA_TAG, "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", "f", "Z", "getBatchEntryOmitResultOnSuccess", "setBatchEntryOmitResultOnSuccess", "batchEntryOmitResultOnSuccess", "g", "Landroid/os/Bundle;", Constants.KEY_T, "()Landroid/os/Bundle;", "G", "(Landroid/os/Bundle;)V", "Ljava/lang/Object;", ResourceDirection.f39656v, "()Ljava/lang/Object;", "H", "(Ljava/lang/Object;)V", "tag", "getVersion", "setVersion", "Lcom/facebook/GraphRequest$b;", "n", "()Lcom/facebook/GraphRequest$b;", c4s.C_ZONE, "(Lcom/facebook/GraphRequest$b;)V", "value", "Lcom/facebook/HttpMethod;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/facebook/HttpMethod;", "F", "(Lcom/facebook/HttpMethod;)V", "forceApplicationRequest", "overriddenURL", "r", "graphPathWithVersion", "u", "relativeUrlForBatchedRequest", "w", "urlForSingleRequest", "Companion", "ParcelableResourceWithMimeType", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class GraphRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @JvmField
    public static final String f5937n = GraphRequest.class.getSimpleName();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final String f5938o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public static String f5939p;

    /* JADX INFO: renamed from: q */
    public static final Pattern f5940q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public static volatile String f5941r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String graphPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public JSONObject graphObject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String batchEntryName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String batchEntryDependsOn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean batchEntryOmitResultOnSuccess;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Bundle parameters;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Object tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String version;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1539b callback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public HttpMethod httpMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean forceApplicationRequest;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String overriddenURL;

    /* JADX INFO: renamed from: com.facebook.GraphRequest$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/facebook/GraphRequest$a;", "", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "a", "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1538a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final GraphRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object value;

        public C1538a(@NotNull GraphRequest graphRequest, @Nullable Object obj) {
            graphRequest.getClass();
            this.request = graphRequest;
            this.value = obj;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GraphRequest getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$b */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/facebook/GraphRequest$b;", "", "Lcom/facebook/GraphResponse;", "response", "", "a", "(Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC1539b {
        /* JADX INFO: renamed from: a */
        void mo7602a(@NotNull GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$c, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJA\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J/\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J+\u00105\u001a\u00020\u00102\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000203022\u0006\u0010#\u001a\u00020-H\u0002¢\u0006\u0004\b5\u00106J9\u00109\u001a\u00020\u00102\u0006\u0010#\u001a\u00020-2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020308H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b@\u0010?J\u0019\u0010A\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bA\u0010BJ#\u0010G\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0007¢\u0006\u0004\bG\u0010HJ7\u0010K\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bK\u0010LJ7\u0010N\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bN\u0010OJ-\u0010P\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020T2\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\b\u0012\u0004\u0012\u00020T0X2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0W\"\u00020.H\u0007¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\b\u0012\u0004\u0012\u00020T0X2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.07H\u0007¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020T0X2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b]\u0010^J#\u0010`\u001a\u00020_2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0W\"\u00020.H\u0007¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020_2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.07H\u0007¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020_2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bd\u0010eJ%\u0010f\u001a\b\u0012\u0004\u0012\u00020T0X2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bf\u0010gJ%\u0010i\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020T0XH\u0001¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u001e\u0010r\u001a\u0004\u0018\u00010\u001c8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010pR\u0014\u0010u\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010v\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010sR\u0014\u0010w\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010sR\u0014\u0010x\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010sR\u0014\u0010y\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010sR\u0014\u0010z\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010sR\u0014\u0010{\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010sR\u0014\u0010|\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010sR\u0014\u0010}\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010sR\u0014\u0010~\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010sR\u0014\u0010\u007f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010sR\u0016\u0010\u0080\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010sR\u0016\u0010\u0081\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010sR\u0016\u0010\u0082\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010sR\u0016\u0010\u0083\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010sR\u0016\u0010\u0084\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010sR\u0016\u0010\u0085\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010sR\u0016\u0010\u0086\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010sR\u0016\u0010\u0087\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010sR\u0016\u0010\u0088\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010sR\u0016\u0010\u0089\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010sR\u0016\u0010\u008a\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010sR\u0016\u0010\u008b\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010sR\u0016\u0010\u008c\u0001\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010sR\u0016\u0010\u008d\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010sR\u0016\u0010\u008e\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010sR\u0016\u0010\u008f\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010sR\u0016\u0010\u0090\u0001\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0090\u0001\u00109R\u0016\u0010\u0091\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010sR\u0016\u0010\u0092\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010sR\u0016\u0010\u0093\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010sR\u0016\u0010\u0094\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010sR\u0016\u0010\u0095\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010sR\u0016\u0010\u0096\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010sR\u0016\u0010\u0097\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010sR\u0016\u0010\u0098\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010sR\u0016\u0010\u0099\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010sR\u0016\u0010\u009a\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010sR\u0016\u0010\u009b\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010sR\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010sR\"\u0010\u009f\u0001\u001a\r \u009e\u0001*\u0005\u0018\u00010\u009d\u00010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¡\u0001"}, m88121d2 = {"Lcom/facebook/GraphRequest$c;", "", "<init>", "()V", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "g", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "Lcom/facebook/e;", "requests", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/facebook/e;)Z", "connection", "shouldUseGzip", "", "K", "(Ljava/net/HttpURLConnection;Z)V", Constants.KEY_T, "Ll/rzv;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", "E", "(Lcom/facebook/e;Ll/rzv;ILjava/net/URL;Ljava/io/OutputStream;Z)V", "", "path", "u", "(Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$e;", "serializer", c4s.C_ZONE, "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$e;)V", Constants.KEY_KEY, "value", "passByValue", "D", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$e;Z)V", "Landroid/os/Bundle;", StickerBundle.TYPE, "Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "H", "(Landroid/os/Bundle;Lcom/facebook/GraphRequest$g;Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/GraphRequest$a;", "attachments", "G", "(Ljava/util/Map;Lcom/facebook/GraphRequest$g;)V", "", "", "I", "(Lcom/facebook/GraphRequest$g;Ljava/util/Collection;Ljava/util/Map;)V", "batch", "p", "(Lcom/facebook/e;)Ljava/lang/String;", ResourceDirection.f39656v, "(Ljava/lang/Object;)Z", "w", "B", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$d;", "callback", BaseSei.f14625Y, "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$d;)Lcom/facebook/GraphRequest;", "graphPath", "Lcom/facebook/GraphRequest$b;", BaseSei.f14626Z, "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "parameters", "A", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", BaseSei.f14624X, "(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "L", "(Lcom/facebook/e;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphResponse;", "h", "(Lcom/facebook/GraphRequest;)Lcom/facebook/GraphResponse;", "", "", "k", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "j", "(Ljava/util/Collection;)Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/e;)Ljava/util/List;", "Lcom/facebook/d;", "n", "([Lcom/facebook/GraphRequest;)Lcom/facebook/d;", "m", "(Ljava/util/Collection;)Lcom/facebook/d;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/facebook/e;)Lcom/facebook/d;", "o", "(Ljava/net/HttpURLConnection;Lcom/facebook/e;)Ljava/util/List;", "responses", "F", "(Lcom/facebook/e;Ljava/util/List;)V", "M", "(Lcom/facebook/e;)V", "J", "(Lcom/facebook/e;Ljava/net/HttpURLConnection;)V", "q", "()Ljava/lang/String;", "mimeContentType", "userAgent", "Ljava/lang/String;", "r", "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "versionPattern", "Ljava/util/regex/Pattern;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m7603a(ArrayList arrayList, C1622e c1622e) {
            arrayList.getClass();
            c1622e.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC1539b interfaceC1539b = (InterfaceC1539b) pair.first;
                Object obj = pair.second;
                obj.getClass();
                interfaceC1539b.mo7602a((GraphResponse) obj);
            }
            Iterator<C1622e.a> it2 = c1622e.m8365s().iterator();
            while (it2.hasNext()) {
                it2.next().mo8371a(c1622e);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m7604b(InterfaceC1541d interfaceC1541d, GraphResponse graphResponse) {
            graphResponse.getClass();
            if (interfaceC1541d != null) {
                interfaceC1541d.m7642a(graphResponse.getGraphObject(), graphResponse);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: A */
        public final GraphRequest m7609A(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Bundle parameters, @Nullable InterfaceC1539b callback) {
            return new GraphRequest(accessToken, graphPath, parameters, HttpMethod.POST, callback, null, 32, null);
        }

        /* JADX INFO: renamed from: B */
        public final String m7610B(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (!(value instanceof Date)) {
                wg3.m206174a("Unsupported parameter type.");
                return null;
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
            str.getClass();
            return str;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX INFO: renamed from: C */
        public final void m7611C(JSONObject graphObject, String path, InterfaceC1542e serializer) {
            boolean z;
            if (m7636u(path)) {
                int iC0 = StringsKt.m94327c0(path, ":", 0, false, 6, null);
                int iC1 = StringsKt.m94327c0(path, "?", 0, false, 6, null);
                if (iC0 <= 3 || (iC1 != -1 && iC0 >= iC1)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Iterator<String> itKeys = graphObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = graphObject.opt(next);
                boolean z2 = z && C15493d.m94381x(next, "image", true);
                next.getClass();
                objOpt.getClass();
                m7612D(next, objOpt, serializer, z2);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m7612D(String key, Object value, InterfaceC1542e serializer, boolean passByValue) {
            Class<?> cls = value.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) value;
                if (passByValue) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("%s[%s]", Arrays.copyOf(new Object[]{key, next}, 2));
                        Object objOpt = jSONObject.opt(next);
                        objOpt.getClass();
                        m7612D(str, objOpt, serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    strOptString.getClass();
                    m7612D(key, strOptString, serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    strOptString2.getClass();
                    m7612D(key, strOptString2, serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        string.getClass();
                        m7612D(key, string, serializer, passByValue);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) value;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{key, Integer.valueOf(i)}, 2));
                    Object objOpt2 = jSONArray.opt(i);
                    objOpt2.getClass();
                    m7612D(str2, objOpt2, serializer, passByValue);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                serializer.mo7643a(key, value.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
                str3.getClass();
                serializer.mo7643a(key, str3);
                return;
            }
            C1680e.m8898j0(GraphRequest.f5937n, "The type of property " + key + " in the graph object is unknown. It won't be sent in the request.");
        }

        /* JADX INFO: renamed from: E */
        public final void m7613E(C1622e requests, rzv logger, int numRequests, URL url, OutputStream outputStream, boolean shouldUseGzip) throws Throwable {
            C1544g c1544g = new C1544g(outputStream, logger, shouldUseGzip);
            if (numRequests != 1) {
                String strM7631p = m7631p(requests);
                if (strM7631p.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                c1544g.mo7643a("batch_app_id", strM7631p);
                HashMap map = new HashMap();
                m7617I(c1544g, requests, map);
                if (logger != null) {
                    logger.m183841b("  Attachments:\n");
                }
                m7615G(map, c1544g);
                return;
            }
            GraphRequest graphRequestM8362o = requests.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequestM8362o.getParameters().keySet()) {
                Object obj = graphRequestM8362o.getParameters().get(str);
                if (m7637v(obj)) {
                    str.getClass();
                    map2.put(str, new C1538a(graphRequestM8362o, obj));
                }
            }
            if (logger != null) {
                logger.m183841b("  Parameters:\n");
            }
            m7616H(graphRequestM8362o.getParameters(), c1544g, graphRequestM8362o);
            if (logger != null) {
                logger.m183841b("  Attachments:\n");
            }
            m7615G(map2, c1544g);
            JSONObject graphObject = graphRequestM8362o.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                path.getClass();
                m7611C(graphObject, path, c1544g);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: F */
        public final void m7614F(@NotNull final C1622e requests, @NotNull List<GraphResponse> responses) {
            requests.getClass();
            responses.getClass();
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequestM8362o = requests.get(i);
                if (graphRequestM8362o.getCallback() != null) {
                    arrayList.add(new Pair(graphRequestM8362o.getCallback(), responses.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: l.j9k
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m7603a(arrayList, requests);
                    }
                };
                Handler handlerM8364r = requests.getCallbackHandler();
                if (handlerM8364r != null) {
                    handlerM8364r.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m7615G(Map<String, C1538a> attachments, C1544g serializer) throws Throwable {
            for (Map.Entry<String, C1538a> entry : attachments.entrySet()) {
                if (GraphRequest.INSTANCE.m7637v(entry.getValue().getValue())) {
                    serializer.m7653j(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        /* JADX INFO: renamed from: H */
        public final void m7616H(Bundle bundle, C1544g serializer, GraphRequest request) throws Throwable {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m7638w(obj)) {
                    str.getClass();
                    serializer.m7653j(str, obj, request);
                }
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m7617I(C1544g serializer, Collection<GraphRequest> requests, Map<String, C1538a> attachments) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                it.next().m7569B(jSONArray, attachments);
            }
            serializer.m7655l("batch", jSONArray, requests);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
        @JvmStatic
        /* JADX INFO: renamed from: J */
        public final void m7618J(@NotNull C1622e requests, @NotNull HttpURLConnection connection) throws Throwable {
            Throwable th;
            OutputStream gZIPOutputStream;
            OutputStream outputStream;
            Companion companion;
            boolean z;
            C1622e c1622e;
            OutputStream c1635h;
            requests.getClass();
            connection.getClass();
            rzv rzvVar = new rzv(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zM7635t = m7635t(requests);
            OutputStream outputStream2 = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            m7619K(connection, zM7635t);
            URL url = connection.getURL();
            rzvVar.m183841b("Request:\n");
            rzvVar.m183843d("Id", requests.getId());
            url.getClass();
            rzvVar.m183843d("URL", url);
            String requestMethod = connection.getRequestMethod();
            requestMethod.getClass();
            rzvVar.m183843d("Method", requestMethod);
            String requestProperty = connection.getRequestProperty("User-Agent");
            requestProperty.getClass();
            rzvVar.m183843d("User-Agent", requestProperty);
            String requestProperty2 = connection.getRequestProperty("Content-Type");
            requestProperty2.getClass();
            rzvVar.m183843d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (httpMethod != HttpMethod.POST) {
                rzvVar.m183844e();
                return;
            }
            connection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zM7635t) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream2 = bufferedOutputStream;
                        if (outputStream2 == null) {
                            throw th;
                        }
                        outputStream2.close();
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (m7634s(requests)) {
                        q4b0 q4b0Var = new q4b0(requests.getCallbackHandler());
                        m7613E(requests, null, size, url, q4b0Var, zM7635t);
                        companion = this;
                        c1622e = requests;
                        size = size;
                        z = zM7635t;
                        outputStream = gZIPOutputStream;
                        try {
                            c1635h = new C1635h(outputStream, c1622e, q4b0Var.m175206m(), q4b0Var.getMaxProgress());
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            outputStream2 = outputStream;
                            if (outputStream2 == null) {
                                throw th;
                            }
                            outputStream2.close();
                            throw th;
                        }
                    } else {
                        companion = this;
                        z = zM7635t;
                        c1622e = requests;
                        c1635h = gZIPOutputStream;
                    }
                    try {
                        companion.m7613E(c1622e, rzvVar, size, url, c1635h, z);
                        c1635h.close();
                        rzvVar.m183844e();
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream2 = c1635h;
                        th = th;
                        if (outputStream2 == null) {
                            throw th;
                        }
                        outputStream2.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = gZIPOutputStream;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        /* JADX INFO: renamed from: K */
        public final void m7619K(HttpURLConnection connection, boolean shouldUseGzip) {
            if (!shouldUseGzip) {
                connection.setRequestProperty("Content-Type", m7632q());
            } else {
                connection.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
                connection.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: L */
        public final HttpURLConnection m7620L(@NotNull C1622e requests) throws Throwable {
            requests.getClass();
            m7621M(requests);
            try {
                HttpURLConnection httpURLConnectionM7622g = null;
                try {
                    httpURLConnectionM7622g = m7622g(requests.size() == 1 ? new URL(requests.get(0).m7592w()) : new URL(kre0.m151038h()));
                    m7618J(requests, httpURLConnectionM7622g);
                    return httpURLConnectionM7622g;
                } catch (IOException e) {
                    C1680e.m8912r(httpURLConnectionM7622g);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    C1680e.m8912r(httpURLConnectionM7622g);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: M */
        public final void m7621M(@NotNull C1622e requests) {
            requests.getClass();
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod() && C1680e.m8886c0(graphRequest.getParameters().getString("fields"))) {
                    rzv.Companion c19943a = rzv.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder("GET requests for /");
                    String graphPath = graphRequest.getGraphPath();
                    if (graphPath == null) {
                        graphPath = "";
                    }
                    sb.append(graphPath);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    c19943a.m183847a(loggingBehavior, 5, "Request", sb.toString());
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final HttpURLConnection m7622g(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("User-Agent", m7633r());
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public final GraphResponse m7623h(@NotNull GraphRequest request) {
            request.getClass();
            List<GraphResponse> listM7626k = m7626k(request);
            if (listM7626k.size() == 1) {
                return listM7626k.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final List<GraphResponse> m7624i(@NotNull C1622e requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionM7620L;
            List<GraphResponse> listM7630o;
            requests.getClass();
            g0l0.m128438i(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionM7620L = m7620L(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnectionM7620L = null;
            } catch (Throwable th) {
                th = th;
                C1680e.m8912r(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionM7620L != null) {
                    listM7630o = m7630o(httpURLConnectionM7620L, requests);
                } else {
                    List<GraphResponse> listM7661a = GraphResponse.INSTANCE.m7661a(requests.m8367w(), null, new FacebookException(exc));
                    m7614F(requests, listM7661a);
                    listM7630o = listM7661a;
                }
                C1680e.m8912r(httpURLConnectionM7620L);
                return listM7630o;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionM7620L;
                C1680e.m8912r(httpURLConnection);
                throw th;
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final List<GraphResponse> m7625j(@NotNull Collection<GraphRequest> requests) {
            requests.getClass();
            return m7624i(new C1622e(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final List<GraphResponse> m7626k(@NotNull GraphRequest... requests) {
            requests.getClass();
            return m7625j(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: l */
        public final AsyncTaskC1614d m7627l(@NotNull C1622e requests) {
            requests.getClass();
            g0l0.m128438i(requests, "requests");
            AsyncTaskC1614d asyncTaskC1614d = new AsyncTaskC1614d(requests);
            asyncTaskC1614d.executeOnExecutor(C1600c.m8110u(), new Void[0]);
            return asyncTaskC1614d;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: m */
        public final AsyncTaskC1614d m7628m(@NotNull Collection<GraphRequest> requests) {
            requests.getClass();
            return m7627l(new C1622e(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: n */
        public final AsyncTaskC1614d m7629n(@NotNull GraphRequest... requests) {
            requests.getClass();
            return m7628m(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: o */
        public final List<GraphResponse> m7630o(@NotNull HttpURLConnection connection, @NotNull C1622e requests) {
            connection.getClass();
            requests.getClass();
            List<GraphResponse> listM7666f = GraphResponse.INSTANCE.m7666f(connection, requests);
            C1680e.m8912r(connection);
            int size = requests.size();
            if (size != listM7666f.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listM7666f.size()), Integer.valueOf(size)}, 2)));
            }
            m7614F(requests, listM7666f);
            C1598b.INSTANCE.m8062e().m8048h();
            return listM7666f;
        }

        /* JADX INFO: renamed from: p */
        public final String m7631p(C1622e batch) {
            String strM8363p = batch.getBatchApplicationId();
            if (strM8363p != null && !batch.isEmpty()) {
                return strM8363p;
            }
            Iterator<GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.f5939p;
            return (str == null || str.length() <= 0) ? C1600c.m8102m() : str;
        }

        /* JADX INFO: renamed from: q */
        public final String m7632q() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f5938o}, 1));
        }

        /* JADX INFO: renamed from: r */
        public final String m7633r() {
            if (GraphRequest.f5941r == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                GraphRequest.f5941r = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.0.3"}, 2));
                String strM107627a = c1n.m107627a();
                if (!C1680e.m8886c0(strM107627a)) {
                    GraphRequest.f5941r = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f5941r, strM107627a}, 2));
                }
            }
            return GraphRequest.f5941r;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m7634s(C1622e requests) {
            Iterator<C1622e.a> it = requests.m8365s().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C1622e.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof InterfaceC1543f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m7635t(C1622e requests) {
            for (GraphRequest graphRequest : requests) {
                Iterator<String> it = graphRequest.getParameters().keySet().iterator();
                while (it.hasNext()) {
                    if (m7637v(graphRequest.getParameters().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: u */
        public final boolean m7636u(String path) {
            Matcher matcher = GraphRequest.f5940q.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                path.getClass();
            }
            return C15493d.m94374J(path, "me/", false, 2, null) || C15493d.m94374J(path, "/me/", false, 2, null);
        }

        /* JADX INFO: renamed from: v */
        public final boolean m7637v(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: renamed from: w */
        public final boolean m7638w(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: x */
        public final GraphRequest m7639x(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable InterfaceC1539b callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: y */
        public final GraphRequest m7640y(@Nullable AccessToken accessToken, @Nullable final InterfaceC1541d callback) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC1539b(callback) { // from class: l.k9k
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    GraphRequest.Companion.m7604b(null, graphResponse);
                }
            }, null, 32, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: z */
        public final GraphRequest m7641z(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable JSONObject graphObject, @Nullable InterfaceC1539b callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.m7572E(graphObject);
            return graphRequest;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$d */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/GraphRequest$d;", "", "Lorg/json/JSONObject;", "obj", "Lcom/facebook/GraphResponse;", "response", "", "a", "(Lorg/json/JSONObject;Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC1541d {
        /* JADX INFO: renamed from: a */
        void m7642a(@Nullable JSONObject obj, @Nullable GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$e */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Lcom/facebook/GraphRequest$e;", "", "", Constants.KEY_KEY, "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC1542e {
        /* JADX INFO: renamed from: a */
        void mo7643a(@NotNull String key, @NotNull String value);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$f */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest$b;", "", "current", Constants.PRIORITY_MAX, "", "b", "(JJ)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC1543f extends InterfaceC1539b {
        /* JADX INFO: renamed from: b */
        void m7644b(long current, long max);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$g */
    @Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b6\u00107J-\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0018\u0010A\u001a\u00060>j\u0002`?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, m88121d2 = {"Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest$e;", "Ljava/io/OutputStream;", "outputStream", "Ll/rzv;", "logger", "", "useUrlEncode", "<init>", "(Ljava/io/OutputStream;Ll/rzv;Z)V", "", Constants.KEY_KEY, "", "value", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "", "j", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", HttpHeaderValues.BYTES, "e", "(Ljava/lang/String;[B)V", "Landroid/net/Uri;", "contentUri", "mimeType", "g", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/os/ParcelFileDescriptor;", "descriptor", "h", "(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V", "k", "()V", AuthenticationTokenClaims.JSON_KEY_NAME, "filename", "contentType", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", RXScreenCaptureService.KEY_INDEX, "Ljava/io/OutputStream;", "b", "Ll/rzv;", "Z", "firstWrite", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1544g implements InterfaceC1542e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final rzv logger;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean firstWrite;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean useUrlEncode;

        public C1544g(@NotNull OutputStream outputStream, @Nullable rzv rzvVar, boolean z) {
            outputStream.getClass();
            this.outputStream = outputStream;
            this.logger = rzvVar;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        @Override // com.facebook.GraphRequest.InterfaceC1542e
        /* JADX INFO: renamed from: a */
        public void mo7643a(@NotNull String key, @NotNull String value) throws IOException {
            key.getClass();
            value.getClass();
            m7649f(key, null, null);
            m7652i("%s", value);
            m7654k();
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                rzvVar.m183843d("    " + key, value);
            }
        }

        /* JADX INFO: renamed from: b */
        public final RuntimeException m7645b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* JADX INFO: renamed from: c */
        public final void m7646c(@NotNull String format, @NotNull Object... args) throws IOException {
            format.getClass();
            args.getClass();
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String strEncode = URLEncoder.encode(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
                strEncode.getClass();
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                bytes.getClass();
                outputStream.write(bytes);
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                bytes2.getClass();
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.outputStream;
                byte[] bytes3 = GraphRequest.f5938o.getBytes(charset);
                bytes3.getClass();
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.outputStream;
                byte[] bytes4 = "\r\n".getBytes(charset);
                bytes4.getClass();
                outputStream4.write(bytes4);
                this.firstWrite = false;
            }
            OutputStream outputStream5 = this.outputStream;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            byte[] bytes5 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(Charsets.UTF_8);
            bytes5.getClass();
            outputStream5.write(bytes5);
        }

        /* JADX INFO: renamed from: d */
        public final void m7647d(@NotNull String key, @NotNull Bitmap bitmap) throws IOException {
            key.getClass();
            bitmap.getClass();
            m7649f(key, key, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            m7652i("", new Object[0]);
            m7654k();
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                rzvVar.m183843d("    " + key, "<Image>");
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m7648e(@NotNull String key, @NotNull byte[] bytes) throws IOException {
            key.getClass();
            bytes.getClass();
            m7649f(key, key, "content/unknown");
            this.outputStream.write(bytes);
            m7652i("", new Object[0]);
            m7654k();
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                rzvVar.m183843d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1)));
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m7649f(@Nullable String name, @Nullable String filename, @Nullable String contentType) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{name}, 1)).getBytes(Charsets.UTF_8);
                bytes.getClass();
                outputStream.write(bytes);
                return;
            }
            m7646c("Content-Disposition: form-data; name=\"%s\"", name);
            if (filename != null) {
                m7646c("; filename=\"%s\"", filename);
            }
            m7652i("", new Object[0]);
            if (contentType != null) {
                m7652i("%s: %s", "Content-Type", contentType);
            }
            m7652i("", new Object[0]);
        }

        /* JADX INFO: renamed from: g */
        public final void m7650g(@NotNull String key, @NotNull Uri contentUri, @Nullable String mimeType) throws Throwable {
            int iM8910q;
            key.getClass();
            contentUri.getClass();
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7649f(key, key, mimeType);
            if (this.outputStream instanceof q4b0) {
                ((q4b0) this.outputStream).m175204h(C1680e.m8859A(contentUri));
                iM8910q = 0;
            } else {
                iM8910q = C1680e.m8910q(C1600c.m8101l().getContentResolver().openInputStream(contentUri), this.outputStream);
            }
            m7652i("", new Object[0]);
            m7654k();
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                rzvVar.m183843d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM8910q)}, 1)));
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m7651h(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String mimeType) throws Throwable {
            int iM8910q;
            key.getClass();
            descriptor.getClass();
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7649f(key, key, mimeType);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof q4b0) {
                ((q4b0) outputStream).m175204h(descriptor.getStatSize());
                iM8910q = 0;
            } else {
                iM8910q = C1680e.m8910q(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.outputStream);
            }
            m7652i("", new Object[0]);
            m7654k();
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                rzvVar.m183843d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM8910q)}, 1)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m7652i(@NotNull String format, @NotNull Object... args) throws IOException {
            format.getClass();
            args.getClass();
            m7646c(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            m7646c("\r\n", new Object[0]);
        }

        /* JADX INFO: renamed from: j */
        public final void m7653j(@NotNull String key, @Nullable Object value, @Nullable GraphRequest request) throws Throwable {
            key.getClass();
            Closeable closeable = this.outputStream;
            if (closeable instanceof q2d0) {
                closeable.getClass();
                ((q2d0) closeable).mo8443b(request);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.m7638w(value)) {
                mo7643a(key, companion.m7610B(value));
                return;
            }
            if (value instanceof Bitmap) {
                m7647d(key, (Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                m7648e(key, (byte[]) value);
                return;
            }
            if (value instanceof Uri) {
                m7650g(key, (Uri) value, null);
                return;
            }
            if (value instanceof ParcelFileDescriptor) {
                m7651h(key, (ParcelFileDescriptor) value, null);
                return;
            }
            if (!(value instanceof ParcelableResourceWithMimeType)) {
                throw m7645b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) value;
            Parcelable parcelableM7597b = parcelableResourceWithMimeType.m7597b();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (parcelableM7597b instanceof ParcelFileDescriptor) {
                m7651h(key, (ParcelFileDescriptor) parcelableM7597b, mimeType);
            } else {
                if (!(parcelableM7597b instanceof Uri)) {
                    throw m7645b();
                }
                m7650g(key, (Uri) parcelableM7597b, mimeType);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m7654k() throws IOException {
            if (!this.useUrlEncode) {
                m7652i("--%s", GraphRequest.f5938o);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
        }

        /* JADX INFO: renamed from: l */
        public final void m7655l(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) throws JSONException, IOException {
            key.getClass();
            requestJsonArray.getClass();
            requests.getClass();
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof q2d0)) {
                String string = requestJsonArray.toString();
                string.getClass();
                mo7643a(key, string);
                return;
            }
            closeable.getClass();
            q2d0 q2d0Var = (q2d0) closeable;
            m7649f(key, null, null);
            m7646c("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                q2d0Var.mo8443b(graphRequest);
                if (i > 0) {
                    m7646c(",%s", jSONObject.toString());
                } else {
                    m7646c("%s", jSONObject.toString());
                }
                i = i2;
            }
            m7646c(Constants.AES_SUFFIX, new Object[0]);
            rzv rzvVar = this.logger;
            if (rzvVar != null) {
                String string2 = requestJsonArray.toString();
                string2.getClass();
                rzvVar.m183843d("    " + key, string2);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$h */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"com/facebook/GraphRequest$h", "Lcom/facebook/GraphRequest$e;", "", Constants.KEY_KEY, "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1545h implements InterfaceC1542e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList<String> f5961a;

        public C1545h(ArrayList<String> arrayList) {
            this.f5961a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC1542e
        /* JADX INFO: renamed from: a */
        public void mo7643a(@NotNull String key, @NotNull String value) throws IOException {
            key.getClass();
            value.getClass();
            ArrayList<String> arrayList = this.f5961a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2)));
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f5938o = sb.toString();
        f5940q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable InterfaceC1539b interfaceC1539b, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        m7570C(interfaceC1539b);
        m7573F(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = C1600c.m8113x();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final GraphRequest m7561A(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable InterfaceC1539b interfaceC1539b) {
        return INSTANCE.m7641z(accessToken, str, jSONObject, interfaceC1539b);
    }

    /* JADX INFO: renamed from: a */
    public static void m7562a(InterfaceC1539b interfaceC1539b, GraphResponse graphResponse) {
        graphResponse.getClass();
        JSONObject jSONObjectM7658c = graphResponse.getGraphObject();
        JSONObject jSONObjectOptJSONObject = jSONObjectM7658c != null ? jSONObjectM7658c.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(Link.TYPE) : null;
                if (strOptString != null && strOptString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.m88377d(strOptString2, "warning")) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!C1680e.m8886c0(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    rzv.Companion c19943a = rzv.INSTANCE;
                    String str = f5937n;
                    str.getClass();
                    c19943a.m183848b(loggingBehavior, str, strOptString);
                }
            }
        }
        if (interfaceC1539b != null) {
            interfaceC1539b.mo7602a(graphResponse);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m7569B(JSONArray batch, Map<String, C1538a> attachments) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strM7590u = m7590u();
        jSONObject.put("relative_url", strM7590u);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            rzv.INSTANCE.m183850d(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (INSTANCE.m7637v(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(attachments.size())}, 2));
                arrayList.add(str3);
                attachments.put(str3, new C1538a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(Constants.SEPARATOR_COMMA, arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            INSTANCE.m7611C(jSONObject2, strM7590u, new C1545h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        batch.put(jSONObject);
    }

    /* JADX INFO: renamed from: C */
    public final void m7570C(@Nullable final InterfaceC1539b interfaceC1539b) {
        if (C1600c.m8083H(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C1600c.m8083H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new InterfaceC1539b() { // from class: l.i9k
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    GraphRequest.m7562a(interfaceC1539b, graphResponse);
                }
            };
        } else {
            this.callback = interfaceC1539b;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m7571D(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    /* JADX INFO: renamed from: E */
    public final void m7572E(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    /* JADX INFO: renamed from: F */
    public final void m7573F(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* JADX INFO: renamed from: G */
    public final void m7574G(@NotNull Bundle bundle) {
        bundle.getClass();
        this.parameters = bundle;
    }

    /* JADX INFO: renamed from: H */
    public final void m7575H(@Nullable Object obj) {
        this.tag = obj;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m7576I() {
        String strM7582m = m7582m();
        boolean zP = strM7582m != null ? StringsKt.m94303P(strM7582m, "|", false, 2, null) : false;
        if (strM7582m == null || !C15493d.m94374J(strM7582m, "IG", false, 2, null) || zP || !m7594y()) {
            return (m7595z() || zP) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m7577h() {
        Bundle bundle = this.parameters;
        if (m7576I()) {
            bundle.putString("access_token", m7584o());
        } else {
            String strM7582m = m7582m();
            if (strM7582m != null) {
                bundle.putString("access_token", strM7582m);
            }
        }
        if (!bundle.containsKey("access_token")) {
            C1680e.m8886c0(C1600c.m8108s());
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (C1600c.m8083H(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(BuildConfig.BUILD_TYPE, BaseSei.INFO);
        } else if (C1600c.m8083H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(BuildConfig.BUILD_TYPE, "warning");
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m7578i(String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == HttpMethod.POST) {
            return baseUrl;
        }
        Uri.Builder builderBuildUpon = Uri.parse(baseUrl).buildUpon();
        for (String str : this.parameters.keySet()) {
            Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            Companion companion = INSTANCE;
            if (companion.m7638w(obj)) {
                builderBuildUpon.appendQueryParameter(str, companion.m7610B(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                wg3.m206174a(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final GraphResponse m7579j() {
        return INSTANCE.m7623h(this);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final AsyncTaskC1614d m7580k() {
        return INSTANCE.m7629n(this);
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: m */
    public final String m7582m() {
        AccessToken accessToken = this.accessToken;
        Bundle bundle = this.parameters;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String token = accessToken.getToken();
                rzv.INSTANCE.m183850d(token);
                return token;
            }
        } else if (!bundle.containsKey("access_token")) {
            return m7584o();
        }
        return this.parameters.getString("access_token");
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC1539b getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: o */
    public final String m7584o() {
        String strM8102m = C1600c.m8102m();
        String strM8108s = C1600c.m8108s();
        if (strM8102m.length() <= 0 || strM8108s.length() <= 0) {
            C1680e.m8898j0(f5937n, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strM8102m + '|' + strM8108s;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getGraphPath() {
        return this.graphPath;
    }

    /* JADX INFO: renamed from: r */
    public final String m7587r() {
        if (f5940q.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Bundle getParameters() {
        return this.parameters;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final String m7590u() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strM7593x = m7593x(kre0.m151038h());
        m7577h();
        Uri uri = Uri.parse(m7578i(strM7593x, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final Object getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m7592w() {
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        String strM7593x = m7593x((this.httpMethod == HttpMethod.POST && str2 != null && C15493d.m94380w(str2, "/videos", false, 2, null)) ? kre0.m151040j() : kre0.m151039i(C1600c.m8114y()));
        m7577h();
        return m7578i(strM7593x, false);
    }

    /* JADX INFO: renamed from: x */
    public final String m7593x(String baseUrl) {
        if (!m7595z()) {
            baseUrl = kre0.m151036f();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, m7587r()}, 2));
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7594y() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(C1600c.m8102m());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7595z() {
        if (Intrinsics.m88377d(C1600c.m8114y(), "instagram.com")) {
            return !m7594y();
        }
        return true;
    }

    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u0019*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "resource", "", "mimeType", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Landroid/os/Parcelable;", "b", "()Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        @Nullable
        private final String mimeType;

        @Nullable
        private final RESOURCE resource;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C1536a();

        /* JADX INFO: renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "", "size", "", "b", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class C1536a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                source.getClass();
                return new ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new ParcelableResourceWithMimeType[size];
            }
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(C1600c.m8101l().getClassLoader());
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final RESOURCE m7597b() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            out.getClass();
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable InterfaceC1539b interfaceC1539b) {
        this(accessToken, str, bundle, httpMethod, interfaceC1539b, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, InterfaceC1539b interfaceC1539b, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : interfaceC1539b, (i & 32) != 0 ? null : str2);
    }

    @JvmOverloads
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }
}
