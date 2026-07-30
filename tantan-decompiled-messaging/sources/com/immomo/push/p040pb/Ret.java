package com.immomo.push.p040pb;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes7.dex */
public final class Ret extends GeneratedMessageLite<Ret, C3960b> implements o6z {
    private static final Ret DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile i860<Ret> PARSER = null;
    public static final int RETTYPE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 3;
    private String id_ = "";
    private int retType_;
    private long time_;

    /* JADX INFO: renamed from: com.immomo.push.pb.Ret$a */
    public static /* synthetic */ class C3959a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14051a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14051a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14051a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C3960b newBuilder(Ret ret) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ret);
    }

    public static Ret parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ret) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ret parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<Ret> parser() {
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
        AbstractC3403a.checkByteStringIsUtf8(byteString);
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
        C3959a c3959a = null;
        boolean z = false;
        switch (C3959a.f14051a[methodToInvoke.ordinal()]) {
            case 1:
                return new Ret();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3960b(c3959a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                Ret ret = (Ret) obj2;
                this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !ret.id_.isEmpty(), ret.id_);
                int i = this.retType_;
                boolean z2 = i != 0;
                int i2 = ret.retType_;
                this.retType_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                long j = this.time_;
                boolean z3 = j != 0;
                long j2 = ret.time_;
                this.time_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.id_ = c3407e.m17115L();
                            } else if (iM17116M == 16) {
                                this.retType_ = c3407e.m17136p();
                            } else if (iM17116M == 24) {
                                this.time_ = c3407e.m17142v();
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
                    synchronized (Ret.class) {
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

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
        if (this.retType_ != BodyType.RET.getNumber()) {
            iM16901K += CodedOutputStream.m16922m(2, this.retType_);
        }
        long j = this.time_;
        if (j != 0) {
            iM16901K += CodedOutputStream.m16931v(3, j);
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    public long getTime() {
        return this.time_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getId());
        }
        if (this.retType_ != BodyType.RET.getNumber()) {
            codedOutputStream.m16960i0(2, this.retType_);
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m16972u0(3, j);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Ret$b */
    public static final class C3960b extends GeneratedMessageLite.AbstractC3380b<Ret, C3960b> implements o6z {
        private C3960b() {
            super(Ret.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3960b(C3959a c3959a) {
            this();
        }
    }

    public static Ret parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Ret) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Ret parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static Ret parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ret parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static Ret parseFrom(InputStream inputStream) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ret parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Ret parseFrom(C3407e c3407e) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3960b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Ret parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (Ret) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
