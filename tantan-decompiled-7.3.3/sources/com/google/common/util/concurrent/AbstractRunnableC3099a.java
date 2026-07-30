package com.google.common.util.concurrent;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p153l.adj;
import p153l.hpr;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractRunnableC3099a<I, O, F, T> extends AbstractC3102d.a<O> implements Runnable {

    /* JADX INFO: renamed from: h */
    public hpr<? extends I> f11409h;

    /* JADX INFO: renamed from: i */
    public F f11410i;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a */
    public static final class a<I, O> extends AbstractRunnableC3099a<I, O, adj<? super I, ? extends O>, O> {
        public a(hpr<? extends I> hprVar, adj<? super I, ? extends O> adjVar) {
            super(hprVar, adjVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC3099a
        /* JADX INFO: renamed from: I */
        public void mo16707I(O o) {
            mo16651C(o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC3099a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public O mo16706H(adj<? super I, ? extends O> adjVar, I i) {
            return adjVar.apply(i);
        }
    }

    public AbstractRunnableC3099a(hpr<? extends I> hprVar, F f) {
        this.f11409h = (hpr) xn80.m212111p(hprVar);
        this.f11410i = (F) xn80.m212111p(f);
    }

    /* JADX INFO: renamed from: G */
    public static <I, O> hpr<O> m16705G(hpr<I> hprVar, adj<? super I, ? extends O> adjVar, Executor executor) {
        xn80.m212111p(adjVar);
        a aVar = new a(hprVar, adjVar);
        hprVar.addListener(aVar, C3105g.m16715b(executor, aVar));
        return aVar;
    }

    /* JADX INFO: renamed from: H */
    public abstract T mo16706H(F f, I i) throws Exception;

    /* JADX INFO: renamed from: I */
    public abstract void mo16707I(T t);

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: n */
    public final void mo16658n() {
        m16664y(this.f11409h);
        this.f11409h = null;
        this.f11410i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        hpr<? extends I> hprVar = this.f11409h;
        F f = this.f11410i;
        if ((isCancelled() | (hprVar == null)) || (f == null)) {
            return;
        }
        this.f11409h = null;
        if (hprVar.isCancelled()) {
            m16653E(hprVar);
            return;
        }
        try {
            try {
                Object objMo16706H = mo16706H(f, C3103e.m16710b(hprVar));
                this.f11410i = null;
                mo16707I(objMo16706H);
            } catch (Throwable th) {
                try {
                    mo16652D(th);
                } finally {
                    this.f11410i = null;
                }
            }
        } catch (Error e) {
            mo16652D(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            mo16652D(e2);
        } catch (ExecutionException e3) {
            mo16652D(e3.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: z */
    public String mo16665z() {
        String string;
        hpr<? extends I> hprVar = this.f11409h;
        F f = this.f11410i;
        String strMo16665z = super.mo16665z();
        if (hprVar != null) {
            String strValueOf = String.valueOf(hprVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (f == null) {
            if (strMo16665z != null) {
                return strMo16665z.length() != 0 ? string.concat(strMo16665z) : new String(string);
            }
            return null;
        }
        String strValueOf2 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(string.length() + 11 + strValueOf2.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf2);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }
}
