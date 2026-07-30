package tech.sud.runtime.component.p148g;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.e */
/* JADX INFO: loaded from: classes3.dex */
public class C22542e {

    /* JADX INFO: renamed from: a */
    private C22539b f208684a;

    /* JADX INFO: renamed from: b */
    private Map<C22543f, C22541d> f208685b;

    /* JADX INFO: renamed from: c */
    private String f208686c = "";

    /* JADX INFO: renamed from: d */
    private String f208687d = "";

    /* JADX INFO: renamed from: e */
    private String f208688e = "";

    /* JADX INFO: renamed from: f */
    private final Set<String> f208689f = new HashSet();

    /* JADX INFO: renamed from: g */
    private String f208690g = "";

    /* JADX INFO: renamed from: a */
    private boolean m223078a(C22539b c22539b, C22543f c22543f, long j) {
        C22541d c22541d = this.f208685b.get(c22543f);
        if (c22541d == null) {
            return false;
        }
        c22539b.m223065a(c22541d.m223076a() + j);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m223079b() {
        this.f208684a.m223068c();
        int iM223071f = this.f208684a.m223071f();
        this.f208684a.m223067b(6L);
        this.f208685b = new HashMap();
        C22541d[] c22541dArr = new C22541d[iM223071f];
        for (int i = 0; i < iM223071f; i++) {
            C22541d c22541d = new C22541d();
            c22541dArr[i] = c22541d;
            this.f208685b.put(C22543f.m223083a(c22541d.m223077a(this.f208684a)), c22541dArr[i]);
        }
        this.f208685b.put(C22543f.f208691a, new C22541d(0L, this.f208684a.m223062a()));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX INFO: renamed from: c */
    private void m223080c() {
        m223078a(this.f208684a, C22543f.f208692b, 2L);
        int iM223062a = this.f208684a.m223062a();
        int iM223071f = this.f208684a.m223071f();
        int iM223071f2 = (this.f208684a.m223071f() + iM223062a) - 2;
        int i = iM223062a + 4;
        while (true) {
            int i2 = iM223071f - 1;
            if (iM223071f <= 0) {
                return;
            }
            this.f208684a.m223065a(i);
            int iM223071f3 = this.f208684a.m223071f();
            int iM223071f4 = this.f208684a.m223071f();
            int iM223071f5 = this.f208684a.m223071f();
            int iM223071f6 = this.f208684a.m223071f();
            int iM223071f7 = this.f208684a.m223071f();
            if ((iM223071f3 == 1 || iM223071f3 == 3) && (iM223071f4 == 0 || iM223071f4 == 1)) {
                C22539b c22539b = this.f208684a;
                c22539b.m223065a(c22539b.m223071f() + iM223071f2);
                C22539b c22539b2 = this.f208684a;
                String strM223064a = iM223071f3 == 3 ? c22539b2.m223064a(iM223071f7, iM223071f4) : c22539b2.m223063a(iM223071f7);
                if (iM223071f6 != 0) {
                    if (iM223071f6 == 1) {
                        this.f208689f.add(strM223064a);
                    } else if (iM223071f6 != 2) {
                        if (iM223071f6 != 4) {
                            if (iM223071f6 != 6) {
                                if (iM223071f6 == 16) {
                                    this.f208689f.add(strM223064a);
                                }
                            } else if (this.f208686c.length() == 0) {
                                this.f208686c = strM223064a;
                            }
                        } else if (this.f208687d.length() == 0 || (iM223071f3 == 3 && iM223071f5 == 1033)) {
                            this.f208687d = strM223064a;
                        }
                    } else if (this.f208690g.length() == 0) {
                        this.f208690g = strM223064a;
                    }
                } else if (this.f208688e.length() == 0) {
                    this.f208688e = strM223064a;
                }
            }
            i += 12;
            iM223071f = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223082a(C22539b c22539b) {
        this.f208684a = c22539b;
        m223079b();
        m223080c();
    }

    /* JADX INFO: renamed from: a */
    public String m223081a() {
        return this.f208686c;
    }
}
