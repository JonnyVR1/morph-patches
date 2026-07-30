package p149l;

import com.p046p1.mobile.account_core.network.DefaultCall;
import com.p046p1.mobile.account_core.network.MediaType;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class x14 {

    /* JADX INFO: renamed from: b */
    public static x14 f189014b;

    /* JADX INFO: renamed from: a */
    public tx3 f189015a;

    /* JADX INFO: renamed from: b */
    public static x14 m206656b() {
        if (f189014b == null) {
            synchronized (x14.class) {
                try {
                    if (f189014b == null) {
                        f189014b = new x14();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f189014b;
    }

    /* JADX INFO: renamed from: a */
    public C22306c<AccountEnvelop> m206657a(String str) {
        m206658c();
        try {
            tx3 tx3Var = this.f189015a;
            stc0.C20027a c20027aM185887f = new stc0.C20027a().m185887f();
            StringBuilder sb = new StringBuilder();
            sb.append(C21777zv.f204925a ? yw5.f200369a : yw5.f200370b);
            sb.append(str);
            return tx3Var.execute(tx3Var.interceptRequest(c20027aM185887f.m185898q(sb.toString()).m185883b()));
        } catch (IOException e) {
            return C22306c.error(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m206658c() {
        if (this.f189015a == null) {
            this.f189015a = new DefaultCall();
        }
    }

    /* JADX INFO: renamed from: d */
    public C22306c<AccountEnvelop> m206659d(String str, String str2) {
        m206658c();
        try {
            tx3 tx3Var = this.f189015a;
            stc0.C20027a c20027aM185893l = new stc0.C20027a().m185893l(utc0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C21777zv.f204925a ? yw5.f200369a : yw5.f200370b);
            sb.append(str);
            return tx3Var.execute(tx3Var.interceptRequest(c20027aM185893l.m185898q(sb.toString()).m185883b()));
        } catch (IOException e) {
            return C22306c.error(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public C22306c<AccountEnvelop> m206660e(String str, String str2, long j) {
        m206658c();
        try {
            tx3 tx3Var = this.f189015a;
            stc0.C20027a c20027aM185893l = new stc0.C20027a().m185893l(utc0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C21777zv.f204925a ? yw5.f200369a : yw5.f200370b);
            sb.append(str);
            return tx3Var.executeWithTimeout(tx3Var.interceptRequest(c20027aM185893l.m185898q(sb.toString()).m185883b()), j);
        } catch (IOException e) {
            return C22306c.error(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m206661f(tx3 tx3Var) {
        this.f189015a = tx3Var;
    }
}
