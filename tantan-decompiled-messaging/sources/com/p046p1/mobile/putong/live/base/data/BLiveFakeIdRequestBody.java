package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
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
public class BLiveFakeIdRequestBody extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFakeIdRequestBody> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFakeIdRequestBody>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFakeIdRequestBody.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFakeIdRequestBody.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFakeIdRequestBody newInstance() {
            return new BLiveFakeIdRequestBody();
        }

        public boolean parseField(BLiveFakeIdRequestBody bLiveFakeIdRequestBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("fakeId")) {
                return false;
            }
            bLiveFakeIdRequestBody.fakeId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFakeIdRequestBody bLiveFakeIdRequestBody, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFakeIdRequestBody.fakeId;
            if (str != null) {
                jsonGenerator.writeStringField("fakeId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFakeIdRequestBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefakeidrequestbody";

    @NonNull
    @ProtobufIndex(index = 1)
    public String fakeId;

    public static String getFakeIdBody(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("0", str)) {
            return "";
        }
        BLiveFakeIdRequestBody bLiveFakeIdRequestBodyNew_ = new_();
        bLiveFakeIdRequestBodyNew_.fakeId = str;
        return bLiveFakeIdRequestBodyNew_.toJson();
    }

    public static BLiveFakeIdRequestBody new_() {
        BLiveFakeIdRequestBody bLiveFakeIdRequestBody = new BLiveFakeIdRequestBody();
        bLiveFakeIdRequestBody.nullCheck();
        return bLiveFakeIdRequestBody;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFakeIdRequestBody mo223809clone() {
        BLiveFakeIdRequestBody bLiveFakeIdRequestBody = new BLiveFakeIdRequestBody();
        bLiveFakeIdRequestBody.fakeId = this.fakeId;
        return bLiveFakeIdRequestBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveFakeIdRequestBody) {
            return ValueObject.util_equals(this.fakeId, ((BLiveFakeIdRequestBody) obj).fakeId);
        }
        return false;
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
        String str = this.fakeId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fakeId == null) {
            this.fakeId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
