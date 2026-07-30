package p153l;

import android.animation.Animator;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes8.dex */
public class s20 {

    /* JADX INFO: renamed from: a */
    public static l01<String, C19955c> f165819a = new l01<>();

    /* JADX INFO: renamed from: b */
    public static l01<String, pcj<AbstractC19953a>> f165820b = new l01<>();

    /* JADX INFO: renamed from: l.s20$a */
    public static abstract class AbstractC19953a<T extends Act> {

        /* JADX INFO: renamed from: a */
        public C19955c f165821a = (C19955c) s20.f165819a.get(m184078i());

        /* JADX INFO: renamed from: c */
        public View m184072c(T t) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m184073d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public abstract Animator m184074e(T t);

        /* JADX INFO: renamed from: f */
        public final Animator m184075f(Act act) {
            this.f165821a.f165823b.onNext(1);
            Animator animatorM184074e = m184074e(act);
            if (animatorM184074e == null) {
                return null;
            }
            gt0.m132160f(animatorM184074e, new Runnable() { // from class: l.q20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155242a.m184079j();
                }
            });
            return animatorM184074e;
        }

        /* JADX INFO: renamed from: g */
        public abstract Animator m184076g(T t);

        /* JADX INFO: renamed from: h */
        public final Animator m184077h(Act act) {
            this.f165821a.f165823b.onNext(3);
            Animator animatorM184076g = m184076g(act);
            if (animatorM184076g == null) {
                return null;
            }
            gt0.m132160f(animatorM184076g, new Runnable() { // from class: l.r20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160869a.m184080k();
                }
            });
            return animatorM184076g;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public abstract String m184078i();

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m184079j() {
            this.f165821a.f165823b.onNext(2);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m184080k() {
            this.f165821a.f165823b.onNext(4);
            this.f165821a.f165823b.onNext(5);
        }

        /* JADX INFO: renamed from: l */
        public void m184081l(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: m */
        public void m184082m(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: n */
        public abstract void m184083n(T t);

        /* JADX INFO: renamed from: o */
        public void m184084o(T t) {
            this.f165821a.f165823b.onNext(0);
            m184083n(t);
        }
    }

    /* JADX INFO: renamed from: l.s20$b */
    public interface InterfaceC19954b {
        /* JADX INFO: renamed from: a */
        void m184085a();

        /* JADX INFO: renamed from: b */
        void m184086b();

        /* JADX INFO: renamed from: c */
        void m184087c();

        /* JADX INFO: renamed from: d */
        void m184088d();

        /* JADX INFO: renamed from: e */
        void m184089e();
    }

    /* JADX INFO: renamed from: l.s20$c */
    public static class C19955c {

        /* JADX INFO: renamed from: a */
        public String f165822a;

        /* JADX INFO: renamed from: b */
        public C22507a<Integer> f165823b;

        /* JADX INFO: renamed from: c */
        public WeakReference<InterfaceC19954b> f165824c;

        public C19955c() {
            C22507a<Integer> c22507aM222758b = C22507a.m222758b();
            this.f165823b = c22507aM222758b;
            c22507aM222758b.asObservable().takeUntil(new qcj() { // from class: l.t20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 5);
                }
            }).subscribe(new y20() { // from class: l.u20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177163a.m184092c((Integer) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m184092c(Integer num) {
            InterfaceC19954b interfaceC19954b = this.f165824c.get();
            if (interfaceC19954b == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                interfaceC19954b.m184086b();
                return;
            }
            if (iIntValue == 1) {
                interfaceC19954b.m184087c();
                return;
            }
            if (iIntValue == 2) {
                interfaceC19954b.m184089e();
                return;
            }
            if (iIntValue == 3) {
                interfaceC19954b.m184085a();
            } else if (iIntValue == 4) {
                interfaceC19954b.m184088d();
            } else {
                if (iIntValue != 5) {
                    return;
                }
                s20.f165819a.remove(this.f165822a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC19953a m184069b(String str) {
        pcj<AbstractC19953a> pcjVar;
        C19955c c19955c = f165819a.get(str);
        if (c19955c == null || (pcjVar = f165820b.get(c19955c.f165822a)) == null) {
            return null;
        }
        return pcjVar.call();
    }
}
