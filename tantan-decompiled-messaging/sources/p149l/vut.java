package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vut {

    /* JADX INFO: renamed from: a */
    @NonNull
    public t9u f183120a = t9u.m187662o();

    /* JADX INFO: renamed from: b */
    @NonNull
    public t9u f183121b = t9u.m187662o();

    /* JADX INFO: renamed from: c */
    @NonNull
    public t9u f183122c = t9u.m187662o();

    /* JADX INFO: renamed from: a */
    public vut m200121a() {
        System.currentTimeMillis();
        vut vutVar = new vut();
        vutVar.m200130j(this.f183120a.m187668n());
        vutVar.m200129i(this.f183121b.m187668n());
        vutVar.m200131k(this.f183122c.m187668n());
        System.currentTimeMillis();
        return vutVar;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m200122b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f183120a.m187669p());
        linkedHashSet.addAll(this.f183121b.m187669p());
        linkedHashSet.addAll(this.f183122c.m187669p());
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: c */
    public int m200123c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f183120a.m187669p());
        linkedHashSet.addAll(this.f183121b.m187669p());
        linkedHashSet.addAll(this.f183122c.m187669p());
        return linkedHashSet.size();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public t9u m200124d() {
        return this.f183121b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public t9u m200125e() {
        return this.f183120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vut vutVar = (vut) obj;
            if (v050.m196470a(this.f183120a, vutVar.f183120a) && v050.m196470a(this.f183121b, vutVar.f183121b) && v050.m196470a(this.f183122c, vutVar.f183122c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m200126f(int i) {
        ArrayList arrayList = new ArrayList(this.f183120a.m187672s(i));
        if (arrayList.size() < i) {
            arrayList.addAll(this.f183121b.m187672s(i));
            if (arrayList.size() < i) {
                arrayList.addAll(this.f183122c.m187672s(i));
                return arrayList;
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public t9u m200127g() {
        return this.f183122c;
    }

    /* JADX INFO: renamed from: h */
    public void m200128h(Collection<String> collection) {
        this.f183120a.m187665C(collection);
        this.f183121b.m187665C(collection);
        this.f183122c.m187665C(collection);
    }

    public int hashCode() {
        return v050.m196471b(this.f183120a, this.f183121b, this.f183122c);
    }

    /* JADX INFO: renamed from: i */
    public void m200129i(@NonNull t9u t9uVar) {
        this.f183121b = t9uVar;
    }

    /* JADX INFO: renamed from: j */
    public void m200130j(@NonNull t9u t9uVar) {
        this.f183120a = t9uVar;
    }

    /* JADX INFO: renamed from: k */
    public void m200131k(@NonNull t9u t9uVar) {
        this.f183122c = t9uVar;
    }
}
