package p153l;

import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class i360<T> implements C22421c.c<T, Notification<T>> {

    /* JADX INFO: renamed from: l.i360$a */
    public class C17627a extends gcg0<Notification<T>> {

        /* JADX INFO: renamed from: e */
        public boolean f112691e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f112692f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17627a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f112692f = gcg0Var2;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<T> notification) {
            int i = C17628b.f112694a[notification.m222539d().ordinal()];
            if (i == 1) {
                if (this.f112691e) {
                    return;
                }
                this.f112692f.onNext(notification.m222541f());
            } else if (i == 2) {
                onError(notification.m222540e());
            } else {
                if (i == 3) {
                    onCompleted();
                    return;
                }
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f112691e) {
                return;
            }
            this.f112691e = true;
            this.f112692f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f112691e) {
                return;
            }
            this.f112691e = true;
            this.f112692f.onError(th);
        }
    }

    /* JADX INFO: renamed from: l.i360$b */
    public static /* synthetic */ class C17628b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112694a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f112694a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112694a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112694a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.i360$c */
    public static final class C17629c {
        static final i360<Object> INSTANCE = new i360<>();
    }

    /* JADX INFO: renamed from: b */
    public static i360 m138276b() {
        return C17629c.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super Notification<T>> call(gcg0<? super T> gcg0Var) {
        return new C17627a(gcg0Var, gcg0Var);
    }
}
