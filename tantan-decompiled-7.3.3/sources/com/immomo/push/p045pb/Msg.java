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
public final class Msg extends GeneratedMessageLite<Msg, C4085b> implements lfz {
    public static final int DATA_FIELD_NUMBER = 8;
    private static final Msg DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LT_FIELD_NUMBER = 3;
    public static final int LV_FIELD_NUMBER = 4;
    private static volatile ng60<Msg> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 6;
    public static final int TIME_FIELD_NUMBER = 5;
    public static final int TOPKG_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 7;
    private int bitField0_;
    private int lv_;
    private long time_;
    private int type_;
    private MapFieldLite<String, String> data_ = MapFieldLite.emptyMapField();
    private String id_ = "";
    private String toPkg_ = "";
    private String lt_ = "";
    private String text_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.Msg$a */
    public static /* synthetic */ class C4084a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14753a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14753a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14753a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Msg$c */
    public static final class C4086c {

        /* JADX INFO: renamed from: a */
        static final C3441p<String, String> f14754a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f14754a = C3441p.m17331c(fieldType, "", fieldType, "");
        }
    }

    static {
        Msg msg = new Msg();
        DEFAULT_INSTANCE = msg;
        msg.makeImmutable();
    }

    private Msg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLt() {
        this.lt_ = getDefaultInstance().getLt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLv() {
        this.lv_ = 0;
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

    public static Msg getDefaultInstance() {
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

    public static C4085b newBuilder(Msg msg) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(msg);
    }

    public static Msg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Msg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<Msg> parser() {
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
    public void setLv(int i) {
        this.lv_ = i;
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
        C4084a c4084a = null;
        boolean z = false;
        switch (C4084a.f14753a[methodToInvoke.ordinal()]) {
            case 1:
                return new Msg();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.data_.makeImmutable();
                return null;
            case 4:
                return new C4085b(c4084a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                Msg msg = (Msg) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !msg.id_.isEmpty(), msg.id_);
                this.toPkg_ = interfaceC3409h.mo17052f(!this.toPkg_.isEmpty(), this.toPkg_, !msg.toPkg_.isEmpty(), msg.toPkg_);
                this.lt_ = interfaceC3409h.mo17052f(!this.lt_.isEmpty(), this.lt_, !msg.lt_.isEmpty(), msg.lt_);
                int i = this.lv_;
                boolean z2 = i != 0;
                int i2 = msg.lv_;
                this.lv_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                long j = this.time_;
                boolean z3 = j != 0;
                long j2 = msg.time_;
                this.time_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                this.text_ = interfaceC3409h.mo17052f(!this.text_.isEmpty(), this.text_, !msg.text_.isEmpty(), msg.text_);
                int i3 = this.type_;
                boolean z4 = i3 != 0;
                int i4 = msg.type_;
                this.type_ = interfaceC3409h.mo17051e(z4, i3, i4 != 0, i4);
                this.data_ = interfaceC3409h.mo17058l(this.data_, msg.internalGetData());
                if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                    this.bitField0_ |= msg.bitField0_;
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
                            } else if (iM17171M == 26) {
                                this.lt_ = c3430e.m17170L();
                            } else if (iM17171M == 32) {
                                this.lv_ = c3430e.m17196u();
                            } else if (iM17171M == 40) {
                                this.time_ = c3430e.m17197v();
                            } else if (iM17171M == 50) {
                                this.text_ = c3430e.m17170L();
                            } else if (iM17171M == 56) {
                                this.type_ = c3430e.m17196u();
                            } else if (iM17171M == 66) {
                                if (!this.data_.isMutable()) {
                                    this.data_ = this.data_.mutableCopy();
                                }
                                C4086c.f14754a.m17335e(this.data_, c3430e, c3433h);
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
                    synchronized (Msg.class) {
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

    public String getLt() {
        return this.lt_;
    }

    public ByteString getLtBytes() {
        return ByteString.copyFromUtf8(this.lt_);
    }

    public int getLv() {
        return this.lv_;
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
        if (!this.lt_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(3, getLt());
        }
        int i2 = this.lv_;
        if (i2 != 0) {
            iM16956K += CodedOutputStream.m16984t(4, i2);
        }
        long j = this.time_;
        if (j != 0) {
            iM16956K += CodedOutputStream.m16986v(5, j);
        }
        if (!this.text_.isEmpty()) {
            iM16956K += CodedOutputStream.m16956K(6, getText());
        }
        int i3 = this.type_;
        if (i3 != 0) {
            iM16956K += CodedOutputStream.m16984t(7, i3);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            iM16956K += C4086c.f14754a.m17334a(8, entry.getKey(), entry.getValue());
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
        if (!this.lt_.isEmpty()) {
            codedOutputStream.mo16994D0(3, getLt());
        }
        int i = this.lv_;
        if (i != 0) {
            codedOutputStream.mo17025s0(4, i);
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m17027u0(5, j);
        }
        if (!this.text_.isEmpty()) {
            codedOutputStream.mo16994D0(6, getText());
        }
        int i2 = this.type_;
        if (i2 != 0) {
            codedOutputStream.mo17025s0(7, i2);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            C4086c.f14754a.m17336f(codedOutputStream, 8, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Msg$b */
    public static final class C4085b extends GeneratedMessageLite.AbstractC3403b<Msg, C4085b> implements lfz {
        private C4085b() {
            super(Msg.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4085b(C4084a c4084a) {
            this();
        }
    }

    public static Msg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Msg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Msg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    public static Msg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Msg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static Msg parseFrom(InputStream inputStream) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Msg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Msg parseFrom(C3430e c3430e) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4085b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Msg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
