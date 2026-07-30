package com.p051p1.mobile.longlink.msg.livehierarchy;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveUserLevel {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel$1 */
    public static /* synthetic */ class C46011 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16679xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16679xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16679xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface RoomTopEffectOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getDuration();

        long getGrade();

        long getSuperGrade();

        String getSvgUrl();

        ByteString getSvgUrlBytes();

        String getTag();

        ByteString getTagBytes();

        RoomTopEffectType getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserImageUrl();

        ByteString getUserImageUrlBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserHierarchyGradeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGrade();

        long getSeq();

        long getSuperGrade();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserImageUrl();

        ByteString getUserImageUrlBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserLiveHierarchyProgressChangeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGrade();

        String getJumpSchema();

        ByteString getJumpSchemaBytes();

        String getJumpText();

        ByteString getJumpTextBytes();

        long getPreGrade();

        long getPreWealth();

        String getProgressText();

        ByteString getProgressTextBytes();

        String getProgressTexts(int i);

        ByteString getProgressTextsBytes(int i);

        int getProgressTextsCount();

        List<String> getProgressTextsList();

        long getServerTs();

        UserLiveHierarchyProgressStyle getStyle();

        long getSuperGrade();

        long getWealth();

        double getWealthRatio();

        boolean hasStyle();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserLiveHierarchyProgressStyleOrBuilder extends lfz {
        String getBgEndColor();

        ByteString getBgEndColorBytes();

        String getBgStartColor();

        ByteString getBgStartColorBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveUserLevel() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class RoomTopEffect extends GeneratedMessageLite<RoomTopEffect, Builder> implements RoomTopEffectOrBuilder {
        private static final RoomTopEffect DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 9;
        public static final int GRADE_FIELD_NUMBER = 7;
        private static volatile ng60<RoomTopEffect> PARSER = null;
        public static final int SUPERGRADE_FIELD_NUMBER = 8;
        public static final int SVGURL_FIELD_NUMBER = 2;
        public static final int TAG_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 4;
        public static final int USERIMAGEURL_FIELD_NUMBER = 6;
        public static final int USERNAME_FIELD_NUMBER = 5;
        private long duration_;
        private long grade_;
        private long superGrade_;
        private int type_;
        private String svgUrl_ = "";
        private String tag_ = "";
        private String userId_ = "";
        private String userName_ = "";
        private String userImageUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<RoomTopEffect, Builder> implements RoomTopEffectOrBuilder {
            private Builder() {
                super(RoomTopEffect.DEFAULT_INSTANCE);
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearDuration();
                return this;
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearGrade();
                return this;
            }

            public Builder clearSuperGrade() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearSuperGrade();
                return this;
            }

            public Builder clearSvgUrl() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearSvgUrl();
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearTag();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserImageUrl() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearUserImageUrl();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((RoomTopEffect) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public long getDuration() {
                return ((RoomTopEffect) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public long getGrade() {
                return ((RoomTopEffect) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public long getSuperGrade() {
                return ((RoomTopEffect) this.instance).getSuperGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public String getSvgUrl() {
                return ((RoomTopEffect) this.instance).getSvgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public ByteString getSvgUrlBytes() {
                return ((RoomTopEffect) this.instance).getSvgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public String getTag() {
                return ((RoomTopEffect) this.instance).getTag();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public ByteString getTagBytes() {
                return ((RoomTopEffect) this.instance).getTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public RoomTopEffectType getType() {
                return ((RoomTopEffect) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public int getTypeValue() {
                return ((RoomTopEffect) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public String getUserId() {
                return ((RoomTopEffect) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public ByteString getUserIdBytes() {
                return ((RoomTopEffect) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public String getUserImageUrl() {
                return ((RoomTopEffect) this.instance).getUserImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public ByteString getUserImageUrlBytes() {
                return ((RoomTopEffect) this.instance).getUserImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public String getUserName() {
                return ((RoomTopEffect) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
            public ByteString getUserNameBytes() {
                return ((RoomTopEffect) this.instance).getUserNameBytes();
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setDuration(j);
                return this;
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setGrade(j);
                return this;
            }

            public Builder setSuperGrade(long j) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setSuperGrade(j);
                return this;
            }

            public Builder setSvgUrl(String str) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setSvgUrl(str);
                return this;
            }

            public Builder setSvgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setSvgUrlBytes(byteString);
                return this;
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setTag(str);
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setTagBytes(byteString);
                return this;
            }

            public Builder setType(RoomTopEffectType roomTopEffectType) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setType(roomTopEffectType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserImageUrl(String str) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserImageUrl(str);
                return this;
            }

            public Builder setUserImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserImageUrlBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((RoomTopEffect) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            RoomTopEffect roomTopEffect = new RoomTopEffect();
            DEFAULT_INSTANCE = roomTopEffect;
            roomTopEffect.makeImmutable();
        }

        private RoomTopEffect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuperGrade() {
            this.superGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgUrl() {
            this.svgUrl_ = getDefaultInstance().getSvgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserImageUrl() {
            this.userImageUrl_ = getDefaultInstance().getUserImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static RoomTopEffect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(RoomTopEffect roomTopEffect) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(roomTopEffect);
        }

        public static RoomTopEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoomTopEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<RoomTopEffect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuperGrade(long j) {
            this.superGrade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgUrl(String str) {
            str.getClass();
            this.svgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.svgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.tag_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(RoomTopEffectType roomTopEffectType) {
            roomTopEffectType.getClass();
            this.type_ = roomTopEffectType.getNumber();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImageUrl(String str) {
            str.getClass();
            this.userImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userImageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46011.f16679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RoomTopEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    RoomTopEffect roomTopEffect = (RoomTopEffect) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = roomTopEffect.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.svgUrl_ = interfaceC3409h.mo17052f(!this.svgUrl_.isEmpty(), this.svgUrl_, !roomTopEffect.svgUrl_.isEmpty(), roomTopEffect.svgUrl_);
                    this.tag_ = interfaceC3409h.mo17052f(!this.tag_.isEmpty(), this.tag_, !roomTopEffect.tag_.isEmpty(), roomTopEffect.tag_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !roomTopEffect.userId_.isEmpty(), roomTopEffect.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !roomTopEffect.userName_.isEmpty(), roomTopEffect.userName_);
                    this.userImageUrl_ = interfaceC3409h.mo17052f(!this.userImageUrl_.isEmpty(), this.userImageUrl_, !roomTopEffect.userImageUrl_.isEmpty(), roomTopEffect.userImageUrl_);
                    long j = this.grade_;
                    boolean z3 = j != 0;
                    long j2 = roomTopEffect.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    long j3 = this.superGrade_;
                    boolean z4 = j3 != 0;
                    long j4 = roomTopEffect.superGrade_;
                    this.superGrade_ = interfaceC3409h.mo17055i(z4, j3, j4 != 0, j4);
                    boolean z5 = false;
                    long j5 = this.duration_;
                    if (j5 != 0) {
                        z5 = true;
                    }
                    long j6 = roomTopEffect.duration_;
                    this.duration_ = interfaceC3409h.mo17055i(z5, j5, j6 != 0, j6);
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
                                    this.svgUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.tag_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.userImageUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 56) {
                                    this.grade_ = c3430e.m17197v();
                                } else if (iM17171M == 64) {
                                    this.superGrade_ = c3430e.m17197v();
                                } else if (iM17171M == 72) {
                                    this.duration_ = c3430e.m17197v();
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
                        synchronized (RoomTopEffect.class) {
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

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != RoomTopEffectType.userWealthGradeUp.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (!this.svgUrl_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getSvgUrl());
            }
            if (!this.tag_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getTag());
            }
            if (!this.userId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(4, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(5, getUserName());
            }
            if (!this.userImageUrl_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(6, getUserImageUrl());
            }
            long j = this.grade_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(7, j);
            }
            long j2 = this.superGrade_;
            if (j2 != 0) {
                iM16977m += CodedOutputStream.m16986v(8, j2);
            }
            long j3 = this.duration_;
            if (j3 != 0) {
                iM16977m += CodedOutputStream.m16986v(9, j3);
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public long getSuperGrade() {
            return this.superGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public String getSvgUrl() {
            return this.svgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public ByteString getSvgUrlBytes() {
            return ByteString.copyFromUtf8(this.svgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public String getTag() {
            return this.tag_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public ByteString getTagBytes() {
            return ByteString.copyFromUtf8(this.tag_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public RoomTopEffectType getType() {
            RoomTopEffectType roomTopEffectTypeForNumber = RoomTopEffectType.forNumber(this.type_);
            return roomTopEffectTypeForNumber == null ? RoomTopEffectType.UNRECOGNIZED : roomTopEffectTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public String getUserImageUrl() {
            return this.userImageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public ByteString getUserImageUrlBytes() {
            return ByteString.copyFromUtf8(this.userImageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != RoomTopEffectType.userWealthGradeUp.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (!this.svgUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getSvgUrl());
            }
            if (!this.tag_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getTag());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getUserName());
            }
            if (!this.userImageUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getUserImageUrl());
            }
            long j = this.grade_;
            if (j != 0) {
                codedOutputStream.m17027u0(7, j);
            }
            long j2 = this.superGrade_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(8, j2);
            }
            long j3 = this.duration_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(9, j3);
            }
        }

        public static RoomTopEffect parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RoomTopEffect parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static RoomTopEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoomTopEffect parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static RoomTopEffect parseFrom(InputStream inputStream) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoomTopEffect parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static RoomTopEffect parseFrom(C3430e c3430e) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RoomTopEffect parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (RoomTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum RoomTopEffectType implements C3437l.c {
        userWealthGradeUp(0),
        UNRECOGNIZED(-1);

        private static final C3437l.d<RoomTopEffectType> internalValueMap = new C3437l.d<RoomTopEffectType>() { // from class: com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.RoomTopEffectType.1
            @Override // com.google.protobuf.C3437l.d
            public RoomTopEffectType findValueByNumber(int i) {
                return RoomTopEffectType.forNumber(i);
            }
        };
        public static final int userWealthGradeUp_VALUE = 0;
        private final int value;

        RoomTopEffectType(int i) {
            this.value = i;
        }

        public static RoomTopEffectType forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return userWealthGradeUp;
        }

        public static C3437l.d<RoomTopEffectType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RoomTopEffectType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class UserHierarchyGrade extends GeneratedMessageLite<UserHierarchyGrade, Builder> implements UserHierarchyGradeOrBuilder {
        private static final UserHierarchyGrade DEFAULT_INSTANCE;
        public static final int GRADE_FIELD_NUMBER = 5;
        private static volatile ng60<UserHierarchyGrade> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        public static final int SUPERGRADE_FIELD_NUMBER = 6;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int USERIMAGEURL_FIELD_NUMBER = 4;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private long grade_;
        private long seq_;
        private long superGrade_;
        private String userId_ = "";
        private String userName_ = "";
        private String userImageUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserHierarchyGrade, Builder> implements UserHierarchyGradeOrBuilder {
            private Builder() {
                super(UserHierarchyGrade.DEFAULT_INSTANCE);
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearGrade();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearSeq();
                return this;
            }

            public Builder clearSuperGrade() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearSuperGrade();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserImageUrl() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearUserImageUrl();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public long getGrade() {
                return ((UserHierarchyGrade) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public long getSeq() {
                return ((UserHierarchyGrade) this.instance).getSeq();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public long getSuperGrade() {
                return ((UserHierarchyGrade) this.instance).getSuperGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public String getUserId() {
                return ((UserHierarchyGrade) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserHierarchyGrade) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public String getUserImageUrl() {
                return ((UserHierarchyGrade) this.instance).getUserImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public ByteString getUserImageUrlBytes() {
                return ((UserHierarchyGrade) this.instance).getUserImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public String getUserName() {
                return ((UserHierarchyGrade) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
            public ByteString getUserNameBytes() {
                return ((UserHierarchyGrade) this.instance).getUserNameBytes();
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setGrade(j);
                return this;
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setSeq(j);
                return this;
            }

            public Builder setSuperGrade(long j) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setSuperGrade(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserImageUrl(String str) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserImageUrl(str);
                return this;
            }

            public Builder setUserImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserImageUrlBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UserHierarchyGrade) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            UserHierarchyGrade userHierarchyGrade = new UserHierarchyGrade();
            DEFAULT_INSTANCE = userHierarchyGrade;
            userHierarchyGrade.makeImmutable();
        }

        private UserHierarchyGrade() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.seq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuperGrade() {
            this.superGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserImageUrl() {
            this.userImageUrl_ = getDefaultInstance().getUserImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static UserHierarchyGrade getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserHierarchyGrade userHierarchyGrade) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userHierarchyGrade);
        }

        public static UserHierarchyGrade parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserHierarchyGrade parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserHierarchyGrade> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(long j) {
            this.seq_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuperGrade(long j) {
            this.superGrade_ = j;
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
        public void setUserImageUrl(String str) {
            str.getClass();
            this.userImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userImageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46011.f16679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserHierarchyGrade();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserHierarchyGrade userHierarchyGrade = (UserHierarchyGrade) obj2;
                    long j = this.seq_;
                    boolean z2 = j != 0;
                    long j2 = userHierarchyGrade.seq_;
                    this.seq_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !userHierarchyGrade.userId_.isEmpty(), userHierarchyGrade.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !userHierarchyGrade.userName_.isEmpty(), userHierarchyGrade.userName_);
                    this.userImageUrl_ = interfaceC3409h.mo17052f(!this.userImageUrl_.isEmpty(), this.userImageUrl_, !userHierarchyGrade.userImageUrl_.isEmpty(), userHierarchyGrade.userImageUrl_);
                    long j3 = this.grade_;
                    boolean z3 = j3 != 0;
                    long j4 = userHierarchyGrade.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    boolean z4 = false;
                    long j5 = this.superGrade_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = userHierarchyGrade.superGrade_;
                    this.superGrade_ = interfaceC3409h.mo17055i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.seq_ = c3430e.m17173O();
                                } else if (iM17171M == 18) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.userImageUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 40) {
                                    this.grade_ = c3430e.m17197v();
                                } else if (iM17171M == 48) {
                                    this.superGrade_ = c3430e.m17197v();
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
                        synchronized (UserHierarchyGrade.class) {
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

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.seq_;
            int iM16961P = j != 0 ? CodedOutputStream.m16961P(1, j) : 0;
            if (!this.userId_.isEmpty()) {
                iM16961P += CodedOutputStream.m16956K(2, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16961P += CodedOutputStream.m16956K(3, getUserName());
            }
            if (!this.userImageUrl_.isEmpty()) {
                iM16961P += CodedOutputStream.m16956K(4, getUserImageUrl());
            }
            long j2 = this.grade_;
            if (j2 != 0) {
                iM16961P += CodedOutputStream.m16986v(5, j2);
            }
            long j3 = this.superGrade_;
            if (j3 != 0) {
                iM16961P += CodedOutputStream.m16986v(6, j3);
            }
            this.memoizedSerializedSize = iM16961P;
            return iM16961P;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public long getSuperGrade() {
            return this.superGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public String getUserImageUrl() {
            return this.userImageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public ByteString getUserImageUrlBytes() {
            return ByteString.copyFromUtf8(this.userImageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserHierarchyGradeOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.seq_;
            if (j != 0) {
                codedOutputStream.mo16999I0(1, j);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserName());
            }
            if (!this.userImageUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getUserImageUrl());
            }
            long j2 = this.grade_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
            long j3 = this.superGrade_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(6, j3);
            }
        }

        public static UserHierarchyGrade parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserHierarchyGrade parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static UserHierarchyGrade parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserHierarchyGrade parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserHierarchyGrade parseFrom(InputStream inputStream) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserHierarchyGrade parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserHierarchyGrade parseFrom(C3430e c3430e) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserHierarchyGrade parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserHierarchyGrade) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class UserLiveHierarchyProgressChange extends GeneratedMessageLite<UserLiveHierarchyProgressChange, Builder> implements UserLiveHierarchyProgressChangeOrBuilder {
        private static final UserLiveHierarchyProgressChange DEFAULT_INSTANCE;
        public static final int GRADE_FIELD_NUMBER = 1;
        public static final int JUMPSCHEMA_FIELD_NUMBER = 6;
        public static final int JUMPTEXT_FIELD_NUMBER = 5;
        private static volatile ng60<UserLiveHierarchyProgressChange> PARSER = null;
        public static final int PREGRADE_FIELD_NUMBER = 7;
        public static final int PREWEALTH_FIELD_NUMBER = 8;
        public static final int PROGRESSTEXTS_FIELD_NUMBER = 12;
        public static final int PROGRESSTEXT_FIELD_NUMBER = 4;
        public static final int SERVERTS_FIELD_NUMBER = 9;
        public static final int STYLE_FIELD_NUMBER = 11;
        public static final int SUPERGRADE_FIELD_NUMBER = 10;
        public static final int WEALTHRATIO_FIELD_NUMBER = 3;
        public static final int WEALTH_FIELD_NUMBER = 2;
        private int bitField0_;
        private long grade_;
        private long preGrade_;
        private long preWealth_;
        private long serverTs_;
        private UserLiveHierarchyProgressStyle style_;
        private long superGrade_;
        private double wealthRatio_;
        private long wealth_;
        private String progressText_ = "";
        private String jumpText_ = "";
        private String jumpSchema_ = "";
        private C3437l.h<String> progressTexts_ = GeneratedMessageLite.emptyProtobufList();

        static {
            UserLiveHierarchyProgressChange userLiveHierarchyProgressChange = new UserLiveHierarchyProgressChange();
            DEFAULT_INSTANCE = userLiveHierarchyProgressChange;
            userLiveHierarchyProgressChange.makeImmutable();
        }

        private UserLiveHierarchyProgressChange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProgressTexts(Iterable<String> iterable) {
            ensureProgressTextsIsMutable();
            AbstractC3426a.addAll(iterable, this.progressTexts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgressTexts(String str) {
            str.getClass();
            ensureProgressTextsIsMutable();
            this.progressTexts_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgressTextsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureProgressTextsIsMutable();
            this.progressTexts_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpSchema() {
            this.jumpSchema_ = getDefaultInstance().getJumpSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpText() {
            this.jumpText_ = getDefaultInstance().getJumpText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreGrade() {
            this.preGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreWealth() {
            this.preWealth_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgressText() {
            this.progressText_ = getDefaultInstance().getProgressText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgressTexts() {
            this.progressTexts_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerTs() {
            this.serverTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStyle() {
            this.style_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuperGrade() {
            this.superGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWealth() {
            this.wealth_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWealthRatio() {
            this.wealthRatio_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        private void ensureProgressTextsIsMutable() {
            if (this.progressTexts_.mo17140q()) {
                return;
            }
            this.progressTexts_ = GeneratedMessageLite.mutableCopy(this.progressTexts_);
        }

        public static UserLiveHierarchyProgressChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStyle(UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle) {
            UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle2 = this.style_;
            if (userLiveHierarchyProgressStyle2 == null || userLiveHierarchyProgressStyle2 == UserLiveHierarchyProgressStyle.getDefaultInstance()) {
                this.style_ = userLiveHierarchyProgressStyle;
            } else {
                this.style_ = UserLiveHierarchyProgressStyle.newBuilder(this.style_).mergeFrom(userLiveHierarchyProgressStyle).buildPartial();
            }
        }

        public static Builder newBuilder(UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLiveHierarchyProgressChange);
        }

        public static UserLiveHierarchyProgressChange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveHierarchyProgressChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserLiveHierarchyProgressChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchema(String str) {
            str.getClass();
            this.jumpSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpSchemaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.jumpSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpText(String str) {
            str.getClass();
            this.jumpText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.jumpText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreGrade(long j) {
            this.preGrade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreWealth(long j) {
            this.preWealth_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressText(String str) {
            str.getClass();
            this.progressText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.progressText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressTexts(int i, String str) {
            str.getClass();
            ensureProgressTextsIsMutable();
            this.progressTexts_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerTs(long j) {
            this.serverTs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyle(UserLiveHierarchyProgressStyle.Builder builder) {
            this.style_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuperGrade(long j) {
            this.superGrade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWealth(long j) {
            this.wealth_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWealthRatio(double d) {
            this.wealthRatio_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46011.f16679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserLiveHierarchyProgressChange();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.progressTexts_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserLiveHierarchyProgressChange userLiveHierarchyProgressChange = (UserLiveHierarchyProgressChange) obj2;
                    long j = this.grade_;
                    boolean z2 = j != 0;
                    long j2 = userLiveHierarchyProgressChange.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.wealth_;
                    boolean z3 = j3 != 0;
                    long j4 = userLiveHierarchyProgressChange.wealth_;
                    this.wealth_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    double d = this.wealthRatio_;
                    boolean z4 = d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    double d2 = userLiveHierarchyProgressChange.wealthRatio_;
                    this.wealthRatio_ = interfaceC3409h.mo17056j(z4, d, d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d2);
                    this.progressText_ = interfaceC3409h.mo17052f(!this.progressText_.isEmpty(), this.progressText_, !userLiveHierarchyProgressChange.progressText_.isEmpty(), userLiveHierarchyProgressChange.progressText_);
                    this.jumpText_ = interfaceC3409h.mo17052f(!this.jumpText_.isEmpty(), this.jumpText_, !userLiveHierarchyProgressChange.jumpText_.isEmpty(), userLiveHierarchyProgressChange.jumpText_);
                    this.jumpSchema_ = interfaceC3409h.mo17052f(!this.jumpSchema_.isEmpty(), this.jumpSchema_, !userLiveHierarchyProgressChange.jumpSchema_.isEmpty(), userLiveHierarchyProgressChange.jumpSchema_);
                    long j5 = this.preGrade_;
                    boolean z5 = j5 != 0;
                    long j6 = userLiveHierarchyProgressChange.preGrade_;
                    this.preGrade_ = interfaceC3409h.mo17055i(z5, j5, j6 != 0, j6);
                    long j7 = this.preWealth_;
                    boolean z6 = j7 != 0;
                    long j8 = userLiveHierarchyProgressChange.preWealth_;
                    this.preWealth_ = interfaceC3409h.mo17055i(z6, j7, j8 != 0, j8);
                    long j9 = this.serverTs_;
                    boolean z7 = j9 != 0;
                    long j10 = userLiveHierarchyProgressChange.serverTs_;
                    this.serverTs_ = interfaceC3409h.mo17055i(z7, j9, j10 != 0, j10);
                    boolean z8 = false;
                    long j11 = this.superGrade_;
                    if (j11 != 0) {
                        z8 = true;
                    }
                    long j12 = userLiveHierarchyProgressChange.superGrade_;
                    this.superGrade_ = interfaceC3409h.mo17055i(z8, j11, j12 != 0, j12);
                    this.style_ = (UserLiveHierarchyProgressStyle) interfaceC3409h.mo17061o(this.style_, userLiveHierarchyProgressChange.style_);
                    this.progressTexts_ = interfaceC3409h.mo17053g(this.progressTexts_, userLiveHierarchyProgressChange.progressTexts_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= userLiveHierarchyProgressChange.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 8:
                                    this.grade_ = c3430e.m17197v();
                                    continue;
                                case 16:
                                    this.wealth_ = c3430e.m17197v();
                                    continue;
                                case 25:
                                    this.wealthRatio_ = c3430e.m17190o();
                                    continue;
                                case 34:
                                    this.progressText_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.jumpText_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.jumpSchema_ = c3430e.m17170L();
                                    continue;
                                case 56:
                                    this.preGrade_ = c3430e.m17197v();
                                    continue;
                                case 64:
                                    this.preWealth_ = c3430e.m17197v();
                                    continue;
                                case 72:
                                    this.serverTs_ = c3430e.m17197v();
                                    continue;
                                case 80:
                                    this.superGrade_ = c3430e.m17197v();
                                    continue;
                                case 90:
                                    UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle = this.style_;
                                    UserLiveHierarchyProgressStyle.Builder builder = userLiveHierarchyProgressStyle != null ? userLiveHierarchyProgressStyle.toBuilder() : null;
                                    UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle2 = (UserLiveHierarchyProgressStyle) c3430e.m17198w(UserLiveHierarchyProgressStyle.parser(), c3433h);
                                    this.style_ = userLiveHierarchyProgressStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(userLiveHierarchyProgressStyle2);
                                        this.style_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.progressTexts_.mo17140q()) {
                                        this.progressTexts_ = GeneratedMessageLite.mutableCopy(this.progressTexts_);
                                    }
                                    this.progressTexts_.add(strM17170L);
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (UserLiveHierarchyProgressChange.class) {
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

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public String getJumpSchema() {
            return this.jumpSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public ByteString getJumpSchemaBytes() {
            return ByteString.copyFromUtf8(this.jumpSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public String getJumpText() {
            return this.jumpText_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public ByteString getJumpTextBytes() {
            return ByteString.copyFromUtf8(this.jumpText_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getPreGrade() {
            return this.preGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getPreWealth() {
            return this.preWealth_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public String getProgressText() {
            return this.progressText_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public ByteString getProgressTextBytes() {
            return ByteString.copyFromUtf8(this.progressText_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public String getProgressTexts(int i) {
            return this.progressTexts_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public ByteString getProgressTextsBytes(int i) {
            return ByteString.copyFromUtf8(this.progressTexts_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public int getProgressTextsCount() {
            return this.progressTexts_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public List<String> getProgressTextsList() {
            return this.progressTexts_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.grade_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            long j2 = this.wealth_;
            if (j2 != 0) {
                iM16986v += CodedOutputStream.m16986v(2, j2);
            }
            double d = this.wealthRatio_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                iM16986v += CodedOutputStream.m16975k(3, d);
            }
            if (!this.progressText_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(4, getProgressText());
            }
            if (!this.jumpText_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(5, getJumpText());
            }
            if (!this.jumpSchema_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(6, getJumpSchema());
            }
            long j3 = this.preGrade_;
            if (j3 != 0) {
                iM16986v += CodedOutputStream.m16986v(7, j3);
            }
            long j4 = this.preWealth_;
            if (j4 != 0) {
                iM16986v += CodedOutputStream.m16986v(8, j4);
            }
            long j5 = this.serverTs_;
            if (j5 != 0) {
                iM16986v += CodedOutputStream.m16986v(9, j5);
            }
            long j6 = this.superGrade_;
            if (j6 != 0) {
                iM16986v += CodedOutputStream.m16986v(10, j6);
            }
            if (this.style_ != null) {
                iM16986v += CodedOutputStream.m16948C(11, getStyle());
            }
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.progressTexts_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.progressTexts_.get(i2));
            }
            int size = iM16986v + iM16957L + getProgressTextsList().size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getServerTs() {
            return this.serverTs_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public UserLiveHierarchyProgressStyle getStyle() {
            UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle = this.style_;
            return userLiveHierarchyProgressStyle == null ? UserLiveHierarchyProgressStyle.getDefaultInstance() : userLiveHierarchyProgressStyle;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getSuperGrade() {
            return this.superGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public long getWealth() {
            return this.wealth_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public double getWealthRatio() {
            return this.wealthRatio_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
        public boolean hasStyle() {
            return this.style_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.grade_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            long j2 = this.wealth_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(2, j2);
            }
            double d = this.wealthRatio_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                codedOutputStream.m17013g0(3, d);
            }
            if (!this.progressText_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getProgressText());
            }
            if (!this.jumpText_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getJumpText());
            }
            if (!this.jumpSchema_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getJumpSchema());
            }
            long j3 = this.preGrade_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(7, j3);
            }
            long j4 = this.preWealth_;
            if (j4 != 0) {
                codedOutputStream.m17027u0(8, j4);
            }
            long j5 = this.serverTs_;
            if (j5 != 0) {
                codedOutputStream.m17027u0(9, j5);
            }
            long j6 = this.superGrade_;
            if (j6 != 0) {
                codedOutputStream.m17027u0(10, j6);
            }
            if (this.style_ != null) {
                codedOutputStream.mo17029w0(11, getStyle());
            }
            for (int i = 0; i < this.progressTexts_.size(); i++) {
                codedOutputStream.mo16994D0(12, this.progressTexts_.get(i));
            }
        }

        public static UserLiveHierarchyProgressChange parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveHierarchyProgressChange parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyle(UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle) {
            userLiveHierarchyProgressStyle.getClass();
            this.style_ = userLiveHierarchyProgressStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserLiveHierarchyProgressChange, Builder> implements UserLiveHierarchyProgressChangeOrBuilder {
            private Builder() {
                super(UserLiveHierarchyProgressChange.DEFAULT_INSTANCE);
            }

            public Builder addAllProgressTexts(Iterable<String> iterable) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).addAllProgressTexts(iterable);
                return this;
            }

            public Builder addProgressTexts(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).addProgressTexts(str);
                return this;
            }

            public Builder addProgressTextsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).addProgressTextsBytes(byteString);
                return this;
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearGrade();
                return this;
            }

            public Builder clearJumpSchema() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearJumpSchema();
                return this;
            }

            public Builder clearJumpText() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearJumpText();
                return this;
            }

            public Builder clearPreGrade() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearPreGrade();
                return this;
            }

            public Builder clearPreWealth() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearPreWealth();
                return this;
            }

            public Builder clearProgressText() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearProgressText();
                return this;
            }

            public Builder clearProgressTexts() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearProgressTexts();
                return this;
            }

            public Builder clearServerTs() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearServerTs();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearStyle();
                return this;
            }

            public Builder clearSuperGrade() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearSuperGrade();
                return this;
            }

            public Builder clearWealth() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearWealth();
                return this;
            }

            public Builder clearWealthRatio() {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).clearWealthRatio();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getGrade() {
                return ((UserLiveHierarchyProgressChange) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public String getJumpSchema() {
                return ((UserLiveHierarchyProgressChange) this.instance).getJumpSchema();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public ByteString getJumpSchemaBytes() {
                return ((UserLiveHierarchyProgressChange) this.instance).getJumpSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public String getJumpText() {
                return ((UserLiveHierarchyProgressChange) this.instance).getJumpText();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public ByteString getJumpTextBytes() {
                return ((UserLiveHierarchyProgressChange) this.instance).getJumpTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getPreGrade() {
                return ((UserLiveHierarchyProgressChange) this.instance).getPreGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getPreWealth() {
                return ((UserLiveHierarchyProgressChange) this.instance).getPreWealth();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public String getProgressText() {
                return ((UserLiveHierarchyProgressChange) this.instance).getProgressText();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public ByteString getProgressTextBytes() {
                return ((UserLiveHierarchyProgressChange) this.instance).getProgressTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public String getProgressTexts(int i) {
                return ((UserLiveHierarchyProgressChange) this.instance).getProgressTexts(i);
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public ByteString getProgressTextsBytes(int i) {
                return ((UserLiveHierarchyProgressChange) this.instance).getProgressTextsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public int getProgressTextsCount() {
                return ((UserLiveHierarchyProgressChange) this.instance).getProgressTextsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public List<String> getProgressTextsList() {
                return Collections.unmodifiableList(((UserLiveHierarchyProgressChange) this.instance).getProgressTextsList());
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getServerTs() {
                return ((UserLiveHierarchyProgressChange) this.instance).getServerTs();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public UserLiveHierarchyProgressStyle getStyle() {
                return ((UserLiveHierarchyProgressChange) this.instance).getStyle();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getSuperGrade() {
                return ((UserLiveHierarchyProgressChange) this.instance).getSuperGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public long getWealth() {
                return ((UserLiveHierarchyProgressChange) this.instance).getWealth();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public double getWealthRatio() {
                return ((UserLiveHierarchyProgressChange) this.instance).getWealthRatio();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressChangeOrBuilder
            public boolean hasStyle() {
                return ((UserLiveHierarchyProgressChange) this.instance).hasStyle();
            }

            public Builder mergeStyle(UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).mergeStyle(userLiveHierarchyProgressStyle);
                return this;
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setGrade(j);
                return this;
            }

            public Builder setJumpSchema(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setJumpSchema(str);
                return this;
            }

            public Builder setJumpSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setJumpSchemaBytes(byteString);
                return this;
            }

            public Builder setJumpText(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setJumpText(str);
                return this;
            }

            public Builder setJumpTextBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setJumpTextBytes(byteString);
                return this;
            }

            public Builder setPreGrade(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setPreGrade(j);
                return this;
            }

            public Builder setPreWealth(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setPreWealth(j);
                return this;
            }

            public Builder setProgressText(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setProgressText(str);
                return this;
            }

            public Builder setProgressTextBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setProgressTextBytes(byteString);
                return this;
            }

            public Builder setProgressTexts(int i, String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setProgressTexts(i, str);
                return this;
            }

            public Builder setServerTs(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setServerTs(j);
                return this;
            }

            public Builder setStyle(UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setStyle(userLiveHierarchyProgressStyle);
                return this;
            }

            public Builder setSuperGrade(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setSuperGrade(j);
                return this;
            }

            public Builder setWealth(long j) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setWealth(j);
                return this;
            }

            public Builder setWealthRatio(double d) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setWealthRatio(d);
                return this;
            }

            public Builder setStyle(UserLiveHierarchyProgressStyle.Builder builder) {
                copyOnWrite();
                ((UserLiveHierarchyProgressChange) this.instance).setStyle(builder);
                return this;
            }
        }

        public static UserLiveHierarchyProgressChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserLiveHierarchyProgressChange parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserLiveHierarchyProgressChange parseFrom(InputStream inputStream) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveHierarchyProgressChange parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveHierarchyProgressChange parseFrom(C3430e c3430e) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserLiveHierarchyProgressChange parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class UserLiveHierarchyProgressStyle extends GeneratedMessageLite<UserLiveHierarchyProgressStyle, Builder> implements UserLiveHierarchyProgressStyleOrBuilder {
        public static final int BGENDCOLOR_FIELD_NUMBER = 4;
        public static final int BGSTARTCOLOR_FIELD_NUMBER = 3;
        private static final UserLiveHierarchyProgressStyle DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        private static volatile ng60<UserLiveHierarchyProgressStyle> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        public static final int TEXTCOLOR_FIELD_NUMBER = 5;
        private String startColor_ = "";
        private String endColor_ = "";
        private String bgStartColor_ = "";
        private String bgEndColor_ = "";
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserLiveHierarchyProgressStyle, Builder> implements UserLiveHierarchyProgressStyleOrBuilder {
            private Builder() {
                super(UserLiveHierarchyProgressStyle.DEFAULT_INSTANCE);
            }

            public Builder clearBgEndColor() {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).clearBgEndColor();
                return this;
            }

            public Builder clearBgStartColor() {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).clearBgStartColor();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).clearEndColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).clearStartColor();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).clearTextColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public String getBgEndColor() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getBgEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public ByteString getBgEndColorBytes() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getBgEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public String getBgStartColor() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getBgStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public ByteString getBgStartColorBytes() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getBgStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public String getEndColor() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public ByteString getEndColorBytes() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public String getStartColor() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public ByteString getStartColorBytes() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public String getTextColor() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
            public ByteString getTextColorBytes() {
                return ((UserLiveHierarchyProgressStyle) this.instance).getTextColorBytes();
            }

            public Builder setBgEndColor(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setBgEndColor(str);
                return this;
            }

            public Builder setBgEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setBgEndColorBytes(byteString);
                return this;
            }

            public Builder setBgStartColor(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setBgStartColor(str);
                return this;
            }

            public Builder setBgStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setBgStartColorBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveHierarchyProgressStyle) this.instance).setTextColorBytes(byteString);
                return this;
            }
        }

        static {
            UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle = new UserLiveHierarchyProgressStyle();
            DEFAULT_INSTANCE = userLiveHierarchyProgressStyle;
            userLiveHierarchyProgressStyle.makeImmutable();
        }

        private UserLiveHierarchyProgressStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgEndColor() {
            this.bgEndColor_ = getDefaultInstance().getBgEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgStartColor() {
            this.bgStartColor_ = getDefaultInstance().getBgStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        public static UserLiveHierarchyProgressStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLiveHierarchyProgressStyle);
        }

        public static UserLiveHierarchyProgressStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserLiveHierarchyProgressStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgEndColor(String str) {
            str.getClass();
            this.bgEndColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.bgEndColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStartColor(String str) {
            str.getClass();
            this.bgStartColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.bgStartColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46011.f16679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserLiveHierarchyProgressStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserLiveHierarchyProgressStyle userLiveHierarchyProgressStyle = (UserLiveHierarchyProgressStyle) obj2;
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !userLiveHierarchyProgressStyle.startColor_.isEmpty(), userLiveHierarchyProgressStyle.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !userLiveHierarchyProgressStyle.endColor_.isEmpty(), userLiveHierarchyProgressStyle.endColor_);
                    this.bgStartColor_ = interfaceC3409h.mo17052f(!this.bgStartColor_.isEmpty(), this.bgStartColor_, !userLiveHierarchyProgressStyle.bgStartColor_.isEmpty(), userLiveHierarchyProgressStyle.bgStartColor_);
                    this.bgEndColor_ = interfaceC3409h.mo17052f(!this.bgEndColor_.isEmpty(), this.bgEndColor_, !userLiveHierarchyProgressStyle.bgEndColor_.isEmpty(), userLiveHierarchyProgressStyle.bgEndColor_);
                    this.textColor_ = interfaceC3409h.mo17052f(!this.textColor_.isEmpty(), this.textColor_, true ^ userLiveHierarchyProgressStyle.textColor_.isEmpty(), userLiveHierarchyProgressStyle.textColor_);
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
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.bgStartColor_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.bgEndColor_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.textColor_ = c3430e.m17170L();
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
                        synchronized (UserLiveHierarchyProgressStyle.class) {
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

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public String getBgEndColor() {
            return this.bgEndColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public ByteString getBgEndColorBytes() {
            return ByteString.copyFromUtf8(this.bgEndColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public String getBgStartColor() {
            return this.bgStartColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public ByteString getBgStartColorBytes() {
            return ByteString.copyFromUtf8(this.bgStartColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.startColor_.isEmpty() ? CodedOutputStream.m16956K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getEndColor());
            }
            if (!this.bgStartColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getBgStartColor());
            }
            if (!this.bgEndColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getBgEndColor());
            }
            if (!this.textColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getTextColor());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel.UserLiveHierarchyProgressStyleOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getEndColor());
            }
            if (!this.bgStartColor_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getBgStartColor());
            }
            if (!this.bgEndColor_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getBgEndColor());
            }
            if (this.textColor_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getTextColor());
        }

        public static UserLiveHierarchyProgressStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(InputStream inputStream) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveHierarchyProgressStyle parseFrom(C3430e c3430e) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserLiveHierarchyProgressStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserLiveHierarchyProgressStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
