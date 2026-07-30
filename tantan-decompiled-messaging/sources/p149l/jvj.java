package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jvj {

    /* JADX INFO: renamed from: a */
    public List<Integer> f119944a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<rwj> f119945b;

    /* JADX INFO: renamed from: c */
    public String f119946c;

    /* JADX INFO: renamed from: d */
    public int f119947d;

    /* JADX INFO: renamed from: e */
    public boolean f119948e;

    /* JADX INFO: renamed from: f */
    public hvj.C17412a f119949f;

    public jvj(List<rwj> list, String str, int i, boolean z) {
        this.f119945b = list;
        this.f119946c = str;
        this.f119947d = i;
        this.f119948e = z;
    }

    /* JADX INFO: renamed from: c */
    public static jvj m143505c() {
        return new jvj();
    }

    /* JADX INFO: renamed from: b */
    public boolean m143506b(final int i) {
        return (vwb.m200296J(this.f119945b) || ((rwj) vwb.m200346r(this.f119945b, new w9j() { // from class: l.ivj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwj) obj).f161339b == i);
            }
        })) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public int m143507d() {
        return this.f119947d;
    }

    /* JADX INFO: renamed from: e */
    public hvj.C17412a m143508e() {
        return this.f119949f;
    }

    /* JADX INFO: renamed from: f */
    public List<rwj> m143509f() {
        return this.f119945b;
    }

    /* JADX INFO: renamed from: g */
    public List<Integer> m143510g() {
        return this.f119944a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m143511h() {
        return vwb.m200296J(this.f119945b);
    }

    /* JADX INFO: renamed from: i */
    public void m143512i(hvj.C17412a c17412a) {
        this.f119949f = c17412a;
    }

    /* JADX INFO: renamed from: j */
    public void m143513j(List<Integer> list) {
        this.f119944a = list;
    }

    public jvj() {
    }
}
