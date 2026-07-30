package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zbu {
    /* JADX INFO: renamed from: a */
    public static void m218004a(wbu wbuVar, View view) {
        wbuVar.f185616k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wbuVar.f185617l = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wbuVar.f185618m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        wbuVar.f185619n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        wbuVar.f185620o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        wbuVar.f185621p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        wbuVar.f185622q = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
