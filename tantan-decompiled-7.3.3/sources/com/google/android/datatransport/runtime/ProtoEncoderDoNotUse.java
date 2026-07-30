package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {
    private static final ProtobufEncoder ENCODER = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(Object obj) {
        return ENCODER.encode(obj);
    }

    public abstract ClientMetrics getClientMetrics();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        ENCODER.encode(obj, outputStream);
    }
}
