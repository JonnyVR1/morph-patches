package p149l;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public interface nq0 {
    boolean doesRenderSupportScaling();

    Bitmap.Config getAnimatedBitmapConfig();

    rq0 getFrame(int i);

    int getFrameCount();

    int[] getFrameDurations();

    AnimatedDrawableFrameInfo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
