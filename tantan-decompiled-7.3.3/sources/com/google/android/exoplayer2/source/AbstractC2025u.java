package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import p153l.pgj0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.u */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC2025u extends AbstractC1959c<Void> {

    /* JADX INFO: renamed from: e */
    public static final Void f9126e = null;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1988i f9127d;

    public AbstractC2025u(InterfaceC1988i interfaceC1988i) {
        this.f9127d = interfaceC1988i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    @Nullable
    public AbstractC1857c0 getInitialTimeline() {
        return this.f9127d.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f9127d.getMediaItem();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public InterfaceC1988i.b mo11191h(InterfaceC1988i.b bVar) {
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1988i.b mo10969c(Void r1, InterfaceC1988i.b bVar) {
        return mo11191h(bVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public boolean isSingleWindow() {
        return this.f9127d.isSingleWindow();
    }

    /* JADX INFO: renamed from: j */
    public long m11790j(long j) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final long mo10999d(Void r1, long j) {
        return m11790j(j);
    }

    /* JADX INFO: renamed from: l */
    public int m11792l(int i) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int mo11000e(Void r1, int i) {
        return m11792l(i);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo10967p(AbstractC1857c0 abstractC1857c0);

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.AbstractC1957a
    public final void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        super.prepareSourceInternal(pgj0Var);
        mo11192t();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void mo10970f(Void r1, InterfaceC1988i interfaceC1988i, AbstractC1857c0 abstractC1857c0) {
        mo10967p(abstractC1857c0);
    }

    /* JADX INFO: renamed from: s */
    public final void m11795s() {
        m11001g(f9126e, this.f9127d);
    }

    /* JADX INFO: renamed from: t */
    public void mo11192t() {
        m11795s();
    }
}
