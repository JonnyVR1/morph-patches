package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.bkp;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ckp {
    /* JADX INFO: renamed from: a */
    public static void m5958a(bkp bkpVar, View view) {
        bkpVar.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bkpVar.b = viewGroup.getChildAt(0);
        bkpVar.c = viewGroup.getChildAt(1);
        bkpVar.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bkpVar.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
