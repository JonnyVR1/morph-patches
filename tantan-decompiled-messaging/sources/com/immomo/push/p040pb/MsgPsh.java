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
public final class MsgPsh extends GeneratedMessageLite<MsgPsh, C3943b> implements o6z {
    private static final MsgPsh DEFAULT_INSTANCE;
    public static final int LT_FIELD_NUMBER = 1;
    private static volatile i860<MsgPsh> PARSER;
    private String lt_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgPsh$a */
    public static /* synthetic */ class C3942a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14040a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14040a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14040a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C3943b newBuilder(MsgPsh msgPsh) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgPsh);
    }

    public static MsgPsh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPsh parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<MsgPsh> parser() {
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
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.lt_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3942a c3942a = null;
        switch (C3942a.f14040a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgPsh();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3943b(c3942a);
            case 5:
                MsgPsh msgPsh = (MsgPsh) obj2;
                this.lt_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16997f(!this.lt_.isEmpty(), this.lt_, true ^ msgPsh.lt_.isEmpty(), msgPsh.lt_);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                boolean z = false;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.lt_ = c3407e.m17115L();
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
                    synchronized (MsgPsh.class) {
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

    public String getLt() {
        return this.lt_;
    }

    public ByteString getLtBytes() {
        return ByteString.copyFromUtf8(this.lt_);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.lt_.isEmpty() ? CodedOutputStream.m16901K(1, getLt()) : 0;
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.lt_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16939D0(1, getLt());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgPsh$b */
    public static final class C3943b extends GeneratedMessageLite.AbstractC3380b<MsgPsh, C3943b> implements o6z {
        private C3943b() {
            super(MsgPsh.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3943b(C3942a c3942a) {
            this();
        }
    }

    public static MsgPsh parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgPsh parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static MsgPsh parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgPsh parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static MsgPsh parseFrom(InputStream inputStream) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPsh parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgPsh parseFrom(C3407e c3407e) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3943b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgPsh parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (MsgPsh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
