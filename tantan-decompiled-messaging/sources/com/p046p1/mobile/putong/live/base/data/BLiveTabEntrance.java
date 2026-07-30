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
public class BLiveTabEntrance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTabEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTabEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTabEntrance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTabEntrance.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTabEntrance newInstance() {
            return new BLiveTabEntrance();
        }

        public boolean parseField(BLiveTabEntrance bLiveTabEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scheme":
                    bLiveTabEntrance.scheme = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveTabEntrance.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveTabEntrance.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTabEntrance bLiveTabEntrance, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTabEntrance.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveTabEntrance.scheme;
            if (str2 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str2);
            }
            String str3 = bLiveTabEntrance.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTabEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetabentrance";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String scheme;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    public static BLiveTabEntrance new_() {
        BLiveTabEntrance bLiveTabEntrance = new BLiveTabEntrance();
        bLiveTabEntrance.nullCheck();
        return bLiveTabEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTabEntrance mo223809clone() {
        BLiveTabEntrance bLiveTabEntrance = new BLiveTabEntrance();
        bLiveTabEntrance.name = this.name;
        bLiveTabEntrance.scheme = this.scheme;
        bLiveTabEntrance.type = this.type;
        return bLiveTabEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTabEntrance)) {
            return false;
        }
        BLiveTabEntrance bLiveTabEntrance = (BLiveTabEntrance) obj;
        return ValueObject.util_equals(this.name, bLiveTabEntrance.name) && ValueObject.util_equals(this.scheme, bLiveTabEntrance.scheme) && ValueObject.util_equals(this.type, bLiveTabEntrance.type);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scheme;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
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
