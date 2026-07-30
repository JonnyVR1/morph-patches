package com.google.android.libraries.places.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.C2485R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzkd;
import com.google.android.libraries.places.internal.zzkt;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.widget.internal.p032ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes7.dex */
public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;

    @LayoutRes
    private int zza;

    @StyleRes
    private int zzb;
    private boolean zzc;

    public AutocompleteActivity() {
        super(C2485R.layout.places_autocomplete_activity);
        this.zzc = false;
    }

    private final void zzc(int i, @Nullable Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(@Nullable Bundle bundle) {
        try {
            zzmt.zzp(Places.isInitialized(), "Places must be initialized.");
            zzmt.zzp(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            zzkt zzktVar = (zzkt) getIntent().getParcelableExtra("places/AutocompleteOptions");
            if (zzktVar == null) {
                throw null;
            }
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = zzktVar.zzh().ordinal();
            if (iOrdinal == 0) {
                this.zza = C2485R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzb = C2485R.style.PlacesAutocompleteFullscreen;
            } else if (iOrdinal == 1) {
                this.zza = C2485R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzb = C2485R.style.PlacesAutocompleteOverlay;
            }
            getSupportFragmentManager().m2582q1(new com.google.android.libraries.places.widget.internal.p032ui.zzh(this.zza, this, zzktVar));
            setTheme(this.zzb);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().m2555h0(C2485R.id.places_autocomplete_content);
            zzmt.zzo(autocompleteImplFragment != null);
            autocompleteImplFragment.zzh(this);
            final View viewFindViewById = findViewById(R.id.content);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.zza.zzb(autocompleteImplFragment, viewFindViewById, view, motionEvent);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.zza.zza(view);
                }
            });
            if (zzktVar.zzj().isEmpty()) {
                zzc(2, null, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) {
        zzc(-1, place, Status.RESULT_SUCCESS);
    }

    public final /* synthetic */ void zza(View view) {
        if (this.zzc) {
            zzc(0, null, new Status(16));
        }
    }

    public final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzc = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 == null || motionEvent.getY() <= view3.getBottom()) {
            return false;
        }
        this.zzc = true;
        view.performClick();
        return true;
    }
}
