package com.google.common.cache;

import com.google.common.util.concurrent.C3103e;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p153l.adj;
import p153l.b7h0;
import p153l.hpr;
import p153l.npr;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CacheLoader<K, V> {

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final adj<K, V> computingFunction;

        public FunctionToCacheLoader(adj<K, V> adjVar) {
            this.computingFunction = (adj) xn80.m212111p(adjVar);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return this.computingFunction.apply((K) xn80.m212111p(k));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final b7h0<V> computingSupplier;

        public SupplierToCacheLoader(b7h0<V> b7h0Var) {
            this.computingSupplier = (b7h0) xn80.m212111p(b7h0Var);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            xn80.m212111p(obj);
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$a */
    public class C2682a extends CacheLoader<K, V> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f10695b;

        /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$a$a */
        public class a implements Callable<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f10696a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f10697b;

            public a(Object obj, Object obj2) {
                this.f10696a = obj;
                this.f10697b = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return CacheLoader.this.reload(this.f10696a, this.f10697b).get();
            }
        }

        public C2682a(Executor executor) {
            this.f10695b = executor;
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
        public hpr<V> reload(K k, V v2) throws Exception {
            npr nprVarM164245a = npr.m164245a(new a(k, v2));
            this.f10695b.execute(nprVarM164245a);
            return nprVarM164245a;
        }
    }

    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        xn80.m212111p(cacheLoader);
        xn80.m212111p(executor);
        return cacheLoader.new C2682a(executor);
    }

    public static <K, V> CacheLoader<K, V> from(adj<K, V> adjVar) {
        return new FunctionToCacheLoader(adjVar);
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    public hpr<V> reload(K k, V v2) throws Exception {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        return C3103e.m16712d(load(k));
    }

    public static <V> CacheLoader<Object, V> from(b7h0<V> b7h0Var) {
        return new SupplierToCacheLoader(b7h0Var);
    }
}
