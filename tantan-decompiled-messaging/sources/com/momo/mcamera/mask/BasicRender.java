package com.momo.mcamera.mask;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.core.glcore.util.Log4Cam;
import java.util.LinkedList;
import java.util.Queue;
import p149l.jcj;
import p149l.mcj;
import p149l.q7m;
import p149l.slw;
import p149l.ts2;
import p149l.ulw;
import p149l.vbj;
import p149l.vif0;

/* JADX INFO: loaded from: classes7.dex */
public class BasicRender {
    private static final String TAG = "MomoRender";
    final Queue<Runnable> mRunOnDraw;
    final Queue<Runnable> mRunOnDrawEnd;
    private SurfaceTexture mSurfaceTexture;
    protected ulw mrCoreParameters;
    protected vbj pipeline;
    private int previewHeight;
    private int previewWidth;
    ts2 selectFilter;
    private int mTextureID = -12345;
    protected mcj mRootRender = null;
    protected NormalFilter mTailRender = null;
    SurfaceChangedListener onSurfaceChangedListener = null;

    public interface SurfaceChangedListener {
        void onSurfaceChanged();
    }

    public BasicRender(ulw ulwVar) {
        this.previewWidth = 352;
        this.previewHeight = 640;
        this.mrCoreParameters = ulwVar;
        if (ulwVar != null) {
            this.previewWidth = ulwVar.f177136e;
            this.previewHeight = ulwVar.f177138f;
        }
        this.mRunOnDraw = new LinkedList();
        this.mRunOnDrawEnd = new LinkedList();
    }

    private void initPipline(ts2 ts2Var) {
        vbj vbjVar = new vbj();
        this.pipeline = vbjVar;
        vbjVar.m197714c(this.previewWidth, this.previewHeight);
        initInternalFilter();
        if (ts2Var != null) {
            this.selectFilter = ts2Var;
            this.mRootRender.addTarget(ts2Var);
            this.selectFilter.addTarget(this.mTailRender);
        } else {
            this.mRootRender.addTarget(this.mTailRender);
        }
        vbjVar.m197713b(this.mRootRender);
        vbjVar.m197721k();
    }

    public void addFilterToDestroy(ts2 ts2Var) {
        vbj vbjVar = this.pipeline;
        if (vbjVar != null) {
            vbjVar.m197712a(ts2Var);
        }
    }

    public void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            Log4Cam.m7323e(TAG, str + ": glError " + iGlGetError);
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

    public boolean prepare(slw slwVar, ts2 ts2Var) {
        initPipline(ts2Var);
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
        vbj vbjVar = this.pipeline;
        if (vbjVar != null) {
            vbjVar.m197715d();
            this.pipeline = null;
        }
        ts2 ts2Var = this.selectFilter;
        if (ts2Var != null) {
            ts2Var.destroy();
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

    public void selectFilter(ts2 ts2Var) {
        ts2 ts2Var2;
        if (ts2Var == null || ts2Var == (ts2Var2 = this.selectFilter) || this.mRootRender == null) {
            return;
        }
        if (ts2Var2 != null) {
            ts2Var2.clearTarget();
            this.pipeline.m197712a(this.selectFilter);
        }
        this.selectFilter = ts2Var;
        this.mRootRender.clearTarget();
        ts2 ts2Var3 = this.selectFilter;
        mcj mcjVar = this.mRootRender;
        if (ts2Var3 == null) {
            mcjVar.addTarget(this.mTailRender);
        } else {
            mcjVar.addTarget(ts2Var3);
            this.selectFilter.addTarget(this.mTailRender);
        }
    }

    public void setOnSurfaceChangedListener(SurfaceChangedListener surfaceChangedListener) {
        this.onSurfaceChangedListener = surfaceChangedListener;
    }

    public void setTimeStamp(long j) {
        jcj jcjVar = this.selectFilter;
        if (jcjVar instanceof q7m) {
            ((q7m) jcjVar).setTimeStamp(j);
        }
    }

    public void surfaceCreated() {
        this.mSurfaceTexture = createTexture();
    }

    public void updateRenderSize(final vif0 vif0Var, final boolean z, final int i) {
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
                BasicRender.this.updateSize(vif0Var, z, i);
            }
        });
    }

    public void updateSize(vif0 vif0Var, boolean z, int i) {
    }
}
