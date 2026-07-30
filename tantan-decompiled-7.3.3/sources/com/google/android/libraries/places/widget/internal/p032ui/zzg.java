package com.google.android.libraries.places.widget.internal.p032ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzkd;

/* JADX INFO: loaded from: classes7.dex */
final class zzg extends RecyclerView.AbstractC0584t {
    final /* synthetic */ AutocompleteImplFragment zza;

    public zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
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
