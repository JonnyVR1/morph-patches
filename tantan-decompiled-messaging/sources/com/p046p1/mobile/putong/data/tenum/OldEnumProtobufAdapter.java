package com.p046p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class OldEnumProtobufAdapter extends ProtobufAdapter<Integer> {
    public static final OldEnumProtobufAdapter PROTOBUF_ADAPTER = new OldEnumProtobufAdapter();

    private OldEnumProtobufAdapter() {
        this.wireFormat = 0;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(Integer num) {
        return CodedOutputByteBufferNano.m17227i(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tantanapp.common.data.ProtobufAdapter
    public Integer parse(nb5 nb5Var) throws IOException {
        return Integer.valueOf(nb5Var.m158741j());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(Integer num, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17251H(num.intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(Integer num) {
        return computeAndCacheSize(num);
    }
}
