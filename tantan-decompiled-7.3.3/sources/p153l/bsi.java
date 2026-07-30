package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bsi {
    /* JADX INFO: renamed from: a */
    public static void m106240a(asi asiVar, View view) {
        asiVar._setting_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        asiVar._setting_bg_img = (VDraweeView) viewGroup.getChildAt(0);
        asiVar._setting_img = (VDraweeView) viewGroup.getChildAt(1);
        asiVar._setting_content_title = (VText) viewGroup.getChildAt(2);
        asiVar._setting_content_desc = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m106241b(asi asiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125405F4, viewGroup, false);
        m106240a(asiVar, viewInflate);
        return viewInflate;
    }
}
