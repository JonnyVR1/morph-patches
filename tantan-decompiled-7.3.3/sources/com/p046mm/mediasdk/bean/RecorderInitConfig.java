package com.p046mm.mediasdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;

/* JADX INFO: loaded from: classes6.dex */
public class RecorderInitConfig implements Parcelable {
    public static final Parcelable.Creator<RecorderInitConfig> CREATOR = new C4152a();
    private final String appId;
    private boolean isUseAR;
    private long pullConfigInterval;
    private final String uid;
    private final int userVersionCode;
    private final String userVersionName;

    /* JADX INFO: renamed from: com.mm.mediasdk.bean.RecorderInitConfig$a */
    public class C4152a implements Parcelable.Creator<RecorderInitConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecorderInitConfig createFromParcel(Parcel parcel) {
            return new RecorderInitConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecorderInitConfig[] newArray(int i) {
            return new RecorderInitConfig[i];
        }
    }

    /* JADX INFO: renamed from: com.mm.mediasdk.bean.RecorderInitConfig$b */
    public static class C4153b {

        /* JADX INFO: renamed from: b */
        private String f14940b;

        /* JADX INFO: renamed from: c */
        private int f14941c;

        /* JADX INFO: renamed from: d */
        private String f14942d;

        /* JADX INFO: renamed from: e */
        private String f14943e;

        /* JADX INFO: renamed from: a */
        private boolean f14939a = true;

        /* JADX INFO: renamed from: f */
        private long f14944f = -1;

        public C4153b(String str) {
            this.f14940b = str;
        }

        /* JADX INFO: renamed from: g */
        public RecorderInitConfig m20620g() {
            return new RecorderInitConfig(this, null);
        }

        /* JADX INFO: renamed from: h */
        public C4153b m20621h(int i) {
            this.f14944f = i * HuiYanResultSender.TIMEOUT_MS;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C4153b m20622i(String str) {
            this.f14943e = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C4153b m20623j(int i) {
            this.f14941c = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C4153b m20624k(String str) {
            this.f14942d = str;
            return this;
        }
    }

    private RecorderInitConfig(C4153b c4153b) {
        this.pullConfigInterval = -1L;
        this.appId = c4153b.f14940b;
        this.userVersionCode = c4153b.f14941c;
        this.userVersionName = c4153b.f14942d;
        this.uid = c4153b.f14943e;
        this.pullConfigInterval = c4153b.f14944f;
        this.isUseAR = c4153b.f14939a;
    }

    /* JADX INFO: renamed from: a */
    public String m20607a() {
        return this.appId;
    }

    /* JADX INFO: renamed from: b */
    public String m20608b() {
        return this.uid;
    }

    /* JADX INFO: renamed from: c */
    public int m20609c() {
        return this.userVersionCode;
    }

    /* JADX INFO: renamed from: d */
    public String m20610d() {
        return this.userVersionName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20611e() {
        return this.isUseAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeInt(this.userVersionCode);
        parcel.writeString(this.userVersionName);
        parcel.writeString(this.uid);
        parcel.writeInt(this.isUseAR ? 1 : 0);
    }

    public /* synthetic */ RecorderInitConfig(C4153b c4153b, C4152a c4152a) {
        this(c4153b);
    }

    public RecorderInitConfig(Parcel parcel) {
        this.pullConfigInterval = -1L;
        this.appId = parcel.readString();
        this.userVersionCode = parcel.readInt();
        this.userVersionName = parcel.readString();
        this.uid = parcel.readString();
        this.isUseAR = parcel.readInt() == 1;
    }
}
