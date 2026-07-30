package com.momo.xeengine.lightningrender;

import androidx.annotation.Keep;
import com.momo.xeengine.xnative.XEEngineInstanceJava;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Keep
abstract class LightningRenderJNI extends XEEngineInstanceJava {
    protected long lightningRenderPointer = 0;

    public native void nativeAddStickerModel(long j, long j2);

    public native void nativeClearAllEngineModel(long j);

    public native void nativeClearEngineModel(long j, String str);

    public native void nativeClearEngineModelWithId(long j, String str);

    public native void nativeClearLookup0(long j);

    public native void nativeClearLookup1(long j);

    public native void nativeDisableMakeupEffect(long j, String str, boolean z);

    public native void nativeDrawFrame(long j, int i, int i2);

    public native boolean nativeGetBeautyBodyEnable(long j);

    public native boolean nativeGetBeautyEnable(long j);

    public native boolean nativeGetCartoonFaceEnable(long j);

    public native long nativeGetEngineInstance(long j);

    public native boolean nativeGetLookupEnable(long j);

    public native boolean nativeGetMakeupEnable(long j);

    public native int nativeGetSmoothVersion(long j);

    public native int nativeGetWhiteVersion(long j);

    public native boolean nativeIsMakeupEffectActive(long j);

    public native boolean nativeIsStickerMakeupEffectActive(long j);

    public native long nativeLightningRenderCreate(boolean z, String str);

    public native void nativeLightningRenderRelease(long j);

    public native long nativeLoadSticker(long j, String str, String str2, String str3, long j2);

    public native void nativeMakeupLevelAddEffect(long j, String str);

    public native void nativeMakeupLevelRemoveAll(long j);

    public native void nativeMakeupLevelRemoveWithType(long j, String str);

    public native void nativeMakeupLevelSetEffectIntensity(long j, String str, float f);

    public native void nativeMakeupLipsSetLipsEffect(long j, int i);

    public native boolean nativePreprocessor(long j, byte[] bArr, int i, int i2, int i3, int i4, Map<String, Object> map, Map<String, Object> map2);

    public native boolean nativeRenderTest(long j);

    public native void nativeSetBeautyBodyEnable(long j, boolean z);

    public native void nativeSetBeautyEnable(long j, boolean z);

    public native void nativeSetCartoonFaceEnable(long j, boolean z);

    public native void nativeSetFaceBeautyValue(long j, String str, float f);

    public native void nativeSetFullSmoothEnable(long j, boolean z);

    public native void nativeSetLookup0Intensity(long j, float f);

    public native void nativeSetLookup0Path(long j, String str);

    public native void nativeSetLookup1Intensity(long j, float f);

    public native void nativeSetLookup1Path(long j, String str);

    public native void nativeSetLookupEnable(long j, boolean z);

    public native void nativeSetMakeupEnable(long j, boolean z);

    public native void nativeSetTextureData(long j, String str, byte[] bArr, int i, int i2);

    public native void nativeSwitchSkinSmooth(long j, int i);

    public native void nativeSwitchSkinV3WhiteVersion(long j, int i);

    public native void nativeSwitchSkinWhite(long j, int i);

    public native void nativeSwitchV3DegreeSubVersion(long j, int i);

    public abstract void onStickerPlayCompleted(String str, String str2, String str3, long j, int i, int i2);
}
