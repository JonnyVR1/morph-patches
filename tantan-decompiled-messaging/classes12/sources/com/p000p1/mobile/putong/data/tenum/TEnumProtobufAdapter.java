package com.p000p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class TEnumProtobufAdapter<T extends TEnum> extends ProtobufAdapter<T> {
    public TEnumProtobufAdapter() {
        ((ProtobufAdapter) this).wireFormat = 2;
    }

    public int computeAndCacheSize(T t) {
        return CodedOutputByteBufferNano.h(1, t.ordinal()) + CodedOutputByteBufferNano.o(2, t.name());
    }

    public abstract T newTEnum(String str, int i);

    /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
    public T m19397parse(nb5 nb5Var) throws IOException {
        int iJ = -1;
        String strS = null;
        while (true) {
            int iU = nb5Var.u();
            if (iU == 8) {
                iJ = nb5Var.j();
            } else {
                if (iU != 18) {
                    return (T) newTEnum(strS, iJ);
                }
                strS = nb5Var.s();
            }
        }
    }

    public void serialize(T t, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.G(1, t.ordinal());
        codedOutputByteBufferNano.R(2, t.name());
    }

    public int getSize(T t) {
        return computeAndCacheSize((TEnum) t);
    }
}
