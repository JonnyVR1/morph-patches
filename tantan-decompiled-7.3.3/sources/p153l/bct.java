package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bct {
    /* JADX INFO: renamed from: a */
    public static void m103551a(xbt xbtVar, View view) {
        xbtVar.f193211k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xbtVar.f193212l = (CardView) viewGroup.getChildAt(0);
        xbtVar.f193213m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        xbtVar.f193214n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        xbtVar.f193215o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
