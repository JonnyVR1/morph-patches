package com.immomo.push.p045pb;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes7.dex */
public final class Ret extends GeneratedMessageLite<Ret, C4111b> implements lfz {
    private static final Ret DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile ng60<Ret> PARSER = null;
    public static final int RETTYPE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 3;
    private String id_ = "";
    private int retType_;
    private long time_;

    /* JADX INFO: renamed from: com.immomo.push.pb.Ret$a */
    public static /* synthetic */ class C4110a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14770a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14770a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14770a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Ret ret = new Ret();
        DEFAULT_INSTANCE = ret;
        ret.makeImmutable();
    }

    private Ret() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetType() {
        this.retType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    public static Ret getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4111b newBuilder(Ret ret) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ret);
    }

    public static Ret parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ret) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ret parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<Ret> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setRetType(BodyType bodyType) {
        bodyType.getClass();
        this.retType_ = bodyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetTypeValue(int i) {
        this.retType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j) {
        this.time_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4110a c4110a = null;
        boolean z = false;
        switch (C4110a.f14770a[methodToInvoke.ordinal()]) {
            case 1:
                return new Ret();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4111b(c4110a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                Ret ret = (Ret) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !ret.id_.isEmpty(), ret.id_);
                int i = this.retType_;
                boolean z2 = i != 0;
                int i2 = ret.retType_;
                this.retType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                long j = this.time_;
                boolean z3 = j != 0;
                long j2 = ret.time_;
                this.time_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
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
                            } else if (iM17171M == 16) {
                                this.retType_ = c3430e.m17191p();
                            } else if (iM17171M == 24) {
                                this.time_ = c3430e.m17197v();
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
                    synchronized (Ret.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public BodyType getRetType() {
        BodyType bodyTypeForNumber = BodyType.forNumber(this.retType_);
        return bodyTypeForNumber == null ? BodyType.UNRECOGNIZED : bodyTypeForNumber;
    }

    public int getRetTypeValue() {
        return this.retType_;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
        if (this.retType_ != BodyType.RET.getNumber()) {
            iM16956K += CodedOutputStream.m16977m(2, this.retType_);
        }
        long j = this.time_;
        if (j != 0) {
            iM16956K += CodedOutputStream.m16986v(3, j);
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
    }

    public long getTime() {
        return this.time_;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16994D0(1, getId());
        }
        if (this.retType_ != BodyType.RET.getNumber()) {
            codedOutputStream.m17015i0(2, this.retType_);
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m17027u0(3, j);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Ret$b */
    public static final class C4111b extends GeneratedMessageLite.AbstractC3403b<Ret, C4111b> implements lfz {
        private C4111b() {
            super(Ret.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4111b(C4110a c4110a) {
            this();
        }
    }

    public static Ret parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Ret) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Ret parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static Ret parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ret parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static Ret parseFrom(InputStream inputStream) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ret parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Ret parseFrom(C3430e c3430e) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4111b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Ret parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
