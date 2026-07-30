package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p149l.l7j0;
import p149l.p11;
import p149l.v680;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1934a implements InterfaceC1965i {

    @Nullable
    private Looper looper;

    @Nullable
    private v680 playerId;

    @Nullable
    private AbstractC1834c0 timeline;
    private final ArrayList<InterfaceC1965i.c> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<InterfaceC1965i.c> enabledMediaSourceCallers = new HashSet<>(1);
    private final InterfaceC1966j.a eventDispatcher = new InterfaceC1966j.a();
    private final InterfaceC1854b.a drmEventDispatcher = new InterfaceC1854b.a();

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void addDrmEventListener(Handler handler, InterfaceC1854b interfaceC1854b) {
        p11.m167011e(handler);
        p11.m167011e(interfaceC1854b);
        this.drmEventDispatcher.m9925g(handler, interfaceC1854b);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void addEventListener(Handler handler, InterfaceC1966j interfaceC1966j) {
        p11.m167011e(handler);
        p11.m167011e(interfaceC1966j);
        this.eventDispatcher.m11277g(handler, interfaceC1966j);
    }

    public final InterfaceC1854b.a createDrmEventDispatcher(@Nullable InterfaceC1965i.b bVar) {
        return this.drmEventDispatcher.m9933o(0, bVar);
    }

    @Deprecated
    public final InterfaceC1966j.a createEventDispatcher(InterfaceC1965i.b bVar, long j) {
        p11.m167011e(bVar);
        return this.eventDispatcher.m11295y(0, bVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void disable(InterfaceC1965i.c cVar) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(cVar);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void enable(InterfaceC1965i.c cVar) {
        p11.m167011e(this.looper);
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(cVar);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    public final v680 getPlayerId() {
        return (v680) p11.m167015i(this.playerId);
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void prepareSource(InterfaceC1965i.c cVar, @Nullable l7j0 l7j0Var, v680 v680Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        p11.m167007a(looper == null || looper == looperMyLooper);
        this.playerId = v680Var;
        AbstractC1834c0 abstractC1834c0 = this.timeline;
        this.mediaSourceCallers.add(cVar);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(cVar);
            prepareSourceInternal(l7j0Var);
        } else if (abstractC1834c0 != null) {
            enable(cVar);
            cVar.mo11270a(this, abstractC1834c0);
        }
    }

    public abstract void prepareSourceInternal(@Nullable l7j0 l7j0Var);

    public final void refreshSourceInfo(AbstractC1834c0 abstractC1834c0) {
        this.timeline = abstractC1834c0;
        Iterator<InterfaceC1965i.c> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().mo11270a(this, abstractC1834c0);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void releaseSource(InterfaceC1965i.c cVar) {
        this.mediaSourceCallers.remove(cVar);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(cVar);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void removeDrmEventListener(InterfaceC1854b interfaceC1854b) {
        this.drmEventDispatcher.m9932n(interfaceC1854b);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public final void removeEventListener(InterfaceC1966j interfaceC1966j) {
        this.eventDispatcher.m11292v(interfaceC1966j);
    }

    public final InterfaceC1854b.a createDrmEventDispatcher(int i, @Nullable InterfaceC1965i.b bVar) {
        return this.drmEventDispatcher.m9933o(i, bVar);
    }

    public final InterfaceC1966j.a createEventDispatcher(int i, @Nullable InterfaceC1965i.b bVar) {
        return this.eventDispatcher.m11295y(i, bVar);
    }

    public final InterfaceC1966j.a createEventDispatcher(@Nullable InterfaceC1965i.b bVar) {
        return this.eventDispatcher.m11295y(0, bVar);
    }

    @Deprecated
    public final InterfaceC1966j.a createEventDispatcher(int i, @Nullable InterfaceC1965i.b bVar, long j) {
        return this.eventDispatcher.m11295y(i, bVar);
    }

    public final void prepareSource(InterfaceC1965i.c cVar, @Nullable l7j0 l7j0Var) {
        prepareSource(cVar, l7j0Var, v680.f180167b);
    }
}
