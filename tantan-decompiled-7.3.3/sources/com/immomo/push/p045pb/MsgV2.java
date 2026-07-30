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
public final class MsgV2 extends GeneratedMessageLite<MsgV2, C4099b> implements lfz {
    public static final int DATA_FIELD_NUMBER = 6;
    private static final MsgV2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile ng60<MsgV2> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TIME_FIELD_NUMBER = 3;
    public static final int TOPKG_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int bitField0_;
    private long time_;
    private int type_;
    private MapFieldLite<String, String> data_ = MapFieldLite.emptyMapField();
    private String id_ = "";
    private String toPkg_ = "";
    private String text_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgV2$a */
    public static /* synthetic */ class C4098a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14762a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14762a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14762a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgV2$c */
    public static final class C4100c {

        /* JADX INFO: renamed from: a */
        static final C3441p<String, String> f14763a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f14763a = C3441p.m17331c(fieldType, "", fieldType, "");
        }
    }

    static {
        MsgV2 msgV2 = new MsgV2();
        DEFAULT_INSTANCE = msgV2;
        msgV2.makeImmutable();
    }

    private MsgV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToPkg() {
        this.toPkg_ = getDefaultInstance().getToPkg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static MsgV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableDataMap() {
        return internalGetMutableData();
    }

    private MapFieldLite<String, String> internalGetData() {
        return this.data_;
    }

    private MapFieldLite<String, String> internalGetMutableData() {
        if (!this.data_.isMutable()) {
            this.data_ = this.data_.mutableCopy();
        }
        return this.data_;
    }

    public static C4099b newBuilder(MsgV2 msgV2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgV2);
    }

    public static MsgV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<MsgV2> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j) {
        this.time_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToPkg(String str) {
        str.getClass();
        this.toPkg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToPkgBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3426a.checkByteStringIsUtf8(byteString);
        this.toPkg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    public boolean containsData(String str) {
        str.getClass();
        return internalGetData().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4098a c4098a = null;
        boolean z = false;
        switch (C4098a.f14762a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgV2();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.data_.makeImmutable();
                return null;
            case 4:
                return new C4099b(c4098a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                MsgV2 msgV2 = (MsgV2) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !msgV2.id_.isEmpty(), msgV2.id_);
                this.toPkg_ = interfaceC3409h.mo17052f(!this.toPkg_.isEmpty(), this.toPkg_, !msgV2.toPkg_.isEmpty(), msgV2.toPkg_);
                long j = this.time_;
                boolean z2 = j != 0;
                long j2 = msgV2.time_;
                this.time_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                this.text_ = interfaceC3409h.mo17052f(!this.text_.isEmpty(), this.text_, !msgV2.text_.isEmpty(), msgV2.text_);
                int i = this.type_;
                boolean z3 = i != 0;
                int i2 = msgV2.type_;
                this.type_ = interfaceC3409h.mo17051e(z3, i, i2 != 0, i2);
                this.data_ = interfaceC3409h.mo17058l(this.data_, msgV2.internalGetData());
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                    this.bitField0_ |= msgV2.bitField0_;
                }
                return this;
            case 6:
                C3430e c3430e = (C3430e) obj;
                C3433h c3433h = (C3433h) obj2;
                while (!z) {
                    try {
                        int iM17171M = c3430e.m17171M();
                        if (iM17171M != 0) {
                            if (iM17171M == 10) {
                                this.id_ = c3430e.m17170L();
                            } else if (iM17171M == 18) {
                                this.toPkg_ = c3430e.m17170L();
                            } else if (iM17171M == 24) {
                                this.time_ = c3430e.m17197v();
                            } else if (iM17171M == 34) {
                                this.text_ = c3430e.m17170L();
                            } else if (iM17171M == 40) {
                                this.type_ = c3430e.m17196u();
                            } else if (iM17171M == 50) {
                                if (!this.data_.isMutable()) {
                                    this.data_ = this.data_.mutableCopy();
                                }
                                C4100c.f14763a.m17335e(this.data_, c3430e, c3433h);
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
                    synchronized (MsgV2.class) {
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
    public Map<String, String> getData() {
        return getDataMap();
    }

    public int getDataCount() {
        return internalGetData().size();
    }

    public Map<String, String> getDataMap() {
        return Collections.unmodifiableMap(internalGetData());
    }

    public String getDataOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
        return mapFieldLiteInternalGetData.containsKey(str) ? mapFieldLiteInternalGetData.get(str) : str2;
    }

    public String getDataOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
        if (mapFieldLiteInternalGetData.containsKey(str)) {
            return mapFieldLiteInternalGetData.get(str);
        }
        fig0.m125680a();
        return null;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
        if (!this.toPkg_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(2, getToPkg());
        }
        long j = this.time_;
        if (j != 0) {
            iM16956K += CodedOutputStream.m16986v(3, j);
        }
        if (!this.text_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(4, getText());
        }
        int i2 = this.type_;
        if (i2 != 0) {
            iM16956K += CodedOutputStream.m16984t(5, i2);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            iM16956K += C4100c.f14763a.m17334a(6, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public long getTime() {
        return this.time_;
    }

    public String getToPkg() {
        return this.toPkg_;
    }

    public ByteString getToPkgBytes() {
        return ByteString.copyFromUtf8(this.toPkg_);
    }

    public int getType() {
        return this.type_;
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16994D0(1, getId());
        }
        if (!this.toPkg_.isEmpty()) {
            codedOutputStream.mo16994D0(2, getToPkg());
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m17027u0(3, j);
        }
        if (!this.text_.isEmpty()) {
            codedOutputStream.mo16994D0(4, getText());
        }
        int i = this.type_;
        if (i != 0) {
            codedOutputStream.mo17025s0(5, i);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            C4100c.f14763a.m17336f(codedOutputStream, 6, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgV2$b */
    public static final class C4099b extends GeneratedMessageLite.AbstractC3403b<MsgV2, C4099b> implements lfz {
        private C4099b() {
            super(MsgV2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4099b(C4098a c4098a) {
            this();
        }
    }

    public static MsgV2 parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgV2 parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static MsgV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgV2 parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static MsgV2 parseFrom(InputStream inputStream) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgV2 parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static MsgV2 parseFrom(C3430e c3430e) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4099b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgV2 parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
