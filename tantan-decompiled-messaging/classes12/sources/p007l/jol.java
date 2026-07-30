package p007l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface jol<T> {
    /* JADX INFO: renamed from: a */
    default void mo6035a(T t) {
        mo6037c(t);
        mo6039e(t);
        mo6036b(t);
        mo6041g(t);
        mo6040f(t);
        mo6038d(t);
    }

    /* JADX INFO: renamed from: b */
    void mo6036b(T t);

    /* JADX INFO: renamed from: c */
    void mo6037c(T t);

    /* JADX INFO: renamed from: d */
    void mo6038d(T t);

    /* JADX INFO: renamed from: e */
    void mo6039e(T t);

    /* JADX INFO: renamed from: f */
    void mo6040f(T t);

    /* JADX INFO: renamed from: g */
    void mo6041g(T t);

    /* JADX INFO: renamed from: h */
    void mo6042h();

    /* JADX INFO: renamed from: i */
    default void m11262i(ehh ehhVar, AnimatorListenerAdapter animatorListenerAdapter) {
        ehhVar.mo9840d(this, animatorListenerAdapter);
    }
}
