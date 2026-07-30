package com.immomo.push.p040pb;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3418p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;
import p149l.x9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class MsgSyn extends GeneratedMessageLite<MsgSyn, C3945b> implements o6z {
    public static final int CLVS_FIELD_NUMBER = 2;
    private static final MsgSyn DEFAULT_INSTANCE;
    public static final int LT_FIELD_NUMBER = 3;
    public static final int NET_FIELD_NUMBER = 1;
    private static volatile i860<MsgSyn> PARSER;
    private int bitField0_;
    private MapFieldLite<String, Integer> clvs_ = MapFieldLite.emptyMapField();
    private String lt_ = "";
    private int net_;

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$a */
    public static /* synthetic */ class C3944a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14041a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14041a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14041a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$c */
    public static final class C3946c {

        /* JADX INFO: renamed from: a */
        static final C3418p<String, Integer> f14042a = C3418p.m17276c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
    }

    static {
        MsgSyn msgSyn = new MsgSyn();
        DEFAULT_INSTANCE = msgSyn;
        msgSyn.makeImmutable();
    }

    private MsgSyn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLt() {
        this.lt_ = getDefaultInstance().getLt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNet() {
        this.net_ = 0;
    }

    public static MsgSyn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Integer> getMutableClvsMap() {
        return internalGetMutableClvs();
    }

    private MapFieldLite<String, Integer> internalGetClvs() {
        return this.clvs_;
    }

    private MapFieldLite<String, Integer> internalGetMutableClvs() {
        if (!this.clvs_.isMutable()) {
            this.clvs_ = this.clvs_.mutableCopy();
        }
        return this.clvs_;
    }

    public static C3945b newBuilder(MsgSyn msgSyn) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgSyn);
    }

    public static MsgSyn parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgSyn parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<MsgSyn> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setNet(int i) {
        this.net_ = i;
    }

    public boolean containsClvs(String str) {
        str.getClass();
        return internalGetClvs().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3944a c3944a = null;
        boolean z = false;
        switch (C3944a.f14041a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgSyn();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.clvs_.makeImmutable();
                return null;
            case 4:
                return new C3945b(c3944a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                MsgSyn msgSyn = (MsgSyn) obj2;
                int i = this.net_;
                boolean z2 = i != 0;
                int i2 = msgSyn.net_;
                this.net_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                this.clvs_ = interfaceC3386h.mo17003l(this.clvs_, msgSyn.internalGetClvs());
                this.lt_ = interfaceC3386h.mo16997f(!this.lt_.isEmpty(), this.lt_, !msgSyn.lt_.isEmpty(), msgSyn.lt_);
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                    this.bitField0_ |= msgSyn.bitField0_;
                }
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                C3410h c3410h = (C3410h) obj2;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 8) {
                                this.net_ = c3407e.m17141u();
                            } else if (iM17116M == 18) {
                                if (!this.clvs_.isMutable()) {
                                    this.clvs_ = this.clvs_.mutableCopy();
                                }
                                C3946c.f14042a.m17280e(this.clvs_, c3407e, c3410h);
                            } else if (iM17116M == 26) {
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
                    synchronized (MsgSyn.class) {
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

    @Deprecated
    public Map<String, Integer> getClvs() {
        return getClvsMap();
    }

    public int getClvsCount() {
        return internalGetClvs().size();
    }

    public Map<String, Integer> getClvsMap() {
        return Collections.unmodifiableMap(internalGetClvs());
    }

    public int getClvsOrDefault(String str, int i) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetClvs = internalGetClvs();
        return mapFieldLiteInternalGetClvs.containsKey(str) ? mapFieldLiteInternalGetClvs.get(str).intValue() : i;
    }

    public int getClvsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetClvs = internalGetClvs();
        if (mapFieldLiteInternalGetClvs.containsKey(str)) {
            return mapFieldLiteInternalGetClvs.get(str).intValue();
        }
        x9g0.m207497a();
        return 0;
    }

    public String getLt() {
        return this.lt_;
    }

    public ByteString getLtBytes() {
        return ByteString.copyFromUtf8(this.lt_);
    }

    public int getNet() {
        return this.net_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.net_;
        int iM16929t = i2 != 0 ? CodedOutputStream.m16929t(1, i2) : 0;
        for (Map.Entry<String, Integer> entry : internalGetClvs().entrySet()) {
            iM16929t += C3946c.f14042a.m17279a(2, entry.getKey(), entry.getValue());
        }
        if (!this.lt_.isEmpty()) {
            iM16929t += CodedOutputStream.m16901K(3, getLt());
        }
        this.memoizedSerializedSize = iM16929t;
        return iM16929t;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.net_;
        if (i != 0) {
            codedOutputStream.mo16970s0(1, i);
        }
        for (Map.Entry<String, Integer> entry : internalGetClvs().entrySet()) {
            C3946c.f14042a.m17281f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        if (this.lt_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16939D0(3, getLt());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$b */
    public static final class C3945b extends GeneratedMessageLite.AbstractC3380b<MsgSyn, C3945b> implements o6z {
        private C3945b() {
            super(MsgSyn.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3945b(C3944a c3944a) {
            this();
        }
    }

    public static MsgSyn parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgSyn parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static MsgSyn parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgSyn parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static MsgSyn parseFrom(InputStream inputStream) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgSyn parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgSyn parseFrom(C3407e c3407e) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3945b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgSyn parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
