package com.facebook.appevents.p026ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.appevents.p026ml.ModelManager;
import com.facebook.internal.C1657e;
import com.facebook.internal.FeatureManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aug0;
import p149l.dnw;
import p149l.l9r;
import p149l.lsb;
import p149l.oek0;
import p149l.rwm;
import p149l.vfi;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u00029-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u001b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010)R\"\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00108\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m87232d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "<init>", "()V", "", "f", "Lcom/facebook/appevents/ml/ModelManager$Task;", "task", "Ljava/io/File;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/ml/ModelManager$Task;)Ljava/io/File;", "", "", "denses", "", "texts", "n", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "", "timestamp", "", "k", "(J)Z", "Lorg/json/JSONObject;", "models", "e", "(Lorg/json/JSONObject;)V", "jsonObject", "m", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "h", "()Lorg/json/JSONObject;", "g", "Lorg/json/JSONArray;", "jsonArray", BLiveStormDanmakuGiftResourceType.f44444l, "(Lorg/json/JSONArray;)[F", "Ll/dnw;", ShareConstants.RES_PATH, "thresholds", "p", "(Ll/dnw;[F)[Ljava/lang/String;", "o", "", "Lcom/facebook/appevents/ml/ModelManager$a;", "a", "Ljava/util/Map;", "taskHandlers", "", "b", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", "c", "MTML_INTEGRITY_DETECT_PREDICTION", "j", "()Z", "isLocaleEnglish", "Task", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class ModelManager {

    @NotNull
    public static final ModelManager INSTANCE = new ModelManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, C1569a> taskHandlers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"none", PlaceTypes.ADDRESS, PlaceTypes.HEALTH});

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$Task$a */
        @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        public /* synthetic */ class C1568a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6128a;

            static {
                int[] iArr = new int[Task.values().length];
                try {
                    iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6128a = iArr;
            }
        }

        @NotNull
        public final String toKey() {
            int i = C1568a.f6128a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            l9r.m149037a();
            return null;
        }

        @NotNull
        public final String toUseCase() {
            int i = C1568a.f6128a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            l9r.m149037a();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a */
    @Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b\u001b\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0018\u0010.\"\u0004\b/\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, m87232d2 = {"Lcom/facebook/appevents/ml/ModelManager$a;", "", "", "useCase", "assetUri", "ruleUri", "", "versionId", "", "thresholds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "Ljava/lang/Runnable;", "onPostExecute", "j", "(Ljava/lang/Runnable;)Lcom/facebook/appevents/ml/ModelManager$a;", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUseCase", "(Ljava/lang/String;)V", "b", "setAssetUri", "c", "e", "setRuleUri", Constants.INAPP_DATA_TAG, "I", "h", "()I", "setVersionId", "(I)V", "[F", "f", "()[F", "setThresholds", "([F)V", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "k", "(Ljava/io/File;)V", "ruleFile", "Lcom/facebook/appevents/ml/a;", "Lcom/facebook/appevents/ml/a;", "()Lcom/facebook/appevents/ml/a;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/ml/a;)V", "model", "Ljava/lang/Runnable;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1569a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String useCase;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String assetUri;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String ruleUri;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int versionId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public float[] thresholds;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public File ruleFile;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public C1571a model;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Runnable onPostExecute;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Lcom/facebook/appevents/ml/ModelManager$a$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/facebook/appevents/ml/ModelManager$a;", "c", "(Lorg/json/JSONObject;)Lcom/facebook/appevents/ml/ModelManager$a;", "master", "", "slaves", "", "f", "(Lcom/facebook/appevents/ml/ModelManager$a;Ljava/util/List;)V", "", "useCase", "", "versionId", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;I)V", "uri", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/vfi$a;", "onComplete", "e", "(Ljava/lang/String;Ljava/lang/String;Ll/vfi$a;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public static void m7962a(C1569a c1569a, C1571a c1571a, File file) {
                c1569a.getClass();
                file.getClass();
                c1569a.m7959i(c1571a);
                c1569a.m7961k(file);
                Runnable runnable = c1569a.onPostExecute;
                if (runnable != null) {
                    runnable.run();
                }
            }

            /* JADX INFO: renamed from: b */
            public static void m7963b(List list, File file) {
                list.getClass();
                file.getClass();
                final C1571a c1571aM7970a = C1571a.INSTANCE.m7970a(file);
                if (c1571aM7970a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final C1569a c1569a = (C1569a) it.next();
                        C1569a.INSTANCE.m7966e(c1569a.getRuleUri(), c1569a.getUseCase() + '_' + c1569a.getVersionId() + "_rule", new vfi.InterfaceC20629a() { // from class: l.p600
                            @Override // p149l.vfi.InterfaceC20629a
                            /* JADX INFO: renamed from: a */
                            public final void mo162817a(File file2) {
                                ModelManager.C1569a.Companion.m7962a(c1569a, c1571aM7970a, file2);
                            }
                        });
                    }
                }
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final C1569a m7964c(@Nullable JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    String string = json.getString("use_case");
                    String string2 = json.getString("asset_uri");
                    String strOptString = json.optString("rules_uri", null);
                    int i = json.getInt("version_id");
                    float[] fArrM7938d = ModelManager.m7938d(ModelManager.INSTANCE, json.getJSONArray("thresholds"));
                    string.getClass();
                    string2.getClass();
                    return new C1569a(string, string2, strOptString, i, fArrM7938d);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* JADX INFO: renamed from: d */
            public final void m7965d(String useCase, int versionId) {
                File[] fileArrListFiles;
                File fileM163972a = oek0.m163972a();
                if (fileM163972a == null || (fileArrListFiles = fileM163972a.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str = useCase + '_' + versionId;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (C15386d.m93483J(name, useCase, false, 2, null) && !C15386d.m93483J(name, str, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* JADX INFO: renamed from: e */
            public final void m7966e(String uri, String name, vfi.InterfaceC20629a onComplete) {
                File file = new File(oek0.m163972a(), name);
                if (uri == null || file.exists()) {
                    onComplete.mo162817a(file);
                } else {
                    new vfi(uri, file, onComplete).execute(new String[0]);
                }
            }

            /* JADX INFO: renamed from: f */
            public final void m7967f(@NotNull C1569a master, @NotNull final List<C1569a> slaves) {
                master.getClass();
                slaves.getClass();
                m7965d(master.getUseCase(), master.getVersionId());
                m7966e(master.getAssetUri(), master.getUseCase() + '_' + master.getVersionId(), new vfi.InterfaceC20629a() { // from class: l.o600
                    @Override // p149l.vfi.InterfaceC20629a
                    /* JADX INFO: renamed from: a */
                    public final void mo162817a(File file) {
                        ModelManager.C1569a.Companion.m7963b(slaves, file);
                    }
                });
            }

            public Companion() {
            }
        }

        public C1569a(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @Nullable float[] fArr) {
            str.getClass();
            str2.getClass();
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i;
            this.thresholds = fArr;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetUri() {
            return this.assetUri;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1571a getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final File getRuleFile() {
            return this.ruleFile;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRuleUri() {
            return this.ruleUri;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final float[] getThresholds() {
            return this.thresholds;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUseCase() {
            return this.useCase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getVersionId() {
            return this.versionId;
        }

        /* JADX INFO: renamed from: i */
        public final void m7959i(@Nullable C1571a c1571a) {
            this.model = c1571a;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C1569a m7960j(@Nullable Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final void m7961k(@Nullable File file) {
            this.ruleFile = file;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$b */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C1570b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6137a;

        static {
            int[] iArr = new int[Task.values().length];
            try {
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6137a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7935a() {
        if (lsb.m151554d(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!FeatureManager.m8679g(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !INSTANCE.m7946k(j)) {
                jSONObject = INSTANCE.m7944h();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            ModelManager modelManager = INSTANCE;
            modelManager.m7942e(jSONObject);
            modelManager.m7943g();
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7936b() {
        if (lsb.m151554d(ModelManager.class)) {
            return;
        }
        try {
            rwm.m181437a();
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7937c() {
        if (lsb.m151554d(ModelManager.class)) {
            return;
        }
        try {
            aug0.m98987b();
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ float[] m7938d(ModelManager modelManager, JSONArray jSONArray) {
        if (lsb.m151554d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.m7947l(jSONArray);
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m7939f() {
        if (lsb.m151554d(ModelManager.class)) {
            return;
        }
        try {
            C1657e.m8806A0(new Runnable() { // from class: l.l600
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.m7935a();
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final File m7940i(@NotNull Task task) {
        if (lsb.m151554d(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            C1569a c1569a = taskHandlers.get(task.toUseCase());
            if (c1569a == null) {
                return null;
            }
            return c1569a.getRuleFile();
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String[] m7941n(@NotNull Task task, @NotNull float[][] denses, @NotNull String[] texts) {
        C1571a model;
        if (lsb.m151554d(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            denses.getClass();
            texts.getClass();
            C1569a c1569a = taskHandlers.get(task.toUseCase());
            if (c1569a != null && (model = c1569a.getModel()) != null) {
                float[] thresholds = c1569a.getThresholds();
                int length = texts.length;
                int length2 = denses[0].length;
                dnw dnwVar = new dnw(new int[]{length, length2});
                for (int i = 0; i < length; i++) {
                    System.arraycopy(denses[i], 0, dnwVar.getData(), i * length2, length2);
                }
                dnw dnwVarM7969b = model.m7969b(dnwVar, texts, task.toKey());
                if (dnwVarM7969b != null && thresholds != null && dnwVarM7969b.getData().length != 0 && thresholds.length != 0) {
                    int i2 = C1570b.f6137a[task.ordinal()];
                    if (i2 == 1) {
                        return INSTANCE.m7950p(dnwVarM7969b, thresholds);
                    }
                    if (i2 == 2) {
                        return INSTANCE.m7949o(dnwVarM7969b, thresholds);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, ModelManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7942e(JSONObject models) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = models.keys();
            while (itKeys.hasNext()) {
                try {
                    C1569a c1569aM7964c = C1569a.INSTANCE.m7964c(models.getJSONObject(itKeys.next()));
                    if (c1569aM7964c != null) {
                        taskHandlers.put(c1569aM7964c.getUseCase(), c1569aM7964c);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7943g() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String assetUri = null;
            int iMax = 0;
            for (Map.Entry<String, C1569a> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                C1569a value = entry.getValue();
                if (Intrinsics.m87488d(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri2 = value.getAssetUri();
                    int iMax2 = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.m8679g(FeatureManager.Feature.SuggestedEvents) && m7945j()) {
                        arrayList.add(value.m7960j(new Runnable() { // from class: l.m600
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.m7937c();
                            }
                        }));
                    }
                    assetUri = assetUri2;
                    iMax = iMax2;
                }
                if (Intrinsics.m87488d(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    assetUri = value.getAssetUri();
                    iMax = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.m8679g(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.m7960j(new Runnable() { // from class: l.n600
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.m7936b();
                            }
                        }));
                    }
                }
            }
            if (assetUri == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            C1569a.INSTANCE.m7967f(new C1569a("MTML", assetUri, null, iMax, null), arrayList);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m7944h() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(Constants.SEPARATOR_COMMA, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestM7585x = GraphRequest.INSTANCE.m7585x(null, "app/model_asset", null);
            graphRequestM7585x.m7520G(bundle);
            JSONObject graphObject = graphRequestM7585x.m7525j().getGraphObject();
            if (graphObject == null) {
                return null;
            }
            return m7948m(graphObject);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7945j() {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            Locale localeM8820N = C1657e.m8820N();
            if (localeM8820N == null) {
                return true;
            }
            String language = localeM8820N.getLanguage();
            language.getClass();
            return StringsKt.m93412P(language, "en", false, 2, null);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7946k(long timestamp) {
        if (lsb.m151554d(this) || timestamp == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - timestamp < 259200000;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final float[] m7947l(JSONArray jsonArray) {
        if (lsb.m151554d(this) || jsonArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jsonArray.length()];
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jsonArray.getString(i);
                    string.getClass();
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final JSONObject m7948m(JSONObject jsonObject) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = jsonObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                    jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                    jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                    jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                    if (jSONObject2.has("rules_uri")) {
                        jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                    }
                    jSONObject.put(jSONObject2.getString("use_case"), jSONObject3);
                }
                return jSONObject;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final String[] m7949o(dnw res, float[] thresholds) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            int iM112691b = res.m112691b(0);
            int iM112691b2 = res.m112691b(1);
            float[] data = res.getData();
            if (iM112691b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeM87605k = C15167a.m87605k(0, iM112691b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10));
            Iterator<Integer> it = intRangeM87605k.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * iM112691b2) + i2] >= thresholds[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final String[] m7950p(dnw res, float[] thresholds) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            int iM112691b = res.m112691b(0);
            int iM112691b2 = res.m112691b(1);
            float[] data = res.getData();
            if (iM112691b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeM87605k = C15167a.m87605k(0, iM112691b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10));
            Iterator<Integer> it = intRangeM87605k.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * iM112691b2) + i2] >= thresholds[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }
}
