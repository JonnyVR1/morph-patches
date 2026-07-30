package com.google.common.collect;

import p149l.dpj0;
import p149l.lmr;
import p149l.sf80;
import p149l.vu40;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractIterator<T> extends dpj0<T> {

    /* JADX INFO: renamed from: a */
    public State f10771a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f10772b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C2718a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10773a;

        static {
            int[] iArr = new int[State.values().length];
            f10773a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10773a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15565a();

    /* JADX INFO: renamed from: b */
    public final T m15566b() {
        this.f10771a = State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15567c() {
        this.f10771a = State.FAILED;
        this.f10772b = mo15565a();
        if (this.f10771a == State.DONE) {
            return false;
        }
        this.f10771a = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sf80.m183900v(this.f10771a != State.FAILED);
        int i = C2718a.f10773a[this.f10771a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m15567c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        this.f10771a = State.NOT_READY;
        T t = (T) vu40.m200060a(this.f10772b);
        this.f10772b = null;
        return t;
    }
}
