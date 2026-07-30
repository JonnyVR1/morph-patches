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
public final class MsgFin extends GeneratedMessageLite<MsgFin, C4091b> implements lfz {
    private static final MsgFin DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LVS_FIELD_NUMBER = 2;
    private static volatile ng60<MsgFin> PARSER;
    private int bitField0_;
    private MapFieldLite<String, Integer> lvs_ = MapFieldLite.emptyMapField();
    private String id_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$a */
    public static /* synthetic */ class C4090a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14757a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14757a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14757a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$c */
    public static final class C4092c {

        /* JADX INFO: renamed from: a */
        static final C3441p<String, Integer> f14758a = C3441p.m17331c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
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

    public static C4091b newBuilder(MsgFin msgFin) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgFin);
    }

    public static MsgFin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgFin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<MsgFin> parser() {
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
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    public boolean containsLvs(String str) {
        str.getClass();
        return internalGetLvs().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4090a c4090a = null;
        switch (C4090a.f14757a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgFin();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.lvs_.makeImmutable();
                return null;
            case 4:
                return new C4091b(c4090a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                MsgFin msgFin = (MsgFin) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, true ^ msgFin.id_.isEmpty(), msgFin.id_);
                this.lvs_ = interfaceC3409h.mo17058l(this.lvs_, msgFin.internalGetLvs());
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                    this.bitField0_ |= msgFin.bitField0_;
                }
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                C3433h c3433h = (C3433h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 10) {
                                this.id_ = c3430e.m17170L();
                            } else if (iM17171M == 18) {
                                if (!this.lvs_.isMutable()) {
                                    this.lvs_ = this.lvs_.mutableCopy();
                                }
                                C4092c.f14758a.m17335e(this.lvs_, c3430e, c3433h);
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
                    synchronized (MsgFin.class) {
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
        fig0.m125680a();
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            iM16956K += C4092c.f14758a.m17334a(2, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16994D0(1, getId());
        }
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            C4092c.f14758a.m17336f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgFin$b */
    public static final class C4091b extends GeneratedMessageLite.AbstractC3403b<MsgFin, C4091b> implements lfz {
        private C4091b() {
            super(MsgFin.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4091b(C4090a c4090a) {
            this();
        }
    }

    public static MsgFin parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgFin parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static MsgFin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgFin parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static MsgFin parseFrom(InputStream inputStream) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgFin parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgFin parseFrom(C3430e c3430e) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4091b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgFin parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (MsgFin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
