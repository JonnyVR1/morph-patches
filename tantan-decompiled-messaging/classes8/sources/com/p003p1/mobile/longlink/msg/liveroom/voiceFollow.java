package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
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
public final class voiceFollow {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.voiceFollow$1 */
    public static /* synthetic */ class C04521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1691xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1691xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1691xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveFollowMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        LongLinkLiveMessage.UserInfo getFollower();

        VoiceLiveFollowMessage.Source getSource();

        int getSourceValue();

        Template.TemplateData getTemplateData();

        userMaskConfig.UserMask getUserMask();

        boolean hasFollower();

        boolean hasTemplateData();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    private voiceFollow() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceLiveFollowMessage extends GeneratedMessageLite<VoiceLiveFollowMessage, Builder> implements VoiceLiveFollowMessageOrBuilder {
        private static final VoiceLiveFollowMessage DEFAULT_INSTANCE;
        public static final int FOLLOWER_FIELD_NUMBER = 4;
        private static volatile i860<VoiceLiveFollowMessage> PARSER = null;
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
                this.follower_ = (LongLinkLiveMessage.UserInfo) ((LongLinkLiveMessage.UserInfo.Builder) LongLinkLiveMessage.UserInfo.newBuilder(this.follower_).mergeFrom(userInfo)).buildPartial();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.userMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.userMask_ = userMask;
            } else {
                this.userMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.userMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveFollowMessage voiceLiveFollowMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveFollowMessage);
        }

        public static VoiceLiveFollowMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveFollowMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveFollowMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFollower(LongLinkLiveMessage.UserInfo.Builder builder) {
            this.follower_ = (LongLinkLiveMessage.UserInfo) builder.build();
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
            this.templateData_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04521.f1691xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveFollowMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveFollowMessage voiceLiveFollowMessage = (VoiceLiveFollowMessage) obj2;
                    this.templateData_ = hVar.o(this.templateData_, voiceLiveFollowMessage.templateData_);
                    int i = this.source_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveFollowMessage.source_;
                    this.source_ = hVar.e(z2, i, i2 != 0, i2);
                    this.userMask_ = hVar.o(this.userMask_, voiceLiveFollowMessage.userMask_);
                    this.follower_ = hVar.o(this.follower_, voiceLiveFollowMessage.follower_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
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
                                } else if (iM == 16) {
                                    this.source_ = eVar.p();
                                } else if (iM == 26) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.userMask_ = userMaskW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder2.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    LongLinkLiveMessage.UserInfo userInfo = this.follower_;
                                    LongLinkLiveMessage.UserInfo.Builder builder3 = userInfo != null ? (LongLinkLiveMessage.UserInfo.Builder) userInfo.toBuilder() : null;
                                    LongLinkLiveMessage.UserInfo userInfoW = eVar.w(LongLinkLiveMessage.UserInfo.parser(), hVar2);
                                    this.follower_ = userInfoW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(userInfoW);
                                        this.follower_ = (LongLinkLiveMessage.UserInfo) builder3.buildPartial();
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
                        synchronized (VoiceLiveFollowMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
        public LongLinkLiveMessage.UserInfo getFollower() {
            LongLinkLiveMessage.UserInfo userInfo = this.follower_;
            return userInfo == null ? LongLinkLiveMessage.UserInfo.getDefaultInstance() : userInfo;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.templateData_ != null ? CodedOutputStream.C(1, getTemplateData()) : 0;
            if (this.source_ != Source.InRoom.getNumber()) {
                iC += CodedOutputStream.m(2, this.source_);
            }
            if (this.userMask_ != null) {
                iC += CodedOutputStream.C(3, getUserMask());
            }
            if (this.follower_ != null) {
                iC += CodedOutputStream.C(4, getFollower());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.templateData_ != null) {
                codedOutputStream.w0(1, getTemplateData());
            }
            if (this.source_ != Source.InRoom.getNumber()) {
                codedOutputStream.i0(2, this.source_);
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(3, getUserMask());
            }
            if (this.follower_ != null) {
                codedOutputStream.w0(4, getFollower());
            }
        }

        public enum Source implements l.c {
            InRoom(0),
            OnCall(1),
            SendGift(2),
            OtherFollow(3),
            UNRECOGNIZED(-1);

            public static final int InRoom_VALUE = 0;
            public static final int OnCall_VALUE = 1;
            public static final int OtherFollow_VALUE = 3;
            public static final int SendGift_VALUE = 2;
            private static final l.d<Source> internalValueMap = new l.d<Source>() { // from class: com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessage.Source.1
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

            public static l.d<Source> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Source valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveFollowMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveFollowMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveFollowMessage, Builder> implements VoiceLiveFollowMessageOrBuilder {
            private Builder() {
                super(VoiceLiveFollowMessage.DEFAULT_INSTANCE);
            }

            public Builder clearFollower() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).clearFollower();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).clearSource();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).clearTemplateData();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public LongLinkLiveMessage.UserInfo getFollower() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).getFollower();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public Source getSource() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public int getSourceValue() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).getSourceValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasFollower() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).hasFollower();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).hasTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceFollow.VoiceLiveFollowMessageOrBuilder
            public boolean hasUserMask() {
                return ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeFollower(LongLinkLiveMessage.UserInfo userInfo) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).mergeFollower(userInfo);
                return this;
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setFollower(LongLinkLiveMessage.UserInfo userInfo) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setFollower(userInfo);
                return this;
            }

            public Builder setSource(Source source) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setSource(source);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setSourceValue(i);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setTemplateData(templateData);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder setFollower(LongLinkLiveMessage.UserInfo.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setFollower(builder);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setTemplateData(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveFollowMessage) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }
        }

        public static VoiceLiveFollowMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveFollowMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveFollowMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveFollowMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveFollowMessage parseFrom(e eVar) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveFollowMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveFollowMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
