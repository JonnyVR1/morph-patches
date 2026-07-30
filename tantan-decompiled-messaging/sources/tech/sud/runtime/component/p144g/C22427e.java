package tech.sud.runtime.component.p144g;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.e */
/* JADX INFO: loaded from: classes3.dex */
public class C22427e {

    /* JADX INFO: renamed from: a */
    private C22424b f207762a;

    /* JADX INFO: renamed from: b */
    private Map<C22428f, C22426d> f207763b;

    /* JADX INFO: renamed from: c */
    private String f207764c = "";

    /* JADX INFO: renamed from: d */
    private String f207765d = "";

    /* JADX INFO: renamed from: e */
    private String f207766e = "";

    /* JADX INFO: renamed from: f */
    private final Set<String> f207767f = new HashSet();

    /* JADX INFO: renamed from: g */
    private String f207768g = "";

    /* JADX INFO: renamed from: a */
    private boolean m221832a(C22424b c22424b, C22428f c22428f, long j) {
        C22426d c22426d = this.f207763b.get(c22428f);
        if (c22426d == null) {
            return false;
        }
        c22424b.m221819a(c22426d.m221830a() + j);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m221833b() {
        this.f207762a.m221822c();
        int iM221825f = this.f207762a.m221825f();
        this.f207762a.m221821b(6L);
        this.f207763b = new HashMap();
        C22426d[] c22426dArr = new C22426d[iM221825f];
        for (int i = 0; i < iM221825f; i++) {
            C22426d c22426d = new C22426d();
            c22426dArr[i] = c22426d;
            this.f207763b.put(C22428f.m221837a(c22426d.m221831a(this.f207762a)), c22426dArr[i]);
        }
        this.f207763b.put(C22428f.f207769a, new C22426d(0L, this.f207762a.m221816a()));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX INFO: renamed from: c */
    private void m221834c() {
        m221832a(this.f207762a, C22428f.f207770b, 2L);
        int iM221816a = this.f207762a.m221816a();
        int iM221825f = this.f207762a.m221825f();
        int iM221825f2 = (this.f207762a.m221825f() + iM221816a) - 2;
        int i = iM221816a + 4;
        while (true) {
            int i2 = iM221825f - 1;
            if (iM221825f <= 0) {
                return;
            }
            this.f207762a.m221819a(i);
            int iM221825f3 = this.f207762a.m221825f();
            int iM221825f4 = this.f207762a.m221825f();
            int iM221825f5 = this.f207762a.m221825f();
            int iM221825f6 = this.f207762a.m221825f();
            int iM221825f7 = this.f207762a.m221825f();
            if ((iM221825f3 == 1 || iM221825f3 == 3) && (iM221825f4 == 0 || iM221825f4 == 1)) {
                C22424b c22424b = this.f207762a;
                c22424b.m221819a(c22424b.m221825f() + iM221825f2);
                C22424b c22424b2 = this.f207762a;
                String strM221818a = iM221825f3 == 3 ? c22424b2.m221818a(iM221825f7, iM221825f4) : c22424b2.m221817a(iM221825f7);
                if (iM221825f6 != 0) {
                    if (iM221825f6 == 1) {
                        this.f207767f.add(strM221818a);
                    } else if (iM221825f6 != 2) {
                        if (iM221825f6 != 4) {
                            if (iM221825f6 != 6) {
                                if (iM221825f6 == 16) {
                                    this.f207767f.add(strM221818a);
                                }
                            } else if (this.f207764c.length() == 0) {
                                this.f207764c = strM221818a;
                            }
                        } else if (this.f207765d.length() == 0 || (iM221825f3 == 3 && iM221825f5 == 1033)) {
                            this.f207765d = strM221818a;
                        }
                    } else if (this.f207768g.length() == 0) {
                        this.f207768g = strM221818a;
                    }
                } else if (this.f207766e.length() == 0) {
                    this.f207766e = strM221818a;
                }
            }
            i += 12;
            iM221825f = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221836a(C22424b c22424b) {
        this.f207762a = c22424b;
        m221833b();
        m221834c();
    }

    /* JADX INFO: renamed from: a */
    public String m221835a() {
        return this.f207764c;
    }
}
