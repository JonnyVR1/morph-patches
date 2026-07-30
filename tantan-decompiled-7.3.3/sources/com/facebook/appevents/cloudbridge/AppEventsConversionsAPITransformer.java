package com.facebook.appevents.cloudbridge;

import com.clevertap.android.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1680e;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.l6f;
import p153l.nbr;
import p153l.rzv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048\u001e,9B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\nj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u0001`\f2\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u008b\u0001\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020\u00132\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(JA\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u0010+JQ\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001bH\u0002¢\u0006\u0004\b,\u0010-J\u008f\u0001\u0010.\u001a\u00020\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2.\u0010\u001c\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b`\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u00101R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u00101¨\u0006:"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer;", "", "<init>", "()V", "", "field", "value", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "appEvents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "k", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "userData", "appData", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "", "g", "(Ljava/util/Map;Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "restOfData", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "eventType", "", "customEvents", "eventTime", "a", "(Lcom/facebook/appevents/cloudbridge/AppEventType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "parameters", "e", "(Ljava/util/Map;)Ljava/util/List;", "h", "(Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", RXScreenCaptureService.KEY_INDEX, "input", "j", "(Ljava/lang/String;)Ljava/lang/String;", "commonFields", "c", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;", "b", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "f", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lcom/facebook/appevents/cloudbridge/AppEventType;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "Ljava/util/Map;", "topLevelTransformations", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "customEventTransformations", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "standardEventTransformations", "DataProcessingParameterName", "ValueTransformationType", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AppEventsConversionsAPITransformer {

    @NotNull
    public static final AppEventsConversionsAPITransformer INSTANCE = new AppEventsConversionsAPITransformer();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<AppEventUserAndAppDataField, C1567b> topLevelTransformations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<CustomEventField, C1566a> customEventTransformations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations;

    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", HttpMethods.OPTIONS, "COUNTRY", "STATE", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String rawValue;

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$a;", "", "<init>", "()V", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "a", "(Ljava/lang/String;)Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final DataProcessingParameterName m7734a(@NotNull String rawValue) {
                rawValue.getClass();
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (Intrinsics.m88377d(dataProcessingParameterName.getRawValue(), rawValue)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }

            public Companion() {
            }
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        @NotNull
        public final String getRawValue() {
            return this.rawValue;
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ARRAY", "BOOL", "INT", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType$a;", "", "<init>", "()V", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "a", "(Ljava/lang/String;)Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final ValueTransformationType m7735a(@NotNull String rawValue) {
                rawValue.getClass();
                if (Intrinsics.m88377d(rawValue, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m88377d(rawValue, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m88377d(rawValue, CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m88377d(rawValue, CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m88377d(rawValue, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m88377d(rawValue, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.m88377d(rawValue, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.m88377d(rawValue, CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C1566a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public ConversionsAPICustomEventField field;

        public C1566a(@Nullable ConversionsAPISection conversionsAPISection, @NotNull ConversionsAPICustomEventField conversionsAPICustomEventField) {
            conversionsAPICustomEventField.getClass();
            this.section = conversionsAPISection;
            this.field = conversionsAPICustomEventField;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1566a)) {
                return false;
            }
            C1566a c1566a = (C1566a) other;
            return this.section == c1566a.section && this.field == c1566a.field;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.section;
            return ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31) + this.field.hashCode();
        }

        @NotNull
        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C1567b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ConversionsAPIUserAndAppDataField field;

        public C1567b(@NotNull ConversionsAPISection conversionsAPISection, @Nullable ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            conversionsAPISection.getClass();
            this.section = conversionsAPISection;
            this.field = conversionsAPIUserAndAppDataField;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1567b)) {
                return false;
            }
            C1567b c1567b = (C1567b) other;
            return this.section == c1567b.section && this.field == c1567b.field;
        }

        public int hashCode() {
            int iHashCode = this.section.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        @NotNull
        public String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$c */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class C1568c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5994a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5995b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f5996c;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            try {
                iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTransformationType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5994a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f5995b = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f5996c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair pairM88129a = TuplesKt.m88129a(appEventUserAndAppDataField, new C1567b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair pairM88129a2 = TuplesKt.m88129a(AppEventUserAndAppDataField.APP_USER_ID, new C1567b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair pairM88129a3 = TuplesKt.m88129a(AppEventUserAndAppDataField.ADVERTISER_ID, new C1567b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair pairM88129a4 = TuplesKt.m88129a(AppEventUserAndAppDataField.PAGE_ID, new C1567b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair pairM88129a5 = TuplesKt.m88129a(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new C1567b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, pairM88129a4, pairM88129a5, TuplesKt.m88129a(appEventUserAndAppDataField2, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), TuplesKt.m88129a(AppEventUserAndAppDataField.APP_TE, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), TuplesKt.m88129a(AppEventUserAndAppDataField.CONSIDER_VIEWS, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), TuplesKt.m88129a(AppEventUserAndAppDataField.DEVICE_TOKEN, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), TuplesKt.m88129a(AppEventUserAndAppDataField.EXT_INFO, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), TuplesKt.m88129a(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), TuplesKt.m88129a(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), TuplesKt.m88129a(AppEventUserAndAppDataField.INSTALL_REFERRER, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), TuplesKt.m88129a(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), TuplesKt.m88129a(AppEventUserAndAppDataField.RECEIPT_DATA, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), TuplesKt.m88129a(AppEventUserAndAppDataField.URL_SCHEMES, new C1567b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), TuplesKt.m88129a(AppEventUserAndAppDataField.USER_DATA, new C1567b(conversionsAPISection, null)));
        Pair pairM88129a6 = TuplesKt.m88129a(CustomEventField.EVENT_TIME, new C1566a(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pairM88129a7 = TuplesKt.m88129a(CustomEventField.EVENT_NAME, new C1566a(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = MapsKt.mapOf(pairM88129a6, pairM88129a7, TuplesKt.m88129a(customEventField, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), TuplesKt.m88129a(CustomEventField.CONTENT_IDS, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), TuplesKt.m88129a(CustomEventField.CONTENTS, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), TuplesKt.m88129a(CustomEventField.CONTENT_TYPE, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), TuplesKt.m88129a(CustomEventField.CURRENCY, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), TuplesKt.m88129a(CustomEventField.DESCRIPTION, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), TuplesKt.m88129a(CustomEventField.LEVEL, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), TuplesKt.m88129a(CustomEventField.MAX_RATING_VALUE, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), TuplesKt.m88129a(CustomEventField.NUM_ITEMS, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), TuplesKt.m88129a(CustomEventField.PAYMENT_INFO_AVAILABLE, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), TuplesKt.m88129a(CustomEventField.REGISTRATION_METHOD, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), TuplesKt.m88129a(CustomEventField.SEARCH_STRING, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), TuplesKt.m88129a(CustomEventField.SUCCESS, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), TuplesKt.m88129a(CustomEventField.ORDER_ID, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), TuplesKt.m88129a(CustomEventField.AD_TYPE, new C1566a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        standardEventTransformations = MapsKt.mapOf(TuplesKt.m88129a("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), TuplesKt.m88129a("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), TuplesKt.m88129a("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), TuplesKt.m88129a("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), TuplesKt.m88129a("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), TuplesKt.m88129a("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), TuplesKt.m88129a("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), TuplesKt.m88129a("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), TuplesKt.m88129a("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), TuplesKt.m88129a("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), TuplesKt.m88129a("fb_mobile_rate", ConversionsAPIEventName.RATED), TuplesKt.m88129a("fb_mobile_search", ConversionsAPIEventName.SEARCHED), TuplesKt.m88129a("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), TuplesKt.m88129a("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final ArrayList<Map<String, Object>> m7722k(@NotNull String appEvents) {
        appEvents.getClass();
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator<T> it = C1680e.m8904n(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(C1680e.m8906o(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    CustomEventField customEventFieldM7756a = CustomEventField.INSTANCE.m7756a(str);
                    C1566a c1566a = customEventTransformations.get(customEventFieldM7756a);
                    if (customEventFieldM7756a != null && c1566a != null) {
                        ConversionsAPISection section = c1566a.getSection();
                        if (section == null) {
                            try {
                                String rawValue = c1566a.getField().getRawValue();
                                if (customEventFieldM7756a == CustomEventField.EVENT_NAME && ((String) map.get(str)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    Object obj = map.get(str);
                                    obj.getClass();
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.m7733j((String) obj));
                                } else if (customEventFieldM7756a == CustomEventField.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    obj2.getClass();
                                    Object objM7723l = m7723l(str, obj2);
                                    objM7723l.getClass();
                                    linkedHashMap2.put(rawValue, objM7723l);
                                }
                            } catch (ClassCastException e) {
                                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", l6f.m153059b(e));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = c1566a.getField().getRawValue();
                            Object obj3 = map.get(str);
                            obj3.getClass();
                            Object objM7723l2 = m7723l(str, obj3);
                            objM7723l2.getClass();
                            linkedHashMap.put(rawValue2, objM7723l2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e2) {
            rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final Object m7723l(@NotNull String field, @NotNull Object value) {
        field.getClass();
        value.getClass();
        ValueTransformationType valueTransformationTypeM7735a = ValueTransformationType.INSTANCE.m7735a(field);
        String str = value instanceof String ? (String) value : null;
        if (valueTransformationTypeM7735a == null || str == null) {
            return value;
        }
        int i = C1568c.f5994a[valueTransformationTypeM7735a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                nbr.m162172a();
                return null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            List<String> listM8904n = C1680e.m8904n(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = listM8904n.iterator();
            while (it.hasNext()) {
                ?? M8904n = (String) it.next();
                try {
                    try {
                        M8904n = C1680e.m8906o(new JSONObject((String) M8904n));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    M8904n = C1680e.m8904n(new JSONArray((String) M8904n));
                }
                arrayList.add(M8904n);
            }
            return arrayList;
        } catch (JSONException e) {
            rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<Map<String, Object>> m7724a(@NotNull AppEventType eventType, @NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull Map<String, Object> restOfData, @NotNull List<? extends Map<String, ? extends Object>> customEvents, @Nullable Object eventTime) {
        eventType.getClass();
        userData.getClass();
        appData.getClass();
        restOfData.getClass();
        customEvents.getClass();
        Map<String, Object> mapM7727d = m7727d(userData, appData, restOfData);
        int i = C1568c.f5996c[eventType.ordinal()];
        if (i == 1) {
            return m7726c(mapM7727d, eventTime);
        }
        if (i != 2) {
            return null;
        }
        return m7725b(mapM7727d, customEvents);
    }

    /* JADX INFO: renamed from: b */
    public final List<Map<String, Object>> m7725b(Map<String, ? extends Object> commonFields, List<? extends Map<String, ? extends Object>> customEvents) {
        if (customEvents.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = customEvents.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(commonFields);
            linkedHashMap.putAll(map);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<Map<String, Object>> m7726c(Map<String, ? extends Object> commonFields, Object eventTime) {
        if (eventTime == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(commonFields);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), eventTime);
        return CollectionsKt.listOf(linkedHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m7727d(@NotNull Map<String, ? extends Object> userData, @NotNull Map<String, ? extends Object> appData, @NotNull Map<String, ? extends Object> restOfData) {
        userData.getClass();
        appData.getClass();
        restOfData.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), userData);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final List<Map<String, Object>> m7728e(@NotNull Map<String, ? extends Object> parameters) {
        parameters.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType appEventTypeM7729f = m7729f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (appEventTypeM7729f == AppEventType.OTHER) {
            return null;
        }
        return m7724a(appEventTypeM7729f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    /* JADX INFO: renamed from: f */
    public final AppEventType m7729f(Map<String, ? extends Object> parameters, Map<String, Object> userData, Map<String, Object> appData, ArrayList<Map<String, Object>> customEvents, Map<String, Object> restOfData) {
        Object obj = parameters.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.INSTANCE;
        obj.getClass();
        AppEventType appEventTypeM7720a = companion.m7720a((String) obj);
        if (appEventTypeM7720a != AppEventType.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                AppEventUserAndAppDataField appEventUserAndAppDataFieldM7721a = AppEventUserAndAppDataField.INSTANCE.m7721a(key);
                if (appEventUserAndAppDataFieldM7721a != null) {
                    INSTANCE.m7730g(userData, appData, appEventUserAndAppDataFieldM7721a, value);
                } else {
                    boolean zM88377d = Intrinsics.m88377d(key, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z = value instanceof String;
                    if (appEventTypeM7720a == AppEventType.CUSTOM && zM88377d && z) {
                        ArrayList<Map<String, Object>> arrayListM7722k = m7722k((String) value);
                        if (arrayListM7722k != null) {
                            customEvents.addAll(arrayListM7722k);
                        }
                    } else if (DataProcessingParameterName.INSTANCE.m7734a(key) != null) {
                        restOfData.put(key, value);
                    }
                }
            }
        }
        return appEventTypeM7720a;
    }

    /* JADX INFO: renamed from: g */
    public final void m7730g(@NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull AppEventUserAndAppDataField field, @NotNull Object value) {
        ConversionsAPISection section;
        userData.getClass();
        appData.getClass();
        field.getClass();
        value.getClass();
        C1567b c1567b = topLevelTransformations.get(field);
        if (c1567b == null || (section = c1567b.getSection()) == null) {
            return;
        }
        int i = C1568c.f5995b[section.ordinal()];
        if (i == 1) {
            m7731h(appData, field, value);
        } else {
            if (i != 2) {
                return;
            }
            m7732i(userData, field, value);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7731h(Map<String, Object> appData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        C1567b c1567b = topLevelTransformations.get(field);
        if (c1567b == null || (field2 = c1567b.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        appData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m7732i(Map<String, Object> userData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        if (field == AppEventUserAndAppDataField.USER_DATA) {
            try {
                value.getClass();
                userData.putAll(C1680e.m8906o(new JSONObject((String) value)));
                return;
            } catch (JSONException e) {
                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
                return;
            }
        }
        C1567b c1567b = topLevelTransformations.get(field);
        if (c1567b == null || (field2 = c1567b.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        userData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: j */
    public final String m7733j(String input) {
        String rawValue;
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(input)) {
            return input;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(input);
        return (conversionsAPIEventName == null || (rawValue = conversionsAPIEventName.getRawValue()) == null) ? "" : rawValue;
    }
}
