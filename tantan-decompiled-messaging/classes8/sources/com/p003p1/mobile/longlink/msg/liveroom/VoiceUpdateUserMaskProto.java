package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceUpdateUserMaskProto {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto$1 */
    public static /* synthetic */ class C04511 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1690xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1690xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1690xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface UserMaskUpdateOrBuilder extends o6z {
        String getAvatarId();

        ByteString getAvatarIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        userMaskConfig.UserMask getMask();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasMask();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceUpdateUserMaskProto() {
    }

    public static void registerAllExtensions(h hVar) {
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
                this.mask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(UserMaskUpdate userMaskUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(userMaskUpdate);
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
            a.checkByteStringIsUtf8(byteString);
            this.avatarId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04511.f1690xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserMaskUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    UserMaskUpdate userMaskUpdate = (UserMaskUpdate) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !userMaskUpdate.userId_.isEmpty(), userMaskUpdate.userId_);
                    this.mask_ = hVar.o(this.mask_, userMaskUpdate.mask_);
                    this.avatarId_ = hVar.f(!this.avatarId_.isEmpty(), this.avatarId_, true ^ userMaskUpdate.avatarId_.isEmpty(), userMaskUpdate.avatarId_);
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
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.mask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.mask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    this.avatarId_ = eVar.L();
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
                        synchronized (UserMaskUpdate.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iK += CodedOutputStream.C(2, getMask());
            }
            if (!this.avatarId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAvatarId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.w0(2, getMask());
            }
            if (this.avatarId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getAvatarId());
        }

        public static UserMaskUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserMaskUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<UserMaskUpdate, Builder> implements UserMaskUpdateOrBuilder {
            private Builder() {
                super(UserMaskUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarId() {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).clearAvatarId();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).clearMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public String getAvatarId() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).getAvatarId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public ByteString getAvatarIdBytes() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).getAvatarIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public String getUserId() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto.UserMaskUpdateOrBuilder
            public boolean hasMask() {
                return ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).mergeMask(userMask);
                return this;
            }

            public Builder setAvatarId(String str) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setAvatarId(str);
                return this;
            }

            public Builder setAvatarIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setAvatarIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((UserMaskUpdate) ((GeneratedMessageLite.b) this).instance).setMask(builder);
                return this;
            }
        }

        public static UserMaskUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserMaskUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static UserMaskUpdate parseFrom(InputStream inputStream) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMaskUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserMaskUpdate parseFrom(e eVar) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static UserMaskUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (UserMaskUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
