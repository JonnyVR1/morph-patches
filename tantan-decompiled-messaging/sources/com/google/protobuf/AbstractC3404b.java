package com.google.protobuf;

import com.google.protobuf.InterfaceC3419q;
import p149l.i860;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3404b<MessageType extends InterfaceC3419q> implements i860<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C3410h f11568a = C3410h.m17158b();

    /* JADX INFO: renamed from: d */
    public final MessageType m17078d(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m17079e(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: e */
    public final UninitializedMessageException m17079e(MessageType messagetype) {
        return messagetype instanceof AbstractC3403a ? ((AbstractC3403a) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // p149l.i860
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public MessageType mo17077b(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) mo17076a(byteString, f11568a);
    }

    @Override // p149l.i860
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo17076a(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MessageType) m17078d(m17082h(byteString, c3410h));
    }

    /* JADX INFO: renamed from: h */
    public MessageType m17082h(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        C3407e c3407eNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeMo17010c = mo17010c(c3407eNewCodedInput, c3410h);
        try {
            c3407eNewCodedInput.m17128a(0);
            return messagetypeMo17010c;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo17010c);
        }
    }
}
