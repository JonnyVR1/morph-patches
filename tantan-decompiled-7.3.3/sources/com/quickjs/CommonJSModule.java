package com.quickjs;

import com.quickjs.CommonJSModule;
import com.quickjs.JSArray;
import com.quickjs.JSObject;
import java.util.HashMap;
import java.util.Map;
import p153l.azk0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CommonJSModule extends Module {
    private static final String MODULE_SCRIPT_WRAPPER = "(function () {var module = { exports: {}, children: [] }; #CODE ; return module;})();";
    private final Map<String, JSObject> modules;

    public CommonJSModule(QuickJS quickJS) {
        super(quickJS, quickJS.getNative()._createContext(quickJS.runtimePtr));
        this.modules = new HashMap();
        registerJavaMethod(new JavaCallback() { // from class: l.vk5
            @Override // com.quickjs.JavaCallback
            public final Object invoke(JSObject jSObject, JSArray jSArray) {
                return CommonJSModule.m81522i(this.f184457a, jSObject, jSArray);
            }
        }, "require");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m81522i(CommonJSModule commonJSModule, JSObject jSObject, JSArray jSArray) {
        String string;
        commonJSModule.getClass();
        if (jSObject.isUndefined()) {
            string = null;
        } else {
            JSObject object = jSObject.getObject("module");
            if (object.isUndefined() || !object.contains("filename")) {
                string = null;
            } else {
                string = object.getString("filename");
            }
        }
        String string2 = jSArray.getString(0);
        String strConvertModuleName = commonJSModule.convertModuleName(string, string2);
        JSObject jSObjectExecuteModule = commonJSModule.modules.get(string2);
        if (jSObjectExecuteModule == null) {
            jSObjectExecuteModule = commonJSModule.executeModule(strConvertModuleName);
        }
        return jSObjectExecuteModule.get(JSValue.TYPE.UNKNOWN, "exports");
    }

    @Override // com.quickjs.JSContext, com.quickjs.JSValue, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.modules.clear();
        super.close();
    }

    public JSObject executeModule(String str) {
        String moduleScript = getModuleScript(str);
        if (moduleScript != null) {
            return executeModuleScript(moduleScript, str);
        }
        azk0.m101074a("'moduleName' script is null");
        return null;
    }

    public JSObject executeModuleScript(String str, String str2) {
        String strConvertModuleName = convertModuleName(null, str2);
        JSObject jSObject = (JSObject) super.executeScript(JSValue.TYPE.UNKNOWN, MODULE_SCRIPT_WRAPPER.replace("#CODE", str), strConvertModuleName);
        jSObject.set("id", strConvertModuleName);
        jSObject.set("filename", strConvertModuleName);
        if (strConvertModuleName != null) {
            this.modules.put(strConvertModuleName, jSObject);
        }
        return jSObject;
    }

    @Override // com.quickjs.Module
    public abstract String getModuleScript(String str);
}
