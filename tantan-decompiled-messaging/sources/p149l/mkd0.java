package p149l;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p047rx.C4342a;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.List;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes8.dex */
public class mkd0 {

    /* JADX INFO: renamed from: l.mkd0$c */
    public static class C18490c<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final v9j<C22306c<T>> f134309a;

        /* JADX INFO: renamed from: b */
        public final C22306c<Pair<Boolean, Boolean>> f134310b;

        /* JADX INFO: renamed from: c */
        public final boolean f134311c;

        /* JADX INFO: renamed from: e */
        public c4g0 f134313e;

        /* JADX INFO: renamed from: f */
        public c4g0 f134314f;

        /* JADX INFO: renamed from: i */
        public boolean f134317i;

        /* JADX INFO: renamed from: d */
        public boolean f134312d = false;

        /* JADX INFO: renamed from: g */
        public T f134315g = null;

        /* JADX INFO: renamed from: h */
        public boolean f134316h = false;

        /* JADX INFO: renamed from: l.mkd0$c$a */
        public class a extends z3g0<Pair<Boolean, Boolean>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f134318e;

            /* JADX INFO: renamed from: l.mkd0$c$a$a, reason: collision with other inner class name */
            public class C22728a extends z3g0<T> {
                public C22728a() {
                }

                @Override // p149l.m250
                public void onCompleted() {
                    a aVar = a.this;
                    C18490c c18490c = C18490c.this;
                    if (c18490c.f134315g == null) {
                        aVar.f134318e.onCompleted();
                    } else {
                        c18490c.f134317i = true;
                    }
                }

                @Override // p149l.m250
                public void onError(Throwable th) {
                    a aVar = a.this;
                    C18490c.this.f134315g = null;
                    aVar.f134318e.onError(th);
                }

                @Override // p149l.m250
                public void onNext(T t) {
                    if (C18490c.this.f134311c) {
                        C18490c c18490c = C18490c.this;
                        if (c18490c.f134316h) {
                            c18490c.f134315g = t;
                            return;
                        }
                    }
                    try {
                        a.this.f134318e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(z3g0 z3g0Var) {
                this.f134318e = z3g0Var;
            }

            @Override // p149l.m250
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Pair<Boolean, Boolean> pair) {
                c4g0 c4g0Var;
                C18490c.this.f134316h = !((Boolean) pair.second).booleanValue();
                C18490c c18490c = C18490c.this;
                if (!c18490c.f134312d) {
                    c18490c.f134312d = true;
                    c18490c.f134313e = ((C22306c) c18490c.f134309a.call()).subscribe((z3g0) new C22728a());
                }
                boolean zIsUnsubscribed = isUnsubscribed();
                C18490c c18490c2 = C18490c.this;
                if (zIsUnsubscribed) {
                    c18490c2.m154998f();
                    return;
                }
                if (c18490c2.f134316h) {
                    if (!((Boolean) pair.first).booleanValue() || (c4g0Var = C18490c.this.f134313e) == null || c4g0Var.isUnsubscribed()) {
                        return;
                    }
                    C18490c.this.f134313e.unsubscribe();
                    return;
                }
                if (c18490c2.f134315g != null) {
                    if (!isUnsubscribed()) {
                        this.f134318e.onNext(C18490c.this.f134315g);
                        if (C18490c.this.f134317i) {
                            this.f134318e.onCompleted();
                        }
                    }
                    C18490c.this.f134315g = null;
                }
            }

            @Override // p149l.m250
            public void onCompleted() {
                C18490c c18490c = C18490c.this;
                c18490c.f134315g = null;
                c4g0 c4g0Var = c18490c.f134313e;
                if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                    C18490c.this.f134313e.unsubscribe();
                }
                C18490c.this.f134312d = true;
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C18490c.this.f134315g = null;
                this.f134318e.onError(th);
            }
        }

