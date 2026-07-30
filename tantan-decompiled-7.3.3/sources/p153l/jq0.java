package p153l;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public interface jq0 {
    boolean doesRenderSupportScaling();

    Bitmap.Config getAnimatedBitmapConfig();

    nq0 getFrame(int i);

    int getFrameCount();

    int[] getFrameDurations();

    AnimatedDrawableFrameInfo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
