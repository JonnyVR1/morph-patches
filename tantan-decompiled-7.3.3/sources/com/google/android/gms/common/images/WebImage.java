package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    @SafeParcelable.VersionField(m12520id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getUrl", m12517id = 2)
    private final Uri zab;

    @SafeParcelable.Field(getter = "getWidth", m12517id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getHeight", m12517id = 4)
    private final int zad;

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public WebImage(@NonNull JSONObject jSONObject) throws IllegalArgumentException {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    @NonNull
    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @NonNull
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put("width", this.zac);
            jSONObject.put("height", this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebImage(@NonNull Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@NonNull Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            wg3.m206174a("url cannot be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            wg3.m206174a("width and height must not be negative");
            throw null;
        }
    }

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) Uri uri, @SafeParcelable.Param(m12518id = 3) int i2, @SafeParcelable.Param(m12518id = 4) int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }
}
