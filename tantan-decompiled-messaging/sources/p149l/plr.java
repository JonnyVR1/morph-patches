package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class plr {
    /* JADX INFO: renamed from: a */
    public static void m170253a(mlr mlrVar, View view) {
        mlrVar.f134489d = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.f134490e = (RelativeLayout) viewGroup.getChildAt(0);
        mlrVar.f134491f = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mlrVar.f134492g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mlrVar.f134493h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
