package p153l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class rvw {
    /* JADX INFO: renamed from: a */
    public static void m183321a(qvw qvwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qvwVar.f159814a = (ImageView) viewGroup.getChildAt(0);
        qvwVar.f159815b = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qvwVar.f159816c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        qvwVar.f159817d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qvwVar.f159818e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        qvwVar.f159819f = (SurfaceView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        qvwVar.f159820g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        qvwVar.f159821h = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m183322b(qvw qvwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125503L6, viewGroup, false);
        m183321a(qvwVar, viewInflate);
        return viewInflate;
    }
}
