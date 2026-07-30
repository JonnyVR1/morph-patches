package p153l;

import com.hellogroup.fep.config.core.FepConfigManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ggi;", "", "<init>", "()V", "", "b", "()Z", "", "bid", "host", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "c", "(Ljava/lang/String;)Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ggi {
    public static final ggi INSTANCE = new ggi();

    private ggi() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m130146a(@NotNull String bid, @NotNull String host) throws InterruptedException {
        bid.getClass();
        host.getClass();
        FepConfigManager fepConfigManagerM17633a = FepConfigManager.INSTANCE.m17633a();
        Object objM17629k = fepConfigManagerM17633a.m17629k("fepBlackBids", CollectionsKt.emptyList());
        if (!(objM17629k instanceof List)) {
            objM17629k = null;
        }
        List list = (List) objM17629k;
        if (list != null) {
            String strM151327o = kt0.m151327o(bid);
            if (strM151327o == null) {
                strM151327o = "";
            }
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m88377d(kt0.m151327o(it.next()), strM151327o)) {
                        return true;
                    }
                }
            }
        }
        Object objM17629k2 = fepConfigManagerM17633a.m17629k("fepBlackHosts", CollectionsKt.emptyList());
        List list3 = (List) (objM17629k2 instanceof List ? objM17629k2 : null);
        if (list3 == null) {
            return false;
        }
        String strM151327o2 = kt0.m151327o(host);
        String str = strM151327o2 != null ? strM151327o2 : "";
        List list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return false;
        }
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.m88377d(kt0.m151327o(it2.next()), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m130147b() throws InterruptedException {
        Object objM17629k = FepConfigManager.INSTANCE.m17633a().m17629k("fepWebConfigRegularEnable", "0");
        return Intrinsics.m88377d(kt0.m151327o(objM17629k), "1") || Intrinsics.m88377d(kt0.m151322j(objM17629k), Boolean.TRUE);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m130148c(@NotNull String bid) {
        Object objM225066constructorimpl;
        bid.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM151327o = kt0.m151327o(bid);
            if (strM151327o == null) {
                strM151327o = "";
            }
            if (strM151327o.length() == 0) {
                return null;
            }
            objM225066constructorimpl = Result.m225066constructorimpl(kt0.m151326n(FepConfigManager.m17620j(FepConfigManager.INSTANCE.m17633a(), strM151327o, null, 2, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        return (Map) (Result.m225072isFailureimpl(objM225066constructorimpl) ? null : objM225066constructorimpl);
    }
}
