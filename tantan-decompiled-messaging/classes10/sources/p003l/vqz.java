package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.tqz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vqz {
    /* JADX INFO: renamed from: a */
    public static void m10257a(tqz tqzVar, View view) {
        tqzVar.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqzVar.b = (RelativeLayout) viewGroup.getChildAt(0);
        tqzVar.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tqzVar.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tqzVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        tqzVar.f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        tqzVar.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tqzVar.h = viewGroup.getChildAt(1);
    }
}
