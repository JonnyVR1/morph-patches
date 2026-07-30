package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class g0y0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f101692a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.Event.AD_IMPRESSION, FirebaseAnalytics.Event.SCREEN_VIEW, "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: b */
    public static final String[] f101693b = {FirebaseAnalytics.Event.AD_IMPRESSION};

    /* JADX INFO: renamed from: c */
    public static final String[] f101694c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, "_err", "_f", "_v", "_iap", Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN};

    /* JADX INFO: renamed from: d */
    public static final String[] f101695d = {FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.REFUND, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.ADD_SHIPPING_INFO, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.ADD_TO_WISHLIST, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.SELECT_ITEM, FirebaseAnalytics.Event.SELECT_PROMOTION, FirebaseAnalytics.Event.VIEW_CART, FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.VIEW_ITEM_LIST, FirebaseAnalytics.Event.VIEW_PROMOTION, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.Event.SELECT_CONTENT, FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS};

    /* JADX INFO: renamed from: a */
    public static String m128475a(String str) {
        return jay0.m144171b(str, f101694c, f101692a);
    }

    /* JADX INFO: renamed from: b */
    public static String m128476b(String str) {
        return jay0.m144171b(str, f101692a, f101694c);
    }
}
