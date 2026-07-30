package com.p051p1.mobile.android.app;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.poplevel.PopLifecycleEvent;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.exceptions.OnErrorNotImplementedException;
import p137rx.subjects.C22507a;
import p153l.af60;
import p153l.e3m;
import p153l.gcg0;
import p153l.kcg0;
import p153l.l51;
import p153l.ner;
import p153l.nwd0;
import p153l.pcg0;
import p153l.pcj;
import p153l.psd0;
import p153l.tu2;
import p153l.u11;
import p153l.vi3;
import p153l.vk80;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes8.dex */
public class Frag extends Fragment implements ner, e3m {
    public static boolean isFragResumed = false;
    private View cachedView;
    private C22507a<C4470c> lifecycleSubject = C22507a.m222758b();
    private final C22507a<vk80> popLifeSub = C22507a.m222758b();
    private C22507a<C4470c> lifecycleSubjectTemp = this.lifecycleSubject;
    private boolean hasDestroyView = false;
    private C4468a activityReslutManager = new C4468a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$a */
    public class C4465a<T> implements pcj<C22421c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f16239a;

        public C4465a(C22421c c22421c) {
            this.f16239a = c22421c;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<T> call() {
            return this.f16239a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b */
    public class C4466b<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public kcg0 f16241a;

        /* JADX INFO: renamed from: b */
        public kcg0 f16242b;

        /* JADX INFO: renamed from: c */
        public boolean f16243c;

        /* JADX INFO: renamed from: d */
        public T f16244d = null;

        /* JADX INFO: renamed from: e */
        public boolean f16245e = false;

        /* JADX INFO: renamed from: f */
        public boolean f16246f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ pcj f16247g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f16248h;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a */
        public class a extends gcg0<C4470c> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gcg0 f16250e;

            /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$b$a$a, reason: collision with other inner class name */
            public class C22810a extends gcg0<T> {
                public C22810a() {
                }

                @Override // p153l.bb50
                public void onCompleted() {
                    a aVar = a.this;
                    C4466b c4466b = C4466b.this;
                    if (c4466b.f16244d != null) {
                        c4466b.f16246f = true;
                        return;
                    }
                    try {
                        aVar.f16250e.onCompleted();
                    } finally {
                        if (!a.this.f16250e.isUnsubscribed()) {
                            a.this.f16250e.unsubscribe();
                        }
                    }
                }

                @Override // p153l.bb50
                public void onError(Throwable th) {
                    a.this.f16250e.onError(th);
                    if (a.this.f16250e.isUnsubscribed()) {
                        return;
                    }
                    a.this.f16250e.unsubscribe();
                }

                @Override // p153l.bb50
                public void onNext(T t) {
                    a aVar = a.this;
                    C4466b c4466b = C4466b.this;
                    if (c4466b.f16248h && c4466b.f16245e) {
                        c4466b.f16244d = t;
                        return;
                    }
                    try {
                        aVar.f16250e.onNext(t);
                    } catch (Exception e) {
                        onError(e);
                    }
                }
            }

            public a(gcg0 gcg0Var) {
                this.f16250e = gcg0Var;
            }

            @Override // p153l.bb50
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(C4470c c4470c) {
                if (c4470c == C4470c.f16265g || c4470c == C4470c.f16266h || c4470c == C4470c.f16267i) {
                    C4466b.this.f16245e = false;
                }
                if (c4470c == C4470c.f16265g || ((c4470c == C4470c.f16266h || c4470c == C4470c.f16267i) && !C4466b.this.f16243c)) {
                    C4466b c4466b = C4466b.this;
                    c4466b.f16241a = ((C22421c) c4466b.f16247g.call()).unsafeSubscribe(new C22810a());
                    C4466b.this.f16243c = true;
                } else if (c4470c == C4470c.f16270l || c4470c == C4470c.f16273o) {
                    kcg0 kcg0Var = C4466b.this.f16241a;
                    if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
                        C4466b.this.f16241a.unsubscribe();
                    }
                    C4466b.this.f16243c = false;
                }
                if (c4470c == C4470c.f16269k) {
                    C4466b.this.f16245e = true;
                } else if (c4470c == C4470c.f16266h || c4470c == C4470c.f16267i) {
                    C4466b c4466b2 = C4466b.this;
                    c4466b2.f16245e = false;
                    if (c4466b2.f16244d != null) {
                        if (!isUnsubscribed()) {
                            this.f16250e.onNext(C4466b.this.f16244d);
                            if (C4466b.this.f16246f) {
                                this.f16250e.onCompleted();
                                if (!this.f16250e.isUnsubscribed()) {
                                    this.f16250e.unsubscribe();
                                }
                            }
                        }
                        C4466b.this.f16244d = null;
                    }
                }
                if (isUnsubscribed()) {
                    psd0.m173633z(C4466b.this.f16241a);
                }
            }

            @Override // p153l.bb50
            public void onCompleted() {
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                throw new OnErrorNotImplementedException(th);
            }
        }

