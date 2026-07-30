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
public final class SAuthRet extends GeneratedMessageLite<SAuthRet, C4115b> implements lfz {
    public static final int AP_FIELD_NUMBER = 3;
    private static final SAuthRet DEFAULT_INSTANCE;
    public static final int EC_FIELD_NUMBER = 1;
    public static final int EM_FIELD_NUMBER = 2;
    private static volatile ng60<SAuthRet> PARSER;
    private int ec_;
    private String em_ = "";
    private String ap_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuthRet$a */
    public static /* synthetic */ class C4114a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14772a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14772a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14772a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C4115b newBuilder(SAuthRet sAuthRet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAuthRet);
    }

    public static SAuthRet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuthRet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<SAuthRet> parser() {
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.em_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4114a c4114a = null;
        boolean z = false;
        switch (C4114a.f14772a[methodToInvoke.ordinal()]) {
            case 1:
                return new SAuthRet();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4115b(c4114a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                SAuthRet sAuthRet = (SAuthRet) obj2;
                int i = this.ec_;
                boolean z2 = i != 0;
                int i2 = sAuthRet.ec_;
                this.ec_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                this.em_ = interfaceC3409h.mo17052f(!this.em_.isEmpty(), this.em_, !sAuthRet.em_.isEmpty(), sAuthRet.em_);
                this.ap_ = interfaceC3409h.mo17052f(!this.ap_.isEmpty(), this.ap_, !sAuthRet.ap_.isEmpty(), sAuthRet.ap_);
                GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 8) {
                                this.ec_ = c3430e.m17196u();
                            } else if (iM17171M == 18) {
                                this.em_ = c3430e.m17170L();
                            } else if (iM17171M == 26) {
                                this.ap_ = c3430e.m17170L();
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
                    synchronized (SAuthRet.class) {
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

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.ec_;
        int iM16984t = i2 != 0 ? CodedOutputStream.m16984t(1, i2) : 0;
        if (!this.em_.isEmpty()) {
            iM16984t += CodedOutputStream.m16956K(2, getEm());
        }
        if (!this.ap_.isEmpty()) {
            iM16984t += CodedOutputStream.m16956K(3, getAp());
        }
        this.memoizedSerializedSize = iM16984t;
        return iM16984t;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.ec_;
        if (i != 0) {
            codedOutputStream.mo17025s0(1, i);
        }
        if (!this.em_.isEmpty()) {
            codedOutputStream.mo16994D0(2, getEm());
        }
        if (this.ap_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16994D0(3, getAp());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuthRet$b */
    public static final class C4115b extends GeneratedMessageLite.AbstractC3403b<SAuthRet, C4115b> implements lfz {
        private C4115b() {
            super(SAuthRet.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4115b(C4114a c4114a) {
            this();
        }
    }

    public static SAuthRet parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static SAuthRet parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static SAuthRet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SAuthRet parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static SAuthRet parseFrom(InputStream inputStream) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuthRet parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static SAuthRet parseFrom(C3430e c3430e) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4115b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SAuthRet parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (SAuthRet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
