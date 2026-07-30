package com.momo.mcamera.mask;

import android.opengl.GLES20;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import com.momocv.mangaface.MangaFace;
import com.momocv.mangaface.MangaFaceInfo;
import com.momocv.mangaface.MangaFaceParams;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.mcj;
import p149l.pjw;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class FaceMaskFilter extends FaceDetectFilter {
    protected static final int COORDS_PER_VERTEX = 2;
    private vjw curMMCVImage;
    private Sticker sticker;
    protected FloatBuffer vertexBufer;
    private List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    private List<Map<Float, float[]>> mvpAngle = Collections.synchronizedList(new ArrayList());
    protected Object maskListLock = new Object();
    private boolean mStickerChanged = false;
    private List<Sticker> mStickersList = null;
    private int mCount = 0;
    private boolean mLastHasFace = false;
    protected final int vertexStride = 8;
    private Model model = new Model();

    public class Model {
        boolean comic;
        byte[] data;
        float[] texCoords;

        private Model() {
        }
    }

    public FaceMaskFilter(Sticker sticker) {
        this.sticker = sticker;
        vjw vjwVar = new vjw();
        this.curMMCVImage = vjwVar;
        ImageUtils.decodeMMCVImage(vjwVar, sticker.getMask().getTexturePath());
        this.model.data = this.curMMCVImage.m198688a();
        this.model.texCoords = sticker.getMask().landmarks;
        this.model.comic = sticker.isComic();
        this.useCache = false;
    }

    private void drawFace(float[] fArr, float[] fArr2) {
        int length;
        float[] fArr3;
        float[] fArr4;
        if (this.model.comic) {
            length = AIFaceTriangulation.CXFaceTriangulationIndexesWithCornerPoint.length;
            MangaFace mangaFace = new MangaFace();
            MangaFaceParams mangaFaceParams = new MangaFaceParams();
            mangaFaceParams.euler_angles_ = fArr2;
            mangaFaceParams.image_height_ = getHeight();
            mangaFaceParams.image_width_ = getWidth();
            mangaFaceParams.landmarks96_ = fArr;
            if (this.sticker.getImageHeight() == 0 || this.sticker.getImageWidth() == 0) {
                mangaFaceParams.manga_height_ = 640;
                mangaFaceParams.manga_width_ = 480;
            } else {
                mangaFaceParams.manga_height_ = this.sticker.getImageHeight();
                mangaFaceParams.manga_width_ = this.sticker.getImageWidth();
            }
            mangaFaceParams.manga_landmarks_ = this.model.texCoords;
            MangaFaceInfo mangaFaceInfo = new MangaFaceInfo();
            mangaFace.manga_face(mangaFaceParams, mangaFaceInfo);
            float[][] faceTriangulationWithCornerPoint = AIFaceTriangulation.getFaceTriangulationWithCornerPoint(mangaFaceInfo.landmarks96_plus4_pts_, this.model.texCoords);
            fArr3 = faceTriangulationWithCornerPoint[0];
            fArr4 = faceTriangulationWithCornerPoint[2];
        } else {
            length = AIFaceTriangulation.CXFaceTriangulationIndexes.length;
            float[][] faceTriangulation = AIFaceTriangulation.getFaceTriangulation(fArr, getWidth(), getHeight(), this.model.texCoords);
            fArr3 = faceTriangulation[0];
            fArr4 = faceTriangulation[2];
        }
        setRenderVertices(fArr3);
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        if (this.vertexBufer == null) {
            this.vertexBufer = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.vertexBufer.rewind();
        this.vertexBufer.put(fArr4);
        this.vertexBufer.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.vertexBufer);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glDrawArrays(4, 0, length);
    }

    public void addStickerList(List<Sticker> list) {
        this.mStickersList = list;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
        List<float[]> list = this.mvpLists;
        if (list != null) {
            list.clear();
        }
        List<Map<Float, float[]>> list2 = this.mvpAngle;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
        if (this.curMMCVImage != null) {
            this.curMMCVImage = null;
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        synchronized (this.maskListLock) {
            try {
                if (this.model.comic) {
                    for (int i = 0; i < this.mvpAngle.size(); i++) {
                        super.passShaderValues();
                        Iterator<Float> it = this.mvpAngle.get(i).keySet().iterator();
                        while (it.hasNext()) {
                            float[] fArr = (float[]) it.next();
                            drawFace(this.mvpAngle.get(i).get(fArr), fArr);
                        }
                    }
                } else {
                    for (float[] fArr2 : this.mvpLists) {
                        super.passShaderValues();
                        drawFace(fArr2, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        disableDrawArray();
        clearPoints();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return super.getFragmentShader();
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        if (z) {
            markAsDirty();
        }
        if (this.texture_in == 0 || !this.mStickerChanged) {
            this.texture_in = TextureHelper.bitmapToTexture(this.curMMCVImage);
            this.mStickerChanged = true;
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
        if (this.model != null || this.curMMCVImage != null) {
            this.model = null;
            this.curMMCVImage = null;
        }
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
        this.sticker = sticker;
        this.model = new Model();
        vjw vjwVar = new vjw();
        this.curMMCVImage = vjwVar;
        ImageUtils.decodeMMCVImage(vjwVar, sticker.getMask().getTexturePath());
        this.model.data = this.curMMCVImage.m198688a();
        this.model.texCoords = sticker.getMask().landmarks;
        this.model.comic = sticker.isComic();
        this.mStickerChanged = false;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        List<float[]> list = this.mvpLists;
        if (list == null || this.mvpAngle == null) {
            return;
        }
        float[] fArr = faceDetectParam.warpedPoints104;
        if (fArr == null) {
            fArr = faceDetectParam.points104;
        }
        list.add(fArr);
        HashMap map = new HashMap();
        map.put(faceDetectParam.euler_angles, faceDetectParam.points96);
        this.mvpAngle.add(map);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        List<Sticker> list;
        if (pjwVar == null || this.texture_in == 0) {
            return;
        }
        if (pjwVar.m169950n() <= 0 && this.mLastHasFace && (list = this.mStickersList) != null && list.size() > 0) {
            int i = this.mCount + 1;
            this.mCount = i;
            int size = i % this.mStickersList.size();
            this.mCount = size;
            resetSticker(this.mStickersList.get(size));
            this.mLastHasFace = false;
        }
        if (pjwVar.m169950n() > 0) {
            this.mLastHasFace = true;
        }
    }
}
