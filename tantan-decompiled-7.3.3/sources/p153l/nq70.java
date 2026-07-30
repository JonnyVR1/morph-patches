package p153l;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class nq70 {

    /* JADX INFO: renamed from: a */
    public Resources f143181a;

    /* JADX INFO: renamed from: b */
    public ytd f143182b;

    /* JADX INFO: renamed from: c */
    public rce f143183c;

    /* JADX INFO: renamed from: d */
    public Executor f143184d;

    /* JADX INFO: renamed from: e */
    public mpy<by3, db5> f143185e;

    /* JADX INFO: renamed from: f */
    public ImmutableList<rce> f143186f;

    /* JADX INFO: renamed from: g */
    public a7h0<Boolean> f143187g;

    /* JADX INFO: renamed from: a */
    public void m164286a(Resources resources, ytd ytdVar, rce rceVar, Executor executor, mpy<by3, db5> mpyVar, ImmutableList<rce> immutableList, a7h0<Boolean> a7h0Var) {
        this.f143181a = resources;
        this.f143182b = ytdVar;
        this.f143183c = rceVar;
        this.f143184d = executor;
        this.f143185e = mpyVar;
        this.f143186f = immutableList;
        this.f143187g = a7h0Var;
    }

    /* JADX INFO: renamed from: b */
    public kq70 m164287b(Resources resources, ytd ytdVar, rce rceVar, Executor executor, mpy<by3, db5> mpyVar, ImmutableList<rce> immutableList) {
        return new kq70(resources, ytdVar, rceVar, executor, mpyVar, immutableList);
    }

    /* JADX INFO: renamed from: c */
    public kq70 m164288c() {
        kq70 kq70VarM164287b = m164287b(this.f143181a, this.f143182b, this.f143183c, this.f143184d, this.f143185e, this.f143186f);
        a7h0<Boolean> a7h0Var = this.f143187g;
        if (a7h0Var != null) {
            kq70VarM164287b.m150842z0(a7h0Var.get().booleanValue());
        }
        return kq70VarM164287b;
    }
}
