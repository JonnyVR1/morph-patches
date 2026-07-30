package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.o7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dbl0 {
    /* JADX INFO: renamed from: a */
    public static void m6099a(View view, boolean z) {
        if (view instanceof o7m) {
            ((o7m) view).b(z);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            m6099a(viewGroup.getChildAt(i), z);
            i++;
        }
    }
}
