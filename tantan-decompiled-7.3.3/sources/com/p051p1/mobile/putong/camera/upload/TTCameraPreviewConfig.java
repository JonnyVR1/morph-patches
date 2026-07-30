package com.p051p1.mobile.putong.camera.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import p153l.oki;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraPreviewConfig> CREATOR = new C4857a();
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
    public class C4857a implements Parcelable.Creator<TTCameraPreviewConfig> {
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
    public static final class C4858b {

        /* JADX INFO: renamed from: a */
        public String f17955a;

        /* JADX INFO: renamed from: b */
        public boolean f17956b;

        /* JADX INFO: renamed from: c */
        public boolean f17957c;

        /* JADX INFO: renamed from: d */
        public boolean f17958d;

        /* JADX INFO: renamed from: e */
        public String f17959e;

        /* JADX INFO: renamed from: f */
        public int f17960f;

        /* JADX INFO: renamed from: g */
        public boolean f17961g;

        /* JADX INFO: renamed from: h */
        public boolean f17962h;

        public C4858b() {
            this.f17956b = true;
            this.f17960f = 2;
            this.f17961g = false;
            this.f17962h = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraPreviewConfig m30791a() {
            TTCameraPreviewConfig tTCameraPreviewConfig = new TTCameraPreviewConfig();
            tTCameraPreviewConfig.m30787s(this.f17955a);
            tTCameraPreviewConfig.m30788t(this.f17956b);
            tTCameraPreviewConfig.m30783o(this.f17959e);
            tTCameraPreviewConfig.m30786r(this.f17960f);
            tTCameraPreviewConfig.isVideo = this.f17957c;
            tTCameraPreviewConfig.isPrivate = this.f17958d;
            tTCameraPreviewConfig.canUseLocalVideo = this.f17961g;
            tTCameraPreviewConfig.needDownloadFile = this.f17962h;
            return tTCameraPreviewConfig;
        }

        /* JADX INFO: renamed from: b */
        public C4858b m30792b(String str) {
            this.f17959e = str;
            this.f17955a = oki.m168011B(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4858b m30793c(TTCameraConfig tTCameraConfig) {
            boolean zM30723o = tTCameraConfig.m30723o();
            this.f17957c = zM30723o;
            if (zM30723o) {
                m30795e(2);
            }
            if (tTCameraConfig.m30718h().equals("avatar") || tTCameraConfig.m30718h().equals(TTCameraConfig.TYPE_ID_CARD_EMBLEM)) {
                m30795e(1);
            }
            this.f17958d = tTCameraConfig.m30720k();
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4858b m30794d(boolean z) {
            this.f17958d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C4858b m30795e(int i) {
            this.f17960f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C4858b m30796f(String str) {
            this.f17955a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C4858b m30797g(boolean z) {
            this.f17956b = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C4858b m30798h() {
            this.f17962h = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C4858b m30799i() {
            this.f17961g = true;
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
    public static C4858b m30774e() {
        return new C4858b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public String m30775f() {
        return this.absoluteFilePath;
    }

    /* JADX INFO: renamed from: g */
    public int m30776g() {
        return this.previewType;
    }

    /* JADX INFO: renamed from: h */
    public String m30777h() {
        return this.previewUrl;
    }

    /* JADX INFO: renamed from: i */
    public boolean m30778i() {
        return this.canUseLocalVideo;
    }

    /* JADX INFO: renamed from: k */
    public boolean m30779k() {
        return this.needDownloadFile;
    }

    /* JADX INFO: renamed from: l */
    public boolean m30780l() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: m */
    public boolean m30781m() {
        return this.isUploadAllowed;
    }

    /* JADX INFO: renamed from: n */
    public boolean m30782n() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: o */
    public void m30783o(String str) {
        this.absoluteFilePath = str;
    }

    /* JADX INFO: renamed from: p */
    public void m30784p(boolean z) {
        this.canUseLocalVideo = z;
    }

    /* JADX INFO: renamed from: q */
    public void m30785q(boolean z) {
        this.needDownloadFile = z;
    }

    /* JADX INFO: renamed from: r */
    public void m30786r(int i) {
        this.previewType = i;
    }

    /* JADX INFO: renamed from: s */
    public void m30787s(String str) {
        this.previewUrl = str;
    }

    /* JADX INFO: renamed from: t */
    public void m30788t(boolean z) {
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
