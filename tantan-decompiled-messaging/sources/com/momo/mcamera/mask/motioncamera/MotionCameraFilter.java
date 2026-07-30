package com.momo.mcamera.mask.motioncamera;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.AbstractC17477i4;
import p149l.etf;
import p149l.pjw;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes7.dex */
public class MotionCameraFilter extends AbstractC17477i4 implements etf, MotionCameraFilterAdapter.OnCropRegionChangedListener {
    private float[] texData0 = new float[8];
    private float[] texData1 = new float[8];
    private float[] texData2 = new float[8];
    private float[] texData3 = new float[8];
    private MotionCameraFilterAdapter adapter = new MotionCameraFilterAdapter(this);

    private void updateTextureVertices(float f, float f2, float f3, float f4) {
        float[] fArr = this.texData0;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f2;
        fArr[4] = f;
        fArr[5] = f4;
        fArr[6] = f3;
        fArr[7] = f4;
        FloatBuffer[] floatBufferArr = this.textureVertices;
        if (floatBufferArr[0] == null) {
            floatBufferArr[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.textureVertices[0].clear();
        this.textureVertices[0].put(this.texData0).position(0);
        float[] fArr2 = this.texData1;
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = f;
        fArr2[3] = f2;
        fArr2[4] = f3;
        fArr2[5] = f4;
        fArr2[6] = f3;
        fArr2[7] = f2;
        FloatBuffer[] floatBufferArr2 = this.textureVertices;
        if (floatBufferArr2[1] == null) {
            floatBufferArr2[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.textureVertices[1].clear();
        this.textureVertices[1].put(this.texData1).position(0);
        float[] fArr3 = this.texData2;
        fArr3[0] = f3;
        fArr3[1] = f4;
        fArr3[2] = f;
        fArr3[3] = f4;
        fArr3[4] = f3;
        fArr3[5] = f2;
        fArr3[6] = f;
        fArr3[7] = f2;
        FloatBuffer[] floatBufferArr3 = this.textureVertices;
        if (floatBufferArr3[2] == null) {
            floatBufferArr3[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.textureVertices[2].clear();
        this.textureVertices[2].put(this.texData2).position(0);
        float[] fArr4 = this.texData3;
        fArr4[0] = f3;
        fArr4[1] = f2;
        fArr4[2] = f3;
        fArr4[3] = f4;
        fArr4[4] = f;
        fArr4[5] = f2;
        fArr4[6] = f;
        fArr4[7] = f4;
        FloatBuffer[] floatBufferArr4 = this.textureVertices;
        if (floatBufferArr4[3] == null) {
            floatBufferArr4[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.textureVertices[3].clear();
        this.textureVertices[3].put(this.texData3).position(0);
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        this.adapter.release();
    }

    @Override // com.momo.mcamera.mask.motioncamera.MotionCameraFilterAdapter.OnCropRegionChangedListener
    public void onCropRegionChanged(float f, float f2, float f3, float f4) {
        updateTextureVertices(f, 1.0f - f4, f3, 1.0f - f2);
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.adapter.setFilterOptions(filterOptions);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.adapter.updateMMCVInfo(pjwVar, this.width, this.height);
    }
}
