package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.util.PointHelper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class MultiStickerCutFaceMaskFilter extends MultiStickerMaskFilter {
    public static final String UNIFORM_BACKGROUND = "bgFlag";
    private boolean lastHasFace;
    private int mBackGroundHandler;
    private StickerCutFaceItem mCutFaceItem;
    private PointF mPointF;
    private float mRadius;
    private final String vertexShaderCode;

    public MultiStickerCutFaceMaskFilter(Context context) {
        super(context);
        this.mRadius = 100.0f;
        this.mCutFaceItem = null;
        this.lastHasFace = false;
        this.vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4   position3 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nuniform mediump float etc1Flag;\nuniform mediump float bgFlag;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  if(bgFlag > 0.5){\n     textureCoordinate = position2.xy;\n     return;\n  }\n  if(etc1Flag > 0.5){\n    vec2 coord1 = position3.xy;    textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0-(coord1.y + 0.5));\n  }else{\n    coord = (coord) / decorationSize;\n   }\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    private void drawCutBgBackGround() {
        List<float[]> list = this.mCutFaceItem.mCutFaceList;
        if (list == null || list.size() <= 0) {
            resetBackgroundCanvas();
            this.vertexBufer.position(0);
            this.vertexBufer.put(this.textureCoord);
            if (this.lastHasFace) {
                this.lastHasFace = false;
                return;
            } else {
                GLES20.glDrawArrays(5, 0, 4);
                return;
            }
        }
        Iterator<float[]> it = this.mCutFaceItem.mCutFaceList.iterator();
        while (it.hasNext()) {
            setRenderVertices(it.next());
            this.renderVertices.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            PointF pointF = new PointF(this.mPointF.x - this.mRadius, getHeight() - (this.mPointF.y + this.mRadius));
            PointF pointF2 = new PointF(this.mPointF.x + this.mRadius, getHeight() - (this.mPointF.y - this.mRadius));
            if (getWidth() > 0 && getHeight() > 0) {
                this.textureCoord[0] = pointF.x / getWidth();
                this.textureCoord[1] = pointF.y / getHeight();
                this.textureCoord[2] = pointF2.x / getWidth();
                this.textureCoord[3] = pointF.y / getHeight();
                this.textureCoord[4] = pointF.x / getWidth();
                this.textureCoord[5] = pointF2.y / getHeight();
                this.textureCoord[6] = pointF2.x / getWidth();
                this.textureCoord[7] = pointF2.y / getHeight();
            }
            this.vertexBufer.position(0);
            this.vertexBufer.put(this.textureCoord);
            this.vertexBufer.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.vertexBufer);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            this.lastHasFace = true;
            GLES20.glDrawArrays(5, 0, 4);
        }
        this.mCutFaceItem.clearCutFacePoints();
    }

    private void resetBackgroundCanvas() {
        setRenderVertices(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter
    public void addSticker(Sticker sticker, StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener) {
        StickerItem stickerHaniItem;
        if (sticker != null) {
            if (sticker.getEtcTextureBatch() != null) {
                stickerHaniItem = new StickerETC1Item(sticker, this.context);
            } else if (sticker.isGameSticker) {
                stickerHaniItem = new StickerGameItem(sticker, this.context);
            } else if (sticker.isCutFaceSticker) {
                StickerCutFaceItem stickerCutFaceItem = new StickerCutFaceItem(sticker, this.context);
                this.mCutFaceItem = stickerCutFaceItem;
                stickerHaniItem = stickerCutFaceItem;
            } else if (sticker.getStickerType() == "STICKER_TYPE_GAME_FIX_TYPE") {
                stickerHaniItem = new StickerFixItem(sticker, this.context);
            } else {
                boolean z = sticker.isHaniSticker;
                Context context = this.context;
                stickerHaniItem = z ? new StickerHaniItem(sticker, context) : new StickerItem(sticker, context);
            }
            stickerHaniItem.setStickerStateChangeListener(stickerStateChangeListener);
            if (sticker.getDuration() > 0) {
                stickerHaniItem.mStickerDuration = sticker.getDuration();
            } else {
                stickerHaniItem.mStickerDuration = 30000000L;
            }
            addSticker(stickerHaniItem);
        }
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter
    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.decorateHandler, 1.0f, 1.0f);
        super.setUseETC1(false);
        if (this.textureCoord == null) {
            this.textureCoord = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.textureCoord);
        if (this.vertexBufer == null) {
            this.vertexBufer = ByteBuffer.allocateDirect(this.textureCoord.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.vertexBufer.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.vertexBufer);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.mBackGroundHandler, 1.0f);
        if (this.mCutFaceItem != null) {
            drawCutBgBackGround();
        } else {
            this.vertexBufer.position(0);
            this.vertexBufer.put(this.textureCoord);
            GLES20.glDrawArrays(5, 0, 4);
        }
        GLES20.glUniform1f(this.mBackGroundHandler, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[Catch: all -> 0x00c2, LOOP:3: B:60:0x011a->B:62:0x0120, LOOP_END, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x0092, B:24:0x00a4, B:26:0x00aa, B:28:0x00ae, B:30:0x00b2, B:32:0x00b9, B:35:0x00c5, B:54:0x010a, B:56:0x010e, B:59:0x0114, B:60:0x011a, B:62:0x0120, B:63:0x0131, B:64:0x0134, B:36:0x00ca, B:38:0x00d2, B:40:0x00d8, B:42:0x00dc, B:43:0x00e3, B:44:0x00ea, B:46:0x00f0, B:48:0x00f6, B:50:0x00fa, B:51:0x00fe, B:52:0x0105), top: B:70:0x0092 }] */
    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p153l.gfj
    public void drawSub() {
        boolean z;
        Iterator<float[]> it;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        if (this.stickerItemDestroyList.size() > 0) {
            ArrayList<StickerItem> arrayList = new ArrayList(this.stickerItemDestroyList);
            for (StickerItem stickerItem : arrayList) {
                stickerItem.destroy();
                this.stickerItemDestroyList.remove(stickerItem);
                this.stickerItemList.remove(stickerItem);
            }
            arrayList.clear();
        }
        for (StickerItem stickerItem2 : this.stickerItemList) {
            if ((stickerItem2 instanceof StickerCutFaceItem) && stickerItem2.getMmcvImage(this.context) == null) {
                return;
            }
        }
        for (StickerItem stickerItem3 : this.stickerItemList) {
            synchronized (stickerItem3.getLockObject()) {
                try {
                    stickerItem3.imageWidth = getWidth();
                    stickerItem3.imageHeight = getHeight();
                    List<float[]> list = stickerItem3.mvpLists;
                    if (list == null || list.size() <= 0 || !stickerItem3.isDraw) {
                        stickerItem3.sticker.curIndex = 0;
                    } else {
                        if (stickerItem3 instanceof StickerETC1Item) {
                            StickerETC1Item stickerETC1Item = (StickerETC1Item) stickerItem3;
                            if (stickerETC1Item.etc1_texture_sticker == 0) {
                                stickerETC1Item.etc1_texture_sticker = TextureHelper.etc1ToTexture(stickerETC1Item.texture);
                            }
                            stickerETC1Item.updateETC1Coordinate();
                            z = true;
                        } else {
                            umw mmcvImage = stickerItem3.getMmcvImage(this.context);
                            if (mmcvImage == null || mmcvImage.m196795a() == null) {
                                Bitmap bitmap = stickerItem3.getBitmap();
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    int i = stickerItem3.texture_sticker;
                                    if (i > 0) {
                                        TextureHelper.updateBitmap(bitmap, i);
                                    } else {
                                        stickerItem3.texture_sticker = TextureHelper.bitmapToTexture(bitmap);
                                    }
                                }
                            } else {
                                int i2 = stickerItem3.texture_sticker;
                                if (i2 == 0) {
                                    stickerItem3.texture_sticker = TextureHelper.bitmapToTexture(mmcvImage);
                                } else {
                                    stickerItem3.texture_sticker = TextureHelper.loadDataToTexture(i2, mmcvImage);
                                }
                            }
                        }
                        if (stickerItem3.isDraw && (stickerItem3.texture_sticker != 0 || z)) {
                            it = stickerItem3.mvpLists.iterator();
                            while (it.hasNext()) {
                                passStickerShaderValues(stickerItem3, it.next());
                                drawStick(stickerItem3.getStickerAspectRatio());
                            }
                            stickerItem3.clearPoints();
                        }
                    }
                    z = false;
                    if (stickerItem3.isDraw) {
                        it = stickerItem3.mvpLists.iterator();
                        while (it.hasNext()) {
                            passStickerShaderValues(stickerItem3, it.next());
                            drawStick(stickerItem3.getStickerAspectRatio());
                        }
                        stickerItem3.clearPoints();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        GLES20.glDisable(3042);
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p153l.wej
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4   position3 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nuniform mediump float etc1Flag;\nuniform mediump float bgFlag;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  if(bgFlag > 0.5){\n     textureCoordinate = position2.xy;\n     return;\n  }\n  if(etc1Flag > 0.5){\n    vec2 coord1 = position3.xy;    textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0-(coord1.y + 0.5));\n  }else{\n    coord = (coord) / decorationSize;\n   }\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mBackGroundHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_BACKGROUND);
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter
    public void removeSticker(String str) {
        for (StickerItem stickerItem : this.stickerItemList) {
            if (stickerItem == this.mCutFaceItem) {
                this.mCutFaceItem = null;
                resetBackgroundCanvas();
            }
            if (stickerItem.sticker.getStickerType().equals(str)) {
                this.stickerItemDestroyList.add(stickerItem);
            }
        }
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (omwVar == null) {
            return;
        }
        this.lastStickerTime = System.currentTimeMillis();
        if (omwVar.m168299n() <= 0) {
            updateFaceInfo(omwVar, 0.0f, null, false);
            return;
        }
        if (this.mCutFaceItem != null && omwVar.m168299n() > 0) {
            float[] fArrM164781l = omwVar.m168295j(0).m164781l();
            this.mRadius = (((float) PointHelper.getmDistancePoint(new PointF(fArrM164781l[18], fArrM164781l[86]), new PointF(fArrM164781l[10], fArrM164781l[78]))) * 1.1f) / 2.0f;
            this.mPointF = new PointF(fArrM164781l[29], fArrM164781l[97]);
        }
        for (int iM168299n = omwVar.m168299n() - 1; iM168299n >= 0; iM168299n--) {
            float fM164778f = omwVar.m168295j(iM168299n).m164778f();
            StickerCutFaceItem stickerCutFaceItem = this.mCutFaceItem;
            if (stickerCutFaceItem != null) {
                stickerCutFaceItem.setRenderSize(getWidth(), getHeight());
            }
            updateFaceInfo(omwVar, fM164778f, omwVar.m168295j(iM168299n).m164781l(), true);
        }
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p153l.gam
    public void setTimeStamp(long j) {
        for (StickerItem stickerItem : this.stickerItemList) {
            if (stickerItem instanceof StickerHaniItem) {
                stickerItem.setRenderTime(j);
            }
        }
    }
}
