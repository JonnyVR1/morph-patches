package com.p003p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceLivePk {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk$1 */
    public static /* synthetic */ class C04751 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1704xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1704xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface CallPkPointOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getIsNewTopOne();

        long getPoint();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLivePkModifyOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLivePkPointOrBuilder extends o6z {
        CallPkPoint getCallRewardPoints(int i);

        int getCallRewardPointsCount();

        List<CallPkPoint> getCallRewardPointsList();

        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceLivePk() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class CallPkPoint extends GeneratedMessageLite<CallPkPoint, Builder> implements CallPkPointOrBuilder {
        private static final CallPkPoint DEFAULT_INSTANCE;
        public static final int ISNEWTOPONE_FIELD_NUMBER = 3;
        private static volatile i860<CallPkPoint> PARSER = null;
        public static final int POINT_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private boolean isNewTopOne_;
        private long point_;
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<CallPkPoint, Builder> implements CallPkPointOrBuilder {
            private Builder() {
                super(CallPkPoint.DEFAULT_INSTANCE);
            }

            public Builder clearIsNewTopOne() {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).clearIsNewTopOne();
                return this;
            }

            public Builder clearPoint() {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).clearPoint();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public boolean getIsNewTopOne() {
                return ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).getIsNewTopOne();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public long getPoint() {
                return ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).getPoint();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public String getUserId() {
                return ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public ByteString getUserIdBytes() {
                return ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setIsNewTopOne(boolean z) {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).setIsNewTopOne(z);
                return this;
            }

            public Builder setPoint(long j) {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).setPoint(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CallPkPoint) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            CallPkPoint callPkPoint = new CallPkPoint();
            DEFAULT_INSTANCE = callPkPoint;
            callPkPoint.makeImmutable();
        }

        private CallPkPoint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsNewTopOne() {
            this.isNewTopOne_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoint() {
            this.point_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static CallPkPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CallPkPoint callPkPoint) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(callPkPoint);
        }

        public static CallPkPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallPkPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<CallPkPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsNewTopOne(boolean z) {
            this.isNewTopOne_ = z;
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
            switch (C04751.f1704xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CallPkPoint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    CallPkPoint callPkPoint = (CallPkPoint) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !callPkPoint.userId_.isEmpty(), callPkPoint.userId_);
                    long j = this.point_;
                    boolean z2 = j != 0;
                    long j2 = callPkPoint.point_;
                    this.point_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = this.isNewTopOne_;
                    boolean z4 = callPkPoint.isNewTopOne_;
                    this.isNewTopOne_ = hVar.d(z3, z3, z4, z4);
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
                                    this.point_ = eVar.O();
                                } else if (iM == 24) {
                                    this.isNewTopOne_ = eVar.m();
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
                        synchronized (CallPkPoint.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public boolean getIsNewTopOne() {
            return this.isNewTopOne_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
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
                iK += CodedOutputStream.P(2, j);
            }
            boolean z = this.isNewTopOne_;
            if (z) {
                iK += CodedOutputStream.f(3, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            long j = this.point_;
            if (j != 0) {
                codedOutputStream.I0(2, j);
            }
            boolean z = this.isNewTopOne_;
            if (z) {
                codedOutputStream.a0(3, z);
            }
        }

        public static CallPkPoint parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CallPkPoint parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static CallPkPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CallPkPoint parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static CallPkPoint parseFrom(InputStream inputStream) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallPkPoint parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CallPkPoint parseFrom(e eVar) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static CallPkPoint parseFrom(e eVar, h hVar) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLivePkModify extends GeneratedMessageLite<VoiceLivePkModify, Builder> implements VoiceLivePkModifyOrBuilder {
        private static final VoiceLivePkModify DEFAULT_INSTANCE;
        private static volatile i860<VoiceLivePkModify> PARSER;

        public static final class Builder extends GeneratedMessageLite.b<VoiceLivePkModify, Builder> implements VoiceLivePkModifyOrBuilder {
            private Builder() {
                super(VoiceLivePkModify.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceLivePkModify voiceLivePkModify = new VoiceLivePkModify();
            DEFAULT_INSTANCE = voiceLivePkModify;
            voiceLivePkModify.makeImmutable();
        }

        private VoiceLivePkModify() {
        }

        public static VoiceLivePkModify getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLivePkModify voiceLivePkModify) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLivePkModify);
        }

        public static VoiceLivePkModify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkModify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLivePkModify> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04751.f1704xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePkModify();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM == 0 || !eVar.R(iM)) {
                                z = true;
                            }
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
                        synchronized (VoiceLivePkModify.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static VoiceLivePkModify parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePkModify parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLivePkModify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePkModify parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLivePkModify parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkModify parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePkModify parseFrom(e eVar) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePkModify parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLivePkPoint extends GeneratedMessageLite<VoiceLivePkPoint, Builder> implements VoiceLivePkPointOrBuilder {
        public static final int CALLREWARDPOINTS_FIELD_NUMBER = 1;
        private static final VoiceLivePkPoint DEFAULT_INSTANCE;
        private static volatile i860<VoiceLivePkPoint> PARSER;
        private l.h<CallPkPoint> callRewardPoints_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceLivePkPoint voiceLivePkPoint = new VoiceLivePkPoint();
            DEFAULT_INSTANCE = voiceLivePkPoint;
            voiceLivePkPoint.makeImmutable();
        }

        private VoiceLivePkPoint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCallRewardPoints(Iterable<? extends CallPkPoint> iterable) {
            ensureCallRewardPointsIsMutable();
            a.addAll(iterable, this.callRewardPoints_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(CallPkPoint.Builder builder) {
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add((CallPkPoint) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallRewardPoints() {
            this.callRewardPoints_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCallRewardPointsIsMutable() {
            if (this.callRewardPoints_.q()) {
                return;
            }
            this.callRewardPoints_ = GeneratedMessageLite.mutableCopy(this.callRewardPoints_);
        }

        public static VoiceLivePkPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLivePkPoint voiceLivePkPoint) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLivePkPoint);
        }

        public static VoiceLivePkPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLivePkPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCallRewardPoints(int i) {
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallRewardPoints(int i, CallPkPoint.Builder builder) {
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.set(i, (CallPkPoint) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04751.f1704xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePkPoint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.callRewardPoints_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.callRewardPoints_ = ((GeneratedMessageLite.h) obj).g(this.callRewardPoints_, ((VoiceLivePkPoint) obj2).callRewardPoints_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    if (!this.callRewardPoints_.q()) {
                                        this.callRewardPoints_ = GeneratedMessageLite.mutableCopy(this.callRewardPoints_);
                                    }
                                    this.callRewardPoints_.add(eVar.w(CallPkPoint.parser(), hVar));
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
                        synchronized (VoiceLivePkPoint.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
        public CallPkPoint getCallRewardPoints(int i) {
            return (CallPkPoint) this.callRewardPoints_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
        public int getCallRewardPointsCount() {
            return this.callRewardPoints_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
        public List<CallPkPoint> getCallRewardPointsList() {
            return this.callRewardPoints_;
        }

        public CallPkPointOrBuilder getCallRewardPointsOrBuilder(int i) {
            return (CallPkPointOrBuilder) this.callRewardPoints_.get(i);
        }

        public List<? extends CallPkPointOrBuilder> getCallRewardPointsOrBuilderList() {
            return this.callRewardPoints_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = 0;
            for (int i2 = 0; i2 < this.callRewardPoints_.size(); i2++) {
                iC += CodedOutputStream.C(1, (q) this.callRewardPoints_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.callRewardPoints_.size(); i++) {
                codedOutputStream.w0(1, (q) this.callRewardPoints_.get(i));
            }
        }

        public static VoiceLivePkPoint parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePkPoint parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceLivePkPoint, Builder> implements VoiceLivePkPointOrBuilder {
            private Builder() {
                super(VoiceLivePkPoint.DEFAULT_INSTANCE);
            }

            public Builder addAllCallRewardPoints(Iterable<? extends CallPkPoint> iterable) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).addAllCallRewardPoints(iterable);
                return this;
            }

            public Builder addCallRewardPoints(CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).addCallRewardPoints(callPkPoint);
                return this;
            }

            public Builder clearCallRewardPoints() {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).clearCallRewardPoints();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public CallPkPoint getCallRewardPoints(int i) {
                return ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).getCallRewardPoints(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public int getCallRewardPointsCount() {
                return ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).getCallRewardPointsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public List<CallPkPoint> getCallRewardPointsList() {
                return Collections.unmodifiableList(((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).getCallRewardPointsList());
            }

            public Builder removeCallRewardPoints(int i) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).removeCallRewardPoints(i);
                return this;
            }

            public Builder setCallRewardPoints(int i, CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).setCallRewardPoints(i, callPkPoint);
                return this;
            }

            public Builder addCallRewardPoints(int i, CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).addCallRewardPoints(i, callPkPoint);
                return this;
            }

            public Builder setCallRewardPoints(int i, CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).setCallRewardPoints(i, builder);
                return this;
            }

            public Builder addCallRewardPoints(CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).addCallRewardPoints(builder);
                return this;
            }

            public Builder addCallRewardPoints(int i, CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) ((GeneratedMessageLite.b) this).instance).addCallRewardPoints(i, builder);
                return this;
            }
        }

        public static VoiceLivePkPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePkPoint parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLivePkPoint parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkPoint parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePkPoint parseFrom(e eVar) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(int i, CallPkPoint callPkPoint) {
            callPkPoint.getClass();
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add(i, callPkPoint);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePkPoint parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallRewardPoints(int i, CallPkPoint callPkPoint) {
            callPkPoint.getClass();
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.set(i, callPkPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(CallPkPoint callPkPoint) {
            callPkPoint.getClass();
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add(callPkPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(int i, CallPkPoint.Builder builder) {
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add(i, (CallPkPoint) builder.build());
        }
    }
}
