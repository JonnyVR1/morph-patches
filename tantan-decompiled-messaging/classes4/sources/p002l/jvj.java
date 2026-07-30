package p002l;

import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jvj {

    /* JADX INFO: renamed from: a */
    public List<Integer> f14054a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<rwj> f14055b;

    /* JADX INFO: renamed from: c */
    public String f14056c;

    /* JADX INFO: renamed from: d */
    public int f14057d;

    /* JADX INFO: renamed from: e */
    public boolean f14058e;

    /* JADX INFO: renamed from: f */
    public hvj.C0611a f14059f;

    public jvj(List<rwj> list, String str, int i, boolean z) {
        this.f14055b = list;
        this.f14056c = str;
        this.f14057d = i;
        this.f14058e = z;
    }

    /* JADX INFO: renamed from: c */
    public static jvj m16340c() {
        return new jvj();
    }

    /* JADX INFO: renamed from: b */
    public boolean m16341b(final int i) {
        return (vwb.J(this.f14055b) || ((rwj) vwb.r(this.f14055b, new w9j() { // from class: l.ivj
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwj) obj).f18704b == i);
            }
        })) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public int m16342d() {
        return this.f14057d;
    }

    /* JADX INFO: renamed from: e */
    public hvj.C0611a m16343e() {
        return this.f14059f;
    }

    /* JADX INFO: renamed from: f */
    public List<rwj> m16344f() {
        return this.f14055b;
    }

    /* JADX INFO: renamed from: g */
    public List<Integer> m16345g() {
        return this.f14054a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m16346h() {
        return vwb.J(this.f14055b);
    }

    /* JADX INFO: renamed from: i */
    public void m16347i(hvj.C0611a c0611a) {
        this.f14059f = c0611a;
    }

    /* JADX INFO: renamed from: j */
    public void m16348j(List<Integer> list) {
        this.f14054a = list;
    }

    public jvj() {
    }
}
