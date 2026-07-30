package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VProgress;

/* JADX INFO: loaded from: classes10.dex */
public class pfr {
    /* JADX INFO: renamed from: a */
    public static void m172141a(ofr ofrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ofrVar._close = (ImageView) viewGroup.getChildAt(0);
        ofrVar._setting_img = (VDraweeView) viewGroup.getChildAt(1);
        ofrVar._setting_content_title = (TextView) viewGroup.getChildAt(2);
        ofrVar._finding_time = (TextView) viewGroup.getChildAt(3);
        ofrVar._progress = (VProgress) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m172142b(ofr ofrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125581Q4, viewGroup, false);
        m172141a(ofrVar, viewInflate);
        return viewInflate;
    }
}
