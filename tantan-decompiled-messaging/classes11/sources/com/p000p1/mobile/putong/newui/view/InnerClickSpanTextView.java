package com.p000p1.mobile.putong.newui.view;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class InnerClickSpanTextView extends VText {

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.InnerClickSpanTextView$a */
    public static class ViewOnTouchListenerC0481a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (!(text instanceof Spanned)) {
                return false;
            }
            Spanned spanned = (Spanned) text;
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                int totalPaddingTop = y - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    ClickableSpan clickableSpan = clickableSpanArr[0];
                    if (action == 1) {
                        clickableSpan.onClick(textView);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public InnerClickSpanTextView(Context context) {
        super(context);
        m9469l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private void m9469l() {
        setOnTouchListener(new ViewOnTouchListenerC0481a());
    }

    public InnerClickSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9469l();
    }

    public InnerClickSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9469l();
    }
}
