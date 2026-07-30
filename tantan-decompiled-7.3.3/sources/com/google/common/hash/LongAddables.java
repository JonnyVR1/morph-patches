package com.google.common.hash;

import java.util.concurrent.atomic.AtomicLong;
import p153l.b7h0;
import p153l.f1w;

/* JADX INFO: loaded from: classes7.dex */
public final class LongAddables {

    /* JADX INFO: renamed from: a */
    public static final b7h0<f1w> f11263a;

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$a */
    public class C3018a implements b7h0<f1w> {
        @Override // p153l.b7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1w get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$b */
    public class C3019b implements b7h0<f1w> {
        @Override // p153l.b7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1w get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        b7h0<f1w> c3019b;
        try {
            new LongAdder();
            c3019b = new C3018a();
        } catch (Throwable unused) {
            c3019b = new C3019b();
        }
        f11263a = c3019b;
    }

    /* JADX INFO: renamed from: a */
    public static f1w m16390a() {
        return f11263a.get();
    }

    public static final class PureJavaLongAddable extends AtomicLong implements f1w {
        private PureJavaLongAddable() {
        }

        @Override // p153l.f1w
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p153l.f1w
        public void increment() {
            getAndIncrement();
        }

        @Override // p153l.f1w
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C3018a c3018a) {
            this();
        }
    }
}
