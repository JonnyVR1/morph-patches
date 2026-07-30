package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.StepSeekBar;
import p147v.VButton_FakeShadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class g8f0 {
    /* JADX INFO: renamed from: a */
    public static void m124748a(f8f0 f8f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f8f0Var.f96348c = (VRelative) viewGroup.getChildAt(0);
        f8f0Var.f96349d = (StepSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        f8f0Var.f96350e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        f8f0Var.f96351f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        f8f0Var.f96352g = (VScroll) viewGroup.getChildAt(1);
        f8f0Var.f96353h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f8f0Var.f96354i = (ViewPager2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        f8f0Var.f96355j = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m124749b(f8f0 f8f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79482V, viewGroup, false);
        m124748a(f8f0Var, viewInflate);
        return viewInflate;
    }
}
