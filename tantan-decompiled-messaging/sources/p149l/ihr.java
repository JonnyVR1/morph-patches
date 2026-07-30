package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFilterBar;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ihr {
    /* JADX INFO: renamed from: a */
    public static void m136269a(hhr hhrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hhrVar.f107803a = (VNavigationBar) viewGroup.getChildAt(0);
        hhrVar.f107804b = (RecyclerView) viewGroup.getChildAt(1);
        hhrVar.f107805c = (VFrame) viewGroup.getChildAt(2);
        hhrVar.f107806d = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hhrVar.f107807e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hhrVar.f107808f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        hhrVar.f107809g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhrVar.f107810h = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hhrVar.f107811i = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hhrVar.f107812j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        hhrVar.f107813k = (LikedUserFilterBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        hhrVar.f107814l = (Button) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        hhrVar.f107815m = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        hhrVar.f107816n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0);
        hhrVar.f107817o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m136270b(hhr hhrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121370d0, viewGroup, false);
        m136269a(hhrVar, viewInflate);
        return viewInflate;
    }
}
