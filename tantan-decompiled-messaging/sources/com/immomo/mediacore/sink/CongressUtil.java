package com.immomo.mediacore.sink;

import android.view.Surface;
import p149l.g16;
import p149l.gdm;
import p149l.rdc0;

/* JADX INFO: loaded from: classes7.dex */
public class CongressUtil {
    private static volatile boolean mIsLibLoaded = false;
    private static gdm sLocalLibLoader = new gdm() { // from class: com.immomo.mediacore.sink.CongressUtil.1
        @Override // p149l.gdm
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            rdc0.m178959a(g16.f100119a, str);
        }
    };

    public CongressUtil() {
        loadLibrariesOnce(null);
        setYuvCallback(0);
    }

    private native void _clearPcmCallBack();

    public static native String _getPara(byte[] bArr);

    private static native void _renderYuvData(int i, byte[] bArr, int i2, int i3);

    private static native void _setCutPosition(int i, int i2, int i3, int i4);

    private static native void _setCutPositionByUserid(float f, float f2, float f3, float f4, int i);

    private static native void _setCutPosition_f(float f, float f2, float f3, float f4);

    private native void _setRtcEngine(long j);

    private native void _setVideoSurface(long j, Surface surface);

    private native void _yuvCallBackEnable(int i);

    private static void loadLibrariesOnce(gdm gdmVar) {
        synchronized (CongressUtil.class) {
            try {
                if (!mIsLibLoaded) {
                    if (gdmVar == null) {
                        gdmVar = sLocalLibLoader;
                    }
                    gdmVar.loadLibrary("congressUtil");
                    gdmVar.loadLibrary("apm-congressRender");
                    mIsLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void renderYuvData(int i, byte[] bArr, int i2, int i3) {
        _renderYuvData(i, bArr, i2, i3);
    }

    public static void setCutPostion(float f, float f2, float f3, float f4) {
        _setCutPosition_f(f, f2, f3, f4);
    }

    public void clearPcmCallback() {
        try {
            _clearPcmCallBack();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getPara(byte[] bArr) {
        try {
            return _getPara(bArr);
        } catch (Error e) {
            e.printStackTrace();
            return "xx00";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "xx00";
        }
    }

    public void setRtcEngineHandler(long j) {
        try {
            _setRtcEngine(j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setVideoSurface(long j, Surface surface) {
        try {
            _setVideoSurface(j, surface);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setYuvCallback(int i) {
        try {
            _yuvCallBackEnable(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void setCutPostion(int i, int i2, int i3, int i4) {
    }

    public static void setCutPostion(float f, float f2, float f3, float f4, int i) {
        _setCutPositionByUserid(f, f2, f3, f4, i);
    }
}
