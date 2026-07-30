package com.immomo.motracing;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.go5;
import p153l.p7f;
import p153l.yki;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m88121d2 = {"Lcom/immomo/motracing/LogCleaner;", "", "<init>", "()V", "Ljava/io/File;", "", RequestParameters.PREFIX, "", "h", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/Long;", "", "e", "(Ljava/io/File;Ljava/lang/String;)Z", "logPath", "storePrefix", "beforeTime", "", "maxCount", "", "c", "(Ljava/lang/String;Ljava/lang/String;JI)V", "", "g", "(Ljava/lang/String;Ljava/lang/String;JI)Ljava/util/List;", "f", "(Ljava/lang/String;Ljava/lang/String;J)Ljava/util/List;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/util/Set;", "EXTENSIONS", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class LogCleaner {
    public static final LogCleaner INSTANCE = new LogCleaner();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Set<String> EXTENSIONS = SetsKt.setOf((Object[]) new String[]{"spr", "sprx"});

    /* JADX INFO: renamed from: com.immomo.motracing.LogCleaner$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C4063a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d(Long.valueOf(((Number) ((Pair) t).getFirst()).longValue()), Long.valueOf(((Number) ((Pair) t2).getFirst()).longValue()));
        }
    }

    private LogCleaner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m20327c(String logPath, String storePrefix, long beforeTime, int maxCount) {
        List<File> listM20332g = m20332g(logPath, storePrefix, beforeTime, maxCount);
        Iterator<T> it = listM20332g.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        listM20332g.size();
    }

    /* JADX INFO: renamed from: e */
    private final boolean m20328e(@NotNull File file, String str) {
        return file.isFile() && m20329h(file, str) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Long m20329h(@NotNull File file, String str) {
        String strM216472t = yki.m216472t(file);
        List listSplit$default = StringsKt.split$default(strM216472t, new String[]{"_"}, false, 0, 6, null);
        int size = listSplit$default.size();
        if (size != 2) {
            if (size != 3) {
                if (StringsKt.m94329e0(str)) {
                    return StringsKt.m94281p(strM216472t);
                }
                return null;
            }
            if (Intrinsics.m88377d(((String) listSplit$default.get(0)) + '_', str)) {
                return StringsKt.m94281p((String) listSplit$default.get(1));
            }
            return null;
        }
        if (((String) listSplit$default.get(1)).length() == 3) {
            if (StringsKt.m94329e0(str)) {
                return StringsKt.m94281p((String) listSplit$default.get(0));
            }
            return null;
        }
        if (Intrinsics.m88377d(((String) listSplit$default.get(0)) + '_', str)) {
            return StringsKt.m94281p((String) listSplit$default.get(1));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ java.lang.Object m20330d(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.immomo.motracing.LogCleaner$compressBefore$1
            if (r0 == 0) goto L13
            r0 = r15
            com.immomo.motracing.LogCleaner$compressBefore$1 r0 = (com.immomo.motracing.LogCleaner$compressBefore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.immomo.motracing.LogCleaner$compressBefore$1 r0 = new com.immomo.motracing.LogCleaner$compressBefore$1
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p153l.uyp.m198688e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L53
            if (r2 != r3) goto L4c
            java.lang.Object r10 = r0.L$7
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r11 = r0.L$5
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.L$4
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r0.L$3
            java.util.List r13 = (java.util.List) r13
            long r4 = r0.J$0
            java.lang.Object r14 = r0.L$2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.immomo.motracing.LogCleaner r6 = (com.immomo.motracing.LogCleaner) r6
            kotlin.ResultKt.m88128b(r15)
            r15 = r2
            r2 = r12
            r12 = r15
            r15 = r13
            r13 = r14
            goto L93
        L4c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r10)
            r10 = 0
            return r10
        L53:
            kotlin.ResultKt.m88128b(r15)
            java.util.List r15 = r10.m20331f(r11, r12, r13)
            r2 = r15
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r4 = r2.iterator()
            r9 = r12
            r12 = r11
            r11 = r4
            r4 = r13
            r13 = r9
        L66:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L9a
            java.lang.Object r14 = r11.next()
            r6 = r14
            java.io.File r6 = (java.io.File) r6
            r0.L$0 = r10
            r0.L$1 = r12
            r0.L$2 = r13
            r0.J$0 = r4
            r0.L$3 = r15
            r0.L$4 = r2
            r0.L$5 = r11
            r0.L$6 = r14
            r0.L$7 = r6
            r0.label = r3
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r14 = kotlinx.coroutines.DelayKt.m94502b(r7, r0)
            if (r14 != r1) goto L90
            return r1
        L90:
            r9 = r6
            r6 = r10
            r10 = r9
        L93:
            com.immomo.motracing.GlobalTracer r14 = com.immomo.motracing.GlobalTracer.INSTANCE
            r14.m20321a(r10)
            r10 = r6
            goto L66
        L9a:
            r15.size()
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.immomo.motracing.LogCleaner.m20330d(java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<File> m20331f(@NotNull String logPath, @NotNull String storePrefix, long beforeTime) {
        logPath.getClass();
        storePrefix.getClass();
        File[] fileArrListFiles = new File(logPath).listFiles();
        if (fileArrListFiles == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            LogCleaner logCleaner = INSTANCE;
            file.getClass();
            if (logCleaner.m20328e(file, storePrefix) && Intrinsics.m88377d(yki.m216471s(file), "spr")) {
                arrayList.add(file);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            File file2 = (File) obj;
            LogCleaner logCleaner2 = INSTANCE;
            file2.getClass();
            Long lM20329h = logCleaner2.m20329h(file2, storePrefix);
            if ((lM20329h != null ? lM20329h.longValue() : 0L) < beforeTime) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<File> m20332g(@NotNull String logPath, @NotNull final String storePrefix, final long beforeTime, int maxCount) {
        List listEmptyList;
        logPath.getClass();
        storePrefix.getClass();
        File[] fileArrListFiles = new File(logPath).listFiles();
        if (fileArrListFiles != null) {
            listEmptyList = new ArrayList();
            for (File file : fileArrListFiles) {
                LogCleaner logCleaner = INSTANCE;
                file.getClass();
                if (logCleaner.m20328e(file, storePrefix) && EXTENSIONS.contains(yki.m216471s(file))) {
                    listEmptyList.add(file);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        final int iM88486b = C15274a.m88486b(listEmptyList.size() - maxCount, 0);
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94185N(SequencesKt___SequencesKt.m94173B(SequencesKt___SequencesKt.m94190S(SequencesKt___SequencesKt.m94185N(CollectionsKt.asSequence(listEmptyList), new Function1<File, Pair<? extends Long, ? extends File>>() { // from class: com.immomo.motracing.LogCleaner$listExpiredFiles$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Pair<Long, File> invoke(File file2) {
                LogCleaner logCleaner2 = LogCleaner.INSTANCE;
                file2.getClass();
                Long lM20329h = logCleaner2.m20329h(file2, storePrefix);
                return TuplesKt.m88129a(Long.valueOf(lM20329h != null ? lM20329h.longValue() : 0L), file2);
            }
        }), new C4063a()), new Function2<Integer, Pair<? extends Long, ? extends File>, Boolean>() { // from class: com.immomo.motracing.LogCleaner$listExpiredFiles$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final boolean invoke(int i, @NotNull Pair<Long, ? extends File> pair) {
                pair.getClass();
                return i < iM88486b || pair.component1().longValue() < beforeTime;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Pair<? extends Long, ? extends File> pair) {
                return Boolean.valueOf(invoke(num.intValue(), (Pair<Long, ? extends File>) pair));
            }
        }), new Function1<Pair<? extends Long, ? extends File>, File>() { // from class: com.immomo.motracing.LogCleaner$listExpiredFiles$4
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final File invoke2(@NotNull Pair<Long, ? extends File> pair) {
                pair.getClass();
                return pair.getSecond();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ File invoke(Pair<? extends Long, ? extends File> pair) {
                return invoke2((Pair<Long, ? extends File>) pair);
            }
        }));
    }
}