        public C18490c(v9j<C22306c<T>> v9jVar, C22306c<Pair<Boolean, Boolean>> c22306c, boolean z) {
            this.f134309a = v9jVar;
            this.f134310b = c22306c;
            this.f134311c = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            this.f134314f = this.f134310b.subscribe((z3g0<? super Pair<Boolean, Boolean>>) new a(z3g0Var));
            z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.nkd0
                @Override // p149l.d30
                public final void call() {
                    this.f139392a.m154998f();
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final void m154998f() {
            this.f134315g = null;
            c4g0 c4g0Var = this.f134313e;
            if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                this.f134313e.unsubscribe();
            }
            this.f134313e = null;
            c4g0 c4g0Var2 = this.f134314f;
            if (c4g0Var2 != null && !c4g0Var2.isUnsubscribed()) {
                this.f134314f.unsubscribe();
            }
            this.f134314f = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static StackTraceElement[] m154949A(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 2) {
            return null;
        }
        return new StackTraceElement[]{stackTrace[0], stackTrace[1], stackTrace[2]};
    }

    /* JADX INFO: renamed from: B */
    public static <T> z3g0<T> m154950B() {
        return a4g0.m94918b(new C18488a());
    }

    /* JADX INFO: renamed from: C */
    public static <T> C22306c.d<T, T> m154951C() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(io)，Check it before ANR");
        return new C22306c.d() { // from class: l.yjd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).subscribeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.gkd0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return mkd0.m154974h(exc, obj2);
                    }
                }).observeOn(jo0.m142408a());
            }
        };
    }

    /* JADX INFO: renamed from: D */
    public static <T> C22306c<T> m154952D(v9j<C22306c<T>> v9jVar, C22306c<Pair<Boolean, Boolean>> c22306c, boolean z) {
        return C22306c.create(new C18490c(v9jVar, c22306c, z));
    }

    /* JADX INFO: renamed from: E */
    public static C22306c.d<C4319c, Pair<Boolean, Boolean>> m154953E() {
        return new C22306c.d() { // from class: l.dkd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).filter(new w9j() { // from class: l.ikd0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        C4319c c4319c = (C4319c) obj2;
                        return Boolean.valueOf(c4319c == C4319c.f15545f || c4319c == C4319c.f15546g || c4319c == C4319c.f15547h || c4319c == C4319c.f15548i || c4319c == C4319c.f15550k || c4319c == C4319c.f15551l || c4319c == C4319c.f15552m || c4319c == C4319c.f15554o);
                    }
                }).map(new w9j() { // from class: l.jkd0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return mkd0.m154975i((C4319c) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static <T> C4342a<T> m154954F() {
        return C4342a.m20794c(m154981o());
    }

    /* JADX INFO: renamed from: G */
    public static <T> C4342a<T> m154955G(@NonNull e30<T> e30Var) {
        return C4342a.m20795d(m154981o(), e30Var);
    }

    /* JADX INFO: renamed from: H */
    public static <T> C4342a<T> m154956H(@NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        return C4342a.m20796e(m154981o(), e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: I */
    public static <T> C4342a<T> m154957I(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        return C4342a.m20797f(m154981o(), e30Var, e30Var2, d30Var, true);
    }

    /* JADX INFO: renamed from: J */
    public static <T> C4342a<T> m154958J(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        return C4342a.m20797f(m154981o(), e30Var, e30Var2, d30Var, z);
    }

    /* JADX INFO: renamed from: K */
    public static <T> C4342a<T> m154959K(@NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        return C4342a.m20798g(m154981o(), e30Var, e30Var2, z);
    }

    /* JADX INFO: renamed from: L */
    public static <T> C4342a<T> m154960L(m250<T> m250Var) {
        return C4342a.m20799h(m154981o(), m250Var);
    }

    /* JADX INFO: renamed from: N */
    public static <T> C22306c.d<T, Notification<T>> m154962N() {
        return new C22306c.d() { // from class: l.bkd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).doOnError(new e30() { // from class: l.ckd0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        App.f15368d.m20433k((Throwable) obj2);
                    }
                }).materialize();
            }
        };
    }

    /* JADX INFO: renamed from: O */
    public static <T> C22306c.d<T, T> m154963O(@NonNull final View view) {
        final C22393b c22393bM221521b = C22393b.m221521b();
        final ViewOnAttachStateChangeListenerC18489b viewOnAttachStateChangeListenerC18489b = new ViewOnAttachStateChangeListenerC18489b(c22393bM221521b);
        return new C22306c.d() { // from class: l.hkd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                View view2 = view;
                View.OnAttachStateChangeListener onAttachStateChangeListener = viewOnAttachStateChangeListenerC18489b;
                return ((C22306c) obj).doOnSubscribe(new d30() { // from class: l.kkd0
                    @Override // p149l.d30
                    public final void call() {
                        view2.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).doOnUnsubscribe(new d30() { // from class: l.lkd0
                    @Override // p149l.d30
                    public final void call() {
                        view2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).takeUntil(c22393bM221521b);
            }
        };
    }

    /* JADX INFO: renamed from: P */
    public static <T> C22306c.d<T, T> m154964P() {
        return qjd0.m174993e(Schedulers.computation());
    }

    /* JADX INFO: renamed from: Q */
    public static <T> C22306c.d<T, T> m154965Q() {
        return qjd0.m174993e(Schedulers.m221493io());
    }

    /* JADX INFO: renamed from: R */
    public static <T> C22306c.d<T, T> m154966R() {
        return qjd0.m174993e(jo0.m142408a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m154973g(Exception exc, Object obj) {
        qjd0.m174992d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m154974h(Exception exc, Object obj) {
        qjd0.m174992d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m154975i(C4319c c4319c) {
        return new Pair(Boolean.valueOf(c4319c.f15558d), Boolean.valueOf(c4319c.f15555a));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m154976j(boolean[] zArr, StackTraceElement[] stackTraceElementArr) {
        if (zArr[0]) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("combineLatest never emit next\n");
        runtimeException.setStackTrace(stackTraceElementArr);
        CrashHelper.m81296c(runtimeException);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m154979m(boolean[] zArr, Object obj) {
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: o */
    public static StackTraceElement[] m154981o() {
        return m154949A(new Exception());
    }

    /* JADX INFO: renamed from: p */
    public static <T, R> C22306c<R> m154982p(List<? extends C22306c<? extends T>> list, faj<? extends R> fajVar) {
        return m154983q(list, fajVar, m154981o());
    }

    /* JADX INFO: renamed from: q */
    public static <T, R> C22306c<R> m154983q(List<? extends C22306c<? extends T>> list, faj<? extends R> fajVar, final StackTraceElement[] stackTraceElementArr) {
        final boolean[] zArr = {false};
        return C22306c.combineLatest((List) list, (faj) fajVar).doOnNext(new e30() { // from class: l.ekd0
            @Override // p149l.e30
            public final void call(Object obj) {
                mkd0.m154979m(zArr, obj);
            }
        }).doOnCompleted(new d30() { // from class: l.fkd0
            @Override // p149l.d30
            public final void call() {
                mkd0.m154976j(zArr, stackTraceElementArr);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static <T1, T2, R> C22306c<R> m154984r(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2), kaj.m145144a(x9jVar), m154981o());
    }

    /* JADX INFO: renamed from: s */
    public static <T1, T2, T3, R> C22306c<R> m154985s(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3), kaj.m145145b(y9jVar), m154981o());
    }

    /* JADX INFO: renamed from: t */
    public static <T1, T2, T3, T4, R> C22306c<R> m154986t(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4), kaj.m145146c(z9jVar), m154981o());
    }

    /* JADX INFO: renamed from: u */
    public static <T1, T2, T3, T4, T5, R> C22306c<R> m154987u(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5), kaj.m145147d(aajVar), m154981o());
    }

    /* JADX INFO: renamed from: v */
    public static <T1, T2, T3, T4, T5, T6, R> C22306c<R> m154988v(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6), kaj.m145148e(bajVar), m154981o());
    }

    /* JADX INFO: renamed from: w */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22306c<R> m154989w(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8), kaj.m145150g(dajVar), m154981o());
    }

    /* JADX INFO: renamed from: x */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22306c<R> m154990x(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, C22306c<? extends T9> c22306c9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return m154983q(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9), kaj.m145151h(eajVar), m154981o());
    }

    /* JADX INFO: renamed from: y */
    public static <T> C22306c.d<T, T> m154991y() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(computation)，Check it before ANR");
        return new C22306c.d() { // from class: l.zjd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).subscribeOn(Schedulers.computation()).map(new w9j() { // from class: l.akd0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return mkd0.m154973g(exc, obj2);
                    }
                }).observeOn(jo0.m142408a());
            }
        };
    }

    /* JADX INFO: renamed from: z */
    public static void m154992z(@Nullable c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.mkd0$a */
    public class C18488a<T> implements m250<T> {
        @Override // p149l.m250
        public void onError(Throwable th) {
            mkd0.m154961M(th);
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onNext(T t) {
        }
    }

    /* JADX INFO: renamed from: l.mkd0$b */
    public class ViewOnAttachStateChangeListenerC18489b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22393b f134308a;

        public ViewOnAttachStateChangeListenerC18489b(C22393b c22393b) {
            this.f134308a = c22393b;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f134308a.onNext(roj0.f160388a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m154961M(Throwable th) {
    }
}
