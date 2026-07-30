package com.immomo.push.p045pb;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes7.dex */
public final class Notify extends GeneratedMessageLite<Notify, C4102b> implements lfz {
    private static final Notify DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INFO_FIELD_NUMBER = 6;
    public static final int LT_FIELD_NUMBER = 3;
    public static final int LV_FIELD_NUMBER = 4;
    private static volatile ng60<Notify> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 5;
    public static final int TOPKG_FIELD_NUMBER = 2;
    private NotifyInfo info_;
    private int lv_;
    private long time_;
    private String id_ = "";
    private String toPkg_ = "";
    private String lt_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.Notify$a */
    public static /* synthetic */ class C4101a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14764a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14764a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14764a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public static C4102b newBuilder(Notify notify) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(notify);
    }

    public static Notify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Notify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<Notify> parser() {
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
    public void setInfo(NotifyInfo.C4104b c4104b) {
        this.info_ = c4104b.build();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4101a c4101a = null;
        boolean z = false;
        switch (C4101a.f14764a[methodToInvoke.ordinal()]) {
            case 1:
                return new Notify();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4102b(c4101a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                Notify notify = (Notify) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !notify.id_.isEmpty(), notify.id_);
                this.toPkg_ = interfaceC3409h.mo17052f(!this.toPkg_.isEmpty(), this.toPkg_, !notify.toPkg_.isEmpty(), notify.toPkg_);
                this.lt_ = interfaceC3409h.mo17052f(!this.lt_.isEmpty(), this.lt_, !notify.lt_.isEmpty(), notify.lt_);
                int i = this.lv_;
                boolean z2 = i != 0;
                int i2 = notify.lv_;
                this.lv_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                long j = this.time_;
                boolean z3 = j != 0;
                long j2 = notify.time_;
                this.time_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                this.info_ = (NotifyInfo) interfaceC3409h.mo17061o(this.info_, notify.info_);
                GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
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
                                NotifyInfo notifyInfo = this.info_;
                                NotifyInfo.C4104b builder = notifyInfo != null ? notifyInfo.toBuilder() : null;
                                NotifyInfo notifyInfo2 = (NotifyInfo) c3430e.m17198w(NotifyInfo.parser(), c3433h);
                                this.info_ = notifyInfo2;
                                if (builder != null) {
                                    builder.mergeFrom(notifyInfo2);
                                    this.info_ = builder.buildPartial();
                                }
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
                    synchronized (Notify.class) {
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
        if (this.info_ != null) {
            iM16956K += CodedOutputStream.m16948C(6, getInfo());
        }
        this.memoizedSerializedSize = iM16956K;
        return iM16956K;
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
        if (this.info_ != null) {
            codedOutputStream.mo17029w0(6, getInfo());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.Notify$b */
    public static final class C4102b extends GeneratedMessageLite.AbstractC3403b<Notify, C4102b> implements lfz {
        private C4102b() {
            super(Notify.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4102b(C4101a c4101a) {
            this();
        }
    }

    public static Notify parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Notify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Notify parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(NotifyInfo notifyInfo) {
        notifyInfo.getClass();
        this.info_ = notifyInfo;
    }

    public static Notify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Notify parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static Notify parseFrom(InputStream inputStream) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notify parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static Notify parseFrom(C3430e c3430e) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4102b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Notify parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (Notify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
