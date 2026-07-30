package p149l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1604d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class kld implements nbe, bhm {

    /* JADX INFO: renamed from: a */
    public final fq0 f123650a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f123651b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f123652c;

    /* JADX INFO: renamed from: d */
    public final by00 f123653d;

    /* JADX INFO: renamed from: e */
    public final r480 f123654e;

    /* JADX INFO: renamed from: f */
    public final tqb<cx3, da5> f123655f;

    /* JADX INFO: renamed from: g */
    public final syg0<Integer> f123656g;

    /* JADX INFO: renamed from: h */
    public final syg0<Integer> f123657h;

    /* JADX INFO: renamed from: i */
    public final syg0<Boolean> f123658i;

    /* JADX INFO: renamed from: j */
    public final syg0<Boolean> f123659j;

    /* JADX INFO: renamed from: k */
    public final syg0<Boolean> f123660k;

    /* JADX INFO: renamed from: l */
    public final syg0<Integer> f123661l;

    /* JADX INFO: renamed from: m */
    public final syg0<Integer> f123662m;

    /* JADX INFO: renamed from: n */
    public final syg0<Boolean> f123663n = vyg0.f183524b;

    public kld(fq0 fq0Var, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, by00 by00Var, r480 r480Var, tqb<cx3, da5> tqbVar, syg0<Integer> syg0Var, syg0<Integer> syg0Var2, syg0<Boolean> syg0Var3, syg0<Boolean> syg0Var4, syg0<Boolean> syg0Var5, syg0<Integer> syg0Var6, syg0<Integer> syg0Var7) {
        this.f123650a = fq0Var;
        this.f123651b = scheduledExecutorService;
        this.f123652c = executorService;
        this.f123653d = by00Var;
        this.f123654e = r480Var;
        this.f123655f = tqbVar;
        this.f123656g = syg0Var;
        this.f123657h = syg0Var2;
        this.f123658i = syg0Var3;
        this.f123659j = syg0Var4;
        this.f123661l = syg0Var6;
        this.f123660k = syg0Var5;
        this.f123662m = syg0Var7;
    }

    @Override // p149l.nbe
    /* JADX INFO: renamed from: a */
    public boolean mo146384a(da5 da5Var) {
        return da5Var instanceof z95;
    }

    @Override // p149l.nbe
    /* JADX INFO: renamed from: b */
    public Drawable mo146385b(da5 da5Var) {
        z95 z95Var = (z95) da5Var;
        nq0 nq0VarM217664J = z95Var.m217664J();
        uq0 uq0VarM146388e = m146388e((sq0) rf80.m179116g(z95Var.m217665M()), nq0VarM217664J != null ? nq0VarM217664J.getAnimatedBitmapConfig() : null, null);
        return this.f123663n.get().booleanValue() ? new ytq(uq0VarM146388e) : new aq0(uq0VarM146388e);
    }

    /* JADX INFO: renamed from: c */
    public final bq0 m146386c(sq0 sq0Var) {
        nq0 nq0VarM185429d = sq0Var.m185429d();
        return this.f123650a.mo8378a(sq0Var, new Rect(0, 0, nq0VarM185429d.getWidth(), nq0VarM185429d.getHeight()));
    }

    /* JADX INFO: renamed from: d */
    public final mq0 m146387d(sq0 sq0Var) {
        return new mq0(new br0(sq0Var.hashCode(), this.f123658i.get().booleanValue()), this.f123655f);
    }

    /* JADX INFO: renamed from: e */
    public final uq0 m146388e(sq0 sq0Var, Bitmap.Config config, ahm ahmVar) {
        o13 i4jVar;
        p13 p13VarM146390g;
        bq0 bq0VarM146386c = m146386c(sq0Var);
        cq0 cq0Var = new cq0(bq0VarM146386c);
        n13 n13VarM146389f = m146389f(sq0Var);
        dq0 dq0Var = new dq0(n13VarM146389f, bq0VarM146386c, this.f123659j.get().booleanValue());
        int iIntValue = this.f123657h.get().intValue();
        if (iIntValue > 0) {
            i4jVar = new poi(iIntValue);
            p13VarM146390g = m146390g(dq0Var, config);
        } else {
            i4jVar = null;
            p13VarM146390g = null;
        }
        ifd0 roundingOptions = ahmVar != null ? ahmVar.getRoundingOptions() : null;
        if (this.f123659j.get().booleanValue()) {
            i4jVar = new i4j(sq0Var.m185430e(), cq0Var, dq0Var, new C1604d(this.f123654e, this.f123661l.get().intValue(), this.f123662m.get().intValue()), this.f123660k.get().booleanValue());
        }
        return wq0.m204964o(new u03(this.f123654e, n13VarM146389f, cq0Var, dq0Var, this.f123659j.get().booleanValue(), i4jVar, p13VarM146390g, roundingOptions), this.f123653d, this.f123651b);
    }

    /* JADX INFO: renamed from: f */
    public final n13 m146389f(sq0 sq0Var) {
        int iIntValue = this.f123656g.get().intValue();
        if (iIntValue == 1) {
            return new m6j(m146387d(sq0Var), true);
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? new jk40() : new jxq();
        }
        return new m6j(m146387d(sq0Var), false);
    }

    /* JADX INFO: renamed from: g */
    public final p13 m146390g(q13 q13Var, Bitmap.Config config) {
        r480 r480Var = this.f123654e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new lld(r480Var, q13Var, config, this.f123652c);
    }
}
