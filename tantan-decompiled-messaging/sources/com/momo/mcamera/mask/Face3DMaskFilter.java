package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.Display;
import com.core.glcore.util.FacerigHelper;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.XEEngineHelper;
import com.core.glcore.util.XEFaceInfoHelper;
import com.cosmos.mdlog.MDLog;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.immomo.mmutil.task.C3804c;
import com.momo.mcamera.mask.segment.ByteDanceSegmentHelper;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import com.momo.xeengine.p044cv.bean.CVSegmentInfo;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import p149l.ccj;
import p149l.mcj;
import p149l.mkw;
import p149l.pjw;
import p149l.rbj;
import p149l.vif0;
import p149l.vjw;
import p149l.ybj;
import p149l.ysf;

/* JADX INFO: loaded from: classes7.dex */
public class Face3DMaskFilter extends FaceDetectFilter {
    static boolean autoRender = false;
    private static boolean forbiddenRender = false;

    /* JADX INFO: renamed from: h */
    private int f14241h;
    private boolean isCameraFront;
    private WeakReference<Context> mContext;
    private Display mDisplay;
    pjw mmcvInfo;
    private String rendertaskName;
    private String sceneId;
    private Sticker sticker;

    /* JADX INFO: renamed from: w */
    private int f14242w;
    private boolean inited = false;
    private boolean needFaceDetect = true;
    private int antialias = 1;
    private int frameCounter = 0;
    private boolean isCapture = false;
    private boolean isDrawBackGround = true;
    private Capture3DImageListener mCapture3DImageListener = null;
    private Rect mCaptureRect = null;
    private AdditionalInfo mAdditionalInfo = null;
    vjw mmcvFrame = new vjw();
    mkw params = new mkw(4);

    public Face3DMaskFilter(Sticker sticker, boolean z, Context context) {
        this.isCameraFront = false;
        this.mContext = null;
        this.isCameraFront = z;
        this.mContext = new WeakReference<>(context);
        this.sticker = sticker;
        loadScene(sticker);
        this.rendertaskName = toString();
        this.enableDepthBuffer = true;
        this.useCache = false;
    }

    public static void SetAutoRender(boolean z) {
        autoRender = z;
    }

    private void drawEngineFrame() {
        int i = this.width;
        int i2 = this.antialias;
        GLES20.glViewport(0, 0, i * i2, this.height * i2);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        passEngineFrameValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
    }

    private void get3DRenderImage() {
        final ByteBuffer byteBufferAllocate;
        Rect rect = this.mCaptureRect;
        if (rect != null) {
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            this.f14242w = i3;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            this.f14241h = i6;
            int i7 = (this.height - i5) - i6;
            byteBufferAllocate = ByteBuffer.allocate(i3 * i6 * 4);
            byteBufferAllocate.position(0);
            GLES20.glReadPixels(i2, i7, this.f14242w, this.f14241h, 6408, 5121, byteBufferAllocate);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(getWidth() * getHeight() * 4);
            byteBufferAllocate2.position(0);
            GLES20.glReadPixels(0, 0, getWidth(), getHeight(), 6408, 5121, byteBufferAllocate2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        byteBufferAllocate.position(0);
        this.isCapture = false;
        C3804c.m18444d(2, new Runnable() { // from class: com.momo.mcamera.mask.Face3DMaskFilter.1
            @Override // java.lang.Runnable
            public void run() {
                Rect rect2 = Face3DMaskFilter.this.mCaptureRect;
                Face3DMaskFilter face3DMaskFilter = Face3DMaskFilter.this;
                Bitmap bitmapCreateBitmap = rect2 != null ? Bitmap.createBitmap(face3DMaskFilter.f14242w, Face3DMaskFilter.this.f14241h, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(((ccj) face3DMaskFilter).width, ((ccj) Face3DMaskFilter.this).height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                if (Face3DMaskFilter.this.mCapture3DImageListener != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f, -1.0f);
                    matrix.postRotate(0.0f);
                    Rect rect3 = Face3DMaskFilter.this.mCaptureRect;
                    Face3DMaskFilter face3DMaskFilter2 = Face3DMaskFilter.this;
                    Face3DMaskFilter.this.mCapture3DImageListener.get3DRenderImage(rect3 != null ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, face3DMaskFilter2.f14242w, Face3DMaskFilter.this.f14241h, matrix, true) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, ((ccj) face3DMaskFilter2).width, ((ccj) Face3DMaskFilter.this).height, matrix, true));
                }
            }
        });
    }

    public static boolean is3DRenderReady() {
        return true;
    }

    private void passEngineFrameValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        AdditionalInfo additionalInfo = this.mAdditionalInfo;
        if (additionalInfo == null || !additionalInfo.isBodySegmentDetectEnable()) {
            return;
        }
        processSegment();
    }

    private void processSegment() {
        Sticker sticker = this.sticker;
        if (sticker == null || !TextUtils.equals(sticker.getSegmentType(), SegmentFilterFactory.BYTEDANCE)) {
            processSegmentByMomo();
        } else {
            processSegmentByByteDance();
        }
    }

