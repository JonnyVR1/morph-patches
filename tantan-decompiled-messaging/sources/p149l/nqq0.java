package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nqq0 {

    /* JADX INFO: renamed from: b */
    private static volatile nqq0 f140095b;

    /* JADX INFO: renamed from: a */
    private Context f140096a;

    private nqq0(Context context) {
        this.f140096a = context;
    }

    /* JADX INFO: renamed from: a */
    public static nqq0 m160662a(Context context) {
        if (f140095b == null) {
            synchronized (nqq0.class) {
                try {
                    if (f140095b == null) {
                        f140095b = new nqq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f140095b;
    }

    /* JADX INFO: renamed from: h */
    private void m160663h(siq0 siq0Var) {
        if (siq0Var instanceof bj60) {
            f95.m120076c(this.f140096a, (bj60) siq0Var);
        } else if (siq0Var instanceof t2f) {
            f95.m120075b(this.f140096a, (t2f) siq0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m160664b(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0 || j <= 0) {
            return;
        }
        bj60 bj60VarM155987j = mqq0.m155987j(this.f140096a, i, j, j2);
        bj60VarM155987j.m184352a(str);
        bj60VarM155987j.m184353b("5_9_9-C");
        m160663h(bj60VarM155987j);
    }

    /* JADX INFO: renamed from: c */
    public void m160665c(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        m160667e(str, mqq0.m155982e(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: d */
    public void m160666d(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        m160667e(str, mqq0.m155982e(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: e */
    public void m160667e(String str, String str2, String str3, int i, long j, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        t2f t2fVarM155984g = mqq0.m155984g(this.f140096a, str2, str3, i, j, str4);
        t2fVarM155984g.m184352a(str);
        t2fVarM155984g.m184353b("5_9_9-C");
        m160663h(t2fVarM155984g);
    }

    /* JADX INFO: renamed from: f */
    public void m160668f(String str, String str2, String str3, int i, String str4) {
        m160667e(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: g */
    public void m160669g(String str, String str2, String str3, String str4) {
        m160667e(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: i */
    public void m160670i(String str, String str2, String str3, String str4) {
        m160667e(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: j */
    public void m160671j(String str, String str2, String str3, String str4) {
        m160667e(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }
}
