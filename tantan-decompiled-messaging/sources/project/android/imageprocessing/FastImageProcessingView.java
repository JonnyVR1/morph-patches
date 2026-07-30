package project.android.imageprocessing;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import p149l.iig;

/* JADX INFO: loaded from: classes3.dex */
public class FastImageProcessingView extends GLSurfaceView {
    public FastImageProcessingView(Context context) {
        this(context, null);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }

    public void setPipeline(iig iigVar) {
        setRenderer(iigVar);
        setRenderMode(0);
    }

    public FastImageProcessingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDebugFlags(3);
        setEGLContextClientVersion(2);
    }
}
