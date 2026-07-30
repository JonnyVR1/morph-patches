package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import p149l.l7j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.u */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC2002u extends AbstractC1936c<Void> {

    /* JADX INFO: renamed from: e */
    public static final Void f9089e = null;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1965i f9090d;

    public AbstractC2002u(InterfaceC1965i interfaceC1965i) {
        this.f9090d = interfaceC1965i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    @Nullable
    public AbstractC1834c0 getInitialTimeline() {
        return this.f9090d.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f9090d.getMediaItem();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public InterfaceC1965i.b mo11137h(InterfaceC1965i.b bVar) {
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1965i.b mo10915c(Void r1, InterfaceC1965i.b bVar) {
        return mo11137h(bVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public boolean isSingleWindow() {
        return this.f9090d.isSingleWindow();
    }

    /* JADX INFO: renamed from: j */
    public long m11736j(long j) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final long mo10945d(Void r1, long j) {
        return m11736j(j);
    }

    /* JADX INFO: renamed from: l */
    public int m11738l(int i) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int mo10946e(Void r1, int i) {
        return m11738l(i);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo10913p(AbstractC1834c0 abstractC1834c0);

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.AbstractC1934a
    public final void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        super.prepareSourceInternal(l7j0Var);
        mo11138t();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void mo10916f(Void r1, InterfaceC1965i interfaceC1965i, AbstractC1834c0 abstractC1834c0) {
        mo10913p(abstractC1834c0);
    }

    /* JADX INFO: renamed from: s */
    public final void m11741s() {
        m10947g(f9089e, this.f9090d);
    }

    /* JADX INFO: renamed from: t */
    public void mo11138t() {
        m11741s();
    }
}
