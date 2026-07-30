package com.p051p1.mobile.putong.live.base.util;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.util.PriorityQueue;
import java.util.Queue;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dhw;
import p153l.fo0;
import p153l.vrd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class RxTaskQueue {

    /* JADX INFO: renamed from: a */
    public final String f45411a;

    /* JADX INFO: renamed from: b */
    public Queue<C12627a<?>> f45412b = new PriorityQueue();

    /* JADX INFO: renamed from: c */
    public boolean f45413c;

    public static class RxQueueNullException extends Exception {
        private RxQueueNullException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.util.RxTaskQueue$a */
    public static class C12627a<R> implements Comparable<C12627a<?>> {

        /* JADX INFO: renamed from: a */
        public vrd0<R> f45414a;

        /* JADX INFO: renamed from: b */
        public C22507a<? super R> f45415b;

        /* JADX INFO: renamed from: c */
        public int f45416c;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull C12627a<?> c12627a) {
            return c12627a.f45416c - this.f45416c;
        }

        public C12627a() {
        }
    }

    public RxTaskQueue(String str) {
        this.f45411a = "RxTaskQueue" + str;
    }

    /* JADX INFO: renamed from: d */
    public void m69798d() {
        this.f45413c = true;
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public <R> C22421c<R> m69799e(String str, C22421c<R> c22421c) {
        return m69801g(new vrd0<>(str, c22421c, 0));
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public <R> C22421c<R> m69800f(String str, C22421c<R> c22421c, int i) {
        return m69801g(new vrd0<>(str, c22421c, i));
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public <R> C22421c<R> m69801g(vrd0<R> vrd0Var) {
        C12627a<?> c12627a = new C12627a<>();
        c12627a.f45414a = vrd0Var;
        c12627a.f45416c = vrd0Var.f185457c;
        this.f45412b.offer(c12627a);
        C22507a<? super R> c22507aM222758b = C22507a.m222758b();
        c12627a.f45415b = c22507aM222758b;
        if (this.f45412b.size() == 1 && !this.f45413c) {
            m69805k(c12627a);
        }
        return c22507aM222758b.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m69802h(C12627a c12627a, C22507a c22507a, Object obj) {
        if (obj == null) {
            CrashHelper.m82479c(new RxQueueNullException("Observable emit null value for UniqueId: " + c12627a.f45414a.f185455a + "type: " + c12627a.f45414a.toString()));
        }
        c22507a.onNext(obj);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m69803i(C22507a c22507a, C12627a c12627a, Throwable th) {
        c22507a.onError(th);
        this.f45412b.remove(c12627a);
        if (this.f45412b.isEmpty() || this.f45413c) {
            return;
        }
        m69805k(this.f45412b.peek());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m69804j(C22507a c22507a, C12627a c12627a) {
        c22507a.onCompleted();
        this.f45412b.remove(c12627a);
        if (this.f45412b.isEmpty() || this.f45413c) {
            return;
        }
        m69805k(this.f45412b.peek());
    }

    /* JADX INFO: renamed from: k */
    public final void m69805k(final C12627a c12627a) {
        vrd0<R> vrd0Var;
        if (this.f45413c || c12627a == null || (vrd0Var = c12627a.f45414a) == 0) {
            return;
        }
        final C22507a<? super R> c22507a = c12627a.f45415b;
        vrd0Var.f185456b.observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.wrd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190506a.m69802h(c12627a, c22507a, obj);
            }
        }, new y20() { // from class: l.xrd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195897a.m69803i(c22507a, c12627a, (Throwable) obj);
            }
        }, new x20() { // from class: l.yrd0
            @Override // p153l.x20
            public final void call() {
                this.f201304a.m69804j(c22507a, c12627a);
            }
        }));
    }
}
