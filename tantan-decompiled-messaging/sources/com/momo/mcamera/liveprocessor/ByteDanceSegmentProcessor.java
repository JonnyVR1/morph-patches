package com.momo.mcamera.liveprocessor;

import android.graphics.Point;
import android.text.TextUtils;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.effectsar.labcv.effectsdk.YUVUtils;
import java.nio.ByteBuffer;
import java.util.List;
import p149l.ev0;
import p149l.pjw;

/* JADX INFO: loaded from: classes6.dex */
public class ByteDanceSegmentProcessor implements IProcessor<PortraitMatting.MattingMask> {
    private String licensePath;
    private String modelPath;
    private PortraitMatting portraitMatting = null;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    private float getPreferSampleSize(int i, int i2) {
        Point point = new Point(128, 224);
        float fMax = Math.max((point.x * 1.0f) / Math.min(i, i2), (point.y * 1.0f) / Math.max(i, i2));
        if (fMax > 1.0f) {
            return 1.0f;
        }
        return fMax;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public PortraitMatting.MattingMask process(pjw pjwVar) {
        EffectsSDKEffectConstants.Rotation rotation;
        if (pjwVar == null) {
            return null;
        }
        if (this.portraitMatting == null) {
            this.portraitMatting = new PortraitMatting();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.licensePath) && !TextUtils.isEmpty(this.modelPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.ByteDanceSegmentProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    int iInit = ByteDanceSegmentProcessor.this.portraitMatting.init(ev0.m118233a(), ByteDanceSegmentProcessor.this.modelPath, EffectsSDKEffectConstants.PortraitMatting.BEF_PORTAITMATTING_SMALL_MODEL, ByteDanceSegmentProcessor.this.licensePath);
                    ByteDanceSegmentProcessor.this.isLoadSuccess = iInit == 0;
                    ByteDanceSegmentProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
        byte[] bArr = pjwVar.f149900g;
        int iM169949m = pjwVar.m169949m();
        int iM169956t = pjwVar.m169956t();
        int i = pjwVar.f149897d;
        boolean z = pjwVar.f149894a;
        float preferSampleSize = getPreferSampleSize(iM169949m, iM169956t);
        int i2 = (int) (iM169949m * preferSampleSize);
        int i3 = (int) (iM169956t * preferSampleSize);
        if (i2 % 2 != 0 || i3 % 2 != 0) {
            i2 = (i2 >> 1) << 1;
            i3 = (i3 >> 1) << 1;
        }
        int i4 = i3;
        int i5 = i2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5 * i4 * 4);
        byteBufferAllocateDirect.position(0);
        int value = EffectsSDKEffectConstants.PixlFormat.BEF_AI_PIX_FMT_NV21.getValue();
        if (z) {
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, iM169956t, iM169949m, i4, i5, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_270.f5853id, true);
        } else {
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, iM169956t, iM169949m, i4, i5, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_90.f5853id, false);
        }
        if (i == 90) {
            rotation = EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_90;
        } else if (i != 180) {
            rotation = i != 270 ? EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_0 : EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_270;
        } else {
            rotation = EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_180;
        }
        return this.portraitMatting.detectMatting(byteBufferAllocateDirect, EffectsSDKEffectConstants.PixlFormat.RGBA8888, i5, i4, i5 * 4, rotation, false);
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        PortraitMatting portraitMatting = this.portraitMatting;
        if (portraitMatting != null) {
            portraitMatting.release();
            this.portraitMatting = null;
        }
        this.isLoading = false;
        this.isLoadSuccess = false;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void setModelPath(List<String> list) {
        if (list == null || list.size() != 2) {
            return;
        }
        this.licensePath = list.get(0);
        this.modelPath = list.get(1);
    }
}
