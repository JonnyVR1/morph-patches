package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final ExtensionRegistryLite f66288a = ExtensionRegistryLite.m92190c();

    /* JADX INFO: renamed from: e */
    public final MessageType m92028e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m92029f(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: f */
    public final UninitializedMessageException m92029f(MessageType messagetype) {
        return messagetype instanceof AbstractMessageLite ? ((AbstractMessageLite) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo92025a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m92028e(m92033j(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo92026b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m92028e(m92034k(inputStream, extensionRegistryLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo92027c(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) m92028e(m92035l(byteString, extensionRegistryLite));
    }

    /* JADX INFO: renamed from: j */
    public MessageType m92033j(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) m92034k(new AbstractMessageLite.Builder.C15391a(inputStream, CodedInputStream.m92062B(i, inputStream)), extensionRegistryLite);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public MessageType m92034k(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamM92065g = CodedInputStream.m92065g(inputStream);
        MessageType messagetypeMo91378d = mo91378d(codedInputStreamM92065g, extensionRegistryLite);
        try {
            codedInputStreamM92065g.m92086a(0);
            return messagetypeMo91378d;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo91378d);
        }
    }

    /* JADX INFO: renamed from: l */
    public MessageType m92035l(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamMo92054v = byteString.mo92054v();
        MessageType messagetypeMo91378d = mo91378d(codedInputStreamMo92054v, extensionRegistryLite);
        try {
            codedInputStreamMo92054v.m92086a(0);
            return messagetypeMo91378d;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo91378d);
        }
    }
}
