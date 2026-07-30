package com.quickjs;

import p153l.azk0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ES6Module extends Module {
    public ES6Module(QuickJS quickJS) {
        super(quickJS, quickJS.getNative()._createContext(quickJS.runtimePtr));
    }

    public void executeModule(String str) {
        String moduleScript = getModuleScript(str);
        if (moduleScript != null) {
            executeModuleScript(moduleScript, str);
        } else {
            azk0.m101074a("'moduleName' script is null");
        }
    }

    public void executeModuleScript(String str, String str2) {
        checkReleased();
        getNative()._executeScript(this.context.getContextPtr(), JSValue.TYPE.NULL.value, str, str2, QuickJS.JS_EVAL_TYPE_MODULE);
    }

    @Override // com.quickjs.Module
    public abstract String getModuleScript(String str);
}
