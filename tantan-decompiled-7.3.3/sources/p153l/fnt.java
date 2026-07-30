package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.p051p1.mobile.putong.live.base.view.ScrollRecycleView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VSearchBar;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fnt {
    /* JADX INFO: renamed from: a */
    public static void m126379a(ent entVar, View view) {
        entVar.f94806a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        entVar.f94807b = (RelativeLayout) viewGroup.getChildAt(0);
        entVar.f94808c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        entVar.f94809d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        entVar.f94810e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        entVar.f94811f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        entVar.f94812g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        entVar.f94813h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        entVar.f94814i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        entVar.f94815j = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        entVar.f94816k = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        entVar.f94817l = (ScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        entVar.f94818m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        entVar.f94819n = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        entVar.f94820o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        entVar.f94821p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        entVar.f94822q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        entVar.f94823r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        entVar.f94824s = (ScrollRecycleView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m126380b(ent entVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193878j0, viewGroup, false);
        m126379a(entVar, viewInflate);
        return viewInflate;
    }
}
