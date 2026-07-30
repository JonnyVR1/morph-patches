package p003l;

import p014rx.C1099c;
import p014rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class cv50<T> implements C1099c.c<T, Notification<T>> {

    /* JADX INFO: renamed from: l.cv50$a */
    public class C0208a extends z3g0<Notification<T>> {

        /* JADX INFO: renamed from: e */
        public boolean f2814e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f2815f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0208a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2815f = z3g0Var2;
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<T> notification) {
            int i = C0209b.f2817a[notification.m9750d().ordinal()];
            if (i == 1) {
                if (this.f2814e) {
                    return;
                }
                this.f2815f.onNext(notification.m9752f());
            } else if (i == 2) {
                onError(notification.m9751e());
            } else {
                if (i == 3) {
                    onCompleted();
                    return;
                }
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f2814e) {
                return;
            }
            this.f2814e = true;
            this.f2815f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f2814e) {
                return;
            }
            this.f2814e = true;
            this.f2815f.onError(th);
        }
    }

    /* JADX INFO: renamed from: l.cv50$b */
    public static /* synthetic */ class C0209b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2817a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f2817a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2817a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2817a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.cv50$c */
    public static final class C0210c {
        static final cv50<Object> INSTANCE = new cv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static cv50 m3467b() {
        return C0210c.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super Notification<T>> call(z3g0<? super T> z3g0Var) {
        return new C0208a(z3g0Var, z3g0Var);
    }
}
