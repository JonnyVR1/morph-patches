package com.google.android.libraries.places.widget.internal.p031ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0610p;
import com.google.android.libraries.places.C2462R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzkd;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzr extends AbstractC0610p {
    private int zza;
    private boolean zzb;
    private final zzd zzc;

    public zzr(zzd zzdVar) {
        super(new zzq(null));
        this.zzb = true;
        this.zzc = zzdVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC0610p
    public final void submitList(@Nullable List list) {
        try {
            int size = 0;
            this.zzb = (this.zza != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                size = list.size();
            }
            this.zza = size;
            super.submitList(list);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzt onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            return new zzt(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(C2462R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzt zztVar, int i) {
        try {
            zztVar.zza((AutocompletePrediction) getItem(i), this.zzb);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }
}
