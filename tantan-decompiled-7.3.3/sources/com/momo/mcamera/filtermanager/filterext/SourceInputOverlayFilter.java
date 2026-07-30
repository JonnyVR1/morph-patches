package com.momo.mcamera.filtermanager.filterext;

import android.opengl.Matrix;
import java.util.List;
import p153l.e950;
import p153l.gfj;

/* JADX INFO: loaded from: classes6.dex */
public class SourceInputOverlayFilter extends e950 {
    private gfj glTextureOutputRenderer;

    public SourceInputOverlayFilter(float f, gfj gfjVar) {
        super(f);
        this.glTextureOutputRenderer = gfjVar;
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        gfj gfjVar2;
        if (z) {
            markAsDirty();
        }
        List<float[]> list = this.mvpLists;
        if (list != null && list.size() > 0 && (gfjVar2 = this.glTextureOutputRenderer) != null) {
            this.texture_in = gfjVar2.getTextOutID();
        }
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
        List<float[]> list2 = this.mvpLists;
        if (list2 != null) {
            list2.clear();
        }
    }

    public String toString() {
        gfj gfjVar = this.glTextureOutputRenderer;
        return gfjVar != null ? gfjVar.toString() : "";
    }
}
