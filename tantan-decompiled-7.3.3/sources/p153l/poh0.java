package p153l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class poh0<T> implements Queue<T>, Cloneable {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f153403a;

    /* JADX INFO: renamed from: b */
    public final int f153404b;

    public poh0() {
        this.f153403a = new LinkedList();
        this.f153404b = -1;
    }

    @Override // java.util.Queue, java.util.Collection
    public synchronized boolean add(T t) {
        return this.f153403a.add(t);
    }

    @Override // java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.f153403a.addAll(collection);
    }

    @Override // java.util.Collection
    public synchronized void clear() {
        this.f153403a.clear();
    }

    public synchronized Object clone() {
        poh0 poh0Var;
        poh0Var = new poh0(this.f153404b);
        poh0Var.addAll(this.f153403a);
        return poh0Var;
    }

    @Override // java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.f153403a.contains(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f153403a.containsAll(collection);
    }

    @Override // java.util.Queue
    public synchronized T element() {
        return this.f153403a.element();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f153403a.equals(((poh0) obj).f153403a);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f153403a.hashCode();
    }

    @Override // java.util.Collection
    public synchronized boolean isEmpty() {
        return this.f153403a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return this.f153403a.iterator();
    }

    @Override // java.util.Queue
    public synchronized boolean offer(T t) {
        if (this.f153404b > -1 && this.f153403a.size() + 1 > this.f153404b) {
            return false;
        }
        return this.f153403a.offer(t);
    }

    @Override // java.util.Queue
    public synchronized T peek() {
        return this.f153403a.peek();
    }

    @Override // java.util.Queue
    public synchronized T poll() {
        return this.f153403a.poll();
    }

    @Override // java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.f153403a.remove(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f153403a.removeAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f153403a.retainAll(collection);
    }

    @Override // java.util.Collection
    public synchronized int size() {
        return this.f153403a.size();
    }

    @Override // java.util.Collection
    public synchronized Object[] toArray() {
        return this.f153403a.toArray();
    }

    public synchronized String toString() {
        return this.f153403a.toString();
    }

    @Override // java.util.Queue
    public synchronized T remove() {
        return this.f153403a.remove();
    }

    @Override // java.util.Collection
    public synchronized <R> R[] toArray(R[] rArr) {
        return (R[]) this.f153403a.toArray(rArr);
    }

    public poh0(int i) {
        this.f153403a = new LinkedList();
        this.f153404b = i;
    }
}
