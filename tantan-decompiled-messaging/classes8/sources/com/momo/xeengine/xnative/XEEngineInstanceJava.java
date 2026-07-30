package com.momo.xeengine.xnative;

import androidx.annotation.Keep;
import com.momo.xeengine.audio.IXAudioPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public abstract class XEEngineInstanceJava {
    protected long engineIns;
    protected final Set<IXEngineListener> mEngineListeners = new HashSet();

    private native void nativeAddLibraryPath(long j, String str);

    private native void nativeReleaseEngine(long j);

    public void addEngineListener(IXEngineListener iXEngineListener) {
        synchronized (this.mEngineListeners) {
            this.mEngineListeners.add(iXEngineListener);
        }
    }

    public long getEngineIns() {
        return this.engineIns;
    }

    public void nativeAddLibraryPath(String str) {
        long j = this.engineIns;
        if (j != 0) {
            nativeAddLibraryPath(j, str);
        }
    }

    public native long nativeCreateEngine();

    public native long nativeGetEventDispatcher(long j);

    public native long nativeGetLogger(long j);

    public native long nativeGetScriptEngine(long j);

    public native long nativeGetWindow(long j);

    public native void nativePostTickEvent(long j);

    public void nativeReleaseEngine() {
        runReleaseQueue();
        nativeReleaseEngine(this.engineIns);
        this.engineIns = 0L;
    }

    public native void nativeRemoveLibraryPath(long j, String str);

    public native void nativeRender(long j, long j2);

    public native void nativeSendDataEvent(long j, String str, String str2);

    public native void nativeSetOnBackground(long j, boolean z);

    public native void nativeSetUserAudioPlayer(long j, IXAudioPlayer iXAudioPlayer);

    public native void nativeShowDebugInfo(long j, boolean z);

    public void runReleaseQueue() {
        synchronized (this.mEngineListeners) {
            try {
                Iterator<IXEngineListener> it = this.mEngineListeners.iterator();
                while (it.hasNext()) {
                    it.next().onEngineRelease();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
