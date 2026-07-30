package com.facebook.appevents.cloudbridge;

import com.clevertap.android.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.h5f;
import p149l.l9r;
import p149l.uxv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048\u001e,9B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\nj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u0001`\f2\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u008b\u0001\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020\u00132\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(JA\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u0010+JQ\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001bH\u0002¢\u0006\u0004\b,\u0010-J\u008f\u0001\u0010.\u001a\u00020\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2.\u0010\u001c\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b`\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u00101R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u00101¨\u0006:"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer;", "", "<init>", "()V", "", "field", "value", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "appEvents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "k", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "userData", "appData", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "", "g", "(Ljava/util/Map;Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "restOfData", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "eventType", "", "customEvents", "eventTime", "a", "(Lcom/facebook/appevents/cloudbridge/AppEventType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "parameters", "e", "(Ljava/util/Map;)Ljava/util/List;", "h", "(Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", RXScreenCaptureService.KEY_INDEX, "input", "j", "(Ljava/lang/String;)Ljava/lang/String;", "commonFields", "c", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;", "b", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "f", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lcom/facebook/appevents/cloudbridge/AppEventType;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "Ljava/util/Map;", "topLevelTransformations", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "customEventTransformations", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "standardEventTransformations", "DataProcessingParameterName", "ValueTransformationType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AppEventsConversionsAPITransformer {

    @NotNull
    public static final AppEventsConversionsAPITransformer INSTANCE = new AppEventsConversionsAPITransformer();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<AppEventUserAndAppDataField, C1544b> topLevelTransformations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<CustomEventField, C1543a> customEventTransformations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations;

    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", HttpMethods.OPTIONS, "COUNTRY", "STATE", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
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
        @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$a;", "", "<init>", "()V", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "a", "(Ljava/lang/String;)Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final DataProcessingParameterName m7680a(@NotNull String rawValue) {
                rawValue.getClass();
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (Intrinsics.m87488d(dataProcessingParameterName.getRawValue(), rawValue)) {
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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ARRAY", "BOOL", "INT", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType$a;", "", "<init>", "()V", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "a", "(Ljava/lang/String;)Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final ValueTransformationType m7681a(@NotNull String rawValue) {
                rawValue.getClass();
                if (Intrinsics.m87488d(rawValue, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m87488d(rawValue, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m87488d(rawValue, CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m87488d(rawValue, CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m87488d(rawValue, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.m87488d(rawValue, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.m87488d(rawValue, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.m87488d(rawValue, CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final /* data */ class C1543a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public ConversionsAPICustomEventField field;

        public C1543a(@Nullable ConversionsAPISection conversionsAPISection, @NotNull ConversionsAPICustomEventField conversionsAPICustomEventField) {
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
            if (!(other instanceof C1543a)) {
                return false;
            }
            C1543a c1543a = (C1543a) other;
            return this.section == c1543a.section && this.field == c1543a.field;
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
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final /* data */ class C1544b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ConversionsAPIUserAndAppDataField field;

        public C1544b(@NotNull ConversionsAPISection conversionsAPISection, @Nullable ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
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
            if (!(other instanceof C1544b)) {
                return false;
            }
            C1544b c1544b = (C1544b) other;
            return this.section == c1544b.section && this.field == c1544b.field;
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
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C1545c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5957a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5958b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f5959c;

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
            f5957a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f5958b = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f5959c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair pairM87240a = TuplesKt.m87240a(appEventUserAndAppDataField, new C1544b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair pairM87240a2 = TuplesKt.m87240a(AppEventUserAndAppDataField.APP_USER_ID, new C1544b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair pairM87240a3 = TuplesKt.m87240a(AppEventUserAndAppDataField.ADVERTISER_ID, new C1544b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair pairM87240a4 = TuplesKt.m87240a(AppEventUserAndAppDataField.PAGE_ID, new C1544b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair pairM87240a5 = TuplesKt.m87240a(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new C1544b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = MapsKt.mapOf(pairM87240a, pairM87240a2, pairM87240a3, pairM87240a4, pairM87240a5, TuplesKt.m87240a(appEventUserAndAppDataField2, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), TuplesKt.m87240a(AppEventUserAndAppDataField.APP_TE, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), TuplesKt.m87240a(AppEventUserAndAppDataField.CONSIDER_VIEWS, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), TuplesKt.m87240a(AppEventUserAndAppDataField.DEVICE_TOKEN, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), TuplesKt.m87240a(AppEventUserAndAppDataField.EXT_INFO, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), TuplesKt.m87240a(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), TuplesKt.m87240a(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), TuplesKt.m87240a(AppEventUserAndAppDataField.INSTALL_REFERRER, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), TuplesKt.m87240a(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), TuplesKt.m87240a(AppEventUserAndAppDataField.RECEIPT_DATA, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), TuplesKt.m87240a(AppEventUserAndAppDataField.URL_SCHEMES, new C1544b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), TuplesKt.m87240a(AppEventUserAndAppDataField.USER_DATA, new C1544b(conversionsAPISection, null)));
        Pair pairM87240a6 = TuplesKt.m87240a(CustomEventField.EVENT_TIME, new C1543a(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pairM87240a7 = TuplesKt.m87240a(CustomEventField.EVENT_NAME, new C1543a(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = MapsKt.mapOf(pairM87240a6, pairM87240a7, TuplesKt.m87240a(customEventField, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), TuplesKt.m87240a(CustomEventField.CONTENT_IDS, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), TuplesKt.m87240a(CustomEventField.CONTENTS, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), TuplesKt.m87240a(CustomEventField.CONTENT_TYPE, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), TuplesKt.m87240a(CustomEventField.CURRENCY, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), TuplesKt.m87240a(CustomEventField.DESCRIPTION, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), TuplesKt.m87240a(CustomEventField.LEVEL, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), TuplesKt.m87240a(CustomEventField.MAX_RATING_VALUE, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), TuplesKt.m87240a(CustomEventField.NUM_ITEMS, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), TuplesKt.m87240a(CustomEventField.PAYMENT_INFO_AVAILABLE, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), TuplesKt.m87240a(CustomEventField.REGISTRATION_METHOD, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), TuplesKt.m87240a(CustomEventField.SEARCH_STRING, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), TuplesKt.m87240a(CustomEventField.SUCCESS, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), TuplesKt.m87240a(CustomEventField.ORDER_ID, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), TuplesKt.m87240a(CustomEventField.AD_TYPE, new C1543a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        standardEventTransformations = MapsKt.mapOf(TuplesKt.m87240a("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), TuplesKt.m87240a("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), TuplesKt.m87240a("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), TuplesKt.m87240a("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), TuplesKt.m87240a("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), TuplesKt.m87240a("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), TuplesKt.m87240a("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), TuplesKt.m87240a("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), TuplesKt.m87240a("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), TuplesKt.m87240a("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), TuplesKt.m87240a("fb_mobile_rate", ConversionsAPIEventName.RATED), TuplesKt.m87240a("fb_mobile_search", ConversionsAPIEventName.SEARCHED), TuplesKt.m87240a("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), TuplesKt.m87240a("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final ArrayList<Map<String, Object>> m7668k(@NotNull String appEvents) {
        appEvents.getClass();
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator<T> it = C1657e.m8850n(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(C1657e.m8852o(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    CustomEventField customEventFieldM7702a = CustomEventField.INSTANCE.m7702a(str);
                    C1543a c1543a = customEventTransformations.get(customEventFieldM7702a);
                    if (customEventFieldM7702a != null && c1543a != null) {
                        ConversionsAPISection section = c1543a.getSection();
                        if (section == null) {
                            try {
                                String rawValue = c1543a.getField().getRawValue();
                                if (customEventFieldM7702a == CustomEventField.EVENT_NAME && ((String) map.get(str)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    Object obj = map.get(str);
                                    obj.getClass();
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.m7679j((String) obj));
                                } else if (customEventFieldM7702a == CustomEventField.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    obj2.getClass();
                                    Object objM7669l = m7669l(str, obj2);
                                    objM7669l.getClass();
                                    linkedHashMap2.put(rawValue, objM7669l);
                                }
                            } catch (ClassCastException e) {
                                uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", h5f.m129396b(e));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = c1543a.getField().getRawValue();
                            Object obj3 = map.get(str);
                            obj3.getClass();
                            Object objM7669l2 = m7669l(str, obj3);
                            objM7669l2.getClass();
                            linkedHashMap.put(rawValue2, objM7669l2);
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
            uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e2);
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
    public static final Object m7669l(@NotNull String field, @NotNull Object value) {
        field.getClass();
        value.getClass();
        ValueTransformationType valueTransformationTypeM7681a = ValueTransformationType.INSTANCE.m7681a(field);
        String str = value instanceof String ? (String) value : null;
        if (valueTransformationTypeM7681a == null || str == null) {
            return value;
        }
        int i = C1545c.f5957a[valueTransformationTypeM7681a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                l9r.m149037a();
                return null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            List<String> listM8850n = C1657e.m8850n(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = listM8850n.iterator();
            while (it.hasNext()) {
                ?? M8850n = (String) it.next();
                try {
                    try {
                        M8850n = C1657e.m8852o(new JSONObject((String) M8850n));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    M8850n = C1657e.m8850n(new JSONArray((String) M8850n));
                }
                arrayList.add(M8850n);
            }
            return arrayList;
        } catch (JSONException e) {
            uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<Map<String, Object>> m7670a(@NotNull AppEventType eventType, @NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull Map<String, Object> restOfData, @NotNull List<? extends Map<String, ? extends Object>> customEvents, @Nullable Object eventTime) {
        eventType.getClass();
        userData.getClass();
        appData.getClass();
        restOfData.getClass();
        customEvents.getClass();
        Map<String, Object> mapM7673d = m7673d(userData, appData, restOfData);
        int i = C1545c.f5959c[eventType.ordinal()];
        if (i == 1) {
            return m7672c(mapM7673d, eventTime);
        }
        if (i != 2) {
            return null;
        }
        return m7671b(mapM7673d, customEvents);
    }

    /* JADX INFO: renamed from: b */
    public final List<Map<String, Object>> m7671b(Map<String, ? extends Object> commonFields, List<? extends Map<String, ? extends Object>> customEvents) {
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
    public final List<Map<String, Object>> m7672c(Map<String, ? extends Object> commonFields, Object eventTime) {
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
    public final Map<String, Object> m7673d(@NotNull Map<String, ? extends Object> userData, @NotNull Map<String, ? extends Object> appData, @NotNull Map<String, ? extends Object> restOfData) {
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
    public final List<Map<String, Object>> m7674e(@NotNull Map<String, ? extends Object> parameters) {
        parameters.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType appEventTypeM7675f = m7675f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (appEventTypeM7675f == AppEventType.OTHER) {
            return null;
        }
        return m7670a(appEventTypeM7675f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    /* JADX INFO: renamed from: f */
    public final AppEventType m7675f(Map<String, ? extends Object> parameters, Map<String, Object> userData, Map<String, Object> appData, ArrayList<Map<String, Object>> customEvents, Map<String, Object> restOfData) {
        Object obj = parameters.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.INSTANCE;
        obj.getClass();
        AppEventType appEventTypeM7666a = companion.m7666a((String) obj);
        if (appEventTypeM7666a != AppEventType.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                AppEventUserAndAppDataField appEventUserAndAppDataFieldM7667a = AppEventUserAndAppDataField.INSTANCE.m7667a(key);
                if (appEventUserAndAppDataFieldM7667a != null) {
                    INSTANCE.m7676g(userData, appData, appEventUserAndAppDataFieldM7667a, value);
                } else {
                    boolean zM87488d = Intrinsics.m87488d(key, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z = value instanceof String;
                    if (appEventTypeM7666a == AppEventType.CUSTOM && zM87488d && z) {
                        ArrayList<Map<String, Object>> arrayListM7668k = m7668k((String) value);
                        if (arrayListM7668k != null) {
                            customEvents.addAll(arrayListM7668k);
                        }
                    } else if (DataProcessingParameterName.INSTANCE.m7680a(key) != null) {
                        restOfData.put(key, value);
                    }
                }
            }
        }
        return appEventTypeM7666a;
    }

    /* JADX INFO: renamed from: g */
    public final void m7676g(@NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull AppEventUserAndAppDataField field, @NotNull Object value) {
        ConversionsAPISection section;
        userData.getClass();
        appData.getClass();
        field.getClass();
        value.getClass();
        C1544b c1544b = topLevelTransformations.get(field);
        if (c1544b == null || (section = c1544b.getSection()) == null) {
            return;
        }
        int i = C1545c.f5958b[section.ordinal()];
        if (i == 1) {
            m7677h(appData, field, value);
        } else {
            if (i != 2) {
                return;
            }
            m7678i(userData, field, value);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7677h(Map<String, Object> appData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        C1544b c1544b = topLevelTransformations.get(field);
        if (c1544b == null || (field2 = c1544b.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        appData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m7678i(Map<String, Object> userData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        if (field == AppEventUserAndAppDataField.USER_DATA) {
            try {
                value.getClass();
                userData.putAll(C1657e.m8852o(new JSONObject((String) value)));
                return;
            } catch (JSONException e) {
                uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
                return;
            }
        }
        C1544b c1544b = topLevelTransformations.get(field);
        if (c1544b == null || (field2 = c1544b.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        userData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: j */
    public final String m7679j(String input) {
        String rawValue;
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(input)) {
            return input;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(input);
        return (conversionsAPIEventName == null || (rawValue = conversionsAPIEventName.getRawValue()) == null) ? "" : rawValue;
    }
}
