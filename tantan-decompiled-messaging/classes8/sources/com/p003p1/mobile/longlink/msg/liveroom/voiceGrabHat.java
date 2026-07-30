package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class voiceGrabHat {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.voiceGrabHat$1 */
    public static /* synthetic */ class C04541 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1692xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1692xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1692xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceGrabHatCpOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getHatUrl();

        ByteString getHatUrlBytes();

        String getId();

        ByteString getIdBytes();

        long getLovePoint();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        userMaskConfig.UserMask getOtherUserMask();

        String getUserId();

        ByteString getUserIdBytes();

        userMaskConfig.UserMask getUserMask();

        boolean hasOtherUserMask();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceGrabHatOrBuilder extends o6z {
        VoiceGrabHat.CallHatInfo getCallHatInfos(int i);

        int getCallHatInfosCount();

        List<VoiceGrabHat.CallHatInfo> getCallHatInfosList();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getStatus();

        ByteString getStatusBytes();

        String getToast();

        ByteString getToastBytes();

        long getUpdatedTime();

        /* synthetic */ boolean isInitialized();
    }

    private voiceGrabHat() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceGrabHat extends GeneratedMessageLite<VoiceGrabHat, Builder> implements VoiceGrabHatOrBuilder {
        public static final int CALLHATINFOS_FIELD_NUMBER = 4;
        private static final VoiceGrabHat DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceGrabHat> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 3;
        public static final int TOAST_FIELD_NUMBER = 6;
        public static final int UPDATEDTIME_FIELD_NUMBER = 5;
        private int bitField0_;
        private long updatedTime_;
        private String id_ = "";
        private String liveId_ = "";
        private String status_ = "";
        private l.h<CallHatInfo> callHatInfos_ = GeneratedMessageLite.emptyProtobufList();
        private String toast_ = "";

        public interface CallHatInfoOrBuilder extends o6z {
            /* synthetic */ q getDefaultInstanceForType();

            String getHatUrl();

            ByteString getHatUrlBytes();

            long getPoint();

            String getUserId();

            ByteString getUserIdBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            VoiceGrabHat voiceGrabHat = new VoiceGrabHat();
            DEFAULT_INSTANCE = voiceGrabHat;
            voiceGrabHat.makeImmutable();
        }

        private VoiceGrabHat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCallHatInfos(Iterable<? extends CallHatInfo> iterable) {
            ensureCallHatInfosIsMutable();
            a.addAll(iterable, this.callHatInfos_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallHatInfos(CallHatInfo.Builder builder) {
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.add((CallHatInfo) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallHatInfos() {
            this.callHatInfos_ = GeneratedMessageLite.emptyProtobufList();
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
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        private void ensureCallHatInfosIsMutable() {
            if (this.callHatInfos_.q()) {
                return;
            }
            this.callHatInfos_ = GeneratedMessageLite.mutableCopy(this.callHatInfos_);
        }

        public static VoiceGrabHat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceGrabHat voiceGrabHat) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceGrabHat);
        }

        public static VoiceGrabHat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGrabHat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceGrabHat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCallHatInfos(int i) {
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallHatInfos(int i, CallHatInfo.Builder builder) {
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.set(i, (CallHatInfo) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04541.f1692xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGrabHat();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.callHatInfos_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    VoiceGrabHat voiceGrabHat = (VoiceGrabHat) obj2;
                    this.id_ = gVar.f(!this.id_.isEmpty(), this.id_, !voiceGrabHat.id_.isEmpty(), voiceGrabHat.id_);
                    this.liveId_ = gVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceGrabHat.liveId_.isEmpty(), voiceGrabHat.liveId_);
                    this.status_ = gVar.f(!this.status_.isEmpty(), this.status_, !voiceGrabHat.status_.isEmpty(), voiceGrabHat.status_);
                    this.callHatInfos_ = gVar.g(this.callHatInfos_, voiceGrabHat.callHatInfos_);
                    long j = this.updatedTime_;
                    boolean z2 = j != 0;
                    long j2 = voiceGrabHat.updatedTime_;
                    this.updatedTime_ = gVar.i(z2, j, j2 != 0, j2);
                    this.toast_ = gVar.f(!this.toast_.isEmpty(), this.toast_, !voiceGrabHat.toast_.isEmpty(), voiceGrabHat.toast_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= voiceGrabHat.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.status_ = eVar.L();
                                } else if (iM == 34) {
                                    if (!this.callHatInfos_.q()) {
                                        this.callHatInfos_ = GeneratedMessageLite.mutableCopy(this.callHatInfos_);
                                    }
                                    this.callHatInfos_.add(eVar.w(CallHatInfo.parser(), hVar));
                                } else if (iM == 40) {
                                    this.updatedTime_ = eVar.v();
                                } else if (iM == 50) {
                                    this.toast_ = eVar.L();
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
                        synchronized (VoiceGrabHat.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public CallHatInfo getCallHatInfos(int i) {
            return (CallHatInfo) this.callHatInfos_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public int getCallHatInfosCount() {
            return this.callHatInfos_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public List<CallHatInfo> getCallHatInfosList() {
            return this.callHatInfos_;
        }

        public CallHatInfoOrBuilder getCallHatInfosOrBuilder(int i) {
            return (CallHatInfoOrBuilder) this.callHatInfos_.get(i);
        }

        public List<? extends CallHatInfoOrBuilder> getCallHatInfosOrBuilderList() {
            return this.callHatInfos_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            if (!this.status_.isEmpty()) {
                iK += CodedOutputStream.K(3, getStatus());
            }
            for (int i2 = 0; i2 < this.callHatInfos_.size(); i2++) {
                iK += CodedOutputStream.C(4, (q) this.callHatInfos_.get(i2));
            }
            long j = this.updatedTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(5, j);
            }
            if (!this.toast_.isEmpty()) {
                iK += CodedOutputStream.K(6, getToast());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.D0(3, getStatus());
            }
            for (int i = 0; i < this.callHatInfos_.size(); i++) {
                codedOutputStream.w0(4, (q) this.callHatInfos_.get(i));
            }
            long j = this.updatedTime_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getToast());
        }

        public static final class CallHatInfo extends GeneratedMessageLite<CallHatInfo, Builder> implements CallHatInfoOrBuilder {
            private static final CallHatInfo DEFAULT_INSTANCE;
            public static final int HATURL_FIELD_NUMBER = 3;
            private static volatile i860<CallHatInfo> PARSER = null;
            public static final int POINT_FIELD_NUMBER = 2;
            public static final int USERID_FIELD_NUMBER = 1;
            private long point_;
            private String userId_ = "";
            private String hatUrl_ = "";

            public static final class Builder extends GeneratedMessageLite.b<CallHatInfo, Builder> implements CallHatInfoOrBuilder {
                private Builder() {
                    super(CallHatInfo.DEFAULT_INSTANCE);
                }

                public Builder clearHatUrl() {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).clearHatUrl();
                    return this;
                }

                public Builder clearPoint() {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).clearPoint();
                    return this;
                }

                public Builder clearUserId() {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).clearUserId();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
                public String getHatUrl() {
                    return ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).getHatUrl();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
                public ByteString getHatUrlBytes() {
                    return ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).getHatUrlBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
                public long getPoint() {
                    return ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).getPoint();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
                public String getUserId() {
                    return ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).getUserId();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
                public ByteString getUserIdBytes() {
                    return ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
                }

                public Builder setHatUrl(String str) {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).setHatUrl(str);
                    return this;
                }

                public Builder setHatUrlBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).setHatUrlBytes(byteString);
                    return this;
                }

                public Builder setPoint(long j) {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).setPoint(j);
                    return this;
                }

                public Builder setUserId(String str) {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                    return this;
                }

                public Builder setUserIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CallHatInfo) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                    return this;
                }
            }

            static {
                CallHatInfo callHatInfo = new CallHatInfo();
                DEFAULT_INSTANCE = callHatInfo;
                callHatInfo.makeImmutable();
            }

            private CallHatInfo() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHatUrl() {
                this.hatUrl_ = getDefaultInstance().getHatUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPoint() {
                this.point_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUserId() {
                this.userId_ = getDefaultInstance().getUserId();
            }

            public static CallHatInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(CallHatInfo callHatInfo) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(callHatInfo);
            }

            public static CallHatInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CallHatInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<CallHatInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHatUrl(String str) {
                str.getClass();
                this.hatUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHatUrlBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.hatUrl_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPoint(long j) {
                this.point_ = j;
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
                boolean z = false;
                switch (C04541.f1692xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CallHatInfo();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        CallHatInfo callHatInfo = (CallHatInfo) obj2;
                        this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !callHatInfo.userId_.isEmpty(), callHatInfo.userId_);
                        long j = this.point_;
                        boolean z2 = j != 0;
                        long j2 = callHatInfo.point_;
                        this.point_ = hVar.i(z2, j, j2 != 0, j2);
                        this.hatUrl_ = hVar.f(!this.hatUrl_.isEmpty(), this.hatUrl_, !callHatInfo.hatUrl_.isEmpty(), callHatInfo.hatUrl_);
                        GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                        return this;
                    case 6:
                        e eVar = (e) obj;
                        while (!z) {
                            try {
                                int iM = eVar.M();
                                if (iM != 0) {
                                    if (iM == 10) {
                                        this.userId_ = eVar.L();
                                    } else if (iM == 16) {
                                        this.point_ = eVar.v();
                                    } else if (iM == 26) {
                                        this.hatUrl_ = eVar.L();
                                    } else if (!eVar.R(iM)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                aag0.a(e.setUnfinishedMessage(this));
                                return null;
                            } catch (IOException e2) {
                                aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                                return null;
                            }
                        }
                        break;
                    case 7:
                        break;
                    case 8:
                        if (PARSER == null) {
                            synchronized (CallHatInfo.class) {
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

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
            public String getHatUrl() {
                return this.hatUrl_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
            public ByteString getHatUrlBytes() {
                return ByteString.copyFromUtf8(this.hatUrl_);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
            public long getPoint() {
                return this.point_;
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
                long j = this.point_;
                if (j != 0) {
                    iK += CodedOutputStream.v(2, j);
                }
                if (!this.hatUrl_.isEmpty()) {
                    iK += CodedOutputStream.K(3, getHatUrl());
                }
                ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
                return iK;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
            public String getUserId() {
                return this.userId_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHat.CallHatInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ByteString.copyFromUtf8(this.userId_);
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.userId_.isEmpty()) {
                    codedOutputStream.D0(1, getUserId());
                }
                long j = this.point_;
                if (j != 0) {
                    codedOutputStream.u0(2, j);
                }
                if (this.hatUrl_.isEmpty()) {
                    return;
                }
                codedOutputStream.D0(3, getHatUrl());
            }

            public static CallHatInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static CallHatInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static CallHatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CallHatInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static CallHatInfo parseFrom(InputStream inputStream) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CallHatInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static CallHatInfo parseFrom(e eVar) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static CallHatInfo parseFrom(e eVar, h hVar) throws IOException {
                return (CallHatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static VoiceGrabHat parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGrabHat parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceGrabHat, Builder> implements VoiceGrabHatOrBuilder {
            private Builder() {
                super(VoiceGrabHat.DEFAULT_INSTANCE);
            }

            public Builder addAllCallHatInfos(Iterable<? extends CallHatInfo> iterable) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).addAllCallHatInfos(iterable);
                return this;
            }

            public Builder addCallHatInfos(CallHatInfo callHatInfo) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).addCallHatInfos(callHatInfo);
                return this;
            }

            public Builder clearCallHatInfos() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearCallHatInfos();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearToast();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).clearUpdatedTime();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public CallHatInfo getCallHatInfos(int i) {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getCallHatInfos(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public int getCallHatInfosCount() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getCallHatInfosCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public List<CallHatInfo> getCallHatInfosList() {
                return Collections.unmodifiableList(((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getCallHatInfosList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public String getId() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public String getLiveId() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public String getStatus() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public ByteString getStatusBytes() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public String getToast() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatOrBuilder
            public long getUpdatedTime() {
                return ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).getUpdatedTime();
            }

            public Builder removeCallHatInfos(int i) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).removeCallHatInfos(i);
                return this;
            }

            public Builder setCallHatInfos(int i, CallHatInfo callHatInfo) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setCallHatInfos(i, callHatInfo);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setToastBytes(byteString);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setUpdatedTime(j);
                return this;
            }

            public Builder addCallHatInfos(int i, CallHatInfo callHatInfo) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).addCallHatInfos(i, callHatInfo);
                return this;
            }

            public Builder setCallHatInfos(int i, CallHatInfo.Builder builder) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).setCallHatInfos(i, builder);
                return this;
            }

            public Builder addCallHatInfos(CallHatInfo.Builder builder) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).addCallHatInfos(builder);
                return this;
            }

            public Builder addCallHatInfos(int i, CallHatInfo.Builder builder) {
                copyOnWrite();
                ((VoiceGrabHat) ((GeneratedMessageLite.b) this).instance).addCallHatInfos(i, builder);
                return this;
            }
        }

        public static VoiceGrabHat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGrabHat parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceGrabHat parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGrabHat parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGrabHat parseFrom(e eVar) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallHatInfos(int i, CallHatInfo callHatInfo) {
            callHatInfo.getClass();
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.add(i, callHatInfo);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGrabHat parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceGrabHat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallHatInfos(int i, CallHatInfo callHatInfo) {
            callHatInfo.getClass();
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.set(i, callHatInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallHatInfos(CallHatInfo callHatInfo) {
            callHatInfo.getClass();
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.add(callHatInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallHatInfos(int i, CallHatInfo.Builder builder) {
            ensureCallHatInfosIsMutable();
            this.callHatInfos_.add(i, (CallHatInfo) builder.build());
        }
    }

    public static final class VoiceGrabHatCp extends GeneratedMessageLite<VoiceGrabHatCp, Builder> implements VoiceGrabHatCpOrBuilder {
        private static final VoiceGrabHatCp DEFAULT_INSTANCE;
        public static final int HATURL_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOVEPOINT_FIELD_NUMBER = 6;
        public static final int OTHERUSERID_FIELD_NUMBER = 4;
        public static final int OTHERUSERMASK_FIELD_NUMBER = 5;
        private static volatile i860<VoiceGrabHatCp> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int USERMASK_FIELD_NUMBER = 3;
        private long lovePoint_;
        private userMaskConfig.UserMask otherUserMask_;
        private userMaskConfig.UserMask userMask_;
        private String id_ = "";
        private String userId_ = "";
        private String otherUserId_ = "";
        private String hatUrl_ = "";

        static {
            VoiceGrabHatCp voiceGrabHatCp = new VoiceGrabHatCp();
            DEFAULT_INSTANCE = voiceGrabHatCp;
            voiceGrabHatCp.makeImmutable();
        }

        private VoiceGrabHatCp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHatUrl() {
            this.hatUrl_ = getDefaultInstance().getHatUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLovePoint() {
            this.lovePoint_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserMask() {
            this.otherUserMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        public static VoiceGrabHatCp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOtherUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.otherUserMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.otherUserMask_ = userMask;
            } else {
                this.otherUserMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.otherUserMask_).mergeFrom(userMask)).buildPartial();
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

        public static Builder newBuilder(VoiceGrabHatCp voiceGrabHatCp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceGrabHatCp);
        }

        public static VoiceGrabHatCp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGrabHatCp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceGrabHatCp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHatUrl(String str) {
            str.getClass();
            this.hatUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHatUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.hatUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLovePoint(long j) {
            this.lovePoint_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserMask(userMaskConfig.UserMask.Builder builder) {
            this.otherUserMask_ = (userMaskConfig.UserMask) builder.build();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04541.f1692xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGrabHatCp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceGrabHatCp voiceGrabHatCp = (VoiceGrabHatCp) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceGrabHatCp.id_.isEmpty(), voiceGrabHatCp.id_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceGrabHatCp.userId_.isEmpty(), voiceGrabHatCp.userId_);
                    this.userMask_ = hVar.o(this.userMask_, voiceGrabHatCp.userMask_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, !voiceGrabHatCp.otherUserId_.isEmpty(), voiceGrabHatCp.otherUserId_);
                    this.otherUserMask_ = hVar.o(this.otherUserMask_, voiceGrabHatCp.otherUserMask_);
                    long j = this.lovePoint_;
                    boolean z2 = j != 0;
                    long j2 = voiceGrabHatCp.lovePoint_;
                    this.lovePoint_ = hVar.i(z2, j, j2 != 0, j2);
                    this.hatUrl_ = hVar.f(!this.hatUrl_.isEmpty(), this.hatUrl_, !voiceGrabHatCp.hatUrl_.isEmpty(), voiceGrabHatCp.hatUrl_);
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
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.userMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    this.otherUserId_ = eVar.L();
                                } else if (iM == 42) {
                                    userMaskConfig.UserMask userMask2 = this.otherUserMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask2 != null ? (userMaskConfig.UserMask.Builder) userMask2.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW2 = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.otherUserMask_ = userMaskW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMaskW2);
                                        this.otherUserMask_ = (userMaskConfig.UserMask) builder2.buildPartial();
                                    }
                                } else if (iM == 48) {
                                    this.lovePoint_ = eVar.v();
                                } else if (iM == 58) {
                                    this.hatUrl_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceGrabHatCp.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public String getHatUrl() {
            return this.hatUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public ByteString getHatUrlBytes() {
            return ByteString.copyFromUtf8(this.hatUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public long getLovePoint() {
            return this.lovePoint_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public userMaskConfig.UserMask getOtherUserMask() {
            userMaskConfig.UserMask userMask = this.otherUserMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (this.userMask_ != null) {
                iK += CodedOutputStream.C(3, getUserMask());
            }
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(4, getOtherUserId());
            }
            if (this.otherUserMask_ != null) {
                iK += CodedOutputStream.C(5, getOtherUserMask());
            }
            long j = this.lovePoint_;
            if (j != 0) {
                iK += CodedOutputStream.v(6, j);
            }
            if (!this.hatUrl_.isEmpty()) {
                iK += CodedOutputStream.K(7, getHatUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public boolean hasOtherUserMask() {
            return this.otherUserMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(3, getUserMask());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.D0(4, getOtherUserId());
            }
            if (this.otherUserMask_ != null) {
                codedOutputStream.w0(5, getOtherUserMask());
            }
            long j = this.lovePoint_;
            if (j != 0) {
                codedOutputStream.u0(6, j);
            }
            if (this.hatUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(7, getHatUrl());
        }

        public static VoiceGrabHatCp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGrabHatCp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.otherUserMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceGrabHatCp, Builder> implements VoiceGrabHatCpOrBuilder {
            private Builder() {
                super(VoiceGrabHatCp.DEFAULT_INSTANCE);
            }

            public Builder clearHatUrl() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearHatUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearLovePoint() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearLovePoint();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearOtherUserMask() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearOtherUserMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public String getHatUrl() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getHatUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public ByteString getHatUrlBytes() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getHatUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public String getId() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public long getLovePoint() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getLovePoint();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public String getOtherUserId() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public userMaskConfig.UserMask getOtherUserMask() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getOtherUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public String getUserId() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public boolean hasOtherUserMask() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).hasOtherUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.voiceGrabHat.VoiceGrabHatCpOrBuilder
            public boolean hasUserMask() {
                return ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeOtherUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).mergeOtherUserMask(userMask);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setHatUrl(String str) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setHatUrl(str);
                return this;
            }

            public Builder setHatUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setHatUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLovePoint(long j) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setLovePoint(j);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setOtherUserMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder setOtherUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setOtherUserMask(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceGrabHatCp) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }
        }

        public static VoiceGrabHatCp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGrabHatCp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceGrabHatCp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGrabHatCp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGrabHatCp parseFrom(e eVar) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGrabHatCp parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceGrabHatCp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
