package p153l;

import com.p051p1.mobile.account_core.network.DefaultCall;
import com.p051p1.mobile.account_core.network.MediaType;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class w24 {

    /* JADX INFO: renamed from: b */
    public static w24 f186868b;

    /* JADX INFO: renamed from: a */
    public sy3 f186869a;

    /* JADX INFO: renamed from: b */
    public static w24 m204501b() {
        if (f186868b == null) {
            synchronized (w24.class) {
                try {
                    if (f186868b == null) {
                        f186868b = new w24();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186868b;
    }

    /* JADX INFO: renamed from: a */
    public C22421c<AccountEnvelop> m204502a(String str) {
        m204503c();
        try {
            sy3 sy3Var = this.f186869a;
            x1d0.C21228a c21228aM209032f = new x1d0.C21228a().m209032f();
            StringBuilder sb = new StringBuilder();
            sb.append(C20407tv.f176232a ? dy5.f91134a : dy5.f91135b);
            sb.append(str);
            return sy3Var.execute(sy3Var.interceptRequest(c21228aM209032f.m209043q(sb.toString()).m209028b()));
        } catch (IOException e) {
            return C22421c.error(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m204503c() {
        if (this.f186869a == null) {
            this.f186869a = new DefaultCall();
        }
    }

    /* JADX INFO: renamed from: d */
    public C22421c<AccountEnvelop> m204504d(String str, String str2) {
        m204503c();
        try {
            sy3 sy3Var = this.f186869a;
            x1d0.C21228a c21228aM209038l = new x1d0.C21228a().m209038l(z1d0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C20407tv.f176232a ? dy5.f91134a : dy5.f91135b);
            sb.append(str);
            return sy3Var.execute(sy3Var.interceptRequest(c21228aM209038l.m209043q(sb.toString()).m209028b()));
        } catch (IOException e) {
            return C22421c.error(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public C22421c<AccountEnvelop> m204505e(String str, String str2, long j) {
        m204503c();
        try {
            sy3 sy3Var = this.f186869a;
            x1d0.C21228a c21228aM209038l = new x1d0.C21228a().m209038l(z1d0.create(MediaType.JSON, str2));
            StringBuilder sb = new StringBuilder();
            sb.append(C20407tv.f176232a ? dy5.f91134a : dy5.f91135b);
            sb.append(str);
            return sy3Var.executeWithTimeout(sy3Var.interceptRequest(c21228aM209038l.m209043q(sb.toString()).m209028b()), j);
        } catch (IOException e) {
            return C22421c.error(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m204506f(sy3 sy3Var) {
        this.f186869a = sy3Var;
    }
}
