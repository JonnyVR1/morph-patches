package p149l;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lt6<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f129936a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final Map<E, Integer> f129937b = new HashMap();

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public Set<E> f129938c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public List<E> f129939d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public void m151670a(E e) {
        synchronized (this.f129936a) {
            try {
                ArrayList arrayList = new ArrayList(this.f129939d);
                arrayList.add(e);
                this.f129939d = Collections.unmodifiableList(arrayList);
                Integer num = this.f129937b.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f129938c);
                    hashSet.add(e);
                    this.f129938c = Collections.unmodifiableSet(hashSet);
                }
                this.f129937b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m151671c(E e) {
        synchronized (this.f129936a) {
            try {
                Integer num = this.f129937b.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f129939d);
                arrayList.remove(e);
                this.f129939d = Collections.unmodifiableList(arrayList);
                int iIntValue = num.intValue();
                Map<E, Integer> map = this.f129937b;
                if (iIntValue == 1) {
                    map.remove(e);
                    HashSet hashSet = new HashSet(this.f129938c);
                    hashSet.remove(e);
                    this.f129938c = Collections.unmodifiableSet(hashSet);
                } else {
                    map.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e) {
        int iIntValue;
        synchronized (this.f129936a) {
            try {
                iIntValue = this.f129937b.containsKey(e) ? this.f129937b.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f129936a) {
            set = this.f129938c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f129936a) {
            it = this.f129939d.iterator();
        }
        return it;
    }
}
