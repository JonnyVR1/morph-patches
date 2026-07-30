package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class qnr {
    /* JADX INFO: renamed from: a */
    public static void m177265a(nnr nnrVar, View view) {
        nnrVar.f142838d = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nnrVar.f142839e = (RelativeLayout) viewGroup.getChildAt(0);
        nnrVar.f142840f = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nnrVar.f142841g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nnrVar.f142842h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
