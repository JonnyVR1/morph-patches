package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wvw {
    /* JADX INFO: renamed from: a */
    public static void m205782a(vvw vvwVar, View view) {
        vvwVar.f183261c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vvwVar.f183262d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vvwVar.f183263e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vvwVar.f183264f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        vvwVar.f183265g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        vvwVar.f183266h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        vvwVar.f183267i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(4);
        vvwVar.f183268j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(5);
        vvwVar.f183269k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(7);
        vvwVar.f183270l = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m205783b(vvw vvwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137305K, viewGroup, false);
        m205782a(vvwVar, viewInflate);
        return viewInflate;
    }
}
