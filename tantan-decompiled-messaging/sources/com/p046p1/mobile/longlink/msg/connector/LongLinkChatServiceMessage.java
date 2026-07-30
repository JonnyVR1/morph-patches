package com.p046p1.mobile.longlink.msg.connector;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkChatServiceMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage$1 */
    public static /* synthetic */ class C43941 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15927xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15927xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15927xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface OtherUserReadSocketMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getReadUntilId();

        ByteString getReadUntilIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkChatServiceMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class OtherUserReadSocketMessage extends GeneratedMessageLite<OtherUserReadSocketMessage, Builder> implements OtherUserReadSocketMessageOrBuilder {
        private static final OtherUserReadSocketMessage DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<OtherUserReadSocketMessage> PARSER = null;
        public static final int READUNTILID_FIELD_NUMBER = 2;
        private String otherUserId_ = "";
        private String readUntilId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<OtherUserReadSocketMessage, Builder> implements OtherUserReadSocketMessageOrBuilder {
            private Builder() {
                super(OtherUserReadSocketMessage.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearReadUntilId() {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).clearReadUntilId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public String getOtherUserId() {
                return ((OtherUserReadSocketMessage) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((OtherUserReadSocketMessage) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public String getReadUntilId() {
                return ((OtherUserReadSocketMessage) this.instance).getReadUntilId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage.OtherUserReadSocketMessageOrBuilder
            public ByteString getReadUntilIdBytes() {
                return ((OtherUserReadSocketMessage) this.instance).getReadUntilIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setReadUntilId(String str) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).setReadUntilId(str);
                return this;
            }

            public Builder setReadUntilIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OtherUserReadSocketMessage) this.instance).setReadUntilIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(otherUserReadSocketMessage);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.readUntilId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C43941.f15927xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OtherUserReadSocketMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    OtherUserReadSocketMessage otherUserReadSocketMessage = (OtherUserReadSocketMessage) obj2;
                    this.otherUserId_ = interfaceC3386h.mo16997f(!this.otherUserId_.isEmpty(), this.otherUserId_, !otherUserReadSocketMessage.otherUserId_.isEmpty(), otherUserReadSocketMessage.otherUserId_);
                    this.readUntilId_ = interfaceC3386h.mo16997f(!this.readUntilId_.isEmpty(), this.readUntilId_, true ^ otherUserReadSocketMessage.readUntilId_.isEmpty(), otherUserReadSocketMessage.readUntilId_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.otherUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.readUntilId_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.otherUserId_.isEmpty() ? CodedOutputStream.m16901K(1, getOtherUserId()) : 0;
            if (!this.readUntilId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getReadUntilId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getOtherUserId());
            }
            if (this.readUntilId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getReadUntilId());
        }

        public static OtherUserReadSocketMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static OtherUserReadSocketMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static OtherUserReadSocketMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OtherUserReadSocketMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static OtherUserReadSocketMessage parseFrom(InputStream inputStream) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OtherUserReadSocketMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static OtherUserReadSocketMessage parseFrom(C3407e c3407e) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OtherUserReadSocketMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (OtherUserReadSocketMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
