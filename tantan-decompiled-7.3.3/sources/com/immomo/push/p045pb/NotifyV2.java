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
public final class NotifyV2 extends GeneratedMessageLite<NotifyV2, C4107b> implements lfz {
    private static final NotifyV2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INFO_FIELD_NUMBER = 4;
    private static volatile ng60<NotifyV2> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 3;
    public static final int TOPKG_FIELD_NUMBER = 2;
    private NotifyInfo info_;
    private long time_;
    private String id_ = "";
    private String toPkg_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.NotifyV2$a */
    public static /* synthetic */ class C4106a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14767a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14767a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14767a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        NotifyV2 notifyV2 = new NotifyV2();
        DEFAULT_INSTANCE = notifyV2;
        notifyV2.makeImmutable();
    }

    private NotifyV2() {
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
    public void clearTime() {
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToPkg() {
        this.toPkg_ = getDefaultInstance().getToPkg();
    }

    public static NotifyV2 getDefaultInstance() {
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

    public static C4107b newBuilder(NotifyV2 notifyV2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(notifyV2);
    }

    public static NotifyV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotifyV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ng60<NotifyV2> parser() {
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
        C4106a c4106a = null;
        boolean z = false;
        switch (C4106a.f14767a[methodToInvoke.ordinal()]) {
            case 1:
                return new NotifyV2();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new C4107b(c4106a);
            case 5:
                GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                NotifyV2 notifyV2 = (NotifyV2) obj2;
                this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !notifyV2.id_.isEmpty(), notifyV2.id_);
                this.toPkg_ = interfaceC3409h.mo17052f(!this.toPkg_.isEmpty(), this.toPkg_, !notifyV2.toPkg_.isEmpty(), notifyV2.toPkg_);
                long j = this.time_;
                boolean z2 = j != 0;
                long j2 = notifyV2.time_;
                this.time_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                this.info_ = (NotifyInfo) interfaceC3409h.mo17061o(this.info_, notifyV2.info_);
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
                            } else if (iM17171M == 24) {
                                this.time_ = c3430e.m17197v();
                            } else if (iM17171M == 34) {
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
                    synchronized (NotifyV2.class) {
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
        if (this.info_ != null) {
            iM16956K += CodedOutputStream.m16948C(4, getInfo());
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
        long j = this.time_;
        if (j != 0) {
            codedOutputStream.m17027u0(3, j);
        }
        if (this.info_ != null) {
            codedOutputStream.mo17029w0(4, getInfo());
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.NotifyV2$b */
    public static final class C4107b extends GeneratedMessageLite.AbstractC3403b<NotifyV2, C4107b> implements lfz {
        private C4107b() {
            super(NotifyV2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4107b(C4106a c4106a) {
            this();
        }
    }

    public static NotifyV2 parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static NotifyV2 parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(NotifyInfo notifyInfo) {
        notifyInfo.getClass();
        this.info_ = notifyInfo;
    }

    public static NotifyV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotifyV2 parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
    }

    public static NotifyV2 parseFrom(InputStream inputStream) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotifyV2 parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
    }

    public static NotifyV2 parseFrom(C3430e c3430e) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
    }

    public static C4107b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static NotifyV2 parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
        return (NotifyV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
    }
}
