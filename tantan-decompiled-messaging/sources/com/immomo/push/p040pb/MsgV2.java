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
public final class MsgV2 extends GeneratedMessageLite<MsgV2, C3948b> implements o6z {
    public static final int DATA_FIELD_NUMBER = 6;
    private static final MsgV2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile i860<MsgV2> PARSER = null;
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
    public static /* synthetic */ class C3947a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14043a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14043a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14043a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgV2$c */
    public static final class C3949c {

        /* JADX INFO: renamed from: a */
        static final C3418p<String, String> f14044a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f14044a = C3418p.m17276c(fieldType, "", fieldType, "");
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

    public static C3948b newBuilder(MsgV2 msgV2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msgV2);
    }

    public static MsgV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<MsgV2> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
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
        AbstractC3403a.checkByteStringIsUtf8(byteString);
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
        C3947a c3947a = null;
        boolean z = false;
        switch (C3947a.f14043a[methodToInvoke.ordinal()]) {
            case 1:
                return new MsgV2();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.data_.makeImmutable();
                return null;
            case 4:
                return new C3948b(c3947a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                MsgV2 msgV2 = (MsgV2) obj2;
                this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !msgV2.id_.isEmpty(), msgV2.id_);
                this.toPkg_ = interfaceC3386h.mo16997f(!this.toPkg_.isEmpty(), this.toPkg_, !msgV2.toPkg_.isEmpty(), msgV2.toPkg_);
                long j = this.time_;
                boolean z2 = j != 0;
                long j2 = msgV2.time_;
                this.time_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                this.text_ = interfaceC3386h.mo16997f(!this.text_.isEmpty(), this.text_, !msgV2.text_.isEmpty(), msgV2.text_);
                int i = this.type_;
                boolean z3 = i != 0;
                int i2 = msgV2.type_;
                this.type_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                this.data_ = interfaceC3386h.mo17003l(this.data_, msgV2.internalGetData());
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                    this.bitField0_ |= msgV2.bitField0_;
                }
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                C3410h c3410h = (C3410h) obj2;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        if (iM17116M != 0) {
                            if (iM17116M == 10) {
                                this.id_ = c3407e.m17115L();
                            } else if (iM17116M == 18) {
                                this.toPkg_ = c3407e.m17115L();
                            } else if (iM17116M == 24) {
                                this.time_ = c3407e.m17142v();
                            } else if (iM17116M == 34) {
                                this.text_ = c3407e.m17115L();
                            } else if (iM17116M == 40) {
                                this.type_ = c3407e.m17141u();
                            } else if (iM17116M == 50) {
                                if (!this.data_.isMutable()) {
                                    this.data_ = this.data_.mutableCopy();
                                }
                                C3949c.f14044a.m17280e(this.data_, c3407e, c3410h);
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
                    synchronized (MsgV2.class) {
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
        x9g0.m207497a();
        return null;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
        if (!this.toPkg_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(2, getToPkg());
        }
        long j = this.time_;
        if (j != 0) {
            iM16901K += CodedOutputStream.m16931v(3, j);
        }
        if (!this.text_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(4, getText());
        }
        int i2 = this.type_;
        if (i2 != 0) {
            iM16901K += CodedOutputStream.m16929t(5, i2);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            iM16901K += C3949c.f14044a.m17279a(6, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
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

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getId());
        }
        if (!this.toPkg_.isEmpty()) {
            codedOutputStream.mo16939D0(2, getToPkg());
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m16972u0(3, j);
        }
        if (!this.text_.isEmpty()) {
            codedOutputStream.mo16939D0(4, getText());
        }
        int i = this.type_;
        if (i != 0) {
            codedOutputStream.mo16970s0(5, i);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            C3949c.f14044a.m17281f(codedOutputStream, 6, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.MsgV2$b */
    public static final class C3948b extends GeneratedMessageLite.AbstractC3380b<MsgV2, C3948b> implements o6z {
        private C3948b() {
            super(MsgV2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3948b(C3947a c3947a) {
            this();
        }
    }

    public static MsgV2 parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgV2 parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static MsgV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgV2 parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static MsgV2 parseFrom(InputStream inputStream) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgV2 parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static MsgV2 parseFrom(C3407e c3407e) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3948b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MsgV2 parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (MsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
