package com.quickjs.plugin;

import android.util.Log;
import android.webkit.JavascriptInterface;
import com.quickjs.JSArray;
import com.quickjs.JSContext;
import com.quickjs.JSObject;
import com.quickjs.JavaVoidCallback;
import com.quickjs.Plugin;
import com.quickjs.plugin.ConsolePlugin;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ConsolePlugin extends Plugin {
    private int count;
    private final Map<String, Long> timer = new HashMap();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m81557a(ConsolePlugin consolePlugin, JSObject jSObject, JSArray jSArray) {
        consolePlugin.getClass();
        if (jSArray.getBoolean(0)) {
            return;
        }
        consolePlugin.error(jSArray.getString(1));
    }

    @JavascriptInterface
    public void clear() {
        log("This 'console.clear' function is not supported");
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
    }

    @JavascriptInterface
    public final int count() {
        return this.count;
    }

    @JavascriptInterface
    public final void error(String str) {
        this.count++;
        println(6, str);
    }

    @JavascriptInterface
    public void group(String str) {
        log("This 'console.group' function is not supported");
    }

    @JavascriptInterface
    public void groupCollapsed(String str) {
        log("This 'console.groupCollapsed' function is not supported");
    }

    @JavascriptInterface
    public void groupEnd(String str) {
        log("This 'console.groupEnd' function is not supported");
    }

    @JavascriptInterface
    public final void info(String str) {
        this.count++;
        println(4, str);
    }

    @JavascriptInterface
    public final void log(String str) {
        this.count++;
        println(3, str);
    }

    public void println(int i, String str) {
        Log.println(i, "QuickJS", str);
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        jSContext.addJavascriptInterface(this, "console").registerJavaMethod(new JavaVoidCallback() { // from class: l.yx5
            @Override // com.quickjs.JavaVoidCallback
            public final void invoke(JSObject jSObject, JSArray jSArray) {
                ConsolePlugin.m81557a(this.f201931a, jSObject, jSArray);
            }
        }, "assert");
    }

    @JavascriptInterface
    public final void table(JSObject jSObject) {
        if (jSObject instanceof JSArray) {
            log(((JSArray) jSObject).toJSONArray().toString());
        } else if (jSObject != null) {
            log(jSObject.toJSONObject().toString());
        }
    }

    @JavascriptInterface
    public final void time(String str) {
        if (this.timer.containsKey(str)) {
            warn(String.format("Timer '%s' already exists", str));
        } else {
            this.timer.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @JavascriptInterface
    public final void timeEnd(String str) {
        Long l2 = this.timer.get(str);
        if (l2 != null) {
            log(String.format("%s: %s ms", str, Float.valueOf(System.currentTimeMillis() - l2.longValue())));
        }
        this.timer.remove(str);
    }

    @JavascriptInterface
    public void trace() {
        log("This 'console.trace' function is not supported");
    }

    @JavascriptInterface
    public final void warn(String str) {
        this.count++;
        println(5, str);
    }
}
