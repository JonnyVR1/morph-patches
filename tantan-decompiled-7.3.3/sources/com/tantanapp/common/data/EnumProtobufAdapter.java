package com.tantanapp.common.data;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.lang.Enum;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public class EnumProtobufAdapter<E extends Enum> extends ProtobufAdapter<E> {
    private final E[] VALUES;
    private qcj<E, Integer> getOrdinal;

    public EnumProtobufAdapter(E[] eArr, qcj<E, Integer> qcjVar) {
        this.wireFormat = 0;
        this.VALUES = eArr;
        this.getOrdinal = qcjVar;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(E e) {
        return CodedOutputByteBufferNano.m17282i(this.getOrdinal.call(e).intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public E parse(nc5 nc5Var) throws IOException {
        return this.VALUES[nc5Var.m162486j() + 1];
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(E e, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17306H(this.getOrdinal.call(e).intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(E e) {
        return computeAndCacheSize((Enum) e);
    }
}
