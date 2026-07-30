package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cpe {
    /* JADX INFO: renamed from: a */
    public static void m111750a(bpe bpeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bpeVar.f77762u = (FrameLayout) viewGroup.getChildAt(0);
        bpeVar.f77763v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bpeVar.f77764w = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bpeVar.f77765x = (VText) viewGroup.getChildAt(1);
        bpeVar.f77766y = (FrameLayout) viewGroup.getChildAt(2);
        bpeVar.f77767z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bpeVar.f77755A = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        bpeVar.f77756B = (RecyclerView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m111751b(bpe bpeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125426G9, viewGroup, false);
        m111750a(bpeVar, viewInflate);
        return viewInflate;
    }
}
