package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p149l.e0y0;
import p149l.phg0;
import p149l.tfi0;
import p149l.tpu0;

/* JADX INFO: loaded from: classes7.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final tpu0 zzb;
    private ExecutorService zzc;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public static class Event {

        @NonNull
        public static final String ADD_PAYMENT_INFO = "add_payment_info";

        @NonNull
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";

        @NonNull
        public static final String ADD_TO_CART = "add_to_cart";

        @NonNull
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";

        @NonNull
        public static final String AD_IMPRESSION = "ad_impression";

        @NonNull
        public static final String APP_OPEN = "app_open";

        @NonNull
        public static final String BEGIN_CHECKOUT = "begin_checkout";

        @NonNull
        public static final String CAMPAIGN_DETAILS = "campaign_details";

        @NonNull
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";

        @NonNull
        public static final String GENERATE_LEAD = "generate_lead";

        @NonNull
        public static final String JOIN_GROUP = "join_group";

        @NonNull
        public static final String LEVEL_END = "level_end";

        @NonNull
        public static final String LEVEL_START = "level_start";

        @NonNull
        public static final String LEVEL_UP = "level_up";

        @NonNull
        public static final String LOGIN = "login";

        @NonNull
        public static final String POST_SCORE = "post_score";

        @NonNull
        public static final String PURCHASE = "purchase";

        @NonNull
        public static final String REFUND = "refund";

        @NonNull
        public static final String REMOVE_FROM_CART = "remove_from_cart";

        @NonNull
        public static final String SCREEN_VIEW = "screen_view";

        @NonNull
        public static final String SEARCH = "search";

        @NonNull
        public static final String SELECT_CONTENT = "select_content";

        @NonNull
        public static final String SELECT_ITEM = "select_item";

        @NonNull
        public static final String SELECT_PROMOTION = "select_promotion";

        @NonNull
        public static final String SHARE = "share";

        @NonNull
        public static final String SIGN_UP = "sign_up";

        @NonNull
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";

        @NonNull
        public static final String TUTORIAL_BEGIN = "tutorial_begin";

        @NonNull
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";

        @NonNull
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";

        @NonNull
        public static final String VIEW_CART = "view_cart";

        @NonNull
        public static final String VIEW_ITEM = "view_item";

        @NonNull
        public static final String VIEW_ITEM_LIST = "view_item_list";

        @NonNull
        public static final String VIEW_PROMOTION = "view_promotion";

        @NonNull
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";
    }

    public static class Param {

        @NonNull
        public static final String ACHIEVEMENT_ID = "achievement_id";

        @NonNull
        public static final String ACLID = "aclid";

        @NonNull
        public static final String AD_FORMAT = "ad_format";

        @NonNull
        public static final String AD_PLATFORM = "ad_platform";

        @NonNull
        public static final String AD_SOURCE = "ad_source";

        @NonNull
        public static final String AD_UNIT_NAME = "ad_unit_name";

        @NonNull
        public static final String AFFILIATION = "affiliation";

        @NonNull
        public static final String CAMPAIGN = "campaign";

        @NonNull
        public static final String CAMPAIGN_ID = "campaign_id";

        @NonNull
        public static final String CHARACTER = "character";

        @NonNull
        public static final String CONTENT = "content";

        @NonNull
        public static final String CONTENT_TYPE = "content_type";

        @NonNull
        public static final String COUPON = "coupon";

        @NonNull
        public static final String CP1 = "cp1";

        @NonNull
        public static final String CREATIVE_FORMAT = "creative_format";

        @NonNull
        public static final String CREATIVE_NAME = "creative_name";

        @NonNull
        public static final String CREATIVE_SLOT = "creative_slot";

        @NonNull
        public static final String CURRENCY = "currency";

        @NonNull
        public static final String DESTINATION = "destination";

        @NonNull
        public static final String DISCOUNT = "discount";

        @NonNull
        public static final String END_DATE = "end_date";

        @NonNull
        public static final String EXTEND_SESSION = "extend_session";

        @NonNull
        public static final String FLIGHT_NUMBER = "flight_number";

        @NonNull
        public static final String GROUP_ID = "group_id";

        @NonNull
        public static final String INDEX = "index";

        @NonNull
        public static final String ITEMS = "items";

        @NonNull
        public static final String ITEM_BRAND = "item_brand";

        @NonNull
        public static final String ITEM_CATEGORY = "item_category";

        @NonNull
        public static final String ITEM_CATEGORY2 = "item_category2";

        @NonNull
        public static final String ITEM_CATEGORY3 = "item_category3";

        @NonNull
        public static final String ITEM_CATEGORY4 = "item_category4";

        @NonNull
        public static final String ITEM_CATEGORY5 = "item_category5";

        @NonNull
        public static final String ITEM_ID = "item_id";

        @NonNull
        public static final String ITEM_LIST_ID = "item_list_id";

        @NonNull
        public static final String ITEM_LIST_NAME = "item_list_name";

        @NonNull
        public static final String ITEM_NAME = "item_name";

        @NonNull
        public static final String ITEM_VARIANT = "item_variant";

        @NonNull
        public static final String LEVEL = "level";

        @NonNull
        public static final String LEVEL_NAME = "level_name";

        @NonNull
        public static final String LOCATION = "location";

        @NonNull
        public static final String LOCATION_ID = "location_id";

        @NonNull
        public static final String MARKETING_TACTIC = "marketing_tactic";

        @NonNull
        public static final String MEDIUM = "medium";

        @NonNull
        public static final String METHOD = "method";

        @NonNull
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";

        @NonNull
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";

        @NonNull
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";

        @NonNull
        public static final String ORIGIN = "origin";

        @NonNull
        public static final String PAYMENT_TYPE = "payment_type";

        @NonNull
        public static final String PRICE = "price";

        @NonNull
        public static final String PROMOTION_ID = "promotion_id";

        @NonNull
        public static final String PROMOTION_NAME = "promotion_name";

        @NonNull
        public static final String QUANTITY = "quantity";

        @NonNull
        public static final String SCORE = "score";

        @NonNull
        public static final String SCREEN_CLASS = "screen_class";

        @NonNull
        public static final String SCREEN_NAME = "screen_name";

        @NonNull
        public static final String SEARCH_TERM = "search_term";

        @NonNull
        public static final String SHIPPING = "shipping";

        @NonNull
        public static final String SHIPPING_TIER = "shipping_tier";

        @NonNull
        public static final String SOURCE = "source";

        @NonNull
        public static final String SOURCE_PLATFORM = "source_platform";

        @NonNull
        public static final String START_DATE = "start_date";

        @NonNull
        public static final String SUCCESS = "success";

        @NonNull
        public static final String TAX = "tax";

        @NonNull
        public static final String TERM = "term";

        @NonNull
        public static final String TRANSACTION_ID = "transaction_id";

        @NonNull
        public static final String TRAVEL_CLASS = "travel_class";

        @NonNull
        public static final String VALUE = "value";

        @NonNull
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
    }

    public static class UserProperty {

        @NonNull
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";

        @NonNull
        public static final String SIGN_UP_METHOD = "sign_up_method";
    }

    private FirebaseAnalytics(tpu0 tpu0Var) {
        Preconditions.checkNotNull(tpu0Var);
        this.zzb = tpu0Var;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(tpu0.m190014i(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    @Nullable
    @Keep
    public static e0y0 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        tpu0 tpu0VarM190015j = tpu0.m190015j(context, null, null, null, bundle);
        if (tpu0VarM190015j == null) {
            return null;
        }
        return new zzd(tpu0VarM190015j);
    }

    @EnsuresNonNull({"this.executor"})
    private final ExecutorService zza() {
        FirebaseAnalytics firebaseAnalytics;
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.zzc == null) {
                    firebaseAnalytics = this;
                    firebaseAnalytics.zzc = new zza(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                } else {
                    firebaseAnalytics = this;
                }
                executorService = firebaseAnalytics.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @NonNull
    public final Task<String> getAppInstanceId() {
        try {
            return tfi0.m188731c(zza(), new zzc(this));
        } catch (RuntimeException e) {
            this.zzb.m190049k(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return tfi0.m188733e(e);
        }
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) tfi0.m188730b(FirebaseInstallations.getInstance().getId(), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            phg0.m168968a(e);
            return null;
        } catch (ExecutionException e2) {
            phg0.m168968a(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @NonNull
    public final Task<Long> getSessionId() {
        try {
            return tfi0.m188731c(zza(), new zzb(this));
        } catch (RuntimeException e) {
            this.zzb.m190049k(5, "Failed to schedule task for getSessionId", null, null, null);
            return tfi0.m188733e(e);
        }
    }

    public final void logEvent(@NonNull @Size(max = 40, min = 1) String str, @Nullable Bundle bundle) {
        this.zzb.m190056r(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.m190040Z();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.m190054p(Boolean.valueOf(z));
    }

    public final void setConsent(@NonNull Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int iOrdinal = consentStatus.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int iOrdinal2 = consentStatus2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int iOrdinal3 = consentStatus3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int iOrdinal4 = consentStatus4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.zzb.m190029N(bundle);
    }

    @Keep
    @MainThread
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.zzb.m190051m(activity, str, str2);
    }

    public final void setDefaultEventParameters(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.zzb.m190033S(bundle);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.m190050l(j);
    }

    public final void setUserId(@Nullable String str) {
        this.zzb.m190034T(str);
    }

    public final void setUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable @Size(max = 36) String str2) {
        this.zzb.m190025I(str, str2);
    }
}
