package com.tantanapp.common.data;

import com.tantanapp.common.data.ValueObject;
import p149l.edk0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class MessageNanoAdapter<T extends ValueObject> extends ProtobufAdapter<T> {
    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(T t) {
        if (t.cachedSize < 0) {
            String str = edk0.f90611a;
            computeAndCacheSize(t);
        }
        return t.cachedSize;
    }
}
