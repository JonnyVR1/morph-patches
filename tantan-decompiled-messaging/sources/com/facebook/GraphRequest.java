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
import com.facebook.internal.C1657e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p069ss.bytertc.engine.BuildConfig;
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
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ark0;
import p149l.b2s;
import p149l.czm;
import p149l.fje0;
import p149l.ig3;
import p149l.mwa0;
import p149l.nuc0;
import p149l.uxv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b8\u0018\u0000 r2\u00020\u0001:\b17=DHLsQBQ\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ+\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010\u0013\"\u0004\bF\u0010;R$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u0010;R\"\u0010P\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\\\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\b]\u0010\u0013\"\u0004\b^\u0010;R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010d\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010MR\u0018\u0010k\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0016\u0010m\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0013R\u0011\u0010o\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bn\u0010\u0013R\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010\u0013¨\u0006t"}, m87232d2 = {"Lcom/facebook/GraphRequest;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "graphPath", "Landroid/os/Bundle;", "parameters", "Lcom/facebook/HttpMethod;", "httpMethod", "Lcom/facebook/GraphRequest$b;", "callback", WBConstants.AUTH_PARAMS_VERSION, "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$b;Ljava/lang/String;)V", "", "h", "()V", "m", "()Ljava/lang/String;", "o", "baseUrl", "", "isBatch", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Z)Ljava/lang/String;", BaseSei.f13930X, "(Ljava/lang/String;)Ljava/lang/String;", "I", "()Z", BaseSei.f13932Z, BaseSei.f13931Y, "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "B", "(Lorg/json/JSONArray;Ljava/util/Map;)V", "forceOverride", "D", "(Z)V", "Lcom/facebook/GraphResponse;", "j", "()Lcom/facebook/GraphResponse;", "Lcom/facebook/d;", "k", "()Lcom/facebook/d;", "toString", "a", "Lcom/facebook/AccessToken;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "b", "Ljava/lang/String;", "q", "setGraphPath", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "c", "Lorg/json/JSONObject;", "p", "()Lorg/json/JSONObject;", "E", "(Lorg/json/JSONObject;)V", "graphObject", Constants.INAPP_DATA_TAG, "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", "f", "Z", "getBatchEntryOmitResultOnSuccess", "setBatchEntryOmitResultOnSuccess", "batchEntryOmitResultOnSuccess", "g", "Landroid/os/Bundle;", Constants.KEY_T, "()Landroid/os/Bundle;", "G", "(Landroid/os/Bundle;)V", "Ljava/lang/Object;", ResourceDirection.f38808v, "()Ljava/lang/Object;", "H", "(Ljava/lang/Object;)V", "tag", "getVersion", "setVersion", "Lcom/facebook/GraphRequest$b;", "n", "()Lcom/facebook/GraphRequest$b;", b2s.C_ZONE, "(Lcom/facebook/GraphRequest$b;)V", "value", "Lcom/facebook/HttpMethod;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/facebook/HttpMethod;", "F", "(Lcom/facebook/HttpMethod;)V", "forceApplicationRequest", "overriddenURL", "r", "graphPathWithVersion", "u", "relativeUrlForBatchedRequest", "w", "urlForSingleRequest", "Companion", "ParcelableResourceWithMimeType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class GraphRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @JvmField
    public static final String f5900n = GraphRequest.class.getSimpleName();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final String f5901o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public static String f5902p;

    /* JADX INFO: renamed from: q */
    public static final Pattern f5903q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public static volatile String f5904r;

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
    public InterfaceC1516b callback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public HttpMethod httpMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean forceApplicationRequest;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String overriddenURL;

    /* JADX INFO: renamed from: com.facebook.GraphRequest$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/facebook/GraphRequest$a;", "", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "a", "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1515a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final GraphRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object value;

        public C1515a(@NotNull GraphRequest graphRequest, @Nullable Object obj) {
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
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/GraphRequest$b;", "", "Lcom/facebook/GraphResponse;", "response", "", "a", "(Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1516b {
        /* JADX INFO: renamed from: a */
        void mo7548a(@NotNull GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$c, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJA\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J/\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J+\u00105\u001a\u00020\u00102\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000203022\u0006\u0010#\u001a\u00020-H\u0002¢\u0006\u0004\b5\u00106J9\u00109\u001a\u00020\u00102\u0006\u0010#\u001a\u00020-2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020308H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b@\u0010?J\u0019\u0010A\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bA\u0010BJ#\u0010G\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0007¢\u0006\u0004\bG\u0010HJ7\u0010K\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bK\u0010LJ7\u0010N\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bN\u0010OJ-\u0010P\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020T2\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\b\u0012\u0004\u0012\u00020T0X2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0W\"\u00020.H\u0007¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\b\u0012\u0004\u0012\u00020T0X2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.07H\u0007¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020T0X2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b]\u0010^J#\u0010`\u001a\u00020_2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0W\"\u00020.H\u0007¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020_2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020.07H\u0007¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020_2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bd\u0010eJ%\u0010f\u001a\b\u0012\u0004\u0012\u00020T0X2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bf\u0010gJ%\u0010i\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020T0XH\u0001¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u001e\u0010r\u001a\u0004\u0018\u00010\u001c8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010pR\u0014\u0010u\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010v\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010sR\u0014\u0010w\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010sR\u0014\u0010x\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010sR\u0014\u0010y\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010sR\u0014\u0010z\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010sR\u0014\u0010{\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010sR\u0014\u0010|\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010sR\u0014\u0010}\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010sR\u0014\u0010~\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010sR\u0014\u0010\u007f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010sR\u0016\u0010\u0080\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010sR\u0016\u0010\u0081\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010sR\u0016\u0010\u0082\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010sR\u0016\u0010\u0083\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010sR\u0016\u0010\u0084\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010sR\u0016\u0010\u0085\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010sR\u0016\u0010\u0086\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010sR\u0016\u0010\u0087\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010sR\u0016\u0010\u0088\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010sR\u0016\u0010\u0089\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010sR\u0016\u0010\u008a\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010sR\u0016\u0010\u008b\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010sR\u0016\u0010\u008c\u0001\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010sR\u0016\u0010\u008d\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010sR\u0016\u0010\u008e\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010sR\u0016\u0010\u008f\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010sR\u0016\u0010\u0090\u0001\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0090\u0001\u00109R\u0016\u0010\u0091\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010sR\u0016\u0010\u0092\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010sR\u0016\u0010\u0093\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010sR\u0016\u0010\u0094\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010sR\u0016\u0010\u0095\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010sR\u0016\u0010\u0096\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010sR\u0016\u0010\u0097\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010sR\u0016\u0010\u0098\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010sR\u0016\u0010\u0099\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010sR\u0016\u0010\u009a\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010sR\u0016\u0010\u009b\u0001\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010sR\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010sR\"\u0010\u009f\u0001\u001a\r \u009e\u0001*\u0005\u0018\u00010\u009d\u00010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¡\u0001"}, m87232d2 = {"Lcom/facebook/GraphRequest$c;", "", "<init>", "()V", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "g", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "Lcom/facebook/e;", "requests", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/facebook/e;)Z", "connection", "shouldUseGzip", "", "K", "(Ljava/net/HttpURLConnection;Z)V", Constants.KEY_T, "Ll/uxv;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", "E", "(Lcom/facebook/e;Ll/uxv;ILjava/net/URL;Ljava/io/OutputStream;Z)V", "", "path", "u", "(Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$e;", "serializer", b2s.C_ZONE, "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$e;)V", Constants.KEY_KEY, "value", "passByValue", "D", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$e;Z)V", "Landroid/os/Bundle;", StickerBundle.TYPE, "Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "H", "(Landroid/os/Bundle;Lcom/facebook/GraphRequest$g;Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/GraphRequest$a;", "attachments", "G", "(Ljava/util/Map;Lcom/facebook/GraphRequest$g;)V", "", "", "I", "(Lcom/facebook/GraphRequest$g;Ljava/util/Collection;Ljava/util/Map;)V", "batch", "p", "(Lcom/facebook/e;)Ljava/lang/String;", ResourceDirection.f38808v, "(Ljava/lang/Object;)Z", "w", "B", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$d;", "callback", BaseSei.f13931Y, "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$d;)Lcom/facebook/GraphRequest;", "graphPath", "Lcom/facebook/GraphRequest$b;", BaseSei.f13932Z, "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "parameters", "A", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", BaseSei.f13930X, "(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "L", "(Lcom/facebook/e;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphResponse;", "h", "(Lcom/facebook/GraphRequest;)Lcom/facebook/GraphResponse;", "", "", "k", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "j", "(Ljava/util/Collection;)Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/e;)Ljava/util/List;", "Lcom/facebook/d;", "n", "([Lcom/facebook/GraphRequest;)Lcom/facebook/d;", "m", "(Ljava/util/Collection;)Lcom/facebook/d;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/facebook/e;)Lcom/facebook/d;", "o", "(Ljava/net/HttpURLConnection;Lcom/facebook/e;)Ljava/util/List;", "responses", "F", "(Lcom/facebook/e;Ljava/util/List;)V", "M", "(Lcom/facebook/e;)V", "J", "(Lcom/facebook/e;Ljava/net/HttpURLConnection;)V", "q", "()Ljava/lang/String;", "mimeContentType", "userAgent", "Ljava/lang/String;", "r", "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "versionPattern", "Ljava/util/regex/Pattern;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m7549a(ArrayList arrayList, C1599e c1599e) {
            arrayList.getClass();
            c1599e.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC1516b interfaceC1516b = (InterfaceC1516b) pair.first;
                Object obj = pair.second;
                obj.getClass();
                interfaceC1516b.mo7548a((GraphResponse) obj);
            }
            Iterator<C1599e.a> it2 = c1599e.m8311s().iterator();
            while (it2.hasNext()) {
                it2.next().mo8317a(c1599e);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m7550b(InterfaceC1518d interfaceC1518d, GraphResponse graphResponse) {
            graphResponse.getClass();
            if (interfaceC1518d != null) {
                interfaceC1518d.m7588a(graphResponse.getGraphObject(), graphResponse);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: A */
        public final GraphRequest m7555A(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Bundle parameters, @Nullable InterfaceC1516b callback) {
            return new GraphRequest(accessToken, graphPath, parameters, HttpMethod.POST, callback, null, 32, null);
        }

        /* JADX INFO: renamed from: B */
        public final String m7556B(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (!(value instanceof Date)) {
                ig3.m135964a("Unsupported parameter type.");
                return null;
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
            str.getClass();
            return str;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX INFO: renamed from: C */
        public final void m7557C(JSONObject graphObject, String path, InterfaceC1519e serializer) {
            boolean z;
            if (m7582u(path)) {
                int iC0 = StringsKt.m93436c0(path, ":", 0, false, 6, null);
                int iC1 = StringsKt.m93436c0(path, "?", 0, false, 6, null);
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
                boolean z2 = z && C15386d.m93490x(next, "image", true);
                next.getClass();
                objOpt.getClass();
                m7558D(next, objOpt, serializer, z2);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m7558D(String key, Object value, InterfaceC1519e serializer, boolean passByValue) {
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
                        m7558D(str, objOpt, serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    strOptString.getClass();
                    m7558D(key, strOptString, serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    strOptString2.getClass();
                    m7558D(key, strOptString2, serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        string.getClass();
                        m7558D(key, string, serializer, passByValue);
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
                    m7558D(str2, objOpt2, serializer, passByValue);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                serializer.mo7589a(key, value.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
                str3.getClass();
                serializer.mo7589a(key, str3);
                return;
            }
            C1657e.m8844j0(GraphRequest.f5900n, "The type of property " + key + " in the graph object is unknown. It won't be sent in the request.");
        }

        /* JADX INFO: renamed from: E */
        public final void m7559E(C1599e requests, uxv logger, int numRequests, URL url, OutputStream outputStream, boolean shouldUseGzip) throws Throwable {
            C1521g c1521g = new C1521g(outputStream, logger, shouldUseGzip);
            if (numRequests != 1) {
                String strM7577p = m7577p(requests);
                if (strM7577p.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                c1521g.mo7589a("batch_app_id", strM7577p);
                HashMap map = new HashMap();
                m7563I(c1521g, requests, map);
                if (logger != null) {
                    logger.m196200b("  Attachments:\n");
                }
                m7561G(map, c1521g);
                return;
            }
            GraphRequest graphRequestM8308o = requests.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequestM8308o.getParameters().keySet()) {
                Object obj = graphRequestM8308o.getParameters().get(str);
                if (m7583v(obj)) {
                    str.getClass();
                    map2.put(str, new C1515a(graphRequestM8308o, obj));
                }
            }
            if (logger != null) {
                logger.m196200b("  Parameters:\n");
            }
            m7562H(graphRequestM8308o.getParameters(), c1521g, graphRequestM8308o);
            if (logger != null) {
                logger.m196200b("  Attachments:\n");
            }
            m7561G(map2, c1521g);
            JSONObject graphObject = graphRequestM8308o.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                path.getClass();
                m7557C(graphObject, path, c1521g);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: F */
        public final void m7560F(@NotNull final C1599e requests, @NotNull List<GraphResponse> responses) {
            requests.getClass();
            responses.getClass();
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequestM8308o = requests.get(i);
                if (graphRequestM8308o.getCallback() != null) {
                    arrayList.add(new Pair(graphRequestM8308o.getCallback(), responses.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: l.r6k
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m7549a(arrayList, requests);
                    }
                };
                Handler handlerM8310r = requests.getCallbackHandler();
                if (handlerM8310r != null) {
                    handlerM8310r.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m7561G(Map<String, C1515a> attachments, C1521g serializer) throws Throwable {
            for (Map.Entry<String, C1515a> entry : attachments.entrySet()) {
                if (GraphRequest.INSTANCE.m7583v(entry.getValue().getValue())) {
                    serializer.m7599j(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        /* JADX INFO: renamed from: H */
        public final void m7562H(Bundle bundle, C1521g serializer, GraphRequest request) throws Throwable {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m7584w(obj)) {
                    str.getClass();
                    serializer.m7599j(str, obj, request);
                }
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m7563I(C1521g serializer, Collection<GraphRequest> requests, Map<String, C1515a> attachments) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                it.next().m7515B(jSONArray, attachments);
            }
            serializer.m7601l("batch", jSONArray, requests);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
        @JvmStatic
        /* JADX INFO: renamed from: J */
        public final void m7564J(@NotNull C1599e requests, @NotNull HttpURLConnection connection) throws Throwable {
            Throwable th;
            OutputStream gZIPOutputStream;
            OutputStream outputStream;
            Companion companion;
            boolean z;
            C1599e c1599e;
            OutputStream c1612h;
            requests.getClass();
            connection.getClass();
            uxv uxvVar = new uxv(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zM7581t = m7581t(requests);
            OutputStream outputStream2 = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            m7565K(connection, zM7581t);
            URL url = connection.getURL();
            uxvVar.m196200b("Request:\n");
            uxvVar.m196202d("Id", requests.getId());
            url.getClass();
            uxvVar.m196202d("URL", url);
            String requestMethod = connection.getRequestMethod();
            requestMethod.getClass();
            uxvVar.m196202d("Method", requestMethod);
            String requestProperty = connection.getRequestProperty("User-Agent");
            requestProperty.getClass();
            uxvVar.m196202d("User-Agent", requestProperty);
            String requestProperty2 = connection.getRequestProperty("Content-Type");
            requestProperty2.getClass();
            uxvVar.m196202d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (httpMethod != HttpMethod.POST) {
                uxvVar.m196203e();
                return;
            }
            connection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zM7581t) {
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
                    if (m7580s(requests)) {
                        mwa0 mwa0Var = new mwa0(requests.getCallbackHandler());
                        m7559E(requests, null, size, url, mwa0Var, zM7581t);
                        companion = this;
                        c1599e = requests;
                        size = size;
                        z = zM7581t;
                        outputStream = gZIPOutputStream;
                        try {
                            c1612h = new C1612h(outputStream, c1599e, mwa0Var.m156613m(), mwa0Var.getMaxProgress());
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
                        z = zM7581t;
                        c1599e = requests;
                        c1612h = gZIPOutputStream;
                    }
                    try {
                        companion.m7559E(c1599e, uxvVar, size, url, c1612h, z);
                        c1612h.close();
                        uxvVar.m196203e();
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream2 = c1612h;
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
        public final void m7565K(HttpURLConnection connection, boolean shouldUseGzip) {
            if (!shouldUseGzip) {
                connection.setRequestProperty("Content-Type", m7578q());
            } else {
                connection.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
                connection.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: L */
        public final HttpURLConnection m7566L(@NotNull C1599e requests) throws Throwable {
            requests.getClass();
            m7567M(requests);
            try {
                HttpURLConnection httpURLConnectionM7568g = null;
                try {
                    httpURLConnectionM7568g = m7568g(requests.size() == 1 ? new URL(requests.get(0).m7538w()) : new URL(fje0.m121587h()));
                    m7564J(requests, httpURLConnectionM7568g);
                    return httpURLConnectionM7568g;
                } catch (IOException e) {
                    C1657e.m8858r(httpURLConnectionM7568g);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    C1657e.m8858r(httpURLConnectionM7568g);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: M */
        public final void m7567M(@NotNull C1599e requests) {
            requests.getClass();
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod() && C1657e.m8832c0(graphRequest.getParameters().getString("fields"))) {
                    uxv.Companion c20533a = uxv.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder("GET requests for /");
                    String graphPath = graphRequest.getGraphPath();
                    if (graphPath == null) {
                        graphPath = "";
                    }
                    sb.append(graphPath);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    c20533a.m196206a(loggingBehavior, 5, "Request", sb.toString());
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final HttpURLConnection m7568g(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("User-Agent", m7579r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public final GraphResponse m7569h(@NotNull GraphRequest request) {
            request.getClass();
            List<GraphResponse> listM7572k = m7572k(request);
            if (listM7572k.size() == 1) {
                return listM7572k.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final List<GraphResponse> m7570i(@NotNull C1599e requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionM7566L;
            List<GraphResponse> listM7576o;
            requests.getClass();
            ark0.m98520i(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionM7566L = m7566L(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnectionM7566L = null;
            } catch (Throwable th) {
                th = th;
                C1657e.m8858r(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionM7566L != null) {
                    listM7576o = m7576o(httpURLConnectionM7566L, requests);
                } else {
                    List<GraphResponse> listM7607a = GraphResponse.INSTANCE.m7607a(requests.m8313w(), null, new FacebookException(exc));
                    m7560F(requests, listM7607a);
                    listM7576o = listM7607a;
                }
                C1657e.m8858r(httpURLConnectionM7566L);
                return listM7576o;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionM7566L;
                C1657e.m8858r(httpURLConnection);
                throw th;
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final List<GraphResponse> m7571j(@NotNull Collection<GraphRequest> requests) {
            requests.getClass();
            return m7570i(new C1599e(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final List<GraphResponse> m7572k(@NotNull GraphRequest... requests) {
            requests.getClass();
            return m7571j(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: l */
        public final AsyncTaskC1591d m7573l(@NotNull C1599e requests) {
            requests.getClass();
            ark0.m98520i(requests, "requests");
            AsyncTaskC1591d asyncTaskC1591d = new AsyncTaskC1591d(requests);
            asyncTaskC1591d.executeOnExecutor(C1577c.m8056u(), new Void[0]);
            return asyncTaskC1591d;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: m */
        public final AsyncTaskC1591d m7574m(@NotNull Collection<GraphRequest> requests) {
            requests.getClass();
            return m7573l(new C1599e(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: n */
        public final AsyncTaskC1591d m7575n(@NotNull GraphRequest... requests) {
            requests.getClass();
            return m7574m(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: o */
        public final List<GraphResponse> m7576o(@NotNull HttpURLConnection connection, @NotNull C1599e requests) {
            connection.getClass();
            requests.getClass();
            List<GraphResponse> listM7612f = GraphResponse.INSTANCE.m7612f(connection, requests);
            C1657e.m8858r(connection);
            int size = requests.size();
            if (size != listM7612f.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listM7612f.size()), Integer.valueOf(size)}, 2)));
            }
            m7560F(requests, listM7612f);
            C1575b.INSTANCE.m8008e().m7994h();
            return listM7612f;
        }

        /* JADX INFO: renamed from: p */
        public final String m7577p(C1599e batch) {
            String strM8309p = batch.getBatchApplicationId();
            if (strM8309p != null && !batch.isEmpty()) {
                return strM8309p;
            }
            Iterator<GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.f5902p;
            return (str == null || str.length() <= 0) ? C1577c.m8048m() : str;
        }

        /* JADX INFO: renamed from: q */
        public final String m7578q() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f5901o}, 1));
        }

        /* JADX INFO: renamed from: r */
        public final String m7579r() {
            if (GraphRequest.f5904r == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                GraphRequest.f5904r = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.0.3"}, 2));
                String strM109427a = czm.m109427a();
                if (!C1657e.m8832c0(strM109427a)) {
                    GraphRequest.f5904r = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f5904r, strM109427a}, 2));
                }
            }
            return GraphRequest.f5904r;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m7580s(C1599e requests) {
            Iterator<C1599e.a> it = requests.m8311s().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C1599e.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof InterfaceC1520f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m7581t(C1599e requests) {
            for (GraphRequest graphRequest : requests) {
                Iterator<String> it = graphRequest.getParameters().keySet().iterator();
                while (it.hasNext()) {
                    if (m7583v(graphRequest.getParameters().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: u */
        public final boolean m7582u(String path) {
            Matcher matcher = GraphRequest.f5903q.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                path.getClass();
            }
            return C15386d.m93483J(path, "me/", false, 2, null) || C15386d.m93483J(path, "/me/", false, 2, null);
        }

        /* JADX INFO: renamed from: v */
        public final boolean m7583v(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: renamed from: w */
        public final boolean m7584w(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: x */
        public final GraphRequest m7585x(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable InterfaceC1516b callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: y */
        public final GraphRequest m7586y(@Nullable AccessToken accessToken, @Nullable final InterfaceC1518d callback) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC1516b(callback) { // from class: l.s6k
                @Override // com.facebook.GraphRequest.InterfaceC1516b
                /* JADX INFO: renamed from: a */
                public final void mo7548a(GraphResponse graphResponse) {
                    GraphRequest.Companion.m7550b(null, graphResponse);
                }
            }, null, 32, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: z */
        public final GraphRequest m7587z(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable JSONObject graphObject, @Nullable InterfaceC1516b callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.m7518E(graphObject);
            return graphRequest;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$d */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/GraphRequest$d;", "", "Lorg/json/JSONObject;", "obj", "Lcom/facebook/GraphResponse;", "response", "", "a", "(Lorg/json/JSONObject;Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1518d {
        /* JADX INFO: renamed from: a */
        void m7588a(@Nullable JSONObject obj, @Nullable GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$e */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lcom/facebook/GraphRequest$e;", "", "", Constants.KEY_KEY, "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1519e {
        /* JADX INFO: renamed from: a */
        void mo7589a(@NotNull String key, @NotNull String value);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$f */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest$b;", "", "current", Constants.PRIORITY_MAX, "", "b", "(JJ)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1520f extends InterfaceC1516b {
        /* JADX INFO: renamed from: b */
        void m7590b(long current, long max);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$g */
    @Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b6\u00107J-\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0018\u0010A\u001a\u00060>j\u0002`?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, m87232d2 = {"Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest$e;", "Ljava/io/OutputStream;", "outputStream", "Ll/uxv;", "logger", "", "useUrlEncode", "<init>", "(Ljava/io/OutputStream;Ll/uxv;Z)V", "", Constants.KEY_KEY, "", "value", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "", "j", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", HttpHeaderValues.BYTES, "e", "(Ljava/lang/String;[B)V", "Landroid/net/Uri;", "contentUri", "mimeType", "g", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/os/ParcelFileDescriptor;", "descriptor", "h", "(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V", "k", "()V", AuthenticationTokenClaims.JSON_KEY_NAME, "filename", "contentType", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", RXScreenCaptureService.KEY_INDEX, "Ljava/io/OutputStream;", "b", "Ll/uxv;", "Z", "firstWrite", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1521g implements InterfaceC1519e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final uxv logger;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean firstWrite;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean useUrlEncode;

        public C1521g(@NotNull OutputStream outputStream, @Nullable uxv uxvVar, boolean z) {
            outputStream.getClass();
            this.outputStream = outputStream;
            this.logger = uxvVar;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        @Override // com.facebook.GraphRequest.InterfaceC1519e
        /* JADX INFO: renamed from: a */
        public void mo7589a(@NotNull String key, @NotNull String value) throws IOException {
            key.getClass();
            value.getClass();
            m7595f(key, null, null);
            m7598i("%s", value);
            m7600k();
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                uxvVar.m196202d("    " + key, value);
            }
        }

        /* JADX INFO: renamed from: b */
        public final RuntimeException m7591b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* JADX INFO: renamed from: c */
        public final void m7592c(@NotNull String format, @NotNull Object... args) throws IOException {
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
                byte[] bytes3 = GraphRequest.f5901o.getBytes(charset);
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
        public final void m7593d(@NotNull String key, @NotNull Bitmap bitmap) throws IOException {
            key.getClass();
            bitmap.getClass();
            m7595f(key, key, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            m7598i("", new Object[0]);
            m7600k();
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                uxvVar.m196202d("    " + key, "<Image>");
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m7594e(@NotNull String key, @NotNull byte[] bytes) throws IOException {
            key.getClass();
            bytes.getClass();
            m7595f(key, key, "content/unknown");
            this.outputStream.write(bytes);
            m7598i("", new Object[0]);
            m7600k();
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                uxvVar.m196202d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1)));
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m7595f(@Nullable String name, @Nullable String filename, @Nullable String contentType) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{name}, 1)).getBytes(Charsets.UTF_8);
                bytes.getClass();
                outputStream.write(bytes);
                return;
            }
            m7592c("Content-Disposition: form-data; name=\"%s\"", name);
            if (filename != null) {
                m7592c("; filename=\"%s\"", filename);
            }
            m7598i("", new Object[0]);
            if (contentType != null) {
                m7598i("%s: %s", "Content-Type", contentType);
            }
            m7598i("", new Object[0]);
        }

        /* JADX INFO: renamed from: g */
        public final void m7596g(@NotNull String key, @NotNull Uri contentUri, @Nullable String mimeType) throws Throwable {
            int iM8856q;
            key.getClass();
            contentUri.getClass();
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7595f(key, key, mimeType);
            if (this.outputStream instanceof mwa0) {
                ((mwa0) this.outputStream).m156611h(C1657e.m8805A(contentUri));
                iM8856q = 0;
            } else {
                iM8856q = C1657e.m8856q(C1577c.m8047l().getContentResolver().openInputStream(contentUri), this.outputStream);
            }
            m7598i("", new Object[0]);
            m7600k();
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                uxvVar.m196202d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM8856q)}, 1)));
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m7597h(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String mimeType) throws Throwable {
            int iM8856q;
            key.getClass();
            descriptor.getClass();
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7595f(key, key, mimeType);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof mwa0) {
                ((mwa0) outputStream).m156611h(descriptor.getStatSize());
                iM8856q = 0;
            } else {
                iM8856q = C1657e.m8856q(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.outputStream);
            }
            m7598i("", new Object[0]);
            m7600k();
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                uxvVar.m196202d("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM8856q)}, 1)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m7598i(@NotNull String format, @NotNull Object... args) throws IOException {
            format.getClass();
            args.getClass();
            m7592c(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            m7592c("\r\n", new Object[0]);
        }

        /* JADX INFO: renamed from: j */
        public final void m7599j(@NotNull String key, @Nullable Object value, @Nullable GraphRequest request) throws Throwable {
            key.getClass();
            Closeable closeable = this.outputStream;
            if (closeable instanceof nuc0) {
                closeable.getClass();
                ((nuc0) closeable).mo8389b(request);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.m7584w(value)) {
                mo7589a(key, companion.m7556B(value));
                return;
            }
            if (value instanceof Bitmap) {
                m7593d(key, (Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                m7594e(key, (byte[]) value);
                return;
            }
            if (value instanceof Uri) {
                m7596g(key, (Uri) value, null);
                return;
            }
            if (value instanceof ParcelFileDescriptor) {
                m7597h(key, (ParcelFileDescriptor) value, null);
                return;
            }
            if (!(value instanceof ParcelableResourceWithMimeType)) {
                throw m7591b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) value;
            Parcelable parcelableM7543b = parcelableResourceWithMimeType.m7543b();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (parcelableM7543b instanceof ParcelFileDescriptor) {
                m7597h(key, (ParcelFileDescriptor) parcelableM7543b, mimeType);
            } else {
                if (!(parcelableM7543b instanceof Uri)) {
                    throw m7591b();
                }
                m7596g(key, (Uri) parcelableM7543b, mimeType);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m7600k() throws IOException {
            if (!this.useUrlEncode) {
                m7598i("--%s", GraphRequest.f5901o);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
        }

        /* JADX INFO: renamed from: l */
        public final void m7601l(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) throws JSONException, IOException {
            key.getClass();
            requestJsonArray.getClass();
            requests.getClass();
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof nuc0)) {
                String string = requestJsonArray.toString();
                string.getClass();
                mo7589a(key, string);
                return;
            }
            closeable.getClass();
            nuc0 nuc0Var = (nuc0) closeable;
            m7595f(key, null, null);
            m7592c("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                nuc0Var.mo8389b(graphRequest);
                if (i > 0) {
                    m7592c(",%s", jSONObject.toString());
                } else {
                    m7592c("%s", jSONObject.toString());
                }
                i = i2;
            }
            m7592c(Constants.AES_SUFFIX, new Object[0]);
            uxv uxvVar = this.logger;
            if (uxvVar != null) {
                String string2 = requestJsonArray.toString();
                string2.getClass();
                uxvVar.m196202d("    " + key, string2);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$h */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"com/facebook/GraphRequest$h", "Lcom/facebook/GraphRequest$e;", "", Constants.KEY_KEY, "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1522h implements InterfaceC1519e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList<String> f5924a;

        public C1522h(ArrayList<String> arrayList) {
            this.f5924a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC1519e
        /* JADX INFO: renamed from: a */
        public void mo7589a(@NotNull String key, @NotNull String value) throws IOException {
            key.getClass();
            value.getClass();
            ArrayList<String> arrayList = this.f5924a;
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
        f5901o = sb.toString();
        f5903q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable InterfaceC1516b interfaceC1516b, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        m7516C(interfaceC1516b);
        m7519F(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = C1577c.m8059x();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final GraphRequest m7507A(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable InterfaceC1516b interfaceC1516b) {
        return INSTANCE.m7587z(accessToken, str, jSONObject, interfaceC1516b);
    }

    /* JADX INFO: renamed from: a */
    public static void m7508a(InterfaceC1516b interfaceC1516b, GraphResponse graphResponse) {
        graphResponse.getClass();
        JSONObject jSONObjectM7604c = graphResponse.getGraphObject();
        JSONObject jSONObjectOptJSONObject = jSONObjectM7604c != null ? jSONObjectM7604c.optJSONObject("__debug__") : null;
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
                    if (Intrinsics.m87488d(strOptString2, "warning")) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!C1657e.m8832c0(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    uxv.Companion c20533a = uxv.INSTANCE;
                    String str = f5900n;
                    str.getClass();
                    c20533a.m196207b(loggingBehavior, str, strOptString);
                }
            }
        }
        if (interfaceC1516b != null) {
            interfaceC1516b.mo7548a(graphResponse);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m7515B(JSONArray batch, Map<String, C1515a> attachments) throws JSONException, IOException {
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
        String strM7536u = m7536u();
        jSONObject.put("relative_url", strM7536u);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            uxv.INSTANCE.m196209d(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (INSTANCE.m7583v(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(attachments.size())}, 2));
                arrayList.add(str3);
                attachments.put(str3, new C1515a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(Constants.SEPARATOR_COMMA, arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            INSTANCE.m7557C(jSONObject2, strM7536u, new C1522h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        batch.put(jSONObject);
    }

    /* JADX INFO: renamed from: C */
    public final void m7516C(@Nullable final InterfaceC1516b interfaceC1516b) {
        if (C1577c.m8029H(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C1577c.m8029H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new InterfaceC1516b() { // from class: l.q6k
                @Override // com.facebook.GraphRequest.InterfaceC1516b
                /* JADX INFO: renamed from: a */
                public final void mo7548a(GraphResponse graphResponse) {
                    GraphRequest.m7508a(interfaceC1516b, graphResponse);
                }
            };
        } else {
            this.callback = interfaceC1516b;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m7517D(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    /* JADX INFO: renamed from: E */
    public final void m7518E(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    /* JADX INFO: renamed from: F */
    public final void m7519F(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* JADX INFO: renamed from: G */
    public final void m7520G(@NotNull Bundle bundle) {
        bundle.getClass();
        this.parameters = bundle;
    }

    /* JADX INFO: renamed from: H */
    public final void m7521H(@Nullable Object obj) {
        this.tag = obj;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m7522I() {
        String strM7528m = m7528m();
        boolean zP = strM7528m != null ? StringsKt.m93412P(strM7528m, "|", false, 2, null) : false;
        if (strM7528m == null || !C15386d.m93483J(strM7528m, "IG", false, 2, null) || zP || !m7540y()) {
            return (m7541z() || zP) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m7523h() {
        Bundle bundle = this.parameters;
        if (m7522I()) {
            bundle.putString("access_token", m7530o());
        } else {
            String strM7528m = m7528m();
            if (strM7528m != null) {
                bundle.putString("access_token", strM7528m);
            }
        }
        if (!bundle.containsKey("access_token")) {
            C1657e.m8832c0(C1577c.m8054s());
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (C1577c.m8029H(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(BuildConfig.BUILD_TYPE, BaseSei.INFO);
        } else if (C1577c.m8029H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(BuildConfig.BUILD_TYPE, "warning");
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m7524i(String baseUrl, boolean isBatch) {
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
            if (companion.m7584w(obj)) {
                builderBuildUpon.appendQueryParameter(str, companion.m7556B(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                ig3.m135964a(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final GraphResponse m7525j() {
        return INSTANCE.m7569h(this);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final AsyncTaskC1591d m7526k() {
        return INSTANCE.m7575n(this);
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: m */
    public final String m7528m() {
        AccessToken accessToken = this.accessToken;
        Bundle bundle = this.parameters;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String token = accessToken.getToken();
                uxv.INSTANCE.m196209d(token);
                return token;
            }
        } else if (!bundle.containsKey("access_token")) {
            return m7530o();
        }
        return this.parameters.getString("access_token");
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC1516b getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: o */
    public final String m7530o() {
        String strM8048m = C1577c.m8048m();
        String strM8054s = C1577c.m8054s();
        if (strM8048m.length() <= 0 || strM8054s.length() <= 0) {
            C1657e.m8844j0(f5900n, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strM8048m + '|' + strM8054s;
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
    public final String m7533r() {
        if (f5903q.matcher(this.graphPath).matches()) {
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
    public final String m7536u() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strM7539x = m7539x(fje0.m121587h());
        m7523h();
        Uri uri = Uri.parse(m7524i(strM7539x, true));
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
    public final String m7538w() {
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        String strM7539x = m7539x((this.httpMethod == HttpMethod.POST && str2 != null && C15386d.m93489w(str2, "/videos", false, 2, null)) ? fje0.m121589j() : fje0.m121588i(C1577c.m8060y()));
        m7523h();
        return m7524i(strM7539x, false);
    }

    /* JADX INFO: renamed from: x */
    public final String m7539x(String baseUrl) {
        if (!m7541z()) {
            baseUrl = fje0.m121585f();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, m7533r()}, 2));
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7540y() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(C1577c.m8048m());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7541z() {
        if (Intrinsics.m87488d(C1577c.m8060y(), "instagram.com")) {
            return !m7540y();
        }
        return true;
    }

    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u0019*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "resource", "", "mimeType", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Landroid/os/Parcelable;", "b", "()Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        @Nullable
        private final String mimeType;

        @Nullable
        private final RESOURCE resource;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C1513a();

        /* JADX INFO: renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "", "size", "", "b", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class C1513a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
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
            this.resource = (RESOURCE) parcel.readParcelable(C1577c.m8047l().getClassLoader());
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final RESOURCE m7543b() {
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
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable InterfaceC1516b interfaceC1516b) {
        this(accessToken, str, bundle, httpMethod, interfaceC1516b, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, InterfaceC1516b interfaceC1516b, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : interfaceC1516b, (i & 32) != 0 ? null : str2);
    }

    @JvmOverloads
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }
}
