package p153l;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p052rx.C4493a;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.List;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes8.dex */
public class psd0 {

    /* JADX INFO: renamed from: l.psd0$c */
    public static class C19434c<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final pcj<C22421c<T>> f153883a;

        /* JADX INFO: renamed from: b */
        public final C22421c<Pair<Boolean, Boolean>> f153884b;

        /* JADX INFO: renamed from: c */
        public final boolean f153885c;

        /* JADX INFO: renamed from: e */
        public kcg0 f153887e;

        /* JADX INFO: renamed from: f */
        public kcg0 f153888f;

        /* JADX INFO: renamed from: i */
        public boolean f153891i;

        /* JADX INFO: renamed from: d */
        public boolean f153886d = false;

        /* JADX INFO: renamed from: g */
        public T f153889g = null;

        /* JADX INFO: renamed from: h */
        public boolean f153890h = false;

        /* JADX INFO: renamed from: l.psd0$c$a */
        public class a extends gcg0<Pair<Boolean, Boolean>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gcg0 f153892e;

            /* JADX INFO: renamed from: l.psd0$c$a$a, reason: collision with other inner class name */
            public class C22842a extends gcg0<T> {
                public C22842a() {
                }

                @Override // p153l.bb50
                public void onCompleted() {
                    a aVar = a.this;
                    C19434c c19434c = C19434c.this;
                    if (c19434c.f153889g == null) {
                        aVar.f153892e.onCompleted();
                    } else {
                        c19434c.f153891i = true;
                    }
                }

                @Override // p153l.bb50
                public void onError(Throwable th) {
                    a aVar = a.this;
                    C19434c.this.f153889g = null;
                    aVar.f153892e.onError(th);
                }

                @Override // p153l.bb50
                public void onNext(T t) {
                    if (C19434c.this.f153885c) {
                        C19434c c19434c = C19434c.this;
                        if (c19434c.f153890h) {
                            c19434c.f153889g = t;
                            return;
                        }
                    }
                    try {
                        a.this.f153892e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(gcg0 gcg0Var) {
                this.f153892e = gcg0Var;
            }

            @Override // p153l.bb50
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Pair<Boolean, Boolean> pair) {
                kcg0 kcg0Var;
                C19434c.this.f153890h = !((Boolean) pair.second).booleanValue();
                C19434c c19434c = C19434c.this;
                if (!c19434c.f153886d) {
                    c19434c.f153886d = true;
                    c19434c.f153887e = ((C22421c) c19434c.f153883a.call()).subscribe((gcg0) new C22842a());
                }
                boolean zIsUnsubscribed = isUnsubscribed();
                C19434c c19434c2 = C19434c.this;
                if (zIsUnsubscribed) {
                    c19434c2.m173639f();
                    return;
                }
                if (c19434c2.f153890h) {
                    if (!((Boolean) pair.first).booleanValue() || (kcg0Var = C19434c.this.f153887e) == null || kcg0Var.isUnsubscribed()) {
                        return;
                    }
                    C19434c.this.f153887e.unsubscribe();
                    return;
                }
                if (c19434c2.f153889g != null) {
                    if (!isUnsubscribed()) {
                        this.f153892e.onNext(C19434c.this.f153889g);
                        if (C19434c.this.f153891i) {
                            this.f153892e.onCompleted();
                        }
                    }
                    C19434c.this.f153889g = null;
                }
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C19434c c19434c = C19434c.this;
                c19434c.f153889g = null;
                kcg0 kcg0Var = c19434c.f153887e;
                if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
                    C19434c.this.f153887e.unsubscribe();
                }
                C19434c.this.f153886d = true;
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C19434c.this.f153889g = null;
                this.f153892e.onError(th);
            }
        }

