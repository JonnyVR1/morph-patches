package com.momo.mcamera.mask.segment;

import android.graphics.Point;
import android.text.TextUtils;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.effectsar.labcv.effectsdk.YUVUtils;
import java.nio.ByteBuffer;
import p153l.jv0;

/* JADX INFO: loaded from: classes8.dex */
public class ByteDanceSegmentHelper {
    private static boolean isValid = false;
    private static String licensePath = "";
    private static String modelPath = "";
    private static volatile PortraitMatting portraitMatting;

    private static boolean checkLicense() {
        if (!TextUtils.isEmpty(modelPath) && !TextUtils.isEmpty(licensePath)) {
            if (portraitMatting == null) {
                portraitMatting = new PortraitMatting();
            }
            if (portraitMatting.init(jv0.m147001a(), modelPath, EffectsSDKEffectConstants.PortraitMatting.BEF_PORTAITMATTING_SMALL_MODEL, licensePath) == 0) {
                return true;
            }
        }
        return false;
    }

    private static float getPreferSampleSize(int i, int i2) {
        Point point = new Point(128, 224);
        float fMax = Math.max((point.x * 1.0f) / Math.min(i, i2), (point.y * 1.0f) / Math.max(i, i2));
        if (fMax > 1.0f) {
            return 1.0f;
        }
        return fMax;
    }

    public static PortraitMatting.MattingMask process(byte[] bArr, int i, int i2, int i3, boolean z) {
        EffectsSDKEffectConstants.Rotation rotation;
        if (!isValid) {
            isValid = checkLicense();
        }
        if (!isValid) {
            return null;
        }
        float preferSampleSize = getPreferSampleSize(i, i2);
        int i4 = (int) (i * preferSampleSize);
        int i5 = (int) (i2 * preferSampleSize);
        if (i4 % 2 != 0 || i5 % 2 != 0) {
            i4 = (i4 >> 1) << 1;
            i5 = (i5 >> 1) << 1;
        }
        int i6 = i5;
        int i7 = i4;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7 * i6 * 4);
        byteBufferAllocateDirect.position(0);
        int value = EffectsSDKEffectConstants.PixlFormat.BEF_AI_PIX_FMT_NV21.getValue();
        if (z) {
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, i2, i, i6, i7, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_270.f5890id, true);
        } else {
            YUVUtils.YUV2RGBA(bArr, byteBufferAllocateDirect.array(), value, i2, i, i6, i7, EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_90.f5890id, false);
        }
        if (i3 == 90) {
            rotation = EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_90;
        } else if (i3 != 180) {
            rotation = i3 != 270 ? EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_0 : EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_270;
        } else {
            rotation = EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_180;
        }
        return portraitMatting.detectMatting(byteBufferAllocateDirect, EffectsSDKEffectConstants.PixlFormat.RGBA8888, i7, i6, i7 * 4, rotation, false);
    }

    public static void setLicensePath(String str) {
        licensePath = str;
    }

    public static void setModelPath(String str) {
        modelPath = str;
    }
}
