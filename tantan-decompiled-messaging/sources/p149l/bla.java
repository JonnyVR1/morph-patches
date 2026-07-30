package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bla {
    /* JADX INFO: renamed from: a */
    public static void m102511a(tka tkaVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tkaVar.f170827a = (ConstraintLayout) viewGroup.getChildAt(0);
        tkaVar.f170828b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tkaVar.f170829c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tkaVar.f170830d = (SearchView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tkaVar.f170831e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        tkaVar.f170832f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        tkaVar.f170833g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m102512b(tka tkaVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126520m4, viewGroup, false);
        m102511a(tkaVar, viewInflate);
        return viewInflate;
    }
}
