package com.quickjs.plugin;

import com.quickjs.JSArray;
import com.quickjs.JSContext;
import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import com.quickjs.JavaConstructorCallback;
import com.quickjs.JavaVoidCallback;
import com.quickjs.Plugin;
import com.quickjs.QuickJS;
import com.quickjs.plugin.WorkerPlugin;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class WorkerPlugin extends Plugin {
    private Map<Long, Worker> workers = new HashMap();

    public static class Worker implements Closeable {
        private final JSContext context;
        private final QuickJS quickJS;
        private boolean terminate;
        private final JSObject workerObj;

        public Worker(final WorkerPlugin workerPlugin, JSObject jSObject, final String str) {
            QuickJS quickJSCreateRuntimeWithEventQueue = QuickJS.createRuntimeWithEventQueue();
            this.quickJS = quickJSCreateRuntimeWithEventQueue;
            JSContext jSContextCreateContext = quickJSCreateRuntimeWithEventQueue.createContext();
            this.context = jSContextCreateContext;
            jSContextCreateContext.addPlugin(new ConsolePlugin());
            jSContextCreateContext.addPlugin(new SetTimeoutPlugin());
            jSContextCreateContext.registerJavaMethod(new JavaVoidCallback() { // from class: com.quickjs.plugin.WorkerPlugin.Worker.1
                @Override // com.quickjs.JavaVoidCallback
                public void invoke(JSObject jSObject2, JSArray jSArray) {
                    Worker.this.sendMessageReceiver(jSArray.getString(0));
                }
            }, "postMessage");
            this.workerObj = jSObject;
            initWorkerReceiver();
            new Thread(new Runnable() { // from class: com.quickjs.plugin.WorkerPlugin.Worker.2
                @Override // java.lang.Runnable
                public void run() {
                    Worker.this.context.executeVoidScript(workerPlugin.getScript(str), str);
                }
            }).start();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m80380d(Worker worker, String str) {
            JSObject object = worker.workerObj.getObject("onmessage");
            if (object instanceof JSFunction) {
                JSObject jSObject = worker.workerObj;
                ((JSFunction) object).call(jSObject, new JSArray(jSObject.getContext()).push(str));
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m80381e(Worker worker, String str) {
            JSObject object = worker.context.getObject("onmessage");
            if (object == null || object.isUndefined()) {
                return;
            }
            ((JSFunction) object).call(null, new JSArray(worker.context).push(str));
        }

        private void initWorkerReceiver() {
            this.workerObj.registerJavaMethod(new JavaVoidCallback() { // from class: com.quickjs.plugin.b
                @Override // com.quickjs.JavaVoidCallback
                public final void invoke(JSObject jSObject, JSArray jSArray) {
                    this.f54900a.close();
                }
            }, "terminate");
            this.workerObj.registerJavaMethod(new JavaVoidCallback() { // from class: com.quickjs.plugin.WorkerPlugin.Worker.3
                @Override // com.quickjs.JavaVoidCallback
                public void invoke(JSObject jSObject, JSArray jSArray) {
                    Worker.this.postMessage(jSArray.getString(0));
                }
            }, "postMessage");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendMessageReceiver(final String str) {
            this.workerObj.postEventQueue(new Runnable() { // from class: com.quickjs.plugin.a
                @Override // java.lang.Runnable
                public final void run() {
                    WorkerPlugin.Worker.m80380d(this.f54898a, str);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.terminate) {
                return;
            }
            this.terminate = true;
            final QuickJS quickJS = this.quickJS;
            quickJS.getClass();
            quickJS.postEventQueue(new Runnable() { // from class: l.ebq0
                @Override // java.lang.Runnable
                public final void run() {
                    quickJS.close();
                }
            });
        }

        public void postMessage(final String str) {
            this.quickJS.postEventQueue(new Runnable() { // from class: com.quickjs.plugin.c
                @Override // java.lang.Runnable
                public final void run() {
                    WorkerPlugin.Worker.m80381e(this.f54901a, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80378a(WorkerPlugin workerPlugin, JSObject jSObject, JSArray jSArray) {
        workerPlugin.getClass();
        workerPlugin.workers.put(Long.valueOf(jSObject.getTag()), new Worker(workerPlugin, jSObject, jSArray.getString(0)));
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
        Iterator<Worker> it = this.workers.values().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public abstract String getScript(String str);

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        jSContext.registerClass(new JavaConstructorCallback() { // from class: l.dbq0
            @Override // com.quickjs.JavaConstructorCallback
            public final void invoke(JSObject jSObject, JSArray jSArray) {
                WorkerPlugin.m80378a(this.f85336a, jSObject, jSArray);
            }
        }, com.tantanapp.sharelib.workmanager.Worker.TAG);
    }
}
