package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p1.mobile.putong.core.newui.main.NewMainViewModel;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ma30 {
    /* JADX INFO: renamed from: a */
    public static void m8007a(NewMainViewModel newMainViewModel, View view) {
        newMainViewModel.a = (DrawerLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newMainViewModel.b = (FrameLayout) viewGroup.getChildAt(0);
        newMainViewModel.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newMainViewModel.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newMainViewModel.e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        newMainViewModel.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        newMainViewModel.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        newMainViewModel.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        newMainViewModel.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        newMainViewModel.l = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        newMainViewModel.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        newMainViewModel.n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        newMainViewModel.o = (LinearLayout) viewGroup.getChildAt(1);
        newMainViewModel.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newMainViewModel.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        newMainViewModel.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        newMainViewModel.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        newMainViewModel.t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newMainViewModel.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        newMainViewModel.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        newMainViewModel.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8008b(NewMainViewModel newMainViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.je, viewGroup, false);
        m8007a(newMainViewModel, viewInflate);
        return viewInflate;
    }
}
