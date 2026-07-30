package com.google.android.datatransport;

import androidx.annotation.Nullable;
import p149l.jfd0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_Event<T> extends Event<T> {
    private final Integer code;
    private final EventContext eventContext;
    private final T payload;
    private final Priority priority;
    private final ProductData productData;

    public AutoValue_Event(@Nullable Integer num, T t, Priority priority, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        this.code = num;
        if (t == null) {
            jfd0.m141176a("Null payload");
            throw null;
        }
        this.payload = t;
        if (priority == null) {
            jfd0.m141176a("Null priority");
            throw null;
        }
        this.priority = priority;
        this.productData = productData;
        this.eventContext = eventContext;
    }

    public boolean equals(Object obj) {
        ProductData productData;
        EventContext eventContext;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Event) {
            Event event = (Event) obj;
            Integer num = this.code;
            if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
                if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority()) && ((productData = this.productData) != null ? productData.equals(event.getProductData()) : event.getProductData() == null) && ((eventContext = this.eventContext) != null ? eventContext.equals(event.getEventContext()) : event.getEventContext() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public EventContext getEventContext() {
        return this.eventContext;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public ProductData getProductData() {
        return this.productData;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode()) * 1000003;
        ProductData productData = this.productData;
        int iHashCode2 = (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        EventContext eventContext = this.eventContext;
        return iHashCode2 ^ (eventContext != null ? eventContext.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + ", eventContext=" + this.eventContext + "}";
    }
}
