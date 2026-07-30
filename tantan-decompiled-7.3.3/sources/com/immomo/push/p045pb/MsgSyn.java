package com.immomo.push.p045pb;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3441p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import p153l.fig0;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes7.dex */
public final class MsgSyn extends GeneratedMessageLite<MsgSyn, C4096b> implements lfz {
    public static final int CLVS_FIELD_NUMBER = 2;
    private static final MsgSyn DEFAULT_INSTANCE;
    public static final int LT_FIELD_NUMBER = 3;
    public static final int NET_FIELD_NUMBER = 1;
    private static volatile ng60<MsgSyn> PARSER;
    private int bitField0_;
    private MapFieldLite<String, Integer> clvs_ = MapFieldLite.emptyMapField();
    private String lt_ = "";
    private int net_;

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$a */
    public static /* synthetic */ class C4095a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14760a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14760a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14760a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$c */
    public static final class C4097c {

        /* JADX INFO: renamed from: a */
        static final C3441p<String, Integer> f14761a = C3441p.m17331c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
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

    public static C4096b newBuilder(MsgSyn msgSyn) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgSyn);
    }

    public static MsgSyn parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgSyn parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<MsgSyn> parser() {
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
        C4095a c4095a = null;
        boolean z = false;
        switch (C4095a.f14760a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgSyn();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.clvs_.makeImmutable();
                return null;
            case 4:
                return new C4096b(c4095a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                MsgSyn msgSyn = (MsgSyn) obj2;
                int i = this.net_;
                boolean z2 = i != 0;
                int i2 = msgSyn.net_;
                this.net_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                this.clvs_ = interfaceC3409h.mo17058l(this.clvs_, msgSyn.internalGetClvs());
                this.lt_ = interfaceC3409h.mo17052f(!this.lt_.isEmpty(), this.lt_, !msgSyn.lt_.isEmpty(), msgSyn.lt_);
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                    this.bitField0_ |= msgSyn.bitField0_;
                }
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                C3433h c3433h = (C3433h) obj2;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 8) {
                                this.net_ = c3430e.m17196u();
                            } else if (iM17171M == 18) {
                                if (!this.clvs_.isMutable()) {
                                    this.clvs_ = this.clvs_.mutableCopy();
                                }
                                C4097c.f14761a.m17335e(this.clvs_, c3430e, c3433h);
                            } else if (iM17171M == 26) {
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
                    synchronized (MsgSyn.class) {
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
        fig0.m125680a();
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

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.net_;
        int iM16984t = i2 != 0 ? CodedOutputStream.m16984t(1, i2) : 0;
        for (Map.Entry<String, Integer> entry : internalGetClvs().entrySet()) {
            iM16984t += C4097c.f14761a.m17334a(2, entry.getKey(), entry.getValue());
        }
        if (!this.lt_.isEmpty()) {
            iM16984t += CodedOutputStream.m16956K(3, getLt());
        }
        this.memoizedSerializedSize = iM16984t;
        return iM16984t;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.net_;
        if (i != 0) {
            codedOutputStream.mo17025s0(1, i);
        }
        for (Map.Entry<String, Integer> entry : internalGetClvs().entrySet()) {
            C4097c.f14761a.m17336f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        if (this.lt_.isEmpty()) {
            return;
        }
        codedOutputStream.mo16994D0(3, getLt());
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgSyn$b */
    public static final class C4096b extends GeneratedMessageLite.AbstractC3403b<MsgSyn, C4096b> implements lfz {
        private C4096b() {
            super(MsgSyn.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4096b(C4095a c4095a) {
            this();
        }
    }

    public static MsgSyn parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgSyn parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static MsgSyn parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgSyn parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static MsgSyn parseFrom(InputStream inputStream) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgSyn parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgSyn parseFrom(C3430e c3430e) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4096b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgSyn parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (MsgSyn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
