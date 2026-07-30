package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lx50 {

    /* JADX INFO: renamed from: a */
    public int f133904a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public cqj f133906c;

    /* JADX INFO: renamed from: b */
    public String f133905b = "default";

    /* JADX INFO: renamed from: d */
    public List<Integer> f133907d = new ArrayList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public cqj m156151a() {
        return this.f133906c;
    }

    /* JADX INFO: renamed from: b */
    public int m156152b() {
        return this.f133904a;
    }

    /* JADX INFO: renamed from: c */
    public String m156153c() {
        return this.f133905b;
    }

    /* JADX INFO: renamed from: d */
    public String m156154d() {
        return m156156f() == null ? "" : m156156f().f82889e.f107997a;
    }

    /* JADX INFO: renamed from: e */
    public List<Integer> m156155e() {
        return this.f133907d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public coj m156156f() {
        cqj cqjVar = this.f133906c;
        if (cqjVar == null) {
            return null;
        }
        return cqjVar.m111918g();
    }

    /* JADX INFO: renamed from: g */
    public lx50 m156157g(List<Integer> list) {
        this.f133907d = list;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public lx50 m156158h(cqj cqjVar) {
        this.f133906c = cqjVar;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public lx50 m156159i(int i) {
        this.f133904a = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public lx50 m156160j(String str) {
        this.f133905b = str;
        return this;
    }
}
