package p149l;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public interface bq0 {
    /* JADX INFO: renamed from: a */
    int mo103304a(int i);

    /* JADX INFO: renamed from: b */
    int mo103305b();

    /* JADX INFO: renamed from: c */
    sq0 mo103306c();

    /* JADX INFO: renamed from: d */
    int mo103307d();

    /* JADX INFO: renamed from: e */
    void mo103308e(int i, Canvas canvas);

    /* JADX INFO: renamed from: f */
    bq0 mo103309f(Rect rect);

    /* JADX INFO: renamed from: g */
    int mo103310g();

    int getFrameCount();

    AnimatedDrawableFrameInfo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getWidth();

    /* JADX INFO: renamed from: h */
    void mo103311h(int i, Canvas canvas);
}
