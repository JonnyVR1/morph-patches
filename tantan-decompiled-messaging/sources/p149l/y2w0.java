package p149l;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y2w0 {

    /* JADX INFO: renamed from: d */
    public static final gnr f195716d = jmw0.m142235h(null);

    /* JADX INFO: renamed from: a */
    public final rmw0 f195717a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f195718b;

    /* JADX INFO: renamed from: c */
    public final z2w0 f195719c;

    public y2w0(rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, z2w0 z2w0Var) {
        this.f195717a = rmw0Var;
        this.f195718b = scheduledExecutorService;
        this.f195719c = z2w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final j2w0 m212752a(Object obj, gnr... gnrVarArr) {
        return new j2w0(this, obj, Arrays.asList(gnrVarArr), null);
    }

    /* JADX INFO: renamed from: b */
    public final x2w0 m212753b(Object obj, gnr gnrVar) {
        return new x2w0(this, obj, gnrVar, Collections.singletonList(gnrVar), gnrVar);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo119267f(Object obj);
}
