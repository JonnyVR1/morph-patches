package com.google.common.cache;

import com.google.common.util.concurrent.C3080e;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p149l.gaj;
import p149l.gnr;
import p149l.mnr;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CacheLoader<K, V> {

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final gaj<K, V> computingFunction;

        public FunctionToCacheLoader(gaj<K, V> gajVar) {
            this.computingFunction = (gaj) sf80.m183894p(gajVar);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return this.computingFunction.apply((K) sf80.m183894p(k));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final tyg0<V> computingSupplier;

        public SupplierToCacheLoader(tyg0<V> tyg0Var) {
            this.computingSupplier = (tyg0) sf80.m183894p(tyg0Var);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            sf80.m183894p(obj);
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$a */
    public class C2659a extends CacheLoader<K, V> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f10658b;

        /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$a$a */
        public class a implements Callable<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f10659a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f10660b;

            public a(Object obj, Object obj2) {
                this.f10659a = obj;
                this.f10660b = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return CacheLoader.this.reload(this.f10659a, this.f10660b).get();
            }
        }

        public C2659a(Executor executor) {
            this.f10658b = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) throws Exception {
            return (V) CacheLoader.this.load(k);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return CacheLoader.this.loadAll(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public gnr<V> reload(K k, V v2) throws Exception {
            mnr mnrVarM155556a = mnr.m155556a(new a(k, v2));
            this.f10658b.execute(mnrVarM155556a);
            return mnrVarM155556a;
        }
    }

    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        sf80.m183894p(cacheLoader);
        sf80.m183894p(executor);
        return cacheLoader.new C2659a(executor);
    }

    public static <K, V> CacheLoader<K, V> from(gaj<K, V> gajVar) {
        return new FunctionToCacheLoader(gajVar);
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    public gnr<V> reload(K k, V v2) throws Exception {
        sf80.m183894p(k);
        sf80.m183894p(v2);
        return C3080e.m16657d(load(k));
    }

    public static <V> CacheLoader<Object, V> from(tyg0<V> tyg0Var) {
        return new SupplierToCacheLoader(tyg0Var);
    }
}
