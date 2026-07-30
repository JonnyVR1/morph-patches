package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionPassiveView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ap3 {
    /* JADX INFO: renamed from: a */
    public static void m99265a(zo3 zo3Var, View view) {
        zo3Var._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zo3Var._buzz_root = (ConstraintLayout) viewGroup.getChildAt(0);
        zo3Var._buzz_root_buzz_bg_anim = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zo3Var._buzz_root_buzz_bee_hive_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zo3Var._buzz_root_bee_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        zo3Var._buzz_root_svip_icon = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        zo3Var._buzz_root_region_passive_set = (BuzzRegionPassiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        zo3Var._buzz_root_buzz_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        zo3Var._buzz_root_buzz_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        zo3Var._buzz_root_control_root = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        zo3Var._buzz_root_memoji_entrance = (MemojiBuzzComboEntranceView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        zo3Var._buzz_root_back = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m99266b(zo3 zo3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136481p, viewGroup, false);
        m99265a(zo3Var, viewInflate);
        return viewInflate;
    }
}
