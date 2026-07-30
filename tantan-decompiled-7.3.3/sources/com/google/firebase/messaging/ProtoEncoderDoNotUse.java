package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {
    private static final ProtobufEncoder ENCODER = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(Object obj) {
        return ENCODER.encode(obj);
    }

    public abstract MessagingClientEventExtension getMessagingClientEventExtension();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        ENCODER.encode(obj, outputStream);
    }
}
