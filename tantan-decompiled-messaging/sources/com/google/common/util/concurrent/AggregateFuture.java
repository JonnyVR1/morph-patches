package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.logging.Logger;
import p149l.dpj0;
import p149l.gnr;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AbstractC3077b<OutputT> {

    /* JADX INFO: renamed from: m */
    public static final Logger f11351m = Logger.getLogger(AggregateFuture.class.getName());

    /* JADX INFO: renamed from: l */
    public ImmutableCollection<? extends gnr<? extends InputT>> f11352l;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: renamed from: G */
    public void m16621G(ReleaseResourcesReason releaseResourcesReason) {
        sf80.m183894p(releaseResourcesReason);
        this.f11352l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: n */
    public final void mo16603n() {
        super.mo16603n();
        ImmutableCollection<? extends gnr<? extends InputT>> immutableCollection = this.f11352l;
        m16621G(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zM16599F = m16599F();
            dpj0<? extends gnr<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zM16599F);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: z */
    public final String mo16610z() {
        ImmutableCollection<? extends gnr<? extends InputT>> immutableCollection = this.f11352l;
        if (immutableCollection == null) {
            return super.mo16610z();
        }
        String strValueOf = String.valueOf(immutableCollection);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
