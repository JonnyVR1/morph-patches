package com.immomo.molive.debuger.performance.tracer.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p153l.ci2;
import p153l.cs2;
import p153l.ogy;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b\u001d\u0010\u000b¨\u0006$"}, m88121d2 = {"Lcom/immomo/molive/debuger/performance/tracer/memory/MemTracer;", "Ll/cs2;", "Ll/ogy;", "Ll/ci2;", "memConfig", "<init>", "(Ll/ci2;)V", "", "j", "()Z", "k", "()Ll/ogy;", "Landroid/content/Context;", "context", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/content/Context;)V", RXScreenCaptureService.KEY_INDEX, "Landroid/app/ActivityManager;", "e", "Landroid/app/ActivityManager;", "mActivityManager", "Landroid/app/ActivityManager$MemoryInfo;", "f", "Landroid/app/ActivityManager$MemoryInfo;", "totalMemInfo", "g", "Z", "memTotalTracerEnable", "h", "getMemTracerEnable", "setMemTracerEnable", "(Z)V", "memTracerEnable", "Lkotlin/Lazy;", "currentMem", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MemTracer extends cs2<ogy> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ActivityManager mActivityManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ActivityManager.MemoryInfo totalMemInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean memTotalTracerEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean memTracerEnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy currentMem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemTracer(@NotNull ci2 ci2Var) {
        super(ci2Var);
        ci2Var.getClass();
        this.memTotalTracerEnable = true;
        this.memTracerEnable = true;
        this.currentMem = LazyKt__LazyJVMKt.m88118b(new Function0<ogy>() { // from class: com.immomo.molive.debuger.performance.tracer.memory.MemTracer$currentMem$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ogy invoke() {
                return new ogy(0, 0, 0, 6, null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    private final ogy m19574h() {
        return (ogy) this.currentMem.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final boolean m19575j() {
        return Build.VERSION.SDK_INT <= 28;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getMemTracerEnable() {
        return this.memTracerEnable;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // p153l.cs2
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ogy mo19547c() {
        Debug.MemoryInfo memoryInfo;
        try {
            if (this.memTotalTracerEnable) {
                if (this.totalMemInfo == null) {
                    this.totalMemInfo = new ActivityManager.MemoryInfo();
                }
                ActivityManager activityManager = this.mActivityManager;
                if (activityManager != null) {
                    activityManager.getMemoryInfo(this.totalMemInfo);
                }
            }
            if (m19575j()) {
                ActivityManager activityManager2 = this.mActivityManager;
                Debug.MemoryInfo[] processMemoryInfo = activityManager2 != null ? activityManager2.getProcessMemoryInfo(new int[]{Process.myPid()}) : null;
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ActivityManager activityManager3 = this.mActivityManager;
                if (activityManager3 != null) {
                    activityManager3.getMemoryInfo(memoryInfo2);
                }
                if (processMemoryInfo == null) {
                    memoryInfo = null;
                } else {
                    if (processMemoryInfo.length == 0) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = processMemoryInfo[0];
                    }
                }
            } else {
                memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
            }
            int totalPss = memoryInfo != null ? memoryInfo.getTotalPss() : 0;
            if (totalPss >= 0) {
                m19574h().m167673e((int) (totalPss / 1024.0f));
            }
            ActivityManager.MemoryInfo memoryInfo3 = this.totalMemInfo;
            if (memoryInfo3 != null) {
                if (memoryInfo3.totalMem <= 0 || memoryInfo3.availMem <= 0) {
                    this.memTotalTracerEnable = false;
                } else {
                    m19574h().m167674f((int) (memoryInfo3.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                    m19574h().m167675g((int) (memoryInfo3.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                }
            }
        } catch (Exception unused) {
            this.memTracerEnable = false;
        }
        return m19574h();
    }

    /* JADX INFO: renamed from: l */
    public final void m19578l(@Nullable Context context) {
        if (context == null) {
            this.memTracerEnable = false;
            return;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.app.ActivityManager");
        } else {
            this.mActivityManager = (ActivityManager) systemService;
            mo19548f();
        }
    }
}
