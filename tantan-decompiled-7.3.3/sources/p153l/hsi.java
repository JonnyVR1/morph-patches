package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hsi {
    /* JADX INFO: renamed from: a */
    public static void m136977a(gsi gsiVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gsiVar._dlg_bg_img = (VDraweeView) viewGroup.getChildAt(0);
        gsiVar._close = (ImageView) viewGroup.getChildAt(1);
        gsiVar._setting_img = (VDraweeView) viewGroup.getChildAt(2);
        gsiVar._setting_content_title = (VText) viewGroup.getChildAt(3);
        gsiVar._finding_time = (VText) viewGroup.getChildAt(4);
        gsiVar._progress = (VProgress) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m136978b(gsi gsiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125437H4, viewGroup, false);
        m136977a(gsiVar, viewInflate);
        return viewInflate;
    }
}
