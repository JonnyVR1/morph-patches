package p149l;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import com.p046p1.mobile.putong.core.data.Portrait;
import com.p046p1.mobile.putong.core.data.Square;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.commons.codec.language.p122bm.Languages;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bjv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f75941a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f75942b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PackageInfo f75943c;

    /* JADX INFO: renamed from: d */
    public final aiw0 f75944d;

    public bjv0(rmw0 rmw0Var, iyv0 iyv0Var, @Nullable PackageInfo packageInfo, aiw0 aiw0Var) {
        this.f75941a = rmw0Var;
        this.f75942b = iyv0Var;
        this.f75943c = packageInfo;
        this.f75944d = aiw0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ cjv0 m102231a(final bjv0 bjv0Var) {
        final ArrayList arrayList = bjv0Var.f75942b.f115497g;
        if (arrayList == null) {
            return new cjv0() { // from class: l.yiv0
                @Override // p149l.plv0
                /* JADX INFO: renamed from: a */
                public final void mo96132a(Object obj) {
                }
            };
        }
        return arrayList.isEmpty() ? new cjv0() { // from class: l.ziv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new cjv0() { // from class: l.ajv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                this.f70140a.m102232b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m102232b(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f75942b.f115498h);
        int i = this.f75942b.f115499i.zza;
        String str2 = Languages.ANY;
        if (i > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i2 = this.f75942b.f115499i.zzh;
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
        int i3 = this.f75942b.f115499i.zzc;
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
        bundle.putBoolean("native_multiple_images", this.f75942b.f115499i.zzd);
        bundle.putBoolean("use_custom_mute", this.f75942b.f115499i.zzg);
        zzbjb zzbjbVar = this.f75942b.f115499i;
        if (zzbjbVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbjbVar.zzj);
            bundle.putInt("sccg_dir", this.f75942b.f115499i.zzi);
        }
        PackageInfo packageInfo = this.f75943c;
        int i4 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i4 > this.f75944d.zza()) {
            this.f75944d.zzs();
            this.f75944d.zzv(i4);
        }
        JSONObject jSONObjectZzp = this.f75944d.zzp();
        String string = null;
        if (jSONObjectZzp != null && (jSONArrayOptJSONArray = jSONObjectZzp.optJSONArray(this.f75942b.f115496f)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = this.f75942b.f115501k;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbpp zzbppVar = this.f75942b.f115492b;
        if (zzbppVar != null) {
            if (TextUtils.isEmpty(zzbppVar.zzc)) {
                String str3 = "p";
                if (zzbppVar.zza >= 2) {
                    int i6 = zzbppVar.zzd;
                    if (i6 == 2 || i6 != 3) {
                        str3 = BLiveStormDanmakuGiftResourceType.f44444l;
                    }
                } else {
                    int i7 = zzbppVar.zzb;
                    if (i7 == 1) {
                        str3 = BLiveStormDanmakuGiftResourceType.f44444l;
                    } else if (i7 != 2) {
                        x2t0.m206866d("Instream ad video aspect ratio " + i7 + " is wrong.");
                        str3 = BLiveStormDanmakuGiftResourceType.f44444l;
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", zzbppVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f75942b.m139021a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132285jb)).booleanValue()) {
            if (this.f75942b.f115499i.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.f75942b.f115499i.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.f75942b.f115499i.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.f75942b.f115499i.zzf.zzb);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.f75942b.f115499i.zzb);
            bundle.putInt("preferred_ad_choices_position", this.f75942b.f115499i.zze);
        }
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 26;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f75941a.mo122102R(new Callable() { // from class: l.xiv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bjv0.m102231a(this.f193159a);
            }
        });
    }
}
