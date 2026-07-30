package com.momo.xeengine;

import android.content.Context;
import androidx.annotation.Keep;
import com.momo.xeengine.audio.IXAudioPlayer;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.event.XEvent;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momo.xeengine.lightningrender.LightningRenderBuilder;
import com.momo.xeengine.lightningrender.StickerModel;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.script.XEScriptEngine;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.momo.xeengine.xnative.XEEventDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public final class XE3DEngine implements IXEngine {
    private ILightningRender lightningRender;
    private String tag;
    private String initLibraryPath = null;
    private boolean tickEnable = true;
    private int width = 0;
    private int height = 0;

    public XE3DEngine(Context context, String str) {
        this.tag = str;
    }

    public static String getEngineVersion() {
        return XEnginePreferences.VERSION;
    }

    public static int getEngineVersionNum() {
        return 507;
    }

    public static boolean loadEngineSo() {
        return XEngineSOManager.loadEngineSO();
    }

    public static boolean loadLuaEngineSo() {
        return XEngineSOManager.loadEngineSO();
    }

    public static void setApplicationContext(Context context) {
        XEnginePreferences.setApplicationContext(context);
    }

    @Override // com.momo.xeengine.IXEngine
    public void addLibraryPath(@NotNull String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.addLibraryPath(str);
        }
    }

    public void clearBackground() {
    }

    public void clearEvent() {
    }

    public void dispatchMessage(String str) {
    }

    public void enableClearColor(boolean z) {
    }

    public void enableRecording(boolean z) {
    }

    public void endEngine() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.release();
            this.lightningRender = null;
        }
    }

    public XEEventDispatcher getEventDispatcher() {
        IXEventDispatcher eventDispatcher;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || (eventDispatcher = iLightningRender.getEventDispatcher()) == null || !(eventDispatcher instanceof XEEventDispatcher)) {
            return null;
        }
        return (XEEventDispatcher) eventDispatcher;
    }

    public String getLibraryPath() {
        return this.initLibraryPath;
    }

    @Override // com.momo.xeengine.IXEngine
    public XELogger getLogger() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            return iLightningRender.getLogger();
        }
        return null;
    }

    @Override // com.momo.xeengine.IXEngine
    public ScriptBridge getScriptBridge() {
        XELuaEngine scriptEngine = getScriptEngine();
        if (scriptEngine != null) {
            return scriptEngine.getScriptBridge();
        }
        return null;
    }

    @Override // com.momo.xeengine.IXEngine
    public XELuaEngine getScriptEngine() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null) {
            return null;
        }
        XEScriptEngine scriptEngine = iLightningRender.getScriptEngine();
        if (scriptEngine instanceof XELuaEngine) {
            return (XELuaEngine) scriptEngine;
        }
        return null;
    }

    @Override // com.momo.xeengine.IXEngine
    public String getTag() {
        ILightningRender iLightningRender = this.lightningRender;
        return iLightningRender != null ? iLightningRender.getTag() : this.tag;
    }

    public String getVersion() {
        return XEnginePreferences.VERSION;
    }

    public boolean isRunning() {
        return this.lightningRender != null;
    }

    public boolean isTickEnable() {
        return this.tickEnable;
    }

    public void loadSceneWithId(String str, String str2) {
        if (this.lightningRender != null) {
            StickerModel stickerModel = new StickerModel();
            stickerModel.setBusinessType("XE3DEngine");
            stickerModel.setStickerId(str2);
            stickerModel.setAssetPath(this.initLibraryPath + "/" + str);
            this.lightningRender.getStickerLevel().add(stickerModel);
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void queueEvent(Runnable runnable, int i) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.runOnRenderThread(runnable);
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void removeLibraryPath(@NotNull String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.removeLibraryPath(str);
        }
    }

    public void render(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || !iLightningRender.renderTest(this.width, this.height)) {
            return;
        }
        this.lightningRender.render(this.width, this.height);
    }

    public void resizeWindow(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void rorateCamera(boolean z) {
    }

    public synchronized boolean runEngine(int i, int i2) {
        try {
            LightningRenderBuilder lightningRenderBuilder = new LightningRenderBuilder();
            lightningRenderBuilder.setTag(this.tag);
            try {
                ILightningRender iLightningRenderBuild = lightningRenderBuilder.build();
                this.lightningRender = iLightningRenderBuild;
                if (iLightningRenderBuild == null) {
                    return false;
                }
                iLightningRenderBuild.init();
                this.lightningRender.getBeautyLevel().setEnable(false);
                this.lightningRender.getLookupLevel().setEnable(false);
                this.lightningRender.getMakeupLevel().setEnable(false);
                if (i != 0) {
                    this.width = i;
                }
                if (i2 != 0) {
                    this.height = i2;
                }
                return true;
            } catch (XEngineException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void sendEvent(@NotNull XEvent xEvent) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.sendEvent(xEvent);
        }
    }

    public void setLibraryPath(String str) {
        this.initLibraryPath = str;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.addLibraryPath(str);
        }
    }

    public void setOnBackground(boolean z) {
    }

    @Override // com.momo.xeengine.IXEngine
    public void setTag(String str) {
        this.tag = str;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.setTag(str);
        }
    }

    public void setTickEnable(boolean z) {
        this.tickEnable = z;
    }

    @Override // com.momo.xeengine.IXEngine
    public void setUserAudioPlayer(@NotNull IXAudioPlayer iXAudioPlayer) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.setUserAudioPlayer(iXAudioPlayer);
        }
    }

    @Override // com.momo.xeengine.IXEngine
    public void showDebugInfo(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.showDebugInfo(z);
        }
    }

    public boolean touchHitTest(float f, float f2) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            return iLightningRender.getEventDispatcher().handleTouchHitTest();
        }
        return false;
    }

    public void unloadScene(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().removeByID(str);
        }
    }

    public void queueEvent(Runnable runnable) {
        queueEvent(runnable, 0);
    }

    public void render() {
        render(null);
    }

    public boolean runEngine() {
        return runEngine(0, 0);
    }
}
