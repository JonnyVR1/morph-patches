package com.immomo.molive.apm.cpu;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.prb;
import p149l.srb;
import p149l.urb;
import p149l.zrb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001c\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0017\u0010\u001bR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010\u0012¨\u0006'"}, m87232d2 = {"Lcom/immomo/molive/apm/cpu/CpuCore;", "", "", "cpuIndex", "Ljava/io/File;", "policyTimeFile", "<init>", "(ILjava/io/File;)V", "Ll/zrb;", RXScreenCaptureService.KEY_INDEX, "()Ll/zrb;", "", "h", "()J", "j", "a", "Lkotlin/Lazy;", "e", "()Ljava/io/File;", "cpuIdleFileRoot", "b", Constants.INAPP_DATA_TAG, "cpuFreqRootFile", "c", "getCpuTimeInStateFile", "cpuTimeInStateFile", "Lcom/immomo/molive/apm/cpu/CpuFreq;", "()Lcom/immomo/molive/apm/cpu/CpuFreq;", "cpuFreq", "", "Ll/srb;", "f", "()Ljava/util/List;", "cpuIdleTimeFiles", "I", "g", "()I", "Ljava/io/File;", "getPolicyTimeFile", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class CpuCore {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy cpuIdleFileRoot = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuCore$cpuIdleFileRoot$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new File(String.format("/sys/devices/system/cpu/cpu%d/cpuidle", Arrays.copyOf(new Object[]{Integer.valueOf(this.this$0.getCpuIndex())}, 1)));
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy cpuFreqRootFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuCore$cpuFreqRootFile$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy cpuTimeInStateFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuCore$cpuTimeInStateFile$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(this.this$0.m18509d(), "stats/time_in_state");
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy cpuFreq = LazyKt__LazyJVMKt.m87229b(new Function0<CpuFreq>() { // from class: com.immomo.molive.apm.cpu.CpuCore$cpuFreq$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CpuFreq invoke() {
            return new CpuFreq(this.this$0.getCpuIndex());
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy cpuIdleTimeFiles = LazyKt__LazyJVMKt.m87229b(new Function0<List<srb>>() { // from class: com.immomo.molive.apm.cpu.CpuCore$cpuIdleTimeFiles$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<srb> invoke() {
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = this.this$0.m18510e().listFiles(new prb("state[0-9]"));
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    arrayList.add(new srb(new File(file, "time"), false, 2, null));
                }
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int cpuIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final File policyTimeFile;

    public CpuCore(int i, @Nullable File file) {
        this.cpuIndex = i;
        this.policyTimeFile = file;
    }

    /* JADX INFO: renamed from: c */
    private final CpuFreq m18508c() {
        return (CpuFreq) this.cpuFreq.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final File m18509d() {
        return (File) this.cpuFreqRootFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final File m18510e() {
        return (File) this.cpuIdleFileRoot.getValue();
    }

    /* JADX INFO: renamed from: f */
    private final List<srb> m18511f() {
        return (List) this.cpuIdleTimeFiles.getValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCpuIndex() {
        return this.cpuIndex;
    }

    /* JADX INFO: renamed from: h */
    public final long m18513h() {
        return m18508c().m18523h();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final zrb m18514i() {
        long jM195061b = 0;
        boolean z = false;
        for (srb srbVar : m18511f()) {
            if (srbVar.getEnable()) {
                jM195061b += urb.INSTANCE.m195061b(srbVar);
                z = true;
            }
        }
        return new zrb(jM195061b, z);
    }

    /* JADX INFO: renamed from: j */
    public final long m18515j() {
        return m18508c().m18522g();
    }
}
