package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonLinearRoot;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonRoot;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jff {
    /* JADX INFO: renamed from: a */
    public static void m141177a(iff iffVar, View view) {
        iffVar.f112991e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iffVar.f112992f = viewGroup.getChildAt(0);
        iffVar.f112993g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iffVar.f112994h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        iffVar.f112995i = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.f112996j = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.f112997k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.f112998l = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        iffVar.f112999m = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        iffVar.f113000n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        iffVar.f113001o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        iffVar.f113002p = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        iffVar.f113003q = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        iffVar.f113004r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        iffVar.f113005s = (ExpProfileOpButtonRoot) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iffVar.f113006t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        iffVar.f113007u = (ExpProfileOpButtonLinearRoot) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iffVar.f113008v = (LetterRemainingSwitcherView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        iffVar.f113009w = (ExpProfileOpButtonRoot) viewGroup.getChildAt(2);
        iffVar.f113010x = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iffVar.f113011y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m141178b(iff iffVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95356F9, viewGroup, false);
        m141177a(iffVar, viewInflate);
        return viewInflate;
    }
}
