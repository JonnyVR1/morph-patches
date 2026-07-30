package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0764b;
import androidx.work.C0763a;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.akq0;
import p153l.b16;
import p153l.f7f;
import p153l.hjq0;
import p153l.hpr;
import p153l.j1j;
import p153l.k1j;
import p153l.mjq0;
import p153l.mvd;
import p153l.njq0;
import p153l.oiq0;
import p153l.piq0;
import p153l.po5;
import p153l.qzv;
import p153l.sa5;
import p153l.tjq0;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;
import p153l.wum;
import p153l.zjq0;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002(.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0012J\u001d\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#H\u0002¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010W\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bS\u0010\\¨\u0006^"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "Landroidx/work/impl/WorkerWrapper$a;", "builder", "<init>", "(Landroidx/work/impl/WorkerWrapper$a;)V", "Ll/hpr;", "", "q", "()Ll/hpr;", "", "stopReason", "", "o", "(I)V", "Landroidx/work/b$a;", LovePlanetStage.result, "w", "(Landroidx/work/b$a;)Z", "Landroidx/work/impl/WorkerWrapper$b;", ResourceDirection.f39656v, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "u", "(I)Z", "n", BaseSei.f14625Y, "()Z", "", "workSpecId", "p", "(Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45294s, Constants.KEY_T, BaseSei.f14624X, "", "tags", "k", "(Ljava/util/List;)Ljava/lang/String;", "Ll/mjq0;", "a", "Ll/mjq0;", "m", "()Ll/mjq0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", Constants.INAPP_DATA_TAG, "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/b;", "e", "Landroidx/work/b;", "builderWorker", "Ll/zni0;", "f", "Ll/zni0;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Ll/sa5;", "h", "Ll/sa5;", "clock", "Ll/j1j;", RXScreenCaptureService.KEY_INDEX, "Ll/j1j;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/njq0;", "Ll/njq0;", "workSpecDao", "Ll/mvd;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/mvd;", "dependencyDao", "Ljava/util/List;", "workDescription", "Ll/po5;", "Ll/po5;", "workerJob", "Ll/piq0;", "()Ll/piq0;", "workGenerationalId", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class WorkerWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final mjq0 workSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters.C0762a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final AbstractC0764b builderWorker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final zni0 workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C0763a configuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final sa5 clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final j1j foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final njq0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final mvd dependencyDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String workDescription;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final po5 workerJob;

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$a */
    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Ll/zni0;", "workTaskExecutor", "Ll/j1j;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/mjq0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Ll/zni0;Ll/j1j;Landroidx/work/impl/WorkDatabase;Ll/mjq0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Landroidx/work/impl/WorkerWrapper$a;", "Landroidx/work/impl/WorkerWrapper;", "a", "()Landroidx/work/impl/WorkerWrapper;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "Ll/zni0;", RXScreenCaptureService.KEY_INDEX, "()Ll/zni0;", "Ll/j1j;", Constants.INAPP_DATA_TAG, "()Ll/j1j;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Ll/mjq0;", "h", "()Ll/mjq0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/b;", "Landroidx/work/b;", "j", "()Landroidx/work/b;", "setWorker", "(Landroidx/work/b;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class C0773a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C0763a configuration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final zni0 workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final j1j foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final mjq0 workSpec;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context appContext;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public AbstractC0764b worker;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public WorkerParameters.C0762a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public C0773a(@NotNull Context context, @NotNull C0763a c0763a, @NotNull zni0 zni0Var, @NotNull j1j j1jVar, @NotNull WorkDatabase workDatabase, @NotNull mjq0 mjq0Var, @NotNull List<String> list) {
            context.getClass();
            c0763a.getClass();
            zni0Var.getClass();
            j1jVar.getClass();
            workDatabase.getClass();
            mjq0Var.getClass();
            list.getClass();
            this.configuration = c0763a;
            this.workTaskExecutor = zni0Var;
            this.foregroundProcessor = j1jVar;
            this.workDatabase = workDatabase;
            this.workSpec = mjq0Var;
            this.tags = list;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.C0762a();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WorkerWrapper m4488a() {
            return new WorkerWrapper(this);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C0763a getConfiguration() {
            return this.configuration;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final j1j getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.C0762a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<String> m4493f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final mjq0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final zni0 getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final AbstractC0764b getWorker() {
            return this.worker;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C0773a m4498k(@Nullable WorkerParameters.C0762a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper$b;", "", "<init>", "()V", "a", "b", "c", "Landroidx/work/impl/WorkerWrapper$b$a;", "Landroidx/work/impl/WorkerWrapper$b$b;", "Landroidx/work/impl/WorkerWrapper$b$c;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static abstract class AbstractC0774b {

        /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b$b */
        @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper$b$b;", "Landroidx/work/impl/WorkerWrapper$b;", "Landroidx/work/b$a;", LovePlanetStage.result, "<init>", "(Landroidx/work/b$a;)V", "a", "Landroidx/work/b$a;", "()Landroidx/work/b$a;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class b extends AbstractC0774b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC0764b.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull AbstractC0764b.a aVar) {
                super(null);
                aVar.getClass();
                this.result = aVar;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC0764b.a getResult() {
                return this.result;
            }
        }

        public /* synthetic */ AbstractC0774b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0774b() {
        }

        /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b$c */
        @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper$b$c;", "Landroidx/work/impl/WorkerWrapper$b;", "", Reason.TYPE, "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class c extends AbstractC0774b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final int reason;

            public /* synthetic */ c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -256 : i);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public c(int i) {
                super(null);
                this.reason = i;
            }

            public c() {
                this(0, 1, null);
            }
        }

        /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b$a */
        @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/work/impl/WorkerWrapper$b$a;", "Landroidx/work/impl/WorkerWrapper$b;", "Landroidx/work/b$a;", LovePlanetStage.result, "<init>", "(Landroidx/work/b$a;)V", "a", "Landroidx/work/b$a;", "()Landroidx/work/b$a;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class a extends AbstractC0774b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC0764b.a result;

            public /* synthetic */ a(AbstractC0764b.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new AbstractC0764b.a.C22772a() : aVar);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC0764b.a getResult() {
                return this.result;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull AbstractC0764b.a aVar) {
                super(null);
                aVar.getClass();
                this.result = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    public WorkerWrapper(@NotNull C0773a c0773a) {
        c0773a.getClass();
        mjq0 workSpec = c0773a.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = c0773a.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = c0773a.getRuntimeExtras();
        this.builderWorker = c0773a.getWorker();
        this.workTaskExecutor = c0773a.getWorkTaskExecutor();
        C0763a configuration = c0773a.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = c0773a.getForegroundProcessor();
        WorkDatabase workDatabase = c0773a.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> listM4493f = c0773a.m4493f();
        this.tags = listM4493f;
        this.workDescription = m4473k(listM4493f);
        this.workerJob = JobKt__JobKt.m94507b(null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m4463a(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.mo163439d(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.mo163445j(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.mo163434F(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.mo163437b(workerWrapper.workSpecId, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m4464b(WorkerWrapper workerWrapper) {
        mjq0 mjq0Var = workerWrapper.workSpec;
        if (mjq0Var.state != WorkInfo.State.ENQUEUED) {
            String str = WorkerWrapperKt.f3516a;
            qzv.m178829e().mo178832a(str, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!mjq0Var.m158609m() && !workerWrapper.workSpec.m158608l()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.m158599b()) {
            return Boolean.FALSE;
        }
        qzv.m178829e().mo178832a(WorkerWrapperKt.f3516a, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: k */
    public final String m4473k(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.joinToString$default(tags, Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null) + " } ]";
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final piq0 m4474l() {
        return tjq0.m191450a(this.workSpec);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final mjq0 getWorkSpec() {
        return this.workSpec;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4476n(AbstractC0764b.a result) {
        if (result instanceof AbstractC0764b.a.c) {
            String str = WorkerWrapperKt.f3516a;
            qzv.m178829e().mo178836f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.m158609m() ? m4482t() : m4486x(result);
        }
        if (result instanceof AbstractC0764b.a.b) {
            String str2 = WorkerWrapperKt.f3516a;
            qzv.m178829e().mo178836f(str2, "Worker result RETRY for " + this.workDescription);
            return m4481s(-256);
        }
        String str3 = WorkerWrapperKt.f3516a;
        qzv.m178829e().mo178836f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.m158609m()) {
            return m4482t();
        }
        if (result == null) {
            result = new AbstractC0764b.a.C22772a();
        }
        return m4485w(result);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: o */
    public final void m4477o(int stopReason) {
        this.workerJob.mo94586n(new WorkerStoppedException(stopReason));
    }

    /* JADX INFO: renamed from: p */
    public final void m4478p(String workSpecId) {
        List listMutableListOf = CollectionsKt.mutableListOf(workSpecId);
        while (!listMutableListOf.isEmpty()) {
            String str = (String) CollectionsKt.removeLast(listMutableListOf);
            if (this.workSpecDao.mo163439d(str) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.mo163445j(WorkInfo.State.FAILED, str);
            }
            listMutableListOf.addAll(this.dependencyDao.mo160261a(str));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final hpr<Boolean> m4479q() {
        return ListenableFutureKt.m4343h(this.workTaskExecutor.mo216344a().plus(JobKt__JobKt.m94507b(null, 1, null)), null, new WorkerWrapper$launch$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4480r(AbstractC0764b.a result) {
        WorkInfo.State stateMo163439d = this.workSpecDao.mo163439d(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (stateMo163439d == null) {
            return false;
        }
        if (stateMo163439d == WorkInfo.State.RUNNING) {
            return m4476n(result);
        }
        if (stateMo163439d.isFinished()) {
            return false;
        }
        return m4481s(-512);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4481s(int stopReason) {
        this.workSpecDao.mo163445j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo163446k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.mo163452q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo163460y(this.workSpecId, -1L);
        this.workSpecDao.mo163437b(this.workSpecId, stopReason);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4482t() {
        this.workSpecDao.mo163446k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.mo163445j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo163449n(this.workSpecId);
        this.workSpecDao.mo163452q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo163453r(this.workSpecId);
        this.workSpecDao.mo163460y(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4483u(int stopReason) {
        WorkInfo.State stateMo163439d = this.workSpecDao.mo163439d(this.workSpecId);
        if (stateMo163439d == null || stateMo163439d.isFinished()) {
            String str = WorkerWrapperKt.f3516a;
            qzv.m178829e().mo178832a(str, "Status for " + this.workSpecId + " is " + stateMo163439d + " ; not doing any work");
            return false;
        }
        String str2 = WorkerWrapperKt.f3516a;
        qzv.m178829e().mo178832a(str2, "Status for " + this.workSpecId + " is " + stateMo163439d + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.mo163445j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo163437b(this.workSpecId, stopReason);
        this.workSpecDao.mo163460y(this.workSpecId, -1L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0218  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final Object m4484v(Continuation<? super AbstractC0774b> continuation) throws Throwable {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        Data dataMo4348a;
        WorkerParameters workerParameters;
        Throwable th;
        b16<zjq0> b16VarM4389p;
        CancellationException e;
        final WorkerWrapper workerWrapper = this;
        if (continuation instanceof WorkerWrapper$runWorker$1) {
            workerWrapper$runWorker$1 = (WorkerWrapper$runWorker$1) continuation;
            int i = workerWrapper$runWorker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                workerWrapper$runWorker$1.label = i - Integer.MIN_VALUE;
            } else {
                workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(workerWrapper, continuation);
            }
        } else {
            workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(workerWrapper, continuation);
        }
        Object objM201255g = workerWrapper$runWorker$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = workerWrapper$runWorker$1.label;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            ResultKt.m88128b(objM201255g);
            final boolean zIsEnabled = workerWrapper.configuration.getTracer().isEnabled();
            final String traceTag = workerWrapper.workSpec.getTraceTag();
            if (zIsEnabled && traceTag != null) {
                workerWrapper.configuration.getTracer().mo190712d(traceTag, workerWrapper.workSpec.hashCode());
            }
            Boolean bool = (Boolean) workerWrapper.workDatabase.runInTransaction(new Callable() { // from class: l.lkq0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.m4464b(this.f132494a);
                }
            });
            bool.getClass();
            int i4 = 0;
            if (bool.booleanValue()) {
                return new AbstractC0774b.c(i4, i3, defaultConstructorMarker);
            }
            if (workerWrapper.workSpec.m158609m()) {
                dataMo4348a = workerWrapper.workSpec.input;
            } else {
                wum wumVarM213160b = workerWrapper.configuration.getInputMergerFactory().m213160b(workerWrapper.workSpec.inputMergerClassName);
                if (wumVarM213160b == null) {
                    String str = WorkerWrapperKt.f3516a;
                    qzv.m178829e().mo178834c(str, "Could not create Input Merger " + workerWrapper.workSpec.inputMergerClassName);
                    return new AbstractC0774b.a(objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                }
                dataMo4348a = wumVarM213160b.mo4348a(CollectionsKt.plus((Collection) CollectionsKt.listOf(workerWrapper.workSpec.input), (Iterable) workerWrapper.workSpecDao.mo163442g(workerWrapper.workSpecId)));
            }
            Data data = dataMo4348a;
            UUID uuidFromString = UUID.fromString(workerWrapper.workSpecId);
            List<String> list = workerWrapper.tags;
            WorkerParameters.C0762a c0762a = workerWrapper.runtimeExtras;
            mjq0 mjq0Var = workerWrapper.workSpec;
            workerParameters = new WorkerParameters(uuidFromString, data, list, c0762a, mjq0Var.runAttemptCount, mjq0Var.getGeneration(), workerWrapper.configuration.getExecutor(), workerWrapper.configuration.getWorkerCoroutineContext(), workerWrapper.workTaskExecutor, workerWrapper.configuration.getWorkerFactory(), new hjq0(workerWrapper.workDatabase, workerWrapper.workTaskExecutor), new oiq0(workerWrapper.workDatabase, workerWrapper.foregroundProcessor, workerWrapper.workTaskExecutor));
            final AbstractC0764b abstractC0764bM110385b = workerWrapper.builderWorker;
            if (abstractC0764bM110385b == null) {
                try {
                    abstractC0764bM110385b = workerWrapper.configuration.getWorkerFactory().m110385b(workerWrapper.appContext, workerWrapper.workSpec.workerClassName, workerParameters);
                } catch (Throwable th2) {
                    String str2 = WorkerWrapperKt.f3516a;
                    qzv.m178829e().mo178834c(str2, "Could not create Worker " + workerWrapper.workSpec.workerClassName);
                    b16<zjq0> b16VarM4391r = workerWrapper.configuration.m4391r();
                    if (b16VarM4391r != null) {
                        akq0.m98612a(b16VarM4391r, new zjq0(workerWrapper.workSpec.workerClassName, workerParameters, th2), WorkerWrapperKt.f3516a);
                    }
                    return new AbstractC0774b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            abstractC0764bM110385b.setUsed();
            CoroutineContext.Element element = workerWrapper$runWorker$1.getContext().get(InterfaceC15593o.INSTANCE);
            element.getClass();
            InterfaceC15593o interfaceC15593o = (InterfaceC15593o) element;
            interfaceC15593o.mo94592u(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapper$runWorker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th3) {
                    if (th3 instanceof WorkerStoppedException) {
                        abstractC0764bM110385b.stop(((WorkerStoppedException) th3).getReason());
                    }
                    if (!zIsEnabled || traceTag == null) {
                        return;
                    }
                    workerWrapper.configuration.getTracer().mo190711c(traceTag, workerWrapper.getWorkSpec().hashCode());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                    invoke2(th3);
                    return Unit.INSTANCE;
                }
            });
            if (!workerWrapper.m4487y()) {
                return new AbstractC0774b.c(0, 1, null);
            }
            int i5 = 0;
            int i6 = 1;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if (interfaceC15593o.isCancelled()) {
                return new AbstractC0774b.c(i5, i6, defaultConstructorMarker2);
            }
            k1j k1jVarM4362b = workerParameters.m4362b();
            k1jVarM4362b.getClass();
            Executor executorMo216345c = workerWrapper.workTaskExecutor.mo216345c();
            executorMo216345c.getClass();
            CoroutineDispatcher coroutineDispatcherM124439b = f7f.m124439b(executorMo216345c);
            try {
                WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(workerWrapper, abstractC0764bM110385b, k1jVarM4362b, null);
                workerWrapper$runWorker$1.L$0 = workerWrapper;
                workerWrapper$runWorker$1.L$1 = workerParameters;
                workerWrapper$runWorker$1.label = 1;
                objM201255g = vh3.m201255g(coroutineDispatcherM124439b, workerWrapper$runWorker$result$1, workerWrapper$runWorker$1);
                if (objM201255g == objM198688e) {
                    return objM198688e;
                }
            } catch (CancellationException e2) {
                e = e2;
                String str3 = WorkerWrapperKt.f3516a;
                qzv.m178829e().mo178837g(str3, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                String str4 = WorkerWrapperKt.f3516a;
                qzv.m178829e().mo178835d(str4, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                b16VarM4389p = workerWrapper.configuration.m4389p();
                if (b16VarM4389p != null) {
                    akq0.m98612a(b16VarM4389p, new zjq0(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.f3516a);
                }
                return new AbstractC0774b.a(null, 1, 0 == true ? 1 : 0);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WorkerParameters workerParameters2 = (WorkerParameters) workerWrapper$runWorker$1.L$1;
            WorkerWrapper workerWrapper2 = (WorkerWrapper) workerWrapper$runWorker$1.L$0;
            try {
                ResultKt.m88128b(objM201255g);
                workerParameters = workerParameters2;
                workerWrapper = workerWrapper2;
            } catch (CancellationException e3) {
                e = e3;
                workerWrapper = workerWrapper2;
                String str5 = WorkerWrapperKt.f3516a;
                qzv.m178829e().mo178837g(str5, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th4) {
                th = th4;
                workerParameters = workerParameters2;
                workerWrapper = workerWrapper2;
                String str6 = WorkerWrapperKt.f3516a;
                qzv.m178829e().mo178835d(str6, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                b16VarM4389p = workerWrapper.configuration.m4389p();
                if (b16VarM4389p != null) {
                    akq0.m98612a(b16VarM4389p, new zjq0(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.f3516a);
                }
                return new AbstractC0774b.a(null, 1, 0 == true ? 1 : 0);
            }
        }
        AbstractC0764b.a aVar = (AbstractC0764b.a) objM201255g;
        aVar.getClass();
        return new AbstractC0774b.b(aVar);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public final boolean m4485w(@NotNull AbstractC0764b.a result) {
        result.getClass();
        m4478p(this.workSpecId);
        Data dataM4419e = ((AbstractC0764b.a.C22772a) result).m4419e();
        dataM4419e.getClass();
        this.workSpecDao.mo163452q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo163431C(this.workSpecId, dataM4419e);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4486x(AbstractC0764b.a result) {
        this.workSpecDao.mo163445j(WorkInfo.State.SUCCEEDED, this.workSpecId);
        result.getClass();
        Data dataM4420e = ((AbstractC0764b.a.c) result).m4420e();
        dataM4420e.getClass();
        this.workSpecDao.mo163431C(this.workSpecId, dataM4420e);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.mo160261a(this.workSpecId)) {
            if (this.workSpecDao.mo163439d(str) == WorkInfo.State.BLOCKED && this.dependencyDao.mo160262b(str)) {
                String str2 = WorkerWrapperKt.f3516a;
                qzv.m178829e().mo178836f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.mo163445j(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.mo163446k(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4487y() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.mkq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.m4463a(this.f137328a);
            }
        });
        objRunInTransaction.getClass();
        return ((Boolean) objRunInTransaction).booleanValue();
    }
}
