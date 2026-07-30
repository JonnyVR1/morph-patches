package com.momo.xeengine.lightningrender;

import android.util.Size;
import androidx.annotation.Keep;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.event.IXEventDispatcher;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface ILightningRender extends IXEngine {

    @Keep
    public interface IBeautyLevel {

        @Deprecated
        public static final int BigEyeVersionA = 0;

        @Deprecated
        public static final int BigEyeVersionB = 1;

        @Deprecated
        public static final String EYE_BRIGHTEN = "eye_brighten";

        @Deprecated
        public static final String REMOVE_NASOLABIAL_FOLDS = "remove_nasolabial_floads";

        @Deprecated
        public static final String REMOVE_POUCH = "remove_pouch";

        @Deprecated
        public static final String SKIN_BLUSH = "skin_ruddy";

        @Deprecated
        public static final String SKIN_SHARPEN = "skin_sharpen";

        @Deprecated
        public static final String SKIN_SMOOTH = "skin_smooth";

        @Deprecated
        public static final String SKIN_WHITENING = "skin_whitening";
        public static final int SkinDegreeV3SubVersionA = 0;
        public static final int SkinDegreeV3SubVersionB = 1;
        public static final int SkinSmoothVersionA = 0;

        @Deprecated
        public static final int SkinSmoothVersionB = 1;
        public static final int SkinSmoothVersionC = 2;
        public static final int SkinWhiteningV3SubVersionA = 0;
        public static final int SkinWhiteningV3SubVersionB = 1;
        public static final int SkinWhiteningV3SubVersionC = 2;
        public static final int SkinWhiteningVersionA = 0;
        public static final int SkinWhiteningVersionB = 1;
        public static final int SkinWhiteningVersionC = 2;

        @Deprecated
        public static final String TEETH_WHITEN = "teeth_whiten";

        boolean getEnable();

        int getSkinSmoothVersion();

        int getSkinWhiteningVersion();

        @Deprecated
        void setBigEyeVersion(int i);

        void setDegreeV3SubVersion(int i);

        void setEnable(boolean z);

        void setFaceBeautyValue(String str, float f);

        void setFullSmoothEnable(boolean z);

        void setSkinSmoothVersion(int i);

        void setSkinWhiteningVersion(int i);

        void setWhitenV3SubVersion(int i);
    }

    @Keep
    public interface ILookupLevel {
        void clear();

        void clear(int i);

        boolean getEnable();

        void setEnable(boolean z);

        void setIntensity(float f);

        void setIntensity(int i, float f);

        void setPath(int i, String str);

        void setPath(String str);
    }

    @Keep
    public interface IMakeupLevel {
        public static final String MAKEUP_ALL = "makeup_all";
        public static final String MAKEUP_BLUSH = "makeup_blush";
        public static final String MAKEUP_EYEBROW = "makeup_eyebrow";
        public static final String MAKEUP_EYES = "makeup_eyes";
        public static final String MAKEUP_FACIAL = "makeup_facial";
        public static final String MAKEUP_LIPS = "makeup_lips";
        public static final String MAKEUP_LUT = "makeup_lut";
        public static final String MAKEUP_PUPIL = "makeup_pupil";
        public static final int MakeupLipsEffectBling = 4;
        public static final int MakeupLipsEffectMatte = 2;
        public static final int MakeupLipsEffectMirror = 3;
        public static final int MakeupLipsEffectNone = 0;
        public static final int MakeupLipsEffectWater = 1;

        void addEffect(String str);

        void disableEffect(String str, boolean z);

        boolean getEnable();

        boolean isEffectActive();

        boolean isStickerEffectActive();

        void removeAll();

        void removeWithType(String str);

        void setEffectIntensity(String str, float f);

        void setEnable(boolean z);

        void setLipsEffect(int i);

        void setValue(String str, float f);
    }

    @Keep
    public interface IStickerLevel {
        void add(StickerModel stickerModel);

        void addListener(StickerListener stickerListener);

        void removeAll();

        void removeByBusinessType(String str);

        void removeByID(String str);

        void setTextureData(String str, byte[] bArr, int i, int i2);
    }

    @Keep
    public interface StickerListener {
        void onStickerCompleted(StickerModel stickerModel);
    }

    IBeautyLevel getBeautyLevel();

    @Deprecated
    boolean getCartoonFaceEnable();

    IXEventDispatcher getEventDispatcher();

    ILookupLevel getLookupLevel();

    IMakeupLevel getMakeupLevel();

    IStickerLevel getStickerLevel();

    void init();

    Map<String, Object> preprocessor(byte[] bArr, int i, Size size, int i2, Map<String, Object> map);

    void release();

    void render(int i, int i2);

    boolean renderTest();

    boolean renderTest(int i, int i2);

    void runOnRenderThread(Runnable runnable);

    @Deprecated
    void setCartoonFaceEnable(boolean z);
}
