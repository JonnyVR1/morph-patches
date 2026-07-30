package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p153l.bf80;
import p153l.pgj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1957a implements InterfaceC1988i {

    @Nullable
    private Looper looper;

    @Nullable
    private bf80 playerId;

    @Nullable
    private AbstractC1857c0 timeline;
    private final ArrayList<InterfaceC1988i.c> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<InterfaceC1988i.c> enabledMediaSourceCallers = new HashSet<>(1);
    private final InterfaceC1989j.a eventDispatcher = new InterfaceC1989j.a();
    private final InterfaceC1877b.a drmEventDispatcher = new InterfaceC1877b.a();

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void addDrmEventListener(Handler handler, InterfaceC1877b interfaceC1877b) {
        w11.m204369e(handler);
        w11.m204369e(interfaceC1877b);
        this.drmEventDispatcher.m9979g(handler, interfaceC1877b);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void addEventListener(Handler handler, InterfaceC1989j interfaceC1989j) {
        w11.m204369e(handler);
        w11.m204369e(interfaceC1989j);
        this.eventDispatcher.m11331g(handler, interfaceC1989j);
    }

    public final InterfaceC1877b.a createDrmEventDispatcher(@Nullable InterfaceC1988i.b bVar) {
        return this.drmEventDispatcher.m9987o(0, bVar);
    }

    @Deprecated
    public final InterfaceC1989j.a createEventDispatcher(InterfaceC1988i.b bVar, long j) {
        w11.m204369e(bVar);
        return this.eventDispatcher.m11349y(0, bVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void disable(InterfaceC1988i.c cVar) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(cVar);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void enable(InterfaceC1988i.c cVar) {
        w11.m204369e(this.looper);
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(cVar);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    public final bf80 getPlayerId() {
        return (bf80) w11.m204373i(this.playerId);
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void prepareSource(InterfaceC1988i.c cVar, @Nullable pgj0 pgj0Var, bf80 bf80Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        w11.m204365a(looper == null || looper == looperMyLooper);
        this.playerId = bf80Var;
        AbstractC1857c0 abstractC1857c0 = this.timeline;
        this.mediaSourceCallers.add(cVar);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(cVar);
            prepareSourceInternal(pgj0Var);
        } else if (abstractC1857c0 != null) {
            enable(cVar);
            cVar.mo11324a(this, abstractC1857c0);
        }
    }

    public abstract void prepareSourceInternal(@Nullable pgj0 pgj0Var);

    public final void refreshSourceInfo(AbstractC1857c0 abstractC1857c0) {
        this.timeline = abstractC1857c0;
        Iterator<InterfaceC1988i.c> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().mo11324a(this, abstractC1857c0);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void releaseSource(InterfaceC1988i.c cVar) {
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

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void removeDrmEventListener(InterfaceC1877b interfaceC1877b) {
        this.drmEventDispatcher.m9986n(interfaceC1877b);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public final void removeEventListener(InterfaceC1989j interfaceC1989j) {
        this.eventDispatcher.m11346v(interfaceC1989j);
    }

    public final InterfaceC1877b.a createDrmEventDispatcher(int i, @Nullable InterfaceC1988i.b bVar) {
        return this.drmEventDispatcher.m9987o(i, bVar);
    }

    public final InterfaceC1989j.a createEventDispatcher(int i, @Nullable InterfaceC1988i.b bVar) {
        return this.eventDispatcher.m11349y(i, bVar);
    }

    public final InterfaceC1989j.a createEventDispatcher(@Nullable InterfaceC1988i.b bVar) {
        return this.eventDispatcher.m11349y(0, bVar);
    }

    @Deprecated
    public final InterfaceC1989j.a createEventDispatcher(int i, @Nullable InterfaceC1988i.b bVar, long j) {
        return this.eventDispatcher.m11349y(i, bVar);
    }

    public final void prepareSource(InterfaceC1988i.c cVar, @Nullable pgj0 pgj0Var) {
        prepareSource(cVar, pgj0Var, bf80.f76466b);
    }
}
