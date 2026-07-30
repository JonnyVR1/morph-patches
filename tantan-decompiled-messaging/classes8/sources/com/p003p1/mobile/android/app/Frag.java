package com.p003p1.mobile.android.app;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.app.Frag;
import com.p003p1.mobile.android.p005ui.poplevel.PopLifecycleEvent;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.du2;
import l.e30;
import l.h4g0;
import l.lod0;
import l.n11;
import l.v9j;
import l.z3g0;
import p007l.e51;
import p007l.hi3;
import p007l.k0m;
import p007l.mcr;
import p007l.mkd0;
import p007l.pc80;
import p007l.u660;
import rx.c;
import rx.exceptions.OnErrorNotImplementedException;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class Frag extends Fragment implements mcr, k0m {
    public static boolean isFragResumed = false;
    private View cachedView;
    private a<C0231c> lifecycleSubject = a.b();
    private final a<pc80> popLifeSub = a.b();
    private a<C0231c> lifecycleSubjectTemp = this.lifecycleSubject;
    private boolean hasDestroyView = false;
    private C0229a activityReslutManager = new C0229a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$a */
    public class C0226a<T> implements v9j<c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f1219a;

        public C0226a(c cVar) {
            this.f1219a = cVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> call() {
            return this.f1219a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b */
    public class C0227b<T> implements c.a<T> {

        /* JADX INFO: renamed from: a */
        public c4g0 f1221a;

        /* JADX INFO: renamed from: b */
        public c4g0 f1222b;

        /* JADX INFO: renamed from: c */
        public boolean f1223c;

        /* JADX INFO: renamed from: d */
        public T f1224d = null;

        /* JADX INFO: renamed from: e */
        public boolean f1225e = false;

        /* JADX INFO: renamed from: f */
        public boolean f1226f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ v9j f1227g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f1228h;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a */
        public class a extends z3g0<C0231c> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f1230e;

            /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a$a, reason: collision with other inner class name */
            public class C0820a extends z3g0<T> {
                public C0820a() {
                }

                public void onCompleted() {
                    a aVar = a.this;
                    C0227b c0227b = C0227b.this;
                    if (c0227b.f1224d != null) {
                        c0227b.f1226f = true;
                        return;
                    }
                    try {
                        aVar.f1230e.onCompleted();
                    } finally {
                        if (!a.this.f1230e.isUnsubscribed()) {
                            a.this.f1230e.unsubscribe();
                        }
                    }
                }

                public void onError(Throwable th) {
                    a.this.f1230e.onError(th);
                    if (a.this.f1230e.isUnsubscribed()) {
                        return;
                    }
                    a.this.f1230e.unsubscribe();
                }

                public void onNext(T t) {
                    a aVar = a.this;
                    C0227b c0227b = C0227b.this;
                    if (c0227b.f1228h && c0227b.f1225e) {
                        c0227b.f1224d = t;
                        return;
                    }
                    try {
                        aVar.f1230e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(z3g0 z3g0Var) {
                this.f1230e = z3g0Var;
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(C0231c c0231c) {
                if (c0231c == C0231c.f1245g || c0231c == C0231c.f1246h || c0231c == C0231c.f1247i) {
                    C0227b.this.f1225e = false;
                }
                if (c0231c == C0231c.f1245g || ((c0231c == C0231c.f1246h || c0231c == C0231c.f1247i) && !C0227b.this.f1223c)) {
                    C0227b c0227b = C0227b.this;
                    c0227b.f1221a = ((c) c0227b.f1227g.call()).unsafeSubscribe(new C0820a());
                    C0227b.this.f1223c = true;
                } else if (c0231c == C0231c.f1250l || c0231c == C0231c.f1253o) {
                    c4g0 c4g0Var = C0227b.this.f1221a;
                    if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                        C0227b.this.f1221a.unsubscribe();
                    }
                    C0227b.this.f1223c = false;
                }
                if (c0231c == C0231c.f1249k) {
                    C0227b.this.f1225e = true;
                } else if (c0231c == C0231c.f1246h || c0231c == C0231c.f1247i) {
                    C0227b c0227b2 = C0227b.this;
                    c0227b2.f1225e = false;
                    if (c0227b2.f1224d != null) {
                        if (!isUnsubscribed()) {
                            this.f1230e.onNext(C0227b.this.f1224d);
                            if (C0227b.this.f1226f) {
                                this.f1230e.onCompleted();
                                if (!this.f1230e.isUnsubscribed()) {
                                    this.f1230e.unsubscribe();
                                }
                            }
                        }
                        C0227b.this.f1224d = null;
                    }
                }
                if (isUnsubscribed()) {
                    mkd0.m9911z(C0227b.this.f1221a);
                }
            }

            public void onCompleted() {
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: rx.exceptions.OnErrorNotImplementedException */
            public void onError(Throwable th) throws OnErrorNotImplementedException {
                throw new OnErrorNotImplementedException(th);
            }
        }

        public C0227b(v9j v9jVar, boolean z) {
            this.f1227g = v9jVar;
            this.f1228h = z;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(z3g0 z3g0Var) {
            if (z3g0Var instanceof lod0) {
                z3g0Var = ((lod0) z3g0Var).h();
            }
            this.f1222b = Frag.this.lifecycle().unsafeSubscribe(new a(z3g0Var));
            z3g0Var.b(h4g0.a(new d30() { // from class: l.v1j
                public final void call() {
                    this.f4955a.m880c();
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m880c() {
            c4g0 c4g0Var = this.f1221a;
            if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                this.f1221a.unsubscribe();
            }
            c4g0 c4g0Var2 = this.f1222b;
            if (c4g0Var2 == null || c4g0Var2.isUnsubscribed()) {
                return;
            }
            this.f1222b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$c */
    public class C0228c implements C0229a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1233a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0229a.a f1234b;

        public C0228c(int i, C0229a.a aVar) {
            this.f1233a = i;
            this.f1234b = aVar;
        }

        @Override // com.p003p1.mobile.android.app.C0229a.a
        /* JADX INFO: renamed from: a */
        public boolean mo672a(int i, int i2, Intent intent) {
            if (this.f1233a != i) {
                return false;
            }
            boolean zMo672a = this.f1234b.mo672a(i, i2, intent);
            Frag.this.activityReslutManager.m885d(this);
            return zMo672a;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m847X3(e30 e30Var, d30 d30Var, C0231c c0231c) {
        if (c0231c instanceof C0231c.b) {
            e30Var.call(((C0231c.b) c0231c).f1258p);
        } else if (c0231c == C0231c.f1250l) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public LayoutInflater m849H2() {
        return act().inflater();
    }

    /* JADX INFO: renamed from: Z3 */
    public void m850Z3(Bundle bundle) {
    }

    /* JADX INFO: renamed from: a4 */
    public void m851a4() {
        this.cachedView = null;
    }

    public Act act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public Dialog.C0221e m852b4() {
        return act().dialog();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m853c4() {
        ViewParent parent;
        View view = this.cachedView;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(this.cachedView);
    }

    @Override // p007l.mcr
    public void creates(final e30<Bundle> e30Var, final d30 d30Var) {
        n11.c();
        lifecycle().subscribe(new e30() { // from class: l.u1j
            public final void call(Object obj) {
                Frag.m847X3(e30Var, d30Var, (C0231c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void m854d4() {
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(c<T> cVar) {
        return duringCreated(new C0226a(cVar));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m855e4() {
        lifecycle().subscribe(new e30() { // from class: l.t1j
            public final void call(Object obj) {
                this.f4246a.m858h4((C0231c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: f4 */
    public void m856f4() {
    }

    /* JADX INFO: renamed from: g4 */
    public void m857g4(Bundle bundle) {
    }

    @Override // p007l.k0m
    public String getPopLifeName() {
        return getClass().getSimpleName() + "_" + hashCode();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m858h4(C0231c c0231c) {
        if (c0231c == C0231c.f1247i) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.ACTIVE, !isHidden(), getPopLifeName()));
            return;
        }
        if (c0231c == C0231c.f1253o || c0231c == C0231c.f1251m) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.DESTROY, !isHidden(), getPopLifeName()));
            return;
        }
        if (c0231c == C0231c.f1249k || (m862k4() && c0231c == C0231c.f1248j)) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.STOP, !isHidden(), getPopLifeName()));
        } else if (this.popLifeSub.e() == null) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.PENDING, !isHidden(), getPopLifeName()));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m859i4(C0231c c0231c) {
        du2.b("[common][lifecycle]", getClass(), c0231c.f1256c, (String) null);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public void m860j4(long j) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m861k0(Intent intent, C0229a.a aVar) {
        m872u4(30865, intent, aVar);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m862k4() {
        return false;
    }

    /* JADX INFO: renamed from: l4 */
    public void m863l4(Runnable runnable) {
        e51.m9026I(this, runnable, 0L);
    }

    @Override // p007l.mcr, p007l.d0e
    public c<C0231c> lifecycle() {
        return NullChecker.a(this.lifecycleSubject) ? this.lifecycleSubject.asObservable() : this.lifecycleSubjectTemp.asObservable();
    }

    @Override // p007l.mcr
    public C0231c lifecycle_() {
        return NullChecker.a(this.lifecycleSubject) ? (C0231c) this.lifecycleSubject.e() : C0231c.f1252n;
    }

    /* JADX INFO: renamed from: m4 */
    public void m864m4(Runnable runnable, int i) {
        e51.m9026I(this, runnable, i);
    }

    /* JADX INFO: renamed from: n4 */
    public void m865n4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: o4 */
    public Dialog m866o4(int i) {
        return m867p4(i, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m883b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onAttach(Context context) {
        if (!act().hasBlockOnCreate) {
            if (this.lifecycleSubject == null) {
                this.lifecycleSubject = a.b();
            }
            lifecycle().subscribe(mkd0.m9874G(new e30() { // from class: l.s1j
                public final void call(Object obj) {
                    this.f4098a.m859i4((C0231c) obj);
                }
            }));
            this.lifecycleSubject.onNext(C0231c.f1243e);
        }
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        m850Z3(bundle);
        super.onCreate(bundle);
        if (act().hasBlockOnCreate) {
            return;
        }
        u660.m11183e().m11186c(this);
        m855e4();
        m854d4();
        m856f4();
        this.lifecycleSubject.onNext(new C0231c.a(bundle));
        u660.m11183e().m11187d(this);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (this.hasDestroyView) {
            if (i2 != 0) {
                m851a4();
            } else {
                m853c4();
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (act().hasBlockOnCreate) {
            return null;
        }
        u660.m11183e().m11189g(this);
        isFragResumed = false;
        hi3.m9335a(bundle, getClass().getSimpleName().concat(",onCreateView sis"));
        hi3.m9335a(getArguments(), getClass().getSimpleName().concat(",getArguments"));
        m865n4(bundle);
        if (this.cachedView == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            View viewInflateView = inflateView(layoutInflater, viewGroup);
            m860j4(jCurrentTimeMillis);
            this.cachedView = u660.m11183e().m11184a(this, viewInflateView);
            m857g4(bundle);
        }
        m853c4();
        this.hasDestroyView = false;
        this.lifecycleSubject.onNext(new C0231c.b(bundle));
        this.lifecycleSubject.onNext(C0231c.f1245g);
        u660.m11183e().m11187d(this);
        return this.cachedView;
    }

    public void onDestroy() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C0231c.f1251m);
        }
        super.onDestroy();
        if (this.cachedView != null) {
            m851a4();
            m876y4();
        }
    }

    public void onDestroyView() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C0231c.f1250l);
        }
        this.hasDestroyView = true;
        super.onDestroyView();
    }

    public void onDetach() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C0231c.f1252n);
        }
        a<C0231c> aVar = this.lifecycleSubject;
        this.lifecycleSubjectTemp = aVar;
        aVar.onCompleted();
        this.lifecycleSubject = null;
        super.onDetach();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        Object objE = this.popLifeSub.e();
        a<pc80> aVar = this.popLifeSub;
        if (objE == null) {
            aVar.onNext(pc80.m10251a(PopLifecycleEvent.PENDING, !z, getPopLifeName()));
        } else {
            aVar.onNext(pc80.m10251a(((pc80) aVar.e()).f3709a, !z, getPopLifeName()));
        }
    }

    public void onPause() {
        if (!act().hasBlockOnResume) {
            this.lifecycleSubject.onNext(C0231c.f1248j);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (act().hasBlockOnResume) {
            return;
        }
        this.lifecycleSubject.onNext(C0231c.f1247i);
        isFragResumed = true;
    }

    public void onStart() {
        super.onStart();
        if (act().hasBlockOnStart) {
            return;
        }
        this.lifecycleSubject.onNext(C0231c.f1246h);
    }

    public void onStop() {
        if (!act().hasBlockOnStart) {
            this.lifecycleSubject.onNext(C0231c.f1249k);
        }
        super.onStop();
    }

    /* JADX INFO: renamed from: p4 */
    public Dialog m867p4(int i, boolean z) {
        if (act() != null) {
            return act().progress(i, z);
        }
        return null;
    }

    public String pageId() {
        return getClass().getName();
    }

    @Override // p007l.k0m
    public a<pc80> popLifeObs() {
        return this.popLifeSub;
    }

    /* JADX INFO: renamed from: q4 */
    public Dialog m868q4(String str, boolean z) {
        return m869r4(str, z, true);
    }

    /* JADX INFO: renamed from: r4 */
    public Dialog m869r4(String str, boolean z, boolean z2) {
        if (act() != null) {
            return act().progress(str, null, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public void m870s4() {
        if (act() != null) {
            act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public void m871t4(C0229a.a aVar) {
        this.activityReslutManager.m884c(aVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m872u4(int i, Intent intent, C0229a.a aVar) {
        if (!this.activityReslutManager.m882a(aVar)) {
            this.activityReslutManager.m884c(new C0228c(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: v4 */
    public void m873v4(Intent intent, int i, Act.AbstractC0216w abstractC0216w) {
        act().startActivityForResultFromFragmentWithCustomTransition(this, intent, i, abstractC0216w);
    }

    /* JADX INFO: renamed from: w4 */
    public void m874w4(Intent intent, Act.AbstractC0216w abstractC0216w) {
        act().startActivityFromFragmentWithCustomTransition(this, intent, abstractC0216w);
    }

    /* JADX INFO: renamed from: x4 */
    public String m875x4(int i) {
        return getString(i);
    }

    /* JADX INFO: renamed from: y4 */
    public void m876y4() {
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar) {
        return duringCreated(v9jVar, true);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z) {
        return c.create(new C0227b(v9jVar, z));
    }

    @Override // p007l.mcr
    public void creates(e30<Bundle> e30Var) {
        creates(e30Var, Act.ACTION0_NOTHING);
    }
}
