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
public final class SAuthRet extends GeneratedMessageLite<SAuthRet, C3964b> implements o6z {
    public static final int AP_FIELD_NUMBER = 3;
    private static final SAuthRet DEFAULT_INSTANCE;
    public static final int EC_FIELD_NUMBER = 1;
    public static final int EM_FIELD_NUMBER = 2;
    private static volatile i860<SAuthRet> PARSER;
    private int ec_;
    private String em_ = "";
    private String ap_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuthRet$a */
    public static /* synthetic */ class C3963a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14053a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14053a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14053a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        SAuthRet sAuthRet = new SAuthRet();
        DEFAULT_INSTANCE = sAuthRet;
        sAuthRet.makeImmutable();
    }

    private SAuthRet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAp() {
        this.ap_ = getDefaultInstance().getAp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEc() {
        this.ec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEm() {
        this.em_ = getDefaultInstance().getEm();
    }

    public static SAuthRet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3964b newBuilder(SAuthRet sAuthRet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAuthRet);
    }

    public static SAuthRet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuthRet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<SAuthRet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAp(String str) {
        str.getClass();
        this.ap_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.ap_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEc(int i) {
        this.ec_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEm(String str) {
        str.getClass();
        this.em_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.em_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3963a c3963a = null;
        boolean z = false;
        switch (C3963a.f14053a[methodToInvoke.ordinal()]) {
            case 1:
                return new SAuthRet();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3964b(c3963a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                SAuthRet sAuthRet = (SAuthRet) obj2;
                int i = this.ec_;
                boolean z2 = i != 0;
                int i2 = sAuthRet.ec_;
                this.ec_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                this.em_ = interfaceC3386h.mo16997f(!this.em_.isEmpty(), this.em_, !sAuthRet.em_.isEmpty(), sAuthRet.em_);
                this.ap_ = interfaceC3386h.mo16997f(!this.ap_.isEmpty(), this.ap_, !sAuthRet.ap_.isEmpty(), sAuthRet.ap_);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 8) {
                                this.ec_ = c3407e.m17141u();
                            } else if (iM17116M == 18) {
                                this.em_ = c3407e.m17115L();
                            } else if (iM17116M == 26) {
                                this.ap_ = c3407e.m17115L();
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
                    synchronized (SAuthRet.class) {
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

    public String getAp() {
        return this.ap_;
    }

    public ByteString getApBytes() {
        return ByteString.copyFromUtf8(this.ap_);
    }

    public int getEc() {
        return this.ec_;
    }

    public String getEm() {
        return this.em_;
    }

    public ByteString getEmBytes() {
        return ByteString.copyFromUtf8(this.em_);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.ec_;
        int iM16929t = i2 != 0 ? CodedOutputStream.m16929t(1, i2) : 0;
        if (!this.em_.isEmpty()) {
            iM16929t += CodedOutputStream.m16901K(2, getEm());
        }
        if (!this.ap_.isEmpty()) {
            iM16929t += CodedOutputStream.m16901K(3, getAp());
        }
        this.memoizedSerializedSize = iM16929t;
        return iM16929t;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.ec_;
        if (i != 0) {
            codedOutputStream.mo16970s0(1, i);
        }
        if (!this.em_.isEmpty()) {
            codedOutputStream.mo16939D0(2, getEm());
        }
        if (this.ap_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16939D0(3, getAp());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuthRet$b */
    public static final class C3964b extends GeneratedMessageLite.AbstractC3380b<SAuthRet, C3964b> implements o6z {
        private C3964b() {
            super(SAuthRet.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3964b(C3963a c3963a) {
            this();
        }
    }

    public static SAuthRet parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static SAuthRet parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static SAuthRet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SAuthRet parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static SAuthRet parseFrom(InputStream inputStream) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuthRet parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static SAuthRet parseFrom(C3407e c3407e) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3964b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SAuthRet parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
