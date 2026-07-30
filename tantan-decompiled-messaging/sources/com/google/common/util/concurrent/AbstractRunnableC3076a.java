package com.google.common.util.concurrent;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p149l.gaj;
import p149l.gnr;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractRunnableC3076a<I, O, F, T> extends AbstractC3079d.a<O> implements Runnable {

    /* JADX INFO: renamed from: h */
    public gnr<? extends I> f11372h;

    /* JADX INFO: renamed from: i */
    public F f11373i;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a */
    public static final class a<I, O> extends AbstractRunnableC3076a<I, O, gaj<? super I, ? extends O>, O> {
        public a(gnr<? extends I> gnrVar, gaj<? super I, ? extends O> gajVar) {
            super(gnrVar, gajVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC3076a
        /* JADX INFO: renamed from: I */
        public void mo16652I(O o) {
            mo16596C(o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC3076a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public O mo16651H(gaj<? super I, ? extends O> gajVar, I i) {
            return gajVar.apply(i);
        }
    }

    public AbstractRunnableC3076a(gnr<? extends I> gnrVar, F f) {
        this.f11372h = (gnr) sf80.m183894p(gnrVar);
        this.f11373i = (F) sf80.m183894p(f);
    }

    /* JADX INFO: renamed from: G */
    public static <I, O> gnr<O> m16650G(gnr<I> gnrVar, gaj<? super I, ? extends O> gajVar, Executor executor) {
        sf80.m183894p(gajVar);
        a aVar = new a(gnrVar, gajVar);
        gnrVar.addListener(aVar, C3082g.m16660b(executor, aVar));
        return aVar;
    }

    /* JADX INFO: renamed from: H */
    public abstract T mo16651H(F f, I i) throws Exception;

    /* JADX INFO: renamed from: I */
    public abstract void mo16652I(T t);

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: n */
    public final void mo16603n() {
        m16609y(this.f11372h);
        this.f11372h = null;
        this.f11373i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        gnr<? extends I> gnrVar = this.f11372h;
        F f = this.f11373i;
        if ((isCancelled() | (gnrVar == null)) || (f == null)) {
            return;
        }
        this.f11372h = null;
        if (gnrVar.isCancelled()) {
            m16598E(gnrVar);
            return;
        }
        try {
            try {
                Object objMo16651H = mo16651H(f, C3080e.m16655b(gnrVar));
                this.f11373i = null;
                mo16652I(objMo16651H);
            } catch (Throwable th) {
                try {
                    mo16597D(th);
                } finally {
                    this.f11373i = null;
                }
            }
        } catch (Error e) {
            mo16597D(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            mo16597D(e2);
        } catch (ExecutionException e3) {
            mo16597D(e3.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: z */
    public String mo16610z() {
        String string;
        gnr<? extends I> gnrVar = this.f11372h;
        F f = this.f11373i;
        String strMo16610z = super.mo16610z();
        if (gnrVar != null) {
            String strValueOf = String.valueOf(gnrVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (f == null) {
            if (strMo16610z != null) {
                return strMo16610z.length() != 0 ? string.concat(strMo16610z) : new String(string);
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
