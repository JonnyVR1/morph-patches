package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes7.dex */
public enum AutocompleteActivityMode implements Parcelable {
    FULLSCREEN,
    OVERLAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<AutocompleteActivityMode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return AutocompleteActivityMode.valueOf(string);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AutocompleteActivityMode[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
