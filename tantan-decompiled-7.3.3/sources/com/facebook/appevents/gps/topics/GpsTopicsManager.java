package com.facebook.appevents.gps.topics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.ztb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Lcom/facebook/appevents/gps/topics/GpsTopicsManager;", "", "<init>", "()V", "", "a", "", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/Executor;", "b", "Lkotlin/Lazy;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTopicsObservationEnabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class GpsTopicsManager {

    @NotNull
    public static final GpsTopicsManager INSTANCE = new GpsTopicsManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isTopicsObservationEnabled;

    static {
        String string = GpsTopicsManager.class.toString();
        string.getClass();
        TAG = string;
        executor = LazyKt__LazyJVMKt.m88118b(new Function0<ExecutorService>() { // from class: com.facebook.appevents.gps.topics.GpsTopicsManager$executor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newCachedThreadPool();
            }
        });
        isTopicsObservationEnabled = new AtomicBoolean(false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m7860a() {
        if (ztb.m221490d(GpsTopicsManager.class)) {
            return;
        }
        try {
            isTopicsObservationEnabled.set(true);
        } catch (Throwable th) {
            ztb.m221488b(th, GpsTopicsManager.class);
        }
    }
}
