package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wwt {

    /* JADX INFO: renamed from: a */
    @NonNull
    public ubu f191326a = ubu.m195316o();

    /* JADX INFO: renamed from: b */
    @NonNull
    public ubu f191327b = ubu.m195316o();

    /* JADX INFO: renamed from: c */
    @NonNull
    public ubu f191328c = ubu.m195316o();

    /* JADX INFO: renamed from: a */
    public wwt m208295a() {
        System.currentTimeMillis();
        wwt wwtVar = new wwt();
        wwtVar.m208304j(this.f191326a.m195322n());
        wwtVar.m208303i(this.f191327b.m195322n());
        wwtVar.m208305k(this.f191328c.m195322n());
        System.currentTimeMillis();
        return wwtVar;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m208296b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f191326a.m195323p());
        linkedHashSet.addAll(this.f191327b.m195323p());
        linkedHashSet.addAll(this.f191328c.m195323p());
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: c */
    public int m208297c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f191326a.m195323p());
        linkedHashSet.addAll(this.f191327b.m195323p());
        linkedHashSet.addAll(this.f191328c.m195323p());
        return linkedHashSet.size();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public ubu m208298d() {
        return this.f191327b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public ubu m208299e() {
        return this.f191326a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wwt wwtVar = (wwt) obj;
            if (k950.m148863a(this.f191326a, wwtVar.f191326a) && k950.m148863a(this.f191327b, wwtVar.f191327b) && k950.m148863a(this.f191328c, wwtVar.f191328c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m208300f(int i) {
        ArrayList arrayList = new ArrayList(this.f191326a.m195326s(i));
        if (arrayList.size() < i) {
            arrayList.addAll(this.f191327b.m195326s(i));
            if (arrayList.size() < i) {
                arrayList.addAll(this.f191328c.m195326s(i));
                return arrayList;
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public ubu m208301g() {
        return this.f191328c;
    }

    /* JADX INFO: renamed from: h */
    public void m208302h(Collection<String> collection) {
        this.f191326a.m195319C(collection);
        this.f191327b.m195319C(collection);
        this.f191328c.m195319C(collection);
    }

    public int hashCode() {
        return k950.m148864b(this.f191326a, this.f191327b, this.f191328c);
    }

    /* JADX INFO: renamed from: i */
    public void m208303i(@NonNull ubu ubuVar) {
        this.f191327b = ubuVar;
    }

    /* JADX INFO: renamed from: j */
    public void m208304j(@NonNull ubu ubuVar) {
        this.f191326a = ubuVar;
    }

    /* JADX INFO: renamed from: k */
    public void m208305k(@NonNull ubu ubuVar) {
        this.f191328c = ubuVar;
    }
}
