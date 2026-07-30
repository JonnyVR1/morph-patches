package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.TextureHelper;
import com.cosmos.mdlog.MDLog;
import com.momocv.segmentation.SegmentationInfo;
import p149l.mcj;
import p149l.mkw;
import p149l.pjw;
import p149l.vjw;
import p149l.xxx;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentFilter extends FaceDetectFilter {
    private static final String UNIFORM_TEXTURE_ALPHA = "inputImageTexture2";
    protected int alphaHandler;
    protected pjw mmcvInfo;
    protected int alphaTexture = 0;
    protected vjw mmcvFrame = new vjw();
    protected mkw params = new mkw(4);

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
        super.destroy();
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 colorAlpha = texture2D(inputImageTexture2, vec2(textureCoordinate.x, 1.0 - textureCoordinate.y));\n   gl_FragColor = colorAlpha;\n}\n";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXTURE_ALPHA);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        processSegment(getWidth(), getHeight());
    }

    public void processSegment(int i, int i2) {
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.f149900g == null) {
            MDLog.m7391e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        boolean zM169958v = pjwVar.m169958v();
        vjw vjwVar = this.mmcvFrame;
        if (zM169958v) {
            vjwVar.m198695h(17);
        } else {
            vjwVar.m198695h(4);
            this.params.m155070E(false);
        }
        this.mmcvFrame.m198694g(this.mmcvInfo.f149900g);
        this.mmcvFrame.m198693f(this.mmcvInfo.f149900g.length);
        this.mmcvFrame.m198700m(this.mmcvInfo.m169956t());
        this.mmcvFrame.m198697j(this.mmcvInfo.m169949m());
        this.mmcvFrame.m198699l(this.mmcvInfo.m169956t());
        this.params.m155094p(SegmentHelper.isFrontCamera());
        this.params.m155066A(SegmentHelper.getRotateDegree());
        this.params.m155104z(SegmentHelper.getRestoreDegree());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SegmentationInfo segmentationInfoProcess = SegmentHelper.process(this.mmcvFrame, this.params, !this.mmcvInfo.m169958v(), null);
        byte[] bArr = segmentationInfoProcess.mask_;
        xxx.m211572F().m211623m0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        GLES20.glActiveTexture(33987);
        int i3 = this.alphaTexture;
        int i4 = segmentationInfoProcess.mask_width;
        if (i3 == 0) {
            this.alphaTexture = TextureHelper.byteToLuminanceTexture(bArr, i4, segmentationInfoProcess.mask_height);
        } else {
            TextureHelper.byteToLuminanceTextureBytextureId(i3, bArr, i4, segmentationInfoProcess.mask_height);
        }
        GLES20.glUniform1i(this.alphaHandler, 3);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }
}
