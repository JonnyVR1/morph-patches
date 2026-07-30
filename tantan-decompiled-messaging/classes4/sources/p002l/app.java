package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.zop;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class app {
    /* JADX INFO: renamed from: a */
    public static void m9998a(zop zopVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zopVar.x = viewGroup.getChildAt(0);
        zopVar.y = (LinearLayout) viewGroup.getChildAt(1);
        zopVar.z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zopVar.A = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zopVar.B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        zopVar.C = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        zopVar.D = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
