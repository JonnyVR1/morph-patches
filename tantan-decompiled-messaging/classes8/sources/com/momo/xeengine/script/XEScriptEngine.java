package com.momo.xeengine.script;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface XEScriptEngine {

    public interface XEScriptEngineRegister {
        void register(long j);
    }

    void executeScriptFile(String str);

    void executeScriptString(@NotNull String str);

    @Nullable
    ScriptBridge getScriptBridge();

    void registerModule(XEScriptEngineRegister xEScriptEngineRegister);

    void setSecretKey(String str);

    void startGameScriptFile(String str);

    void startGameScriptFile(String str, String str2);
}
