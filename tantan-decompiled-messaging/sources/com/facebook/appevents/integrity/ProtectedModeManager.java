package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.appsflyer.AdRevenueScheme;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p149l.lsb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J-\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/facebook/appevents/integrity/ProtectedModeManager;", "", "<init>", "()V", "", "b", "", Constants.INAPP_DATA_TAG, "()Z", "Landroid/os/Bundle;", "parameters", "f", "(Landroid/os/Bundle;)V", "g", "(Landroid/os/Bundle;)Z", "e", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "a", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "Z", "enabled", "Lkotlin/Lazy;", "c", "()Ljava/util/HashSet;", "defaultStandardParameterNames", "Ljava/util/HashSet;", "standardParams", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ProtectedModeManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static HashSet<String> standardParams;

    @NotNull
    public static final ProtectedModeManager INSTANCE = new ProtectedModeManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy defaultStandardParameterNames = LazyKt__LazyJVMKt.m87229b(new Function0<HashSet<String>>() { // from class: com.facebook.appevents.integrity.ProtectedModeManager$defaultStandardParameterNames$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final HashSet<String> invoke() {
            return SetsKt.hashSetOf("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", AdRevenueScheme.AD_TYPE, "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    });

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m7917b() {
        if (lsb.m151554d(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.m7922e();
        } catch (Throwable th) {
            lsb.m151552b(th, ProtectedModeManager.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m7918d() {
        if (lsb.m151554d(ProtectedModeManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th) {
            lsb.m151552b(th, ProtectedModeManager.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m7919f(@Nullable Bundle parameters) {
        if (lsb.m151554d(ProtectedModeManager.class)) {
            return;
        }
        try {
            if (enabled && parameters != null && !parameters.isEmpty() && standardParams != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = parameters.keySet();
                setKeySet.getClass();
                for (String str : setKeySet) {
                    HashSet<String> hashSet = standardParams;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        str.getClass();
                        arrayList.add(str);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
                parameters.putString("pm", "1");
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ProtectedModeManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public final HashSet<String> m7920a(JSONArray jsonArray) {
        if (!lsb.m151554d(this) && jsonArray != null) {
            try {
                if (jsonArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jsonArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jsonArray.getString(i);
                        string.getClass();
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final HashSet<String> m7921c() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return (HashSet) defaultStandardParameterNames.getValue();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7922e() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null) {
                return;
            }
            HashSet<String> hashSetM7920a = m7920a(c1656dM8693r.getProtectedModeStandardParamsSetting());
            if (hashSetM7920a == null) {
                hashSetM7920a = m7921c();
            }
            standardParams = hashSetM7920a;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7923g(@Nullable Bundle parameters) {
        if (lsb.m151554d(this) || parameters == null) {
            return false;
        }
        try {
            return parameters.containsKey("pm") && Intrinsics.m87488d(parameters.get("pm"), "1");
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