        public C19434c(pcj<C22421c<T>> pcjVar, C22421c<Pair<Boolean, Boolean>> c22421c, boolean z) {
            this.f153883a = pcjVar;
            this.f153884b = c22421c;
            this.f153885c = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            this.f153888f = this.f153884b.subscribe((gcg0<? super Pair<Boolean, Boolean>>) new a(gcg0Var));
            gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.qsd0
                @Override // p153l.x20
                public final void call() {
                    this.f159285a.m173639f();
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final void m173639f() {
            this.f153889g = null;
            kcg0 kcg0Var = this.f153887e;
            if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
                this.f153887e.unsubscribe();
            }
            this.f153887e = null;
            kcg0 kcg0Var2 = this.f153888f;
            if (kcg0Var2 != null && !kcg0Var2.isUnsubscribed()) {
                this.f153888f.unsubscribe();
            }
            this.f153888f = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static StackTraceElement[] m173590A(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 2) {
            return null;
        }
        return new StackTraceElement[]{stackTrace[0], stackTrace[1], stackTrace[2]};
    }

    /* JADX INFO: renamed from: B */
    public static <T> gcg0<T> m173591B() {
        return icg0.m139435b(new C19432a());
    }

    /* JADX INFO: renamed from: C */
    public static <T> C22421c.d<T, T> m173592C() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(io)，Check it before ANR");
        return new C22421c.d() { // from class: l.bsd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).subscribeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.jsd0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return psd0.m173615h(exc, obj2);
                    }
                }).observeOn(fo0.m126432a());
            }
        };
    }

    /* JADX INFO: renamed from: D */
    public static <T> C22421c<T> m173593D(pcj<C22421c<T>> pcjVar, C22421c<Pair<Boolean, Boolean>> c22421c, boolean z) {
        return C22421c.create(new C19434c(pcjVar, c22421c, z));
    }

    /* JADX INFO: renamed from: E */
    public static C22421c.d<C4470c, Pair<Boolean, Boolean>> m173594E() {
        return new C22421c.d() { // from class: l.gsd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).filter(new qcj() { // from class: l.lsd0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        C4470c c4470c = (C4470c) obj2;
                        return Boolean.valueOf(c4470c == C4470c.f16264f || c4470c == C4470c.f16265g || c4470c == C4470c.f16266h || c4470c == C4470c.f16267i || c4470c == C4470c.f16269k || c4470c == C4470c.f16270l || c4470c == C4470c.f16271m || c4470c == C4470c.f16273o);
                    }
                }).map(new qcj() { // from class: l.msd0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return psd0.m173616i((C4470c) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static <T> C4493a<T> m173595F() {
        return C4493a.m21793c(m173622o());
    }

    /* JADX INFO: renamed from: G */
    public static <T> C4493a<T> m173596G(@NonNull y20<T> y20Var) {
        return C4493a.m21794d(m173622o(), y20Var);
    }

    /* JADX INFO: renamed from: H */
    public static <T> C4493a<T> m173597H(@NonNull y20<T> y20Var, y20<Throwable> y20Var2) {
        return C4493a.m21795e(m173622o(), y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: I */
    public static <T> C4493a<T> m173598I(@NonNull y20<T> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        return C4493a.m21796f(m173622o(), y20Var, y20Var2, x20Var, true);
    }

    /* JADX INFO: renamed from: J */
    public static <T> C4493a<T> m173599J(@NonNull y20<T> y20Var, y20<Throwable> y20Var2, x20 x20Var, boolean z) {
        return C4493a.m21796f(m173622o(), y20Var, y20Var2, x20Var, z);
    }

    /* JADX INFO: renamed from: K */
    public static <T> C4493a<T> m173600K(@NonNull y20<T> y20Var, y20<Throwable> y20Var2, boolean z) {
        return C4493a.m21797g(m173622o(), y20Var, y20Var2, z);
    }

    /* JADX INFO: renamed from: L */
    public static <T> C4493a<T> m173601L(bb50<T> bb50Var) {
        return C4493a.m21798h(m173622o(), bb50Var);
    }

    /* JADX INFO: renamed from: N */
    public static <T> C22421c.d<T, Notification<T>> m173603N() {
        return new C22421c.d() { // from class: l.esd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).doOnError(new y20() { // from class: l.fsd0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        App.f16087d.m21432k((Throwable) obj2);
                    }
                }).materialize();
            }
        };
    }

    /* JADX INFO: renamed from: O */
    public static <T> C22421c.d<T, T> m173604O(@NonNull final View view) {
        final C22508b c22508bM222767b = C22508b.m222767b();
        final ViewOnAttachStateChangeListenerC19433b viewOnAttachStateChangeListenerC19433b = new ViewOnAttachStateChangeListenerC19433b(c22508bM222767b);
        return new C22421c.d() { // from class: l.ksd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                View view2 = view;
                View.OnAttachStateChangeListener onAttachStateChangeListener = viewOnAttachStateChangeListenerC19433b;
                return ((C22421c) obj).doOnSubscribe(new x20() { // from class: l.nsd0
                    @Override // p153l.x20
                    public final void call() {
                        view2.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).doOnUnsubscribe(new x20() { // from class: l.osd0
                    @Override // p153l.x20
                    public final void call() {
                        view2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                    }
                }).takeUntil(c22508bM222767b);
            }
        };
    }

    /* JADX INFO: renamed from: P */
    public static <T> C22421c.d<T, T> m173605P() {
        return trd0.m192475e(Schedulers.computation());
    }

    /* JADX INFO: renamed from: Q */
    public static <T> C22421c.d<T, T> m173606Q() {
        return trd0.m192475e(Schedulers.m222739io());
    }

    /* JADX INFO: renamed from: R */
    public static <T> C22421c.d<T, T> m173607R() {
        return trd0.m192475e(fo0.m126432a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m173614g(Exception exc, Object obj) {
        trd0.m192474d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m173615h(Exception exc, Object obj) {
        trd0.m192474d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m173616i(C4470c c4470c) {
        return new Pair(Boolean.valueOf(c4470c.f16277d), Boolean.valueOf(c4470c.f16274a));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m173617j(boolean[] zArr, StackTraceElement[] stackTraceElementArr) {
        if (zArr[0]) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("combineLatest never emit next\n");
        runtimeException.setStackTrace(stackTraceElementArr);
        CrashHelper.m82479c(runtimeException);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m173620m(boolean[] zArr, Object obj) {
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: o */
    public static StackTraceElement[] m173622o() {
        return m173590A(new Exception());
    }

    /* JADX INFO: renamed from: p */
    public static <T, R> C22421c<R> m173623p(List<? extends C22421c<? extends T>> list, zcj<? extends R> zcjVar) {
        return m173624q(list, zcjVar, m173622o());
    }

    /* JADX INFO: renamed from: q */
    public static <T, R> C22421c<R> m173624q(List<? extends C22421c<? extends T>> list, zcj<? extends R> zcjVar, final StackTraceElement[] stackTraceElementArr) {
        final boolean[] zArr = {false};
        return C22421c.combineLatest((List) list, (zcj) zcjVar).doOnNext(new y20() { // from class: l.hsd0
            @Override // p153l.y20
            public final void call(Object obj) {
                psd0.m173620m(zArr, obj);
            }
        }).doOnCompleted(new x20() { // from class: l.isd0
            @Override // p153l.x20
            public final void call() {
                psd0.m173617j(zArr, stackTraceElementArr);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static <T1, T2, R> C22421c<R> m173625r(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, rcj<? super T1, ? super T2, ? extends R> rcjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2), edj.m120459a(rcjVar), m173622o());
    }

    /* JADX INFO: renamed from: s */
    public static <T1, T2, T3, R> C22421c<R> m173626s(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, scj<? super T1, ? super T2, ? super T3, ? extends R> scjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3), edj.m120460b(scjVar), m173622o());
    }

    /* JADX INFO: renamed from: t */
    public static <T1, T2, T3, T4, R> C22421c<R> m173627t(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, tcj<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> tcjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4), edj.m120461c(tcjVar), m173622o());
    }

    /* JADX INFO: renamed from: u */
    public static <T1, T2, T3, T4, T5, R> C22421c<R> m173628u(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, ucj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> ucjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5), edj.m120462d(ucjVar), m173622o());
    }

    /* JADX INFO: renamed from: v */
    public static <T1, T2, T3, T4, T5, T6, R> C22421c<R> m173629v(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, vcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vcjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6), edj.m120463e(vcjVar), m173622o());
    }

    /* JADX INFO: renamed from: w */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22421c<R> m173630w(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, xcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> xcjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8), edj.m120465g(xcjVar), m173622o());
    }

    /* JADX INFO: renamed from: x */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22421c<R> m173631x(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, C22421c<? extends T9> c22421c9, ycj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> ycjVar) {
        return m173624q(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9), edj.m120466h(ycjVar), m173622o());
    }

    /* JADX INFO: renamed from: y */
    public static <T> C22421c.d<T, T> m173632y() {
        final Exception exc = new Exception("run in UI thread after subscribeOn(computation)，Check it before ANR");
        return new C22421c.d() { // from class: l.csd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).subscribeOn(Schedulers.computation()).map(new qcj() { // from class: l.dsd0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return psd0.m173614g(exc, obj2);
                    }
                }).observeOn(fo0.m126432a());
            }
        };
    }

    /* JADX INFO: renamed from: z */
    public static void m173633z(@Nullable kcg0 kcg0Var) {
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            return;
        }
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.psd0$a */
    public class C19432a<T> implements bb50<T> {
        @Override // p153l.bb50
        public void onError(Throwable th) {
            psd0.m173602M(th);
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onNext(T t) {
        }
    }

    /* JADX INFO: renamed from: l.psd0$b */
    public class ViewOnAttachStateChangeListenerC19433b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22508b f153882a;

        public ViewOnAttachStateChangeListenerC19433b(C22508b c22508b) {
            this.f153882a = c22508b;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f153882a.onNext(uxj0.f181467a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m173602M(Throwable th) {
    }
}
