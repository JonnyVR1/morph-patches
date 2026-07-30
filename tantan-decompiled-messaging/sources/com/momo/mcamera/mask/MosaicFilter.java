package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import com.p046p1.mobile.putong.data.OMSSizeType;
import p149l.etf;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class MosaicFilter extends ts2 implements etf {
    private pjw mmcvInfo;
    private float[] mosaicTriggerAngle;
    private int ratioHandle;
    private int tileSizeHandle;
    private final String UNIFORM_TILE_SIZE = "tile_size";
    private final String UNIFORM_RATIO = OMSSizeType.ratio;
    private float tileSize = 0.5f;
    private Handler handler = new Handler(Looper.getMainLooper());
    private volatile boolean isKeepMosaic = false;
    private Runnable runnable = new Runnable() { // from class: com.momo.mcamera.mask.MosaicFilter.1
        @Override // java.lang.Runnable
        public void run() {
            MosaicFilter.this.isKeepMosaic = false;
        }
    };
    String fragmentShader = "precision highp float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform float tile_size;\nuniform float ratio;\n\nvoid main()\n{\n   vec2 mos_texCoord;\n   if(tile_size > 0.0) {\n       float factor = 25.0 / tile_size;\n       mos_texCoord = floor(textureCoordinate * vec2(factor * ratio, factor))/vec2(factor * ratio, factor);\n   } else {\n       mos_texCoord = textureCoordinate;\n   }\n   gl_FragColor = texture2D(inputImageTexture, mos_texCoord);\n}";

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.fragmentShader;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.tileSizeHandle = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
        this.ratioHandle = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
    }

    public void keepMosaic(long j) {
        this.handler.removeCallbacks(this.runnable);
        this.isKeepMosaic = true;
        this.handler.postDelayed(this.runnable, j);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() != 1 || this.isKeepMosaic) {
            GLES20.glUniform1f(this.tileSizeHandle, this.tileSize);
        } else {
            float f = this.mmcvInfo.m169946j(0).m220012c()[0];
            float[] fArr = this.mosaicTriggerAngle;
            float f2 = fArr == null ? 90.0f : fArr[0];
            float f3 = this.mmcvInfo.m169946j(0).m220012c()[1];
            float[] fArr2 = this.mosaicTriggerAngle;
            float f4 = fArr2 == null ? 90.0f : fArr2[1];
            float f5 = this.mmcvInfo.m169946j(0).m220012c()[2];
            float[] fArr3 = this.mosaicTriggerAngle;
            float f6 = fArr3 != null ? fArr3[2] : 90.0f;
            if (Math.abs(f) > f2 || Math.abs(f3) > f4 || Math.abs(f5) > f6) {
                GLES20.glUniform1f(this.tileSizeHandle, this.tileSize);
            } else {
                GLES20.glUniform1f(this.tileSizeHandle, 0.0f);
            }
        }
        GLES20.glUniform1f(this.ratioHandle, getWidth() / getHeight());
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }

    public void setMosaicTriggerAngle(float[] fArr) {
        this.mosaicTriggerAngle = fArr;
    }

    public void setTileSize(float f) {
        this.tileSize = f;
    }
}
