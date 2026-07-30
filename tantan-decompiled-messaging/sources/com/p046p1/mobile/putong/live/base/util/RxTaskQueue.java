package com.p046p1.mobile.putong.live.base.util;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.util.PriorityQueue;
import java.util.Queue;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.sjd0;

/* JADX INFO: loaded from: classes13.dex */
public class RxTaskQueue {

    /* JADX INFO: renamed from: a */
    public final String f44563a;

    /* JADX INFO: renamed from: b */
    public Queue<C12464a<?>> f44564b = new PriorityQueue();

    /* JADX INFO: renamed from: c */
    public boolean f44565c;

    public static class RxQueueNullException extends Exception {
        private RxQueueNullException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.util.RxTaskQueue$a */
    public static class C12464a<R> implements Comparable<C12464a<?>> {

        /* JADX INFO: renamed from: a */
        public sjd0<R> f44566a;

        /* JADX INFO: renamed from: b */
        public C22392a<? super R> f44567b;

        /* JADX INFO: renamed from: c */
        public int f44568c;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull C12464a<?> c12464a) {
            return c12464a.f44568c - this.f44568c;
        }

        public C12464a() {
        }
    }

    public RxTaskQueue(String str) {
        this.f44563a = "RxTaskQueue" + str;
    }

    /* JADX INFO: renamed from: d */
    public void m68615d() {
        this.f44565c = true;
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public <R> C22306c<R> m68616e(String str, C22306c<R> c22306c) {
        return m68618g(new sjd0<>(str, c22306c, 0));
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public <R> C22306c<R> m68617f(String str, C22306c<R> c22306c, int i) {
        return m68618g(new sjd0<>(str, c22306c, i));
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public <R> C22306c<R> m68618g(sjd0<R> sjd0Var) {
        C12464a<?> c12464a = new C12464a<>();
        c12464a.f44566a = sjd0Var;
        c12464a.f44568c = sjd0Var.f164831c;
        this.f44564b.offer(c12464a);
        C22392a<? super R> c22392aM221512b = C22392a.m221512b();
        c12464a.f44567b = c22392aM221512b;
        if (this.f44564b.size() == 1 && !this.f44565c) {
            m68622k(c12464a);
        }
        return c22392aM221512b.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m68619h(C12464a c12464a, C22392a c22392a, Object obj) {
        if (obj == null) {
            CrashHelper.m81296c(new RxQueueNullException("Observable emit null value for UniqueId: " + c12464a.f44566a.f164829a + "type: " + c12464a.f44566a.toString()));
        }
        c22392a.onNext(obj);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m68620i(C22392a c22392a, C12464a c12464a, Throwable th) {
        c22392a.onError(th);
        this.f44564b.remove(c12464a);
        if (this.f44564b.isEmpty() || this.f44565c) {
            return;
        }
        m68622k(this.f44564b.peek());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m68621j(C22392a c22392a, C12464a c12464a) {
        c22392a.onCompleted();
        this.f44564b.remove(c12464a);
        if (this.f44564b.isEmpty() || this.f44565c) {
            return;
        }
        m68622k(this.f44564b.peek());
    }

    /* JADX INFO: renamed from: k */
    public final void m68622k(final C12464a c12464a) {
        sjd0<R> sjd0Var;
        if (this.f44565c || c12464a == null || (sjd0Var = c12464a.f44566a) == 0) {
            return;
        }
        final C22392a<? super R> c22392a = c12464a.f44567b;
        sjd0Var.f164830b.observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.tjd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170666a.m68619h(c12464a, c22392a, obj);
            }
        }, new e30() { // from class: l.ujd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176759a.m68620i(c22392a, c12464a, (Throwable) obj);
            }
        }, new d30() { // from class: l.vjd0
            @Override // p149l.d30
            public final void call() {
                this.f181679a.m68621j(c22392a, c12464a);
            }
        }));
    }
}
