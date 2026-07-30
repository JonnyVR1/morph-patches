package com.facebook.appevents.p027ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.appevents.p027ml.ModelManager;
import com.facebook.internal.C1680e;
import com.facebook.internal.FeatureManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bqw;
import p153l.i2h0;
import p153l.nbr;
import p153l.sii;
import p153l.sym;
import p153l.unk0;
import p153l.ztb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u00029-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u001b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010)R\"\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00108\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m88121d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "<init>", "()V", "", "f", "Lcom/facebook/appevents/ml/ModelManager$Task;", "task", "Ljava/io/File;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/ml/ModelManager$Task;)Ljava/io/File;", "", "", "denses", "", "texts", "n", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "", "timestamp", "", "k", "(J)Z", "Lorg/json/JSONObject;", "models", "e", "(Lorg/json/JSONObject;)V", "jsonObject", "m", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "h", "()Lorg/json/JSONObject;", "g", "Lorg/json/JSONArray;", "jsonArray", BLiveStormDanmakuGiftResourceType.f45292l, "(Lorg/json/JSONArray;)[F", "Ll/bqw;", ShareConstants.RES_PATH, "thresholds", "p", "(Ll/bqw;[F)[Ljava/lang/String;", "o", "", "Lcom/facebook/appevents/ml/ModelManager$a;", "a", "Ljava/util/Map;", "taskHandlers", "", "b", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", "c", "MTML_INTEGRITY_DETECT_PREDICTION", "j", "()Z", "isLocaleEnglish", "Task", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class ModelManager {

    @NotNull
    public static final ModelManager INSTANCE = new ModelManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, C1592a> taskHandlers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"none", PlaceTypes.ADDRESS, PlaceTypes.HEALTH});

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$Task$a */
        @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
        public /* synthetic */ class C1591a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6165a;

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
                f6165a = iArr;
            }
        }

        @NotNull
        public final String toKey() {
            int i = C1591a.f6165a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            nbr.m162172a();
            return null;
        }

        @NotNull
        public final String toUseCase() {
            int i = C1591a.f6165a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            nbr.m162172a();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b\u001b\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0018\u0010.\"\u0004\b/\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, m88121d2 = {"Lcom/facebook/appevents/ml/ModelManager$a;", "", "", "useCase", "assetUri", "ruleUri", "", "versionId", "", "thresholds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "Ljava/lang/Runnable;", "onPostExecute", "j", "(Ljava/lang/Runnable;)Lcom/facebook/appevents/ml/ModelManager$a;", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUseCase", "(Ljava/lang/String;)V", "b", "setAssetUri", "c", "e", "setRuleUri", Constants.INAPP_DATA_TAG, "I", "h", "()I", "setVersionId", "(I)V", "[F", "f", "()[F", "setThresholds", "([F)V", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "k", "(Ljava/io/File;)V", "ruleFile", "Lcom/facebook/appevents/ml/a;", "Lcom/facebook/appevents/ml/a;", "()Lcom/facebook/appevents/ml/a;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/ml/a;)V", "model", "Ljava/lang/Runnable;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1592a {

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
        public C1594a model;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Runnable onPostExecute;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Lcom/facebook/appevents/ml/ModelManager$a$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/facebook/appevents/ml/ModelManager$a;", "c", "(Lorg/json/JSONObject;)Lcom/facebook/appevents/ml/ModelManager$a;", "master", "", "slaves", "", "f", "(Lcom/facebook/appevents/ml/ModelManager$a;Ljava/util/List;)V", "", "useCase", "", "versionId", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;I)V", "uri", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/sii$a;", "onComplete", "e", "(Ljava/lang/String;Ljava/lang/String;Ll/sii$a;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public static void m8016a(C1592a c1592a, C1594a c1594a, File file) {
                c1592a.getClass();
                file.getClass();
                c1592a.m8013i(c1594a);
                c1592a.m8015k(file);
                Runnable runnable = c1592a.onPostExecute;
                if (runnable != null) {
                    runnable.run();
                }
            }

            /* JADX INFO: renamed from: b */
            public static void m8017b(List list, File file) {
                list.getClass();
                file.getClass();
                final C1594a c1594aM8024a = C1594a.INSTANCE.m8024a(file);
                if (c1594aM8024a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final C1592a c1592a = (C1592a) it.next();
                        C1592a.INSTANCE.m8020e(c1592a.getRuleUri(), c1592a.getUseCase() + '_' + c1592a.getVersionId() + "_rule", new sii.InterfaceC20049a() { // from class: l.ye00
                            @Override // p153l.sii.InterfaceC20049a
                            /* JADX INFO: renamed from: a */
                            public final void mo186018a(File file2) {
                                ModelManager.C1592a.Companion.m8016a(c1592a, c1594aM8024a, file2);
                            }
                        });
                    }
                }
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final C1592a m8018c(@Nullable JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    String string = json.getString("use_case");
                    String string2 = json.getString("asset_uri");
                    String strOptString = json.optString("rules_uri", null);
                    int i = json.getInt("version_id");
                    float[] fArrM7992d = ModelManager.m7992d(ModelManager.INSTANCE, json.getJSONArray("thresholds"));
                    string.getClass();
                    string2.getClass();
                    return new C1592a(string, string2, strOptString, i, fArrM7992d);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* JADX INFO: renamed from: d */
            public final void m8019d(String useCase, int versionId) {
                File[] fileArrListFiles;
                File fileM196869a = unk0.m196869a();
                if (fileM196869a == null || (fileArrListFiles = fileM196869a.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str = useCase + '_' + versionId;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (C15493d.m94374J(name, useCase, false, 2, null) && !C15493d.m94374J(name, str, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* JADX INFO: renamed from: e */
            public final void m8020e(String uri, String name, sii.InterfaceC20049a onComplete) {
                File file = new File(unk0.m196869a(), name);
                if (uri == null || file.exists()) {
                    onComplete.mo186018a(file);
                } else {
                    new sii(uri, file, onComplete).execute(new String[0]);
                }
            }

            /* JADX INFO: renamed from: f */
            public final void m8021f(@NotNull C1592a master, @NotNull final List<C1592a> slaves) {
                master.getClass();
                slaves.getClass();
                m8019d(master.getUseCase(), master.getVersionId());
                m8020e(master.getAssetUri(), master.getUseCase() + '_' + master.getVersionId(), new sii.InterfaceC20049a() { // from class: l.xe00
                    @Override // p153l.sii.InterfaceC20049a
                    /* JADX INFO: renamed from: a */
                    public final void mo186018a(File file) {
                        ModelManager.C1592a.Companion.m8017b(slaves, file);
                    }
                });
            }

            public Companion() {
            }
        }

        public C1592a(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @Nullable float[] fArr) {
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
        public final C1594a getModel() {
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
        public final void m8013i(@Nullable C1594a c1594a) {
            this.model = c1594a;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C1592a m8014j(@Nullable Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final void m8015k(@Nullable File file) {
            this.ruleFile = file;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$b */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class C1593b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6174a;

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
            f6174a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7989a() {
        if (ztb.m221490d(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!FeatureManager.m8733g(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !INSTANCE.m8000k(j)) {
                jSONObject = INSTANCE.m7998h();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            ModelManager modelManager = INSTANCE;
            modelManager.m7996e(jSONObject);
            modelManager.m7997g();
        } catch (Exception unused) {
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7990b() {
        if (ztb.m221490d(ModelManager.class)) {
            return;
        }
        try {
            sym.m188573a();
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7991c() {
        if (ztb.m221490d(ModelManager.class)) {
            return;
        }
        try {
            i2h0.m138192b();
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ float[] m7992d(ModelManager modelManager, JSONArray jSONArray) {
        if (ztb.m221490d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.m8001l(jSONArray);
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m7993f() {
        if (ztb.m221490d(ModelManager.class)) {
            return;
        }
        try {
            C1680e.m8860A0(new Runnable() { // from class: l.ue00
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.m7989a();
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final File m7994i(@NotNull Task task) {
        if (ztb.m221490d(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            C1592a c1592a = taskHandlers.get(task.toUseCase());
            if (c1592a == null) {
                return null;
            }
            return c1592a.getRuleFile();
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String[] m7995n(@NotNull Task task, @NotNull float[][] denses, @NotNull String[] texts) {
        C1594a model;
        if (ztb.m221490d(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            denses.getClass();
            texts.getClass();
            C1592a c1592a = taskHandlers.get(task.toUseCase());
            if (c1592a != null && (model = c1592a.getModel()) != null) {
                float[] thresholds = c1592a.getThresholds();
                int length = texts.length;
                int length2 = denses[0].length;
                bqw bqwVar = new bqw(new int[]{length, length2});
                for (int i = 0; i < length; i++) {
                    System.arraycopy(denses[i], 0, bqwVar.getData(), i * length2, length2);
                }
                bqw bqwVarM8023b = model.m8023b(bqwVar, texts, task.toKey());
                if (bqwVarM8023b != null && thresholds != null && bqwVarM8023b.getData().length != 0 && thresholds.length != 0) {
                    int i2 = C1593b.f6174a[task.ordinal()];
                    if (i2 == 1) {
                        return INSTANCE.m8004p(bqwVarM8023b, thresholds);
                    }
                    if (i2 == 2) {
                        return INSTANCE.m8003o(bqwVarM8023b, thresholds);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, ModelManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7996e(JSONObject models) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = models.keys();
            while (itKeys.hasNext()) {
                try {
                    C1592a c1592aM8018c = C1592a.INSTANCE.m8018c(models.getJSONObject(itKeys.next()));
                    if (c1592aM8018c != null) {
                        taskHandlers.put(c1592aM8018c.getUseCase(), c1592aM8018c);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7997g() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String assetUri = null;
            int iMax = 0;
            for (Map.Entry<String, C1592a> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                C1592a value = entry.getValue();
                if (Intrinsics.m88377d(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri2 = value.getAssetUri();
                    int iMax2 = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.m8733g(FeatureManager.Feature.SuggestedEvents) && m7999j()) {
                        arrayList.add(value.m8014j(new Runnable() { // from class: l.ve00
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.m7991c();
                            }
                        }));
                    }
                    assetUri = assetUri2;
                    iMax = iMax2;
                }
                if (Intrinsics.m88377d(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    assetUri = value.getAssetUri();
                    iMax = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.m8733g(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.m8014j(new Runnable() { // from class: l.we00
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.m7990b();
                            }
                        }));
                    }
                }
            }
            if (assetUri == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            C1592a.INSTANCE.m8021f(new C1592a("MTML", assetUri, null, iMax, null), arrayList);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m7998h() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(Constants.SEPARATOR_COMMA, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestM7639x = GraphRequest.INSTANCE.m7639x(null, "app/model_asset", null);
            graphRequestM7639x.m7574G(bundle);
            JSONObject graphObject = graphRequestM7639x.m7579j().getGraphObject();
            if (graphObject == null) {
                return null;
            }
            return m8002m(graphObject);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7999j() {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            Locale localeM8874N = C1680e.m8874N();
            if (localeM8874N == null) {
                return true;
            }
            String language = localeM8874N.getLanguage();
            language.getClass();
            return StringsKt.m94303P(language, "en", false, 2, null);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8000k(long timestamp) {
        if (ztb.m221490d(this) || timestamp == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - timestamp < 259200000;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final float[] m8001l(JSONArray jsonArray) {
        if (ztb.m221490d(this) || jsonArray == null) {
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
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final JSONObject m8002m(JSONObject jsonObject) {
        if (ztb.m221490d(this)) {
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
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final String[] m8003o(bqw res, float[] thresholds) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            int iM106010b = res.m106010b(0);
            int iM106010b2 = res.m106010b(1);
            float[] data = res.getData();
            if (iM106010b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeM88496l = C15274a.m88496l(0, iM106010b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
            Iterator<Integer> it = intRangeM88496l.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * iM106010b2) + i2] >= thresholds[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final String[] m8004p(bqw res, float[] thresholds) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            int iM106010b = res.m106010b(0);
            int iM106010b2 = res.m106010b(1);
            float[] data = res.getData();
            if (iM106010b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeM88496l = C15274a.m88496l(0, iM106010b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
            Iterator<Integer> it = intRangeM88496l.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * iM106010b2) + i2] >= thresholds[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }
}
