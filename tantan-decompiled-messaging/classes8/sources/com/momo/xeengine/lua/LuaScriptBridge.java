package com.momo.xeengine.lua;

import androidx.annotation.Keep;
import com.momo.xeengine.lua.LuaScriptBridge;
import com.momo.xeengine.script.ScriptBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p007l.ifw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class LuaScriptBridge implements ScriptBridge {
    private final Executor executor;
    private final Map<String, Object> handlers = new HashMap();
    private long nativePointer;

    public static class JCallback implements ScriptBridge.Callback {
        private final LuaScriptBridge bridge;
        private final long pCallback;

        private JCallback(LuaScriptBridge luaScriptBridge, long j) {
            this.bridge = luaScriptBridge;
            this.pCallback = j;
        }

        @Override // com.momo.xeengine.script.ScriptBridge.Callback
        public void call(String str) {
            if (this.bridge.nativePointer != 0) {
                LuaScriptBridge.nativeCallback(this.pCallback, str);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            LuaScriptBridge.nativeDeleteCallbackFunc(this.pCallback);
        }
    }

    public LuaScriptBridge(Executor executor, long j) {
        this.executor = executor;
        this.nativePointer = j;
        nativeBindJavaObj(j, this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m566a(LuaScriptBridge luaScriptBridge, String str, String str2, String str3) {
        long j = luaScriptBridge.nativePointer;
        if (j != 0) {
            luaScriptBridge.nativeJavaCallLua(j, str, str2, str3);
        }
    }

    private String callFormScript(String str, String str2, String str3) throws ScriptException {
        Object obj;
        Class<?> cls;
        Object obj2 = this.handlers.get(str);
        if (obj2 == null) {
            throw new ScriptException("no handler  " + str);
        }
        if (obj2 instanceof Class) {
            cls = (Class) obj2;
            obj = null;
        } else {
            obj = obj2;
            cls = obj2.getClass();
        }
        try {
            Object objInvoke = cls.getMethod(str2, String.class).invoke(obj, str3);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            ifw.m9387a("no method ", str2, str);
            return null;
        } catch (Throwable unused2) {
            ifw.m9387a("error to call method ", str2, str);
            return null;
        }
    }

    private native void nativeBindJavaObj(long j, LuaScriptBridge luaScriptBridge);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeCallback(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDeleteCallbackFunc(long j);

    private native String nativeJavaCallLua(long j, String str, String str2, String str3);

    @Override // com.momo.xeengine.script.ScriptBridge
    public void add(Object obj, String str) {
        regist(obj, str);
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public String call(final String str, final String str2, final String str3) {
        if (this.nativePointer == 0) {
            return null;
        }
        this.executor.execute(new Runnable() { // from class: l.jfw
            @Override // java.lang.Runnable
            public final void run() {
                LuaScriptBridge.m566a(this.f2978a, str, str2, str3);
            }
        });
        return null;
    }

    public String luaCallJava(String str, String str2, String str3) throws ScriptException {
        if (str2.endsWith(":")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return callFormScript(str, str2, str3);
    }

    public void luaCallJavaAsync(String str, String str2, String str3, long j) throws ScriptException {
        if (str2.endsWith(":")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        callFormScript(str, str2, str3, j);
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public void regist(Object obj, String str) {
        this.handlers.put(str, obj);
    }

    public void release() {
        unregistAll();
        this.nativePointer = 0L;
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public void remove(String str) {
        unregist(str);
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public void removeAll() {
        unregistAll();
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public void unregist(String str) {
        this.handlers.remove(str);
    }

    @Override // com.momo.xeengine.script.ScriptBridge
    public void unregistAll() {
        this.handlers.clear();
    }

    public void callFormScript(String str, String str2, String str3, long j) throws ScriptException {
        Object obj;
        Class<?> cls;
        Object obj2 = this.handlers.get(str);
        if (obj2 != null) {
            if (obj2 instanceof Class) {
                cls = (Class) obj2;
                obj = null;
            } else {
                obj = obj2;
                cls = obj2.getClass();
            }
            try {
                cls.getMethod(str2, String.class, ScriptBridge.Callback.class).invoke(obj, str3, new JCallback(j));
                return;
            } catch (NoSuchMethodException unused) {
                ifw.m9387a("no method ", str2, str);
                return;
            } catch (Throwable unused2) {
                ifw.m9387a("error to call method ", str2, str);
                return;
            }
        }
        throw new ScriptException("no handler  " + str);
    }
}
