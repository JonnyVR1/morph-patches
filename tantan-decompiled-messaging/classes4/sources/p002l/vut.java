package p002l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import l.t9u;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vut {

    /* JADX INFO: renamed from: a */
    @NonNull
    public t9u f21336a = t9u.o();

    /* JADX INFO: renamed from: b */
    @NonNull
    public t9u f21337b = t9u.o();

    /* JADX INFO: renamed from: c */
    @NonNull
    public t9u f21338c = t9u.o();

    /* JADX INFO: renamed from: a */
    public vut m24163a() {
        System.currentTimeMillis();
        vut vutVar = new vut();
        vutVar.m24172j(this.f21336a.n());
        vutVar.m24171i(this.f21337b.n());
        vutVar.m24173k(this.f21338c.n());
        System.currentTimeMillis();
        return vutVar;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m24164b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f21336a.p());
        linkedHashSet.addAll(this.f21337b.p());
        linkedHashSet.addAll(this.f21338c.p());
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: c */
    public int m24165c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f21336a.p());
        linkedHashSet.addAll(this.f21337b.p());
        linkedHashSet.addAll(this.f21338c.p());
        return linkedHashSet.size();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public t9u m24166d() {
        return this.f21337b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public t9u m24167e() {
        return this.f21336a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vut vutVar = (vut) obj;
            if (v050.a(this.f21336a, vutVar.f21336a) && v050.a(this.f21337b, vutVar.f21337b) && v050.a(this.f21338c, vutVar.f21338c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m24168f(int i) {
        ArrayList arrayList = new ArrayList(this.f21336a.s(i));
        if (arrayList.size() < i) {
            arrayList.addAll(this.f21337b.s(i));
            if (arrayList.size() < i) {
                arrayList.addAll(this.f21338c.s(i));
                return arrayList;
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public t9u m24169g() {
        return this.f21338c;
    }

    /* JADX INFO: renamed from: h */
    public void m24170h(Collection<String> collection) {
        this.f21336a.C(collection);
        this.f21337b.C(collection);
        this.f21338c.C(collection);
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f21336a, this.f21337b, this.f21338c});
    }

    /* JADX INFO: renamed from: i */
    public void m24171i(@NonNull t9u t9uVar) {
        this.f21337b = t9uVar;
    }

    /* JADX INFO: renamed from: j */
    public void m24172j(@NonNull t9u t9uVar) {
        this.f21336a = t9uVar;
    }

    /* JADX INFO: renamed from: k */
    public void m24173k(@NonNull t9u t9uVar) {
        this.f21338c = t9uVar;
    }
}
