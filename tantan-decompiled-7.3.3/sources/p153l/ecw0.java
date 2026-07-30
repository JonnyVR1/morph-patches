package p153l;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ecw0 {

    /* JADX INFO: renamed from: d */
    public static final hpr f93111d = pvw0.m173981h(null);

    /* JADX INFO: renamed from: a */
    public final xvw0 f93112a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f93113b;

    /* JADX INFO: renamed from: c */
    public final fcw0 f93114c;

    public ecw0(xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, fcw0 fcw0Var) {
        this.f93112a = xvw0Var;
        this.f93113b = scheduledExecutorService;
        this.f93114c = fcw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final pbw0 m120408a(Object obj, hpr... hprVarArr) {
        return new pbw0(this, obj, Arrays.asList(hprVarArr), null);
    }

    /* JADX INFO: renamed from: b */
    public final dcw0 m120409b(Object obj, hpr hprVar) {
        return new dcw0(this, obj, hprVar, Collections.singletonList(hprVar), hprVar);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo120410f(Object obj);
}
