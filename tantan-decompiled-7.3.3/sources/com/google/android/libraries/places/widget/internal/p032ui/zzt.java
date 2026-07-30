package com.google.android.libraries.places.widget.internal.p032ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.C2485R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzkd;
import p153l.j26;

/* JADX INFO: loaded from: classes7.dex */
public final class zzt extends RecyclerView.AbstractC0569e0 {
    private final TextView zza;
    private final TextView zzb;
    private AutocompletePrediction zzc;
    private boolean zzd;

    public zzt(final zzd zzdVar, View view) {
        super(view);
        this.zza = (TextView) view.findViewById(C2485R.id.places_autocomplete_prediction_primary_text);
        this.zzb = (TextView) view.findViewById(C2485R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.zza.zzc(zzdVar, view2);
            }
        });
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzc = autocompletePrediction;
        this.zzd = z;
        this.zza.setText(autocompletePrediction.getPrimaryText(new ForegroundColorSpan(j26.m143190c(this.itemView.getContext(), C2485R.color.places_autocomplete_prediction_primary_text_highlight))));
        TextView textView = this.zzb;
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        textView.setText(secondaryText);
        int length = secondaryText.length();
        TextView textView2 = this.zzb;
        if (length == 0) {
            textView2.setVisibility(8);
            this.zza.setGravity(16);
        } else {
            textView2.setVisibility(0);
            this.zza.setGravity(80);
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ void zzc(zzd zzdVar, View view) {
        AutocompletePrediction autocompletePrediction = this.zzc;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzdVar.zza.zze(autocompletePrediction, getAdapterPosition());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }
}
