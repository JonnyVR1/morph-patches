package com.p051p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TEnumProtobufAdapter<T extends TEnum> extends ProtobufAdapter<T> {
    public TEnumProtobufAdapter() {
        this.wireFormat = 2;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(T t) {
        return CodedOutputByteBufferNano.m17281h(1, t.ordinal()) + CodedOutputByteBufferNano.m17288o(2, t.name());
    }

    public abstract T newTEnum(String str, int i);

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public T parse(nc5 nc5Var) throws IOException {
        int iM162486j = -1;
        String strM162495s = null;
        while (true) {
            int iM162497u = nc5Var.m162497u();
            if (iM162497u == 8) {
                iM162486j = nc5Var.m162486j();
            } else {
                if (iM162497u != 18) {
                    return (T) newTEnum(strM162495s, iM162486j);
                }
                strM162495s = nc5Var.m162495s();
            }
        }
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(T t, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17305G(1, t.ordinal());
        codedOutputByteBufferNano.m17316R(2, t.name());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(T t) {
        return computeAndCacheSize((TEnum) t);
    }
}
