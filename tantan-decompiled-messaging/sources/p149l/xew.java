package p149l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class xew<T> implements qa80<T> {

    /* JADX INFO: renamed from: a */
    public final Set<T> f192637a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final cg3<T> f192638b = new cg3<>();

    /* JADX INFO: renamed from: b */
    public final T m208588b(T t) {
        if (t == null) {
            return t;
        }
        synchronized (this) {
            this.f192637a.remove(t);
        }
        return t;
    }

    @Override // p149l.qa80
    public T get(int i) {
        return m208588b(this.f192638b.m106652a(i));
    }

    @Override // p149l.qa80
    public T pop() {
        return m208588b(this.f192638b.m106657f());
    }

    @Override // p149l.qa80
    public void put(T t) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f192637a.add(t);
        }
        if (zAdd) {
            this.f192638b.m106656e(mo134041a(t), t);
        }
    }
}
