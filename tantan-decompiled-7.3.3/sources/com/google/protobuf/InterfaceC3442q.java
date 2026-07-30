package com.google.protobuf;

import java.io.IOException;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: renamed from: com.google.protobuf.q */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3442q extends lfz {

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    public interface a extends lfz, Cloneable {
        InterfaceC3442q build();

        InterfaceC3442q buildPartial();

        a mergeFrom(C3430e c3430e, C3433h c3433h) throws IOException;

        a mergeFrom(InterfaceC3442q interfaceC3442q);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    ng60<? extends InterfaceC3442q> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
