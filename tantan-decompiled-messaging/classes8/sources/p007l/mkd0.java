package p007l;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.App;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.p004rx.C0254a;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.List;
import l.a4g0;
import l.aaj;
import l.baj;
import l.c4g0;
import l.d30;
import l.daj;
import l.e30;
import l.eaj;
import l.faj;
import l.h4g0;
import l.jo0;
import l.kaj;
import l.m250;
import l.qjd0;
import l.roj0;
import l.v9j;
import l.w9j;
import l.x9j;
import l.y9j;
import l.z3g0;
import l.z9j;
import rx.Notification;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class mkd0 {

    /* JADX INFO: renamed from: l.mkd0$c */
    public static class C0613c<T> implements c.a<T> {

        /* JADX INFO: renamed from: a */
        public final v9j<c<T>> f3309a;

        /* JADX INFO: renamed from: b */
        public final c<Pair<Boolean, Boolean>> f3310b;

        /* JADX INFO: renamed from: c */
        public final boolean f3311c;

        /* JADX INFO: renamed from: e */
        public c4g0 f3313e;

        /* JADX INFO: renamed from: f */
        public c4g0 f3314f;

        /* JADX INFO: renamed from: i */
        public boolean f3317i;

        /* JADX INFO: renamed from: d */
        public boolean f3312d = false;

        /* JADX INFO: renamed from: g */
        public T f3315g = null;

        /* JADX INFO: renamed from: h */
        public boolean f3316h = false;

        /* JADX INFO: renamed from: l.mkd0$c$a */
        public class a extends z3g0<Pair<Boolean, Boolean>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f3318e;

            /* JADX INFO: renamed from: l.mkd0$c$a$a, reason: collision with other inner class name */
            public class C0823a extends z3g0<T> {
                public C0823a() {
                }

                public void onCompleted() {
                    a aVar = a.this;
                    C0613c c0613c = C0613c.this;
                    if (c0613c.f3315g == null) {
                        aVar.f3318e.onCompleted();
                    } else {
                        c0613c.f3317i = true;
                    }
                }

                public void onError(Throwable th) {
                    a aVar = a.this;
                    C0613c.this.f3315g = null;
                    aVar.f3318e.onError(th);
                }

                public void onNext(T t) {
                    if (C0613c.this.f3311c) {
                        C0613c c0613c = C0613c.this;
                        if (c0613c.f3316h) {
                            c0613c.f3315g = t;
                            return;
                        }
                    }
                    try {
                        a.this.f3318e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(z3g0 z3g0Var) {
                this.f3318e = z3g0Var;
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Pair<Boolean, Boolean> pair) {
                c4g0 c4g0Var;
                C0613c.this.f3316h = !((Boolean) pair.second).booleanValue();
                C0613c c0613c = C0613c.this;
                if (!c0613c.f3312d) {
                    c0613c.f3312d = true;
                    c0613c.f3313e = ((c) c0613c.f3309a.call()).subscribe(new C0823a());
                }
                boolean zIsUnsubscribed = isUnsubscribed();
                C0613c c0613c2 = C0613c.this;
                if (zIsUnsubscribed) {
                    c0613c2.m9917f();
                    return;
                }
                if (c0613c2.f3316h) {
                    if (!((Boolean) pair.first).booleanValue() || (c4g0Var = C0613c.this.f3313e) == null || c4g0Var.isUnsubscribed()) {
                        return;
                    }
                    C0613c.this.f3313e.unsubscribe();
                    return;
                }
                if (c0613c2.f3315g != null) {
                    if (!isUnsubscribed()) {
                        this.f3318e.onNext(C0613c.this.f3315g);
                        if (C0613c.this.f3317i) {
                            this.f3318e.onCompleted();
                        }
                    }
                    C0613c.this.f3315g = null;
                }
            }

            public void onCompleted() {
                C0613c c0613c = C0613c.this;
                c0613c.f3315g = null;
                c4g0 c4g0Var = c0613c.f3313e;
                if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                    C0613c.this.f3313e.unsubscribe();
                }
                C0613c.this.f3312d = true;
            }

            public void onError(Throwable th) {
                C0613c.this.f3315g = null;
                this.f3318e.onError(th);
            }
        }

        public C0613c(v9j<c<T>> v9jVar, c<Pair<Boolean, Boolean>> cVar, boolean z) {
            this.f3309a = v9jVar;
            this.f3310b = cVar;
            this.f3311c = z;
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            this.f3314f = this.f3310b.subscribe(new a(z3g0Var));
            z3g0Var.b(h4g0.a(new d30() { // from class: l.nkd0
                public final void call() {
                    this.f3412a.m9917f();
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final void m9917f() {
            this.f3315g = null;
            c4g0 c4g0Var = this.f3313e;
            if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                this.f3313e.unsubscribe();
            }
            this.f3313e = null;
            c4g0 c4g0Var2 = this.f3314f;
            if (c4g0Var2 != null && !c4g0Var2.isUnsubscribed()) {
                this.f3314f.unsubscribe();
            }
            this.f3314f = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static StackTraceElement[] m9868A(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 2) {
            return null;
        }
        return new StackTraceElement[]{stackTrace[0], stackTrace[1], stackTrace[2]};
    }

    /* JADX INFO: renamed from: B */
    public static <T> z3g0<T> m9869B() {
        return a4g0.b(new C0611a());
    }

    /* JADX INFO: renamed from: C */
    public static <T> c.d<T, T> m9870C() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(io)，Check it before ANR");
        return new c.d() { // from class: l.yjd0
            public final Object call(Object obj) {
                return ((c) obj).subscribeOn(Schedulers.io()).map(new w9j() { // from class: l.gkd0
                    public final Object call(Object obj2) {
                        return mkd0.m9893h(exc, obj2);
                    }
                }).observeOn(jo0.a());
            }
        };
    }

    /* JADX INFO: renamed from: D */
    public static <T> c<T> m9871D(v9j<c<T>> v9jVar, c<Pair<Boolean, Boolean>> cVar, boolean z) {
        return c.create(new C0613c(v9jVar, cVar, z));
    }

    /* JADX INFO: renamed from: E */
    public static c.d<C0231c, Pair<Boolean, Boolean>> m9872E() {
        return new c.d() { // from class: l.dkd0
            public final Object call(Object obj) {
                return ((c) obj).filter(new w9j() { // from class: l.ikd0
                    public final Object call(Object obj2) {
                        C0231c c0231c = (C0231c) obj2;
                        return Boolean.valueOf(c0231c == C0231c.f1244f || c0231c == C0231c.f1245g || c0231c == C0231c.f1246h || c0231c == C0231c.f1247i || c0231c == C0231c.f1249k || c0231c == C0231c.f1250l || c0231c == C0231c.f1251m || c0231c == C0231c.f1253o);
                    }
                }).map(new w9j() { // from class: l.jkd0
                    public final Object call(Object obj2) {
                        return mkd0.m9894i((C0231c) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static <T> C0254a<T> m9873F() {
        return C0254a.m1065c(m9900o());
    }

    /* JADX INFO: renamed from: G */
    public static <T> C0254a<T> m9874G(@NonNull e30<T> e30Var) {
        return C0254a.m1066d(m9900o(), e30Var);
    }

    /* JADX INFO: renamed from: H */
    public static <T> C0254a<T> m9875H(@NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        return C0254a.m1067e(m9900o(), e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: I */
    public static <T> C0254a<T> m9876I(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        return C0254a.m1068f(m9900o(), e30Var, e30Var2, d30Var, true);
    }

    /* JADX INFO: renamed from: J */
    public static <T> C0254a<T> m9877J(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        return C0254a.m1068f(m9900o(), e30Var, e30Var2, d30Var, z);
    }

    /* JADX INFO: renamed from: K */
    public static <T> C0254a<T> m9878K(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        return C0254a.m1069g(m9900o(), e30Var, e30Var2, z);
    }

    /* JADX INFO: renamed from: L */
    public static <T> C0254a<T> m9879L(m250<T> m250Var) {
        return C0254a.m1070h(m9900o(), m250Var);
    }

    /* JADX INFO: renamed from: N */
    public static <T> c.d<T, Notification<T>> m9881N() {
        return new c.d() { // from class: l.bkd0
            public final Object call(Object obj) {
                return ((c) obj).doOnError(new e30() { // from class: l.ckd0
                    public final void call(Object obj2) {
                        App.f1067d.m704k((Throwable) obj2);
                    }
                }).materialize();
            }
        };
    }

    /* JADX INFO: renamed from: O */
    public static <T> c.d<T, T> m9882O(@NonNull final View view) {
        final b bVarB = b.b();
        final ViewOnAttachStateChangeListenerC0612b viewOnAttachStateChangeListenerC0612b = new ViewOnAttachStateChangeListenerC0612b(bVarB);
        return new c.d() { // from class: l.hkd0
            public final Object call(Object obj) {
                View view2 = view;
                View.OnAttachStateChangeListener onAttachStateChangeListener = viewOnAttachStateChangeListenerC0612b;
                return ((c) obj).doOnSubscribe(new d30() { // from class: l.kkd0
                    public final void call() {
                        view2.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).doOnUnsubscribe(new d30() { // from class: l.lkd0
                    public final void call() {
                        view2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).takeUntil(bVarB);
            }
        };
    }

    /* JADX INFO: renamed from: P */
    public static <T> c.d<T, T> m9883P() {
        return qjd0.e(Schedulers.computation());
    }

    /* JADX INFO: renamed from: Q */
    public static <T> c.d<T, T> m9884Q() {
        return qjd0.e(Schedulers.io());
    }

    /* JADX INFO: renamed from: R */
    public static <T> c.d<T, T> m9885R() {
        return qjd0.e(jo0.a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m9892g(Exception exc, Object obj) {
        qjd0.d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m9893h(Exception exc, Object obj) {
        qjd0.d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m9894i(C0231c c0231c) {
        return new Pair(Boolean.valueOf(c0231c.f1257d), Boolean.valueOf(c0231c.f1254a));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m9895j(boolean[] zArr, StackTraceElement[] stackTraceElementArr) {
        if (zArr[0]) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("combineLatest never emit next\n");
        runtimeException.setStackTrace(stackTraceElementArr);
        CrashHelper.c(runtimeException);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9898m(boolean[] zArr, Object obj) {
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: o */
    public static StackTraceElement[] m9900o() {
        return m9868A(new Exception());
    }

    /* JADX INFO: renamed from: p */
    public static <T, R> c<R> m9901p(List<? extends c<? extends T>> list, faj<? extends R> fajVar) {
        return m9902q(list, fajVar, m9900o());
    }

    /* JADX INFO: renamed from: q */
    public static <T, R> c<R> m9902q(List<? extends c<? extends T>> list, faj<? extends R> fajVar, final StackTraceElement[] stackTraceElementArr) {
        final boolean[] zArr = {false};
        return c.combineLatest(list, fajVar).doOnNext(new e30() { // from class: l.ekd0
            public final void call(Object obj) {
                mkd0.m9898m(zArr, obj);
            }
        }).doOnCompleted(new d30() { // from class: l.fkd0
            public final void call() {
                mkd0.m9895j(zArr, stackTraceElementArr);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static <T1, T2, R> c<R> m9903r(c<? extends T1> cVar, c<? extends T2> cVar2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return m9902q(Arrays.asList(cVar, cVar2), kaj.a(x9jVar), m9900o());
    }

    /* JADX INFO: renamed from: s */
    public static <T1, T2, T3, R> c<R> m9904s(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3), kaj.b(y9jVar), m9900o());
    }

    /* JADX INFO: renamed from: t */
    public static <T1, T2, T3, T4, R> c<R> m9905t(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3, cVar4), kaj.c(z9jVar), m9900o());
    }

    /* JADX INFO: renamed from: u */
    public static <T1, T2, T3, T4, T5, R> c<R> m9906u(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5), kaj.d(aajVar), m9900o());
    }

    /* JADX INFO: renamed from: v */
    public static <T1, T2, T3, T4, T5, T6, R> c<R> m9907v(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6), kaj.e(bajVar), m9900o());
    }

    /* JADX INFO: renamed from: w */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> c<R> m9908w(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8), kaj.g(dajVar), m9900o());
    }

    /* JADX INFO: renamed from: x */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> c<R> m9909x(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, c<? extends T9> cVar9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return m9902q(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9), kaj.h(eajVar), m9900o());
    }

    /* JADX INFO: renamed from: y */
    public static <T> c.d<T, T> m9910y() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(computation)，Check it before ANR");
        return new c.d() { // from class: l.zjd0
            public final Object call(Object obj) {
                return ((c) obj).subscribeOn(Schedulers.computation()).map(new w9j() { // from class: l.akd0
                    public final Object call(Object obj2) {
                        return mkd0.m9892g(exc, obj2);
                    }
                }).observeOn(jo0.a());
            }
        };
    }

    /* JADX INFO: renamed from: z */
    public static void m9911z(@Nullable c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.mkd0$a */
    public class C0611a<T> implements m250<T> {
        public void onError(Throwable th) {
            mkd0.m9880M(th);
        }

        public void onCompleted() {
        }

        public void onNext(T t) {
        }
    }

    /* JADX INFO: renamed from: l.mkd0$b */
    public class ViewOnAttachStateChangeListenerC0612b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f3308a;

        public ViewOnAttachStateChangeListenerC0612b(b bVar) {
            this.f3308a = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f3308a.onNext(roj0.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m9880M(Throwable th) {
    }
}
