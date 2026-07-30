package p149l;

import android.animation.Animator;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class y20 {

    /* JADX INFO: renamed from: a */
    public static e01<String, C21283c> f195470a = new e01<>();

    /* JADX INFO: renamed from: b */
    public static e01<String, v9j<AbstractC21281a>> f195471b = new e01<>();

    /* JADX INFO: renamed from: l.y20$a */
    public static abstract class AbstractC21281a<T extends Act> {

        /* JADX INFO: renamed from: a */
        public C21283c f195472a = (C21283c) y20.f195470a.get(m212326i());

        /* JADX INFO: renamed from: c */
        public View m212320c(T t) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m212321d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public abstract Animator m212322e(T t);

        /* JADX INFO: renamed from: f */
        public final Animator m212323f(Act act) {
            this.f195472a.f195474b.onNext(1);
            Animator animatorM212322e = m212322e(act);
            if (animatorM212322e == null) {
                return null;
            }
            bt0.m103733f(animatorM212322e, new Runnable() { // from class: l.w20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184082a.m212327j();
                }
            });
            return animatorM212322e;
        }

        /* JADX INFO: renamed from: g */
        public abstract Animator m212324g(T t);

        /* JADX INFO: renamed from: h */
        public final Animator m212325h(Act act) {
            this.f195472a.f195474b.onNext(3);
            Animator animatorM212324g = m212324g(act);
            if (animatorM212324g == null) {
                return null;
            }
            bt0.m103733f(animatorM212324g, new Runnable() { // from class: l.x20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189113a.m212328k();
                }
            });
            return animatorM212324g;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public abstract String m212326i();

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m212327j() {
            this.f195472a.f195474b.onNext(2);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m212328k() {
            this.f195472a.f195474b.onNext(4);
            this.f195472a.f195474b.onNext(5);
        }

        /* JADX INFO: renamed from: l */
        public void m212329l(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: m */
        public void m212330m(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: n */
        public abstract void m212331n(T t);

        /* JADX INFO: renamed from: o */
        public void m212332o(T t) {
            this.f195472a.f195474b.onNext(0);
            m212331n(t);
        }
    }

    /* JADX INFO: renamed from: l.y20$b */
    public interface InterfaceC21282b {
        /* JADX INFO: renamed from: a */
        void m212333a();

        /* JADX INFO: renamed from: b */
        void m212334b();

        /* JADX INFO: renamed from: c */
        void m212335c();

        /* JADX INFO: renamed from: d */
        void m212336d();

        /* JADX INFO: renamed from: e */
        void m212337e();
    }

    /* JADX INFO: renamed from: l.y20$c */
    public static class C21283c {

        /* JADX INFO: renamed from: a */
        public String f195473a;

        /* JADX INFO: renamed from: b */
        public C22392a<Integer> f195474b;

        /* JADX INFO: renamed from: c */
        public WeakReference<InterfaceC21282b> f195475c;

        public C21283c() {
            C22392a<Integer> c22392aM221512b = C22392a.m221512b();
            this.f195474b = c22392aM221512b;
            c22392aM221512b.asObservable().takeUntil(new w9j() { // from class: l.z20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 5);
                }
            }).subscribe(new e30() { // from class: l.a30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67310a.m212340c((Integer) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m212340c(Integer num) {
            InterfaceC21282b interfaceC21282b = this.f195475c.get();
            if (interfaceC21282b == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                interfaceC21282b.m212334b();
                return;
            }
            if (iIntValue == 1) {
                interfaceC21282b.m212335c();
                return;
            }
            if (iIntValue == 2) {
                interfaceC21282b.m212337e();
                return;
            }
            if (iIntValue == 3) {
                interfaceC21282b.m212333a();
            } else if (iIntValue == 4) {
                interfaceC21282b.m212336d();
            } else {
                if (iIntValue != 5) {
                    return;
                }
                y20.f195470a.remove(this.f195473a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC21281a m212317b(String str) {
        v9j<AbstractC21281a> v9jVar;
        C21283c c21283c = f195470a.get(str);
        if (c21283c == null || (v9jVar = f195471b.get(c21283c.f195473a)) == null) {
            return null;
        }
        return v9jVar.call();
    }
}
