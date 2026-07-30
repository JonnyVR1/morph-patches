package com.tantanapp.common.data;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.lang.Enum;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class EnumProtobufAdapter<E extends Enum> extends ProtobufAdapter<E> {
    private final E[] VALUES;
    private w9j<E, Integer> getOrdinal;

    public EnumProtobufAdapter(E[] eArr, w9j<E, Integer> w9jVar) {
        this.wireFormat = 0;
        this.VALUES = eArr;
        this.getOrdinal = w9jVar;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(E e) {
        return CodedOutputByteBufferNano.m17227i(this.getOrdinal.call(e).intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public E parse(nb5 nb5Var) throws IOException {
        return this.VALUES[nb5Var.m158741j() + 1];
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(E e, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17251H(this.getOrdinal.call(e).intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(E e) {
        return computeAndCacheSize((Enum) e);
    }
}
