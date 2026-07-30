package com.immomo.molive.apm.temp;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.prb;
import p149l.xgi0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001a\u0010\u0018R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0018R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, m87232d2 = {"Lcom/immomo/molive/apm/temp/TempUtils;", "", "<init>", "()V", "", "c", "()I", "a", "e", "", "h", "()Z", "", "", "Lkotlin/Lazy;", "getCPU_SENSORS_MSMNILE", "()Ljava/util/Set;", "CPU_SENSORS_MSMNILE", "b", "getMISC_SENSORS_TALOS", "MISC_SENSORS_TALOS", "", "Ljava/io/File;", "g", "()Ljava/util/List;", "tempList", Constants.INAPP_DATA_TAG, "cpuThermalList", "batteryThermalList", "f", "skinThermalList", "Z", "cpuTempEnable", "batteryTempEnable", RXScreenCaptureService.KEY_INDEX, "skinTempEnable", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class TempUtils {
    public static final TempUtils INSTANCE = new TempUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy CPU_SENSORS_MSMNILE = LazyKt__LazyJVMKt.m87229b(new Function0<Set<? extends String>>() { // from class: com.immomo.molive.apm.temp.TempUtils$CPU_SENSORS_MSMNILE$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends String> invoke() {
            return SetsKt.setOf((Object[]) new String[]{"cpuss-2-usr", "cpuss-2-usr", "cpuss-1-usr", "cpuss-1-usr", "cpuss-0-usr", "cpuss-0-usr", "cpu-1-0-usr", "cpu-1-2-usr"});
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy MISC_SENSORS_TALOS = LazyKt__LazyJVMKt.m87229b(new Function0<Set<? extends String>>() { // from class: com.immomo.molive.apm.temp.TempUtils$MISC_SENSORS_TALOS$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends String> invoke() {
            return SetsKt.setOf((Object[]) new String[]{"gpu-usr", "battery", "xo-therm"});
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy tempList = LazyKt__LazyJVMKt.m87229b(new Function0<List<File>>() { // from class: com.immomo.molive.apm.temp.TempUtils$tempList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<File> invoke() {
            File[] fileArrListFiles = new File("/sys/class/thermal").listFiles(new prb("thermal_zone[0-9][0-9]"));
            ArrayList arrayList = new ArrayList();
            fileArrListFiles.getClass();
            CollectionsKt.addAll(arrayList, fileArrListFiles);
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy cpuThermalList = LazyKt__LazyJVMKt.m87229b(new Function0<List<File>>() { // from class: com.immomo.molive.apm.temp.TempUtils$cpuThermalList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<File> invoke() {
            List<File> listM18592g = TempUtils.INSTANCE.m18592g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM18592g) {
                if (xgi0.INSTANCE.m208678a(new File((File) obj, "type"), "cpu")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((File) it.next(), "temp"));
            }
            return arrayList2;
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy batteryThermalList = LazyKt__LazyJVMKt.m87229b(new Function0<List<File>>() { // from class: com.immomo.molive.apm.temp.TempUtils$batteryThermalList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<File> invoke() {
            List<File> listM18592g = TempUtils.INSTANCE.m18592g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM18592g) {
                if (xgi0.INSTANCE.m208678a(new File((File) obj, "type"), "battery")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((File) it.next(), "temp"));
            }
            return arrayList2;
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy skinThermalList = LazyKt__LazyJVMKt.m87229b(new Function0<List<File>>() { // from class: com.immomo.molive.apm.temp.TempUtils$skinThermalList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<File> invoke() {
            List<File> listM18592g = TempUtils.INSTANCE.m18592g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM18592g) {
                if (xgi0.INSTANCE.m208678a(new File((File) obj, "type"), "skin")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((File) it.next(), "temp"));
            }
            return arrayList2;
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static boolean cpuTempEnable = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static boolean batteryTempEnable = true;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static boolean skinTempEnable = true;

    private TempUtils() {
    }

    /* JADX INFO: renamed from: a */
    public final int m18586a() {
        if (!batteryTempEnable) {
            return 0;
        }
        try {
            if (!m18587b().isEmpty()) {
                return xgi0.m208677c(xgi0.INSTANCE, m18587b(), false, 2, null);
            }
            batteryTempEnable = false;
            return 0;
        } catch (Exception unused) {
            batteryTempEnable = false;
            return 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<File> m18587b() {
        return (List) batteryThermalList.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m18588c() {
        if (!cpuTempEnable) {
            return 0;
        }
        try {
            if (!m18589d().isEmpty()) {
                return xgi0.m208677c(xgi0.INSTANCE, m18589d(), false, 2, null);
            }
            cpuTempEnable = false;
            return 0;
        } catch (Exception unused) {
            cpuTempEnable = false;
            return 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<File> m18589d() {
        return (List) cpuThermalList.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final int m18590e() {
        if (!skinTempEnable) {
            return 0;
        }
        try {
            if (!m18591f().isEmpty()) {
                return xgi0.m208677c(xgi0.INSTANCE, m18591f(), false, 2, null);
            }
            skinTempEnable = false;
            return 0;
        } catch (Exception unused) {
            skinTempEnable = false;
            return 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<File> m18591f() {
        return (List) skinThermalList.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<File> m18592g() {
        return (List) tempList.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18593h() {
        return cpuTempEnable || batteryTempEnable || skinTempEnable;
    }
}
