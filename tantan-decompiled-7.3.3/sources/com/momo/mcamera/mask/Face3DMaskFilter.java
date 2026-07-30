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
import com.immomo.mmutil.task.C3949c;
import com.momo.mcamera.mask.segment.ByteDanceSegmentHelper;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import com.momo.xeengine.p049cv.bean.CVSegmentInfo;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import p153l.erf0;
import p153l.gfj;
import p153l.lej;
import p153l.lnw;
import p153l.muf;
import p153l.omw;
import p153l.sej;
import p153l.umw;
import p153l.wej;

/* JADX INFO: loaded from: classes8.dex */
public class Face3DMaskFilter extends FaceDetectFilter {
    static boolean autoRender = false;
    private static boolean forbiddenRender = false;

    /* JADX INFO: renamed from: h */
    private int f14960h;
    private boolean isCameraFront;
    private WeakReference<Context> mContext;
    private Display mDisplay;
    omw mmcvInfo;
    private String rendertaskName;
    private String sceneId;
    private Sticker sticker;

    /* JADX INFO: renamed from: w */
    private int f14961w;
    private boolean inited = false;
    private boolean needFaceDetect = true;
    private int antialias = 1;
    private int frameCounter = 0;
    private boolean isCapture = false;
    private boolean isDrawBackGround = true;
    private Capture3DImageListener mCapture3DImageListener = null;
    private Rect mCaptureRect = null;
    private AdditionalInfo mAdditionalInfo = null;
    umw mmcvFrame = new umw();
    lnw params = new lnw(4);

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
            this.f14961w = i3;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            this.f14960h = i6;
            int i7 = (this.height - i5) - i6;
            byteBufferAllocate = ByteBuffer.allocate(i3 * i6 * 4);
            byteBufferAllocate.position(0);
            GLES20.glReadPixels(i2, i7, this.f14961w, this.f14960h, 6408, 5121, byteBufferAllocate);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(getWidth() * getHeight() * 4);
            byteBufferAllocate2.position(0);
            GLES20.glReadPixels(0, 0, getWidth(), getHeight(), 6408, 5121, byteBufferAllocate2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        byteBufferAllocate.position(0);
        this.isCapture = false;
        C3949c.m19427d(2, new Runnable() { // from class: com.momo.mcamera.mask.Face3DMaskFilter.1
            @Override // java.lang.Runnable
            public void run() {
                Rect rect2 = Face3DMaskFilter.this.mCaptureRect;
                Face3DMaskFilter face3DMaskFilter = Face3DMaskFilter.this;
                Bitmap bitmapCreateBitmap = rect2 != null ? Bitmap.createBitmap(face3DMaskFilter.f14961w, Face3DMaskFilter.this.f14960h, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(((wej) face3DMaskFilter).width, ((wej) Face3DMaskFilter.this).height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                if (Face3DMaskFilter.this.mCapture3DImageListener != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f, -1.0f);
                    matrix.postRotate(0.0f);
                    Rect rect3 = Face3DMaskFilter.this.mCaptureRect;
                    Face3DMaskFilter face3DMaskFilter2 = Face3DMaskFilter.this;
                    Face3DMaskFilter.this.mCapture3DImageListener.get3DRenderImage(rect3 != null ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, face3DMaskFilter2.f14961w, Face3DMaskFilter.this.f14960h, matrix, true) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, ((wej) face3DMaskFilter2).width, ((wej) Face3DMaskFilter.this).height, matrix, true));
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
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || (bArr = omwVar.f148020g) == null) {
            MDLog.m7445e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        int iM168298m = omwVar.m168298m();
        int iM168305t = this.mmcvInfo.m168305t();
        omw omwVar2 = this.mmcvInfo;
        PortraitMatting.MattingMask mattingMaskProcess = ByteDanceSegmentHelper.process(bArr, iM168298m, iM168305t, omwVar2.f148017d, omwVar2.f148014a);
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
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || omwVar.f148020g == null) {
            MDLog.m7445e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        this.mmcvFrame.m196802h(17);
        this.mmcvFrame.m196801g(this.mmcvInfo.f148020g);
        this.mmcvFrame.m196800f(this.mmcvInfo.f148020g.length);
        this.mmcvFrame.m196807m(this.mmcvInfo.m168305t());
        this.mmcvFrame.m196804j(this.mmcvInfo.m168298m());
        this.mmcvFrame.m196806l(this.mmcvInfo.m168305t());
        this.params.m155021p(SegmentHelper.isFrontCamera());
        this.params.m154993A(SegmentHelper.getRotateDegree());
        this.params.m155031z(SegmentHelper.getRestoreDegree());
        byte[] bArrProcess = SegmentHelper.process(this.mmcvFrame, this.params);
        CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
        if (bArrProcess != null) {
            cVSegmentInfo.setDatas(bArrProcess);
            cVSegmentInfo.setHeight(this.mmcvFrame.m196799e());
            cVSegmentInfo.setWidth(this.mmcvFrame.m196797c());
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

    @Override // p153l.gfj, p153l.wej
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

    @Override // p153l.gfj
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
        MDLog.m7451v("FaceRig", "draw : " + (System.currentTimeMillis() - jCurrentTimeMillis));
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

    public erf0 getViewPortSize() {
        return new erf0(getWidth() * this.antialias, getHeight() * this.antialias);
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        if (this.useCache) {
            this.glFrameBuffer = sej.m185545d().m185548c(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            this.glFrameBuffer = new lej(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        boolean z = this.enableDepthBuffer;
        lej lejVar2 = this.glFrameBuffer;
        if (z) {
            lejVar2.m153894a(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            lejVar2.m153895b(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
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

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p153l.gfj, p153l.wej
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

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (needFaceDetect()) {
            this.mmcvInfo = omwVar;
            XEFaceInfoHelper.setFaceInfo(omwVar);
        }
    }
}
