package p149l;

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
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dsx {
    /* JADX INFO: renamed from: a */
    public static void m113498a(csx csxVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        csxVar.f82406a = (ViewStub) viewGroup.getChildAt(0);
        csxVar.f82407b = (TabLayout) viewGroup.getChildAt(1);
        csxVar.f82408c = (BottomSheetLayout) viewGroup.getChildAt(3);
        csxVar.f82409d = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        csxVar.f82410e = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        csxVar.f82411f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        csxVar.f82412g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        csxVar.f82413h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        csxVar.f82414i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4);
        csxVar.f82415j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        csxVar.f82416k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113499b(csx csxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95552Rd, viewGroup, false);
        m113498a(csxVar, viewInflate);
        return viewInflate;
    }
}
