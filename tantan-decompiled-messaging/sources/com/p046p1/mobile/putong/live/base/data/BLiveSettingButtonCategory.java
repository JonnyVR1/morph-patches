package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSettingButtonCategory extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSettingButtonCategory> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSettingButtonCategory>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSettingButtonCategory.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSettingButtonCategory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSettingButtonCategory newInstance() {
            return new BLiveSettingButtonCategory();
        }

        public boolean parseField(BLiveSettingButtonCategory bLiveSettingButtonCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveSettingButtonCategory.f44435id = jsonParser.getValueAsInt();
                    return false;
                case "name":
                    bLiveSettingButtonCategory.name = jsonParser.getValueAsString();
                    return true;
                case "sort":
                    bLiveSettingButtonCategory.sort = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLiveSettingButtonCategory.type = jsonParser.getValueAsString();
                    return true;
                case "viewType":
                    bLiveSettingButtonCategory.viewType = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSettingButtonCategory bLiveSettingButtonCategory, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveSettingButtonCategory.f44435id);
            String str = bLiveSettingButtonCategory.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField("sort", bLiveSettingButtonCategory.sort);
            String str2 = bLiveSettingButtonCategory.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("viewType", bLiveSettingButtonCategory.viewType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSettingButtonCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesettingbuttoncategory";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44435id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 3)
    public int sort;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @ProtobufIndex(index = 5)
    public int viewType;

    public static BLiveSettingButtonCategory new_() {
        BLiveSettingButtonCategory bLiveSettingButtonCategory = new BLiveSettingButtonCategory();
        bLiveSettingButtonCategory.nullCheck();
        return bLiveSettingButtonCategory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSettingButtonCategory mo223809clone() {
        BLiveSettingButtonCategory bLiveSettingButtonCategory = new BLiveSettingButtonCategory();
        bLiveSettingButtonCategory.f44435id = this.f44435id;
        bLiveSettingButtonCategory.name = this.name;
        bLiveSettingButtonCategory.sort = this.sort;
        bLiveSettingButtonCategory.type = this.type;
        bLiveSettingButtonCategory.viewType = this.viewType;
        return bLiveSettingButtonCategory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSettingButtonCategory)) {
            return false;
        }
        BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) obj;
        return this.f44435id == bLiveSettingButtonCategory.f44435id && ValueObject.util_equals(this.name, bLiveSettingButtonCategory.name) && this.sort == bLiveSettingButtonCategory.sort && ValueObject.util_equals(this.type, bLiveSettingButtonCategory.type) && this.viewType == bLiveSettingButtonCategory.viewType;
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
        int i2 = ((i * 41) + this.f44435id) * 41;
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.sort) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.viewType;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
