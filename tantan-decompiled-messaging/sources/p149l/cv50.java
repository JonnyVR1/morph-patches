package p149l;

import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class cv50<T> implements C22306c.c<T, Notification<T>> {

    /* JADX INFO: renamed from: l.cv50$a */
    public class C16245a extends z3g0<Notification<T>> {

        /* JADX INFO: renamed from: e */
        public boolean f82641e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f82642f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16245a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f82642f = z3g0Var2;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<T> notification) {
            int i = C16246b.f82644a[notification.m221293d().ordinal()];
            if (i == 1) {
                if (this.f82641e) {
                    return;
                }
                this.f82642f.onNext(notification.m221295f());
            } else if (i == 2) {
                onError(notification.m221294e());
            } else {
                if (i == 3) {
                    onCompleted();
                    return;
                }
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f82641e) {
                return;
            }
            this.f82641e = true;
            this.f82642f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f82641e) {
                return;
            }
            this.f82641e = true;
            this.f82642f.onError(th);
        }
    }

    /* JADX INFO: renamed from: l.cv50$b */
    public static /* synthetic */ class C16246b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82644a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f82644a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82644a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82644a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.cv50$c */
    public static final class C16247c {
        static final cv50<Object> INSTANCE = new cv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static cv50 m108847b() {
        return C16247c.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super Notification<T>> call(z3g0<? super T> z3g0Var) {
        return new C16245a(z3g0Var, z3g0Var);
    }
}
