package com.google.common.hash;

import java.util.concurrent.atomic.AtomicLong;
import p149l.hzv;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public final class LongAddables {

    /* JADX INFO: renamed from: a */
    public static final tyg0<hzv> f11226a;

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$a */
    public class C2995a implements tyg0<hzv> {
        @Override // p149l.tyg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hzv get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$b */
    public class C2996b implements tyg0<hzv> {
        @Override // p149l.tyg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hzv get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        tyg0<hzv> c2996b;
        try {
            new LongAdder();
            c2996b = new C2995a();
        } catch (Throwable unused) {
            c2996b = new C2996b();
        }
        f11226a = c2996b;
    }

    /* JADX INFO: renamed from: a */
    public static hzv m16335a() {
        return f11226a.get();
    }

    public static final class PureJavaLongAddable extends AtomicLong implements hzv {
        private PureJavaLongAddable() {
        }

        @Override // p149l.hzv
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p149l.hzv
        public void increment() {
            getAndIncrement();
        }

        @Override // p149l.hzv
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C2995a c2995a) {
            this();
        }
    }
}
