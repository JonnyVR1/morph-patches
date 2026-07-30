package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new C1183a();
    private String actionUrl;
    private String contentType;
    private String error;
    private String icon;
    private String media;
    private String message;
    private String messageColor;
    private String posterUrl;
    private String title;
    private String titleColor;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent$a */
    public class C1183a implements Parcelable.Creator<CleverTapDisplayUnitContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CleverTapDisplayUnitContent createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnitContent(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CleverTapDisplayUnitContent[] newArray(int i) {
            return new CleverTapDisplayUnitContent[i];
        }
    }

    private CleverTapDisplayUnitContent(Parcel parcel) {
        this.title = parcel.readString();
        this.titleColor = parcel.readString();
        this.message = parcel.readString();
        this.messageColor = parcel.readString();
        this.icon = parcel.readString();
        this.media = parcel.readString();
        this.contentType = parcel.readString();
        this.posterUrl = parcel.readString();
        this.actionUrl = parcel.readString();
        this.error = parcel.readString();
    }

    /* JADX INFO: renamed from: b */
    public static CleverTapDisplayUnitContent m6005b(JSONObject jSONObject) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            String string8 = "";
            if (jSONObject2 != null) {
                string2 = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                string = jSONObject2.has("color") ? jSONObject2.getString("color") : "";
            } else {
                string = "";
                string2 = string;
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                string4 = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                string3 = jSONObject3.has("color") ? jSONObject3.getString("color") : "";
            } else {
                string3 = "";
                string4 = string3;
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            String string9 = (jSONObject4 == null || !jSONObject4.has("url")) ? "" : jSONObject4.getString("url");
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                string7 = jSONObject5.has("url") ? jSONObject5.getString("url") : "";
                string6 = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                string5 = jSONObject5.has(Constants.KEY_POSTER_URL) ? jSONObject5.getString(Constants.KEY_POSTER_URL) : "";
            } else {
                string5 = "";
                string6 = string5;
                string7 = string6;
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null && jSONObject8.has("text")) {
                        string8 = jSONObject8.getString("text");
                    }
                }
            }
            return new CleverTapDisplayUnitContent(string2, string, string4, string3, string9, string7, string6, string5, string8, null);
        } catch (Exception e) {
            Logger.m5866d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnitContent with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", "Error Creating DisplayUnit Content from JSON : " + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public String m6006a() {
        return this.error;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        return "[ title:" + this.title + ", titleColor:" + this.titleColor + " message:" + this.message + ", messageColor:" + this.messageColor + ", media:" + this.media + ", contentType:" + this.contentType + ", posterUrl:" + this.posterUrl + ", actionUrl:" + this.actionUrl + ", icon:" + this.icon + ", error:" + this.error + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleColor);
        parcel.writeString(this.message);
        parcel.writeString(this.messageColor);
        parcel.writeString(this.icon);
        parcel.writeString(this.media);
        parcel.writeString(this.contentType);
        parcel.writeString(this.posterUrl);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.error);
    }

    private CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.title = str;
        this.titleColor = str2;
        this.message = str3;
        this.messageColor = str4;
        this.icon = str5;
        this.media = str6;
        this.contentType = str7;
        this.posterUrl = str8;
        this.actionUrl = str9;
        this.error = str10;
    }

    public /* synthetic */ CleverTapDisplayUnitContent(Parcel parcel, C1183a c1183a) {
        this(parcel);
    }
}
