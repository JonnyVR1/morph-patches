package p002l;

import android.view.View;
import android.view.ViewGroup;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aat {
    /* JADX INFO: renamed from: a */
    public static void m9467a(w9t w9tVar, View view) {
        w9tVar.f21580k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w9tVar.f21581l = viewGroup.getChildAt(0);
        w9tVar.f21582m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        w9tVar.f21583n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        w9tVar.f21584o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
