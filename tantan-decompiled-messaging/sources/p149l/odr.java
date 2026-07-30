package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VProgress;

/* JADX INFO: loaded from: classes10.dex */
public class odr {
    /* JADX INFO: renamed from: a */
    public static void m163711a(ndr ndrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ndrVar._close = (ImageView) viewGroup.getChildAt(0);
        ndrVar._setting_img = (VDraweeView) viewGroup.getChildAt(1);
        ndrVar._setting_content_title = (TextView) viewGroup.getChildAt(2);
        ndrVar._finding_time = (TextView) viewGroup.getChildAt(3);
        ndrVar._progress = (VProgress) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m163712b(ndr ndrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95527Q4, viewGroup, false);
        m163711a(ndrVar, viewInflate);
        return viewInflate;
    }
}
