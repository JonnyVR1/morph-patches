package p003l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.f6c0;
import l.rsw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ssw {
    /* JADX INFO: renamed from: a */
    public static void m9481a(rsw rswVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rswVar.a = (ImageView) viewGroup.getChildAt(0);
        rswVar.b = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        rswVar.c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        rswVar.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        rswVar.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        rswVar.f = (SurfaceView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        rswVar.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        rswVar.h = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9482b(rsw rswVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.K6, viewGroup, false);
        m9481a(rswVar, viewInflate);
        return viewInflate;
    }
}
