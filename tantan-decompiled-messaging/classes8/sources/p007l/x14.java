package p007l;

import com.p003p1.mobile.account_core.network.DefaultCall;
import com.p003p1.mobile.account_core.network.MediaType;
import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import l.stc0;
import l.utc0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class x14 {

    /* JADX INFO: renamed from: b */
    public static x14 f5082b;

    /* JADX INFO: renamed from: a */
    public tx3 f5083a;

    /* JADX INFO: renamed from: b */
    public static x14 m11391b() {
        if (f5082b == null) {
            synchronized (x14.class) {
                try {
                    if (f5082b == null) {
                        f5082b = new x14();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5082b;
    }

    /* JADX INFO: renamed from: a */
    public c<AccountEnvelop> m11392a(String str) {
        m11393c();
        try {
            tx3 tx3Var = this.f5083a;
            stc0.a aVarF = new stc0.a().f();
            StringBuilder sb = new StringBuilder();
            sb.append(C0811zv.f5543a ? yw5.f5466a : yw5.f5467b);
            sb.append(str);
            return tx3Var.execute(tx3Var.interceptRequest(aVarF.q(sb.toString()).b()));
        } catch (IOException e) {
            return c.error(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m11393c() {
        if (this.f5083a == null) {
            this.f5083a = new DefaultCall();
        }
    }

    /* JADX INFO: renamed from: d */
    public c<AccountEnvelop> m11394d(String str, String str2) {
        m11393c();
        try {
            tx3 tx3Var = this.f5083a;
            stc0.a aVarL = new stc0.a().l(utc0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C0811zv.f5543a ? yw5.f5466a : yw5.f5467b);
            sb.append(str);
            return tx3Var.execute(tx3Var.interceptRequest(aVarL.q(sb.toString()).b()));
        } catch (IOException e) {
            return c.error(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public c<AccountEnvelop> m11395e(String str, String str2, long j) {
        m11393c();
        try {
            tx3 tx3Var = this.f5083a;
            stc0.a aVarL = new stc0.a().l(utc0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C0811zv.f5543a ? yw5.f5466a : yw5.f5467b);
            sb.append(str);
            return tx3Var.executeWithTimeout(tx3Var.interceptRequest(aVarL.q(sb.toString()).b()), j);
        } catch (IOException e) {
            return c.error(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11396f(tx3 tx3Var) {
        this.f5083a = tx3Var;
    }
}
