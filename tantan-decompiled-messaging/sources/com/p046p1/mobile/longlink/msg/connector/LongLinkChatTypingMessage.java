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
public final class LongLinkChatTypingMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage$1 */
    public static /* synthetic */ class C43951 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15928xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15928xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15928xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ChatTypingOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkChatTypingMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class ChatTyping extends GeneratedMessageLite<ChatTyping, Builder> implements ChatTypingOrBuilder {
        private static final ChatTyping DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<ChatTyping> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<ChatTyping, Builder> implements ChatTypingOrBuilder {
            private Builder() {
                super(ChatTyping.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((ChatTyping) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((ChatTyping) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public String getOtherUserId() {
                return ((ChatTyping) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((ChatTyping) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public String getUserId() {
                return ((ChatTyping) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
            public ByteString getUserIdBytes() {
                return ((ChatTyping) this.instance).getUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((ChatTyping) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatTyping) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((ChatTyping) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatTyping) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatTyping);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C43951.f15928xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatTyping();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    ChatTyping chatTyping = (ChatTyping) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !chatTyping.userId_.isEmpty(), chatTyping.userId_);
                    this.otherUserId_ = interfaceC3386h.mo16997f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ chatTyping.otherUserId_.isEmpty(), chatTyping.otherUserId_);
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
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.otherUserId_ = c3407e.m17115L();
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
                        synchronized (ChatTyping.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOtherUserId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage.ChatTypingOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getOtherUserId());
        }

        public static ChatTyping parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatTyping parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static ChatTyping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatTyping parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static ChatTyping parseFrom(InputStream inputStream) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatTyping parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatTyping parseFrom(C3407e c3407e) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatTyping parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (ChatTyping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
