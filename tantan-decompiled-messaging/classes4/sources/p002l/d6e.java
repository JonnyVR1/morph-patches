package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d6e {
    /* JADX INFO: renamed from: a */
    public static void m11606a(c6e c6eVar, View view) {
        c6eVar.f8498k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c6eVar.f8499l = (LinearLayout) viewGroup.getChildAt(0);
        c6eVar.f8500m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c6eVar.f8501n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c6eVar.f8502o = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
