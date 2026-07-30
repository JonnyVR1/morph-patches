package p153l;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import com.p051p1.mobile.putong.core.data.Portrait;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.commons.codec.language.p126bm.Languages;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hsv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f111482a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f111483b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PackageInfo f111484c;

    /* JADX INFO: renamed from: d */
    public final grw0 f111485d;

    public hsv0(xvw0 xvw0Var, o7w0 o7w0Var, @Nullable PackageInfo packageInfo, grw0 grw0Var) {
        this.f111482a = xvw0Var;
        this.f111483b = o7w0Var;
        this.f111484c = packageInfo;
        this.f111485d = grw0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ isv0 m137039a(final hsv0 hsv0Var) {
        final ArrayList arrayList = hsv0Var.f111483b.f145321g;
        if (arrayList == null) {
            return new isv0() { // from class: l.esv0
                @Override // p153l.vuv0
                /* JADX INFO: renamed from: a */
                public final void mo99378a(Object obj) {
                }
            };
        }
        return arrayList.isEmpty() ? new isv0() { // from class: l.fsv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new isv0() { // from class: l.gsv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                this.f106330a.m137040b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m137040b(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f111483b.f145322h);
        int i = this.f111483b.f145323i.zza;
        String str2 = Languages.ANY;
        if (i > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i2 = this.f111483b.f145323i.zzh;
            if (i2 == 1) {
                str = Languages.ANY;
            } else if (i2 == 2) {
                str = "landscape";
            } else if (i2 != 3) {
                str = i2 != 4 ? "unknown" : Square.TYPE;
            } else {
                str = Portrait.TYPE;
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_media_orientation", str);
            }
        }
        int i3 = this.f111483b.f145323i.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                str2 = i3 != 2 ? "unknown" : "landscape";
            } else {
                str2 = Portrait.TYPE;
            }
        }
        if (!"unknown".equals(str2)) {
            bundle.putString("native_image_orientation", str2);
        }
        bundle.putBoolean("native_multiple_images", this.f111483b.f145323i.zzd);
        bundle.putBoolean("use_custom_mute", this.f111483b.f145323i.zzg);
        zzbjb zzbjbVar = this.f111483b.f145323i;
        if (zzbjbVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbjbVar.zzj);
            bundle.putInt("sccg_dir", this.f111483b.f145323i.zzi);
        }
        PackageInfo packageInfo = this.f111484c;
        int i4 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i4 > this.f111485d.zza()) {
            this.f111485d.zzs();
            this.f111485d.zzv(i4);
        }
        JSONObject jSONObjectZzp = this.f111485d.zzp();
        String string = null;
        if (jSONObjectZzp != null && (jSONArrayOptJSONArray = jSONObjectZzp.optJSONArray(this.f111483b.f145320f)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = this.f111483b.f145325k;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbpp zzbppVar = this.f111483b.f145316b;
        if (zzbppVar != null) {
            if (TextUtils.isEmpty(zzbppVar.zzc)) {
                String str3 = "p";
                if (zzbppVar.zza >= 2) {
                    int i6 = zzbppVar.zzd;
                    if (i6 == 2 || i6 != 3) {
                        str3 = BLiveStormDanmakuGiftResourceType.f45292l;
                    }
                } else {
                    int i7 = zzbppVar.zzb;
                    if (i7 == 1) {
                        str3 = BLiveStormDanmakuGiftResourceType.f45292l;
                    } else if (i7 != 2) {
                        dct0.m115295d("Instream ad video aspect ratio " + i7 + " is wrong.");
                        str3 = BLiveStormDanmakuGiftResourceType.f45292l;
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", zzbppVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f111483b.m166385a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168356jb)).booleanValue()) {
            if (this.f111483b.f145323i.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.f111483b.f145323i.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.f111483b.f145323i.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.f111483b.f145323i.zzf.zzb);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.f111483b.f145323i.zzb);
            bundle.putInt("preferred_ad_choices_position", this.f111483b.f145323i.zze);
        }
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 26;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f111482a.mo155969R(new Callable() { // from class: l.dsv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hsv0.m137039a(this.f90523a);
            }
        });
    }
}
