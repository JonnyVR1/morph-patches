package com.p051p1.mobile.putong.camera;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraConfig> CREATOR = new C4855a();
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
    public class C4855a implements Parcelable.Creator<TTCameraConfig> {
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
    public static final class C4856b {

        /* JADX INFO: renamed from: a */
        public boolean f17935a;

        /* JADX INFO: renamed from: b */
        public String f17936b;

        /* JADX INFO: renamed from: c */
        public String f17937c;

        /* JADX INFO: renamed from: d */
        public String f17938d;

        /* JADX INFO: renamed from: e */
        public boolean f17939e;

        /* JADX INFO: renamed from: f */
        public long f17940f;

        /* JADX INFO: renamed from: g */
        public boolean f17941g;

        /* JADX INFO: renamed from: h */
        public int f17942h;

        /* JADX INFO: renamed from: i */
        public boolean f17943i;

        /* JADX INFO: renamed from: j */
        public int f17944j;

        /* JADX INFO: renamed from: k */
        public boolean f17945k;

        public C4856b() {
            this.f17936b = "";
            this.f17940f = 30L;
            this.f17941g = true;
            this.f17942h = 1;
            this.f17943i = true;
            this.f17944j = 24;
            this.f17945k = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraConfig m30735a() {
            TTCameraConfig tTCameraConfig = new TTCameraConfig();
            tTCameraConfig.m30731y(this.f17935a);
            tTCameraConfig.m30730x(this.f17936b);
            tTCameraConfig.m30725r(this.f17937c);
            tTCameraConfig.m30729w(this.f17938d);
            tTCameraConfig.m30728u(this.f17940f);
            tTCameraConfig.m30732z(this.f17941g);
            tTCameraConfig.m30727t(this.f17942h);
            tTCameraConfig.m30724q(this.f17943i);
            tTCameraConfig.m30726s(this.f17944j);
            tTCameraConfig.isVideo = this.f17939e;
            tTCameraConfig.isPrivate = this.f17945k;
            return tTCameraConfig;
        }

        /* JADX INFO: renamed from: b */
        public C4856b m30736b(boolean z) {
            this.f17945k = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4856b m30737c(boolean z) {
            this.f17943i = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4856b m30738d(String str) {
            this.f17937c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C4856b m30739e(boolean z) {
            this.f17939e = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C4856b m30740f(int i) {
            this.f17944j = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C4856b m30741g(String str) {
            this.f17936b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C4856b m30742h(boolean z) {
            this.f17935a = z;
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
    public static boolean m30711n(String str) {
        return "avatar".equals(str) || TYPE_ID_CARD_HAND.equals(str) || TYPE_ID_CARD_EMBLEM.equals(str) || TYPE_AGREEMENT.equals(str);
    }

    /* JADX INFO: renamed from: p */
    public static C4856b m30712p() {
        return new C4856b();
    }

    /* JADX INFO: renamed from: c */
    public int m30713c() {
        return this.usingBackCamera ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public String m30714d() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m30715e() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: f */
    public int m30716f() {
        return this.maxTakingPictureCount;
    }

    /* JADX INFO: renamed from: g */
    public long m30717g() {
        return this.recordTime;
    }

    /* JADX INFO: renamed from: h */
    public String m30718h() {
        return this.type;
    }

    /* JADX INFO: renamed from: i */
    public boolean m30719i() {
        return this.autoPreview;
    }

    /* JADX INFO: renamed from: k */
    public boolean m30720k() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: l */
    public boolean m30721l() {
        return this.usingBackCamera;
    }

    /* JADX INFO: renamed from: m */
    public boolean m30722m() {
        return this.usingCamera2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m30723o() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: q */
    public void m30724q(boolean z) {
        this.autoPreview = z;
    }

    /* JADX INFO: renamed from: r */
    public void m30725r(String str) {
        this.description = str;
    }

    /* JADX INFO: renamed from: s */
    public void m30726s(int i) {
        this.maxFps = i;
    }

    /* JADX INFO: renamed from: t */
    public void m30727t(int i) {
        this.maxTakingPictureCount = i;
    }

    /* JADX INFO: renamed from: u */
    public void m30728u(long j) {
        this.recordTime = j;
    }

    /* JADX INFO: renamed from: w */
    public void m30729w(String str) {
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
    public void m30730x(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: y */
    public void m30731y(boolean z) {
        this.usingBackCamera = z;
    }

    /* JADX INFO: renamed from: z */
    public void m30732z(boolean z) {
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
