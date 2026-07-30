package com.p046p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class voiceTemplateMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg$1 */
    public static /* synthetic */ class C45431 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15994xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15994xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceTemplateMsgOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        userMaskConfig.UserMask getSenderMask();

        Template.TemplateData getTemplateData();

        boolean hasSenderMask();

        boolean hasTemplateData();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private voiceTemplateMsg() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceTemplateMsg extends GeneratedMessageLite<VoiceTemplateMsg, Builder> implements VoiceTemplateMsgOrBuilder {
        private static final VoiceTemplateMsg DEFAULT_INSTANCE;
        private static volatile i860<VoiceTemplateMsg> PARSER = null;
        public static final int SENDERMASK_FIELD_NUMBER = 2;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 1;
        private userMaskConfig.UserMask senderMask_;
        private Template.TemplateData templateData_;

        static {
            VoiceTemplateMsg voiceTemplateMsg = new VoiceTemplateMsg();
            DEFAULT_INSTANCE = voiceTemplateMsg;
            voiceTemplateMsg.makeImmutable();
        }

        private VoiceTemplateMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderMask() {
            this.senderMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        public static VoiceTemplateMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSenderMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.senderMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.senderMask_ = userMask;
            } else {
                this.senderMask_ = userMaskConfig.UserMask.newBuilder(this.senderMask_).mergeFrom(userMask).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplateData(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.templateData_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.templateData_ = templateData;
            } else {
                this.templateData_ = Template.TemplateData.newBuilder(this.templateData_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceTemplateMsg voiceTemplateMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceTemplateMsg);
        }

        public static VoiceTemplateMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceTemplateMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceTemplateMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderMask(userMaskConfig.UserMask.Builder builder) {
            this.senderMask_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45431.f15994xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceTemplateMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceTemplateMsg voiceTemplateMsg = (VoiceTemplateMsg) obj2;
                    this.templateData_ = (Template.TemplateData) interfaceC3386h.mo17006o(this.templateData_, voiceTemplateMsg.templateData_);
                    this.senderMask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.senderMask_, voiceTemplateMsg.senderMask_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3407e.m17143w(Template.TemplateData.parser(), c3410h);
                                    this.templateData_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.templateData_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 18) {
                                    userMaskConfig.UserMask userMask = this.senderMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                    this.senderMask_ = userMask2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask2);
                                        this.senderMask_ = builder2.buildPartial();
                                    }
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
                        synchronized (VoiceTemplateMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
        public userMaskConfig.UserMask getSenderMask() {
            userMaskConfig.UserMask userMask = this.senderMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.templateData_ != null ? CodedOutputStream.m16893C(1, getTemplateData()) : 0;
            if (this.senderMask_ != null) {
                iM16893C += CodedOutputStream.m16893C(2, getSenderMask());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
        public boolean hasSenderMask() {
            return this.senderMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.templateData_ != null) {
                codedOutputStream.mo16974w0(1, getTemplateData());
            }
            if (this.senderMask_ != null) {
                codedOutputStream.mo16974w0(2, getSenderMask());
            }
        }

        public static VoiceTemplateMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceTemplateMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.senderMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceTemplateMsg, Builder> implements VoiceTemplateMsgOrBuilder {
            private Builder() {
                super(VoiceTemplateMsg.DEFAULT_INSTANCE);
            }

            public Builder clearSenderMask() {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).clearSenderMask();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).clearTemplateData();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public userMaskConfig.UserMask getSenderMask() {
                return ((VoiceTemplateMsg) this.instance).getSenderMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceTemplateMsg) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public boolean hasSenderMask() {
                return ((VoiceTemplateMsg) this.instance).hasSenderMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceTemplateMsg) this.instance).hasTemplateData();
            }

            public Builder mergeSenderMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).mergeSenderMask(userMask);
                return this;
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setSenderMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).setSenderMask(userMask);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setSenderMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).setSenderMask(builder);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceTemplateMsg) this.instance).setTemplateData(builder);
                return this;
            }
        }

        public static VoiceTemplateMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceTemplateMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceTemplateMsg parseFrom(InputStream inputStream) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceTemplateMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceTemplateMsg parseFrom(C3407e c3407e) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceTemplateMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
