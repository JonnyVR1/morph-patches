package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hvj {

    /* JADX INFO: renamed from: b */
    public final jvj f109649b;

    /* JADX INFO: renamed from: c */
    public final jvj f109650c;

    /* JADX INFO: renamed from: d */
    public final String f109651d;

    /* JADX INFO: renamed from: f */
    public C17412a f109653f;

    /* JADX INFO: renamed from: g */
    public String f109654g;

    /* JADX INFO: renamed from: a */
    public List<Integer> f109648a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f109652e = false;

    /* JADX INFO: renamed from: l.hvj$a */
    public static class C17412a {

        /* JADX INFO: renamed from: a */
        public final boolean f109655a;

        /* JADX INFO: renamed from: b */
        public final boolean f109656b;

        /* JADX INFO: renamed from: c */
        public final boolean f109657c;

        public C17412a(boolean z, boolean z2, boolean z3) {
            this.f109655a = z;
            this.f109656b = z2;
            this.f109657c = z3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m133182a() {
            return this.f109655a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m133183b() {
            return this.f109656b;
        }

        /* JADX INFO: renamed from: c */
        public boolean m133184c() {
            return this.f109657c;
        }
    }

    public hvj(jvj jvjVar, jvj jvjVar2, String str) {
        this.f109649b = jvjVar;
        this.f109650c = jvjVar2;
        this.f109651d = str;
    }

    /* JADX INFO: renamed from: b */
    public static hvj m133168b(boolean z, boolean z2, boolean z3) {
        C17412a c17412a = new C17412a(z, z2, z3);
        hvj hvjVar = new hvj(jvj.m143505c(), jvj.m143505c(), "");
        hvjVar.m133178k(c17412a);
        return hvjVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m133169a() {
        for (Integer num : this.f109648a) {
            if (this.f109649b.m143506b(num.intValue())) {
                return false;
            }
            if (this.f109650c.m143506b(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public C17412a m133170c() {
        return this.f109653f;
    }

    /* JADX INFO: renamed from: d */
    public jvj m133171d() {
        return this.f109649b;
    }

    /* JADX INFO: renamed from: e */
    public jvj m133172e() {
        return this.f109650c;
    }

    /* JADX INFO: renamed from: f */
    public String m133173f() {
        return this.f109654g;
    }

    /* JADX INFO: renamed from: g */
    public String m133174g() {
        return this.f109651d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m133175h() {
        return this.f109652e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m133176i() {
        return TextUtils.equals(m133174g(), "voiceLiveMain") || TextUtils.equals(m133174g(), "voiceLiveVice");
    }

    /* JADX INFO: renamed from: j */
    public boolean m133177j() {
        jvj jvjVar = this.f109649b;
        return (jvjVar == null || jvjVar.m143511h()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public void m133178k(C17412a c17412a) {
        this.f109653f = c17412a;
        jvj jvjVar = this.f109649b;
        if (jvjVar != null) {
            jvjVar.m143512i(c17412a);
        }
        jvj jvjVar2 = this.f109650c;
        if (jvjVar2 != null) {
            jvjVar2.m143512i(c17412a);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m133179l(String str) {
        this.f109654g = str;
    }

    /* JADX INFO: renamed from: m */
    public void m133180m(boolean z) {
        this.f109652e = z;
    }

    /* JADX INFO: renamed from: n */
    public void m133181n(List<Integer> list) {
        this.f109648a = list;
        jvj jvjVar = this.f109649b;
        if (jvjVar != null) {
            jvjVar.m143513j(list);
        }
        jvj jvjVar2 = this.f109650c;
        if (jvjVar2 != null) {
            jvjVar2.m143513j(list);
        }
    }
}
