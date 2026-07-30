package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes7.dex */
public final class Any extends GeneratedMessageLite<Any, C3366b> implements o6z {
    private static final Any DEFAULT_INSTANCE;
    private static volatile i860<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    /* JADX INFO: renamed from: com.google.protobuf.Any$a */
    public static /* synthetic */ class C3365a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11508a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11508a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11508a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        any.makeImmutable();
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3366b newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<Any> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3365a c3365a = null;
        boolean z = false;
        switch (C3365a.f11508a[methodToInvoke.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3366b(c3365a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                Any any = (Any) obj2;
                this.typeUrl_ = interfaceC3386h.mo16997f(!this.typeUrl_.isEmpty(), this.typeUrl_, !any.typeUrl_.isEmpty(), any.typeUrl_);
                ByteString byteString = this.value_;
                ByteString byteString2 = ByteString.EMPTY;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = any.value_;
                this.value_ = interfaceC3386h.mo16999h(z2, byteString, byteString3 != byteString2, byteString3);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.typeUrl_ = c3407e.m17115L();
                            } else if (iM17116M == 18) {
                                this.value_ = c3407e.m17134n();
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
                    synchronized (Any.class) {
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

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.typeUrl_.isEmpty() ? CodedOutputStream.m16901K(1, getTypeUrl()) : 0;
        if (!this.value_.isEmpty()) {
            iM16901K += CodedOutputStream.m16918i(2, this.value_);
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.typeUrl_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getTypeUrl());
        }
        if (this.value_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16956e0(2, this.value_);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Any$b */
    public static final class C3366b extends GeneratedMessageLite.AbstractC3380b<Any, C3366b> implements o6z {
        public C3366b() {
            super(Any.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C3366b m16884a(String str) {
            copyOnWrite();
            ((Any) this.instance).setTypeUrl(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3366b m16885b(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).setValue(byteString);
            return this;
        }

        public /* synthetic */ C3366b(C3365a c3365a) {
            this();
        }
    }

    public static Any parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Any parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Any parseFrom(C3407e c3407e) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3366b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Any parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
