package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nma {
    /* JADX INFO: renamed from: a */
    public static void m163808a(fma fmaVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fmaVar.f99736a = (ConstraintLayout) viewGroup.getChildAt(0);
        fmaVar.f99737b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fmaVar.f99738c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fmaVar.f99739d = (SearchView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fmaVar.f99740e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        fmaVar.f99741f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        fmaVar.f99742g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163809b(fma fmaVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157076m4, viewGroup, false);
        m163808a(fmaVar, viewInflate);
        return viewInflate;
    }
}