    private void processSegmentByByteDance() {
        byte[] bArr;
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || (bArr = pjwVar.f149900g) == null) {
            MDLog.m7391e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        int iM169949m = pjwVar.m169949m();
        int iM169956t = this.mmcvInfo.m169956t();
        pjw pjwVar2 = this.mmcvInfo;
        PortraitMatting.MattingMask mattingMaskProcess = ByteDanceSegmentHelper.process(bArr, iM169949m, iM169956t, pjwVar2.f149897d, pjwVar2.f149894a);
        CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
        if (mattingMaskProcess != null && mattingMaskProcess.getBuffer() != null) {
            cVSegmentInfo.setDatas(mattingMaskProcess.getBuffer());
            cVSegmentInfo.setHeight(mattingMaskProcess.getHeight());
            cVSegmentInfo.setWidth(mattingMaskProcess.getWidth());
            cVSegmentInfo.setLength(mattingMaskProcess.getBuffer().length);
        }
        XEEngineHelper.setSegmentInfo(cVSegmentInfo);
    }

    private void processSegmentByMomo() {
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.f149900g == null) {
            MDLog.m7391e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        this.mmcvFrame.m198695h(17);
        this.mmcvFrame.m198694g(this.mmcvInfo.f149900g);
        this.mmcvFrame.m198693f(this.mmcvInfo.f149900g.length);
        this.mmcvFrame.m198700m(this.mmcvInfo.m169956t());
        this.mmcvFrame.m198697j(this.mmcvInfo.m169949m());
        this.mmcvFrame.m198699l(this.mmcvInfo.m169956t());
        this.params.m155094p(SegmentHelper.isFrontCamera());
        this.params.m155066A(SegmentHelper.getRotateDegree());
        this.params.m155104z(SegmentHelper.getRestoreDegree());
        byte[] bArrProcess = SegmentHelper.process(this.mmcvFrame, this.params);
        CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
        if (bArrProcess != null) {
            cVSegmentInfo.setDatas(bArrProcess);
            cVSegmentInfo.setHeight(this.mmcvFrame.m198692e());
            cVSegmentInfo.setWidth(this.mmcvFrame.m198690c());
            cVSegmentInfo.setLength(bArrProcess.length);
        }
        XEEngineHelper.setSegmentInfo(cVSegmentInfo);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        if (TextUtils.isEmpty(this.sceneId)) {
            return;
        }
        XEEngineHelper.unloadScene(this.sceneId);
        this.sceneId = null;
    }

    public void drawBgFrame() {
        int i = this.width;
        int i2 = this.antialias;
        GLES20.glViewport(0, 0, i * i2, this.height * i2);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
    }

    @Override // p149l.mcj
    public void drawSub() {
        if (this.isCapture) {
            this.isDrawBackGround = false;
        } else {
            this.isDrawBackGround = true;
        }
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glEnable(3089);
        GLES20.glFinish();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = getWidth() * this.antialias;
        int height = getHeight() * this.antialias;
        if (!this.inited) {
            this.inited = true;
            XEEngineHelper.runEngine(width, height);
            if (!autoRender) {
                XEEngineHelper.loadScene(this.sticker.getXengineResRelativePath(), this.sceneId);
            }
        }
        if (this.isDrawBackGround) {
            drawBgFrame();
        }
        if (autoRender) {
            XEEngineHelper.render(width, height);
        } else {
            XEEngineHelper.render(width, height, this.sceneId);
        }
        GLES20.glDisable(2884);
        GLES20.glDisable(3089);
        if (this.isCapture && !this.isDrawBackGround) {
            get3DRenderImage();
        }
        MDLog.m7397v("FaceRig", "draw : " + (System.currentTimeMillis() - jCurrentTimeMillis));
        AdditionalInfo additionalInfo = this.mAdditionalInfo;
        if (additionalInfo == null || !additionalInfo.isBodySegmentDetectEnable()) {
            return;
        }
        processSegment();
    }

    public Bitmap flushPicture(int i) {
        GLES20.glReadPixels(0, 0, 1, 1, 6408, 5121, IntBuffer.allocate(1));
        return null;
    }

    public Sticker getSticker() {
        return this.sticker;
    }

    public vif0 getViewPortSize() {
        return new vif0(getWidth() * this.antialias, getHeight() * this.antialias);
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        if (this.useCache) {
            this.glFrameBuffer = ybj.m213953d().m213956c(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            this.glFrameBuffer = new rbj(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        boolean z = this.enableDepthBuffer;
        rbj rbjVar2 = this.glFrameBuffer;
        if (z) {
            rbjVar2.m178602a(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            rbjVar2.m178603b(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    public void loadScene(Sticker sticker) {
        this.antialias = sticker.isEnable3DAntialiasing() ? 2 : 1;
        if (this.sceneId == null) {
            this.sceneId = sticker.getXengineResRelativePath() + "_" + System.currentTimeMillis();
        }
    }

    public boolean needFaceDetect() {
        return this.needFaceDetect || FacerigHelper.isUseFacerig();
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        this.inited = false;
        this.isCameraFront = false;
        this.mmcvInfo = null;
        this.antialias = 1;
        this.frameCounter = 0;
        loadScene(this.sticker);
    }

    public void resetArInfo() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.mAdditionalInfo = additionalInfo;
    }

    public void setCamera(boolean z) {
        if (this.isCameraFront != z) {
            this.isCameraFront = z;
            this.frameCounter = 0;
        }
    }

    public void setCapture(boolean z, Rect rect) {
        this.isCapture = z;
        this.mCaptureRect = rect;
    }

    public void setCapture3DImageListener(Capture3DImageListener capture3DImageListener) {
        this.mCapture3DImageListener = capture3DImageListener;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (needFaceDetect()) {
            this.mmcvInfo = pjwVar;
            XEFaceInfoHelper.setFaceInfo(pjwVar);
        }
    }
}
