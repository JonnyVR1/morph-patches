package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.result.BoostContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z53 {
    /* JADX INFO: renamed from: a */
    public static void m11344a(BoostContent boostContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostContent.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostContent.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        boostContent.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
