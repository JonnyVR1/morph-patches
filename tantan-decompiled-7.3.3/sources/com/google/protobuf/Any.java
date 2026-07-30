package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes7.dex */
public final class Any extends GeneratedMessageLite<Any, C3389b> implements lfz {
    private static final Any DEFAULT_INSTANCE;
    private static volatile ng60<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    /* JADX INFO: renamed from: com.google.protobuf.Any$a */
    public static /* synthetic */ class C3388a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11545a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11545a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11545a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C3389b newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<Any> parser() {
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3388a c3388a = null;
        boolean z = false;
        switch (C3388a.f11545a[methodToInvoke.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3389b(c3388a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                Any any = (Any) obj2;
                this.typeUrl_ = interfaceC3409h.mo17052f(!this.typeUrl_.isEmpty(), this.typeUrl_, !any.typeUrl_.isEmpty(), any.typeUrl_);
                ByteString byteString = this.value_;
                ByteString byteString2 = ByteString.EMPTY;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = any.value_;
                this.value_ = interfaceC3409h.mo17054h(z2, byteString, byteString3 != byteString2, byteString3);
                GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 10) {
                                this.typeUrl_ = c3430e.m17170L();
                            } else if (iM17171M == 18) {
                                this.value_ = c3430e.m17189n();
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
                    synchronized (Any.class) {
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
        int iM16956K = !this.typeUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getTypeUrl()) : 0;
        if (!this.value_.isEmpty()) {
            iM16956K += CodedOutputStream.m16973i(2, this.value_);
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
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

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.typeUrl_.isEmpty()) {
            codedOutputStream.mo16994D0(1, getTypeUrl());
        }
        if (this.value_.isEmpty()) {
            return;
        }
        codedOutputStream.mo17011e0(2, this.value_);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Any$b */
    public static final class C3389b extends GeneratedMessageLite.AbstractC3403b<Any, C3389b> implements lfz {
        public C3389b() {
            super(Any.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C3389b m16939a(String str) {
            copyOnWrite();
            ((Any) this.instance).setTypeUrl(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3389b m16940b(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).setValue(byteString);
            return this;
        }

        public /* synthetic */ C3389b(C3388a c3388a) {
            this();
        }
    }

    public static Any parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Any parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Any parseFrom(C3430e c3430e) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C3389b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Any parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
