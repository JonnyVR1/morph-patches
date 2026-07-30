package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.b16;
import p153l.ckq0;
import p153l.dph0;
import p153l.f7f;
import p153l.ft40;
import p153l.r5e;
import p153l.sa5;
import p153l.tej0;
import p153l.ttd;
import p153l.vqd0;
import p153l.xum;
import p153l.xw5;
import p153l.zjq0;
import p153l.zrd;

/* JADX INFO: renamed from: androidx.work.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 S2\u00020\u0001:\u0003\u0007\r\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001a\u0010.R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u001f\u00106\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010.R\u001f\u00108\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b7\u0010.R\u0019\u0010<\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b\u0012\u0010;R\u0017\u0010@\u001a\u00020=8G¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b4\u0010?R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b0\u0010?R\u0017\u0010C\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b%\u0010?R\u0017\u0010D\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b\r\u0010?R\u0017\u0010E\u001a\u00020=8G¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b,\u0010?R\u0017\u0010H\u001a\u00020F8G¢\u0006\f\n\u0004\b5\u0010G\u001a\u0004\bH\u0010IR \u0010M\u001a\u00020F8GX\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010G\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010IR\u0017\u0010R\u001a\u00020N8G¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bA\u0010Q¨\u0006T"}, m88121d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", Constants.INAPP_DATA_TAG, "()Ljava/util/concurrent/Executor;", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "c", "m", "taskExecutor", "Ll/sa5;", "Ll/sa5;", "()Ll/sa5;", "clock", "Ll/ckq0;", "e", "Ll/ckq0;", "q", "()Ll/ckq0;", "workerFactory", "Ll/xum;", "f", "Ll/xum;", "()Ll/xum;", "inputMergerFactory", "Ll/vqd0;", "g", "Ll/vqd0;", "k", "()Ll/vqd0;", "runnableScheduler", "Ll/b16;", "", "h", "Ll/b16;", "()Ll/b16;", "initializationExceptionHandler", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f45292l, "schedulingExceptionHandler", "Ll/zjq0;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "I", "()I", "minimumLoggingLevel", "n", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "", "Z", "isUsingDefaultTaskExecutor", "()Z", BLiveStormDanmakuGiftResourceType.f45294s, "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Ll/tej0;", Constants.KEY_T, "Ll/tej0;", "()Ll/tej0;", "tracer", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C0763a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext workerCoroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor taskExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final sa5 clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ckq0 workerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final xum inputMergerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final vqd0 runnableScheduler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final b16<Throwable> initializationExceptionHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final b16<Throwable> schedulingExceptionHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final b16<zjq0> workerInitializationExceptionHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final b16<zjq0> workerExecutionExceptionHandler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String defaultProcessName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int minimumLoggingLevel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int minJobSchedulerId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int maxJobSchedulerId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int contentUriTriggerWorkersLimit;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int maxSchedulerLimit;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final boolean isUsingDefaultTaskExecutor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean isMarkingJobsAsImportantWhileForeground;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final tej0 tracer;

    /* JADX INFO: renamed from: androidx.work.a$a */
    @Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR$\u0010/\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u000f\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010>\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b*\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R*\u0010G\u001a\n\u0012\u0004\u0012\u00020C\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R*\u0010K\u001a\n\u0012\u0004\u0012\u00020C\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010:\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010=R$\u0010R\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\b\u001f\u0010O\"\u0004\bP\u0010QR\"\u0010X\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010T\u001a\u0004\b9\u0010U\"\u0004\bV\u0010WR\"\u0010Z\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010T\u001a\u0004\bM\u0010U\"\u0004\bY\u0010WR\"\u0010\\\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010T\u001a\u0004\bD\u0010U\"\u0004\b[\u0010WR\"\u0010_\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010T\u001a\u0004\bH\u0010U\"\u0004\b^\u0010WR\"\u0010a\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010T\u001a\u0004\b\u0017\u0010U\"\u0004\b`\u0010WR\"\u0010g\u001a\u00020b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010c\u001a\u0004\b?\u0010d\"\u0004\be\u0010fR$\u0010m\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010i\u001a\u0004\b]\u0010j\"\u0004\bk\u0010l¨\u0006n"}, m88121d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "q", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerContext", "Ll/ckq0;", "c", "Ll/ckq0;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/ckq0;", "setWorkerFactory$work_runtime_release", "(Ll/ckq0;)V", "workerFactory", "Ll/xum;", Constants.INAPP_DATA_TAG, "Ll/xum;", "g", "()Ll/xum;", "setInputMergerFactory$work_runtime_release", "(Ll/xum;)V", "inputMergerFactory", "o", "setTaskExecutor$work_runtime_release", "taskExecutor", "Ll/sa5;", "f", "Ll/sa5;", "()Ll/sa5;", "setClock$work_runtime_release", "(Ll/sa5;)V", "clock", "Ll/vqd0;", "Ll/vqd0;", "m", "()Ll/vqd0;", "setRunnableScheduler$work_runtime_release", "(Ll/vqd0;)V", "runnableScheduler", "Ll/b16;", "", "h", "Ll/b16;", "()Ll/b16;", "setInitializationExceptionHandler$work_runtime_release", "(Ll/b16;)V", "initializationExceptionHandler", RXScreenCaptureService.KEY_INDEX, "n", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Ll/zjq0;", "j", Constants.KEY_T, "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "r", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "loggingLevel", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "p", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Ll/tej0;", "Ll/tej0;", "()Ll/tej0;", "setTracer$work_runtime_release", "(Ll/tej0;)V", "tracer", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Executor executor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext workerContext;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public ckq0 workerFactory;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public xum inputMergerFactory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public Executor taskExecutor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public sa5 clock;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public vqd0 runnableScheduler;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public b16<Throwable> initializationExceptionHandler;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public b16<Throwable> schedulingExceptionHandler;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public b16<zjq0> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public b16<zjq0> workerExecutionExceptionHandler;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public String defaultProcessName;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public int minJobSchedulerId;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public tej0 tracer;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int loggingLevel = 4;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public int maxJobSchedulerId = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public int maxSchedulerLimit = 20;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public int contentUriTriggerWorkersLimit = 8;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public boolean markJobsAsImportantWhileForeground = true;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0763a m4393a() {
            return new C0763a(this);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final sa5 getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final b16<Throwable> m4398f() {
            return this.initializationExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final xum getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final vqd0 getRunnableScheduler() {
            return this.runnableScheduler;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final b16<Throwable> m4406n() {
            return this.schedulingExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final tej0 getTracer() {
            return this.tracer;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public final b16<zjq0> m4410r() {
            return this.workerExecutionExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final ckq0 getWorkerFactory() {
            return this.workerFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: t */
        public final b16<zjq0> m4412t() {
            return this.workerInitializationExceptionHandler;
        }
    }

    /* JADX INFO: renamed from: androidx.work.a$c */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m88121d2 = {"Landroidx/work/a$c;", "", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface c {
        @NotNull
        /* JADX INFO: renamed from: a */
        C0763a m4413a();
    }

    public C0763a(@NotNull a aVar) {
        aVar.getClass();
        CoroutineContext workerContext = aVar.getWorkerContext();
        Executor executor = aVar.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? xw5.m213290d(workerContext) : null;
            if (executor == null) {
                executor = xw5.m213291e(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = aVar.getExecutor() != null ? f7f.m124439b(executor) : r5e.m179860a();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = aVar.getTaskExecutor() == null;
        Executor taskExecutor = aVar.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? xw5.m213291e(true) : taskExecutor;
        sa5 clock = aVar.getClock();
        this.clock = clock == null ? new dph0() : clock;
        ckq0 workerFactory = aVar.getWorkerFactory();
        this.workerFactory = workerFactory == null ? ttd.INSTANCE : workerFactory;
        xum inputMergerFactory = aVar.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? ft40.INSTANCE : inputMergerFactory;
        vqd0 runnableScheduler = aVar.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new zrd() : runnableScheduler;
        this.minimumLoggingLevel = aVar.getLoggingLevel();
        this.minJobSchedulerId = aVar.getMinJobSchedulerId();
        this.maxJobSchedulerId = aVar.getMaxJobSchedulerId();
        this.maxSchedulerLimit = aVar.getMaxSchedulerLimit();
        this.initializationExceptionHandler = aVar.m4398f();
        this.schedulingExceptionHandler = aVar.m4406n();
        this.workerInitializationExceptionHandler = aVar.m4412t();
        this.workerExecutionExceptionHandler = aVar.m4410r();
        this.defaultProcessName = aVar.getDefaultProcessName();
        this.contentUriTriggerWorkersLimit = aVar.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = aVar.getMarkJobsAsImportantWhileForeground();
        tej0 tracer = aVar.getTracer();
        this.tracer = tracer == null ? xw5.m213292f() : tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final sa5 getClock() {
        return this.clock;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final b16<Throwable> m4378e() {
        return this.initializationExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final xum getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final vqd0 getRunnableScheduler() {
        return this.runnableScheduler;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final b16<Throwable> m4385l() {
        return this.schedulingExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final tej0 getTracer() {
        return this.tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final b16<zjq0> m4389p() {
        return this.workerExecutionExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final ckq0 getWorkerFactory() {
        return this.workerFactory;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final b16<zjq0> m4391r() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
