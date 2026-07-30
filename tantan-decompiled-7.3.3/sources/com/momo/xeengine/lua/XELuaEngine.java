package com.momo.xeengine.lua;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.script.XEScriptEngine;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XELuaEngine implements XEScriptEngine {
    private final Executor executor;
    private LuaScriptBridge mLuaScriptBridge;
    private long mPointer;

    public XELuaEngine(Executor executor, long j) {
        this.executor = executor;
        this.mPointer = j;
        this.mLuaScriptBridge = new LuaScriptBridge(executor, nativeGetScriptBridge(j));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21295a(XELuaEngine xELuaEngine, XEScriptEngine.XEScriptEngineRegister xEScriptEngineRegister) {
        long j = xELuaEngine.mPointer;
        if (j != 0) {
            xEScriptEngineRegister.register(xELuaEngine.nativeGetLuaState(j));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21297c(XELuaEngine xELuaEngine, String str, String str2) {
        long j = xELuaEngine.mPointer;
        if (j != 0) {
            xELuaEngine.nativeStartGameScriptFile(j, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21298d(XELuaEngine xELuaEngine, String str) {
        long j = xELuaEngine.mPointer;
        if (j != 0) {
            xELuaEngine.nativeExecuteString(j, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21299e(XELuaEngine xELuaEngine, String str) {
        long j = xELuaEngine.mPointer;
        if (j != 0) {
            xELuaEngine.nativeExecuteScriptFile(j, str);
        }
    }

    private native void nativeExecuteScriptFile(long j, String str);

    private native void nativeExecuteString(long j, String str);

    private native long nativeGetLuaState(long j);

    private native long nativeGetScriptBridge(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetSecretKey(long j, String str);

    private native void nativeStartGameScriptFile(long j, String str, String str2);

    public void callOnPause() {
        long j = this.mPointer;
        if (j != 0) {
            nativeCallOnPause(j);
        }
    }

    public void callOnResume() {
        long j = this.mPointer;
        if (j != 0) {
            nativeCallOnResume(j);
        }
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void executeScriptFile(final String str) {
        if (this.mPointer == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.plq0
            @Override // java.lang.Runnable
            public final void run() {
                XELuaEngine.m21299e(this.f153062a, str);
            }
        });
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void executeScriptString(@NotNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.tlq0
            @Override // java.lang.Runnable
            public final void run() {
                XELuaEngine.m21298d(this.f174860a, str);
            }
        });
    }

    public long getNative() {
        return this.mPointer;
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public ScriptBridge getScriptBridge() {
        return this.mLuaScriptBridge;
    }

    public native void nativeCallOnPause(long j);

    public native void nativeCallOnResume(long j);

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void registerModule(final XEScriptEngine.XEScriptEngineRegister xEScriptEngineRegister) {
        if (this.mPointer == 0) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.rlq0
            @Override // java.lang.Runnable
            public final void run() {
                XELuaEngine.m21295a(this.f163779a, xEScriptEngineRegister);
            }
        });
    }

    public void release() {
        this.mPointer = 0L;
        LuaScriptBridge luaScriptBridge = this.mLuaScriptBridge;
        if (luaScriptBridge != null) {
            luaScriptBridge.release();
            this.mLuaScriptBridge = null;
        }
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void setSecretKey(final String str) {
        if (this.mPointer == 0) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.slq0
            @Override // java.lang.Runnable
            public final void run() {
                XELuaEngine xELuaEngine = this.f169454a;
                xELuaEngine.nativeSetSecretKey(xELuaEngine.mPointer, str);
            }
        });
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void startGameScriptFile(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.qlq0
            @Override // java.lang.Runnable
            public final void run() {
                XELuaEngine.m21297c(this.f158266a, str, str2);
            }
        });
    }

    @Override // com.momo.xeengine.script.XEScriptEngine
    public void startGameScriptFile(String str) {
        startGameScriptFile(str, null);
    }
}
