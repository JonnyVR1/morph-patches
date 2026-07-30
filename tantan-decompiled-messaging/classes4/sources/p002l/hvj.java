package p002l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hvj {

    /* JADX INFO: renamed from: b */
    public final jvj f12281b;

    /* JADX INFO: renamed from: c */
    public final jvj f12282c;

    /* JADX INFO: renamed from: d */
    public final String f12283d;

    /* JADX INFO: renamed from: f */
    public C0611a f12285f;

    /* JADX INFO: renamed from: g */
    public String f12286g;

    /* JADX INFO: renamed from: a */
    public List<Integer> f12280a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f12284e = false;

    /* JADX INFO: renamed from: l.hvj$a */
    public static class C0611a {

        /* JADX INFO: renamed from: a */
        public final boolean f12287a;

        /* JADX INFO: renamed from: b */
        public final boolean f12288b;

        /* JADX INFO: renamed from: c */
        public final boolean f12289c;

        public C0611a(boolean z, boolean z2, boolean z3) {
            this.f12287a = z;
            this.f12288b = z2;
            this.f12289c = z3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m14850a() {
            return this.f12287a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m14851b() {
            return this.f12288b;
        }

        /* JADX INFO: renamed from: c */
        public boolean m14852c() {
            return this.f12289c;
        }
    }

    public hvj(jvj jvjVar, jvj jvjVar2, String str) {
        this.f12281b = jvjVar;
        this.f12282c = jvjVar2;
        this.f12283d = str;
    }

    /* JADX INFO: renamed from: b */
    public static hvj m14836b(boolean z, boolean z2, boolean z3) {
        C0611a c0611a = new C0611a(z, z2, z3);
        hvj hvjVar = new hvj(jvj.m16340c(), jvj.m16340c(), "");
        hvjVar.m14846k(c0611a);
        return hvjVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14837a() {
        for (Integer num : this.f12280a) {
            if (this.f12281b.m16341b(num.intValue())) {
                return false;
            }
            if (this.f12282c.m16341b(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public C0611a m14838c() {
        return this.f12285f;
    }

    /* JADX INFO: renamed from: d */
    public jvj m14839d() {
        return this.f12281b;
    }

    /* JADX INFO: renamed from: e */
    public jvj m14840e() {
        return this.f12282c;
    }

    /* JADX INFO: renamed from: f */
    public String m14841f() {
        return this.f12286g;
    }

    /* JADX INFO: renamed from: g */
    public String m14842g() {
        return this.f12283d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14843h() {
        return this.f12284e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14844i() {
        return TextUtils.equals(m14842g(), "voiceLiveMain") || TextUtils.equals(m14842g(), "voiceLiveVice");
    }

    /* JADX INFO: renamed from: j */
    public boolean m14845j() {
        jvj jvjVar = this.f12281b;
        return (jvjVar == null || jvjVar.m16346h()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public void m14846k(C0611a c0611a) {
        this.f12285f = c0611a;
        jvj jvjVar = this.f12281b;
        if (jvjVar != null) {
            jvjVar.m16347i(c0611a);
        }
        jvj jvjVar2 = this.f12282c;
        if (jvjVar2 != null) {
            jvjVar2.m16347i(c0611a);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m14847l(String str) {
        this.f12286g = str;
    }

    /* JADX INFO: renamed from: m */
    public void m14848m(boolean z) {
        this.f12284e = z;
    }

    /* JADX INFO: renamed from: n */
    public void m14849n(List<Integer> list) {
        this.f12280a = list;
        jvj jvjVar = this.f12281b;
        if (jvjVar != null) {
            jvjVar.m16348j(list);
        }
        jvj jvjVar2 = this.f12282c;
        if (jvjVar2 != null) {
            jvjVar2.m16348j(list);
        }
    }
}
