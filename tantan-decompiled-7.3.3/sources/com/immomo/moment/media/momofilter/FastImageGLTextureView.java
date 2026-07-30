package com.immomo.moment.media.momofilter;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes7.dex */
public class FastImageGLTextureView extends GLTextureView {
    public FastImageGLTextureView(Context context) {
        super(context);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }

    public void setPipeline(GLSurfaceView.Renderer renderer) {
        setRenderer(renderer);
        setRenderMode(0);
    }

    public FastImageGLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }
}
