package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerNewCircleIndicator;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nmd0 {
    /* JADX INFO: renamed from: a */
    public static void m160088a(mmd0 mmd0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mmd0Var.f134599a = (VImage) viewGroup.getChildAt(0);
        mmd0Var.f134600b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mmd0Var.f134601c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mmd0Var.f134602d = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mmd0Var.f134603e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        mmd0Var.f134604f = (VPagerNewCircleIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        mmd0Var.f134605g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
