package p153l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class vgw<T> implements wi80<T> {

    /* JADX INFO: renamed from: a */
    public final Set<T> f184064a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final qg3<T> f184065b = new qg3<>();

    /* JADX INFO: renamed from: b */
    public final T m201243b(T t) {
        if (t == null) {
            return t;
        }
        synchronized (this) {
            this.f184064a.remove(t);
        }
        return t;
    }

    @Override // p153l.wi80
    public T get(int i) {
        return m201243b(this.f184065b.m176431a(i));
    }

    @Override // p153l.wi80
    public T pop() {
        return m201243b(this.f184065b.m176436f());
    }

    @Override // p153l.wi80
    public void put(T t) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f184064a.add(t);
        }
        if (zAdd) {
            this.f184065b.m176435e(mo206556a(t), t);
        }
    }
}
