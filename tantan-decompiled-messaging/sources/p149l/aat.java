package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aat {
    /* JADX INFO: renamed from: a */
    public static void m95572a(w9t w9tVar, View view) {
        w9tVar.f185397k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w9tVar.f185398l = (CardView) viewGroup.getChildAt(0);
        w9tVar.f185399m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        w9tVar.f185400n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        w9tVar.f185401o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
