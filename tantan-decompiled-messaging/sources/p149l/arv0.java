package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class arv0 {
    /* JADX INFO: renamed from: a */
    public static qlv0 m98571a(ypv0 ypv0Var, ejv0 ejv0Var, ScheduledExecutorService scheduledExecutorService, int i) {
        qlv0 qlv0Var = ypv0Var;
        if (i == 0) {
            qlv0Var = ejv0Var;
        }
        return new mjv0(qlv0Var, 0L, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: b */
    public static qlv0 m98572b(iqv0 iqv0Var, ScheduledExecutorService scheduledExecutorService) {
        return new mjv0(iqv0Var, ((Long) d1s0.m109677c().m144697a(m7s0.f132148Z3)).longValue(), scheduledExecutorService);
    }

    /* JADX INFO: renamed from: c */
    public static qlv0 m98573c(jrv0 jrv0Var, ScheduledExecutorService scheduledExecutorService) {
        return new mjv0(jrv0Var, 0L, scheduledExecutorService);
    }
}
