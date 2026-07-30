package com.p003p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkLiveConfession {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession$1 */
    public static /* synthetic */ class C03921 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1669xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1669xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1669xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface JumpSendMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Template.TemplateData getTemplateData();

        String getToUserId();

        ByteString getToUserIdBytes();

        boolean hasTemplateData();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveConfession() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class JumpSendMessage extends GeneratedMessageLite<JumpSendMessage, Builder> implements JumpSendMessageOrBuilder {
        private static final JumpSendMessage DEFAULT_INSTANCE;
        private static volatile i860<JumpSendMessage> PARSER = null;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 2;
        public static final int TOUSERID_FIELD_NUMBER = 1;
        private Template.TemplateData templateData_;
        private String toUserId_ = "";

        static {
            JumpSendMessage jumpSendMessage = new JumpSendMessage();
            DEFAULT_INSTANCE = jumpSendMessage;
            jumpSendMessage.makeImmutable();
        }

        private JumpSendMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserId() {
            this.toUserId_ = getDefaultInstance().getToUserId();
        }

        public static JumpSendMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
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

        public static Builder newBuilder(JumpSendMessage jumpSendMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(jumpSendMessage);
        }

        public static JumpSendMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpSendMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<JumpSendMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserId(String str) {
            str.getClass();
            this.toUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03921.f1669xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JumpSendMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    JumpSendMessage jumpSendMessage = (JumpSendMessage) obj2;
                    this.toUserId_ = hVar.f(!this.toUserId_.isEmpty(), this.toUserId_, true ^ jumpSendMessage.toUserId_.isEmpty(), jumpSendMessage.toUserId_);
                    this.templateData_ = hVar.o(this.templateData_, jumpSendMessage.templateData_);
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
                                    this.toUserId_ = eVar.L();
                                } else if (iM == 18) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.templateData_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.templateData_ = (Template.TemplateData) builder.buildPartial();
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
                        synchronized (JumpSendMessage.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.toUserId_.isEmpty() ? CodedOutputStream.K(1, getToUserId()) : 0;
            if (this.templateData_ != null) {
                iK += CodedOutputStream.C(2, getTemplateData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
        public String getToUserId() {
            return this.toUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
        public ByteString getToUserIdBytes() {
            return ByteString.copyFromUtf8(this.toUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.D0(1, getToUserId());
            }
            if (this.templateData_ != null) {
                codedOutputStream.w0(2, getTemplateData());
            }
        }

        public static JumpSendMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JumpSendMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<JumpSendMessage, Builder> implements JumpSendMessageOrBuilder {
            private Builder() {
                super(JumpSendMessage.DEFAULT_INSTANCE);
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).clearTemplateData();
                return this;
            }

            public Builder clearToUserId() {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).clearToUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public String getToUserId() {
                return ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).getToUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public ByteString getToUserIdBytes() {
                return ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).getToUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public boolean hasTemplateData() {
                return ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).hasTemplateData();
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).setTemplateData(templateData);
                return this;
            }

            public Builder setToUserId(String str) {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).setToUserId(str);
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).setToUserIdBytes(byteString);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((JumpSendMessage) ((GeneratedMessageLite.b) this).instance).setTemplateData(builder);
                return this;
            }
        }

        public static JumpSendMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JumpSendMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static JumpSendMessage parseFrom(e eVar) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static JumpSendMessage parseFrom(e eVar, h hVar) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
