package com.momo.mcamera.mask;

import android.content.Context;
import com.momo.mcamera.mask.lightskin.LightSkinSmoothGroupFilter;
import com.momo.mcamera.mask.skin.AIFaceSkinComposeFilter;
import java.lang.ref.WeakReference;
import p153l.mpc0;

/* JADX INFO: loaded from: classes8.dex */
public class CXSkinBeautyManger {
    private VersionType.CXSkinVersion mCXSkinVersion;
    private WeakReference<Context> mContext;
    private BaseSkinComposeFilter mCXFaceSkinComposeFilter = null;
    private float mCurrentLevel = 0.0f;

    /* JADX INFO: renamed from: com.momo.mcamera.mask.CXSkinBeautyManger$1 */
    public static /* synthetic */ class C41761 {
        static final /* synthetic */ int[] $SwitchMap$com$momo$mcamera$mask$VersionType$CXSkinVersion;

        static {
            int[] iArr = new int[VersionType.CXSkinVersion.values().length];
            $SwitchMap$com$momo$mcamera$mask$VersionType$CXSkinVersion = iArr;
            try {
                iArr[VersionType.CXSkinVersion.VersionType2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$momo$mcamera$mask$VersionType$CXSkinVersion[VersionType.CXSkinVersion.VersionType1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$momo$mcamera$mask$VersionType$CXSkinVersion[VersionType.CXSkinVersion.VersionType3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CXSkinBeautyManger(Context context, VersionType.CXSkinVersion cXSkinVersion) {
        this.mContext = null;
        this.mCXSkinVersion = VersionType.CXSkinVersion.VersionType2;
        this.mContext = new WeakReference<>(context);
        this.mCXSkinVersion = cXSkinVersion;
    }

    public BaseSkinComposeFilter getSkinBeautyFilter() {
        int i = C41761.$SwitchMap$com$momo$mcamera$mask$VersionType$CXSkinVersion[this.mCXSkinVersion.ordinal()];
        if (i == 1) {
            this.mCXFaceSkinComposeFilter = new AIFaceSkinComposeFilter();
        } else if (i != 2) {
            if (i == 3) {
                this.mCXFaceSkinComposeFilter = new SkinChooseFilter(false, 0.0f, SkinChooseFilter.SKIN_TYPE_SMOOTH_8_0);
            }
            this.mCXFaceSkinComposeFilter = new AIFaceSkinComposeFilter();
        } else {
            this.mCXFaceSkinComposeFilter = new LightSkinSmoothGroupFilter();
        }
        return this.mCXFaceSkinComposeFilter;
    }

    public float getSkinLevel() {
        return this.mCurrentLevel;
    }

    public void setSkinLevel(float f) {
        BaseSkinComposeFilter baseSkinComposeFilter = this.mCXFaceSkinComposeFilter;
        if (baseSkinComposeFilter != null) {
            baseSkinComposeFilter.setSmoothLevel(f);
            this.mCurrentLevel = f;
            mpc0.m159352a().m159353b(f);
        }
    }
}
