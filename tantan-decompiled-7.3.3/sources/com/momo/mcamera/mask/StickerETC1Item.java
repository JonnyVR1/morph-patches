package com.momo.mcamera.mask;

import android.content.Context;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import com.core.glcore.util.FileUtil;
import com.momo.mcamera.mask.batchbean.BatchFrame;
import com.momo.mcamera.mask.batchbean.BatchSize;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class StickerETC1Item extends StickerItem {
    private int curIndex;
    private Etc1Batch etc1Batch;
    public int etc1_texture_sticker;
    private long lastFrameTime;
    public ETC1Util.ETC1Texture texture;
    private String texturePath;

    public StickerETC1Item(Sticker sticker, Context context) {
        super(sticker, context);
        this.lastFrameTime = -1L;
        this.curIndex = 0;
        this.etc1_texture_sticker = 0;
        this.texture = getETC1Texture();
    }

    private ETC1Util.ETC1Texture getETC1Texture() {
        if (this.texturePath == null) {
            String eTC1Path = this.sticker.getETC1Path();
            this.texturePath = eTC1Path;
            this.texture = loadPkmFile(eTC1Path);
        }
        return this.texture;
    }

    private ETC1Util.ETC1Texture loadPkmFile(String str) {
        ETC1Util.ETC1Texture eTC1TextureCreateTexture = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            eTC1TextureCreateTexture = ETC1Util.createTexture(fileInputStream);
            fileInputStream.close();
            return eTC1TextureCreateTexture;
        } catch (Exception unused) {
            return eTC1TextureCreateTexture;
        }
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void destroy() {
        super.destroy();
        int i = this.etc1_texture_sticker;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.etc1_texture_sticker = 0;
        }
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void initCoordinate() throws Throwable {
        String string;
        try {
            string = FileUtil.readString(new File(this.sticker.getETC1JsonPath()));
        } catch (Exception e) {
            e.printStackTrace();
            string = null;
        }
        if (string == null) {
            return;
        }
        this.etc1Batch = Etc1Batch.getEffectModel(string);
        updateETC1Coordinate();
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
    }

    public void updateETC1Coordinate() {
        if (this.lastFrameTime == -1) {
            this.lastFrameTime = System.currentTimeMillis();
            this.curIndex = this.sticker.getETC1ImageIndex();
        }
        if (System.currentTimeMillis() - this.lastFrameTime > 50) {
            this.curIndex = this.sticker.getETC1ImageIndex();
            this.lastFrameTime = System.currentTimeMillis();
        }
        BatchFrame frame = this.etc1Batch.getBatchStickers().get(this.curIndex).getFrame();
        BatchSize size = this.etc1Batch.getBatchMeta().getSize();
        float imageX = frame.getImageX() / size.getImageBatchWidth();
        float imageY = frame.getImageY() / (size.getImageBatchHeight() * 2);
        float imageX2 = frame.getImageX() / size.getImageBatchWidth();
        float imageY2 = (frame.getImageY() + frame.getImageHeight()) / (size.getImageBatchHeight() * 2);
        float imageX3 = (frame.getImageX() + frame.getImageWidth()) / size.getImageBatchWidth();
        float imageY3 = (frame.getImageY() + frame.getImageHeight()) / (size.getImageBatchHeight() * 2);
        float imageX4 = (frame.getImageX() + frame.getImageWidth()) / size.getImageBatchWidth();
        float imageY4 = frame.getImageY() / (size.getImageBatchHeight() * 2);
        this.stickerScale = frame.getImageHeight() / frame.getImageWidth();
        float f = imageX - 0.5f;
        float f2 = imageX2 - 0.5f;
        float f3 = imageX3 - 0.5f;
        float f4 = imageX4 - 0.5f;
        float[] fArr = {f, 0.5f - imageY, f2, 0.5f - imageY2, f3, 0.5f - imageY3, f4, 0.5f - imageY4};
        float[] fArr2 = {f, -imageY, f2, -imageY2, f3, -imageY3, f4, -imageY4};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexBuffer2 = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2);
        this.vertexBuffer2.position(0);
    }
}
