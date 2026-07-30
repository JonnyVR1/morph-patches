package com.google.protobuf;

import java.io.IOException;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: renamed from: com.google.protobuf.q */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3419q extends o6z {

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    public interface a extends o6z, Cloneable {
        InterfaceC3419q build();

        InterfaceC3419q buildPartial();

        a mergeFrom(C3407e c3407e, C3410h c3410h) throws IOException;

        a mergeFrom(InterfaceC3419q interfaceC3419q);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    i860<? extends InterfaceC3419q> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
