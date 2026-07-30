package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSuggestLiveAnchor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuggestLiveAnchor> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuggestLiveAnchor>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuggestLiveAnchor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuggestLiveAnchor newInstance() {
            return new BLiveSuggestLiveAnchor();
        }

        public boolean parseField(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profilePicture":
                    bLiveSuggestLiveAnchor.profilePicture = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveSuggestLiveAnchor.f45299id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveSuggestLiveAnchor.name = jsonParser.getValueAsString();
                    return true;
                case "location":
                    bLiveSuggestLiveAnchor.location = Location.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hierarchy":
                    bLiveSuggestLiveAnchor.hierarchy = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuggestLiveAnchor.f45299id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSuggestLiveAnchor.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (bLiveSuggestLiveAnchor.location != null) {
                jsonGenerator.writeFieldName("location");
                Location.JSON_ADAPTER.serialize(bLiveSuggestLiveAnchor.location, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("hierarchy", bLiveSuggestLiveAnchor.hierarchy);
            String str3 = bLiveSuggestLiveAnchor.profilePicture;
            if (str3 != null) {
                jsonGenerator.writeStringField("profilePicture", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuggestLiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesuggestliveanchor";

    @ProtobufIndex(index = 4)
    public long hierarchy;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45299id;

    @NonNull
    @ProtobufIndex(index = 3)
    public Location location;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String profilePicture;

    public static BLiveSuggestLiveAnchor new_() {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = new BLiveSuggestLiveAnchor();
        bLiveSuggestLiveAnchor.nullCheck();
        return bLiveSuggestLiveAnchor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuggestLiveAnchor mo225055clone() {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = new BLiveSuggestLiveAnchor();
        bLiveSuggestLiveAnchor.f45299id = this.f45299id;
        bLiveSuggestLiveAnchor.name = this.name;
        Location location = this.location;
        if (location != null) {
            bLiveSuggestLiveAnchor.location = location.mo225055clone();
        }
        bLiveSuggestLiveAnchor.hierarchy = this.hierarchy;
        bLiveSuggestLiveAnchor.profilePicture = this.profilePicture;
        return bLiveSuggestLiveAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuggestLiveAnchor)) {
            return false;
        }
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = (BLiveSuggestLiveAnchor) obj;
        return ValueObject.util_equals(this.f45299id, bLiveSuggestLiveAnchor.f45299id) && ValueObject.util_equals(this.name, bLiveSuggestLiveAnchor.name) && ValueObject.util_equals(this.location, bLiveSuggestLiveAnchor.location) && this.hierarchy == bLiveSuggestLiveAnchor.hierarchy && ValueObject.util_equals(this.profilePicture, bLiveSuggestLiveAnchor.profilePicture);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45299id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Location location = this.location;
        int iHashCode3 = location != null ? location.hashCode() : 0;
        long j = this.hierarchy;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.profilePicture;
        int iHashCode4 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45299id == null) {
            this.f45299id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.location == null) {
            this.location = Location.new_();
        }
        if (this.profilePicture == null) {
            this.profilePicture = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
