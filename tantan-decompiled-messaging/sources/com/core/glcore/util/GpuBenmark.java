package com.core.glcore.util;

/* JADX INFO: loaded from: classes.dex */
public class GpuBenmark {
    private GpuBenmarkRenderer glRenderer;
    private GpuBenmarkListener gpuBenmarkListener;

    private void init() {
        this.glRenderer = new GpuBenmarkRenderer();
        this.glRenderer.addSurface(new GLSurface(512, 512));
    }

    public void releaseGL() {
        GpuBenmarkRenderer gpuBenmarkRenderer = this.glRenderer;
        if (gpuBenmarkRenderer != null) {
            gpuBenmarkRenderer.release();
            this.glRenderer = null;
        }
    }

    public void setGpuBenmarkListener(GpuBenmarkListener gpuBenmarkListener) {
        this.gpuBenmarkListener = gpuBenmarkListener;
    }

    public void startGpuBenmark() {
        init();
        this.glRenderer.setGpuRenderListener(new GpuRenderListener() { // from class: com.core.glcore.util.GpuBenmark.1
            @Override // com.core.glcore.util.GpuRenderListener
            public void getRenderTime(double d) {
                GpuBenmark.this.gpuBenmarkListener.getGpuBenmark(d);
            }
        });
        this.glRenderer.startRender();
        this.glRenderer.requestRender();
    }
}
