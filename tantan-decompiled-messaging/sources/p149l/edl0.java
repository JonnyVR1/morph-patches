package p149l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class edl0 {

    /* JADX INFO: renamed from: c */
    public Interpolator f90617c;

    /* JADX INFO: renamed from: d */
    public fdl0 f90618d;

    /* JADX INFO: renamed from: e */
    public boolean f90619e;

    /* JADX INFO: renamed from: b */
    public long f90616b = -1;

    /* JADX INFO: renamed from: f */
    public final gdl0 f90620f = new C16580a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<ddl0> f90615a = new ArrayList<>();

    /* JADX INFO: renamed from: l.edl0$a */
    public class C16580a extends gdl0 {

        /* JADX INFO: renamed from: a */
        public boolean f90621a = false;

        /* JADX INFO: renamed from: b */
        public int f90622b = 0;

        public C16580a() {
        }

        /* JADX INFO: renamed from: a */
        public void m115820a() {
            this.f90622b = 0;
            this.f90621a = false;
            edl0.this.m115813b();
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationEnd(View view) {
            int i = this.f90622b + 1;
            this.f90622b = i;
            if (i == edl0.this.f90615a.size()) {
                fdl0 fdl0Var = edl0.this.f90618d;
                if (fdl0Var != null) {
                    fdl0Var.onAnimationEnd(null);
                }
                m115820a();
            }
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationStart(View view) {
            if (this.f90621a) {
                return;
            }
            this.f90621a = true;
            fdl0 fdl0Var = edl0.this.f90618d;
            if (fdl0Var != null) {
                fdl0Var.onAnimationStart(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m115812a() {
        if (this.f90619e) {
            Iterator<ddl0> it = this.f90615a.iterator();
            while (it.hasNext()) {
                it.next().m111031c();
            }
            this.f90619e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m115813b() {
        this.f90619e = false;
    }

    /* JADX INFO: renamed from: c */
    public edl0 m115814c(ddl0 ddl0Var) {
        if (!this.f90619e) {
            this.f90615a.add(ddl0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public edl0 m115815d(ddl0 ddl0Var, ddl0 ddl0Var2) {
        this.f90615a.add(ddl0Var);
        ddl0Var2.m111037i(ddl0Var.m111032d());
        this.f90615a.add(ddl0Var2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public edl0 m115816e(long j) {
        if (!this.f90619e) {
            this.f90616b = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public edl0 m115817f(Interpolator interpolator) {
        if (!this.f90619e) {
            this.f90617c = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public edl0 m115818g(fdl0 fdl0Var) {
        if (!this.f90619e) {
            this.f90618d = fdl0Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m115819h() {
        if (this.f90619e) {
            return;
        }
        for (ddl0 ddl0Var : this.f90615a) {
            long j = this.f90616b;
            if (j >= 0) {
                ddl0Var.m111033e(j);
            }
            Interpolator interpolator = this.f90617c;
            if (interpolator != null) {
                ddl0Var.m111034f(interpolator);
            }
            if (this.f90618d != null) {
                ddl0Var.m111035g(this.f90620f);
            }
            ddl0Var.m111039k();
        }
        this.f90619e = true;
    }
}
