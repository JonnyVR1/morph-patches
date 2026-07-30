package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final Lazy<ScheduledExecutorService> BG_EXECUTOR = new Lazy<>(new Provider() { // from class: l.b6f
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(4, ExecutorsRegistrar.factory("Firebase Background", 10, ExecutorsRegistrar.bgPolicy())));
        }
    });
    static final Lazy<ScheduledExecutorService> LITE_EXECUTOR = new Lazy<>(new Provider() { // from class: l.c6f
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.factory("Firebase Lite", 0, ExecutorsRegistrar.litePolicy())));
        }
    });
    static final Lazy<ScheduledExecutorService> BLOCKING_EXECUTOR = new Lazy<>(new Provider() { // from class: l.d6f
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.scheduled(Executors.newCachedThreadPool(ExecutorsRegistrar.factory("Firebase Blocking", 11)));
        }
    });
    static final Lazy<ScheduledExecutorService> SCHEDULER = new Lazy<>(new Provider() { // from class: l.e6f
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.factory("Firebase Scheduler", 0));
        }
    });

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new CustomThreadFactory(str, i, null);
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: l.f6f
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.BG_EXECUTOR.get();
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: l.g6f
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.BLOCKING_EXECUTOR.get();
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: l.h6f
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.LITE_EXECUTOR.get();
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: l.i6f
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return UiExecutor.INSTANCE;
            }
        }).build());
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i, threadPolicy);
    }
}
