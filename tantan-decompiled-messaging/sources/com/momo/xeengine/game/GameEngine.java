package com.momo.xeengine.game;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.XEngineException;
import com.momo.xeengine.XEngineModuleManager;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.audio.IXAudioPlayer;
import com.momo.xeengine.event.DataEvent;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.event.XEvent;
import com.momo.xeengine.game.GameEngine;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.utils.XERenderThreadExecutor;
import com.momo.xeengine.xnative.IXEngineListener;
import com.momo.xeengine.xnative.IXWindow;
import com.momo.xeengine.xnative.XEEngineInstanceJava;
import com.momo.xeengine.xnative.XEEventDispatcher;
import com.momo.xeengine.xnative.XWindowImpl;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class GameEngine extends XEEngineInstanceJava implements IXEngine {
    private Runnable beforeUpdateRunnable;
    private XEEventDispatcher eventDispatcher;
    private XELogger logger;
    private XELuaEngine luaEngine;
    private XWindowImpl window;
    private long renderTime = 0;
    private final XERenderThreadExecutor renderThreadExecutor = new XERenderThreadExecutor();
    private RenderMode renderMode = RenderMode.Auto;
    private boolean needUpdate = false;

    @Keep
    public enum RenderMode {
        Auto,
        UserRequest
    }

    public GameEngine() throws XEngineException {
        XEnginePreferences.checkEngineEnv();
        XEngineModuleManager.engineLibraryLoaded();
        this.engineIns = nativeCreateEngine();
        init();
        XEngineModuleManager.engineCreate(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20228a(GameEngine gameEngine, boolean z) {
        long j = gameEngine.engineIns;
        if (j != 0) {
            gameEngine.nativeShowDebugInfo(j, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20229b(GameEngine gameEngine, DataEvent dataEvent) {
        long j = gameEngine.engineIns;
        if (j != 0) {
            gameEngine.nativeSendDataEvent(j, dataEvent.getName(), dataEvent.getContent());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20230c(GameEngine gameEngine, String str) {
        long j = gameEngine.engineIns;
        if (j != 0) {
            gameEngine.nativeRemoveLibraryPath(j, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20231d(GameEngine gameEngine, IXAudioPlayer iXAudioPlayer) {
        long j = gameEngine.engineIns;
        if (j != 0) {
            gameEngine.nativeSetUserAudioPlayer(j, iXAudioPlayer);
        }
    }

    private void init() {
        this.renderThreadExecutor.init();
        this.window = new XWindowImpl(this.renderThreadExecutor, nativeGetWindow(this.engineIns));
        this.logger = new XELogger(nativeGetLogger(this.engineIns));
        this.luaEngine = new XELuaEngine(this.renderThreadExecutor, nativeGetScriptEngine(this.engineIns));
        this.eventDispatcher = new XEEventDispatcher(nativeGetEventDispatcher(this.engineIns));
    }

    private void renderImpl() {
        HashSet hashSet;
        if (this.renderTime == 0) {
            this.renderTime = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mEngineListeners.size() > 0) {
            hashSet = new HashSet();
            synchronized (this.mEngineListeners) {
                hashSet.addAll(this.mEngineListeners);
            }
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((IXEngineListener) it.next()).preRender();
            }
        }
        nativeRender(this.engineIns, jCurrentTimeMillis - this.renderTime);
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((IXEngineListener) it2.next()).postRender();
            }
        }
        this.renderTime = jCurrentTimeMillis;
    }

    @Override // com.momo.xeengine.IXEngine
    public void addLibraryPath(@NotNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.renderThreadExecutor.execute(new Runnable() { // from class: l.cij
            @Override // java.lang.Runnable
            public final void run() {
                this.f81092a.nativeAddLibraryPath(str);
            }
        });
    }

    public IXEventDispatcher getEventDispatcher() {
        return this.eventDispatcher;
    }

    @Override // com.momo.xeengine.IXEngine
    public XELogger getLogger() {
        return this.logger;
    }

    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    public XERenderThreadExecutor getRenderThreadExecutor() {
        return this.renderThreadExecutor;
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
    public String getTag() {
        XELogger xELogger = this.logger;
        if (xELogger != null) {
            return xELogger.getTag();
        }
        return null;
    }

    public IXWindow getWindow() {
        return this.window;
    }

    public void postTickEvent() {
        nativePostTickEvent(this.engineIns);
    }

    public void release() {
        XWindowImpl xWindowImpl = this.window;
        if (xWindowImpl != null) {
            xWindowImpl.release();
            this.window = null;
        }
        XELuaEngine xELuaEngine = this.luaEngine;
        if (xELuaEngine != null) {
            xELuaEngine.release();
            this.luaEngine = null;
        }
        XELogger xELogger = this.logger;
        if (xELogger != null) {
            xELogger.release();
            this.logger = null;
        }
        XEEventDispatcher xEEventDispatcher = this.eventDispatcher;
        if (xEEventDispatcher != null) {
            xEEventDispatcher.release();
            this.eventDispatcher = null;
        }
        this.renderThreadExecutor.release();
        if (this.engineIns != 0) {
            nativeReleaseEngine();
            this.engineIns = 0L;
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void removeLibraryPath(@NotNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.renderThreadExecutor.execute(new Runnable() { // from class: l.aij
            @Override // java.lang.Runnable
            public final void run() {
                GameEngine.m20230c(this.f69994a, str);
            }
        });
    }

    public boolean render() {
        if (this.engineIns != 0) {
            this.eventDispatcher.executeQueue();
            this.renderThreadExecutor.executeQueue();
            if (this.renderMode == RenderMode.Auto) {
                renderImpl();
                return true;
            }
            if (this.needUpdate) {
                Runnable runnable = this.beforeUpdateRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.beforeUpdateRunnable = null;
                }
                renderImpl();
                this.needUpdate = false;
                return true;
            }
        }
        return false;
    }

    public void requestRender(Runnable runnable) {
        this.needUpdate = true;
        this.beforeUpdateRunnable = runnable;
    }

    @Override // com.momo.xeengine.IXEngine
    public void sendEvent(@NotNull XEvent xEvent) {
        if (xEvent != null && (xEvent instanceof DataEvent)) {
            final DataEvent dataEvent = (DataEvent) xEvent;
            if (TextUtils.isEmpty(dataEvent.getName())) {
                return;
            }
            this.renderThreadExecutor.execute(new Runnable() { // from class: l.yhj
                @Override // java.lang.Runnable
                public final void run() {
                    GameEngine.m20229b(this.f198352a, dataEvent);
                }
            });
        }
    }

    public void setOnBackground(boolean z) {
        long j = this.engineIns;
        if (j != 0) {
            nativeSetOnBackground(j, z);
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    @Override // com.momo.xeengine.IXEngine
    public void setTag(String str) {
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
        this.renderThreadExecutor.execute(new Runnable() { // from class: l.bij
            @Override // java.lang.Runnable
            public final void run() {
                GameEngine.m20231d(this.f75761a, iXAudioPlayer);
            }
        });
    }

    @Override // com.momo.xeengine.IXEngine
    public void showDebugInfo(final boolean z) {
        this.renderThreadExecutor.execute(new Runnable() { // from class: l.zhj
            @Override // java.lang.Runnable
            public final void run() {
                GameEngine.m20228a(this.f203181a, z);
            }
        });
    }

    @Override // com.momo.xeengine.IXEngine
    public XELuaEngine getScriptEngine() {
        return this.luaEngine;
    }

    public void requestRender() {
        this.needUpdate = true;
    }
}
