package p153l;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class mq70 implements a7h0<lq70> {

    /* JADX INFO: renamed from: a */
    public final Context f138016a;

    /* JADX INFO: renamed from: b */
    public final rjm f138017b;

    /* JADX INFO: renamed from: c */
    public final nq70 f138018c;

    /* JADX INFO: renamed from: d */
    public final Set<v36> f138019d;

    /* JADX INFO: renamed from: e */
    public final Set<u36> f138020e;

    /* JADX INFO: renamed from: f */
    public final gjm f138021f;

    public mq70(Context context, vjm vjmVar, Set<v36> set, Set<u36> set2, kde kdeVar) {
        this.f138016a = context;
        rjm rjmVarM201540k = vjmVar.m201540k();
        this.f138017b = rjmVarM201540k;
        nq70 nq70Var = new nq70();
        this.f138018c = nq70Var;
        nq70Var.m164286a(context.getResources(), ytd.m217301b(), vjmVar.m201531b(context), esj0.m122371v(), rjmVarM201540k.m181725n(), null, null);
        this.f138019d = set;
        this.f138020e = set2;
        this.f138021f = null;
    }

    @Override // p153l.a7h0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lq70 get() {
        return new lq70(this.f138016a, this.f138018c, this.f138017b, this.f138019d, this.f138020e).m155329M(this.f138021f);
    }

    public mq70(Context context, vjm vjmVar, kde kdeVar) {
        this(context, vjmVar, null, null, kdeVar);
    }

    public mq70(Context context, kde kdeVar) {
        this(context, vjm.m201527m(), kdeVar);
    }
}
