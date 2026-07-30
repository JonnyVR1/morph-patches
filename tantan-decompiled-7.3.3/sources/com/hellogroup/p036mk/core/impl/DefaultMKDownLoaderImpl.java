package com.hellogroup.p036mk.core.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;
import p153l.gkw;
import p153l.ivl;
import p153l.mxl;
import p153l.yjw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R#\u0010\u001d\u001a\n \u0015*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Lcom/hellogroup/mk/core/impl/DefaultMKDownLoaderImpl;", "Ll/mxl;", "<init>", "()V", "Ll/yjw;", "task", "", "autoStart", "Ll/mxl$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Ll/yjw;ZLl/mxl$a;)V", "", "taskId", "a", "(Ljava/lang/String;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "runningTasks", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "executor", "Ll/ivl;", "c", "Lkotlin/Lazy;", "e", "()Ll/ivl;", "okHttpClient", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class DefaultMKDownLoaderImpl implements mxl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, yjw> runningTasks = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy okHttpClient = LazyKt__LazyJVMKt.m88118b(new Function0<ivl>() { // from class: com.hellogroup.mk.core.impl.DefaultMKDownLoaderImpl$okHttpClient$2
        @Override // kotlin.jvm.functions.Function0
        public final ivl invoke() {
            return gkw.m130601b().m130602a();
        }
    });

    /* JADX INFO: renamed from: com.hellogroup.mk.core.impl.DefaultMKDownLoaderImpl$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3601a implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ mxl.InterfaceC18742a f12503b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ yjw f12504c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f12505d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f12506e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f12507f;

        public RunnableC3601a(mxl.InterfaceC18742a interfaceC18742a, yjw yjwVar, String str, String str2, String str3) {
            this.f12503b = interfaceC18742a;
            this.f12504c = yjwVar;
            this.f12505d = str;
            this.f12506e = str2;
            this.f12507f = str3;
        }

        @Override // java.lang.Runnable
        public final void run() throws Exception {
            try {
                mxl.InterfaceC18742a interfaceC18742a = this.f12503b;
                if (interfaceC18742a != null) {
                    interfaceC18742a.mo126159c(this.f12504c);
                }
                DefaultMKDownLoaderImpl.this.runningTasks.put(this.f12505d, this.f12504c);
                DefaultMKDownLoaderImpl.this.m18420e().mo115345a(this.f12506e, new File(this.f12507f), null, null);
                DefaultMKDownLoaderImpl.this.runningTasks.remove(this.f12505d);
                mxl.InterfaceC18742a interfaceC18742a2 = this.f12503b;
                if (interfaceC18742a2 != null) {
                    interfaceC18742a2.mo126158b(this.f12504c);
                }
            } catch (IOException unused) {
                DefaultMKDownLoaderImpl.this.runningTasks.remove(this.f12505d);
                mxl.InterfaceC18742a interfaceC18742a3 = this.f12503b;
                if (interfaceC18742a3 != null) {
                    interfaceC18742a3.mo126157a(this.f12504c, -1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final ivl m18420e() {
        return (ivl) this.okHttpClient.getValue();
    }

    @Override // p153l.mxl
    /* JADX INFO: renamed from: a */
    public boolean mo18421a(@Nullable String taskId) {
        if (taskId != null) {
            return this.runningTasks.containsKey(taskId);
        }
        return false;
    }

    @Override // p153l.mxl
    /* JADX INFO: renamed from: b */
    public void mo18422b(@Nullable yjw task, boolean autoStart, @Nullable mxl.InterfaceC18742a listener) {
        String strM216447c;
        String strM216446b;
        String strM216445a;
        if (task == null || (strM216447c = task.m216447c()) == null || (strM216446b = task.m216446b()) == null || (strM216445a = task.m216445a()) == null) {
            return;
        }
        this.executor.execute(new RunnableC3601a(listener, task, strM216447c, strM216446b, strM216445a));
    }
}
