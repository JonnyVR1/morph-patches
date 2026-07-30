package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k6p {
    /* JADX INFO: renamed from: a */
    public static void m148532a(j6p j6pVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j6pVar.f118577f = viewGroup.getChildAt(0);
        j6pVar.f118578g = (ConstraintLayout) viewGroup.getChildAt(1);
        j6pVar.f118579h = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j6pVar.f118580i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j6pVar.f118581j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        j6pVar.f118582k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        j6pVar.f118583l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        j6pVar.f118584m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        j6pVar.f118585n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m148533b(j6p j6pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125549O4, viewGroup, false);
        m148532a(j6pVar, viewInflate);
        return viewInflate;
    }
}
