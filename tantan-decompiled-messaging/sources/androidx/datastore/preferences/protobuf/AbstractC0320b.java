package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC0321b0;
import p149l.j860;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0320b<MessageType extends InterfaceC0321b0> implements j860<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C0340l f1599a = C0340l.m2226b();

    /* JADX INFO: renamed from: c */
    public final MessageType m1814c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m1815d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: d */
    public final UninitializedMessageException m1815d(MessageType messagetype) {
        return messagetype instanceof AbstractC0318a ? ((AbstractC0318a) messagetype).m1793f() : new UninitializedMessageException(messagetype);
    }

    @Override // p149l.j860
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo1813b(ByteString byteString, C0340l c0340l) throws InvalidProtocolBufferException {
        return (MessageType) m1814c(m1817f(byteString, c0340l));
    }

    /* JADX INFO: renamed from: f */
    public MessageType m1817f(ByteString byteString, C0340l c0340l) throws InvalidProtocolBufferException {
        AbstractC0330g abstractC0330gNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeMo1659a = mo1659a(abstractC0330gNewCodedInput, c0340l);
        try {
            abstractC0330gNewCodedInput.mo2041a(0);
            return messagetypeMo1659a;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo1659a);
        }
    }
}
