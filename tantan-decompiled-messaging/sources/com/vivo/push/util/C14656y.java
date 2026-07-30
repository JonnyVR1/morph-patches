package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.util.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C14656y implements InterfaceC14635d {

    /* JADX INFO: renamed from: a */
    private static final HashMap<String, Integer> f61141a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, Long> f61142b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static final HashMap<String, String> f61143c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private static C14656y f61144d;

    /* JADX INFO: renamed from: e */
    private Context f61145e;

    /* JADX INFO: renamed from: f */
    private InterfaceC14635d f61146f;

    /* JADX INFO: renamed from: g */
    private boolean f61147g;

    private C14656y(Context context) {
        this.f61147g = false;
        this.f61145e = context;
        this.f61147g = mo84972a(context);
        C14647p.m85021d("SystemCache", "init status is " + this.f61147g + ";  curCache is " + this.f61146f);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C14656y m85051b(Context context) {
        try {
            if (f61144d == null) {
                f61144d = new C14656y(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61144d;
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final boolean mo84972a(Context context) {
        C14653v c14653v = new C14653v();
        this.f61146f = c14653v;
        boolean zMo84972a = c14653v.mo84972a(context);
        if (!zMo84972a) {
            C14655x c14655x = new C14655x();
            this.f61146f = c14655x;
            zMo84972a = c14655x.mo84972a(context);
        }
        if (!zMo84972a) {
            this.f61146f = null;
        }
        return zMo84972a;
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: b */
    public final void mo84973b(String str, String str2) {
        InterfaceC14635d interfaceC14635d;
        f61143c.put(str, str2);
        if (!this.f61147g || (interfaceC14635d = this.f61146f) == null) {
            return;
        }
        interfaceC14635d.mo84973b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m85052a() {
        C14655x c14655x = new C14655x();
        if (c14655x.mo84972a(this.f61145e)) {
            c14655x.m85050a();
            C14647p.m85021d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final String mo84971a(String str, String str2) {
        InterfaceC14635d interfaceC14635d;
        String str3 = f61143c.get(str);
        return (str3 != null || (interfaceC14635d = this.f61146f) == null) ? str3 : interfaceC14635d.mo84971a(str, str2);
    }
}
