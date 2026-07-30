package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xxj {

    /* JADX INFO: renamed from: b */
    public final zxj f196643b;

    /* JADX INFO: renamed from: c */
    public final zxj f196644c;

    /* JADX INFO: renamed from: d */
    public final String f196645d;

    /* JADX INFO: renamed from: f */
    public C21473a f196647f;

    /* JADX INFO: renamed from: g */
    public String f196648g;

    /* JADX INFO: renamed from: a */
    public List<Integer> f196642a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f196646e = false;

    /* JADX INFO: renamed from: l.xxj$a */
    public static class C21473a {

        /* JADX INFO: renamed from: a */
        public final boolean f196649a;

        /* JADX INFO: renamed from: b */
        public final boolean f196650b;

        /* JADX INFO: renamed from: c */
        public final boolean f196651c;

        public C21473a(boolean z, boolean z2, boolean z3) {
            this.f196649a = z;
            this.f196650b = z2;
            this.f196651c = z3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m213541a() {
            return this.f196649a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m213542b() {
            return this.f196650b;
        }

        /* JADX INFO: renamed from: c */
        public boolean m213543c() {
            return this.f196651c;
        }
    }

    public xxj(zxj zxjVar, zxj zxjVar2, String str) {
        this.f196643b = zxjVar;
        this.f196644c = zxjVar2;
        this.f196645d = str;
    }

    /* JADX INFO: renamed from: b */
    public static xxj m213527b(boolean z, boolean z2, boolean z3) {
        C21473a c21473a = new C21473a(z, z2, z3);
        xxj xxjVar = new xxj(zxj.m221995c(), zxj.m221995c(), "");
        xxjVar.m213537k(c21473a);
        return xxjVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m213528a() {
        for (Integer num : this.f196642a) {
            if (this.f196643b.m221996b(num.intValue())) {
                return false;
            }
            if (this.f196644c.m221996b(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public C21473a m213529c() {
        return this.f196647f;
    }

    /* JADX INFO: renamed from: d */
    public zxj m213530d() {
        return this.f196643b;
    }

    /* JADX INFO: renamed from: e */
    public zxj m213531e() {
        return this.f196644c;
    }

    /* JADX INFO: renamed from: f */
    public String m213532f() {
        return this.f196648g;
    }

    /* JADX INFO: renamed from: g */
    public String m213533g() {
        return this.f196645d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m213534h() {
        return this.f196646e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m213535i() {
        return TextUtils.equals(m213533g(), "voiceLiveMain") || TextUtils.equals(m213533g(), "voiceLiveVice");
    }

    /* JADX INFO: renamed from: j */
    public boolean m213536j() {
        zxj zxjVar = this.f196643b;
        return (zxjVar == null || zxjVar.m222001h()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public void m213537k(C21473a c21473a) {
        this.f196647f = c21473a;
        zxj zxjVar = this.f196643b;
        if (zxjVar != null) {
            zxjVar.m222002i(c21473a);
        }
        zxj zxjVar2 = this.f196644c;
        if (zxjVar2 != null) {
            zxjVar2.m222002i(c21473a);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m213538l(String str) {
        this.f196648g = str;
    }

    /* JADX INFO: renamed from: m */
    public void m213539m(boolean z) {
        this.f196646e = z;
    }

    /* JADX INFO: renamed from: n */
    public void m213540n(List<Integer> list) {
        this.f196642a = list;
        zxj zxjVar = this.f196643b;
        if (zxjVar != null) {
            zxjVar.m222003j(list);
        }
        zxj zxjVar2 = this.f196644c;
        if (zxjVar2 != null) {
            zxjVar2.m222003j(list);
        }
    }
}
