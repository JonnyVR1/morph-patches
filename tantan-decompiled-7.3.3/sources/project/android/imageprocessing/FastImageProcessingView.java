package project.android.imageprocessing;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import p153l.wjg;

/* JADX INFO: loaded from: classes3.dex */
public class FastImageProcessingView extends GLSurfaceView {
    public FastImageProcessingView(Context context) {
        this(context, null);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }

    public void setPipeline(wjg wjgVar) {
        setRenderer(wjgVar);
        setRenderMode(0);
    }

    public FastImageProcessingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }
}
