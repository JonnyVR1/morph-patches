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
public final class SAuth extends GeneratedMessageLite<SAuth, C4113b> implements lfz {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final int CLIENTTYPE_FIELD_NUMBER = 5;
    private static final SAuth DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 3;
    private static volatile ng60<SAuth> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int version_;
    private String appId_ = "";
    private String token_ = "";
    private String deviceId_ = "";
    private String clientType_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuth$a */
    public static /* synthetic */ class C4112a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14771a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14771a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14771a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C4113b newBuilder(SAuth sAuth) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAuth);
    }

    public static SAuth parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<SAuth> parser() {
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4112a c4112a = null;
        boolean z = false;
        switch (C4112a.f14771a[methodToInvoke.ordinal()]) {
            case 1:
                return new SAuth();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4113b(c4112a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                SAuth sAuth = (SAuth) obj2;
                this.appId_ = interfaceC3409h.mo17052f(!this.appId_.isEmpty(), this.appId_, !sAuth.appId_.isEmpty(), sAuth.appId_);
                this.token_ = interfaceC3409h.mo17052f(!this.token_.isEmpty(), this.token_, !sAuth.token_.isEmpty(), sAuth.token_);
                this.deviceId_ = interfaceC3409h.mo17052f(!this.deviceId_.isEmpty(), this.deviceId_, !sAuth.deviceId_.isEmpty(), sAuth.deviceId_);
                int i = this.version_;
                boolean z2 = i != 0;
                int i2 = sAuth.version_;
                this.version_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                this.clientType_ = interfaceC3409h.mo17052f(!this.clientType_.isEmpty(), this.clientType_, !sAuth.clientType_.isEmpty(), sAuth.clientType_);
                GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 10) {
                                this.appId_ = c3430e.m17170L();
                            } else if (iM17171M == 18) {
                                this.token_ = c3430e.m17170L();
                            } else if (iM17171M == 26) {
                                this.deviceId_ = c3430e.m17170L();
                            } else if (iM17171M == 32) {
                                this.version_ = c3430e.m17196u();
                            } else if (iM17171M == 42) {
                                this.clientType_ = c3430e.m17170L();
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
                    synchronized (SAuth.class) {
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

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16956K = !this.appId_.isEmpty() ? CodedOutputStream.m16956K(1, getAppId()) : 0;
        if (!this.token_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(2, getToken());
        }
        if (!this.deviceId_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(3, getDeviceId());
        }
        int i2 = this.version_;
        if (i2 != 0) {
            iM16956K += CodedOutputStream.m16984t(4, i2);
        }
        if (!this.clientType_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(5, getClientType());
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
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

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.appId_.isEmpty()) {
            codedOutputStream.mo16994D0(1, getAppId());
        }
        if (!this.token_.isEmpty()) {
            codedOutputStream.mo16994D0(2, getToken());
        }
        if (!this.deviceId_.isEmpty()) {
            codedOutputStream.mo16994D0(3, getDeviceId());
        }
        int i = this.version_;
        if (i != 0) {
            codedOutputStream.mo17025s0(4, i);
        }
        if (this.clientType_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16994D0(5, getClientType());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.SAuth$b */
    public static final class C4113b extends GeneratedMessageLite.AbstractC3403b<SAuth, C4113b> implements lfz {
        private C4113b() {
            super(SAuth.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4113b(C4112a c4112a) {
            this();
        }
    }

    public static SAuth parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static SAuth parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static SAuth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SAuth parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static SAuth parseFrom(InputStream inputStream) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SAuth parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static SAuth parseFrom(C3430e c3430e) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4113b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SAuth parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (SAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
