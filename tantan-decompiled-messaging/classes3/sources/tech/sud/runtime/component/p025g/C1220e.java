package tech.sud.runtime.component.p025g;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1220e {

    /* JADX INFO: renamed from: a */
    private C1217b f11387a;

    /* JADX INFO: renamed from: b */
    private Map<C1221f, C1219d> f11388b;

    /* JADX INFO: renamed from: c */
    private String f11389c = "";

    /* JADX INFO: renamed from: d */
    private String f11390d = "";

    /* JADX INFO: renamed from: e */
    private String f11391e = "";

    /* JADX INFO: renamed from: f */
    private final Set<String> f11392f = new HashSet();

    /* JADX INFO: renamed from: g */
    private String f11393g = "";

    /* JADX INFO: renamed from: a */
    private boolean m10303a(C1217b c1217b, C1221f c1221f, long j) {
        C1219d c1219d = this.f11388b.get(c1221f);
        if (c1219d == null) {
            return false;
        }
        c1217b.m10290a(c1219d.m10301a() + j);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m10304b() {
        this.f11387a.m10293c();
        int iM10296f = this.f11387a.m10296f();
        this.f11387a.m10292b(6L);
        this.f11388b = new HashMap();
        C1219d[] c1219dArr = new C1219d[iM10296f];
        for (int i = 0; i < iM10296f; i++) {
            C1219d c1219d = new C1219d();
            c1219dArr[i] = c1219d;
            this.f11388b.put(C1221f.m10308a(c1219d.m10302a(this.f11387a)), c1219dArr[i]);
        }
        this.f11388b.put(C1221f.f11394a, new C1219d(0L, this.f11387a.m10287a()));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX INFO: renamed from: c */
    private void m10305c() {
        m10303a(this.f11387a, C1221f.f11395b, 2L);
        int iM10287a = this.f11387a.m10287a();
        int iM10296f = this.f11387a.m10296f();
        int iM10296f2 = (this.f11387a.m10296f() + iM10287a) - 2;
        int i = iM10287a + 4;
        while (true) {
            int i2 = iM10296f - 1;
            if (iM10296f <= 0) {
                return;
            }
            this.f11387a.m10290a(i);
            int iM10296f3 = this.f11387a.m10296f();
            int iM10296f4 = this.f11387a.m10296f();
            int iM10296f5 = this.f11387a.m10296f();
            int iM10296f6 = this.f11387a.m10296f();
            int iM10296f7 = this.f11387a.m10296f();
            if ((iM10296f3 == 1 || iM10296f3 == 3) && (iM10296f4 == 0 || iM10296f4 == 1)) {
                C1217b c1217b = this.f11387a;
                c1217b.m10290a(c1217b.m10296f() + iM10296f2);
                C1217b c1217b2 = this.f11387a;
                String strM10289a = iM10296f3 == 3 ? c1217b2.m10289a(iM10296f7, iM10296f4) : c1217b2.m10288a(iM10296f7);
                if (iM10296f6 != 0) {
                    if (iM10296f6 == 1) {
                        this.f11392f.add(strM10289a);
                    } else if (iM10296f6 != 2) {
                        if (iM10296f6 != 4) {
                            if (iM10296f6 != 6) {
                                if (iM10296f6 == 16) {
                                    this.f11392f.add(strM10289a);
                                }
                            } else if (this.f11389c.length() == 0) {
                                this.f11389c = strM10289a;
                            }
                        } else if (this.f11390d.length() == 0 || (iM10296f3 == 3 && iM10296f5 == 1033)) {
                            this.f11390d = strM10289a;
                        }
                    } else if (this.f11393g.length() == 0) {
                        this.f11393g = strM10289a;
                    }
                } else if (this.f11391e.length() == 0) {
                    this.f11391e = strM10289a;
                }
            }
            i += 12;
            iM10296f = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10307a(C1217b c1217b) {
        this.f11387a = c1217b;
        m10304b();
        m10305c();
    }

    /* JADX INFO: renamed from: a */
    public String m10306a() {
        return this.f11389c;
    }
}
