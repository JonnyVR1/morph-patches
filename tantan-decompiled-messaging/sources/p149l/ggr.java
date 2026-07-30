package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class ggr {
    /* JADX INFO: renamed from: a */
    public static void m125998a(egr egrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        egrVar.f90969a = (VPullUpRecyclerView) viewGroup.getChildAt(0);
        egrVar.f90970b = (NestedScrollView) viewGroup.getChildAt(1);
        egrVar.f90971c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        egrVar.f90972d = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        egrVar.f90973e = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m125999b(egr egrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121319N0, viewGroup, false);
        m125998a(egrVar, viewInflate);
        return viewInflate;
    }
}
