package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final ExtensionRegistryLite f65614a = ExtensionRegistryLite.m91299c();

    /* JADX INFO: renamed from: e */
    public final MessageType m91137e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m91138f(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: f */
    public final UninitializedMessageException m91138f(MessageType messagetype) {
        return messagetype instanceof AbstractMessageLite ? ((AbstractMessageLite) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo91134a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m91137e(m91142j(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo91135b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m91137e(m91143k(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo91136c(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m91137e(m91144l(byteString, extensionRegistryLite));
    }

    /* JADX INFO: renamed from: j */
    public MessageType m91142j(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) m91143k(new AbstractMessageLite.Builder.C15284a(inputStream, CodedInputStream.m91171B(i, inputStream)), extensionRegistryLite);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public MessageType m91143k(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamM91174g = CodedInputStream.m91174g(inputStream);
        MessageType messagetypeMo90487d = mo90487d(codedInputStreamM91174g, extensionRegistryLite);
        try {
            codedInputStreamM91174g.m91195a(0);
            return messagetypeMo90487d;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo90487d);
        }
    }

    /* JADX INFO: renamed from: l */
    public MessageType m91144l(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamMo91163v = byteString.mo91163v();
        MessageType messagetypeMo90487d = mo90487d(codedInputStreamMo91163v, extensionRegistryLite);
        try {
            codedInputStreamMo91163v.m91195a(0);
            return messagetypeMo90487d;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo90487d);
        }
    }
}
