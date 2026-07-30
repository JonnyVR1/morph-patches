package com.p046p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkLiveConfession {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession$1 */
    public static /* synthetic */ class C44801 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15970xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15970xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15970xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface JumpSendMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        Template.TemplateData getTemplateData();

        String getToUserId();

        ByteString getToUserIdBytes();

        boolean hasTemplateData();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveConfession() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
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

        public static i860<JumpSendMessage> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44801.f15970xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JumpSendMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    JumpSendMessage jumpSendMessage = (JumpSendMessage) obj2;
                    this.toUserId_ = interfaceC3386h.mo16997f(!this.toUserId_.isEmpty(), this.toUserId_, true ^ jumpSendMessage.toUserId_.isEmpty(), jumpSendMessage.toUserId_);
                    this.templateData_ = (Template.TemplateData) interfaceC3386h.mo17006o(this.templateData_, jumpSendMessage.templateData_);
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
                                    this.toUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3407e.m17143w(Template.TemplateData.parser(), c3410h);
                                    this.templateData_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.templateData_ = builder.buildPartial();
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
                        synchronized (JumpSendMessage.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.toUserId_.isEmpty() ? CodedOutputStream.m16901K(1, getToUserId()) : 0;
            if (this.templateData_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getTemplateData());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getToUserId());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo16974w0(2, getTemplateData());
            }
        }

        public static JumpSendMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static JumpSendMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<JumpSendMessage, Builder> implements JumpSendMessageOrBuilder {
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

        public static JumpSendMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpSendMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static JumpSendMessage parseFrom(C3407e c3407e) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static JumpSendMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (JumpSendMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
