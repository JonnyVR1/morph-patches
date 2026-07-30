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
public final class LongLinkChatServiceMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage$1 */
    public static /* synthetic */ class C03061 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1626xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1626xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1626xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface OtherUserReadSocketMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getReadUntilId();

        ByteString getReadUntilIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkChatServiceMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class OtherUserReadSocketMessage extends GeneratedMessageLite<OtherUserReadSocketMessage, Builder> implements OtherUserReadSocketMessageOrBuilder {
        private static final OtherUserReadSocketMessage DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<OtherUserReadSocketMessage> PARSER = null;
        public static final int READUNTILID_FIELD_NUMBER = 2;
        private String otherUserId_ = "";
        private String readUntilId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<OtherUserReadSocketMessage, Builder> implements OtherUserReadSocketMessageOrBuilder {
            private Builder() {
                super(OtherUserReadSocketMessage.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearReadUntilId() {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).clearReadUntilId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public String getOtherUserId() {
                return ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public String getReadUntilId() {
                return ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).getReadUntilId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public ByteString getReadUntilIdBytes() {
                return ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).getReadUntilIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setReadUntilId(String str) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).setReadUntilId(str);
                return this;
            }

            public Builder setReadUntilIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) ((GeneratedMessageLite.b) this).instance).setReadUntilIdBytes(byteString);
                return this;
            }
        }

        static {
            OtherUserReadSocketMessage otherUserReadSocketMessage = new OtherUserReadSocketMessage();
            DEFAULT_INSTANCE = otherUserReadSocketMessage;
            otherUserReadSocketMessage.makeImmutable();
        }

        private OtherUserReadSocketMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadUntilId() {
            this.readUntilId_ = getDefaultInstance().getReadUntilId();
        }

        public static OtherUserReadSocketMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(OtherUserReadSocketMessage otherUserReadSocketMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(otherUserReadSocketMessage);
        }

        public static OtherUserReadSocketMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OtherUserReadSocketMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<OtherUserReadSocketMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadUntilId(String str) {
            str.getClass();
            this.readUntilId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadUntilIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.readUntilId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03061.f1626xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OtherUserReadSocketMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    OtherUserReadSocketMessage otherUserReadSocketMessage = (OtherUserReadSocketMessage) obj2;
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, !otherUserReadSocketMessage.otherUserId_.isEmpty(), otherUserReadSocketMessage.otherUserId_);
                    this.readUntilId_ = hVar.f(!this.readUntilId_.isEmpty(), this.readUntilId_, true ^ otherUserReadSocketMessage.readUntilId_.isEmpty(), otherUserReadSocketMessage.readUntilId_);
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
                                    this.otherUserId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.readUntilId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (OtherUserReadSocketMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
        public String getReadUntilId() {
            return this.readUntilId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
        public ByteString getReadUntilIdBytes() {
            return ByteString.copyFromUtf8(this.readUntilId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.otherUserId_.isEmpty() ? CodedOutputStream.K(1, getOtherUserId()) : 0;
            if (!this.readUntilId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getReadUntilId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.D0(1, getOtherUserId());
            }
            if (this.readUntilId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getReadUntilId());
        }

        public static OtherUserReadSocketMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OtherUserReadSocketMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static OtherUserReadSocketMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OtherUserReadSocketMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static OtherUserReadSocketMessage parseFrom(InputStream inputStream) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OtherUserReadSocketMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static OtherUserReadSocketMessage parseFrom(e eVar) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static OtherUserReadSocketMessage parseFrom(e eVar, h hVar) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
