package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class vnv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final zzq f184919a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f184920b;

    /* JADX INFO: renamed from: c */
    public final boolean f184921c;

    /* JADX INFO: renamed from: d */
    public final String f184922d;

    /* JADX INFO: renamed from: e */
    public final float f184923e;

    /* JADX INFO: renamed from: f */
    public final int f184924f;

    /* JADX INFO: renamed from: g */
    public final int f184925g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f184926h;

    /* JADX INFO: renamed from: i */
    public final boolean f184927i;

    public vnv0(zzq zzqVar, @Nullable String str, boolean z, String str2, float f, int i, int i2, @Nullable String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.f184919a = zzqVar;
        this.f184920b = str;
        this.f184921c = z;
        this.f184922d = str2;
        this.f184923e = f;
        this.f184924f = i;
        this.f184925g = i2;
        this.f184926h = str3;
        this.f184927i = z2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        b8w0.m103043f(bundle, "smart_w", "full", this.f184919a.zze == -1);
        b8w0.m103043f(bundle, "smart_h", "auto", this.f184919a.zzb == -2);
        b8w0.m103044g(bundle, "ene", true, this.f184919a.zzj);
        b8w0.m103043f(bundle, "rafmt", "102", this.f184919a.zzm);
        b8w0.m103043f(bundle, "rafmt", "103", this.f184919a.zzn);
        b8w0.m103043f(bundle, "rafmt", "105", this.f184919a.zzo);
        b8w0.m103044g(bundle, "inline_adaptive_slot", true, this.f184927i);
        b8w0.m103044g(bundle, "interscroller_slot", true, this.f184919a.zzo);
        b8w0.m103040c(bundle, "format", this.f184920b);
        b8w0.m103043f(bundle, "fluid", "height", this.f184921c);
        b8w0.m103043f(bundle, "sz", this.f184922d, !TextUtils.isEmpty(this.f184922d));
        bundle.putFloat("u_sd", this.f184923e);
        bundle.putInt("sw", this.f184924f);
        bundle.putInt("sh", this.f184925g);
        b8w0.m103043f(bundle, Constants.INAPP_NOTIF_SHOW_CLOSE, this.f184926h, !TextUtils.isEmpty(this.f184926h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.f184919a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f184919a.zzb);
            bundle2.putInt("width", this.f184919a.zze);
            bundle2.putBoolean("is_fluid_height", this.f184919a.zzi);
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
