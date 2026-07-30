package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pev0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final zzq f148488a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f148489b;

    /* JADX INFO: renamed from: c */
    public final boolean f148490c;

    /* JADX INFO: renamed from: d */
    public final String f148491d;

    /* JADX INFO: renamed from: e */
    public final float f148492e;

    /* JADX INFO: renamed from: f */
    public final int f148493f;

    /* JADX INFO: renamed from: g */
    public final int f148494g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f148495h;

    /* JADX INFO: renamed from: i */
    public final boolean f148496i;

    public pev0(zzq zzqVar, @Nullable String str, boolean z, String str2, float f, int i, int i2, @Nullable String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.f148488a = zzqVar;
        this.f148489b = str;
        this.f148490c = z;
        this.f148491d = str2;
        this.f148492e = f;
        this.f148493f = i;
        this.f148494g = i2;
        this.f148495h = str3;
        this.f148496i = z2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        vyv0.m200679f(bundle, "smart_w", "full", this.f148488a.zze == -1);
        vyv0.m200679f(bundle, "smart_h", "auto", this.f148488a.zzb == -2);
        vyv0.m200680g(bundle, "ene", true, this.f148488a.zzj);
        vyv0.m200679f(bundle, "rafmt", "102", this.f148488a.zzm);
        vyv0.m200679f(bundle, "rafmt", "103", this.f148488a.zzn);
        vyv0.m200679f(bundle, "rafmt", "105", this.f148488a.zzo);
        vyv0.m200680g(bundle, "inline_adaptive_slot", true, this.f148496i);
        vyv0.m200680g(bundle, "interscroller_slot", true, this.f148488a.zzo);
        vyv0.m200676c(bundle, "format", this.f148489b);
        vyv0.m200679f(bundle, "fluid", "height", this.f148490c);
        vyv0.m200679f(bundle, "sz", this.f148491d, !TextUtils.isEmpty(this.f148491d));
        bundle.putFloat("u_sd", this.f148492e);
        bundle.putInt("sw", this.f148493f);
        bundle.putInt("sh", this.f148494g);
        vyv0.m200679f(bundle, Constants.INAPP_NOTIF_SHOW_CLOSE, this.f148495h, !TextUtils.isEmpty(this.f148495h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.f148488a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f148488a.zzb);
            bundle2.putInt("width", this.f148488a.zze);
            bundle2.putBoolean("is_fluid_height", this.f148488a.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
