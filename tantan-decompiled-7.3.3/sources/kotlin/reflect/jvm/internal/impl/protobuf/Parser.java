package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Parser<MessageType> {
    /* JADX INFO: renamed from: a */
    MessageType mo92025a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: b */
    MessageType mo92026b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: c */
    MessageType mo92027c(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: d */
    MessageType mo91378d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}
