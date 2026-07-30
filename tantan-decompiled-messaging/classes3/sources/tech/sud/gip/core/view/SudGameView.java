package tech.sud.gip.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudGameView extends FrameLayout {
    private SudGameViewLifecycleListener mListener;

    public SudGameView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SudGameViewLifecycleListener sudGameViewLifecycleListener = this.mListener;
        if (sudGameViewLifecycleListener != null) {
            sudGameViewLifecycleListener.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SudGameViewLifecycleListener sudGameViewLifecycleListener = this.mListener;
        if (sudGameViewLifecycleListener != null) {
            sudGameViewLifecycleListener.onDetachedFromWindow();
        }
    }

    public void setLifecycleListener(SudGameViewLifecycleListener sudGameViewLifecycleListener) {
        this.mListener = sudGameViewLifecycleListener;
    }

    public SudGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SudGameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SudGameView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
