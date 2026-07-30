package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p153l.jt2;
import p153l.mpc0;

/* JADX INFO: loaded from: classes8.dex */
public class AISkinWhiteningFilter {
    private CXSkinWhiteningFilter mCXSkinWhiteningFilter;
    private WeakReference<Context> mContext = null;
    private FaceLightingFilter mFaceLightingFilter;
    private VersionType.CXSkinVersion mType;

    public jt2 getSkinWhiteningFilter(Context context, VersionType.CXSkinVersion cXSkinVersion) {
        Bitmap bitmapDecodeStream;
        this.mContext = new WeakReference<>(context);
        this.mType = cXSkinVersion;
        if (cXSkinVersion != VersionType.CXSkinVersion.VersionType1) {
            if (cXSkinVersion == VersionType.CXSkinVersion.VersionType2) {
                this.mFaceLightingFilter = new FaceLightingFilter(FaceLightingFilter.WhiteningVersionEnum._8version);
            } else if (cXSkinVersion == VersionType.CXSkinVersion.VersionType3) {
                this.mFaceLightingFilter = new FaceLightingFilter(FaceLightingFilter.WhiteningVersionEnum.originWhiten);
            }
            return this.mFaceLightingFilter;
        }
        Bitmap bitmapDecodeStream2 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open("cax_color_enhancement_curve.png");
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bitmapDecodeStream = null;
        }
        try {
            InputStream inputStreamOpen2 = context.getAssets().open("cax_color_enhancement_lookup.png");
            try {
                bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpen2);
                if (inputStreamOpen2 != null) {
                    inputStreamOpen2.close();
                }
            } catch (Throwable th3) {
                if (inputStreamOpen2 != null) {
                    try {
                        inputStreamOpen2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        CXSkinWhiteningFilter cXSkinWhiteningFilter = new CXSkinWhiteningFilter();
        this.mCXSkinWhiteningFilter = cXSkinWhiteningFilter;
        cXSkinWhiteningFilter.setImageBitmap(bitmapDecodeStream, bitmapDecodeStream2);
        return this.mCXSkinWhiteningFilter;
    }

    public void setSkinLightLevel(float f) {
        mpc0.m159352a().m159355d(f);
        if (this.mType == VersionType.CXSkinVersion.VersionType1) {
            CXSkinWhiteningFilter cXSkinWhiteningFilter = this.mCXSkinWhiteningFilter;
            if (cXSkinWhiteningFilter != null) {
                cXSkinWhiteningFilter.setAlpha(f);
                return;
            }
            return;
        }
        FaceLightingFilter faceLightingFilter = this.mFaceLightingFilter;
        if (faceLightingFilter != null) {
            faceLightingFilter.setSkinLightingScale(f);
        }
    }
}
