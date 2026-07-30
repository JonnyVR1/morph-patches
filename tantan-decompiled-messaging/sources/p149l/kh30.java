package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import com.p046p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class kh30 {
    /* JADX INFO: renamed from: a */
    public static void m145950a(jh30 jh30Var, View view) {
        jh30Var._new_tab_me = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jh30Var._top_navigationbar = (VNavigationBar) viewGroup.getChildAt(0);
        jh30Var._content_view = (ScrollView) viewGroup.getChildAt(1);
        jh30Var._new_me_linear = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jh30Var._intr_risk_banner = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jh30Var._intr_risk_banner_content = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jh30Var._ban_release_entrance = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jh30Var._fake_tip = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        jh30Var._background_avatar = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        jh30Var._iv_edit = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        jh30Var._iv_edit_red_dot = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        jh30Var._user_desc_container = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3);
        jh30Var._name_container = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        jh30Var._name_container_tv_name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        jh30Var._name_container_emoji = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        jh30Var._name_container_verification_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        jh30Var._name_container_img_vip = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(3);
        jh30Var._id = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        jh30Var._bt_id_copy = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
        jh30Var._space = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(6);
        jh30Var._wallet_layout = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7);
        jh30Var._wallet_layout_wallet_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        jh30Var._wallet_layout_wallet_coin = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(1);
        jh30Var._wallet_layout_luckytantan = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(2);
        jh30Var._intl_pay_guide = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        jh30Var._privilege_banner = (NewProfilePrivilegedPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        jh30Var._hide_and_seek = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        jh30Var._service_plu = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        jh30Var._item_layout = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m145951b(jh30 jh30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95810h8, viewGroup, false);
        m145950a(jh30Var, viewInflate);
        return viewInflate;
    }
}
