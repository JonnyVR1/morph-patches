package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.template.Template;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkVoiceAuctionMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage$1 */
    public static /* synthetic */ class C46681 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16700xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16700xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16700xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface OpenAuctionGuestApplyListOrBuilder extends lfz {
        String getApplyId();

        ByteString getApplyIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Template.TemplateData getTemplateData();

        boolean hasTemplateData();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionApplyOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceLiveAuctionGuestApply getGuestApply();

        Template.TemplateData getTemplateData();

        VoiceLiveAuctionApply.Type getType();

        int getTypeValue();

        boolean hasGuestApply();

        boolean hasTemplateData();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionChangeOrBuilder extends lfz {
        long getCurrentTime();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceLiveAuctionLeaderboard getLeaderboards(int i);

        int getLeaderboardsCount();

        List<VoiceLiveAuctionLeaderboard> getLeaderboardsList();

        VoiceLiveAuctionChange.Type getType();

        int getTypeValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionCounterOrBuilder extends lfz {
        long getApplyUnreadCount();

        long getCurrentTime();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceLiveAuctionCounter.Type getUpdateType();

        int getUpdateTypeValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionGuestApplyOrBuilder extends lfz {
        String getAuctionId();

        ByteString getAuctionIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGuestUserId();

        ByteString getGuestUserIdBytes();

        String getHostUserId();

        ByteString getHostUserIdBytes();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceLiveAuctionGuestApply.ApplyState getState();

        int getStateValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionGuestInviteOrBuilder extends lfz {
        String getAuctionId();

        ByteString getAuctionIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGuestUserId();

        ByteString getGuestUserIdBytes();

        LongLinkLiveMessage.UserProfile getGuestUserProfile();

        String getHostUserId();

        ByteString getHostUserIdBytes();

        LongLinkLiveMessage.UserProfile getHostUserProfile();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        int getShowSeconds();

        LongLinkMultiCallMessage.InviteState getState();

        int getStateValue();

        boolean hasGuestUserProfile();

        boolean hasHostUserProfile();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionInviteOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getInviteId();

        ByteString getInviteIdBytes();

        String getMessage();

        ByteString getMessageBytes();

        VoiceLiveAuctionInvite.Type getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionLeaderboardOrBuilder extends lfz {
        long getAmount();

        String getAuctionId();

        ByteString getAuctionIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getRank();

        String getUserId();

        ByteString getUserIdBytes();

        LongLinkLiveMessage.UserProfile getUserProfile();

        String getVoiceLiveId();

        ByteString getVoiceLiveIdBytes();

        String getVoiceRoomId();

        ByteString getVoiceRoomIdBytes();

        boolean hasUserProfile();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveToastOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getToast();

        ByteString getToastBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceAuctionMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceLiveAuctionApply extends GeneratedMessageLite<VoiceLiveAuctionApply, Builder> implements VoiceLiveAuctionApplyOrBuilder {
        private static final VoiceLiveAuctionApply DEFAULT_INSTANCE;
        public static final int GUESTAPPLY_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLiveAuctionApply> PARSER = null;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private VoiceLiveAuctionGuestApply guestApply_;
        private Template.TemplateData templateData_;
        private int type_;

        static {
            VoiceLiveAuctionApply voiceLiveAuctionApply = new VoiceLiveAuctionApply();
            DEFAULT_INSTANCE = voiceLiveAuctionApply;
            voiceLiveAuctionApply.makeImmutable();
        }

        private VoiceLiveAuctionApply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestApply() {
            this.guestApply_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static VoiceLiveAuctionApply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGuestApply(VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply) {
            VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply2 = this.guestApply_;
            if (voiceLiveAuctionGuestApply2 == null || voiceLiveAuctionGuestApply2 == VoiceLiveAuctionGuestApply.getDefaultInstance()) {
                this.guestApply_ = voiceLiveAuctionGuestApply;
            } else {
                this.guestApply_ = VoiceLiveAuctionGuestApply.newBuilder(this.guestApply_).mergeFrom(voiceLiveAuctionGuestApply).buildPartial();
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

        public static Builder newBuilder(VoiceLiveAuctionApply voiceLiveAuctionApply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionApply);
        }

        public static VoiceLiveAuctionApply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionApply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionApply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestApply(VoiceLiveAuctionGuestApply.Builder builder) {
            this.guestApply_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionApply();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionApply voiceLiveAuctionApply = (VoiceLiveAuctionApply) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionApply.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.guestApply_ = (VoiceLiveAuctionGuestApply) interfaceC3409h.mo17061o(this.guestApply_, voiceLiveAuctionApply.guestApply_);
                    this.templateData_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.templateData_, voiceLiveAuctionApply.templateData_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply = this.guestApply_;
                                    VoiceLiveAuctionGuestApply.Builder builder = voiceLiveAuctionGuestApply != null ? voiceLiveAuctionGuestApply.toBuilder() : null;
                                    VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply2 = (VoiceLiveAuctionGuestApply) c3430e.m17198w(VoiceLiveAuctionGuestApply.parser(), c3433h);
                                    this.guestApply_ = voiceLiveAuctionGuestApply2;
                                    if (builder != null) {
                                        builder.mergeFrom(voiceLiveAuctionGuestApply2);
                                        this.guestApply_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.templateData_ = templateData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateData2);
                                        this.templateData_ = builder2.buildPartial();
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
                        synchronized (VoiceLiveAuctionApply.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public VoiceLiveAuctionGuestApply getGuestApply() {
            VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply = this.guestApply_;
            return voiceLiveAuctionGuestApply == null ? VoiceLiveAuctionGuestApply.getDefaultInstance() : voiceLiveAuctionGuestApply;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != Type.apply.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (this.guestApply_ != null) {
                iM16977m += CodedOutputStream.m16948C(2, getGuestApply());
            }
            if (this.templateData_ != null) {
                iM16977m += CodedOutputStream.m16948C(3, getTemplateData());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public boolean hasGuestApply() {
            return this.guestApply_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.apply.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (this.guestApply_ != null) {
                codedOutputStream.mo17029w0(2, getGuestApply());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo17029w0(3, getTemplateData());
            }
        }

        public enum Type implements C3437l.c {
            apply(0),
            reject(1),
            accept(2),
            UNRECOGNIZED(-1);

            public static final int accept_VALUE = 2;
            public static final int apply_VALUE = 0;
            private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApply.Type.1
                @Override // com.google.protobuf.C3437l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int reject_VALUE = 1;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return apply;
                }
                if (i == 1) {
                    return reject;
                }
                if (i != 2) {
                    return null;
                }
                return accept;
            }

            public static C3437l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveAuctionApply parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionApply parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestApply(VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply) {
            voiceLiveAuctionGuestApply.getClass();
            this.guestApply_ = voiceLiveAuctionGuestApply;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionApply, Builder> implements VoiceLiveAuctionApplyOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionApply.DEFAULT_INSTANCE);
            }

            public Builder clearGuestApply() {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).clearGuestApply();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).clearTemplateData();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public VoiceLiveAuctionGuestApply getGuestApply() {
                return ((VoiceLiveAuctionApply) this.instance).getGuestApply();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceLiveAuctionApply) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public Type getType() {
                return ((VoiceLiveAuctionApply) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveAuctionApply) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public boolean hasGuestApply() {
                return ((VoiceLiveAuctionApply) this.instance).hasGuestApply();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionApplyOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceLiveAuctionApply) this.instance).hasTemplateData();
            }

            public Builder mergeGuestApply(VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).mergeGuestApply(voiceLiveAuctionGuestApply);
                return this;
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setGuestApply(VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setGuestApply(voiceLiveAuctionGuestApply);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setGuestApply(VoiceLiveAuctionGuestApply.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setGuestApply(builder);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionApply) this.instance).setTemplateData(builder);
                return this;
            }
        }

        public static VoiceLiveAuctionApply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionApply parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionApply parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionApply parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionApply parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionApply parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveAuctionChange extends GeneratedMessageLite<VoiceLiveAuctionChange, Builder> implements VoiceLiveAuctionChangeOrBuilder {
        public static final int CURRENTTIME_FIELD_NUMBER = 3;
        private static final VoiceLiveAuctionChange DEFAULT_INSTANCE;
        public static final int LEADERBOARDS_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLiveAuctionChange> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long currentTime_;
        private C3437l.h<VoiceLiveAuctionLeaderboard> leaderboards_ = GeneratedMessageLite.emptyProtobufList();
        private int type_;

        static {
            VoiceLiveAuctionChange voiceLiveAuctionChange = new VoiceLiveAuctionChange();
            DEFAULT_INSTANCE = voiceLiveAuctionChange;
            voiceLiveAuctionChange.makeImmutable();
        }

        private VoiceLiveAuctionChange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeaderboards(Iterable<? extends VoiceLiveAuctionLeaderboard> iterable) {
            ensureLeaderboardsIsMutable();
            AbstractC3426a.addAll(iterable, this.leaderboards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(VoiceLiveAuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeaderboards() {
            this.leaderboards_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        private void ensureLeaderboardsIsMutable() {
            if (this.leaderboards_.mo17140q()) {
                return;
            }
            this.leaderboards_ = GeneratedMessageLite.mutableCopy(this.leaderboards_);
        }

        public static VoiceLiveAuctionChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionChange voiceLiveAuctionChange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionChange);
        }

        public static VoiceLiveAuctionChange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLeaderboards(int i) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaderboards(int i, VoiceLiveAuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionChange();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.leaderboards_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionChange voiceLiveAuctionChange = (VoiceLiveAuctionChange) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionChange.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.leaderboards_ = interfaceC3409h.mo17053g(this.leaderboards_, voiceLiveAuctionChange.leaderboards_);
                    long j = this.currentTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveAuctionChange.currentTime_;
                    this.currentTime_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= voiceLiveAuctionChange.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    if (!this.leaderboards_.mo17140q()) {
                                        this.leaderboards_ = GeneratedMessageLite.mutableCopy(this.leaderboards_);
                                    }
                                    this.leaderboards_.add((VoiceLiveAuctionLeaderboard) c3430e.m17198w(VoiceLiveAuctionLeaderboard.parser(), c3433h));
                                } else if (iM17171M == 24) {
                                    this.currentTime_ = c3430e.m17197v();
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
                        synchronized (VoiceLiveAuctionChange.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public VoiceLiveAuctionLeaderboard getLeaderboards(int i) {
            return this.leaderboards_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public int getLeaderboardsCount() {
            return this.leaderboards_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public List<VoiceLiveAuctionLeaderboard> getLeaderboardsList() {
            return this.leaderboards_;
        }

        public VoiceLiveAuctionLeaderboardOrBuilder getLeaderboardsOrBuilder(int i) {
            return this.leaderboards_.get(i);
        }

        public List<? extends VoiceLiveAuctionLeaderboardOrBuilder> getLeaderboardsOrBuilderList() {
            return this.leaderboards_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != Type.refreshAuction.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            for (int i2 = 0; i2 < this.leaderboards_.size(); i2++) {
                iM16977m += CodedOutputStream.m16948C(2, this.leaderboards_.get(i2));
            }
            long j = this.currentTime_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.refreshAuction.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            for (int i = 0; i < this.leaderboards_.size(); i++) {
                codedOutputStream.mo17029w0(2, this.leaderboards_.get(i));
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public enum Type implements C3437l.c {
            refreshAuction(0),
            updateRank(1),
            UNRECOGNIZED(-1);

            private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange.Type.1
                @Override // com.google.protobuf.C3437l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int refreshAuction_VALUE = 0;
            public static final int updateRank_VALUE = 1;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return refreshAuction;
                }
                if (i != 1) {
                    return null;
                }
                return updateRank;
            }

            public static C3437l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveAuctionChange parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionChange parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionChange, Builder> implements VoiceLiveAuctionChangeOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionChange.DEFAULT_INSTANCE);
            }

            public Builder addAllLeaderboards(Iterable<? extends VoiceLiveAuctionLeaderboard> iterable) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).addAllLeaderboards(iterable);
                return this;
            }

            public Builder addLeaderboards(VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).addLeaderboards(voiceLiveAuctionLeaderboard);
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearLeaderboards() {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).clearLeaderboards();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public long getCurrentTime() {
                return ((VoiceLiveAuctionChange) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public VoiceLiveAuctionLeaderboard getLeaderboards(int i) {
                return ((VoiceLiveAuctionChange) this.instance).getLeaderboards(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public int getLeaderboardsCount() {
                return ((VoiceLiveAuctionChange) this.instance).getLeaderboardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public List<VoiceLiveAuctionLeaderboard> getLeaderboardsList() {
                return Collections.unmodifiableList(((VoiceLiveAuctionChange) this.instance).getLeaderboardsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public Type getType() {
                return ((VoiceLiveAuctionChange) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionChangeOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveAuctionChange) this.instance).getTypeValue();
            }

            public Builder removeLeaderboards(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).removeLeaderboards(i);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setLeaderboards(int i, VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).setLeaderboards(i, voiceLiveAuctionLeaderboard);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).setTypeValue(i);
                return this;
            }

            public Builder addLeaderboards(int i, VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).addLeaderboards(i, voiceLiveAuctionLeaderboard);
                return this;
            }

            public Builder setLeaderboards(int i, VoiceLiveAuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).setLeaderboards(i, builder);
                return this;
            }

            public Builder addLeaderboards(VoiceLiveAuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).addLeaderboards(builder);
                return this;
            }

            public Builder addLeaderboards(int i, VoiceLiveAuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionChange) this.instance).addLeaderboards(i, builder);
                return this;
            }
        }

        public static VoiceLiveAuctionChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionChange parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionChange parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionChange parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionChange parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(int i, VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
            voiceLiveAuctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(i, voiceLiveAuctionLeaderboard);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionChange parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaderboards(int i, VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
            voiceLiveAuctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.set(i, voiceLiveAuctionLeaderboard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
            voiceLiveAuctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(voiceLiveAuctionLeaderboard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(int i, VoiceLiveAuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(i, builder.build());
        }
    }

    public static final class VoiceLiveAuctionCounter extends GeneratedMessageLite<VoiceLiveAuctionCounter, Builder> implements VoiceLiveAuctionCounterOrBuilder {
        public static final int APPLYUNREADCOUNT_FIELD_NUMBER = 3;
        public static final int CURRENTTIME_FIELD_NUMBER = 2;
        private static final VoiceLiveAuctionCounter DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLiveAuctionCounter> PARSER = null;
        public static final int UPDATETYPE_FIELD_NUMBER = 1;
        private long applyUnreadCount_;
        private long currentTime_;
        private int updateType_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionCounter, Builder> implements VoiceLiveAuctionCounterOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionCounter.DEFAULT_INSTANCE);
            }

            public Builder clearApplyUnreadCount() {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).clearApplyUnreadCount();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
            public long getApplyUnreadCount() {
                return ((VoiceLiveAuctionCounter) this.instance).getApplyUnreadCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
            public long getCurrentTime() {
                return ((VoiceLiveAuctionCounter) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
            public Type getUpdateType() {
                return ((VoiceLiveAuctionCounter) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
            public int getUpdateTypeValue() {
                return ((VoiceLiveAuctionCounter) this.instance).getUpdateTypeValue();
            }

            public Builder setApplyUnreadCount(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).setApplyUnreadCount(j);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setUpdateType(Type type) {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).setUpdateType(type);
                return this;
            }

            public Builder setUpdateTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionCounter) this.instance).setUpdateTypeValue(i);
                return this;
            }
        }

        static {
            VoiceLiveAuctionCounter voiceLiveAuctionCounter = new VoiceLiveAuctionCounter();
            DEFAULT_INSTANCE = voiceLiveAuctionCounter;
            voiceLiveAuctionCounter.makeImmutable();
        }

        private VoiceLiveAuctionCounter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyUnreadCount() {
            this.applyUnreadCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = 0;
        }

        public static VoiceLiveAuctionCounter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionCounter);
        }

        public static VoiceLiveAuctionCounter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionCounter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionCounter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyUnreadCount(long j) {
            this.applyUnreadCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(Type type) {
            type.getClass();
            this.updateType_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeValue(int i) {
            this.updateType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionCounter();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionCounter voiceLiveAuctionCounter = (VoiceLiveAuctionCounter) obj2;
                    int i = this.updateType_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionCounter.updateType_;
                    this.updateType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    long j = this.currentTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveAuctionCounter.currentTime_;
                    this.currentTime_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    boolean z4 = false;
                    long j3 = this.applyUnreadCount_;
                    if (j3 != 0) {
                        z4 = true;
                    }
                    long j4 = voiceLiveAuctionCounter.applyUnreadCount_;
                    this.applyUnreadCount_ = interfaceC3409h.mo17055i(z4, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.updateType_ = c3430e.m17191p();
                                } else if (iM17171M == 16) {
                                    this.currentTime_ = c3430e.m17197v();
                                } else if (iM17171M == 24) {
                                    this.applyUnreadCount_ = c3430e.m17197v();
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
                        synchronized (VoiceLiveAuctionCounter.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
        public long getApplyUnreadCount() {
            return this.applyUnreadCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.updateType_ != Type.updateApplyUnreadCount.getNumber() ? CodedOutputStream.m16977m(1, this.updateType_) : 0;
            long j = this.currentTime_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(2, j);
            }
            long j2 = this.applyUnreadCount_;
            if (j2 != 0) {
                iM16977m += CodedOutputStream.m16986v(3, j2);
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
        public Type getUpdateType() {
            Type typeForNumber = Type.forNumber(this.updateType_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounterOrBuilder
        public int getUpdateTypeValue() {
            return this.updateType_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.updateType_ != Type.updateApplyUnreadCount.getNumber()) {
                codedOutputStream.m17015i0(1, this.updateType_);
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            long j2 = this.applyUnreadCount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(3, j2);
            }
        }

        public enum Type implements C3437l.c {
            updateApplyUnreadCount(0),
            UNRECOGNIZED(-1);

            private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.Type.1
                @Override // com.google.protobuf.C3437l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int updateApplyUnreadCount_VALUE = 0;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i != 0) {
                    return null;
                }
                return updateApplyUnreadCount;
            }

            public static C3437l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveAuctionCounter parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionCounter parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveAuctionCounter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionCounter parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionCounter parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionCounter parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionCounter parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionCounter parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveAuctionGuestApply extends GeneratedMessageLite<VoiceLiveAuctionGuestApply, Builder> implements VoiceLiveAuctionGuestApplyOrBuilder {
        public static final int AUCTIONID_FIELD_NUMBER = 3;
        private static final VoiceLiveAuctionGuestApply DEFAULT_INSTANCE;
        public static final int GUESTUSERID_FIELD_NUMBER = 4;
        public static final int HOSTUSERID_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLiveAuctionGuestApply> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 6;
        private int state_;
        private String id_ = "";
        private String liveId_ = "";
        private String auctionId_ = "";
        private String guestUserId_ = "";
        private String hostUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionGuestApply, Builder> implements VoiceLiveAuctionGuestApplyOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionGuestApply.DEFAULT_INSTANCE);
            }

            public Builder clearAuctionId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearAuctionId();
                return this;
            }

            public Builder clearGuestUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearGuestUserId();
                return this;
            }

            public Builder clearHostUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearHostUserId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearLiveId();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).clearState();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public String getAuctionId() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getAuctionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ByteString getAuctionIdBytes() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getAuctionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public String getGuestUserId() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getGuestUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ByteString getGuestUserIdBytes() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getGuestUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public String getHostUserId() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getHostUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ByteString getHostUserIdBytes() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getHostUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public String getId() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public String getLiveId() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public ApplyState getState() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
            public int getStateValue() {
                return ((VoiceLiveAuctionGuestApply) this.instance).getStateValue();
            }

            public Builder setAuctionId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setAuctionId(str);
                return this;
            }

            public Builder setAuctionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            public Builder setGuestUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setGuestUserId(str);
                return this;
            }

            public Builder setGuestUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setGuestUserIdBytes(byteString);
                return this;
            }

            public Builder setHostUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setHostUserId(str);
                return this;
            }

            public Builder setHostUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setHostUserIdBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setState(ApplyState applyState) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setState(applyState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestApply) this.instance).setStateValue(i);
                return this;
            }
        }

        static {
            VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply = new VoiceLiveAuctionGuestApply();
            DEFAULT_INSTANCE = voiceLiveAuctionGuestApply;
            voiceLiveAuctionGuestApply.makeImmutable();
        }

        private VoiceLiveAuctionGuestApply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestUserId() {
            this.guestUserId_ = getDefaultInstance().getGuestUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostUserId() {
            this.hostUserId_ = getDefaultInstance().getHostUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static VoiceLiveAuctionGuestApply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionGuestApply);
        }

        public static VoiceLiveAuctionGuestApply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionGuestApply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserId(String str) {
            str.getClass();
            this.guestUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.guestUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserId(String str) {
            str.getClass();
            this.hostUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.hostUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(ApplyState applyState) {
            applyState.getClass();
            this.state_ = applyState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionGuestApply();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionGuestApply voiceLiveAuctionGuestApply = (VoiceLiveAuctionGuestApply) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceLiveAuctionGuestApply.id_.isEmpty(), voiceLiveAuctionGuestApply.id_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveAuctionGuestApply.liveId_.isEmpty(), voiceLiveAuctionGuestApply.liveId_);
                    this.auctionId_ = interfaceC3409h.mo17052f(!this.auctionId_.isEmpty(), this.auctionId_, !voiceLiveAuctionGuestApply.auctionId_.isEmpty(), voiceLiveAuctionGuestApply.auctionId_);
                    this.guestUserId_ = interfaceC3409h.mo17052f(!this.guestUserId_.isEmpty(), this.guestUserId_, !voiceLiveAuctionGuestApply.guestUserId_.isEmpty(), voiceLiveAuctionGuestApply.guestUserId_);
                    this.hostUserId_ = interfaceC3409h.mo17052f(!this.hostUserId_.isEmpty(), this.hostUserId_, !voiceLiveAuctionGuestApply.hostUserId_.isEmpty(), voiceLiveAuctionGuestApply.hostUserId_);
                    int i = this.state_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionGuestApply.state_;
                    this.state_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.auctionId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.guestUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.hostUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 48) {
                                    this.state_ = c3430e.m17191p();
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
                        synchronized (VoiceLiveAuctionGuestApply.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ByteString getAuctionIdBytes() {
            return ByteString.copyFromUtf8(this.auctionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public String getGuestUserId() {
            return this.guestUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ByteString getGuestUserIdBytes() {
            return ByteString.copyFromUtf8(this.guestUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public String getHostUserId() {
            return this.hostUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ByteString getHostUserIdBytes() {
            return ByteString.copyFromUtf8(this.hostUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveId());
            }
            if (!this.auctionId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAuctionId());
            }
            if (!this.guestUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getGuestUserId());
            }
            if (!this.hostUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getHostUserId());
            }
            if (this.state_ != ApplyState.applied.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(6, this.state_);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public ApplyState getState() {
            ApplyState applyStateForNumber = ApplyState.forNumber(this.state_);
            return applyStateForNumber == null ? ApplyState.UNRECOGNIZED : applyStateForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApplyOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (!this.auctionId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAuctionId());
            }
            if (!this.guestUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getGuestUserId());
            }
            if (!this.hostUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getHostUserId());
            }
            if (this.state_ != ApplyState.applied.getNumber()) {
                codedOutputStream.m17015i0(6, this.state_);
            }
        }

        public enum ApplyState implements C3437l.c {
            applied(0),
            rejected(1),
            accepted(2),
            UNRECOGNIZED(-1);

            public static final int accepted_VALUE = 2;
            public static final int applied_VALUE = 0;
            private static final C3437l.d<ApplyState> internalValueMap = new C3437l.d<ApplyState>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestApply.ApplyState.1
                @Override // com.google.protobuf.C3437l.d
                public ApplyState findValueByNumber(int i) {
                    return ApplyState.forNumber(i);
                }
            };
            public static final int rejected_VALUE = 1;
            private final int value;

            ApplyState(int i) {
                this.value = i;
            }

            public static ApplyState forNumber(int i) {
                if (i == 0) {
                    return applied;
                }
                if (i == 1) {
                    return rejected;
                }
                if (i != 2) {
                    return null;
                }
                return accepted;
            }

            public static C3437l.d<ApplyState> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ApplyState valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveAuctionGuestApply parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionGuestApply parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionGuestApply parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestApply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveAuctionInvite extends GeneratedMessageLite<VoiceLiveAuctionInvite, Builder> implements VoiceLiveAuctionInviteOrBuilder {
        private static final VoiceLiveAuctionInvite DEFAULT_INSTANCE;
        public static final int INVITEID_FIELD_NUMBER = 2;
        public static final int MESSAGE_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveAuctionInvite> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        private int type_;
        private String inviteId_ = "";
        private String userId_ = "";
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionInvite, Builder> implements VoiceLiveAuctionInviteOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionInvite.DEFAULT_INSTANCE);
            }

            public Builder clearInviteId() {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).clearInviteId();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).clearMessage();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public String getInviteId() {
                return ((VoiceLiveAuctionInvite) this.instance).getInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public ByteString getInviteIdBytes() {
                return ((VoiceLiveAuctionInvite) this.instance).getInviteIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public String getMessage() {
                return ((VoiceLiveAuctionInvite) this.instance).getMessage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public ByteString getMessageBytes() {
                return ((VoiceLiveAuctionInvite) this.instance).getMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public Type getType() {
                return ((VoiceLiveAuctionInvite) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveAuctionInvite) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public String getUserId() {
                return ((VoiceLiveAuctionInvite) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLiveAuctionInvite) this.instance).getUserIdBytes();
            }

            public Builder setInviteId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setInviteId(str);
                return this;
            }

            public Builder setInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setInviteIdBytes(byteString);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setMessageBytes(byteString);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionInvite) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveAuctionInvite voiceLiveAuctionInvite = new VoiceLiveAuctionInvite();
            DEFAULT_INSTANCE = voiceLiveAuctionInvite;
            voiceLiveAuctionInvite.makeImmutable();
        }

        private VoiceLiveAuctionInvite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInviteId() {
            this.inviteId_ = getDefaultInstance().getInviteId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceLiveAuctionInvite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionInvite);
        }

        public static VoiceLiveAuctionInvite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionInvite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionInvite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInviteId(String str) {
            str.getClass();
            this.inviteId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInviteIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.inviteId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionInvite voiceLiveAuctionInvite = (VoiceLiveAuctionInvite) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionInvite.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.inviteId_ = interfaceC3409h.mo17052f(!this.inviteId_.isEmpty(), this.inviteId_, !voiceLiveAuctionInvite.inviteId_.isEmpty(), voiceLiveAuctionInvite.inviteId_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLiveAuctionInvite.userId_.isEmpty(), voiceLiveAuctionInvite.userId_);
                    this.message_ = interfaceC3409h.mo17052f(!this.message_.isEmpty(), this.message_, !voiceLiveAuctionInvite.message_.isEmpty(), voiceLiveAuctionInvite.message_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.inviteId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.message_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveAuctionInvite.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public String getInviteId() {
            return this.inviteId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public ByteString getInviteIdBytes() {
            return ByteString.copyFromUtf8(this.inviteId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != Type.auctionInvite.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.inviteId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getInviteId());
            }
            if (!this.userId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getUserId());
            }
            if (!this.message_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(4, getMessage());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInviteOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.auctionInvite.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (!this.inviteId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getInviteId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (this.message_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getMessage());
        }

        public enum Type implements C3437l.c {
            auctionInvite(0),
            reject(1),
            accept(2),
            timeout(3),
            UNRECOGNIZED(-1);

            public static final int accept_VALUE = 2;
            public static final int auctionInvite_VALUE = 0;
            private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite.Type.1
                @Override // com.google.protobuf.C3437l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int reject_VALUE = 1;
            public static final int timeout_VALUE = 3;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return auctionInvite;
                }
                if (i == 1) {
                    return reject;
                }
                if (i == 2) {
                    return accept;
                }
                if (i != 3) {
                    return null;
                }
                return timeout;
            }

            public static C3437l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveAuctionInvite parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionInvite parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveAuctionInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionInvite parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionInvite parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionInvite parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionInvite parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionInvite parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class OpenAuctionGuestApplyList extends GeneratedMessageLite<OpenAuctionGuestApplyList, Builder> implements OpenAuctionGuestApplyListOrBuilder {
        public static final int APPLYID_FIELD_NUMBER = 1;
        private static final OpenAuctionGuestApplyList DEFAULT_INSTANCE;
        private static volatile ng60<OpenAuctionGuestApplyList> PARSER = null;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 2;
        private String applyId_ = "";
        private Template.TemplateData templateData_;

        static {
            OpenAuctionGuestApplyList openAuctionGuestApplyList = new OpenAuctionGuestApplyList();
            DEFAULT_INSTANCE = openAuctionGuestApplyList;
            openAuctionGuestApplyList.makeImmutable();
        }

        private OpenAuctionGuestApplyList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyId() {
            this.applyId_ = getDefaultInstance().getApplyId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        public static OpenAuctionGuestApplyList getDefaultInstance() {
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

        public static Builder newBuilder(OpenAuctionGuestApplyList openAuctionGuestApplyList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openAuctionGuestApplyList);
        }

        public static OpenAuctionGuestApplyList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenAuctionGuestApplyList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<OpenAuctionGuestApplyList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyId(String str) {
            str.getClass();
            this.applyId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.applyId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OpenAuctionGuestApplyList();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    OpenAuctionGuestApplyList openAuctionGuestApplyList = (OpenAuctionGuestApplyList) obj2;
                    this.applyId_ = interfaceC3409h.mo17052f(!this.applyId_.isEmpty(), this.applyId_, true ^ openAuctionGuestApplyList.applyId_.isEmpty(), openAuctionGuestApplyList.applyId_);
                    this.templateData_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.templateData_, openAuctionGuestApplyList.templateData_);
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
                                    this.applyId_ = c3430e.m17170L();
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
                        synchronized (OpenAuctionGuestApplyList.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
        public String getApplyId() {
            return this.applyId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
        public ByteString getApplyIdBytes() {
            return ByteString.copyFromUtf8(this.applyId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.applyId_.isEmpty() ? CodedOutputStream.m16956K(1, getApplyId()) : 0;
            if (this.templateData_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getTemplateData());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.applyId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getApplyId());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo17029w0(2, getTemplateData());
            }
        }

        public static OpenAuctionGuestApplyList parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OpenAuctionGuestApplyList parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<OpenAuctionGuestApplyList, Builder> implements OpenAuctionGuestApplyListOrBuilder {
            private Builder() {
                super(OpenAuctionGuestApplyList.DEFAULT_INSTANCE);
            }

            public Builder clearApplyId() {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).clearApplyId();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).clearTemplateData();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
            public String getApplyId() {
                return ((OpenAuctionGuestApplyList) this.instance).getApplyId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
            public ByteString getApplyIdBytes() {
                return ((OpenAuctionGuestApplyList) this.instance).getApplyIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((OpenAuctionGuestApplyList) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.OpenAuctionGuestApplyListOrBuilder
            public boolean hasTemplateData() {
                return ((OpenAuctionGuestApplyList) this.instance).hasTemplateData();
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder setApplyId(String str) {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).setApplyId(str);
                return this;
            }

            public Builder setApplyIdBytes(ByteString byteString) {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).setApplyIdBytes(byteString);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((OpenAuctionGuestApplyList) this.instance).setTemplateData(builder);
                return this;
            }
        }

        public static OpenAuctionGuestApplyList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpenAuctionGuestApplyList parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static OpenAuctionGuestApplyList parseFrom(InputStream inputStream) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenAuctionGuestApplyList parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static OpenAuctionGuestApplyList parseFrom(C3430e c3430e) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenAuctionGuestApplyList parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (OpenAuctionGuestApplyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveAuctionGuestInvite extends GeneratedMessageLite<VoiceLiveAuctionGuestInvite, Builder> implements VoiceLiveAuctionGuestInviteOrBuilder {
        public static final int AUCTIONID_FIELD_NUMBER = 3;
        private static final VoiceLiveAuctionGuestInvite DEFAULT_INSTANCE;
        public static final int GUESTUSERID_FIELD_NUMBER = 6;
        public static final int GUESTUSERPROFILE_FIELD_NUMBER = 7;
        public static final int HOSTUSERID_FIELD_NUMBER = 4;
        public static final int HOSTUSERPROFILE_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLiveAuctionGuestInvite> PARSER = null;
        public static final int SHOWSECONDS_FIELD_NUMBER = 8;
        public static final int STATE_FIELD_NUMBER = 9;
        private LongLinkLiveMessage.UserProfile guestUserProfile_;
        private LongLinkLiveMessage.UserProfile hostUserProfile_;
        private int showSeconds_;
        private int state_;
        private String id_ = "";
        private String liveId_ = "";
        private String auctionId_ = "";
        private String hostUserId_ = "";
        private String guestUserId_ = "";

        static {
            VoiceLiveAuctionGuestInvite voiceLiveAuctionGuestInvite = new VoiceLiveAuctionGuestInvite();
            DEFAULT_INSTANCE = voiceLiveAuctionGuestInvite;
            voiceLiveAuctionGuestInvite.makeImmutable();
        }

        private VoiceLiveAuctionGuestInvite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestUserId() {
            this.guestUserId_ = getDefaultInstance().getGuestUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestUserProfile() {
            this.guestUserProfile_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostUserId() {
            this.hostUserId_ = getDefaultInstance().getHostUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostUserProfile() {
            this.hostUserProfile_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static VoiceLiveAuctionGuestInvite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGuestUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            LongLinkLiveMessage.UserProfile userProfile2 = this.guestUserProfile_;
            if (userProfile2 == null || userProfile2 == LongLinkLiveMessage.UserProfile.getDefaultInstance()) {
                this.guestUserProfile_ = userProfile;
            } else {
                this.guestUserProfile_ = LongLinkLiveMessage.UserProfile.newBuilder(this.guestUserProfile_).mergeFrom(userProfile).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHostUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            LongLinkLiveMessage.UserProfile userProfile2 = this.hostUserProfile_;
            if (userProfile2 == null || userProfile2 == LongLinkLiveMessage.UserProfile.getDefaultInstance()) {
                this.hostUserProfile_ = userProfile;
            } else {
                this.hostUserProfile_ = LongLinkLiveMessage.UserProfile.newBuilder(this.hostUserProfile_).mergeFrom(userProfile).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveAuctionGuestInvite voiceLiveAuctionGuestInvite) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionGuestInvite);
        }

        public static VoiceLiveAuctionGuestInvite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionGuestInvite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserId(String str) {
            str.getClass();
            this.guestUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.guestUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
            this.guestUserProfile_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserId(String str) {
            str.getClass();
            this.hostUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.hostUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
            this.hostUserProfile_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(int i) {
            this.showSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(LongLinkMultiCallMessage.InviteState inviteState) {
            inviteState.getClass();
            this.state_ = inviteState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionGuestInvite();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionGuestInvite voiceLiveAuctionGuestInvite = (VoiceLiveAuctionGuestInvite) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceLiveAuctionGuestInvite.id_.isEmpty(), voiceLiveAuctionGuestInvite.id_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveAuctionGuestInvite.liveId_.isEmpty(), voiceLiveAuctionGuestInvite.liveId_);
                    this.auctionId_ = interfaceC3409h.mo17052f(!this.auctionId_.isEmpty(), this.auctionId_, !voiceLiveAuctionGuestInvite.auctionId_.isEmpty(), voiceLiveAuctionGuestInvite.auctionId_);
                    this.hostUserId_ = interfaceC3409h.mo17052f(!this.hostUserId_.isEmpty(), this.hostUserId_, !voiceLiveAuctionGuestInvite.hostUserId_.isEmpty(), voiceLiveAuctionGuestInvite.hostUserId_);
                    this.hostUserProfile_ = (LongLinkLiveMessage.UserProfile) interfaceC3409h.mo17061o(this.hostUserProfile_, voiceLiveAuctionGuestInvite.hostUserProfile_);
                    this.guestUserId_ = interfaceC3409h.mo17052f(!this.guestUserId_.isEmpty(), this.guestUserId_, !voiceLiveAuctionGuestInvite.guestUserId_.isEmpty(), voiceLiveAuctionGuestInvite.guestUserId_);
                    this.guestUserProfile_ = (LongLinkLiveMessage.UserProfile) interfaceC3409h.mo17061o(this.guestUserProfile_, voiceLiveAuctionGuestInvite.guestUserProfile_);
                    int i = this.showSeconds_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionGuestInvite.showSeconds_;
                    this.showSeconds_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    int i3 = this.state_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceLiveAuctionGuestInvite.state_;
                    this.state_ = interfaceC3409h.mo17051e(z3, i3, i4 != 0, i4);
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
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.auctionId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.hostUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    LongLinkLiveMessage.UserProfile userProfile = this.hostUserProfile_;
                                    LongLinkLiveMessage.UserProfile.Builder builder = userProfile != null ? userProfile.toBuilder() : null;
                                    LongLinkLiveMessage.UserProfile userProfile2 = (LongLinkLiveMessage.UserProfile) c3430e.m17198w(LongLinkLiveMessage.UserProfile.parser(), c3433h);
                                    this.hostUserProfile_ = userProfile2;
                                    if (builder != null) {
                                        builder.mergeFrom(userProfile2);
                                        this.hostUserProfile_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 50) {
                                    this.guestUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    LongLinkLiveMessage.UserProfile userProfile3 = this.guestUserProfile_;
                                    LongLinkLiveMessage.UserProfile.Builder builder2 = userProfile3 != null ? userProfile3.toBuilder() : null;
                                    LongLinkLiveMessage.UserProfile userProfile4 = (LongLinkLiveMessage.UserProfile) c3430e.m17198w(LongLinkLiveMessage.UserProfile.parser(), c3433h);
                                    this.guestUserProfile_ = userProfile4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userProfile4);
                                        this.guestUserProfile_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 64) {
                                    this.showSeconds_ = c3430e.m17196u();
                                } else if (iM17171M == 72) {
                                    this.state_ = c3430e.m17191p();
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
                        synchronized (VoiceLiveAuctionGuestInvite.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public ByteString getAuctionIdBytes() {
            return ByteString.copyFromUtf8(this.auctionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public String getGuestUserId() {
            return this.guestUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public ByteString getGuestUserIdBytes() {
            return ByteString.copyFromUtf8(this.guestUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public LongLinkLiveMessage.UserProfile getGuestUserProfile() {
            LongLinkLiveMessage.UserProfile userProfile = this.guestUserProfile_;
            return userProfile == null ? LongLinkLiveMessage.UserProfile.getDefaultInstance() : userProfile;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public String getHostUserId() {
            return this.hostUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public ByteString getHostUserIdBytes() {
            return ByteString.copyFromUtf8(this.hostUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public LongLinkLiveMessage.UserProfile getHostUserProfile() {
            LongLinkLiveMessage.UserProfile userProfile = this.hostUserProfile_;
            return userProfile == null ? LongLinkLiveMessage.UserProfile.getDefaultInstance() : userProfile;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveId());
            }
            if (!this.auctionId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAuctionId());
            }
            if (!this.hostUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getHostUserId());
            }
            if (this.hostUserProfile_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getHostUserProfile());
            }
            if (!this.guestUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getGuestUserId());
            }
            if (this.guestUserProfile_ != null) {
                iM16956K += CodedOutputStream.m16948C(7, getGuestUserProfile());
            }
            int i2 = this.showSeconds_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(8, i2);
            }
            if (this.state_ != LongLinkMultiCallMessage.InviteState.invited.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(9, this.state_);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public int getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public LongLinkMultiCallMessage.InviteState getState() {
            LongLinkMultiCallMessage.InviteState inviteStateForNumber = LongLinkMultiCallMessage.InviteState.forNumber(this.state_);
            return inviteStateForNumber == null ? LongLinkMultiCallMessage.InviteState.UNRECOGNIZED : inviteStateForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public boolean hasGuestUserProfile() {
            return this.guestUserProfile_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
        public boolean hasHostUserProfile() {
            return this.hostUserProfile_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (!this.auctionId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAuctionId());
            }
            if (!this.hostUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getHostUserId());
            }
            if (this.hostUserProfile_ != null) {
                codedOutputStream.mo17029w0(5, getHostUserProfile());
            }
            if (!this.guestUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getGuestUserId());
            }
            if (this.guestUserProfile_ != null) {
                codedOutputStream.mo17029w0(7, getGuestUserProfile());
            }
            int i = this.showSeconds_;
            if (i != 0) {
                codedOutputStream.mo17025s0(8, i);
            }
            if (this.state_ != LongLinkMultiCallMessage.InviteState.invited.getNumber()) {
                codedOutputStream.m17015i0(9, this.state_);
            }
        }

        public static VoiceLiveAuctionGuestInvite parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            userProfile.getClass();
            this.guestUserProfile_ = userProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            userProfile.getClass();
            this.hostUserProfile_ = userProfile;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionGuestInvite, Builder> implements VoiceLiveAuctionGuestInviteOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionGuestInvite.DEFAULT_INSTANCE);
            }

            public Builder clearAuctionId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearAuctionId();
                return this;
            }

            public Builder clearGuestUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearGuestUserId();
                return this;
            }

            public Builder clearGuestUserProfile() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearGuestUserProfile();
                return this;
            }

            public Builder clearHostUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearHostUserId();
                return this;
            }

            public Builder clearHostUserProfile() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearHostUserProfile();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearLiveId();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearShowSeconds();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).clearState();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public String getAuctionId() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getAuctionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public ByteString getAuctionIdBytes() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getAuctionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public String getGuestUserId() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getGuestUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public ByteString getGuestUserIdBytes() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getGuestUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public LongLinkLiveMessage.UserProfile getGuestUserProfile() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getGuestUserProfile();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public String getHostUserId() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getHostUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public ByteString getHostUserIdBytes() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getHostUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public LongLinkLiveMessage.UserProfile getHostUserProfile() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getHostUserProfile();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public String getId() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public String getLiveId() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public int getShowSeconds() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public LongLinkMultiCallMessage.InviteState getState() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public int getStateValue() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).getStateValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public boolean hasGuestUserProfile() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).hasGuestUserProfile();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionGuestInviteOrBuilder
            public boolean hasHostUserProfile() {
                return ((VoiceLiveAuctionGuestInvite) this.instance).hasHostUserProfile();
            }

            public Builder mergeGuestUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).mergeGuestUserProfile(userProfile);
                return this;
            }

            public Builder mergeHostUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).mergeHostUserProfile(userProfile);
                return this;
            }

            public Builder setAuctionId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setAuctionId(str);
                return this;
            }

            public Builder setAuctionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            public Builder setGuestUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setGuestUserId(str);
                return this;
            }

            public Builder setGuestUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setGuestUserIdBytes(byteString);
                return this;
            }

            public Builder setGuestUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setGuestUserProfile(userProfile);
                return this;
            }

            public Builder setHostUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setHostUserId(str);
                return this;
            }

            public Builder setHostUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setHostUserIdBytes(byteString);
                return this;
            }

            public Builder setHostUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setHostUserProfile(userProfile);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setShowSeconds(i);
                return this;
            }

            public Builder setState(LongLinkMultiCallMessage.InviteState inviteState) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setState(inviteState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setStateValue(i);
                return this;
            }

            public Builder setGuestUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setGuestUserProfile(builder);
                return this;
            }

            public Builder setHostUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionGuestInvite) this.instance).setHostUserProfile(builder);
                return this;
            }
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionGuestInvite parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionGuestInvite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveAuctionLeaderboard extends GeneratedMessageLite<VoiceLiveAuctionLeaderboard, Builder> implements VoiceLiveAuctionLeaderboardOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        public static final int AUCTIONID_FIELD_NUMBER = 2;
        private static final VoiceLiveAuctionLeaderboard DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLiveAuctionLeaderboard> PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        public static final int USERPROFILE_FIELD_NUMBER = 4;
        public static final int VOICELIVEID_FIELD_NUMBER = 7;
        public static final int VOICEROOMID_FIELD_NUMBER = 6;
        private long amount_;
        private long rank_;
        private LongLinkLiveMessage.UserProfile userProfile_;
        private String auctionId_ = "";
        private String userId_ = "";
        private String voiceRoomId_ = "";
        private String voiceLiveId_ = "";

        static {
            VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard = new VoiceLiveAuctionLeaderboard();
            DEFAULT_INSTANCE = voiceLiveAuctionLeaderboard;
            voiceLiveAuctionLeaderboard.makeImmutable();
        }

        private VoiceLiveAuctionLeaderboard() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRank() {
            this.rank_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserProfile() {
            this.userProfile_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceLiveId() {
            this.voiceLiveId_ = getDefaultInstance().getVoiceLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceRoomId() {
            this.voiceRoomId_ = getDefaultInstance().getVoiceRoomId();
        }

        public static VoiceLiveAuctionLeaderboard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            LongLinkLiveMessage.UserProfile userProfile2 = this.userProfile_;
            if (userProfile2 == null || userProfile2 == LongLinkLiveMessage.UserProfile.getDefaultInstance()) {
                this.userProfile_ = userProfile;
            } else {
                this.userProfile_ = LongLinkLiveMessage.UserProfile.newBuilder(this.userProfile_).mergeFrom(userProfile).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionLeaderboard);
        }

        public static VoiceLiveAuctionLeaderboard parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionLeaderboard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRank(long j) {
            this.rank_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
            this.userProfile_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceLiveId(String str) {
            str.getClass();
            this.voiceLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.voiceLiveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceRoomId(String str) {
            str.getClass();
            this.voiceRoomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.voiceRoomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionLeaderboard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard = (VoiceLiveAuctionLeaderboard) obj2;
                    long j = this.rank_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveAuctionLeaderboard.rank_;
                    this.rank_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.auctionId_ = interfaceC3409h.mo17052f(!this.auctionId_.isEmpty(), this.auctionId_, !voiceLiveAuctionLeaderboard.auctionId_.isEmpty(), voiceLiveAuctionLeaderboard.auctionId_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLiveAuctionLeaderboard.userId_.isEmpty(), voiceLiveAuctionLeaderboard.userId_);
                    this.userProfile_ = (LongLinkLiveMessage.UserProfile) interfaceC3409h.mo17061o(this.userProfile_, voiceLiveAuctionLeaderboard.userProfile_);
                    long j3 = this.amount_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLiveAuctionLeaderboard.amount_;
                    this.amount_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    this.voiceRoomId_ = interfaceC3409h.mo17052f(!this.voiceRoomId_.isEmpty(), this.voiceRoomId_, !voiceLiveAuctionLeaderboard.voiceRoomId_.isEmpty(), voiceLiveAuctionLeaderboard.voiceRoomId_);
                    this.voiceLiveId_ = interfaceC3409h.mo17052f(!this.voiceLiveId_.isEmpty(), this.voiceLiveId_, !voiceLiveAuctionLeaderboard.voiceLiveId_.isEmpty(), voiceLiveAuctionLeaderboard.voiceLiveId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.rank_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    this.auctionId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    LongLinkLiveMessage.UserProfile userProfile = this.userProfile_;
                                    LongLinkLiveMessage.UserProfile.Builder builder = userProfile != null ? userProfile.toBuilder() : null;
                                    LongLinkLiveMessage.UserProfile userProfile2 = (LongLinkLiveMessage.UserProfile) c3430e.m17198w(LongLinkLiveMessage.UserProfile.parser(), c3433h);
                                    this.userProfile_ = userProfile2;
                                    if (builder != null) {
                                        builder.mergeFrom(userProfile2);
                                        this.userProfile_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 40) {
                                    this.amount_ = c3430e.m17197v();
                                } else if (iM17171M == 50) {
                                    this.voiceRoomId_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.voiceLiveId_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveAuctionLeaderboard.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public ByteString getAuctionIdBytes() {
            return ByteString.copyFromUtf8(this.auctionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.rank_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            if (!this.auctionId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(2, getAuctionId());
            }
            if (!this.userId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(3, getUserId());
            }
            if (this.userProfile_ != null) {
                iM16986v += CodedOutputStream.m16948C(4, getUserProfile());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                iM16986v += CodedOutputStream.m16986v(5, j2);
            }
            if (!this.voiceRoomId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(6, getVoiceRoomId());
            }
            if (!this.voiceLiveId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(7, getVoiceLiveId());
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public LongLinkLiveMessage.UserProfile getUserProfile() {
            LongLinkLiveMessage.UserProfile userProfile = this.userProfile_;
            return userProfile == null ? LongLinkLiveMessage.UserProfile.getDefaultInstance() : userProfile;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public String getVoiceLiveId() {
            return this.voiceLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public ByteString getVoiceLiveIdBytes() {
            return ByteString.copyFromUtf8(this.voiceLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public String getVoiceRoomId() {
            return this.voiceRoomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public ByteString getVoiceRoomIdBytes() {
            return ByteString.copyFromUtf8(this.voiceRoomId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
        public boolean hasUserProfile() {
            return this.userProfile_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.rank_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            if (!this.auctionId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getAuctionId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (this.userProfile_ != null) {
                codedOutputStream.mo17029w0(4, getUserProfile());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
            if (!this.voiceRoomId_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getVoiceRoomId());
            }
            if (this.voiceLiveId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(7, getVoiceLiveId());
        }

        public static VoiceLiveAuctionLeaderboard parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
            userProfile.getClass();
            this.userProfile_ = userProfile;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionLeaderboard, Builder> implements VoiceLiveAuctionLeaderboardOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionLeaderboard.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearAmount();
                return this;
            }

            public Builder clearAuctionId() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearAuctionId();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearRank();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserProfile() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearUserProfile();
                return this;
            }

            public Builder clearVoiceLiveId() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearVoiceLiveId();
                return this;
            }

            public Builder clearVoiceRoomId() {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).clearVoiceRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public long getAmount() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public String getAuctionId() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getAuctionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public ByteString getAuctionIdBytes() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getAuctionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public long getRank() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getRank();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public String getUserId() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public LongLinkLiveMessage.UserProfile getUserProfile() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getUserProfile();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public String getVoiceLiveId() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getVoiceLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public ByteString getVoiceLiveIdBytes() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getVoiceLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public String getVoiceRoomId() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getVoiceRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public ByteString getVoiceRoomIdBytes() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).getVoiceRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboardOrBuilder
            public boolean hasUserProfile() {
                return ((VoiceLiveAuctionLeaderboard) this.instance).hasUserProfile();
            }

            public Builder mergeUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).mergeUserProfile(userProfile);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setAmount(j);
                return this;
            }

            public Builder setAuctionId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setAuctionId(str);
                return this;
            }

            public Builder setAuctionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setRank(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserProfile(LongLinkLiveMessage.UserProfile userProfile) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setUserProfile(userProfile);
                return this;
            }

            public Builder setVoiceLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setVoiceLiveId(str);
                return this;
            }

            public Builder setVoiceLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setVoiceLiveIdBytes(byteString);
                return this;
            }

            public Builder setVoiceRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setVoiceRoomId(str);
                return this;
            }

            public Builder setVoiceRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setVoiceRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserProfile(LongLinkLiveMessage.UserProfile.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionLeaderboard) this.instance).setUserProfile(builder);
                return this;
            }
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionLeaderboard parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveToast extends GeneratedMessageLite<VoiceLiveToast, Builder> implements VoiceLiveToastOrBuilder {
        private static final VoiceLiveToast DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLiveToast> PARSER = null;
        public static final int TOAST_FIELD_NUMBER = 1;
        private String toast_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveToast, Builder> implements VoiceLiveToastOrBuilder {
            private Builder() {
                super(VoiceLiveToast.DEFAULT_INSTANCE);
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceLiveToast) this.instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveToastOrBuilder
            public String getToast() {
                return ((VoiceLiveToast) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveToastOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceLiveToast) this.instance).getToastBytes();
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceLiveToast) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveToast) this.instance).setToastBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveToast voiceLiveToast = new VoiceLiveToast();
            DEFAULT_INSTANCE = voiceLiveToast;
            voiceLiveToast.makeImmutable();
        }

        private VoiceLiveToast() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        public static VoiceLiveToast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveToast voiceLiveToast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveToast);
        }

        public static VoiceLiveToast parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveToast> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46681.f16700xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveToast();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    VoiceLiveToast voiceLiveToast = (VoiceLiveToast) obj2;
                    this.toast_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.toast_.isEmpty(), this.toast_, true ^ voiceLiveToast.toast_.isEmpty(), voiceLiveToast.toast_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.toast_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveToast.class) {
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
            int iM16956K = !this.toast_.isEmpty() ? CodedOutputStream.m16956K(1, getToast()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveToastOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage.VoiceLiveToastOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getToast());
        }

        public static VoiceLiveToast parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveToast parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveToast parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveToast parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveToast parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveToast parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveToast parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
