package p149l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class ssw {
    /* JADX INFO: renamed from: a */
    public static void m185776a(rsw rswVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rswVar.f160902a = (ImageView) viewGroup.getChildAt(0);
        rswVar.f160903b = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        rswVar.f160904c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        rswVar.f160905d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        rswVar.f160906e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        rswVar.f160907f = (SurfaceView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        rswVar.f160908g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        rswVar.f160909h = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m185777b(rsw rswVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95433K6, viewGroup, false);
        m185776a(rswVar, viewInflate);
        return viewInflate;
    }
}
