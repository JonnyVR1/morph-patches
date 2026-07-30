package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;
import p149l.izv;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public final class LongAddables {

    /* JADX INFO: renamed from: a */
    public static final tyg0<izv> f10757a;

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$a */
    public class C2703a implements tyg0<izv> {
        @Override // p149l.tyg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public izv get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$b */
    public class C2704b implements tyg0<izv> {
        @Override // p149l.tyg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public izv get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        tyg0<izv> c2704b;
        try {
            new LongAdder();
            c2704b = new C2703a();
        } catch (Throwable unused) {
            c2704b = new C2704b();
        }
        f10757a = c2704b;
    }

    /* JADX INFO: renamed from: a */
    public static izv m15557a() {
        return f10757a.get();
    }

    public static final class PureJavaLongAddable extends AtomicLong implements izv {
        private PureJavaLongAddable() {
        }

        @Override // p149l.izv
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p149l.izv
        public void increment() {
            getAndIncrement();
        }

        @Override // p149l.izv
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C2703a c2703a) {
            this();
        }
    }
}
