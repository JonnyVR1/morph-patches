package p149l;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class gi70 implements syg0<fi70> {

    /* JADX INFO: renamed from: a */
    public final Context f102851a;

    /* JADX INFO: renamed from: b */
    public final ohm f102852b;

    /* JADX INFO: renamed from: c */
    public final hi70 f102853c;

    /* JADX INFO: renamed from: d */
    public final Set<q26> f102854d;

    /* JADX INFO: renamed from: e */
    public final Set<p26> f102855e;

    /* JADX INFO: renamed from: f */
    public final dhm f102856f;

    public gi70(Context context, shm shmVar, Set<q26> set, Set<p26> set2, gce gceVar) {
        this.f102851a = context;
        ohm ohmVarM184255k = shmVar.m184255k();
        this.f102852b = ohmVarM184255k;
        hi70 hi70Var = new hi70();
        this.f102853c = hi70Var;
        hi70Var.m131225a(context.getResources(), ksd.m147051b(), shmVar.m184246b(context), bjj0.m102185v(), ohmVarM184255k.m164414n(), null, null);
        this.f102854d = set;
        this.f102855e = set2;
        this.f102856f = null;
    }

    @Override // p149l.syg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fi70 get() {
        return new fi70(this.f102851a, this.f102853c, this.f102852b, this.f102854d, this.f102855e).m121498M(this.f102856f);
    }

    public gi70(Context context, shm shmVar, gce gceVar) {
        this(context, shmVar, null, null, gceVar);
    }

    public gi70(Context context, gce gceVar) {
        this(context, shm.m184242m(), gceVar);
    }
}
