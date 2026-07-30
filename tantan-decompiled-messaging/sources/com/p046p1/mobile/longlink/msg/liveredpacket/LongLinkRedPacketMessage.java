package com.p046p1.mobile.longlink.msg.liveredpacket;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkRedPacketMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage$1 */
    public static /* synthetic */ class C44561 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15964xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15964xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface JoinLotteryGiftRedPacketMsgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getIsAggregate();

        String getJumpScheme();

        ByteString getJumpSchemeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        Template.TemplateData getTemplate();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasTemplate();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkRedPacketMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class JoinLotteryGiftRedPacketMsg extends GeneratedMessageLite<JoinLotteryGiftRedPacketMsg, Builder> implements JoinLotteryGiftRedPacketMsgOrBuilder {
        private static final JoinLotteryGiftRedPacketMsg DEFAULT_INSTANCE;
        public static final int ISAGGREGATE_FIELD_NUMBER = 4;
        public static final int JUMPSCHEME_FIELD_NUMBER = 3;
        private static volatile i860<JoinLotteryGiftRedPacketMsg> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int TEMPLATE_FIELD_NUMBER = 6;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private boolean isAggregate_;
        private Template.TemplateData template_;
        private String userId_ = "";
        private String userName_ = "";
        private String jumpScheme_ = "";
        private String roomId_ = "";

        static {
            JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg = new JoinLotteryGiftRedPacketMsg();
            DEFAULT_INSTANCE = joinLotteryGiftRedPacketMsg;
            joinLotteryGiftRedPacketMsg.makeImmutable();
        }

        private JoinLotteryGiftRedPacketMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAggregate() {
            this.isAggregate_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpScheme() {
            this.jumpScheme_ = getDefaultInstance().getJumpScheme();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static JoinLotteryGiftRedPacketMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(joinLotteryGiftRedPacketMsg);
        }

        public static JoinLotteryGiftRedPacketMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<JoinLotteryGiftRedPacketMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAggregate(boolean z) {
            this.isAggregate_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpScheme(String str) {
            str.getClass();
            this.jumpScheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.jumpScheme_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44561.f15964xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JoinLotteryGiftRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg = (JoinLotteryGiftRedPacketMsg) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !joinLotteryGiftRedPacketMsg.userId_.isEmpty(), joinLotteryGiftRedPacketMsg.userId_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !joinLotteryGiftRedPacketMsg.userName_.isEmpty(), joinLotteryGiftRedPacketMsg.userName_);
                    this.jumpScheme_ = interfaceC3386h.mo16997f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, !joinLotteryGiftRedPacketMsg.jumpScheme_.isEmpty(), joinLotteryGiftRedPacketMsg.jumpScheme_);
                    boolean z = this.isAggregate_;
                    boolean z2 = joinLotteryGiftRedPacketMsg.isAggregate_;
                    this.isAggregate_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, true ^ joinLotteryGiftRedPacketMsg.roomId_.isEmpty(), joinLotteryGiftRedPacketMsg.roomId_);
                    this.template_ = (Template.TemplateData) interfaceC3386h.mo17006o(this.template_, joinLotteryGiftRedPacketMsg.template_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.userName_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.jumpScheme_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.isAggregate_ = c3407e.m17133m();
                                } else if (iM17116M == 42) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3407e.m17143w(Template.TemplateData.parser(), c3410h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
                                    }
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (JoinLotteryGiftRedPacketMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public boolean getIsAggregate() {
            return this.isAggregate_;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public String getJumpScheme() {
            return this.jumpScheme_;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public ByteString getJumpSchemeBytes() {
            return ByteString.copyFromUtf8(this.jumpScheme_);
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getUserName());
            }
            if (!this.jumpScheme_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getJumpScheme());
            }
            boolean z = this.isAggregate_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(4, z);
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getRoomId());
            }
            if (this.template_ != null) {
                iM16901K += CodedOutputStream.m16893C(6, getTemplate());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getUserName());
            }
            if (!this.jumpScheme_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getJumpScheme());
            }
            boolean z = this.isAggregate_;
            if (z) {
                codedOutputStream.mo16950a0(4, z);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getRoomId());
            }
            if (this.template_ != null) {
                codedOutputStream.mo16974w0(6, getTemplate());
            }
        }

        public static JoinLotteryGiftRedPacketMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<JoinLotteryGiftRedPacketMsg, Builder> implements JoinLotteryGiftRedPacketMsgOrBuilder {
            private Builder() {
                super(JoinLotteryGiftRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearIsAggregate() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearIsAggregate();
                return this;
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearJumpScheme();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public boolean getIsAggregate() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getIsAggregate();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getJumpScheme() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getJumpSchemeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getRoomId() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getRoomIdBytes() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getUserId() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getUserName() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getUserNameBytes() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((JoinLotteryGiftRedPacketMsg) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setIsAggregate(boolean z) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setIsAggregate(z);
                return this;
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setJumpSchemeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(C3407e c3407e) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
