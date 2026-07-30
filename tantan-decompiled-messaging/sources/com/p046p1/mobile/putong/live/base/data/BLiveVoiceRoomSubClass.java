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
public class BLiveVoiceRoomSubClass extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomSubClass> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomSubClass>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomSubClass.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomSubClass newInstance() {
            return new BLiveVoiceRoomSubClass();
        }

        public boolean parseField(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveVoiceRoomSubClass.f44507id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveVoiceRoomSubClass.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceRoomSubClass.name = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    bLiveVoiceRoomSubClass.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomSubClass.f44507id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceRoomSubClass.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVoiceRoomSubClass.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeBooleanField("isSelected", bLiveVoiceRoomSubClass.isSelected);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomSubClass) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomsubclass";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44507id;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveVoiceRoomSubClass new_() {
        BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass = new BLiveVoiceRoomSubClass();
        bLiveVoiceRoomSubClass.nullCheck();
        return bLiveVoiceRoomSubClass;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomSubClass mo223809clone() {
        BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass = new BLiveVoiceRoomSubClass();
        bLiveVoiceRoomSubClass.f44507id = this.f44507id;
        bLiveVoiceRoomSubClass.name = this.name;
        bLiveVoiceRoomSubClass.icon = this.icon;
        bLiveVoiceRoomSubClass.isSelected = this.isSelected;
        return bLiveVoiceRoomSubClass;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomSubClass)) {
            return false;
        }
        BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass = (BLiveVoiceRoomSubClass) obj;
        return ValueObject.util_equals(this.f44507id, bLiveVoiceRoomSubClass.f44507id) && ValueObject.util_equals(this.name, bLiveVoiceRoomSubClass.name) && ValueObject.util_equals(this.icon, bLiveVoiceRoomSubClass.icon) && this.isSelected == bLiveVoiceRoomSubClass.isSelected;
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
        String str = this.f44507id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44507id == null) {
            this.f44507id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
