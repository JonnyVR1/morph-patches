package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class yp30 {
    /* JADX INFO: renamed from: a */
    public static void m216996a(xp30 xp30Var, View view) {
        xp30Var._new_tab_me = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xp30Var._top_navigationbar = (VNavigationBar) viewGroup.getChildAt(0);
        xp30Var._content_view = (ScrollView) viewGroup.getChildAt(1);
        xp30Var._new_me_linear = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xp30Var._intr_risk_banner = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        xp30Var._intr_risk_banner_content = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        xp30Var._ban_release_entrance = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        xp30Var._fake_tip = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        xp30Var._background_avatar = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        xp30Var._iv_edit = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        xp30Var._iv_edit_red_dot = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        xp30Var._user_desc_container = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3);
        xp30Var._name_container = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        xp30Var._name_container_tv_name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        xp30Var._name_container_emoji = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        xp30Var._name_container_verification_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        xp30Var._name_container_img_vip = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(3);
        xp30Var._id = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        xp30Var._bt_id_copy = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
        xp30Var._space = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(6);
        xp30Var._wallet_layout = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7);
        xp30Var._wallet_layout_wallet_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        xp30Var._wallet_layout_wallet_coin = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(1);
        xp30Var._wallet_layout_luckytantan = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(2);
        xp30Var._intl_pay_guide = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        xp30Var._privilege_banner = (NewProfilePrivilegedPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        xp30Var._hide_and_seek = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        xp30Var._service_plu = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        xp30Var._item_layout = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m216997b(xp30 xp30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125982o8, viewGroup, false);
        m216996a(xp30Var, viewInflate);
        return viewInflate;
    }
}
