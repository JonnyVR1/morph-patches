package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class tzq0 {

    /* JADX INFO: renamed from: b */
    private static volatile tzq0 f176796b;

    /* JADX INFO: renamed from: a */
    private Context f176797a;

    private tzq0(Context context) {
        this.f176797a = context;
    }

    /* JADX INFO: renamed from: a */
    public static tzq0 m193695a(Context context) {
        if (f176796b == null) {
            synchronized (tzq0.class) {
                try {
                    if (f176796b == null) {
                        f176796b = new tzq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176796b;
    }

    /* JADX INFO: renamed from: h */
    private void m193696h(xrq0 xrq0Var) {
        if (xrq0Var instanceof gr60) {
            ga5.m129689c(this.f176797a, (gr60) xrq0Var);
        } else if (xrq0Var instanceof y3f) {
            ga5.m129688b(this.f176797a, (y3f) xrq0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m193697b(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0 || j <= 0) {
            return;
        }
        gr60 gr60VarM188673j = szq0.m188673j(this.f176797a, i, j, j2);
        gr60VarM188673j.m212849a(str);
        gr60VarM188673j.m212850b("5_9_9-C");
        m193696h(gr60VarM188673j);
    }

    /* JADX INFO: renamed from: c */
    public void m193698c(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        m193700e(str, szq0.m188668e(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: d */
    public void m193699d(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        m193700e(str, szq0.m188668e(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: e */
    public void m193700e(String str, String str2, String str3, int i, long j, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        y3f y3fVarM188670g = szq0.m188670g(this.f176797a, str2, str3, i, j, str4);
        y3fVarM188670g.m212849a(str);
        y3fVarM188670g.m212850b("5_9_9-C");
        m193696h(y3fVarM188670g);
    }

    /* JADX INFO: renamed from: f */
    public void m193701f(String str, String str2, String str3, int i, String str4) {
        m193700e(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: g */
    public void m193702g(String str, String str2, String str3, String str4) {
        m193700e(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: i */
    public void m193703i(String str, String str2, String str3, String str4) {
        m193700e(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: j */
    public void m193704j(String str, String str2, String str3, String str4) {
        m193700e(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }
}
