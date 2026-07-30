package com.facebook.appevents;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.FacebookException;
import com.heytap.mcssdk.mode.CommandMessage;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.appevents.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Lcom/facebook/appevents/g;", "", "<init>", "()V", "c", "()Lcom/facebook/appevents/g;", "Lcom/facebook/appevents/OperationalDataEnum;", "type", "", Constants.KEY_KEY, "value", "", "b", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/Object;)V", Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "a", "Ljava/util/Map;", "operationalData", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1578g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f6041b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f6042c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> f6043d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    /* JADX INFO: renamed from: com.facebook.appevents.g$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR8\u0010\u001f\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u00140\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Lcom/facebook/appevents/g$a;", "", "<init>", "()V", "Lcom/facebook/appevents/OperationalDataEnum;", "typeOfParameter", "", "parameter", "Lcom/facebook/appevents/ParameterClassification;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;)Lcom/facebook/appevents/ParameterClassification;", Constants.KEY_KEY, "value", "Landroid/os/Bundle;", "customEventsParams", "Lcom/facebook/appevents/g;", "operationalData", "", "a", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "Lkotlin/Pair;", "b", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/g;)Lkotlin/Pair;", CommandMessage.PARAMS, "c", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/g;)Ljava/lang/Object;", "", "iapOperationalAndCustomParameters", "Ljava/util/Set;", "iapOperationalParameters", "", "parameterClassifications", "Ljava/util/Map;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.appevents.g$a$a, reason: collision with other inner class name */
        @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
        public /* synthetic */ class C22786a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6045a;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f6045a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m7846a(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @NotNull String value, @NotNull Bundle customEventsParams, @NotNull C1578g operationalData) {
            typeOfParameter.getClass();
            key.getClass();
            value.getClass();
            customEventsParams.getClass();
            operationalData.getClass();
            int i = C22786a.f6045a[m7849d(typeOfParameter, key).ordinal()];
            if (i == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i == 2) {
                operationalData.m7842b(typeOfParameter, key, value);
            } else {
                if (i != 3) {
                    return;
                }
                operationalData.m7842b(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Pair<Bundle, C1578g> m7847b(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @NotNull String value, @Nullable Bundle customEventsParams, @Nullable C1578g operationalData) {
            typeOfParameter.getClass();
            key.getClass();
            value.getClass();
            int i = C22786a.f6045a[m7849d(typeOfParameter, key).ordinal()];
            if (i == 1) {
                if (customEventsParams == null) {
                    customEventsParams = new Bundle();
                }
                customEventsParams.putCharSequence(key, value);
            } else if (i == 2) {
                if (operationalData == null) {
                    operationalData = new C1578g();
                }
                operationalData.m7842b(typeOfParameter, key, value);
            } else if (i == 3) {
                if (operationalData == null) {
                    operationalData = new C1578g();
                }
                if (customEventsParams == null) {
                    customEventsParams = new Bundle();
                }
                operationalData.m7842b(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
            return new Pair<>(customEventsParams, operationalData);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m7848c(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @Nullable Bundle params, @Nullable C1578g operationalData) {
            typeOfParameter.getClass();
            key.getClass();
            Object objM7844d = operationalData != null ? operationalData.m7844d(typeOfParameter, key) : null;
            return objM7844d == null ? params != null ? params.getCharSequence(key) : null : objM7844d;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final ParameterClassification m7849d(@NotNull OperationalDataEnum typeOfParameter, @NotNull String parameter) {
            typeOfParameter.getClass();
            parameter.getClass();
            Pair pair = (Pair) C1578g.f6043d.get(typeOfParameter);
            Set set = pair != null ? (Set) pair.getFirst() : null;
            Pair pair2 = (Pair) C1578g.f6043d.get(typeOfParameter);
            Set set2 = pair2 != null ? (Set) pair2.getSecond() : null;
            if (set == null || !set.contains(parameter)) {
                return (set2 == null || !set2.contains(parameter)) ? ParameterClassification.CustomData : ParameterClassification.CustomAndOperationalData;
            }
            return ParameterClassification.OperationalData;
        }

        public Companion() {
        }
    }

    static {
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        f6041b = of;
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        f6042c = of2;
        f6043d = MapsKt.mapOf(TuplesKt.m88129a(OperationalDataEnum.IAPParameters, new Pair(of, of2)));
    }

    /* JADX INFO: renamed from: b */
    public final void m7842b(@NotNull OperationalDataEnum type, @NotNull String key, @NotNull Object value) {
        type.getClass();
        key.getClass();
        value.getClass();
        try {
            AppEvent.INSTANCE.m7694a(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2)));
            }
            if (!this.operationalData.containsKey(type)) {
                this.operationalData.put(type, new LinkedHashMap());
            }
            Map<String, Object> map = this.operationalData.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C1578g m7843c() {
        C1578g c1578g = new C1578g();
        for (OperationalDataEnum operationalDataEnum : this.operationalData.keySet()) {
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        c1578g.m7842b(operationalDataEnum, str, obj);
                    }
                }
            }
        }
        return c1578g;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m7844d(@NotNull OperationalDataEnum type, @NotNull String key) {
        Map<String, Object> map;
        type.getClass();
        key.getClass();
        if (this.operationalData.containsKey(type) && (map = this.operationalData.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JSONObject m7845e() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
