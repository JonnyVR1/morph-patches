package com.google.android.libraries.places.widget.internal.p031ui;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.C0421e;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdv;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzka;
import com.google.android.libraries.places.internal.zzkb;
import com.google.android.libraries.places.internal.zzkf;
import com.google.android.libraries.places.internal.zzkt;
import com.google.android.libraries.places.internal.zzlr;
import com.google.android.libraries.places.internal.zzls;

/* JADX INFO: loaded from: classes7.dex */
public final class zzh extends C0421e {
    private final int zza;
    private final PlacesClient zzb;
    private final zzkt zzc;
    private final zzlr zzd;
    private final zzdv zze;

    public zzh(@LayoutRes int i, Context context, zzkt zzktVar) {
        this.zza = i;
        Context applicationContext = context.getApplicationContext();
        zzka zzkaVarZzd = zzkb.zzd(applicationContext);
        zzkaVarZzd.zzd(2);
        zzkb zzkbVarZze = zzkaVarZzd.zze();
        zzkf zzkfVar = new zzkf(applicationContext);
        this.zzb = Places.zza(applicationContext, zzkbVarZze);
        this.zzc = zzktVar;
        this.zzd = new zzls(zzkfVar, zzkbVarZze);
        this.zze = new zzdy();
    }

    @Override // androidx.fragment.app.C0421e
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        return C0421e.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze) : super.instantiate(classLoader, str);
    }
}
