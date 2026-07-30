package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p051p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p051p1.mobile.putong.core.newui.main.NewMainViewModel;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.bottombar.VBottomBar;

/* JADX INFO: loaded from: classes10.dex */
public class aj30 {
    /* JADX INFO: renamed from: a */
    public static void m98349a(NewMainViewModel newMainViewModel, View view) {
        newMainViewModel.f25203a = (DrawerLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newMainViewModel.f25204b = (FrameLayout) viewGroup.getChildAt(0);
        newMainViewModel.f25205c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newMainViewModel.f25206d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newMainViewModel.f25207e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f25208f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f25209g = (VBottomBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f25210h = (NavigationBarAdView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f25211i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        newMainViewModel.f25212j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        newMainViewModel.f25213k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        newMainViewModel.f25214l = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        newMainViewModel.f25215m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        newMainViewModel.f25216n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        newMainViewModel.f25217o = (LinearLayout) viewGroup.getChildAt(1);
        newMainViewModel.f25218p = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newMainViewModel.f25219q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        newMainViewModel.f25220r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        newMainViewModel.f25221s = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        newMainViewModel.f25222t = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newMainViewModel.f25223u = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f25224v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.f25225w = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m98350b(NewMainViewModel newMainViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126022qe, viewGroup, false);
        m98349a(newMainViewModel, viewInflate);
        return viewInflate;
    }
}
