package com.immomo.molive.apm.cpu;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import p153l.itb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0013\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/immomo/molive/apm/cpu/CpuFreq;", "", "", "cpuIndex", "<init>", "(I)V", "", "h", "()J", "Ljava/io/File;", "a", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ljava/io/File;", "cpuFreqFileRoot", "b", "c", "cpuFreqCurrentFile", "e", "cpuFreqMaxFile", "g", "maxCpuFreq", "I", "f", "()I", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class CpuFreq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy cpuFreqFileRoot = LazyKt__LazyJVMKt.m88118b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuFreq$cpuFreqFileRoot$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new File(String.format("/sys/devices/system/cpu/cpu%d/cpufreq", Arrays.copyOf(new Object[]{Integer.valueOf(this.this$0.getCpuIndex())}, 1)));
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy cpuFreqCurrentFile = LazyKt__LazyJVMKt.m88118b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuFreq$cpuFreqCurrentFile$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(this.this$0.m19499d(), "scaling_cur_freq");
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy cpuFreqMaxFile = LazyKt__LazyJVMKt.m88118b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuFreq$cpuFreqMaxFile$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(this.this$0.m19499d(), "cpuinfo_max_freq");
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxCpuFreq = LazyKt__LazyJVMKt.m88118b(new Function0<Long>() { // from class: com.immomo.molive.apm.cpu.CpuFreq$maxCpuFreq$2
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final long invoke2() {
            return itb.INSTANCE.m142021a(this.this$0.m19500e());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int cpuIndex;

    public CpuFreq(int i) {
        this.cpuIndex = i;
    }

    /* JADX INFO: renamed from: c */
    private final File m19498c() {
        return (File) this.cpuFreqCurrentFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final File m19499d() {
        return (File) this.cpuFreqFileRoot.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final File m19500e() {
        return (File) this.cpuFreqMaxFile.getValue();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCpuIndex() {
        return this.cpuIndex;
    }

    /* JADX INFO: renamed from: g */
    public final long m19502g() {
        return ((Number) this.maxCpuFreq.getValue()).longValue();
    }

    /* JADX INFO: renamed from: h */
    public final long m19503h() {
        return itb.INSTANCE.m142021a(m19498c());
    }
}
