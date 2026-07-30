package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class voiceFollow {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.voiceFollow$1 */
    public static /* synthetic */ class C46911 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16711xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16711xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16711xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveFollowMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LongLinkLiveMessage.UserInfo getFollower();

        VoiceLiveFollowMessage.Source getSource();

        int getSourceValue();

        Template.TemplateData getTemplateData();

        userMaskConfig.UserMask getUserMask();

        boolean hasFollower();

        boolean hasTemplateData();

        boolean hasUserMask();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private voiceFollow() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceLiveFollowMessage extends GeneratedMessageLite<VoiceLiveFollowMessage, Builder> implements VoiceLiveFollowMessageOrBuilder {
        private static final VoiceLiveFollowMessage DEFAULT_INSTANCE;
        public static final int FOLLOWER_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveFollowMessage> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 1;
        public static final int USERMASK_FIELD_NUMBER = 3;
        private LongLinkLiveMessage.UserInfo follower_;
        private int source_;
        private Template.TemplateData templateData_;
        private userMaskConfig.UserMask userMask_;

        static {
            VoiceLiveFollowMessage voiceLiveFollowMessage = new VoiceLiveFollowMessage();
            DEFAULT_INSTANCE = voiceLiveFollowMessage;
            voiceLiveFollowMessage.makeImmutable();
        }

        private VoiceLiveFollowMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFollower() {
            this.follower_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        public static VoiceLiveFollowMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFollower(LongLinkLiveMessage.UserInfo userInfo) {
            LongLinkLiveMessage.UserInfo userInfo2 = this.follower_;
            if (userInfo2 == null || userInfo2 == LongLinkLiveMessage.UserInfo.getDefaultInstance()) {
                this.follower_ = userInfo;
            } else {
                this.follower_ = LongLinkLiveMessage.UserInfo.newBuilder(this.follower_).mergeFrom(userInfo).buildPartial();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.userMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.userMask_ = userMask;
            } else {
                this.userMask_ = userMaskConfig.UserMask.newBuilder(this.userMask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveFollowMessage voiceLiveFollowMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveFollowMessage);
        }

        public static VoiceLiveFollowMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveFollowMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveFollowMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFollower(LongLinkLiveMessage.UserInfo.Builder builder) {
            this.follower_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(Source source) {
            source.getClass();
            this.source_ = source.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46911.f16711xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveFollowMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveFollowMessage voiceLiveFollowMessage = (VoiceLiveFollowMessage) obj2;
                    this.templateData_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.templateData_, voiceLiveFollowMessage.templateData_);
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveFollowMessage.source_;
                    this.source_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.userMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.userMask_, voiceLiveFollowMessage.userMask_);
                    this.follower_ = (LongLinkLiveMessage.UserInfo) interfaceC3409h.mo17061o(this.follower_, voiceLiveFollowMessage.follower_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.templateData_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.templateData_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 16) {
                                    this.source_ = c3430e.m17191p();
                                } else if (iM17171M == 26) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.userMask_ = userMask2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask2);
                                        this.userMask_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 34) {
                                    LongLinkLiveMessage.UserInfo userInfo = this.follower_;
                                    LongLinkLiveMessage.UserInfo.Builder builder3 = userInfo != null ? userInfo.toBuilder() : null;
                                    LongLinkLiveMessage.UserInfo userInfo2 = (LongLinkLiveMessage.UserInfo) c3430e.m17198w(LongLinkLiveMessage.UserInfo.parser(), c3433h);
                                    this.follower_ = userInfo2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(userInfo2);
                                        this.follower_ = builder3.buildPartial();
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
                        synchronized (VoiceLiveFollowMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public LongLinkLiveMessage.UserInfo getFollower() {
            LongLinkLiveMessage.UserInfo userInfo = this.follower_;
            return userInfo == null ? LongLinkLiveMessage.UserInfo.getDefaultInstance() : userInfo;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.templateData_ != null ? CodedOutputStream.m16948C(1, getTemplateData()) : 0;
            if (this.source_ != Source.InRoom.getNumber()) {
                iM16948C += CodedOutputStream.m16977m(2, this.source_);
            }
            if (this.userMask_ != null) {
                iM16948C += CodedOutputStream.m16948C(3, getUserMask());
            }
            if (this.follower_ != null) {
                iM16948C += CodedOutputStream.m16948C(4, getFollower());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public Source getSource() {
            Source sourceForNumber = Source.forNumber(this.source_);
            return sourceForNumber == null ? Source.UNRECOGNIZED : sourceForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public boolean hasFollower() {
            return this.follower_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.templateData_ != null) {
                codedOutputStream.mo17029w0(1, getTemplateData());
            }
            if (this.source_ != Source.InRoom.getNumber()) {
                codedOutputStream.m17015i0(2, this.source_);
            }
            if (this.userMask_ != null) {
                codedOutputStream.mo17029w0(3, getUserMask());
            }
            if (this.follower_ != null) {
                codedOutputStream.mo17029w0(4, getFollower());
            }
        }

        public enum Source implements C3437l.c {
            InRoom(0),
            OnCall(1),
            SendGift(2),
            OtherFollow(3),
            UNRECOGNIZED(-1);

            public static final int InRoom_VALUE = 0;
            public static final int OnCall_VALUE = 1;
            public static final int OtherFollow_VALUE = 3;
            public static final int SendGift_VALUE = 2;
            private static final C3437l.d<Source> internalValueMap = new C3437l.d<Source>() { // from class: com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessage.Source.1
                @Override // com.google.protobuf.C3437l.d
                public Source findValueByNumber(int i) {
                    return Source.forNumber(i);
                }
            };
            private final int value;

            Source(int i) {
                this.value = i;
            }

            public static Source forNumber(int i) {
                if (i == 0) {
                    return InRoom;
                }
                if (i == 1) {
                    return OnCall;
                }
                if (i == 2) {
                    return SendGift;
                }
                if (i != 3) {
                    return null;
                }
                return OtherFollow;
            }

            public static C3437l.d<Source> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Source valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveFollowMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveFollowMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFollower(LongLinkLiveMessage.UserInfo userInfo) {
            userInfo.getClass();
            this.follower_ = userInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveFollowMessage, Builder> implements VoiceLiveFollowMessageOrBuilder {
            private Builder() {
                super(VoiceLiveFollowMessage.DEFAULT_INSTANCE);
            }

            public Builder clearFollower() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).clearFollower();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).clearSource();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).clearTemplateData();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public LongLinkLiveMessage.UserInfo getFollower() {
                return ((VoiceLiveFollowMessage) this.instance).getFollower();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public Source getSource() {
                return ((VoiceLiveFollowMessage) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public int getSourceValue() {
                return ((VoiceLiveFollowMessage) this.instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceLiveFollowMessage) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceLiveFollowMessage) this.instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasFollower() {
                return ((VoiceLiveFollowMessage) this.instance).hasFollower();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceLiveFollowMessage) this.instance).hasTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasUserMask() {
                return ((VoiceLiveFollowMessage) this.instance).hasUserMask();
            }

            public Builder mergeFollower(LongLinkLiveMessage.UserInfo userInfo) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).mergeFollower(userInfo);
                return this;
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setFollower(LongLinkLiveMessage.UserInfo userInfo) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setFollower(userInfo);
                return this;
            }

            public Builder setSource(Source source) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setSource(source);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setSourceValue(i);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setUserMask(userMask);
                return this;
            }

            public Builder setFollower(LongLinkLiveMessage.UserInfo.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setFollower(builder);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setTemplateData(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) this.instance).setUserMask(builder);
                return this;
            }
        }

        public static VoiceLiveFollowMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveFollowMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveFollowMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveFollowMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveFollowMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveFollowMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
