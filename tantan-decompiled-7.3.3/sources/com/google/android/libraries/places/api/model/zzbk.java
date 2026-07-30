package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbk extends zzx {
    public static final Parcelable.Creator<zzbk> CREATOR = new zzbj();

    public zzbk(@Nullable String str, @Nullable AddressComponents addressComponents, @Nullable List list, @Nullable Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, @Nullable OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable LatLng latLng, @Nullable String str6, @Nullable String str7, @Nullable OpeningHours openingHours2, @Nullable String str8, @Nullable List list2, @Nullable List list3, @Nullable List list4, @Nullable PlusCode plusCode, @Nullable Integer num2, @Nullable String str9, @Nullable Double d, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, @Nullable List list5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, @Nullable List list6, @Nullable Integer num3, @Nullable Integer num4, @Nullable LatLngBounds latLngBounds, @Nullable Uri uri, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13) {
        super(str, addressComponents, list, businessStatus, booleanPlaceAttributeValue, openingHours, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, str2, str3, num, str4, str5, latLng, str6, str7, openingHours2, str8, list2, list3, list4, plusCode, num2, str9, d, booleanPlaceAttributeValue4, list5, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, booleanPlaceAttributeValue12, list6, num3, num4, latLngBounds, uri, booleanPlaceAttributeValue13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAddress());
        }
        parcel.writeParcelable(getAddressComponents(), i);
        parcel.writeList(getAttributions());
        parcel.writeParcelable(getBusinessStatus(), i);
        parcel.writeParcelable(getCurbsidePickup(), i);
        parcel.writeParcelable(getCurrentOpeningHours(), i);
        parcel.writeParcelable(getDelivery(), i);
        parcel.writeParcelable(getDineIn(), i);
        if (getEditorialSummary() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummary());
        }
        if (getEditorialSummaryLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummaryLanguageCode());
        }
        if (getIconBackgroundColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getIconBackgroundColor().intValue());
        }
        if (getIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconUrl());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        parcel.writeParcelable(getLatLng(), i);
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        if (getNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getNameLanguageCode());
        }
        parcel.writeParcelable(getOpeningHours(), i);
        if (getPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhoneNumber());
        }
        parcel.writeList(getPhotoMetadatas());
        parcel.writeList(getReviews());
        parcel.writeList(getPlaceTypes());
        parcel.writeParcelable(getPlusCode(), i);
        if (getPriceLevel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getPriceLevel().intValue());
        }
        if (getPrimaryType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryType());
        }
        if (getRating() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getRating().doubleValue());
        }
        parcel.writeParcelable(getReservable(), i);
        parcel.writeList(getSecondaryOpeningHours());
        parcel.writeParcelable(getServesBeer(), i);
        parcel.writeParcelable(getServesBreakfast(), i);
        parcel.writeParcelable(getServesBrunch(), i);
        parcel.writeParcelable(getServesDinner(), i);
        parcel.writeParcelable(getServesLunch(), i);
        parcel.writeParcelable(getServesVegetarianFood(), i);
        parcel.writeParcelable(getServesWine(), i);
        parcel.writeParcelable(getTakeout(), i);
        parcel.writeList(getTypes());
        if (getUserRatingsTotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingsTotal().intValue());
        }
        if (getUtcOffsetMinutes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUtcOffsetMinutes().intValue());
        }
        parcel.writeParcelable(getViewport(), i);
        parcel.writeParcelable(getWebsiteUri(), i);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i);
    }
}
