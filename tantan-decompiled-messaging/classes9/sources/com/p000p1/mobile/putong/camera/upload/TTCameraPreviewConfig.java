package com.p000p1.mobile.putong.camera.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraPreviewConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraPreviewConfig> CREATOR = new C0132a();
    public static final int PREVIEW_TYPE_CENTER = 1;
    public static final int PREVIEW_TYPE_SCALE_80 = 2;
    private String absoluteFilePath;
    private boolean canUseLocalVideo;
    private boolean isPrivate;
    private boolean isUploadAllowed;
    private boolean isVideo;
    private boolean needDownloadFile;
    private int previewType;
    private String previewUrl;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.TTCameraPreviewConfig$a */
    public class C0132a implements Parcelable.Creator<TTCameraPreviewConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TTCameraPreviewConfig createFromParcel(Parcel parcel) {
            return new TTCameraPreviewConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TTCameraPreviewConfig[] newArray(int i) {
            return new TTCameraPreviewConfig[i];
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.TTCameraPreviewConfig$b */
    public static final class C0133b {

        /* JADX INFO: renamed from: a */
        public String f1225a;

        /* JADX INFO: renamed from: b */
        public boolean f1226b;

        /* JADX INFO: renamed from: c */
        public boolean f1227c;

        /* JADX INFO: renamed from: d */
        public boolean f1228d;

        /* JADX INFO: renamed from: e */
        public String f1229e;

        /* JADX INFO: renamed from: f */
        public int f1230f;

        /* JADX INFO: renamed from: g */
        public boolean f1231g;

        /* JADX INFO: renamed from: h */
        public boolean f1232h;

        public C0133b() {
            this.f1226b = true;
            this.f1230f = 2;
            this.f1231g = false;
            this.f1232h = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraPreviewConfig m1704a() {
            TTCameraPreviewConfig tTCameraPreviewConfig = new TTCameraPreviewConfig();
            tTCameraPreviewConfig.m1700s(this.f1225a);
            tTCameraPreviewConfig.m1701t(this.f1226b);
            tTCameraPreviewConfig.m1696o(this.f1229e);
            tTCameraPreviewConfig.m1699r(this.f1230f);
            tTCameraPreviewConfig.isVideo = this.f1227c;
            tTCameraPreviewConfig.isPrivate = this.f1228d;
            tTCameraPreviewConfig.canUseLocalVideo = this.f1231g;
            tTCameraPreviewConfig.needDownloadFile = this.f1232h;
            return tTCameraPreviewConfig;
        }

        /* JADX INFO: renamed from: b */
        public C0133b m1705b(String str) {
            this.f1229e = str;
            this.f1225a = rhi.B(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0133b m1706c(TTCameraConfig tTCameraConfig) {
            boolean zM1635o = tTCameraConfig.m1635o();
            this.f1227c = zM1635o;
            if (zM1635o) {
                m1708e(2);
            }
            if (tTCameraConfig.m1630h().equals(TTCameraConfig.TYPE_ID_CARD_AVATAR) || tTCameraConfig.m1630h().equals(TTCameraConfig.TYPE_ID_CARD_EMBLEM)) {
                m1708e(1);
            }
            this.f1228d = tTCameraConfig.m1632k();
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0133b m1707d(boolean z) {
            this.f1228d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0133b m1708e(int i) {
            this.f1230f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0133b m1709f(String str) {
            this.f1225a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0133b m1710g(boolean z) {
            this.f1226b = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0133b m1711h() {
            this.f1232h = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0133b m1712i() {
            this.f1231g = true;
            return this;
        }
    }

    public TTCameraPreviewConfig(Parcel parcel) {
        this.previewType = 2;
        this.needDownloadFile = false;
        this.previewUrl = parcel.readString();
        this.isUploadAllowed = parcel.readByte() != 0;
        this.isVideo = parcel.readByte() != 0;
        this.isPrivate = parcel.readByte() != 0;
        this.canUseLocalVideo = parcel.readByte() != 0;
        this.absoluteFilePath = parcel.readString();
        this.previewType = parcel.readInt();
        this.needDownloadFile = parcel.readByte() != 0;
    }

    /* JADX INFO: renamed from: e */
    public static C0133b m1687e() {
        return new C0133b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public String m1688f() {
        return this.absoluteFilePath;
    }

    /* JADX INFO: renamed from: g */
    public int m1689g() {
        return this.previewType;
    }

    /* JADX INFO: renamed from: h */
    public String m1690h() {
        return this.previewUrl;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1691i() {
        return this.canUseLocalVideo;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1692k() {
        return this.needDownloadFile;
    }

    /* JADX INFO: renamed from: l */
    public boolean m1693l() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1694m() {
        return this.isUploadAllowed;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1695n() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: o */
    public void m1696o(String str) {
        this.absoluteFilePath = str;
    }

    /* JADX INFO: renamed from: p */
    public void m1697p(boolean z) {
        this.canUseLocalVideo = z;
    }

    /* JADX INFO: renamed from: q */
    public void m1698q(boolean z) {
        this.needDownloadFile = z;
    }

    /* JADX INFO: renamed from: r */
    public void m1699r(int i) {
        this.previewType = i;
    }

    /* JADX INFO: renamed from: s */
    public void m1700s(String str) {
        this.previewUrl = str;
    }

    /* JADX INFO: renamed from: t */
    public void m1701t(boolean z) {
        this.isUploadAllowed = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.previewUrl);
        parcel.writeByte(this.isUploadAllowed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPrivate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canUseLocalVideo ? (byte) 1 : (byte) 0);
        parcel.writeString(this.absoluteFilePath);
        parcel.writeInt(this.previewType);
        parcel.writeByte(this.needDownloadFile ? (byte) 1 : (byte) 0);
    }

    private TTCameraPreviewConfig() {
        this.previewType = 2;
        this.needDownloadFile = false;
    }
}
