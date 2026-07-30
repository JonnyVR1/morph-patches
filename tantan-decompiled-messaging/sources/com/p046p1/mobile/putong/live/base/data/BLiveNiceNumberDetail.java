package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveNiceNumberDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNiceNumberDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNiceNumberDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNiceNumberDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNiceNumberDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNiceNumberDetail newInstance() {
            return new BLiveNiceNumberDetail();
        }

        public boolean parseField(BLiveNiceNumberDetail bLiveNiceNumberDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainTimes":
                    bLiveNiceNumberDetail.remainTimes = jsonParser.getValueAsInt();
                    return true;
                case "qualified":
                    bLiveNiceNumberDetail.qualified = jsonParser.getValueAsBoolean();
                    return true;
                case "number":
                    bLiveNiceNumberDetail.number = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNiceNumberDetail bLiveNiceNumberDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("qualified", bLiveNiceNumberDetail.qualified);
            String str = bLiveNiceNumberDetail.number;
            if (str != null) {
                jsonGenerator.writeStringField("number", str);
            }
            jsonGenerator.writeNumberField("remainTimes", bLiveNiceNumberDetail.remainTimes);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNiceNumberDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenicenumberdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public String number;

    @ProtobufIndex(index = 1)
    public boolean qualified;

    @ProtobufIndex(index = 3)
    public int remainTimes;

    public static BLiveNiceNumberDetail new_() {
        BLiveNiceNumberDetail bLiveNiceNumberDetail = new BLiveNiceNumberDetail();
        bLiveNiceNumberDetail.nullCheck();
        return bLiveNiceNumberDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNiceNumberDetail mo223809clone() {
        BLiveNiceNumberDetail bLiveNiceNumberDetail = new BLiveNiceNumberDetail();
        bLiveNiceNumberDetail.qualified = this.qualified;
        bLiveNiceNumberDetail.number = this.number;
        bLiveNiceNumberDetail.remainTimes = this.remainTimes;
        return bLiveNiceNumberDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNiceNumberDetail)) {
            return false;
        }
        BLiveNiceNumberDetail bLiveNiceNumberDetail = (BLiveNiceNumberDetail) obj;
        return this.qualified == bLiveNiceNumberDetail.qualified && ValueObject.util_equals(this.number, bLiveNiceNumberDetail.number) && this.remainTimes == bLiveNiceNumberDetail.remainTimes;
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
        int i2 = ((i * 41) + (this.qualified ? 1231 : 1237)) * 41;
        String str = this.number;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.remainTimes;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.number == null) {
            this.number = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
