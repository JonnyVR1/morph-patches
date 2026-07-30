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
public class BLiveComplexUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveComplexUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveComplexUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveComplexUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveComplexUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveComplexUser newInstance() {
            return new BLiveComplexUser();
        }

        public boolean parseField(BLiveComplexUser bLiveComplexUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveComplexUser.f45199id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveComplexUser.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveComplexUser.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveComplexUser bLiveComplexUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveComplexUser.f45199id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveComplexUser.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveComplexUser.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveComplexUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecomplexuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45199id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    public static BLiveComplexUser new_() {
        BLiveComplexUser bLiveComplexUser = new BLiveComplexUser();
        bLiveComplexUser.nullCheck();
        return bLiveComplexUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveComplexUser mo225055clone() {
        BLiveComplexUser bLiveComplexUser = new BLiveComplexUser();
        bLiveComplexUser.f45199id = this.f45199id;
        bLiveComplexUser.icon = this.icon;
        bLiveComplexUser.name = this.name;
        return bLiveComplexUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveComplexUser)) {
            return false;
        }
        BLiveComplexUser bLiveComplexUser = (BLiveComplexUser) obj;
        return ValueObject.util_equals(this.f45199id, bLiveComplexUser.f45199id) && ValueObject.util_equals(this.icon, bLiveComplexUser.icon) && ValueObject.util_equals(this.name, bLiveComplexUser.name);
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
        String str = this.f45199id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45199id == null) {
            this.f45199id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
