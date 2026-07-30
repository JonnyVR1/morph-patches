package com.quickjs.plugin;

import com.quickjs.JSArray;
import com.quickjs.JSContext;
import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import com.quickjs.JavaVoidCallback;
import com.quickjs.Plugin;
import com.quickjs.plugin.SetTimeoutPlugin;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SetTimeoutPlugin extends Plugin {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10726a(JSFunction jSFunction, JSContext jSContext) {
        if (jSFunction.getContext().isReleased()) {
            return;
        }
        jSFunction.call(null, new JSArray(jSContext));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10727b(long j, final JSFunction jSFunction, final JSContext jSContext) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jSFunction.getQuickJS().postEventQueue(new Runnable() { // from class: l.sme0
            @Override // java.lang.Runnable
            public final void run() {
                SetTimeoutPlugin.m10726a(jSFunction, jSContext);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10728c(final JSContext jSContext, JSObject jSObject, JSArray jSArray) {
        final JSFunction jSFunction = (JSFunction) jSArray.getObject(0);
        final long j = (long) jSArray.getDouble(1);
        new Thread(new Runnable() { // from class: l.rme0
            @Override // java.lang.Runnable
            public final void run() {
                SetTimeoutPlugin.m10727b(j, jSFunction, jSContext);
            }
        }).start();
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
    }

    @Override // com.quickjs.Plugin
    public void setup(final JSContext jSContext) {
        jSContext.registerJavaMethod(new JavaVoidCallback() { // from class: l.tme0
            @Override // com.quickjs.JavaVoidCallback
            public final void invoke(JSObject jSObject, JSArray jSArray) {
                SetTimeoutPlugin.m10728c(jSContext, jSObject, jSArray);
            }
        }, "setTimeout");
    }
}
