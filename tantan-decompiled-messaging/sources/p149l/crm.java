package p149l;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/crm;", "", "<init>", "()V", "Ll/pv3;", "dao", "", "nowSec", "", "a", "(Ll/pv3;J)Z", "", "incoming", "", "", "pendingDeletes", "pendingReads", "videoSupported", "c", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ZJ)Ljava/util/List;", "full", "Ll/o75;", "b", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ZJ)Ll/o75;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class crm {

    @NotNull
    public static final crm INSTANCE = new crm();

    private crm() {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m108419a(pv3 dao, long nowSec) {
        long jM171501d = dao.m171501d();
        return 1 <= jM171501d && jM171501d < nowSec;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final o75 m108420b(@NotNull List<? extends pv3> full, @NotNull Set<String> pendingDeletes, @NotNull Set<String> pendingReads, boolean videoSupported, long nowSec) {
        full.getClass();
        pendingDeletes.getClass();
        pendingReads.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(full.size());
        for (pv3 pv3Var : full) {
            if (pendingDeletes.contains(pv3Var.m171502e())) {
                arrayList.add(pv3Var.m171502e());
            } else if (m108419a(pv3Var, nowSec)) {
                arrayList.add(pv3Var.m171502e());
            } else if (videoSupported || !pv3Var.m171498a()) {
                if (pendingReads.contains(pv3Var.m171502e())) {
                    pv3Var.m171516u(1);
                }
                arrayList2.add(pv3Var);
            } else {
                arrayList.add(pv3Var.m171502e());
            }
        }
        return new o75(arrayList, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<pv3> m108421c(@NotNull List<? extends pv3> incoming, @NotNull Set<String> pendingDeletes, @NotNull Set<String> pendingReads, boolean videoSupported, long nowSec) {
        incoming.getClass();
        pendingDeletes.getClass();
        pendingReads.getClass();
        ArrayList arrayList = new ArrayList();
        for (pv3 pv3Var : incoming) {
            if (pendingDeletes.contains(pv3Var.m171502e()) || ((!videoSupported && pv3Var.m171498a()) || INSTANCE.m108419a(pv3Var, nowSec))) {
                pv3Var = null;
            } else if (pendingReads.contains(pv3Var.m171502e())) {
                pv3Var.m171516u(1);
            }
            if (pv3Var != null) {
                arrayList.add(pv3Var);
            }
        }
        return arrayList;
    }
}
