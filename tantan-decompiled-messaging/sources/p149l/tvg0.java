package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tvg0 {
    /* JADX INFO: renamed from: a */
    public static void m190740a(pvg0 pvg0Var, View view) {
        pvg0Var._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pvg0Var._empty = viewGroup.getChildAt(0);
        pvg0Var._content = (ConstraintLayout) viewGroup.getChildAt(1);
        pvg0Var._content_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pvg0Var._svga_bg = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pvg0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pvg0Var._more_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        pvg0Var._user_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        pvg0Var._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        pvg0Var._icon_mask = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        pvg0Var._tab_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        pvg0Var._tabLayout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        pvg0Var._tab_click_area = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        pvg0Var._viewpager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        pvg0Var._desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        pvg0Var._power_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
    }
}
