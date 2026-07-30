package com.tantanapp.beatles.safety.spwaitfix;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class ProxySWork<T> extends LinkedList<T> {
    private final InterfaceC13722b aboveAndroid12Processor;
    private final LinkedList<T> proxy;
    private final Handler sHandler;

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.ProxySWork$a */
    public class RunnableC13721a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinkedList f56826a;

        public RunnableC13721a(LinkedList linkedList) {
            this.f56826a = linkedList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f56826a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.ProxySWork$b */
    public interface InterfaceC13722b {
        /* JADX INFO: renamed from: a */
        void mo82364a();
    }

    public ProxySWork(LinkedList<T> linkedList, Looper looper, InterfaceC13722b interfaceC13722b) {
        this.proxy = linkedList;
        this.sHandler = new Handler(looper);
        this.aboveAndroid12Processor = interfaceC13722b;
    }

    private void delegateWork() {
        if (this.proxy.size() == 0) {
            return;
        }
        LinkedList linkedList = (LinkedList) this.proxy.clone();
        this.proxy.clear();
        this.sHandler.post(new RunnableC13721a(linkedList));
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        return this.proxy.add(t);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.proxy.clear();
    }

    @Override // java.util.LinkedList
    @NonNull
    public Object clone() {
        if (Build.VERSION.SDK_INT >= 31) {
            return this.proxy.clone();
        }
        delegateWork();
        return new LinkedList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public int size() {
        if (Build.VERSION.SDK_INT < 31) {
            return this.proxy.size();
        }
        delegateWork();
        this.aboveAndroid12Processor.mo82364a();
        return 0;
    }
}
