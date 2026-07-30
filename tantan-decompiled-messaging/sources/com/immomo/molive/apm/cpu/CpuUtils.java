package com.immomo.molive.apm.cpu;

import android.system.Os;
import android.system.OsConstants;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.prb;
import p149l.urb;
import p149l.zrb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b#\u0010'R\u001b\u0010)\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001e\u0010\u000fR\u001b\u0010+\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b*\u0010\u000f¨\u0006,"}, m87232d2 = {"Lcom/immomo/molive/apm/cpu/CpuUtils;", "", "<init>", "()V", "", "intervalMills", "Ll/zrb;", "f", "(J)Ll/zrb;", "h", "()Ll/zrb;", "Lkotlin/Pair;", "e", "()Lkotlin/Pair;", RXScreenCaptureService.KEY_INDEX, "()J", "", "Lcom/immomo/molive/apm/cpu/CpuPolicy;", "a", "Lkotlin/Lazy;", "g", "()Ljava/util/List;", "cpuPolicyList", "", "", "Lcom/immomo/molive/apm/cpu/CpuCore;", "b", "()Ljava/util/Map;", "allCpuCores", "Lcom/immomo/molive/apm/cpu/ProcessPseudo;", "c", "k", "()Lcom/immomo/molive/apm/cpu/ProcessPseudo;", "processPseudo", "Lcom/immomo/molive/apm/cpu/SystemPseudo;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/immomo/molive/apm/cpu/SystemPseudo;", "sysPseudo", "()I", "cpuCoreNum", "clockTicksPerSeconds", "j", "millSecondsPerTicks", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class CpuUtils {
    public static final CpuUtils INSTANCE = new CpuUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy cpuPolicyList = LazyKt__LazyJVMKt.m87229b(new Function0<List<CpuPolicy>>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$cpuPolicyList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<CpuPolicy> invoke() {
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new prb("policy[0-9]"));
            if (fileArrListFiles != null) {
                Arrays.sort(fileArrListFiles);
                for (File file : fileArrListFiles) {
                    file.getClass();
                    arrayList.add(new CpuPolicy(file));
                }
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Lazy allCpuCores = LazyKt__LazyJVMKt.m87229b(new Function0<Map<Integer, CpuCore>>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$allCpuCores$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Integer, CpuCore> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = CpuUtils.INSTANCE.m18544g().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((CpuPolicy) it.next()).m18530f());
            }
            return linkedHashMap;
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Lazy processPseudo = LazyKt__LazyJVMKt.m87229b(new Function0<ProcessPseudo>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$processPseudo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ProcessPseudo invoke() {
            return new ProcessPseudo(0, 1, null);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Lazy sysPseudo = LazyKt__LazyJVMKt.m87229b(new Function0<SystemPseudo>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$sysPseudo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SystemPseudo invoke() {
            return new SystemPseudo();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy cpuCoreNum = LazyKt__LazyJVMKt.m87229b(new Function0<Integer>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$cpuCoreNum$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return CpuUtils.INSTANCE.m18537b().size();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy clockTicksPerSeconds = LazyKt__LazyJVMKt.m87229b(new Function0<Long>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$clockTicksPerSeconds$2
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final long invoke2() {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy millSecondsPerTicks = LazyKt__LazyJVMKt.m87229b(new Function0<Long>() { // from class: com.immomo.molive.apm.cpu.CpuUtils$millSecondsPerTicks$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final long invoke2() {
            return 1000 / CpuUtils.INSTANCE.m18540c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(invoke2());
        }
    });

    private CpuUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final Map<Integer, CpuCore> m18537b() {
        return (Map) allCpuCores.getValue();
    }

    /* JADX INFO: renamed from: k */
    private final ProcessPseudo m18538k() {
        return (ProcessPseudo) processPseudo.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final SystemPseudo m18539l() {
        return (SystemPseudo) sysPseudo.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final long m18540c() {
        return ((Number) clockTicksPerSeconds.getValue()).longValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m18541d() {
        return ((Number) cpuCoreNum.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Pair<zrb, zrb> m18542e() {
        return urb.INSTANCE.m195067h(m18539l());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final zrb m18543f(long intervalMills) {
        return urb.INSTANCE.m195068i(m18537b().values(), intervalMills);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<CpuPolicy> m18544g() {
        return (List) cpuPolicyList.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final zrb m18545h() {
        return urb.INSTANCE.m195069j(m18544g());
    }

    /* JADX INFO: renamed from: i */
    public final long m18546i() {
        return urb.INSTANCE.m195066g(m18538k());
    }

    /* JADX INFO: renamed from: j */
    public final long m18547j() {
        return ((Number) millSecondsPerTicks.getValue()).longValue();
    }
}
