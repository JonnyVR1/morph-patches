package p153l;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/etm;", "", "<init>", "()V", "Ll/ow3;", "dao", "", "nowSec", "", "a", "(Ll/ow3;J)Z", "", "incoming", "", "", "pendingDeletes", "pendingReads", "videoSupported", "c", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ZJ)Ljava/util/List;", "full", "Ll/p85;", "b", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ZJ)Ll/p85;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class etm {

    @NotNull
    public static final etm INSTANCE = new etm();

    private etm() {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m122473a(ow3 dao, long nowSec) {
        long jM169495d = dao.m169495d();
        return 1 <= jM169495d && jM169495d < nowSec;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final p85 m122474b(@NotNull List<? extends ow3> full, @NotNull Set<String> pendingDeletes, @NotNull Set<String> pendingReads, boolean videoSupported, long nowSec) {
        full.getClass();
        pendingDeletes.getClass();
        pendingReads.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(full.size());
        for (ow3 ow3Var : full) {
            if (pendingDeletes.contains(ow3Var.m169496e())) {
                arrayList.add(ow3Var.m169496e());
            } else if (m122473a(ow3Var, nowSec)) {
                arrayList.add(ow3Var.m169496e());
            } else if (videoSupported || !ow3Var.m169492a()) {
                if (pendingReads.contains(ow3Var.m169496e())) {
                    ow3Var.m169510u(1);
                }
                arrayList2.add(ow3Var);
            } else {
                arrayList.add(ow3Var.m169496e());
            }
        }
        return new p85(arrayList, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<ow3> m122475c(@NotNull List<? extends ow3> incoming, @NotNull Set<String> pendingDeletes, @NotNull Set<String> pendingReads, boolean videoSupported, long nowSec) {
        incoming.getClass();
        pendingDeletes.getClass();
        pendingReads.getClass();
        ArrayList arrayList = new ArrayList();
        for (ow3 ow3Var : incoming) {
            if (pendingDeletes.contains(ow3Var.m169496e()) || ((!videoSupported && ow3Var.m169492a()) || INSTANCE.m122473a(ow3Var, nowSec))) {
                ow3Var = null;
            } else if (pendingReads.contains(ow3Var.m169496e())) {
                ow3Var.m169510u(1);
            }
            if (ow3Var != null) {
                arrayList.add(ow3Var);
            }
        }
        return arrayList;
    }
}
