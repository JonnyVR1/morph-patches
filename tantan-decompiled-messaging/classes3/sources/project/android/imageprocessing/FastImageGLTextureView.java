package project.android.imageprocessing;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
