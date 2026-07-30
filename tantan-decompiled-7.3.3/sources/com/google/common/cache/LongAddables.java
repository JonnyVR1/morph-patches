package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;
import p153l.b7h0;
import p153l.g1w;

/* JADX INFO: loaded from: classes7.dex */
public final class LongAddables {

    /* JADX INFO: renamed from: a */
    public static final b7h0<g1w> f10794a;

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$a */
    public class C2726a implements b7h0<g1w> {
        @Override // p153l.b7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1w get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$b */
    public class C2727b implements b7h0<g1w> {
        @Override // p153l.b7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1w get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        b7h0<g1w> c2727b;
        try {
            new LongAdder();
            c2727b = new C2726a();
        } catch (Throwable unused) {
            c2727b = new C2727b();
        }
        f10794a = c2727b;
    }

    /* JADX INFO: renamed from: a */
    public static g1w m15611a() {
        return f10794a.get();
    }

    public static final class PureJavaLongAddable extends AtomicLong implements g1w {
        private PureJavaLongAddable() {
        }

        @Override // p153l.g1w
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p153l.g1w
        public void increment() {
            getAndIncrement();
        }

        @Override // p153l.g1w
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C2726a c2726a) {
            this();
        }
    }
}
