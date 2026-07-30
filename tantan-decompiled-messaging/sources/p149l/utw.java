package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.map.MapListView;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class utw {
    /* JADX INFO: renamed from: a */
    public static void m195309a(ttw ttwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ttwVar.f172075g = (FrameLayout) viewGroup.getChildAt(0);
        ttwVar.f172076h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ttwVar.f172077i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ttwVar.f172078j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ttwVar.f172079k = (VText) viewGroup.getChildAt(1);
        ttwVar.f172080l = (MapListView) viewGroup.getChildAt(2);
        ttwVar.f172081m = (VLinear) viewGroup.getChildAt(3);
        ttwVar.f172082n = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ttwVar.f172083o = (FrameLayout) viewGroup.getChildAt(4);
        ttwVar.f172084p = (VList) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m195310b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95424Jd, viewGroup, false);
        m195309a(ttwVar, viewInflate);
        return viewInflate;
    }
}
