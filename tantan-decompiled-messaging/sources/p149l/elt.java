package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.p046p1.mobile.putong.live.base.view.ScrollRecycleView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VSearchBar;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class elt {
    /* JADX INFO: renamed from: a */
    public static void m117155a(dlt dltVar, View view) {
        dltVar.f86856a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dltVar.f86857b = (RelativeLayout) viewGroup.getChildAt(0);
        dltVar.f86858c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dltVar.f86859d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dltVar.f86860e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dltVar.f86861f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dltVar.f86862g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        dltVar.f86863h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        dltVar.f86864i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        dltVar.f86865j = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        dltVar.f86866k = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        dltVar.f86867l = (ScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        dltVar.f86868m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        dltVar.f86869n = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dltVar.f86870o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dltVar.f86871p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        dltVar.f86872q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        dltVar.f86873r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        dltVar.f86874s = (ScrollRecycleView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m117156b(dlt dltVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162764j0, viewGroup, false);
        m117155a(dltVar, viewInflate);
        return viewInflate;
    }
}
