package p153l;

import android.text.Spannable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tuf0 {
    /* JADX INFO: renamed from: a */
    public static void m192748a(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}
