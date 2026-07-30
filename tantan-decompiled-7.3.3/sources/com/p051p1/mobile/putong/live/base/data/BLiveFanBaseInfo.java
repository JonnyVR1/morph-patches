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
public class BLiveFanBaseInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseInfo newInstance() {
            return new BLiveFanBaseInfo();
        }

        public boolean parseField(BLiveFanBaseInfo bLiveFanBaseInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expiredTime":
                    bLiveFanBaseInfo.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "fanbaseGrade":
                    bLiveFanBaseInfo.fanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "medalId":
                    bLiveFanBaseInfo.medalId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseInfo bLiveFanBaseInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseInfo.medalId;
            if (str != null) {
                jsonGenerator.writeStringField("medalId", str);
            }
            jsonGenerator.writeNumberField("expiredTime", bLiveFanBaseInfo.expiredTime);
            jsonGenerator.writeNumberField("fanbaseGrade", bLiveFanBaseInfo.fanbaseGrade);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbaseinfo";

    @ProtobufIndex(index = 2)
    public long expiredTime;

    @ProtobufIndex(index = 3)
    public int fanbaseGrade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String medalId;

    public static BLiveFanBaseInfo new_() {
        BLiveFanBaseInfo bLiveFanBaseInfo = new BLiveFanBaseInfo();
        bLiveFanBaseInfo.nullCheck();
        return bLiveFanBaseInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseInfo mo225055clone() {
        BLiveFanBaseInfo bLiveFanBaseInfo = new BLiveFanBaseInfo();
        bLiveFanBaseInfo.medalId = this.medalId;
        bLiveFanBaseInfo.expiredTime = this.expiredTime;
        bLiveFanBaseInfo.fanbaseGrade = this.fanbaseGrade;
        return bLiveFanBaseInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseInfo)) {
            return false;
        }
        BLiveFanBaseInfo bLiveFanBaseInfo = (BLiveFanBaseInfo) obj;
        return ValueObject.util_equals(this.medalId, bLiveFanBaseInfo.medalId) && this.expiredTime == bLiveFanBaseInfo.expiredTime && this.fanbaseGrade == bLiveFanBaseInfo.fanbaseGrade;
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
        String str = this.medalId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.expiredTime;
        int i3 = ((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + this.fanbaseGrade;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.medalId == null) {
            this.medalId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
