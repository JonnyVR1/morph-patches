package com.immomo.push.p040pb;

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
public final class MsgAck extends GeneratedMessageLite<MsgAck, C3937b> implements o6z {
    private static final MsgAck DEFAULT_INSTANCE;
    public static final int LVS_FIELD_NUMBER = 2;
    private static volatile i860<MsgAck> PARSER = null;
    public static final int REMAIN_FIELD_NUMBER = 1;
    private int bitField0_;
    private MapFieldLite<String, Integer> lvs_ = MapFieldLite.emptyMapField();
    private int remain_;

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$a */
    public static /* synthetic */ class C3936a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14036a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14036a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14036a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$c */
    public static final class C3938c {

        /* JADX INFO: renamed from: a */
        static final C3418p<String, Integer> f14037a = C3418p.m17276c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
    }

    static {
        MsgAck msgAck = new MsgAck();
        DEFAULT_INSTANCE = msgAck;
        msgAck.makeImmutable();
    }

    private MsgAck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemain() {
        this.remain_ = 0;
    }

    public static MsgAck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Integer> getMutableLvsMap() {
        return internalGetMutableLvs();
    }

    private MapFieldLite<String, Integer> internalGetLvs() {
        return this.lvs_;
    }

    private MapFieldLite<String, Integer> internalGetMutableLvs() {
        if (!this.lvs_.isMutable()) {
            this.lvs_ = this.lvs_.mutableCopy();
        }
        return this.lvs_;
    }

    public static C3937b newBuilder(MsgAck msgAck) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgAck);
    }

    public static MsgAck parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<MsgAck> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemain(int i) {
        this.remain_ = i;
    }

    public boolean containsLvs(String str) {
        str.getClass();
        return internalGetLvs().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3936a c3936a = null;
        boolean z = false;
        switch (C3936a.f14036a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgAck();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.lvs_.makeImmutable();
                return null;
            case 4:
                return new C3937b(c3936a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                MsgAck msgAck = (MsgAck) obj2;
                int i = this.remain_;
                boolean z2 = i != 0;
                int i2 = msgAck.remain_;
                this.remain_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                this.lvs_ = interfaceC3386h.mo17003l(this.lvs_, msgAck.internalGetLvs());
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                    this.bitField0_ |= msgAck.bitField0_;
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
                                this.remain_ = c3407e.m17141u();
                            } else if (iM17116M == 18) {
                                if (!this.lvs_.isMutable()) {
                                    this.lvs_ = this.lvs_.mutableCopy();
                                }
                                C3938c.f14037a.m17280e(this.lvs_, c3407e, c3410h);
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
                    synchronized (MsgAck.class) {
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
    public Map<String, Integer> getLvs() {
        return getLvsMap();
    }

    public int getLvsCount() {
        return internalGetLvs().size();
    }

    public Map<String, Integer> getLvsMap() {
        return Collections.unmodifiableMap(internalGetLvs());
    }

    public int getLvsOrDefault(String str, int i) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetLvs = internalGetLvs();
        return mapFieldLiteInternalGetLvs.containsKey(str) ? mapFieldLiteInternalGetLvs.get(str).intValue() : i;
    }

    public int getLvsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetLvs = internalGetLvs();
        if (mapFieldLiteInternalGetLvs.containsKey(str)) {
            return mapFieldLiteInternalGetLvs.get(str).intValue();
        }
        x9g0.m207497a();
        return 0;
    }

    public int getRemain() {
        return this.remain_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.remain_;
        int iM16929t = i2 != 0 ? CodedOutputStream.m16929t(1, i2) : 0;
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            iM16929t += C3938c.f14037a.m17279a(2, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16929t;
        return iM16929t;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.remain_;
        if (i != 0) {
            codedOutputStream.mo16970s0(1, i);
        }
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            C3938c.f14037a.m17281f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$b */
    public static final class C3937b extends GeneratedMessageLite.AbstractC3380b<MsgAck, C3937b> implements o6z {
        private C3937b() {
            super(MsgAck.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3937b(C3936a c3936a) {
            this();
        }
    }

    public static MsgAck parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgAck parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static MsgAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgAck parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static MsgAck parseFrom(InputStream inputStream) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgAck parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgAck parseFrom(C3407e c3407e) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3937b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgAck parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
