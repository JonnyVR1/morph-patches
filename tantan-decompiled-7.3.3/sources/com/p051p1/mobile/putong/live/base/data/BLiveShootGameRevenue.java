package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveShootGameRevenue extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveShootGameRevenue> JSON_ADAPTER = new ObjectJsonAdapter<BLiveShootGameRevenue>() { // from class: com.p1.mobile.putong.live.base.data.BLiveShootGameRevenue.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveShootGameRevenue.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveShootGameRevenue newInstance() {
            return new BLiveShootGameRevenue();
        }

        public boolean parseField(BLiveShootGameRevenue bLiveShootGameRevenue, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveShootGameRevenue.f45284id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveShootGameRevenue.icon = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    bLiveShootGameRevenue.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveShootGameRevenue.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveShootGameRevenue bLiveShootGameRevenue, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveShootGameRevenue.f45284id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveShootGameRevenue.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("icon", bLiveShootGameRevenue.icon);
            String str3 = bLiveShootGameRevenue.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveShootGameRevenue) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveshootgamerevenue";

    @ProtobufIndex(index = 3)
    public int icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45284id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveShootGameRevenue new_() {
        BLiveShootGameRevenue bLiveShootGameRevenue = new BLiveShootGameRevenue();
        bLiveShootGameRevenue.nullCheck();
        return bLiveShootGameRevenue;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveShootGameRevenue mo225055clone() {
        BLiveShootGameRevenue bLiveShootGameRevenue = new BLiveShootGameRevenue();
        bLiveShootGameRevenue.f45284id = this.f45284id;
        bLiveShootGameRevenue.name = this.name;
        bLiveShootGameRevenue.icon = this.icon;
        bLiveShootGameRevenue.type = this.type;
        return bLiveShootGameRevenue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveShootGameRevenue)) {
            return false;
        }
        BLiveShootGameRevenue bLiveShootGameRevenue = (BLiveShootGameRevenue) obj;
        return ValueObject.util_equals(this.f45284id, bLiveShootGameRevenue.f45284id) && ValueObject.util_equals(this.name, bLiveShootGameRevenue.name) && this.icon == bLiveShootGameRevenue.icon && ValueObject.util_equals(this.type, bLiveShootGameRevenue.type);
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
        String str = this.f45284id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.icon) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45284id == null) {
            this.f45284id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
