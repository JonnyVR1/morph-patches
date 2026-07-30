package com.p046p1.mobile.putong.camera;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraConfig> CREATOR = new C4704a();
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
    public class C4704a implements Parcelable.Creator<TTCameraConfig> {
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
    public static final class C4705b {

        /* JADX INFO: renamed from: a */
        public boolean f17216a;

        /* JADX INFO: renamed from: b */
        public String f17217b;

        /* JADX INFO: renamed from: c */
        public String f17218c;

        /* JADX INFO: renamed from: d */
        public String f17219d;

        /* JADX INFO: renamed from: e */
        public boolean f17220e;

        /* JADX INFO: renamed from: f */
        public long f17221f;

        /* JADX INFO: renamed from: g */
        public boolean f17222g;

        /* JADX INFO: renamed from: h */
        public int f17223h;

        /* JADX INFO: renamed from: i */
        public boolean f17224i;

        /* JADX INFO: renamed from: j */
        public int f17225j;

        /* JADX INFO: renamed from: k */
        public boolean f17226k;

        public C4705b() {
            this.f17217b = "";
            this.f17221f = 30L;
            this.f17222g = true;
            this.f17223h = 1;
            this.f17224i = true;
            this.f17225j = 24;
            this.f17226k = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraConfig m29737a() {
            TTCameraConfig tTCameraConfig = new TTCameraConfig();
            tTCameraConfig.m29733y(this.f17216a);
            tTCameraConfig.m29732x(this.f17217b);
            tTCameraConfig.m29727r(this.f17218c);
            tTCameraConfig.m29731w(this.f17219d);
            tTCameraConfig.m29730u(this.f17221f);
            tTCameraConfig.m29734z(this.f17222g);
            tTCameraConfig.m29729t(this.f17223h);
            tTCameraConfig.m29726q(this.f17224i);
            tTCameraConfig.m29728s(this.f17225j);
            tTCameraConfig.isVideo = this.f17220e;
            tTCameraConfig.isPrivate = this.f17226k;
            return tTCameraConfig;
        }

        /* JADX INFO: renamed from: b */
        public C4705b m29738b(boolean z) {
            this.f17226k = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4705b m29739c(boolean z) {
            this.f17224i = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4705b m29740d(String str) {
            this.f17218c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C4705b m29741e(boolean z) {
            this.f17220e = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C4705b m29742f(int i) {
            this.f17225j = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C4705b m29743g(String str) {
            this.f17217b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C4705b m29744h(boolean z) {
            this.f17216a = z;
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
    public static boolean m29713n(String str) {
        return "avatar".equals(str) || TYPE_ID_CARD_HAND.equals(str) || TYPE_ID_CARD_EMBLEM.equals(str) || TYPE_AGREEMENT.equals(str);
    }

    /* JADX INFO: renamed from: p */
    public static C4705b m29714p() {
        return new C4705b();
    }

    /* JADX INFO: renamed from: c */
    public int m29715c() {
        return this.usingBackCamera ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public String m29716d() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m29717e() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: f */
    public int m29718f() {
        return this.maxTakingPictureCount;
    }

    /* JADX INFO: renamed from: g */
    public long m29719g() {
        return this.recordTime;
    }

    /* JADX INFO: renamed from: h */
    public String m29720h() {
        return this.type;
    }

    /* JADX INFO: renamed from: i */
    public boolean m29721i() {
        return this.autoPreview;
    }

    /* JADX INFO: renamed from: k */
    public boolean m29722k() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: l */
    public boolean m29723l() {
        return this.usingBackCamera;
    }

    /* JADX INFO: renamed from: m */
    public boolean m29724m() {
        return this.usingCamera2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m29725o() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: q */
    public void m29726q(boolean z) {
        this.autoPreview = z;
    }

    /* JADX INFO: renamed from: r */
    public void m29727r(String str) {
        this.description = str;
    }

    /* JADX INFO: renamed from: s */
    public void m29728s(int i) {
        this.maxFps = i;
    }

    /* JADX INFO: renamed from: t */
    public void m29729t(int i) {
        this.maxTakingPictureCount = i;
    }

    /* JADX INFO: renamed from: u */
    public void m29730u(long j) {
        this.recordTime = j;
    }

    /* JADX INFO: renamed from: w */
    public void m29731w(String str) {
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
    public void m29732x(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: y */
    public void m29733y(boolean z) {
        this.usingBackCamera = z;
    }

    /* JADX INFO: renamed from: z */
    public void m29734z(boolean z) {
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
