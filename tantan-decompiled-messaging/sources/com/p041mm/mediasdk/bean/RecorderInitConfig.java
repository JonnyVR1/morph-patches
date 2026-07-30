package com.p041mm.mediasdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;

/* JADX INFO: loaded from: classes7.dex */
public class RecorderInitConfig implements Parcelable {
    public static final Parcelable.Creator<RecorderInitConfig> CREATOR = new C4001a();
    private final String appId;
    private boolean isUseAR;
    private long pullConfigInterval;
    private final String uid;
    private final int userVersionCode;
    private final String userVersionName;

    /* JADX INFO: renamed from: com.mm.mediasdk.bean.RecorderInitConfig$a */
    public class C4001a implements Parcelable.Creator<RecorderInitConfig> {
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
    public static class C4002b {

        /* JADX INFO: renamed from: b */
        private String f14221b;

        /* JADX INFO: renamed from: c */
        private int f14222c;

        /* JADX INFO: renamed from: d */
        private String f14223d;

        /* JADX INFO: renamed from: e */
        private String f14224e;

        /* JADX INFO: renamed from: a */
        private boolean f14220a = true;

        /* JADX INFO: renamed from: f */
        private long f14225f = -1;

        public C4002b(String str) {
            this.f14221b = str;
        }

        /* JADX INFO: renamed from: g */
        public RecorderInitConfig m19621g() {
            return new RecorderInitConfig(this, null);
        }

        /* JADX INFO: renamed from: h */
        public C4002b m19622h(int i) {
            this.f14225f = i * HuiYanResultSender.TIMEOUT_MS;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C4002b m19623i(String str) {
            this.f14224e = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C4002b m19624j(int i) {
            this.f14222c = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C4002b m19625k(String str) {
            this.f14223d = str;
            return this;
        }
    }

    private RecorderInitConfig(C4002b c4002b) {
        this.pullConfigInterval = -1L;
        this.appId = c4002b.f14221b;
        this.userVersionCode = c4002b.f14222c;
        this.userVersionName = c4002b.f14223d;
        this.uid = c4002b.f14224e;
        this.pullConfigInterval = c4002b.f14225f;
        this.isUseAR = c4002b.f14220a;
    }

    /* JADX INFO: renamed from: a */
    public String m19608a() {
        return this.appId;
    }

    /* JADX INFO: renamed from: b */
    public String m19609b() {
        return this.uid;
    }

    /* JADX INFO: renamed from: c */
    public int m19610c() {
        return this.userVersionCode;
    }

    /* JADX INFO: renamed from: d */
    public String m19611d() {
        return this.userVersionName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m19612e() {
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

    public /* synthetic */ RecorderInitConfig(C4002b c4002b, C4001a c4001a) {
        this(c4002b);
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
