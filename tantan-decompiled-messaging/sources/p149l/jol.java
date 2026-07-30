package p149l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes12.dex */
public interface jol<T> {
    /* JADX INFO: renamed from: a */
    default void mo64936a(T t) {
        mo64938c(t);
        mo64940e(t);
        mo64937b(t);
        mo64942g(t);
        mo64941f(t);
        mo64939d(t);
    }

    /* JADX INFO: renamed from: b */
    void mo64937b(T t);

    /* JADX INFO: renamed from: c */
    void mo64938c(T t);

    /* JADX INFO: renamed from: d */
    void mo64939d(T t);

    /* JADX INFO: renamed from: e */
    void mo64940e(T t);

    /* JADX INFO: renamed from: f */
    void mo64941f(T t);

    /* JADX INFO: renamed from: g */
    void mo64942g(T t);

    /* JADX INFO: renamed from: h */
    void mo64943h();

    /* JADX INFO: renamed from: i */
    default void m142522i(ehh ehhVar, AnimatorListenerAdapter animatorListenerAdapter) {
        ehhVar.mo116455d(this, animatorListenerAdapter);
    }
}
