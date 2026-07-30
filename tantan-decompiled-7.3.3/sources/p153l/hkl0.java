package p153l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public class hkl0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m135638a(View view, boolean z) {
        if (view instanceof eam) {
            ((eam) view).mo37118b(z);
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
            m135638a(viewGroup.getChildAt(i), z);
            i++;
        }
    }
}
