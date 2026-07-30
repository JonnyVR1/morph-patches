package tech.sud.runtime.component.p145h;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: tech.sud.runtime.component.h.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C22431b {
    /* JADX INFO: renamed from: a */
    public static int m221841a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: renamed from: b */
    public static int m221842b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
