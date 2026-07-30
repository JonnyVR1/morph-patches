package com.google.android.libraries.places.widget.internal.p031ui;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.C0601g;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzkd;

/* JADX INFO: loaded from: classes7.dex */
final class zzq extends C0601g.f {
    public /* synthetic */ zzq(zzp zzpVar) {
    }

    public static final boolean zza(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.getPlaceId().equals(autocompletePrediction2.getPlaceId());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C0601g.f
    @SuppressLint({"DiffUtilEquals"})
    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        return ((AutocompletePrediction) obj).equals((AutocompletePrediction) obj2);
    }

    @Override // androidx.recyclerview.widget.C0601g.f
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return zza((AutocompletePrediction) obj, (AutocompletePrediction) obj2);
    }

    private zzq() {
        throw null;
    }
}
