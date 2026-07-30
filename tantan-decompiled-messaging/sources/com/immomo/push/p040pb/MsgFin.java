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
public final class MsgFin extends GeneratedMessageLite<MsgFin, C3940b> implements o6z {
    private static final MsgFin DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LVS_FIELD_NUMBER = 2;
    private static volatile i860<MsgFin> PARSER;
    private int bitField0_;
    private MapFieldLite<String, Integer> lvs_ = MapFieldLite.emptyMapField();
    private String id_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$a */
    public static /* synthetic */ class C3939a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14038a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14038a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14038a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$c */
    public static final class C3941c {

        /* JADX INFO: renamed from: a */
        static final C3418p<String, Integer> f14039a = C3418p.m17276c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
    }

    static {
        MsgFin msgFin = new MsgFin();
        DEFAULT_INSTANCE = msgFin;
        msgFin.makeImmutable();
    }

    private MsgFin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    public static MsgFin getDefaultInstance() {
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

    public static C3940b newBuilder(MsgFin msgFin) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgFin);
    }

    public static MsgFin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgFin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<MsgFin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    public boolean containsLvs(String str) {
        str.getClass();
        return internalGetLvs().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3939a c3939a = null;
        switch (C3939a.f14038a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgFin();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.lvs_.makeImmutable();
                return null;
            case 4:
                return new C3940b(c3939a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                MsgFin msgFin = (MsgFin) obj2;
                this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, true ^ msgFin.id_.isEmpty(), msgFin.id_);
                this.lvs_ = interfaceC3386h.mo17003l(this.lvs_, msgFin.internalGetLvs());
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                    this.bitField0_ |= msgFin.bitField0_;
                }
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                C3410h c3410h = (C3410h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.id_ = c3407e.m17115L();
                            } else if (iM17116M == 18) {
                                if (!this.lvs_.isMutable()) {
                                    this.lvs_ = this.lvs_.mutableCopy();
                                }
                                C3941c.f14039a.m17280e(this.lvs_, c3407e, c3410h);
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
                    synchronized (MsgFin.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
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

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            iM16901K += C3941c.f14039a.m17279a(2, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getId());
        }
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            C3941c.f14039a.m17281f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$b */
    public static final class C3940b extends GeneratedMessageLite.AbstractC3380b<MsgFin, C3940b> implements o6z {
        private C3940b() {
            super(MsgFin.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3940b(C3939a c3939a) {
            this();
        }
    }

    public static MsgFin parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgFin parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static MsgFin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgFin parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static MsgFin parseFrom(InputStream inputStream) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgFin parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgFin parseFrom(C3407e c3407e) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3940b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgFin parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
