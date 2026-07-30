package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p046p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p046p1.mobile.putong.core.newui.main.NewMainViewModel;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.bottombar.VBottomBar;

/* JADX INFO: loaded from: classes10.dex */
public class ma30 {
    /* JADX INFO: renamed from: a */
    public static void m153635a(NewMainViewModel newMainViewModel, View view) {
        newMainViewModel.f24461a = (DrawerLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newMainViewModel.f24462b = (FrameLayout) viewGroup.getChildAt(0);
        newMainViewModel.f24463c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newMainViewModel.f24464d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newMainViewModel.f24465e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f24466f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f24467g = (VBottomBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f24468h = (NavigationBarAdView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f24469i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        newMainViewModel.f24470j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        newMainViewModel.f24471k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        newMainViewModel.f24472l = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        newMainViewModel.f24473m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        newMainViewModel.f24474n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        newMainViewModel.f24475o = (LinearLayout) viewGroup.getChildAt(1);
        newMainViewModel.f24476p = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newMainViewModel.f24477q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        newMainViewModel.f24478r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        newMainViewModel.f24479s = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        newMainViewModel.f24480t = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newMainViewModel.f24481u = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f24482v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f24483w = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m153636b(NewMainViewModel newMainViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95849je, viewGroup, false);
        m153635a(newMainViewModel, viewInflate);
        return viewInflate;
    }
}
