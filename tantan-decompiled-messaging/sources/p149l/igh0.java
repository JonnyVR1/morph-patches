package p149l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class igh0<T> implements Queue<T>, Cloneable {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f113112a;

    /* JADX INFO: renamed from: b */
    public final int f113113b;

    public igh0() {
        this.f113112a = new LinkedList();
        this.f113113b = -1;
    }

    @Override // java.util.Queue, java.util.Collection
    public synchronized boolean add(T t) {
        return this.f113112a.add(t);
    }

    @Override // java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.f113112a.addAll(collection);
    }

    @Override // java.util.Collection
    public synchronized void clear() {
        this.f113112a.clear();
    }

    public synchronized Object clone() {
        igh0 igh0Var;
        igh0Var = new igh0(this.f113113b);
        igh0Var.addAll(this.f113112a);
        return igh0Var;
    }

    @Override // java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.f113112a.contains(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f113112a.containsAll(collection);
    }

    @Override // java.util.Queue
    public synchronized T element() {
        return this.f113112a.element();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f113112a.equals(((igh0) obj).f113112a);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f113112a.hashCode();
    }

    @Override // java.util.Collection
    public synchronized boolean isEmpty() {
        return this.f113112a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return this.f113112a.iterator();
    }

    @Override // java.util.Queue
    public synchronized boolean offer(T t) {
        if (this.f113113b > -1 && this.f113112a.size() + 1 > this.f113113b) {
            return false;
        }
        return this.f113112a.offer(t);
    }

    @Override // java.util.Queue
    public synchronized T peek() {
        return this.f113112a.peek();
    }

    @Override // java.util.Queue
    public synchronized T poll() {
        return this.f113112a.poll();
    }

    @Override // java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.f113112a.remove(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f113112a.removeAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f113112a.retainAll(collection);
    }

    @Override // java.util.Collection
    public synchronized int size() {
        return this.f113112a.size();
    }

    @Override // java.util.Collection
    public synchronized Object[] toArray() {
        return this.f113112a.toArray();
    }

    public synchronized String toString() {
        return this.f113112a.toString();
    }

    @Override // java.util.Queue
    public synchronized T remove() {
        return this.f113112a.remove();
    }

    @Override // java.util.Collection
    public synchronized <R> R[] toArray(R[] rArr) {
        return (R[]) this.f113112a.toArray(rArr);
    }

    public igh0(int i) {
        this.f113112a = new LinkedList();
        this.f113113b = i;
    }
}
