package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.template.Template;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class voiceTemplateMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg$1 */
    public static /* synthetic */ class C04551 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1693xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1693xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1693xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceTemplateMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        userMaskConfig.UserMask getSenderMask();

        Template.TemplateData getTemplateData();

        boolean hasSenderMask();

        boolean hasTemplateData();

        /* synthetic */ boolean isInitialized();
    }

    private voiceTemplateMsg() {
    }

    public static void registerAllExtensions(h hVar) {
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
                this.senderMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.senderMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplateData(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.templateData_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.templateData_ = templateData;
            } else {
                this.templateData_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.templateData_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceTemplateMsg voiceTemplateMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceTemplateMsg);
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
            this.senderMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = (Template.TemplateData) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04551.f1693xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceTemplateMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceTemplateMsg voiceTemplateMsg = (VoiceTemplateMsg) obj2;
                    this.templateData_ = hVar.o(this.templateData_, voiceTemplateMsg.templateData_);
                    this.senderMask_ = hVar.o(this.senderMask_, voiceTemplateMsg.senderMask_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.templateData_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.templateData_ = (Template.TemplateData) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    userMaskConfig.UserMask userMask = this.senderMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.senderMask_ = userMaskW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMaskW);
                                        this.senderMask_ = (userMaskConfig.UserMask) builder2.buildPartial();
                                    }
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
                        synchronized (VoiceTemplateMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
        public userMaskConfig.UserMask getSenderMask() {
            userMaskConfig.UserMask userMask = this.senderMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.templateData_ != null ? CodedOutputStream.C(1, getTemplateData()) : 0;
            if (this.senderMask_ != null) {
                iC += CodedOutputStream.C(2, getSenderMask());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.templateData_ != null) {
                codedOutputStream.w0(1, getTemplateData());
            }
            if (this.senderMask_ != null) {
                codedOutputStream.w0(2, getSenderMask());
            }
        }

        public static VoiceTemplateMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceTemplateMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<VoiceTemplateMsg, Builder> implements VoiceTemplateMsgOrBuilder {
            private Builder() {
                super(VoiceTemplateMsg.DEFAULT_INSTANCE);
            }

            public Builder clearSenderMask() {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).clearSenderMask();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).clearTemplateData();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public userMaskConfig.UserMask getSenderMask() {
                return ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).getSenderMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public boolean hasSenderMask() {
                return ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).hasSenderMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg.VoiceTemplateMsgOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).hasTemplateData();
            }

            public Builder mergeSenderMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).mergeSenderMask(userMask);
                return this;
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setSenderMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).setSenderMask(userMask);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).setTemplateData(templateData);
                return this;
            }

            public Builder setSenderMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).setSenderMask(builder);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceTemplateMsg) ((GeneratedMessageLite.b) this).instance).setTemplateData(builder);
                return this;
            }
        }

        public static VoiceTemplateMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceTemplateMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceTemplateMsg parseFrom(InputStream inputStream) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceTemplateMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceTemplateMsg parseFrom(e eVar) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceTemplateMsg parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceTemplateMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
