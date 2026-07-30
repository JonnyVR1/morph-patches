package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveConfession {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession$1 */
    public static /* synthetic */ class C46311 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16689xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16689xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16689xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface JumpSendMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Template.TemplateData getTemplateData();

        String getToUserId();

        ByteString getToUserIdBytes();

        boolean hasTemplateData();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveConfession() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class JumpSendMessage extends GeneratedMessageLite<JumpSendMessage, Builder> implements JumpSendMessageOrBuilder {
        private static final JumpSendMessage DEFAULT_INSTANCE;
        private static volatile ng60<JumpSendMessage> PARSER = null;
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
                this.templateData_ = Template.TemplateData.newBuilder(this.templateData_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(JumpSendMessage jumpSendMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(jumpSendMessage);
        }

        public static JumpSendMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpSendMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<JumpSendMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserId(String str) {
            str.getClass();
            this.toUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46311.f16689xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JumpSendMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    JumpSendMessage jumpSendMessage = (JumpSendMessage) obj2;
                    this.toUserId_ = interfaceC3409h.mo17052f(!this.toUserId_.isEmpty(), this.toUserId_, true ^ jumpSendMessage.toUserId_.isEmpty(), jumpSendMessage.toUserId_);
                    this.templateData_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.templateData_, jumpSendMessage.templateData_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.toUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.templateData_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.templateData_ = builder.buildPartial();
                                    }
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.toUserId_.isEmpty() ? CodedOutputStream.m16956K(1, getToUserId()) : 0;
            if (this.templateData_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getTemplateData());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getToUserId());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo17029w0(2, getTemplateData());
            }
        }

        public static JumpSendMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static JumpSendMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<JumpSendMessage, Builder> implements JumpSendMessageOrBuilder {
            private Builder() {
                super(JumpSendMessage.DEFAULT_INSTANCE);
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((JumpSendMessage) this.instance).clearTemplateData();
                return this;
            }

            public Builder clearToUserId() {
                copyOnWrite();
                ((JumpSendMessage) this.instance).clearToUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((JumpSendMessage) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public String getToUserId() {
                return ((JumpSendMessage) this.instance).getToUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public ByteString getToUserIdBytes() {
                return ((JumpSendMessage) this.instance).getToUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession.JumpSendMessageOrBuilder
            public boolean hasTemplateData() {
                return ((JumpSendMessage) this.instance).hasTemplateData();
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((JumpSendMessage) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((JumpSendMessage) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setToUserId(String str) {
                copyOnWrite();
                ((JumpSendMessage) this.instance).setToUserId(str);
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JumpSendMessage) this.instance).setToUserIdBytes(byteString);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((JumpSendMessage) this.instance).setTemplateData(builder);
                return this;
            }
        }

        public static JumpSendMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JumpSendMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static JumpSendMessage parseFrom(C3430e c3430e) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static JumpSendMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
