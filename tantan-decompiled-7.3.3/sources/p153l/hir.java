package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class hir {
    /* JADX INFO: renamed from: a */
    public static void m135131a(fir firVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        firVar.f99214a = (VPullUpRecyclerView) viewGroup.getChildAt(0);
        firVar.f99215b = (NestedScrollView) viewGroup.getChildAt(1);
        firVar.f99216c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        firVar.f99217d = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        firVar.f99218e = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135132b(fir firVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151927N0, viewGroup, false);
        m135131a(firVar, viewInflate);
        return viewInflate;
    }
}
