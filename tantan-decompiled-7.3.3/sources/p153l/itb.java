package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.molive.apm.cpu.CpuCore;
import com.immomo.molive.apm.cpu.CpuPolicy;
import com.immomo.molive.apm.cpu.ProcessPseudo;
import com.immomo.molive.apm.cpu.SystemPseudo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020+0\u001f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0014¢\u0006\u0004\b.\u0010\u0003R \u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0014\u00108\u001a\u0002068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u00107R\u001a\u0010<\u001a\u0002008\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m88121d2 = {"Ll/itb;", "", "<init>", "()V", "Ljava/io/File;", "targetFile", "", "", "f", "(Ljava/io/File;)Ljava/util/List;", "e", "", "k", "(Ljava/io/File;)J", "Ll/gtb;", "b", "(Ll/gtb;)J", "a", "Ll/hk90;", "procStatSummary", "", "c", "(Ljava/io/File;Ll/hk90;)V", "Ll/soh0;", "sysStatSummary", Constants.INAPP_DATA_TAG, "(Ljava/io/File;Ll/soh0;)V", "Lcom/immomo/molive/apm/cpu/ProcessPseudo;", "processPseudo", "g", "(Lcom/immomo/molive/apm/cpu/ProcessPseudo;)J", "", "Lcom/immomo/molive/apm/cpu/CpuCore;", "allCpu", "intervalMills", "Ll/ntb;", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/Collection;J)Ll/ntb;", "Lcom/immomo/molive/apm/cpu/SystemPseudo;", "sysPseudo", "Lkotlin/Pair;", "h", "(Lcom/immomo/molive/apm/cpu/SystemPseudo;)Lkotlin/Pair;", "Lcom/immomo/molive/apm/cpu/CpuPolicy;", "j", "(Ljava/util/Collection;)Ll/ntb;", BLiveStormDanmakuGiftResourceType.f45292l, "", "", "Ljava/util/Map;", "lastProcCpuTime", "lastCpuIdleTimes", "lastCpuRunningTimes", "lastCpuRunningPolicyTimes", "", "Z", "idelEnabled", "I", "getDEFAULT_KEY", "()I", "DEFAULT_KEY", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class itb {
    public static final itb INSTANCE = new itb();

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

    private itb() {
    }

    /* JADX INFO: renamed from: a */
    public final long m142021a(@NotNull File targetFile) {
        targetFile.getClass();
        if (!targetFile.exists()) {
            return 0L;
        }
        try {
            String strM206830j = wki.m206830j(targetFile, null, 1, null);
            if (strM206830j != null) {
                return Long.parseLong(StringsKt.m94324Z0(strM206830j).toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m142022b(@NotNull gtb targetFile) {
        targetFile.getClass();
        if (targetFile.getFile() == null || !targetFile.getFile().exists()) {
            return 0L;
        }
        try {
            String strM206830j = wki.m206830j(targetFile.getFile(), null, 1, null);
            if (strM206830j != null) {
                return Long.parseLong(StringsKt.m94324Z0(strM206830j).toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception unused) {
            targetFile.m132217c(false);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m142023c(@NotNull File targetFile, @NotNull hk90 procStatSummary) {
        targetFile.getClass();
        procStatSummary.getClass();
        if (!targetFile.exists()) {
            procStatSummary.f110399l = false;
            return;
        }
        List<String> listM142026f = m142026f(targetFile);
        if (listM142026f.size() > 22) {
            procStatSummary.f110395h = listM142026f.get(0);
            if (!TextUtils.isEmpty(listM142026f.get(1)) && C15493d.m94380w(listM142026f.get(1), ")", false, 2, null)) {
                String str = listM142026f.get(1);
                int length = listM142026f.get(1).length() - 1;
                if (str == null) {
                    C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
                    return;
                }
                procStatSummary.f110396i = str.substring(1, length);
            }
            procStatSummary.f110397j = listM142026f.get(2);
            procStatSummary.f110389b = Long.parseLong(listM142026f.get(13));
            procStatSummary.f110390c = Long.parseLong(listM142026f.get(14));
            procStatSummary.f110391d = Long.parseLong(listM142026f.get(15));
            procStatSummary.f110392e = Long.parseLong(listM142026f.get(16));
            procStatSummary.f110398k = listM142026f.get(18);
            procStatSummary.f110393f = Integer.parseInt(listM142026f.get(19));
            procStatSummary.f110394g = Long.parseLong(listM142026f.get(22));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m142024d(@NotNull File targetFile, @NotNull soh0 sysStatSummary) {
        targetFile.getClass();
        sysStatSummary.getClass();
        if (!targetFile.exists()) {
            sysStatSummary.f169897h = false;
            return;
        }
        List<String> listM142025e = m142025e(targetFile);
        if (listM142025e.size() > 10) {
            sysStatSummary.f169890a = Long.parseLong(listM142025e.get(1));
            sysStatSummary.f169891b = Long.parseLong(listM142025e.get(2));
            sysStatSummary.f169892c = Long.parseLong(listM142025e.get(3));
            sysStatSummary.f169893d = Long.parseLong(listM142025e.get(4));
            sysStatSummary.f169894e = Long.parseLong(listM142025e.get(5));
            sysStatSummary.f169895f = Long.parseLong(listM142025e.get(6));
            sysStatSummary.f169896g = Long.parseLong(listM142025e.get(7));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<String> m142025e(@NotNull File targetFile) {
        targetFile.getClass();
        if (targetFile.exists()) {
            try {
                String str = (String) CollectionsKt.take(wki.m206827g(targetFile, null, 1, null), 0).get(0);
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                StringsKt.split$default(StringsKt.m94324Z0(str).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m142026f(@NotNull File targetFile) {
        targetFile.getClass();
        if (!targetFile.exists()) {
            return CollectionsKt.emptyList();
        }
        String strM206830j = wki.m206830j(targetFile, null, 1, null);
        if (strM206830j != null) {
            return StringsKt.split$default(StringsKt.m94324Z0(strM206830j).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
        }
        C0799b.m4641a("null cannot be cast to non-null type kotlin.CharSequence");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final long m142027g(@NotNull ProcessPseudo processPseudo) {
        processPseudo.getClass();
        Map<Integer, Long> map = lastProcCpuTime;
        Long l2 = map.get(Integer.valueOf(processPseudo.getProcessPid()));
        if (l2 == null) {
            map.put(Integer.valueOf(processPseudo.getProcessPid()), Long.valueOf(processPseudo.m19533f().m135620b()));
            return 0L;
        }
        long jM135620b = processPseudo.m19533f().m135620b();
        long jLongValue = jM135620b - l2.longValue();
        map.put(Integer.valueOf(processPseudo.getProcessPid()), Long.valueOf(jM135620b));
        return jLongValue;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Pair<ntb, ntb> m142028h(@NotNull SystemPseudo sysPseudo) {
        sysPseudo.getClass();
        soh0 soh0VarM19538e = sysPseudo.m19538e();
        if (!soh0VarM19538e.f169897h) {
            return new Pair<>(new ntb(0L, false), new ntb(0L, false));
        }
        long jM187239a = soh0VarM19538e.m187239a();
        long jM187239a2 = soh0VarM19538e.m187239a();
        Map<Integer, Long> map = lastCpuIdleTimes;
        int i = DEFAULT_KEY;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Long.valueOf(jM187239a));
            lastCpuRunningTimes.put(Integer.valueOf(i), Long.valueOf(jM187239a2));
            return new Pair<>(new ntb(0L, false, 2, null), new ntb(0L, false, 2, null));
        }
        Long l2 = map.get(Integer.valueOf(i));
        long jLongValue = l2 != null ? l2.longValue() : jM187239a;
        map.put(Integer.valueOf(i), Long.valueOf(jM187239a));
        Map<Integer, Long> map2 = lastCpuRunningTimes;
        Long l3 = map2.get(Integer.valueOf(i));
        long jLongValue2 = l3 != null ? l3.longValue() : jM187239a2;
        map2.put(Integer.valueOf(i), Long.valueOf(jM187239a2));
        return new Pair<>(new ntb(jM187239a - jLongValue, false, 2, null), new ntb(jM187239a2 - jLongValue2, false, 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ntb m142029i(@NotNull Collection<CpuCore> allCpu, long intervalMills) {
        allCpu.getClass();
        long j = intervalMills * 1000;
        boolean z = false;
        long j2 = 0;
        for (CpuCore cpuCore : allCpu) {
            ntb ntbVarM19494i = cpuCore.m19494i();
            if (ntbVarM19494i.getEnable()) {
                Map<Integer, Long> map = lastCpuIdleTimes;
                Long l2 = map.get(Integer.valueOf(cpuCore.getCpuIndex()));
                map.put(Integer.valueOf(cpuCore.getCpuIndex()), Long.valueOf(ntbVarM19494i.getTime()));
                z = true;
                if (l2 != null) {
                    long time = ntbVarM19494i.getTime() - l2.longValue();
                    if (time != 0 ? time > j : cpuCore.m19495j() != cpuCore.m19493h()) {
                        time = j;
                    }
                    j2 += time;
                }
            }
        }
        return new ntb(j2 / 1000, z);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ntb m142030j(@NotNull Collection<CpuPolicy> allCpu) {
        allCpu.getClass();
        boolean z = false;
        long j = 0;
        for (CpuPolicy cpuPolicy : allCpu) {
            if (cpuPolicy.getEnable()) {
                long jM19512h = cpuPolicy.m19512h();
                if (jM19512h < 0) {
                    cpuPolicy.m19515l(false);
                } else {
                    Map<String, Long> map = lastCpuRunningPolicyTimes;
                    Long l2 = map.get(cpuPolicy.m19511g());
                    map.put(cpuPolicy.m19511g(), Long.valueOf(jM19512h));
                    if (l2 != null) {
                        long jLongValue = jM19512h - l2.longValue();
                        if (jLongValue >= 0) {
                            j += jLongValue;
                        }
                    }
                }
                z = true;
            }
        }
        return new ntb(j, z);
    }

    /* JADX INFO: renamed from: k */
    public final long m142031k(@NotNull File targetFile) {
        targetFile.getClass();
        long j = 0;
        if (targetFile.exists()) {
            try {
                for (String str : wki.m206827g(targetFile, null, 1, null)) {
                    if (str == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    List listSplit$default = StringsKt.split$default(StringsKt.m94324Z0(str).toString(), new String[]{MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, null);
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
    public final void m142032l() {
        lastProcCpuTime.clear();
        lastCpuIdleTimes.clear();
        lastCpuRunningTimes.clear();
        lastCpuRunningPolicyTimes.clear();
    }
}
