package p153l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class iml0 {

    /* JADX INFO: renamed from: c */
    public Interpolator f115788c;

    /* JADX INFO: renamed from: d */
    public jml0 f115789d;

    /* JADX INFO: renamed from: e */
    public boolean f115790e;

    /* JADX INFO: renamed from: b */
    public long f115787b = -1;

    /* JADX INFO: renamed from: f */
    public final kml0 f115791f = new C17743a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<hml0> f115786a = new ArrayList<>();

    /* JADX INFO: renamed from: l.iml0$a */
    public class C17743a extends kml0 {

        /* JADX INFO: renamed from: a */
        public boolean f115792a = false;

        /* JADX INFO: renamed from: b */
        public int f115793b = 0;

        public C17743a() {
        }

        /* JADX INFO: renamed from: a */
        public void m140945a() {
            this.f115793b = 0;
            this.f115792a = false;
            iml0.this.m140938b();
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationEnd(View view) {
            int i = this.f115793b + 1;
            this.f115793b = i;
            if (i == iml0.this.f115786a.size()) {
                jml0 jml0Var = iml0.this.f115789d;
                if (jml0Var != null) {
                    jml0Var.onAnimationEnd(null);
                }
                m140945a();
            }
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationStart(View view) {
            if (this.f115792a) {
                return;
            }
            this.f115792a = true;
            jml0 jml0Var = iml0.this.f115789d;
            if (jml0Var != null) {
                jml0Var.onAnimationStart(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m140937a() {
        if (this.f115790e) {
            Iterator<hml0> it = this.f115786a.iterator();
            while (it.hasNext()) {
                it.next().m135940c();
            }
            this.f115790e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m140938b() {
        this.f115790e = false;
    }

    /* JADX INFO: renamed from: c */
    public iml0 m140939c(hml0 hml0Var) {
        if (!this.f115790e) {
            this.f115786a.add(hml0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public iml0 m140940d(hml0 hml0Var, hml0 hml0Var2) {
        this.f115786a.add(hml0Var);
        hml0Var2.m135946i(hml0Var.m135941d());
        this.f115786a.add(hml0Var2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public iml0 m140941e(long j) {
        if (!this.f115790e) {
            this.f115787b = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public iml0 m140942f(Interpolator interpolator) {
        if (!this.f115790e) {
            this.f115788c = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public iml0 m140943g(jml0 jml0Var) {
        if (!this.f115790e) {
            this.f115789d = jml0Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m140944h() {
        if (this.f115790e) {
            return;
        }
        for (hml0 hml0Var : this.f115786a) {
            long j = this.f115787b;
            if (j >= 0) {
                hml0Var.m135942e(j);
            }
            Interpolator interpolator = this.f115788c;
            if (interpolator != null) {
                hml0Var.m135943f(interpolator);
            }
            if (this.f115789d != null) {
                hml0Var.m135944g(this.f115791f);
            }
            hml0Var.m135948k();
        }
        this.f115790e = true;
    }
}
