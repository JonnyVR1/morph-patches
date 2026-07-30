package com.p046p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceSweet {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceSweet$1 */
    public static /* synthetic */ class C45351 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15989xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15989xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceCpBindMessageOrBuilder extends o6z {
        VoiceCpBindAction getAction();

        int getActionValue();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getHouseBackground();

        ByteString getHouseBackgroundBytes();

        String getHouseId();

        ByteString getHouseIdBytes();

        String getHouseImage();

        ByteString getHouseImageBytes();

        String getHouseName();

        ByteString getHouseNameBytes();

        int getHouseRank();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getOtherUserAvatar();

        ByteString getOtherUserAvatarBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getOtherUserName();

        ByteString getOtherUserNameBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserAvatar();

        ByteString getUserAvatarBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceCpHouseRewardOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getImage();

        ByteString getImageBytes();

        String getTitle();

        ByteString getTitleBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceCpHouseUpgradeMessageOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getHouseBackground();

        ByteString getHouseBackgroundBytes();

        String getHouseId();

        ByteString getHouseIdBytes();

        String getHouseImage();

        ByteString getHouseImageBytes();

        String getHouseName();

        ByteString getHouseNameBytes();

        int getHouseRank();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getOtherUserName();

        ByteString getOtherUserNameBytes();

        VoiceCpHouseReward getRewardList(int i);

        int getRewardListCount();

        List<VoiceCpHouseReward> getRewardListList();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSweetCpAnimationOrBuilder extends o6z {
        String getAnimationUrl();

        ByteString getAnimationUrlBytes();

        userMaskConfig.UserMask getCpUsers(int i);

        int getCpUsersCount();

        List<userMaskConfig.UserMask> getCpUsersList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        VoiceSweetCpHouseInfo getHouseInfo();

        VoiceSweetCpAnimation.Type getType();

        int getTypeValue();

        boolean hasHouseInfo();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSweetCpEffectOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getHorizontalCallConnectionEffectSvga();

        ByteString getHorizontalCallConnectionEffectSvgaBytes();

        boolean getOn();

        String getUserIds(int i);

        ByteString getUserIdsBytes(int i);

        int getUserIdsCount();

        List<String> getUserIdsList();

        String getVerticalCallConnectionEffectSvga();

        ByteString getVerticalCallConnectionEffectSvgaBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSweetCpHouseInfoOrBuilder extends o6z {
        String getAvatarAnimationUrl();

        ByteString getAvatarAnimationUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getHouseLevel();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceSweet() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceSweetCpAnimation extends GeneratedMessageLite<VoiceSweetCpAnimation, Builder> implements VoiceSweetCpAnimationOrBuilder {
        public static final int ANIMATIONURL_FIELD_NUMBER = 2;
        public static final int CPUSERS_FIELD_NUMBER = 3;
        private static final VoiceSweetCpAnimation DEFAULT_INSTANCE;
        public static final int HOUSEINFO_FIELD_NUMBER = 4;
        private static volatile i860<VoiceSweetCpAnimation> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private VoiceSweetCpHouseInfo houseInfo_;
        private int type_;
        private String animationUrl_ = "";
        private C3414l.h<userMaskConfig.UserMask> cpUsers_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceSweetCpAnimation voiceSweetCpAnimation = new VoiceSweetCpAnimation();
            DEFAULT_INSTANCE = voiceSweetCpAnimation;
            voiceSweetCpAnimation.makeImmutable();
        }

        private VoiceSweetCpAnimation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCpUsers(Iterable<? extends userMaskConfig.UserMask> iterable) {
            ensureCpUsersIsMutable();
            AbstractC3403a.addAll(iterable, this.cpUsers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCpUsers(userMaskConfig.UserMask.Builder builder) {
            ensureCpUsersIsMutable();
            this.cpUsers_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationUrl() {
            this.animationUrl_ = getDefaultInstance().getAnimationUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpUsers() {
            this.cpUsers_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseInfo() {
            this.houseInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        private void ensureCpUsersIsMutable() {
            if (this.cpUsers_.mo17085q()) {
                return;
            }
            this.cpUsers_ = GeneratedMessageLite.mutableCopy(this.cpUsers_);
        }

        public static VoiceSweetCpAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHouseInfo(VoiceSweetCpHouseInfo voiceSweetCpHouseInfo) {
            VoiceSweetCpHouseInfo voiceSweetCpHouseInfo2 = this.houseInfo_;
            if (voiceSweetCpHouseInfo2 == null || voiceSweetCpHouseInfo2 == VoiceSweetCpHouseInfo.getDefaultInstance()) {
                this.houseInfo_ = voiceSweetCpHouseInfo;
            } else {
                this.houseInfo_ = VoiceSweetCpHouseInfo.newBuilder(this.houseInfo_).mergeFrom(voiceSweetCpHouseInfo).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceSweetCpAnimation voiceSweetCpAnimation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSweetCpAnimation);
        }

        public static VoiceSweetCpAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSweetCpAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCpUsers(int i) {
            ensureCpUsersIsMutable();
            this.cpUsers_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrl(String str) {
            str.getClass();
            this.animationUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.animationUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpUsers(int i, userMaskConfig.UserMask.Builder builder) {
            ensureCpUsersIsMutable();
            this.cpUsers_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseInfo(VoiceSweetCpHouseInfo.Builder builder) {
            this.houseInfo_ = builder.build();
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
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSweetCpAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.cpUsers_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSweetCpAnimation voiceSweetCpAnimation = (VoiceSweetCpAnimation) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceSweetCpAnimation.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.animationUrl_ = interfaceC3386h.mo16997f(!this.animationUrl_.isEmpty(), this.animationUrl_, !voiceSweetCpAnimation.animationUrl_.isEmpty(), voiceSweetCpAnimation.animationUrl_);
                    this.cpUsers_ = interfaceC3386h.mo16998g(this.cpUsers_, voiceSweetCpAnimation.cpUsers_);
                    this.houseInfo_ = (VoiceSweetCpHouseInfo) interfaceC3386h.mo17006o(this.houseInfo_, voiceSweetCpAnimation.houseInfo_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceSweetCpAnimation.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 18) {
                                    this.animationUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    if (!this.cpUsers_.mo17085q()) {
                                        this.cpUsers_ = GeneratedMessageLite.mutableCopy(this.cpUsers_);
                                    }
                                    this.cpUsers_.add((userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h));
                                } else if (iM17116M == 34) {
                                    VoiceSweetCpHouseInfo voiceSweetCpHouseInfo = this.houseInfo_;
                                    VoiceSweetCpHouseInfo.Builder builder = voiceSweetCpHouseInfo != null ? voiceSweetCpHouseInfo.toBuilder() : null;
                                    VoiceSweetCpHouseInfo voiceSweetCpHouseInfo2 = (VoiceSweetCpHouseInfo) c3407e.m17143w(VoiceSweetCpHouseInfo.parser(), c3410h);
                                    this.houseInfo_ = voiceSweetCpHouseInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom(voiceSweetCpHouseInfo2);
                                        this.houseInfo_ = builder.buildPartial();
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
                        synchronized (VoiceSweetCpAnimation.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public String getAnimationUrl() {
            return this.animationUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public ByteString getAnimationUrlBytes() {
            return ByteString.copyFromUtf8(this.animationUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public userMaskConfig.UserMask getCpUsers(int i) {
            return this.cpUsers_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public int getCpUsersCount() {
            return this.cpUsers_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public List<userMaskConfig.UserMask> getCpUsersList() {
            return this.cpUsers_;
        }

        public userMaskConfig.UserMaskOrBuilder getCpUsersOrBuilder(int i) {
            return this.cpUsers_.get(i);
        }

        public List<? extends userMaskConfig.UserMaskOrBuilder> getCpUsersOrBuilderList() {
            return this.cpUsers_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public VoiceSweetCpHouseInfo getHouseInfo() {
            VoiceSweetCpHouseInfo voiceSweetCpHouseInfo = this.houseInfo_;
            return voiceSweetCpHouseInfo == null ? VoiceSweetCpHouseInfo.getDefaultInstance() : voiceSweetCpHouseInfo;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.type_ != Type.upgrade.getNumber() ? CodedOutputStream.m16922m(1, this.type_) : 0;
            if (!this.animationUrl_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(2, getAnimationUrl());
            }
            for (int i2 = 0; i2 < this.cpUsers_.size(); i2++) {
                iM16922m += CodedOutputStream.m16893C(3, this.cpUsers_.get(i2));
            }
            if (this.houseInfo_ != null) {
                iM16922m += CodedOutputStream.m16893C(4, getHouseInfo());
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
        public boolean hasHouseInfo() {
            return this.houseInfo_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.upgrade.getNumber()) {
                codedOutputStream.m16960i0(1, this.type_);
            }
            if (!this.animationUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getAnimationUrl());
            }
            for (int i = 0; i < this.cpUsers_.size(); i++) {
                codedOutputStream.mo16974w0(3, this.cpUsers_.get(i));
            }
            if (this.houseInfo_ != null) {
                codedOutputStream.mo16974w0(4, getHouseInfo());
            }
        }

        public enum Type implements C3414l.c {
            upgrade(0),
            UNRECOGNIZED(-1);

            private static final C3414l.d<Type> internalValueMap = new C3414l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimation.Type.1
                @Override // com.google.protobuf.C3414l.d
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int upgrade_VALUE = 0;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i != 0) {
                    return null;
                }
                return upgrade;
            }

            public static C3414l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3414l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceSweetCpAnimation parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpAnimation parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseInfo(VoiceSweetCpHouseInfo voiceSweetCpHouseInfo) {
            voiceSweetCpHouseInfo.getClass();
            this.houseInfo_ = voiceSweetCpHouseInfo;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSweetCpAnimation, Builder> implements VoiceSweetCpAnimationOrBuilder {
            private Builder() {
                super(VoiceSweetCpAnimation.DEFAULT_INSTANCE);
            }

            public Builder addAllCpUsers(Iterable<? extends userMaskConfig.UserMask> iterable) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).addAllCpUsers(iterable);
                return this;
            }

            public Builder addCpUsers(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).addCpUsers(userMask);
                return this;
            }

            public Builder clearAnimationUrl() {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).clearAnimationUrl();
                return this;
            }

            public Builder clearCpUsers() {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).clearCpUsers();
                return this;
            }

            public Builder clearHouseInfo() {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).clearHouseInfo();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public String getAnimationUrl() {
                return ((VoiceSweetCpAnimation) this.instance).getAnimationUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public ByteString getAnimationUrlBytes() {
                return ((VoiceSweetCpAnimation) this.instance).getAnimationUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public userMaskConfig.UserMask getCpUsers(int i) {
                return ((VoiceSweetCpAnimation) this.instance).getCpUsers(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public int getCpUsersCount() {
                return ((VoiceSweetCpAnimation) this.instance).getCpUsersCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public List<userMaskConfig.UserMask> getCpUsersList() {
                return Collections.unmodifiableList(((VoiceSweetCpAnimation) this.instance).getCpUsersList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public VoiceSweetCpHouseInfo getHouseInfo() {
                return ((VoiceSweetCpAnimation) this.instance).getHouseInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public Type getType() {
                return ((VoiceSweetCpAnimation) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public int getTypeValue() {
                return ((VoiceSweetCpAnimation) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpAnimationOrBuilder
            public boolean hasHouseInfo() {
                return ((VoiceSweetCpAnimation) this.instance).hasHouseInfo();
            }

            public Builder mergeHouseInfo(VoiceSweetCpHouseInfo voiceSweetCpHouseInfo) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).mergeHouseInfo(voiceSweetCpHouseInfo);
                return this;
            }

            public Builder removeCpUsers(int i) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).removeCpUsers(i);
                return this;
            }

            public Builder setAnimationUrl(String str) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setAnimationUrl(str);
                return this;
            }

            public Builder setAnimationUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setAnimationUrlBytes(byteString);
                return this;
            }

            public Builder setCpUsers(int i, userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setCpUsers(i, userMask);
                return this;
            }

            public Builder setHouseInfo(VoiceSweetCpHouseInfo voiceSweetCpHouseInfo) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setHouseInfo(voiceSweetCpHouseInfo);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setTypeValue(i);
                return this;
            }

            public Builder addCpUsers(int i, userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).addCpUsers(i, userMask);
                return this;
            }

            public Builder setCpUsers(int i, userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setCpUsers(i, builder);
                return this;
            }

            public Builder setHouseInfo(VoiceSweetCpHouseInfo.Builder builder) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).setHouseInfo(builder);
                return this;
            }

            public Builder addCpUsers(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).addCpUsers(builder);
                return this;
            }

            public Builder addCpUsers(int i, userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceSweetCpAnimation) this.instance).addCpUsers(i, builder);
                return this;
            }
        }

        public static VoiceSweetCpAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSweetCpAnimation parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSweetCpAnimation parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpAnimation parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpAnimation parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCpUsers(int i, userMaskConfig.UserMask userMask) {
            userMask.getClass();
            ensureCpUsersIsMutable();
            this.cpUsers_.add(i, userMask);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSweetCpAnimation parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSweetCpAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpUsers(int i, userMaskConfig.UserMask userMask) {
            userMask.getClass();
            ensureCpUsersIsMutable();
            this.cpUsers_.set(i, userMask);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCpUsers(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            ensureCpUsersIsMutable();
            this.cpUsers_.add(userMask);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCpUsers(int i, userMaskConfig.UserMask.Builder builder) {
            ensureCpUsersIsMutable();
            this.cpUsers_.add(i, builder.build());
        }
    }

    public enum VoiceCpBindAction implements C3414l.c {
        invite(0),
        agree(1),
        refuse(2),
        UNRECOGNIZED(-1);

        public static final int agree_VALUE = 1;
        private static final C3414l.d<VoiceCpBindAction> internalValueMap = new C3414l.d<VoiceCpBindAction>() { // from class: com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindAction.1
            @Override // com.google.protobuf.C3414l.d
            public VoiceCpBindAction findValueByNumber(int i) {
                return VoiceCpBindAction.forNumber(i);
            }
        };
        public static final int invite_VALUE = 0;
        public static final int refuse_VALUE = 2;
        private final int value;

        VoiceCpBindAction(int i) {
            this.value = i;
        }

        public static VoiceCpBindAction forNumber(int i) {
            if (i == 0) {
                return invite;
            }
            if (i == 1) {
                return agree;
            }
            if (i != 2) {
                return null;
            }
            return refuse;
        }

        public static C3414l.d<VoiceCpBindAction> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceCpBindAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceCpBindMessage extends GeneratedMessageLite<VoiceCpBindMessage, Builder> implements VoiceCpBindMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 14;
        private static final VoiceCpBindMessage DEFAULT_INSTANCE;
        public static final int HOUSEBACKGROUND_FIELD_NUMBER = 7;
        public static final int HOUSEID_FIELD_NUMBER = 3;
        public static final int HOUSEIMAGE_FIELD_NUMBER = 6;
        public static final int HOUSENAME_FIELD_NUMBER = 4;
        public static final int HOUSERANK_FIELD_NUMBER = 5;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int OTHERUSERAVATAR_FIELD_NUMBER = 13;
        public static final int OTHERUSERID_FIELD_NUMBER = 11;
        public static final int OTHERUSERNAME_FIELD_NUMBER = 12;
        private static volatile i860<VoiceCpBindMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERAVATAR_FIELD_NUMBER = 10;
        public static final int USERID_FIELD_NUMBER = 8;
        public static final int USERNAME_FIELD_NUMBER = 9;
        private int action_;
        private int houseRank_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String houseId_ = "";
        private String houseName_ = "";
        private String houseImage_ = "";
        private String houseBackground_ = "";
        private String userId_ = "";
        private String userName_ = "";
        private String userAvatar_ = "";
        private String otherUserId_ = "";
        private String otherUserName_ = "";
        private String otherUserAvatar_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceCpBindMessage, Builder> implements VoiceCpBindMessageOrBuilder {
            private Builder() {
                super(VoiceCpBindMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearHouseBackground() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearHouseBackground();
                return this;
            }

            public Builder clearHouseId() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearHouseId();
                return this;
            }

            public Builder clearHouseImage() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearHouseImage();
                return this;
            }

            public Builder clearHouseName() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearHouseName();
                return this;
            }

            public Builder clearHouseRank() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearHouseRank();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearOtherUserAvatar() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearOtherUserAvatar();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearOtherUserName() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearOtherUserName();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserAvatar() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearUserAvatar();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public VoiceCpBindAction getAction() {
                return ((VoiceCpBindMessage) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public int getActionValue() {
                return ((VoiceCpBindMessage) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getHouseBackground() {
                return ((VoiceCpBindMessage) this.instance).getHouseBackground();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getHouseBackgroundBytes() {
                return ((VoiceCpBindMessage) this.instance).getHouseBackgroundBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getHouseId() {
                return ((VoiceCpBindMessage) this.instance).getHouseId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getHouseIdBytes() {
                return ((VoiceCpBindMessage) this.instance).getHouseIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getHouseImage() {
                return ((VoiceCpBindMessage) this.instance).getHouseImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getHouseImageBytes() {
                return ((VoiceCpBindMessage) this.instance).getHouseImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getHouseName() {
                return ((VoiceCpBindMessage) this.instance).getHouseName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getHouseNameBytes() {
                return ((VoiceCpBindMessage) this.instance).getHouseNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public int getHouseRank() {
                return ((VoiceCpBindMessage) this.instance).getHouseRank();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getLiveId() {
                return ((VoiceCpBindMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceCpBindMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getOtherUserAvatar() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getOtherUserAvatarBytes() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getOtherUserId() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getOtherUserName() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getOtherUserNameBytes() {
                return ((VoiceCpBindMessage) this.instance).getOtherUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getRoomId() {
                return ((VoiceCpBindMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceCpBindMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getUserAvatar() {
                return ((VoiceCpBindMessage) this.instance).getUserAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getUserAvatarBytes() {
                return ((VoiceCpBindMessage) this.instance).getUserAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getUserId() {
                return ((VoiceCpBindMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceCpBindMessage) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public String getUserName() {
                return ((VoiceCpBindMessage) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
            public ByteString getUserNameBytes() {
                return ((VoiceCpBindMessage) this.instance).getUserNameBytes();
            }

            public Builder setAction(VoiceCpBindAction voiceCpBindAction) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setAction(voiceCpBindAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setActionValue(i);
                return this;
            }

            public Builder setHouseBackground(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseBackground(str);
                return this;
            }

            public Builder setHouseBackgroundBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseBackgroundBytes(byteString);
                return this;
            }

            public Builder setHouseId(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseId(str);
                return this;
            }

            public Builder setHouseIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseIdBytes(byteString);
                return this;
            }

            public Builder setHouseImage(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseImage(str);
                return this;
            }

            public Builder setHouseImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseImageBytes(byteString);
                return this;
            }

            public Builder setHouseName(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseName(str);
                return this;
            }

            public Builder setHouseNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseNameBytes(byteString);
                return this;
            }

            public Builder setHouseRank(int i) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setHouseRank(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserAvatar(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserAvatar(str);
                return this;
            }

            public Builder setOtherUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserAvatarBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserName(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserName(str);
                return this;
            }

            public Builder setOtherUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setOtherUserNameBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserAvatar(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserAvatar(str);
                return this;
            }

            public Builder setUserAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserAvatarBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpBindMessage) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            VoiceCpBindMessage voiceCpBindMessage = new VoiceCpBindMessage();
            DEFAULT_INSTANCE = voiceCpBindMessage;
            voiceCpBindMessage.makeImmutable();
        }

        private VoiceCpBindMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseBackground() {
            this.houseBackground_ = getDefaultInstance().getHouseBackground();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseId() {
            this.houseId_ = getDefaultInstance().getHouseId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseImage() {
            this.houseImage_ = getDefaultInstance().getHouseImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseName() {
            this.houseName_ = getDefaultInstance().getHouseName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseRank() {
            this.houseRank_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserAvatar() {
            this.otherUserAvatar_ = getDefaultInstance().getOtherUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserName() {
            this.otherUserName_ = getDefaultInstance().getOtherUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserAvatar() {
            this.userAvatar_ = getDefaultInstance().getUserAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static VoiceCpBindMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceCpBindMessage voiceCpBindMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceCpBindMessage);
        }

        public static VoiceCpBindMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpBindMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceCpBindMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(VoiceCpBindAction voiceCpBindAction) {
            voiceCpBindAction.getClass();
            this.action_ = voiceCpBindAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseBackground(String str) {
            str.getClass();
            this.houseBackground_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseBackgroundBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseBackground_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseId(String str) {
            str.getClass();
            this.houseId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseImage(String str) {
            str.getClass();
            this.houseImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseName(String str) {
            str.getClass();
            this.houseName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseRank(int i) {
            this.houseRank_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserAvatar(String str) {
            str.getClass();
            this.otherUserAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.otherUserAvatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserName(String str) {
            str.getClass();
            this.otherUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.otherUserName_ = byteString.toStringUtf8();
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
        public void setUserAvatar(String str) {
            str.getClass();
            this.userAvatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userAvatar_ = byteString.toStringUtf8();
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
            boolean z = false;
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceCpBindMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceCpBindMessage voiceCpBindMessage = (VoiceCpBindMessage) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceCpBindMessage.roomId_.isEmpty(), voiceCpBindMessage.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceCpBindMessage.liveId_.isEmpty(), voiceCpBindMessage.liveId_);
                    this.houseId_ = interfaceC3386h.mo16997f(!this.houseId_.isEmpty(), this.houseId_, !voiceCpBindMessage.houseId_.isEmpty(), voiceCpBindMessage.houseId_);
                    this.houseName_ = interfaceC3386h.mo16997f(!this.houseName_.isEmpty(), this.houseName_, !voiceCpBindMessage.houseName_.isEmpty(), voiceCpBindMessage.houseName_);
                    int i = this.houseRank_;
                    boolean z2 = i != 0;
                    int i2 = voiceCpBindMessage.houseRank_;
                    this.houseRank_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.houseImage_ = interfaceC3386h.mo16997f(!this.houseImage_.isEmpty(), this.houseImage_, !voiceCpBindMessage.houseImage_.isEmpty(), voiceCpBindMessage.houseImage_);
                    this.houseBackground_ = interfaceC3386h.mo16997f(!this.houseBackground_.isEmpty(), this.houseBackground_, !voiceCpBindMessage.houseBackground_.isEmpty(), voiceCpBindMessage.houseBackground_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceCpBindMessage.userId_.isEmpty(), voiceCpBindMessage.userId_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !voiceCpBindMessage.userName_.isEmpty(), voiceCpBindMessage.userName_);
                    this.userAvatar_ = interfaceC3386h.mo16997f(!this.userAvatar_.isEmpty(), this.userAvatar_, !voiceCpBindMessage.userAvatar_.isEmpty(), voiceCpBindMessage.userAvatar_);
                    this.otherUserId_ = interfaceC3386h.mo16997f(!this.otherUserId_.isEmpty(), this.otherUserId_, !voiceCpBindMessage.otherUserId_.isEmpty(), voiceCpBindMessage.otherUserId_);
                    this.otherUserName_ = interfaceC3386h.mo16997f(!this.otherUserName_.isEmpty(), this.otherUserName_, !voiceCpBindMessage.otherUserName_.isEmpty(), voiceCpBindMessage.otherUserName_);
                    this.otherUserAvatar_ = interfaceC3386h.mo16997f(!this.otherUserAvatar_.isEmpty(), this.otherUserAvatar_, !voiceCpBindMessage.otherUserAvatar_.isEmpty(), voiceCpBindMessage.otherUserAvatar_);
                    int i3 = this.action_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceCpBindMessage.action_;
                    this.action_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.houseId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.houseName_ = c3407e.m17115L();
                                    continue;
                                case 40:
                                    this.houseRank_ = c3407e.m17141u();
                                    continue;
                                case 50:
                                    this.houseImage_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.houseBackground_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 74:
                                    this.userName_ = c3407e.m17115L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.userAvatar_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    this.otherUserId_ = c3407e.m17115L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.otherUserName_ = c3407e.m17115L();
                                    continue;
                                case 106:
                                    this.otherUserAvatar_ = c3407e.m17115L();
                                    continue;
                                case 112:
                                    this.action_ = c3407e.m17136p();
                                    continue;
                                default:
                                    if (!c3407e.m17121R(iM17116M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (VoiceCpBindMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public VoiceCpBindAction getAction() {
            VoiceCpBindAction voiceCpBindActionForNumber = VoiceCpBindAction.forNumber(this.action_);
            return voiceCpBindActionForNumber == null ? VoiceCpBindAction.UNRECOGNIZED : voiceCpBindActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getHouseBackground() {
            return this.houseBackground_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getHouseBackgroundBytes() {
            return ByteString.copyFromUtf8(this.houseBackground_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getHouseId() {
            return this.houseId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getHouseIdBytes() {
            return ByteString.copyFromUtf8(this.houseId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getHouseImage() {
            return this.houseImage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getHouseImageBytes() {
            return ByteString.copyFromUtf8(this.houseImage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getHouseName() {
            return this.houseName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getHouseNameBytes() {
            return ByteString.copyFromUtf8(this.houseName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public int getHouseRank() {
            return this.houseRank_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getOtherUserAvatar() {
            return this.otherUserAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getOtherUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.otherUserAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getOtherUserName() {
            return this.otherUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getOtherUserNameBytes() {
            return ByteString.copyFromUtf8(this.otherUserName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveId());
            }
            if (!this.houseId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getHouseId());
            }
            if (!this.houseName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getHouseName());
            }
            int i2 = this.houseRank_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(5, i2);
            }
            if (!this.houseImage_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getHouseImage());
            }
            if (!this.houseBackground_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getHouseBackground());
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getUserName());
            }
            if (!this.userAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getUserAvatar());
            }
            if (!this.otherUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getOtherUserId());
            }
            if (!this.otherUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getOtherUserName());
            }
            if (!this.otherUserAvatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(13, getOtherUserAvatar());
            }
            if (this.action_ != VoiceCpBindAction.invite.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(14, this.action_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getUserAvatar() {
            return this.userAvatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getUserAvatarBytes() {
            return ByteString.copyFromUtf8(this.userAvatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpBindMessageOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            if (!this.houseId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getHouseId());
            }
            if (!this.houseName_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getHouseName());
            }
            int i = this.houseRank_;
            if (i != 0) {
                codedOutputStream.mo16970s0(5, i);
            }
            if (!this.houseImage_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getHouseImage());
            }
            if (!this.houseBackground_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getHouseBackground());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getUserName());
            }
            if (!this.userAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getUserAvatar());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getOtherUserId());
            }
            if (!this.otherUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getOtherUserName());
            }
            if (!this.otherUserAvatar_.isEmpty()) {
                codedOutputStream.mo16939D0(13, getOtherUserAvatar());
            }
            if (this.action_ != VoiceCpBindAction.invite.getNumber()) {
                codedOutputStream.m16960i0(14, this.action_);
            }
        }

        public static VoiceCpBindMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpBindMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceCpBindMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceCpBindMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceCpBindMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpBindMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpBindMessage parseFrom(C3407e c3407e) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceCpBindMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceCpBindMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceCpHouseReward extends GeneratedMessageLite<VoiceCpHouseReward, Builder> implements VoiceCpHouseRewardOrBuilder {
        private static final VoiceCpHouseReward DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile i860<VoiceCpHouseReward> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String image_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceCpHouseReward, Builder> implements VoiceCpHouseRewardOrBuilder {
            private Builder() {
                super(VoiceCpHouseReward.DEFAULT_INSTANCE);
            }

            public Builder clearImage() {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).clearImage();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
            public String getImage() {
                return ((VoiceCpHouseReward) this.instance).getImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
            public ByteString getImageBytes() {
                return ((VoiceCpHouseReward) this.instance).getImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
            public String getTitle() {
                return ((VoiceCpHouseReward) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceCpHouseReward) this.instance).getTitleBytes();
            }

            public Builder setImage(String str) {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).setImage(str);
                return this;
            }

            public Builder setImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).setImageBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseReward) this.instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            VoiceCpHouseReward voiceCpHouseReward = new VoiceCpHouseReward();
            DEFAULT_INSTANCE = voiceCpHouseReward;
            voiceCpHouseReward.makeImmutable();
        }

        private VoiceCpHouseReward() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImage() {
            this.image_ = getDefaultInstance().getImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static VoiceCpHouseReward getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceCpHouseReward voiceCpHouseReward) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceCpHouseReward);
        }

        public static VoiceCpHouseReward parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpHouseReward parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceCpHouseReward> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(String str) {
            str.getClass();
            this.image_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.image_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceCpHouseReward();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceCpHouseReward voiceCpHouseReward = (VoiceCpHouseReward) obj2;
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !voiceCpHouseReward.title_.isEmpty(), voiceCpHouseReward.title_);
                    this.image_ = interfaceC3386h.mo16997f(!this.image_.isEmpty(), this.image_, true ^ voiceCpHouseReward.image_.isEmpty(), voiceCpHouseReward.image_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.image_ = c3407e.m17115L();
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
                        synchronized (VoiceCpHouseReward.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
        public String getImage() {
            return this.image_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
        public ByteString getImageBytes() {
            return ByteString.copyFromUtf8(this.image_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.title_.isEmpty() ? CodedOutputStream.m16901K(1, getTitle()) : 0;
            if (!this.image_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getImage());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseRewardOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getTitle());
            }
            if (this.image_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getImage());
        }

        public static VoiceCpHouseReward parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpHouseReward parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceCpHouseReward parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceCpHouseReward parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceCpHouseReward parseFrom(InputStream inputStream) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpHouseReward parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpHouseReward parseFrom(C3407e c3407e) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceCpHouseReward parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceCpHouseReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceCpHouseUpgradeMessage extends GeneratedMessageLite<VoiceCpHouseUpgradeMessage, Builder> implements VoiceCpHouseUpgradeMessageOrBuilder {
        private static final VoiceCpHouseUpgradeMessage DEFAULT_INSTANCE;
        public static final int HOUSEBACKGROUND_FIELD_NUMBER = 7;
        public static final int HOUSEID_FIELD_NUMBER = 3;
        public static final int HOUSEIMAGE_FIELD_NUMBER = 6;
        public static final int HOUSENAME_FIELD_NUMBER = 4;
        public static final int HOUSERANK_FIELD_NUMBER = 5;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int OTHERUSERID_FIELD_NUMBER = 11;
        public static final int OTHERUSERNAME_FIELD_NUMBER = 12;
        private static volatile i860<VoiceCpHouseUpgradeMessage> PARSER = null;
        public static final int REWARDLIST_FIELD_NUMBER = 13;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 8;
        public static final int USERNAME_FIELD_NUMBER = 9;
        private int bitField0_;
        private int houseRank_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String houseId_ = "";
        private String houseName_ = "";
        private String houseImage_ = "";
        private String houseBackground_ = "";
        private String userId_ = "";
        private String userName_ = "";
        private String otherUserId_ = "";
        private String otherUserName_ = "";
        private C3414l.h<VoiceCpHouseReward> rewardList_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage = new VoiceCpHouseUpgradeMessage();
            DEFAULT_INSTANCE = voiceCpHouseUpgradeMessage;
            voiceCpHouseUpgradeMessage.makeImmutable();
        }

        private VoiceCpHouseUpgradeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRewardList(Iterable<? extends VoiceCpHouseReward> iterable) {
            ensureRewardListIsMutable();
            AbstractC3403a.addAll(iterable, this.rewardList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewardList(VoiceCpHouseReward.Builder builder) {
            ensureRewardListIsMutable();
            this.rewardList_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseBackground() {
            this.houseBackground_ = getDefaultInstance().getHouseBackground();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseId() {
            this.houseId_ = getDefaultInstance().getHouseId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseImage() {
            this.houseImage_ = getDefaultInstance().getHouseImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseName() {
            this.houseName_ = getDefaultInstance().getHouseName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseRank() {
            this.houseRank_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserName() {
            this.otherUserName_ = getDefaultInstance().getOtherUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardList() {
            this.rewardList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        private void ensureRewardListIsMutable() {
            if (this.rewardList_.mo17085q()) {
                return;
            }
            this.rewardList_ = GeneratedMessageLite.mutableCopy(this.rewardList_);
        }

        public static VoiceCpHouseUpgradeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceCpHouseUpgradeMessage);
        }

        public static VoiceCpHouseUpgradeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceCpHouseUpgradeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRewardList(int i) {
            ensureRewardListIsMutable();
            this.rewardList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseBackground(String str) {
            str.getClass();
            this.houseBackground_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseBackgroundBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseBackground_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseId(String str) {
            str.getClass();
            this.houseId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseImage(String str) {
            str.getClass();
            this.houseImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseName(String str) {
            str.getClass();
            this.houseName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.houseName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseRank(int i) {
            this.houseRank_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserName(String str) {
            str.getClass();
            this.otherUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.otherUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardList(int i, VoiceCpHouseReward.Builder builder) {
            ensureRewardListIsMutable();
            this.rewardList_.set(i, builder.build());
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
            boolean z = false;
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceCpHouseUpgradeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.rewardList_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage = (VoiceCpHouseUpgradeMessage) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceCpHouseUpgradeMessage.roomId_.isEmpty(), voiceCpHouseUpgradeMessage.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceCpHouseUpgradeMessage.liveId_.isEmpty(), voiceCpHouseUpgradeMessage.liveId_);
                    this.houseId_ = interfaceC3386h.mo16997f(!this.houseId_.isEmpty(), this.houseId_, !voiceCpHouseUpgradeMessage.houseId_.isEmpty(), voiceCpHouseUpgradeMessage.houseId_);
                    this.houseName_ = interfaceC3386h.mo16997f(!this.houseName_.isEmpty(), this.houseName_, !voiceCpHouseUpgradeMessage.houseName_.isEmpty(), voiceCpHouseUpgradeMessage.houseName_);
                    int i = this.houseRank_;
                    boolean z2 = i != 0;
                    int i2 = voiceCpHouseUpgradeMessage.houseRank_;
                    this.houseRank_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.houseImage_ = interfaceC3386h.mo16997f(!this.houseImage_.isEmpty(), this.houseImage_, !voiceCpHouseUpgradeMessage.houseImage_.isEmpty(), voiceCpHouseUpgradeMessage.houseImage_);
                    this.houseBackground_ = interfaceC3386h.mo16997f(!this.houseBackground_.isEmpty(), this.houseBackground_, !voiceCpHouseUpgradeMessage.houseBackground_.isEmpty(), voiceCpHouseUpgradeMessage.houseBackground_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !voiceCpHouseUpgradeMessage.userId_.isEmpty(), voiceCpHouseUpgradeMessage.userId_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !voiceCpHouseUpgradeMessage.userName_.isEmpty(), voiceCpHouseUpgradeMessage.userName_);
                    this.otherUserId_ = interfaceC3386h.mo16997f(!this.otherUserId_.isEmpty(), this.otherUserId_, !voiceCpHouseUpgradeMessage.otherUserId_.isEmpty(), voiceCpHouseUpgradeMessage.otherUserId_);
                    this.otherUserName_ = interfaceC3386h.mo16997f(!this.otherUserName_.isEmpty(), this.otherUserName_, !voiceCpHouseUpgradeMessage.otherUserName_.isEmpty(), voiceCpHouseUpgradeMessage.otherUserName_);
                    this.rewardList_ = interfaceC3386h.mo16998g(this.rewardList_, voiceCpHouseUpgradeMessage.rewardList_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceCpHouseUpgradeMessage.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.houseId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.houseName_ = c3407e.m17115L();
                                    continue;
                                case 40:
                                    this.houseRank_ = c3407e.m17141u();
                                    continue;
                                case 50:
                                    this.houseImage_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.houseBackground_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 74:
                                    this.userName_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    this.otherUserId_ = c3407e.m17115L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.otherUserName_ = c3407e.m17115L();
                                    continue;
                                case 106:
                                    if (!this.rewardList_.mo17085q()) {
                                        this.rewardList_ = GeneratedMessageLite.mutableCopy(this.rewardList_);
                                    }
                                    this.rewardList_.add((VoiceCpHouseReward) c3407e.m17143w(VoiceCpHouseReward.parser(), c3410h));
                                    continue;
                                default:
                                    if (!c3407e.m17121R(iM17116M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (VoiceCpHouseUpgradeMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getHouseBackground() {
            return this.houseBackground_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getHouseBackgroundBytes() {
            return ByteString.copyFromUtf8(this.houseBackground_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getHouseId() {
            return this.houseId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getHouseIdBytes() {
            return ByteString.copyFromUtf8(this.houseId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getHouseImage() {
            return this.houseImage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getHouseImageBytes() {
            return ByteString.copyFromUtf8(this.houseImage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getHouseName() {
            return this.houseName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getHouseNameBytes() {
            return ByteString.copyFromUtf8(this.houseName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public int getHouseRank() {
            return this.houseRank_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getOtherUserName() {
            return this.otherUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getOtherUserNameBytes() {
            return ByteString.copyFromUtf8(this.otherUserName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public VoiceCpHouseReward getRewardList(int i) {
            return this.rewardList_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public int getRewardListCount() {
            return this.rewardList_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public List<VoiceCpHouseReward> getRewardListList() {
            return this.rewardList_;
        }

        public VoiceCpHouseRewardOrBuilder getRewardListOrBuilder(int i) {
            return this.rewardList_.get(i);
        }

        public List<? extends VoiceCpHouseRewardOrBuilder> getRewardListOrBuilderList() {
            return this.rewardList_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveId());
            }
            if (!this.houseId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getHouseId());
            }
            if (!this.houseName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getHouseName());
            }
            int i2 = this.houseRank_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(5, i2);
            }
            if (!this.houseImage_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getHouseImage());
            }
            if (!this.houseBackground_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getHouseBackground());
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getUserName());
            }
            if (!this.otherUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getOtherUserId());
            }
            if (!this.otherUserName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getOtherUserName());
            }
            for (int i3 = 0; i3 < this.rewardList_.size(); i3++) {
                iM16901K += CodedOutputStream.m16893C(13, this.rewardList_.get(i3));
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            if (!this.houseId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getHouseId());
            }
            if (!this.houseName_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getHouseName());
            }
            int i = this.houseRank_;
            if (i != 0) {
                codedOutputStream.mo16970s0(5, i);
            }
            if (!this.houseImage_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getHouseImage());
            }
            if (!this.houseBackground_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getHouseBackground());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getUserName());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getOtherUserId());
            }
            if (!this.otherUserName_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getOtherUserName());
            }
            for (int i2 = 0; i2 < this.rewardList_.size(); i2++) {
                codedOutputStream.mo16974w0(13, this.rewardList_.get(i2));
            }
        }

        public static VoiceCpHouseUpgradeMessage parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceCpHouseUpgradeMessage, Builder> implements VoiceCpHouseUpgradeMessageOrBuilder {
            private Builder() {
                super(VoiceCpHouseUpgradeMessage.DEFAULT_INSTANCE);
            }

            public Builder addAllRewardList(Iterable<? extends VoiceCpHouseReward> iterable) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).addAllRewardList(iterable);
                return this;
            }

            public Builder addRewardList(VoiceCpHouseReward voiceCpHouseReward) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).addRewardList(voiceCpHouseReward);
                return this;
            }

            public Builder clearHouseBackground() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearHouseBackground();
                return this;
            }

            public Builder clearHouseId() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearHouseId();
                return this;
            }

            public Builder clearHouseImage() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearHouseImage();
                return this;
            }

            public Builder clearHouseName() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearHouseName();
                return this;
            }

            public Builder clearHouseRank() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearHouseRank();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearOtherUserName() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearOtherUserName();
                return this;
            }

            public Builder clearRewardList() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearRewardList();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getHouseBackground() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseBackground();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getHouseBackgroundBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseBackgroundBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getHouseId() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getHouseIdBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getHouseImage() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getHouseImageBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getHouseName() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getHouseNameBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public int getHouseRank() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getHouseRank();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getOtherUserId() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getOtherUserName() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getOtherUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getOtherUserNameBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getOtherUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public VoiceCpHouseReward getRewardList(int i) {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getRewardList(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public int getRewardListCount() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getRewardListCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public List<VoiceCpHouseReward> getRewardListList() {
                return Collections.unmodifiableList(((VoiceCpHouseUpgradeMessage) this.instance).getRewardListList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getUserId() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public String getUserName() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceCpHouseUpgradeMessageOrBuilder
            public ByteString getUserNameBytes() {
                return ((VoiceCpHouseUpgradeMessage) this.instance).getUserNameBytes();
            }

            public Builder removeRewardList(int i) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).removeRewardList(i);
                return this;
            }

            public Builder setHouseBackground(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseBackground(str);
                return this;
            }

            public Builder setHouseBackgroundBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseBackgroundBytes(byteString);
                return this;
            }

            public Builder setHouseId(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseId(str);
                return this;
            }

            public Builder setHouseIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseIdBytes(byteString);
                return this;
            }

            public Builder setHouseImage(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseImage(str);
                return this;
            }

            public Builder setHouseImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseImageBytes(byteString);
                return this;
            }

            public Builder setHouseName(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseName(str);
                return this;
            }

            public Builder setHouseNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseNameBytes(byteString);
                return this;
            }

            public Builder setHouseRank(int i) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setHouseRank(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserName(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setOtherUserName(str);
                return this;
            }

            public Builder setOtherUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setOtherUserNameBytes(byteString);
                return this;
            }

            public Builder setRewardList(int i, VoiceCpHouseReward voiceCpHouseReward) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setRewardList(i, voiceCpHouseReward);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder addRewardList(int i, VoiceCpHouseReward voiceCpHouseReward) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).addRewardList(i, voiceCpHouseReward);
                return this;
            }

            public Builder setRewardList(int i, VoiceCpHouseReward.Builder builder) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).setRewardList(i, builder);
                return this;
            }

            public Builder addRewardList(VoiceCpHouseReward.Builder builder) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).addRewardList(builder);
                return this;
            }

            public Builder addRewardList(int i, VoiceCpHouseReward.Builder builder) {
                copyOnWrite();
                ((VoiceCpHouseUpgradeMessage) this.instance).addRewardList(i, builder);
                return this;
            }
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(C3407e c3407e) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewardList(int i, VoiceCpHouseReward voiceCpHouseReward) {
            voiceCpHouseReward.getClass();
            ensureRewardListIsMutable();
            this.rewardList_.add(i, voiceCpHouseReward);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceCpHouseUpgradeMessage parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceCpHouseUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardList(int i, VoiceCpHouseReward voiceCpHouseReward) {
            voiceCpHouseReward.getClass();
            ensureRewardListIsMutable();
            this.rewardList_.set(i, voiceCpHouseReward);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewardList(VoiceCpHouseReward voiceCpHouseReward) {
            voiceCpHouseReward.getClass();
            ensureRewardListIsMutable();
            this.rewardList_.add(voiceCpHouseReward);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRewardList(int i, VoiceCpHouseReward.Builder builder) {
            ensureRewardListIsMutable();
            this.rewardList_.add(i, builder.build());
        }
    }

    public static final class VoiceSweetCpEffect extends GeneratedMessageLite<VoiceSweetCpEffect, Builder> implements VoiceSweetCpEffectOrBuilder {
        private static final VoiceSweetCpEffect DEFAULT_INSTANCE;
        public static final int HORIZONTALCALLCONNECTIONEFFECTSVGA_FIELD_NUMBER = 3;
        public static final int ON_FIELD_NUMBER = 1;
        private static volatile i860<VoiceSweetCpEffect> PARSER = null;
        public static final int USERIDS_FIELD_NUMBER = 2;
        public static final int VERTICALCALLCONNECTIONEFFECTSVGA_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean on_;
        private C3414l.h<String> userIds_ = GeneratedMessageLite.emptyProtobufList();
        private String horizontalCallConnectionEffectSvga_ = "";
        private String verticalCallConnectionEffectSvga_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSweetCpEffect, Builder> implements VoiceSweetCpEffectOrBuilder {
            private Builder() {
                super(VoiceSweetCpEffect.DEFAULT_INSTANCE);
            }

            public Builder addAllUserIds(Iterable<String> iterable) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).addAllUserIds(iterable);
                return this;
            }

            public Builder addUserIds(String str) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).addUserIds(str);
                return this;
            }

            public Builder addUserIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).addUserIdsBytes(byteString);
                return this;
            }

            public Builder clearHorizontalCallConnectionEffectSvga() {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).clearHorizontalCallConnectionEffectSvga();
                return this;
            }

            public Builder clearOn() {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).clearOn();
                return this;
            }

            public Builder clearUserIds() {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).clearUserIds();
                return this;
            }

            public Builder clearVerticalCallConnectionEffectSvga() {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).clearVerticalCallConnectionEffectSvga();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public String getHorizontalCallConnectionEffectSvga() {
                return ((VoiceSweetCpEffect) this.instance).getHorizontalCallConnectionEffectSvga();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public ByteString getHorizontalCallConnectionEffectSvgaBytes() {
                return ((VoiceSweetCpEffect) this.instance).getHorizontalCallConnectionEffectSvgaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public boolean getOn() {
                return ((VoiceSweetCpEffect) this.instance).getOn();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public String getUserIds(int i) {
                return ((VoiceSweetCpEffect) this.instance).getUserIds(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public ByteString getUserIdsBytes(int i) {
                return ((VoiceSweetCpEffect) this.instance).getUserIdsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public int getUserIdsCount() {
                return ((VoiceSweetCpEffect) this.instance).getUserIdsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public List<String> getUserIdsList() {
                return Collections.unmodifiableList(((VoiceSweetCpEffect) this.instance).getUserIdsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public String getVerticalCallConnectionEffectSvga() {
                return ((VoiceSweetCpEffect) this.instance).getVerticalCallConnectionEffectSvga();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
            public ByteString getVerticalCallConnectionEffectSvgaBytes() {
                return ((VoiceSweetCpEffect) this.instance).getVerticalCallConnectionEffectSvgaBytes();
            }

            public Builder setHorizontalCallConnectionEffectSvga(String str) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setHorizontalCallConnectionEffectSvga(str);
                return this;
            }

            public Builder setHorizontalCallConnectionEffectSvgaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setHorizontalCallConnectionEffectSvgaBytes(byteString);
                return this;
            }

            public Builder setOn(boolean z) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setOn(z);
                return this;
            }

            public Builder setUserIds(int i, String str) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setUserIds(i, str);
                return this;
            }

            public Builder setVerticalCallConnectionEffectSvga(String str) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setVerticalCallConnectionEffectSvga(str);
                return this;
            }

            public Builder setVerticalCallConnectionEffectSvgaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSweetCpEffect) this.instance).setVerticalCallConnectionEffectSvgaBytes(byteString);
                return this;
            }
        }

        static {
            VoiceSweetCpEffect voiceSweetCpEffect = new VoiceSweetCpEffect();
            DEFAULT_INSTANCE = voiceSweetCpEffect;
            voiceSweetCpEffect.makeImmutable();
        }

        private VoiceSweetCpEffect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUserIds(Iterable<String> iterable) {
            ensureUserIdsIsMutable();
            AbstractC3403a.addAll(iterable, this.userIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserIds(String str) {
            str.getClass();
            ensureUserIdsIsMutable();
            this.userIds_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserIdsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureUserIdsIsMutable();
            this.userIds_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalCallConnectionEffectSvga() {
            this.horizontalCallConnectionEffectSvga_ = getDefaultInstance().getHorizontalCallConnectionEffectSvga();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOn() {
            this.on_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserIds() {
            this.userIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalCallConnectionEffectSvga() {
            this.verticalCallConnectionEffectSvga_ = getDefaultInstance().getVerticalCallConnectionEffectSvga();
        }

        private void ensureUserIdsIsMutable() {
            if (this.userIds_.mo17085q()) {
                return;
            }
            this.userIds_ = GeneratedMessageLite.mutableCopy(this.userIds_);
        }

        public static VoiceSweetCpEffect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSweetCpEffect voiceSweetCpEffect) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSweetCpEffect);
        }

        public static VoiceSweetCpEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSweetCpEffect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalCallConnectionEffectSvga(String str) {
            str.getClass();
            this.horizontalCallConnectionEffectSvga_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalCallConnectionEffectSvgaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.horizontalCallConnectionEffectSvga_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOn(boolean z) {
            this.on_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIds(int i, String str) {
            str.getClass();
            ensureUserIdsIsMutable();
            this.userIds_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalCallConnectionEffectSvga(String str) {
            str.getClass();
            this.verticalCallConnectionEffectSvga_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalCallConnectionEffectSvgaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.verticalCallConnectionEffectSvga_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSweetCpEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.userIds_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSweetCpEffect voiceSweetCpEffect = (VoiceSweetCpEffect) obj2;
                    boolean z = this.on_;
                    boolean z2 = voiceSweetCpEffect.on_;
                    this.on_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    this.userIds_ = interfaceC3386h.mo16998g(this.userIds_, voiceSweetCpEffect.userIds_);
                    this.horizontalCallConnectionEffectSvga_ = interfaceC3386h.mo16997f(!this.horizontalCallConnectionEffectSvga_.isEmpty(), this.horizontalCallConnectionEffectSvga_, !voiceSweetCpEffect.horizontalCallConnectionEffectSvga_.isEmpty(), voiceSweetCpEffect.horizontalCallConnectionEffectSvga_);
                    this.verticalCallConnectionEffectSvga_ = interfaceC3386h.mo16997f(!this.verticalCallConnectionEffectSvga_.isEmpty(), this.verticalCallConnectionEffectSvga_, true ^ voiceSweetCpEffect.verticalCallConnectionEffectSvga_.isEmpty(), voiceSweetCpEffect.verticalCallConnectionEffectSvga_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceSweetCpEffect.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.on_ = c3407e.m17133m();
                                } else if (iM17116M == 18) {
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.userIds_.mo17085q()) {
                                        this.userIds_ = GeneratedMessageLite.mutableCopy(this.userIds_);
                                    }
                                    this.userIds_.add(strM17115L);
                                } else if (iM17116M == 26) {
                                    this.horizontalCallConnectionEffectSvga_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.verticalCallConnectionEffectSvga_ = c3407e.m17115L();
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
                        synchronized (VoiceSweetCpEffect.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public String getHorizontalCallConnectionEffectSvga() {
            return this.horizontalCallConnectionEffectSvga_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public ByteString getHorizontalCallConnectionEffectSvgaBytes() {
            return ByteString.copyFromUtf8(this.horizontalCallConnectionEffectSvga_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public boolean getOn() {
            return this.on_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.on_;
            int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
            int iM16902L = 0;
            for (int i2 = 0; i2 < this.userIds_.size(); i2++) {
                iM16902L += CodedOutputStream.m16902L(this.userIds_.get(i2));
            }
            int size = iM16915f + iM16902L + getUserIdsList().size();
            if (!this.horizontalCallConnectionEffectSvga_.isEmpty()) {
                size += CodedOutputStream.m16901K(3, getHorizontalCallConnectionEffectSvga());
            }
            if (!this.verticalCallConnectionEffectSvga_.isEmpty()) {
                size += CodedOutputStream.m16901K(4, getVerticalCallConnectionEffectSvga());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public String getUserIds(int i) {
            return this.userIds_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public ByteString getUserIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.userIds_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public int getUserIdsCount() {
            return this.userIds_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public List<String> getUserIdsList() {
            return this.userIds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public String getVerticalCallConnectionEffectSvga() {
            return this.verticalCallConnectionEffectSvga_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpEffectOrBuilder
        public ByteString getVerticalCallConnectionEffectSvgaBytes() {
            return ByteString.copyFromUtf8(this.verticalCallConnectionEffectSvga_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.on_;
            if (z) {
                codedOutputStream.mo16950a0(1, z);
            }
            for (int i = 0; i < this.userIds_.size(); i++) {
                codedOutputStream.mo16939D0(2, this.userIds_.get(i));
            }
            if (!this.horizontalCallConnectionEffectSvga_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getHorizontalCallConnectionEffectSvga());
            }
            if (this.verticalCallConnectionEffectSvga_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(4, getVerticalCallConnectionEffectSvga());
        }

        public static VoiceSweetCpEffect parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpEffect parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceSweetCpEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSweetCpEffect parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSweetCpEffect parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpEffect parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpEffect parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSweetCpEffect parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSweetCpEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceSweetCpHouseInfo extends GeneratedMessageLite<VoiceSweetCpHouseInfo, Builder> implements VoiceSweetCpHouseInfoOrBuilder {
        public static final int AVATARANIMATIONURL_FIELD_NUMBER = 2;
        private static final VoiceSweetCpHouseInfo DEFAULT_INSTANCE;
        public static final int HOUSELEVEL_FIELD_NUMBER = 1;
        private static volatile i860<VoiceSweetCpHouseInfo> PARSER;
        private String avatarAnimationUrl_ = "";
        private int houseLevel_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSweetCpHouseInfo, Builder> implements VoiceSweetCpHouseInfoOrBuilder {
            private Builder() {
                super(VoiceSweetCpHouseInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarAnimationUrl() {
                copyOnWrite();
                ((VoiceSweetCpHouseInfo) this.instance).clearAvatarAnimationUrl();
                return this;
            }

            public Builder clearHouseLevel() {
                copyOnWrite();
                ((VoiceSweetCpHouseInfo) this.instance).clearHouseLevel();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
            public String getAvatarAnimationUrl() {
                return ((VoiceSweetCpHouseInfo) this.instance).getAvatarAnimationUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
            public ByteString getAvatarAnimationUrlBytes() {
                return ((VoiceSweetCpHouseInfo) this.instance).getAvatarAnimationUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
            public int getHouseLevel() {
                return ((VoiceSweetCpHouseInfo) this.instance).getHouseLevel();
            }

            public Builder setAvatarAnimationUrl(String str) {
                copyOnWrite();
                ((VoiceSweetCpHouseInfo) this.instance).setAvatarAnimationUrl(str);
                return this;
            }

            public Builder setAvatarAnimationUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSweetCpHouseInfo) this.instance).setAvatarAnimationUrlBytes(byteString);
                return this;
            }

            public Builder setHouseLevel(int i) {
                copyOnWrite();
                ((VoiceSweetCpHouseInfo) this.instance).setHouseLevel(i);
                return this;
            }
        }

        static {
            VoiceSweetCpHouseInfo voiceSweetCpHouseInfo = new VoiceSweetCpHouseInfo();
            DEFAULT_INSTANCE = voiceSweetCpHouseInfo;
            voiceSweetCpHouseInfo.makeImmutable();
        }

        private VoiceSweetCpHouseInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarAnimationUrl() {
            this.avatarAnimationUrl_ = getDefaultInstance().getAvatarAnimationUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHouseLevel() {
            this.houseLevel_ = 0;
        }

        public static VoiceSweetCpHouseInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSweetCpHouseInfo voiceSweetCpHouseInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSweetCpHouseInfo);
        }

        public static VoiceSweetCpHouseInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpHouseInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSweetCpHouseInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarAnimationUrl(String str) {
            str.getClass();
            this.avatarAnimationUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarAnimationUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatarAnimationUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHouseLevel(int i) {
            this.houseLevel_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45351.f15989xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSweetCpHouseInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSweetCpHouseInfo voiceSweetCpHouseInfo = (VoiceSweetCpHouseInfo) obj2;
                    int i = this.houseLevel_;
                    boolean z2 = i != 0;
                    int i2 = voiceSweetCpHouseInfo.houseLevel_;
                    this.houseLevel_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.avatarAnimationUrl_ = interfaceC3386h.mo16997f(!this.avatarAnimationUrl_.isEmpty(), this.avatarAnimationUrl_, !voiceSweetCpHouseInfo.avatarAnimationUrl_.isEmpty(), voiceSweetCpHouseInfo.avatarAnimationUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.houseLevel_ = c3407e.m17141u();
                                } else if (iM17116M == 18) {
                                    this.avatarAnimationUrl_ = c3407e.m17115L();
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
                        synchronized (VoiceSweetCpHouseInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
        public String getAvatarAnimationUrl() {
            return this.avatarAnimationUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
        public ByteString getAvatarAnimationUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarAnimationUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceSweet.VoiceSweetCpHouseInfoOrBuilder
        public int getHouseLevel() {
            return this.houseLevel_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.houseLevel_;
            int iM16929t = i2 != 0 ? CodedOutputStream.m16929t(1, i2) : 0;
            if (!this.avatarAnimationUrl_.isEmpty()) {
                iM16929t += CodedOutputStream.m16901K(2, getAvatarAnimationUrl());
            }
            this.memoizedSerializedSize = iM16929t;
            return iM16929t;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.houseLevel_;
            if (i != 0) {
                codedOutputStream.mo16970s0(1, i);
            }
            if (this.avatarAnimationUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getAvatarAnimationUrl());
        }

        public static VoiceSweetCpHouseInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpHouseInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceSweetCpHouseInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSweetCpHouseInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSweetCpHouseInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSweetCpHouseInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSweetCpHouseInfo parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSweetCpHouseInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSweetCpHouseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
