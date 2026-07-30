package com.immomo.molive.apm.cpu;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.urb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR'\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006("}, m87232d2 = {"Lcom/immomo/molive/apm/cpu/CpuPolicy;", "", "Ljava/io/File;", "policyRoot", "<init>", "(Ljava/io/File;)V", "", "g", "()Ljava/lang/String;", "", "h", "()J", "", "a", "Z", RXScreenCaptureService.KEY_INDEX, "()Z", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "enable", "b", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ljava/io/File;", "affectedCpusFile", "c", "k", "timeInStateFile", "", "", "e", "()Ljava/util/List;", "affectedCpusIds", "", "Lcom/immomo/molive/apm/cpu/CpuCore;", "f", "()Ljava/util/Map;", "controlCpuCores", "Ljava/io/File;", "j", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class CpuPolicy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy affectedCpusFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy timeInStateFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy affectedCpusIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCpuCores;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final File policyRoot;

    public CpuPolicy(@NotNull File file) {
        file.getClass();
        this.policyRoot = file;
        this.enable = true;
        this.affectedCpusFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuPolicy$affectedCpusFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.getPolicyRoot(), "affected_cpus");
            }
        });
        this.timeInStateFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.CpuPolicy$timeInStateFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.getPolicyRoot(), "stats/time_in_state");
            }
        });
        this.affectedCpusIds = LazyKt__LazyJVMKt.m87229b(new Function0<List<? extends Integer>>() { // from class: com.immomo.molive.apm.cpu.CpuPolicy$affectedCpusIds$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Integer> invoke() {
                List<String> listM195065f = urb.INSTANCE.m195065f(this.this$0.m18527d());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM195065f, 10));
                Iterator<T> it = listM195065f.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
                return arrayList;
            }
        });
        this.controlCpuCores = LazyKt__LazyJVMKt.m87229b(new Function0<Map<Integer, CpuCore>>() { // from class: com.immomo.molive.apm.cpu.CpuPolicy$controlCpuCores$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Integer, CpuCore> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = this.this$0.m18528e().iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    linkedHashMap.put(Integer.valueOf(iIntValue), new CpuCore(iIntValue, this.this$0.m18529k()));
                }
                return linkedHashMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final File m18527d() {
        return (File) this.affectedCpusFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final List<Integer> m18528e() {
        return (List) this.affectedCpusIds.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final File m18529k() {
        return (File) this.timeInStateFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Map<Integer, CpuCore> m18530f() {
        return (Map) this.controlCpuCores.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m18531g() {
        String name = this.policyRoot.getName();
        name.getClass();
        return name;
    }

    /* JADX INFO: renamed from: h */
    public final long m18532h() {
        return urb.INSTANCE.m195070k(m18529k()) * ((long) m18528e().size());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final File getPolicyRoot() {
        return this.policyRoot;
    }

    /* JADX INFO: renamed from: l */
    public final void m18535l(boolean z) {
        this.enable = z;
    }
}
