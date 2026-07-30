package com.p051p1.mobile.putong.core.newui.messages.quickchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatEntryTouchObserveView extends View {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatEntryTouchObserveView$a */
    public interface InterfaceC8334a {
    }

    public QuickchatEntryTouchObserveView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTouchObserver(InterfaceC8334a interfaceC8334a) {
    }

    public QuickchatEntryTouchObserveView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuickchatEntryTouchObserveView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
