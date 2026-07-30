package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.AutoVDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class cmp {
    /* JADX INFO: renamed from: a */
    public static void m111298a(bmp bmpVar, View view) {
        bmpVar.f77358a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bmpVar.f77359b = (AutoVDraweeView) viewGroup.getChildAt(0);
        bmpVar.f77360c = (AutoVDraweeView) viewGroup.getChildAt(1);
        bmpVar.f77361d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bmpVar.f77362e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
