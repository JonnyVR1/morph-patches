package p153l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes13.dex */
public interface uql<T> {
    /* JADX INFO: renamed from: a */
    default void mo66119a(T t) {
        mo66121c(t);
        mo66123e(t);
        mo66120b(t);
        mo66125g(t);
        mo66124f(t);
        mo66122d(t);
    }

    /* JADX INFO: renamed from: b */
    void mo66120b(T t);

    /* JADX INFO: renamed from: c */
    void mo66121c(T t);

    /* JADX INFO: renamed from: d */
    void mo66122d(T t);

    /* JADX INFO: renamed from: e */
    void mo66123e(T t);

    /* JADX INFO: renamed from: f */
    void mo66124f(T t);

    /* JADX INFO: renamed from: g */
    void mo66125g(T t);

    /* JADX INFO: renamed from: h */
    void mo66126h();

    /* JADX INFO: renamed from: i */
    default void m197372i(tih tihVar, AnimatorListenerAdapter animatorListenerAdapter) {
        tihVar.mo135622d(this, animatorListenerAdapter);
    }
}
