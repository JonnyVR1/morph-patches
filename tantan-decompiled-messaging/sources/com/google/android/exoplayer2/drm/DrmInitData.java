package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p149l.ar3;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C1852a();
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;

    @Nullable
    public final String schemeType;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public class C1852a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(Parcel parcel) {
        this.schemeType = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) vck0.m197866j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9895b(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static DrmInitData m9896d(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.m9903c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.m9903c() && !m9895b(arrayList, size, schemeData2.uuid)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = ar3.f71228a;
        if (uuid.equals(schemeData.uuid)) {
            return uuid.equals(schemeData2.uuid) ? 0 : 1;
        }
        return schemeData.uuid.compareTo(schemeData2.uuid);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public DrmInitData m9898c(@Nullable String str) {
        return vck0.m197845c(this.schemeType, str) ? this : new DrmInitData(str, false, this.schemeDatas);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public SchemeData m9899e(int i) {
        return this.schemeDatas[i];
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (vck0.m197845c(this.schemeType, drmInitData.schemeType) && Arrays.equals(this.schemeDatas, drmInitData.schemeDatas)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public DrmInitData m9900f(DrmInitData drmInitData) {
        String str;
        String str2 = this.schemeType;
        p11.m167013g(str2 == null || (str = drmInitData.schemeType) == null || TextUtils.equals(str2, str));
        String str3 = this.schemeType;
        if (str3 == null) {
            str3 = drmInitData.schemeType;
        }
        return new DrmInitData(str3, (SchemeData[]) vck0.m197814N0(this.schemeDatas, drmInitData.schemeDatas));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C1851a();

        @Nullable
        public final byte[] data;
        private int hashCode;

        @Nullable
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public class C1851a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            this.mimeType = (String) vck0.m197866j(parcel.readString());
            this.data = parcel.createByteArray();
        }

        /* JADX INFO: renamed from: a */
        public boolean m9901a(SchemeData schemeData) {
            return m9903c() && !schemeData.m9903c() && m9904d(schemeData.uuid);
        }

        @CheckResult
        /* JADX INFO: renamed from: b */
        public SchemeData m9902b(@Nullable byte[] bArr) {
            return new SchemeData(this.uuid, this.licenseServerUrl, this.mimeType, bArr);
        }

        /* JADX INFO: renamed from: c */
        public boolean m9903c() {
            return this.data != null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m9904d(UUID uuid) {
            return ar3.f71228a.equals(this.uuid) || uuid.equals(this.uuid);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return vck0.m197845c(this.licenseServerUrl, schemeData.licenseServerUrl) && vck0.m197845c(this.mimeType, schemeData.mimeType) && vck0.m197845c(this.uuid, schemeData.uuid) && Arrays.equals(this.data, schemeData.data);
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                int iHashCode = this.uuid.hashCode() * 31;
                String str = this.licenseServerUrl;
                this.hashCode = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.hashCode;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.uuid = (UUID) p11.m167011e(uuid);
            this.licenseServerUrl = str;
            this.mimeType = (String) p11.m167011e(str2);
            this.data = bArr;
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }
}
