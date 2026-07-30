package com.momo.xeengine.lightningrender;

import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Size;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.XEngineModuleManager;
import com.momo.xeengine.audio.IXAudioPlayer;
import com.momo.xeengine.event.DataEvent;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.event.XEvent;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.p043L.C4175L;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.script.XEScriptEngine;
import com.momo.xeengine.utils.XERenderThreadExecutor;
import com.momo.xeengine.xnative.XEEventDispatcher;
import com.momo.xeengine.xnative.XWindowImpl;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class LightningRenderImpl extends LightningRenderJNI implements ILightningRender {
    private XEEventDispatcher eventDispatcher;
    private final String innerProcessorName;
    private XELogger logger;
    private XELuaEngine luaEngine;
    private String tag;
    private final boolean useInnerProcessor;
    private XWindowImpl window;
    private final XERenderThreadExecutor renderThreadExecutor = new XERenderThreadExecutor();
    private final ILightningRender.IMakeupLevel mMakeupLevel = new C42181();
    private final ILightningRender.IBeautyLevel mBeautyLevel = new C42192();
    private final ILightningRender.ILookupLevel mLookupLevel = new C42203();
    private ILightningRender.StickerListener mStickerListener = null;
    private final ILightningRender.IStickerLevel mStickerLevel = new C42214();

    /* JADX INFO: renamed from: com.momo.xeengine.lightningrender.LightningRenderImpl$1 */
    public class C42181 implements ILightningRender.IMakeupLevel {
        public C42181() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20271a(C42181 c42181, String str) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLevelAddEffect(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20272b(C42181 c42181, String str, boolean z) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeDisableMakeupEffect(j, str, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20273c(C42181 c42181, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLipsSetLipsEffect(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m20274d(C42181 c42181) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLevelRemoveAll(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m20275e(C42181 c42181, String str, float f) {
            LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
            long j = lightningRenderImpl.lightningRenderPointer;
            if (j != 0) {
                lightningRenderImpl.nativeSetFaceBeautyValue(j, str, f);
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m20276f(C42181 c42181, String str) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLevelRemoveWithType(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m20277g(C42181 c42181, boolean z) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetMakeupEnable(j, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m20278h(C42181 c42181, String str, float f) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLevelSetEffectIntensity(j, str, f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void addEffect(final String str) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.j
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20271a(this.f14670a, str);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void disableEffect(final String str, final boolean z) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.l
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20272b(this.f14675a, str, z);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public boolean getEnable() {
            boolean zNativeGetMakeupEnable;
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    zNativeGetMakeupEnable = j != 0 ? lightningRenderImpl.nativeGetMakeupEnable(j) : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zNativeGetMakeupEnable;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public boolean isEffectActive() {
            boolean zNativeIsMakeupEffectActive;
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    zNativeIsMakeupEffectActive = j != 0 ? lightningRenderImpl.nativeIsMakeupEffectActive(j) : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zNativeIsMakeupEffectActive;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public boolean isStickerEffectActive() {
            boolean zNativeIsStickerMakeupEffectActive;
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    zNativeIsStickerMakeupEffectActive = j != 0 ? lightningRenderImpl.nativeIsStickerMakeupEffectActive(j) : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zNativeIsStickerMakeupEffectActive;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void removeAll() {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.m
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20274d(this.f14678a);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void removeWithType(final String str) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.g
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20276f(this.f14664a, str);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void setEffectIntensity(final String str, final float f) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeMakeupLevelSetEffectIntensity(j, str, f);
                    } else {
                        lightningRenderImpl.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                LightningRenderImpl.C42181.m20278h(this.f14672a, str, f);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void setEnable(final boolean z) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.h
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20277g(this.f14666a, z);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void setLipsEffect(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.i
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42181.m20273c(this.f14668a, i);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IMakeupLevel
        public void setValue(final String str, final float f) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetFaceBeautyValue(j, str, f);
                    } else {
                        lightningRenderImpl.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                LightningRenderImpl.C42181.m20275e(this.f14661a, str, f);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.xeengine.lightningrender.LightningRenderImpl$2 */
    public class C42192 implements ILightningRender.IBeautyLevel {
        public C42192() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20279a(C42192 c42192, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSwitchSkinSmooth(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20280b(C42192 c42192, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSwitchSkinWhite(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20281c(C42192 c42192, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSwitchV3DegreeSubVersion(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m20282d(C42192 c42192, boolean z) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetFullSmoothEnable(j, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m20283e(C42192 c42192, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSwitchSkinV3WhiteVersion(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m20284f(C42192 c42192, String str, float f) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetFaceBeautyValue(j, str, f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public boolean getEnable() {
            boolean zNativeGetBeautyEnable;
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    zNativeGetBeautyEnable = j != 0 ? lightningRenderImpl.nativeGetBeautyEnable(j) : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zNativeGetBeautyEnable;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public int getSkinSmoothVersion() {
            int iNativeGetSmoothVersion;
            synchronized (LightningRenderImpl.this) {
                LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                iNativeGetSmoothVersion = lightningRenderImpl.nativeGetSmoothVersion(lightningRenderImpl.lightningRenderPointer);
            }
            return iNativeGetSmoothVersion;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public int getSkinWhiteningVersion() {
            int iNativeGetWhiteVersion;
            synchronized (LightningRenderImpl.this) {
                LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                iNativeGetWhiteVersion = lightningRenderImpl.nativeGetWhiteVersion(lightningRenderImpl.lightningRenderPointer);
            }
            return iNativeGetWhiteVersion;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setBigEyeVersion(int i) {
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setDegreeV3SubVersion(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.o
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42192.m20281c(this.f14681a, i);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setEnable(boolean z) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetBeautyEnable(j, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setFaceBeautyValue(final String str, final float f) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetFaceBeautyValue(j, str, f);
                    } else {
                        lightningRenderImpl.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                LightningRenderImpl.C42192.m20284f(this.f14689a, str, f);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setFullSmoothEnable(final boolean z) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.q
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42192.m20282d(this.f14685a, z);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setSkinSmoothVersion(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.p
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42192.m20279a(this.f14683a, i);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setSkinWhiteningVersion(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.n
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42192.m20280b(this.f14679a, i);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IBeautyLevel
        public void setWhitenV3SubVersion(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.r
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42192.m20283e(this.f14687a, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.momo.xeengine.lightningrender.LightningRenderImpl$4 */
    public class C42214 implements ILightningRender.IStickerLevel {
        public C42214() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20289a(C42214 c42214, String str, byte[] bArr, int i, int i2) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetTextureData(j, str, bArr, i, i2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20290b(C42214 c42214, StickerModel stickerModel) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long jNativeLoadSticker = lightningRenderImpl.nativeLoadSticker(lightningRenderImpl.lightningRenderPointer, stickerModel.getAssetPath(), stickerModel.getStickerId(), stickerModel.getBusinessType(), stickerModel.getDuration());
                    if (jNativeLoadSticker != 0) {
                        LightningRenderImpl lightningRenderImpl2 = LightningRenderImpl.this;
                        lightningRenderImpl2.nativeAddStickerModel(lightningRenderImpl2.lightningRenderPointer, jNativeLoadSticker);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20291c(C42214 c42214, String str) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeClearEngineModel(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m20292d(C42214 c42214) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeClearAllEngineModel(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m20293e(C42214 c42214, long j) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j2 = lightningRenderImpl.lightningRenderPointer;
                    if (j2 != 0) {
                        lightningRenderImpl.nativeAddStickerModel(j2, j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m20294f(C42214 c42214, String str) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeClearEngineModelWithId(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public synchronized void add(final StickerModel stickerModel) {
            final long jNativeLoadSticker;
            if (stickerModel == null) {
                return;
            }
            try {
                LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                if (lightningRenderImpl.lightningRenderPointer == 0) {
                    lightningRenderImpl.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            LightningRenderImpl.C42214.m20290b(this.f14704a, stickerModel);
                        }
                    });
                } else {
                    synchronized (lightningRenderImpl) {
                        try {
                            LightningRenderImpl lightningRenderImpl2 = LightningRenderImpl.this;
                            long j = lightningRenderImpl2.lightningRenderPointer;
                            jNativeLoadSticker = j != 0 ? lightningRenderImpl2.nativeLoadSticker(j, stickerModel.getAssetPath(), stickerModel.getStickerId(), stickerModel.getBusinessType(), stickerModel.getDuration()) : 0L;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (jNativeLoadSticker != 0) {
                        LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.z
                            @Override // java.lang.Runnable
                            public final void run() {
                                LightningRenderImpl.C42214.m20293e(this.f14706a, jNativeLoadSticker);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public void addListener(ILightningRender.StickerListener stickerListener) {
            LightningRenderImpl.this.mStickerListener = stickerListener;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public void removeAll() {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.c0
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42214.m20292d(this.f14656a);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public synchronized void removeByBusinessType(final String str) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.b0
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42214.m20291c(this.f14652a, str);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public synchronized void removeByID(final String str) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.x
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42214.m20294f(this.f14702a, str);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.IStickerLevel
        public void setTextureData(final String str, final byte[] bArr, final int i, final int i2) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.a0
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42214.m20289a(this.f14645a, str, bArr, i, i2);
                }
            });
        }
    }

    public LightningRenderImpl(String str, boolean z, String str2) {
        this.tag = str;
        this.useInnerProcessor = z;
        this.innerProcessorName = str2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20266a(LightningRenderImpl lightningRenderImpl, String str) {
        long j = lightningRenderImpl.engineIns;
        if (j != 0) {
            lightningRenderImpl.nativeRemoveLibraryPath(j, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20267b(LightningRenderImpl lightningRenderImpl, DataEvent dataEvent) {
        long j = lightningRenderImpl.engineIns;
        if (j != 0) {
            lightningRenderImpl.nativeSendDataEvent(j, dataEvent.getName(), dataEvent.getContent());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20268c(LightningRenderImpl lightningRenderImpl, IXAudioPlayer iXAudioPlayer) {
        long j = lightningRenderImpl.engineIns;
        if (j != 0) {
            lightningRenderImpl.nativeSetUserAudioPlayer(j, iXAudioPlayer);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20269d(LightningRenderImpl lightningRenderImpl, boolean z) {
        long j = lightningRenderImpl.engineIns;
        if (j != 0) {
            lightningRenderImpl.nativeShowDebugInfo(j, z);
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void addLibraryPath(@NotNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f14650a.nativeAddLibraryPath(str);
            }
        });
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public ILightningRender.IBeautyLevel getBeautyLevel() {
        return this.mBeautyLevel;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public boolean getCartoonFaceEnable() {
        boolean zNativeGetCartoonFaceEnable;
        synchronized (this) {
            try {
                long j = this.lightningRenderPointer;
                zNativeGetCartoonFaceEnable = j != 0 ? nativeGetCartoonFaceEnable(j) : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNativeGetCartoonFaceEnable;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public IXEventDispatcher getEventDispatcher() {
        return this.eventDispatcher;
    }

    @Override // com.momo.xeengine.IXEngine
    public XELogger getLogger() {
        return this.logger;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public ILightningRender.ILookupLevel getLookupLevel() {
        return this.mLookupLevel;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public ILightningRender.IMakeupLevel getMakeupLevel() {
        return this.mMakeupLevel;
    }

    @Override // com.momo.xeengine.IXEngine
    public ScriptBridge getScriptBridge() {
        XELuaEngine xELuaEngine = this.luaEngine;
        if (xELuaEngine != null) {
            return xELuaEngine.getScriptBridge();
        }
        return null;
    }

    @Override // com.momo.xeengine.IXEngine
    public XEScriptEngine getScriptEngine() {
        return this.luaEngine;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public ILightningRender.IStickerLevel getStickerLevel() {
        return this.mStickerLevel;
    }

    @Override // com.momo.xeengine.IXEngine
    public String getTag() {
        return this.tag;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public void init() {
        synchronized (this) {
            try {
                if (this.lightningRenderPointer == 0) {
                    XEngineModuleManager.engineLibraryLoaded();
                    long jNativeLightningRenderCreate = nativeLightningRenderCreate(this.useInnerProcessor, this.innerProcessorName);
                    this.lightningRenderPointer = jNativeLightningRenderCreate;
                    long jNativeGetEngineInstance = nativeGetEngineInstance(jNativeLightningRenderCreate);
                    this.engineIns = jNativeGetEngineInstance;
                    this.window = new XWindowImpl(this.renderThreadExecutor, nativeGetWindow(jNativeGetEngineInstance));
                    XELogger xELogger = new XELogger(nativeGetLogger(this.engineIns));
                    this.logger = xELogger;
                    xELogger.setTag(this.tag);
                    this.logger.setLogEnable(true);
                    this.luaEngine = new XELuaEngine(this.renderThreadExecutor, nativeGetScriptEngine(this.engineIns));
                    this.eventDispatcher = new XEEventDispatcher(nativeGetEventDispatcher(this.engineIns));
                    XEngineModuleManager.engineCreate(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.xeengine.lightningrender.LightningRenderJNI
    public void onStickerPlayCompleted(String str, String str2, String str3, long j, int i, int i2) {
        if (this.mStickerListener != null) {
            StickerModel stickerModel = new StickerModel();
            stickerModel.setAssetPath(str);
            stickerModel.setStickerId(str2);
            stickerModel.setBusinessType(str3);
            stickerModel.setUserFlag(i);
            try {
                this.mStickerListener.onStickerCompleted(stickerModel);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public Map<String, Object> preprocessor(byte[] bArr, int i, Size size, int i2, Map<String, Object> map) {
        HashMap map2;
        synchronized (this) {
            try {
                if (this.lightningRenderPointer != 0) {
                    map2 = new HashMap();
                    nativePreprocessor(this.lightningRenderPointer, bArr, i, size.getWidth(), size.getHeight(), i2, map, map2);
                } else {
                    map2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public void release() {
        synchronized (this) {
            try {
                long j = this.lightningRenderPointer;
                if (j != 0) {
                    nativeLightningRenderRelease(j);
                    this.lightningRenderPointer = 0L;
                    this.engineIns = 0L;
                    this.window.release();
                    this.window = null;
                    this.logger.release();
                    this.logger = null;
                    this.luaEngine.release();
                    this.luaEngine = null;
                    this.eventDispatcher.release();
                    this.eventDispatcher = null;
                    this.renderThreadExecutor.release();
                }
                runReleaseQueue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void removeLibraryPath(@NotNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.e
            @Override // java.lang.Runnable
            public final void run() {
                LightningRenderImpl.m20266a(this.f14659a, str);
            }
        });
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public void render(int i, int i2) {
        if (C4175L.m20223M(this)) {
            synchronized (this) {
                try {
                    long j = this.lightningRenderPointer;
                    if (j != 0) {
                        nativeDrawFrame(j, i, i2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            GLES20.glDisable(2884);
            GLES20.glDisable(3089);
        }
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public boolean renderTest(int i, int i2) {
        boolean zNativeRenderTest = false;
        if (!C4175L.m20223M(this)) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.lightningRenderPointer != 0) {
                    this.renderThreadExecutor.init();
                    if (i > 1 && i2 > 1) {
                        this.window.SetSize(i, i2);
                    }
                    this.renderThreadExecutor.executeQueue();
                    zNativeRenderTest = nativeRenderTest(this.lightningRenderPointer);
                    this.eventDispatcher.executeQueue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNativeRenderTest;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public void runOnRenderThread(Runnable runnable) {
        this.renderThreadExecutor.execute(runnable);
    }

    @Override // com.momo.xeengine.IXEngine
    public void sendEvent(@NotNull XEvent xEvent) {
        if (xEvent != null && (xEvent instanceof DataEvent)) {
            final DataEvent dataEvent = (DataEvent) xEvent;
            if (TextUtils.isEmpty(dataEvent.getName())) {
                return;
            }
            this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.d
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.m20267b(this.f14657a, dataEvent);
                }
            });
        }
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public void setCartoonFaceEnable(boolean z) {
        synchronized (this) {
            try {
                long j = this.lightningRenderPointer;
                if (j != 0) {
                    nativeSetCartoonFaceEnable(j, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void setTag(String str) {
        this.tag = str;
        XELogger xELogger = this.logger;
        if (xELogger != null) {
            xELogger.setTag(str);
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void setUserAudioPlayer(@NotNull final IXAudioPlayer iXAudioPlayer) {
        if (iXAudioPlayer == null) {
            return;
        }
        this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.c
            @Override // java.lang.Runnable
            public final void run() {
                LightningRenderImpl.m20268c(this.f14654a, iXAudioPlayer);
            }
        });
    }

    @Override // com.momo.xeengine.IXEngine
    public void showDebugInfo(final boolean z) {
        runOnRenderThread(new Runnable() { // from class: com.momo.xeengine.lightningrender.a
            @Override // java.lang.Runnable
            public final void run() {
                LightningRenderImpl.m20269d(this.f14643a, z);
            }
        });
    }

    /* JADX INFO: renamed from: com.momo.xeengine.lightningrender.LightningRenderImpl$3 */
    public class C42203 implements ILightningRender.ILookupLevel {
        public C42203() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20285a(C42203 c42203, int i, float f) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        if (i == 0) {
                            lightningRenderImpl.nativeSetLookup0Intensity(j, f);
                        } else if (i == 1) {
                            lightningRenderImpl.nativeSetLookup1Intensity(j, f);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20286b(C42203 c42203, int i, String str) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        if (i == 0) {
                            lightningRenderImpl.nativeSetLookup0Path(j, str);
                        } else if (i == 1) {
                            lightningRenderImpl.nativeSetLookup1Path(j, str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20287c(C42203 c42203, boolean z) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        lightningRenderImpl.nativeSetLookupEnable(j, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m20288d(C42203 c42203, int i) {
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    if (j != 0) {
                        if (i == 0) {
                            lightningRenderImpl.nativeClearLookup0(j);
                        } else if (i == 1) {
                            lightningRenderImpl.nativeClearLookup1(j);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void clear(final int i) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.w
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42203.m20288d(this.f14700a, i);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public boolean getEnable() {
            boolean zNativeGetLookupEnable;
            synchronized (LightningRenderImpl.this) {
                try {
                    LightningRenderImpl lightningRenderImpl = LightningRenderImpl.this;
                    long j = lightningRenderImpl.lightningRenderPointer;
                    zNativeGetLookupEnable = j != 0 ? lightningRenderImpl.nativeGetLookupEnable(j) : false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zNativeGetLookupEnable;
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void setEnable(final boolean z) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.u
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42203.m20287c(this.f14695a, z);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void setIntensity(final int i, final float f) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.t
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42203.m20285a(this.f14692a, i, f);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void setPath(final int i, final String str) {
            LightningRenderImpl.this.renderThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.lightningrender.v
                @Override // java.lang.Runnable
                public final void run() {
                    LightningRenderImpl.C42203.m20286b(this.f14697a, i, str);
                }
            });
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void clear() {
            clear(0);
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void setIntensity(float f) {
            setIntensity(0, f);
        }

        @Override // com.momo.xeengine.lightningrender.ILightningRender.ILookupLevel
        public void setPath(String str) {
            setPath(0, str);
        }
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender
    public boolean renderTest() {
        return renderTest(0, 0);
    }
}
