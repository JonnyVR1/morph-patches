package com.google.common.collect;

import p153l.gyj0;
import p153l.k350;
import p153l.mor;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractIterator<T> extends gyj0<T> {

    /* JADX INFO: renamed from: a */
    public State f10808a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f10809b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C2741a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10810a;

        static {
            int[] iArr = new int[State.values().length];
            f10810a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10810a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15619a();

    /* JADX INFO: renamed from: b */
    public final T m15620b() {
        this.f10808a = State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15621c() {
        this.f10808a = State.FAILED;
        this.f10809b = mo15619a();
        if (this.f10808a == State.DONE) {
            return false;
        }
        this.f10808a = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xn80.m212117v(this.f10808a != State.FAILED);
        int i = C2741a.f10810a[this.f10808a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m15621c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        this.f10808a = State.NOT_READY;
        T t = (T) k350.m147997a(this.f10809b);
        this.f10809b = null;
        return t;
    }
}
