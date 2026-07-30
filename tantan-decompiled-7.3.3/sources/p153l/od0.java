package p153l;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class od0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Spannable f146754a;

    public od0(Spannable spannable) {
        this.f146754a = spannable;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f146754a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else {
                    Spannable spannable = this.f146754a;
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), this.f146754a.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(this.f146754a);
        }
        return false;
    }
}
