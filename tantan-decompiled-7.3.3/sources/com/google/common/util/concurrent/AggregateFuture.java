package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.logging.Logger;
import p153l.gyj0;
import p153l.hpr;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AbstractC3100b<OutputT> {

    /* JADX INFO: renamed from: m */
    public static final Logger f11388m = Logger.getLogger(AggregateFuture.class.getName());

    /* JADX INFO: renamed from: l */
    public ImmutableCollection<? extends hpr<? extends InputT>> f11389l;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: renamed from: G */
    public void m16676G(ReleaseResourcesReason releaseResourcesReason) {
        xn80.m212111p(releaseResourcesReason);
        this.f11389l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: n */
    public final void mo16658n() {
        super.mo16658n();
        ImmutableCollection<? extends hpr<? extends InputT>> immutableCollection = this.f11389l;
        m16676G(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zM16654F = m16654F();
            gyj0<? extends hpr<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zM16654F);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* JADX INFO: renamed from: z */
    public final String mo16665z() {
        ImmutableCollection<? extends hpr<? extends InputT>> immutableCollection = this.f11389l;
        if (immutableCollection == null) {
            return super.mo16665z();
        }
        String strValueOf = String.valueOf(immutableCollection);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
