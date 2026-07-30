package p153l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1627d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class qmd implements rce, ejm {

    /* JADX INFO: renamed from: a */
    public final bq0 f158323a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f158324b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f158325c;

    /* JADX INFO: renamed from: d */
    public final l610 f158326d;

    /* JADX INFO: renamed from: e */
    public final xc80 f158327e;

    /* JADX INFO: renamed from: f */
    public final hsb<by3, db5> f158328f;

    /* JADX INFO: renamed from: g */
    public final a7h0<Integer> f158329g;

    /* JADX INFO: renamed from: h */
    public final a7h0<Integer> f158330h;

    /* JADX INFO: renamed from: i */
    public final a7h0<Boolean> f158331i;

    /* JADX INFO: renamed from: j */
    public final a7h0<Boolean> f158332j;

    /* JADX INFO: renamed from: k */
    public final a7h0<Boolean> f158333k;

    /* JADX INFO: renamed from: l */
    public final a7h0<Integer> f158334l;

    /* JADX INFO: renamed from: m */
    public final a7h0<Integer> f158335m;

    /* JADX INFO: renamed from: n */
    public final a7h0<Boolean> f158336n = d7h0.f85513b;

    public qmd(bq0 bq0Var, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, l610 l610Var, xc80 xc80Var, hsb<by3, db5> hsbVar, a7h0<Integer> a7h0Var, a7h0<Integer> a7h0Var2, a7h0<Boolean> a7h0Var3, a7h0<Boolean> a7h0Var4, a7h0<Boolean> a7h0Var5, a7h0<Integer> a7h0Var6, a7h0<Integer> a7h0Var7) {
        this.f158323a = bq0Var;
        this.f158324b = scheduledExecutorService;
        this.f158325c = executorService;
        this.f158326d = l610Var;
        this.f158327e = xc80Var;
        this.f158328f = hsbVar;
        this.f158329g = a7h0Var;
        this.f158330h = a7h0Var2;
        this.f158331i = a7h0Var3;
        this.f158332j = a7h0Var4;
        this.f158334l = a7h0Var6;
        this.f158333k = a7h0Var5;
        this.f158335m = a7h0Var7;
    }

    @Override // p153l.rce
    /* JADX INFO: renamed from: a */
    public boolean mo99068a(db5 db5Var) {
        return db5Var instanceof za5;
    }

    @Override // p153l.rce
    /* JADX INFO: renamed from: b */
    public Drawable mo99069b(db5 db5Var) {
        za5 za5Var = (za5) db5Var;
        jq0 jq0VarM219099J = za5Var.m219099J();
        yq0 yq0VarM177092e = m177092e((oq0) wn80.m207182g(za5Var.m219100M()), jq0VarM219099J != null ? jq0VarM219099J.getAnimatedBitmapConfig() : null, null);
        return this.f158336n.get().booleanValue() ? new zvq(yq0VarM177092e) : new wp0(yq0VarM177092e);
    }

    /* JADX INFO: renamed from: c */
    public final xp0 m177090c(oq0 oq0Var) {
        jq0 jq0VarM168782d = oq0Var.m168782d();
        return this.f158323a.mo8432a(oq0Var, new Rect(0, 0, jq0VarM168782d.getWidth(), jq0VarM168782d.getHeight()));
    }

    /* JADX INFO: renamed from: d */
    public final iq0 m177091d(oq0 oq0Var) {
        return new iq0(new fr0(oq0Var.hashCode(), this.f158331i.get().booleanValue()), this.f158328f);
    }

    /* JADX INFO: renamed from: e */
    public final yq0 m177092e(oq0 oq0Var, Bitmap.Config config, djm djmVar) {
        d23 d7jVar;
        e23 e23VarM177094g;
        xp0 xp0VarM177090c = m177090c(oq0Var);
        yp0 yp0Var = new yp0(xp0VarM177090c);
        c23 c23VarM177093f = m177093f(oq0Var);
        zp0 zp0Var = new zp0(c23VarM177093f, xp0VarM177090c, this.f158332j.get().booleanValue());
        int iIntValue = this.f158330h.get().intValue();
        if (iIntValue > 0) {
            d7jVar = new lri(iIntValue);
            e23VarM177094g = m177094g(zp0Var, config);
        } else {
            d7jVar = null;
            e23VarM177094g = null;
        }
        lnd0 roundingOptions = djmVar != null ? djmVar.getRoundingOptions() : null;
        if (this.f158332j.get().booleanValue()) {
            d7jVar = new d7j(oq0Var.m168783e(), yp0Var, zp0Var, new C1627d(this.f158327e, this.f158334l.get().intValue(), this.f158335m.get().intValue()), this.f158333k.get().booleanValue());
        }
        return ar0.m99579o(new j13(this.f158327e, c23VarM177093f, yp0Var, zp0Var, this.f158332j.get().booleanValue(), d7jVar, e23VarM177094g, roundingOptions), this.f158326d, this.f158324b);
    }

    /* JADX INFO: renamed from: f */
    public final c23 m177093f(oq0 oq0Var) {
        int iIntValue = this.f158329g.get().intValue();
        if (iIntValue == 1) {
            return new g9j(m177091d(oq0Var), true);
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? new xs40() : new jzq();
        }
        return new g9j(m177091d(oq0Var), false);
    }

    /* JADX INFO: renamed from: g */
    public final e23 m177094g(f23 f23Var, Bitmap.Config config) {
        xc80 xc80Var = this.f158327e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new rmd(xc80Var, f23Var, config, this.f158325c);
    }
}
