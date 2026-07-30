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
public final class MsgPsh extends GeneratedMessageLite<MsgPsh, C4094b> implements lfz {
    private static final MsgPsh DEFAULT_INSTANCE;
    public static final int LT_FIELD_NUMBER = 1;
    private static volatile ng60<MsgPsh> PARSER;
    private String lt_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgPsh$a */
    public static /* synthetic */ class C4093a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14759a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14759a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14759a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        MsgPsh msgPsh = new MsgPsh();
        DEFAULT_INSTANCE = msgPsh;
        msgPsh.makeImmutable();
    }

    private MsgPsh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLt() {
        this.lt_ = getDefaultInstance().getLt();
    }

    public static MsgPsh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4094b newBuilder(MsgPsh msgPsh) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgPsh);
    }

    public static MsgPsh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPsh parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<MsgPsh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLt(String str) {
        str.getClass();
        this.lt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLtBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.lt_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4093a c4093a = null;
        switch (C4093a.f14759a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgPsh();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4094b(c4093a);
            case 5:
                MsgPsh msgPsh = (MsgPsh) obj2;
                this.lt_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.lt_.isEmpty(), this.lt_, true ^ msgPsh.lt_.isEmpty(), msgPsh.lt_);
                GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                boolean z = false;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 10) {
                                this.lt_ = c3430e.m17170L();
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
                    synchronized (MsgPsh.class) {
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

    public String getLt() {
        return this.lt_;
    }

    public ByteString getLtBytes() {
        return ByteString.copyFromUtf8(this.lt_);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16956K = !this.lt_.isEmpty() ? CodedOutputStream.m16956K(1, getLt()) : 0;
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.lt_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16994D0(1, getLt());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgPsh$b */
    public static final class C4094b extends GeneratedMessageLite.AbstractC3403b<MsgPsh, C4094b> implements lfz {
        private C4094b() {
            super(MsgPsh.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4094b(C4093a c4093a) {
            this();
        }
    }

    public static MsgPsh parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgPsh parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static MsgPsh parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgPsh parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static MsgPsh parseFrom(InputStream inputStream) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPsh parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgPsh parseFrom(C3430e c3430e) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4094b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgPsh parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
