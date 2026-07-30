package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p147v.VDraweeView;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lpi {
    /* JADX INFO: renamed from: a */
    public static void m150869a(kpi kpiVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kpiVar._dlg_bg_img = (VDraweeView) viewGroup.getChildAt(0);
        kpiVar._close = (ImageView) viewGroup.getChildAt(1);
        kpiVar._setting_img = (VDraweeView) viewGroup.getChildAt(2);
        kpiVar._setting_content_title = (VText) viewGroup.getChildAt(3);
        kpiVar._finding_time = (VText) viewGroup.getChildAt(4);
        kpiVar._progress = (VProgress) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m150870b(kpi kpiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95383H4, viewGroup, false);
        m150869a(kpiVar, viewInflate);
        return viewInflate;
    }
}
