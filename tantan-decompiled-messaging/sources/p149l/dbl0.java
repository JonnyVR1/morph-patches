package p149l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public class dbl0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m110646a(View view, boolean z) {
        if (view instanceof o7m) {
            ((o7m) view).mo36115b(z);
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
            m110646a(viewGroup.getChildAt(i), z);
            i++;
        }
    }
}
