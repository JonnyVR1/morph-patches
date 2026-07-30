package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.lc;
import v.VFrame;

/* JADX INFO: renamed from: l.mc */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0677mc {
    /* JADX INFO: renamed from: a */
    public static void m17813a(lc lcVar, View view) {
        lcVar.k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lcVar.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        lcVar.m = viewGroup.getChildAt(1);
    }
}
