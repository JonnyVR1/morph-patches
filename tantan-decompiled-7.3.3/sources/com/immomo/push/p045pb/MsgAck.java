package com.immomo.push.p045pb;

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
public final class MsgAck extends GeneratedMessageLite<MsgAck, C4088b> implements lfz {
    private static final MsgAck DEFAULT_INSTANCE;
    public static final int LVS_FIELD_NUMBER = 2;
    private static volatile ng60<MsgAck> PARSER = null;
    public static final int REMAIN_FIELD_NUMBER = 1;
    private int bitField0_;
    private MapFieldLite<String, Integer> lvs_ = MapFieldLite.emptyMapField();
    private int remain_;

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$a */
    public static /* synthetic */ class C4087a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14755a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14755a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14755a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$c */
    public static final class C4089c {

        /* JADX INFO: renamed from: a */
        static final C3441p<String, Integer> f14756a = C3441p.m17331c(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
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

    public static C4088b newBuilder(MsgAck msgAck) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgAck);
    }

    public static MsgAck parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<MsgAck> parser() {
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
        C4087a c4087a = null;
        boolean z = false;
        switch (C4087a.f14755a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgAck();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.lvs_.makeImmutable();
                return null;
            case 4:
                return new C4088b(c4087a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                MsgAck msgAck = (MsgAck) obj2;
                int i = this.remain_;
                boolean z2 = i != 0;
                int i2 = msgAck.remain_;
                this.remain_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                this.lvs_ = interfaceC3409h.mo17058l(this.lvs_, msgAck.internalGetLvs());
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                    this.bitField0_ |= msgAck.bitField0_;
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
                                this.remain_ = c3430e.m17196u();
                            } else if (iM17171M == 18) {
                                if (!this.lvs_.isMutable()) {
                                    this.lvs_ = this.lvs_.mutableCopy();
                                }
                                C4089c.f14756a.m17335e(this.lvs_, c3430e, c3433h);
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
                    synchronized (MsgAck.class) {
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

    public int getRemain() {
        return this.remain_;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.remain_;
        int iM16984t = i2 != 0 ? CodedOutputStream.m16984t(1, i2) : 0;
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            iM16984t += C4089c.f14756a.m17334a(2, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16984t;
        return iM16984t;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.remain_;
        if (i != 0) {
            codedOutputStream.mo17025s0(1, i);
        }
        for (Map.Entry<String, Integer> entry : internalGetLvs().entrySet()) {
            C4089c.f14756a.m17336f(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgAck$b */
    public static final class C4088b extends GeneratedMessageLite.AbstractC3403b<MsgAck, C4088b> implements lfz {
        private C4088b() {
            super(MsgAck.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4088b(C4087a c4087a) {
            this();
        }
    }

    public static MsgAck parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgAck parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static MsgAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgAck parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static MsgAck parseFrom(InputStream inputStream) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgAck parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgAck parseFrom(C3430e c3430e) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4088b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgAck parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (MsgAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
