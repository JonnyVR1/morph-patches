package com.p051p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class OldEnumProtobufAdapter extends ProtobufAdapter<Integer> {
    public static final OldEnumProtobufAdapter PROTOBUF_ADAPTER = new OldEnumProtobufAdapter();

    private OldEnumProtobufAdapter() {
        this.wireFormat = 0;
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int computeAndCacheSize(Integer num) {
        return CodedOutputByteBufferNano.m17282i(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tantanapp.common.data.ProtobufAdapter
    public Integer parse(nc5 nc5Var) throws IOException {
        return Integer.valueOf(nc5Var.m162486j());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public void serialize(Integer num, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m17306H(num.intValue());
    }

    @Override // com.tantanapp.common.data.ProtobufAdapter
    public int getSize(Integer num) {
        return computeAndCacheSize(num);
    }
}
