package com.momo.xeengine.event;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface ITouchEventHandler {
    void handleTouchEvent(MotionEvent motionEvent, float f, float f2);

    void handleTouchEvent(MotionEvent motionEvent, View view);

    boolean handleTouchHitTest();
}
