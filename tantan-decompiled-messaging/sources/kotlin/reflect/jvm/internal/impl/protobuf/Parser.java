package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Parser<MessageType> {
    /* JADX INFO: renamed from: a */
    MessageType mo91134a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: b */
    MessageType mo91135b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: c */
    MessageType mo91136c(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: d */
    MessageType mo90487d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}
