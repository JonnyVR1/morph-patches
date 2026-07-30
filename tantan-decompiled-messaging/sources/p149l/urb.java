package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.molive.apm.cpu.CpuCore;
import com.immomo.molive.apm.cpu.CpuPolicy;
import com.immomo.molive.apm.cpu.ProcessPseudo;
import com.immomo.molive.apm.cpu.SystemPseudo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020+0\u001f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0014¢\u0006\u0004\b.\u0010\u0003R \u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0014\u00108\u001a\u0002068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u00107R\u001a\u0010<\u001a\u0002008\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m87232d2 = {"Ll/urb;", "", "<init>", "()V", "Ljava/io/File;", "targetFile", "", "", "f", "(Ljava/io/File;)Ljava/util/List;", "e", "", "k", "(Ljava/io/File;)J", "Ll/srb;", "b", "(Ll/srb;)J", "a", "Ll/dc90;", "procStatSummary", "", "c", "(Ljava/io/File;Ll/dc90;)V", "Ll/lgh0;", "sysStatSummary", Constants.INAPP_DATA_TAG, "(Ljava/io/File;Ll/lgh0;)V", "Lcom/immomo/molive/apm/cpu/ProcessPseudo;", "processPseudo", "g", "(Lcom/immomo/molive/apm/cpu/ProcessPseudo;)J", "", "Lcom/immomo/molive/apm/cpu/CpuCore;", "allCpu", "intervalMills", "Ll/zrb;", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/Collection;J)Ll/zrb;", "Lcom/immomo/molive/apm/cpu/SystemPseudo;", "sysPseudo", "Lkotlin/Pair;", "h", "(Lcom/immomo/molive/apm/cpu/SystemPseudo;)Lkotlin/Pair;", "Lcom/immomo/molive/apm/cpu/CpuPolicy;", "j", "(Ljava/util/Collection;)Ll/zrb;", BLiveStormDanmakuGiftResourceType.f44444l, "", "", "Ljava/util/Map;", "lastProcCpuTime", "lastCpuIdleTimes", "lastCpuRunningTimes", "lastCpuRunningPolicyTimes", "", "Z", "idelEnabled", "I", "getDEFAULT_KEY", "()I", "DEFAULT_KEY", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class urb {
    public static final urb INSTANCE = new urb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Map<Integer, Long> lastProcCpuTime = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Map<Integer, Long> lastCpuIdleTimes = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Map<Integer, Long> lastCpuRunningTimes = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Map<String, Long> lastCpuRunningPolicyTimes = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final boolean idelEnabled = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int DEFAULT_KEY = -1;

    private urb() {
    }

    /* JADX INFO: renamed from: a */
    public final long m195060a(@NotNull File targetFile) {
        targetFile.getClass();
        if (!targetFile.exists()) {
            return 0L;
        }
        try {
            String strM218807j = zhi.m218807j(targetFile, null, 1, null);
            if (strM218807j != null) {
                return Long.parseLong(StringsKt.m93433Z0(strM218807j).toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m195061b(@NotNull srb targetFile) {
        targetFile.getClass();
        if (targetFile.getFile() == null || !targetFile.getFile().exists()) {
            return 0L;
        }
        try {
            String strM218807j = zhi.m218807j(targetFile.getFile(), null, 1, null);
            if (strM218807j != null) {
                return Long.parseLong(StringsKt.m93433Z0(strM218807j).toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception unused) {
            targetFile.m185641c(false);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m195062c(@NotNull File targetFile, @NotNull dc90 procStatSummary) {
        targetFile.getClass();
        procStatSummary.getClass();
        if (!targetFile.exists()) {
            procStatSummary.f85386l = false;
            return;
        }
        List<String> listM195065f = m195065f(targetFile);
        if (listM195065f.size() > 22) {
            procStatSummary.f85382h = listM195065f.get(0);
            if (!TextUtils.isEmpty(listM195065f.get(1)) && C15386d.m93489w(listM195065f.get(1), ")", false, 2, null)) {
                String str = listM195065f.get(1);
                int length = listM195065f.get(1).length() - 1;
                if (str == null) {
                    ox50.m166495a("null cannot be cast to non-null type java.lang.String");
                    return;
                }
                procStatSummary.f85383i = str.substring(1, length);
            }
            procStatSummary.f85384j = listM195065f.get(2);
            procStatSummary.f85376b = Long.parseLong(listM195065f.get(13));
            procStatSummary.f85377c = Long.parseLong(listM195065f.get(14));
            procStatSummary.f85378d = Long.parseLong(listM195065f.get(15));
            procStatSummary.f85379e = Long.parseLong(listM195065f.get(16));
            procStatSummary.f85385k = listM195065f.get(18);
            procStatSummary.f85380f = Integer.parseInt(listM195065f.get(19));
            procStatSummary.f85381g = Long.parseLong(listM195065f.get(22));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m195063d(@NotNull File targetFile, @NotNull lgh0 sysStatSummary) {
        targetFile.getClass();
        sysStatSummary.getClass();
        if (!targetFile.exists()) {
            sysStatSummary.f127993h = false;
            return;
        }
        List<String> listM195064e = m195064e(targetFile);
        if (listM195064e.size() > 10) {
            sysStatSummary.f127986a = Long.parseLong(listM195064e.get(1));
            sysStatSummary.f127987b = Long.parseLong(listM195064e.get(2));
            sysStatSummary.f127988c = Long.parseLong(listM195064e.get(3));
            sysStatSummary.f127989d = Long.parseLong(listM195064e.get(4));
            sysStatSummary.f127990e = Long.parseLong(listM195064e.get(5));
            sysStatSummary.f127991f = Long.parseLong(listM195064e.get(6));
            sysStatSummary.f127992g = Long.parseLong(listM195064e.get(7));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<String> m195064e(@NotNull File targetFile) {
        targetFile.getClass();
        if (targetFile.exists()) {
            try {
                String str = (String) CollectionsKt.take(zhi.m218804g(targetFile, null, 1, null), 0).get(0);
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                StringsKt.split$default(StringsKt.m93433Z0(str).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m195065f(@NotNull File targetFile) {
        targetFile.getClass();
        if (!targetFile.exists()) {
            return CollectionsKt.emptyList();
        }
        String strM218807j = zhi.m218807j(targetFile, null, 1, null);
        if (strM218807j != null) {
            return StringsKt.split$default(StringsKt.m93433Z0(strM218807j).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
        }
        ox50.m166495a("null cannot be cast to non-null type kotlin.CharSequence");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final long m195066g(@NotNull ProcessPseudo processPseudo) {
        processPseudo.getClass();
        Map<Integer, Long> map = lastProcCpuTime;
        Long l2 = map.get(Integer.valueOf(processPseudo.getProcessPid()));
        if (l2 == null) {
            map.put(Integer.valueOf(processPseudo.getProcessPid()), Long.valueOf(processPseudo.m18553f().m110673b()));
            return 0L;
        }
        long jM110673b = processPseudo.m18553f().m110673b();
        long jLongValue = jM110673b - l2.longValue();
        map.put(Integer.valueOf(processPseudo.getProcessPid()), Long.valueOf(jM110673b));
        return jLongValue;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Pair<zrb, zrb> m195067h(@NotNull SystemPseudo sysPseudo) {
        sysPseudo.getClass();
        lgh0 lgh0VarM18558e = sysPseudo.m18558e();
        if (!lgh0VarM18558e.f127993h) {
            return new Pair<>(new zrb(0L, false), new zrb(0L, false));
        }
        long jM149779a = lgh0VarM18558e.m149779a();
        long jM149779a2 = lgh0VarM18558e.m149779a();
        Map<Integer, Long> map = lastCpuIdleTimes;
        int i = DEFAULT_KEY;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Long.valueOf(jM149779a));
            lastCpuRunningTimes.put(Integer.valueOf(i), Long.valueOf(jM149779a2));
            return new Pair<>(new zrb(0L, false, 2, null), new zrb(0L, false, 2, null));
        }
        Long l2 = map.get(Integer.valueOf(i));
        long jLongValue = l2 != null ? l2.longValue() : jM149779a;
        map.put(Integer.valueOf(i), Long.valueOf(jM149779a));
        Map<Integer, Long> map2 = lastCpuRunningTimes;
        Long l3 = map2.get(Integer.valueOf(i));
        long jLongValue2 = l3 != null ? l3.longValue() : jM149779a2;
        map2.put(Integer.valueOf(i), Long.valueOf(jM149779a2));
        return new Pair<>(new zrb(jM149779a - jLongValue, false, 2, null), new zrb(jM149779a2 - jLongValue2, false, 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final zrb m195068i(@NotNull Collection<CpuCore> allCpu, long intervalMills) {
        allCpu.getClass();
        long j = intervalMills * 1000;
        boolean z = false;
        long j2 = 0;
        for (CpuCore cpuCore : allCpu) {
            zrb zrbVarM18514i = cpuCore.m18514i();
            if (zrbVarM18514i.getEnable()) {
                Map<Integer, Long> map = lastCpuIdleTimes;
                Long l2 = map.get(Integer.valueOf(cpuCore.getCpuIndex()));
                map.put(Integer.valueOf(cpuCore.getCpuIndex()), Long.valueOf(zrbVarM18514i.getTime()));
                z = true;
                if (l2 != null) {
                    long time = zrbVarM18514i.getTime() - l2.longValue();
                    if (time != 0 ? time > j : cpuCore.m18515j() != cpuCore.m18513h()) {
                        time = j;
                    }
                    j2 += time;
                }
            }
        }
        return new zrb(j2 / 1000, z);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final zrb m195069j(@NotNull Collection<CpuPolicy> allCpu) {
        allCpu.getClass();
        boolean z = false;
        long j = 0;
        for (CpuPolicy cpuPolicy : allCpu) {
            if (cpuPolicy.getEnable()) {
                long jM18532h = cpuPolicy.m18532h();
                if (jM18532h < 0) {
                    cpuPolicy.m18535l(false);
                } else {
                    Map<String, Long> map = lastCpuRunningPolicyTimes;
                    Long l2 = map.get(cpuPolicy.m18531g());
                    map.put(cpuPolicy.m18531g(), Long.valueOf(jM18532h));
                    if (l2 != null) {
                        long jLongValue = jM18532h - l2.longValue();
                        if (jLongValue >= 0) {
                            j += jLongValue;
                        }
                    }
                }
                z = true;
            }
        }
        return new zrb(j, z);
    }

    /* JADX INFO: renamed from: k */
    public final long m195070k(@NotNull File targetFile) {
        targetFile.getClass();
        long j = 0;
        if (targetFile.exists()) {
            try {
                for (String str : zhi.m218804g(targetFile, null, 1, null)) {
                    if (str == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    List listSplit$default = StringsKt.split$default(StringsKt.m93433Z0(str).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
                    if (listSplit$default.size() > 1) {
                        j += Long.parseLong((String) listSplit$default.get(1));
                    }
                }
            } catch (Exception unused) {
                return -1L;
            }
        }
        return j * 10;
    }

    /* JADX INFO: renamed from: l */
    public final void m195071l() {
        lastProcCpuTime.clear();
        lastCpuIdleTimes.clear();
        lastCpuRunningTimes.clear();
        lastCpuRunningPolicyTimes.clear();
    }
}
