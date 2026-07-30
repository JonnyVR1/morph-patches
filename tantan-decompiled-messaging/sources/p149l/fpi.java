package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fpi {
    /* JADX INFO: renamed from: a */
    public static void m122602a(epi epiVar, View view) {
        epiVar._setting_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        epiVar._setting_bg_img = (VDraweeView) viewGroup.getChildAt(0);
        epiVar._setting_img = (VDraweeView) viewGroup.getChildAt(1);
        epiVar._setting_content_title = (VText) viewGroup.getChildAt(2);
        epiVar._setting_content_desc = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m122603b(epi epiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95351F4, viewGroup, false);
        m122602a(epiVar, viewInflate);
        return viewInflate;
    }
}
