package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = new C1281a();
    private String actionUrl;
    private String contentType;
    private Boolean hasLinks;
    private Boolean hasUrl;
    private String icon;
    private String iconContentDescription;
    private JSONArray links;
    private String media;
    private String mediaContentDescription;
    private String message;
    private String messageColor;
    private String posterUrl;
    private String title;
    private String titleColor;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxMessageContent$a */
    public class C1281a implements Parcelable.Creator<CTInboxMessageContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CTInboxMessageContent createFromParcel(Parcel parcel) {
            return new CTInboxMessageContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CTInboxMessageContent[] newArray(int i) {
            return new CTInboxMessageContent[i];
        }
    }

    public CTInboxMessageContent(Parcel parcel) {
        this.title = parcel.readString();
        this.titleColor = parcel.readString();
        this.message = parcel.readString();
        this.messageColor = parcel.readString();
        this.media = parcel.readString();
        this.mediaContentDescription = parcel.readString();
        this.hasUrl = Boolean.valueOf(parcel.readByte() != 0);
        this.hasLinks = Boolean.valueOf(parcel.readByte() != 0);
        this.actionUrl = parcel.readString();
        this.icon = parcel.readString();
        this.iconContentDescription = parcel.readString();
        try {
            this.links = parcel.readByte() == 0 ? null : new JSONArray(parcel.readString());
        } catch (JSONException e) {
            Logger.m5873v("Unable to init CTInboxMessageContent with Parcel - " + e.getLocalizedMessage());
        }
        this.contentType = parcel.readString();
        this.posterUrl = parcel.readString();
    }

    /* JADX INFO: renamed from: A */
    public boolean m6692A() {
        return m6715x() || m6693B();
    }

    /* JADX INFO: renamed from: B */
    public boolean m6693B() {
        String strM6695b = m6695b();
        return (strM6695b == null || this.media == null || !strM6695b.startsWith("video")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public String m6694a() {
        return this.actionUrl;
    }

    /* JADX INFO: renamed from: b */
    public String m6695b() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: c */
    public String m6696c() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d */
    public String m6697d() {
        return this.iconContentDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m6698e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(Constants.KEY_BG) ? jSONObject.getString(Constants.KEY_BG) : "";
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link Text Color with JSON - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m6699f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("color") ? jSONObject.getString("color") : "";
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link Text Color with JSON - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m6700g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            JSONObject jSONObject2 = jSONObject.has("copyText") ? jSONObject.getJSONObject("copyText") : null;
            return (jSONObject2 == null || !jSONObject2.has("text")) ? "" : jSONObject2.getString("text");
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link Text with JSON - " + e.getLocalizedMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public HashMap<String, String> m6701h(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(Constants.KEY_KV)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.KEY_KV);
                Iterator<String> itKeys = jSONObject2.keys();
                HashMap<String, String> map = new HashMap<>();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject2.getString(next);
                    if (!TextUtils.isEmpty(next)) {
                        map.put(next, string);
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            } catch (JSONException e) {
                Logger.m5873v("Unable to get Link Key Value with JSON - " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public String m6702i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("text") ? jSONObject.getString("text") : "";
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link Text with JSON - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m6703k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.has("url") ? jSONObject.getJSONObject("url") : null;
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.has("android") ? jSONObject2.getJSONObject("android") : null;
            return (jSONObject3 == null || !jSONObject3.has("text")) ? "" : jSONObject3.getString("text");
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link URL with JSON - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public JSONArray m6704l() {
        return this.links;
    }

    /* JADX INFO: renamed from: m */
    public String m6705m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("type") ? jSONObject.getString("type") : "";
        } catch (JSONException e) {
            Logger.m5873v("Unable to get Link Type with JSON - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public String m6706n() {
        return this.media;
    }

    /* JADX INFO: renamed from: o */
    public String m6707o() {
        return this.mediaContentDescription;
    }

    /* JADX INFO: renamed from: p */
    public String m6708p() {
        return this.message;
    }

    /* JADX INFO: renamed from: q */
    public String m6709q() {
        return this.messageColor;
    }

    /* JADX INFO: renamed from: r */
    public String m6710r() {
        return this.posterUrl;
    }

    /* JADX INFO: renamed from: s */
    public String m6711s() {
        return this.title;
    }

    /* JADX INFO: renamed from: t */
    public String m6712t() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: u */
    public CTInboxMessageContent m6713u(JSONObject jSONObject) {
        String str = "links";
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            if (jSONObject2 != null) {
                this.title = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                this.titleColor = jSONObject2.has("color") ? jSONObject2.getString("color") : "";
            } else {
                str = "links";
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                this.message = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                this.messageColor = jSONObject3.has("color") ? jSONObject3.getString("color") : "";
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            if (jSONObject4 != null) {
                this.icon = jSONObject4.has("url") ? jSONObject4.getString("url") : "";
                this.iconContentDescription = jSONObject4.optString(Constants.KEY_ALT_TEXT, "");
            }
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                this.media = jSONObject5.has("url") ? jSONObject5.getString("url") : "";
                this.mediaContentDescription = jSONObject5.optString(Constants.KEY_ALT_TEXT, "");
                this.contentType = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                this.posterUrl = jSONObject5.has(Constants.KEY_POSTER_URL) ? jSONObject5.getString(Constants.KEY_POSTER_URL) : "";
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                boolean z = false;
                this.hasUrl = Boolean.valueOf(jSONObject6.has(Constants.KEY_HAS_URL) && jSONObject6.getBoolean(Constants.KEY_HAS_URL));
                if (jSONObject6.has(Constants.KEY_HAS_LINKS) && jSONObject6.getBoolean(Constants.KEY_HAS_LINKS)) {
                    z = true;
                }
                this.hasLinks = Boolean.valueOf(z);
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null && this.hasUrl.booleanValue()) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null) {
                        this.actionUrl = jSONObject8.has("text") ? jSONObject8.getString("text") : "";
                    }
                }
                if (jSONObject7 != null && this.hasLinks.booleanValue()) {
                    String str2 = str;
                    this.links = jSONObject6.has(str2) ? jSONObject6.getJSONArray(str2) : null;
                }
            }
            return this;
        } catch (JSONException e) {
            Logger.m5873v("Unable to init CTInboxMessageContent with JSON - " + e.getLocalizedMessage());
            return this;
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m6714w(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.has(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS)) {
                return jSONObject.getBoolean(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS);
            }
            return false;
        } catch (JSONException e) {
            Logger.m5873v("Unable to get fallback settings key with JSON - " + e.getLocalizedMessage());
            return false;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleColor);
        parcel.writeString(this.message);
        parcel.writeString(this.messageColor);
        parcel.writeString(this.media);
        parcel.writeString(this.mediaContentDescription);
        parcel.writeByte(this.hasUrl.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasLinks.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconContentDescription);
        if (this.links == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.links.toString());
        }
        parcel.writeString(this.contentType);
        parcel.writeString(this.posterUrl);
    }

    /* JADX INFO: renamed from: x */
    public boolean m6715x() {
        String strM6695b = m6695b();
        return (strM6695b == null || this.media == null || !strM6695b.startsWith("audio")) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m6716y() {
        String strM6695b = m6695b();
        return (strM6695b == null || this.media == null || !strM6695b.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m6717z() {
        String strM6695b = m6695b();
        return (strM6695b == null || this.media == null || !strM6695b.startsWith("image") || strM6695b.equals("image/gif")) ? false : true;
    }

    public CTInboxMessageContent() {
    }
}
