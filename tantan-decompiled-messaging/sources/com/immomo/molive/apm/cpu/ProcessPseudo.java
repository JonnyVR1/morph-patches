package com.immomo.molive.apm.cpu;

import android.os.Process;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.dc90;
import p149l.urb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0013\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Lcom/immomo/molive/apm/cpu/ProcessPseudo;", "", "", "processPid", "<init>", "(I)V", "Ll/dc90;", "f", "()Ll/dc90;", "", "a", "Lkotlin/Lazy;", "b", "()Ljava/lang/String;", "mBasePath", "Ljava/io/File;", "getMTimeInStateFile", "()Ljava/io/File;", "mTimeInStateFile", "c", "mStateFile", Constants.INAPP_DATA_TAG, "getMCpuSetFile", "mCpuSetFile", "e", "getMSchedFile", "mSchedFile", "procStatSummary", "g", "I", "()I", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class ProcessPseudo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mBasePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mTimeInStateFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy mStateFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy mCpuSetFile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy mSchedFile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy procStatSummary;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int processPid;

    public ProcessPseudo(int i) {
        this.processPid = i;
        this.mBasePath = LazyKt__LazyJVMKt.m87229b(new Function0<String>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$mBasePath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "/proc/" + this.this$0.getProcessPid();
            }
        });
        this.mTimeInStateFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$mTimeInStateFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.m18549b(), "time_in_state");
            }
        });
        this.mStateFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$mStateFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.m18549b(), "stat");
            }
        });
        this.mCpuSetFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$mCpuSetFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.m18549b(), "cpuset");
            }
        });
        this.mSchedFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$mSchedFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.m18549b(), "sched");
            }
        });
        this.procStatSummary = LazyKt__LazyJVMKt.m87229b(new Function0<dc90>() { // from class: com.immomo.molive.apm.cpu.ProcessPseudo$procStatSummary$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final dc90 invoke() {
                return new dc90();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final String m18549b() {
        return (String) this.mBasePath.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final File m18550c() {
        return (File) this.mStateFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final dc90 m18551d() {
        return (dc90) this.procStatSummary.getValue();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getProcessPid() {
        return this.processPid;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final dc90 m18553f() {
        urb.INSTANCE.m195062c(m18550c(), m18551d());
        return m18551d();
    }

    public ProcessPseudo() {
        this(0, 1, null);
    }

    public /* synthetic */ ProcessPseudo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Process.myPid() : i);
    }
}
