package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC0322b0;
import p153l.og60;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0321b<MessageType extends InterfaceC0322b0> implements og60<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C0341l f1599a = C0341l.m2227b();

    /* JADX INFO: renamed from: c */
    public final MessageType m1815c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m1816d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: d */
    public final UninitializedMessageException m1816d(MessageType messagetype) {
        return messagetype instanceof AbstractC0319a ? ((AbstractC0319a) messagetype).m1794f() : new UninitializedMessageException(messagetype);
    }

    @Override // p153l.og60
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo1814b(ByteString byteString, C0341l c0341l) throws InvalidProtocolBufferException {
        return (MessageType) m1815c(m1818f(byteString, c0341l));
    }

    /* JADX INFO: renamed from: f */
    public MessageType m1818f(ByteString byteString, C0341l c0341l) throws InvalidProtocolBufferException {
        AbstractC0331g abstractC0331gNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeMo1660a = mo1660a(abstractC0331gNewCodedInput, c0341l);
        try {
            abstractC0331gNewCodedInput.mo2042a(0);
            return messagetypeMo1660a;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo1660a);
        }
    }
}
