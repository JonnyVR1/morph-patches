package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ilx {
    /* JADX INFO: renamed from: a */
    public static void m140723a(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        meTabRevampTest1ViewModel._new_tab_me_test1 = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        meTabRevampTest1ViewModel._top_navigationbar = (VNavigationBar) viewGroup.getChildAt(0);
        meTabRevampTest1ViewModel._content_view = (ScrollView) viewGroup.getChildAt(1);
        meTabRevampTest1ViewModel._test1_content = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_header_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_header_container_test1_avatar = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_header_container_test1_avatar_edit = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row_test1_name = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row_test1_verification_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn_test1_sub_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn_test1_sub_text = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_header_container_test1_sub_dot = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        meTabRevampTest1ViewModel._test1_stats_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_dot = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_plus_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_plus_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_plus_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_banner_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        meTabRevampTest1ViewModel._test1_card_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        meTabRevampTest1ViewModel._test1_card_container_test1_card_pager = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_benefits_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_you_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_target_title = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_rows = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_fake_tip = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        meTabRevampTest1ViewModel._test1_verification_banner = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_text = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_arrow = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7)).getChildAt(2);
        meTabRevampTest1ViewModel._test1_floating_cta = (VText_NoTopPadding) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m140724b(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126083u7, viewGroup, false);
        m140723a(meTabRevampTest1ViewModel, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m140725c(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel) {
        meTabRevampTest1ViewModel._new_tab_me_test1 = null;
        meTabRevampTest1ViewModel._top_navigationbar = null;
        meTabRevampTest1ViewModel._content_view = null;
        meTabRevampTest1ViewModel._test1_content = null;
        meTabRevampTest1ViewModel._test1_header_container = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_avatar = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_avatar_edit = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row_test1_name = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_name_row_test1_verification_icon = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn_test1_sub_badge = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_subscription_btn_test1_sub_text = null;
        meTabRevampTest1ViewModel._test1_header_container_test1_sub_dot = null;
        meTabRevampTest1ViewModel._test1_stats_container = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_count = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_label = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_you_stat_test1_likes_you_badge = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_count = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_label = null;
        meTabRevampTest1ViewModel._test1_stats_container_test1_visitors_stat_test1_visitors_dot = null;
        meTabRevampTest1ViewModel._test1_iap_container = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_icon = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_title = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_boost_card_test1_boost_plus_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_icon = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_title = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_super_like_card_test1_super_like_plus_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_icon = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_title = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_compliment_card_test1_compliment_plus_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_icon = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_title = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_badge = null;
        meTabRevampTest1ViewModel._test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge = null;
        meTabRevampTest1ViewModel._test1_banner_container = null;
        meTabRevampTest1ViewModel._test1_card_container = null;
        meTabRevampTest1ViewModel._test1_card_container_test1_card_pager = null;
        meTabRevampTest1ViewModel._test1_benefits_container = null;
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_title = null;
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_you_title = null;
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_target_title = null;
        meTabRevampTest1ViewModel._test1_benefits_container_test1_benefits_rows = null;
        meTabRevampTest1ViewModel._test1_fake_tip = null;
        meTabRevampTest1ViewModel._test1_verification_banner = null;
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_icon = null;
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_text = null;
        meTabRevampTest1ViewModel._test1_verification_banner_test1_verification_banner_arrow = null;
        meTabRevampTest1ViewModel._test1_floating_cta = null;
    }
}
