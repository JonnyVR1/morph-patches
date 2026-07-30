package com.google.android.libraries.places.widget.internal.p031ui;

import p149l.cd50;

/* JADX INFO: loaded from: classes7.dex */
final class zzf extends cd50 {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    @Override // p149l.cd50
    public final void handleOnBackPressed() {
        this.zza.zze.zzj();
    }
}
