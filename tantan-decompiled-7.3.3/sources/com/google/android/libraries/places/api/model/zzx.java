package com.google.android.libraries.places.api.model;

import android.net.Uri;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzx extends Place {

    @Nullable
    private final List zzA;
    private final Place.BooleanPlaceAttributeValue zzB;
    private final Place.BooleanPlaceAttributeValue zzC;
    private final Place.BooleanPlaceAttributeValue zzD;
    private final Place.BooleanPlaceAttributeValue zzE;
    private final Place.BooleanPlaceAttributeValue zzF;
    private final Place.BooleanPlaceAttributeValue zzG;
    private final Place.BooleanPlaceAttributeValue zzH;
    private final Place.BooleanPlaceAttributeValue zzI;

    @Nullable
    private final List zzJ;

    @Nullable
    private final Integer zzK;

    @Nullable
    private final Integer zzL;

    @Nullable
    private final LatLngBounds zzM;

    @Nullable
    private final Uri zzN;
    private final Place.BooleanPlaceAttributeValue zzO;

    @Nullable
    private final String zza;

    @Nullable
    private final AddressComponents zzb;

    @Nullable
    private final List zzc;

    @Nullable
    private final Place.BusinessStatus zzd;
    private final Place.BooleanPlaceAttributeValue zze;

    @Nullable
    private final OpeningHours zzf;
    private final Place.BooleanPlaceAttributeValue zzg;
    private final Place.BooleanPlaceAttributeValue zzh;

    @Nullable
    private final String zzi;

    @Nullable
    private final String zzj;

    @Nullable
    private final Integer zzk;

    @Nullable
    private final String zzl;

    @Nullable
    private final String zzm;

    @Nullable
    private final LatLng zzn;

    @Nullable
    private final String zzo;

    @Nullable
    private final String zzp;

    @Nullable
    private final OpeningHours zzq;

    @Nullable
    private final String zzr;

    @Nullable
    private final List zzs;

    @Nullable
    private final List zzt;

    @Nullable
    private final List zzu;

    @Nullable
    private final PlusCode zzv;

    @Nullable
    private final Integer zzw;

    @Nullable
    private final String zzx;

    @Nullable
    private final Double zzy;
    private final Place.BooleanPlaceAttributeValue zzz;

    public zzx(@Nullable String str, @Nullable AddressComponents addressComponents, @Nullable List list, @Nullable Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, @Nullable OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable LatLng latLng, @Nullable String str6, @Nullable String str7, @Nullable OpeningHours openingHours2, @Nullable String str8, @Nullable List list2, @Nullable List list3, @Nullable List list4, @Nullable PlusCode plusCode, @Nullable Integer num2, @Nullable String str9, @Nullable Double d, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, @Nullable List list5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, @Nullable List list6, @Nullable Integer num3, @Nullable Integer num4, @Nullable LatLngBounds latLngBounds, @Nullable Uri uri, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13) {
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = list;
        this.zzd = businessStatus;
        if (booleanPlaceAttributeValue == null) {
            mnd0.m159157a("Null curbsidePickup");
            throw null;
        }
        this.zze = booleanPlaceAttributeValue;
        this.zzf = openingHours;
        if (booleanPlaceAttributeValue2 == null) {
            mnd0.m159157a("Null delivery");
            throw null;
        }
        this.zzg = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            mnd0.m159157a("Null dineIn");
            throw null;
        }
        this.zzh = booleanPlaceAttributeValue3;
        this.zzi = str2;
        this.zzj = str3;
        this.zzk = num;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = latLng;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = openingHours2;
        this.zzr = str8;
        this.zzs = list2;
        this.zzt = list3;
        this.zzu = list4;
        this.zzv = plusCode;
        this.zzw = num2;
        this.zzx = str9;
        this.zzy = d;
        if (booleanPlaceAttributeValue4 == null) {
            mnd0.m159157a("Null reservable");
            throw null;
        }
        this.zzz = booleanPlaceAttributeValue4;
        this.zzA = list5;
        if (booleanPlaceAttributeValue5 == null) {
            mnd0.m159157a("Null servesBeer");
            throw null;
        }
        this.zzB = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            mnd0.m159157a("Null servesBreakfast");
            throw null;
        }
        this.zzC = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            mnd0.m159157a("Null servesBrunch");
            throw null;
        }
        this.zzD = booleanPlaceAttributeValue7;
        if (booleanPlaceAttributeValue8 == null) {
            mnd0.m159157a("Null servesDinner");
            throw null;
        }
        this.zzE = booleanPlaceAttributeValue8;
        if (booleanPlaceAttributeValue9 == null) {
            mnd0.m159157a("Null servesLunch");
            throw null;
        }
        this.zzF = booleanPlaceAttributeValue9;
        if (booleanPlaceAttributeValue10 == null) {
            mnd0.m159157a("Null servesVegetarianFood");
            throw null;
        }
        this.zzG = booleanPlaceAttributeValue10;
        if (booleanPlaceAttributeValue11 == null) {
            mnd0.m159157a("Null servesWine");
            throw null;
        }
        this.zzH = booleanPlaceAttributeValue11;
        if (booleanPlaceAttributeValue12 == null) {
            mnd0.m159157a("Null takeout");
            throw null;
        }
        this.zzI = booleanPlaceAttributeValue12;
        this.zzJ = list6;
        this.zzK = num3;
        this.zzL = num4;
        this.zzM = latLngBounds;
        this.zzN = uri;
        if (booleanPlaceAttributeValue13 != null) {
            this.zzO = booleanPlaceAttributeValue13;
        } else {
            mnd0.m159157a("Null wheelchairAccessibleEntrance");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        OpeningHours openingHours;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        LatLng latLng;
        String str5;
        String str6;
        OpeningHours openingHours2;
        String str7;
        List list;
        List list2;
        List list3;
        PlusCode plusCode;
        Integer num2;
        String str8;
        Double d;
        List list4;
        List list5;
        Integer num3;
        Integer num4;
        LatLngBounds latLngBounds;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str9 = this.zza;
            if (str9 != null ? str9.equals(place.getAddress()) : place.getAddress() == null) {
                AddressComponents addressComponents = this.zzb;
                if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                    List list6 = this.zzc;
                    if (list6 != null ? list6.equals(place.getAttributions()) : place.getAttributions() == null) {
                        Place.BusinessStatus businessStatus = this.zzd;
                        if (businessStatus != null ? businessStatus.equals(place.getBusinessStatus()) : place.getBusinessStatus() == null) {
                            if (this.zze.equals(place.getCurbsidePickup()) && ((openingHours = this.zzf) != null ? openingHours.equals(place.getCurrentOpeningHours()) : place.getCurrentOpeningHours() == null) && this.zzg.equals(place.getDelivery()) && this.zzh.equals(place.getDineIn()) && ((str = this.zzi) != null ? str.equals(place.getEditorialSummary()) : place.getEditorialSummary() == null) && ((str2 = this.zzj) != null ? str2.equals(place.getEditorialSummaryLanguageCode()) : place.getEditorialSummaryLanguageCode() == null) && ((num = this.zzk) != null ? num.equals(place.getIconBackgroundColor()) : place.getIconBackgroundColor() == null) && ((str3 = this.zzl) != null ? str3.equals(place.getIconUrl()) : place.getIconUrl() == null) && ((str4 = this.zzm) != null ? str4.equals(place.getId()) : place.getId() == null) && ((latLng = this.zzn) != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) && ((str5 = this.zzo) != null ? str5.equals(place.getName()) : place.getName() == null) && ((str6 = this.zzp) != null ? str6.equals(place.getNameLanguageCode()) : place.getNameLanguageCode() == null) && ((openingHours2 = this.zzq) != null ? openingHours2.equals(place.getOpeningHours()) : place.getOpeningHours() == null) && ((str7 = this.zzr) != null ? str7.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) && ((list = this.zzs) != null ? list.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) && ((list2 = this.zzt) != null ? list2.equals(place.getReviews()) : place.getReviews() == null) && ((list3 = this.zzu) != null ? list3.equals(place.getPlaceTypes()) : place.getPlaceTypes() == null) && ((plusCode = this.zzv) != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) && ((num2 = this.zzw) != null ? num2.equals(place.getPriceLevel()) : place.getPriceLevel() == null) && ((str8 = this.zzx) != null ? str8.equals(place.getPrimaryType()) : place.getPrimaryType() == null) && ((d = this.zzy) != null ? d.equals(place.getRating()) : place.getRating() == null) && this.zzz.equals(place.getReservable()) && ((list4 = this.zzA) != null ? list4.equals(place.getSecondaryOpeningHours()) : place.getSecondaryOpeningHours() == null) && this.zzB.equals(place.getServesBeer()) && this.zzC.equals(place.getServesBreakfast()) && this.zzD.equals(place.getServesBrunch()) && this.zzE.equals(place.getServesDinner()) && this.zzF.equals(place.getServesLunch()) && this.zzG.equals(place.getServesVegetarianFood()) && this.zzH.equals(place.getServesWine()) && this.zzI.equals(place.getTakeout()) && ((list5 = this.zzJ) != null ? list5.equals(place.getTypes()) : place.getTypes() == null) && ((num3 = this.zzK) != null ? num3.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) && ((num4 = this.zzL) != null ? num4.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) && ((latLngBounds = this.zzM) != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) && ((uri = this.zzN) != null ? uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() == null) && this.zzO.equals(place.getWheelchairAccessibleEntrance())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public AddressComponents getAddressComponents() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public List<String> getAttributions() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public Place.BusinessStatus getBusinessStatus() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public OpeningHours getCurrentOpeningHours() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDelivery() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDineIn() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getEditorialSummary() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getEditorialSummaryLanguageCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    @ColorInt
    public Integer getIconBackgroundColor() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getIconUrl() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getId() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public LatLng getLatLng() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getName() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getNameLanguageCode() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public OpeningHours getOpeningHours() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getPhoneNumber() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public List<String> getPlaceTypes() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public PlusCode getPlusCode() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @IntRange(from = 0, to = 4)
    @Nullable
    public Integer getPriceLevel() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public String getPrimaryType() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    @FloatRange(from = 1.0d, to = Place.RATING_MAX_VALUE)
    public Double getRating() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getReservable() {
        return this.zzz;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public List<Review> getReviews() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBeer() {
        return this.zzB;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBreakfast() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBrunch() {
        return this.zzD;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesDinner() {
        return this.zzE;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesLunch() {
        return this.zzF;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        return this.zzG;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesWine() {
        return this.zzH;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getTakeout() {
        return this.zzI;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    @Deprecated
    public List<Place.Type> getTypes() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @IntRange(from = 0)
    @Nullable
    public Integer getUserRatingsTotal() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public Integer getUtcOffsetMinutes() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public LatLngBounds getViewport() {
        return this.zzM;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Nullable
    public Uri getWebsiteUri() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzO;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        AddressComponents addressComponents = this.zzb;
        int iHashCode2 = addressComponents == null ? 0 : addressComponents.hashCode();
        int i = iHashCode ^ 1000003;
        List list = this.zzc;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.zzd;
        int iHashCode4 = (((iHashCode3 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003) ^ this.zze.hashCode()) * 1000003;
        OpeningHours openingHours = this.zzf;
        int iHashCode5 = (((((iHashCode4 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        String str2 = this.zzi;
        int iHashCode6 = (iHashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.zzj;
        int iHashCode7 = (iHashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num = this.zzk;
        int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str4 = this.zzl;
        int iHashCode9 = (iHashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zzm;
        int iHashCode10 = (iHashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        LatLng latLng = this.zzn;
        int iHashCode11 = (iHashCode10 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str6 = this.zzo;
        int iHashCode12 = (iHashCode11 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.zzp;
        int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        OpeningHours openingHours2 = this.zzq;
        int iHashCode14 = (iHashCode13 ^ (openingHours2 == null ? 0 : openingHours2.hashCode())) * 1000003;
        String str8 = this.zzr;
        int iHashCode15 = (iHashCode14 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        List list2 = this.zzs;
        int iHashCode16 = (iHashCode15 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzt;
        int iHashCode17 = (iHashCode16 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.zzu;
        int iHashCode18 = (iHashCode17 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        PlusCode plusCode = this.zzv;
        int iHashCode19 = (iHashCode18 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num2 = this.zzw;
        int iHashCode20 = (iHashCode19 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str9 = this.zzx;
        int iHashCode21 = (iHashCode20 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        Double d = this.zzy;
        int iHashCode22 = (((iHashCode21 ^ (d == null ? 0 : d.hashCode())) * 1000003) ^ this.zzz.hashCode()) * 1000003;
        List list5 = this.zzA;
        int iHashCode23 = (((((((((((((((((iHashCode22 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003) ^ this.zzB.hashCode()) * 1000003) ^ this.zzC.hashCode()) * 1000003) ^ this.zzD.hashCode()) * 1000003) ^ this.zzE.hashCode()) * 1000003) ^ this.zzF.hashCode()) * 1000003) ^ this.zzG.hashCode()) * 1000003) ^ this.zzH.hashCode()) * 1000003) ^ this.zzI.hashCode()) * 1000003;
        List list6 = this.zzJ;
        int iHashCode24 = (iHashCode23 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003;
        Integer num3 = this.zzK;
        int iHashCode25 = (iHashCode24 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.zzL;
        int iHashCode26 = (iHashCode25 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzM;
        int iHashCode27 = (iHashCode26 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzN;
        return this.zzO.hashCode() ^ ((iHashCode27 ^ (uri != null ? uri.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzO;
        Uri uri = this.zzN;
        LatLngBounds latLngBounds = this.zzM;
        List list = this.zzJ;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2 = this.zzI;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3 = this.zzH;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zzG;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5 = this.zzF;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6 = this.zzE;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zzD;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8 = this.zzC;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9 = this.zzB;
        List list2 = this.zzA;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10 = this.zzz;
        PlusCode plusCode = this.zzv;
        List list3 = this.zzu;
        List list4 = this.zzt;
        List list5 = this.zzs;
        OpeningHours openingHours = this.zzq;
        LatLng latLng = this.zzn;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11 = this.zzh;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12 = this.zzg;
        OpeningHours openingHours2 = this.zzf;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zze;
        Place.BusinessStatus businessStatus = this.zzd;
        List list6 = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(list6);
        String strValueOf3 = String.valueOf(businessStatus);
        String string = booleanPlaceAttributeValue13.toString();
        String strValueOf4 = String.valueOf(openingHours2);
        String string2 = booleanPlaceAttributeValue12.toString();
        String string3 = booleanPlaceAttributeValue11.toString();
        String strValueOf5 = String.valueOf(latLng);
        String strValueOf6 = String.valueOf(openingHours);
        String strValueOf7 = String.valueOf(list5);
        String strValueOf8 = String.valueOf(list4);
        String strValueOf9 = String.valueOf(list3);
        String strValueOf10 = String.valueOf(plusCode);
        String string4 = booleanPlaceAttributeValue10.toString();
        String strValueOf11 = String.valueOf(list2);
        String string5 = booleanPlaceAttributeValue9.toString();
        String string6 = booleanPlaceAttributeValue8.toString();
        String string7 = booleanPlaceAttributeValue7.toString();
        String string8 = booleanPlaceAttributeValue6.toString();
        String string9 = booleanPlaceAttributeValue5.toString();
        String string10 = booleanPlaceAttributeValue4.toString();
        String string11 = booleanPlaceAttributeValue3.toString();
        String string12 = booleanPlaceAttributeValue2.toString();
        String strValueOf12 = String.valueOf(list);
        String strValueOf13 = String.valueOf(latLngBounds);
        String strValueOf14 = String.valueOf(uri);
        String string13 = booleanPlaceAttributeValue.toString();
        StringBuilder sb = new StringBuilder("Place{address=");
        sb.append(this.zza);
        sb.append(", addressComponents=");
        sb.append(strValueOf);
        sb.append(", attributions=");
        sb.append(strValueOf2);
        sb.append(", businessStatus=");
        sb.append(strValueOf3);
        sb.append(", curbsidePickup=");
        sb.append(string);
        sb.append(", currentOpeningHours=");
        sb.append(strValueOf4);
        sb.append(", delivery=");
        sb.append(string2);
        sb.append(", dineIn=");
        sb.append(string3);
        sb.append(", editorialSummary=");
        sb.append(this.zzi);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(this.zzj);
        Integer num = this.zzL;
        Integer num2 = this.zzK;
        Double d = this.zzy;
        String str = this.zzx;
        Integer num3 = this.zzw;
        String str2 = this.zzr;
        String str3 = this.zzp;
        String str4 = this.zzo;
        String str5 = this.zzm;
        String str6 = this.zzl;
        Integer num4 = this.zzk;
        sb.append(", iconBackgroundColor=");
        sb.append(num4);
        sb.append(", iconUrl=");
        sb.append(str6);
        sb.append(", id=");
        sb.append(str5);
        sb.append(", latLng=");
        sb.append(strValueOf5);
        sb.append(", name=");
        sb.append(str4);
        sb.append(", nameLanguageCode=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(strValueOf6);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(", photoMetadatas=");
        sb.append(strValueOf7);
        sb.append(", reviews=");
        sb.append(strValueOf8);
        sb.append(", placeTypes=");
        sb.append(strValueOf9);
        sb.append(", plusCode=");
        sb.append(strValueOf10);
        sb.append(", priceLevel=");
        sb.append(num3);
        sb.append(", primaryType=");
        sb.append(str);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(string4);
        sb.append(", secondaryOpeningHours=");
        sb.append(strValueOf11);
        sb.append(", servesBeer=");
        sb.append(string5);
        sb.append(", servesBreakfast=");
        sb.append(string6);
        sb.append(", servesBrunch=");
        sb.append(string7);
        sb.append(", servesDinner=");
        sb.append(string8);
        sb.append(", servesLunch=");
        sb.append(string9);
        sb.append(", servesVegetarianFood=");
        sb.append(string10);
        sb.append(", servesWine=");
        sb.append(string11);
        sb.append(", takeout=");
        sb.append(string12);
        sb.append(", types=");
        sb.append(strValueOf12);
        sb.append(", userRatingsTotal=");
        sb.append(num2);
        sb.append(", utcOffsetMinutes=");
        sb.append(num);
        sb.append(", viewport=");
        sb.append(strValueOf13);
        sb.append(", websiteUri=");
        sb.append(strValueOf14);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(string13);
        sb.append("}");
        return sb.toString();
    }
}
