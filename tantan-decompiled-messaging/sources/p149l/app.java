package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class app {
    /* JADX INFO: renamed from: a */
    public static void m98168a(zop zopVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zopVar.f204145x = viewGroup.getChildAt(0);
        zopVar.f204146y = (LinearLayout) viewGroup.getChildAt(1);
        zopVar.f204147z = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zopVar.f204139A = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zopVar.f204140B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        zopVar.f204141C = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        zopVar.f204142D = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
