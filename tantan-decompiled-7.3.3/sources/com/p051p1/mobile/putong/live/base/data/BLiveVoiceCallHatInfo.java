package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveVoiceCallHatInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCallHatInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCallHatInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCallHatInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCallHatInfo newInstance() {
            return new BLiveVoiceCallHatInfo();
        }

        public boolean parseField(BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hatUrl":
                    bLiveVoiceCallHatInfo.hatUrl = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceCallHatInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "point":
                    bLiveVoiceCallHatInfo.point = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCallHatInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("point", bLiveVoiceCallHatInfo.point);
            String str2 = bLiveVoiceCallHatInfo.hatUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("hatUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCallHatInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecallhatinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String hatUrl;

    @ProtobufIndex(index = 2)
    public double point;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveVoiceCallHatInfo new_() {
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo = new BLiveVoiceCallHatInfo();
        bLiveVoiceCallHatInfo.nullCheck();
        return bLiveVoiceCallHatInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCallHatInfo mo225055clone() {
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo = new BLiveVoiceCallHatInfo();
        bLiveVoiceCallHatInfo.userId = this.userId;
        bLiveVoiceCallHatInfo.point = this.point;
        bLiveVoiceCallHatInfo.hatUrl = this.hatUrl;
        return bLiveVoiceCallHatInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCallHatInfo)) {
            return false;
        }
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo = (BLiveVoiceCallHatInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceCallHatInfo.userId) && this.point == bLiveVoiceCallHatInfo.point && ValueObject.util_equals(this.hatUrl, bLiveVoiceCallHatInfo.hatUrl);
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
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.point);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.hatUrl;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.hatUrl == null) {
            this.hatUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
