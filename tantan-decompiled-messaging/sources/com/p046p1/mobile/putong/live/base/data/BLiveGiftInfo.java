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
public class BLiveGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftInfo newInstance() {
            return new BLiveGiftInfo();
        }

        public boolean parseField(BLiveGiftInfo bLiveGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("num")) {
                bLiveGiftInfo.num = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("giftType")) {
                return false;
            }
            bLiveGiftInfo.giftType = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftInfo bLiveGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftInfo.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            jsonGenerator.writeNumberField("num", bLiveGiftInfo.num);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftType;

    @ProtobufIndex(index = 2)
    public int num;

    public static BLiveGiftInfo new_() {
        BLiveGiftInfo bLiveGiftInfo = new BLiveGiftInfo();
        bLiveGiftInfo.nullCheck();
        return bLiveGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftInfo mo223809clone() {
        BLiveGiftInfo bLiveGiftInfo = new BLiveGiftInfo();
        bLiveGiftInfo.giftType = this.giftType;
        bLiveGiftInfo.num = this.num;
        return bLiveGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftInfo)) {
            return false;
        }
        BLiveGiftInfo bLiveGiftInfo = (BLiveGiftInfo) obj;
        return ValueObject.util_equals(this.giftType, bLiveGiftInfo.giftType) && this.num == bLiveGiftInfo.num;
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
        String str = this.giftType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.num;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
