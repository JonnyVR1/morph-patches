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
public class BLiveIntlFamilyInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlFamilyInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlFamilyInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlFamilyInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlFamilyInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlFamilyInfo newInstance() {
            return new BLiveIntlFamilyInfo();
        }

        public boolean parseField(BLiveIntlFamilyInfo bLiveIntlFamilyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveIntlFamilyInfo.f45236id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            bLiveIntlFamilyInfo.name = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlFamilyInfo bLiveIntlFamilyInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlFamilyInfo.f45236id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveIntlFamilyInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlFamilyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlfamilyinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45236id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveIntlFamilyInfo new_() {
        BLiveIntlFamilyInfo bLiveIntlFamilyInfo = new BLiveIntlFamilyInfo();
        bLiveIntlFamilyInfo.nullCheck();
        return bLiveIntlFamilyInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlFamilyInfo mo225055clone() {
        BLiveIntlFamilyInfo bLiveIntlFamilyInfo = new BLiveIntlFamilyInfo();
        bLiveIntlFamilyInfo.f45236id = this.f45236id;
        bLiveIntlFamilyInfo.name = this.name;
        return bLiveIntlFamilyInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlFamilyInfo)) {
            return false;
        }
        BLiveIntlFamilyInfo bLiveIntlFamilyInfo = (BLiveIntlFamilyInfo) obj;
        return ValueObject.util_equals(this.f45236id, bLiveIntlFamilyInfo.f45236id) && ValueObject.util_equals(this.name, bLiveIntlFamilyInfo.name);
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
        String str = this.f45236id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45236id == null) {
            this.f45236id = "";
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
