package p007l;

import android.animation.Animator;
import android.view.View;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import l.e01;
import l.e30;
import l.v9j;
import l.w9j;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class y20 {

    /* JADX INFO: renamed from: a */
    public static e01<String, C0788c> f5370a = new e01<>();

    /* JADX INFO: renamed from: b */
    public static e01<String, v9j<AbstractC0786a>> f5371b = new e01<>();

    /* JADX INFO: renamed from: l.y20$a */
    public static abstract class AbstractC0786a<T extends Act> {

        /* JADX INFO: renamed from: a */
        public C0788c f5372a = (C0788c) y20.f5370a.get(m11863i());

        /* JADX INFO: renamed from: c */
        public View m11857c(T t) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m11858d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public abstract Animator m11859e(T t);

        /* JADX INFO: renamed from: f */
        public final Animator m11860f(Act act) {
            this.f5372a.f5374b.onNext(1);
            Animator animatorM11859e = m11859e(act);
            if (animatorM11859e == null) {
                return null;
            }
            bt0.m8651f(animatorM11859e, new Runnable() { // from class: l.w20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5005a.m11864j();
                }
            });
            return animatorM11859e;
        }

        /* JADX INFO: renamed from: g */
        public abstract Animator m11861g(T t);

        /* JADX INFO: renamed from: h */
        public final Animator m11862h(Act act) {
            this.f5372a.f5374b.onNext(3);
            Animator animatorM11861g = m11861g(act);
            if (animatorM11861g == null) {
                return null;
            }
            bt0.m8651f(animatorM11861g, new Runnable() { // from class: l.x20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5084a.m11865k();
                }
            });
            return animatorM11861g;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public abstract String m11863i();

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m11864j() {
            this.f5372a.f5374b.onNext(2);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m11865k() {
            this.f5372a.f5374b.onNext(4);
            this.f5372a.f5374b.onNext(5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: l */
        public void m11866l(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public void m11867m(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: n */
        public abstract void m11868n(T t);

        /* JADX INFO: renamed from: o */
        public void m11869o(T t) {
            this.f5372a.f5374b.onNext(0);
            m11868n(t);
        }
    }

    /* JADX INFO: renamed from: l.y20$b */
    public interface InterfaceC0787b {
        /* JADX INFO: renamed from: a */
        void m11870a();

        /* JADX INFO: renamed from: b */
        void m11871b();

        /* JADX INFO: renamed from: c */
        void m11872c();

        /* JADX INFO: renamed from: d */
        void m11873d();

        /* JADX INFO: renamed from: e */
        void m11874e();
    }

    /* JADX INFO: renamed from: l.y20$c */
    public static class C0788c {

        /* JADX INFO: renamed from: a */
        public String f5373a;

        /* JADX INFO: renamed from: b */
        public a<Integer> f5374b;

        /* JADX INFO: renamed from: c */
        public WeakReference<InterfaceC0787b> f5375c;

        public C0788c() {
            a<Integer> aVarB = a.b();
            this.f5374b = aVarB;
            aVarB.asObservable().takeUntil(new w9j() { // from class: l.z20
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 5);
                }
            }).subscribe(new e30() { // from class: l.a30
                public final void call(Object obj) {
                    this.f1833a.m11877c((Integer) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m11877c(Integer num) {
            InterfaceC0787b interfaceC0787b = this.f5375c.get();
            if (interfaceC0787b == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                interfaceC0787b.m11871b();
                return;
            }
            if (iIntValue == 1) {
                interfaceC0787b.m11872c();
                return;
            }
            if (iIntValue == 2) {
                interfaceC0787b.m11874e();
                return;
            }
            if (iIntValue == 3) {
                interfaceC0787b.m11870a();
            } else if (iIntValue == 4) {
                interfaceC0787b.m11873d();
            } else {
                if (iIntValue != 5) {
                    return;
                }
                y20.f5370a.remove(this.f5373a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0786a m11854b(String str) {
        v9j v9jVar;
        C0788c c0788c = (C0788c) f5370a.get(str);
        if (c0788c == null || (v9jVar = (v9j) f5371b.get(c0788c.f5373a)) == null) {
            return null;
        }
        return (AbstractC0786a) v9jVar.call();
    }
}
