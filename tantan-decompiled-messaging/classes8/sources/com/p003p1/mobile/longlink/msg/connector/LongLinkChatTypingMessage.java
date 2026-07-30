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
public final class LongLinkChatTypingMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage$1 */
    public static /* synthetic */ class C03071 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1627xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1627xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1627xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ChatTypingOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkChatTypingMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class ChatTyping extends GeneratedMessageLite<ChatTyping, Builder> implements ChatTypingOrBuilder {
        private static final ChatTyping DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<ChatTyping> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<ChatTyping, Builder> implements ChatTypingOrBuilder {
            private Builder() {
                super(ChatTyping.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public String getOtherUserId() {
                return ((ChatTyping) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((ChatTyping) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public String getUserId() {
                return ((ChatTyping) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public ByteString getUserIdBytes() {
                return ((ChatTyping) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatTyping) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            ChatTyping chatTyping = new ChatTyping();
            DEFAULT_INSTANCE = chatTyping;
            chatTyping.makeImmutable();
        }

        private ChatTyping() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static ChatTyping getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ChatTyping chatTyping) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(chatTyping);
        }

        public static ChatTyping parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatTyping parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ChatTyping> parser() {
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
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03071.f1627xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatTyping();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ChatTyping chatTyping = (ChatTyping) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !chatTyping.userId_.isEmpty(), chatTyping.userId_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ chatTyping.otherUserId_.isEmpty(), chatTyping.otherUserId_);
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
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.otherUserId_ = eVar.L();
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
                        synchronized (ChatTyping.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOtherUserId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getOtherUserId());
        }

        public static ChatTyping parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatTyping parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static ChatTyping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatTyping parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ChatTyping parseFrom(InputStream inputStream) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatTyping parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ChatTyping parseFrom(e eVar) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatTyping parseFrom(e eVar, h hVar) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
