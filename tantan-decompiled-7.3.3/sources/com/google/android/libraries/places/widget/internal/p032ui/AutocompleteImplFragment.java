package com.google.android.libraries.places.widget.internal.p032ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0491t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.C2485R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdv;
import com.google.android.libraries.places.internal.zzkd;
import com.google.android.libraries.places.internal.zzkt;
import com.google.android.libraries.places.internal.zzkv;
import com.google.android.libraries.places.internal.zzkw;
import com.google.android.libraries.places.internal.zzkx;
import com.google.android.libraries.places.internal.zzlh;
import com.google.android.libraries.places.internal.zzll;
import com.google.android.libraries.places.internal.zzln;
import com.google.android.libraries.places.internal.zzlq;
import com.google.android.libraries.places.internal.zzlr;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import io.agora.rtc2.internal.AudioRoutingController;
import org.jetbrains.annotations.NotNull;
import p153l.cb50;
import p153l.cvb;
import p153l.j26;
import p153l.kkl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ValidFragment"})
public final class AutocompleteImplFragment extends Fragment {
    private final PlacesClient zza;
    private final zzkt zzb;
    private final zzlr zzc;
    private final zzdv zzd;
    private zzln zze;
    private PlaceSelectionListener zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzr zzs;
    private final zzj zzt;

    private AutocompleteImplFragment(@LayoutRes int i, PlacesClient placesClient, zzkt zzktVar, zzlr zzlrVar, zzdv zzdvVar) {
        super(i);
        this.zzt = new zzj(this, null);
        this.zza = placesClient;
        this.zzb = zzktVar;
        this.zzc = zzlrVar;
        this.zzd = zzdvVar;
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzlq zzlqVar = new zzlq(this.zzb.zzf(), this.zzb.zzh(), this.zzb.zzm(), this.zzd);
            zzln zzlnVar = (zzln) new C0491t(this, new zzll(new zzlh(this.zza, this.zzb, zzlqVar.zzh()), zzlqVar, this.zzc)).m3074a(zzln.class);
            this.zze = zzlnVar;
            zzlnVar.zze(bundle);
            requireActivity().getOnBackPressedDispatcher().m196a(this, new zzf(this, true));
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zze.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zze.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, @Nullable Bundle bundle) {
        int identifier;
        try {
            this.zzg = (EditText) view.findViewById(C2485R.id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(C2485R.id.places_autocomplete_list);
            this.zzi = view.findViewById(C2485R.id.places_autocomplete_back_button);
            this.zzj = view.findViewById(C2485R.id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(C2485R.id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(C2485R.id.places_autocomplete_progress);
            this.zzm = view.findViewById(C2485R.id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(C2485R.id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(C2485R.id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(C2485R.id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(C2485R.id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(C2485R.id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzl(null));
            this.zzg.setHint(TextUtils.isEmpty(this.zzb.zzl()) ? zzkw.zzc(requireContext(), C2485R.string.places_autocomplete_search_hint) : this.zzb.zzl());
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = this.zzb.zzh().ordinal();
            if (iOrdinal == 0) {
                int iZza = this.zzb.zza();
                int iZzb = this.zzb.zzb();
                if (Color.alpha(iZza) < 255) {
                    iZza = 0;
                }
                if (iZza != 0 && iZzb != 0) {
                    int iZza2 = zzkx.zza(iZza, j26.m143190c(requireContext(), C2485R.color.places_text_white_alpha_87), j26.m143190c(requireContext(), C2485R.color.places_text_black_alpha_87));
                    int iZza3 = zzkx.zza(iZza, j26.m143190c(requireContext(), C2485R.color.places_text_white_alpha_26), j26.m143190c(requireContext(), C2485R.color.places_text_black_alpha_26));
                    view.findViewById(C2485R.id.places_autocomplete_search_bar_container).setBackgroundColor(iZza);
                    Window window = requireActivity().getWindow();
                    if (zzkx.zzc(iZzb, -1, RoundedDrawable.DEFAULT_BORDER_COLOR)) {
                        window.setStatusBarColor(iZzb);
                        window.getDecorView().setSystemUiVisibility(8192);
                    } else {
                        window.setStatusBarColor(iZzb);
                    }
                    this.zzg.setTextColor(iZza2);
                    this.zzg.setHintTextColor(iZza3);
                    zzkx.zzb((ImageView) this.zzi, iZza2);
                    zzkx.zzb((ImageView) this.zzj, iZza2);
                }
            } else if (iOrdinal == 1 && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                requireActivity().getWindow().addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                kkl0.m150196z0(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
            }
            this.zzi.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzc(view2);
                }
            });
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzd(view2);
                }
            });
            this.zzr.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zze
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzf(view2);
                }
            });
            this.zzs = new zzr(new zzd(this));
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzo(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.addOnScrollListener(new zzg(this));
            this.zze.zza().m2984i(getViewLifecycleOwner(), new cb50() { // from class: com.google.android.libraries.places.widget.internal.ui.zza
                @Override // p153l.cb50
                public final void onChanged(Object obj) {
                    this.zza.zzg((zzkv) obj);
                }
            });
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze.zzj();
    }

    public final /* synthetic */ void zzd(View view) {
        try {
            this.zze.zzk();
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zze.zzf(autocompletePrediction, i);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zzf(View view) {
        try {
            this.zze.zzl(this.zzg.getText().toString(), this.zzg.getSelectionEnd());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zzg(zzkv zzkvVar) {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzkvVar.zzf() - 1) {
                case 0:
                    if (TextUtils.isEmpty(this.zzb.zzm())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzm());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzs.submitList(null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 2:
                    this.zzl.setVisibility(0);
                    return;
                case 3:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 4:
                    this.zzs.submitList(zzkvVar.zzd());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(C2485R.string.places_autocomplete_no_results_for_query, zzkvVar.zze()));
                    this.zzq.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    PlaceSelectionListener placeSelectionListener = this.zzf;
                    Place placeZzc = zzkvVar.zzc();
                    if (placeZzc == null) {
                        throw null;
                    }
                    placeSelectionListener.onPlaceSelected(placeZzc);
                    return;
                case 8:
                    AutocompletePrediction autocompletePredictionZzb = zzkvVar.zzb();
                    zzmt.zzc(autocompletePredictionZzb, "Prediction should not be null.");
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(autocompletePredictionZzb.getPrimaryText(null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzf;
                    Status statusZza = zzkvVar.zza();
                    if (statusZza == null) {
                        throw null;
                    }
                    placeSelectionListener2.onError(statusZza);
                    return;
            }
            this.zzs.submitList(null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(C2485R.string.places_search_error));
            this.zzq.setVisibility(0);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final void zzh(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }
}
