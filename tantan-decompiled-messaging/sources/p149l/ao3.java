package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionPassiveView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ao3 {
    /* JADX INFO: renamed from: a */
    public static void m97841a(zn3 zn3Var, View view) {
        zn3Var._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zn3Var._buzz_root = (ConstraintLayout) viewGroup.getChildAt(0);
        zn3Var._buzz_root_buzz_bg_anim = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zn3Var._buzz_root_buzz_bee_hive_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zn3Var._buzz_root_bee_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        zn3Var._buzz_root_svip_icon = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        zn3Var._buzz_root_region_passive_set = (BuzzRegionPassiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        zn3Var._buzz_root_buzz_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        zn3Var._buzz_root_buzz_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        zn3Var._buzz_root_control_root = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        zn3Var._buzz_root_memoji_entrance = (MemojiBuzzComboEntranceView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        zn3Var._buzz_root_back = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m97842b(zn3 zn3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106039p, viewGroup, false);
        m97841a(zn3Var, viewInflate);
        return viewInflate;
    }
}
