package com.google.common.base;

import java.util.Iterator;
import p153l.m350;
import p153l.mor;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public State f10645a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f10646b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C2661a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10647a;

        static {
            int[] iArr = new int[State.values().length];
            f10647a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10647a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15462a();

    /* JADX INFO: renamed from: b */
    public final T m15463b() {
        this.f10645a = State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15464c() {
        this.f10645a = State.FAILED;
        this.f10646b = mo15462a();
        if (this.f10645a == State.DONE) {
            return false;
        }
        this.f10645a = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xn80.m212117v(this.f10645a != State.FAILED);
        int i = C2661a.f10647a[this.f10645a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m15464c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        this.f10645a = State.NOT_READY;
        T t = (T) m350.m156920a(this.f10646b);
        this.f10646b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
