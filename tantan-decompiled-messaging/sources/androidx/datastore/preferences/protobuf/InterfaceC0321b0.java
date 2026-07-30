package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import p149l.j860;
import p149l.p6z;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0321b0 extends p6z {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$a */
    public interface a extends p6z, Cloneable {
        InterfaceC0321b0 build();

        InterfaceC0321b0 buildPartial();

        /* JADX INFO: renamed from: g */
        a mo1799g(InterfaceC0321b0 interfaceC0321b0);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    /* JADX INFO: renamed from: a */
    void mo1633a(CodedOutputStream codedOutputStream) throws IOException;

    j860<? extends InterfaceC0321b0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}
