package com.google.android.libraries.places.widget.internal.p032ui;

import p153l.jl50;

/* JADX INFO: loaded from: classes7.dex */
final class zzf extends jl50 {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    @Override // p153l.jl50
    public final void handleOnBackPressed() {
        this.zza.zze.zzj();
    }
}
