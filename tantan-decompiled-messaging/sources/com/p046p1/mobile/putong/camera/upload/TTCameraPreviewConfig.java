package com.p046p1.mobile.putong.camera.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import p149l.rhi;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewConfig implements Parcelable {
    public static final Parcelable.Creator<TTCameraPreviewConfig> CREATOR = new C4706a();
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
    public class C4706a implements Parcelable.Creator<TTCameraPreviewConfig> {
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
    public static final class C4707b {

        /* JADX INFO: renamed from: a */
        public String f17236a;

        /* JADX INFO: renamed from: b */
        public boolean f17237b;

        /* JADX INFO: renamed from: c */
        public boolean f17238c;

        /* JADX INFO: renamed from: d */
        public boolean f17239d;

        /* JADX INFO: renamed from: e */
        public String f17240e;

        /* JADX INFO: renamed from: f */
        public int f17241f;

        /* JADX INFO: renamed from: g */
        public boolean f17242g;

        /* JADX INFO: renamed from: h */
        public boolean f17243h;

        public C4707b() {
            this.f17237b = true;
            this.f17241f = 2;
            this.f17242g = false;
            this.f17243h = false;
        }

        /* JADX INFO: renamed from: a */
        public TTCameraPreviewConfig m29793a() {
            TTCameraPreviewConfig tTCameraPreviewConfig = new TTCameraPreviewConfig();
            tTCameraPreviewConfig.m29789s(this.f17236a);
            tTCameraPreviewConfig.m29790t(this.f17237b);
            tTCameraPreviewConfig.m29785o(this.f17240e);
            tTCameraPreviewConfig.m29788r(this.f17241f);
            tTCameraPreviewConfig.isVideo = this.f17238c;
            tTCameraPreviewConfig.isPrivate = this.f17239d;
            tTCameraPreviewConfig.canUseLocalVideo = this.f17242g;
            tTCameraPreviewConfig.needDownloadFile = this.f17243h;
            return tTCameraPreviewConfig;
        }

        /* JADX INFO: renamed from: b */
        public C4707b m29794b(String str) {
            this.f17240e = str;
            this.f17236a = rhi.m179355B(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4707b m29795c(TTCameraConfig tTCameraConfig) {
            boolean zM29725o = tTCameraConfig.m29725o();
            this.f17238c = zM29725o;
            if (zM29725o) {
                m29797e(2);
            }
            if (tTCameraConfig.m29720h().equals("avatar") || tTCameraConfig.m29720h().equals(TTCameraConfig.TYPE_ID_CARD_EMBLEM)) {
                m29797e(1);
            }
            this.f17239d = tTCameraConfig.m29722k();
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4707b m29796d(boolean z) {
            this.f17239d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C4707b m29797e(int i) {
            this.f17241f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C4707b m29798f(String str) {
            this.f17236a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C4707b m29799g(boolean z) {
            this.f17237b = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C4707b m29800h() {
            this.f17243h = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C4707b m29801i() {
            this.f17242g = true;
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
    public static C4707b m29776e() {
        return new C4707b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public String m29777f() {
        return this.absoluteFilePath;
    }

    /* JADX INFO: renamed from: g */
    public int m29778g() {
        return this.previewType;
    }

    /* JADX INFO: renamed from: h */
    public String m29779h() {
        return this.previewUrl;
    }

    /* JADX INFO: renamed from: i */
    public boolean m29780i() {
        return this.canUseLocalVideo;
    }

    /* JADX INFO: renamed from: k */
    public boolean m29781k() {
        return this.needDownloadFile;
    }

    /* JADX INFO: renamed from: l */
    public boolean m29782l() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: m */
    public boolean m29783m() {
        return this.isUploadAllowed;
    }

    /* JADX INFO: renamed from: n */
    public boolean m29784n() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: o */
    public void m29785o(String str) {
        this.absoluteFilePath = str;
    }

    /* JADX INFO: renamed from: p */
    public void m29786p(boolean z) {
        this.canUseLocalVideo = z;
    }

    /* JADX INFO: renamed from: q */
    public void m29787q(boolean z) {
        this.needDownloadFile = z;
    }

    /* JADX INFO: renamed from: r */
    public void m29788r(int i) {
        this.previewType = i;
    }

    /* JADX INFO: renamed from: s */
    public void m29789s(String str) {
        this.previewUrl = str;
    }

    /* JADX INFO: renamed from: t */
    public void m29790t(boolean z) {
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
