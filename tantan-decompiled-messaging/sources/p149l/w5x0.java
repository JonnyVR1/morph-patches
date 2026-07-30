package p149l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w5x0 {

    /* JADX INFO: renamed from: b */
    public static final w5x0 f184787b = new w5x0(new a6x0());

    /* JADX INFO: renamed from: c */
    public static final w5x0 f184788c = new w5x0(new e6x0());

    /* JADX INFO: renamed from: d */
    public static final w5x0 f184789d = new w5x0(new g6x0());

    /* JADX INFO: renamed from: e */
    public static final w5x0 f184790e = new w5x0(new f6x0());

    /* JADX INFO: renamed from: f */
    public static final w5x0 f184791f = new w5x0(new b6x0());

    /* JADX INFO: renamed from: g */
    public static final w5x0 f184792g = new w5x0(new d6x0());

    /* JADX INFO: renamed from: h */
    public static final w5x0 f184793h = new w5x0(new c6x0());

    /* JADX INFO: renamed from: a */
    public final v5x0 f184794a;

    public w5x0(h6x0 h6x0Var) {
        this.f184794a = !nvw0.m161765b() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new q5x0(h6x0Var, null) : new s5x0(h6x0Var, null) : new u5x0(h6x0Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static List m201728b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Object m201729a(String str) throws GeneralSecurityException {
        return this.f184794a.zza(str);
    }
}
