package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.impl.constraints.AbstractC0787a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15486o;
import p149l.b7j0;
import p149l.haq0;
import p149l.k9q0;
import p149l.ld50;
import p149l.qsd;
import p149l.rsd;
import p149l.saq0;
import p149l.tfp0;
import p149l.txv;
import p149l.vuf0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0778c implements ld50, saq0.InterfaceC19894a {

    /* JADX INFO: renamed from: o */
    public static final String f3547o = txv.m190978i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3548a;

    /* JADX INFO: renamed from: b */
    public final int f3549b;

    /* JADX INFO: renamed from: c */
    public final k9q0 f3550c;

    /* JADX INFO: renamed from: d */
    public final C0779d f3551d;

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
    public final vuf0 f3559l;

    /* JADX INFO: renamed from: m */
    public final CoroutineDispatcher f3560m;

    /* JADX INFO: renamed from: n */
    public volatile InterfaceC15486o f3561n;

    public C0778c(@NonNull Context context, int i, @NonNull C0779d c0779d, @NonNull vuf0 vuf0Var) {
        this.f3548a = context;
        this.f3549b = i;
        this.f3551d = c0779d;
        this.f3550c = vuf0Var.getId();
        this.f3559l = vuf0Var;
        b7j0 b7j0VarM182749t = c0779d.m4558f().m182749t();
        this.f3555h = c0779d.m4557e().mo187638d();
        this.f3556i = c0779d.m4557e().mo187637c();
        this.f3560m = c0779d.m4557e().mo187636a();
        this.f3552e = new WorkConstraintsTracker(b7j0VarM182749t);
        this.f3558k = false;
        this.f3554g = 0;
        this.f3553f = new Object();
    }

    @Override // p149l.ld50
    /* JADX INFO: renamed from: a */
    public void mo4546a(@NonNull haq0 haq0Var, @NonNull AbstractC0787a abstractC0787a) {
        boolean z = abstractC0787a instanceof AbstractC0787a.a;
        Executor executor = this.f3555h;
        if (z) {
            executor.execute(new rsd(this));
        } else {
            executor.execute(new qsd(this));
        }
    }

    @Override // p149l.saq0.InterfaceC19894a
    /* JADX INFO: renamed from: b */
    public void mo4547b(@NonNull k9q0 k9q0Var) {
        txv.m190976e().mo190979a(f3547o, "Exceeded time limits on execution for " + k9q0Var);
        this.f3555h.execute(new qsd(this));
    }

    /* JADX INFO: renamed from: e */
    public final void m4548e() {
        synchronized (this.f3553f) {
            try {
                if (this.f3561n != null) {
                    this.f3561n.mo93695n(null);
                }
                this.f3551d.m4559g().m183090b(this.f3550c);
                PowerManager.WakeLock wakeLock = this.f3557j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    txv.m190976e().mo190979a(f3547o, "Releasing wakelock " + this.f3557j + "for WorkSpec " + this.f3550c);
                    this.f3557j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public void m4549f() {
        String strM145115b = this.f3550c.getWorkSpecId();
        this.f3557j = tfp0.m188751b(this.f3548a, strM145115b + " (" + this.f3549b + ")");
        txv txvVarM190976e = txv.m190976e();
        String str = f3547o;
        txvVarM190976e.mo190979a(str, "Acquiring wakelock " + this.f3557j + "for WorkSpec " + strM145115b);
        this.f3557j.acquire();
        haq0 haq0VarMo135190v = this.f3551d.m4558f().m182750u().workSpecDao().mo135190v(strM145115b);
        if (haq0VarMo135190v == null) {
            this.f3555h.execute(new qsd(this));
            return;
        }
        boolean zM130165k = haq0VarMo135190v.m130165k();
        this.f3558k = zM130165k;
        if (zM130165k) {
            this.f3561n = WorkConstraintsTrackerKt.m4582c(this.f3552e, haq0VarMo135190v, this.f3560m, this);
            return;
        }
        txv.m190976e().mo190979a(str, "No constraints for " + strM145115b);
        this.f3555h.execute(new rsd(this));
    }

    /* JADX INFO: renamed from: g */
    public void m4550g(boolean z) {
        txv.m190976e().mo190979a(f3547o, "onExecuted " + this.f3550c + ", " + z);
        m4548e();
        if (z) {
            this.f3556i.execute(new C0779d.b(this.f3551d, C0776a.m4530d(this.f3548a, this.f3550c), this.f3549b));
        }
        if (this.f3558k) {
            this.f3556i.execute(new C0779d.b(this.f3551d, C0776a.m4527a(this.f3548a), this.f3549b));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4551h() {
        if (this.f3554g != 0) {
            txv.m190976e().mo190979a(f3547o, "Already started work for " + this.f3550c);
            return;
        }
        this.f3554g = 1;
        txv.m190976e().mo190979a(f3547o, "onAllConstraintsMet for " + this.f3550c);
        if (this.f3551d.m4556d().m4521o(this.f3559l)) {
            this.f3551d.m4559g().m183089a(this.f3550c, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
        } else {
            m4548e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4552i() {
        String strM145115b = this.f3550c.getWorkSpecId();
        if (this.f3554g >= 2) {
            txv.m190976e().mo190979a(f3547o, "Already stopped work for " + strM145115b);
            return;
        }
        this.f3554g = 2;
        txv txvVarM190976e = txv.m190976e();
        String str = f3547o;
        txvVarM190976e.mo190979a(str, "Stopping work for WorkSpec " + strM145115b);
        this.f3556i.execute(new C0779d.b(this.f3551d, C0776a.m4531e(this.f3548a, this.f3550c), this.f3549b));
        if (!this.f3551d.m4556d().m4517k(this.f3550c.getWorkSpecId())) {
            txv.m190976e().mo190979a(str, "Processor does not have WorkSpec " + strM145115b + ". No need to reschedule");
            return;
        }
        txv.m190976e().mo190979a(str, "WorkSpec " + strM145115b + " needs to be rescheduled");
        this.f3556i.execute(new C0779d.b(this.f3551d, C0776a.m4530d(this.f3548a, this.f3550c), this.f3549b));
    }
}
