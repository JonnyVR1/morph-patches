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
public final class SAuth extends GeneratedMessageLite<SAuth, C3962b> implements o6z {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final int CLIENTTYPE_FIELD_NUMBER = 5;
    private static final SAuth DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 3;
    private static volatile i860<SAuth> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int version_;
    private String appId_ = "";
    private String token_ = "";
    private String deviceId_ = "";
    private String clientType_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuth$a */
    public static /* synthetic */ class C3961a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14052a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14052a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14052a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        SAuth sAuth = new SAuth();
        DEFAULT_INSTANCE = sAuth;
        sAuth.makeImmutable();
    }

    private SAuth() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.clientType_ = getDefaultInstance().getClientType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static SAuth getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3962b newBuilder(SAuth sAuth) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAuth);
    }

    public static SAuth parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<SAuth> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        str.getClass();
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.appId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(String str) {
        str.getClass();
        this.clientType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTypeBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.clientType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.deviceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3961a c3961a = null;
        boolean z = false;
        switch (C3961a.f14052a[methodToInvoke.ordinal()]) {
            case 1:
                return new SAuth();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3962b(c3961a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                SAuth sAuth = (SAuth) obj2;
                this.appId_ = interfaceC3386h.mo16997f(!this.appId_.isEmpty(), this.appId_, !sAuth.appId_.isEmpty(), sAuth.appId_);
                this.token_ = interfaceC3386h.mo16997f(!this.token_.isEmpty(), this.token_, !sAuth.token_.isEmpty(), sAuth.token_);
                this.deviceId_ = interfaceC3386h.mo16997f(!this.deviceId_.isEmpty(), this.deviceId_, !sAuth.deviceId_.isEmpty(), sAuth.deviceId_);
                int i = this.version_;
                boolean z2 = i != 0;
                int i2 = sAuth.version_;
                this.version_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                this.clientType_ = interfaceC3386h.mo16997f(!this.clientType_.isEmpty(), this.clientType_, !sAuth.clientType_.isEmpty(), sAuth.clientType_);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.appId_ = c3407e.m17115L();
                            } else if (iM17116M == 18) {
                                this.token_ = c3407e.m17115L();
                            } else if (iM17116M == 26) {
                                this.deviceId_ = c3407e.m17115L();
                            } else if (iM17116M == 32) {
                                this.version_ = c3407e.m17141u();
                            } else if (iM17116M == 42) {
                                this.clientType_ = c3407e.m17115L();
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
                    synchronized (SAuth.class) {
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

    public String getAppId() {
        return this.appId_;
    }

    public ByteString getAppIdBytes() {
        return ByteString.copyFromUtf8(this.appId_);
    }

    public String getClientType() {
        return this.clientType_;
    }

    public ByteString getClientTypeBytes() {
        return ByteString.copyFromUtf8(this.clientType_);
    }

    public String getDeviceId() {
        return this.deviceId_;
    }

    public ByteString getDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.deviceId_);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.appId_.isEmpty() ? CodedOutputStream.m16901K(1, getAppId()) : 0;
        if (!this.token_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(2, getToken());
        }
        if (!this.deviceId_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(3, getDeviceId());
        }
        int i2 = this.version_;
        if (i2 != 0) {
            iM16901K += CodedOutputStream.m16929t(4, i2);
        }
        if (!this.clientType_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(5, getClientType());
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    public String getToken() {
        return this.token_;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.token_);
    }

    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.appId_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getAppId());
        }
        if (!this.token_.isEmpty()) {
            codedOutputStream.mo16939D0(2, getToken());
        }
        if (!this.deviceId_.isEmpty()) {
            codedOutputStream.mo16939D0(3, getDeviceId());
        }
        int i = this.version_;
        if (i != 0) {
            codedOutputStream.mo16970s0(4, i);
        }
        if (this.clientType_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16939D0(5, getClientType());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuth$b */
    public static final class C3962b extends GeneratedMessageLite.AbstractC3380b<SAuth, C3962b> implements o6z {
        private C3962b() {
            super(SAuth.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3962b(C3961a c3961a) {
            this();
        }
    }

    public static SAuth parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static SAuth parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static SAuth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SAuth parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static SAuth parseFrom(InputStream inputStream) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuth parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static SAuth parseFrom(C3407e c3407e) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3962b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SAuth parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
