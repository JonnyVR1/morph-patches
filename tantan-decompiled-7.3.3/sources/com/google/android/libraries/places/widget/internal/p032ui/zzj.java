package com.google.android.libraries.places.widget.internal.p032ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.zzkd;

/* JADX INFO: loaded from: classes7.dex */
final class zzj implements TextWatcher {
    final /* synthetic */ AutocompleteImplFragment zza;

    public /* synthetic */ zzj(AutocompleteImplFragment autocompleteImplFragment, zzi zziVar) {
        this.zza = autocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            this.zza.zze.zzm(editable.toString(), this.zza.zzg.getSelectionEnd());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
