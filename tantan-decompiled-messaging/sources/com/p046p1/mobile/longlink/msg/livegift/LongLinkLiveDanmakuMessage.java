package com.p046p1.mobile.longlink.msg.livegift;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
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
public final class LongLinkLiveDanmakuMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage$1 */
    public static /* synthetic */ class C44481 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15959xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15959xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15959xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface BulletCommentInfoOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        FakeUserMask getMasks(int i);

        int getMasksCount();

        List<FakeUserMask> getMasksList();

        VideoLiveBulletComment getVideoLiveBulletComment();

        boolean hasVideoLiveBulletComment();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface BulletCommentStyleOrBuilder extends o6z {
        String getBackgroundColors(int i);

        ByteString getBackgroundColorsBytes(int i);

        int getBackgroundColorsCount();

        List<String> getBackgroundColorsList();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        String getBorderColor();

        ByteString getBorderColorBytes();

        String getBorderColors(int i);

        ByteString getBorderColorsBytes(int i);

        int getBorderColorsCount();

        List<String> getBorderColorsList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getOpacity();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface FakeUserAvatarConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        FakeUserPictureConfig getFrameConfig();

        boolean hasFrameConfig();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface FakeUserMaskOrBuilder extends o6z {
        String getAvatar();

        ByteString getAvatarBytes();

        FakeUserAvatarConfig getAvatarConfig();

        String getColor();

        ByteString getColorBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFakeId();

        ByteString getFakeIdBytes();

        FakeType getFakeType();

        int getFakeTypeValue();

        String getGender();

        ByteString getGenderBytes();

        String getIcon();

        ByteString getIconBytes();

        String getId();

        ByteString getIdBytes();

        boolean getIsFresh();

        String getName();

        ByteString getNameBytes();

        String getOriginUserId();

        ByteString getOriginUserIdBytes();

        FakeUserProfileConfig getProfileConfig();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasAvatarConfig();

        boolean hasProfileConfig();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface FakeUserPictureConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getDynamicUrl();

        ByteString getDynamicUrlBytes();

        String getStaticUrl();

        ByteString getStaticUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface FakeUserProfileConfigOrBuilder extends o6z {
        FakeUserPictureConfig getBackgroundPictureConfig();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        FakeUserPictureConfig getTopFrameConfig();

        boolean hasBackgroundPictureConfig();

        boolean hasTopFrameConfig();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoLiveBulletCommentOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getContent();

        ByteString getContentBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        long getPayAmount();

        String getPayAssetId();

        ByteString getPayAssetIdBytes();

        String getPayAssetType();

        ByteString getPayAssetTypeBytes();

        long getPriority();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getScenario();

        ByteString getScenarioBytes();

        BulletCommentStyle getStyle();

        String getSubType();

        ByteString getSubTypeBytes();

        String getType();

        ByteString getTypeBytes();

        String getTypeId();

        ByteString getTypeIdBytes();

        long getUserHierarchy();

        boolean hasStyle();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveDanmakuMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class BulletCommentInfo extends GeneratedMessageLite<BulletCommentInfo, Builder> implements BulletCommentInfoOrBuilder {
        private static final BulletCommentInfo DEFAULT_INSTANCE;
        public static final int MASKS_FIELD_NUMBER = 1;
        private static volatile i860<BulletCommentInfo> PARSER = null;
        public static final int VIDEOLIVEBULLETCOMMENT_FIELD_NUMBER = 2;
        private int bitField0_;
        private C3414l.h<FakeUserMask> masks_ = GeneratedMessageLite.emptyProtobufList();
        private VideoLiveBulletComment videoLiveBulletComment_;

        static {
            BulletCommentInfo bulletCommentInfo = new BulletCommentInfo();
            DEFAULT_INSTANCE = bulletCommentInfo;
            bulletCommentInfo.makeImmutable();
        }

        private BulletCommentInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMasks(Iterable<? extends FakeUserMask> iterable) {
            ensureMasksIsMutable();
            AbstractC3403a.addAll(iterable, this.masks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMasks(FakeUserMask.Builder builder) {
            ensureMasksIsMutable();
            this.masks_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMasks() {
            this.masks_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoLiveBulletComment() {
            this.videoLiveBulletComment_ = null;
        }

        private void ensureMasksIsMutable() {
            if (this.masks_.mo17085q()) {
                return;
            }
            this.masks_ = GeneratedMessageLite.mutableCopy(this.masks_);
        }

        public static BulletCommentInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoLiveBulletComment(VideoLiveBulletComment videoLiveBulletComment) {
            VideoLiveBulletComment videoLiveBulletComment2 = this.videoLiveBulletComment_;
            if (videoLiveBulletComment2 == null || videoLiveBulletComment2 == VideoLiveBulletComment.getDefaultInstance()) {
                this.videoLiveBulletComment_ = videoLiveBulletComment;
            } else {
                this.videoLiveBulletComment_ = VideoLiveBulletComment.newBuilder(this.videoLiveBulletComment_).mergeFrom(videoLiveBulletComment).buildPartial();
            }
        }

        public static Builder newBuilder(BulletCommentInfo bulletCommentInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bulletCommentInfo);
        }

        public static BulletCommentInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BulletCommentInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<BulletCommentInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMasks(int i) {
            ensureMasksIsMutable();
            this.masks_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMasks(int i, FakeUserMask.Builder builder) {
            ensureMasksIsMutable();
            this.masks_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoLiveBulletComment(VideoLiveBulletComment.Builder builder) {
            this.videoLiveBulletComment_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BulletCommentInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.masks_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    BulletCommentInfo bulletCommentInfo = (BulletCommentInfo) obj2;
                    this.masks_ = interfaceC3386h.mo16998g(this.masks_, bulletCommentInfo.masks_);
                    this.videoLiveBulletComment_ = (VideoLiveBulletComment) interfaceC3386h.mo17006o(this.videoLiveBulletComment_, bulletCommentInfo.videoLiveBulletComment_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= bulletCommentInfo.bitField0_;
                    }
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
                                    if (!this.masks_.mo17085q()) {
                                        this.masks_ = GeneratedMessageLite.mutableCopy(this.masks_);
                                    }
                                    this.masks_.add((FakeUserMask) c3407e.m17143w(FakeUserMask.parser(), c3410h));
                                } else if (iM17116M == 18) {
                                    VideoLiveBulletComment videoLiveBulletComment = this.videoLiveBulletComment_;
                                    VideoLiveBulletComment.Builder builder = videoLiveBulletComment != null ? videoLiveBulletComment.toBuilder() : null;
                                    VideoLiveBulletComment videoLiveBulletComment2 = (VideoLiveBulletComment) c3407e.m17143w(VideoLiveBulletComment.parser(), c3410h);
                                    this.videoLiveBulletComment_ = videoLiveBulletComment2;
                                    if (builder != null) {
                                        builder.mergeFrom(videoLiveBulletComment2);
                                        this.videoLiveBulletComment_ = builder.buildPartial();
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
                        synchronized (BulletCommentInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
        public FakeUserMask getMasks(int i) {
            return this.masks_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
        public int getMasksCount() {
            return this.masks_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
        public List<FakeUserMask> getMasksList() {
            return this.masks_;
        }

        public FakeUserMaskOrBuilder getMasksOrBuilder(int i) {
            return this.masks_.get(i);
        }

        public List<? extends FakeUserMaskOrBuilder> getMasksOrBuilderList() {
            return this.masks_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = 0;
            for (int i2 = 0; i2 < this.masks_.size(); i2++) {
                iM16893C += CodedOutputStream.m16893C(1, this.masks_.get(i2));
            }
            if (this.videoLiveBulletComment_ != null) {
                iM16893C += CodedOutputStream.m16893C(2, getVideoLiveBulletComment());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
        public VideoLiveBulletComment getVideoLiveBulletComment() {
            VideoLiveBulletComment videoLiveBulletComment = this.videoLiveBulletComment_;
            return videoLiveBulletComment == null ? VideoLiveBulletComment.getDefaultInstance() : videoLiveBulletComment;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
        public boolean hasVideoLiveBulletComment() {
            return this.videoLiveBulletComment_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.masks_.size(); i++) {
                codedOutputStream.mo16974w0(1, this.masks_.get(i));
            }
            if (this.videoLiveBulletComment_ != null) {
                codedOutputStream.mo16974w0(2, getVideoLiveBulletComment());
            }
        }

        public static BulletCommentInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static BulletCommentInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoLiveBulletComment(VideoLiveBulletComment videoLiveBulletComment) {
            videoLiveBulletComment.getClass();
            this.videoLiveBulletComment_ = videoLiveBulletComment;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<BulletCommentInfo, Builder> implements BulletCommentInfoOrBuilder {
            private Builder() {
                super(BulletCommentInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllMasks(Iterable<? extends FakeUserMask> iterable) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).addAllMasks(iterable);
                return this;
            }

            public Builder addMasks(FakeUserMask fakeUserMask) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).addMasks(fakeUserMask);
                return this;
            }

            public Builder clearMasks() {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).clearMasks();
                return this;
            }

            public Builder clearVideoLiveBulletComment() {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).clearVideoLiveBulletComment();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
            public FakeUserMask getMasks(int i) {
                return ((BulletCommentInfo) this.instance).getMasks(i);
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
            public int getMasksCount() {
                return ((BulletCommentInfo) this.instance).getMasksCount();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
            public List<FakeUserMask> getMasksList() {
                return Collections.unmodifiableList(((BulletCommentInfo) this.instance).getMasksList());
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
            public VideoLiveBulletComment getVideoLiveBulletComment() {
                return ((BulletCommentInfo) this.instance).getVideoLiveBulletComment();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentInfoOrBuilder
            public boolean hasVideoLiveBulletComment() {
                return ((BulletCommentInfo) this.instance).hasVideoLiveBulletComment();
            }

            public Builder mergeVideoLiveBulletComment(VideoLiveBulletComment videoLiveBulletComment) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).mergeVideoLiveBulletComment(videoLiveBulletComment);
                return this;
            }

            public Builder removeMasks(int i) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).removeMasks(i);
                return this;
            }

            public Builder setMasks(int i, FakeUserMask fakeUserMask) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).setMasks(i, fakeUserMask);
                return this;
            }

            public Builder setVideoLiveBulletComment(VideoLiveBulletComment videoLiveBulletComment) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).setVideoLiveBulletComment(videoLiveBulletComment);
                return this;
            }

            public Builder addMasks(int i, FakeUserMask fakeUserMask) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).addMasks(i, fakeUserMask);
                return this;
            }

            public Builder setMasks(int i, FakeUserMask.Builder builder) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).setMasks(i, builder);
                return this;
            }

            public Builder setVideoLiveBulletComment(VideoLiveBulletComment.Builder builder) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).setVideoLiveBulletComment(builder);
                return this;
            }

            public Builder addMasks(FakeUserMask.Builder builder) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).addMasks(builder);
                return this;
            }

            public Builder addMasks(int i, FakeUserMask.Builder builder) {
                copyOnWrite();
                ((BulletCommentInfo) this.instance).addMasks(i, builder);
                return this;
            }
        }

        public static BulletCommentInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BulletCommentInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static BulletCommentInfo parseFrom(InputStream inputStream) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BulletCommentInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static BulletCommentInfo parseFrom(C3407e c3407e) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMasks(int i, FakeUserMask fakeUserMask) {
            fakeUserMask.getClass();
            ensureMasksIsMutable();
            this.masks_.add(i, fakeUserMask);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BulletCommentInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (BulletCommentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMasks(int i, FakeUserMask fakeUserMask) {
            fakeUserMask.getClass();
            ensureMasksIsMutable();
            this.masks_.set(i, fakeUserMask);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMasks(FakeUserMask fakeUserMask) {
            fakeUserMask.getClass();
            ensureMasksIsMutable();
            this.masks_.add(fakeUserMask);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMasks(int i, FakeUserMask.Builder builder) {
            ensureMasksIsMutable();
            this.masks_.add(i, builder.build());
        }
    }

    public static final class BulletCommentStyle extends GeneratedMessageLite<BulletCommentStyle, Builder> implements BulletCommentStyleOrBuilder {
        public static final int BACKGROUNDCOLORS_FIELD_NUMBER = 1;
        public static final int BACKGROUNDURL_FIELD_NUMBER = 4;
        public static final int BORDERCOLORS_FIELD_NUMBER = 5;
        public static final int BORDERCOLOR_FIELD_NUMBER = 3;
        private static final BulletCommentStyle DEFAULT_INSTANCE;
        public static final int OPACITY_FIELD_NUMBER = 2;
        private static volatile i860<BulletCommentStyle> PARSER;
        private int bitField0_;
        private long opacity_;
        private C3414l.h<String> backgroundColors_ = GeneratedMessageLite.emptyProtobufList();
        private String borderColor_ = "";
        private String backgroundUrl_ = "";
        private C3414l.h<String> borderColors_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<BulletCommentStyle, Builder> implements BulletCommentStyleOrBuilder {
            private Builder() {
                super(BulletCommentStyle.DEFAULT_INSTANCE);
            }

            public Builder addAllBackgroundColors(Iterable<String> iterable) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addAllBackgroundColors(iterable);
                return this;
            }

            public Builder addAllBorderColors(Iterable<String> iterable) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addAllBorderColors(iterable);
                return this;
            }

            public Builder addBackgroundColors(String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addBackgroundColors(str);
                return this;
            }

            public Builder addBackgroundColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addBackgroundColorsBytes(byteString);
                return this;
            }

            public Builder addBorderColors(String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addBorderColors(str);
                return this;
            }

            public Builder addBorderColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).addBorderColorsBytes(byteString);
                return this;
            }

            public Builder clearBackgroundColors() {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).clearBackgroundColors();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearBorderColor() {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).clearBorderColor();
                return this;
            }

            public Builder clearBorderColors() {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).clearBorderColors();
                return this;
            }

            public Builder clearOpacity() {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).clearOpacity();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public String getBackgroundColors(int i) {
                return ((BulletCommentStyle) this.instance).getBackgroundColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public ByteString getBackgroundColorsBytes(int i) {
                return ((BulletCommentStyle) this.instance).getBackgroundColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public int getBackgroundColorsCount() {
                return ((BulletCommentStyle) this.instance).getBackgroundColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public List<String> getBackgroundColorsList() {
                return Collections.unmodifiableList(((BulletCommentStyle) this.instance).getBackgroundColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public String getBackgroundUrl() {
                return ((BulletCommentStyle) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((BulletCommentStyle) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public String getBorderColor() {
                return ((BulletCommentStyle) this.instance).getBorderColor();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public ByteString getBorderColorBytes() {
                return ((BulletCommentStyle) this.instance).getBorderColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public String getBorderColors(int i) {
                return ((BulletCommentStyle) this.instance).getBorderColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public ByteString getBorderColorsBytes(int i) {
                return ((BulletCommentStyle) this.instance).getBorderColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public int getBorderColorsCount() {
                return ((BulletCommentStyle) this.instance).getBorderColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public List<String> getBorderColorsList() {
                return Collections.unmodifiableList(((BulletCommentStyle) this.instance).getBorderColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
            public long getOpacity() {
                return ((BulletCommentStyle) this.instance).getOpacity();
            }

            public Builder setBackgroundColors(int i, String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBackgroundColors(i, str);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setBorderColor(String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBorderColor(str);
                return this;
            }

            public Builder setBorderColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBorderColorBytes(byteString);
                return this;
            }

            public Builder setBorderColors(int i, String str) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setBorderColors(i, str);
                return this;
            }

            public Builder setOpacity(long j) {
                copyOnWrite();
                ((BulletCommentStyle) this.instance).setOpacity(j);
                return this;
            }
        }

        static {
            BulletCommentStyle bulletCommentStyle = new BulletCommentStyle();
            DEFAULT_INSTANCE = bulletCommentStyle;
            bulletCommentStyle.makeImmutable();
        }

        private BulletCommentStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBackgroundColors(Iterable<String> iterable) {
            ensureBackgroundColorsIsMutable();
            AbstractC3403a.addAll(iterable, this.backgroundColors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBorderColors(Iterable<String> iterable) {
            ensureBorderColorsIsMutable();
            AbstractC3403a.addAll(iterable, this.borderColors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBackgroundColors(String str) {
            str.getClass();
            ensureBackgroundColorsIsMutable();
            this.backgroundColors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBackgroundColorsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureBackgroundColorsIsMutable();
            this.backgroundColors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBorderColors(String str) {
            str.getClass();
            ensureBorderColorsIsMutable();
            this.borderColors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBorderColorsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            ensureBorderColorsIsMutable();
            this.borderColors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColors() {
            this.backgroundColors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBorderColor() {
            this.borderColor_ = getDefaultInstance().getBorderColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBorderColors() {
            this.borderColors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpacity() {
            this.opacity_ = 0L;
        }

        private void ensureBackgroundColorsIsMutable() {
            if (this.backgroundColors_.mo17085q()) {
                return;
            }
            this.backgroundColors_ = GeneratedMessageLite.mutableCopy(this.backgroundColors_);
        }

        private void ensureBorderColorsIsMutable() {
            if (this.borderColors_.mo17085q()) {
                return;
            }
            this.borderColors_ = GeneratedMessageLite.mutableCopy(this.borderColors_);
        }

        public static BulletCommentStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(BulletCommentStyle bulletCommentStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bulletCommentStyle);
        }

        public static BulletCommentStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BulletCommentStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<BulletCommentStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColors(int i, String str) {
            str.getClass();
            ensureBackgroundColorsIsMutable();
            this.backgroundColors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColor(String str) {
            str.getClass();
            this.borderColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.borderColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColors(int i, String str) {
            str.getClass();
            ensureBorderColorsIsMutable();
            this.borderColors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpacity(long j) {
            this.opacity_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BulletCommentStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.backgroundColors_.mo17084n();
                    this.borderColors_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    BulletCommentStyle bulletCommentStyle = (BulletCommentStyle) obj2;
                    this.backgroundColors_ = interfaceC3386h.mo16998g(this.backgroundColors_, bulletCommentStyle.backgroundColors_);
                    long j = this.opacity_;
                    boolean z2 = j != 0;
                    long j2 = bulletCommentStyle.opacity_;
                    this.opacity_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.borderColor_ = interfaceC3386h.mo16997f(!this.borderColor_.isEmpty(), this.borderColor_, !bulletCommentStyle.borderColor_.isEmpty(), bulletCommentStyle.borderColor_);
                    this.backgroundUrl_ = interfaceC3386h.mo16997f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !bulletCommentStyle.backgroundUrl_.isEmpty(), bulletCommentStyle.backgroundUrl_);
                    this.borderColors_ = interfaceC3386h.mo16998g(this.borderColors_, bulletCommentStyle.borderColors_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= bulletCommentStyle.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.backgroundColors_.mo17085q()) {
                                        this.backgroundColors_ = GeneratedMessageLite.mutableCopy(this.backgroundColors_);
                                    }
                                    this.backgroundColors_.add(strM17115L);
                                } else if (iM17116M == 16) {
                                    this.opacity_ = c3407e.m17142v();
                                } else if (iM17116M == 26) {
                                    this.borderColor_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.backgroundUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    String strM17115L2 = c3407e.m17115L();
                                    if (!this.borderColors_.mo17085q()) {
                                        this.borderColors_ = GeneratedMessageLite.mutableCopy(this.borderColors_);
                                    }
                                    this.borderColors_.add(strM17115L2);
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
                        synchronized (BulletCommentStyle.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public String getBackgroundColors(int i) {
            return this.backgroundColors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public ByteString getBackgroundColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.backgroundColors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public int getBackgroundColorsCount() {
            return this.backgroundColors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public List<String> getBackgroundColorsList() {
            return this.backgroundColors_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public String getBorderColor() {
            return this.borderColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public ByteString getBorderColorBytes() {
            return ByteString.copyFromUtf8(this.borderColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public String getBorderColors(int i) {
            return this.borderColors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public ByteString getBorderColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.borderColors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public int getBorderColorsCount() {
            return this.borderColors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public List<String> getBorderColorsList() {
            return this.borderColors_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.BulletCommentStyleOrBuilder
        public long getOpacity() {
            return this.opacity_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16902L = 0;
            for (int i2 = 0; i2 < this.backgroundColors_.size(); i2++) {
                iM16902L += CodedOutputStream.m16902L(this.backgroundColors_.get(i2));
            }
            int size = iM16902L + getBackgroundColorsList().size();
            long j = this.opacity_;
            if (j != 0) {
                size += CodedOutputStream.m16931v(2, j);
            }
            if (!this.borderColor_.isEmpty()) {
                size += CodedOutputStream.m16901K(3, getBorderColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                size += CodedOutputStream.m16901K(4, getBackgroundUrl());
            }
            int iM16902L2 = 0;
            for (int i3 = 0; i3 < this.borderColors_.size(); i3++) {
                iM16902L2 += CodedOutputStream.m16902L(this.borderColors_.get(i3));
            }
            int size2 = size + iM16902L2 + getBorderColorsList().size();
            this.memoizedSerializedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.backgroundColors_.size(); i++) {
                codedOutputStream.mo16939D0(1, this.backgroundColors_.get(i));
            }
            long j = this.opacity_;
            if (j != 0) {
                codedOutputStream.m16972u0(2, j);
            }
            if (!this.borderColor_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getBorderColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getBackgroundUrl());
            }
            for (int i2 = 0; i2 < this.borderColors_.size(); i2++) {
                codedOutputStream.mo16939D0(5, this.borderColors_.get(i2));
            }
        }

        public static BulletCommentStyle parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static BulletCommentStyle parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static BulletCommentStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BulletCommentStyle parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static BulletCommentStyle parseFrom(InputStream inputStream) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BulletCommentStyle parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static BulletCommentStyle parseFrom(C3407e c3407e) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BulletCommentStyle parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (BulletCommentStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum FakeType implements C3414l.c {
        system(0),
        voiceMask(1),
        mystery(2),
        UNRECOGNIZED(-1);

        private static final C3414l.d<FakeType> internalValueMap = new C3414l.d<FakeType>() { // from class: com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeType.1
            @Override // com.google.protobuf.C3414l.d
            public FakeType findValueByNumber(int i) {
                return FakeType.forNumber(i);
            }
        };
        public static final int mystery_VALUE = 2;
        public static final int system_VALUE = 0;
        public static final int voiceMask_VALUE = 1;
        private final int value;

        FakeType(int i) {
            this.value = i;
        }

        public static FakeType forNumber(int i) {
            if (i == 0) {
                return system;
            }
            if (i == 1) {
                return voiceMask;
            }
            if (i != 2) {
                return null;
            }
            return mystery;
        }

        public static C3414l.d<FakeType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FakeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class FakeUserAvatarConfig extends GeneratedMessageLite<FakeUserAvatarConfig, Builder> implements FakeUserAvatarConfigOrBuilder {
        private static final FakeUserAvatarConfig DEFAULT_INSTANCE;
        public static final int FRAMECONFIG_FIELD_NUMBER = 1;
        private static volatile i860<FakeUserAvatarConfig> PARSER;
        private FakeUserPictureConfig frameConfig_;

        static {
            FakeUserAvatarConfig fakeUserAvatarConfig = new FakeUserAvatarConfig();
            DEFAULT_INSTANCE = fakeUserAvatarConfig;
            fakeUserAvatarConfig.makeImmutable();
        }

        private FakeUserAvatarConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameConfig() {
            this.frameConfig_ = null;
        }

        public static FakeUserAvatarConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            FakeUserPictureConfig fakeUserPictureConfig2 = this.frameConfig_;
            if (fakeUserPictureConfig2 == null || fakeUserPictureConfig2 == FakeUserPictureConfig.getDefaultInstance()) {
                this.frameConfig_ = fakeUserPictureConfig;
            } else {
                this.frameConfig_ = FakeUserPictureConfig.newBuilder(this.frameConfig_).mergeFrom(fakeUserPictureConfig).buildPartial();
            }
        }

        public static Builder newBuilder(FakeUserAvatarConfig fakeUserAvatarConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fakeUserAvatarConfig);
        }

        public static FakeUserAvatarConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserAvatarConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<FakeUserAvatarConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(FakeUserPictureConfig.Builder builder) {
            this.frameConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FakeUserAvatarConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.frameConfig_ = (FakeUserPictureConfig) ((GeneratedMessageLite.InterfaceC3386h) obj).mo17006o(this.frameConfig_, ((FakeUserAvatarConfig) obj2).frameConfig_);
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
                                    FakeUserPictureConfig fakeUserPictureConfig = this.frameConfig_;
                                    FakeUserPictureConfig.Builder builder = fakeUserPictureConfig != null ? fakeUserPictureConfig.toBuilder() : null;
                                    FakeUserPictureConfig fakeUserPictureConfig2 = (FakeUserPictureConfig) c3407e.m17143w(FakeUserPictureConfig.parser(), c3410h);
                                    this.frameConfig_ = fakeUserPictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(fakeUserPictureConfig2);
                                        this.frameConfig_ = builder.buildPartial();
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
                        synchronized (FakeUserAvatarConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserAvatarConfigOrBuilder
        public FakeUserPictureConfig getFrameConfig() {
            FakeUserPictureConfig fakeUserPictureConfig = this.frameConfig_;
            return fakeUserPictureConfig == null ? FakeUserPictureConfig.getDefaultInstance() : fakeUserPictureConfig;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.frameConfig_ != null ? CodedOutputStream.m16893C(1, getFrameConfig()) : 0;
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserAvatarConfigOrBuilder
        public boolean hasFrameConfig() {
            return this.frameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.frameConfig_ != null) {
                codedOutputStream.mo16974w0(1, getFrameConfig());
            }
        }

        public static FakeUserAvatarConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserAvatarConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            fakeUserPictureConfig.getClass();
            this.frameConfig_ = fakeUserPictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<FakeUserAvatarConfig, Builder> implements FakeUserAvatarConfigOrBuilder {
            private Builder() {
                super(FakeUserAvatarConfig.DEFAULT_INSTANCE);
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((FakeUserAvatarConfig) this.instance).clearFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserAvatarConfigOrBuilder
            public FakeUserPictureConfig getFrameConfig() {
                return ((FakeUserAvatarConfig) this.instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserAvatarConfigOrBuilder
            public boolean hasFrameConfig() {
                return ((FakeUserAvatarConfig) this.instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserAvatarConfig) this.instance).mergeFrameConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder setFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserAvatarConfig) this.instance).setFrameConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder setFrameConfig(FakeUserPictureConfig.Builder builder) {
                copyOnWrite();
                ((FakeUserAvatarConfig) this.instance).setFrameConfig(builder);
                return this;
            }
        }

        public static FakeUserAvatarConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FakeUserAvatarConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static FakeUserAvatarConfig parseFrom(InputStream inputStream) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserAvatarConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserAvatarConfig parseFrom(C3407e c3407e) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FakeUserAvatarConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (FakeUserAvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class FakeUserMask extends GeneratedMessageLite<FakeUserMask, Builder> implements FakeUserMaskOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 8;
        public static final int AVATAR_FIELD_NUMBER = 7;
        public static final int COLOR_FIELD_NUMBER = 10;
        private static final FakeUserMask DEFAULT_INSTANCE;
        public static final int FAKEID_FIELD_NUMBER = 4;
        public static final int FAKETYPE_FIELD_NUMBER = 2;
        public static final int GENDER_FIELD_NUMBER = 6;
        public static final int ICON_FIELD_NUMBER = 11;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ISFRESH_FIELD_NUMBER = 12;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int ORIGINUSERID_FIELD_NUMBER = 13;
        private static volatile i860<FakeUserMask> PARSER = null;
        public static final int PROFILECONFIG_FIELD_NUMBER = 9;
        public static final int USERID_FIELD_NUMBER = 3;
        private FakeUserAvatarConfig avatarConfig_;
        private int fakeType_;
        private boolean isFresh_;
        private FakeUserProfileConfig profileConfig_;
        private String id_ = "";
        private String userId_ = "";
        private String fakeId_ = "";
        private String name_ = "";
        private String gender_ = "";
        private String avatar_ = "";
        private String color_ = "";
        private String icon_ = "";
        private String originUserId_ = "";

        static {
            FakeUserMask fakeUserMask = new FakeUserMask();
            DEFAULT_INSTANCE = fakeUserMask;
            fakeUserMask.makeImmutable();
        }

        private FakeUserMask() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarConfig() {
            this.avatarConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFakeId() {
            this.fakeId_ = getDefaultInstance().getFakeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFakeType() {
            this.fakeType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFresh() {
            this.isFresh_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginUserId() {
            this.originUserId_ = getDefaultInstance().getOriginUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileConfig() {
            this.profileConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static FakeUserMask getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvatarConfig(FakeUserAvatarConfig fakeUserAvatarConfig) {
            FakeUserAvatarConfig fakeUserAvatarConfig2 = this.avatarConfig_;
            if (fakeUserAvatarConfig2 == null || fakeUserAvatarConfig2 == FakeUserAvatarConfig.getDefaultInstance()) {
                this.avatarConfig_ = fakeUserAvatarConfig;
            } else {
                this.avatarConfig_ = FakeUserAvatarConfig.newBuilder(this.avatarConfig_).mergeFrom(fakeUserAvatarConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeProfileConfig(FakeUserProfileConfig fakeUserProfileConfig) {
            FakeUserProfileConfig fakeUserProfileConfig2 = this.profileConfig_;
            if (fakeUserProfileConfig2 == null || fakeUserProfileConfig2 == FakeUserProfileConfig.getDefaultInstance()) {
                this.profileConfig_ = fakeUserProfileConfig;
            } else {
                this.profileConfig_ = FakeUserProfileConfig.newBuilder(this.profileConfig_).mergeFrom(fakeUserProfileConfig).buildPartial();
            }
        }

        public static Builder newBuilder(FakeUserMask fakeUserMask) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fakeUserMask);
        }

        public static FakeUserMask parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<FakeUserMask> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatar(String str) {
            str.getClass();
            this.avatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(FakeUserAvatarConfig.Builder builder) {
            this.avatarConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeId(String str) {
            str.getClass();
            this.fakeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.fakeId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeType(FakeType fakeType) {
            fakeType.getClass();
            this.fakeType_ = fakeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeTypeValue(int i) {
            this.fakeType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(String str) {
            str.getClass();
            this.gender_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.gender_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFresh(boolean z) {
            this.isFresh_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginUserId(String str) {
            str.getClass();
            this.originUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.originUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileConfig(FakeUserProfileConfig.Builder builder) {
            this.profileConfig_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FakeUserMask();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    FakeUserMask fakeUserMask = (FakeUserMask) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !fakeUserMask.id_.isEmpty(), fakeUserMask.id_);
                    int i = this.fakeType_;
                    boolean z2 = i != 0;
                    int i2 = fakeUserMask.fakeType_;
                    this.fakeType_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !fakeUserMask.userId_.isEmpty(), fakeUserMask.userId_);
                    this.fakeId_ = interfaceC3386h.mo16997f(!this.fakeId_.isEmpty(), this.fakeId_, !fakeUserMask.fakeId_.isEmpty(), fakeUserMask.fakeId_);
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !fakeUserMask.name_.isEmpty(), fakeUserMask.name_);
                    this.gender_ = interfaceC3386h.mo16997f(!this.gender_.isEmpty(), this.gender_, !fakeUserMask.gender_.isEmpty(), fakeUserMask.gender_);
                    this.avatar_ = interfaceC3386h.mo16997f(!this.avatar_.isEmpty(), this.avatar_, !fakeUserMask.avatar_.isEmpty(), fakeUserMask.avatar_);
                    this.avatarConfig_ = (FakeUserAvatarConfig) interfaceC3386h.mo17006o(this.avatarConfig_, fakeUserMask.avatarConfig_);
                    this.profileConfig_ = (FakeUserProfileConfig) interfaceC3386h.mo17006o(this.profileConfig_, fakeUserMask.profileConfig_);
                    this.color_ = interfaceC3386h.mo16997f(!this.color_.isEmpty(), this.color_, !fakeUserMask.color_.isEmpty(), fakeUserMask.color_);
                    this.icon_ = interfaceC3386h.mo16997f(!this.icon_.isEmpty(), this.icon_, !fakeUserMask.icon_.isEmpty(), fakeUserMask.icon_);
                    boolean z3 = this.isFresh_;
                    boolean z4 = fakeUserMask.isFresh_;
                    this.isFresh_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    this.originUserId_ = interfaceC3386h.mo16997f(!this.originUserId_.isEmpty(), this.originUserId_, !fakeUserMask.originUserId_.isEmpty(), fakeUserMask.originUserId_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case 16:
                                    this.fakeType_ = c3407e.m17136p();
                                    continue;
                                case 26:
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.fakeId_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.name_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.gender_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.avatar_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    FakeUserAvatarConfig fakeUserAvatarConfig = this.avatarConfig_;
                                    FakeUserAvatarConfig.Builder builder = fakeUserAvatarConfig != null ? fakeUserAvatarConfig.toBuilder() : null;
                                    FakeUserAvatarConfig fakeUserAvatarConfig2 = (FakeUserAvatarConfig) c3407e.m17143w(FakeUserAvatarConfig.parser(), c3410h);
                                    this.avatarConfig_ = fakeUserAvatarConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(fakeUserAvatarConfig2);
                                        this.avatarConfig_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    FakeUserProfileConfig fakeUserProfileConfig = this.profileConfig_;
                                    FakeUserProfileConfig.Builder builder2 = fakeUserProfileConfig != null ? fakeUserProfileConfig.toBuilder() : null;
                                    FakeUserProfileConfig fakeUserProfileConfig2 = (FakeUserProfileConfig) c3407e.m17143w(FakeUserProfileConfig.parser(), c3410h);
                                    this.profileConfig_ = fakeUserProfileConfig2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(fakeUserProfileConfig2);
                                        this.profileConfig_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.color_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    this.icon_ = c3407e.m17115L();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.isFresh_ = c3407e.m17133m();
                                    continue;
                                case 106:
                                    this.originUserId_ = c3407e.m17115L();
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
                        synchronized (FakeUserMask.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public FakeUserAvatarConfig getAvatarConfig() {
            FakeUserAvatarConfig fakeUserAvatarConfig = this.avatarConfig_;
            return fakeUserAvatarConfig == null ? FakeUserAvatarConfig.getDefaultInstance() : fakeUserAvatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getFakeId() {
            return this.fakeId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getFakeIdBytes() {
            return ByteString.copyFromUtf8(this.fakeId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public FakeType getFakeType() {
            FakeType fakeTypeForNumber = FakeType.forNumber(this.fakeType_);
            return fakeTypeForNumber == null ? FakeType.UNRECOGNIZED : fakeTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public int getFakeTypeValue() {
            return this.fakeType_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public boolean getIsFresh() {
            return this.isFresh_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getOriginUserId() {
            return this.originUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getOriginUserIdBytes() {
            return ByteString.copyFromUtf8(this.originUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public FakeUserProfileConfig getProfileConfig() {
            FakeUserProfileConfig fakeUserProfileConfig = this.profileConfig_;
            return fakeUserProfileConfig == null ? FakeUserProfileConfig.getDefaultInstance() : fakeUserProfileConfig;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (this.fakeType_ != FakeType.system.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(2, this.fakeType_);
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getUserId());
            }
            if (!this.fakeId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getFakeId());
            }
            if (!this.name_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getName());
            }
            if (!this.gender_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getGender());
            }
            if (!this.avatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getAvatar());
            }
            if (this.avatarConfig_ != null) {
                iM16901K += CodedOutputStream.m16893C(8, getAvatarConfig());
            }
            if (this.profileConfig_ != null) {
                iM16901K += CodedOutputStream.m16893C(9, getProfileConfig());
            }
            if (!this.color_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getColor());
            }
            if (!this.icon_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getIcon());
            }
            boolean z = this.isFresh_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(12, z);
            }
            if (!this.originUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(13, getOriginUserId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
        public boolean hasProfileConfig() {
            return this.profileConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (this.fakeType_ != FakeType.system.getNumber()) {
                codedOutputStream.m16960i0(2, this.fakeType_);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getUserId());
            }
            if (!this.fakeId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getFakeId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getName());
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getGender());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getAvatar());
            }
            if (this.avatarConfig_ != null) {
                codedOutputStream.mo16974w0(8, getAvatarConfig());
            }
            if (this.profileConfig_ != null) {
                codedOutputStream.mo16974w0(9, getProfileConfig());
            }
            if (!this.color_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getColor());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getIcon());
            }
            boolean z = this.isFresh_;
            if (z) {
                codedOutputStream.mo16950a0(12, z);
            }
            if (this.originUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(13, getOriginUserId());
        }

        public static FakeUserMask parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserMask parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(FakeUserAvatarConfig fakeUserAvatarConfig) {
            fakeUserAvatarConfig.getClass();
            this.avatarConfig_ = fakeUserAvatarConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileConfig(FakeUserProfileConfig fakeUserProfileConfig) {
            fakeUserProfileConfig.getClass();
            this.profileConfig_ = fakeUserProfileConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<FakeUserMask, Builder> implements FakeUserMaskOrBuilder {
            private Builder() {
                super(FakeUserMask.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearAvatarConfig();
                return this;
            }

            public Builder clearColor() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearColor();
                return this;
            }

            public Builder clearFakeId() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearFakeId();
                return this;
            }

            public Builder clearFakeType() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearFakeType();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearGender();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearIcon();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearId();
                return this;
            }

            public Builder clearIsFresh() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearIsFresh();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearName();
                return this;
            }

            public Builder clearOriginUserId() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearOriginUserId();
                return this;
            }

            public Builder clearProfileConfig() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearProfileConfig();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((FakeUserMask) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getAvatar() {
                return ((FakeUserMask) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getAvatarBytes() {
                return ((FakeUserMask) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public FakeUserAvatarConfig getAvatarConfig() {
                return ((FakeUserMask) this.instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getColor() {
                return ((FakeUserMask) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getColorBytes() {
                return ((FakeUserMask) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getFakeId() {
                return ((FakeUserMask) this.instance).getFakeId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getFakeIdBytes() {
                return ((FakeUserMask) this.instance).getFakeIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public FakeType getFakeType() {
                return ((FakeUserMask) this.instance).getFakeType();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public int getFakeTypeValue() {
                return ((FakeUserMask) this.instance).getFakeTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getGender() {
                return ((FakeUserMask) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getGenderBytes() {
                return ((FakeUserMask) this.instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getIcon() {
                return ((FakeUserMask) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getIconBytes() {
                return ((FakeUserMask) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getId() {
                return ((FakeUserMask) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getIdBytes() {
                return ((FakeUserMask) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public boolean getIsFresh() {
                return ((FakeUserMask) this.instance).getIsFresh();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getName() {
                return ((FakeUserMask) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getNameBytes() {
                return ((FakeUserMask) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getOriginUserId() {
                return ((FakeUserMask) this.instance).getOriginUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getOriginUserIdBytes() {
                return ((FakeUserMask) this.instance).getOriginUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public FakeUserProfileConfig getProfileConfig() {
                return ((FakeUserMask) this.instance).getProfileConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public String getUserId() {
                return ((FakeUserMask) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public ByteString getUserIdBytes() {
                return ((FakeUserMask) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public boolean hasAvatarConfig() {
                return ((FakeUserMask) this.instance).hasAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserMaskOrBuilder
            public boolean hasProfileConfig() {
                return ((FakeUserMask) this.instance).hasProfileConfig();
            }

            public Builder mergeAvatarConfig(FakeUserAvatarConfig fakeUserAvatarConfig) {
                copyOnWrite();
                ((FakeUserMask) this.instance).mergeAvatarConfig(fakeUserAvatarConfig);
                return this;
            }

            public Builder mergeProfileConfig(FakeUserProfileConfig fakeUserProfileConfig) {
                copyOnWrite();
                ((FakeUserMask) this.instance).mergeProfileConfig(fakeUserProfileConfig);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(FakeUserAvatarConfig fakeUserAvatarConfig) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setAvatarConfig(fakeUserAvatarConfig);
                return this;
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setColorBytes(byteString);
                return this;
            }

            public Builder setFakeId(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setFakeId(str);
                return this;
            }

            public Builder setFakeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setFakeIdBytes(byteString);
                return this;
            }

            public Builder setFakeType(FakeType fakeType) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setFakeType(fakeType);
                return this;
            }

            public Builder setFakeTypeValue(int i) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setFakeTypeValue(i);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setIsFresh(boolean z) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setIsFresh(z);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOriginUserId(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setOriginUserId(str);
                return this;
            }

            public Builder setOriginUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setOriginUserIdBytes(byteString);
                return this;
            }

            public Builder setProfileConfig(FakeUserProfileConfig fakeUserProfileConfig) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setProfileConfig(fakeUserProfileConfig);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(FakeUserAvatarConfig.Builder builder) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setAvatarConfig(builder);
                return this;
            }

            public Builder setProfileConfig(FakeUserProfileConfig.Builder builder) {
                copyOnWrite();
                ((FakeUserMask) this.instance).setProfileConfig(builder);
                return this;
            }
        }

        public static FakeUserMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FakeUserMask parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static FakeUserMask parseFrom(InputStream inputStream) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserMask parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserMask parseFrom(C3407e c3407e) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FakeUserMask parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (FakeUserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class FakeUserPictureConfig extends GeneratedMessageLite<FakeUserPictureConfig, Builder> implements FakeUserPictureConfigOrBuilder {
        private static final FakeUserPictureConfig DEFAULT_INSTANCE;
        public static final int DYNAMICURL_FIELD_NUMBER = 2;
        private static volatile i860<FakeUserPictureConfig> PARSER = null;
        public static final int STATICURL_FIELD_NUMBER = 1;
        private String staticUrl_ = "";
        private String dynamicUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<FakeUserPictureConfig, Builder> implements FakeUserPictureConfigOrBuilder {
            private Builder() {
                super(FakeUserPictureConfig.DEFAULT_INSTANCE);
            }

            public Builder clearDynamicUrl() {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).clearDynamicUrl();
                return this;
            }

            public Builder clearStaticUrl() {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).clearStaticUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
            public String getDynamicUrl() {
                return ((FakeUserPictureConfig) this.instance).getDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
            public ByteString getDynamicUrlBytes() {
                return ((FakeUserPictureConfig) this.instance).getDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
            public String getStaticUrl() {
                return ((FakeUserPictureConfig) this.instance).getStaticUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
            public ByteString getStaticUrlBytes() {
                return ((FakeUserPictureConfig) this.instance).getStaticUrlBytes();
            }

            public Builder setDynamicUrl(String str) {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).setDynamicUrl(str);
                return this;
            }

            public Builder setDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).setDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setStaticUrl(String str) {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).setStaticUrl(str);
                return this;
            }

            public Builder setStaticUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((FakeUserPictureConfig) this.instance).setStaticUrlBytes(byteString);
                return this;
            }
        }

        static {
            FakeUserPictureConfig fakeUserPictureConfig = new FakeUserPictureConfig();
            DEFAULT_INSTANCE = fakeUserPictureConfig;
            fakeUserPictureConfig.makeImmutable();
        }

        private FakeUserPictureConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicUrl() {
            this.dynamicUrl_ = getDefaultInstance().getDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticUrl() {
            this.staticUrl_ = getDefaultInstance().getStaticUrl();
        }

        public static FakeUserPictureConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(FakeUserPictureConfig fakeUserPictureConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fakeUserPictureConfig);
        }

        public static FakeUserPictureConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserPictureConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<FakeUserPictureConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrl(String str) {
            str.getClass();
            this.dynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.dynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrl(String str) {
            str.getClass();
            this.staticUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.staticUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FakeUserPictureConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    FakeUserPictureConfig fakeUserPictureConfig = (FakeUserPictureConfig) obj2;
                    this.staticUrl_ = interfaceC3386h.mo16997f(!this.staticUrl_.isEmpty(), this.staticUrl_, !fakeUserPictureConfig.staticUrl_.isEmpty(), fakeUserPictureConfig.staticUrl_);
                    this.dynamicUrl_ = interfaceC3386h.mo16997f(!this.dynamicUrl_.isEmpty(), this.dynamicUrl_, true ^ fakeUserPictureConfig.dynamicUrl_.isEmpty(), fakeUserPictureConfig.dynamicUrl_);
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
                                    this.staticUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.dynamicUrl_ = c3407e.m17115L();
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
                        synchronized (FakeUserPictureConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
        public String getDynamicUrl() {
            return this.dynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
        public ByteString getDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.dynamicUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.staticUrl_.isEmpty() ? CodedOutputStream.m16901K(1, getStaticUrl()) : 0;
            if (!this.dynamicUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getDynamicUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
        public String getStaticUrl() {
            return this.staticUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserPictureConfigOrBuilder
        public ByteString getStaticUrlBytes() {
            return ByteString.copyFromUtf8(this.staticUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.staticUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getStaticUrl());
            }
            if (this.dynamicUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getDynamicUrl());
        }

        public static FakeUserPictureConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserPictureConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static FakeUserPictureConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FakeUserPictureConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static FakeUserPictureConfig parseFrom(InputStream inputStream) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserPictureConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserPictureConfig parseFrom(C3407e c3407e) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FakeUserPictureConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (FakeUserPictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class FakeUserProfileConfig extends GeneratedMessageLite<FakeUserProfileConfig, Builder> implements FakeUserProfileConfigOrBuilder {
        public static final int BACKGROUNDPICTURECONFIG_FIELD_NUMBER = 1;
        private static final FakeUserProfileConfig DEFAULT_INSTANCE;
        private static volatile i860<FakeUserProfileConfig> PARSER = null;
        public static final int TOPFRAMECONFIG_FIELD_NUMBER = 2;
        private FakeUserPictureConfig backgroundPictureConfig_;
        private FakeUserPictureConfig topFrameConfig_;

        static {
            FakeUserProfileConfig fakeUserProfileConfig = new FakeUserProfileConfig();
            DEFAULT_INSTANCE = fakeUserProfileConfig;
            fakeUserProfileConfig.makeImmutable();
        }

        private FakeUserProfileConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundPictureConfig() {
            this.backgroundPictureConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopFrameConfig() {
            this.topFrameConfig_ = null;
        }

        public static FakeUserProfileConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackgroundPictureConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            FakeUserPictureConfig fakeUserPictureConfig2 = this.backgroundPictureConfig_;
            if (fakeUserPictureConfig2 == null || fakeUserPictureConfig2 == FakeUserPictureConfig.getDefaultInstance()) {
                this.backgroundPictureConfig_ = fakeUserPictureConfig;
            } else {
                this.backgroundPictureConfig_ = FakeUserPictureConfig.newBuilder(this.backgroundPictureConfig_).mergeFrom(fakeUserPictureConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTopFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            FakeUserPictureConfig fakeUserPictureConfig2 = this.topFrameConfig_;
            if (fakeUserPictureConfig2 == null || fakeUserPictureConfig2 == FakeUserPictureConfig.getDefaultInstance()) {
                this.topFrameConfig_ = fakeUserPictureConfig;
            } else {
                this.topFrameConfig_ = FakeUserPictureConfig.newBuilder(this.topFrameConfig_).mergeFrom(fakeUserPictureConfig).buildPartial();
            }
        }

        public static Builder newBuilder(FakeUserProfileConfig fakeUserProfileConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fakeUserProfileConfig);
        }

        public static FakeUserProfileConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserProfileConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<FakeUserProfileConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundPictureConfig(FakeUserPictureConfig.Builder builder) {
            this.backgroundPictureConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopFrameConfig(FakeUserPictureConfig.Builder builder) {
            this.topFrameConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FakeUserProfileConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    FakeUserProfileConfig fakeUserProfileConfig = (FakeUserProfileConfig) obj2;
                    this.backgroundPictureConfig_ = (FakeUserPictureConfig) interfaceC3386h.mo17006o(this.backgroundPictureConfig_, fakeUserProfileConfig.backgroundPictureConfig_);
                    this.topFrameConfig_ = (FakeUserPictureConfig) interfaceC3386h.mo17006o(this.topFrameConfig_, fakeUserProfileConfig.topFrameConfig_);
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
                                    FakeUserPictureConfig fakeUserPictureConfig = this.backgroundPictureConfig_;
                                    FakeUserPictureConfig.Builder builder = fakeUserPictureConfig != null ? fakeUserPictureConfig.toBuilder() : null;
                                    FakeUserPictureConfig fakeUserPictureConfig2 = (FakeUserPictureConfig) c3407e.m17143w(FakeUserPictureConfig.parser(), c3410h);
                                    this.backgroundPictureConfig_ = fakeUserPictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(fakeUserPictureConfig2);
                                        this.backgroundPictureConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 18) {
                                    FakeUserPictureConfig fakeUserPictureConfig3 = this.topFrameConfig_;
                                    FakeUserPictureConfig.Builder builder2 = fakeUserPictureConfig3 != null ? fakeUserPictureConfig3.toBuilder() : null;
                                    FakeUserPictureConfig fakeUserPictureConfig4 = (FakeUserPictureConfig) c3407e.m17143w(FakeUserPictureConfig.parser(), c3410h);
                                    this.topFrameConfig_ = fakeUserPictureConfig4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(fakeUserPictureConfig4);
                                        this.topFrameConfig_ = builder2.buildPartial();
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
                        synchronized (FakeUserProfileConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
        public FakeUserPictureConfig getBackgroundPictureConfig() {
            FakeUserPictureConfig fakeUserPictureConfig = this.backgroundPictureConfig_;
            return fakeUserPictureConfig == null ? FakeUserPictureConfig.getDefaultInstance() : fakeUserPictureConfig;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.backgroundPictureConfig_ != null ? CodedOutputStream.m16893C(1, getBackgroundPictureConfig()) : 0;
            if (this.topFrameConfig_ != null) {
                iM16893C += CodedOutputStream.m16893C(2, getTopFrameConfig());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
        public FakeUserPictureConfig getTopFrameConfig() {
            FakeUserPictureConfig fakeUserPictureConfig = this.topFrameConfig_;
            return fakeUserPictureConfig == null ? FakeUserPictureConfig.getDefaultInstance() : fakeUserPictureConfig;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
        public boolean hasBackgroundPictureConfig() {
            return this.backgroundPictureConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
        public boolean hasTopFrameConfig() {
            return this.topFrameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.backgroundPictureConfig_ != null) {
                codedOutputStream.mo16974w0(1, getBackgroundPictureConfig());
            }
            if (this.topFrameConfig_ != null) {
                codedOutputStream.mo16974w0(2, getTopFrameConfig());
            }
        }

        public static FakeUserProfileConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserProfileConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundPictureConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            fakeUserPictureConfig.getClass();
            this.backgroundPictureConfig_ = fakeUserPictureConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
            fakeUserPictureConfig.getClass();
            this.topFrameConfig_ = fakeUserPictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<FakeUserProfileConfig, Builder> implements FakeUserProfileConfigOrBuilder {
            private Builder() {
                super(FakeUserProfileConfig.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundPictureConfig() {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).clearBackgroundPictureConfig();
                return this;
            }

            public Builder clearTopFrameConfig() {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).clearTopFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
            public FakeUserPictureConfig getBackgroundPictureConfig() {
                return ((FakeUserProfileConfig) this.instance).getBackgroundPictureConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
            public FakeUserPictureConfig getTopFrameConfig() {
                return ((FakeUserProfileConfig) this.instance).getTopFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
            public boolean hasBackgroundPictureConfig() {
                return ((FakeUserProfileConfig) this.instance).hasBackgroundPictureConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.FakeUserProfileConfigOrBuilder
            public boolean hasTopFrameConfig() {
                return ((FakeUserProfileConfig) this.instance).hasTopFrameConfig();
            }

            public Builder mergeBackgroundPictureConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).mergeBackgroundPictureConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder mergeTopFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).mergeTopFrameConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder setBackgroundPictureConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).setBackgroundPictureConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder setTopFrameConfig(FakeUserPictureConfig fakeUserPictureConfig) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).setTopFrameConfig(fakeUserPictureConfig);
                return this;
            }

            public Builder setBackgroundPictureConfig(FakeUserPictureConfig.Builder builder) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).setBackgroundPictureConfig(builder);
                return this;
            }

            public Builder setTopFrameConfig(FakeUserPictureConfig.Builder builder) {
                copyOnWrite();
                ((FakeUserProfileConfig) this.instance).setTopFrameConfig(builder);
                return this;
            }
        }

        public static FakeUserProfileConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FakeUserProfileConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static FakeUserProfileConfig parseFrom(InputStream inputStream) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FakeUserProfileConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static FakeUserProfileConfig parseFrom(C3407e c3407e) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FakeUserProfileConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (FakeUserProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VideoLiveBulletComment extends GeneratedMessageLite<VideoLiveBulletComment, Builder> implements VideoLiveBulletCommentOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 14;
        private static final VideoLiveBulletComment DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 3;
        private static volatile i860<VideoLiveBulletComment> PARSER = null;
        public static final int PAYAMOUNT_FIELD_NUMBER = 13;
        public static final int PAYASSETID_FIELD_NUMBER = 12;
        public static final int PAYASSETTYPE_FIELD_NUMBER = 11;
        public static final int PRIORITY_FIELD_NUMBER = 15;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int SCENARIO_FIELD_NUMBER = 2;
        public static final int STYLE_FIELD_NUMBER = 16;
        public static final int SUBTYPE_FIELD_NUMBER = 10;
        public static final int TYPEID_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 9;
        public static final int USERHIERARCHY_FIELD_NUMBER = 6;
        private long payAmount_;
        private long priority_;
        private BulletCommentStyle style_;
        private long userHierarchy_;
        private String id_ = "";
        private String scenario_ = "";
        private String liveId_ = "";
        private String roomId_ = "";
        private String anchorId_ = "";
        private String iconUrl_ = "";
        private String typeId_ = "";
        private String type_ = "";
        private String subType_ = "";
        private String payAssetType_ = "";
        private String payAssetId_ = "";
        private String content_ = "";

        static {
            VideoLiveBulletComment videoLiveBulletComment = new VideoLiveBulletComment();
            DEFAULT_INSTANCE = videoLiveBulletComment;
            videoLiveBulletComment.makeImmutable();
        }

        private VideoLiveBulletComment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
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
        public void clearPayAmount() {
            this.payAmount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayAssetId() {
            this.payAssetId_ = getDefaultInstance().getPayAssetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayAssetType() {
            this.payAssetType_ = getDefaultInstance().getPayAssetType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScenario() {
            this.scenario_ = getDefaultInstance().getScenario();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStyle() {
            this.style_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubType() {
            this.subType_ = getDefaultInstance().getSubType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeId() {
            this.typeId_ = getDefaultInstance().getTypeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserHierarchy() {
            this.userHierarchy_ = 0L;
        }

        public static VideoLiveBulletComment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStyle(BulletCommentStyle bulletCommentStyle) {
            BulletCommentStyle bulletCommentStyle2 = this.style_;
            if (bulletCommentStyle2 == null || bulletCommentStyle2 == BulletCommentStyle.getDefaultInstance()) {
                this.style_ = bulletCommentStyle;
            } else {
                this.style_ = BulletCommentStyle.newBuilder(this.style_).mergeFrom(bulletCommentStyle).buildPartial();
            }
        }

        public static Builder newBuilder(VideoLiveBulletComment videoLiveBulletComment) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoLiveBulletComment);
        }

        public static VideoLiveBulletComment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLiveBulletComment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VideoLiveBulletComment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayAmount(long j) {
            this.payAmount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayAssetId(String str) {
            str.getClass();
            this.payAssetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayAssetIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.payAssetId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayAssetType(String str) {
            str.getClass();
            this.payAssetType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayAssetTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.payAssetType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(long j) {
            this.priority_ = j;
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
        public void setScenario(String str) {
            str.getClass();
            this.scenario_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScenarioBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.scenario_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyle(BulletCommentStyle.Builder builder) {
            this.style_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubType(String str) {
            str.getClass();
            this.subType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.subType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeId(String str) {
            str.getClass();
            this.typeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.typeId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserHierarchy(long j) {
            this.userHierarchy_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44481.f15959xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoLiveBulletComment();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VideoLiveBulletComment videoLiveBulletComment = (VideoLiveBulletComment) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !videoLiveBulletComment.id_.isEmpty(), videoLiveBulletComment.id_);
                    this.scenario_ = interfaceC3386h.mo16997f(!this.scenario_.isEmpty(), this.scenario_, !videoLiveBulletComment.scenario_.isEmpty(), videoLiveBulletComment.scenario_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !videoLiveBulletComment.liveId_.isEmpty(), videoLiveBulletComment.liveId_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !videoLiveBulletComment.roomId_.isEmpty(), videoLiveBulletComment.roomId_);
                    this.anchorId_ = interfaceC3386h.mo16997f(!this.anchorId_.isEmpty(), this.anchorId_, !videoLiveBulletComment.anchorId_.isEmpty(), videoLiveBulletComment.anchorId_);
                    long j = this.userHierarchy_;
                    boolean z2 = j != 0;
                    long j2 = videoLiveBulletComment.userHierarchy_;
                    this.userHierarchy_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.iconUrl_ = interfaceC3386h.mo16997f(!this.iconUrl_.isEmpty(), this.iconUrl_, !videoLiveBulletComment.iconUrl_.isEmpty(), videoLiveBulletComment.iconUrl_);
                    this.typeId_ = interfaceC3386h.mo16997f(!this.typeId_.isEmpty(), this.typeId_, !videoLiveBulletComment.typeId_.isEmpty(), videoLiveBulletComment.typeId_);
                    this.type_ = interfaceC3386h.mo16997f(!this.type_.isEmpty(), this.type_, !videoLiveBulletComment.type_.isEmpty(), videoLiveBulletComment.type_);
                    this.subType_ = interfaceC3386h.mo16997f(!this.subType_.isEmpty(), this.subType_, !videoLiveBulletComment.subType_.isEmpty(), videoLiveBulletComment.subType_);
                    this.payAssetType_ = interfaceC3386h.mo16997f(!this.payAssetType_.isEmpty(), this.payAssetType_, !videoLiveBulletComment.payAssetType_.isEmpty(), videoLiveBulletComment.payAssetType_);
                    this.payAssetId_ = interfaceC3386h.mo16997f(!this.payAssetId_.isEmpty(), this.payAssetId_, !videoLiveBulletComment.payAssetId_.isEmpty(), videoLiveBulletComment.payAssetId_);
                    long j3 = this.payAmount_;
                    boolean z3 = j3 != 0;
                    long j4 = videoLiveBulletComment.payAmount_;
                    this.payAmount_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    this.content_ = interfaceC3386h.mo16997f(!this.content_.isEmpty(), this.content_, !videoLiveBulletComment.content_.isEmpty(), videoLiveBulletComment.content_);
                    boolean z4 = false;
                    long j5 = this.priority_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = videoLiveBulletComment.priority_;
                    this.priority_ = interfaceC3386h.mo17000i(z4, j5, j6 != 0, j6);
                    this.style_ = (BulletCommentStyle) interfaceC3386h.mo17006o(this.style_, videoLiveBulletComment.style_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.scenario_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.anchorId_ = c3407e.m17115L();
                                    continue;
                                case 48:
                                    this.userHierarchy_ = c3407e.m17142v();
                                    continue;
                                case 58:
                                    this.iconUrl_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.typeId_ = c3407e.m17115L();
                                    continue;
                                case 74:
                                    this.type_ = c3407e.m17115L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.subType_ = c3407e.m17115L();
                                    continue;
                                case 90:
                                    this.payAssetType_ = c3407e.m17115L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.payAssetId_ = c3407e.m17115L();
                                    continue;
                                case 104:
                                    this.payAmount_ = c3407e.m17142v();
                                    continue;
                                case 114:
                                    this.content_ = c3407e.m17115L();
                                    continue;
                                case 120:
                                    this.priority_ = c3407e.m17142v();
                                    continue;
                                case 130:
                                    BulletCommentStyle bulletCommentStyle = this.style_;
                                    BulletCommentStyle.Builder builder = bulletCommentStyle != null ? bulletCommentStyle.toBuilder() : null;
                                    BulletCommentStyle bulletCommentStyle2 = (BulletCommentStyle) c3407e.m17143w(BulletCommentStyle.parser(), c3410h);
                                    this.style_ = bulletCommentStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(bulletCommentStyle2);
                                        this.style_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
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
                        synchronized (VideoLiveBulletComment.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public long getPayAmount() {
            return this.payAmount_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getPayAssetId() {
            return this.payAssetId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getPayAssetIdBytes() {
            return ByteString.copyFromUtf8(this.payAssetId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getPayAssetType() {
            return this.payAssetType_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getPayAssetTypeBytes() {
            return ByteString.copyFromUtf8(this.payAssetType_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public long getPriority() {
            return this.priority_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getScenario() {
            return this.scenario_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getScenarioBytes() {
            return ByteString.copyFromUtf8(this.scenario_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.scenario_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getScenario());
            }
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getLiveId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getRoomId());
            }
            if (!this.anchorId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getAnchorId());
            }
            long j = this.userHierarchy_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(6, j);
            }
            if (!this.iconUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getIconUrl());
            }
            if (!this.typeId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getTypeId());
            }
            if (!this.type_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getType());
            }
            if (!this.subType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(10, getSubType());
            }
            if (!this.payAssetType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getPayAssetType());
            }
            if (!this.payAssetId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(12, getPayAssetId());
            }
            long j2 = this.payAmount_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(13, j2);
            }
            if (!this.content_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(14, getContent());
            }
            long j3 = this.priority_;
            if (j3 != 0) {
                iM16901K += CodedOutputStream.m16931v(15, j3);
            }
            if (this.style_ != null) {
                iM16901K += CodedOutputStream.m16893C(16, getStyle());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public BulletCommentStyle getStyle() {
            BulletCommentStyle bulletCommentStyle = this.style_;
            return bulletCommentStyle == null ? BulletCommentStyle.getDefaultInstance() : bulletCommentStyle;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getSubType() {
            return this.subType_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getSubTypeBytes() {
            return ByteString.copyFromUtf8(this.subType_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public String getTypeId() {
            return this.typeId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public ByteString getTypeIdBytes() {
            return ByteString.copyFromUtf8(this.typeId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public long getUserHierarchy() {
            return this.userHierarchy_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
        public boolean hasStyle() {
            return this.style_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.scenario_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getScenario());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getLiveId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getRoomId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getAnchorId());
            }
            long j = this.userHierarchy_;
            if (j != 0) {
                codedOutputStream.m16972u0(6, j);
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getIconUrl());
            }
            if (!this.typeId_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getTypeId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getType());
            }
            if (!this.subType_.isEmpty()) {
                codedOutputStream.mo16939D0(10, getSubType());
            }
            if (!this.payAssetType_.isEmpty()) {
                codedOutputStream.mo16939D0(11, getPayAssetType());
            }
            if (!this.payAssetId_.isEmpty()) {
                codedOutputStream.mo16939D0(12, getPayAssetId());
            }
            long j2 = this.payAmount_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(13, j2);
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16939D0(14, getContent());
            }
            long j3 = this.priority_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(15, j3);
            }
            if (this.style_ != null) {
                codedOutputStream.mo16974w0(16, getStyle());
            }
        }

        public static VideoLiveBulletComment parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VideoLiveBulletComment parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyle(BulletCommentStyle bulletCommentStyle) {
            bulletCommentStyle.getClass();
            this.style_ = bulletCommentStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VideoLiveBulletComment, Builder> implements VideoLiveBulletCommentOrBuilder {
            private Builder() {
                super(VideoLiveBulletComment.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearContent();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearIconUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearLiveId();
                return this;
            }

            public Builder clearPayAmount() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearPayAmount();
                return this;
            }

            public Builder clearPayAssetId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearPayAssetId();
                return this;
            }

            public Builder clearPayAssetType() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearPayAssetType();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearPriority();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearRoomId();
                return this;
            }

            public Builder clearScenario() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearScenario();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearStyle();
                return this;
            }

            public Builder clearSubType() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearSubType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearType();
                return this;
            }

            public Builder clearTypeId() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearTypeId();
                return this;
            }

            public Builder clearUserHierarchy() {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).clearUserHierarchy();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getAnchorId() {
                return ((VideoLiveBulletComment) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getContent() {
                return ((VideoLiveBulletComment) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getContentBytes() {
                return ((VideoLiveBulletComment) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getIconUrl() {
                return ((VideoLiveBulletComment) this.instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getIconUrlBytes() {
                return ((VideoLiveBulletComment) this.instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getId() {
                return ((VideoLiveBulletComment) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getLiveId() {
                return ((VideoLiveBulletComment) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public long getPayAmount() {
                return ((VideoLiveBulletComment) this.instance).getPayAmount();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getPayAssetId() {
                return ((VideoLiveBulletComment) this.instance).getPayAssetId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getPayAssetIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getPayAssetIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getPayAssetType() {
                return ((VideoLiveBulletComment) this.instance).getPayAssetType();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getPayAssetTypeBytes() {
                return ((VideoLiveBulletComment) this.instance).getPayAssetTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public long getPriority() {
                return ((VideoLiveBulletComment) this.instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getRoomId() {
                return ((VideoLiveBulletComment) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getScenario() {
                return ((VideoLiveBulletComment) this.instance).getScenario();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getScenarioBytes() {
                return ((VideoLiveBulletComment) this.instance).getScenarioBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public BulletCommentStyle getStyle() {
                return ((VideoLiveBulletComment) this.instance).getStyle();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getSubType() {
                return ((VideoLiveBulletComment) this.instance).getSubType();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getSubTypeBytes() {
                return ((VideoLiveBulletComment) this.instance).getSubTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getType() {
                return ((VideoLiveBulletComment) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getTypeBytes() {
                return ((VideoLiveBulletComment) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public String getTypeId() {
                return ((VideoLiveBulletComment) this.instance).getTypeId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public ByteString getTypeIdBytes() {
                return ((VideoLiveBulletComment) this.instance).getTypeIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public long getUserHierarchy() {
                return ((VideoLiveBulletComment) this.instance).getUserHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage.VideoLiveBulletCommentOrBuilder
            public boolean hasStyle() {
                return ((VideoLiveBulletComment) this.instance).hasStyle();
            }

            public Builder mergeStyle(BulletCommentStyle bulletCommentStyle) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).mergeStyle(bulletCommentStyle);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setPayAmount(long j) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPayAmount(j);
                return this;
            }

            public Builder setPayAssetId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPayAssetId(str);
                return this;
            }

            public Builder setPayAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPayAssetIdBytes(byteString);
                return this;
            }

            public Builder setPayAssetType(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPayAssetType(str);
                return this;
            }

            public Builder setPayAssetTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPayAssetTypeBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setPriority(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setScenario(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setScenario(str);
                return this;
            }

            public Builder setScenarioBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setScenarioBytes(byteString);
                return this;
            }

            public Builder setStyle(BulletCommentStyle bulletCommentStyle) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setStyle(bulletCommentStyle);
                return this;
            }

            public Builder setSubType(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setSubType(str);
                return this;
            }

            public Builder setSubTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setSubTypeBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setTypeId(String str) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setTypeId(str);
                return this;
            }

            public Builder setTypeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setTypeIdBytes(byteString);
                return this;
            }

            public Builder setUserHierarchy(long j) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setUserHierarchy(j);
                return this;
            }

            public Builder setStyle(BulletCommentStyle.Builder builder) {
                copyOnWrite();
                ((VideoLiveBulletComment) this.instance).setStyle(builder);
                return this;
            }
        }

        public static VideoLiveBulletComment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoLiveBulletComment parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VideoLiveBulletComment parseFrom(InputStream inputStream) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLiveBulletComment parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VideoLiveBulletComment parseFrom(C3407e c3407e) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoLiveBulletComment parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VideoLiveBulletComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
