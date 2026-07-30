package com.momo.mcamera.filtermanager.filterext;

import android.opengl.Matrix;
import java.util.List;
import p149l.mcj;
import p149l.p050;

/* JADX INFO: loaded from: classes6.dex */
public class SourceInputOverlayFilter extends p050 {
    private mcj glTextureOutputRenderer;

    public SourceInputOverlayFilter(float f, mcj mcjVar) {
        super(f);
        this.glTextureOutputRenderer = mcjVar;
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        mcj mcjVar2;
        if (z) {
            markAsDirty();
        }
        List<float[]> list = this.mvpLists;
        if (list != null && list.size() > 0 && (mcjVar2 = this.glTextureOutputRenderer) != null) {
            this.texture_in = mcjVar2.getTextOutID();
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
        List<float[]> list2 = this.mvpLists;
        if (list2 != null) {
            list2.clear();
        }
    }

    public String toString() {
        mcj mcjVar = this.glTextureOutputRenderer;
        return mcjVar != null ? mcjVar.toString() : "";
    }
}
