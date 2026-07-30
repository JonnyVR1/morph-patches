package com.cosmos.photon.baseim.p024im;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class IMJPacket implements Parcelable, IPacket {
    public static final Parcelable.Creator<IMJPacket> CREATOR = new Parcelable.Creator<IMJPacket>() { // from class: com.cosmos.photon.baseim.im.IMJPacket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IMJPacket createFromParcel(Parcel parcel) {
            return new IMJPacket(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IMJPacket[] newArray(int i) {
            return new IMJPacket[i];
        }
    };

    /* JADX INFO: renamed from: AT */
    private String f5796AT;
    private String AT_TEXT;
    private String Action;
    private String From;

    /* JADX INFO: renamed from: ID */
    private String f5797ID;
    private String NameSpace;
    private String Text;
    private String TextV2;

    /* JADX INFO: renamed from: To */
    private String f5798To;
    private String Type;
    private String _Type;
    protected JSONObject jsonObj;

    public IMJPacket(Parcel parcel) {
        this.Action = "_";
        this.f5797ID = "id";
        this._Type = "_t";
        this.NameSpace = "ns";
        this.From = "fr";
        this.f5798To = "to";
        this.Text = "text";
        this.f5796AT = "at";
        this.AT_TEXT = "attext";
        this.TextV2 = "textv2";
        this.Type = "type";
        try {
            this.jsonObj = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
    }

    public static IMJPacket init(@NonNull JSONObject jSONObject) {
        return new IMJPacket(jSONObject);
    }

    public static IMJPacket parseFromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            throw new JSONException("json string is empty.");
        }
        return new IMJPacket(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object get(String str) throws JSONException {
        return this.jsonObj.get(str);
    }

    public String[] getATPeople() {
        try {
            if (!this.jsonObj.has(this.f5796AT)) {
                return null;
            }
            JSONArray jSONArray = this.jsonObj.getJSONArray(this.f5796AT);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArray.get(i).toString();
            }
            return strArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getATtext() {
        return this.jsonObj.optString(this.AT_TEXT);
    }

    public String getAction() {
        return this.jsonObj.optString(this.Action);
    }

    @Override // com.cosmos.photon.baseim.p024im.IPacket
    public byte[] getBody() {
        return toString().getBytes();
    }

    public boolean getBoolean(String str) throws JSONException {
        return this.jsonObj.getBoolean(str);
    }

    public double getDouble(String str) throws JSONException {
        return this.jsonObj.getDouble(str);
    }

    public String getFrom() {
        return this.jsonObj.optString(this.From);
    }

    public String getId() {
        return this.jsonObj.optString(this.f5797ID);
    }

    public int getInt(String str) throws JSONException {
        return this.jsonObj.getInt(str);
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        return this.jsonObj.getJSONArray(str);
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        return this.jsonObj.getJSONObject(str);
    }

    public long getLong(String str) throws JSONException {
        return this.jsonObj.getLong(str);
    }

    public String getNameSpace() {
        return this.jsonObj.optString(this.NameSpace);
    }

    public int getPacketLen() {
        return toString().getBytes().length;
    }

    public Object getSType() {
        return this.jsonObj.opt(this.Type);
    }

    public String getString(String str) throws JSONException {
        return this.jsonObj.getString(str);
    }

    public String getText() {
        return this.jsonObj.optString(this.Text);
    }

    public String getTextV2() {
        return this.jsonObj.optString(this.TextV2);
    }

    public String getTo() {
        return this.jsonObj.optString(this.f5798To);
    }

    public Object getType() {
        return this.jsonObj.opt(this._Type);
    }

    public boolean has(String str) {
        return this.jsonObj.has(str);
    }

    public boolean hasBody() {
        return this.jsonObj.has(this.Text);
    }

    public Object opt(String str) {
        return this.jsonObj.opt(str);
    }

    public boolean optBoolean(String str, boolean z) {
        return this.jsonObj.optBoolean(str, z);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public int optInt(String str, int i) {
        return this.jsonObj.optInt(str, i);
    }

    public JSONArray optJSONArray(String str) {
        return this.jsonObj.optJSONArray(str);
    }

    public JSONObject optJSONObject(String str) {
        Object objOpt = opt(str);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        boolean z = obj instanceof IMJPacket;
        JSONObject jSONObject = this.jsonObj;
        return z ? jSONObject.put(str, ((IMJPacket) obj).jsonObj) : jSONObject.put(str, obj);
    }

    public void read(IMJPacket iMJPacket) throws JSONException {
        Iterator<String> itKeys = iMJPacket.jsonObj.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.jsonObj.put(next, iMJPacket.get(next));
        }
    }

    public void setATPeople(JSONArray jSONArray) {
        try {
            this.jsonObj.put(this.f5796AT, jSONArray);
        } catch (JSONException unused) {
        }
    }

    public void setAction(String str) {
        try {
            this.jsonObj.put(this.Action, str);
        } catch (JSONException unused) {
        }
    }

    public void setFrom(String str) {
        try {
            this.jsonObj.put(this.From, str);
        } catch (JSONException unused) {
        }
    }

    public void setId(String str) {
        try {
            this.jsonObj.put(this.f5797ID, str);
        } catch (Exception unused) {
        }
    }

    public void setSType(Object obj) {
        try {
            this.jsonObj.put(this.Type, obj);
        } catch (JSONException unused) {
        }
    }

    public void setText(String str) {
        try {
            this.jsonObj.put(this.Text, str);
        } catch (JSONException unused) {
        }
    }

    public void setTo(String str) {
        try {
            this.jsonObj.put(this.f5798To, str);
        } catch (JSONException unused) {
        }
    }

    public void setType(Object obj) {
        try {
            this.jsonObj.put(this._Type, obj);
        } catch (JSONException unused) {
        }
    }

    public String toJson() {
        return toString();
    }

    public String toString() {
        JSONObject jSONObject = this.jsonObj;
        return jSONObject != null ? jSONObject.toString() : WeJson.EMPTY_MAP;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(toString());
    }

    public JSONObject getJSONObject() {
        return this.jsonObj;
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str, double d) {
        return this.jsonObj.optDouble(str, d);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public long optLong(String str, long j) {
        return this.jsonObj.optLong(str, j);
    }

    public String optString(String str, String str2) {
        return this.jsonObj.optString(str, str2);
    }

    public JSONObject put(String str, double d) throws JSONException {
        return this.jsonObj.put(str, d);
    }

    public JSONObject put(String str, int i) throws JSONException {
        return this.jsonObj.put(str, i);
    }

    public JSONObject put(String str, long j) throws JSONException {
        return this.jsonObj.put(str, j);
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        return this.jsonObj.put(str, z);
    }

    public IMJPacket(JSONObject jSONObject) {
        this.Action = "_";
        this.f5797ID = "id";
        this._Type = "_t";
        this.NameSpace = "ns";
        this.From = "fr";
        this.f5798To = "to";
        this.Text = "text";
        this.f5796AT = "at";
        this.AT_TEXT = "attext";
        this.TextV2 = "textv2";
        this.Type = "type";
        this.jsonObj = jSONObject;
    }

    public IMJPacket() {
        this.Action = "_";
        this.f5797ID = "id";
        this._Type = "_t";
        this.NameSpace = "ns";
        this.From = "fr";
        this.f5798To = "to";
        this.Text = "text";
        this.f5796AT = "at";
        this.AT_TEXT = "attext";
        this.TextV2 = "textv2";
        this.Type = "type";
        this.jsonObj = new JSONObject();
    }

    public IMJPacket(String str) throws JSONException {
        this.Action = "_";
        this.f5797ID = "id";
        this._Type = "_t";
        this.NameSpace = "ns";
        this.From = "fr";
        this.f5798To = "to";
        this.Text = "text";
        this.f5796AT = "at";
        this.AT_TEXT = "attext";
        this.TextV2 = "textv2";
        this.Type = "type";
        this.jsonObj = new JSONObject(str);
    }
}
