package com.momo.mcamera.videoencoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.view.Surface;
import com.momo.mcamera.videoprocess.VideoProcessListener;
import com.momo.mcamera.videoprocess.VideoResourceProcessInput;
import p149l.fcj;
import p149l.ts2;
import p149l.vbj;

/* JADX INFO: loaded from: classes7.dex */
class ProcessRender {
    private static final String TAG = "TextureRender";
    private SurfaceTexture mSurfaceTexture;
    vbj pipeline;
    private int previewHeight;
    private int previewWidth;
    private VideoProcessListener processListener;
    private ProcessParam processParam;
    private ProcessSurface processSurface;
    private fcj screenEndpoint;
    private ts2 selectFilter;
    VideoResourceProcessInput textureResourceInput;

    public ProcessRender(ts2 ts2Var, ProcessSurface processSurface, ProcessParam processParam) {
        this.previewWidth = 352;
        this.previewHeight = 640;
        this.processSurface = processSurface;
        this.processParam = processParam;
        this.previewWidth = processParam.getOutPutWidth();
        this.previewHeight = processParam.getOutPutHeight();
        initPipline(ts2Var);
    }

    private void initPipline(ts2 ts2Var) {
        this.selectFilter = ts2Var;
        this.textureResourceInput = new VideoResourceProcessInput(this.processParam, this.processSurface);
        vbj vbjVar = new vbj();
        vbjVar.m197714c(this.previewWidth, this.previewHeight);
        this.textureResourceInput.setRenderSize(this.previewWidth, this.previewHeight);
        this.textureResourceInput.addTarget(this.selectFilter);
        fcj fcjVar = new fcj();
        this.screenEndpoint = fcjVar;
        this.selectFilter.addTarget(fcjVar);
        vbjVar.m197713b(this.textureResourceInput);
        this.pipeline = vbjVar;
        this.textureResourceInput.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.momo.mcamera.videoencoder.ProcessRender.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (ProcessRender.this.processSurface != null) {
                    ProcessRender.this.processSurface.onFrameAvailable(surfaceTexture);
                }
            }
        });
        this.textureResourceInput.setProcessListener(new VideoProcessListener() { // from class: com.momo.mcamera.videoencoder.ProcessRender.2
            @Override // com.momo.mcamera.videoprocess.VideoProcessListener
            public void onFail(Exception exc) {
                if (ProcessRender.this.processListener != null) {
                    ProcessRender.this.processListener.onFail(exc);
                }
            }

            @Override // com.momo.mcamera.videoprocess.VideoProcessListener
            public void onProcessFinish(String str) {
                if (ProcessRender.this.processListener != null) {
                    ProcessRender.this.processListener.onProcessFinish(null);
                }
            }

            @Override // com.momo.mcamera.videoprocess.VideoProcessListener
            public void onProcessProgress(float f) {
                if (ProcessRender.this.processListener != null) {
                    ProcessRender.this.processListener.onProcessProgress(f);
                }
            }

            @Override // com.momo.mcamera.videoprocess.VideoProcessListener
            public void onStart() {
                if (ProcessRender.this.processListener != null) {
                    ProcessRender.this.processListener.onStart();
                }
            }
        });
    }

    public void addFilterToDestory(ts2 ts2Var) {
        vbj vbjVar = this.pipeline;
        if (vbjVar != null) {
            vbjVar.m197712a(ts2Var);
        }
    }

    public void checkGlError(String str) {
        while (GLES20.glGetError() != 0) {
        }
    }

    public SurfaceTexture createTexture() {
        VideoResourceProcessInput videoResourceProcessInput = this.textureResourceInput;
        if (videoResourceProcessInput != null) {
            return videoResourceProcessInput.getSurfaceTexture();
        }
        return null;
    }

    public void drawFrame(int i) {
        vbj vbjVar = this.pipeline;
        if (vbjVar != null) {
            vbjVar.m197718h();
        }
    }

    public void drawScreenFrame() {
        fcj fcjVar = this.screenEndpoint;
        if (fcjVar != null) {
            fcjVar.onDrawFrame();
        }
    }

    public MediaCodec.BufferInfo getCurrentBuffer() {
        VideoResourceProcessInput videoResourceProcessInput = this.textureResourceInput;
        if (videoResourceProcessInput != null) {
            return videoResourceProcessInput.getCurrentBuffer();
        }
        return null;
    }

    public Surface getSurface() {
        VideoResourceProcessInput videoResourceProcessInput = this.textureResourceInput;
        if (videoResourceProcessInput != null) {
            return videoResourceProcessInput.getSurface();
        }
        return null;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public void release() {
        this.mSurfaceTexture = null;
        VideoResourceProcessInput videoResourceProcessInput = this.textureResourceInput;
        if (videoResourceProcessInput != null) {
            videoResourceProcessInput.stop();
        }
        vbj vbjVar = this.pipeline;
        if (vbjVar != null) {
            vbjVar.m197719i();
            this.pipeline.m197715d();
            this.pipeline = null;
        }
        VideoResourceProcessInput videoResourceProcessInput2 = this.textureResourceInput;
        if (videoResourceProcessInput2 != null) {
            videoResourceProcessInput2.destroy();
        }
        fcj fcjVar = this.screenEndpoint;
        if (fcjVar != null) {
            fcjVar.destroy();
        }
        if (this.processListener != null) {
            this.processListener = null;
        }
        this.processSurface = null;
    }

    public void selectFilter(ts2 ts2Var) {
        ts2 ts2Var2 = this.selectFilter;
        if (ts2Var2 != null) {
            this.textureResourceInput.removeTarget(ts2Var2);
            this.pipeline.m197712a(this.selectFilter);
        }
        this.selectFilter = ts2Var;
        this.textureResourceInput.addTarget(ts2Var);
        this.selectFilter.addTarget(this.screenEndpoint);
    }

    public void setFrameRate(int i) {
        this.textureResourceInput.setFrameRate(i);
    }

    public void setProcessListener(VideoProcessListener videoProcessListener) {
        this.processListener = videoProcessListener;
    }

    public void startRender() {
        this.pipeline.m197721k();
        this.textureResourceInput.startVideoDecode();
        this.pipeline.m197718h();
    }

    public void surfaceCreated() {
        this.mSurfaceTexture = createTexture();
    }
}
