package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import p153l.mfz;
import p153l.og60;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0322b0 extends mfz {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$a */
    public interface a extends mfz, Cloneable {
        InterfaceC0322b0 build();

        InterfaceC0322b0 buildPartial();

        /* JADX INFO: renamed from: g */
        a mo1800g(InterfaceC0322b0 interfaceC0322b0);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    /* JADX INFO: renamed from: a */
    void mo1634a(CodedOutputStream codedOutputStream) throws IOException;

    og60<? extends InterfaceC0322b0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}
