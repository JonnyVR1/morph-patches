package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.RectangleLayout;

/* JADX INFO: loaded from: classes4.dex */
public class cse {
    /* JADX INFO: renamed from: a */
    public static void m112174a(bse bseVar, View view) {
        bseVar.f78143a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bseVar.f78144b = viewGroup.getChildAt(0);
        bseVar.f78145c = (RectangleLayout) viewGroup.getChildAt(1);
        bseVar.f78146d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m112175b(bse bseVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198728D0, viewGroup, false);
        m112174a(bseVar, viewInflate);
        return viewInflate;
    }
}
