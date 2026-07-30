package p149l;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class hi70 {

    /* JADX INFO: renamed from: a */
    public Resources f107883a;

    /* JADX INFO: renamed from: b */
    public ksd f107884b;

    /* JADX INFO: renamed from: c */
    public nbe f107885c;

    /* JADX INFO: renamed from: d */
    public Executor f107886d;

    /* JADX INFO: renamed from: e */
    public pgy<cx3, da5> f107887e;

    /* JADX INFO: renamed from: f */
    public ImmutableList<nbe> f107888f;

    /* JADX INFO: renamed from: g */
    public syg0<Boolean> f107889g;

    /* JADX INFO: renamed from: a */
    public void m131225a(Resources resources, ksd ksdVar, nbe nbeVar, Executor executor, pgy<cx3, da5> pgyVar, ImmutableList<nbe> immutableList, syg0<Boolean> syg0Var) {
        this.f107883a = resources;
        this.f107884b = ksdVar;
        this.f107885c = nbeVar;
        this.f107886d = executor;
        this.f107887e = pgyVar;
        this.f107888f = immutableList;
        this.f107889g = syg0Var;
    }

    /* JADX INFO: renamed from: b */
    public ei70 m131226b(Resources resources, ksd ksdVar, nbe nbeVar, Executor executor, pgy<cx3, da5> pgyVar, ImmutableList<nbe> immutableList) {
        return new ei70(resources, ksdVar, nbeVar, executor, pgyVar, immutableList);
    }

    /* JADX INFO: renamed from: c */
    public ei70 m131227c() {
        ei70 ei70VarM131226b = m131226b(this.f107883a, this.f107884b, this.f107885c, this.f107886d, this.f107887e, this.f107888f);
        syg0<Boolean> syg0Var = this.f107889g;
        if (syg0Var != null) {
            ei70VarM131226b.m116653z0(syg0Var.get().booleanValue());
        }
        return ei70VarM131226b;
    }
}
