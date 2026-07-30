package p153l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class s3d0 {

    /* JADX INFO: renamed from: a */
    public HashSet<s3d0> f165994a = new HashSet<>(2);

    /* JADX INFO: renamed from: b */
    public int f165995b = 0;

    /* JADX INFO: renamed from: a */
    public void m184232a(s3d0 s3d0Var) {
        this.f165994a.add(s3d0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m184233b() {
        this.f165995b = 1;
        Iterator<s3d0> it = this.f165994a.iterator();
        while (it.hasNext()) {
            it.next().mo1116f();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m184234c() {
        this.f165995b = 0;
        Iterator<s3d0> it = this.f165994a.iterator();
        while (it.hasNext()) {
            it.next().m184234c();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m184235d() {
        return this.f165995b == 1;
    }

    /* JADX INFO: renamed from: e */
    public void mo1115e() {
        this.f165995b = 0;
        this.f165994a.clear();
    }

    /* JADX INFO: renamed from: f */
    public void mo1116f() {
    }
}
