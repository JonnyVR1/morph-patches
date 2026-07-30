package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.tabs.TabLayout;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: renamed from: l.eu */
/* JADX INFO: loaded from: classes9.dex */
public class C16831eu {
    /* JADX INFO: renamed from: a */
    public static void m122516a(C16621du c16621du, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c16621du.f90639a = (ViewStub) viewGroup.getChildAt(0);
        c16621du.f90640b = (TabLayout) viewGroup.getChildAt(1);
        c16621du.f90641c = (BottomSheetLayout) viewGroup.getChildAt(3);
        c16621du.f90642d = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c16621du.f90643e = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        c16621du.f90644f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        c16621du.f90645g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        c16621du.f90646h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        c16621du.f90647i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4);
        c16621du.f90648j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        c16621du.f90649k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m122517b(C16621du c16621du, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109076D, viewGroup, false);
        m122516a(c16621du, viewInflate);
        return viewInflate;
    }
}
