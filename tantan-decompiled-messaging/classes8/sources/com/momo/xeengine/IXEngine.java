package com.momo.xeengine;

import androidx.annotation.Keep;
import com.momo.xeengine.audio.IXAudioPlayer;
import com.momo.xeengine.event.XEvent;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.script.XEScriptEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface IXEngine {
    void addLibraryPath(@NotNull String str);

    @Nullable
    XELogger getLogger();

    @Nullable
    ScriptBridge getScriptBridge();

    @Nullable
    XEScriptEngine getScriptEngine();

    String getTag();

    void removeLibraryPath(@NotNull String str);

    void sendEvent(@NotNull XEvent xEvent);

    void setTag(String str);

    void setUserAudioPlayer(@NotNull IXAudioPlayer iXAudioPlayer);

    void showDebugInfo(boolean z);
}
