package com.momo.xengine.p002ar;

import com.momo.xeengine.IXEngine;
import com.momo.xeengine.XEngineException;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.script.XEScriptEngine;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class XEngineARImpl extends XEngineAR {
    private static boolean SO_LOAD_SUCCEEDED = false;
    private final XEngineAR.SupportType supportType = XEngineAR.SupportType.SupportSensor;

    private synchronized void loadNativeLib() {
        if (SO_LOAD_SUCCEEDED) {
            return;
        }
        try {
            System.loadLibrary("xengine_ar");
            if (XEnginePreferences.ARCHIVE_TIME != nativeGetArchiveTime()) {
                throw new XEngineException("AR模块版本加载错误");
            }
            nativeSetSupportType(this.supportType.getValue());
            SO_LOAD_SUCCEEDED = true;
        } catch (Throwable th) {
            throw new RuntimeException("AR模块加载失败" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeBindLuaApi(long j);

    private native long nativeGetArchiveTime();

    private native void nativeSetSupportType(int i);

    @Override // com.momo.xengine.p002ar.XEngineAR
    public IXARCamera createCamera(IXEngine iXEngine) {
        return ARCameraCache.getARCamera(iXEngine);
    }

    @Override // com.momo.xeengine.IXEngineModule
    public void engineDidCreated(IXEngine iXEngine) {
        iXEngine.getScriptEngine().registerModule(new XEScriptEngine.XEScriptEngineRegister() { // from class: com.momo.xengine.ar.a
            @Override // com.momo.xeengine.script.XEScriptEngine.XEScriptEngineRegister
            public final void register(long j) {
                this.f445a.nativeBindLuaApi(j);
            }
        });
    }

    @Override // com.momo.xeengine.IXEngineModule
    public void engineWillCreate() {
        loadNativeLib();
    }

    @Override // com.momo.xeengine.IXEngineModule
    public void engineWillDestroy(IXEngine iXEngine) {
    }

    @Override // com.momo.xengine.p002ar.XEngineAR
    public XEngineAR.SupportType getSupportType() {
        return this.supportType;
    }
}
