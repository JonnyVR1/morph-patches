package com.p046p1.mobile.longlink.msg.connector;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3418p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;
import p149l.x9g0;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkCoreChatMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage$1 */
    public static /* synthetic */ class C43971 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15930xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15930xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15930xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ChatMsgGrpcOrBuilder extends o6z {
        boolean containsTickerI18N(String str);

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMessage();

        ByteString getMessageBytes();

        String getSenderId();

        ByteString getSenderIdBytes();

        String getTicker();

        ByteString getTickerBytes();

        @Deprecated
        Map<String, String> getTickerI18N();

        int getTickerI18NCount();

        Map<String, String> getTickerI18NMap();

        String getTickerI18NOrDefault(String str, String str2);

        String getTickerI18NOrThrow(String str);

        String getTitle();

        ByteString getTitleBytes();

        long getTs();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface ChatMsgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMessage();

        ByteString getMessageBytes();

        String getSenderId();

        ByteString getSenderIdBytes();

        String getTicker();

        ByteString getTickerBytes();

        String getTitle();

        ByteString getTitleBytes();

        long getTs();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface RevokeChatMsgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMsgId();

        ByteString getMsgIdBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkCoreChatMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class ChatMsg extends GeneratedMessageLite<ChatMsg, Builder> implements ChatMsgOrBuilder {
        private static final ChatMsg DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 5;
        private static volatile i860<ChatMsg> PARSER = null;
        public static final int SENDERID_FIELD_NUMBER = 4;
        public static final int TICKER_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TS_FIELD_NUMBER = 1;
        private long ts_;
        private String title_ = "";
        private String ticker_ = "";
        private String senderId_ = "";
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<ChatMsg, Builder> implements ChatMsgOrBuilder {
            private Builder() {
                super(ChatMsg.DEFAULT_INSTANCE);
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((ChatMsg) this.instance).clearMessage();
                return this;
            }

            public Builder clearSenderId() {
                copyOnWrite();
                ((ChatMsg) this.instance).clearSenderId();
                return this;
            }

            public Builder clearTicker() {
                copyOnWrite();
                ((ChatMsg) this.instance).clearTicker();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((ChatMsg) this.instance).clearTitle();
                return this;
            }

            public Builder clearTs() {
                copyOnWrite();
                ((ChatMsg) this.instance).clearTs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public String getMessage() {
                return ((ChatMsg) this.instance).getMessage();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public ByteString getMessageBytes() {
                return ((ChatMsg) this.instance).getMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public String getSenderId() {
                return ((ChatMsg) this.instance).getSenderId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public ByteString getSenderIdBytes() {
                return ((ChatMsg) this.instance).getSenderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public String getTicker() {
                return ((ChatMsg) this.instance).getTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public ByteString getTickerBytes() {
                return ((ChatMsg) this.instance).getTickerBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public String getTitle() {
                return ((ChatMsg) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public ByteString getTitleBytes() {
                return ((ChatMsg) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
            public long getTs() {
                return ((ChatMsg) this.instance).getTs();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((ChatMsg) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsg) this.instance).setMessageBytes(byteString);
                return this;
            }

            public Builder setSenderId(String str) {
                copyOnWrite();
                ((ChatMsg) this.instance).setSenderId(str);
                return this;
            }

            public Builder setSenderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsg) this.instance).setSenderIdBytes(byteString);
                return this;
            }

            public Builder setTicker(String str) {
                copyOnWrite();
                ((ChatMsg) this.instance).setTicker(str);
                return this;
            }

            public Builder setTickerBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsg) this.instance).setTickerBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((ChatMsg) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsg) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTs(long j) {
                copyOnWrite();
                ((ChatMsg) this.instance).setTs(j);
                return this;
            }
        }

        static {
            ChatMsg chatMsg = new ChatMsg();
            DEFAULT_INSTANCE = chatMsg;
            chatMsg.makeImmutable();
        }

        private ChatMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderId() {
            this.senderId_ = getDefaultInstance().getSenderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTicker() {
            this.ticker_ = getDefaultInstance().getTicker();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTs() {
            this.ts_ = 0L;
        }

        public static ChatMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ChatMsg chatMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatMsg);
        }

        public static ChatMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ChatMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderId(String str) {
            str.getClass();
            this.senderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.senderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicker(String str) {
            str.getClass();
            this.ticker_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTickerBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ticker_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTs(long j) {
            this.ts_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C43971.f15930xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    ChatMsg chatMsg = (ChatMsg) obj2;
                    long j = this.ts_;
                    boolean z2 = j != 0;
                    long j2 = chatMsg.ts_;
                    this.ts_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !chatMsg.title_.isEmpty(), chatMsg.title_);
                    this.ticker_ = interfaceC3386h.mo16997f(!this.ticker_.isEmpty(), this.ticker_, !chatMsg.ticker_.isEmpty(), chatMsg.ticker_);
                    this.senderId_ = interfaceC3386h.mo16997f(!this.senderId_.isEmpty(), this.senderId_, !chatMsg.senderId_.isEmpty(), chatMsg.senderId_);
                    this.message_ = interfaceC3386h.mo16997f(!this.message_.isEmpty(), this.message_, !chatMsg.message_.isEmpty(), chatMsg.message_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.ts_ = c3407e.m17142v();
                                } else if (iM17116M == 18) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.ticker_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.senderId_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.message_ = c3407e.m17115L();
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
                        synchronized (ChatMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public String getSenderId() {
            return this.senderId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public ByteString getSenderIdBytes() {
            return ByteString.copyFromUtf8(this.senderId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.ts_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            if (!this.title_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(2, getTitle());
            }
            if (!this.ticker_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getTicker());
            }
            if (!this.senderId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(4, getSenderId());
            }
            if (!this.message_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(5, getMessage());
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public String getTicker() {
            return this.ticker_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public ByteString getTickerBytes() {
            return ByteString.copyFromUtf8(this.ticker_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgOrBuilder
        public long getTs() {
            return this.ts_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.ts_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTitle());
            }
            if (!this.ticker_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getTicker());
            }
            if (!this.senderId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getSenderId());
            }
            if (this.message_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getMessage());
        }

        public static ChatMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static ChatMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static ChatMsg parseFrom(InputStream inputStream) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatMsg parseFrom(C3407e c3407e) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (ChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class ChatMsgGrpc extends GeneratedMessageLite<ChatMsgGrpc, Builder> implements ChatMsgGrpcOrBuilder {
        private static final ChatMsgGrpc DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 5;
        private static volatile i860<ChatMsgGrpc> PARSER = null;
        public static final int SENDERID_FIELD_NUMBER = 4;
        public static final int TICKERI18N_FIELD_NUMBER = 6;
        public static final int TICKER_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TS_FIELD_NUMBER = 1;
        private int bitField0_;
        private long ts_;
        private MapFieldLite<String, String> tickerI18N_ = MapFieldLite.emptyMapField();
        private String title_ = "";
        private String ticker_ = "";
        private String senderId_ = "";
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<ChatMsgGrpc, Builder> implements ChatMsgGrpcOrBuilder {
            private Builder() {
                super(ChatMsgGrpc.DEFAULT_INSTANCE);
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).clearMessage();
                return this;
            }

            public Builder clearSenderId() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).clearSenderId();
                return this;
            }

            public Builder clearTicker() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).clearTicker();
                return this;
            }

            public Builder clearTickerI18N() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).getMutableTickerI18NMap().clear();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).clearTitle();
                return this;
            }

            public Builder clearTs() {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).clearTs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public boolean containsTickerI18N(String str) {
                str.getClass();
                return ((ChatMsgGrpc) this.instance).getTickerI18NMap().containsKey(str);
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getMessage() {
                return ((ChatMsgGrpc) this.instance).getMessage();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public ByteString getMessageBytes() {
                return ((ChatMsgGrpc) this.instance).getMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getSenderId() {
                return ((ChatMsgGrpc) this.instance).getSenderId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public ByteString getSenderIdBytes() {
                return ((ChatMsgGrpc) this.instance).getSenderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getTicker() {
                return ((ChatMsgGrpc) this.instance).getTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public ByteString getTickerBytes() {
                return ((ChatMsgGrpc) this.instance).getTickerBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            @Deprecated
            public Map<String, String> getTickerI18N() {
                return getTickerI18NMap();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public int getTickerI18NCount() {
                return ((ChatMsgGrpc) this.instance).getTickerI18NMap().size();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public Map<String, String> getTickerI18NMap() {
                return Collections.unmodifiableMap(((ChatMsgGrpc) this.instance).getTickerI18NMap());
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getTickerI18NOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> tickerI18NMap = ((ChatMsgGrpc) this.instance).getTickerI18NMap();
                return tickerI18NMap.containsKey(str) ? tickerI18NMap.get(str) : str2;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getTickerI18NOrThrow(String str) {
                str.getClass();
                Map<String, String> tickerI18NMap = ((ChatMsgGrpc) this.instance).getTickerI18NMap();
                if (tickerI18NMap.containsKey(str)) {
                    return tickerI18NMap.get(str);
                }
                x9g0.m207497a();
                return null;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public String getTitle() {
                return ((ChatMsgGrpc) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public ByteString getTitleBytes() {
                return ((ChatMsgGrpc) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
            public long getTs() {
                return ((ChatMsgGrpc) this.instance).getTs();
            }

            public Builder putAllTickerI18N(Map<String, String> map) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).getMutableTickerI18NMap().putAll(map);
                return this;
            }

            public Builder putTickerI18N(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).getMutableTickerI18NMap().put(str, str2);
                return this;
            }

            public Builder removeTickerI18N(String str) {
                str.getClass();
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).getMutableTickerI18NMap().remove(str);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setMessageBytes(byteString);
                return this;
            }

            public Builder setSenderId(String str) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setSenderId(str);
                return this;
            }

            public Builder setSenderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setSenderIdBytes(byteString);
                return this;
            }

            public Builder setTicker(String str) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setTicker(str);
                return this;
            }

            public Builder setTickerBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setTickerBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTs(long j) {
                copyOnWrite();
                ((ChatMsgGrpc) this.instance).setTs(j);
                return this;
            }
        }

        public static final class TickerI18NDefaultEntryHolder {
            static final C3418p<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = C3418p.m17276c(fieldType, "", fieldType, "");
            }

            private TickerI18NDefaultEntryHolder() {
            }
        }

        static {
            ChatMsgGrpc chatMsgGrpc = new ChatMsgGrpc();
            DEFAULT_INSTANCE = chatMsgGrpc;
            chatMsgGrpc.makeImmutable();
        }

        private ChatMsgGrpc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderId() {
            this.senderId_ = getDefaultInstance().getSenderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTicker() {
            this.ticker_ = getDefaultInstance().getTicker();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTs() {
            this.ts_ = 0L;
        }

        public static ChatMsgGrpc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableTickerI18NMap() {
            return internalGetMutableTickerI18N();
        }

        private MapFieldLite<String, String> internalGetMutableTickerI18N() {
            if (!this.tickerI18N_.isMutable()) {
                this.tickerI18N_ = this.tickerI18N_.mutableCopy();
            }
            return this.tickerI18N_;
        }

        private MapFieldLite<String, String> internalGetTickerI18N() {
            return this.tickerI18N_;
        }

        public static Builder newBuilder(ChatMsgGrpc chatMsgGrpc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatMsgGrpc);
        }

        public static ChatMsgGrpc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMsgGrpc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ChatMsgGrpc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderId(String str) {
            str.getClass();
            this.senderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.senderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicker(String str) {
            str.getClass();
            this.ticker_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTickerBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.ticker_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTs(long j) {
            this.ts_ = j;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public boolean containsTickerI18N(String str) {
            str.getClass();
            return internalGetTickerI18N().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C43971.f15930xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatMsgGrpc();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.tickerI18N_.makeImmutable();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    ChatMsgGrpc chatMsgGrpc = (ChatMsgGrpc) obj2;
                    long j = this.ts_;
                    boolean z2 = j != 0;
                    long j2 = chatMsgGrpc.ts_;
                    this.ts_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !chatMsgGrpc.title_.isEmpty(), chatMsgGrpc.title_);
                    this.ticker_ = interfaceC3386h.mo16997f(!this.ticker_.isEmpty(), this.ticker_, !chatMsgGrpc.ticker_.isEmpty(), chatMsgGrpc.ticker_);
                    this.senderId_ = interfaceC3386h.mo16997f(!this.senderId_.isEmpty(), this.senderId_, !chatMsgGrpc.senderId_.isEmpty(), chatMsgGrpc.senderId_);
                    this.message_ = interfaceC3386h.mo16997f(!this.message_.isEmpty(), this.message_, !chatMsgGrpc.message_.isEmpty(), chatMsgGrpc.message_);
                    this.tickerI18N_ = interfaceC3386h.mo17003l(this.tickerI18N_, chatMsgGrpc.internalGetTickerI18N());
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= chatMsgGrpc.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.ts_ = c3407e.m17142v();
                                } else if (iM17116M == 18) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.ticker_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.senderId_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.message_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    if (!this.tickerI18N_.isMutable()) {
                                        this.tickerI18N_ = this.tickerI18N_.mutableCopy();
                                    }
                                    TickerI18NDefaultEntryHolder.defaultEntry.m17280e(this.tickerI18N_, c3407e, c3410h);
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
                        synchronized (ChatMsgGrpc.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getSenderId() {
            return this.senderId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public ByteString getSenderIdBytes() {
            return ByteString.copyFromUtf8(this.senderId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.ts_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            if (!this.title_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(2, getTitle());
            }
            if (!this.ticker_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getTicker());
            }
            if (!this.senderId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(4, getSenderId());
            }
            if (!this.message_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(5, getMessage());
            }
            for (Map.Entry<String, String> entry : internalGetTickerI18N().entrySet()) {
                iM16931v += TickerI18NDefaultEntryHolder.defaultEntry.m17279a(6, entry.getKey(), entry.getValue());
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getTicker() {
            return this.ticker_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public ByteString getTickerBytes() {
            return ByteString.copyFromUtf8(this.ticker_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        @Deprecated
        public Map<String, String> getTickerI18N() {
            return getTickerI18NMap();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public int getTickerI18NCount() {
            return internalGetTickerI18N().size();
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public Map<String, String> getTickerI18NMap() {
            return Collections.unmodifiableMap(internalGetTickerI18N());
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getTickerI18NOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetTickerI18N = internalGetTickerI18N();
            return mapFieldLiteInternalGetTickerI18N.containsKey(str) ? mapFieldLiteInternalGetTickerI18N.get(str) : str2;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getTickerI18NOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetTickerI18N = internalGetTickerI18N();
            if (mapFieldLiteInternalGetTickerI18N.containsKey(str)) {
                return mapFieldLiteInternalGetTickerI18N.get(str);
            }
            x9g0.m207497a();
            return null;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.ChatMsgGrpcOrBuilder
        public long getTs() {
            return this.ts_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.ts_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getTitle());
            }
            if (!this.ticker_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getTicker());
            }
            if (!this.senderId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getSenderId());
            }
            if (!this.message_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getMessage());
            }
            for (Map.Entry<String, String> entry : internalGetTickerI18N().entrySet()) {
                TickerI18NDefaultEntryHolder.defaultEntry.m17281f(codedOutputStream, 6, entry.getKey(), entry.getValue());
            }
        }

        public static ChatMsgGrpc parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatMsgGrpc parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static ChatMsgGrpc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatMsgGrpc parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static ChatMsgGrpc parseFrom(InputStream inputStream) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMsgGrpc parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static ChatMsgGrpc parseFrom(C3407e c3407e) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatMsgGrpc parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (ChatMsgGrpc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class RevokeChatMsg extends GeneratedMessageLite<RevokeChatMsg, Builder> implements RevokeChatMsgOrBuilder {
        private static final RevokeChatMsg DEFAULT_INSTANCE;
        public static final int MSGID_FIELD_NUMBER = 2;
        public static final int OTHERUSERID_FIELD_NUMBER = 1;
        private static volatile i860<RevokeChatMsg> PARSER;
        private String otherUserId_ = "";
        private String msgId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<RevokeChatMsg, Builder> implements RevokeChatMsgOrBuilder {
            private Builder() {
                super(RevokeChatMsg.DEFAULT_INSTANCE);
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).clearMsgId();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
            public String getMsgId() {
                return ((RevokeChatMsg) this.instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
            public ByteString getMsgIdBytes() {
                return ((RevokeChatMsg) this.instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
            public String getOtherUserId() {
                return ((RevokeChatMsg) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((RevokeChatMsg) this.instance).getOtherUserIdBytes();
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RevokeChatMsg) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            RevokeChatMsg revokeChatMsg = new RevokeChatMsg();
            DEFAULT_INSTANCE = revokeChatMsg;
            revokeChatMsg.makeImmutable();
        }

        private RevokeChatMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = getDefaultInstance().getMsgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static RevokeChatMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(RevokeChatMsg revokeChatMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(revokeChatMsg);
        }

        public static RevokeChatMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RevokeChatMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<RevokeChatMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(String str) {
            str.getClass();
            this.msgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.msgId_ = byteString.toStringUtf8();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C43971.f15930xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RevokeChatMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    RevokeChatMsg revokeChatMsg = (RevokeChatMsg) obj2;
                    this.otherUserId_ = interfaceC3386h.mo16997f(!this.otherUserId_.isEmpty(), this.otherUserId_, !revokeChatMsg.otherUserId_.isEmpty(), revokeChatMsg.otherUserId_);
                    this.msgId_ = interfaceC3386h.mo16997f(!this.msgId_.isEmpty(), this.msgId_, true ^ revokeChatMsg.msgId_.isEmpty(), revokeChatMsg.msgId_);
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
                                    this.msgId_ = c3407e.m17115L();
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
                        synchronized (RevokeChatMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
        public String getMsgId() {
            return this.msgId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
        public ByteString getMsgIdBytes() {
            return ByteString.copyFromUtf8(this.msgId_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage.RevokeChatMsgOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.otherUserId_.isEmpty() ? CodedOutputStream.m16901K(1, getOtherUserId()) : 0;
            if (!this.msgId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getMsgId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getOtherUserId());
            }
            if (this.msgId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getMsgId());
        }

        public static RevokeChatMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static RevokeChatMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static RevokeChatMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RevokeChatMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static RevokeChatMsg parseFrom(InputStream inputStream) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RevokeChatMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static RevokeChatMsg parseFrom(C3407e c3407e) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RevokeChatMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (RevokeChatMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