        public C4466b(pcj pcjVar, boolean z) {
            this.f16247g = pcjVar;
            this.f16248h = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(gcg0 gcg0Var) {
            if (gcg0Var instanceof nwd0) {
                gcg0Var = ((nwd0) gcg0Var).m164986h();
            }
            this.f16242b = Frag.this.lifecycle().unsafeSubscribe(new a(gcg0Var));
            gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.q4j
                @Override // p153l.x20
                public final void call() {
                    this.f155598a.m21608c();
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m21608c() {
            kcg0 kcg0Var = this.f16241a;
            if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
                this.f16241a.unsubscribe();
            }
            kcg0 kcg0Var2 = this.f16242b;
            if (kcg0Var2 == null || kcg0Var2.isUnsubscribed()) {
                return;
            }
            this.f16242b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Frag$c */
    public class C4467c implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f16253a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4468a.a f16254b;

        public C4467c(int i, C4468a.a aVar) {
            this.f16253a = i;
            this.f16254b = aVar;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (this.f16253a != i) {
                return false;
            }
            boolean zMo21400a = this.f16254b.mo21400a(i, i2, intent);
            Frag.this.activityReslutManager.m21613d(this);
            return zMo21400a;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m21575X3(y20 y20Var, x20 x20Var, C4470c c4470c) {
        if (c4470c instanceof C4470c.b) {
            y20Var.call(((C4470c.b) c4470c).f16278p);
        } else if (c4470c == C4470c.f16270l) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo21577H2() {
        return act().inflater();
    }

    /* JADX INFO: renamed from: Z3 */
    public void mo21578Z3(Bundle bundle) {
    }

    /* JADX INFO: renamed from: a4 */
    public void m21579a4() {
        this.cachedView = null;
    }

    public Act act() {
        return (Act) getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public Dialog.C4460e m21580b4() {
        return act().dialog();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m21581c4() {
        ViewParent parent;
        View view = this.cachedView;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(this.cachedView);
    }

    @Override // p153l.ner
    public void creates(final y20<Bundle> y20Var, final x20 x20Var) {
        u11.m193889c();
        lifecycle().subscribe(new y20() { // from class: l.p4j
            @Override // p153l.y20
            public final void call(Object obj) {
                Frag.m21575X3(y20Var, x20Var, (C4470c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(C22421c<T> c22421c) {
        return duringCreated(new C4465a(c22421c));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m21583e4() {
        lifecycle().subscribe(new y20() { // from class: l.o4j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144983a.m21586h4((C4470c) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
    }

    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
    }

    @Override // p153l.e3m
    public String getPopLifeName() {
        return getClass().getSimpleName() + "_" + hashCode();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m21586h4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.ACTIVE, !isHidden(), getPopLifeName()));
            return;
        }
        if (c4470c == C4470c.f16273o || c4470c == C4470c.f16271m) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.DESTROY, !isHidden(), getPopLifeName()));
            return;
        }
        if (c4470c == C4470c.f16269k || (mo21590k4() && c4470c == C4470c.f16268j)) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.STOP, !isHidden(), getPopLifeName()));
        } else if (this.popLifeSub.m222761e() == null) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.PENDING, !isHidden(), getPopLifeName()));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m21587i4(C4470c c4470c) {
        tu2.m192704b("[common][lifecycle]", getClass(), c4470c.f16276c, null);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public void mo21588j4(long j) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m21589k0(Intent intent, C4468a.a aVar) {
        m21600u4(30865, intent, aVar);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo21590k4() {
        return false;
    }

    /* JADX INFO: renamed from: l4 */
    public void m21591l4(Runnable runnable) {
        l51.m152889I(this, runnable, 0L);
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return NullChecker.m82486a(this.lifecycleSubject) ? this.lifecycleSubject.asObservable() : this.lifecycleSubjectTemp.asObservable();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return NullChecker.m82486a(this.lifecycleSubject) ? this.lifecycleSubject.m222761e() : C4470c.f16272n;
    }

    /* JADX INFO: renamed from: m4 */
    public void m21592m4(Runnable runnable, int i) {
        l51.m152889I(this, runnable, i);
    }

    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: o4 */
    public Dialog m21594o4(int i) {
        return m21595p4(i, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m21611b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (!act().hasBlockOnCreate) {
            if (this.lifecycleSubject == null) {
                this.lifecycleSubject = C22507a.m222758b();
            }
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.n4j
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140235a.m21587i4((C4470c) obj);
                }
            }));
            this.lifecycleSubject.onNext(C4470c.f16263e);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mo21578Z3(bundle);
        super.onCreate(bundle);
        if (act().hasBlockOnCreate) {
            return;
        }
        af60.m97310e().m97313c(this);
        m21583e4();
        mo21582d4();
        mo21584f4();
        this.lifecycleSubject.onNext(new C4470c.a(bundle));
        af60.m97310e().m97314d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (this.hasDestroyView) {
            if (i2 != 0) {
                m21579a4();
            } else {
                m21581c4();
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (act().hasBlockOnCreate) {
            return null;
        }
        af60.m97310e().m97316g(this);
        isFragResumed = false;
        vi3.m201324a(bundle, getClass().getSimpleName().concat(",onCreateView sis"));
        vi3.m201324a(getArguments(), getClass().getSimpleName().concat(",getArguments"));
        mo21593n4(bundle);
        if (this.cachedView == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            View viewInflateView = inflateView(layoutInflater, viewGroup);
            mo21588j4(jCurrentTimeMillis);
            this.cachedView = af60.m97310e().m97311a(this, viewInflateView);
            mo21585g4(bundle);
        }
        m21581c4();
        this.hasDestroyView = false;
        this.lifecycleSubject.onNext(new C4470c.b(bundle));
        this.lifecycleSubject.onNext(C4470c.f16265g);
        af60.m97310e().m97314d(this);
        return this.cachedView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4470c.f16271m);
        }
        super.onDestroy();
        if (this.cachedView != null) {
            m21579a4();
            mo21604y4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4470c.f16270l);
        }
        this.hasDestroyView = true;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (!act().hasBlockOnCreate) {
            this.lifecycleSubject.onNext(C4470c.f16272n);
        }
        C22507a<C4470c> c22507a = this.lifecycleSubject;
        this.lifecycleSubjectTemp = c22507a;
        c22507a.onCompleted();
        this.lifecycleSubject = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        vk80 vk80VarM222761e = this.popLifeSub.m222761e();
        C22507a<vk80> c22507a = this.popLifeSub;
        if (vk80VarM222761e == null) {
            c22507a.onNext(vk80.m201567a(PopLifecycleEvent.PENDING, !z, getPopLifeName()));
        } else {
            c22507a.onNext(vk80.m201567a(c22507a.m222761e().f184465a, !z, getPopLifeName()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (!act().hasBlockOnResume) {
            this.lifecycleSubject.onNext(C4470c.f16268j);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (act().hasBlockOnResume) {
            return;
        }
        this.lifecycleSubject.onNext(C4470c.f16267i);
        isFragResumed = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (act().hasBlockOnStart) {
            return;
        }
        this.lifecycleSubject.onNext(C4470c.f16266h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (!act().hasBlockOnStart) {
            this.lifecycleSubject.onNext(C4470c.f16269k);
        }
        super.onStop();
    }

    /* JADX INFO: renamed from: p4 */
    public Dialog m21595p4(int i, boolean z) {
        if (act() != null) {
            return act().progress(i, z);
        }
        return null;
    }

    public String pageId() {
        return getClass().getName();
    }

    @Override // p153l.e3m
    public C22507a<vk80> popLifeObs() {
        return this.popLifeSub;
    }

    /* JADX INFO: renamed from: q4 */
    public Dialog m21596q4(String str, boolean z) {
        return m21597r4(str, z, true);
    }

    /* JADX INFO: renamed from: r4 */
    public Dialog m21597r4(String str, boolean z, boolean z2) {
        if (act() != null) {
            return act().progress(str, null, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public void m21598s4() {
        if (act() != null) {
            act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public void m21599t4(C4468a.a aVar) {
        this.activityReslutManager.m21612c(aVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m21600u4(int i, Intent intent, C4468a.a aVar) {
        if (!this.activityReslutManager.m21610a(aVar)) {
            this.activityReslutManager.m21612c(new C4467c(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: v4 */
    public void m21601v4(Intent intent, int i, Act.AbstractC4455w abstractC4455w) {
        act().startActivityForResultFromFragmentWithCustomTransition(this, intent, i, abstractC4455w);
    }

    /* JADX INFO: renamed from: w4 */
    public void m21602w4(Intent intent, Act.AbstractC4455w abstractC4455w) {
        act().startActivityFromFragmentWithCustomTransition(this, intent, abstractC4455w);
    }

    /* JADX INFO: renamed from: x4 */
    public String m21603x4(int i) {
        return getString(i);
    }

    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return duringCreated(pcjVar, true);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return C22421c.create(new C4466b(pcjVar, z));
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        creates(y20Var, Act.ACTION0_NOTHING);
    }
}
