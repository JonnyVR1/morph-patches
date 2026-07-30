package p009l;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vtd {
    /* JADX INFO: renamed from: a */
    public static int m23720a(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }
}
