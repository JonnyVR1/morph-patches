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
public final class Notify extends GeneratedMessageLite<Notify, C3951b> implements o6z {
    private static final Notify DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INFO_FIELD_NUMBER = 6;
    public static final int LT_FIELD_NUMBER = 3;
    public static final int LV_FIELD_NUMBER = 4;
    private static volatile i860<Notify> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 5;
    public static final int TOPKG_FIELD_NUMBER = 2;
    private NotifyInfo info_;
    private int lv_;
    private long time_;
    private String id_ = "";
    private String toPkg_ = "";
    private String lt_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.Notify$a */
    public static /* synthetic */ class C3950a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14045a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14045a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14045a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Notify notify = new Notify();
        DEFAULT_INSTANCE = notify;
        notify.makeImmutable();
    }

    private Notify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
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
    public void clearTime() {
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToPkg() {
        this.toPkg_ = getDefaultInstance().getToPkg();
    }

    public static Notify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(NotifyInfo notifyInfo) {
        NotifyInfo notifyInfo2 = this.info_;
        if (notifyInfo2 == null || notifyInfo2 == NotifyInfo.getDefaultInstance()) {
            this.info_ = notifyInfo;
        } else {
            this.info_ = NotifyInfo.newBuilder(this.info_).mergeFrom(notifyInfo).buildPartial();
        }
    }

    public static C3951b newBuilder(Notify notify) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(notify);
    }

    public static Notify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Notify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<Notify> parser() {
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
    public void setInfo(NotifyInfo.C3953b c3953b) {
        this.info_ = c3953b.build();
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
    public void setLv(int i) {
        this.lv_ = i;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3950a c3950a = null;
        boolean z = false;
        switch (C3950a.f14045a[methodToInvoke.ordinal()]) {
            case 1:
                return new Notify();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C3951b(c3950a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                Notify notify = (Notify) obj2;
                this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !notify.id_.isEmpty(), notify.id_);
                this.toPkg_ = interfaceC3386h.mo16997f(!this.toPkg_.isEmpty(), this.toPkg_, !notify.toPkg_.isEmpty(), notify.toPkg_);
                this.lt_ = interfaceC3386h.mo16997f(!this.lt_.isEmpty(), this.lt_, !notify.lt_.isEmpty(), notify.lt_);
                int i = this.lv_;
                boolean z2 = i != 0;
                int i2 = notify.lv_;
                this.lv_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                long j = this.time_;
                boolean z3 = j != 0;
                long j2 = notify.time_;
                this.time_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                this.info_ = (NotifyInfo) interfaceC3386h.mo17006o(this.info_, notify.info_);
                GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                            } else if (iM17116M == 26) {
                                this.lt_ = c3407e.m17115L();
                            } else if (iM17116M == 32) {
                                this.lv_ = c3407e.m17141u();
                            } else if (iM17116M == 40) {
                                this.time_ = c3407e.m17142v();
                            } else if (iM17116M == 50) {
                                NotifyInfo notifyInfo = this.info_;
                                NotifyInfo.C3953b builder = notifyInfo != null ? notifyInfo.toBuilder() : null;
                                NotifyInfo notifyInfo2 = (NotifyInfo) c3407e.m17143w(NotifyInfo.parser(), c3410h);
                                this.info_ = notifyInfo2;
                                if (builder != null) {
                                    builder.mergeFrom(notifyInfo2);
                                    this.info_ = builder.buildPartial();
                                }
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
                    synchronized (Notify.class) {
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

    public NotifyInfo getInfo() {
        NotifyInfo notifyInfo = this.info_;
        return notifyInfo == null ? NotifyInfo.getDefaultInstance() : notifyInfo;
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
        if (!this.lt_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(3, getLt());
        }
        int i2 = this.lv_;
        if (i2 != 0) {
            iM16901K += CodedOutputStream.m16929t(4, i2);
        }
        long j = this.time_;
        if (j != 0) {
            iM16901K += CodedOutputStream.m16931v(5, j);
        }
        if (this.info_ != null) {
            iM16901K += CodedOutputStream.m16893C(6, getInfo());
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
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

    public boolean hasInfo() {
        return this.info_ != null;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getId());
        }
        if (!this.toPkg_.isEmpty()) {
            codedOutputStream.mo16939D0(2, getToPkg());
        }
        if (!this.lt_.isEmpty()) {
            codedOutputStream.mo16939D0(3, getLt());
        }
        int i = this.lv_;
        if (i != 0) {
            codedOutputStream.mo16970s0(4, i);
        }
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m16972u0(5, j);
        }
        if (this.info_ != null) {
            codedOutputStream.mo16974w0(6, getInfo());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Notify$b */
    public static final class C3951b extends GeneratedMessageLite.AbstractC3380b<Notify, C3951b> implements o6z {
        private C3951b() {
            super(Notify.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3951b(C3950a c3950a) {
            this();
        }
    }

    public static Notify parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Notify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Notify parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(NotifyInfo notifyInfo) {
        notifyInfo.getClass();
        this.info_ = notifyInfo;
    }

    public static Notify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Notify parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static Notify parseFrom(InputStream inputStream) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notify parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static Notify parseFrom(C3407e c3407e) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3951b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Notify parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
