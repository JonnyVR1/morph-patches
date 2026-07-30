package p153l;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes10.dex */
public class jvd {
    /* JADX INFO: renamed from: a */
    public static int m147011a(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }
}
