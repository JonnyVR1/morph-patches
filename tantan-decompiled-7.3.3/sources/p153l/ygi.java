package p153l;

import android.text.TextUtils;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/ygi;", "", "<init>", "()V", "", "bid", "Ljava/io/File;", "finalPackageDir", "", "currentVersion", "", "a", "(Ljava/lang/String;Ljava/io/File;J)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ygi {

    /* JADX INFO: renamed from: l.ygi$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C21586a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d(Long.valueOf(((Number) ((Pair) t2).getFirst()).longValue()), Long.valueOf(((Number) ((Pair) t).getFirst()).longValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[Catch: Exception -> 0x02c7, TryCatch #1 {Exception -> 0x02c7, blocks: (B:3:0x000a, B:5:0x0011, B:7:0x0017, B:9:0x0021, B:11:0x002c, B:13:0x0039, B:15:0x0043, B:17:0x0053, B:18:0x0056, B:19:0x0059, B:20:0x0062, B:22:0x0068, B:29:0x0087, B:30:0x008b, B:34:0x0099, B:35:0x009d, B:38:0x00a7, B:62:0x013d, B:63:0x013f, B:75:0x0197, B:74:0x018e, B:69:0x017f, B:76:0x0198, B:79:0x01a6, B:80:0x01b2, B:82:0x01b8, B:84:0x01cd, B:85:0x01d1, B:86:0x01f1, B:88:0x01f7, B:89:0x020f, B:90:0x0219, B:92:0x021f, B:94:0x0239, B:111:0x02ae, B:33:0x0093, B:96:0x0243, B:98:0x027b, B:99:0x027e, B:101:0x028c, B:103:0x0291, B:106:0x0299, B:109:0x02a1, B:59:0x0130, B:71:0x0182, B:41:0x00c1, B:43:0x00f9, B:48:0x0103, B:50:0x0111, B:52:0x0116, B:55:0x011e, B:58:0x0125, B:65:0x0148, B:66:0x0172), top: B:118:0x000a, inners: #0, #2, #4, #5, #6, #7 }] */
    /* JADX INFO: renamed from: a */
    public final void m215842a(@NotNull String bid, @NotNull File finalPackageDir, long currentVersion) {
        List arrayList;
        File[] fileArrListFiles;
        Pair pair;
        bid.getClass();
        finalPackageDir.getClass();
        try {
            File parentFile = finalPackageDir.getParentFile();
            if (parentFile == null || (fileArrListFiles = parentFile.listFiles()) == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList<File> arrayList2 = new ArrayList();
                for (File file : fileArrListFiles) {
                    file.getClass();
                    if (file.isDirectory()) {
                        String name = file.getName();
                        name.getClass();
                        if (TextUtils.isDigitsOnly(name) && file.length() > 0) {
                            String name2 = file.getName();
                            name2.getClass();
                            if (!C15493d.m94374J(name2, "unzip_", false, 2, null)) {
                                arrayList2.add(file);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (File file2 : arrayList2) {
                    try {
                        file2.getClass();
                        String name3 = file2.getName();
                        name3.getClass();
                        Long lP = StringsKt.m94281p(name3);
                        pair = lP != null ? new Pair(lP, file2) : null;
                    } catch (Exception unused) {
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                arrayList = CollectionsKt.toMutableList((Collection) arrayList3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            }
            List<Pair> list = arrayList;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                long jLongValue = ((Number) pair2.getFirst()).longValue();
                File file3 = (File) pair2.getSecond();
                if (jLongValue > currentVersion) {
                    try {
                        try {
                            FileUtil.m17527k(file3);
                            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
                            pgi pgiVarM17685l = fepPackageContext.m17685l();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Deleted version greater than current: ");
                            file3.getClass();
                            sb.append(file3.getAbsolutePath());
                            pgi.m172235f(pgiVarM17685l, sb.toString(), null, 0, 6, null);
                            File fileM109810l = fepPackageContext.m17684k().m109810l(bid, jLongValue, ".zip");
                            if (fileM109810l.exists()) {
                                fileM109810l.delete();
                            }
                            File fileM109810l2 = fepPackageContext.m17684k().m109810l(bid, jLongValue, ".7z");
                            if (fileM109810l2.exists()) {
                                fileM109810l2.delete();
                            }
                            String name4 = parentFile != null ? parentFile.getName() : null;
                            if (name4 != null && name4.length() != 0) {
                                fepPackageContext.m17691r().m17725m(bid, name4, Long.valueOf(jLongValue));
                            }
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                it.remove();
                                Result.m225066constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                th = th;
                                Result.Companion companion2 = Result.INSTANCE;
                                Result.m225066constructorimpl(ResultKt.m88127a(th));
                            }
                        } catch (Throwable th2) {
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                it.remove();
                                Result.m225066constructorimpl(Unit.INSTANCE);
                                throw th2;
                            } catch (Throwable th3) {
                                Result.Companion companion4 = Result.INSTANCE;
                                Result.m225066constructorimpl(ResultKt.m88127a(th3));
                                throw th2;
                            }
                        }
                    } catch (Exception e) {
                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Evicted version load list version failed: " + e.getMessage(), null, 0, MapsKt.mapOf(TuplesKt.m88129a("bid", bid)), 6, null);
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            it.remove();
                            Result.m225066constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th4) {
                            th = th4;
                            Result.Companion companion6 = Result.INSTANCE;
                            Result.m225066constructorimpl(ResultKt.m88127a(th));
                        }
                    }
                }
            }
            int maxKeepVersionCount = FepPackageContext.INSTANCE.m17677d().getMaxKeepVersionCount();
            if (maxKeepVersionCount == 0) {
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (((Number) ((Pair) obj).getFirst()).longValue() <= currentVersion) {
                    arrayList4.add(obj);
                }
            }
            List listTake = CollectionsKt.take(CollectionsKt.sortedWith(arrayList4, new C21586a()), maxKeepVersionCount);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it2 = listTake.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Long.valueOf(((Number) ((Pair) it2.next()).getFirst()).longValue()));
            }
            Set set = CollectionsKt.toSet(arrayList5);
            for (Pair pair3 : list) {
                long jLongValue2 = ((Number) pair3.component1()).longValue();
                File file4 = (File) pair3.component2();
                if (jLongValue2 <= currentVersion && !set.contains(Long.valueOf(jLongValue2))) {
                    try {
                        FileUtil.m17527k(file4);
                        FepPackageContext fepPackageContext2 = FepPackageContext.INSTANCE;
                        pgi pgiVarM17685l2 = fepPackageContext2.m17685l();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Evicted old version: ");
                        file4.getClass();
                        sb2.append(file4.getAbsolutePath());
                        pgi.m172235f(pgiVarM17685l2, sb2.toString(), null, 0, 6, null);
                        File fileM109810l3 = fepPackageContext2.m17684k().m109810l(bid, jLongValue2, ".zip");
                        if (fileM109810l3.exists()) {
                            fileM109810l3.delete();
                        }
                        File fileM109810l4 = fepPackageContext2.m17684k().m109810l(bid, jLongValue2, ".7z");
                        if (fileM109810l4.exists()) {
                            fileM109810l4.delete();
                        }
                        String name5 = parentFile != null ? parentFile.getName() : null;
                        if (name5 != null && name5.length() != 0) {
                            fepPackageContext2.m17691r().m17725m(bid, name5, Long.valueOf(jLongValue2));
                        }
                    } catch (Exception unused2) {
                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Evicted version load list version failed", null, 0, MapsKt.mapOf(TuplesKt.m88129a("bid", bid)), 6, null);
                    }
                }
            }
        } catch (Exception unused3) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Evicted version load list version failed", null, 0, MapsKt.mapOf(TuplesKt.m88129a("bid", bid)), 6, null);
        }
    }
}
