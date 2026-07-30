package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.impl.constraints.AbstractC0789a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15593o;
import p153l.e3g0;
import p153l.eud;
import p153l.fgj0;
import p153l.fud;
import p153l.mjq0;
import p153l.piq0;
import p153l.qzv;
import p153l.sl50;
import p153l.xjq0;
import p153l.xop0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0780c implements sl50, xjq0.InterfaceC21354a {

    /* JADX INFO: renamed from: o */
    public static final String f3547o = qzv.m178831i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3548a;

    /* JADX INFO: renamed from: b */
    public final int f3549b;

    /* JADX INFO: renamed from: c */
    public final piq0 f3550c;

    /* JADX INFO: renamed from: d */
    public final C0781d f3551d;

    /* JADX INFO: renamed from: e */
    public final WorkConstraintsTracker f3552e;

    /* JADX INFO: renamed from: f */
    public final Object f3553f;

    /* JADX INFO: renamed from: g */
    public int f3554g;

    /* JADX INFO: renamed from: h */
    public final Executor f3555h;

    /* JADX INFO: renamed from: i */
    public final Executor f3556i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PowerManager.WakeLock f3557j;

    /* JADX INFO: renamed from: k */
    public boolean f3558k;

    /* JADX INFO: renamed from: l */
    public final e3g0 f3559l;

    /* JADX INFO: renamed from: m */
    public final CoroutineDispatcher f3560m;

    /* JADX INFO: renamed from: n */
    public volatile InterfaceC15593o f3561n;

    public C0780c(@NonNull Context context, int i, @NonNull C0781d c0781d, @NonNull e3g0 e3g0Var) {
        this.f3548a = context;
        this.f3549b = i;
        this.f3551d = c0781d;
        this.f3550c = e3g0Var.getId();
        this.f3559l = e3g0Var;
        fgj0 fgj0VarM211162t = c0781d.m4560f().m211162t();
        this.f3555h = c0781d.m4559e().mo216346d();
        this.f3556i = c0781d.m4559e().mo216345c();
        this.f3560m = c0781d.m4559e().mo216344a();
        this.f3552e = new WorkConstraintsTracker(fgj0VarM211162t);
        this.f3558k = false;
        this.f3554g = 0;
        this.f3553f = new Object();
    }

    @Override // p153l.sl50
    /* JADX INFO: renamed from: a */
    public void mo4548a(@NonNull mjq0 mjq0Var, @NonNull AbstractC0789a abstractC0789a) {
        boolean z = abstractC0789a instanceof AbstractC0789a.a;
        Executor executor = this.f3555h;
        if (z) {
            executor.execute(new fud(this));
        } else {
            executor.execute(new eud(this));
        }
    }

    @Override // p153l.xjq0.InterfaceC21354a
    /* JADX INFO: renamed from: b */
    public void mo4549b(@NonNull piq0 piq0Var) {
        qzv.m178829e().mo178832a(f3547o, "Exceeded time limits on execution for " + piq0Var);
        this.f3555h.execute(new eud(this));
    }

    /* JADX INFO: renamed from: e */
    public final void m4550e() {
        synchronized (this.f3553f) {
            try {
                if (this.f3561n != null) {
                    this.f3561n.mo94586n(null);
                }
                this.f3551d.m4561g().m211262b(this.f3550c);
                PowerManager.WakeLock wakeLock = this.f3557j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    qzv.m178829e().mo178832a(f3547o, "Releasing wakelock " + this.f3557j + "for WorkSpec " + this.f3550c);
                    this.f3557j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public void m4551f() {
        String strM172462b = this.f3550c.getWorkSpecId();
        this.f3557j = xop0.m212478b(this.f3548a, strM172462b + " (" + this.f3549b + ")");
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f3547o;
        qzvVarM178829e.mo178832a(str, "Acquiring wakelock " + this.f3557j + "for WorkSpec " + strM172462b);
        this.f3557j.acquire();
        mjq0 mjq0VarMo163457v = this.f3551d.m4560f().m211163u().workSpecDao().mo163457v(strM172462b);
        if (mjq0VarMo163457v == null) {
            this.f3555h.execute(new eud(this));
            return;
        }
        boolean zM158607k = mjq0VarMo163457v.m158607k();
        this.f3558k = zM158607k;
        if (zM158607k) {
            this.f3561n = WorkConstraintsTrackerKt.m4584c(this.f3552e, mjq0VarMo163457v, this.f3560m, this);
            return;
        }
        qzv.m178829e().mo178832a(str, "No constraints for " + strM172462b);
        this.f3555h.execute(new fud(this));
    }

    /* JADX INFO: renamed from: g */
    public void m4552g(boolean z) {
        qzv.m178829e().mo178832a(f3547o, "onExecuted " + this.f3550c + ", " + z);
        m4550e();
        if (z) {
            this.f3556i.execute(new C0781d.b(this.f3551d, C0778a.m4532d(this.f3548a, this.f3550c), this.f3549b));
        }
        if (this.f3558k) {
            this.f3556i.execute(new C0781d.b(this.f3551d, C0778a.m4529a(this.f3548a), this.f3549b));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4553h() {
        if (this.f3554g != 0) {
            qzv.m178829e().mo178832a(f3547o, "Already started work for " + this.f3550c);
            return;
        }
        this.f3554g = 1;
        qzv.m178829e().mo178832a(f3547o, "onAllConstraintsMet for " + this.f3550c);
        if (this.f3551d.m4558d().m4523o(this.f3559l)) {
            this.f3551d.m4561g().m211261a(this.f3550c, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
        } else {
            m4550e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4554i() {
        String strM172462b = this.f3550c.getWorkSpecId();
        if (this.f3554g >= 2) {
            qzv.m178829e().mo178832a(f3547o, "Already stopped work for " + strM172462b);
            return;
        }
        this.f3554g = 2;
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f3547o;
        qzvVarM178829e.mo178832a(str, "Stopping work for WorkSpec " + strM172462b);
        this.f3556i.execute(new C0781d.b(this.f3551d, C0778a.m4533e(this.f3548a, this.f3550c), this.f3549b));
        if (!this.f3551d.m4558d().m4519k(this.f3550c.getWorkSpecId())) {
            qzv.m178829e().mo178832a(str, "Processor does not have WorkSpec " + strM172462b + ". No need to reschedule");
            return;
        }
        qzv.m178829e().mo178832a(str, "WorkSpec " + strM172462b + " needs to be rescheduled");
        this.f3556i.execute(new C0781d.b(this.f3551d, C0778a.m4532d(this.f3548a, this.f3550c), this.f3549b));
    }
}
