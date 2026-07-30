package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.C2485R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzkd;
import com.google.android.libraries.places.internal.zzkr;
import com.google.android.libraries.places.internal.zzks;
import com.google.android.libraries.places.internal.zzkt;
import com.google.android.libraries.places.internal.zzkw;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.p051p1.mobile.putong.core.data.Options;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.cb50;
import p153l.cvb;
import p153l.s120;

/* JADX INFO: loaded from: classes7.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final s120 zza;
    private final s120 zzb;
    private zzks zzc;

    @Nullable
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(C2485R.layout.places_autocomplete_fragment);
        this.zza = new s120();
        this.zzb = new s120();
        this.zzc = zzkt.zzo(AutocompleteActivityMode.OVERLAY, zznx.zzl(), zzkr.FRAGMENT);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    public static /* synthetic */ void zzd(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    private final void zze() {
        Intent intentBuild = new Autocomplete.IntentBuilder(this.zzc.zzn()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(intentBuild, 30421);
        }
    }

    private final void zzf(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.m2981f()) ? 0 : 8);
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    Log.isLoggable("Places", 5);
                    return;
                }
                if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Intent data was null.");
                    }
                } else {
                    if (i2 != -1) {
                        placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                        return;
                    }
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                }
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzkt zzktVar = (zzkt) bundle.getParcelable(Options.TYPE);
                if (zzktVar == null) {
                    return;
                }
                if (this.zza.m2981f() == 0) {
                    this.zza.mo2988m(zzktVar.zzm());
                }
                if (this.zzb.m2981f() == 0) {
                    this.zzb.mo2988m(zzktVar.zzl());
                }
                this.zzc = zzktVar.zzg();
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable(Options.TYPE, this.zzc.zzn());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@RecentlyNonNull View view, @Nullable Bundle bundle) {
        final View viewFindViewById = view.findViewById(C2485R.id.places_autocomplete_search_button);
        final View viewFindViewById2 = view.findViewById(C2485R.id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(C2485R.id.places_autocomplete_search_input);
        editText.setHint(zzkw.zzc(requireContext(), C2485R.string.places_autocomplete_search_hint));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.zza.zza(view2);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.zza.zzb(view2);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.zza.setText(null);
            }
        });
        zzf(viewFindViewById2);
        this.zza.m2984i(getViewLifecycleOwner(), new cb50() { // from class: com.google.android.libraries.places.widget.zzh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.zza.zzc(editText, viewFindViewById2, (CharSequence) obj);
            }
        });
        this.zzb.m2984i(getViewLifecycleOwner(), new cb50() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.zzd(editText, viewFindViewById, (CharSequence) obj);
            }
        });
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzf(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zza(zznx.zzk(strArr));
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setCountry(@Nullable String str) {
        this.zzc.zzo(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(@Nullable CharSequence charSequence) {
        try {
            if (charSequence != null) {
                this.zzc.zzb(charSequence.toString());
                this.zzb.mo2988m(charSequence);
                return this;
            }
            String string = getString(C2485R.string.places_autocomplete_search_hint);
            this.zzc.zzb(string);
            this.zzb.mo2988m(string);
            return this;
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(@Nullable LocationBias locationBias) {
        this.zzc.zzd(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(@Nullable LocationRestriction locationRestriction) {
        this.zzc.zze(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(@Nullable PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzh(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setRegionCode(@Nullable String str) {
        this.zzc.zzk(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(@Nullable CharSequence charSequence) {
        try {
            this.zzc.zzc(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.mo2988m(charSequence);
            return this;
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setTypeFilter(@Nullable TypeFilter typeFilter) {
        this.zzc.zzl(typeFilter);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypesFilter(@RecentlyNonNull List<String> list) {
        this.zzc.zzm(list);
        return this;
    }

    public final /* synthetic */ void zza(View view) {
        zze();
    }

    public final /* synthetic */ void zzb(View view) {
        zze();
    }

    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzf(view);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zza(list);
        return this;
    }
}
