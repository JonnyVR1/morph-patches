package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class xse0 extends qr2 {

    /* JADX INFO: renamed from: a */
    private long f196085a = 0;

    /* JADX INFO: renamed from: b */
    private int f196086b;

    /* JADX INFO: renamed from: c */
    private long f196087c;

    /* JADX INFO: renamed from: d */
    private final bu9 f196088d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f196089e;

    /* JADX INFO: renamed from: f */
    private final duv f196090f;

    /* JADX INFO: renamed from: g */
    private final i0l0 f196091g;

    public xse0(CleverTapInstanceConfig cleverTapInstanceConfig, bu9 bu9Var, i0l0 i0l0Var, duv duvVar) {
        this.f196089e = cleverTapInstanceConfig;
        this.f196088d = bu9Var;
        this.f196091g = i0l0Var;
        this.f196090f = duvVar;
    }

    /* JADX INFO: renamed from: b */
    private void m212966b(Context context) {
        this.f196088d.m106456S(m212969d());
        this.f196089e.getLogger().verbose(this.f196089e.getAccountId(), "Session created with ID: " + this.f196088d.m106480k());
        int iM199852d = v5g0.m199852d(context, this.f196089e.getAccountId(), Constants.SESSION_ID_LAST, 0);
        int iM199852d2 = v5g0.m199852d(context, this.f196089e.getAccountId(), Constants.LAST_SESSION_EPOCH, 0);
        if (iM199852d2 > 0) {
            this.f196088d.m106468c0(iM199852d2 - iM199852d);
        }
        this.f196089e.getLogger().verbose(this.f196089e.getAccountId(), "Last session length: " + this.f196088d.m106484o() + " seconds");
        if (iM199852d == 0) {
            this.f196088d.m106461X(true);
        }
        v5g0.m199861r(context, this.f196089e.getAccountId(), Constants.SESSION_ID_LAST, this.f196088d.m106480k());
    }

    /* JADX INFO: renamed from: a */
    public void m212967a() {
        if (this.f196085a > 0 && System.currentTimeMillis() - this.f196085a > 1200000) {
            this.f196089e.getLogger().verbose(this.f196089e.getAccountId(), "Session Timed Out");
            m212968c();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m212968c() {
        this.f196088d.m106456S(0);
        this.f196088d.m106478i0(false);
        this.f196088d.m106453O(false);
        if (this.f196088d.m106443C()) {
            this.f196088d.m106461X(false);
        }
        this.f196089e.getLogger().verbose(this.f196089e.getAccountId(), "Session destroyed; Session ID is now 0");
        this.f196088d.m106467c();
        this.f196088d.m106465b();
        this.f196088d.m106464a();
        this.f196088d.m106469d();
    }

    /* JADX INFO: renamed from: d */
    public int m212969d() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: e */
    public void m212970e(Context context) {
        if (this.f196088d.m106491v()) {
            return;
        }
        this.f196088d.m106460W(true);
        i0l0 i0l0Var = this.f196091g;
        if (i0l0Var != null) {
            i0l0Var.m137996s(null);
        }
        m212966b(context);
    }

    /* JADX INFO: renamed from: f */
    public void m212971f(long j) {
        this.f196085a = j;
    }

    /* JADX INFO: renamed from: g */
    public void m212972g() {
        i4f i4fVarM118213p = this.f196090f.m118213p(Constants.APP_LAUNCHED_EVENT);
        if (i4fVarM118213p == null) {
            this.f196086b = -1;
        } else {
            this.f196086b = i4fVarM118213p.m138489a();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public void m212973h() {
        fek0 fek0VarM118209H = this.f196090f.m118209H(Constants.APP_LAUNCHED_EVENT);
        this.f196087c = fek0VarM118209H != null ? fek0VarM118209H.getLastTs() : -1L;
    }
}
