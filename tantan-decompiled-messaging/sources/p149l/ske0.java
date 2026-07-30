package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ske0 extends ar2 {

    /* JADX INFO: renamed from: a */
    private long f164962a = 0;

    /* JADX INFO: renamed from: b */
    private int f164963b;

    /* JADX INFO: renamed from: c */
    private long f164964c;

    /* JADX INFO: renamed from: d */
    private final qs9 f164965d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f164966e;

    /* JADX INFO: renamed from: f */
    private final csv f164967f;

    /* JADX INFO: renamed from: g */
    private final crk0 f164968g;

    public ske0(CleverTapInstanceConfig cleverTapInstanceConfig, qs9 qs9Var, crk0 crk0Var, csv csvVar) {
        this.f164966e = cleverTapInstanceConfig;
        this.f164965d = qs9Var;
        this.f164968g = crk0Var;
        this.f164967f = csvVar;
    }

    /* JADX INFO: renamed from: b */
    private void m184587b(Context context) {
        this.f164965d.m176189S(m184590d());
        this.f164966e.getLogger().verbose(this.f164966e.getAccountId(), "Session created with ID: " + this.f164965d.m176213k());
        int iM156886d = mxf0.m156886d(context, this.f164966e.getAccountId(), Constants.SESSION_ID_LAST, 0);
        int iM156886d2 = mxf0.m156886d(context, this.f164966e.getAccountId(), Constants.LAST_SESSION_EPOCH, 0);
        if (iM156886d2 > 0) {
            this.f164965d.m176201c0(iM156886d2 - iM156886d);
        }
        this.f164966e.getLogger().verbose(this.f164966e.getAccountId(), "Last session length: " + this.f164965d.m176217o() + " seconds");
        if (iM156886d == 0) {
            this.f164965d.m176194X(true);
        }
        mxf0.m156895r(context, this.f164966e.getAccountId(), Constants.SESSION_ID_LAST, this.f164965d.m176213k());
    }

    /* JADX INFO: renamed from: a */
    public void m184588a() {
        if (this.f164962a > 0 && System.currentTimeMillis() - this.f164962a > 1200000) {
            this.f164966e.getLogger().verbose(this.f164966e.getAccountId(), "Session Timed Out");
            m184589c();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m184589c() {
        this.f164965d.m176189S(0);
        this.f164965d.m176211i0(false);
        this.f164965d.m176186O(false);
        if (this.f164965d.m176176C()) {
            this.f164965d.m176194X(false);
        }
        this.f164966e.getLogger().verbose(this.f164966e.getAccountId(), "Session destroyed; Session ID is now 0");
        this.f164965d.m176200c();
        this.f164965d.m176198b();
        this.f164965d.m176197a();
        this.f164965d.m176202d();
    }

    /* JADX INFO: renamed from: d */
    public int m184590d() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: e */
    public void m184591e(Context context) {
        if (this.f164965d.m176224v()) {
            return;
        }
        this.f164965d.m176193W(true);
        crk0 crk0Var = this.f164968g;
        if (crk0Var != null) {
            crk0Var.m108398s(null);
        }
        m184587b(context);
    }

    /* JADX INFO: renamed from: f */
    public void m184592f(long j) {
        this.f164962a = j;
    }

    /* JADX INFO: renamed from: g */
    public void m184593g() {
        d3f d3fVarM108597p = this.f164967f.m108597p(Constants.APP_LAUNCHED_EVENT);
        if (d3fVarM108597p == null) {
            this.f164963b = -1;
        } else {
            this.f164963b = d3fVarM108597p.m109905a();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public void m184594h() {
        z4k0 z4k0VarM108593H = this.f164967f.m108593H(Constants.APP_LAUNCHED_EVENT);
        this.f164964c = z4k0VarM108593H != null ? z4k0VarM108593H.getLastTs() : -1L;
    }
}
