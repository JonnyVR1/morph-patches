package com.google.android.libraries.places.api.model;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzw extends Place.Builder {
    private List zzA;
    private Place.BooleanPlaceAttributeValue zzB;
    private Place.BooleanPlaceAttributeValue zzC;
    private Place.BooleanPlaceAttributeValue zzD;
    private Place.BooleanPlaceAttributeValue zzE;
    private Place.BooleanPlaceAttributeValue zzF;
    private Place.BooleanPlaceAttributeValue zzG;
    private Place.BooleanPlaceAttributeValue zzH;
    private Place.BooleanPlaceAttributeValue zzI;
    private List zzJ;
    private Integer zzK;
    private Integer zzL;
    private LatLngBounds zzM;
    private Uri zzN;
    private Place.BooleanPlaceAttributeValue zzO;
    private String zza;
    private AddressComponents zzb;
    private List zzc;
    private Place.BusinessStatus zzd;
    private Place.BooleanPlaceAttributeValue zze;
    private OpeningHours zzf;
    private Place.BooleanPlaceAttributeValue zzg;
    private Place.BooleanPlaceAttributeValue zzh;
    private String zzi;
    private String zzj;
    private Integer zzk;
    private String zzl;
    private String zzm;
    private LatLng zzn;
    private String zzo;
    private String zzp;
    private OpeningHours zzq;
    private String zzr;
    private List zzs;
    private List zzt;
    private List zzu;
    private PlusCode zzv;
    private Integer zzw;
    private String zzx;
    private Double zzy;
    private Place.BooleanPlaceAttributeValue zzz;

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final AddressComponents getAddressComponents() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<String> getAttributions() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Place.BusinessStatus getBusinessStatus() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zze;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"curbsidePickup\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final OpeningHours getCurrentOpeningHours() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDelivery() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzg;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"delivery\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDineIn() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzh;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"dineIn\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getEditorialSummary() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getEditorialSummaryLanguageCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Integer getIconBackgroundColor() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getIconUrl() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getId() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final LatLng getLatLng() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getName() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getNameLanguageCode() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final OpeningHours getOpeningHours() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getPhoneNumber() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<String> getPlaceTypes() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final PlusCode getPlusCode() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Integer getPriceLevel() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final String getPrimaryType() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Double getRating() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getReservable() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzz;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"reservable\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<Review> getReviews() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBeer() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzB;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesBeer\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBreakfast() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzC;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesBreakfast\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBrunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzD;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesBrunch\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesDinner() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzE;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesDinner\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesLunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzF;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesLunch\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzG;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesVegetarianFood\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesWine() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzH;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"servesWine\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getTakeout() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzI;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"takeout\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final List<Place.Type> getTypes() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Integer getUserRatingsTotal() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Integer getUtcOffsetMinutes() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final LatLngBounds getViewport() {
        return this.zzM;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    @Nullable
    public final Uri getWebsiteUri() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzO;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        wtq0.m207906a("Property \"wheelchairAccessibleEntrance\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddress(@Nullable String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddressComponents(@Nullable AddressComponents addressComponents) {
        this.zzb = addressComponents;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAttributions(@Nullable List<String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setBusinessStatus(@Nullable Place.BusinessStatus businessStatus) {
        this.zzd = businessStatus;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurbsidePickup(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zze = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null curbsidePickup");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurrentOpeningHours(@Nullable OpeningHours openingHours) {
        this.zzf = openingHours;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDelivery(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzg = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null delivery");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDineIn(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzh = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null dineIn");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummary(@Nullable String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummaryLanguageCode(@Nullable String str) {
        this.zzj = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconBackgroundColor(@Nullable Integer num) {
        this.zzk = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconUrl(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setId(@Nullable String str) {
        this.zzm = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLatLng(@Nullable LatLng latLng) {
        this.zzn = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setName(@Nullable String str) {
        this.zzo = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setNameLanguageCode(@Nullable String str) {
        this.zzp = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOpeningHours(@Nullable OpeningHours openingHours) {
        this.zzq = openingHours;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhoneNumber(@Nullable String str) {
        this.zzr = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhotoMetadatas(@Nullable List<PhotoMetadata> list) {
        this.zzs = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlaceTypes(@Nullable List<String> list) {
        this.zzu = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlusCode(@Nullable PlusCode plusCode) {
        this.zzv = plusCode;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPriceLevel(@Nullable Integer num) {
        this.zzw = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryType(@Nullable String str) {
        this.zzx = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRating(@Nullable Double d) {
        this.zzy = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReservable(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzz = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null reservable");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReviews(@Nullable List<Review> list) {
        this.zzt = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setSecondaryOpeningHours(@Nullable List<OpeningHours> list) {
        this.zzA = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBeer(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzB = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesBeer");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBreakfast(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzC = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesBreakfast");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBrunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzD = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesBrunch");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesDinner(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzE = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesDinner");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesLunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzF = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesLunch");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesVegetarianFood(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzG = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesVegetarianFood");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesWine(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzH = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null servesWine");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTakeout(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzI = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null takeout");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTypes(@Nullable List<Place.Type> list) {
        this.zzJ = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingsTotal(@Nullable Integer num) {
        this.zzK = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUtcOffsetMinutes(@Nullable Integer num) {
        this.zzL = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setViewport(@Nullable LatLngBounds latLngBounds) {
        this.zzM = latLngBounds;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWebsiteUri(@Nullable Uri uri) {
        this.zzN = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzO = booleanPlaceAttributeValue;
            return this;
        }
        mnd0.m159157a("Null wheelchairAccessibleEntrance");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place zza() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zze;
        if (booleanPlaceAttributeValue13 != null && (booleanPlaceAttributeValue = this.zzg) != null && (booleanPlaceAttributeValue2 = this.zzh) != null && (booleanPlaceAttributeValue3 = this.zzz) != null && (booleanPlaceAttributeValue4 = this.zzB) != null && (booleanPlaceAttributeValue5 = this.zzC) != null && (booleanPlaceAttributeValue6 = this.zzD) != null && (booleanPlaceAttributeValue7 = this.zzE) != null && (booleanPlaceAttributeValue8 = this.zzF) != null && (booleanPlaceAttributeValue9 = this.zzG) != null && (booleanPlaceAttributeValue10 = this.zzH) != null && (booleanPlaceAttributeValue11 = this.zzI) != null && (booleanPlaceAttributeValue12 = this.zzO) != null) {
            return new zzbk(this.zza, this.zzb, this.zzc, this.zzd, booleanPlaceAttributeValue13, this.zzf, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, booleanPlaceAttributeValue3, this.zzA, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, this.zzJ, this.zzK, this.zzL, this.zzM, this.zzN, booleanPlaceAttributeValue12);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zze == null) {
            sb.append(" curbsidePickup");
        }
        if (this.zzg == null) {
            sb.append(" delivery");
        }
        if (this.zzh == null) {
            sb.append(" dineIn");
        }
        if (this.zzz == null) {
            sb.append(" reservable");
        }
        if (this.zzB == null) {
            sb.append(" servesBeer");
        }
        if (this.zzC == null) {
            sb.append(" servesBreakfast");
        }
        if (this.zzD == null) {
            sb.append(" servesBrunch");
        }
        if (this.zzE == null) {
            sb.append(" servesDinner");
        }
        if (this.zzF == null) {
            sb.append(" servesLunch");
        }
        if (this.zzG == null) {
            sb.append(" servesVegetarianFood");
        }
        if (this.zzH == null) {
            sb.append(" servesWine");
        }
        if (this.zzI == null) {
            sb.append(" takeout");
        }
        if (this.zzO == null) {
            sb.append(" wheelchairAccessibleEntrance");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
