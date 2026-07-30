package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.p051p1.mobile.putong.data.Link;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/hhi;", "", "<init>", "()V", "", "", "fileList", "", "finishedPkgs", "Ll/phi;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Ljava/util/Set;Ljava/util/List;Ll/phi;)Z", "bid", "fileName", "filePath", "isOld", "baseVer", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ll/phi;)Z", "", "zipPaths", "", "b", "(Ljava/util/List;Ll/phi;)V", Link.TYPE, "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class hhi {

    /* JADX INFO: renamed from: l.hhi$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C17462a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d((String) t2, (String) t);
        }
    }

    /* JADX INFO: renamed from: l.hhi$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C17463b<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d((File) t2, (File) t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0181  */
    /* JADX INFO: renamed from: a */
    private final boolean m135065a(Set<String> fileList, List<String> finishedPkgs, phi listener) throws Throwable {
        int i;
        Object obj;
        List<String> listMo94255c;
        boolean zM135067f;
        List<String> listMo94255c2;
        List<String> listMo94255c3;
        List listSortedWith = CollectionsKt.sortedWith(fileList, new C17462a());
        Regex regex = new Regex("\\d+-\\d+\\.\\d+\\.\\d+-spec\\.zip");
        Regex regex2 = new Regex("\\d+-\\d+\\.\\d+\\.\\d+\\.zip");
        Regex regex3 = new Regex("\\d+-v\\d+\\.zip");
        List listListOf = CollectionsKt.listOf((Object[]) new Regex[]{regex, regex2, regex3});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = listSortedWith;
        ArrayList<File> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        boolean zM135066e = false;
        for (File file : arrayList) {
            List list2 = listListOf;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                if (listener != 0) {
                    String name = file.getName();
                    name.getClass();
                    listener.m172325a(new ohi.C19136c(name));
                }
                pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3101, "Pre-embed: invalid file name: " + file.getName(), null, null, 12, null);
                zM135066e = false;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Regex regex4 = (Regex) it2.next();
                        String name2 = file.getName();
                        name2.getClass();
                        if (regex4.matches(name2)) {
                        }
                    } else {
                        if (listener != 0) {
                            String name3 = file.getName();
                            name3.getClass();
                            listener.m172325a(new ohi.C19136c(name3));
                        }
                        pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3101, "Pre-embed: invalid file name: " + file.getName(), null, null, 12, null);
                        zM135066e = false;
                    }
                }
            }
            String name4 = file.getName();
            name4.getClass();
            String str = "Pre-embed: duplicate bid for file: ";
            if (regex3.matches(name4)) {
                Regex regex5 = new Regex("(\\d+)-");
                String name5 = file.getName();
                name5.getClass();
                MatchResult matchResultFind$default = Regex.find$default(regex5, name5, 0, 2, null);
                if (matchResultFind$default != null && (listMo94255c3 = matchResultFind$default.mo94255c()) != null) {
                    String str2 = listMo94255c3.get(1);
                    if (linkedHashSet.add(str2 + "_default")) {
                        String name6 = file.getName();
                        name6.getClass();
                        String path = file.getPath();
                        path.getClass();
                        str = "Pre-embed: duplicate bid for file: ";
                        file = file;
                        obj = null;
                        regex3 = regex3;
                        i = 2;
                        zM135066e = m135066e(str2, name6, path, true, "default", finishedPkgs, listener);
                    } else {
                        if (listener != 0) {
                            String name7 = file.getName();
                            name7.getClass();
                            listener.m172325a(new ohi.C19134a(name7));
                        }
                        pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "Pre-embed: duplicate bid for file: " + file.getName(), null, 0, 6, null);
                        zM135066e = false;
                    }
                }
                obj = null;
                i = 2;
            } else {
                obj = null;
                i = 2;
            }
            String name8 = file.getName();
            name8.getClass();
            if (StringsKt.m94303P(name8, "spec", false, i, obj)) {
                Regex regex6 = new Regex("(\\d+)-([\\d.]+)\\D*-spec\\.zip");
                String name9 = file.getName();
                name9.getClass();
                MatchResult matchResultFind$default2 = Regex.find$default(regex6, name9, 0, i, obj);
                if (matchResultFind$default2 != null && (listMo94255c2 = matchResultFind$default2.mo94255c()) != null && listMo94255c2.size() == 3) {
                    String str3 = listMo94255c2.get(1);
                    String strValueOf = String.valueOf(listMo94255c2.get(i).charAt(0));
                    if (linkedHashSet.add(str3 + '_' + strValueOf)) {
                        String name10 = file.getName();
                        name10.getClass();
                        String path2 = file.getPath();
                        path2.getClass();
                        zM135067f = m135067f(this, str3, name10, path2, false, strValueOf, finishedPkgs, listener, 8, null);
                        zM135066e = zM135067f;
                    } else {
                        if (listener != 0) {
                            String name11 = file.getName();
                            name11.getClass();
                            listener.m172325a(new ohi.C19134a(name11));
                        }
                        pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), str + file.getName(), null, 0, 6, null);
                        zM135066e = false;
                    }
                }
            } else {
                String str4 = str;
                Regex regex7 = new Regex("(\\d+)-");
                String name12 = file.getName();
                name12.getClass();
                MatchResult matchResultFind$default3 = Regex.find$default(regex7, name12, 0, i, obj);
                if (matchResultFind$default3 != null && (listMo94255c = matchResultFind$default3.mo94255c()) != null) {
                    String str5 = listMo94255c.get(1);
                    if (linkedHashSet.add(str5 + "_default")) {
                        String name13 = file.getName();
                        name13.getClass();
                        String path3 = file.getPath();
                        path3.getClass();
                        zM135067f = m135067f(this, str5, name13, path3, false, "default", finishedPkgs, listener, 8, null);
                    } else {
                        if (listener != 0) {
                            String name14 = file.getName();
                            name14.getClass();
                            listener.m172325a(new ohi.C19134a(name14));
                        }
                        pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), str4 + file.getName(), null, 0, 6, null);
                        zM135067f = false;
                    }
                    zM135066e = zM135067f;
                }
            }
            regex3 = regex3;
        }
        return zM135066e;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX INFO: renamed from: e */
    private final boolean m135066e(String bid, String fileName, String filePath, boolean isOld, String baseVer, List<String> finishedPkgs, phi listener) throws Throwable {
        String str;
        File file;
        Integer numValueOf;
        File file2;
        String name;
        if (baseVer != null) {
            try {
                str = !StringsKt.m94329e0(baseVer) ? baseVer : null;
                if (str == null) {
                    str = "default";
                }
            } catch (Exception e) {
                if (listener != null) {
                    listener.m172325a(new ohi.C19135b(fileName, e.getMessage()));
                }
                pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3103, "Pre-embed: install failed for file: " + fileName + ", error: " + e.getMessage(), e, null, 8, null);
                return false;
            }
        } else {
            str = "default";
        }
        File fileM109817t = FepPackageContext.INSTANCE.m17684k().m109817t(bid, str);
        if (!fileM109817t.exists()) {
            fileM109817t.mkdirs();
        }
        if (isOld) {
            String strM135070d = m135070d(fileName);
            if (strM135070d != null) {
                file = new File(fileM109817t, strM135070d);
            } else {
                file = null;
            }
        } else {
            String strM135069c = m135069c(bid, fileName);
            if (strM135069c != null) {
                file = new File(fileM109817t, strM135069c);
            } else {
                file = null;
            }
        }
        if (file != null && (!file.exists() || !new File(file, "config.json").exists())) {
            File[] fileArrListFiles = fileM109817t.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file3 : fileArrListFiles) {
                    file3.getClass();
                    if (file3.isDirectory()) {
                        String name2 = file3.getName();
                        name2.getClass();
                        if (TextUtils.isDigitsOnly(name2) && new File(file3, "config.json").exists()) {
                            arrayList.add(file3);
                        }
                    }
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList, new C17463b());
                if (listSortedWith == null || (file2 = (File) CollectionsKt.firstOrNull(listSortedWith)) == null || (name = file2.getName()) == null) {
                    numValueOf = null;
                } else {
                    String name3 = file.getName();
                    name3.getClass();
                    numValueOf = Integer.valueOf(name.compareTo(name3));
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() >= 0) {
                return false;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109800h = chi.m109800h(fepPackageContext.m17684k(), bid, null, 2, null);
            FileUtil.m17520d(lv0.m155971a(), filePath, fileM109800h);
            String name4 = file.getName();
            name4.getClass();
            Long lP = StringsKt.m94281p(name4);
            long jLongValue = lP != null ? lP.longValue() : 0L;
            bhi bhiVarM17683j = fepPackageContext.m17683j();
            String absolutePath = fileM109800h.getAbsolutePath();
            absolutePath.getClass();
            if (bhiVarM17683j.m104347c(absolutePath, bid, str, jLongValue, false, MapsKt.hashMapOf(TuplesKt.m88129a("bid", bid), TuplesKt.m88129a("repData", "FepPackagePreEmbedModule{bid=" + bid + ",fileName=" + fileName + ",filePath=" + filePath + ",baseVer=" + str)))) {
                finishedPkgs.add(bid);
                return true;
            }
            if (listener != null) {
                listener.m172325a(new ohi.C19135b(fileName, "Unzip failed"));
            }
            pgi.m172234d(fepPackageContext.m17685l(), -3103, "Pre-embed: unzip failed for file: " + fileName, null, null, 12, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m135067f(hhi hhiVar, String str, String str2, String str3, boolean z, String str4, List list, phi phiVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = "default";
        }
        return hhiVar.m135066e(str, str2, str3, z2, str4, list, phiVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m135068b(@NotNull List<String> zipPaths, @Nullable phi listener) throws Throwable {
        zipPaths.getClass();
        if (zipPaths.isEmpty()) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Pre-embed: zip paths list is empty", null, 0, null, 14, null);
            if (listener != null) {
                listener.m172326b(CollectionsKt.emptyList());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        m135065a(CollectionsKt.toSet(zipPaths), arrayList, listener);
        if (listener != null) {
            listener.m172326b(arrayList);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m135069c(@NotNull String bid, @NotNull String link) {
        String str;
        String strY0;
        List listSplit$default;
        bid.getClass();
        link.getClass();
        MatchResult matchResultFind$default = Regex.find$default(new Regex(bid + "-([\\d.]+)"), link, 0, 2, null);
        List<String> listMo94255c = matchResultFind$default != null ? matchResultFind$default.mo94255c() : null;
        if (listMo94255c != null && (str = listMo94255c.get(1)) != null && (strY0 = StringsKt.m94349y0(str, ".")) != null && (listSplit$default = StringsKt.split$default(strY0, new String[]{"."}, false, 0, 6, null)) != null) {
            if (listSplit$default.size() != 3) {
                listSplit$default = null;
            }
            if (listSplit$default != null) {
                StringBuilder sb = new StringBuilder();
                List list = listSplit$default;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    arrayList.add(C15493d.m94370F(String.format("%4s", Arrays.copyOf(new Object[]{(String) obj}, 1)), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "0", false, 4, null));
                    i = i2;
                }
                sb.append(new Regex("^0*").replaceFirst(CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null), ""));
                sb.append(StringsKt.m94303P(link, "-spec", false, 2, null) ? "1" : "0");
                return sb.toString();
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m135070d(@NotNull String link) {
        link.getClass();
        MatchResult matchResultFind$default = Regex.find$default(new Regex("v(\\d+)"), link, 0, 2, null);
        if (matchResultFind$default == null || matchResultFind$default.mo94255c().size() <= 1) {
            return null;
        }
        return matchResultFind$default.mo94255c().get(1);
    }
}
