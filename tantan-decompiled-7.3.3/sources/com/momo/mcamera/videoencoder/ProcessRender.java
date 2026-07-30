package com.momo.mcamera.videoencoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.view.Surface;
import com.momo.mcamera.videoprocess.VideoProcessListener;
import com.momo.mcamera.videoprocess.VideoResourceProcessInput;
import p153l.jt2;
import p153l.pej;
import p153l.zej;

/* JADX INFO: loaded from: classes8.dex */
class ProcessRender {
    private static final String TAG = "TextureRender";
    private SurfaceTexture mSurfaceTexture;
    pej pipeline;
    private int previewHeight;
    private int previewWidth;
    private VideoProcessListener processListener;
    private ProcessParam processParam;
    private ProcessSurface processSurface;
    private zej screenEndpoint;
    private jt2 selectFilter;
    VideoResourceProcessInput textureResourceInput;

    public ProcessRender(jt2 jt2Var, ProcessSurface processSurface, ProcessParam processParam) {
        this.previewWidth = 352;
        this.previewHeight = 640;
        this.processSurface = processSurface;
        this.processParam = processParam;
        this.previewWidth = processParam.getOutPutWidth();
        this.previewHeight = processParam.getOutPutHeight();
        initPipline(jt2Var);
    }

    private void initPipline(jt2 jt2Var) {
        this.selectFilter = jt2Var;
        this.textureResourceInput = new VideoResourceProcessInput(this.processParam, this.processSurface);
        pej pejVar = new pej();
        pejVar.m172020c(this.previewWidth, this.previewHeight);
        this.textureResourceInput.setRenderSize(this.previewWidth, this.previewHeight);
        this.textureResourceInput.addTarget(this.selectFilter);
        zej zejVar = new zej();
        this.screenEndpoint = zejVar;
        this.selectFilter.addTarget(zejVar);
        pejVar.m172019b(this.textureResourceInput);
        this.pipeline = pejVar;
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

    public void addFilterToDestory(jt2 jt2Var) {
        pej pejVar = this.pipeline;
        if (pejVar != null) {
            pejVar.m172018a(jt2Var);
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
        pej pejVar = this.pipeline;
        if (pejVar != null) {
            pejVar.m172024h();
        }
    }

    public void drawScreenFrame() {
        zej zejVar = this.screenEndpoint;
        if (zejVar != null) {
            zejVar.onDrawFrame();
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
        pej pejVar = this.pipeline;
        if (pejVar != null) {
            pejVar.m172025i();
            this.pipeline.m172021d();
            this.pipeline = null;
        }
        VideoResourceProcessInput videoResourceProcessInput2 = this.textureResourceInput;
        if (videoResourceProcessInput2 != null) {
            videoResourceProcessInput2.destroy();
        }
        zej zejVar = this.screenEndpoint;
        if (zejVar != null) {
            zejVar.destroy();
        }
        if (this.processListener != null) {
            this.processListener = null;
        }
        this.processSurface = null;
    }

    public void selectFilter(jt2 jt2Var) {
        jt2 jt2Var2 = this.selectFilter;
        if (jt2Var2 != null) {
            this.textureResourceInput.removeTarget(jt2Var2);
            this.pipeline.m172018a(this.selectFilter);
        }
        this.selectFilter = jt2Var;
        this.textureResourceInput.addTarget(jt2Var);
        this.selectFilter.addTarget(this.screenEndpoint);
    }

    public void setFrameRate(int i) {
        this.textureResourceInput.setFrameRate(i);
    }

    public void setProcessListener(VideoProcessListener videoProcessListener) {
        this.processListener = videoProcessListener;
    }

    public void startRender() {
        this.pipeline.m172027k();
        this.textureResourceInput.startVideoDecode();
        this.pipeline.m172024h();
    }

    public void surfaceCreated() {
        this.mSurfaceTexture = createTexture();
    }
}
