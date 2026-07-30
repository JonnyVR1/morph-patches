package com.p000p1.mobile.putong.data.tenum;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.tantanapp.common.data.ProtobufAdapter;
import java.io.IOException;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OldEnumProtobufAdapter extends ProtobufAdapter<Integer> {
    public static final OldEnumProtobufAdapter PROTOBUF_ADAPTER = new OldEnumProtobufAdapter();

    private OldEnumProtobufAdapter() {
        ((ProtobufAdapter) this).wireFormat = 0;
    }

    public int computeAndCacheSize(Integer num) {
        return CodedOutputByteBufferNano.i(num.intValue());
    }

    /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
    public Integer m19393parse(nb5 nb5Var) throws IOException {
        return Integer.valueOf(nb5Var.j());
    }

    public void serialize(Integer num, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.H(num.intValue());
    }

    public int getSize(Integer num) {
        return computeAndCacheSize(num);
    }
}
