package com.idv.identity.service.algorithm;

import android.content.Context;
import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.base.algorithm.IIdentityDelegate;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.platform.log.RecordService;
import com.momo.mcamera.mask.Sticker;
import p153l.ifm;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityFace {
    public static native void config(IIdentityDelegate iIdentityDelegate, IdentityAlgConfig identityAlgConfig);

    public static ClassLoader getClassLoader() {
        return IdentityFace.class.getClassLoader();
    }

    public static boolean loadLibrary(Context context) {
        try {
            if (!ifm.m139739a()) {
                return false;
            }
            System.loadLibrary(Sticker.LAYER_TYPE_FACE);
            return true;
        } catch (UnsatisfiedLinkError | Error e) {
            RecordService.getInstance().recordException(e);
            return false;
        }
    }

    public static native boolean loadModel(byte[] bArr, int i);

    public static native boolean loadModelPath(String str, int i);

    public static native int processImage(IDFrame iDFrame);

    public static native void release();

    public static native void reset();

    public static native void setFarNeatAction(boolean z);

    public static native void updateState(String str, int i);
}
