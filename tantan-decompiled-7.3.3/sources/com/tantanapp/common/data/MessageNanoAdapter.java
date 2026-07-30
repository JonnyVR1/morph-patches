package com.tantanapp.common.data;

import com.tantanapp.common.data.ValueObject;
import p153l.kmk0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MessageNanoAdapter<T extends ValueObject> extends ProtobufAdapter<T> {
    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(T t) {
        if (t.cachedSize < 0) {
            String str = kmk0.f127508a;
            computeAndCacheSize(t);
        }
        return t.cachedSize;
    }
}
