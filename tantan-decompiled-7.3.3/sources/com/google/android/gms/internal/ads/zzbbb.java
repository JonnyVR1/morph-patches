package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p153l.dct0;
import p153l.sbs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
public final class zzbbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbb> CREATOR = new sbs0();

    @Nullable
    @SafeParcelable.Field(m12517id = 2)
    public final String zza;

    @SafeParcelable.Field(m12517id = 3)
    public final long zzb;

    @SafeParcelable.Field(m12517id = 4)
    public final String zzc;

    @SafeParcelable.Field(m12517id = 5)
    public final String zzd;

    @SafeParcelable.Field(m12517id = 6)
    public final String zze;

    @SafeParcelable.Field(m12517id = 7)
    public final Bundle zzf;

    @SafeParcelable.Field(m12517id = 8)
    public final boolean zzg;

    @SafeParcelable.Field(m12517id = 9)
    public long zzh;

    @SafeParcelable.Field(m12517id = 10)
    public String zzi;

    @SafeParcelable.Field(m12517id = 11)
    public int zzj;

    @SafeParcelable.Constructor
    public zzbbb(@Nullable @SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) long j, @SafeParcelable.Param(m12518id = 4) String str2, @SafeParcelable.Param(m12518id = 5) String str3, @SafeParcelable.Param(m12518id = 6) String str4, @SafeParcelable.Param(m12518id = 7) Bundle bundle, @SafeParcelable.Param(m12518id = 8) boolean z, @SafeParcelable.Param(m12518id = 9) long j2, @SafeParcelable.Param(m12518id = 10) String str5, @SafeParcelable.Param(m12518id = 11) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z;
        this.zzh = j2;
        this.zzi = str5;
        this.zzj = i;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static zzbbb m13600g(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                dct0.m115298g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbbb(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            dct0.m115299h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            dct0.m115299h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
