package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import p153l.k6s0;
import p153l.l9s0;
import p153l.obt0;
import p153l.w70;
import p153l.wsy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new wsy0();

    @SafeParcelable.Field(m12517id = 2)
    public final String zza;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzb;

    @SafeParcelable.Field(m12517id = 4)
    public final int zzc;

    @SafeParcelable.Field(m12517id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(m12517id = 6)
    public final int zze;

    @SafeParcelable.Field(m12517id = 7)
    public final int zzf;

    @SafeParcelable.Field(m12517id = 8)
    public final zzq[] zzg;

    @SafeParcelable.Field(m12517id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(m12517id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(m12517id = 11)
    public boolean zzj;

    @SafeParcelable.Field(m12517id = 12)
    public boolean zzk;

    @SafeParcelable.Field(m12517id = 13)
    public boolean zzl;

    @SafeParcelable.Field(m12517id = 14)
    public boolean zzm;

    @SafeParcelable.Field(m12517id = 15)
    public boolean zzn;

    @SafeParcelable.Field(m12517id = 16)
    public boolean zzo;

    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    public zzq(Context context, w70[] w70VarArr) {
        int iM205213a;
        int i;
        String str;
        int dimensionPixelSize;
        w70 w70Var = w70VarArr[0];
        this.zzd = false;
        boolean zM205217f = w70Var.m205217f();
        this.zzi = zM205217f;
        this.zzm = l9s0.m153451f(w70Var);
        this.zzn = l9s0.m153452g(w70Var);
        boolean zM153453h = l9s0.m153453h(w70Var);
        this.zzo = zM153453h;
        if (zM205217f) {
            w70 w70Var2 = w70.f187681i;
            this.zze = w70Var2.m205215d();
            iM205213a = w70Var2.m205213a();
            this.zzb = iM205213a;
        } else if (this.zzn) {
            this.zze = w70Var.m205215d();
            iM205213a = l9s0.m153446a(w70Var);
            this.zzb = iM205213a;
        } else if (zM153453h) {
            this.zze = w70Var.m205215d();
            iM205213a = l9s0.m153447b(w70Var);
            this.zzb = iM205213a;
        } else {
            this.zze = w70Var.m205215d();
            iM205213a = w70Var.m205213a();
            this.zzb = iM205213a;
        }
        boolean z = this.zze == -1;
        boolean z2 = iM205213a == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            k6s0.m148569b();
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    k6s0.m148569b();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i2 = displayMetrics3.heightPixels;
                        int i3 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i4 = displayMetrics3.heightPixels;
                        int i5 = displayMetrics3.widthPixels;
                        if (i4 == i2 && i5 == i3) {
                            int i6 = displayMetrics.widthPixels;
                            k6s0.m148569b();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i6 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.zze;
            k6s0.m148569b();
            this.zzf = obt0.m167041r(displayMetrics, this.zze);
        }
        int iM12311h0 = z2 ? m12311h0(displayMetrics) : this.zzb;
        k6s0.m148569b();
        this.zzc = obt0.m167041r(displayMetrics, iM12311h0);
        if (z || z2) {
            this.zza = i + BaseSei.f14624X + iM12311h0 + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + BaseSei.f14624X + this.zzb + "_as";
            } else if (zM205217f) {
                str = "320x50_mb";
            } else {
                this.zza = w70Var.toString();
            }
            this.zza = str;
        }
        int length = w70VarArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i7 = 0; i7 < w70VarArr.length; i7++) {
                this.zzg[i7] = new zzq(context, w70VarArr[i7]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    /* JADX INFO: renamed from: F */
    public static zzq m12306F() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    /* JADX INFO: renamed from: H */
    public static zzq m12307H() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: I */
    public static zzq m12308I() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: J */
    public static zzq m12309J() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    /* JADX INFO: renamed from: g */
    public static int m12310g(DisplayMetrics displayMetrics) {
        return (int) (m12311h0(displayMetrics) * displayMetrics.density);
    }

    /* JADX INFO: renamed from: h0 */
    public static int m12311h0(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzq(Context context, w70 w70Var) {
        this(context, new w70[]{w70Var});
    }

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) int i, @SafeParcelable.Param(m12518id = 4) int i2, @SafeParcelable.Param(m12518id = 5) boolean z, @SafeParcelable.Param(m12518id = 6) int i3, @SafeParcelable.Param(m12518id = 7) int i4, @SafeParcelable.Param(m12518id = 8) zzq[] zzqVarArr, @SafeParcelable.Param(m12518id = 9) boolean z2, @SafeParcelable.Param(m12518id = 10) boolean z3, @SafeParcelable.Param(m12518id = 11) boolean z4, @SafeParcelable.Param(m12518id = 12) boolean z5, @SafeParcelable.Param(m12518id = 13) boolean z6, @SafeParcelable.Param(m12518id = 14) boolean z7, @SafeParcelable.Param(m12518id = 15) boolean z8, @SafeParcelable.Param(m12518id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
