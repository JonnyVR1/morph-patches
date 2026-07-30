package com.google.android.libraries.places.widget.internal.p031ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzkd;

/* JADX INFO: loaded from: classes7.dex */
final class zzg extends RecyclerView.AbstractC0582t {
    final /* synthetic */ AutocompleteImplFragment zza;

    public zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                this.zza.zze.zzg();
                this.zza.zzg.clearFocus();
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        }
    }
}
