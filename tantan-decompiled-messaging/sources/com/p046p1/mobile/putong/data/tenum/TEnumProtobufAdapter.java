package com.p046p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TEnumProtobufAdapter<T extends TEnum> extends ProtobufAdapter<T> {
    public TEnumProtobufAdapter() {
        this.wireFormat = 2;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(T t) {
        return CodedOutputByteBufferNano.m17226h(1, t.ordinal()) + CodedOutputByteBufferNano.m17233o(2, t.name());
    }

    public abstract T newTEnum(String str, int i);

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public T parse(nb5 nb5Var) throws IOException {
        int iM158741j = -1;
        String strM158750s = null;
        while (true) {
            int iM158752u = nb5Var.m158752u();
            if (iM158752u == 8) {
                iM158741j = nb5Var.m158741j();
            } else {
                if (iM158752u != 18) {
                    return (T) newTEnum(strM158750s, iM158741j);
                }
                strM158750s = nb5Var.m158750s();
            }
        }
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(T t, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17250G(1, t.ordinal());
        codedOutputByteBufferNano.m17261R(2, t.name());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(T t) {
        return computeAndCacheSize((TEnum) t);
    }
}
