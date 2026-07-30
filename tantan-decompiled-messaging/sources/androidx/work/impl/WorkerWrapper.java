package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0762b;
import androidx.work.C0761a;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.caq0;
import p149l.gnr;
import p149l.haq0;
import p149l.hh3;
import p149l.iaq0;
import p149l.j9q0;
import p149l.k9q0;
import p149l.ln5;
import p149l.oaq0;
import p149l.oyi;
import p149l.pyi;
import p149l.qkq0;
import p149l.r95;
import p149l.txv;
import p149l.uaq0;
import p149l.usm;
import p149l.uwp;
import p149l.vaq0;
import p149l.wz5;
import p149l.ytd;
import p149l.z5f;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002(.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0012J\u001d\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#H\u0002¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010W\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bS\u0010\\¨\u0006^"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "Landroidx/work/impl/WorkerWrapper$a;", "builder", "<init>", "(Landroidx/work/impl/WorkerWrapper$a;)V", "Ll/gnr;", "", "q", "()Ll/gnr;", "", "stopReason", "", "o", "(I)V", "Landroidx/work/b$a;", LovePlanetStage.result, "w", "(Landroidx/work/b$a;)Z", "Landroidx/work/impl/WorkerWrapper$b;", ResourceDirection.f38808v, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "u", "(I)Z", "n", BaseSei.f13931Y, "()Z", "", "workSpecId", "p", "(Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44446s, Constants.KEY_T, BaseSei.f13930X, "", "tags", "k", "(Ljava/util/List;)Ljava/lang/String;", "Ll/haq0;", "a", "Ll/haq0;", "m", "()Ll/haq0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", Constants.INAPP_DATA_TAG, "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/b;", "e", "Landroidx/work/b;", "builderWorker", "Ll/zei0;", "f", "Ll/zei0;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Ll/r95;", "h", "Ll/r95;", "clock", "Ll/oyi;", RXScreenCaptureService.KEY_INDEX, "Ll/oyi;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/iaq0;", "Ll/iaq0;", "workSpecDao", "Ll/ytd;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/ytd;", "dependencyDao", "Ljava/util/List;", "workDescription", "Ll/ln5;", "Ll/ln5;", "workerJob", "Ll/k9q0;", "()Ll/k9q0;", "workGenerationalId", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class WorkerWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final haq0 workSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters.C0760a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final AbstractC0762b builderWorker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final zei0 workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C0761a configuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final r95 clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final oyi foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final iaq0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final ytd dependencyDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String workDescription;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final ln5 workerJob;

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$a */
    @Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Ll/zei0;", "workTaskExecutor", "Ll/oyi;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/haq0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Ll/zei0;Ll/oyi;Landroidx/work/impl/WorkDatabase;Ll/haq0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Landroidx/work/impl/WorkerWrapper$a;", "Landroidx/work/impl/WorkerWrapper;", "a", "()Landroidx/work/impl/WorkerWrapper;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "Ll/zei0;", RXScreenCaptureService.KEY_INDEX, "()Ll/zei0;", "Ll/oyi;", Constants.INAPP_DATA_TAG, "()Ll/oyi;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Ll/haq0;", "h", "()Ll/haq0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/b;", "Landroidx/work/b;", "j", "()Landroidx/work/b;", "setWorker", "(Landroidx/work/b;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class C0771a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C0761a configuration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final zei0 workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final oyi foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final haq0 workSpec;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context appContext;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public AbstractC0762b worker;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public WorkerParameters.C0760a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public C0771a(@NotNull Context context, @NotNull C0761a c0761a, @NotNull zei0 zei0Var, @NotNull oyi oyiVar, @NotNull WorkDatabase workDatabase, @NotNull haq0 haq0Var, @NotNull List<String> list) {
            context.getClass();
            c0761a.getClass();
            zei0Var.getClass();
            oyiVar.getClass();
            workDatabase.getClass();
            haq0Var.getClass();
            list.getClass();
            this.configuration = c0761a;
            this.workTaskExecutor = zei0Var;
            this.foregroundProcessor = oyiVar;
            this.workDatabase = workDatabase;
            this.workSpec = haq0Var;
            this.tags = list;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.C0760a();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WorkerWrapper m4486a() {
            return new WorkerWrapper(this);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C0761a getConfiguration() {
            return this.configuration;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final oyi getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.C0760a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<String> m4491f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final haq0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final zei0 getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final AbstractC0762b getWorker() {
            return this.worker;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C0771a m4496k(@Nullable WorkerParameters.C0760a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper$b;", "", "<init>", "()V", "a", "b", "c", "Landroidx/work/impl/WorkerWrapper$b$a;", "Landroidx/work/impl/WorkerWrapper$b$b;", "Landroidx/work/impl/WorkerWrapper$b$c;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC0772b {

        /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b$b */
        @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper$b$b;", "Landroidx/work/impl/WorkerWrapper$b;", "Landroidx/work/b$a;", LovePlanetStage.result, "<init>", "(Landroidx/work/b$a;)V", "a", "Landroidx/work/b$a;", "()Landroidx/work/b$a;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class b extends AbstractC0772b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC0762b.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull AbstractC0762b.a aVar) {
                super(null);
                aVar.getClass();
                this.result = aVar;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC0762b.a getResult() {
                return this.result;
            }
        }

        public /* synthetic */ AbstractC0772b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0772b() {
        }

        /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$b$c */
        @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper$b$c;", "Landroidx/work/impl/WorkerWrapper$b;", "", Reason.TYPE, "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class c extends AbstractC0772b {

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
        @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/work/impl/WorkerWrapper$b$a;", "Landroidx/work/impl/WorkerWrapper$b;", "Landroidx/work/b$a;", LovePlanetStage.result, "<init>", "(Landroidx/work/b$a;)V", "a", "Landroidx/work/b$a;", "()Landroidx/work/b$a;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class a extends AbstractC0772b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC0762b.a result;

            public /* synthetic */ a(AbstractC0762b.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new AbstractC0762b.a.C22657a() : aVar);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC0762b.a getResult() {
                return this.result;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull AbstractC0762b.a aVar) {
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

    public WorkerWrapper(@NotNull C0771a c0771a) {
        c0771a.getClass();
        haq0 workSpec = c0771a.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = c0771a.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = c0771a.getRuntimeExtras();
        this.builderWorker = c0771a.getWorker();
        this.workTaskExecutor = c0771a.getWorkTaskExecutor();
        C0761a configuration = c0771a.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = c0771a.getForegroundProcessor();
        WorkDatabase workDatabase = c0771a.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> listM4491f = c0771a.m4491f();
        this.tags = listM4491f;
        this.workDescription = m4471k(listM4491f);
        this.workerJob = JobKt__JobKt.m93616b(null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m4461a(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.mo135172d(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.mo135178j(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.mo135167F(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.mo135170b(workerWrapper.workSpecId, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m4462b(WorkerWrapper workerWrapper) {
        haq0 haq0Var = workerWrapper.workSpec;
        if (haq0Var.state != WorkInfo.State.ENQUEUED) {
            String str = WorkerWrapperKt.f3516a;
            txv.m190976e().mo190979a(str, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!haq0Var.m130167m() && !workerWrapper.workSpec.m130166l()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.m130157b()) {
            return Boolean.FALSE;
        }
        txv.m190976e().mo190979a(WorkerWrapperKt.f3516a, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: k */
    public final String m4471k(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.joinToString$default(tags, Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null) + " } ]";
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final k9q0 m4472l() {
        return oaq0.m163363a(this.workSpec);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final haq0 getWorkSpec() {
        return this.workSpec;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4474n(AbstractC0762b.a result) {
        if (result instanceof AbstractC0762b.a.c) {
            String str = WorkerWrapperKt.f3516a;
            txv.m190976e().mo190983f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.m130167m() ? m4480t() : m4484x(result);
        }
        if (result instanceof AbstractC0762b.a.b) {
            String str2 = WorkerWrapperKt.f3516a;
            txv.m190976e().mo190983f(str2, "Worker result RETRY for " + this.workDescription);
            return m4479s(-256);
        }
        String str3 = WorkerWrapperKt.f3516a;
        txv.m190976e().mo190983f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.m130167m()) {
            return m4480t();
        }
        if (result == null) {
            result = new AbstractC0762b.a.C22657a();
        }
        return m4483w(result);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: o */
    public final void m4475o(int stopReason) {
        this.workerJob.mo93695n(new WorkerStoppedException(stopReason));
    }

    /* JADX INFO: renamed from: p */
    public final void m4476p(String workSpecId) {
        List listMutableListOf = CollectionsKt.mutableListOf(workSpecId);
        while (!listMutableListOf.isEmpty()) {
            String str = (String) CollectionsKt.removeLast(listMutableListOf);
            if (this.workSpecDao.mo135172d(str) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.mo135178j(WorkInfo.State.FAILED, str);
            }
            listMutableListOf.addAll(this.dependencyDao.mo216001a(str));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final gnr<Boolean> m4477q() {
        return ListenableFutureKt.m4341h(this.workTaskExecutor.mo187636a().plus(JobKt__JobKt.m93616b(null, 1, null)), null, new WorkerWrapper$launch$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4478r(AbstractC0762b.a result) {
        WorkInfo.State stateMo135172d = this.workSpecDao.mo135172d(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (stateMo135172d == null) {
            return false;
        }
        if (stateMo135172d == WorkInfo.State.RUNNING) {
            return m4474n(result);
        }
        if (stateMo135172d.isFinished()) {
            return false;
        }
        return m4479s(-512);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4479s(int stopReason) {
        this.workSpecDao.mo135178j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo135179k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.mo135185q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo135193y(this.workSpecId, -1L);
        this.workSpecDao.mo135170b(this.workSpecId, stopReason);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4480t() {
        this.workSpecDao.mo135179k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.mo135178j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo135182n(this.workSpecId);
        this.workSpecDao.mo135185q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo135186r(this.workSpecId);
        this.workSpecDao.mo135193y(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4481u(int stopReason) {
        WorkInfo.State stateMo135172d = this.workSpecDao.mo135172d(this.workSpecId);
        if (stateMo135172d == null || stateMo135172d.isFinished()) {
            String str = WorkerWrapperKt.f3516a;
            txv.m190976e().mo190979a(str, "Status for " + this.workSpecId + " is " + stateMo135172d + " ; not doing any work");
            return false;
        }
        String str2 = WorkerWrapperKt.f3516a;
        txv.m190976e().mo190979a(str2, "Status for " + this.workSpecId + " is " + stateMo135172d + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.mo135178j(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo135170b(this.workSpecId, stopReason);
        this.workSpecDao.mo135193y(this.workSpecId, -1L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0218  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final Object m4482v(Continuation<? super AbstractC0772b> continuation) throws Throwable {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        Data dataMo4346a;
        WorkerParameters workerParameters;
        Throwable th;
        wz5<uaq0> wz5VarM4387p;
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
        Object objM130938g = workerWrapper$runWorker$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = workerWrapper$runWorker$1.label;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            ResultKt.m87239b(objM130938g);
            final boolean zIsEnabled = workerWrapper.configuration.getTracer().isEnabled();
            final String traceTag = workerWrapper.workSpec.getTraceTag();
            if (zIsEnabled && traceTag != null) {
                workerWrapper.configuration.getTracer().mo167489d(traceTag, workerWrapper.workSpec.hashCode());
            }
            Boolean bool = (Boolean) workerWrapper.workDatabase.runInTransaction(new Callable() { // from class: l.gbq0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.m4462b(this.f101910a);
                }
            });
            bool.getClass();
            int i4 = 0;
            if (bool.booleanValue()) {
                return new AbstractC0772b.c(i4, i3, defaultConstructorMarker);
            }
            if (workerWrapper.workSpec.m130167m()) {
                dataMo4346a = workerWrapper.workSpec.input;
            } else {
                usm usmVarM199872b = workerWrapper.configuration.getInputMergerFactory().m199872b(workerWrapper.workSpec.inputMergerClassName);
                if (usmVarM199872b == null) {
                    String str = WorkerWrapperKt.f3516a;
                    txv.m190976e().mo190981c(str, "Could not create Input Merger " + workerWrapper.workSpec.inputMergerClassName);
                    return new AbstractC0772b.a(objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                }
                dataMo4346a = usmVarM199872b.mo4346a(CollectionsKt.plus((Collection) CollectionsKt.listOf(workerWrapper.workSpec.input), (Iterable) workerWrapper.workSpecDao.mo135175g(workerWrapper.workSpecId)));
            }
            Data data = dataMo4346a;
            UUID uuidFromString = UUID.fromString(workerWrapper.workSpecId);
            List<String> list = workerWrapper.tags;
            WorkerParameters.C0760a c0760a = workerWrapper.runtimeExtras;
            haq0 haq0Var = workerWrapper.workSpec;
            workerParameters = new WorkerParameters(uuidFromString, data, list, c0760a, haq0Var.runAttemptCount, haq0Var.getGeneration(), workerWrapper.configuration.getExecutor(), workerWrapper.configuration.getWorkerCoroutineContext(), workerWrapper.workTaskExecutor, workerWrapper.configuration.getWorkerFactory(), new caq0(workerWrapper.workDatabase, workerWrapper.workTaskExecutor), new j9q0(workerWrapper.workDatabase, workerWrapper.foregroundProcessor, workerWrapper.workTaskExecutor));
            final AbstractC0762b abstractC0762bM207667b = workerWrapper.builderWorker;
            if (abstractC0762bM207667b == null) {
                try {
                    abstractC0762bM207667b = workerWrapper.configuration.getWorkerFactory().m207667b(workerWrapper.appContext, workerWrapper.workSpec.workerClassName, workerParameters);
                } catch (Throwable th2) {
                    String str2 = WorkerWrapperKt.f3516a;
                    txv.m190976e().mo190981c(str2, "Could not create Worker " + workerWrapper.workSpec.workerClassName);
                    wz5<uaq0> wz5VarM4389r = workerWrapper.configuration.m4389r();
                    if (wz5VarM4389r != null) {
                        vaq0.m197647a(wz5VarM4389r, new uaq0(workerWrapper.workSpec.workerClassName, workerParameters, th2), WorkerWrapperKt.f3516a);
                    }
                    return new AbstractC0772b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            abstractC0762bM207667b.setUsed();
            CoroutineContext.Element element = workerWrapper$runWorker$1.getContext().get(InterfaceC15486o.INSTANCE);
            element.getClass();
            InterfaceC15486o interfaceC15486o = (InterfaceC15486o) element;
            interfaceC15486o.mo93701u(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapper$runWorker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th3) {
                    if (th3 instanceof WorkerStoppedException) {
                        abstractC0762bM207667b.stop(((WorkerStoppedException) th3).getReason());
                    }
                    if (!zIsEnabled || traceTag == null) {
                        return;
                    }
                    workerWrapper.configuration.getTracer().mo167488c(traceTag, workerWrapper.getWorkSpec().hashCode());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                    invoke2(th3);
                    return Unit.INSTANCE;
                }
            });
            if (!workerWrapper.m4485y()) {
                return new AbstractC0772b.c(0, 1, null);
            }
            int i5 = 0;
            int i6 = 1;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if (interfaceC15486o.isCancelled()) {
                return new AbstractC0772b.c(i5, i6, defaultConstructorMarker2);
            }
            pyi pyiVarM4360b = workerParameters.m4360b();
            pyiVarM4360b.getClass();
            Executor executorMo187637c = workerWrapper.workTaskExecutor.mo187637c();
            executorMo187637c.getClass();
            CoroutineDispatcher coroutineDispatcherM217297b = z5f.m217297b(executorMo187637c);
            try {
                WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(workerWrapper, abstractC0762bM207667b, pyiVarM4360b, null);
                workerWrapper$runWorker$1.L$0 = workerWrapper;
                workerWrapper$runWorker$1.L$1 = workerParameters;
                workerWrapper$runWorker$1.label = 1;
                objM130938g = hh3.m130938g(coroutineDispatcherM217297b, workerWrapper$runWorker$result$1, workerWrapper$runWorker$1);
                if (objM130938g == objM196133e) {
                    return objM196133e;
                }
            } catch (CancellationException e2) {
                e = e2;
                String str3 = WorkerWrapperKt.f3516a;
                txv.m190976e().mo190984g(str3, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                String str4 = WorkerWrapperKt.f3516a;
                txv.m190976e().mo190982d(str4, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                wz5VarM4387p = workerWrapper.configuration.m4387p();
                if (wz5VarM4387p != null) {
                    vaq0.m197647a(wz5VarM4387p, new uaq0(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.f3516a);
                }
                return new AbstractC0772b.a(null, 1, 0 == true ? 1 : 0);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WorkerParameters workerParameters2 = (WorkerParameters) workerWrapper$runWorker$1.L$1;
            WorkerWrapper workerWrapper2 = (WorkerWrapper) workerWrapper$runWorker$1.L$0;
            try {
                ResultKt.m87239b(objM130938g);
                workerParameters = workerParameters2;
                workerWrapper = workerWrapper2;
            } catch (CancellationException e3) {
                e = e3;
                workerWrapper = workerWrapper2;
                String str5 = WorkerWrapperKt.f3516a;
                txv.m190976e().mo190984g(str5, workerWrapper.workDescription + " was cancelled", e);
                throw e;
            } catch (Throwable th4) {
                th = th4;
                workerParameters = workerParameters2;
                workerWrapper = workerWrapper2;
                String str6 = WorkerWrapperKt.f3516a;
                txv.m190976e().mo190982d(str6, workerWrapper.workDescription + " failed because it threw an exception/error", th);
                wz5VarM4387p = workerWrapper.configuration.m4387p();
                if (wz5VarM4387p != null) {
                    vaq0.m197647a(wz5VarM4387p, new uaq0(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.f3516a);
                }
                return new AbstractC0772b.a(null, 1, 0 == true ? 1 : 0);
            }
        }
        AbstractC0762b.a aVar = (AbstractC0762b.a) objM130938g;
        aVar.getClass();
        return new AbstractC0772b.b(aVar);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public final boolean m4483w(@NotNull AbstractC0762b.a result) {
        result.getClass();
        m4476p(this.workSpecId);
        Data dataM4417e = ((AbstractC0762b.a.C22657a) result).m4417e();
        dataM4417e.getClass();
        this.workSpecDao.mo135185q(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo135164C(this.workSpecId, dataM4417e);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4484x(AbstractC0762b.a result) {
        this.workSpecDao.mo135178j(WorkInfo.State.SUCCEEDED, this.workSpecId);
        result.getClass();
        Data dataM4418e = ((AbstractC0762b.a.c) result).m4418e();
        dataM4418e.getClass();
        this.workSpecDao.mo135164C(this.workSpecId, dataM4418e);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.mo216001a(this.workSpecId)) {
            if (this.workSpecDao.mo135172d(str) == WorkInfo.State.BLOCKED && this.dependencyDao.mo216002b(str)) {
                String str2 = WorkerWrapperKt.f3516a;
                txv.m190976e().mo190983f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.mo135178j(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.mo135179k(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4485y() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.hbq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.m4461a(this.f106957a);
            }
        });
        objRunInTransaction.getClass();
        return ((Boolean) objRunInTransaction).booleanValue();
    }
}
