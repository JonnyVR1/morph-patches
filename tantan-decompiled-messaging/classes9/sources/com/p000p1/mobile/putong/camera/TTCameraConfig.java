package com.p000p1.mobile.putong.camera;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraConfig> CREATOR = new C0130a();
    public static final String TYPE_AGREEMENT = "agreement";
    public static final String TYPE_ID_CARD_AVATAR = "avatar";
    public static final String TYPE_ID_CARD_EMBLEM = "emblem";
    public static final String TYPE_ID_CARD_HAND = "hand_idCard";
    private boolean autoPreview;
    private String description;
    private boolean isPrivate;
    private boolean isVideo;
    private int maxFps;
    private int maxTakingPictureCount;
    private long recordTime;
    private String subDescription;
    private String type;
    private boolean usingBackCamera;
    private boolean usingCamera2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.TTCameraConfig$a */
    public class C0130a implements Parcelable.Creator<TTCameraConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TTCameraConfig createFromParcel(Parcel parcel) {
            return new TTCameraConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TTCameraConfig[] newArray(int i) {
            return new TTCameraConfig[i];
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.TTCameraConfig$b */
    public static final class C0131b {

        /* JADX INFO: renamed from: a */
        public boolean f1205a;

        /* JADX INFO: renamed from: b */
        public String f1206b;

        /* JADX INFO: renamed from: c */
        public String f1207c;

        /* JADX INFO: renamed from: d */
        public String f1208d;

        /* JADX INFO: renamed from: e */
        public boolean f1209e;

        /* JADX INFO: renamed from: f */
        public long f1210f;

        /* JADX INFO: renamed from: g */
        public boolean f1211g;

        /* JADX INFO: renamed from: h */
        public int f1212h;

        /* JADX INFO: renamed from: i */
        public boolean f1213i;

        /* JADX INFO: renamed from: j */
        public int f1214j;

        /* JADX INFO: renamed from: k */
        public boolean f1215k;

        public C0131b() {
            this.f1206b = "";
            this.f1210f = 30L;
            this.f1211g = true;
            this.f1212h = 1;
            this.f1213i = true;
            this.f1214j = 24;
            this.f1215k = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraConfig m1647a() {
            TTCameraConfig tTCameraConfig = new TTCameraConfig();
            tTCameraConfig.m1643y(this.f1205a);
            tTCameraConfig.m1642x(this.f1206b);
            tTCameraConfig.m1637r(this.f1207c);
            tTCameraConfig.m1641w(this.f1208d);
            tTCameraConfig.m1640u(this.f1210f);
            tTCameraConfig.m1644z(this.f1211g);
            tTCameraConfig.m1639t(this.f1212h);
            tTCameraConfig.m1636q(this.f1213i);
            tTCameraConfig.m1638s(this.f1214j);
            tTCameraConfig.isVideo = this.f1209e;
            tTCameraConfig.isPrivate = this.f1215k;
            return tTCameraConfig;
        }

        /* JADX INFO: renamed from: b */
        public C0131b m1648b(boolean z) {
            this.f1215k = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0131b m1649c(boolean z) {
            this.f1213i = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0131b m1650d(String str) {
            this.f1207c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0131b m1651e(boolean z) {
            this.f1209e = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0131b m1652f(int i) {
            this.f1214j = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0131b m1653g(String str) {
            this.f1206b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0131b m1654h(boolean z) {
            this.f1205a = z;
            return this;
        }
    }

    public TTCameraConfig(Parcel parcel) {
        this.recordTime = 0L;
        this.usingCamera2 = true;
        this.maxTakingPictureCount = 1;
        this.autoPreview = false;
        this.maxFps = 24;
        this.usingBackCamera = parcel.readByte() != 0;
        this.type = parcel.readString();
        this.description = parcel.readString();
        this.subDescription = parcel.readString();
        this.isVideo = parcel.readByte() != 0;
        this.recordTime = parcel.readLong();
        this.usingCamera2 = parcel.readByte() != 0;
        this.maxTakingPictureCount = parcel.readInt();
        this.autoPreview = parcel.readByte() != 0;
        this.maxFps = parcel.readInt();
        this.isPrivate = parcel.readByte() != 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1623n(String str) {
        return TYPE_ID_CARD_AVATAR.equals(str) || TYPE_ID_CARD_HAND.equals(str) || TYPE_ID_CARD_EMBLEM.equals(str) || TYPE_AGREEMENT.equals(str);
    }

    /* JADX INFO: renamed from: p */
    public static C0131b m1624p() {
        return new C0131b();
    }

    /* JADX INFO: renamed from: c */
    public int m1625c() {
        return this.usingBackCamera ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public String m1626d() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m1627e() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: f */
    public int m1628f() {
        return this.maxTakingPictureCount;
    }

    /* JADX INFO: renamed from: g */
    public long m1629g() {
        return this.recordTime;
    }

    /* JADX INFO: renamed from: h */
    public String m1630h() {
        return this.type;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1631i() {
        return this.autoPreview;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1632k() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: l */
    public boolean m1633l() {
        return this.usingBackCamera;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1634m() {
        return this.usingCamera2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m1635o() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: q */
    public void m1636q(boolean z) {
        this.autoPreview = z;
    }

    /* JADX INFO: renamed from: r */
    public void m1637r(String str) {
        this.description = str;
    }

    /* JADX INFO: renamed from: s */
    public void m1638s(int i) {
        this.maxFps = i;
    }

    /* JADX INFO: renamed from: t */
    public void m1639t(int i) {
        this.maxTakingPictureCount = i;
    }

    /* JADX INFO: renamed from: u */
    public void m1640u(long j) {
        this.recordTime = j;
    }

    /* JADX INFO: renamed from: w */
    public void m1641w(String str) {
        this.subDescription = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.usingBackCamera ? (byte) 1 : (byte) 0);
        parcel.writeString(this.type);
        parcel.writeString(this.description);
        parcel.writeString(this.subDescription);
        parcel.writeByte(this.isVideo ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.recordTime);
        parcel.writeByte(this.usingCamera2 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxTakingPictureCount);
        parcel.writeByte(this.autoPreview ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxFps);
        parcel.writeByte(this.isPrivate ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: x */
    public void m1642x(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: y */
    public void m1643y(boolean z) {
        this.usingBackCamera = z;
    }

    /* JADX INFO: renamed from: z */
    public void m1644z(boolean z) {
        this.usingCamera2 = z;
    }

    private TTCameraConfig() {
        this.recordTime = 0L;
        this.usingCamera2 = true;
        this.maxTakingPictureCount = 1;
        this.autoPreview = false;
        this.maxFps = 24;
    }
}
