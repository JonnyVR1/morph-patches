package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b4h0 {
    /* JADX INFO: renamed from: a */
    public static void m102467a(x3h0 x3h0Var, View view) {
        x3h0Var._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        x3h0Var._empty = viewGroup.getChildAt(0);
        x3h0Var._content = (ConstraintLayout) viewGroup.getChildAt(1);
        x3h0Var._content_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        x3h0Var._svga_bg = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        x3h0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        x3h0Var._more_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        x3h0Var._user_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        x3h0Var._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        x3h0Var._icon_mask = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        x3h0Var._tab_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        x3h0Var._tabLayout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        x3h0Var._tab_click_area = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        x3h0Var._viewpager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        x3h0Var._desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        x3h0Var._power_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
    }
}
