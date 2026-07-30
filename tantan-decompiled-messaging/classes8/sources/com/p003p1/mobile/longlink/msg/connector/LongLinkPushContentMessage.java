package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkPushContentMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage$1 */
    public static /* synthetic */ class C03181 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1636xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1636xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1636xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface PushMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getReqId();

        ByteString getReqIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkPushContentMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class PushMessage extends GeneratedMessageLite<PushMessage, Builder> implements PushMessageOrBuilder {
        private static final PushMessage DEFAULT_INSTANCE;
        private static volatile i860<PushMessage> PARSER = null;
        public static final int REQID_FIELD_NUMBER = 1;
        private String reqId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<PushMessage, Builder> implements PushMessageOrBuilder {
            private Builder() {
                super(PushMessage.DEFAULT_INSTANCE);
            }

            public Builder clearReqId() {
                copyOnWrite();
                ((PushMessage) ((GeneratedMessageLite.b) this).instance).clearReqId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
            public String getReqId() {
                return ((PushMessage) ((GeneratedMessageLite.b) this).instance).getReqId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage.PushMessageOrBuilder
            public ByteString getReqIdBytes() {
                return ((PushMessage) ((GeneratedMessageLite.b) this).instance).getReqIdBytes();
            }

            public Builder setReqId(String str) {
                copyOnWrite();
                ((PushMessage) ((GeneratedMessageLite.b) this).instance).setReqId(str);
                return this;
            }

            public Builder setReqIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PushMessage) ((GeneratedMessageLite.b) this).instance).setReqIdBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(pushMessage);
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PushMessage> parser() {
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
            a.checkByteStringIsUtf8(byteString);
            this.reqId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03181.f1636xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.reqId_ = ((GeneratedMessageLite.h) obj).f(!this.reqId_.isEmpty(), this.reqId_, true ^ pushMessage.reqId_.isEmpty(), pushMessage.reqId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.reqId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.reqId_.isEmpty() ? CodedOutputStream.K(1, getReqId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.reqId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getReqId());
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PushMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PushMessage parseFrom(InputStream inputStream) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PushMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PushMessage parseFrom(e eVar) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PushMessage parseFrom(e eVar, h hVar) throws IOException {
            return (PushMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
