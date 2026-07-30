package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zxj {

    /* JADX INFO: renamed from: a */
    public List<Integer> f206464a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<hzj> f206465b;

    /* JADX INFO: renamed from: c */
    public String f206466c;

    /* JADX INFO: renamed from: d */
    public int f206467d;

    /* JADX INFO: renamed from: e */
    public boolean f206468e;

    /* JADX INFO: renamed from: f */
    public xxj.C21473a f206469f;

    public zxj(List<hzj> list, String str, int i, boolean z) {
        this.f206465b = list;
        this.f206466c = str;
        this.f206467d = i;
        this.f206468e = z;
    }

    /* JADX INFO: renamed from: c */
    public static zxj m221995c() {
        return new zxj();
    }

    /* JADX INFO: renamed from: b */
    public boolean m221996b(final int i) {
        return (jyb.m147479J(this.f206465b) || ((hzj) jyb.m147529r(this.f206465b, new qcj() { // from class: l.yxj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hzj) obj).f112249b == i);
            }
        })) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public int m221997d() {
        return this.f206467d;
    }

    /* JADX INFO: renamed from: e */
    public xxj.C21473a m221998e() {
        return this.f206469f;
    }

    /* JADX INFO: renamed from: f */
    public List<hzj> m221999f() {
        return this.f206465b;
    }

    /* JADX INFO: renamed from: g */
    public List<Integer> m222000g() {
        return this.f206464a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m222001h() {
        return jyb.m147479J(this.f206465b);
    }

    /* JADX INFO: renamed from: i */
    public void m222002i(xxj.C21473a c21473a) {
        this.f206469f = c21473a;
    }

    /* JADX INFO: renamed from: j */
    public void m222003j(List<Integer> list) {
        this.f206464a = list;
    }

    public zxj() {
    }
}
