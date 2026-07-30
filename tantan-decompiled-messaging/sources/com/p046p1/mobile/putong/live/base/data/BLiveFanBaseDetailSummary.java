package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveFanBaseDetailSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseDetailSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseDetailSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseDetailSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseDetailSummary newInstance() {
            return new BLiveFanBaseDetailSummary();
        }

        public boolean parseField(BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("onlineInfo")) {
                bLiveFanBaseDetailSummary.onlineInfo = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("rankInfo")) {
                return false;
            }
            bLiveFanBaseDetailSummary.rankInfo = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseDetailSummary.rankInfo;
            if (str != null) {
                jsonGenerator.writeStringField("rankInfo", str);
            }
            String str2 = bLiveFanBaseDetailSummary.onlineInfo;
            if (str2 != null) {
                jsonGenerator.writeStringField("onlineInfo", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseDetailSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasedetailsummary";

    @Nullable
    @ProtobufIndex(index = 2)
    public String onlineInfo;

    @Nullable
    @ProtobufIndex(index = 1)
    public String rankInfo;

    public static BLiveFanBaseDetailSummary new_() {
        BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = new BLiveFanBaseDetailSummary();
        bLiveFanBaseDetailSummary.nullCheck();
        return bLiveFanBaseDetailSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseDetailSummary mo223809clone() {
        BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = new BLiveFanBaseDetailSummary();
        bLiveFanBaseDetailSummary.rankInfo = this.rankInfo;
        bLiveFanBaseDetailSummary.onlineInfo = this.onlineInfo;
        return bLiveFanBaseDetailSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseDetailSummary)) {
            return false;
        }
        BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = (BLiveFanBaseDetailSummary) obj;
        return ValueObject.util_equals(this.rankInfo, bLiveFanBaseDetailSummary.rankInfo) && ValueObject.util_equals(this.onlineInfo, bLiveFanBaseDetailSummary.onlineInfo);
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
        String str = this.rankInfo;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.onlineInfo;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
