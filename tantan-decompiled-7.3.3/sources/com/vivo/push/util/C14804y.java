package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.util.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C14804y implements InterfaceC14783d {

    /* JADX INFO: renamed from: a */
    private static final HashMap<String, Integer> f61988a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, Long> f61989b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static final HashMap<String, String> f61990c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private static C14804y f61991d;

    /* JADX INFO: renamed from: e */
    private Context f61992e;

    /* JADX INFO: renamed from: f */
    private InterfaceC14783d f61993f;

    /* JADX INFO: renamed from: g */
    private boolean f61994g;

    private C14804y(Context context) {
        this.f61994g = false;
        this.f61992e = context;
        this.f61994g = mo86143a(context);
        C14795p.m86192d("SystemCache", "init status is " + this.f61994g + ";  curCache is " + this.f61993f);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C14804y m86222b(Context context) {
        try {
            if (f61991d == null) {
                f61991d = new C14804y(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61991d;
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final boolean mo86143a(Context context) {
        C14801v c14801v = new C14801v();
        this.f61993f = c14801v;
        boolean zMo86143a = c14801v.mo86143a(context);
        if (!zMo86143a) {
            C14803x c14803x = new C14803x();
            this.f61993f = c14803x;
            zMo86143a = c14803x.mo86143a(context);
        }
        if (!zMo86143a) {
            this.f61993f = null;
        }
        return zMo86143a;
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: b */
    public final void mo86144b(String str, String str2) {
        InterfaceC14783d interfaceC14783d;
        f61990c.put(str, str2);
        if (!this.f61994g || (interfaceC14783d = this.f61993f) == null) {
            return;
        }
        interfaceC14783d.mo86144b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m86223a() {
        C14803x c14803x = new C14803x();
        if (c14803x.mo86143a(this.f61992e)) {
            c14803x.m86221a();
            C14795p.m86192d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final String mo86142a(String str, String str2) {
        InterfaceC14783d interfaceC14783d;
        String str3 = f61990c.get(str);
        return (str3 != null || (interfaceC14783d = this.f61993f) == null) ? str3 : interfaceC14783d.mo86142a(str, str2);
    }
}
