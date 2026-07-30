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
import org.spongycastle.asn1.eac.EACTags;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;
import p149l.x9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class NotifyInfo extends GeneratedMessageLite<NotifyInfo, C3953b> implements o6z {
    public static final int ACTIONTYPE_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int AUTOCANCEL_FIELD_NUMBER = 16;
    public static final int BACKGROUNDSHOW_FIELD_NUMBER = 11;
    public static final int DATA_FIELD_NUMBER = 12;
    private static final NotifyInfo DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 6;
    public static final int LIGHT_FIELD_NUMBER = 10;
    private static volatile i860<NotifyInfo> PARSER = null;
    public static final int POPNOTIFY_FIELD_NUMBER = 15;
    public static final int SHOWEXPIRE_FIELD_NUMBER = 14;
    public static final int SHOWTIME_FIELD_NUMBER = 13;
    public static final int SOUNDTYPE_FIELD_NUMBER = 8;
    public static final int SOUND_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VIBRATE_FIELD_NUMBER = 9;
    private int actionType_;
    private boolean autoCancel_;
    private int backgroundShow_;
    private int bitField0_;
    private int light_;
    private boolean popNotify_;
    private long showExpire_;
    private long showTime_;
    private int sound_;
    private int vibrate_;
    private MapFieldLite<String, String> data_ = MapFieldLite.emptyMapField();
    private String type_ = "";
    private String title_ = "";
    private String desc_ = "";
    private String action_ = "";
    private String icon_ = "";
    private String soundType_ = "";

    /* JADX INFO: renamed from: com.immomo.push.pb.NotifyInfo$a */
    public static /* synthetic */ class C3952a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14046a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14046a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14046a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.NotifyInfo$c */
    public static final class C3954c {

        /* JADX INFO: renamed from: a */
        static final C3418p<String, String> f14047a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f14047a = C3418p.m17276c(fieldType, "", fieldType, "");
        }
    }

    static {
        NotifyInfo notifyInfo = new NotifyInfo();
        DEFAULT_INSTANCE = notifyInfo;
        notifyInfo.makeImmutable();
    }

    private NotifyInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = getDefaultInstance().getAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionType() {
        this.actionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoCancel() {
        this.autoCancel_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundShow() {
        this.backgroundShow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLight() {
        this.light_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopNotify() {
        this.popNotify_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowExpire() {
        this.showExpire_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTime() {
        this.showTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSound() {
        this.sound_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundType() {
        this.soundType_ = getDefaultInstance().getSoundType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVibrate() {
        this.vibrate_ = 0;
    }

    public static NotifyInfo getDefaultInstance() {
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

    public static C3953b newBuilder(NotifyInfo notifyInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(notifyInfo);
    }

    public static NotifyInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotifyInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static i860<NotifyInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        str.getClass();
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionType(int i) {
        this.actionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoCancel(boolean z) {
        this.autoCancel_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundShow(int i) {
        this.backgroundShow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLight(int i) {
        this.light_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopNotify(boolean z) {
        this.popNotify_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowExpire(long j) {
        this.showExpire_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTime(long j) {
        this.showTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSound(int i) {
        this.sound_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundType(String str) {
        str.getClass();
        this.soundType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundTypeBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.soundType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        byteString.getClass();
        AbstractC3403a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVibrate(int i) {
        this.vibrate_ = i;
    }

    public boolean containsData(String str) {
        str.getClass();
        return internalGetData().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C3952a c3952a = null;
        boolean z = false;
        switch (C3952a.f14046a[methodToInvoke.ordinal()]) {
            case 1:
                return new NotifyInfo();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                this.data_.makeImmutable();
                return null;
            case 4:
                return new C3953b(c3952a);
            case 5:
                GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                NotifyInfo notifyInfo = (NotifyInfo) obj2;
                this.type_ = interfaceC3386h.mo16997f(!this.type_.isEmpty(), this.type_, !notifyInfo.type_.isEmpty(), notifyInfo.type_);
                this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !notifyInfo.title_.isEmpty(), notifyInfo.title_);
                this.desc_ = interfaceC3386h.mo16997f(!this.desc_.isEmpty(), this.desc_, !notifyInfo.desc_.isEmpty(), notifyInfo.desc_);
                int i = this.actionType_;
                boolean z2 = i != 0;
                int i2 = notifyInfo.actionType_;
                this.actionType_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                this.action_ = interfaceC3386h.mo16997f(!this.action_.isEmpty(), this.action_, !notifyInfo.action_.isEmpty(), notifyInfo.action_);
                this.icon_ = interfaceC3386h.mo16997f(!this.icon_.isEmpty(), this.icon_, !notifyInfo.icon_.isEmpty(), notifyInfo.icon_);
                int i3 = this.sound_;
                boolean z3 = i3 != 0;
                int i4 = notifyInfo.sound_;
                this.sound_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                this.soundType_ = interfaceC3386h.mo16997f(!this.soundType_.isEmpty(), this.soundType_, !notifyInfo.soundType_.isEmpty(), notifyInfo.soundType_);
                int i5 = this.vibrate_;
                boolean z4 = i5 != 0;
                int i6 = notifyInfo.vibrate_;
                this.vibrate_ = interfaceC3386h.mo16996e(z4, i5, i6 != 0, i6);
                int i7 = this.light_;
                boolean z5 = i7 != 0;
                int i8 = notifyInfo.light_;
                this.light_ = interfaceC3386h.mo16996e(z5, i7, i8 != 0, i8);
                int i9 = this.backgroundShow_;
                boolean z6 = i9 != 0;
                int i10 = notifyInfo.backgroundShow_;
                this.backgroundShow_ = interfaceC3386h.mo16996e(z6, i9, i10 != 0, i10);
                this.data_ = interfaceC3386h.mo17003l(this.data_, notifyInfo.internalGetData());
                long j = this.showTime_;
                boolean z7 = j != 0;
                long j2 = notifyInfo.showTime_;
                this.showTime_ = interfaceC3386h.mo17000i(z7, j, j2 != 0, j2);
                boolean z8 = false;
                long j3 = this.showExpire_;
                if (j3 != 0) {
                    z8 = true;
                }
                long j4 = notifyInfo.showExpire_;
                this.showExpire_ = interfaceC3386h.mo17000i(z8, j3, j4 != 0, j4);
                boolean z9 = this.popNotify_;
                boolean z10 = notifyInfo.popNotify_;
                this.popNotify_ = interfaceC3386h.mo16995d(z9, z9, z10, z10);
                boolean z11 = this.autoCancel_;
                boolean z12 = notifyInfo.autoCancel_;
                this.autoCancel_ = interfaceC3386h.mo16995d(z11, z11, z12, z12);
                if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                    this.bitField0_ |= notifyInfo.bitField0_;
                }
                return this;
            case 6:
                C3407e c3407e = (C3407e) obj;
                C3410h c3410h = (C3410h) obj2;
                while (!z) {
                    try {
                        int iM17116M = c3407e.m17116M();
                        switch (iM17116M) {
                            case 0:
                                break;
                            case 10:
                                this.type_ = c3407e.m17115L();
                                continue;
                            case 18:
                                this.title_ = c3407e.m17115L();
                                continue;
                            case 26:
                                this.desc_ = c3407e.m17115L();
                                continue;
                            case 32:
                                this.actionType_ = c3407e.m17141u();
                                continue;
                            case 42:
                                this.action_ = c3407e.m17115L();
                                continue;
                            case 50:
                                this.icon_ = c3407e.m17115L();
                                continue;
                            case 56:
                                this.sound_ = c3407e.m17141u();
                                continue;
                            case 66:
                                this.soundType_ = c3407e.m17115L();
                                continue;
                            case 72:
                                this.vibrate_ = c3407e.m17141u();
                                continue;
                            case 80:
                                this.light_ = c3407e.m17141u();
                                continue;
                            case 88:
                                this.backgroundShow_ = c3407e.m17141u();
                                continue;
                            case EACTags.FCP_TEMPLATE /* 98 */:
                                if (!this.data_.isMutable()) {
                                    this.data_ = this.data_.mutableCopy();
                                }
                                C3954c.f14047a.m17280e(this.data_, c3407e, c3410h);
                                continue;
                            case 104:
                                this.showTime_ = c3407e.m17142v();
                                continue;
                            case 112:
                                this.showExpire_ = c3407e.m17142v();
                                continue;
                            case 120:
                                this.popNotify_ = c3407e.m17133m();
                                continue;
                            case 128:
                                this.autoCancel_ = c3407e.m17133m();
                                continue;
                            default:
                                if (!c3407e.m17121R(iM17116M)) {
                                    break;
                                }
                                break;
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
                    synchronized (NotifyInfo.class) {
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

    public String getAction() {
        return this.action_;
    }

    public ByteString getActionBytes() {
        return ByteString.copyFromUtf8(this.action_);
    }

    public int getActionType() {
        return this.actionType_;
    }

    public boolean getAutoCancel() {
        return this.autoCancel_;
    }

    public int getBackgroundShow() {
        return this.backgroundShow_;
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

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public int getLight() {
        return this.light_;
    }

    public boolean getPopNotify() {
        return this.popNotify_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM16901K = !this.type_.isEmpty() ? CodedOutputStream.m16901K(1, getType()) : 0;
        if (!this.title_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(2, getTitle());
        }
        if (!this.desc_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(3, getDesc());
        }
        int i2 = this.actionType_;
        if (i2 != 0) {
            iM16901K += CodedOutputStream.m16929t(4, i2);
        }
        if (!this.action_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(5, getAction());
        }
        if (!this.icon_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(6, getIcon());
        }
        int i3 = this.sound_;
        if (i3 != 0) {
            iM16901K += CodedOutputStream.m16929t(7, i3);
        }
        if (!this.soundType_.isEmpty()) {
            iM16901K += CodedOutputStream.m16901K(8, getSoundType());
        }
        int i4 = this.vibrate_;
        if (i4 != 0) {
            iM16901K += CodedOutputStream.m16929t(9, i4);
        }
        int i5 = this.light_;
        if (i5 != 0) {
            iM16901K += CodedOutputStream.m16929t(10, i5);
        }
        int i6 = this.backgroundShow_;
        if (i6 != 0) {
            iM16901K += CodedOutputStream.m16929t(11, i6);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            iM16901K += C3954c.f14047a.m17279a(12, entry.getKey(), entry.getValue());
        }
        long j = this.showTime_;
        if (j != 0) {
            iM16901K += CodedOutputStream.m16931v(13, j);
        }
        long j2 = this.showExpire_;
        if (j2 != 0) {
            iM16901K += CodedOutputStream.m16931v(14, j2);
        }
        boolean z = this.popNotify_;
        if (z) {
            iM16901K += CodedOutputStream.m16915f(15, z);
        }
        boolean z2 = this.autoCancel_;
        if (z2) {
            iM16901K += CodedOutputStream.m16915f(16, z2);
        }
        this.memoizedSerializedSize = iM16901K;
        return iM16901K;
    }

    public long getShowExpire() {
        return this.showExpire_;
    }

    public long getShowTime() {
        return this.showTime_;
    }

    public int getSound() {
        return this.sound_;
    }

    public String getSoundType() {
        return this.soundType_;
    }

    public ByteString getSoundTypeBytes() {
        return ByteString.copyFromUtf8(this.soundType_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public int getVibrate() {
        return this.vibrate_;
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.type_.isEmpty()) {
            codedOutputStream.mo16939D0(1, getType());
        }
        if (!this.title_.isEmpty()) {
            codedOutputStream.mo16939D0(2, getTitle());
        }
        if (!this.desc_.isEmpty()) {
            codedOutputStream.mo16939D0(3, getDesc());
        }
        int i = this.actionType_;
        if (i != 0) {
            codedOutputStream.mo16970s0(4, i);
        }
        if (!this.action_.isEmpty()) {
            codedOutputStream.mo16939D0(5, getAction());
        }
        if (!this.icon_.isEmpty()) {
            codedOutputStream.mo16939D0(6, getIcon());
        }
        int i2 = this.sound_;
        if (i2 != 0) {
            codedOutputStream.mo16970s0(7, i2);
        }
        if (!this.soundType_.isEmpty()) {
            codedOutputStream.mo16939D0(8, getSoundType());
        }
        int i3 = this.vibrate_;
        if (i3 != 0) {
            codedOutputStream.mo16970s0(9, i3);
        }
        int i4 = this.light_;
        if (i4 != 0) {
            codedOutputStream.mo16970s0(10, i4);
        }
        int i5 = this.backgroundShow_;
        if (i5 != 0) {
            codedOutputStream.mo16970s0(11, i5);
        }
        for (Map.Entry<String, String> entry : internalGetData().entrySet()) {
            C3954c.f14047a.m17281f(codedOutputStream, 12, entry.getKey(), entry.getValue());
        }
        long j = this.showTime_;
        if (j != 0) {
            codedOutputStream.m16972u0(13, j);
        }
        long j2 = this.showExpire_;
        if (j2 != 0) {
            codedOutputStream.m16972u0(14, j2);
        }
        boolean z = this.popNotify_;
        if (z) {
            codedOutputStream.mo16950a0(15, z);
        }
        boolean z2 = this.autoCancel_;
        if (z2) {
            codedOutputStream.mo16950a0(16, z2);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.pb.NotifyInfo$b */
    public static final class C3953b extends GeneratedMessageLite.AbstractC3380b<NotifyInfo, C3953b> implements o6z {
        private C3953b() {
            super(NotifyInfo.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C3953b(C3952a c3952a) {
            this();
        }
    }

    public static NotifyInfo parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static NotifyInfo parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
    }

    public static NotifyInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotifyInfo parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
    }

    public static NotifyInfo parseFrom(InputStream inputStream) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotifyInfo parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
    }

    public static NotifyInfo parseFrom(C3407e c3407e) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
    }

    public static C3953b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static NotifyInfo parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
        return (NotifyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
    }
}
