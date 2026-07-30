package com.p003p1.mobile.longlink.msg.liveredpacket;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkRedPacketMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage$1 */
    public static /* synthetic */ class C03681 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1663xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1663xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1663xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface JoinLotteryGiftRedPacketMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkRedPacketMessage() {
    }

    public static void registerAllExtensions(h hVar) {
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
                this.template_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(joinLotteryGiftRedPacketMsg);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = (Template.TemplateData) builder.build();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03681.f1663xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JoinLotteryGiftRedPacketMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg = (JoinLotteryGiftRedPacketMsg) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !joinLotteryGiftRedPacketMsg.userId_.isEmpty(), joinLotteryGiftRedPacketMsg.userId_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !joinLotteryGiftRedPacketMsg.userName_.isEmpty(), joinLotteryGiftRedPacketMsg.userName_);
                    this.jumpScheme_ = hVar.f(!this.jumpScheme_.isEmpty(), this.jumpScheme_, !joinLotteryGiftRedPacketMsg.jumpScheme_.isEmpty(), joinLotteryGiftRedPacketMsg.jumpScheme_);
                    boolean z = this.isAggregate_;
                    boolean z2 = joinLotteryGiftRedPacketMsg.isAggregate_;
                    this.isAggregate_ = hVar.d(z, z, z2, z2);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ joinLotteryGiftRedPacketMsg.roomId_.isEmpty(), joinLotteryGiftRedPacketMsg.roomId_);
                    this.template_ = hVar.o(this.template_, joinLotteryGiftRedPacketMsg.template_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userName_ = eVar.L();
                                } else if (iM == 26) {
                                    this.jumpScheme_ = eVar.L();
                                } else if (iM == 32) {
                                    this.isAggregate_ = eVar.m();
                                } else if (iM == 42) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 50) {
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (Template.TemplateData) builder.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (JoinLotteryGiftRedPacketMsg.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserName());
            }
            if (!this.jumpScheme_.isEmpty()) {
                iK += CodedOutputStream.K(3, getJumpScheme());
            }
            boolean z = this.isAggregate_;
            if (z) {
                iK += CodedOutputStream.f(4, z);
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(5, getRoomId());
            }
            if (this.template_ != null) {
                iK += CodedOutputStream.C(6, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(2, getUserName());
            }
            if (!this.jumpScheme_.isEmpty()) {
                codedOutputStream.D0(3, getJumpScheme());
            }
            boolean z = this.isAggregate_;
            if (z) {
                codedOutputStream.a0(4, z);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(5, getRoomId());
            }
            if (this.template_ != null) {
                codedOutputStream.w0(6, getTemplate());
            }
        }

        public static JoinLotteryGiftRedPacketMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<JoinLotteryGiftRedPacketMsg, Builder> implements JoinLotteryGiftRedPacketMsgOrBuilder {
            private Builder() {
                super(JoinLotteryGiftRedPacketMsg.DEFAULT_INSTANCE);
            }

            public Builder clearIsAggregate() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearIsAggregate();
                return this;
            }

            public Builder clearJumpScheme() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearJumpScheme();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public boolean getIsAggregate() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getIsAggregate();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getJumpScheme() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getJumpScheme();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getJumpSchemeBytes() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getJumpSchemeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getRoomId() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getRoomIdBytes() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public Template.TemplateData getTemplate() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getUserId() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public String getUserName() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public ByteString getUserNameBytes() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsgOrBuilder
            public boolean hasTemplate() {
                return ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setIsAggregate(boolean z) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setIsAggregate(z);
                return this;
            }

            public Builder setJumpScheme(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setJumpScheme(str);
                return this;
            }

            public Builder setJumpSchemeBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setJumpSchemeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((JoinLotteryGiftRedPacketMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(InputStream inputStream) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(e eVar) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static JoinLotteryGiftRedPacketMsg parseFrom(e eVar, h hVar) throws IOException {
            return (JoinLotteryGiftRedPacketMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
