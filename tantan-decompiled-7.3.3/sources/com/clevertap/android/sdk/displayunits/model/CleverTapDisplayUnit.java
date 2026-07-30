package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.displayunits.CTDisplayUnitType;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new C1205a();
    private String bgColor;
    private ArrayList<CleverTapDisplayUnitContent> contents;
    private HashMap<String, String> customExtras;
    private String error;
    private JSONObject jsonObject;
    private CTDisplayUnitType type;
    private String unitID;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit$a */
    public class C1205a implements Parcelable.Creator<CleverTapDisplayUnit> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CleverTapDisplayUnit createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnit(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CleverTapDisplayUnit[] newArray(int i) {
            return new CleverTapDisplayUnit[i];
        }
    }

    private CleverTapDisplayUnit(Parcel parcel) {
        try {
            this.unitID = parcel.readString();
            this.type = (CTDisplayUnitType) parcel.readValue(CTDisplayUnitType.class.getClassLoader());
            this.bgColor = parcel.readString();
            JSONObject jSONObject = null;
            if (parcel.readByte() == 1) {
                ArrayList<CleverTapDisplayUnitContent> arrayList = new ArrayList<>();
                this.contents = arrayList;
                parcel.readList(arrayList, CleverTapDisplayUnitContent.class.getClassLoader());
            } else {
                this.contents = null;
            }
            this.customExtras = parcel.readHashMap(null);
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.jsonObject = jSONObject;
            this.error = parcel.readString();
        } catch (Exception e) {
            String str = "Error Creating Display Unit from parcel : " + e.getLocalizedMessage();
            this.error = str;
            Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static CleverTapDisplayUnit m6053d(JSONObject jSONObject) {
        try {
            String string = jSONObject.has(Constants.NOTIFICATION_ID_TAG) ? jSONObject.getString(Constants.NOTIFICATION_ID_TAG) : Constants.TEST_IDENTIFIER;
            CTDisplayUnitType cTDisplayUnitTypeType = jSONObject.has("type") ? CTDisplayUnitType.type(jSONObject.getString("type")) : null;
            String string2 = jSONObject.has(Constants.KEY_BG) ? jSONObject.getString(Constants.KEY_BG) : "";
            JSONArray jSONArray = jSONObject.has("content") ? jSONObject.getJSONArray("content") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContentM6059b = CleverTapDisplayUnitContent.m6059b(jSONArray.getJSONObject(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitContentM6059b.m6060a())) {
                        arrayList.add(cleverTapDisplayUnitContentM6059b);
                    }
                }
            }
            return new CleverTapDisplayUnit(jSONObject, string, cTDisplayUnitTypeType, string2, arrayList, jSONObject.has(Constants.KEY_CUSTOM_KV) ? jSONObject.getJSONObject(Constants.KEY_CUSTOM_KV) : null, null);
        } catch (Exception e) {
            Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnit with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public String m6054a() {
        return this.error;
    }

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> m6055b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                if (itKeys != null) {
                    HashMap<String, String> map = null;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (map == null) {
                                map = new HashMap<>();
                            }
                            map.put(next, string);
                        }
                    }
                    return map;
                }
            } catch (Exception e) {
                Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Error in getting Key Value Pairs " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m6056c() {
        return this.unitID;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(" Unit id- ");
            sb.append(this.unitID);
            sb.append(", Type- ");
            CTDisplayUnitType cTDisplayUnitType = this.type;
            sb.append(cTDisplayUnitType != null ? cTDisplayUnitType.toString() : null);
            sb.append(", bgColor- ");
            sb.append(this.bgColor);
            ArrayList<CleverTapDisplayUnitContent> arrayList = this.contents;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < this.contents.size(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = this.contents.get(i);
                    if (cleverTapDisplayUnitContent != null) {
                        sb.append(", Content Item:");
                        sb.append(i);
                        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb.append(cleverTapDisplayUnitContent.toString());
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
            if (this.customExtras != null) {
                sb.append(", Custom KV:");
                sb.append(this.customExtras);
            }
            sb.append(", JSON -");
            sb.append(this.jsonObject);
            sb.append(", Error-");
            sb.append(this.error);
            sb.append(" ]");
            return sb.toString();
        } catch (Exception e) {
            Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Exception in toString:" + e);
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.unitID);
        parcel.writeValue(this.type);
        parcel.writeString(this.bgColor);
        if (this.contents == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.contents);
        }
        parcel.writeMap(this.customExtras);
        if (this.jsonObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.jsonObject.toString());
        }
        parcel.writeString(this.error);
    }

    private CleverTapDisplayUnit(JSONObject jSONObject, String str, CTDisplayUnitType cTDisplayUnitType, String str2, ArrayList<CleverTapDisplayUnitContent> arrayList, JSONObject jSONObject2, String str3) {
        this.jsonObject = jSONObject;
        this.unitID = str;
        this.type = cTDisplayUnitType;
        this.bgColor = str2;
        this.contents = arrayList;
        this.customExtras = m6055b(jSONObject2);
        this.error = str3;
    }

    public /* synthetic */ CleverTapDisplayUnit(Parcel parcel, C1205a c1205a) {
        this(parcel);
    }
}
