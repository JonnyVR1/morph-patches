package p149l;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;

/* JADX INFO: loaded from: classes12.dex */
public class hyh implements SpanWatcher {

    /* JADX INFO: renamed from: a */
    public Class f110117a;

    /* JADX INFO: renamed from: b */
    public int f110118b = 0;

    /* JADX INFO: renamed from: c */
    public int f110119c = 0;

    public hyh(Class cls) {
        this.f110117a = cls;
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (obj == Selection.SELECTION_END && this.f110119c != i3) {
            this.f110119c = i3;
            Object[] spans = spannable.getSpans(i3, i4, this.f110117a);
            if (spans == null || spans.length == 0) {
                return;
            }
            Object obj2 = spans[0];
            int spanStart = spannable.getSpanStart(obj2);
            int spanEnd = spannable.getSpanEnd(obj2);
            if (Math.abs(this.f110119c - spanEnd) <= Math.abs(this.f110119c - spanStart)) {
                spanStart = spanEnd;
            }
            Selection.setSelection(spannable, Selection.getSelectionStart(spannable), spanStart);
        }
        if (obj != Selection.SELECTION_START || this.f110118b == i3) {
            return;
        }
        this.f110118b = i3;
        Object[] spans2 = spannable.getSpans(i3, i4, this.f110117a);
        if (spans2 == null || spans2.length == 0) {
            return;
        }
        Object obj3 = spans2[0];
        int spanStart2 = spannable.getSpanStart(obj3);
        int spanEnd2 = spannable.getSpanEnd(obj3);
        if (Math.abs(this.f110118b - spanEnd2) <= Math.abs(this.f110118b - spanStart2)) {
            spanStart2 = spanEnd2;
        }
        Selection.setSelection(spannable, spanStart2, Selection.getSelectionEnd(spannable));
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}
