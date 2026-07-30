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
public class BLiveSignInMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInMedal.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInMedal newInstance() {
            return new BLiveSignInMedal();
        }

        public boolean parseField(BLiveSignInMedal bLiveSignInMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveSignInMedal.f44437id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveSignInMedal.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveSignInMedal.name = jsonParser.getValueAsString();
                    return true;
                case "show":
                    bLiveSignInMedal.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInMedal bLiveSignInMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSignInMedal.f44437id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSignInMedal.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveSignInMedal.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeBooleanField("show", bLiveSignInMedal.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesigninmedal";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44437id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 4)
    public boolean show;

    public static BLiveSignInMedal new_() {
        BLiveSignInMedal bLiveSignInMedal = new BLiveSignInMedal();
        bLiveSignInMedal.nullCheck();
        return bLiveSignInMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInMedal mo223809clone() {
        BLiveSignInMedal bLiveSignInMedal = new BLiveSignInMedal();
        bLiveSignInMedal.f44437id = this.f44437id;
        bLiveSignInMedal.name = this.name;
        bLiveSignInMedal.icon = this.icon;
        bLiveSignInMedal.show = this.show;
        return bLiveSignInMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInMedal)) {
            return false;
        }
        BLiveSignInMedal bLiveSignInMedal = (BLiveSignInMedal) obj;
        return ValueObject.util_equals(this.f44437id, bLiveSignInMedal.f44437id) && ValueObject.util_equals(this.name, bLiveSignInMedal.name) && ValueObject.util_equals(this.icon, bLiveSignInMedal.icon) && this.show == bLiveSignInMedal.show;
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
        String str = this.f44437id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44437id == null) {
            this.f44437id = "";
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
