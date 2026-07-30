package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class jrx0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f119451a = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", Constants.MessagePayloadKeys.MSGID_SERVER, "message_name", "message_time", "message_tracking_id", Constants.MessagePayloadKeys.MESSAGE_TYPE, "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: b */
    public static final String[] f119452b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, "_nmid", Constants.ScionAnalytics.PARAM_MESSAGE_NAME, Constants.ScionAnalytics.PARAM_MESSAGE_TIME, "_nmtid", Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, "_pv", "_po", Constants.ScionAnalytics.PARAM_TOPIC, "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: c */
    public static final String[] f119453c = {FirebaseAnalytics.Param.ITEMS};

    /* JADX INFO: renamed from: d */
    public static final String[] f119454d = {FirebaseAnalytics.Param.AFFILIATION, "coupon", FirebaseAnalytics.Param.CREATIVE_NAME, FirebaseAnalytics.Param.CREATIVE_SLOT, FirebaseAnalytics.Param.CURRENCY, "discount", FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.ITEM_ID, FirebaseAnalytics.Param.ITEM_BRAND, FirebaseAnalytics.Param.ITEM_CATEGORY, FirebaseAnalytics.Param.ITEM_CATEGORY2, FirebaseAnalytics.Param.ITEM_CATEGORY3, FirebaseAnalytics.Param.ITEM_CATEGORY4, FirebaseAnalytics.Param.ITEM_CATEGORY5, FirebaseAnalytics.Param.ITEM_LIST_NAME, FirebaseAnalytics.Param.ITEM_LIST_ID, FirebaseAnalytics.Param.ITEM_NAME, FirebaseAnalytics.Param.ITEM_VARIANT, FirebaseAnalytics.Param.LOCATION_ID, FirebaseAnalytics.Param.PAYMENT_TYPE, FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.PROMOTION_ID, FirebaseAnalytics.Param.PROMOTION_NAME, FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.SHIPPING, FirebaseAnalytics.Param.SHIPPING_TIER, FirebaseAnalytics.Param.TAX, FirebaseAnalytics.Param.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* JADX INFO: renamed from: a */
    public static String m142977a(String str) {
        return d1y0.m109701b(str, f119451a, f119452b);
    }
}
