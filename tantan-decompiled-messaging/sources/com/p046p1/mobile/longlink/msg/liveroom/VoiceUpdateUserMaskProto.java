package com.p046p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceUpdateUserMaskProto {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto$1 */
    public static /* synthetic */ class C45391 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15991xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15991xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15991xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface UserMaskUpdateOrBuilder extends o6z {
        String getAvatarId();

        ByteString getAvatarIdBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        userMaskConfig.UserMask getMask();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasMask();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceUpdateUserMaskProto() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class UserMaskUpdate extends GeneratedMessageLite<UserMaskUpdate, Builder> implements UserMaskUpdateOrBuilder {
        public static final int AVATARID_FIELD_NUMBER = 3;
        private static final UserMaskUpdate DEFAULT_INSTANCE;
        public static final int MASK_FIELD_NUMBER = 2;
        private static volatile i860<UserMaskUpdate> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private userMaskConfig.UserMask mask_;
        private String userId_ = "";
        private String avatarId_ = "";

        static {
            UserMaskUpdate userMaskUpdate = new UserMaskUpdate();
            DEFAULT_INSTANCE = userMaskUpdate;
            userMaskUpdate.makeImmutable();
        }

        private UserMaskUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarId() {
            this.avatarId_ = getDefaultInstance().getAvatarId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMask() {
            this.mask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static UserMaskUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.mask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.mask_ = userMask;
            } else {
                this.mask_ = userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(UserMaskUpdate userMaskUpdate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userMaskUpdate);
        }

        public static UserMaskUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMaskUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<UserMaskUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarId(String str) {
            str.getClass();
            this.avatarId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatarId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = builder.build();
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
            switch (C45391.f15991xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserMaskUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    UserMaskUpdate userMaskUpdate = (UserMaskUpdate) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !userMaskUpdate.userId_.isEmpty(), userMaskUpdate.userId_);
                    this.mask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.mask_, userMaskUpdate.mask_);
                    this.avatarId_ = interfaceC3386h.mo16997f(!this.avatarId_.isEmpty(), this.avatarId_, true ^ userMaskUpdate.avatarId_.isEmpty(), userMaskUpdate.avatarId_);
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
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                    this.mask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.mask_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 26) {
                                    this.avatarId_ = c3407e.m17115L();
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
                        synchronized (UserMaskUpdate.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public String getAvatarId() {
            return this.avatarId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public ByteString getAvatarIdBytes() {
            return ByteString.copyFromUtf8(this.avatarId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public userMaskConfig.UserMask getMask() {
            userMaskConfig.UserMask userMask = this.mask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getMask());
            }
            if (!this.avatarId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getAvatarId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.mo16974w0(2, getMask());
            }
            if (this.avatarId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getAvatarId());
        }

        public static UserMaskUpdate parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserMaskUpdate parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<UserMaskUpdate, Builder> implements UserMaskUpdateOrBuilder {
            private Builder() {
                super(UserMaskUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarId() {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).clearAvatarId();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).clearMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public String getAvatarId() {
                return ((UserMaskUpdate) this.instance).getAvatarId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public ByteString getAvatarIdBytes() {
                return ((UserMaskUpdate) this.instance).getAvatarIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((UserMaskUpdate) this.instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public String getUserId() {
                return ((UserMaskUpdate) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserMaskUpdate) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public boolean hasMask() {
                return ((UserMaskUpdate) this.instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).mergeMask(userMask);
                return this;
            }

            public Builder setAvatarId(String str) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setAvatarId(str);
                return this;
            }

            public Builder setAvatarIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setAvatarIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((UserMaskUpdate) this.instance).setMask(builder);
                return this;
            }
        }

        public static UserMaskUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserMaskUpdate parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static UserMaskUpdate parseFrom(InputStream inputStream) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMaskUpdate parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserMaskUpdate parseFrom(C3407e c3407e) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserMaskUpdate parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
