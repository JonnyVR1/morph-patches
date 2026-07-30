package com.p051p1.mobile.longlink.msg.connector;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkPushContentMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage$1 */
    public static /* synthetic */ class C45571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16656xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16656xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16656xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface PushMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getReqId();

        ByteString getReqIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkPushContentMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class PushMessage extends GeneratedMessageLite<PushMessage, Builder> implements PushMessageOrBuilder {
        private static final PushMessage DEFAULT_INSTANCE;
        private static volatile ng60<PushMessage> PARSER = null;
        public static final int REQID_FIELD_NUMBER = 1;
        private String reqId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PushMessage, Builder> implements PushMessageOrBuilder {
            private Builder() {
                super(PushMessage.DEFAULT_INSTANCE);
            }

            public Builder clearReqId() {
                copyOnWrite();
                ((PushMessage) this.instance).clearReqId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
            public String getReqId() {
                return ((PushMessage) this.instance).getReqId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
            public ByteString getReqIdBytes() {
                return ((PushMessage) this.instance).getReqIdBytes();
            }

            public Builder setReqId(String str) {
                copyOnWrite();
                ((PushMessage) this.instance).setReqId(str);
                return this;
            }

            public Builder setReqIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PushMessage) this.instance).setReqIdBytes(byteString);
                return this;
            }
        }

        static {
            PushMessage pushMessage = new PushMessage();
            DEFAULT_INSTANCE = pushMessage;
            pushMessage.makeImmutable();
        }

        private PushMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReqId() {
            this.reqId_ = getDefaultInstance().getReqId();
        }

        public static PushMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PushMessage pushMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pushMessage);
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PushMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReqId(String str) {
            str.getClass();
            this.reqId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReqIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.reqId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45571.f16656xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PushMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    PushMessage pushMessage = (PushMessage) obj2;
                    this.reqId_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.reqId_.isEmpty(), this.reqId_, true ^ pushMessage.reqId_.isEmpty(), pushMessage.reqId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.reqId_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (PushMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
        public String getReqId() {
            return this.reqId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
        public ByteString getReqIdBytes() {
            return ByteString.copyFromUtf8(this.reqId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.reqId_.isEmpty() ? CodedOutputStream.m16956K(1, getReqId()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.reqId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getReqId());
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PushMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PushMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PushMessage parseFrom(InputStream inputStream) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PushMessage parseFrom(C3430e c3430e) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PushMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
