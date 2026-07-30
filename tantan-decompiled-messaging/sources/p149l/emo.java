package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class emo {
    /* JADX INFO: renamed from: a */
    public static void m117207a(dmo dmoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dmoVar.f86966a = (LinearLayout) viewGroup.getChildAt(0);
        dmoVar.f86967b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dmoVar.f86968c = (VLinear) viewGroup.getChildAt(1);
        dmoVar.f86969d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dmoVar.f86970e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dmoVar.f86971f = (VText) viewGroup.getChildAt(2);
    }
}
