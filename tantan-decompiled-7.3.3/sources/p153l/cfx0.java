package p153l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cfx0 {

    /* JADX INFO: renamed from: b */
    public static final cfx0 f81598b = new cfx0(new gfx0());

    /* JADX INFO: renamed from: c */
    public static final cfx0 f81599c = new cfx0(new kfx0());

    /* JADX INFO: renamed from: d */
    public static final cfx0 f81600d = new cfx0(new mfx0());

    /* JADX INFO: renamed from: e */
    public static final cfx0 f81601e = new cfx0(new lfx0());

    /* JADX INFO: renamed from: f */
    public static final cfx0 f81602f = new cfx0(new hfx0());

    /* JADX INFO: renamed from: g */
    public static final cfx0 f81603g = new cfx0(new jfx0());

    /* JADX INFO: renamed from: h */
    public static final cfx0 f81604h = new cfx0(new ifx0());

    /* JADX INFO: renamed from: a */
    public final bfx0 f81605a;

    public cfx0(nfx0 nfx0Var) {
        this.f81605a = !t4x0.m189331b() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new wex0(nfx0Var, null) : new yex0(nfx0Var, null) : new afx0(nfx0Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static List m109658b(String... strArr) {
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
    public final Object m109659a(String str) throws GeneralSecurityException {
        return this.f81605a.zza(str);
    }
}
