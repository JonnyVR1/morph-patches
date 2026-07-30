package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ynx {
    /* JADX INFO: renamed from: a */
    public static void m216957a(xnx xnxVar, View view) {
        xnxVar._new_tab_me_test2 = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xnxVar._test2_top_navigationbar = (VNavigationBar) viewGroup.getChildAt(0);
        xnxVar._test2_content_view = (ScrollView) viewGroup.getChildAt(1);
        xnxVar._test2_content = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xnxVar._test2_header_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        xnxVar._test2_header_container_test2_avatar = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        xnxVar._test2_header_container_test2_avatar_edit = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        xnxVar._test2_header_container_test2_name_row = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        xnxVar._test2_header_container_test2_name_row_test2_name = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        xnxVar._test2_header_container_test2_name_row_test2_verification_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        xnxVar._test2_header_container_test2_subscription_btn = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        xnxVar._test2_header_container_test2_subscription_btn_test2_sub_badge = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        xnxVar._test2_header_container_test2_subscription_btn_test2_sub_text = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        xnxVar._test2_header_container_test2_sub_dot = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        xnxVar._test2_stats_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        xnxVar._test2_stats_container_test2_likes_you_stat = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_badge = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        xnxVar._test2_stats_container_test2_likes_sent_stat = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        xnxVar._test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        xnxVar._test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        xnxVar._test2_stats_container_test2_visitors_stat = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_count = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_label = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_dot = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        xnxVar._test2_fake_tip = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        xnxVar._test2_verification_banner = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        xnxVar._test2_verification_banner_test2_verification_banner_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        xnxVar._test2_verification_banner_test2_verification_banner_text = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        xnxVar._test2_verification_banner_test2_verification_banner_arrow = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        xnxVar._test2_banner_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        xnxVar._test2_privilege_banner = (NewProfilePrivilegedPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        xnxVar._test2_iap_list_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m216958b(xnx xnxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126100v7, viewGroup, false);
        m216957a(xnxVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m216959c(xnx xnxVar) {
        xnxVar._new_tab_me_test2 = null;
        xnxVar._test2_top_navigationbar = null;
        xnxVar._test2_content_view = null;
        xnxVar._test2_content = null;
        xnxVar._test2_header_container = null;
        xnxVar._test2_header_container_test2_avatar = null;
        xnxVar._test2_header_container_test2_avatar_edit = null;
        xnxVar._test2_header_container_test2_name_row = null;
        xnxVar._test2_header_container_test2_name_row_test2_name = null;
        xnxVar._test2_header_container_test2_name_row_test2_verification_icon = null;
        xnxVar._test2_header_container_test2_subscription_btn = null;
        xnxVar._test2_header_container_test2_subscription_btn_test2_sub_badge = null;
        xnxVar._test2_header_container_test2_subscription_btn_test2_sub_text = null;
        xnxVar._test2_header_container_test2_sub_dot = null;
        xnxVar._test2_stats_container = null;
        xnxVar._test2_stats_container_test2_likes_you_stat = null;
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_count = null;
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_label = null;
        xnxVar._test2_stats_container_test2_likes_you_stat_test2_likes_you_badge = null;
        xnxVar._test2_stats_container_test2_likes_sent_stat = null;
        xnxVar._test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count = null;
        xnxVar._test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label = null;
        xnxVar._test2_stats_container_test2_visitors_stat = null;
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_count = null;
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_label = null;
        xnxVar._test2_stats_container_test2_visitors_stat_test2_visitors_dot = null;
        xnxVar._test2_fake_tip = null;
        xnxVar._test2_verification_banner = null;
        xnxVar._test2_verification_banner_test2_verification_banner_icon = null;
        xnxVar._test2_verification_banner_test2_verification_banner_text = null;
        xnxVar._test2_verification_banner_test2_verification_banner_arrow = null;
        xnxVar._test2_banner_container = null;
        xnxVar._test2_privilege_banner = null;
        xnxVar._test2_iap_list_container = null;
    }
}
