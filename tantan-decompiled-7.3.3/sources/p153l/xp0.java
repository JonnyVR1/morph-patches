package p153l;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public interface xp0 {
    /* JADX INFO: renamed from: a */
    int mo99390a(int i);

    /* JADX INFO: renamed from: b */
    int mo99391b();

    /* JADX INFO: renamed from: c */
    oq0 mo99392c();

    /* JADX INFO: renamed from: d */
    int mo99393d();

    /* JADX INFO: renamed from: e */
    void mo99394e(int i, Canvas canvas);

    /* JADX INFO: renamed from: f */
    xp0 mo99395f(Rect rect);

    /* JADX INFO: renamed from: g */
    int mo99396g();

    int getFrameCount();

    AnimatedDrawableFrameInfo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getWidth();

    /* JADX INFO: renamed from: h */
    void mo99397h(int i, Canvas canvas);
}
