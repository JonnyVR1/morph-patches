package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hmo {
    /* JADX INFO: renamed from: a */
    public static void m131738a(gmo gmoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gmoVar.f103495a = (AutoVDraweeView) viewGroup.getChildAt(0);
        gmoVar.f103496b = (VImage) viewGroup.getChildAt(1);
        gmoVar.f103497c = (VRelative) viewGroup.getChildAt(2);
        gmoVar.f103498d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gmoVar.f103499e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gmoVar.f103500f = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gmoVar.f103501g = (VImage) viewGroup.getChildAt(3);
        gmoVar.f103502h = (VText) viewGroup.getChildAt(4);
        gmoVar.f103503i = (VText) viewGroup.getChildAt(5);
        gmoVar.f103504j = (VText) viewGroup.getChildAt(6);
    }
}
