package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.TextureHelper;
import com.cosmos.mdlog.MDLog;
import com.momocv.segmentation.SegmentationInfo;
import p153l.gfj;
import p153l.lnw;
import p153l.omw;
import p153l.u6y;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class SegmentFilter extends FaceDetectFilter {
    private static final String UNIFORM_TEXTURE_ALPHA = "inputImageTexture2";
    protected int alphaHandler;
    protected omw mmcvInfo;
    protected int alphaTexture = 0;
    protected umw mmcvFrame = new umw();
    protected lnw params = new lnw(4);

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
        super.destroy();
    }

    @Override // p153l.gfj
    public void drawSub() {
        super.drawSub();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 colorAlpha = texture2D(inputImageTexture2, vec2(textureCoordinate.x, 1.0 - textureCoordinate.y));\n   gl_FragColor = colorAlpha;\n}\n";
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXTURE_ALPHA);
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        processSegment(getWidth(), getHeight());
    }

    public void processSegment(int i, int i2) {
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || omwVar.f148020g == null) {
            MDLog.m7445e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        boolean zM168307v = omwVar.m168307v();
        umw umwVar = this.mmcvFrame;
        if (zM168307v) {
            umwVar.m196802h(17);
        } else {
            umwVar.m196802h(4);
            this.params.m154997E(false);
        }
        this.mmcvFrame.m196801g(this.mmcvInfo.f148020g);
        this.mmcvFrame.m196800f(this.mmcvInfo.f148020g.length);
        this.mmcvFrame.m196807m(this.mmcvInfo.m168305t());
        this.mmcvFrame.m196804j(this.mmcvInfo.m168298m());
        this.mmcvFrame.m196806l(this.mmcvInfo.m168305t());
        this.params.m155021p(SegmentHelper.isFrontCamera());
        this.params.m154993A(SegmentHelper.getRotateDegree());
        this.params.m155031z(SegmentHelper.getRestoreDegree());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SegmentationInfo segmentationInfoProcess = SegmentHelper.process(this.mmcvFrame, this.params, !this.mmcvInfo.m168307v(), null);
        byte[] bArr = segmentationInfoProcess.mask_;
        u6y.m194722F().m194773m0(SystemClock.elapsedRealtime() - jElapsedRealtime);
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

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mmcvInfo = omwVar;
    }
}
