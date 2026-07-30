package com.p046p1.mobile.android.app;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.poplevel.PopLifecycleEvent;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.exceptions.OnErrorNotImplementedException;
import p133rx.subjects.C22392a;
import p149l.c4g0;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.h4g0;
import p149l.hi3;
import p149l.k0m;
import p149l.lod0;
import p149l.mcr;
import p149l.mkd0;
import p149l.n11;
import p149l.pc80;
import p149l.u660;
import p149l.v9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes8.dex */
public class Frag extends Fragment implements mcr, k0m {
    public static boolean isFragResumed = false;
    private View cachedView;
    private C22392a<C4319c> lifecycleSubject = C22392a.m221512b();
    private final C22392a<pc80> popLifeSub = C22392a.m221512b();
    private C22392a<C4319c> lifecycleSubjectTemp = this.lifecycleSubject;
    private boolean hasDestroyView = false;
    private C4317a activityReslutManager = new C4317a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$a */
    public class C4314a<T> implements v9j<C22306c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f15520a;

        public C4314a(C22306c c22306c) {
            this.f15520a = c22306c;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<T> call() {
            return this.f15520a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b */
    public class C4315b<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public c4g0 f15522a;

        /* JADX INFO: renamed from: b */
        public c4g0 f15523b;

        /* JADX INFO: renamed from: c */
        public boolean f15524c;

        /* JADX INFO: renamed from: d */
        public T f15525d = null;

        /* JADX INFO: renamed from: e */
        public boolean f15526e = false;

        /* JADX INFO: renamed from: f */
        public boolean f15527f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ v9j f15528g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f15529h;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a */
        public class a extends z3g0<C4319c> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f15531e;

            /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a$a, reason: collision with other inner class name */
            public class C22694a extends z3g0<T> {
                public C22694a() {
                }

                @Override // p149l.m250
                public void onCompleted() {
                    a aVar = a.this;
                    C4315b c4315b = C4315b.this;
                    if (c4315b.f15525d != null) {
                        c4315b.f15527f = true;
                        return;
                    }
                    try {
                        aVar.f15531e.onCompleted();
                    } finally {
                        if (!a.this.f15531e.isUnsubscribed()) {
                            a.this.f15531e.unsubscribe();
                        }
                    }
                }

                @Override // p149l.m250
                public void onError(Throwable th) {
                    a.this.f15531e.onError(th);
                    if (a.this.f15531e.isUnsubscribed()) {
                        return;
                    }
                    a.this.f15531e.unsubscribe();
                }

                @Override // p149l.m250
                public void onNext(T t) {
                    a aVar = a.this;
                    C4315b c4315b = C4315b.this;
                    if (c4315b.f15529h && c4315b.f15526e) {
                        c4315b.f15525d = t;
                        return;
                    }
                    try {
                        aVar.f15531e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(z3g0 z3g0Var) {
                this.f15531e = z3g0Var;
            }

            @Override // p149l.m250
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(C4319c c4319c) {
                if (c4319c == C4319c.f15546g || c4319c == C4319c.f15547h || c4319c == C4319c.f15548i) {
                    C4315b.this.f15526e = false;
                }
                if (c4319c == C4319c.f15546g || ((c4319c == C4319c.f15547h || c4319c == C4319c.f15548i) && !C4315b.this.f15524c)) {
                    C4315b c4315b = C4315b.this;
                    c4315b.f15522a = ((C22306c) c4315b.f15528g.call()).unsafeSubscribe(new C22694a());
                    C4315b.this.f15524c = true;
                } else if (c4319c == C4319c.f15551l || c4319c == C4319c.f15554o) {
                    c4g0 c4g0Var = C4315b.this.f15522a;
                    if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                        C4315b.this.f15522a.unsubscribe();
                    }
                    C4315b.this.f15524c = false;
                }
                if (c4319c == C4319c.f15550k) {
                    C4315b.this.f15526e = true;
                } else if (c4319c == C4319c.f15547h || c4319c == C4319c.f15548i) {
                    C4315b c4315b2 = C4315b.this;
                    c4315b2.f15526e = false;
                    if (c4315b2.f15525d != null) {
                        if (!isUnsubscribed()) {
                            this.f15531e.onNext(C4315b.this.f15525d);
                            if (C4315b.this.f15527f) {
                                this.f15531e.onCompleted();
                                if (!this.f15531e.isUnsubscribed()) {
                                    this.f15531e.unsubscribe();
                                }
                            }
                        }
                        C4315b.this.f15525d = null;
                    }
                }
                if (isUnsubscribed()) {
                    mkd0.m154992z(C4315b.this.f15522a);
                }
            }

            @Override // p149l.m250
            public void onCompleted() {
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                throw new OnErrorNotImplementedException(th);
            }
        }

        public C4315b(v9j v9jVar, boolean z) {
            this.f15528g = v9jVar;
            this.f15529h = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(z3g0 z3g0Var) {
            if (z3g0Var instanceof lod0) {
                z3g0Var = ((lod0) z3g0Var).m150764h();
            }
            this.f15523b = Frag.this.lifecycle().unsafeSubscribe(new a(z3g0Var));
            z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.v1j
                @Override // p149l.d30
                public final void call() {
                    this.f179256a.m20609c();
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m20609c() {
            c4g0 c4g0Var = this.f15522a;
            if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
                this.f15522a.unsubscribe();
            }
            c4g0 c4g0Var2 = this.f15523b;
            if (c4g0Var2 == null || c4g0Var2.isUnsubscribed()) {
                return;
            }
            this.f15523b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$c */
    public class C4316c implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15534a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4317a.a f15535b;

        public C4316c(int i, C4317a.a aVar) {
            this.f15534a = i;
            this.f15535b = aVar;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (this.f15534a != i) {
                return false;
            }
            boolean zMo20401a = this.f15535b.mo20401a(i, i2, intent);
            Frag.this.activityReslutManager.m20614d(this);
            return zMo20401a;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m20576X3(e30 e30Var, d30 d30Var, C4319c c4319c) {
        if (c4319c instanceof C4319c.b) {
            e30Var.call(((C4319c.b) c4319c).f15559p);
        } else if (c4319c == C4319c.f15551l) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo20578H2() {
        return act().inflater();
    }

    /* JADX INFO: renamed from: Z3 */
    public void mo20579Z3(Bundle bundle) {
    }

    /* JADX INFO: renamed from: a4 */
    public void m20580a4() {
        this.cachedView = null;
    }

    public Act act() {
        return (Act) getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public Dialog.C4309e m20581b4() {
        return act().dialog();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m20582c4() {
        ViewParent parent;
        View view = this.cachedView;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(this.cachedView);
    }

    @Override // p149l.mcr
    public void creates(final e30<Bundle> e30Var, final d30 d30Var) {
        n11.m157330c();
        lifecycle().subscribe(new e30() { // from class: l.u1j
            @Override // p149l.e30
            public final void call(Object obj) {
                Frag.m20576X3(e30Var, d30Var, (C4319c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(C22306c<T> c22306c) {
        return duringCreated(new C4314a(c22306c));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m20584e4() {
        lifecycle().subscribe(new e30() { // from class: l.t1j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167350a.m20587h4((C4319c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
    }

    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
    }

    @Override // p149l.k0m
    public String getPopLifeName() {
        return getClass().getSimpleName() + "_" + hashCode();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m20587h4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.ACTIVE, !isHidden(), getPopLifeName()));
            return;
        }
        if (c4319c == C4319c.f15554o || c4319c == C4319c.f15552m) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.DESTROY, !isHidden(), getPopLifeName()));
            return;
        }
        if (c4319c == C4319c.f15550k || (mo20591k4() && c4319c == C4319c.f15549j)) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.STOP, !isHidden(), getPopLifeName()));
        } else if (this.popLifeSub.m221515e() == null) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.PENDING, !isHidden(), getPopLifeName()));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m20588i4(C4319c c4319c) {
        du2.m113671b("[common][lifecycle]", getClass(), c4319c.f15557c, null);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public void mo20589j4(long j) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m20590k0(Intent intent, C4317a.a aVar) {
        m20601u4(30865, intent, aVar);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo20591k4() {
        return false;
    }

    /* JADX INFO: renamed from: l4 */
    public void m20592l4(Runnable runnable) {
        e51.m114744I(this, runnable, 0L);
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return NullChecker.m81303a(this.lifecycleSubject) ? this.lifecycleSubject.asObservable() : this.lifecycleSubjectTemp.asObservable();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return NullChecker.m81303a(this.lifecycleSubject) ? this.lifecycleSubject.m221515e() : C4319c.f15553n;
    }

    /* JADX INFO: renamed from: m4 */
    public void m20593m4(Runnable runnable, int i) {
        e51.m114744I(this, runnable, i);
    }

    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: o4 */
    public Dialog m20595o4(int i) {
        return m20596p4(i, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m20612b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (!act().hasBlockOnCreate) {
            if (this.lifecycleSubject == null) {
                this.lifecycleSubject = C22392a.m221512b();
            }
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.s1j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161902a.m20588i4((C4319c) obj);
                }
            }));
            this.lifecycleSubject.onNext(C4319c.f15544e);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mo20579Z3(bundle);
        super.onCreate(bundle);
        if (act().hasBlockOnCreate) {
            return;
        }
        u660.m191956e().m191959c(this);
        m20584e4();
        mo20583d4();
        mo20585f4();
        this.lifecycleSubject.onNext(new C4319c.a(bundle));
        u660.m191956e().m191960d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (this.hasDestroyView) {
            if (i2 != 0) {
                m20580a4();
            } else {
                m20582c4();
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (act().hasBlockOnCreate) {
            return null;
        }
        u660.m191956e().m191962g(this);
        isFragResumed = false;
        hi3.m131197a(bundle, getClass().getSimpleName().concat(",onCreateView sis"));
        hi3.m131197a(getArguments(), getClass().getSimpleName().concat(",getArguments"));
        mo20594n4(bundle);
        if (this.cachedView == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            View viewInflateView = inflateView(layoutInflater, viewGroup);
            mo20589j4(jCurrentTimeMillis);
            this.cachedView = u660.m191956e().m191957a(this, viewInflateView);
            mo20586g4(bundle);
        }
        m20582c4();
        this.hasDestroyView = false;
        this.lifecycleSubject.onNext(new C4319c.b(bundle));
        this.lifecycleSubject.onNext(C4319c.f15546g);
        u660.m191956e().m191960d(this);
        return this.cachedView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4319c.f15552m);
        }
        super.onDestroy();
        if (this.cachedView != null) {
            m20580a4();
            mo20605y4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4319c.f15551l);
        }
        this.hasDestroyView = true;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4319c.f15553n);
        }
        C22392a<C4319c> c22392a = this.lifecycleSubject;
        this.lifecycleSubjectTemp = c22392a;
        c22392a.onCompleted();
        this.lifecycleSubject = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        pc80 pc80VarM221515e = this.popLifeSub.m221515e();
        C22392a<pc80> c22392a = this.popLifeSub;
        if (pc80VarM221515e == null) {
            c22392a.onNext(pc80.m168320a(PopLifecycleEvent.PENDING, !z, getPopLifeName()));
        } else {
            c22392a.onNext(pc80.m168320a(c22392a.m221515e().f148149a, !z, getPopLifeName()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (!act().hasBlockOnResume) {
            this.lifecycleSubject.onNext(C4319c.f15549j);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (act().hasBlockOnResume) {
            return;
        }
        this.lifecycleSubject.onNext(C4319c.f15548i);
        isFragResumed = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (act().hasBlockOnStart) {
            return;
        }
        this.lifecycleSubject.onNext(C4319c.f15547h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (!act().hasBlockOnStart) {
            this.lifecycleSubject.onNext(C4319c.f15550k);
        }
        super.onStop();
    }

    /* JADX INFO: renamed from: p4 */
    public Dialog m20596p4(int i, boolean z) {
        if (act() != null) {
            return act().progress(i, z);
        }
        return null;
    }

    public String pageId() {
        return getClass().getName();
    }

    @Override // p149l.k0m
    public C22392a<pc80> popLifeObs() {
        return this.popLifeSub;
    }

    /* JADX INFO: renamed from: q4 */
    public Dialog m20597q4(String str, boolean z) {
        return m20598r4(str, z, true);
    }

    /* JADX INFO: renamed from: r4 */
    public Dialog m20598r4(String str, boolean z, boolean z2) {
        if (act() != null) {
            return act().progress(str, null, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public void m20599s4() {
        if (act() != null) {
            act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public void m20600t4(C4317a.a aVar) {
        this.activityReslutManager.m20613c(aVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m20601u4(int i, Intent intent, C4317a.a aVar) {
        if (!this.activityReslutManager.m20611a(aVar)) {
            this.activityReslutManager.m20613c(new C4316c(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: v4 */
    public void m20602v4(Intent intent, int i, Act.AbstractC4304w abstractC4304w) {
        act().startActivityForResultFromFragmentWithCustomTransition(this, intent, i, abstractC4304w);
    }

    /* JADX INFO: renamed from: w4 */
    public void m20603w4(Intent intent, Act.AbstractC4304w abstractC4304w) {
        act().startActivityFromFragmentWithCustomTransition(this, intent, abstractC4304w);
    }

    /* JADX INFO: renamed from: x4 */
    public String m20604x4(int i) {
        return getString(i);
    }

    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return duringCreated(v9jVar, true);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return C22306c.create(new C4315b(v9jVar, z));
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        creates(e30Var, Act.ACTION0_NOTHING);
    }
}
