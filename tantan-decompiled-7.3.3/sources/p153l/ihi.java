package p153l;

import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/ihi;", "", "<init>", "()V", "", "", "", "packageConfs", "", "a", "(Ljava/util/List;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ihi {
    /* JADX INFO: renamed from: a */
    public final void m139991a(@NotNull List<? extends Map<String, ? extends Object>> packageConfs) {
        String string;
        Object obj;
        String string2;
        String strM144902a;
        zgi zgiVarM17666n;
        packageConfs.getClass();
        if (packageConfs.isEmpty()) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Preload: packageConfs is empty", null, 0, null, 14, null);
            return;
        }
        for (Map<String, ? extends Object> map : packageConfs) {
            try {
                Object obj2 = map.get("bid");
                if (obj2 != null && (string = obj2.toString()) != null && (obj = map.get("newest_version")) != null && (string2 = obj.toString()) != null && (strM144902a = jhi.m144902a(string2)) != null && !StringsKt.m94329e0(string) && (zgiVarM17666n = FepPackageManager.INSTANCE.m17673a().m17666n(string, strM144902a, null, CheckPolicy.LOCAL_ONLY)) != null) {
                    Map<String, String> mapM210888a = xgi.m210888a(MapsKt.mutableMapOf(TuplesKt.m88129a("bid", string), TuplesKt.m88129a("preloadData", map.toString())), "FepPackagePreloadModule-preload");
                    tgi tgiVarM191041d = tgi.INSTANCE.m191041d(map, string);
                    tgiVarM191041d.m191037l(zgiVarM17666n.m219624g());
                    if (zgiVarM17666n.m219633p()) {
                        pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Preload: skip " + string + ", update in progress", null, 2, null);
                    } else {
                        FepPackageContext.INSTANCE.m17693t().m17742h(zgiVarM17666n, tgiVarM191041d, mapM210888a);
                    }
                }
            } catch (Exception e) {
                pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Preload package failed: " + e.getMessage(), e, 0, null, 12, null);
            }
        }
    }
}
