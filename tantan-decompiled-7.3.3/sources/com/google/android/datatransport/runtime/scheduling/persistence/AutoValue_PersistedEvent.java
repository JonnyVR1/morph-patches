package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import p153l.mnd0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* JADX INFO: renamed from: id */
    private final long f6977id;
    private final TransportContext transportContext;

    public AutoValue_PersistedEvent(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f6977id = j;
        if (transportContext == null) {
            mnd0.m159157a("Null transportContext");
            throw null;
        }
        this.transportContext = transportContext;
        if (eventInternal != null) {
            this.event = eventInternal;
        } else {
            mnd0.m159157a("Null event");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedEvent) {
            PersistedEvent persistedEvent = (PersistedEvent) obj;
            if (this.f6977id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f6977id;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long j = this.f6977id;
        return this.event.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f6977id + ", transportContext=" + this.transportContext + ", event=" + this.event + "}";
    }
}
