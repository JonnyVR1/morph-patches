package com.p000p1.mobile.putong.core.oms;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum OmsDialog {
    fake("p_fake_alert_popup_view"),
    real_person_guide("p_avatarVerification_guide"),
    real_swipe_guide("p_avatarVerification_new_guide"),
    real_auth_fail("p_avatarVerification_fail_popup"),
    real_auth_success("p_avatar_verification_succeed_swipe_page"),
    see_boost_guide("p_new_users_see_purchase_guide_see_view"),
    see_guide("p_no_match_see_purchase_guide_view"),
    good_to_fake("p_forbidden_good_to_fake_popup_view"),
    quickly_chat_guide("p_quickchat_intropopup"),
    alert_cheat_tips_popup("p_alert_cheat_prevention__tips_popup"),
    alert_cheat_risk_alarm_popup("p_alert_cheat_prevention__risk_alarm_popup"),
    p_no_match_svip("p_no_match_svip"),
    p_alert_dislike_who_liked_me_popup("p_alert_dislike_who_liked_me_popup"),
    p_vip_expired("p_vip_expired"),
    p_alert_positioning_authority_open_guide_popup("p_alert_positioning_authority_open_guide_popup"),
    p_alert_positioning_authority_explore_popup("p_alert_positioning_authority_explore_popup"),
    p_alert_version_upgrade_popup("p_alert_version_upgrade_popup"),
    p_alert_id_verification_negative_guide("p_alert_id_verification_negative_guide"),
    p_purchase_guide_page("p_purchase_guide_page"),
    p_purchase_expire_page("p_purchase_expire_page"),
    p_profile_picture_popup("p_profile_picture_popup"),
    p_choose_sale("p_choose_sale"),
    p_choose_sale_expire("p_choose_sale_expire"),
    p_appstore_rating_filter_popup("p_appstore_rating_filter_popup"),
    p_appstore_rating_filter_popup_store("p_appstore_rating_filter_popup_store"),
    p_prompt_notification_auth_popup_view("p_prompt_notification_auth_popup_view"),
    p_purchase_page("p_purchase_page"),
    p_new_users_see_purchase_guide_see_view("p_new_users_see_purchase_guide_see_view"),
    p_offline_popup("p_offline_popup"),
    p_pu_gift_package("p_pu_gift_package"),
    p_pu_gift_vip("p_pu_gift_vip"),
    p_verification_merge_popup("p_verification_merge_popup"),
    p_verification_merge_popup_avatar_verification("p_verification_merge_popup_avatar_verification"),
    p_verification_merge_popup_id_verification("p_verification_merge_popup_id_verification"),
    p_get_svip_freetrial("p_get_svip_freetrial"),
    p_vip_upgrade_popup("p_vip_upgrade_popup"),
    p_intl_5star_dialog_view("p_intl_5star_dialog_view"),
    p_vip_expired_international_one("p_vip_expired_international_one"),
    p_vip_expired_international_three("p_vip_expired_international_three"),
    p_chat_guide_popup("p_chat_guide_popup"),
    p_avatar_verification_succeed_verification_center("p_avatar_verification_succeed_verification_center"),
    p_avatarVerification_fail_popup_verificationCenter("p_avatarVerification_fail_popup_verificationCenter"),
    p_identityVerification_succeed_popup_verificationCenter("p_identityVerification_succeed_popup_verificationCenter"),
    p_identityVerification_fail_popup_verificationCenter("p_identityVerification_fail_popup_verificationCenter"),
    p_avatar_verification_review_verification_center("p_avatar_verification_review_verification_center"),
    p_verification_review_id_popup("p_verification_review_id_popup"),
    p_verification_canceled_profile_avatar_popup("p_verification_canceled_profile_avatar_popup"),
    p_avatarVerification_icon_explain_guide_Verified("p_avatarVerification_icon_explain_guide_Verified"),
    p_verification_canceled_profile_id_popup("p_verification_canceled_profile_id_popup"),
    p_avatar_verification_review_swipe_page("p_avatar_verification_review_swipe_page"),
    p_welcomeback_popup("p_welcomeback_popup"),
    p_user_passive_show_chat("p_user_passive_show_chat"),
    p_id_verification_unactivated_popup("p_id_verification_unactivated_popup"),
    p_alert_cheat_prevention__verify_required_popup("p_alert_cheat_prevention__verify_required_popup"),
    p_alert_avatar_verification_upgrade_guide_popup("p_alert_avatar_verification_upgrade_guide_popup"),
    p_verification_center_policy_popup("p_verification_center_policy_popup"),
    p_identityVerification_succeed_popup("p_identityVerification_succeed_popup"),
    p_identityVerification_fail_popup("p_identityVerification_fail_popup");

    private String identifier;

    OmsDialog(String str) {
        this.identifier = str;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
