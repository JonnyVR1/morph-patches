package p153l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oyg0 implements vjg0 {

    /* JADX INFO: renamed from: a */
    public final Handler f149795a;

    public oyg0(Handler handler) {
        this.f149795a = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m169858a(aug0 aug0Var, int i, int i2, Map map) {
        int i3 = aug0Var.f73493b;
        Objects.toString(map);
        if (aug0Var.f73505n) {
            this.f149795a.post(new mmg0(aug0Var, i, i2, map));
        } else {
            aug0Var.f73507p.getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m169859b(aug0 aug0Var, int i, long j) {
        if (aug0Var.f73506o > 0) {
            aug0Var.f73508q.set(SystemClock.uptimeMillis());
        }
        if (aug0Var.f73505n) {
            this.f149795a.post(new lvg0(aug0Var, i, j));
        } else {
            aug0Var.f73507p.m181855h(aug0Var, i, j);
        }
    }

    @Override // p153l.vjg0
    /* JADX INFO: renamed from: c */
    public final void mo169860c(aug0 aug0Var) {
        int i = aug0Var.f73493b;
        jwg0.m147162a().getClass();
        if (aug0Var.f73505n) {
            this.f149795a.post(new mtg0(aug0Var));
        } else {
            aug0Var.f73507p.mo169860c(aug0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m169861d(aug0 aug0Var, int i, Exception exc) {
        if (i == 2) {
            int i2 = aug0Var.f73493b;
            Objects.toString(exc);
        }
        jwg0.m147162a().getClass();
        if (aug0Var.f73505n) {
            this.f149795a.post(new jng0(aug0Var, i, exc));
        } else {
            aug0Var.f73507p.m181856i(aug0Var, i, exc);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m169862e(aug0 aug0Var, int i, Map map) {
        int i2 = aug0Var.f73493b;
        Objects.toString(map);
        if (aug0Var.f73505n) {
            this.f149795a.post(new lhg0(aug0Var, i, map));
        } else {
            aug0Var.f73507p.getClass();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m169863f(aug0 aug0Var, Map map) {
        int i = aug0Var.f73493b;
        Objects.toString(map);
        if (aug0Var.f73505n) {
            this.f149795a.post(new hxg0(aug0Var, map));
        } else {
            aug0Var.f73507p.getClass();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m169864g(aug0 aug0Var, bog0 bog0Var, int i) {
        int i2 = aug0Var.f73493b;
        jwg0.m147162a().getClass();
        if (aug0Var.f73505n) {
            this.f149795a.post(new pfg0(aug0Var, bog0Var, i));
        } else {
            aug0Var.f73507p.m181854g(aug0Var, bog0Var, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m169865h(aug0 aug0Var, int i, Map map) {
        int i2 = aug0Var.f73493b;
        Objects.toString(map);
        if (aug0Var.f73505n) {
            this.f149795a.post(new wzg0(aug0Var, i, map));
        } else {
            aug0Var.f73507p.getClass();
        }
    }
}
