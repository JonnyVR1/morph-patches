package com.momo.mcamera.mask;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.core.glcore.util.Log4Cam;
import java.util.LinkedList;
import java.util.Queue;
import p153l.erf0;
import p153l.gam;
import p153l.gfj;
import p153l.jt2;
import p153l.pej;
import p153l.row;
import p153l.tow;

/* JADX INFO: loaded from: classes8.dex */
public class BasicRender {
    private static final String TAG = "MomoRender";
    final Queue<Runnable> mRunOnDraw;
    final Queue<Runnable> mRunOnDrawEnd;
    private SurfaceTexture mSurfaceTexture;
    protected tow mrCoreParameters;
    protected pej pipeline;
    private int previewHeight;
    private int previewWidth;
    jt2 selectFilter;
    private int mTextureID = -12345;
    protected gfj mRootRender = null;
    protected NormalFilter mTailRender = null;
    SurfaceChangedListener onSurfaceChangedListener = null;

    public interface SurfaceChangedListener {
        void onSurfaceChanged();
    }

    public BasicRender(tow towVar) {
        this.previewWidth = 352;
        this.previewHeight = 640;
        this.mrCoreParameters = towVar;
        if (towVar != null) {
            this.previewWidth = towVar.f175478e;
            this.previewHeight = towVar.f175480f;
        }
        this.mRunOnDraw = new LinkedList();
        this.mRunOnDrawEnd = new LinkedList();
    }

    private void initPipline(jt2 jt2Var) {
        pej pejVar = new pej();
        this.pipeline = pejVar;
        pejVar.m172020c(this.previewWidth, this.previewHeight);
        initInternalFilter();
        if (jt2Var != null) {
            this.selectFilter = jt2Var;
            this.mRootRender.addTarget(jt2Var);
            this.selectFilter.addTarget(this.mTailRender);
        } else {
            this.mRootRender.addTarget(this.mTailRender);
        }
        pejVar.m172019b(this.mRootRender);
        pejVar.m172027k();
    }

    public void addFilterToDestroy(jt2 jt2Var) {
        pej pejVar = this.pipeline;
        if (pejVar != null) {
            pejVar.m172018a(jt2Var);
        }
    }

    public void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            Log4Cam.m7377e(TAG, str + ": glError " + iGlGetError);
        }
    }

    public SurfaceTexture createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.mTextureID = i;
        GLES20.glBindTexture(36197, i);
        checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        checkGlError("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureID);
        this.mSurfaceTexture = surfaceTexture;
        return surfaceTexture;
    }

    public void drawCodecFrame() {
        runAll(this.mRunOnDraw);
        drawDataToCodec();
    }

    public void drawDataToCodec() {
    }

    public void drawDataToDispalay() {
    }

    public void drawFrame(int i) {
        runAll(this.mRunOnDraw);
        drawDataToDispalay();
        GLES20.glFinish();
        runAll(this.mRunOnDrawEnd);
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void initInternalFilter() {
    }

    public boolean prepare(row rowVar, jt2 jt2Var) {
        initPipline(jt2Var);
        return true;
    }

    public void release() {
        try {
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable unused) {
        }
        this.mSurfaceTexture = null;
        pej pejVar = this.pipeline;
        if (pejVar != null) {
            pejVar.m172021d();
            this.pipeline = null;
        }
        jt2 jt2Var = this.selectFilter;
        if (jt2Var != null) {
            jt2Var.destroy();
            this.selectFilter = null;
        }
        NormalFilter normalFilter = this.mTailRender;
        if (normalFilter != null) {
            normalFilter.destroy();
            this.mTailRender = null;
        }
        Queue<Runnable> queue = this.mRunOnDraw;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.mRunOnDrawEnd;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    public void runAll(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    queue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void runOnDraw(Runnable runnable) {
        synchronized (this.mRunOnDraw) {
            this.mRunOnDraw.add(runnable);
        }
    }

    public void runOnDrawEnd(Runnable runnable) {
        synchronized (this.mRunOnDrawEnd) {
            this.mRunOnDrawEnd.add(runnable);
        }
    }

    public void selectFilter(jt2 jt2Var) {
        jt2 jt2Var2;
        if (jt2Var == null || jt2Var == (jt2Var2 = this.selectFilter) || this.mRootRender == null) {
            return;
        }
        if (jt2Var2 != null) {
            jt2Var2.clearTarget();
            this.pipeline.m172018a(this.selectFilter);
        }
        this.selectFilter = jt2Var;
        this.mRootRender.clearTarget();
        jt2 jt2Var3 = this.selectFilter;
        gfj gfjVar = this.mRootRender;
        if (jt2Var3 == null) {
            gfjVar.addTarget(this.mTailRender);
        } else {
            gfjVar.addTarget(jt2Var3);
            this.selectFilter.addTarget(this.mTailRender);
        }
    }

    public void setOnSurfaceChangedListener(SurfaceChangedListener surfaceChangedListener) {
        this.onSurfaceChangedListener = surfaceChangedListener;
    }

    public void setTimeStamp(long j) {
        Object obj = this.selectFilter;
        if (obj instanceof gam) {
            ((gam) obj).setTimeStamp(j);
        }
    }

    public void surfaceCreated() {
        this.mSurfaceTexture = createTexture();
    }

    public void updateRenderSize(final erf0 erf0Var, final boolean z, final int i) {
        synchronized (this.mRunOnDraw) {
            this.mRunOnDraw.clear();
        }
        runOnDraw(new Runnable() { // from class: com.momo.mcamera.mask.BasicRender.1
            @Override // java.lang.Runnable
            public void run() {
                SurfaceChangedListener surfaceChangedListener = BasicRender.this.onSurfaceChangedListener;
                if (surfaceChangedListener != null) {
                    surfaceChangedListener.onSurfaceChanged();
                }
                BasicRender.this.updateSize(erf0Var, z, i);
            }
        });
    }

    public void updateSize(erf0 erf0Var, boolean z, int i) {
    }
}
