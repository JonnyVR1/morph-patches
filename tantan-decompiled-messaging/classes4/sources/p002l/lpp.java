package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import l.kpp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lpp {
    /* JADX INFO: renamed from: a */
    public static void m17346a(kpp kppVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kppVar.x = viewGroup.getChildAt(0);
        kppVar.y = (FrameLayout) viewGroup.getChildAt(1);
        kppVar.z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kppVar.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kppVar.B = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
