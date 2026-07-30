package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    public interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().m16778e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            Logger.getLogger().m16778e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().m16776d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.isHandlingException.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
                } else {
                    Logger.getLogger().m16776d("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.defaultHandler != null) {
                    Logger.getLogger().m16776d("Completed exception processing. Invoking default exception handler.");
                    this.defaultHandler.uncaughtException(thread, th);
                } else {
                    Logger.getLogger().m16776d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e) {
                Logger.getLogger().m16779e("An error occurred in the uncaught exception handler", e);
                if (this.defaultHandler == null) {
                    Logger.getLogger().m16776d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.isHandlingException.set(false);
        } catch (Throwable th2) {
            if (this.defaultHandler != null) {
                Logger.getLogger().m16776d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            } else {
                Logger.getLogger().m16776d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.isHandlingException.set(false);
            throw th2;
        }
    }
}
