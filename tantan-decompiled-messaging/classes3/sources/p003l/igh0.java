package p003l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class igh0<T> implements Queue<T>, Cloneable {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f4403a;

    /* JADX INFO: renamed from: b */
    public final int f4404b;

    public igh0() {
        this.f4403a = new LinkedList();
        this.f4404b = -1;
    }

    @Override // java.util.Queue, java.util.Collection
    public synchronized boolean add(T t) {
        return this.f4403a.add(t);
    }

    @Override // java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.f4403a.addAll(collection);
    }

    @Override // java.util.Collection
    public synchronized void clear() {
        this.f4403a.clear();
    }

    public synchronized Object clone() {
        igh0 igh0Var;
        igh0Var = new igh0(this.f4404b);
        igh0Var.addAll(this.f4403a);
        return igh0Var;
    }

    @Override // java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.f4403a.contains(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f4403a.containsAll(collection);
    }

    @Override // java.util.Queue
    public synchronized T element() {
        return this.f4403a.element();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f4403a.equals(((igh0) obj).f4403a);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f4403a.hashCode();
    }

    @Override // java.util.Collection
    public synchronized boolean isEmpty() {
        return this.f4403a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return this.f4403a.iterator();
    }

    @Override // java.util.Queue
    public synchronized boolean offer(T t) {
        if (this.f4404b > -1 && this.f4403a.size() + 1 > this.f4404b) {
            return false;
        }
        return this.f4403a.offer(t);
    }

    @Override // java.util.Queue
    public synchronized T peek() {
        return this.f4403a.peek();
    }

    @Override // java.util.Queue
    public synchronized T poll() {
        return this.f4403a.poll();
    }

    @Override // java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.f4403a.remove(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f4403a.removeAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f4403a.retainAll(collection);
    }

    @Override // java.util.Collection
    public synchronized int size() {
        return this.f4403a.size();
    }

    @Override // java.util.Collection
    public synchronized Object[] toArray() {
        return this.f4403a.toArray();
    }

    public synchronized String toString() {
        return this.f4403a.toString();
    }

    @Override // java.util.Queue
    public synchronized T remove() {
        return this.f4403a.remove();
    }

    @Override // java.util.Collection
    public synchronized <R> R[] toArray(R[] rArr) {
        return (R[]) this.f4403a.toArray(rArr);
    }

    public igh0(int i) {
        this.f4403a = new LinkedList();
        this.f4404b = i;
    }
}
