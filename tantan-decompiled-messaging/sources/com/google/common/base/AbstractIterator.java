package com.google.common.base;

import java.util.Iterator;
import p149l.lmr;
import p149l.sf80;
import p149l.xu40;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public State f10608a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f10609b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C2638a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10610a;

        static {
            int[] iArr = new int[State.values().length];
            f10610a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10610a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15408a();

    /* JADX INFO: renamed from: b */
    public final T m15409b() {
        this.f10608a = State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15410c() {
        this.f10608a = State.FAILED;
        this.f10609b = mo15408a();
        if (this.f10608a == State.DONE) {
            return false;
        }
        this.f10608a = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sf80.m183900v(this.f10608a != State.FAILED);
        int i = C2638a.f10610a[this.f10608a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m15410c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        this.f10608a = State.NOT_READY;
        T t = (T) xu40.m211079a(this.f10609b);
        this.f10609b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
