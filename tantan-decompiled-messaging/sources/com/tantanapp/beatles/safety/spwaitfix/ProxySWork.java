package com.tantanapp.beatles.safety.spwaitfix;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class ProxySWork<T> extends LinkedList<T> {
    private final InterfaceC13559b aboveAndroid12Processor;
    private final LinkedList<T> proxy;
    private final Handler sHandler;

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.ProxySWork$a */
    public class RunnableC13558a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinkedList f55978a;

        public RunnableC13558a(LinkedList linkedList) {
            this.f55978a = linkedList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f55978a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.ProxySWork$b */
    public interface InterfaceC13559b {
        /* JADX INFO: renamed from: a */
        void mo81181a();
    }

    public ProxySWork(LinkedList<T> linkedList, Looper looper, InterfaceC13559b interfaceC13559b) {
        this.proxy = linkedList;
        this.sHandler = new Handler(looper);
        this.aboveAndroid12Processor = interfaceC13559b;
    }

    private void delegateWork() {
        if (this.proxy.size() == 0) {
            return;
        }
        LinkedList linkedList = (LinkedList) this.proxy.clone();
        this.proxy.clear();
        this.sHandler.post(new RunnableC13558a(linkedList));
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
        this.aboveAndroid12Processor.mo81181a();
        return 0;
    }
}
