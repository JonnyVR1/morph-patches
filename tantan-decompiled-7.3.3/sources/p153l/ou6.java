package p153l;

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
public final class ou6<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f149061a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final Map<E, Integer> f149062b = new HashMap();

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public Set<E> f149063c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public List<E> f149064d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public void m169233a(E e) {
        synchronized (this.f149061a) {
            try {
                ArrayList arrayList = new ArrayList(this.f149064d);
                arrayList.add(e);
                this.f149064d = Collections.unmodifiableList(arrayList);
                Integer num = this.f149062b.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f149063c);
                    hashSet.add(e);
                    this.f149063c = Collections.unmodifiableSet(hashSet);
                }
                this.f149062b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m169234c(E e) {
        synchronized (this.f149061a) {
            try {
                Integer num = this.f149062b.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f149064d);
                arrayList.remove(e);
                this.f149064d = Collections.unmodifiableList(arrayList);
                int iIntValue = num.intValue();
                Map<E, Integer> map = this.f149062b;
                if (iIntValue == 1) {
                    map.remove(e);
                    HashSet hashSet = new HashSet(this.f149063c);
                    hashSet.remove(e);
                    this.f149063c = Collections.unmodifiableSet(hashSet);
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
        synchronized (this.f149061a) {
            try {
                iIntValue = this.f149062b.containsKey(e) ? this.f149062b.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f149061a) {
            set = this.f149063c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f149061a) {
            it = this.f149064d.iterator();
        }
        return it;
    }
}
