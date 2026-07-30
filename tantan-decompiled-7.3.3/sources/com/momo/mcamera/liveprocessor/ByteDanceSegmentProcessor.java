package com.momo.mcamera.liveprocessor;

import android.graphics.Point;
import android.text.TextUtils;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.effectsar.labcv.effectsdk.YUVUtils;
import java.nio.ByteBuffer;
import java.util.List;
import p153l.jv0;
import p153l.omw;

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
    public PortraitMatting.MattingMask process(omw omwVar) {
        EffectsSDKEffectConstants.Rotation rotation;
        if (omwVar == null) {
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
                    int iInit = ByteDanceSegmentProcessor.this.portraitMatting.init(jv0.m147001a(), ByteDanceSegmentProcessor.this.modelPath, EffectsSDKEffectConstants.PortraitMatting.BEF_PORTAITMATTING_SMALL_MODEL, ByteDanceSegmentProcessor.this.licensePath);
                    ByteDanceSegmentProcessor.this.isLoadSuccess = iInit == 0;
                    ByteDanceSegmentProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
        byte[] bArr = omwVar.f148020g;
        int iM168298m = omwVar.m168298m();
        int iM168305t = omwVar.m168305t();
        int i = omwVar.f148017d;
        boolean z = omwVar.f148014a;
        float preferSampleSize = getPreferSampleSize(iM168298m, iM168305t);
        int i2 = (int) (iM168298m * preferSampleSize);
        int i3 = (int) (iM168305t * preferSampleSize);
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
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, iM168305t, iM168298m, i4, i5, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_270.f5890id, true);
        } else {
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, iM168305t, iM168298m, i4, i5, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_90.f5890id, false);
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
