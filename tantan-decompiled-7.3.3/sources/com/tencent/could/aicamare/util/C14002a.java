package com.tencent.could.aicamare.util;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.tencent.could.aicamare.util.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14002a {
    /* JADX INFO: renamed from: a */
    public static float m83375a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }
}
