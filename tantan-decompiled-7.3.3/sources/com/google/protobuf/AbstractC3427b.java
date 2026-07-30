package com.google.protobuf;

import com.google.protobuf.InterfaceC3442q;
import p153l.ng60;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3427b<MessageType extends InterfaceC3442q> implements ng60<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C3433h f11605a = C3433h.m17213b();

    /* JADX INFO: renamed from: d */
    public final MessageType m17133d(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m17134e(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* JADX INFO: renamed from: e */
    public final UninitializedMessageException m17134e(MessageType messagetype) {
        return messagetype instanceof AbstractC3426a ? ((AbstractC3426a) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // p153l.ng60
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public MessageType mo17132b(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) mo17131a(byteString, f11605a);
    }

    @Override // p153l.ng60
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo17131a(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MessageType) m17133d(m17137h(byteString, c3433h));
    }

    /* JADX INFO: renamed from: h */
    public MessageType m17137h(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        C3430e c3430eNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeMo17065c = mo17065c(c3430eNewCodedInput, c3433h);
        try {
            c3430eNewCodedInput.m17183a(0);
            return messagetypeMo17065c;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeMo17065c);
        }
    }
}
