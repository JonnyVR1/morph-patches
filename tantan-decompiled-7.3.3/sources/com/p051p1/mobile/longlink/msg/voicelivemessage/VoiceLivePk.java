package com.p051p1.mobile.longlink.msg.voicelivemessage;

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
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes9.dex */
public final class VoiceLivePk {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk$1 */
    public static /* synthetic */ class C47141 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16724xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16724xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16724xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface CallPkPointOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean getIsNewTopOne();

        long getPoint();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLivePkModifyOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLivePkPointOrBuilder extends lfz {
        CallPkPoint getCallRewardPoints(int i);

        int getCallRewardPointsCount();

        List<CallPkPoint> getCallRewardPointsList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private VoiceLivePk() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class CallPkPoint extends GeneratedMessageLite<CallPkPoint, Builder> implements CallPkPointOrBuilder {
        private static final CallPkPoint DEFAULT_INSTANCE;
        public static final int ISNEWTOPONE_FIELD_NUMBER = 3;
        private static volatile ng60<CallPkPoint> PARSER = null;
        public static final int POINT_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private boolean isNewTopOne_;
        private long point_;
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<CallPkPoint, Builder> implements CallPkPointOrBuilder {
            private Builder() {
                super(CallPkPoint.DEFAULT_INSTANCE);
            }

            public Builder clearIsNewTopOne() {
                copyOnWrite();
                ((CallPkPoint) this.instance).clearIsNewTopOne();
                return this;
            }

            public Builder clearPoint() {
                copyOnWrite();
                ((CallPkPoint) this.instance).clearPoint();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((CallPkPoint) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public boolean getIsNewTopOne() {
                return ((CallPkPoint) this.instance).getIsNewTopOne();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public long getPoint() {
                return ((CallPkPoint) this.instance).getPoint();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public String getUserId() {
                return ((CallPkPoint) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
            public ByteString getUserIdBytes() {
                return ((CallPkPoint) this.instance).getUserIdBytes();
            }

            public Builder setIsNewTopOne(boolean z) {
                copyOnWrite();
                ((CallPkPoint) this.instance).setIsNewTopOne(z);
                return this;
            }

            public Builder setPoint(long j) {
                copyOnWrite();
                ((CallPkPoint) this.instance).setPoint(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((CallPkPoint) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CallPkPoint) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(callPkPoint);
        }

        public static CallPkPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallPkPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<CallPkPoint> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C47141.f16724xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CallPkPoint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    CallPkPoint callPkPoint = (CallPkPoint) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !callPkPoint.userId_.isEmpty(), callPkPoint.userId_);
                    long j = this.point_;
                    boolean z2 = j != 0;
                    long j2 = callPkPoint.point_;
                    this.point_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    boolean z3 = this.isNewTopOne_;
                    boolean z4 = callPkPoint.isNewTopOne_;
                    this.isNewTopOne_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.point_ = c3430e.m17173O();
                                } else if (iM17171M == 24) {
                                    this.isNewTopOne_ = c3430e.m17188m();
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
                        synchronized (CallPkPoint.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public boolean getIsNewTopOne() {
            return this.isNewTopOne_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public long getPoint() {
            return this.point_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            long j = this.point_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16961P(2, j);
            }
            boolean z = this.isNewTopOne_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(3, z);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.CallPkPointOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            long j = this.point_;
            if (j != 0) {
                codedOutputStream.mo16999I0(2, j);
            }
            boolean z = this.isNewTopOne_;
            if (z) {
                codedOutputStream.mo17005a0(3, z);
            }
        }

        public static CallPkPoint parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CallPkPoint parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static CallPkPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CallPkPoint parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static CallPkPoint parseFrom(InputStream inputStream) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallPkPoint parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CallPkPoint parseFrom(C3430e c3430e) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CallPkPoint parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (CallPkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLivePkModify extends GeneratedMessageLite<VoiceLivePkModify, Builder> implements VoiceLivePkModifyOrBuilder {
        private static final VoiceLivePkModify DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLivePkModify> PARSER;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLivePkModify, Builder> implements VoiceLivePkModifyOrBuilder {
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLivePkModify);
        }

        public static VoiceLivePkModify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkModify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLivePkModify> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47141.f16724xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePkModify();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M == 0 || !c3430e.m17176R(iM17171M)) {
                                z = true;
                            }
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
                        synchronized (VoiceLivePkModify.class) {
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
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static VoiceLivePkModify parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePkModify parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLivePkModify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePkModify parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLivePkModify parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkModify parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePkModify parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePkModify parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLivePkModify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLivePkPoint extends GeneratedMessageLite<VoiceLivePkPoint, Builder> implements VoiceLivePkPointOrBuilder {
        public static final int CALLREWARDPOINTS_FIELD_NUMBER = 1;
        private static final VoiceLivePkPoint DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLivePkPoint> PARSER;
        private C3437l.h<CallPkPoint> callRewardPoints_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3426a.addAll(iterable, this.callRewardPoints_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(CallPkPoint.Builder builder) {
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallRewardPoints() {
            this.callRewardPoints_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCallRewardPointsIsMutable() {
            if (this.callRewardPoints_.mo17140q()) {
                return;
            }
            this.callRewardPoints_ = GeneratedMessageLite.mutableCopy(this.callRewardPoints_);
        }

        public static VoiceLivePkPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLivePkPoint voiceLivePkPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLivePkPoint);
        }

        public static VoiceLivePkPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLivePkPoint> parser() {
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
            this.callRewardPoints_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C47141.f16724xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePkPoint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.callRewardPoints_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.callRewardPoints_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17053g(this.callRewardPoints_, ((VoiceLivePkPoint) obj2).callRewardPoints_);
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
                                    if (!this.callRewardPoints_.mo17140q()) {
                                        this.callRewardPoints_ = GeneratedMessageLite.mutableCopy(this.callRewardPoints_);
                                    }
                                    this.callRewardPoints_.add((CallPkPoint) c3430e.m17198w(CallPkPoint.parser(), c3433h));
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
                        synchronized (VoiceLivePkPoint.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
        public CallPkPoint getCallRewardPoints(int i) {
            return this.callRewardPoints_.get(i);
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
            return this.callRewardPoints_.get(i);
        }

        public List<? extends CallPkPointOrBuilder> getCallRewardPointsOrBuilderList() {
            return this.callRewardPoints_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = 0;
            for (int i2 = 0; i2 < this.callRewardPoints_.size(); i2++) {
                iM16948C += CodedOutputStream.m16948C(1, this.callRewardPoints_.get(i2));
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.callRewardPoints_.size(); i++) {
                codedOutputStream.mo17029w0(1, this.callRewardPoints_.get(i));
            }
        }

        public static VoiceLivePkPoint parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePkPoint parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLivePkPoint, Builder> implements VoiceLivePkPointOrBuilder {
            private Builder() {
                super(VoiceLivePkPoint.DEFAULT_INSTANCE);
            }

            public Builder addAllCallRewardPoints(Iterable<? extends CallPkPoint> iterable) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).addAllCallRewardPoints(iterable);
                return this;
            }

            public Builder addCallRewardPoints(CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).addCallRewardPoints(callPkPoint);
                return this;
            }

            public Builder clearCallRewardPoints() {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).clearCallRewardPoints();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public CallPkPoint getCallRewardPoints(int i) {
                return ((VoiceLivePkPoint) this.instance).getCallRewardPoints(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public int getCallRewardPointsCount() {
                return ((VoiceLivePkPoint) this.instance).getCallRewardPointsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk.VoiceLivePkPointOrBuilder
            public List<CallPkPoint> getCallRewardPointsList() {
                return Collections.unmodifiableList(((VoiceLivePkPoint) this.instance).getCallRewardPointsList());
            }

            public Builder removeCallRewardPoints(int i) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).removeCallRewardPoints(i);
                return this;
            }

            public Builder setCallRewardPoints(int i, CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).setCallRewardPoints(i, callPkPoint);
                return this;
            }

            public Builder addCallRewardPoints(int i, CallPkPoint callPkPoint) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).addCallRewardPoints(i, callPkPoint);
                return this;
            }

            public Builder setCallRewardPoints(int i, CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).setCallRewardPoints(i, builder);
                return this;
            }

            public Builder addCallRewardPoints(CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).addCallRewardPoints(builder);
                return this;
            }

            public Builder addCallRewardPoints(int i, CallPkPoint.Builder builder) {
                copyOnWrite();
                ((VoiceLivePkPoint) this.instance).addCallRewardPoints(i, builder);
                return this;
            }
        }

        public static VoiceLivePkPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePkPoint parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLivePkPoint parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePkPoint parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePkPoint parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallRewardPoints(int i, CallPkPoint callPkPoint) {
            callPkPoint.getClass();
            ensureCallRewardPointsIsMutable();
            this.callRewardPoints_.add(i, callPkPoint);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePkPoint parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLivePkPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
            this.callRewardPoints_.add(i, builder.build());
        }
    }
}
